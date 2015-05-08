/**
 * This class is generated by jOOQ
 */
package org.liquidfeedback.generated.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DirectPopulationSnapshotDao extends org.jooq.impl.DAOImpl<org.liquidfeedback.generated.tables.records.DirectPopulationSnapshotRecord, org.liquidfeedback.generated.tables.pojos.DirectPopulationSnapshot, org.jooq.Record3<java.lang.Integer, org.liquidfeedback.generated.enums.SnapshotEvent, java.lang.Integer>> {

	/**
	 * Create a new DirectPopulationSnapshotDao without any configuration
	 */
	public DirectPopulationSnapshotDao() {
		super(org.liquidfeedback.generated.tables.DirectPopulationSnapshot.DIRECT_POPULATION_SNAPSHOT, org.liquidfeedback.generated.tables.pojos.DirectPopulationSnapshot.class);
	}

	/**
	 * Create a new DirectPopulationSnapshotDao with an attached configuration
	 */
	public DirectPopulationSnapshotDao(org.jooq.Configuration configuration) {
		super(org.liquidfeedback.generated.tables.DirectPopulationSnapshot.DIRECT_POPULATION_SNAPSHOT, org.liquidfeedback.generated.tables.pojos.DirectPopulationSnapshot.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected org.jooq.Record3<java.lang.Integer, org.liquidfeedback.generated.enums.SnapshotEvent, java.lang.Integer> getId(org.liquidfeedback.generated.tables.pojos.DirectPopulationSnapshot object) {
		return compositeKeyRecord(object.getIssueId(), object.getEvent(), object.getMemberId());
	}

	/**
	 * Fetch records that have <code>issue_id IN (values)</code>
	 */
	public java.util.List<org.liquidfeedback.generated.tables.pojos.DirectPopulationSnapshot> fetchByIssueId(java.lang.Integer... values) {
		return fetch(org.liquidfeedback.generated.tables.DirectPopulationSnapshot.DIRECT_POPULATION_SNAPSHOT.ISSUE_ID, values);
	}

	/**
	 * Fetch records that have <code>event IN (values)</code>
	 */
	public java.util.List<org.liquidfeedback.generated.tables.pojos.DirectPopulationSnapshot> fetchByEvent(org.liquidfeedback.generated.enums.SnapshotEvent... values) {
		return fetch(org.liquidfeedback.generated.tables.DirectPopulationSnapshot.DIRECT_POPULATION_SNAPSHOT.EVENT, values);
	}

	/**
	 * Fetch records that have <code>member_id IN (values)</code>
	 */
	public java.util.List<org.liquidfeedback.generated.tables.pojos.DirectPopulationSnapshot> fetchByMemberId(java.lang.Integer... values) {
		return fetch(org.liquidfeedback.generated.tables.DirectPopulationSnapshot.DIRECT_POPULATION_SNAPSHOT.MEMBER_ID, values);
	}

	/**
	 * Fetch records that have <code>weight IN (values)</code>
	 */
	public java.util.List<org.liquidfeedback.generated.tables.pojos.DirectPopulationSnapshot> fetchByWeight(java.lang.Integer... values) {
		return fetch(org.liquidfeedback.generated.tables.DirectPopulationSnapshot.DIRECT_POPULATION_SNAPSHOT.WEIGHT, values);
	}
}
