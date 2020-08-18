/*
 * This file is generated by jOOQ.
 */
package com.scomarlf.generated.tables;


import com.scomarlf.generated.Indexbot;
import com.scomarlf.generated.Keys;
import com.scomarlf.generated.tables.records.RecordRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Row13;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Record extends TableImpl<RecordRecord> {

    private static final long serialVersionUID = -1740244943;

    /**
     * The reference instance of <code>indexBot.record</code>
     */
    public static final Record RECORD = new Record();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RecordRecord> getRecordType() {
        return RecordRecord.class;
    }

    /**
     * The column <code>indexBot.record.id</code>. 频道\群组\机器人 ID
     */
    public final TableField<RecordRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "频道\\群组\\机器人 ID");

    /**
     * The column <code>indexBot.record.code</code>. 频道\群组\机器人 username
     */
    public final TableField<RecordRecord, String> CODE = createField(DSL.name("code"), org.jooq.impl.SQLDataType.VARCHAR(150), this, "频道\\群组\\机器人 username");

    /**
     * The column <code>indexBot.record.inviteLink</code>. 私有链接
     */
    public final TableField<RecordRecord, String> INVITELINK = createField(DSL.name("inviteLink"), org.jooq.impl.SQLDataType.VARCHAR(150), this, "私有链接");

    /**
     * The column <code>indexBot.record.title</code>. 名称
     */
    public final TableField<RecordRecord, String> TITLE = createField(DSL.name("title"), org.jooq.impl.SQLDataType.VARCHAR(200), this, "名称");

    /**
     * The column <code>indexBot.record.remark</code>. 简介
     */
    public final TableField<RecordRecord, String> REMARK = createField(DSL.name("remark"), org.jooq.impl.SQLDataType.CLOB, this, "简介");

    /**
     * The column <code>indexBot.record.memberNumber</code>. 成员数量
     */
    public final TableField<RecordRecord, Long> MEMBERNUMBER = createField(DSL.name("memberNumber"), org.jooq.impl.SQLDataType.BIGINT, this, "成员数量");

    /**
     * The column <code>indexBot.record.tag</code>. 标签
     */
    public final TableField<RecordRecord, String> TAG = createField(DSL.name("tag"), org.jooq.impl.SQLDataType.VARCHAR(200), this, "标签");

    /**
     * The column <code>indexBot.record.type</code>. 收录类型 字典-recordType   频道\群组\机器人
     */
    public final TableField<RecordRecord, String> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.VARCHAR(20), this, "收录类型 字典-recordType   频道\\群组\\机器人");

    /**
     * The column <code>indexBot.record.classification</code>. 分类
     */
    public final TableField<RecordRecord, String> CLASSIFICATION = createField(DSL.name("classification"), org.jooq.impl.SQLDataType.VARCHAR(10), this, "分类");

    /**
     * The column <code>indexBot.record.placardId</code>. 公告ID
     */
    public final TableField<RecordRecord, Long> PLACARDID = createField(DSL.name("placardId"), org.jooq.impl.SQLDataType.BIGINT, this, "公告ID");

    /**
     * The column <code>indexBot.record.createTime</code>. 创建时间
     */
    public final TableField<RecordRecord, LocalDateTime> CREATETIME = createField(DSL.name("createTime"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "创建时间");

    /**
     * The column <code>indexBot.record.updateTime</code>. 更新时间
     */
    public final TableField<RecordRecord, LocalDateTime> UPDATETIME = createField(DSL.name("updateTime"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "更新时间");

    /**
     * The column <code>indexBot.record.enrollUser</code>. 提交收录申请用户
     */
    public final TableField<RecordRecord, Long> ENROLLUSER = createField(DSL.name("enrollUser"), org.jooq.impl.SQLDataType.BIGINT, this, "提交收录申请用户");

    /**
     * Create a <code>indexBot.record</code> table reference
     */
    public Record() {
        this(DSL.name("record"), null);
    }

    /**
     * Create an aliased <code>indexBot.record</code> table reference
     */
    public Record(String alias) {
        this(DSL.name(alias), RECORD);
    }

    /**
     * Create an aliased <code>indexBot.record</code> table reference
     */
    public Record(Name alias) {
        this(alias, RECORD);
    }

    private Record(Name alias, Table<RecordRecord> aliased) {
        this(alias, aliased, null);
    }

    private Record(Name alias, Table<RecordRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends org.jooq.Record> Record(Table<O> child, ForeignKey<O, RecordRecord> key) {
        super(child, key, RECORD);
    }

    @Override
    public Schema getSchema() {
        return Indexbot.INDEXBOT;
    }

    @Override
    public UniqueKey<RecordRecord> getPrimaryKey() {
        return Keys.KEY_RECORD_PRIMARY;
    }

    @Override
    public List<UniqueKey<RecordRecord>> getKeys() {
        return Arrays.<UniqueKey<RecordRecord>>asList(Keys.KEY_RECORD_PRIMARY);
    }

    @Override
    public Record as(String alias) {
        return new Record(DSL.name(alias), this);
    }

    @Override
    public Record as(Name alias) {
        return new Record(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Record rename(String name) {
        return new Record(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Record rename(Name name) {
        return new Record(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<Long, String, String, String, String, Long, String, String, String, Long, LocalDateTime, LocalDateTime, Long> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}
