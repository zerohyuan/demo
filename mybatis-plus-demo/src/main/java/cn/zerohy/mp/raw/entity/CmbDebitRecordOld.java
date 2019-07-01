package cn.zerohy.mp.raw.entity;

import cn.zerohy.mp.common.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
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
@TableName("raw_cmb_debit_record_old")
public class CmbDebitRecordOld extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Long balance;

    private String currency;

    private String otherPartyInfo;

    private Long transAmount;

    private LocalDate transDate;

    private String transSummary;


}
