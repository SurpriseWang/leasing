package com.mdjnu.leasing.pojo;

import java.util.ArrayList;
import java.util.List;

public class HouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseExample() {
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

        public Criteria andHouseIdIsNull() {
            addCriterion("house_id is null");
            return (Criteria) this;
        }

        public Criteria andHouseIdIsNotNull() {
            addCriterion("house_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouseIdEqualTo(Integer value) {
            addCriterion("house_id =", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotEqualTo(Integer value) {
            addCriterion("house_id <>", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThan(Integer value) {
            addCriterion("house_id >", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("house_id >=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThan(Integer value) {
            addCriterion("house_id <", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("house_id <=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdIn(List<Integer> values) {
            addCriterion("house_id in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotIn(List<Integer> values) {
            addCriterion("house_id not in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdBetween(Integer value1, Integer value2) {
            addCriterion("house_id between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("house_id not between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_Id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_Id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_Id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_Id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_Id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_Id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_Id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_Id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_Id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_Id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_Id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_Id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andHouseAddressIsNull() {
            addCriterion("house_address is null");
            return (Criteria) this;
        }

        public Criteria andHouseAddressIsNotNull() {
            addCriterion("house_address is not null");
            return (Criteria) this;
        }

        public Criteria andHouseAddressEqualTo(String value) {
            addCriterion("house_address =", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressNotEqualTo(String value) {
            addCriterion("house_address <>", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressGreaterThan(String value) {
            addCriterion("house_address >", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressGreaterThanOrEqualTo(String value) {
            addCriterion("house_address >=", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressLessThan(String value) {
            addCriterion("house_address <", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressLessThanOrEqualTo(String value) {
            addCriterion("house_address <=", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressLike(String value) {
            addCriterion("house_address like", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressNotLike(String value) {
            addCriterion("house_address not like", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressIn(List<String> values) {
            addCriterion("house_address in", values, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressNotIn(List<String> values) {
            addCriterion("house_address not in", values, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressBetween(String value1, String value2) {
            addCriterion("house_address between", value1, value2, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressNotBetween(String value1, String value2) {
            addCriterion("house_address not between", value1, value2, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseCardNumberIsNull() {
            addCriterion("house_card_number is null");
            return (Criteria) this;
        }

        public Criteria andHouseCardNumberIsNotNull() {
            addCriterion("house_card_number is not null");
            return (Criteria) this;
        }

        public Criteria andHouseCardNumberEqualTo(String value) {
            addCriterion("house_card_number =", value, "houseCardNumber");
            return (Criteria) this;
        }

        public Criteria andHouseCardNumberNotEqualTo(String value) {
            addCriterion("house_card_number <>", value, "houseCardNumber");
            return (Criteria) this;
        }

        public Criteria andHouseCardNumberGreaterThan(String value) {
            addCriterion("house_card_number >", value, "houseCardNumber");
            return (Criteria) this;
        }

        public Criteria andHouseCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("house_card_number >=", value, "houseCardNumber");
            return (Criteria) this;
        }

        public Criteria andHouseCardNumberLessThan(String value) {
            addCriterion("house_card_number <", value, "houseCardNumber");
            return (Criteria) this;
        }

        public Criteria andHouseCardNumberLessThanOrEqualTo(String value) {
            addCriterion("house_card_number <=", value, "houseCardNumber");
            return (Criteria) this;
        }

        public Criteria andHouseCardNumberLike(String value) {
            addCriterion("house_card_number like", value, "houseCardNumber");
            return (Criteria) this;
        }

        public Criteria andHouseCardNumberNotLike(String value) {
            addCriterion("house_card_number not like", value, "houseCardNumber");
            return (Criteria) this;
        }

        public Criteria andHouseCardNumberIn(List<String> values) {
            addCriterion("house_card_number in", values, "houseCardNumber");
            return (Criteria) this;
        }

        public Criteria andHouseCardNumberNotIn(List<String> values) {
            addCriterion("house_card_number not in", values, "houseCardNumber");
            return (Criteria) this;
        }

        public Criteria andHouseCardNumberBetween(String value1, String value2) {
            addCriterion("house_card_number between", value1, value2, "houseCardNumber");
            return (Criteria) this;
        }

        public Criteria andHouseCardNumberNotBetween(String value1, String value2) {
            addCriterion("house_card_number not between", value1, value2, "houseCardNumber");
            return (Criteria) this;
        }

        public Criteria andHouseAreaIsNull() {
            addCriterion("house_area is null");
            return (Criteria) this;
        }

        public Criteria andHouseAreaIsNotNull() {
            addCriterion("house_area is not null");
            return (Criteria) this;
        }

        public Criteria andHouseAreaEqualTo(Float value) {
            addCriterion("house_area =", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaNotEqualTo(Float value) {
            addCriterion("house_area <>", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaGreaterThan(Float value) {
            addCriterion("house_area >", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaGreaterThanOrEqualTo(Float value) {
            addCriterion("house_area >=", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaLessThan(Float value) {
            addCriterion("house_area <", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaLessThanOrEqualTo(Float value) {
            addCriterion("house_area <=", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaIn(List<Float> values) {
            addCriterion("house_area in", values, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaNotIn(List<Float> values) {
            addCriterion("house_area not in", values, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaBetween(Float value1, Float value2) {
            addCriterion("house_area between", value1, value2, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaNotBetween(Float value1, Float value2) {
            addCriterion("house_area not between", value1, value2, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseSellIsNull() {
            addCriterion("house_sell is null");
            return (Criteria) this;
        }

        public Criteria andHouseSellIsNotNull() {
            addCriterion("house_sell is not null");
            return (Criteria) this;
        }

        public Criteria andHouseSellEqualTo(Integer value) {
            addCriterion("house_sell =", value, "houseSell");
            return (Criteria) this;
        }

        public Criteria andHouseSellNotEqualTo(Integer value) {
            addCriterion("house_sell <>", value, "houseSell");
            return (Criteria) this;
        }

        public Criteria andHouseSellGreaterThan(Integer value) {
            addCriterion("house_sell >", value, "houseSell");
            return (Criteria) this;
        }

        public Criteria andHouseSellGreaterThanOrEqualTo(Integer value) {
            addCriterion("house_sell >=", value, "houseSell");
            return (Criteria) this;
        }

        public Criteria andHouseSellLessThan(Integer value) {
            addCriterion("house_sell <", value, "houseSell");
            return (Criteria) this;
        }

        public Criteria andHouseSellLessThanOrEqualTo(Integer value) {
            addCriterion("house_sell <=", value, "houseSell");
            return (Criteria) this;
        }

        public Criteria andHouseSellIn(List<Integer> values) {
            addCriterion("house_sell in", values, "houseSell");
            return (Criteria) this;
        }

        public Criteria andHouseSellNotIn(List<Integer> values) {
            addCriterion("house_sell not in", values, "houseSell");
            return (Criteria) this;
        }

        public Criteria andHouseSellBetween(Integer value1, Integer value2) {
            addCriterion("house_sell between", value1, value2, "houseSell");
            return (Criteria) this;
        }

        public Criteria andHouseSellNotBetween(Integer value1, Integer value2) {
            addCriterion("house_sell not between", value1, value2, "houseSell");
            return (Criteria) this;
        }

        public Criteria andHouseSellMoneyIsNull() {
            addCriterion("house_sell_money is null");
            return (Criteria) this;
        }

        public Criteria andHouseSellMoneyIsNotNull() {
            addCriterion("house_sell_money is not null");
            return (Criteria) this;
        }

        public Criteria andHouseSellMoneyEqualTo(Float value) {
            addCriterion("house_sell_money =", value, "houseSellMoney");
            return (Criteria) this;
        }

        public Criteria andHouseSellMoneyNotEqualTo(Float value) {
            addCriterion("house_sell_money <>", value, "houseSellMoney");
            return (Criteria) this;
        }

        public Criteria andHouseSellMoneyGreaterThan(Float value) {
            addCriterion("house_sell_money >", value, "houseSellMoney");
            return (Criteria) this;
        }

        public Criteria andHouseSellMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("house_sell_money >=", value, "houseSellMoney");
            return (Criteria) this;
        }

        public Criteria andHouseSellMoneyLessThan(Float value) {
            addCriterion("house_sell_money <", value, "houseSellMoney");
            return (Criteria) this;
        }

        public Criteria andHouseSellMoneyLessThanOrEqualTo(Float value) {
            addCriterion("house_sell_money <=", value, "houseSellMoney");
            return (Criteria) this;
        }

        public Criteria andHouseSellMoneyIn(List<Float> values) {
            addCriterion("house_sell_money in", values, "houseSellMoney");
            return (Criteria) this;
        }

        public Criteria andHouseSellMoneyNotIn(List<Float> values) {
            addCriterion("house_sell_money not in", values, "houseSellMoney");
            return (Criteria) this;
        }

        public Criteria andHouseSellMoneyBetween(Float value1, Float value2) {
            addCriterion("house_sell_money between", value1, value2, "houseSellMoney");
            return (Criteria) this;
        }

        public Criteria andHouseSellMoneyNotBetween(Float value1, Float value2) {
            addCriterion("house_sell_money not between", value1, value2, "houseSellMoney");
            return (Criteria) this;
        }

        public Criteria andHouseLeaseIsNull() {
            addCriterion("house_lease is null");
            return (Criteria) this;
        }

        public Criteria andHouseLeaseIsNotNull() {
            addCriterion("house_lease is not null");
            return (Criteria) this;
        }

        public Criteria andHouseLeaseEqualTo(Integer value) {
            addCriterion("house_lease =", value, "houseLease");
            return (Criteria) this;
        }

        public Criteria andHouseLeaseNotEqualTo(Integer value) {
            addCriterion("house_lease <>", value, "houseLease");
            return (Criteria) this;
        }

        public Criteria andHouseLeaseGreaterThan(Integer value) {
            addCriterion("house_lease >", value, "houseLease");
            return (Criteria) this;
        }

        public Criteria andHouseLeaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("house_lease >=", value, "houseLease");
            return (Criteria) this;
        }

        public Criteria andHouseLeaseLessThan(Integer value) {
            addCriterion("house_lease <", value, "houseLease");
            return (Criteria) this;
        }

        public Criteria andHouseLeaseLessThanOrEqualTo(Integer value) {
            addCriterion("house_lease <=", value, "houseLease");
            return (Criteria) this;
        }

        public Criteria andHouseLeaseIn(List<Integer> values) {
            addCriterion("house_lease in", values, "houseLease");
            return (Criteria) this;
        }

        public Criteria andHouseLeaseNotIn(List<Integer> values) {
            addCriterion("house_lease not in", values, "houseLease");
            return (Criteria) this;
        }

        public Criteria andHouseLeaseBetween(Integer value1, Integer value2) {
            addCriterion("house_lease between", value1, value2, "houseLease");
            return (Criteria) this;
        }

        public Criteria andHouseLeaseNotBetween(Integer value1, Integer value2) {
            addCriterion("house_lease not between", value1, value2, "houseLease");
            return (Criteria) this;
        }

        public Criteria andHouseLeaseMoneyIsNull() {
            addCriterion("house_lease_money is null");
            return (Criteria) this;
        }

        public Criteria andHouseLeaseMoneyIsNotNull() {
            addCriterion("house_lease_money is not null");
            return (Criteria) this;
        }

        public Criteria andHouseLeaseMoneyEqualTo(Float value) {
            addCriterion("house_lease_money =", value, "houseLeaseMoney");
            return (Criteria) this;
        }

        public Criteria andHouseLeaseMoneyNotEqualTo(Float value) {
            addCriterion("house_lease_money <>", value, "houseLeaseMoney");
            return (Criteria) this;
        }

        public Criteria andHouseLeaseMoneyGreaterThan(Float value) {
            addCriterion("house_lease_money >", value, "houseLeaseMoney");
            return (Criteria) this;
        }

        public Criteria andHouseLeaseMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("house_lease_money >=", value, "houseLeaseMoney");
            return (Criteria) this;
        }

        public Criteria andHouseLeaseMoneyLessThan(Float value) {
            addCriterion("house_lease_money <", value, "houseLeaseMoney");
            return (Criteria) this;
        }

        public Criteria andHouseLeaseMoneyLessThanOrEqualTo(Float value) {
            addCriterion("house_lease_money <=", value, "houseLeaseMoney");
            return (Criteria) this;
        }

        public Criteria andHouseLeaseMoneyIn(List<Float> values) {
            addCriterion("house_lease_money in", values, "houseLeaseMoney");
            return (Criteria) this;
        }

        public Criteria andHouseLeaseMoneyNotIn(List<Float> values) {
            addCriterion("house_lease_money not in", values, "houseLeaseMoney");
            return (Criteria) this;
        }

        public Criteria andHouseLeaseMoneyBetween(Float value1, Float value2) {
            addCriterion("house_lease_money between", value1, value2, "houseLeaseMoney");
            return (Criteria) this;
        }

        public Criteria andHouseLeaseMoneyNotBetween(Float value1, Float value2) {
            addCriterion("house_lease_money not between", value1, value2, "houseLeaseMoney");
            return (Criteria) this;
        }

        public Criteria andHousePhotoIsNull() {
            addCriterion("house_photo is null");
            return (Criteria) this;
        }

        public Criteria andHousePhotoIsNotNull() {
            addCriterion("house_photo is not null");
            return (Criteria) this;
        }

        public Criteria andHousePhotoEqualTo(String value) {
            addCriterion("house_photo =", value, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoNotEqualTo(String value) {
            addCriterion("house_photo <>", value, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoGreaterThan(String value) {
            addCriterion("house_photo >", value, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoGreaterThanOrEqualTo(String value) {
            addCriterion("house_photo >=", value, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoLessThan(String value) {
            addCriterion("house_photo <", value, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoLessThanOrEqualTo(String value) {
            addCriterion("house_photo <=", value, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoLike(String value) {
            addCriterion("house_photo like", value, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoNotLike(String value) {
            addCriterion("house_photo not like", value, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoIn(List<String> values) {
            addCriterion("house_photo in", values, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoNotIn(List<String> values) {
            addCriterion("house_photo not in", values, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoBetween(String value1, String value2) {
            addCriterion("house_photo between", value1, value2, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoNotBetween(String value1, String value2) {
            addCriterion("house_photo not between", value1, value2, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHouseDescribeIsNull() {
            addCriterion("house_describe is null");
            return (Criteria) this;
        }

        public Criteria andHouseDescribeIsNotNull() {
            addCriterion("house_describe is not null");
            return (Criteria) this;
        }

        public Criteria andHouseDescribeEqualTo(String value) {
            addCriterion("house_describe =", value, "houseDescribe");
            return (Criteria) this;
        }

        public Criteria andHouseDescribeNotEqualTo(String value) {
            addCriterion("house_describe <>", value, "houseDescribe");
            return (Criteria) this;
        }

        public Criteria andHouseDescribeGreaterThan(String value) {
            addCriterion("house_describe >", value, "houseDescribe");
            return (Criteria) this;
        }

        public Criteria andHouseDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("house_describe >=", value, "houseDescribe");
            return (Criteria) this;
        }

        public Criteria andHouseDescribeLessThan(String value) {
            addCriterion("house_describe <", value, "houseDescribe");
            return (Criteria) this;
        }

        public Criteria andHouseDescribeLessThanOrEqualTo(String value) {
            addCriterion("house_describe <=", value, "houseDescribe");
            return (Criteria) this;
        }

        public Criteria andHouseDescribeLike(String value) {
            addCriterion("house_describe like", value, "houseDescribe");
            return (Criteria) this;
        }

        public Criteria andHouseDescribeNotLike(String value) {
            addCriterion("house_describe not like", value, "houseDescribe");
            return (Criteria) this;
        }

        public Criteria andHouseDescribeIn(List<String> values) {
            addCriterion("house_describe in", values, "houseDescribe");
            return (Criteria) this;
        }

        public Criteria andHouseDescribeNotIn(List<String> values) {
            addCriterion("house_describe not in", values, "houseDescribe");
            return (Criteria) this;
        }

        public Criteria andHouseDescribeBetween(String value1, String value2) {
            addCriterion("house_describe between", value1, value2, "houseDescribe");
            return (Criteria) this;
        }

        public Criteria andHouseDescribeNotBetween(String value1, String value2) {
            addCriterion("house_describe not between", value1, value2, "houseDescribe");
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