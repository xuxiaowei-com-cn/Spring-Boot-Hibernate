package cn.com.xuxiaowei.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * JPA 配置
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Configuration
@EnableJpaRepositories("cn.com.xuxiaowei.repos")
public class JpaConfiguration {


}
