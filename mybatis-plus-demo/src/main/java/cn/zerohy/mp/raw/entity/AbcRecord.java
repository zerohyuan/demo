package cn.zerohy.mp.raw.entity;

import cn.zerohy.mp.common.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("raw_abc_record")
public class AbcRecord extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableField("amount")
    private String amount;

    @TableField("balance")
    private Double balance;

    @TableField("other_party_account")
    private String otherPartyAccount;

    @TableField("other_party_name")
    private String otherPartyName;

    @TableField("trans_bank")
    private String transBank;

    @TableField("trans_channel")
    private String transChannel;

    @TableField("trans_date")
    private String transDate;

    @TableField("trans_summary")
    private String transSummary;

    @TableField("trans_time")
    private String transTime;

    @TableField("trans_use")
    private String transUse;

    @TableField("trans_way")
    private String transWay;


}
