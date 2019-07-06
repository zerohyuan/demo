package cn.zerohy.mp.config;


import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author hyuan
 * @Date 2019-07-01 21:43
 * @Description TODO
 */
public class MPGenerator {
    /**
     * <p>
     * 读取控制台内容
     * </p>
     */
    public static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder help = new StringBuilder();
        help.append("请输入" + tip + "：");
        System.out.println(help.toString());
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (StringUtils.isNotEmpty(ipt)) {
                return ipt;
            }
        }
        throw new MybatisPlusException("请输入正确的" + tip + "！");
    }

    /**
     * RUN THIS
     */
    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();
        mpg.setGlobalConfig(getGlobalConfig());
        mpg.setDataSource(getDataSourceConfig());
        mpg.setPackageInfo(getPackageInfoConfig());

        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };
        List<FileOutConfig> focList = new ArrayList<>();
        focList.add(new FileOutConfig("/templates/mapper.xml.ftl") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输入文件名称
                return System.getProperty("user.dir") + "/mybatis-plus-demo/src/main/resources/mapper/" + mpg.getPackageInfo().getModuleName()
                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);
        mpg.setTemplate(new TemplateConfig().setXml(null));

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setSuperEntityClass("cn.zerohy.mp.common.BaseEntity");
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
        strategy.setEntityTableFieldAnnotationEnable(true);

        strategy.setSuperControllerClass("cn.zerohy.mp.common.BaseController");
//        strategy.setInclude("raw_abc_record",
//                "raw_alipay_record",
//                "raw_boc_csv_export",
//                "raw_boc_csv_new",
//                "raw_boc_csv_old",
//                "raw_cmb_credit_record",
//                "raw_cmb_debit_record",
//                "raw_cmb_debit_record_old",
//                "raw_icbc_record",
//                "raw_wechat_record");
        strategy.setInclude("account","");
        strategy.setSuperEntityColumns("id","create_time","update_time");
        strategy.setControllerMappingHyphenStyle(true);
        strategy.setTablePrefix(mpg.getPackageInfo().getModuleName() + "_");
        mpg.setStrategy(strategy);
        // 选择 freemarker 引擎需要指定如下加，注意 pom 依赖必须有！
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }

    private static PackageConfig getPackageInfoConfig() {
        // 包配置
        PackageConfig pc = new PackageConfig();
//        pc.setModuleName(scanner("模块名"));
//        pc.setModuleName("raw");
        pc.setModuleName("standard");
        pc.setParent("cn.zerohy.mp");
        return pc;
    }

    private static DataSourceConfig getDataSourceConfig() {
        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/db_leopard?useUnicode=true&useSSL=false&characterEncoding=utf8");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("Lingheyuan");
//        dsc.setTypeConvert()
        return dsc;
    }

    private static GlobalConfig getGlobalConfig() {
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setFileOverride(true);
        gc.setBaseResultMap(true);
        gc.setBaseColumnList(true);
        gc.setOutputDir(projectPath + "/mybatis-plus-demo/src/main/java");
        gc.setAuthor("hyuan");
        gc.setOpen(false);
        return gc;
    }
}
