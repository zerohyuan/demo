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
@TableName("raw_cmb_credit_record")
public class CmbCreditRecord extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Long amount;

    private String area;

    private LocalDate bookkeepingDay;

    private String cardNum;

    private Long originalTransAmount;

    private String summary;

    private LocalDate tradingDay;


}
