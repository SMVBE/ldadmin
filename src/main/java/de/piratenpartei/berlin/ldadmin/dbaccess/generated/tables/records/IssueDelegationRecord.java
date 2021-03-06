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
public class IssueDelegationRecord extends org.jooq.impl.TableRecordImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.IssueDelegationRecord> implements org.jooq.Record5<java.lang.Integer, java.lang.Long, java.lang.Integer, java.lang.Integer, de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationScope>, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.interfaces.IIssueDelegation {

	private static final long serialVersionUID = 279738573;

	/**
	 * Setter for <code>issue_delegation.issue_id</code>.
	 */
	public void setIssueId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>issue_delegation.issue_id</code>.
	 */
	@Override
	public java.lang.Integer getIssueId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>issue_delegation.id</code>.
	 */
	public void setId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>issue_delegation.id</code>.
	 */
	@Override
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>issue_delegation.truster_id</code>.
	 */
	public void setTrusterId(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>issue_delegation.truster_id</code>.
	 */
	@Override
	public java.lang.Integer getTrusterId() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>issue_delegation.trustee_id</code>.
	 */
	public void setTrusteeId(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>issue_delegation.trustee_id</code>.
	 */
	@Override
	public java.lang.Integer getTrusteeId() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>issue_delegation.scope</code>.
	 */
	public void setScope(de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationScope value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>issue_delegation.scope</code>.
	 */
	@Override
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationScope getScope() {
		return (de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationScope) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.Long, java.lang.Integer, java.lang.Integer, de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationScope> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.Long, java.lang.Integer, java.lang.Integer, de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationScope> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueDelegation.ISSUE_DELEGATION.ISSUE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueDelegation.ISSUE_DELEGATION.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueDelegation.ISSUE_DELEGATION.TRUSTER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueDelegation.ISSUE_DELEGATION.TRUSTEE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationScope> field5() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueDelegation.ISSUE_DELEGATION.SCOPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getIssueId();
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
	public java.lang.Integer value3() {
		return getTrusterId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getTrusteeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationScope value5() {
		return getScope();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueDelegationRecord value1(java.lang.Integer value) {
		setIssueId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueDelegationRecord value2(java.lang.Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueDelegationRecord value3(java.lang.Integer value) {
		setTrusterId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueDelegationRecord value4(java.lang.Integer value) {
		setTrusteeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueDelegationRecord value5(de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationScope value) {
		setScope(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueDelegationRecord values(java.lang.Integer value1, java.lang.Long value2, java.lang.Integer value3, java.lang.Integer value4, de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationScope value5) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached IssueDelegationRecord
	 */
	public IssueDelegationRecord() {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueDelegation.ISSUE_DELEGATION);
	}

	/**
	 * Create a detached, initialised IssueDelegationRecord
	 */
	public IssueDelegationRecord(java.lang.Integer issueId, java.lang.Long id, java.lang.Integer trusterId, java.lang.Integer trusteeId, de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationScope scope) {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueDelegation.ISSUE_DELEGATION);

		setValue(0, issueId);
		setValue(1, id);
		setValue(2, trusterId);
		setValue(3, trusteeId);
		setValue(4, scope);
	}
}
