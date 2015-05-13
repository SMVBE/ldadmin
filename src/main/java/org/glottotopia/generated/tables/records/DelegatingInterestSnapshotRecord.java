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
public class DelegatingInterestSnapshotRecord extends org.jooq.impl.UpdatableRecordImpl<org.glottotopia.generated.tables.records.DelegatingInterestSnapshotRecord> implements org.jooq.Record6<java.lang.Integer, org.glottotopia.generated.enums.SnapshotEvent, java.lang.Integer, java.lang.Integer, org.glottotopia.generated.enums.DelegationScope, java.lang.Integer[]>, org.glottotopia.generated.tables.interfaces.IDelegatingInterestSnapshot {

	private static final long serialVersionUID = -1449137306;

	/**
	 * Setter for <code>delegating_interest_snapshot.issue_id</code>.
	 */
	public void setIssueId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>delegating_interest_snapshot.issue_id</code>.
	 */
	@Override
	public java.lang.Integer getIssueId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>delegating_interest_snapshot.event</code>.
	 */
	public void setEvent(org.glottotopia.generated.enums.SnapshotEvent value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>delegating_interest_snapshot.event</code>.
	 */
	@Override
	public org.glottotopia.generated.enums.SnapshotEvent getEvent() {
		return (org.glottotopia.generated.enums.SnapshotEvent) getValue(1);
	}

	/**
	 * Setter for <code>delegating_interest_snapshot.member_id</code>.
	 */
	public void setMemberId(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>delegating_interest_snapshot.member_id</code>.
	 */
	@Override
	public java.lang.Integer getMemberId() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>delegating_interest_snapshot.weight</code>.
	 */
	public void setWeight(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>delegating_interest_snapshot.weight</code>.
	 */
	@Override
	public java.lang.Integer getWeight() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>delegating_interest_snapshot.scope</code>.
	 */
	public void setScope(org.glottotopia.generated.enums.DelegationScope value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>delegating_interest_snapshot.scope</code>.
	 */
	@Override
	public org.glottotopia.generated.enums.DelegationScope getScope() {
		return (org.glottotopia.generated.enums.DelegationScope) getValue(4);
	}

	/**
	 * Setter for <code>delegating_interest_snapshot.delegate_member_ids</code>.
	 */
	public void setDelegateMemberIds(java.lang.Integer[] value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>delegating_interest_snapshot.delegate_member_ids</code>.
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
	public org.jooq.Record3<java.lang.Integer, org.glottotopia.generated.enums.SnapshotEvent, java.lang.Integer> key() {
		return (org.jooq.Record3) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, org.glottotopia.generated.enums.SnapshotEvent, java.lang.Integer, java.lang.Integer, org.glottotopia.generated.enums.DelegationScope, java.lang.Integer[]> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, org.glottotopia.generated.enums.SnapshotEvent, java.lang.Integer, java.lang.Integer, org.glottotopia.generated.enums.DelegationScope, java.lang.Integer[]> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.glottotopia.generated.tables.DelegatingInterestSnapshot.DELEGATING_INTEREST_SNAPSHOT.ISSUE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.glottotopia.generated.enums.SnapshotEvent> field2() {
		return org.glottotopia.generated.tables.DelegatingInterestSnapshot.DELEGATING_INTEREST_SNAPSHOT.EVENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.glottotopia.generated.tables.DelegatingInterestSnapshot.DELEGATING_INTEREST_SNAPSHOT.MEMBER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.glottotopia.generated.tables.DelegatingInterestSnapshot.DELEGATING_INTEREST_SNAPSHOT.WEIGHT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.glottotopia.generated.enums.DelegationScope> field5() {
		return org.glottotopia.generated.tables.DelegatingInterestSnapshot.DELEGATING_INTEREST_SNAPSHOT.SCOPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer[]> field6() {
		return org.glottotopia.generated.tables.DelegatingInterestSnapshot.DELEGATING_INTEREST_SNAPSHOT.DELEGATE_MEMBER_IDS;
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
	public org.glottotopia.generated.enums.SnapshotEvent value2() {
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
	public org.glottotopia.generated.enums.DelegationScope value5() {
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
	public DelegatingInterestSnapshotRecord value1(java.lang.Integer value) {
		setIssueId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DelegatingInterestSnapshotRecord value2(org.glottotopia.generated.enums.SnapshotEvent value) {
		setEvent(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DelegatingInterestSnapshotRecord value3(java.lang.Integer value) {
		setMemberId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DelegatingInterestSnapshotRecord value4(java.lang.Integer value) {
		setWeight(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DelegatingInterestSnapshotRecord value5(org.glottotopia.generated.enums.DelegationScope value) {
		setScope(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DelegatingInterestSnapshotRecord value6(java.lang.Integer[] value) {
		setDelegateMemberIds(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DelegatingInterestSnapshotRecord values(java.lang.Integer value1, org.glottotopia.generated.enums.SnapshotEvent value2, java.lang.Integer value3, java.lang.Integer value4, org.glottotopia.generated.enums.DelegationScope value5, java.lang.Integer[] value6) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached DelegatingInterestSnapshotRecord
	 */
	public DelegatingInterestSnapshotRecord() {
		super(org.glottotopia.generated.tables.DelegatingInterestSnapshot.DELEGATING_INTEREST_SNAPSHOT);
	}

	/**
	 * Create a detached, initialised DelegatingInterestSnapshotRecord
	 */
	public DelegatingInterestSnapshotRecord(java.lang.Integer issueId, org.glottotopia.generated.enums.SnapshotEvent event, java.lang.Integer memberId, java.lang.Integer weight, org.glottotopia.generated.enums.DelegationScope scope, java.lang.Integer[] delegateMemberIds) {
		super(org.glottotopia.generated.tables.DelegatingInterestSnapshot.DELEGATING_INTEREST_SNAPSHOT);

		setValue(0, issueId);
		setValue(1, event);
		setValue(2, memberId);
		setValue(3, weight);
		setValue(4, scope);
		setValue(5, delegateMemberIds);
	}
}
