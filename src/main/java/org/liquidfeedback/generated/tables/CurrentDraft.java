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
public class CurrentDraft extends org.jooq.impl.TableImpl<org.liquidfeedback.generated.tables.records.CurrentDraftRecord> {

	private static final long serialVersionUID = 2000666732;

	/**
	 * The singleton instance of <code>current_draft</code>
	 */
	public static final org.liquidfeedback.generated.tables.CurrentDraft CURRENT_DRAFT = new org.liquidfeedback.generated.tables.CurrentDraft();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.liquidfeedback.generated.tables.records.CurrentDraftRecord> getRecordType() {
		return org.liquidfeedback.generated.tables.records.CurrentDraftRecord.class;
	}

	/**
	 * The column <code>current_draft.initiative_id</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.CurrentDraftRecord, java.lang.Integer> INITIATIVE_ID = createField("initiative_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>current_draft.id</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.CurrentDraftRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>current_draft.created</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.CurrentDraftRecord, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>current_draft.author_id</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.CurrentDraftRecord, java.lang.Integer> AUTHOR_ID = createField("author_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>current_draft.formatting_engine</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.CurrentDraftRecord, java.lang.String> FORMATTING_ENGINE = createField("formatting_engine", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>current_draft.content</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.CurrentDraftRecord, java.lang.String> CONTENT = createField("content", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>current_draft.text_search_data</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.CurrentDraftRecord, java.lang.Object> TEXT_SEARCH_DATA = createField("text_search_data", org.jooq.impl.DefaultDataType.getDefaultDataType("tsvector"), this, "");

	/**
	 * Create a <code>current_draft</code> table reference
	 */
	public CurrentDraft() {
		this("current_draft", null);
	}

	/**
	 * Create an aliased <code>current_draft</code> table reference
	 */
	public CurrentDraft(java.lang.String alias) {
		this(alias, org.liquidfeedback.generated.tables.CurrentDraft.CURRENT_DRAFT);
	}

	private CurrentDraft(java.lang.String alias, org.jooq.Table<org.liquidfeedback.generated.tables.records.CurrentDraftRecord> aliased) {
		this(alias, aliased, null);
	}

	private CurrentDraft(java.lang.String alias, org.jooq.Table<org.liquidfeedback.generated.tables.records.CurrentDraftRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.liquidfeedback.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.liquidfeedback.generated.tables.CurrentDraft as(java.lang.String alias) {
		return new org.liquidfeedback.generated.tables.CurrentDraft(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.liquidfeedback.generated.tables.CurrentDraft rename(java.lang.String name) {
		return new org.liquidfeedback.generated.tables.CurrentDraft(name, null);
	}
}