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
@TableName("raw_boc_csv_old")
public class BocCsvOld extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableField("amount")
    private Long amount;

    @TableField("balance")
    private Long balance;

    @TableField("code")
    private String code;

    @TableField("other_party_account")
    private String otherPartyAccount;

    @TableField("trans_date")
    private LocalDate transDate;

    @TableField("type")
    private String type;


}
