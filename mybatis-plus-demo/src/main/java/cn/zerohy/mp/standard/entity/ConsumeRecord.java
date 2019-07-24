package cn.zerohy.mp.standard.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
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
 * @since 2019-07-24
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("std_consume_record")
public class ConsumeRecord extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableField("amount")
    private Long amount;

    @TableField("pay_time")
    private LocalDateTime payTime;


}
