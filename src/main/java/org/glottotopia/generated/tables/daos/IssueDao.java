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
public class IssueDao extends org.jooq.impl.DAOImpl<org.glottotopia.generated.tables.records.IssueRecord, org.glottotopia.generated.tables.pojos.Issue, java.lang.Integer> {

	/**
	 * Create a new IssueDao without any configuration
	 */
	public IssueDao() {
		super(org.glottotopia.generated.tables.Issue.ISSUE, org.glottotopia.generated.tables.pojos.Issue.class);
	}

	/**
	 * Create a new IssueDao with an attached configuration
	 */
	public IssueDao(org.jooq.Configuration configuration) {
		super(org.glottotopia.generated.tables.Issue.ISSUE, org.glottotopia.generated.tables.pojos.Issue.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(org.glottotopia.generated.tables.pojos.Issue object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.glottotopia.generated.tables.pojos.Issue> fetchById(java.lang.Integer... values) {
		return fetch(org.glottotopia.generated.tables.Issue.ISSUE.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.glottotopia.generated.tables.pojos.Issue fetchOneById(java.lang.Integer value) {
		return fetchOne(org.glottotopia.generated.tables.Issue.ISSUE.ID, value);
	}

	/**
	 * Fetch records that have <code>area_id IN (values)</code>
	 */
	public java.util.List<org.glottotopia.generated.tables.pojos.Issue> fetchByAreaId(java.lang.Integer... values) {
		return fetch(org.glottotopia.generated.tables.Issue.ISSUE.AREA_ID, values);
	}

	/**
	 * Fetch records that have <code>policy_id IN (values)</code>
	 */
	public java.util.List<org.glottotopia.generated.tables.pojos.Issue> fetchByPolicyId(java.lang.Integer... values) {
		return fetch(org.glottotopia.generated.tables.Issue.ISSUE.POLICY_ID, values);
	}

	/**
	 * Fetch records that have <code>admin_notice IN (values)</code>
	 */
	public java.util.List<org.glottotopia.generated.tables.pojos.Issue> fetchByAdminNotice(java.lang.String... values) {
		return fetch(org.glottotopia.generated.tables.Issue.ISSUE.ADMIN_NOTICE, values);
	}

	/**
	 * Fetch records that have <code>state IN (values)</code>
	 */
	public java.util.List<org.glottotopia.generated.tables.pojos.Issue> fetchByState(org.glottotopia.generated.enums.IssueState... values) {
		return fetch(org.glottotopia.generated.tables.Issue.ISSUE.STATE, values);
	}

	/**
	 * Fetch records that have <code>phase_finished IN (values)</code>
	 */
	public java.util.List<org.glottotopia.generated.tables.pojos.Issue> fetchByPhaseFinished(java.sql.Timestamp... values) {
		return fetch(org.glottotopia.generated.tables.Issue.ISSUE.PHASE_FINISHED, values);
	}

	/**
	 * Fetch records that have <code>created IN (values)</code>
	 */
	public java.util.List<org.glottotopia.generated.tables.pojos.Issue> fetchByCreated(java.sql.Timestamp... values) {
		return fetch(org.glottotopia.generated.tables.Issue.ISSUE.CREATED, values);
	}

	/**
	 * Fetch records that have <code>accepted IN (values)</code>
	 */
	public java.util.List<org.glottotopia.generated.tables.pojos.Issue> fetchByAccepted(java.sql.Timestamp... values) {
		return fetch(org.glottotopia.generated.tables.Issue.ISSUE.ACCEPTED, values);
	}

	/**
	 * Fetch records that have <code>half_frozen IN (values)</code>
	 */
	public java.util.List<org.glottotopia.generated.tables.pojos.Issue> fetchByHalfFrozen(java.sql.Timestamp... values) {
		return fetch(org.glottotopia.generated.tables.Issue.ISSUE.HALF_FROZEN, values);
	}

	/**
	 * Fetch records that have <code>fully_frozen IN (values)</code>
	 */
	public java.util.List<org.glottotopia.generated.tables.pojos.Issue> fetchByFullyFrozen(java.sql.Timestamp... values) {
		return fetch(org.glottotopia.generated.tables.Issue.ISSUE.FULLY_FROZEN, values);
	}

	/**
	 * Fetch records that have <code>closed IN (values)</code>
	 */
	public java.util.List<org.glottotopia.generated.tables.pojos.Issue> fetchByClosed(java.sql.Timestamp... values) {
		return fetch(org.glottotopia.generated.tables.Issue.ISSUE.CLOSED, values);
	}

	/**
	 * Fetch records that have <code>cleaned IN (values)</code>
	 */
	public java.util.List<org.glottotopia.generated.tables.pojos.Issue> fetchByCleaned(java.sql.Timestamp... values) {
		return fetch(org.glottotopia.generated.tables.Issue.ISSUE.CLEANED, values);
	}

	/**
	 * Fetch records that have <code>admission_time IN (values)</code>
	 */
	public java.util.List<org.glottotopia.generated.tables.pojos.Issue> fetchByAdmissionTime(java.lang.Object... values) {
		return fetch(org.glottotopia.generated.tables.Issue.ISSUE.ADMISSION_TIME, values);
	}

	/**
	 * Fetch records that have <code>discussion_time IN (values)</code>
	 */
	public java.util.List<org.glottotopia.generated.tables.pojos.Issue> fetchByDiscussionTime(java.lang.Object... values) {
		return fetch(org.glottotopia.generated.tables.Issue.ISSUE.DISCUSSION_TIME, values);
	}

	/**
	 * Fetch records that have <code>verification_time IN (values)</code>
	 */
	public java.util.List<org.glottotopia.generated.tables.pojos.Issue> fetchByVerificationTime(java.lang.Object... values) {
		return fetch(org.glottotopia.generated.tables.Issue.ISSUE.VERIFICATION_TIME, values);
	}

	/**
	 * Fetch records that have <code>voting_time IN (values)</code>
	 */
	public java.util.List<org.glottotopia.generated.tables.pojos.Issue> fetchByVotingTime(java.lang.Object... values) {
		return fetch(org.glottotopia.generated.tables.Issue.ISSUE.VOTING_TIME, values);
	}

	/**
	 * Fetch records that have <code>snapshot IN (values)</code>
	 */
	public java.util.List<org.glottotopia.generated.tables.pojos.Issue> fetchBySnapshot(java.sql.Timestamp... values) {
		return fetch(org.glottotopia.generated.tables.Issue.ISSUE.SNAPSHOT, values);
	}

	/**
	 * Fetch records that have <code>latest_snapshot_event IN (values)</code>
	 */
	public java.util.List<org.glottotopia.generated.tables.pojos.Issue> fetchByLatestSnapshotEvent(org.glottotopia.generated.enums.SnapshotEvent... values) {
		return fetch(org.glottotopia.generated.tables.Issue.ISSUE.LATEST_SNAPSHOT_EVENT, values);
	}

	/**
	 * Fetch records that have <code>population IN (values)</code>
	 */
	public java.util.List<org.glottotopia.generated.tables.pojos.Issue> fetchByPopulation(java.lang.Integer... values) {
		return fetch(org.glottotopia.generated.tables.Issue.ISSUE.POPULATION, values);
	}

	/**
	 * Fetch records that have <code>voter_count IN (values)</code>
	 */
	public java.util.List<org.glottotopia.generated.tables.pojos.Issue> fetchByVoterCount(java.lang.Integer... values) {
		return fetch(org.glottotopia.generated.tables.Issue.ISSUE.VOTER_COUNT, values);
	}

	/**
	 * Fetch records that have <code>status_quo_schulze_rank IN (values)</code>
	 */
	public java.util.List<org.glottotopia.generated.tables.pojos.Issue> fetchByStatusQuoSchulzeRank(java.lang.Integer... values) {
		return fetch(org.glottotopia.generated.tables.Issue.ISSUE.STATUS_QUO_SCHULZE_RANK, values);
	}
}
