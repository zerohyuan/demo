package cn.zerohy.mp.raw.entity;

import cn.zerohy.mp.common.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
import java.time.LocalTime;
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
@TableName("raw_cmb_debit_record")
public class CmbDebitRecord extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Long balance;

    private Long income;

    private String memo;

    private Long payout;

    private LocalDate transDate;

    private LocalTime transTime;

    private String transType;


}
