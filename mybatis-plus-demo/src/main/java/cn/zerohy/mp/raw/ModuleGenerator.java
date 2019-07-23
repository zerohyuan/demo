package cn.zerohy.mp.raw;

import cn.zerohy.mp.common.util.MybatisPlusGenerator;

/**
 * @Author hyuan
 * @Date 2019-07-23 21:39
 * @Description TODO
 */
public class ModuleGenerator {
    public static void main(String[] args) {
        MybatisPlusGenerator.generate("raw",
                "raw_abc_record",
                "raw_alipay_record",
                "raw_boc_csv_export",
                "raw_boc_csv_new",
                "raw_boc_csv_old",
                "raw_cmb_credit_record",
                "raw_cmb_debit_record",
                "raw_cmb_debit_record_old",
                "raw_icbc_record",
                "raw_wechat_record");
    }
}
