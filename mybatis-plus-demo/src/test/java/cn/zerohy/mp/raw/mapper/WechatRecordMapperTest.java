package cn.zerohy.mp.raw.mapper;

import cn.zerohy.mp.raw.entity.WechatRecord;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class WechatRecordMapperTest {

    @Autowired
    private WechatRecordMapper wechatRecordMapper;

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