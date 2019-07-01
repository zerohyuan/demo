package cn.zerohy.mp.common;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author hyuan
 * @Date 2019-07-01 22:18
 * @Description TODO
 */
@Data
public class BaseEntity {

    @TableId
    private Long id;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
