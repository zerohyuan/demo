package cn.zerohy.univocity.parsers.service.univocity.converter;

import com.univocity.parsers.conversions.Conversion;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @Author hyuan
 * @Date 2019-04-26 21:26
 * @Description TODO
 */
@Slf4j
public class LocalDateConversion implements Conversion<String, LocalDate> {

    private DateTimeFormatter[] formatters;

    public LocalDateConversion(String... args) {
        if (args != null) {
            formatters = new DateTimeFormatter[args.length];
            for (int i = 0; i < args.length; i++) {
                formatters[i] = DateTimeFormatter.ofPattern(args[i]);
            }
        }
    }

    @Override
    public LocalDate execute(String input) {

        for (DateTimeFormatter formatter : formatters) {
            try {
                return LocalDate.parse(input, formatter);
            } catch (Exception e) {
                //ignore and continue
                log.debug("转换出错：[{}]-->[{}]", input, formatter);
            }
        }
        return null;
    }


    @Override
    public String revert(LocalDate input) {
        return input.toString();
    }
}
