package cn.zerohy.mp.raw.entity;

import cn.zerohy.mp.common.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
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
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("raw_alipay_record")
public class AlipayRecord extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Long amount;

    private String businessOrderNum;

    private String fundStatus;

    private String memo;

    private LocalDateTime orderCreateTime;

    private LocalDateTime payTime;

    private String productName;

    private LocalDateTime recentlyUpdateTime;

    private Long refund;

    private Long serviceFee;

    private String tradingPartner;

    private String transactionNum;

    private String transactionSource;

    private String transactionStatus;

    private String transactionType;

    private String type;


}
