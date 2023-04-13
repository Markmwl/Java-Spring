package com.mark.Config;

import oracle.jdbc.pool.OracleDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.mark")
@PropertySource("jdbc.properties")
public class ApplicationConfig {

    @Value("${jdbc.URL}")
    public String url;
    @Value("${jdbc.user}")
    public String user;
    @Value("${jdbc.password}")
    public String password;

    @Bean
    public OracleDataSource GetDataSource() throws Exception
    {
        OracleDataSource dataSource = null;
        dataSource = new OracleDataSource();
        dataSource.setURL(url);
        dataSource.setUser(user);
        dataSource.setPassword(password);
        return dataSource;
    }

}
