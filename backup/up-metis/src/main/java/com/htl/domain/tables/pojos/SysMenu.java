/*
 * This up.god.file is generated by jOOQ.
 */
package com.htl.domain.tables.pojos;


import com.htl.domain.tables.interfaces.ISysMenu;

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
public class SysMenu implements ISysMenu {

    private static final long serialVersionUID = -1895289821;

    private String pkId;
    private String tScript;
    private String vAppId;
    private String vResId;
    private String sName;
    private String sCode;
    private String sIcon;
    private String sText;
    private String sType;
    private String sUri;
    private String jConfig;
    private Long iLeft;
    private Integer iLevel;
    private Long iRight;
    private String rParentId;
    private Boolean isActive;
    private String zSigma;
    private String zLanguage;
    private String zCreateBy;
    private LocalDateTime zCreateTime;
    private String zUpdateBy;
    private LocalDateTime zUpdateTime;

    public SysMenu() {
    }

    public SysMenu(SysMenu value) {
        this.pkId = value.pkId;
        this.tScript = value.tScript;
        this.vAppId = value.vAppId;
        this.vResId = value.vResId;
        this.sName = value.sName;
        this.sCode = value.sCode;
        this.sIcon = value.sIcon;
        this.sText = value.sText;
        this.sType = value.sType;
        this.sUri = value.sUri;
        this.jConfig = value.jConfig;
        this.iLeft = value.iLeft;
        this.iLevel = value.iLevel;
        this.iRight = value.iRight;
        this.rParentId = value.rParentId;
        this.isActive = value.isActive;
        this.zSigma = value.zSigma;
        this.zLanguage = value.zLanguage;
        this.zCreateBy = value.zCreateBy;
        this.zCreateTime = value.zCreateTime;
        this.zUpdateBy = value.zUpdateBy;
        this.zUpdateTime = value.zUpdateTime;
    }

    public SysMenu(
            String pkId,
            String tScript,
            String vAppId,
            String vResId,
            String sName,
            String sCode,
            String sIcon,
            String sText,
            String sType,
            String sUri,
            String jConfig,
            Long iLeft,
            Integer iLevel,
            Long iRight,
            String rParentId,
            Boolean isActive,
            String zSigma,
            String zLanguage,
            String zCreateBy,
            LocalDateTime zCreateTime,
            String zUpdateBy,
            LocalDateTime zUpdateTime
    ) {
        this.pkId = pkId;
        this.tScript = tScript;
        this.vAppId = vAppId;
        this.vResId = vResId;
        this.sName = sName;
        this.sCode = sCode;
        this.sIcon = sIcon;
        this.sText = sText;
        this.sType = sType;
        this.sUri = sUri;
        this.jConfig = jConfig;
        this.iLeft = iLeft;
        this.iLevel = iLevel;
        this.iRight = iRight;
        this.rParentId = rParentId;
        this.isActive = isActive;
        this.zSigma = zSigma;
        this.zLanguage = zLanguage;
        this.zCreateBy = zCreateBy;
        this.zCreateTime = zCreateTime;
        this.zUpdateBy = zUpdateBy;
        this.zUpdateTime = zUpdateTime;
    }

    public SysMenu(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }

    @Override
    public String getPkId() {
        return this.pkId;
    }

    @Override
    public SysMenu setPkId(String pkId) {
        this.pkId = pkId;
        return this;
    }

    @Override
    public String getTScript() {
        return this.tScript;
    }

    @Override
    public SysMenu setTScript(String tScript) {
        this.tScript = tScript;
        return this;
    }

    @Override
    public String getVAppId() {
        return this.vAppId;
    }

    @Override
    public SysMenu setVAppId(String vAppId) {
        this.vAppId = vAppId;
        return this;
    }

    @Override
    public String getVResId() {
        return this.vResId;
    }

    @Override
    public SysMenu setVResId(String vResId) {
        this.vResId = vResId;
        return this;
    }

    @Override
    public String getSName() {
        return this.sName;
    }

    @Override
    public SysMenu setSName(String sName) {
        this.sName = sName;
        return this;
    }

    @Override
    public String getSCode() {
        return this.sCode;
    }

    @Override
    public SysMenu setSCode(String sCode) {
        this.sCode = sCode;
        return this;
    }

    @Override
    public String getSIcon() {
        return this.sIcon;
    }

    @Override
    public SysMenu setSIcon(String sIcon) {
        this.sIcon = sIcon;
        return this;
    }

    @Override
    public String getSText() {
        return this.sText;
    }

