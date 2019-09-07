package cn.zerohy.mp.logic.delete;

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
 * @Date 2019-07-24 21:49
 * @Description TODO
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class LogicDeleteTest {

    @Autowired
    private AccountMapper accountMapper;

    @Test
    public void test() {
        Account account = new Account().setName("信用卡").setType(AccountTypeEnum.CREDIT);
        accountMapper.insert(account);
        Long id = account.getId();
        System.out.println(id);
    }

    @Test
    public void delete() {
        Long id = 1154034308121382914L;
        Account account = accountMapper.selectById(id);
        System.out.println(account);
        accountMapper.deleteById(id);
        Account newAccount = accountMapper.selectById(id);
        System.out.println(newAccount);
    }

}
