/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.demo.domain.tables.pojos;


import cn.vertxup.demo.domain.tables.interfaces.IXTabular;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTabular implements VertxPojo, IXTabular {

    private static final long serialVersionUID = 1L;

    private String        key;
    private String        name;
    private String        code;
    private String        type;
    private String        icon;
    private Integer       sort;
    private String        comment;
    private String        appId;
    private Boolean       active;
    private String        sigma;
    private String        metadata;
    private String        language;
    private LocalDateTime createdAt;
    private String        createdBy;
    private LocalDateTime updatedAt;
    private String        updatedBy;

    public XTabular() {}

    public XTabular(IXTabular value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.code = value.getCode();
        this.type = value.getType();
        this.icon = value.getIcon();
        this.sort = value.getSort();
        this.comment = value.getComment();
        this.appId = value.getAppId();
        this.active = value.getActive();
        this.sigma = value.getSigma();
        this.metadata = value.getMetadata();
        this.language = value.getLanguage();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public XTabular(
        String        key,
        String        name,
        String        code,
        String        type,
        String        icon,
        Integer       sort,
        String        comment,
        String        appId,
        Boolean       active,
        String        sigma,
        String        metadata,
        String        language,
        LocalDateTime createdAt,
        String        createdBy,
        LocalDateTime updatedAt,
        String        updatedBy
    ) {
        this.key = key;
        this.name = name;
        this.code = code;
        this.type = type;
        this.icon = icon;
        this.sort = sort;
        this.comment = comment;
        this.appId = appId;
        this.active = active;
        this.sigma = sigma;
        this.metadata = metadata;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public XTabular(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.KEY</code>. 「key」- 列表主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.KEY</code>. 「key」- 列表主键
     */
    @Override
    public XTabular setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.NAME</code>. 「name」- 列表名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.NAME</code>. 「name」- 列表名称
     */
    @Override
    public XTabular setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.CODE</code>. 「code」- 列表编号
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.CODE</code>. 「code」- 列表编号
     */
    @Override
    public XTabular setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.TYPE</code>. 「type」- 列表类型
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.TYPE</code>. 「type」- 列表类型
     */
    @Override
    public XTabular setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.ICON</code>. 「icon」- 列表图标
     */
    @Override
    public String getIcon() {
        return this.icon;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.ICON</code>. 「icon」- 列表图标
     */
    @Override
    public XTabular setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.SORT</code>. 「sort」- 排序信息
     */
    @Override
    public Integer getSort() {
        return this.sort;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.SORT</code>. 「sort」- 排序信息
     */
    @Override
    public XTabular setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.COMMENT</code>. 「comment」- 备注信息
     */
    @Override
    public String getComment() {
        return this.comment;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.COMMENT</code>. 「comment」- 备注信息
     */
    @Override
    public XTabular setComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    @Override
    public String getAppId() {
        return this.appId;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    @Override
    public XTabular setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public XTabular setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public XTabular setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public XTabular setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public XTabular setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public XTabular setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public XTabular setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public XTabular setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public XTabular setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("XTabular (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(type);
        sb.append(", ").append(icon);
        sb.append(", ").append(sort);
        sb.append(", ").append(comment);
        sb.append(", ").append(appId);
        sb.append(", ").append(active);
        sb.append(", ").append(sigma);
        sb.append(", ").append(metadata);
        sb.append(", ").append(language);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(updatedAt);
        sb.append(", ").append(updatedBy);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IXTabular from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setType(from.getType());
        setIcon(from.getIcon());
        setSort(from.getSort());
        setComment(from.getComment());
        setAppId(from.getAppId());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setMetadata(from.getMetadata());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends IXTabular> E into(E into) {
        into.from(this);
        return into;
    }
}
