/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.demo.domain.tables;


import cn.vertxup.demo.domain.DbEternal;
import cn.vertxup.demo.domain.Indexes;
import cn.vertxup.demo.domain.Keys;
import cn.vertxup.demo.domain.tables.records.XTabularRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row16;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTabular extends TableImpl<XTabularRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>DB_ETERNAL.X_TABULAR</code>
     */
    public static final XTabular X_TABULAR = new XTabular();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<XTabularRecord> getRecordType() {
        return XTabularRecord.class;
    }

    /**
     * The column <code>DB_ETERNAL.X_TABULAR.KEY</code>. 「key」- 列表主键
     */
    public final TableField<XTabularRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 列表主键");

    /**
     * The column <code>DB_ETERNAL.X_TABULAR.NAME</code>. 「name」- 列表名称
     */
    public final TableField<XTabularRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(255), this, "「name」- 列表名称");

    /**
     * The column <code>DB_ETERNAL.X_TABULAR.CODE</code>. 「code」- 列表编号
     */
    public final TableField<XTabularRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(255), this, "「code」- 列表编号");

    /**
     * The column <code>DB_ETERNAL.X_TABULAR.TYPE</code>. 「type」- 列表类型
     */
    public final TableField<XTabularRecord, String> TYPE = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(255), this, "「type」- 列表类型");

    /**
     * The column <code>DB_ETERNAL.X_TABULAR.ICON</code>. 「icon」- 列表图标
     */
    public final TableField<XTabularRecord, String> ICON = createField(DSL.name("ICON"), SQLDataType.VARCHAR(255), this, "「icon」- 列表图标");

    /**
     * The column <code>DB_ETERNAL.X_TABULAR.SORT</code>. 「sort」- 排序信息
     */
    public final TableField<XTabularRecord, Integer> SORT = createField(DSL.name("SORT"), SQLDataType.INTEGER, this, "「sort」- 排序信息");

    /**
     * The column <code>DB_ETERNAL.X_TABULAR.COMMENT</code>. 「comment」- 备注信息
     */
    public final TableField<XTabularRecord, String> COMMENT = createField(DSL.name("COMMENT"), SQLDataType.CLOB, this, "「comment」- 备注信息");

    /**
     * The column <code>DB_ETERNAL.X_TABULAR.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    public final TableField<XTabularRecord, String> APP_ID = createField(DSL.name("APP_ID"), SQLDataType.VARCHAR(255), this, "「appId」- 关联的应用程序ID");

    /**
     * The column <code>DB_ETERNAL.X_TABULAR.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<XTabularRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>DB_ETERNAL.X_TABULAR.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<XTabularRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");

    /**
     * The column <code>DB_ETERNAL.X_TABULAR.METADATA</code>. 「metadata」- 附加配置
     */
    public final TableField<XTabularRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置");

    /**
     * The column <code>DB_ETERNAL.X_TABULAR.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<XTabularRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(8), this, "「language」- 使用的语言");

    /**
     * The column <code>DB_ETERNAL.X_TABULAR.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public final TableField<XTabularRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");

    /**
     * The column <code>DB_ETERNAL.X_TABULAR.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<XTabularRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");

    /**
     * The column <code>DB_ETERNAL.X_TABULAR.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public final TableField<XTabularRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");

    /**
     * The column <code>DB_ETERNAL.X_TABULAR.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<XTabularRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private XTabular(Name alias, Table<XTabularRecord> aliased) {
        this(alias, aliased, null);
    }

    private XTabular(Name alias, Table<XTabularRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>DB_ETERNAL.X_TABULAR</code> table reference
     */
    public XTabular(String alias) {
        this(DSL.name(alias), X_TABULAR);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.X_TABULAR</code> table reference
     */
    public XTabular(Name alias) {
        this(alias, X_TABULAR);
    }

    /**
     * Create a <code>DB_ETERNAL.X_TABULAR</code> table reference
     */
    public XTabular() {
        this(DSL.name("X_TABULAR"), null);
    }

    public <O extends Record> XTabular(Table<O> child, ForeignKey<O, XTabularRecord> key) {
        super(child, key, X_TABULAR);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DbEternal.DB_ETERNAL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.X_TABULAR_IDXM_X_TABULAR_APP_ID_TYPE_ACTIVE, Indexes.X_TABULAR_IDXM_X_TABULAR_SIGMA_TYPE_ACTIVE);
    }

    @Override
    public UniqueKey<XTabularRecord> getPrimaryKey() {
        return Keys.KEY_X_TABULAR_PRIMARY;
    }

    @Override
    public List<UniqueKey<XTabularRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_X_TABULAR_APP_ID, Keys.KEY_X_TABULAR_SIGMA);
    }

    @Override
    public XTabular as(String alias) {
        return new XTabular(DSL.name(alias), this);
    }

    @Override
    public XTabular as(Name alias) {
        return new XTabular(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public XTabular rename(String name) {
        return new XTabular(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public XTabular rename(Name name) {
        return new XTabular(name, null);
    }

    // -------------------------------------------------------------------------
    // Row16 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row16<String, String, String, String, String, Integer, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row16) super.fieldsRow();
    }
}
