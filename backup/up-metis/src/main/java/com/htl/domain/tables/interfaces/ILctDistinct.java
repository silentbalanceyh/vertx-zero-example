/*
 * This up.god.file is generated by jOOQ.
 */
package com.htl.domain.tables.interfaces;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.Generated;


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
public interface ILctDistinct extends Serializable {

    /**
     * Getter for <code>DB_HTL.LCT_DISTINCT.PK_ID</code>. uniqueId,PK_ID
     */
    public String getPkId();

    /**
     * Setter for <code>DB_HTL.LCT_DISTINCT.PK_ID</code>. uniqueId,PK_ID
     */
    public ILctDistinct setPkId(String value);

    /**
     * Getter for <code>DB_HTL.LCT_DISTINCT.S_NAME</code>. 名称,name,S_NAME
     */
    public String getSName();

    /**
     * Setter for <code>DB_HTL.LCT_DISTINCT.S_NAME</code>. 名称,name,S_NAME
     */
    public ILctDistinct setSName(String value);

    /**
     * Getter for <code>DB_HTL.LCT_DISTINCT.S_CODE</code>. code,S_CODE
     */
    public String getSCode();

    /**
     * Setter for <code>DB_HTL.LCT_DISTINCT.S_CODE</code>. code,S_CODE
     */
    public ILctDistinct setSCode(String value);

    /**
     * Getter for <code>DB_HTL.LCT_DISTINCT.J_CONFIG</code>. config,J_CONFIG
     */
    public String getJConfig();

    /**
     * Setter for <code>DB_HTL.LCT_DISTINCT.J_CONFIG</code>. config,J_CONFIG
     */
    public ILctDistinct setJConfig(String value);

    /**
     * Getter for <code>DB_HTL.LCT_DISTINCT.I_ORDER</code>. 区域排序,order,I_ORDER
     */
    public Integer getIOrder();

    /**
     * Setter for <code>DB_HTL.LCT_DISTINCT.I_ORDER</code>. 区域排序,order,I_ORDER
     */
    public ILctDistinct setIOrder(Integer value);

    /**
     * Getter for <code>DB_HTL.LCT_DISTINCT.R_CITY_ID</code>. REF:关联城市,cityId,R_CITY_ID
     */
    public String getRCityId();

    /**
     * Setter for <code>DB_HTL.LCT_DISTINCT.R_CITY_ID</code>. REF:关联城市,cityId,R_CITY_ID
     */
    public ILctDistinct setRCityId(String value);

    /**
     * Getter for <code>DB_HTL.LCT_DISTINCT.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    public Boolean getIsActive();

    /**
     * Setter for <code>DB_HTL.LCT_DISTINCT.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    public ILctDistinct setIsActive(Boolean value);

    /**
     * Getter for <code>DB_HTL.LCT_DISTINCT.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    public String getZSigma();

    /**
     * Setter for <code>DB_HTL.LCT_DISTINCT.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    public ILctDistinct setZSigma(String value);

    /**
     * Getter for <code>DB_HTL.LCT_DISTINCT.Z_LANGUAGE</code>. language,Z_LANGUAGE
     */
    public String getZLanguage();

    /**
     * Setter for <code>DB_HTL.LCT_DISTINCT.Z_LANGUAGE</code>. language,Z_LANGUAGE
     */
    public ILctDistinct setZLanguage(String value);

    /**
     * Getter for <code>DB_HTL.LCT_DISTINCT.Z_CREATE_BY</code>. createBy,Z_CREATE_BY
     */
    public String getZCreateBy();

    /**
     * Setter for <code>DB_HTL.LCT_DISTINCT.Z_CREATE_BY</code>. createBy,Z_CREATE_BY
     */
    public ILctDistinct setZCreateBy(String value);

    /**
     * Getter for <code>DB_HTL.LCT_DISTINCT.Z_CREATE_TIME</code>. createTime,Z_CREATE_TIME
     */
    public LocalDateTime getZCreateTime();

    /**
     * Setter for <code>DB_HTL.LCT_DISTINCT.Z_CREATE_TIME</code>. createTime,Z_CREATE_TIME
     */
    public ILctDistinct setZCreateTime(LocalDateTime value);

    /**
     * Getter for <code>DB_HTL.LCT_DISTINCT.Z_UPDATE_BY</code>. updateBy,Z_UPDATE_BY
     */
    public String getZUpdateBy();

    /**
     * Setter for <code>DB_HTL.LCT_DISTINCT.Z_UPDATE_BY</code>. updateBy,Z_UPDATE_BY
     */
    public ILctDistinct setZUpdateBy(String value);

    /**
     * Getter for <code>DB_HTL.LCT_DISTINCT.Z_UPDATE_TIME</code>. updateTime,Z_UPDATE_TIME
     */
    public LocalDateTime getZUpdateTime();

    /**
     * Setter for <code>DB_HTL.LCT_DISTINCT.Z_UPDATE_TIME</code>. updateTime,Z_UPDATE_TIME
     */
    public ILctDistinct setZUpdateTime(LocalDateTime value);

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ILctDistinct
     */
    public void from(com.htl.domain.tables.interfaces.ILctDistinct from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ILctDistinct
     */
    public <E extends com.htl.domain.tables.interfaces.ILctDistinct> E into(E into);

    default ILctDistinct fromJson(io.vertx.core.json.JsonObject json) {
        setPkId(json.getString("PK_ID"));
        setSName(json.getString("S_NAME"));
        setSCode(json.getString("S_CODE"));
        setJConfig(json.getString("J_CONFIG"));
        setIOrder(json.getInteger("I_ORDER"));
        setRCityId(json.getString("R_CITY_ID"));
        setIsActive(json.getBoolean("IS_ACTIVE"));
        setZSigma(json.getString("Z_SIGMA"));
        setZLanguage(json.getString("Z_LANGUAGE"));
        setZCreateBy(json.getString("Z_CREATE_BY"));
        // Omitting unrecognized type java.time.LocalDateTime for column Z_CREATE_TIME!
        setZUpdateBy(json.getString("Z_UPDATE_BY"));
        // Omitting unrecognized type java.time.LocalDateTime for column Z_UPDATE_TIME!
        return this;
    }


    default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("PK_ID", getPkId());
        json.put("S_NAME", getSName());
        json.put("S_CODE", getSCode());
        json.put("J_CONFIG", getJConfig());
        json.put("I_ORDER", getIOrder());
        json.put("R_CITY_ID", getRCityId());
        json.put("IS_ACTIVE", getIsActive());
        json.put("Z_SIGMA", getZSigma());
        json.put("Z_LANGUAGE", getZLanguage());
        json.put("Z_CREATE_BY", getZCreateBy());
        // Omitting unrecognized type java.time.LocalDateTime for column Z_CREATE_TIME!
        json.put("Z_UPDATE_BY", getZUpdateBy());
        // Omitting unrecognized type java.time.LocalDateTime for column Z_UPDATE_TIME!
        return json;
    }

}
