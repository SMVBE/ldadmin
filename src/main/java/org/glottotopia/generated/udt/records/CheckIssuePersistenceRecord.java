/**
 * This class is generated by jOOQ
 */
package org.glottotopia.generated.udt.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CheckIssuePersistenceRecord extends org.jooq.impl.UDTRecordImpl<org.glottotopia.generated.udt.records.CheckIssuePersistenceRecord> implements org.jooq.Record6<org.glottotopia.generated.enums.IssueState, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean>, org.glottotopia.generated.udt.interfaces.ICheckIssuePersistence {

	private static final long serialVersionUID = 721420900;

	/**
	 * Setter for <code>check_issue_persistence.state</code>.
	 */
	public void setState(org.glottotopia.generated.enums.IssueState value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>check_issue_persistence.state</code>.
	 */
	@Override
	public org.glottotopia.generated.enums.IssueState getState() {
		return (org.glottotopia.generated.enums.IssueState) getValue(0);
	}

	/**
	 * Setter for <code>check_issue_persistence.phase_finished</code>.
	 */
	public void setPhaseFinished(java.lang.Boolean value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>check_issue_persistence.phase_finished</code>.
	 */
	@Override
	public java.lang.Boolean getPhaseFinished() {
		return (java.lang.Boolean) getValue(1);
	}

	/**
	 * Setter for <code>check_issue_persistence.issue_revoked</code>.
	 */
	public void setIssueRevoked(java.lang.Boolean value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>check_issue_persistence.issue_revoked</code>.
	 */
	@Override
	public java.lang.Boolean getIssueRevoked() {
		return (java.lang.Boolean) getValue(2);
	}

	/**
	 * Setter for <code>check_issue_persistence.snapshot_created</code>.
	 */
	public void setSnapshotCreated(java.lang.Boolean value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>check_issue_persistence.snapshot_created</code>.
	 */
	@Override
	public java.lang.Boolean getSnapshotCreated() {
		return (java.lang.Boolean) getValue(3);
	}

	/**
	 * Setter for <code>check_issue_persistence.harmonic_weights_set</code>.
	 */
	public void setHarmonicWeightsSet(java.lang.Boolean value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>check_issue_persistence.harmonic_weights_set</code>.
	 */
	@Override
	public java.lang.Boolean getHarmonicWeightsSet() {
		return (java.lang.Boolean) getValue(4);
	}

	/**
	 * Setter for <code>check_issue_persistence.closed_voting</code>.
	 */
	public void setClosedVoting(java.lang.Boolean value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>check_issue_persistence.closed_voting</code>.
	 */
	@Override
	public java.lang.Boolean getClosedVoting() {
		return (java.lang.Boolean) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<org.glottotopia.generated.enums.IssueState, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<org.glottotopia.generated.enums.IssueState, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.glottotopia.generated.enums.IssueState> field1() {
		return org.glottotopia.generated.udt.CheckIssuePersistence.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field2() {
		return org.glottotopia.generated.udt.CheckIssuePersistence.PHASE_FINISHED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field3() {
		return org.glottotopia.generated.udt.CheckIssuePersistence.ISSUE_REVOKED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field4() {
		return org.glottotopia.generated.udt.CheckIssuePersistence.SNAPSHOT_CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field5() {
		return org.glottotopia.generated.udt.CheckIssuePersistence.HARMONIC_WEIGHTS_SET;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field6() {
		return org.glottotopia.generated.udt.CheckIssuePersistence.CLOSED_VOTING;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.glottotopia.generated.enums.IssueState value1() {
		return getState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value2() {
		return getPhaseFinished();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value3() {
		return getIssueRevoked();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value4() {
		return getSnapshotCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value5() {
		return getHarmonicWeightsSet();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value6() {
		return getClosedVoting();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CheckIssuePersistenceRecord value1(org.glottotopia.generated.enums.IssueState value) {
		setState(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CheckIssuePersistenceRecord value2(java.lang.Boolean value) {
		setPhaseFinished(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CheckIssuePersistenceRecord value3(java.lang.Boolean value) {
		setIssueRevoked(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CheckIssuePersistenceRecord value4(java.lang.Boolean value) {
		setSnapshotCreated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CheckIssuePersistenceRecord value5(java.lang.Boolean value) {
		setHarmonicWeightsSet(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CheckIssuePersistenceRecord value6(java.lang.Boolean value) {
		setClosedVoting(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CheckIssuePersistenceRecord values(org.glottotopia.generated.enums.IssueState value1, java.lang.Boolean value2, java.lang.Boolean value3, java.lang.Boolean value4, java.lang.Boolean value5, java.lang.Boolean value6) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CheckIssuePersistenceRecord
	 */
	public CheckIssuePersistenceRecord() {
		super(org.glottotopia.generated.udt.CheckIssuePersistence.CHECK_ISSUE_PERSISTENCE);
	}

	/**
	 * Create a detached, initialised CheckIssuePersistenceRecord
	 */
	public CheckIssuePersistenceRecord(org.glottotopia.generated.enums.IssueState state, java.lang.Boolean phaseFinished, java.lang.Boolean issueRevoked, java.lang.Boolean snapshotCreated, java.lang.Boolean harmonicWeightsSet, java.lang.Boolean closedVoting) {
		super(org.glottotopia.generated.udt.CheckIssuePersistence.CHECK_ISSUE_PERSISTENCE);

		setValue(0, state);
		setValue(1, phaseFinished);
		setValue(2, issueRevoked);
		setValue(3, snapshotCreated);
		setValue(4, harmonicWeightsSet);
		setValue(5, closedVoting);
	}
}
