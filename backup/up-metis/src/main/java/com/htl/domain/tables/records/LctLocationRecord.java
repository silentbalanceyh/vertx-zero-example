/*
 * This up.god.file is generated by jOOQ.
 */
package com.htl.domain.tables.records;


import com.htl.domain.tables.LctLocation;
import com.htl.domain.tables.interfaces.ILctLocation;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record22;
import org.jooq.Row22;
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
public class LctLocationRecord extends UpdatableRecordImpl<LctLocationRecord> implements Record22<String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime>, ILctLocation {

    private static final long serialVersionUID = -1200429049;

    /**
     * Create a detached LctLocationRecord
     */
    public LctLocationRecord() {
        super(LctLocation.LCT_LOCATION);
    }

    /**
     * Create a detached, initialised LctLocationRecord
     */
    public LctLocationRecord(String pkId, String sName, String sCode, String sAddress, String sCity, String sCountry, String sDistinct, String sFullname, String sState, String sStreet1, String sStreet2, String sStreet3, String sZip, String jConfig, String rDistinctId, Boolean isActive, String zSigma, String zLanguage, String zCreateBy, LocalDateTime zCreateTime, String zUpdateBy, LocalDateTime zUpdateTime) {
        super(LctLocation.LCT_LOCATION);

        set(0, pkId);
        set(1, sName);
        set(2, sCode);
        set(3, sAddress);
        set(4, sCity);
        set(5, sCountry);
        set(6, sDistinct);
        set(7, sFullname);
        set(8, sState);
        set(9, sStreet1);
        set(10, sStreet2);
        set(11, sStreet3);
        set(12, sZip);
        set(13, jConfig);
        set(14, rDistinctId);
        set(15, isActive);
        set(16, zSigma);
        set(17, zLanguage);
        set(18, zCreateBy);
        set(19, zCreateTime);
        set(20, zUpdateBy);
        set(21, zUpdateTime);
    }

