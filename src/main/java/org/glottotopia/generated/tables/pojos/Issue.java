/**
 * This class is generated by jOOQ
 */
package org.glottotopia.generated.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Issue implements org.glottotopia.generated.tables.interfaces.IIssue {

	private static final long serialVersionUID = 2070679201;

	private final java.lang.Integer                                id;
	private final java.lang.Integer                                areaId;
	private final java.lang.Integer                                policyId;
	private final java.lang.String                                 adminNotice;
	private final org.glottotopia.generated.enums.IssueState    state;
	private final java.sql.Timestamp                               phaseFinished;
	private final java.sql.Timestamp                               created;
	private final java.sql.Timestamp                               accepted;
	private final java.sql.Timestamp                               halfFrozen;
	private final java.sql.Timestamp                               fullyFrozen;
	private final java.sql.Timestamp                               closed;
	private final java.sql.Timestamp                               cleaned;
	private final java.lang.Object                                 admissionTime;
	private final java.lang.Object                                 discussionTime;
	private final java.lang.Object                                 verificationTime;
	private final java.lang.Object                                 votingTime;
	private final java.sql.Timestamp                               snapshot;
	private final org.glottotopia.generated.enums.SnapshotEvent latestSnapshotEvent;
	private final java.lang.Integer                                population;
	private final java.lang.Integer                                voterCount;
	private final java.lang.Integer                                statusQuoSchulzeRank;

	public Issue(
		java.lang.Integer                                id,
		java.lang.Integer                                areaId,
		java.lang.Integer                                policyId,
		java.lang.String                                 adminNotice,
		org.glottotopia.generated.enums.IssueState    state,
		java.sql.Timestamp                               phaseFinished,
		java.sql.Timestamp                               created,
		java.sql.Timestamp                               accepted,
		java.sql.Timestamp                               halfFrozen,
		java.sql.Timestamp                               fullyFrozen,
		java.sql.Timestamp                               closed,
		java.sql.Timestamp                               cleaned,
		java.lang.Object                                 admissionTime,
		java.lang.Object                                 discussionTime,
		java.lang.Object                                 verificationTime,
		java.lang.Object                                 votingTime,
		java.sql.Timestamp                               snapshot,
		org.glottotopia.generated.enums.SnapshotEvent latestSnapshotEvent,
		java.lang.Integer                                population,
		java.lang.Integer                                voterCount,
		java.lang.Integer                                statusQuoSchulzeRank
	) {
		this.id = id;
		this.areaId = areaId;
		this.policyId = policyId;
		this.adminNotice = adminNotice;
		this.state = state;
		this.phaseFinished = phaseFinished;
		this.created = created;
		this.accepted = accepted;
		this.halfFrozen = halfFrozen;
		this.fullyFrozen = fullyFrozen;
		this.closed = closed;
		this.cleaned = cleaned;
		this.admissionTime = admissionTime;
		this.discussionTime = discussionTime;
		this.verificationTime = verificationTime;
		this.votingTime = votingTime;
		this.snapshot = snapshot;
		this.latestSnapshotEvent = latestSnapshotEvent;
		this.population = population;
		this.voterCount = voterCount;
		this.statusQuoSchulzeRank = statusQuoSchulzeRank;
	}

	@Override
	public java.lang.Integer getId() {
		return this.id;
	}

	@Override
	public java.lang.Integer getAreaId() {
		return this.areaId;
	}

	@Override
	public java.lang.Integer getPolicyId() {
		return this.policyId;
	}

	@Override
	public java.lang.String getAdminNotice() {
		return this.adminNotice;
	}

	@Override
	public org.glottotopia.generated.enums.IssueState getState() {
		return this.state;
	}

	@Override
	public java.sql.Timestamp getPhaseFinished() {
		return this.phaseFinished;
	}

	@Override
	public java.sql.Timestamp getCreated() {
		return this.created;
	}

	@Override
	public java.sql.Timestamp getAccepted() {
		return this.accepted;
	}

	@Override
	public java.sql.Timestamp getHalfFrozen() {
		return this.halfFrozen;
	}

	@Override
	public java.sql.Timestamp getFullyFrozen() {
		return this.fullyFrozen;
	}

	@Override
	public java.sql.Timestamp getClosed() {
		return this.closed;
	}

	@Override
	public java.sql.Timestamp getCleaned() {
		return this.cleaned;
	}

	@Override
	public java.lang.Object getAdmissionTime() {
		return this.admissionTime;
	}

	@Override
	public java.lang.Object getDiscussionTime() {
		return this.discussionTime;
	}

	@Override
	public java.lang.Object getVerificationTime() {
		return this.verificationTime;
	}

	@Override
	public java.lang.Object getVotingTime() {
		return this.votingTime;
	}

	@Override
	public java.sql.Timestamp getSnapshot() {
		return this.snapshot;
	}

	@Override
	public org.glottotopia.generated.enums.SnapshotEvent getLatestSnapshotEvent() {
		return this.latestSnapshotEvent;
	}

	@Override
	public java.lang.Integer getPopulation() {
		return this.population;
	}

	@Override
	public java.lang.Integer getVoterCount() {
		return this.voterCount;
	}

	@Override
	public java.lang.Integer getStatusQuoSchulzeRank() {
		return this.statusQuoSchulzeRank;
	}
}
