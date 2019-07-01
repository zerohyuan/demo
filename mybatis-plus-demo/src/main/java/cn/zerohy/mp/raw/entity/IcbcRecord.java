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
@TableName("raw_icbc_record")
public class IcbcRecord extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Long balance;

    private String banknote;

    private String billCurrency;

    private Long billIncome;

    private Long billPayout;

    private String country;

    private String currency;

    private Long income;

    private String otherPartyName;

    private Long payout;

    private String places;

    private String summary;

    private LocalDate transDate;


}
