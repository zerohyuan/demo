package cn.zerohy.mp.raw.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
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
@TableName("raw_boc_csv_new")
public class BocCsvNew extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableField("balance")
    private Long balance;

    @TableField("banknote")
    private String banknote;

    @TableField("business_summary")
    private String businessSummary;

    @TableField("currency")
    private String currency;

    @TableField("income")
    private Long income;

    @TableField("other_party_account")
    private String otherPartyAccount;

    @TableField("other_party_name")
    private String otherPartyName;

    @TableField("pay_way")
    private String payWay;

    @TableField("payout")
    private Long payout;

    @TableField("postscript")
    private String postscript;

    @TableField("trans_date")
    private LocalDate transDate;


}
