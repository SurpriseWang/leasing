package com.mdjnu.leasing.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserExtendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExtendExample() {
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

        public Criteria andUserExtendIdIsNull() {
            addCriterion("user_extend_id is null");
            return (Criteria) this;
        }

        public Criteria andUserExtendIdIsNotNull() {
            addCriterion("user_extend_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserExtendIdEqualTo(Integer value) {
            addCriterion("user_extend_id =", value, "userExtendId");
            return (Criteria) this;
        }

        public Criteria andUserExtendIdNotEqualTo(Integer value) {
            addCriterion("user_extend_id <>", value, "userExtendId");
            return (Criteria) this;
        }

        public Criteria andUserExtendIdGreaterThan(Integer value) {
            addCriterion("user_extend_id >", value, "userExtendId");
            return (Criteria) this;
        }

        public Criteria andUserExtendIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_extend_id >=", value, "userExtendId");
            return (Criteria) this;
        }

        public Criteria andUserExtendIdLessThan(Integer value) {
            addCriterion("user_extend_id <", value, "userExtendId");
            return (Criteria) this;
        }

        public Criteria andUserExtendIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_extend_id <=", value, "userExtendId");
            return (Criteria) this;
        }

        public Criteria andUserExtendIdIn(List<Integer> values) {
            addCriterion("user_extend_id in", values, "userExtendId");
            return (Criteria) this;
        }

        public Criteria andUserExtendIdNotIn(List<Integer> values) {
            addCriterion("user_extend_id not in", values, "userExtendId");
            return (Criteria) this;
        }

        public Criteria andUserExtendIdBetween(Integer value1, Integer value2) {
            addCriterion("user_extend_id between", value1, value2, "userExtendId");
            return (Criteria) this;
        }

        public Criteria andUserExtendIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_extend_id not between", value1, value2, "userExtendId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNull() {
            addCriterion("user_address is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNotNull() {
            addCriterion("user_address is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressEqualTo(String value) {
            addCriterion("user_address =", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotEqualTo(String value) {
            addCriterion("user_address <>", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThan(String value) {
            addCriterion("user_address >", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("user_address >=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThan(String value) {
            addCriterion("user_address <", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThanOrEqualTo(String value) {
            addCriterion("user_address <=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLike(String value) {
            addCriterion("user_address like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotLike(String value) {
            addCriterion("user_address not like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressIn(List<String> values) {
            addCriterion("user_address in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotIn(List<String> values) {
            addCriterion("user_address not in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressBetween(String value1, String value2) {
            addCriterion("user_address between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotBetween(String value1, String value2) {
            addCriterion("user_address not between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserIdCardIsNull() {
            addCriterion("user_id_card is null");
            return (Criteria) this;
        }

        public Criteria andUserIdCardIsNotNull() {
            addCriterion("user_id_card is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdCardEqualTo(String value) {
            addCriterion("user_id_card =", value, "userIdCard");
            return (Criteria) this;
        }

        public Criteria andUserIdCardNotEqualTo(String value) {
            addCriterion("user_id_card <>", value, "userIdCard");
            return (Criteria) this;
        }

        public Criteria andUserIdCardGreaterThan(String value) {
            addCriterion("user_id_card >", value, "userIdCard");
            return (Criteria) this;
        }

        public Criteria andUserIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("user_id_card >=", value, "userIdCard");
            return (Criteria) this;
        }

        public Criteria andUserIdCardLessThan(String value) {
            addCriterion("user_id_card <", value, "userIdCard");
            return (Criteria) this;
        }

        public Criteria andUserIdCardLessThanOrEqualTo(String value) {
            addCriterion("user_id_card <=", value, "userIdCard");
            return (Criteria) this;
        }

        public Criteria andUserIdCardLike(String value) {
            addCriterion("user_id_card like", value, "userIdCard");
            return (Criteria) this;
        }

        public Criteria andUserIdCardNotLike(String value) {
            addCriterion("user_id_card not like", value, "userIdCard");
            return (Criteria) this;
        }

        public Criteria andUserIdCardIn(List<String> values) {
            addCriterion("user_id_card in", values, "userIdCard");
            return (Criteria) this;
        }

        public Criteria andUserIdCardNotIn(List<String> values) {
            addCriterion("user_id_card not in", values, "userIdCard");
            return (Criteria) this;
        }

        public Criteria andUserIdCardBetween(String value1, String value2) {
            addCriterion("user_id_card between", value1, value2, "userIdCard");
            return (Criteria) this;
        }

        public Criteria andUserIdCardNotBetween(String value1, String value2) {
            addCriterion("user_id_card not between", value1, value2, "userIdCard");
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