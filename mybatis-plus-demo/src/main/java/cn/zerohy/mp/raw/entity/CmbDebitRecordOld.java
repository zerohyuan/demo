package cn.zerohy.mp.raw.entity;

import cn.zerohy.mp.common.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
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
@TableName("raw_cmb_debit_record_old")
public class CmbDebitRecordOld extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableField("balance")
    private Long balance;

    @TableField("currency")
    private String currency;

    @TableField("other_party_info")
    private String otherPartyInfo;

    @TableField("trans_amount")
    private Long transAmount;

    @TableField("trans_date")
    private LocalDate transDate;

    @TableField("trans_summary")
    private String transSummary;


}
