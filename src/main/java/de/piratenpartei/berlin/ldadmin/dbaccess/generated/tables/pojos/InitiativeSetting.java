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
public class InitiativeSetting implements de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.interfaces.IInitiativeSetting {

	private static final long serialVersionUID = -317193008;

	private final java.lang.Integer memberId;
	private final java.lang.String  key;
	private final java.lang.Integer initiativeId;
	private final java.lang.String  value;

	public InitiativeSetting(
		java.lang.Integer memberId,
		java.lang.String  key,
		java.lang.Integer initiativeId,
		java.lang.String  value
	) {
		this.memberId = memberId;
		this.key = key;
		this.initiativeId = initiativeId;
		this.value = value;
	}

	@Override
	public java.lang.Integer getMemberId() {
		return this.memberId;
	}

	@Override
	public java.lang.String getKey() {
		return this.key;
	}

	@Override
	public java.lang.Integer getInitiativeId() {
		return this.initiativeId;
	}

	@Override
	public java.lang.String getValue() {
		return this.value;
	}
}
