package com.aridhu.microservices.enterprise.product.configuration;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import oracle.jdbc.pool.OracleDataSource;

@Configuration("MybatisConfiguration")
@MapperScan("com.aridhu.microservices.enterprise.product.service.mapper")
public class MybatisConfiguration {

    @Value("${oracle.driverClass}")
	private String driverClass;
	
	@Value("${oracle.url}")
	private String jdbcUrl;
	
	@Value("${oracle.username}")
	private String jdbcUsername;
	
	@Value("${oracle.password}")
	private String jdbcPassword;
	
	@Bean(destroyMethod="close")
	public DataSource dataSource() throws SQLException {
		OracleDataSource dataSource = new OracleDataSource();
		dataSource.setDriverType(driverClass);
		dataSource.setUser(jdbcUsername);
	      dataSource.setPassword(jdbcPassword);
	      dataSource.setURL(jdbcUrl);
	      dataSource.setImplicitCachingEnabled(true);
	      dataSource.setFastConnectionFailoverEnabled(true);
		return dataSource;
	}
	@Bean
	  public SqlSessionFactory sqlSessionFactory() throws Exception {
	    SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
	    sessionFactory.setDataSource(dataSource());
	    return sessionFactory.getObject();
	  }
	
	
	@Bean(destroyMethod="clearCache")
	public SqlSessionTemplate sqlSessionTemplate() throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory());
	}
	

}