/**
 * This class is generated by jOOQ
 */
package org.liquidfeedback.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CurrentDraftRecord extends org.jooq.impl.TableRecordImpl<org.liquidfeedback.generated.tables.records.CurrentDraftRecord> implements org.jooq.Record7<java.lang.Integer, java.lang.Long, java.sql.Timestamp, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Object>, org.liquidfeedback.generated.tables.interfaces.ICurrentDraft {

	private static final long serialVersionUID = 2109071675;

	/**
	 * Setter for <code>current_draft.initiative_id</code>.
	 */
	public void setInitiativeId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>current_draft.initiative_id</code>.
	 */
	@Override
	public java.lang.Integer getInitiativeId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>current_draft.id</code>.
	 */
	public void setId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>current_draft.id</code>.
	 */
	@Override
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>current_draft.created</code>.
	 */
	public void setCreated(java.sql.Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>current_draft.created</code>.
	 */
	@Override
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(2);
	}

	/**
	 * Setter for <code>current_draft.author_id</code>.
	 */
	public void setAuthorId(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>current_draft.author_id</code>.
	 */
	@Override
	public java.lang.Integer getAuthorId() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>current_draft.formatting_engine</code>.
	 */
	public void setFormattingEngine(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>current_draft.formatting_engine</code>.
	 */
	@Override
	public java.lang.String getFormattingEngine() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>current_draft.content</code>.
	 */
	public void setContent(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>current_draft.content</code>.
	 */
	@Override
	public java.lang.String getContent() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>current_draft.text_search_data</code>.
	 */
	public void setTextSearchData(java.lang.Object value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>current_draft.text_search_data</code>.
	 */
	@Override
	public java.lang.Object getTextSearchData() {
		return (java.lang.Object) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Integer, java.lang.Long, java.sql.Timestamp, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Object> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Integer, java.lang.Long, java.sql.Timestamp, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Object> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.liquidfeedback.generated.tables.CurrentDraft.CURRENT_DRAFT.INITIATIVE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return org.liquidfeedback.generated.tables.CurrentDraft.CURRENT_DRAFT.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field3() {
		return org.liquidfeedback.generated.tables.CurrentDraft.CURRENT_DRAFT.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.liquidfeedback.generated.tables.CurrentDraft.CURRENT_DRAFT.AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.liquidfeedback.generated.tables.CurrentDraft.CURRENT_DRAFT.FORMATTING_ENGINE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return org.liquidfeedback.generated.tables.CurrentDraft.CURRENT_DRAFT.CONTENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field7() {
		return org.liquidfeedback.generated.tables.CurrentDraft.CURRENT_DRAFT.TEXT_SEARCH_DATA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getInitiativeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value2() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value3() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getAuthorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getFormattingEngine();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getContent();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value7() {
		return getTextSearchData();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CurrentDraftRecord value1(java.lang.Integer value) {
		setInitiativeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CurrentDraftRecord value2(java.lang.Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CurrentDraftRecord value3(java.sql.Timestamp value) {
		setCreated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CurrentDraftRecord value4(java.lang.Integer value) {
		setAuthorId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CurrentDraftRecord value5(java.lang.String value) {
		setFormattingEngine(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CurrentDraftRecord value6(java.lang.String value) {
		setContent(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CurrentDraftRecord value7(java.lang.Object value) {
		setTextSearchData(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CurrentDraftRecord values(java.lang.Integer value1, java.lang.Long value2, java.sql.Timestamp value3, java.lang.Integer value4, java.lang.String value5, java.lang.String value6, java.lang.Object value7) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CurrentDraftRecord
	 */
	public CurrentDraftRecord() {
		super(org.liquidfeedback.generated.tables.CurrentDraft.CURRENT_DRAFT);
	}

	/**
	 * Create a detached, initialised CurrentDraftRecord
	 */
	public CurrentDraftRecord(java.lang.Integer initiativeId, java.lang.Long id, java.sql.Timestamp created, java.lang.Integer authorId, java.lang.String formattingEngine, java.lang.String content, java.lang.Object textSearchData) {
		super(org.liquidfeedback.generated.tables.CurrentDraft.CURRENT_DRAFT);

		setValue(0, initiativeId);
		setValue(1, id);
		setValue(2, created);
		setValue(3, authorId);
		setValue(4, formattingEngine);
		setValue(5, content);
		setValue(6, textSearchData);
	}
}
