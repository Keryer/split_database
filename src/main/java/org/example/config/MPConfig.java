package org.example.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.MybatisConfiguration;
import com.baomidou.mybatisplus.core.config.GlobalConfig;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.optimize.JsqlParserCountOptimize;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSessionFactory;
import org.example.dynamicDataSource.DynamicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Configuration
//@MapperScan("org.example.dao")
//@MapperScan("com.baomidou.cloud.service.*.mapper*")
@Component
public class MPConfig {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        MybatisPlusInterceptor interceptor =new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return interceptor;
    }

    @Bean
    public EasySqlInjector easySqlInjector() {
        return new EasySqlInjector();
    }

    @Bean
    public GlobalConfig globalConfiguration() {
        GlobalConfig conf = new GlobalConfig();
        // 自定义的注入需要在这里进行配置
        conf.setSqlInjector(easySqlInjector());
        return conf;
    }


    @Bean("sqlSessionFactory")
    @Primary
    public SqlSessionFactory mybatisSqlSessionFactoryBean(@Qualifier("dynamicDataSource") DynamicDataSource dynamicDataSource) throws Exception {
        MybatisSqlSessionFactoryBean sessionFactoryBean=new MybatisSqlSessionFactoryBean();
        //org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        MybatisConfiguration configuration=new MybatisConfiguration();
        configuration.setCallSettersOnNulls(true);
        sessionFactoryBean.setConfiguration(configuration);
        sessionFactoryBean.setDataSource(dynamicDataSource);
        sessionFactoryBean.setGlobalConfig(globalConfiguration());
        sessionFactoryBean.setPlugins(mybatisPlusInterceptor());
        //sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));
        //sessionFactoryBean.setTypeAliasesPackage("org.example.dao"); //new
        //sessionFactoryBean.getConfiguration().addInterceptor(new MybatisPlusInterceptor());
        return sessionFactoryBean.getObject();
    }
    @Bean
    public GlobalConfig globalConfig(){
        GlobalConfig conf = new GlobalConfig();
        conf.setSqlInjector(easySqlInjector());
        return conf;
    }
    @Bean
    @Primary
    public DataSourceTransactionManager dataSourceTransactionManager(@Qualifier("dynamicDataSource")DynamicDataSource dynamicDataSource) {
        return new DataSourceTransactionManager(dynamicDataSource);
    }

    @PostConstruct
    public void init() {
        // 给sqlSessionFactory添加拦截器
        this.sqlSessionFactory.getConfiguration().addInterceptor(new MybatisPlusInterceptor());
    }

}