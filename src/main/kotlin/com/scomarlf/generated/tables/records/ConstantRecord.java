/*
 * This file is generated by jOOQ.
 */
package com.scomarlf.generated.tables.records;


import com.scomarlf.generated.tables.Constant;
import com.scomarlf.generated.tables.interfaces.IConstant;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConstantRecord extends UpdatableRecordImpl<ConstantRecord> implements Record2<String, String>, IConstant {

    private static final long serialVersionUID = -224152793;

    /**
     * Setter for <code>indexBot.constant.id</code>. 唯一标识
     */
    @Override
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>indexBot.constant.id</code>. 唯一标识
     */
    @Override
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>indexBot.constant.content</code>. 内容
     */
    @Override
    public void setContent(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>indexBot.constant.content</code>. 内容
     */
    @Override
    public String getContent() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Constant.CONSTANT.ID;
    }

    @Override
    public Field<String> field2() {
        return Constant.CONSTANT.CONTENT;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getContent();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getContent();
    }

    @Override
    public ConstantRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public ConstantRecord value2(String value) {
        setContent(value);
        return this;
    }

    @Override
    public ConstantRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IConstant from) {
        setId(from.getId());
        setContent(from.getContent());
    }

    @Override
    public <E extends IConstant> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ConstantRecord
     */
    public ConstantRecord() {
        super(Constant.CONSTANT);
    }

    /**
     * Create a detached, initialised ConstantRecord
     */
    public ConstantRecord(String id, String content) {
        super(Constant.CONSTANT);

        set(0, id);
        set(1, content);
    }
}