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
public class Interest implements de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.interfaces.IInterest {

	private static final long serialVersionUID = -1863832286;

	private final java.lang.Integer issueId;
	private final java.lang.Integer memberId;

	public Interest(
		java.lang.Integer issueId,
		java.lang.Integer memberId
	) {
		this.issueId = issueId;
		this.memberId = memberId;
	}

	@Override
	public java.lang.Integer getIssueId() {
		return this.issueId;
	}

	@Override
	public java.lang.Integer getMemberId() {
		return this.memberId;
	}
}
