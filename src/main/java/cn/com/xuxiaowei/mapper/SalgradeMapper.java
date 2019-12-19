package cn.com.xuxiaowei.mapper;

import cn.com.xuxiaowei.entity.Salgrade;
import cn.com.xuxiaowei.entity.SalgradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalgradeMapper {
    long countByExample(SalgradeExample example);

    int deleteByExample(SalgradeExample example);

    int insert(Salgrade record);

    int insertSelective(Salgrade record);

    List<Salgrade> selectByExample(SalgradeExample example);

    int updateByExampleSelective(@Param("record") Salgrade record, @Param("example") SalgradeExample example);

    int updateByExample(@Param("record") Salgrade record, @Param("example") SalgradeExample example);
}