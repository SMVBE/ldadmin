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
public class RenderedMemberStatementRecord extends org.jooq.impl.UpdatableRecordImpl<org.liquidfeedback.generated.tables.records.RenderedMemberStatementRecord> implements org.jooq.Record3<java.lang.Long, java.lang.String, java.lang.String>, org.liquidfeedback.generated.tables.interfaces.IRenderedMemberStatement {

	private static final long serialVersionUID = -943314543;

	/**
	 * Setter for <code>rendered_member_statement.member_id</code>.
	 */
	public void setMemberId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>rendered_member_statement.member_id</code>.
	 */
	@Override
	public java.lang.Long getMemberId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>rendered_member_statement.format</code>.
	 */
	public void setFormat(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>rendered_member_statement.format</code>.
	 */
	@Override
	public java.lang.String getFormat() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>rendered_member_statement.content</code>.
	 */
	public void setContent(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>rendered_member_statement.content</code>.
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
		return org.liquidfeedback.generated.tables.RenderedMemberStatement.RENDERED_MEMBER_STATEMENT.MEMBER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.liquidfeedback.generated.tables.RenderedMemberStatement.RENDERED_MEMBER_STATEMENT.FORMAT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.liquidfeedback.generated.tables.RenderedMemberStatement.RENDERED_MEMBER_STATEMENT.CONTENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getMemberId();
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
	public RenderedMemberStatementRecord value1(java.lang.Long value) {
		setMemberId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RenderedMemberStatementRecord value2(java.lang.String value) {
		setFormat(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RenderedMemberStatementRecord value3(java.lang.String value) {
		setContent(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RenderedMemberStatementRecord values(java.lang.Long value1, java.lang.String value2, java.lang.String value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached RenderedMemberStatementRecord
	 */
	public RenderedMemberStatementRecord() {
		super(org.liquidfeedback.generated.tables.RenderedMemberStatement.RENDERED_MEMBER_STATEMENT);
	}

	/**
	 * Create a detached, initialised RenderedMemberStatementRecord
	 */
	public RenderedMemberStatementRecord(java.lang.Long memberId, java.lang.String format, java.lang.String content) {
		super(org.liquidfeedback.generated.tables.RenderedMemberStatement.RENDERED_MEMBER_STATEMENT);

		setValue(0, memberId);
		setValue(1, format);
		setValue(2, content);
	}
}
