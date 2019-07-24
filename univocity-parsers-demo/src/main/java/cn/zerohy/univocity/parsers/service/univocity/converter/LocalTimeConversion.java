package cn.zerohy.univocity.parsers.service.univocity.converter;

import com.univocity.parsers.conversions.Conversion;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author hyuan
 * @Date 2019-05-03 15:35
 * @Description TODO
 */
@Slf4j
public class LocalTimeConversion implements Conversion<String, LocalTime> {

    private DateTimeFormatter[] formatters;

    public LocalTimeConversion(String... args) {
        if (args != null) {
            formatters = new DateTimeFormatter[args.length];
            for (int i = 0; i < args.length; i++) {
                formatters[i] = DateTimeFormatter.ofPattern(args[i]);
            }
        }
    }

    @Override
    public LocalTime execute(String input) {

        for (DateTimeFormatter formatter : formatters) {
            try {
                return LocalTime.parse(input, formatter);
            } catch (Exception e) {
                //ignore and continue
                log.debug("转换出错：[{}]-->[{}]", input, formatter);
            }
        }
        return null;
    }



    @Override
    public String revert(LocalTime input) {
        return input.toString();
    }
}