    @Override
    public SysMenu setSText(String sText) {
        this.sText = sText;
        return this;
    }

    @Override
    public String getSType() {
        return this.sType;
    }

    @Override
    public SysMenu setSType(String sType) {
        this.sType = sType;
        return this;
    }

    @Override
    public String getSUri() {
        return this.sUri;
    }

    @Override
    public SysMenu setSUri(String sUri) {
        this.sUri = sUri;
        return this;
    }

    @Override
    public String getJConfig() {
        return this.jConfig;
    }

    @Override
    public SysMenu setJConfig(String jConfig) {
        this.jConfig = jConfig;
        return this;
    }

    @Override
    public Long getILeft() {
        return this.iLeft;
    }

    @Override
    public SysMenu setILeft(Long iLeft) {
        this.iLeft = iLeft;
        return this;
    }

    @Override
    public Integer getILevel() {
        return this.iLevel;
    }

    @Override
    public SysMenu setILevel(Integer iLevel) {
        this.iLevel = iLevel;
        return this;
    }

    @Override
    public Long getIRight() {
        return this.iRight;
    }

    @Override
    public SysMenu setIRight(Long iRight) {
        this.iRight = iRight;
        return this;
    }

    @Override
    public String getRParentId() {
        return this.rParentId;
    }

    @Override
    public SysMenu setRParentId(String rParentId) {
        this.rParentId = rParentId;
        return this;
    }

    @Override
    public Boolean getIsActive() {
        return this.isActive;
    }

    @Override
    public SysMenu setIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    @Override
    public String getZSigma() {
        return this.zSigma;
    }

    @Override
    public SysMenu setZSigma(String zSigma) {
        this.zSigma = zSigma;
        return this;
    }

    @Override
    public String getZLanguage() {
        return this.zLanguage;
    }

    @Override
    public SysMenu setZLanguage(String zLanguage) {
        this.zLanguage = zLanguage;
        return this;
    }

    @Override
    public String getZCreateBy() {
        return this.zCreateBy;
    }

    @Override
    public SysMenu setZCreateBy(String zCreateBy) {
        this.zCreateBy = zCreateBy;
        return this;
    }

    @Override
    public LocalDateTime getZCreateTime() {
        return this.zCreateTime;
    }

    @Override
    public SysMenu setZCreateTime(LocalDateTime zCreateTime) {
        this.zCreateTime = zCreateTime;
        return this;
    }

    @Override
    public String getZUpdateBy() {
        return this.zUpdateBy;
    }

    @Override
    public SysMenu setZUpdateBy(String zUpdateBy) {
        this.zUpdateBy = zUpdateBy;
        return this;
    }

    @Override
    public LocalDateTime getZUpdateTime() {
        return this.zUpdateTime;
    }

    @Override
    public SysMenu setZUpdateTime(LocalDateTime zUpdateTime) {
        this.zUpdateTime = zUpdateTime;
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SysMenu (");

        sb.append(pkId);
        sb.append(", ").append(tScript);
        sb.append(", ").append(vAppId);
        sb.append(", ").append(vResId);
        sb.append(", ").append(sName);
        sb.append(", ").append(sCode);
        sb.append(", ").append(sIcon);
        sb.append(", ").append(sText);
        sb.append(", ").append(sType);
        sb.append(", ").append(sUri);
        sb.append(", ").append(jConfig);
        sb.append(", ").append(iLeft);
        sb.append(", ").append(iLevel);
        sb.append(", ").append(iRight);
        sb.append(", ").append(rParentId);
        sb.append(", ").append(isActive);
        sb.append(", ").append(zSigma);
        sb.append(", ").append(zLanguage);
        sb.append(", ").append(zCreateBy);
        sb.append(", ").append(zCreateTime);
        sb.append(", ").append(zUpdateBy);
        sb.append(", ").append(zUpdateTime);

        sb.append(")");
        return sb.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ISysMenu from) {
        setPkId(from.getPkId());
        setTScript(from.getTScript());
        setVAppId(from.getVAppId());
        setVResId(from.getVResId());
        setSName(from.getSName());
        setSCode(from.getSCode());
        setSIcon(from.getSIcon());
        setSText(from.getSText());
        setSType(from.getSType());
        setSUri(from.getSUri());
        setJConfig(from.getJConfig());
        setILeft(from.getILeft());
        setILevel(from.getILevel());
        setIRight(from.getIRight());
        setRParentId(from.getRParentId());
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
    public <E extends ISysMenu> E into(E into) {
        into.from(this);
        return into;
    }
}
