package cn.zerohy.mp.raw.entity;

import cn.zerohy.mp.common.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author hyuan
 * @since 2019-07-01
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("raw_wechat_record")
public class WechatRecord extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Long amount;

    private String memo;

    private String nowStatus;

    private String orderNum;

    private String payType;

    private String paymentType;

    private String product;

    private String tarnsNum;

    private String transPartner;

    private LocalDateTime transTime;

    private String transType;


}
