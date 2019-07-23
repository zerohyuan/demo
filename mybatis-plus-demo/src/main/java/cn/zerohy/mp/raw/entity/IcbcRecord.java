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
@TableName("raw_icbc_record")
public class IcbcRecord extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableField("balance")
    private Long balance;

    @TableField("banknote")
    private String banknote;

    @TableField("bill_currency")
    private String billCurrency;

    @TableField("bill_income")
    private Long billIncome;

    @TableField("bill_payout")
    private Long billPayout;

    @TableField("country")
    private String country;

    @TableField("currency")
    private String currency;

    @TableField("income")
    private Long income;

    @TableField("other_party_name")
    private String otherPartyName;

    @TableField("payout")
    private Long payout;

    @TableField("places")
    private String places;

    @TableField("summary")
    private String summary;

    @TableField("trans_date")
    private LocalDate transDate;


}
