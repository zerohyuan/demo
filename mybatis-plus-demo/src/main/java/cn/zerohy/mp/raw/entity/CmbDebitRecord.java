package cn.zerohy.mp.raw.entity;

import cn.zerohy.mp.common.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
import java.time.LocalTime;
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
@TableName("raw_cmb_debit_record")
public class CmbDebitRecord extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableField("balance")
    private Long balance;

    @TableField("income")
    private Long income;

    @TableField("memo")
    private String memo;

    @TableField("payout")
    private Long payout;

    @TableField("trans_date")
    private LocalDate transDate;

    @TableField("trans_time")
    private LocalTime transTime;

    @TableField("trans_type")
    private String transType;


}
