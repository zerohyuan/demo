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
@TableName("raw_boc_csv_export")
public class BocCsvExport extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Long balance;

    private String banknote;

    private String branches;

    private String businessSummary;

    private String currency;

    private Long income;

    private String otherPartyAccount;

    private String otherPartyName;

    private String payWay;

    private Long payout;

    private String postscript;

    private LocalDate transDate;


}
