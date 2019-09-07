package cn.zerohy.univocity.parsers.service.univocity.converter;

import com.univocity.parsers.conversions.Conversion;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author hyuan
 * @Date 2019-04-26 21:26
 * @Description TODO
 */
@Slf4j
public class LocalDateTimeConversion implements Conversion<String, LocalDateTime> {

    private DateTimeFormatter[] formatters;

    public LocalDateTimeConversion(String... args) {
        if (args != null) {
            formatters = new DateTimeFormatter[args.length];
            for (int i = 0; i < args.length; i++) {
                formatters[i] = DateTimeFormatter.ofPattern(args[i]);
            }
        }
    }
    @Override
    public LocalDateTime execute(String input) {
        for (DateTimeFormatter formatter : formatters) {
            try {
                return LocalDateTime.parse(input, formatter);
            } catch (Exception e) {
                //ignore and continue
                log.debug("转换出错：[{}]-->[{}]", input, formatter);
            }
        }
        return null;
    }

    @Override
    public String revert(LocalDateTime input) {
        return input.toString();
    }
}
