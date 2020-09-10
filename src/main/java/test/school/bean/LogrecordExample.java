package test.school.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogrecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogrecordExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDeviceidIsNull() {
            addCriterion("deviceid is null");
            return (Criteria) this;
        }

        public Criteria andDeviceidIsNotNull() {
            addCriterion("deviceid is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceidEqualTo(String value) {
            addCriterion("deviceid =", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotEqualTo(String value) {
            addCriterion("deviceid <>", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidGreaterThan(String value) {
            addCriterion("deviceid >", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidGreaterThanOrEqualTo(String value) {
            addCriterion("deviceid >=", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidLessThan(String value) {
            addCriterion("deviceid <", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidLessThanOrEqualTo(String value) {
            addCriterion("deviceid <=", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidLike(String value) {
            addCriterion("deviceid like", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotLike(String value) {
            addCriterion("deviceid not like", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidIn(List<String> values) {
            addCriterion("deviceid in", values, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotIn(List<String> values) {
            addCriterion("deviceid not in", values, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidBetween(String value1, String value2) {
            addCriterion("deviceid between", value1, value2, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotBetween(String value1, String value2) {
            addCriterion("deviceid not between", value1, value2, "deviceid");
            return (Criteria) this;
        }

        public Criteria andChangevalueIsNull() {
            addCriterion("changevalue is null");
            return (Criteria) this;
        }

        public Criteria andChangevalueIsNotNull() {
            addCriterion("changevalue is not null");
            return (Criteria) this;
        }

        public Criteria andChangevalueEqualTo(String value) {
            addCriterion("changevalue =", value, "changevalue");
            return (Criteria) this;
        }

        public Criteria andChangevalueNotEqualTo(String value) {
            addCriterion("changevalue <>", value, "changevalue");
            return (Criteria) this;
        }

        public Criteria andChangevalueGreaterThan(String value) {
            addCriterion("changevalue >", value, "changevalue");
            return (Criteria) this;
        }

        public Criteria andChangevalueGreaterThanOrEqualTo(String value) {
            addCriterion("changevalue >=", value, "changevalue");
            return (Criteria) this;
        }

        public Criteria andChangevalueLessThan(String value) {
            addCriterion("changevalue <", value, "changevalue");
            return (Criteria) this;
        }

        public Criteria andChangevalueLessThanOrEqualTo(String value) {
            addCriterion("changevalue <=", value, "changevalue");
            return (Criteria) this;
        }

        public Criteria andChangevalueLike(String value) {
            addCriterion("changevalue like", value, "changevalue");
            return (Criteria) this;
        }

        public Criteria andChangevalueNotLike(String value) {
            addCriterion("changevalue not like", value, "changevalue");
            return (Criteria) this;
        }

        public Criteria andChangevalueIn(List<String> values) {
            addCriterion("changevalue in", values, "changevalue");
            return (Criteria) this;
        }

        public Criteria andChangevalueNotIn(List<String> values) {
            addCriterion("changevalue not in", values, "changevalue");
            return (Criteria) this;
        }

        public Criteria andChangevalueBetween(String value1, String value2) {
            addCriterion("changevalue between", value1, value2, "changevalue");
            return (Criteria) this;
        }

        public Criteria andChangevalueNotBetween(String value1, String value2) {
            addCriterion("changevalue not between", value1, value2, "changevalue");
            return (Criteria) this;
        }

        public Criteria andGentimeIsNull() {
            addCriterion("gentime is null");
            return (Criteria) this;
        }

        public Criteria andGentimeIsNotNull() {
            addCriterion("gentime is not null");
            return (Criteria) this;
        }

        public Criteria andGentimeEqualTo(Date value) {
            addCriterion("gentime =", value, "gentime");
            return (Criteria) this;
        }

        public Criteria andGentimeNotEqualTo(Date value) {
            addCriterion("gentime <>", value, "gentime");
            return (Criteria) this;
        }

        public Criteria andGentimeGreaterThan(Date value) {
            addCriterion("gentime >", value, "gentime");
            return (Criteria) this;
        }

        public Criteria andGentimeGreaterThanOrEqualTo(Date value) {
            addCriterion("gentime >=", value, "gentime");
            return (Criteria) this;
        }

        public Criteria andGentimeLessThan(Date value) {
            addCriterion("gentime <", value, "gentime");
            return (Criteria) this;
        }

        public Criteria andGentimeLessThanOrEqualTo(Date value) {
            addCriterion("gentime <=", value, "gentime");
            return (Criteria) this;
        }

        public Criteria andGentimeIn(List<Date> values) {
            addCriterion("gentime in", values, "gentime");
            return (Criteria) this;
        }

        public Criteria andGentimeNotIn(List<Date> values) {
            addCriterion("gentime not in", values, "gentime");
            return (Criteria) this;
        }

        public Criteria andGentimeBetween(Date value1, Date value2) {
            addCriterion("gentime between", value1, value2, "gentime");
            return (Criteria) this;
        }

        public Criteria andGentimeNotBetween(Date value1, Date value2) {
            addCriterion("gentime not between", value1, value2, "gentime");
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