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
public class MemberApplication implements org.glottotopia.generated.tables.interfaces.IMemberApplication {

	private static final long serialVersionUID = -998423878;

	private final java.lang.Long                                            id;
	private final java.lang.Integer                                         memberId;
	private final java.lang.String                                          name;
	private final java.lang.String                                          comment;
	private final org.glottotopia.generated.enums.ApplicationAccessLevel accessLevel;
	private final java.lang.String                                          key;
	private final java.sql.Timestamp                                        lastUsage;

	public MemberApplication(
		java.lang.Long                                            id,
		java.lang.Integer                                         memberId,
		java.lang.String                                          name,
		java.lang.String                                          comment,
		org.glottotopia.generated.enums.ApplicationAccessLevel accessLevel,
		java.lang.String                                          key,
		java.sql.Timestamp                                        lastUsage
	) {
		this.id = id;
		this.memberId = memberId;
		this.name = name;
		this.comment = comment;
		this.accessLevel = accessLevel;
		this.key = key;
		this.lastUsage = lastUsage;
	}

	@Override
	public java.lang.Long getId() {
		return this.id;
	}

	@Override
	public java.lang.Integer getMemberId() {
		return this.memberId;
	}

	@Override
	public java.lang.String getName() {
		return this.name;
	}

	@Override
	public java.lang.String getComment() {
		return this.comment;
	}

	@Override
	public org.glottotopia.generated.enums.ApplicationAccessLevel getAccessLevel() {
		return this.accessLevel;
	}

	@Override
	public java.lang.String getKey() {
		return this.key;
	}

	@Override
	public java.sql.Timestamp getLastUsage() {
		return this.lastUsage;
	}
}
