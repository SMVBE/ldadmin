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
public class MembershipDao extends org.jooq.impl.DAOImpl<org.liquidfeedback.generated.tables.records.MembershipRecord, org.liquidfeedback.generated.tables.pojos.Membership, org.jooq.Record2<java.lang.Integer, java.lang.Integer>> {

	/**
	 * Create a new MembershipDao without any configuration
	 */
	public MembershipDao() {
		super(org.liquidfeedback.generated.tables.Membership.MEMBERSHIP, org.liquidfeedback.generated.tables.pojos.Membership.class);
	}

	/**
	 * Create a new MembershipDao with an attached configuration
	 */
	public MembershipDao(org.jooq.Configuration configuration) {
		super(org.liquidfeedback.generated.tables.Membership.MEMBERSHIP, org.liquidfeedback.generated.tables.pojos.Membership.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected org.jooq.Record2<java.lang.Integer, java.lang.Integer> getId(org.liquidfeedback.generated.tables.pojos.Membership object) {
		return compositeKeyRecord(object.getAreaId(), object.getMemberId());
	}

	/**
	 * Fetch records that have <code>area_id IN (values)</code>
	 */
	public java.util.List<org.liquidfeedback.generated.tables.pojos.Membership> fetchByAreaId(java.lang.Integer... values) {
		return fetch(org.liquidfeedback.generated.tables.Membership.MEMBERSHIP.AREA_ID, values);
	}

	/**
	 * Fetch records that have <code>member_id IN (values)</code>
	 */
	public java.util.List<org.liquidfeedback.generated.tables.pojos.Membership> fetchByMemberId(java.lang.Integer... values) {
		return fetch(org.liquidfeedback.generated.tables.Membership.MEMBERSHIP.MEMBER_ID, values);
	}
}