    /**
     * Getter for <code>DB_HTL.LCT_LOCATION.PK_ID</code>. uniqueId,PK_ID
     */
    @Override
    public String getPkId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_HTL.LCT_LOCATION.PK_ID</code>. uniqueId,PK_ID
     */
    @Override
    public LctLocationRecord setPkId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_LOCATION.S_NAME</code>. name,S_NAME
     */
    @Override
    public String getSName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_HTL.LCT_LOCATION.S_NAME</code>. name,S_NAME
     */
    @Override
    public LctLocationRecord setSName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_LOCATION.S_CODE</code>. code,S_CODE
     */
    @Override
    public String getSCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_HTL.LCT_LOCATION.S_CODE</code>. code,S_CODE
     */
    @Override
    public LctLocationRecord setSCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_LOCATION.S_ADDRESS</code>. address,S_ADDRESS
     */
    @Override
    public String getSAddress() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_HTL.LCT_LOCATION.S_ADDRESS</code>. address,S_ADDRESS
     */
    @Override
    public LctLocationRecord setSAddress(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_LOCATION.S_CITY</code>. city,S_CITY
     */
    @Override
    public String getSCity() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_HTL.LCT_LOCATION.S_CITY</code>. city,S_CITY
     */
    @Override
    public LctLocationRecord setSCity(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_LOCATION.S_COUNTRY</code>. country,S_COUNTRY
     */
    @Override
    public String getSCountry() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_HTL.LCT_LOCATION.S_COUNTRY</code>. country,S_COUNTRY
     */
    @Override
    public LctLocationRecord setSCountry(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_LOCATION.S_DISTINCT</code>. distinct,S_DISTINCT
     */
    @Override
    public String getSDistinct() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_HTL.LCT_LOCATION.S_DISTINCT</code>. distinct,S_DISTINCT
     */
    @Override
    public LctLocationRecord setSDistinct(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_LOCATION.S_FULLNAME</code>. ????????????????????????????????????,fullName,S_FULLNAME
     */
    @Override
    public String getSFullname() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_HTL.LCT_LOCATION.S_FULLNAME</code>. ????????????????????????????????????,fullName,S_FULLNAME
     */
    @Override
    public LctLocationRecord setSFullname(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_LOCATION.S_STATE</code>. state,S_STATE
     */
    @Override
    public String getSState() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_HTL.LCT_LOCATION.S_STATE</code>. state,S_STATE
     */
    @Override
    public LctLocationRecord setSState(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_LOCATION.S_STREET1</code>. street1,S_STREET1
     */
    @Override
    public String getSStreet1() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_HTL.LCT_LOCATION.S_STREET1</code>. street1,S_STREET1
     */
    @Override
    public LctLocationRecord setSStreet1(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_LOCATION.S_STREET2</code>. street2,S_STREET2
     */
    @Override
    public String getSStreet2() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_HTL.LCT_LOCATION.S_STREET2</code>. street2,S_STREET2
     */
    @Override
    public LctLocationRecord setSStreet2(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_LOCATION.S_STREET3</code>. street3,S_STREET3
     */
    @Override
    public String getSStreet3() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_HTL.LCT_LOCATION.S_STREET3</code>. street3,S_STREET3
     */
    @Override
    public LctLocationRecord setSStreet3(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_LOCATION.S_ZIP</code>. zip,S_ZIP
     */
    @Override
    public String getSZip() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_HTL.LCT_LOCATION.S_ZIP</code>. zip,S_ZIP
     */
    @Override
    public LctLocationRecord setSZip(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_LOCATION.J_CONFIG</code>. config,J_CONFIG
     */
    @Override
    public String getJConfig() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_HTL.LCT_LOCATION.J_CONFIG</code>. config,J_CONFIG
     */
    @Override
    public LctLocationRecord setJConfig(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_LOCATION.R_DISTINCT_ID</code>. distinctId,R_DISTINCT_ID
     */
    @Override
    public String getRDistinctId() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_HTL.LCT_LOCATION.R_DISTINCT_ID</code>. distinctId,R_DISTINCT_ID
     */
    @Override
    public LctLocationRecord setRDistinctId(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_LOCATION.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    @Override
    public Boolean getIsActive() {
        return (Boolean) get(15);
    }

    /**
     * Setter for <code>DB_HTL.LCT_LOCATION.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    @Override
    public LctLocationRecord setIsActive(Boolean value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_LOCATION.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    @Override
    public String getZSigma() {
        return (String) get(16);
    }

    /**
     * Setter for <code>DB_HTL.LCT_LOCATION.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    @Override
    public LctLocationRecord setZSigma(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_LOCATION.Z_LANGUAGE</code>. language,Z_LANGUAGE
     */
    @Override
    public String getZLanguage() {
        return (String) get(17);
    }

    /**
     * Setter for <code>DB_HTL.LCT_LOCATION.Z_LANGUAGE</code>. language,Z_LANGUAGE
     */
    @Override
    public LctLocationRecord setZLanguage(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_LOCATION.Z_CREATE_BY</code>. createBy,Z_CREATE_BY
     */
    @Override
    public String getZCreateBy() {
        return (String) get(18);
    }

    /**
     * Setter for <code>DB_HTL.LCT_LOCATION.Z_CREATE_BY</code>. createBy,Z_CREATE_BY
     */
    @Override
    public LctLocationRecord setZCreateBy(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_LOCATION.Z_CREATE_TIME</code>. createTime,Z_CREATE_TIME
     */
    @Override
    public LocalDateTime getZCreateTime() {
        return (LocalDateTime) get(19);
    }

    /**
     * Setter for <code>DB_HTL.LCT_LOCATION.Z_CREATE_TIME</code>. createTime,Z_CREATE_TIME
     */
    @Override
    public LctLocationRecord setZCreateTime(LocalDateTime value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.LCT_LOCATION.Z_UPDATE_BY</code>. updateBy,Z_UPDATE_BY
     */
    @Override
    public String getZUpdateBy() {
        return (String) get(20);
    }

    /**
     * Setter for <code>DB_HTL.LCT_LOCATION.Z_UPDATE_BY</code>. updateBy,Z_UPDATE_BY
     */
    @Override
    public LctLocationRecord setZUpdateBy(String value) {
        set(20, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>DB_HTL.LCT_LOCATION.Z_UPDATE_TIME</code>. updateTime,Z_UPDATE_TIME
     */
    @Override
    public LocalDateTime getZUpdateTime() {
        return (LocalDateTime) get(21);
    }

    // -------------------------------------------------------------------------
    // Record22 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>DB_HTL.LCT_LOCATION.Z_UPDATE_TIME</code>. updateTime,Z_UPDATE_TIME
     */
    @Override
    public LctLocationRecord setZUpdateTime(LocalDateTime value) {
        set(21, value);
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
    public Row22<String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime> valuesRow() {
        return (Row22) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return LctLocation.LCT_LOCATION.PK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return LctLocation.LCT_LOCATION.S_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return LctLocation.LCT_LOCATION.S_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return LctLocation.LCT_LOCATION.S_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return LctLocation.LCT_LOCATION.S_CITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return LctLocation.LCT_LOCATION.S_COUNTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return LctLocation.LCT_LOCATION.S_DISTINCT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return LctLocation.LCT_LOCATION.S_FULLNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return LctLocation.LCT_LOCATION.S_STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return LctLocation.LCT_LOCATION.S_STREET1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return LctLocation.LCT_LOCATION.S_STREET2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return LctLocation.LCT_LOCATION.S_STREET3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return LctLocation.LCT_LOCATION.S_ZIP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return LctLocation.LCT_LOCATION.J_CONFIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return LctLocation.LCT_LOCATION.R_DISTINCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field16() {
        return LctLocation.LCT_LOCATION.IS_ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return LctLocation.LCT_LOCATION.Z_SIGMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return LctLocation.LCT_LOCATION.Z_LANGUAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return LctLocation.LCT_LOCATION.Z_CREATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field20() {
        return LctLocation.LCT_LOCATION.Z_CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field21() {
        return LctLocation.LCT_LOCATION.Z_UPDATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field22() {
        return LctLocation.LCT_LOCATION.Z_UPDATE_TIME;
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
        return getSAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getSCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getSCountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getSDistinct();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getSFullname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getSState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getSStreet1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getSStreet2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getSStreet3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getSZip();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getJConfig();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getRDistinctId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component16() {
        return getIsActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getZSigma();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getZLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component19() {
        return getZCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component20() {
        return getZCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component21() {
        return getZUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component22() {
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
        return getSAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getSCountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getSDistinct();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getSFullname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getSState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getSStreet1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getSStreet2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getSStreet3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getSZip();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getJConfig();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getRDistinctId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value16() {
        return getIsActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getZSigma();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getZLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getZCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value20() {
        return getZCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value21() {
        return getZUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value22() {
        return getZUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctLocationRecord value1(String value) {
        setPkId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctLocationRecord value2(String value) {
        setSName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctLocationRecord value3(String value) {
        setSCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctLocationRecord value4(String value) {
        setSAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctLocationRecord value5(String value) {
        setSCity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctLocationRecord value6(String value) {
        setSCountry(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctLocationRecord value7(String value) {
        setSDistinct(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctLocationRecord value8(String value) {
        setSFullname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctLocationRecord value9(String value) {
        setSState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctLocationRecord value10(String value) {
        setSStreet1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctLocationRecord value11(String value) {
        setSStreet2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctLocationRecord value12(String value) {
        setSStreet3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctLocationRecord value13(String value) {
        setSZip(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctLocationRecord value14(String value) {
        setJConfig(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctLocationRecord value15(String value) {
        setRDistinctId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctLocationRecord value16(Boolean value) {
        setIsActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctLocationRecord value17(String value) {
        setZSigma(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctLocationRecord value18(String value) {
        setZLanguage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctLocationRecord value19(String value) {
        setZCreateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctLocationRecord value20(LocalDateTime value) {
        setZCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctLocationRecord value21(String value) {
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
    public LctLocationRecord value22(LocalDateTime value) {
        setZUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctLocationRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15, Boolean value16, String value17, String value18, String value19, LocalDateTime value20, String value21, LocalDateTime value22) {
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
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ILctLocation from) {
        setPkId(from.getPkId());
        setSName(from.getSName());
        setSCode(from.getSCode());
        setSAddress(from.getSAddress());
        setSCity(from.getSCity());
        setSCountry(from.getSCountry());
        setSDistinct(from.getSDistinct());
        setSFullname(from.getSFullname());
        setSState(from.getSState());
        setSStreet1(from.getSStreet1());
        setSStreet2(from.getSStreet2());
        setSStreet3(from.getSStreet3());
        setSZip(from.getSZip());
        setJConfig(from.getJConfig());
        setRDistinctId(from.getRDistinctId());
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
    public <E extends ILctLocation> E into(E into) {
        into.from(this);
        return into;
    }
}
