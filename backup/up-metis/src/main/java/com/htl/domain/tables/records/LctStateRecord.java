/*
 * This up.god.file is generated by jOOQ.
 */
package com.htl.domain.tables.records;


import com.htl.domain.tables.LctState;
import com.htl.domain.tables.interfaces.ILctState;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.time.LocalDateTime;


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
public class LctStateRecord extends UpdatableRecordImpl<LctStateRecord> implements Record14<String, String, String, String, String, Integer, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime>, ILctState {

    private static final long serialVersionUID = -1263389506;

    /**
     * Create a detached LctStateRecord
     */
    public LctStateRecord() {
        super(LctState.LCT_STATE);
    }

    /**
     * Create a detached, initialised LctStateRecord
     */
    public LctStateRecord(String pkId, String sName, String sCode, String sAlias, String jConfig, Integer iOrder, String rCountryId, Boolean isActive, String zSigma, String zLanguage, String zCreateBy, LocalDateTime zCreateTime, String zUpdateBy, LocalDateTime zUpdateTime) {
        super(LctState.LCT_STATE);

        set(0, pkId);
        set(1, sName);
        set(2, sCode);
        set(3, sAlias);
        set(4, jConfig);
        set(5, iOrder);
        set(6, rCountryId);
        set(7, isActive);
        set(8, zSigma);
        set(9, zLanguage);
        set(10, zCreateBy);
        set(11, zCreateTime);
        set(12, zUpdateBy);
        set(13, zUpdateTime);
    }

