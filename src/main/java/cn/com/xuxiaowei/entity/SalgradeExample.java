package cn.com.xuxiaowei.entity;

import java.util.ArrayList;
import java.util.List;

public class SalgradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalgradeExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andGradeIsNull() {
            addCriterion("GRADE is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Short value) {
            addCriterion("GRADE =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Short value) {
            addCriterion("GRADE <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Short value) {
            addCriterion("GRADE >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Short value) {
            addCriterion("GRADE >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Short value) {
            addCriterion("GRADE <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Short value) {
            addCriterion("GRADE <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Short> values) {
            addCriterion("GRADE in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Short> values) {
            addCriterion("GRADE not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Short value1, Short value2) {
            addCriterion("GRADE between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Short value1, Short value2) {
            addCriterion("GRADE not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andLosalIsNull() {
            addCriterion("LOSAL is null");
            return (Criteria) this;
        }

        public Criteria andLosalIsNotNull() {
            addCriterion("LOSAL is not null");
            return (Criteria) this;
        }

        public Criteria andLosalEqualTo(Short value) {
            addCriterion("LOSAL =", value, "losal");
            return (Criteria) this;
        }

        public Criteria andLosalNotEqualTo(Short value) {
            addCriterion("LOSAL <>", value, "losal");
            return (Criteria) this;
        }

        public Criteria andLosalGreaterThan(Short value) {
            addCriterion("LOSAL >", value, "losal");
            return (Criteria) this;
        }

        public Criteria andLosalGreaterThanOrEqualTo(Short value) {
            addCriterion("LOSAL >=", value, "losal");
            return (Criteria) this;
        }

        public Criteria andLosalLessThan(Short value) {
            addCriterion("LOSAL <", value, "losal");
            return (Criteria) this;
        }

        public Criteria andLosalLessThanOrEqualTo(Short value) {
            addCriterion("LOSAL <=", value, "losal");
            return (Criteria) this;
        }

        public Criteria andLosalIn(List<Short> values) {
            addCriterion("LOSAL in", values, "losal");
            return (Criteria) this;
        }

        public Criteria andLosalNotIn(List<Short> values) {
            addCriterion("LOSAL not in", values, "losal");
            return (Criteria) this;
        }

        public Criteria andLosalBetween(Short value1, Short value2) {
            addCriterion("LOSAL between", value1, value2, "losal");
            return (Criteria) this;
        }

        public Criteria andLosalNotBetween(Short value1, Short value2) {
            addCriterion("LOSAL not between", value1, value2, "losal");
            return (Criteria) this;
        }

        public Criteria andHisalIsNull() {
            addCriterion("HISAL is null");
            return (Criteria) this;
        }

        public Criteria andHisalIsNotNull() {
            addCriterion("HISAL is not null");
            return (Criteria) this;
        }

        public Criteria andHisalEqualTo(Short value) {
            addCriterion("HISAL =", value, "hisal");
            return (Criteria) this;
        }

        public Criteria andHisalNotEqualTo(Short value) {
            addCriterion("HISAL <>", value, "hisal");
            return (Criteria) this;
        }

        public Criteria andHisalGreaterThan(Short value) {
            addCriterion("HISAL >", value, "hisal");
            return (Criteria) this;
        }

        public Criteria andHisalGreaterThanOrEqualTo(Short value) {
            addCriterion("HISAL >=", value, "hisal");
            return (Criteria) this;
        }

        public Criteria andHisalLessThan(Short value) {
            addCriterion("HISAL <", value, "hisal");
            return (Criteria) this;
        }

        public Criteria andHisalLessThanOrEqualTo(Short value) {
            addCriterion("HISAL <=", value, "hisal");
            return (Criteria) this;
        }

        public Criteria andHisalIn(List<Short> values) {
            addCriterion("HISAL in", values, "hisal");
            return (Criteria) this;
        }

        public Criteria andHisalNotIn(List<Short> values) {
            addCriterion("HISAL not in", values, "hisal");
            return (Criteria) this;
        }

        public Criteria andHisalBetween(Short value1, Short value2) {
            addCriterion("HISAL between", value1, value2, "hisal");
            return (Criteria) this;
        }

        public Criteria andHisalNotBetween(Short value1, Short value2) {
            addCriterion("HISAL not between", value1, value2, "hisal");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}