/*
 * This file is generated by jOOQ.
*/
package up.god.domain.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import up.god.domain.DbJooq;
import up.god.domain.Indexes;
import up.god.domain.Keys;
import up.god.domain.tables.records.SysTabularRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysTabular extends TableImpl<SysTabularRecord> {

    private static final long serialVersionUID = -620387110;

    /**
     * The reference instance of <code>DB_JOOQ.SYS_TABULAR</code>
     */
    public static final SysTabular SYS_TABULAR = new SysTabular();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysTabularRecord> getRecordType() {
        return SysTabularRecord.class;
    }

    /**
     * The column <code>DB_JOOQ.SYS_TABULAR.PK_ID</code>. uniqueId,PK_ID
     */
    public final TableField<SysTabularRecord, String> PK_ID = createField("PK_ID", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "uniqueId,PK_ID");

    /**
     * The column <code>DB_JOOQ.SYS_TABULAR.T_COMMENT</code>. comment,T_COMMENT
     */
    public final TableField<SysTabularRecord, String> T_COMMENT = createField("T_COMMENT", org.jooq.impl.SQLDataType.CLOB, this, "comment,T_COMMENT");

    /**
     * The column <code>DB_JOOQ.SYS_TABULAR.S_NAME</code>. name,S_NAME
     */
    public final TableField<SysTabularRecord, String> S_NAME = createField("S_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "name,S_NAME");

    /**
     * The column <code>DB_JOOQ.SYS_TABULAR.S_CODE</code>. code,S_CODE
     */
    public final TableField<SysTabularRecord, String> S_CODE = createField("S_CODE", org.jooq.impl.SQLDataType.VARCHAR(36), this, "code,S_CODE");

    /**
     * The column <code>DB_JOOQ.SYS_TABULAR.S_SERIAL</code>. serial,S_SERIAL
     */
    public final TableField<SysTabularRecord, String> S_SERIAL = createField("S_SERIAL", org.jooq.impl.SQLDataType.VARCHAR(64), this, "serial,S_SERIAL");

    /**
     * The column <code>DB_JOOQ.SYS_TABULAR.S_TYPE</code>. ??????Tabular??????????????????,type,S_TYPE
     */
    public final TableField<SysTabularRecord, String> S_TYPE = createField("S_TYPE", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "??????Tabular??????????????????,type,S_TYPE");

    /**
     * The column <code>DB_JOOQ.SYS_TABULAR.J_CONFIG</code>. config,J_CONFIG
     */
    public final TableField<SysTabularRecord, String> J_CONFIG = createField("J_CONFIG", org.jooq.impl.SQLDataType.CLOB, this, "config,J_CONFIG");

    /**
     * The column <code>DB_JOOQ.SYS_TABULAR.I_ORDER</code>. order,I_ORDER
     */
    public final TableField<SysTabularRecord, Integer> I_ORDER = createField("I_ORDER", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "order,I_ORDER");

    /**
     * The column <code>DB_JOOQ.SYS_TABULAR.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    public final TableField<SysTabularRecord, Boolean> IS_ACTIVE = createField("IS_ACTIVE", org.jooq.impl.SQLDataType.BOOLEAN, this, "active,IS_ACTIVE");

    /**
     * The column <code>DB_JOOQ.SYS_TABULAR.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    public final TableField<SysTabularRecord, String> Z_SIGMA = createField("Z_SIGMA", org.jooq.impl.SQLDataType.VARCHAR(32), this, "sigma,Z_SIGMA");

    /**
     * The column <code>DB_JOOQ.SYS_TABULAR.Z_LANGUAGE</code>. language,Z_LANGUAGE
     */
    public final TableField<SysTabularRecord, String> Z_LANGUAGE = createField("Z_LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(8), this, "language,Z_LANGUAGE");

    /**
     * The column <code>DB_JOOQ.SYS_TABULAR.Z_CREATE_BY</code>. createBy,Z_CREATE_BY
     */
    public final TableField<SysTabularRecord, String> Z_CREATE_BY = createField("Z_CREATE_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "createBy,Z_CREATE_BY");

    /**
     * The column <code>DB_JOOQ.SYS_TABULAR.Z_CREATE_TIME</code>. createTime,Z_CREATE_TIME
     */
    public final TableField<SysTabularRecord, LocalDateTime> Z_CREATE_TIME = createField("Z_CREATE_TIME", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "createTime,Z_CREATE_TIME");

    /**
     * The column <code>DB_JOOQ.SYS_TABULAR.Z_UPDATE_BY</code>. updateBy,Z_UPDATE_BY
     */
    public final TableField<SysTabularRecord, String> Z_UPDATE_BY = createField("Z_UPDATE_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "updateBy,Z_UPDATE_BY");

    /**
     * The column <code>DB_JOOQ.SYS_TABULAR.Z_UPDATE_TIME</code>. updateTime,Z_UPDATE_TIME
     */
    public final TableField<SysTabularRecord, LocalDateTime> Z_UPDATE_TIME = createField("Z_UPDATE_TIME", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "updateTime,Z_UPDATE_TIME");

    /**
     * Create a <code>DB_JOOQ.SYS_TABULAR</code> table reference
     */
    public SysTabular() {
        this(DSL.name("SYS_TABULAR"), null);
    }

    /**
     * Create an aliased <code>DB_JOOQ.SYS_TABULAR</code> table reference
     */
    public SysTabular(String alias) {
        this(DSL.name(alias), SYS_TABULAR);
    }

    /**
     * Create an aliased <code>DB_JOOQ.SYS_TABULAR</code> table reference
     */
    public SysTabular(Name alias) {
        this(alias, SYS_TABULAR);
    }

    private SysTabular(Name alias, Table<SysTabularRecord> aliased) {
        this(alias, aliased, null);
    }

    private SysTabular(Name alias, Table<SysTabularRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DbJooq.DB_JOOQ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SYS_TABULAR_PRIMARY, Indexes.SYS_TABULAR_UK_SYS_TABULAR_S_CODE_S_TYPE_Z_SIGMA_Z_LANGUAGE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SysTabularRecord> getPrimaryKey() {
        return Keys.KEY_SYS_TABULAR_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SysTabularRecord>> getKeys() {
        return Arrays.<UniqueKey<SysTabularRecord>>asList(Keys.KEY_SYS_TABULAR_PRIMARY, Keys.KEY_SYS_TABULAR_UK_SYS_TABULAR_S_CODE_S_TYPE_Z_SIGMA_Z_LANGUAGE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysTabular as(String alias) {
        return new SysTabular(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysTabular as(Name alias) {
        return new SysTabular(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SysTabular rename(String name) {
        return new SysTabular(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SysTabular rename(Name name) {
        return new SysTabular(name, null);
    }
}
