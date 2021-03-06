/**
 * This class is generated by jOOQ
 */
package de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DirectSupporterSnapshotDao extends org.jooq.impl.DAOImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DirectSupporterSnapshotRecord, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.DirectSupporterSnapshot, org.jooq.Record3<java.lang.Integer, de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.SnapshotEvent, java.lang.Integer>> {

	/**
	 * Create a new DirectSupporterSnapshotDao without any configuration
	 */
	public DirectSupporterSnapshotDao() {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.DirectSupporterSnapshot.DIRECT_SUPPORTER_SNAPSHOT, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.DirectSupporterSnapshot.class);
	}

	/**
	 * Create a new DirectSupporterSnapshotDao with an attached configuration
	 */
	public DirectSupporterSnapshotDao(org.jooq.Configuration configuration) {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.DirectSupporterSnapshot.DIRECT_SUPPORTER_SNAPSHOT, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.DirectSupporterSnapshot.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected org.jooq.Record3<java.lang.Integer, de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.SnapshotEvent, java.lang.Integer> getId(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.DirectSupporterSnapshot object) {
		return compositeKeyRecord(object.getInitiativeId(), object.getEvent(), object.getMemberId());
	}

	/**
	 * Fetch records that have <code>issue_id IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.DirectSupporterSnapshot> fetchByIssueId(java.lang.Integer... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.DirectSupporterSnapshot.DIRECT_SUPPORTER_SNAPSHOT.ISSUE_ID, values);
	}

	/**
	 * Fetch records that have <code>initiative_id IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.DirectSupporterSnapshot> fetchByInitiativeId(java.lang.Integer... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.DirectSupporterSnapshot.DIRECT_SUPPORTER_SNAPSHOT.INITIATIVE_ID, values);
	}

	/**
	 * Fetch records that have <code>event IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.DirectSupporterSnapshot> fetchByEvent(de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.SnapshotEvent... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.DirectSupporterSnapshot.DIRECT_SUPPORTER_SNAPSHOT.EVENT, values);
	}

	/**
	 * Fetch records that have <code>member_id IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.DirectSupporterSnapshot> fetchByMemberId(java.lang.Integer... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.DirectSupporterSnapshot.DIRECT_SUPPORTER_SNAPSHOT.MEMBER_ID, values);
	}

	/**
	 * Fetch records that have <code>draft_id IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.DirectSupporterSnapshot> fetchByDraftId(java.lang.Long... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.DirectSupporterSnapshot.DIRECT_SUPPORTER_SNAPSHOT.DRAFT_ID, values);
	}

	/**
	 * Fetch records that have <code>informed IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.DirectSupporterSnapshot> fetchByInformed(java.lang.Boolean... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.DirectSupporterSnapshot.DIRECT_SUPPORTER_SNAPSHOT.INFORMED, values);
	}

	/**
	 * Fetch records that have <code>satisfied IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.DirectSupporterSnapshot> fetchBySatisfied(java.lang.Boolean... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.DirectSupporterSnapshot.DIRECT_SUPPORTER_SNAPSHOT.SATISFIED, values);
	}
}
