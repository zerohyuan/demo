package cn.zerohy.mp.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author hyuan
 * @Date 2019-06-30 17:56
 * @Description TODO
 */
@Configuration
@MapperScan("cn.zerohy.mp.**.mapper")
public class MpConfig {
}
