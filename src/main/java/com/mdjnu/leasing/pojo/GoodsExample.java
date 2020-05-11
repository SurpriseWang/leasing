package com.mdjnu.leasing.pojo;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
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

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeIsNull() {
            addCriterion("goods_describe is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeIsNotNull() {
            addCriterion("goods_describe is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeEqualTo(String value) {
            addCriterion("goods_describe =", value, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeNotEqualTo(String value) {
            addCriterion("goods_describe <>", value, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeGreaterThan(String value) {
            addCriterion("goods_describe >", value, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_describe >=", value, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeLessThan(String value) {
            addCriterion("goods_describe <", value, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeLessThanOrEqualTo(String value) {
            addCriterion("goods_describe <=", value, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeLike(String value) {
            addCriterion("goods_describe like", value, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeNotLike(String value) {
            addCriterion("goods_describe not like", value, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeIn(List<String> values) {
            addCriterion("goods_describe in", values, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeNotIn(List<String> values) {
            addCriterion("goods_describe not in", values, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeBetween(String value1, String value2) {
            addCriterion("goods_describe between", value1, value2, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsDescribeNotBetween(String value1, String value2) {
            addCriterion("goods_describe not between", value1, value2, "goodsDescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsSellIsNull() {
            addCriterion("goods_sell is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSellIsNotNull() {
            addCriterion("goods_sell is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSellEqualTo(String value) {
            addCriterion("goods_sell =", value, "goodsSell");
            return (Criteria) this;
        }

        public Criteria andGoodsSellNotEqualTo(String value) {
            addCriterion("goods_sell <>", value, "goodsSell");
            return (Criteria) this;
        }

        public Criteria andGoodsSellGreaterThan(String value) {
            addCriterion("goods_sell >", value, "goodsSell");
            return (Criteria) this;
        }

        public Criteria andGoodsSellGreaterThanOrEqualTo(String value) {
            addCriterion("goods_sell >=", value, "goodsSell");
            return (Criteria) this;
        }

        public Criteria andGoodsSellLessThan(String value) {
            addCriterion("goods_sell <", value, "goodsSell");
            return (Criteria) this;
        }

        public Criteria andGoodsSellLessThanOrEqualTo(String value) {
            addCriterion("goods_sell <=", value, "goodsSell");
            return (Criteria) this;
        }

        public Criteria andGoodsSellLike(String value) {
            addCriterion("goods_sell like", value, "goodsSell");
            return (Criteria) this;
        }

        public Criteria andGoodsSellNotLike(String value) {
            addCriterion("goods_sell not like", value, "goodsSell");
            return (Criteria) this;
        }

        public Criteria andGoodsSellIn(List<String> values) {
            addCriterion("goods_sell in", values, "goodsSell");
            return (Criteria) this;
        }

        public Criteria andGoodsSellNotIn(List<String> values) {
            addCriterion("goods_sell not in", values, "goodsSell");
            return (Criteria) this;
        }

        public Criteria andGoodsSellBetween(String value1, String value2) {
            addCriterion("goods_sell between", value1, value2, "goodsSell");
            return (Criteria) this;
        }

        public Criteria andGoodsSellNotBetween(String value1, String value2) {
            addCriterion("goods_sell not between", value1, value2, "goodsSell");
            return (Criteria) this;
        }

        public Criteria andGoodsSellMoneyIsNull() {
            addCriterion("goods_sell_money is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSellMoneyIsNotNull() {
            addCriterion("goods_sell_money is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSellMoneyEqualTo(Float value) {
            addCriterion("goods_sell_money =", value, "goodsSellMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsSellMoneyNotEqualTo(Float value) {
            addCriterion("goods_sell_money <>", value, "goodsSellMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsSellMoneyGreaterThan(Float value) {
            addCriterion("goods_sell_money >", value, "goodsSellMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsSellMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("goods_sell_money >=", value, "goodsSellMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsSellMoneyLessThan(Float value) {
            addCriterion("goods_sell_money <", value, "goodsSellMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsSellMoneyLessThanOrEqualTo(Float value) {
            addCriterion("goods_sell_money <=", value, "goodsSellMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsSellMoneyIn(List<Float> values) {
            addCriterion("goods_sell_money in", values, "goodsSellMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsSellMoneyNotIn(List<Float> values) {
            addCriterion("goods_sell_money not in", values, "goodsSellMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsSellMoneyBetween(Float value1, Float value2) {
            addCriterion("goods_sell_money between", value1, value2, "goodsSellMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsSellMoneyNotBetween(Float value1, Float value2) {
            addCriterion("goods_sell_money not between", value1, value2, "goodsSellMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsPhotoIsNull() {
            addCriterion("goods_photo is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPhotoIsNotNull() {
            addCriterion("goods_photo is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPhotoEqualTo(String value) {
            addCriterion("goods_photo =", value, "goodsPhoto");
            return (Criteria) this;
        }

        public Criteria andGoodsPhotoNotEqualTo(String value) {
            addCriterion("goods_photo <>", value, "goodsPhoto");
            return (Criteria) this;
        }

        public Criteria andGoodsPhotoGreaterThan(String value) {
            addCriterion("goods_photo >", value, "goodsPhoto");
            return (Criteria) this;
        }

        public Criteria andGoodsPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("goods_photo >=", value, "goodsPhoto");
            return (Criteria) this;
        }

        public Criteria andGoodsPhotoLessThan(String value) {
            addCriterion("goods_photo <", value, "goodsPhoto");
            return (Criteria) this;
        }

        public Criteria andGoodsPhotoLessThanOrEqualTo(String value) {
            addCriterion("goods_photo <=", value, "goodsPhoto");
            return (Criteria) this;
        }

        public Criteria andGoodsPhotoLike(String value) {
            addCriterion("goods_photo like", value, "goodsPhoto");
            return (Criteria) this;
        }

        public Criteria andGoodsPhotoNotLike(String value) {
            addCriterion("goods_photo not like", value, "goodsPhoto");
            return (Criteria) this;
        }

        public Criteria andGoodsPhotoIn(List<String> values) {
            addCriterion("goods_photo in", values, "goodsPhoto");
            return (Criteria) this;
        }

        public Criteria andGoodsPhotoNotIn(List<String> values) {
            addCriterion("goods_photo not in", values, "goodsPhoto");
            return (Criteria) this;
        }

        public Criteria andGoodsPhotoBetween(String value1, String value2) {
            addCriterion("goods_photo between", value1, value2, "goodsPhoto");
            return (Criteria) this;
        }

        public Criteria andGoodsPhotoNotBetween(String value1, String value2) {
            addCriterion("goods_photo not between", value1, value2, "goodsPhoto");
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