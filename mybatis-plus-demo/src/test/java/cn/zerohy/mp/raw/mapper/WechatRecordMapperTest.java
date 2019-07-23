package cn.zerohy.mp.raw.mapper;

import cn.zerohy.mp.raw.entity.WechatRecord;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class WechatRecordMapperTest {

    @Autowired
    private WechatRecordMapper wechatRecordMapper;

    @Test
    public void insert() {
        WechatRecord wechatRecord = new WechatRecord().setAmount(100L).setPaymentType("收入").setMemo("红包");
        assertThat(wechatRecordMapper.insert(wechatRecord)).isGreaterThan(0);
        assertThat(wechatRecord.getId()).isNotNull();
        System.out.println(wechatRecord);
    }

    /**
     * 查询表达式
     */
    @Test
    public void query() {
        LambdaQueryWrapper<WechatRecord> queryWrapper = Wrappers.<WechatRecord>lambdaQuery()
                .select(WechatRecord::getAmount, WechatRecord::getPaymentType)
                .eq(WechatRecord::getPaymentType, "收入")
                .le(WechatRecord::getAmount, 1000)
                .last("limit 10");
        //返回domain
        List<WechatRecord> wechatRecordList = wechatRecordMapper.selectList(queryWrapper);
        wechatRecordList.forEach(System.out::println);
        //以map形式返回
        List<Map<String, Object>> maps = wechatRecordMapper.selectMaps(queryWrapper);
        maps.forEach(System.out::println);
    }

    @Test
    public void test() {
        LambdaQueryWrapper<WechatRecord> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(WechatRecord::getPaymentType, "支出");
        List<WechatRecord> wechatRecords = wechatRecordMapper.selectList(lambdaQueryWrapper);
        wechatRecords.forEach(System.out::println);

        List<WechatRecord> wechatRecordList = wechatRecordMapper.selectList(Wrappers.<WechatRecord>lambdaQuery()
                .select(WechatRecord::getAmount, WechatRecord::getMemo, WechatRecord::getTransTime)
                .orderByAsc(WechatRecord::getAmount));

        wechatRecordList.forEach(System.out::println);
    }



}