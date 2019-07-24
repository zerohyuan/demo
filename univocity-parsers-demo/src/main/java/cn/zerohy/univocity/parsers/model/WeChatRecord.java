package cn.zerohy.univocity.parsers.model;


import cn.zerohy.univocity.parsers.service.univocity.converter.LocalDateTimeConversion;
import cn.zerohy.univocity.parsers.service.univocity.converter.MoneyConversion;
import com.univocity.parsers.annotations.Convert;
import com.univocity.parsers.annotations.Parsed;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.money.Money;

import java.time.LocalDateTime;

/**
 * @Author hyuan
 * @Date 2019-04-24 21:49
 * @Description TODO
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WeChatRecord {

    /**
     * 交易时间,交易类型,交易对方,商品,收/支,金额(元),支付方式,当前状态,交易单号,商户单号,备注
     */
    @Parsed(index = 0)
    @Convert(conversionClass = LocalDateTimeConversion.class, args = {"yyyy-MM-dd HH:mm:ss"})
    private LocalDateTime transTime;
    @Parsed(index = 1)
    private String transType;
    @Parsed(index = 2)
    private String transPartner;
    @Parsed(index = 3)
    private String product;
    @Parsed(index = 4)
    private String paymentType;
    @Parsed(index = 5)
    @Convert(conversionClass = MoneyConversion.class)
    private Money amount;
    @Parsed(index = 6)
    private String payType;
    @Parsed(index = 7)
    private String nowStatus;
    @Parsed(index = 8)
    private String tarnsNum;
    @Parsed(index = 9)
    private String orderNum;
    @Parsed(index = 10)
    private String memo;
}
