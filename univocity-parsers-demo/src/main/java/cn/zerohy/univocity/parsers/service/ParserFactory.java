package cn.zerohy.univocity.parsers.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author hyuan
 * @Date 2019-05-03 16:51
 * @Description TODO
 */
@Component
public class ParserFactory implements InitializingBean {
    @Autowired
    private ApplicationContext applicationContext;

    private static Map<String, Parser> beanMap = new HashMap<>();

    @Override
    public void afterPropertiesSet() throws Exception {
        Map<String, Parser> beansOfType = applicationContext.getBeansOfType(Parser.class);
        for (Map.Entry<String, Parser> entry : beansOfType.entrySet()) {

            Class entityClass;
            Type[] interfaces = entry.getValue().getClass().getGenericInterfaces();
            if (interfaces.length <= 0) {
                entityClass = (Class)((ParameterizedType)entry.getValue().getClass().getGenericSuperclass()).getActualTypeArguments()[0];
            } else {
                entityClass = (Class) ((ParameterizedType) interfaces[0]).getActualTypeArguments()[0];
//                entityClass = (Class) ((ParameterizedType) type.getGenericInterfaces()[0]).getActualTypeArguments()[0];
            }
            beanMap.put(entityClass.getSimpleName(), entry.getValue());
        }
    }

    public static <T> Parser getParser(Class<T> cls) {
        Parser parser = beanMap.get(cls.getSimpleName());
        if (parser == null) {
            throw new NullPointerException("没有这个repository");
        }
        return parser;
    }

//    private ParserFactory() {
//
//    }
}
