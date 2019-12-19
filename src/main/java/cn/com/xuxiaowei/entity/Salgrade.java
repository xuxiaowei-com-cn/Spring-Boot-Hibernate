package cn.com.xuxiaowei.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 徐晓伟
 * @since 2019-12-20
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
@TableName("SALGRADE")
public class Salgrade implements Serializable {

    private static final long serialVersionUID=1L;

    @TableField("GRADE")
    private BigDecimal grade;

    @TableField("LOSAL")
    private BigDecimal losal;

    @TableField("HISAL")
    private BigDecimal hisal;


      public static final String GRADE = "GRADE";

      public static final String LOSAL = "LOSAL";

      public static final String HISAL = "HISAL";

  }
