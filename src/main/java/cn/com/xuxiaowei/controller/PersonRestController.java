package cn.com.xuxiaowei.controller;

import cn.com.xuxiaowei.repos.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户 RestController
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@RestController
@RequestMapping("/person")
public class PersonRestController {

    /**
     * Spring Data JPA已自动为你注册bean，所以可自动注入
     */
    private final PersonRepository personRepository;

    @Autowired
    public PersonRestController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

}
