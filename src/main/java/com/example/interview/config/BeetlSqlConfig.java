package com.example.interview.config;

import org.beetl.sql.core.*;
import org.beetl.sql.core.db.MySqlStyle;
import org.beetl.sql.ext.DebugInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * beetlSql 配置类
 */
@Configuration
public class BeetlSqlConfig {
    @Autowired
    private DataSource dataSource;

    @Bean
    public ConnectionSource connectionSource() {
        ConnectionSource source = ConnectionSourceHelper.getSingle(dataSource);
        return source;
    }

    @Bean
    public SQLManager sqlManager() {
        SQLManager sqlManager = new SQLManager(new MySqlStyle(),
                new ClasspathLoader("/sql"),
                connectionSource(),
                new UnderlinedNameConversion(),
                new Interceptor[]{new DebugInterceptor()});
        return sqlManager;
    }


}
