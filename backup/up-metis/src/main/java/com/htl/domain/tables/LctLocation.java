/*
 * This up.god.file is generated by jOOQ.
 */
package com.htl.domain.tables;


import com.htl.domain.DbHtl;
import com.htl.domain.Indexes;
import com.htl.domain.Keys;
import com.htl.domain.tables.records.LctLocationRecord;

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
public class LctLocation extends TableImpl<LctLocationRecord> {

    /**
     * The reference instance of <code>DB_HTL.LCT_LOCATION</code>
     */
    public static final LctLocation LCT_LOCATION = new LctLocation();
    private static final long serialVersionUID = -591858422;
    /**
     * The column <code>DB_HTL.LCT_LOCATION.PK_ID</code>. uniqueId,PK_ID
     */
    public final TableField<LctLocationRecord, String> PK_ID = createField("PK_ID", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "uniqueId,PK_ID");
    /**
     * The column <code>DB_HTL.LCT_LOCATION.S_NAME</code>. name,S_NAME
     */
    public final TableField<LctLocationRecord, String> S_NAME = createField("S_NAME", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "name,S_NAME");
    /**
     * The column <code>DB_HTL.LCT_LOCATION.S_CODE</code>. code,S_CODE
     */
    public final TableField<LctLocationRecord, String> S_CODE = createField("S_CODE", org.jooq.impl.SQLDataType.VARCHAR(36), this, "code,S_CODE");
    /**
     * The column <code>DB_HTL.LCT_LOCATION.S_ADDRESS</code>. address,S_ADDRESS
     */
    public final TableField<LctLocationRecord, String> S_ADDRESS = createField("S_ADDRESS", org.jooq.impl.SQLDataType.VARCHAR(255), this, "address,S_ADDRESS");
    /**
     * The column <code>DB_HTL.LCT_LOCATION.S_CITY</code>. city,S_CITY
     */
    public final TableField<LctLocationRecord, String> S_CITY = createField("S_CITY", org.jooq.impl.SQLDataType.VARCHAR(32), this, "city,S_CITY");
    /**
     * The column <code>DB_HTL.LCT_LOCATION.S_COUNTRY</code>. country,S_COUNTRY
     */
    public final TableField<LctLocationRecord, String> S_COUNTRY = createField("S_COUNTRY", org.jooq.impl.SQLDataType.VARCHAR(32), this, "country,S_COUNTRY");
    /**
     * The column <code>DB_HTL.LCT_LOCATION.S_DISTINCT</code>. distinct,S_DISTINCT
     */
    public final TableField<LctLocationRecord, String> S_DISTINCT = createField("S_DISTINCT", org.jooq.impl.SQLDataType.VARCHAR(32), this, "distinct,S_DISTINCT");
    /**
     * The column <code>DB_HTL.LCT_LOCATION.S_FULLNAME</code>. ????????????????????????????????????,fullName,S_FULLNAME
     */
    public final TableField<LctLocationRecord, String> S_FULLNAME = createField("S_FULLNAME", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "????????????????????????????????????,fullName,S_FULLNAME");
    /**
     * The column <code>DB_HTL.LCT_LOCATION.S_STATE</code>. state,S_STATE
     */
    public final TableField<LctLocationRecord, String> S_STATE = createField("S_STATE", org.jooq.impl.SQLDataType.VARCHAR(32), this, "state,S_STATE");
    /**
     * The column <code>DB_HTL.LCT_LOCATION.S_STREET1</code>. street1,S_STREET1
     */
    public final TableField<LctLocationRecord, String> S_STREET1 = createField("S_STREET1", org.jooq.impl.SQLDataType.VARCHAR(72), this, "street1,S_STREET1");
    /**
     * The column <code>DB_HTL.LCT_LOCATION.S_STREET2</code>. street2,S_STREET2
     */
    public final TableField<LctLocationRecord, String> S_STREET2 = createField("S_STREET2", org.jooq.impl.SQLDataType.VARCHAR(72), this, "street2,S_STREET2");
    /**
     * The column <code>DB_HTL.LCT_LOCATION.S_STREET3</code>. street3,S_STREET3
     */
    public final TableField<LctLocationRecord, String> S_STREET3 = createField("S_STREET3", org.jooq.impl.SQLDataType.VARCHAR(72), this, "street3,S_STREET3");
    /**
     * The column <code>DB_HTL.LCT_LOCATION.S_ZIP</code>. zip,S_ZIP
     */
    public final TableField<LctLocationRecord, String> S_ZIP = createField("S_ZIP", org.jooq.impl.SQLDataType.VARCHAR(16), this, "zip,S_ZIP");
    /**
     * The column <code>DB_HTL.LCT_LOCATION.J_CONFIG</code>. config,J_CONFIG
     */
    public final TableField<LctLocationRecord, String> J_CONFIG = createField("J_CONFIG", org.jooq.impl.SQLDataType.CLOB, this, "config,J_CONFIG");
    /**
     * The column <code>DB_HTL.LCT_LOCATION.R_DISTINCT_ID</code>. distinctId,R_DISTINCT_ID
     */
    public final TableField<LctLocationRecord, String> R_DISTINCT_ID = createField("R_DISTINCT_ID", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "distinctId,R_DISTINCT_ID");
    /**
     * The column <code>DB_HTL.LCT_LOCATION.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    public final TableField<LctLocationRecord, Boolean> IS_ACTIVE = createField("IS_ACTIVE", org.jooq.impl.SQLDataType.BOOLEAN, this, "active,IS_ACTIVE");
    /**
     * The column <code>DB_HTL.LCT_LOCATION.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    public final TableField<LctLocationRecord, String> Z_SIGMA = createField("Z_SIGMA", org.jooq.impl.SQLDataType.VARCHAR(32), this, "sigma,Z_SIGMA");
    /**
     * The column <code>DB_HTL.LCT_LOCATION.Z_LANGUAGE</code>. language,Z_LANGUAGE
     */
    public final TableField<LctLocationRecord, String> Z_LANGUAGE = createField("Z_LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(8), this, "language,Z_LANGUAGE");
    /**
     * The column <code>DB_HTL.LCT_LOCATION.Z_CREATE_BY</code>. createBy,Z_CREATE_BY
     */
    public final TableField<LctLocationRecord, String> Z_CREATE_BY = createField("Z_CREATE_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "createBy,Z_CREATE_BY");
    /**
     * The column <code>DB_HTL.LCT_LOCATION.Z_CREATE_TIME</code>. createTime,Z_CREATE_TIME
     */
    public final TableField<LctLocationRecord, LocalDateTime> Z_CREATE_TIME = createField("Z_CREATE_TIME", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "createTime,Z_CREATE_TIME");
    /**
     * The column <code>DB_HTL.LCT_LOCATION.Z_UPDATE_BY</code>. updateBy,Z_UPDATE_BY
     */
    public final TableField<LctLocationRecord, String> Z_UPDATE_BY = createField("Z_UPDATE_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "updateBy,Z_UPDATE_BY");
    /**
     * The column <code>DB_HTL.LCT_LOCATION.Z_UPDATE_TIME</code>. updateTime,Z_UPDATE_TIME
     */
    public final TableField<LctLocationRecord, LocalDateTime> Z_UPDATE_TIME = createField("Z_UPDATE_TIME", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "updateTime,Z_UPDATE_TIME");

    /**
     * Create a <code>DB_HTL.LCT_LOCATION</code> table reference
     */
    public LctLocation() {
        this(DSL.name("LCT_LOCATION"), null);
    }

    /**
     * Create an aliased <code>DB_HTL.LCT_LOCATION</code> table reference
     */
    public LctLocation(String alias) {
        this(DSL.name(alias), LCT_LOCATION);
    }

    /**
     * Create an aliased <code>DB_HTL.LCT_LOCATION</code> table reference
     */
    public LctLocation(Name alias) {
        this(alias, LCT_LOCATION);
    }

    private LctLocation(Name alias, Table<LctLocationRecord> aliased) {
        this(alias, aliased, null);
    }

    private LctLocation(Name alias, Table<LctLocationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LctLocationRecord> getRecordType() {
        return LctLocationRecord.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DbHtl.DB_HTL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.LCT_LOCATION_FK_LCT_LOCATION_R_DISTINCT_ID, Indexes.LCT_LOCATION_PRIMARY, Indexes.LCT_LOCATION_UK_LCT_LOCATION_S_CODE_Z_SIGMA);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LctLocationRecord> getPrimaryKey() {
        return Keys.KEY_LCT_LOCATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LctLocationRecord>> getKeys() {
        return Arrays.<UniqueKey<LctLocationRecord>>asList(Keys.KEY_LCT_LOCATION_PRIMARY, Keys.KEY_LCT_LOCATION_UK_LCT_LOCATION_S_CODE_Z_SIGMA);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctLocation as(String alias) {
        return new LctLocation(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctLocation as(Name alias) {
        return new LctLocation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LctLocation rename(String name) {
        return new LctLocation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LctLocation rename(Name name) {
        return new LctLocation(name, null);
    }
}
