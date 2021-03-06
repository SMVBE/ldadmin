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
public class RemainingHarmonicInitiativeWeightDummiesRecord extends org.jooq.impl.TableRecordImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.RemainingHarmonicInitiativeWeightDummiesRecord> implements org.jooq.Record5<java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Integer, java.lang.Integer>, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.interfaces.IRemainingHarmonicInitiativeWeightDummies {

	private static final long serialVersionUID = 442924277;

	/**
	 * Setter for <code>remaining_harmonic_initiative_weight_dummies.issue_id</code>.
	 */
	public void setIssueId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>remaining_harmonic_initiative_weight_dummies.issue_id</code>.
	 */
	@Override
	public java.lang.Integer getIssueId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>remaining_harmonic_initiative_weight_dummies.initiative_id</code>.
	 */
	public void setInitiativeId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>remaining_harmonic_initiative_weight_dummies.initiative_id</code>.
	 */
	@Override
	public java.lang.Integer getInitiativeId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>remaining_harmonic_initiative_weight_dummies.admitted</code>.
	 */
	public void setAdmitted(java.lang.Boolean value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>remaining_harmonic_initiative_weight_dummies.admitted</code>.
	 */
	@Override
	public java.lang.Boolean getAdmitted() {
		return (java.lang.Boolean) getValue(2);
	}

	/**
	 * Setter for <code>remaining_harmonic_initiative_weight_dummies.weight_num</code>.
	 */
	public void setWeightNum(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>remaining_harmonic_initiative_weight_dummies.weight_num</code>.
	 */
	@Override
	public java.lang.Integer getWeightNum() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>remaining_harmonic_initiative_weight_dummies.weight_den</code>.
	 */
	public void setWeightDen(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>remaining_harmonic_initiative_weight_dummies.weight_den</code>.
	 */
	@Override
	public java.lang.Integer getWeightDen() {
		return (java.lang.Integer) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.RemainingHarmonicInitiativeWeightDummies.REMAINING_HARMONIC_INITIATIVE_WEIGHT_DUMMIES.ISSUE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.RemainingHarmonicInitiativeWeightDummies.REMAINING_HARMONIC_INITIATIVE_WEIGHT_DUMMIES.INITIATIVE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field3() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.RemainingHarmonicInitiativeWeightDummies.REMAINING_HARMONIC_INITIATIVE_WEIGHT_DUMMIES.ADMITTED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.RemainingHarmonicInitiativeWeightDummies.REMAINING_HARMONIC_INITIATIVE_WEIGHT_DUMMIES.WEIGHT_NUM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.RemainingHarmonicInitiativeWeightDummies.REMAINING_HARMONIC_INITIATIVE_WEIGHT_DUMMIES.WEIGHT_DEN;
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
	public java.lang.Integer value2() {
		return getInitiativeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value3() {
		return getAdmitted();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getWeightNum();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getWeightDen();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RemainingHarmonicInitiativeWeightDummiesRecord value1(java.lang.Integer value) {
		setIssueId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RemainingHarmonicInitiativeWeightDummiesRecord value2(java.lang.Integer value) {
		setInitiativeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RemainingHarmonicInitiativeWeightDummiesRecord value3(java.lang.Boolean value) {
		setAdmitted(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RemainingHarmonicInitiativeWeightDummiesRecord value4(java.lang.Integer value) {
		setWeightNum(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RemainingHarmonicInitiativeWeightDummiesRecord value5(java.lang.Integer value) {
		setWeightDen(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RemainingHarmonicInitiativeWeightDummiesRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Boolean value3, java.lang.Integer value4, java.lang.Integer value5) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached RemainingHarmonicInitiativeWeightDummiesRecord
	 */
	public RemainingHarmonicInitiativeWeightDummiesRecord() {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.RemainingHarmonicInitiativeWeightDummies.REMAINING_HARMONIC_INITIATIVE_WEIGHT_DUMMIES);
	}

	/**
	 * Create a detached, initialised RemainingHarmonicInitiativeWeightDummiesRecord
	 */
	public RemainingHarmonicInitiativeWeightDummiesRecord(java.lang.Integer issueId, java.lang.Integer initiativeId, java.lang.Boolean admitted, java.lang.Integer weightNum, java.lang.Integer weightDen) {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.RemainingHarmonicInitiativeWeightDummies.REMAINING_HARMONIC_INITIATIVE_WEIGHT_DUMMIES);

		setValue(0, issueId);
		setValue(1, initiativeId);
		setValue(2, admitted);
		setValue(3, weightNum);
		setValue(4, weightDen);
	}
}
