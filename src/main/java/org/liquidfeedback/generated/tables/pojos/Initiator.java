/**
 * This class is generated by jOOQ
 */
package org.liquidfeedback.generated.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Initiator implements org.liquidfeedback.generated.tables.interfaces.IInitiator {

	private static final long serialVersionUID = -1329894348;

	private final java.lang.Integer initiativeId;
	private final java.lang.Integer memberId;
	private final java.lang.Boolean accepted;

	public Initiator(
		java.lang.Integer initiativeId,
		java.lang.Integer memberId,
		java.lang.Boolean accepted
	) {
		this.initiativeId = initiativeId;
		this.memberId = memberId;
		this.accepted = accepted;
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
	public java.lang.Boolean getAccepted() {
		return this.accepted;
	}
}
