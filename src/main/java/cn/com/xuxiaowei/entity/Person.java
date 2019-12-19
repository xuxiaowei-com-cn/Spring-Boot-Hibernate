package cn.com.xuxiaowei.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 用户实体类
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    /**
     * 主键
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 地址
     */
    private String address;

}
