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
public class MemberContingentLeft implements de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.interfaces.IMemberContingentLeft {

	private static final long serialVersionUID = 1785550310;

	private final java.lang.Integer memberId;
	private final java.lang.Boolean polling;
	private final java.lang.Long    textEntriesLeft;
	private final java.lang.Long    initiativesLeft;

	public MemberContingentLeft(
		java.lang.Integer memberId,
		java.lang.Boolean polling,
		java.lang.Long    textEntriesLeft,
		java.lang.Long    initiativesLeft
	) {
		this.memberId = memberId;
		this.polling = polling;
		this.textEntriesLeft = textEntriesLeft;
		this.initiativesLeft = initiativesLeft;
	}

	@Override
	public java.lang.Integer getMemberId() {
		return this.memberId;
	}

	@Override
	public java.lang.Boolean getPolling() {
		return this.polling;
	}

	@Override
	public java.lang.Long getTextEntriesLeft() {
		return this.textEntriesLeft;
	}

	@Override
	public java.lang.Long getInitiativesLeft() {
		return this.initiativesLeft;
	}
}
