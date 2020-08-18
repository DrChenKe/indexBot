/*
 * This file is generated by jOOQ.
 */
package com.scomarlf.generated.tables;


import com.scomarlf.generated.Indexbot;
import com.scomarlf.generated.Keys;
import com.scomarlf.generated.tables.records.DictionaryRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
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
public class Dictionary extends TableImpl<DictionaryRecord> {

    private static final long serialVersionUID = 2012613467;

    /**
     * The reference instance of <code>indexBot.dictionary</code>
     */
    public static final Dictionary DICTIONARY = new Dictionary();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DictionaryRecord> getRecordType() {
        return DictionaryRecord.class;
    }

    /**
     * The column <code>indexBot.dictionary.id</code>. 主键
     */
    public final TableField<DictionaryRecord, String> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "主键");

    /**
     * The column <code>indexBot.dictionary.parentId</code>. 父级主键
     */
    public final TableField<DictionaryRecord, String> PARENTID = createField(DSL.name("parentId"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "父级主键");

    /**
     * The column <code>indexBot.dictionary.label</code>. 名
     */
    public final TableField<DictionaryRecord, String> LABEL = createField(DSL.name("label"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "名");

    /**
     * The column <code>indexBot.dictionary.sort</code>. 排序
     */
    public final TableField<DictionaryRecord, Integer> SORT = createField(DSL.name("sort"), org.jooq.impl.SQLDataType.INTEGER, this, "排序");

    /**
     * Create a <code>indexBot.dictionary</code> table reference
     */
    public Dictionary() {
        this(DSL.name("dictionary"), null);
    }

    /**
     * Create an aliased <code>indexBot.dictionary</code> table reference
     */
    public Dictionary(String alias) {
        this(DSL.name(alias), DICTIONARY);
    }

    /**
     * Create an aliased <code>indexBot.dictionary</code> table reference
     */
    public Dictionary(Name alias) {
        this(alias, DICTIONARY);
    }

    private Dictionary(Name alias, Table<DictionaryRecord> aliased) {
        this(alias, aliased, null);
    }

    private Dictionary(Name alias, Table<DictionaryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Dictionary(Table<O> child, ForeignKey<O, DictionaryRecord> key) {
        super(child, key, DICTIONARY);
    }

    @Override
    public Schema getSchema() {
        return Indexbot.INDEXBOT;
    }

    @Override
    public UniqueKey<DictionaryRecord> getPrimaryKey() {
        return Keys.KEY_DICTIONARY_PRIMARY;
    }

    @Override
    public List<UniqueKey<DictionaryRecord>> getKeys() {
        return Arrays.<UniqueKey<DictionaryRecord>>asList(Keys.KEY_DICTIONARY_PRIMARY);
    }

    @Override
    public Dictionary as(String alias) {
        return new Dictionary(DSL.name(alias), this);
    }

    @Override
    public Dictionary as(Name alias) {
        return new Dictionary(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Dictionary rename(String name) {
        return new Dictionary(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Dictionary rename(Name name) {
        return new Dictionary(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
