/**
 * This class is generated by jOOQ
 */
package org.glottotopia.generated.udt.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CheckIssuePersistence implements org.glottotopia.generated.udt.interfaces.ICheckIssuePersistence {

	private static final long serialVersionUID = 276110138;

	private final org.glottotopia.generated.enums.IssueState state;
	private final java.lang.Boolean                             phaseFinished;
	private final java.lang.Boolean                             issueRevoked;
	private final java.lang.Boolean                             snapshotCreated;
	private final java.lang.Boolean                             harmonicWeightsSet;
	private final java.lang.Boolean                             closedVoting;

	public CheckIssuePersistence(
		org.glottotopia.generated.enums.IssueState state,
		java.lang.Boolean                             phaseFinished,
		java.lang.Boolean                             issueRevoked,
		java.lang.Boolean                             snapshotCreated,
		java.lang.Boolean                             harmonicWeightsSet,
		java.lang.Boolean                             closedVoting
	) {
		this.state = state;
		this.phaseFinished = phaseFinished;
		this.issueRevoked = issueRevoked;
		this.snapshotCreated = snapshotCreated;
		this.harmonicWeightsSet = harmonicWeightsSet;
		this.closedVoting = closedVoting;
	}

	@Override
	public org.glottotopia.generated.enums.IssueState getState() {
		return this.state;
	}

	@Override
	public java.lang.Boolean getPhaseFinished() {
		return this.phaseFinished;
	}

	@Override
	public java.lang.Boolean getIssueRevoked() {
		return this.issueRevoked;
	}

	@Override
	public java.lang.Boolean getSnapshotCreated() {
		return this.snapshotCreated;
	}

	@Override
	public java.lang.Boolean getHarmonicWeightsSet() {
		return this.harmonicWeightsSet;
	}

	@Override
	public java.lang.Boolean getClosedVoting() {
		return this.closedVoting;
	}
}
