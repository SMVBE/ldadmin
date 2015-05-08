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
public class MemberContingentLeftRecord extends org.jooq.impl.TableRecordImpl<org.liquidfeedback.generated.tables.records.MemberContingentLeftRecord> implements org.jooq.Record4<java.lang.Integer, java.lang.Boolean, java.lang.Long, java.lang.Long>, org.liquidfeedback.generated.tables.interfaces.IMemberContingentLeft {

	private static final long serialVersionUID = 2094950528;

	/**
	 * Setter for <code>member_contingent_left.member_id</code>.
	 */
	public void setMemberId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>member_contingent_left.member_id</code>.
	 */
	@Override
	public java.lang.Integer getMemberId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>member_contingent_left.polling</code>.
	 */
	public void setPolling(java.lang.Boolean value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>member_contingent_left.polling</code>.
	 */
	@Override
	public java.lang.Boolean getPolling() {
		return (java.lang.Boolean) getValue(1);
	}

	/**
	 * Setter for <code>member_contingent_left.text_entries_left</code>.
	 */
	public void setTextEntriesLeft(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>member_contingent_left.text_entries_left</code>.
	 */
	@Override
	public java.lang.Long getTextEntriesLeft() {
		return (java.lang.Long) getValue(2);
	}

	/**
	 * Setter for <code>member_contingent_left.initiatives_left</code>.
	 */
	public void setInitiativesLeft(java.lang.Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>member_contingent_left.initiatives_left</code>.
	 */
	@Override
	public java.lang.Long getInitiativesLeft() {
		return (java.lang.Long) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.Boolean, java.lang.Long, java.lang.Long> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.Boolean, java.lang.Long, java.lang.Long> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.liquidfeedback.generated.tables.MemberContingentLeft.MEMBER_CONTINGENT_LEFT.MEMBER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field2() {
		return org.liquidfeedback.generated.tables.MemberContingentLeft.MEMBER_CONTINGENT_LEFT.POLLING;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return org.liquidfeedback.generated.tables.MemberContingentLeft.MEMBER_CONTINGENT_LEFT.TEXT_ENTRIES_LEFT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field4() {
		return org.liquidfeedback.generated.tables.MemberContingentLeft.MEMBER_CONTINGENT_LEFT.INITIATIVES_LEFT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getMemberId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value2() {
		return getPolling();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value3() {
		return getTextEntriesLeft();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value4() {
		return getInitiativesLeft();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemberContingentLeftRecord value1(java.lang.Integer value) {
		setMemberId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemberContingentLeftRecord value2(java.lang.Boolean value) {
		setPolling(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemberContingentLeftRecord value3(java.lang.Long value) {
		setTextEntriesLeft(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemberContingentLeftRecord value4(java.lang.Long value) {
		setInitiativesLeft(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemberContingentLeftRecord values(java.lang.Integer value1, java.lang.Boolean value2, java.lang.Long value3, java.lang.Long value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached MemberContingentLeftRecord
	 */
	public MemberContingentLeftRecord() {
		super(org.liquidfeedback.generated.tables.MemberContingentLeft.MEMBER_CONTINGENT_LEFT);
	}

	/**
	 * Create a detached, initialised MemberContingentLeftRecord
	 */
	public MemberContingentLeftRecord(java.lang.Integer memberId, java.lang.Boolean polling, java.lang.Long textEntriesLeft, java.lang.Long initiativesLeft) {
		super(org.liquidfeedback.generated.tables.MemberContingentLeft.MEMBER_CONTINGENT_LEFT);

		setValue(0, memberId);
		setValue(1, polling);
		setValue(2, textEntriesLeft);
		setValue(3, initiativesLeft);
	}
}
