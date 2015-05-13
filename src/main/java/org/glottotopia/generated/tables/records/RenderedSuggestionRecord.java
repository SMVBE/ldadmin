/**
 * This class is generated by jOOQ
 */
package org.glottotopia.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RenderedSuggestionRecord extends org.jooq.impl.UpdatableRecordImpl<org.glottotopia.generated.tables.records.RenderedSuggestionRecord> implements org.jooq.Record3<java.lang.Long, java.lang.String, java.lang.String>, org.glottotopia.generated.tables.interfaces.IRenderedSuggestion {

	private static final long serialVersionUID = -1713399623;

	/**
	 * Setter for <code>rendered_suggestion.suggestion_id</code>.
	 */
	public void setSuggestionId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>rendered_suggestion.suggestion_id</code>.
	 */
	@Override
	public java.lang.Long getSuggestionId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>rendered_suggestion.format</code>.
	 */
	public void setFormat(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>rendered_suggestion.format</code>.
	 */
	@Override
	public java.lang.String getFormat() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>rendered_suggestion.content</code>.
	 */
	public void setContent(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>rendered_suggestion.content</code>.
	 */
	@Override
	public java.lang.String getContent() {
		return (java.lang.String) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record2<java.lang.Long, java.lang.String> key() {
		return (org.jooq.Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Long, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Long, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return org.glottotopia.generated.tables.RenderedSuggestion.RENDERED_SUGGESTION.SUGGESTION_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.glottotopia.generated.tables.RenderedSuggestion.RENDERED_SUGGESTION.FORMAT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.glottotopia.generated.tables.RenderedSuggestion.RENDERED_SUGGESTION.CONTENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getSuggestionId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getFormat();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getContent();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RenderedSuggestionRecord value1(java.lang.Long value) {
		setSuggestionId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RenderedSuggestionRecord value2(java.lang.String value) {
		setFormat(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RenderedSuggestionRecord value3(java.lang.String value) {
		setContent(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RenderedSuggestionRecord values(java.lang.Long value1, java.lang.String value2, java.lang.String value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached RenderedSuggestionRecord
	 */
	public RenderedSuggestionRecord() {
		super(org.glottotopia.generated.tables.RenderedSuggestion.RENDERED_SUGGESTION);
	}

	/**
	 * Create a detached, initialised RenderedSuggestionRecord
	 */
	public RenderedSuggestionRecord(java.lang.Long suggestionId, java.lang.String format, java.lang.String content) {
		super(org.glottotopia.generated.tables.RenderedSuggestion.RENDERED_SUGGESTION);

		setValue(0, suggestionId);
		setValue(1, format);
		setValue(2, content);
	}
}
