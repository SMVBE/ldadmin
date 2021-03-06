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
public class AllowedPolicyRecord extends org.jooq.impl.UpdatableRecordImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.AllowedPolicyRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Boolean>, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.interfaces.IAllowedPolicy {

	private static final long serialVersionUID = -263944716;

	/**
	 * Setter for <code>allowed_policy.area_id</code>.
	 */
	public void setAreaId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>allowed_policy.area_id</code>.
	 */
	@Override
	public java.lang.Integer getAreaId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>allowed_policy.policy_id</code>.
	 */
	public void setPolicyId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>allowed_policy.policy_id</code>.
	 */
	@Override
	public java.lang.Integer getPolicyId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>allowed_policy.default_policy</code>.
	 */
	public void setDefaultPolicy(java.lang.Boolean value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>allowed_policy.default_policy</code>.
	 */
	@Override
	public java.lang.Boolean getDefaultPolicy() {
		return (java.lang.Boolean) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record2<java.lang.Integer, java.lang.Integer> key() {
		return (org.jooq.Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Boolean> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Boolean> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.AllowedPolicy.ALLOWED_POLICY.AREA_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.AllowedPolicy.ALLOWED_POLICY.POLICY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field3() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.AllowedPolicy.ALLOWED_POLICY.DEFAULT_POLICY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getAreaId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getPolicyId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value3() {
		return getDefaultPolicy();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AllowedPolicyRecord value1(java.lang.Integer value) {
		setAreaId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AllowedPolicyRecord value2(java.lang.Integer value) {
		setPolicyId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AllowedPolicyRecord value3(java.lang.Boolean value) {
		setDefaultPolicy(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AllowedPolicyRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Boolean value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AllowedPolicyRecord
	 */
	public AllowedPolicyRecord() {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.AllowedPolicy.ALLOWED_POLICY);
	}

	/**
	 * Create a detached, initialised AllowedPolicyRecord
	 */
	public AllowedPolicyRecord(java.lang.Integer areaId, java.lang.Integer policyId, java.lang.Boolean defaultPolicy) {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.AllowedPolicy.ALLOWED_POLICY);

		setValue(0, areaId);
		setValue(1, policyId);
		setValue(2, defaultPolicy);
	}
}
