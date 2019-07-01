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
@TableName("raw_boc_csv_old")
public class BocCsvOld extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Long amount;

    private Long balance;

    private String code;

    private String otherPartyAccount;

    private LocalDate transDate;

    private String type;


}
