package cn.zerohy.bug.json.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.experimental.Accessors;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class JacksonTimezoneControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void jacksonTimezone() throws JsonProcessingException {
        Date date = new Date();

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        TimeZone timeZone = objectMapper.getSerializationConfig().getTimeZone();
        System.out.println(timeZone);
        String s = objectMapper.writeValueAsString(date);
        System.out.println(s);

        objectMapper.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        TimeZone timeZone1 = objectMapper.getSerializationConfig().getTimeZone();
        System.out.println(timeZone1);
        String s1 = objectMapper.writeValueAsString(date);
        System.out.println(s1);
    }

    @Test
    public void jackson() throws JsonProcessingException {
        LocalDateTime now = LocalDateTime.now();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        String s = objectMapper.writeValueAsString(now);
        System.out.println(s);

        Date date = new Date();
        String s1 = objectMapper.writeValueAsString(date);
        System.out.println(s1);


    }

    /**
     * 表单方式提交时间数据
     * @throws Exception
     */
    @Test
    public void timezone_form() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.post("/json/timezone-form")
                .param("time", "2019-07-19"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(print());
    }

    @Test
    public void timezone_vo() throws Exception {
        Map param = new HashMap();
        param.put("time", "2019-07-19");
        param.put("localDateTime", "2019-07-19 00:00:00");

        ObjectMapper mapper = new ObjectMapper();
        mockMvc.perform(MockMvcRequestBuilders.post("/json/timezone-vo")
                .contentType(MediaType.APPLICATION_JSON).content(mapper.writeValueAsString(param)))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(print());
        //Body = {"time":"2019-07-19 08:00:00"}
    }

    @Test
    public void strToJson() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Date date = objectMapper.readValue("\"2019-07-19\"", Date.class);
        System.out.println(date);
        Bean bean = objectMapper.readValue("{\"time\":\"2019-07-20\"}", Bean.class);
        System.out.println(bean);
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        Date date1 = objectMapper.readValue("\"2019-07-19 01:00:00\"", Date.class);
        System.out.println(date1);


    }

    /**
     * fastjson
     */
    @Test
    public void fastJson() {

        //Date to Json
        Date date = new Date();
        String dateStr = JSON.toJSONString(date);
        System.out.println(dateStr);//1563604444509

        String dateStr1 = JSON.toJSONString(date, SerializerFeature.WriteDateUseDateFormat);
        System.out.println(dateStr1);//"2019-07-20 14:37:10"

        String dateStr2 = JSON.toJSONString(date, SerializerFeature.UseISO8601DateFormat);
        System.out.println(dateStr2);//"2019-07-20T14:37:10.469+08:00"


        Bean bean = new Bean().setTime(new Date());
        String str = JSON.toJSONString(bean);
        System.out.println(str);//{"time":1563604366919}
        String dateStr3 = JSON.toJSONString(bean, SerializerFeature.WriteDateUseDateFormat);
        System.out.println(dateStr3);//{"time":"2019-07-20 14:38:47"}

        Bean bean1 = JSONObject.parseObject("{\"time\":\"2019-07-20\"}", Bean.class);
        System.out.println(bean1);

        // json to Date
//        Date date1 = JSONObject.parseObject("2019-07-20 14:38:47", Date.class);
//        System.out.println(date1);

        String str1 = "{\"localDateTime\":\"2019-07-19 00:00:00\",\"time\":\"2019-07-19\"}";
        Bean bean2 = JSONObject.parseObject(str1, Bean.class);
        System.out.println(bean2);


    }
}
@Data
@Accessors(chain = true)
class Bean {
    Date time;
}
