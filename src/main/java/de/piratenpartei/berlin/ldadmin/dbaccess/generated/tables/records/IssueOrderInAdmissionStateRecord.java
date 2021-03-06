/**
 * This class is generated by jOOQ
 */
package de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IssueOrderInAdmissionStateRecord extends org.jooq.impl.UpdatableRecordImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.IssueOrderInAdmissionStateRecord> implements org.jooq.Record3<java.lang.Long, java.lang.Integer, java.lang.Integer>, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.interfaces.IIssueOrderInAdmissionState {

	private static final long serialVersionUID = -1220841538;

	/**
	 * Setter for <code>issue_order_in_admission_state.id</code>.
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>issue_order_in_admission_state.id</code>.
	 */
	@Override
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>issue_order_in_admission_state.order_in_area</code>.
	 */
	public void setOrderInArea(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>issue_order_in_admission_state.order_in_area</code>.
	 */
	@Override
	public java.lang.Integer getOrderInArea() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>issue_order_in_admission_state.order_in_unit</code>.
	 */
	public void setOrderInUnit(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>issue_order_in_admission_state.order_in_unit</code>.
	 */
	@Override
	public java.lang.Integer getOrderInUnit() {
		return (java.lang.Integer) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Long, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Long, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueOrderInAdmissionState.ISSUE_ORDER_IN_ADMISSION_STATE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueOrderInAdmissionState.ISSUE_ORDER_IN_ADMISSION_STATE.ORDER_IN_AREA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueOrderInAdmissionState.ISSUE_ORDER_IN_ADMISSION_STATE.ORDER_IN_UNIT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getOrderInArea();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getOrderInUnit();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueOrderInAdmissionStateRecord value1(java.lang.Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueOrderInAdmissionStateRecord value2(java.lang.Integer value) {
		setOrderInArea(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueOrderInAdmissionStateRecord value3(java.lang.Integer value) {
		setOrderInUnit(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueOrderInAdmissionStateRecord values(java.lang.Long value1, java.lang.Integer value2, java.lang.Integer value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached IssueOrderInAdmissionStateRecord
	 */
	public IssueOrderInAdmissionStateRecord() {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueOrderInAdmissionState.ISSUE_ORDER_IN_ADMISSION_STATE);
	}

	/**
	 * Create a detached, initialised IssueOrderInAdmissionStateRecord
	 */
	public IssueOrderInAdmissionStateRecord(java.lang.Long id, java.lang.Integer orderInArea, java.lang.Integer orderInUnit) {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueOrderInAdmissionState.ISSUE_ORDER_IN_ADMISSION_STATE);

		setValue(0, id);
		setValue(1, orderInArea);
		setValue(2, orderInUnit);
	}
}
