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
public class AllowedPolicyDao extends org.jooq.impl.DAOImpl<org.liquidfeedback.generated.tables.records.AllowedPolicyRecord, org.liquidfeedback.generated.tables.pojos.AllowedPolicy, org.jooq.Record2<java.lang.Integer, java.lang.Integer>> {

	/**
	 * Create a new AllowedPolicyDao without any configuration
	 */
	public AllowedPolicyDao() {
		super(org.liquidfeedback.generated.tables.AllowedPolicy.ALLOWED_POLICY, org.liquidfeedback.generated.tables.pojos.AllowedPolicy.class);
	}

	/**
	 * Create a new AllowedPolicyDao with an attached configuration
	 */
	public AllowedPolicyDao(org.jooq.Configuration configuration) {
		super(org.liquidfeedback.generated.tables.AllowedPolicy.ALLOWED_POLICY, org.liquidfeedback.generated.tables.pojos.AllowedPolicy.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected org.jooq.Record2<java.lang.Integer, java.lang.Integer> getId(org.liquidfeedback.generated.tables.pojos.AllowedPolicy object) {
		return compositeKeyRecord(object.getAreaId(), object.getPolicyId());
	}

	/**
	 * Fetch records that have <code>area_id IN (values)</code>
	 */
	public java.util.List<org.liquidfeedback.generated.tables.pojos.AllowedPolicy> fetchByAreaId(java.lang.Integer... values) {
		return fetch(org.liquidfeedback.generated.tables.AllowedPolicy.ALLOWED_POLICY.AREA_ID, values);
	}

	/**
	 * Fetch records that have <code>policy_id IN (values)</code>
	 */
	public java.util.List<org.liquidfeedback.generated.tables.pojos.AllowedPolicy> fetchByPolicyId(java.lang.Integer... values) {
		return fetch(org.liquidfeedback.generated.tables.AllowedPolicy.ALLOWED_POLICY.POLICY_ID, values);
	}

	/**
	 * Fetch records that have <code>default_policy IN (values)</code>
	 */
	public java.util.List<org.liquidfeedback.generated.tables.pojos.AllowedPolicy> fetchByDefaultPolicy(java.lang.Boolean... values) {
		return fetch(org.liquidfeedback.generated.tables.AllowedPolicy.ALLOWED_POLICY.DEFAULT_POLICY, values);
	}
}
