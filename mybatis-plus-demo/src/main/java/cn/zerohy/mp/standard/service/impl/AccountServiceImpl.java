package cn.zerohy.mp.standard.service.impl;

import cn.zerohy.mp.standard.entity.Account;
import cn.zerohy.mp.standard.mapper.AccountMapper;
import cn.zerohy.mp.standard.service.AccountService;
import cn.zerohy.mp.common.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hyuan
 * @since 2019-07-24
 */
@Service
public class AccountServiceImpl extends BaseServiceImpl<AccountMapper, Account> implements AccountService {

}
