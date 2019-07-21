package cn.zerohy.bug.json.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Author hyuan
 * @Date 2019-07-20 15:34
 * @Description TODO
 */
@Data
@Accessors(chain = true)
public class TimeVo {

    private Date time;

//    private LocalDateTime localDateTime;
}
