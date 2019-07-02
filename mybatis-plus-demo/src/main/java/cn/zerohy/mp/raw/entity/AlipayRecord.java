package cn.zerohy.mp.raw.entity;

import cn.zerohy.mp.common.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author hyuan
 * @since 2019-07-02
 */
@Data
@Builder
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("raw_alipay_record")
public class AlipayRecord extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableField("amount")
    private Long amount;

    @TableField("business_order_num")
    private String businessOrderNum;

    @TableField("fund_status")
    private String fundStatus;

    @TableField("memo")
    private String memo;

    @TableField("order_create_time")
    private LocalDateTime orderCreateTime;

    @TableField("pay_time")
    private LocalDateTime payTime;

    @TableField("product_name")
    private String productName;

    @TableField("recently_update_time")
    private LocalDateTime recentlyUpdateTime;

    @TableField("refund")
    private Long refund;

    @TableField("service_fee")
    private Long serviceFee;

    @TableField("trading_partner")
    private String tradingPartner;

    @TableField("transaction_num")
    private String transactionNum;

    @TableField("transaction_source")
    private String transactionSource;

    @TableField("transaction_status")
    private String transactionStatus;

    @TableField("transaction_type")
    private String transactionType;

    @TableField("type")
    private String type;


}
