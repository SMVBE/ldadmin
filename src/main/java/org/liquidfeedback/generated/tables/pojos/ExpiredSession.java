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
public class ExpiredSession implements org.liquidfeedback.generated.tables.interfaces.IExpiredSession {

	private static final long serialVersionUID = -927345184;

	private final java.lang.String   ident;
	private final java.lang.String   additionalSecret;
	private final java.sql.Timestamp expiry;
	private final java.lang.Long     memberId;
	private final java.lang.String   authority;
	private final java.lang.String   authorityUid;
	private final java.lang.String   authorityLogin;
	private final java.lang.Boolean  needsDelegationCheck;
	private final java.lang.String   lang;

	public ExpiredSession(
		java.lang.String   ident,
		java.lang.String   additionalSecret,
		java.sql.Timestamp expiry,
		java.lang.Long     memberId,
		java.lang.String   authority,
		java.lang.String   authorityUid,
		java.lang.String   authorityLogin,
		java.lang.Boolean  needsDelegationCheck,
		java.lang.String   lang
	) {
		this.ident = ident;
		this.additionalSecret = additionalSecret;
		this.expiry = expiry;
		this.memberId = memberId;
		this.authority = authority;
		this.authorityUid = authorityUid;
		this.authorityLogin = authorityLogin;
		this.needsDelegationCheck = needsDelegationCheck;
		this.lang = lang;
	}

	@Override
	public java.lang.String getIdent() {
		return this.ident;
	}

	@Override
	public java.lang.String getAdditionalSecret() {
		return this.additionalSecret;
	}

	@Override
	public java.sql.Timestamp getExpiry() {
		return this.expiry;
	}

	@Override
	public java.lang.Long getMemberId() {
		return this.memberId;
	}

	@Override
	public java.lang.String getAuthority() {
		return this.authority;
	}

	@Override
	public java.lang.String getAuthorityUid() {
		return this.authorityUid;
	}

	@Override
	public java.lang.String getAuthorityLogin() {
		return this.authorityLogin;
	}

	@Override
	public java.lang.Boolean getNeedsDelegationCheck() {
		return this.needsDelegationCheck;
	}

	@Override
	public java.lang.String getLang() {
		return this.lang;
	}
}
