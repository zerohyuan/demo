package cn.zerohy.bug.json.controller;

import cn.zerohy.bug.json.vo.TimeVo;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

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
     * 表单形式
     * @param time
     * @return
     */
    @PostMapping("timezone-form")
    public String timezone_form(@DateTimeFormat(pattern = "yyyy-MM-dd") Date time) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(time);

        return format;
    }


    @PostMapping("timezone-vo")
    public String timezone_vo(@RequestBody TimeVo vo) {
        log.info(vo.toString());
        return JSON.toJSONString(vo, SerializerFeature.WriteDateUseDateFormat);
    }
}
