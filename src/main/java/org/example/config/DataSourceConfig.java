package org.example.config;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.example.dynamicDataSource.DataSourceType;
import org.example.dynamicDataSource.DynamicDataSource;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DataSourceConfig {
    //@Autowired
    //DataSourceProperties dataSourceProperties;
    private static final Logger logger = LoggerFactory.getLogger(HikariDataSource.class);
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.hikari.sourcedb")
    public DataSource sourceDataSource(DataSourceProperties properties) {return DataSourceBuilder.create() .build();}
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.hikari.target23jan")
    public DataSource taeget23janDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.hikari.target23feb")
    public DataSource taeget23febDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.hikari.target23mar")
    public DataSource taeget23marDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.hikari.target23apr")
    public DataSource taeget23aprDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.hikari.target23may")
    public DataSource taeget23mayDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.hikari.target23jun")
    public DataSource taeget23junDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.hikari.target23jul")
    public DataSource taeget23julDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.hikari.target23aug")
    public DataSource taeget23augDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.hikari.target23sep")
    public DataSource taeget23sepDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.hikari.target23oct")
    public DataSource taeget23octDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.hikari.target23nov")
    public DataSource taeget23novDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.hikari.target23dec")
    public DataSource taeget23decDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.hikari.target22jan")
    public DataSource taeget22janDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.hikari.target22feb")
    public DataSource taeget22febDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.hikari.target22mar")
    public DataSource taeget22marDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.hikari.target22apr")
    public DataSource taeget22aprDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.hikari.target22may")
    public DataSource taeget22mayDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.hikari.target22jun")
    public DataSource taeget22junDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.hikari.target22jul")
    public DataSource taeget22julDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.hikari.target22aug")
    public DataSource taeget22augDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.hikari.target22sep")
    public DataSource taeget22sepDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.hikari.target22oct")
    public DataSource taeget22octDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.hikari.target22nov")
    public DataSource taeget22novDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.hikari.target22dec")
    public DataSource taeget22decDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean(name = "dynamicDataSource")
    @Primary
    public DynamicDataSource dataSource(DataSource sourceDataSource, 
                                        DataSource taeget23janDataSource, DataSource taeget23febDataSource,
                                        DataSource taeget23marDataSource, DataSource taeget23aprDataSource,
                                        DataSource taeget23mayDataSource, DataSource taeget23junDataSource,
                                        DataSource taeget23julDataSource, DataSource taeget23augDataSource,
                                        DataSource taeget23sepDataSource, DataSource taeget23octDataSource,
                                        DataSource taeget23novDataSource, DataSource taeget23decDataSource,
                                        DataSource taeget22janDataSource, DataSource taeget22febDataSource,
                                        DataSource taeget22marDataSource, DataSource taeget22aprDataSource,
                                        DataSource taeget22mayDataSource, DataSource taeget22junDataSource,
                                        DataSource taeget22julDataSource, DataSource taeget22augDataSource,
                                        DataSource taeget22sepDataSource, DataSource taeget22octDataSource,
                                        DataSource taeget22novDataSource, DataSource taeget22decDataSource) {
        Map<Object, Object> targetDataSources = new HashMap<>();
        targetDataSources.put(DataSourceType.sourcedb.name(), sourceDataSource);
        targetDataSources.put(DataSourceType.target23jan.name(), taeget23janDataSource);
        targetDataSources.put(DataSourceType.target23feb.name(), taeget23febDataSource);
        targetDataSources.put(DataSourceType.target23mar.name(), taeget23marDataSource);
        targetDataSources.put(DataSourceType.target23apr.name(), taeget23aprDataSource);
        targetDataSources.put(DataSourceType.target23may.name(), taeget23mayDataSource);
        targetDataSources.put(DataSourceType.target23jun.name(), taeget23junDataSource);
        targetDataSources.put(DataSourceType.target23jul.name(), taeget23julDataSource);
        targetDataSources.put(DataSourceType.target23aug.name(), taeget23augDataSource);
        targetDataSources.put(DataSourceType.target23sep.name(), taeget23sepDataSource);
        targetDataSources.put(DataSourceType.target23oct.name(), taeget23octDataSource);
        targetDataSources.put(DataSourceType.target23nov.name(), taeget23novDataSource);
        targetDataSources.put(DataSourceType.target23dec.name(), taeget23decDataSource);
        targetDataSources.put(DataSourceType.target22jan.name(), taeget22janDataSource);
        targetDataSources.put(DataSourceType.target22feb.name(), taeget22febDataSource);
        targetDataSources.put(DataSourceType.target22mar.name(), taeget22marDataSource);
        targetDataSources.put(DataSourceType.target22apr.name(), taeget22aprDataSource);
        targetDataSources.put(DataSourceType.target22may.name(), taeget22mayDataSource);
        targetDataSources.put(DataSourceType.target22jun.name(), taeget22junDataSource);
        targetDataSources.put(DataSourceType.target22jul.name(), taeget22julDataSource);
        targetDataSources.put(DataSourceType.target22aug.name(), taeget22augDataSource);
        targetDataSources.put(DataSourceType.target22sep.name(), taeget22sepDataSource);
        targetDataSources.put(DataSourceType.target22oct.name(), taeget22octDataSource);
        targetDataSources.put(DataSourceType.target22nov.name(), taeget22novDataSource);
        targetDataSources.put(DataSourceType.target22dec.name(), taeget22decDataSource);
        
        return new DynamicDataSource(sourceDataSource, targetDataSources);
    }
    public static HikariConfig setHikariConfigInfo(String url, String user, String passWord) {
        HikariConfig config = new HikariConfig();
        config.setMaximumPoolSize(50);

        config.setDataSourceClassName("com.mysql.jdbc.jdbc2.optional.MysqlDataSource");
        config.addDataSourceProperty("jdbcUrl", url);
        config.addDataSourceProperty("noAccessToProcedureBodies", "true");
        config.addDataSourceProperty("user", user);
        config.addDataSourceProperty("password", passWord);

        return config;
    }
}