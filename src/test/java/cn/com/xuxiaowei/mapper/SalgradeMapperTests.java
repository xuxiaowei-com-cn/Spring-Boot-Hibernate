package cn.com.xuxiaowei.mapper;

import cn.com.xuxiaowei.entity.Salgrade;
import cn.com.xuxiaowei.entity.SalgradeExample;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class SalgradeMapperTests {

    @Resource
    private SalgradeMapper salgradeMapper;

    @Test
    void selectByExample() {
        SalgradeExample example = new SalgradeExample();
        SalgradeExample.Criteria criteria = example.createCriteria();
        criteria.andGradeEqualTo(new Short("5"));
        List<Salgrade> salgrades = salgradeMapper.selectByExample(example);
        System.out.println(salgrades);
    }

}