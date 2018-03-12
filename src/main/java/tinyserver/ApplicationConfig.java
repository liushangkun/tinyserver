package tinyserver;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class ApplicationConfig implements EnvironmentAware {

    private static Logger logger = LoggerFactory.getLogger(ApplicationConfig.class);

    @Override
    public void setEnvironment(Environment env) {

    }

    @Bean
    public DataSource dataSource() {
        DruidDataSource datasource = new DruidDataSource();
        String url = "url";
        String className = "driverClassName";
        String username = "username";
        String password = "password";
        logger.info("==> url : " + url + " className : " + className + " username : " + username + " password : "
                + password);
        datasource.setUrl(url);
        datasource.setDriverClassName(className);
        datasource.setUsername(username);
        datasource.setPassword(password);
        return datasource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        return sessionFactory.getObject();
    }

}
