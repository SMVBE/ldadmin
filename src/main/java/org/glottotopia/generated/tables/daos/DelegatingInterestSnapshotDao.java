/**
 * This class is generated by jOOQ
 */
package org.glottotopia.generated.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DelegatingInterestSnapshotDao extends org.jooq.impl.DAOImpl<org.glottotopia.generated.tables.records.DelegatingInterestSnapshotRecord, org.glottotopia.generated.tables.pojos.DelegatingInterestSnapshot, org.jooq.Record3<java.lang.Integer, org.glottotopia.generated.enums.SnapshotEvent, java.lang.Integer>> {

	/**
	 * Create a new DelegatingInterestSnapshotDao without any configuration
	 */
	public DelegatingInterestSnapshotDao() {
		super(org.glottotopia.generated.tables.DelegatingInterestSnapshot.DELEGATING_INTEREST_SNAPSHOT, org.glottotopia.generated.tables.pojos.DelegatingInterestSnapshot.class);
	}

	/**
	 * Create a new DelegatingInterestSnapshotDao with an attached configuration
	 */
	public DelegatingInterestSnapshotDao(org.jooq.Configuration configuration) {
		super(org.glottotopia.generated.tables.DelegatingInterestSnapshot.DELEGATING_INTEREST_SNAPSHOT, org.glottotopia.generated.tables.pojos.DelegatingInterestSnapshot.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected org.jooq.Record3<java.lang.Integer, org.glottotopia.generated.enums.SnapshotEvent, java.lang.Integer> getId(org.glottotopia.generated.tables.pojos.DelegatingInterestSnapshot object) {
		return compositeKeyRecord(object.getIssueId(), object.getEvent(), object.getMemberId());
	}

	/**
	 * Fetch records that have <code>issue_id IN (values)</code>
	 */
	public java.util.List<org.glottotopia.generated.tables.pojos.DelegatingInterestSnapshot> fetchByIssueId(java.lang.Integer... values) {
		return fetch(org.glottotopia.generated.tables.DelegatingInterestSnapshot.DELEGATING_INTEREST_SNAPSHOT.ISSUE_ID, values);
	}

	/**
	 * Fetch records that have <code>event IN (values)</code>
	 */
	public java.util.List<org.glottotopia.generated.tables.pojos.DelegatingInterestSnapshot> fetchByEvent(org.glottotopia.generated.enums.SnapshotEvent... values) {
		return fetch(org.glottotopia.generated.tables.DelegatingInterestSnapshot.DELEGATING_INTEREST_SNAPSHOT.EVENT, values);
	}

	/**
	 * Fetch records that have <code>member_id IN (values)</code>
	 */
	public java.util.List<org.glottotopia.generated.tables.pojos.DelegatingInterestSnapshot> fetchByMemberId(java.lang.Integer... values) {
		return fetch(org.glottotopia.generated.tables.DelegatingInterestSnapshot.DELEGATING_INTEREST_SNAPSHOT.MEMBER_ID, values);
	}

	/**
	 * Fetch records that have <code>weight IN (values)</code>
	 */
	public java.util.List<org.glottotopia.generated.tables.pojos.DelegatingInterestSnapshot> fetchByWeight(java.lang.Integer... values) {
		return fetch(org.glottotopia.generated.tables.DelegatingInterestSnapshot.DELEGATING_INTEREST_SNAPSHOT.WEIGHT, values);
	}

	/**
	 * Fetch records that have <code>scope IN (values)</code>
	 */
	public java.util.List<org.glottotopia.generated.tables.pojos.DelegatingInterestSnapshot> fetchByScope(org.glottotopia.generated.enums.DelegationScope... values) {
		return fetch(org.glottotopia.generated.tables.DelegatingInterestSnapshot.DELEGATING_INTEREST_SNAPSHOT.SCOPE, values);
	}

	/**
	 * Fetch records that have <code>delegate_member_ids IN (values)</code>
	 */
	public java.util.List<org.glottotopia.generated.tables.pojos.DelegatingInterestSnapshot> fetchByDelegateMemberIds(java.lang.Integer[]... values) {
		return fetch(org.glottotopia.generated.tables.DelegatingInterestSnapshot.DELEGATING_INTEREST_SNAPSHOT.DELEGATE_MEMBER_IDS, values);
	}
}
