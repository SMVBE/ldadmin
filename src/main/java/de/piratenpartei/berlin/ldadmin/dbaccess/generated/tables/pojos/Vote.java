/**
 * This class is generated by jOOQ
 */
package de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Vote implements de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.interfaces.IVote {

	private static final long serialVersionUID = 623412279;

	private final java.lang.Integer issueId;
	private final java.lang.Integer initiativeId;
	private final java.lang.Integer memberId;
	private final java.lang.Integer grade;
	private final java.lang.Boolean firstPreference;

	public Vote(
		java.lang.Integer issueId,
		java.lang.Integer initiativeId,
		java.lang.Integer memberId,
		java.lang.Integer grade,
		java.lang.Boolean firstPreference
	) {
		this.issueId = issueId;
		this.initiativeId = initiativeId;
		this.memberId = memberId;
		this.grade = grade;
		this.firstPreference = firstPreference;
	}

	@Override
	public java.lang.Integer getIssueId() {
		return this.issueId;
	}

	@Override
	public java.lang.Integer getInitiativeId() {
		return this.initiativeId;
	}

	@Override
	public java.lang.Integer getMemberId() {
		return this.memberId;
	}

	@Override
	public java.lang.Integer getGrade() {
		return this.grade;
	}

	@Override
	public java.lang.Boolean getFirstPreference() {
		return this.firstPreference;
	}
}
