package cn.com.xuxiaowei.service;

import cn.com.xuxiaowei.entity.Salgrade;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * 测试类
 */
@SpringBootTest
class ISalgradeServiceTests {

    @Autowired
    private ISalgradeService salgradeService;

    @Test
    void se() {
        QueryWrapper<Salgrade> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(Salgrade.GRADE, 5);
        List<Salgrade> list = salgradeService.list(queryWrapper);
        System.out.println(list);
    }

}
