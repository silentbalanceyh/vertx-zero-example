/*
 * This up.god.file is generated by jOOQ.
 */
package com.htl.domain.tables.records;


import com.htl.domain.tables.LctDistinct;
import com.htl.domain.tables.interfaces.ILctDistinct;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.7"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class LctDistinctRecord extends UpdatableRecordImpl<LctDistinctRecord> implements Record13<String, String, String, String, Integer, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime>, ILctDistinct {

    private static final long serialVersionUID = -131126600;

    /**
     * Create a detached LctDistinctRecord
     */
    public LctDistinctRecord() {
        super(LctDistinct.LCT_DISTINCT);
    }

    /**
     * Create a detached, initialised LctDistinctRecord
     */
    public LctDistinctRecord(String pkId, String sName, String sCode, String jConfig, Integer iOrder, String rCityId, Boolean isActive, String zSigma, String zLanguage, String zCreateBy, LocalDateTime zCreateTime, String zUpdateBy, LocalDateTime zUpdateTime) {
        super(LctDistinct.LCT_DISTINCT);

        set(0, pkId);
        set(1, sName);
        set(2, sCode);
        set(3, jConfig);
        set(4, iOrder);
        set(5, rCityId);
        set(6, isActive);
        set(7, zSigma);
        set(8, zLanguage);
        set(9, zCreateBy);
        set(10, zCreateTime);
        set(11, zUpdateBy);
        set(12, zUpdateTime);
    }

    /**
     * Getter for <code>DB_HTL.LCT_DISTINCT.PK_ID</code>. uniqueId,PK_ID
     */
    @Override
    public String getPkId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_HTL.LCT_DISTINCT.PK_ID</code>. uniqueId,PK_ID
     */
    @Override
    public LctDistinctRecord setPkId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_DISTINCT.S_NAME</code>. ??????,name,S_NAME
     */
    @Override
    public String getSName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_HTL.LCT_DISTINCT.S_NAME</code>. ??????,name,S_NAME
     */
    @Override
    public LctDistinctRecord setSName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_DISTINCT.S_CODE</code>. code,S_CODE
     */
    @Override
    public String getSCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_HTL.LCT_DISTINCT.S_CODE</code>. code,S_CODE
     */
    @Override
    public LctDistinctRecord setSCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_DISTINCT.J_CONFIG</code>. config,J_CONFIG
     */
    @Override
    public String getJConfig() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_HTL.LCT_DISTINCT.J_CONFIG</code>. config,J_CONFIG
     */
    @Override
    public LctDistinctRecord setJConfig(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_DISTINCT.I_ORDER</code>. ????????????,order,I_ORDER
     */
    @Override
    public Integer getIOrder() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>DB_HTL.LCT_DISTINCT.I_ORDER</code>. ????????????,order,I_ORDER
     */
    @Override
    public LctDistinctRecord setIOrder(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_DISTINCT.R_CITY_ID</code>. REF:????????????,cityId,R_CITY_ID
     */
    @Override
    public String getRCityId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_HTL.LCT_DISTINCT.R_CITY_ID</code>. REF:????????????,cityId,R_CITY_ID
     */
    @Override
    public LctDistinctRecord setRCityId(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_DISTINCT.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    @Override
    public Boolean getIsActive() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>DB_HTL.LCT_DISTINCT.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    @Override
    public LctDistinctRecord setIsActive(Boolean value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_DISTINCT.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    @Override
    public String getZSigma() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_HTL.LCT_DISTINCT.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    @Override
    public LctDistinctRecord setZSigma(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_DISTINCT.Z_LANGUAGE</code>. language,Z_LANGUAGE
     */
    @Override
    public String getZLanguage() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_HTL.LCT_DISTINCT.Z_LANGUAGE</code>. language,Z_LANGUAGE
     */
    @Override
    public LctDistinctRecord setZLanguage(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_DISTINCT.Z_CREATE_BY</code>. createBy,Z_CREATE_BY
     */
    @Override
    public String getZCreateBy() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_HTL.LCT_DISTINCT.Z_CREATE_BY</code>. createBy,Z_CREATE_BY
     */
    @Override
    public LctDistinctRecord setZCreateBy(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_DISTINCT.Z_CREATE_TIME</code>. createTime,Z_CREATE_TIME
     */
    @Override
    public LocalDateTime getZCreateTime() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>DB_HTL.LCT_DISTINCT.Z_CREATE_TIME</code>. createTime,Z_CREATE_TIME
     */
    @Override
    public LctDistinctRecord setZCreateTime(LocalDateTime value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_DISTINCT.Z_UPDATE_BY</code>. updateBy,Z_UPDATE_BY
     */
    @Override
    public String getZUpdateBy() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_HTL.LCT_DISTINCT.Z_UPDATE_BY</code>. updateBy,Z_UPDATE_BY
     */
    @Override
    public LctDistinctRecord setZUpdateBy(String value) {
        set(11, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>DB_HTL.LCT_DISTINCT.Z_UPDATE_TIME</code>. updateTime,Z_UPDATE_TIME
     */
    @Override
    public LocalDateTime getZUpdateTime() {
        return (LocalDateTime) get(12);
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>DB_HTL.LCT_DISTINCT.Z_UPDATE_TIME</code>. updateTime,Z_UPDATE_TIME
     */
    @Override
    public LctDistinctRecord setZUpdateTime(LocalDateTime value) {
        set(12, value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<String, String, String, String, Integer, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<String, String, String, String, Integer, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return LctDistinct.LCT_DISTINCT.PK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return LctDistinct.LCT_DISTINCT.S_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return LctDistinct.LCT_DISTINCT.S_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return LctDistinct.LCT_DISTINCT.J_CONFIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return LctDistinct.LCT_DISTINCT.I_ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return LctDistinct.LCT_DISTINCT.R_CITY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return LctDistinct.LCT_DISTINCT.IS_ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return LctDistinct.LCT_DISTINCT.Z_SIGMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return LctDistinct.LCT_DISTINCT.Z_LANGUAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return LctDistinct.LCT_DISTINCT.Z_CREATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field11() {
        return LctDistinct.LCT_DISTINCT.Z_CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return LctDistinct.LCT_DISTINCT.Z_UPDATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field13() {
        return LctDistinct.LCT_DISTINCT.Z_UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getPkId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getSName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getJConfig();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getIOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getRCityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component7() {
        return getIsActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getZSigma();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getZLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getZCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component11() {
        return getZCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getZUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component13() {
        return getZUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getPkId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getJConfig();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getIOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getRCityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getIsActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getZSigma();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getZLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getZCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value11() {
        return getZCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getZUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value13() {
        return getZUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctDistinctRecord value1(String value) {
        setPkId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctDistinctRecord value2(String value) {
        setSName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctDistinctRecord value3(String value) {
        setSCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctDistinctRecord value4(String value) {
        setJConfig(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctDistinctRecord value5(Integer value) {
        setIOrder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctDistinctRecord value6(String value) {
        setRCityId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctDistinctRecord value7(Boolean value) {
        setIsActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctDistinctRecord value8(String value) {
        setZSigma(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctDistinctRecord value9(String value) {
        setZLanguage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctDistinctRecord value10(String value) {
        setZCreateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctDistinctRecord value11(LocalDateTime value) {
        setZCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctDistinctRecord value12(String value) {
        setZUpdateBy(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public LctDistinctRecord value13(LocalDateTime value) {
        setZUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctDistinctRecord values(String value1, String value2, String value3, String value4, Integer value5, String value6, Boolean value7, String value8, String value9, String value10, LocalDateTime value11, String value12, LocalDateTime value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ILctDistinct from) {
        setPkId(from.getPkId());
        setSName(from.getSName());
        setSCode(from.getSCode());
        setJConfig(from.getJConfig());
        setIOrder(from.getIOrder());
        setRCityId(from.getRCityId());
        setIsActive(from.getIsActive());
        setZSigma(from.getZSigma());
        setZLanguage(from.getZLanguage());
        setZCreateBy(from.getZCreateBy());
        setZCreateTime(from.getZCreateTime());
        setZUpdateBy(from.getZUpdateBy());
        setZUpdateTime(from.getZUpdateTime());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ILctDistinct> E into(E into) {
        into.from(this);
        return into;
    }
}
