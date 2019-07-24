package cn.zerohy.mp.common.constant;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @Author hyuan
 * @Date 2019-07-24 20:43
 * @Description TODO
 */
public enum AccountTypeEnum implements IEnum<String> {

    //普通账户
    DEBIT,
    //信用账户，可以投资的
    CREDIT,
    //理财账户
    INVERSTMENT;

    @Override
    public String getValue() {
        return this.name();
    }
}