    /**
     * Getter for <code>DB_HTL.LCT_STATE.PK_ID</code>. uniqueId,PK_ID
     */
    @Override
    public String getPkId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_HTL.LCT_STATE.PK_ID</code>. uniqueId,PK_ID
     */
    @Override
    public LctStateRecord setPkId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_STATE.S_NAME</code>. ??????,name,S_NAME
     */
    @Override
    public String getSName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_HTL.LCT_STATE.S_NAME</code>. ??????,name,S_NAME
     */
    @Override
    public LctStateRecord setSName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_STATE.S_CODE</code>. code,S_CODE
     */
    @Override
    public String getSCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_HTL.LCT_STATE.S_CODE</code>. code,S_CODE
     */
    @Override
    public LctStateRecord setSCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_STATE.S_ALIAS</code>. ???????????????,alias,S_ALIAS
     */
    @Override
    public String getSAlias() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_HTL.LCT_STATE.S_ALIAS</code>. ???????????????,alias,S_ALIAS
     */
    @Override
    public LctStateRecord setSAlias(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_STATE.J_CONFIG</code>. config,J_CONFIG
     */
    @Override
    public String getJConfig() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_HTL.LCT_STATE.J_CONFIG</code>. config,J_CONFIG
     */
    @Override
    public LctStateRecord setJConfig(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_STATE.I_ORDER</code>. order,I_ORDER
     */
    @Override
    public Integer getIOrder() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>DB_HTL.LCT_STATE.I_ORDER</code>. order,I_ORDER
     */
    @Override
    public LctStateRecord setIOrder(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_STATE.R_COUNTRY_ID</code>. countryId,R_COUNTRY_ID
     */
    @Override
    public String getRCountryId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_HTL.LCT_STATE.R_COUNTRY_ID</code>. countryId,R_COUNTRY_ID
     */
    @Override
    public LctStateRecord setRCountryId(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_STATE.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    @Override
    public Boolean getIsActive() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>DB_HTL.LCT_STATE.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    @Override
    public LctStateRecord setIsActive(Boolean value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_STATE.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    @Override
    public String getZSigma() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_HTL.LCT_STATE.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    @Override
    public LctStateRecord setZSigma(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_STATE.Z_LANGUAGE</code>. language,Z_LANGUAGE
     */
    @Override
    public String getZLanguage() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_HTL.LCT_STATE.Z_LANGUAGE</code>. language,Z_LANGUAGE
     */
    @Override
    public LctStateRecord setZLanguage(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_STATE.Z_CREATE_BY</code>. createBy,Z_CREATE_BY
     */
    @Override
    public String getZCreateBy() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_HTL.LCT_STATE.Z_CREATE_BY</code>. createBy,Z_CREATE_BY
     */
    @Override
    public LctStateRecord setZCreateBy(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_STATE.Z_CREATE_TIME</code>. createTime,Z_CREATE_TIME
     */
    @Override
    public LocalDateTime getZCreateTime() {
        return (LocalDateTime) get(11);
    }

    /**
     * Setter for <code>DB_HTL.LCT_STATE.Z_CREATE_TIME</code>. createTime,Z_CREATE_TIME
     */
    @Override
    public LctStateRecord setZCreateTime(LocalDateTime value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_STATE.Z_UPDATE_BY</code>. updateBy,Z_UPDATE_BY
     */
    @Override
    public String getZUpdateBy() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_HTL.LCT_STATE.Z_UPDATE_BY</code>. updateBy,Z_UPDATE_BY
     */
    @Override
    public LctStateRecord setZUpdateBy(String value) {
        set(12, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>DB_HTL.LCT_STATE.Z_UPDATE_TIME</code>. updateTime,Z_UPDATE_TIME
     */
    @Override
    public LocalDateTime getZUpdateTime() {
        return (LocalDateTime) get(13);
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>DB_HTL.LCT_STATE.Z_UPDATE_TIME</code>. updateTime,Z_UPDATE_TIME
     */
    @Override
    public LctStateRecord setZUpdateTime(LocalDateTime value) {
        set(13, value);
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
    public Row14<String, String, String, String, String, Integer, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<String, String, String, String, String, Integer, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return LctState.LCT_STATE.PK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return LctState.LCT_STATE.S_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return LctState.LCT_STATE.S_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return LctState.LCT_STATE.S_ALIAS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return LctState.LCT_STATE.J_CONFIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return LctState.LCT_STATE.I_ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return LctState.LCT_STATE.R_COUNTRY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field8() {
        return LctState.LCT_STATE.IS_ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return LctState.LCT_STATE.Z_SIGMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return LctState.LCT_STATE.Z_LANGUAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return LctState.LCT_STATE.Z_CREATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field12() {
        return LctState.LCT_STATE.Z_CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return LctState.LCT_STATE.Z_UPDATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field14() {
        return LctState.LCT_STATE.Z_UPDATE_TIME;
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
        return getSAlias();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getJConfig();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getIOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getRCountryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component8() {
        return getIsActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getZSigma();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getZLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getZCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component12() {
        return getZCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getZUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component14() {
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
        return getSAlias();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getJConfig();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getIOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getRCountryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value8() {
        return getIsActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getZSigma();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getZLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getZCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value12() {
        return getZCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getZUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value14() {
        return getZUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctStateRecord value1(String value) {
        setPkId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctStateRecord value2(String value) {
        setSName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctStateRecord value3(String value) {
        setSCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctStateRecord value4(String value) {
        setSAlias(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctStateRecord value5(String value) {
        setJConfig(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctStateRecord value6(Integer value) {
        setIOrder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctStateRecord value7(String value) {
        setRCountryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctStateRecord value8(Boolean value) {
        setIsActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctStateRecord value9(String value) {
        setZSigma(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctStateRecord value10(String value) {
        setZLanguage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctStateRecord value11(String value) {
        setZCreateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctStateRecord value12(LocalDateTime value) {
        setZCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctStateRecord value13(String value) {
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
    public LctStateRecord value14(LocalDateTime value) {
        setZUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctStateRecord values(String value1, String value2, String value3, String value4, String value5, Integer value6, String value7, Boolean value8, String value9, String value10, String value11, LocalDateTime value12, String value13, LocalDateTime value14) {
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
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ILctState from) {
        setPkId(from.getPkId());
        setSName(from.getSName());
        setSCode(from.getSCode());
        setSAlias(from.getSAlias());
        setJConfig(from.getJConfig());
        setIOrder(from.getIOrder());
        setRCountryId(from.getRCountryId());
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
    public <E extends ILctState> E into(E into) {
        into.from(this);
        return into;
    }
}
