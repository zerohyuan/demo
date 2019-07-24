package cn.zerohy.mp.auto.fill;

import cn.zerohy.mp.common.constant.AccountTypeEnum;
import cn.zerohy.mp.standard.entity.Account;
import cn.zerohy.mp.standard.mapper.AccountMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author hyuan
 * @Date 2019-07-24 20:30
 * @Description TODO
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class AutoFillTest {


    @Autowired
    private AccountMapper accountMapper;

    @Test
    public void insert() {

        Account account = new Account().setName("微信").setType(AccountTypeEnum.DEBIT);
        accountMapper.insert(account);
        System.out.println(account.getId());
        System.out.println(account.getCreateTime());
        System.out.println(account.getUpdateTime());

    }

    @Test
    public void update() {
        Account account = accountMapper.selectById(1154021070122004482L);
        System.out.println(account);
        account.setName("银行卡");
        accountMapper.updateById(account);
        System.out.println(account);
    }
}
