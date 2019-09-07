package cn.zerohy.univocity.parsers.service.univocity.converter;

import com.univocity.parsers.conversions.Conversion;
import org.apache.logging.log4j.util.Strings;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

/**
 * @Author hyuan
 * @Date 2019-04-24 22:36
 * @Description TODO
 */
public class MoneyConversion implements Conversion<String,Money> {

    @Override
    public Money execute(String input) {
        if (input != null) {
            input = input.trim();
        }
        if (Strings.isEmpty(input)) {
            input = "0";
        }
        input = input.replace("¥", "");
        input = input.replace(",", "");
        return Money.of(CurrencyUnit.of("CNY"), Double.parseDouble(input));
    }

    @Override
    public String revert(Money input) {
        return input.toString();
    }
}
