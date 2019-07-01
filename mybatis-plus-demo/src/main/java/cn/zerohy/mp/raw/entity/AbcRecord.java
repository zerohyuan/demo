package cn.zerohy.mp.raw.entity;

import cn.zerohy.mp.common.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("raw_abc_record")
public class AbcRecord extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String amount;

    private Double balance;

    private String otherPartyAccount;

    private String otherPartyName;

    private String transBank;

    private String transChannel;

    private String transDate;

    private String transSummary;

    private String transTime;

    private String transUse;

    private String transWay;


}
