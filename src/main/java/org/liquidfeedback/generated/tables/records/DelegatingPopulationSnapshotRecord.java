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
public class DelegatingPopulationSnapshotRecord extends org.jooq.impl.UpdatableRecordImpl<org.liquidfeedback.generated.tables.records.DelegatingPopulationSnapshotRecord> implements org.jooq.Record6<java.lang.Integer, org.liquidfeedback.generated.enums.SnapshotEvent, java.lang.Integer, java.lang.Integer, org.liquidfeedback.generated.enums.DelegationScope, java.lang.Integer[]>, org.liquidfeedback.generated.tables.interfaces.IDelegatingPopulationSnapshot {

	private static final long serialVersionUID = 776799708;

	/**
	 * Setter for <code>delegating_population_snapshot.issue_id</code>.
	 */
	public void setIssueId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>delegating_population_snapshot.issue_id</code>.
	 */
	@Override
	public java.lang.Integer getIssueId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>delegating_population_snapshot.event</code>.
	 */
	public void setEvent(org.liquidfeedback.generated.enums.SnapshotEvent value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>delegating_population_snapshot.event</code>.
	 */
	@Override
	public org.liquidfeedback.generated.enums.SnapshotEvent getEvent() {
		return (org.liquidfeedback.generated.enums.SnapshotEvent) getValue(1);
	}

	/**
	 * Setter for <code>delegating_population_snapshot.member_id</code>.
	 */
	public void setMemberId(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>delegating_population_snapshot.member_id</code>.
	 */
	@Override
	public java.lang.Integer getMemberId() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>delegating_population_snapshot.weight</code>.
	 */
	public void setWeight(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>delegating_population_snapshot.weight</code>.
	 */
	@Override
	public java.lang.Integer getWeight() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>delegating_population_snapshot.scope</code>.
	 */
	public void setScope(org.liquidfeedback.generated.enums.DelegationScope value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>delegating_population_snapshot.scope</code>.
	 */
	@Override
	public org.liquidfeedback.generated.enums.DelegationScope getScope() {
		return (org.liquidfeedback.generated.enums.DelegationScope) getValue(4);
	}

	/**
	 * Setter for <code>delegating_population_snapshot.delegate_member_ids</code>.
	 */
	public void setDelegateMemberIds(java.lang.Integer[] value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>delegating_population_snapshot.delegate_member_ids</code>.
	 */
	@Override
	public java.lang.Integer[] getDelegateMemberIds() {
		return (java.lang.Integer[]) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record3<java.lang.Integer, org.liquidfeedback.generated.enums.SnapshotEvent, java.lang.Integer> key() {
		return (org.jooq.Record3) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, org.liquidfeedback.generated.enums.SnapshotEvent, java.lang.Integer, java.lang.Integer, org.liquidfeedback.generated.enums.DelegationScope, java.lang.Integer[]> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, org.liquidfeedback.generated.enums.SnapshotEvent, java.lang.Integer, java.lang.Integer, org.liquidfeedback.generated.enums.DelegationScope, java.lang.Integer[]> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.liquidfeedback.generated.tables.DelegatingPopulationSnapshot.DELEGATING_POPULATION_SNAPSHOT.ISSUE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.liquidfeedback.generated.enums.SnapshotEvent> field2() {
		return org.liquidfeedback.generated.tables.DelegatingPopulationSnapshot.DELEGATING_POPULATION_SNAPSHOT.EVENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.liquidfeedback.generated.tables.DelegatingPopulationSnapshot.DELEGATING_POPULATION_SNAPSHOT.MEMBER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.liquidfeedback.generated.tables.DelegatingPopulationSnapshot.DELEGATING_POPULATION_SNAPSHOT.WEIGHT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.liquidfeedback.generated.enums.DelegationScope> field5() {
		return org.liquidfeedback.generated.tables.DelegatingPopulationSnapshot.DELEGATING_POPULATION_SNAPSHOT.SCOPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer[]> field6() {
		return org.liquidfeedback.generated.tables.DelegatingPopulationSnapshot.DELEGATING_POPULATION_SNAPSHOT.DELEGATE_MEMBER_IDS;
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
	public org.liquidfeedback.generated.enums.SnapshotEvent value2() {
		return getEvent();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getMemberId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getWeight();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.liquidfeedback.generated.enums.DelegationScope value5() {
		return getScope();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer[] value6() {
		return getDelegateMemberIds();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DelegatingPopulationSnapshotRecord value1(java.lang.Integer value) {
		setIssueId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DelegatingPopulationSnapshotRecord value2(org.liquidfeedback.generated.enums.SnapshotEvent value) {
		setEvent(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DelegatingPopulationSnapshotRecord value3(java.lang.Integer value) {
		setMemberId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DelegatingPopulationSnapshotRecord value4(java.lang.Integer value) {
		setWeight(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DelegatingPopulationSnapshotRecord value5(org.liquidfeedback.generated.enums.DelegationScope value) {
		setScope(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DelegatingPopulationSnapshotRecord value6(java.lang.Integer[] value) {
		setDelegateMemberIds(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DelegatingPopulationSnapshotRecord values(java.lang.Integer value1, org.liquidfeedback.generated.enums.SnapshotEvent value2, java.lang.Integer value3, java.lang.Integer value4, org.liquidfeedback.generated.enums.DelegationScope value5, java.lang.Integer[] value6) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached DelegatingPopulationSnapshotRecord
	 */
	public DelegatingPopulationSnapshotRecord() {
		super(org.liquidfeedback.generated.tables.DelegatingPopulationSnapshot.DELEGATING_POPULATION_SNAPSHOT);
	}

	/**
	 * Create a detached, initialised DelegatingPopulationSnapshotRecord
	 */
	public DelegatingPopulationSnapshotRecord(java.lang.Integer issueId, org.liquidfeedback.generated.enums.SnapshotEvent event, java.lang.Integer memberId, java.lang.Integer weight, org.liquidfeedback.generated.enums.DelegationScope scope, java.lang.Integer[] delegateMemberIds) {
		super(org.liquidfeedback.generated.tables.DelegatingPopulationSnapshot.DELEGATING_POPULATION_SNAPSHOT);

		setValue(0, issueId);
		setValue(1, event);
		setValue(2, memberId);
		setValue(3, weight);
		setValue(4, scope);
		setValue(5, delegateMemberIds);
	}
}