package cn.com.xuxiaowei.repos;

import cn.com.xuxiaowei.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 用户 资源
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
public interface PersonRepository extends JpaRepository<Person, Long> {


}
