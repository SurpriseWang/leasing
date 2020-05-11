package com.mdjnu.leasing.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNull() {
            addCriterion("admin_name is null");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNotNull() {
            addCriterion("admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNameEqualTo(String value) {
            addCriterion("admin_name =", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotEqualTo(String value) {
            addCriterion("admin_name <>", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThan(String value) {
            addCriterion("admin_name >", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_name >=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThan(String value) {
            addCriterion("admin_name <", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThanOrEqualTo(String value) {
            addCriterion("admin_name <=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLike(String value) {
            addCriterion("admin_name like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotLike(String value) {
            addCriterion("admin_name not like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameIn(List<String> values) {
            addCriterion("admin_name in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotIn(List<String> values) {
            addCriterion("admin_name not in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameBetween(String value1, String value2) {
            addCriterion("admin_name between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotBetween(String value1, String value2) {
            addCriterion("admin_name not between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNull() {
            addCriterion("admin_password is null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNotNull() {
            addCriterion("admin_password is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordEqualTo(String value) {
            addCriterion("admin_password =", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotEqualTo(String value) {
            addCriterion("admin_password <>", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThan(String value) {
            addCriterion("admin_password >", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("admin_password >=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThan(String value) {
            addCriterion("admin_password <", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThanOrEqualTo(String value) {
            addCriterion("admin_password <=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLike(String value) {
            addCriterion("admin_password like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotLike(String value) {
            addCriterion("admin_password not like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIn(List<String> values) {
            addCriterion("admin_password in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotIn(List<String> values) {
            addCriterion("admin_password not in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordBetween(String value1, String value2) {
            addCriterion("admin_password between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotBetween(String value1, String value2) {
            addCriterion("admin_password not between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andJobNumberIsNull() {
            addCriterion("job_number is null");
            return (Criteria) this;
        }

        public Criteria andJobNumberIsNotNull() {
            addCriterion("job_number is not null");
            return (Criteria) this;
        }

        public Criteria andJobNumberEqualTo(String value) {
            addCriterion("job_number =", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotEqualTo(String value) {
            addCriterion("job_number <>", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberGreaterThan(String value) {
            addCriterion("job_number >", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberGreaterThanOrEqualTo(String value) {
            addCriterion("job_number >=", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberLessThan(String value) {
            addCriterion("job_number <", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberLessThanOrEqualTo(String value) {
            addCriterion("job_number <=", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberLike(String value) {
            addCriterion("job_number like", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotLike(String value) {
            addCriterion("job_number not like", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberIn(List<String> values) {
            addCriterion("job_number in", values, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotIn(List<String> values) {
            addCriterion("job_number not in", values, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberBetween(String value1, String value2) {
            addCriterion("job_number between", value1, value2, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotBetween(String value1, String value2) {
            addCriterion("job_number not between", value1, value2, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobPhoneIsNull() {
            addCriterion("job_phone is null");
            return (Criteria) this;
        }

        public Criteria andJobPhoneIsNotNull() {
            addCriterion("job_phone is not null");
            return (Criteria) this;
        }

        public Criteria andJobPhoneEqualTo(String value) {
            addCriterion("job_phone =", value, "jobPhone");
            return (Criteria) this;
        }

        public Criteria andJobPhoneNotEqualTo(String value) {
            addCriterion("job_phone <>", value, "jobPhone");
            return (Criteria) this;
        }

        public Criteria andJobPhoneGreaterThan(String value) {
            addCriterion("job_phone >", value, "jobPhone");
            return (Criteria) this;
        }

        public Criteria andJobPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("job_phone >=", value, "jobPhone");
            return (Criteria) this;
        }

        public Criteria andJobPhoneLessThan(String value) {
            addCriterion("job_phone <", value, "jobPhone");
            return (Criteria) this;
        }

        public Criteria andJobPhoneLessThanOrEqualTo(String value) {
            addCriterion("job_phone <=", value, "jobPhone");
            return (Criteria) this;
        }

        public Criteria andJobPhoneLike(String value) {
            addCriterion("job_phone like", value, "jobPhone");
            return (Criteria) this;
        }

        public Criteria andJobPhoneNotLike(String value) {
            addCriterion("job_phone not like", value, "jobPhone");
            return (Criteria) this;
        }

        public Criteria andJobPhoneIn(List<String> values) {
            addCriterion("job_phone in", values, "jobPhone");
            return (Criteria) this;
        }

        public Criteria andJobPhoneNotIn(List<String> values) {
            addCriterion("job_phone not in", values, "jobPhone");
            return (Criteria) this;
        }

        public Criteria andJobPhoneBetween(String value1, String value2) {
            addCriterion("job_phone between", value1, value2, "jobPhone");
            return (Criteria) this;
        }

        public Criteria andJobPhoneNotBetween(String value1, String value2) {
            addCriterion("job_phone not between", value1, value2, "jobPhone");
            return (Criteria) this;
        }

        public Criteria andJobSalaryIsNull() {
            addCriterion("job_salary is null");
            return (Criteria) this;
        }

        public Criteria andJobSalaryIsNotNull() {
            addCriterion("job_salary is not null");
            return (Criteria) this;
        }

        public Criteria andJobSalaryEqualTo(Float value) {
            addCriterion("job_salary =", value, "jobSalary");
            return (Criteria) this;
        }

        public Criteria andJobSalaryNotEqualTo(Float value) {
            addCriterion("job_salary <>", value, "jobSalary");
            return (Criteria) this;
        }

        public Criteria andJobSalaryGreaterThan(Float value) {
            addCriterion("job_salary >", value, "jobSalary");
            return (Criteria) this;
        }

        public Criteria andJobSalaryGreaterThanOrEqualTo(Float value) {
            addCriterion("job_salary >=", value, "jobSalary");
            return (Criteria) this;
        }

        public Criteria andJobSalaryLessThan(Float value) {
            addCriterion("job_salary <", value, "jobSalary");
            return (Criteria) this;
        }

        public Criteria andJobSalaryLessThanOrEqualTo(Float value) {
            addCriterion("job_salary <=", value, "jobSalary");
            return (Criteria) this;
        }

        public Criteria andJobSalaryIn(List<Float> values) {
            addCriterion("job_salary in", values, "jobSalary");
            return (Criteria) this;
        }

        public Criteria andJobSalaryNotIn(List<Float> values) {
            addCriterion("job_salary not in", values, "jobSalary");
            return (Criteria) this;
        }

        public Criteria andJobSalaryBetween(Float value1, Float value2) {
            addCriterion("job_salary between", value1, value2, "jobSalary");
            return (Criteria) this;
        }

        public Criteria andJobSalaryNotBetween(Float value1, Float value2) {
            addCriterion("job_salary not between", value1, value2, "jobSalary");
            return (Criteria) this;
        }

        public Criteria andJobEntryTimeIsNull() {
            addCriterion("job_entry_time is null");
            return (Criteria) this;
        }

        public Criteria andJobEntryTimeIsNotNull() {
            addCriterion("job_entry_time is not null");
            return (Criteria) this;
        }

        public Criteria andJobEntryTimeEqualTo(Date value) {
            addCriterionForJDBCDate("job_entry_time =", value, "jobEntryTime");
            return (Criteria) this;
        }

        public Criteria andJobEntryTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("job_entry_time <>", value, "jobEntryTime");
            return (Criteria) this;
        }

        public Criteria andJobEntryTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("job_entry_time >", value, "jobEntryTime");
            return (Criteria) this;
        }

        public Criteria andJobEntryTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("job_entry_time >=", value, "jobEntryTime");
            return (Criteria) this;
        }

        public Criteria andJobEntryTimeLessThan(Date value) {
            addCriterionForJDBCDate("job_entry_time <", value, "jobEntryTime");
            return (Criteria) this;
        }

        public Criteria andJobEntryTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("job_entry_time <=", value, "jobEntryTime");
            return (Criteria) this;
        }

        public Criteria andJobEntryTimeIn(List<Date> values) {
            addCriterionForJDBCDate("job_entry_time in", values, "jobEntryTime");
            return (Criteria) this;
        }

        public Criteria andJobEntryTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("job_entry_time not in", values, "jobEntryTime");
            return (Criteria) this;
        }

        public Criteria andJobEntryTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("job_entry_time between", value1, value2, "jobEntryTime");
            return (Criteria) this;
        }

        public Criteria andJobEntryTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("job_entry_time not between", value1, value2, "jobEntryTime");
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