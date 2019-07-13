package cn.zerohy.bug.json.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author hyuan
 * @Date 2019-07-08 21:17
 * @Description TODO
 */
@RestController
@RequestMapping("json")
@Slf4j
public class JacksonTimezoneController {

    /**
     * springmvc 默认时区问题
     * @return
     */
    @PostMapping("timezone")
    public String timezone(LocalDateTime time) {


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = formatter.format(time);

        return "";
    }
}
