/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.Record;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.generated.Indexes;
import org.jooq.generated.Keys;
import org.jooq.generated.Sakila;
import org.jooq.generated.tables.Film.FilmPath;
import org.jooq.generated.tables.FilmActor.FilmActorPath;
import org.jooq.generated.tables.records.ActorRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Actor extends TableImpl<ActorRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sakila.actor</code>
     */
    public static final Actor ACTOR = new Actor();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ActorRecord> getRecordType() {
        return ActorRecord.class;
    }

    /**
     * The column <code>sakila.actor.actor_id</code>.
     */
    public final TableField<ActorRecord, UInteger> ACTOR_ID = createField(DSL.name("actor_id"), SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>sakila.actor.first_name</code>.
     */
    public final TableField<ActorRecord, String> FIRST_NAME = createField(DSL.name("first_name"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>sakila.actor.last_name</code>.
     */
    public final TableField<ActorRecord, String> LAST_NAME = createField(DSL.name("last_name"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>sakila.actor.last_update</code>.
     */
    public final TableField<ActorRecord, LocalDateTime> LAST_UPDATE = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field(DSL.raw("CURRENT_TIMESTAMP"), SQLDataType.LOCALDATETIME)), this, "");

    private Actor(Name alias, Table<ActorRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Actor(Name alias, Table<ActorRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>sakila.actor</code> table reference
     */
    public Actor(String alias) {
        this(DSL.name(alias), ACTOR);
    }

    /**
     * Create an aliased <code>sakila.actor</code> table reference
     */
    public Actor(Name alias) {
        this(alias, ACTOR);
    }

    /**
     * Create a <code>sakila.actor</code> table reference
     */
    public Actor() {
        this(DSL.name("actor"), null);
    }

    public <O extends Record> Actor(Table<O> path, ForeignKey<O, ActorRecord> childPath, InverseForeignKey<O, ActorRecord> parentPath) {
        super(path, childPath, parentPath, ACTOR);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class ActorPath extends Actor implements Path<ActorRecord> {

        private static final long serialVersionUID = 1L;
        public <O extends Record> ActorPath(Table<O> path, ForeignKey<O, ActorRecord> childPath, InverseForeignKey<O, ActorRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private ActorPath(Name alias, Table<ActorRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public ActorPath as(String alias) {
            return new ActorPath(DSL.name(alias), this);
        }

        @Override
        public ActorPath as(Name alias) {
            return new ActorPath(alias, this);
        }

        @Override
        public ActorPath as(Table<?> alias) {
            return new ActorPath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Sakila.SAKILA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.ACTOR_IDX_ACTOR_LAST_NAME);
    }

    @Override
    public Identity<ActorRecord, UInteger> getIdentity() {
        return (Identity<ActorRecord, UInteger>) super.getIdentity();
    }

    @Override
    public UniqueKey<ActorRecord> getPrimaryKey() {
        return Keys.KEY_ACTOR_PRIMARY;
    }

    private transient FilmActorPath _filmActor;

    /**
     * Get the implicit to-many join path to the <code>sakila.film_actor</code>
     * table
     */
    public FilmActorPath filmActor() {
        if (_filmActor == null)
            _filmActor = new FilmActorPath(this, null, Keys.FK_FILM_ACTOR_ACTOR.getInverseKey());

        return _filmActor;
    }

    /**
     * Get the implicit many-to-many join path to the <code>sakila.film</code>
     * table
     */
    public FilmPath film() {
        return filmActor().film();
    }

    @Override
    public Actor as(String alias) {
        return new Actor(DSL.name(alias), this);
    }

    @Override
    public Actor as(Name alias) {
        return new Actor(alias, this);
    }

    @Override
    public Actor as(Table<?> alias) {
        return new Actor(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Actor rename(String name) {
        return new Actor(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Actor rename(Name name) {
        return new Actor(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Actor rename(Table<?> name) {
        return new Actor(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Actor where(Condition condition) {
        return new Actor(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Actor where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Actor where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Actor where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Actor where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Actor where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Actor where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Actor where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Actor whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Actor whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
