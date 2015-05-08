/**
 * This class is generated by jOOQ
 */
package org.liquidfeedback.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Draft extends org.jooq.impl.TableImpl<org.liquidfeedback.generated.tables.records.DraftRecord> {

	private static final long serialVersionUID = -965770623;

	/**
	 * The singleton instance of <code>draft</code>
	 */
	public static final org.liquidfeedback.generated.tables.Draft DRAFT = new org.liquidfeedback.generated.tables.Draft();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.liquidfeedback.generated.tables.records.DraftRecord> getRecordType() {
		return org.liquidfeedback.generated.tables.records.DraftRecord.class;
	}

	/**
	 * The column <code>draft.initiative_id</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.DraftRecord, java.lang.Integer> INITIATIVE_ID = createField("initiative_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>draft.id</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.DraftRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>draft.created</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.DraftRecord, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>draft.author_id</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.DraftRecord, java.lang.Integer> AUTHOR_ID = createField("author_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>draft.formatting_engine</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.DraftRecord, java.lang.String> FORMATTING_ENGINE = createField("formatting_engine", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>draft.content</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.DraftRecord, java.lang.String> CONTENT = createField("content", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>draft.text_search_data</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.DraftRecord, java.lang.Object> TEXT_SEARCH_DATA = createField("text_search_data", org.jooq.impl.DefaultDataType.getDefaultDataType("tsvector"), this, "");

	/**
	 * Create a <code>draft</code> table reference
	 */
	public Draft() {
		this("draft", null);
	}

	/**
	 * Create an aliased <code>draft</code> table reference
	 */
	public Draft(java.lang.String alias) {
		this(alias, org.liquidfeedback.generated.tables.Draft.DRAFT);
	}

	private Draft(java.lang.String alias, org.jooq.Table<org.liquidfeedback.generated.tables.records.DraftRecord> aliased) {
		this(alias, aliased, null);
	}

	private Draft(java.lang.String alias, org.jooq.Table<org.liquidfeedback.generated.tables.records.DraftRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.liquidfeedback.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.liquidfeedback.generated.tables.records.DraftRecord, java.lang.Long> getIdentity() {
		return org.liquidfeedback.generated.Keys.IDENTITY_DRAFT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.liquidfeedback.generated.tables.records.DraftRecord> getPrimaryKey() {
		return org.liquidfeedback.generated.Keys.DRAFT_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.liquidfeedback.generated.tables.records.DraftRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.liquidfeedback.generated.tables.records.DraftRecord>>asList(org.liquidfeedback.generated.Keys.DRAFT_INITIATIVE_ID_ID_KEY, org.liquidfeedback.generated.Keys.DRAFT_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.liquidfeedback.generated.tables.records.DraftRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.liquidfeedback.generated.tables.records.DraftRecord, ?>>asList(org.liquidfeedback.generated.Keys.DRAFT__DRAFT_INITIATIVE_ID_FKEY, org.liquidfeedback.generated.Keys.DRAFT__DRAFT_AUTHOR_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.liquidfeedback.generated.tables.Draft as(java.lang.String alias) {
		return new org.liquidfeedback.generated.tables.Draft(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.liquidfeedback.generated.tables.Draft rename(java.lang.String name) {
		return new org.liquidfeedback.generated.tables.Draft(name, null);
	}
}
