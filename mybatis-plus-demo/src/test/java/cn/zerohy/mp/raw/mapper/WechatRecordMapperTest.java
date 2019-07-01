package cn.zerohy.mp.raw.mapper;

import cn.zerohy.mp.raw.entity.WechatRecord;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
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
    }



}