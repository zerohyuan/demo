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
@TableName("raw_cmb_credit_record")
public class CmbCreditRecord extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableField("amount")
    private Long amount;

    @TableField("area")
    private String area;

    @TableField("bookkeeping_day")
    private LocalDate bookkeepingDay;

    @TableField("card_num")
    private String cardNum;

    @TableField("original_trans_amount")
    private Long originalTransAmount;

    @TableField("summary")
    private String summary;

    @TableField("trading_day")
    private LocalDate tradingDay;


}
