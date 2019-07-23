package cn.zerohy.mp.raw.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import cn.zerohy.mp.common.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author hyuan
 * @since 2019-07-23
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("raw_wechat_record")
public class WechatRecord extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableField("amount")
    private Long amount;

    @TableField("memo")
    private String memo;

    @TableField("now_status")
    private String nowStatus;

    @TableField("order_num")
    private String orderNum;

    @TableField("pay_type")
    private String payType;

    @TableField("payment_type")
    private String paymentType;

    @TableField("product")
    private String product;

    @TableField("tarns_num")
    private String tarnsNum;

    @TableField("trans_partner")
    private String transPartner;

    @TableField("trans_time")
    private LocalDateTime transTime;

    @TableField("trans_type")
    private String transType;


}
