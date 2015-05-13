/**
 * This class is generated by jOOQ
 */
package org.glottotopia.generated.enums;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum EventType implements org.jooq.EnumType {

	issue_state_changed("issue_state_changed"),

	initiative_created_in_new_issue("initiative_created_in_new_issue"),

	initiative_created_in_existing_issue("initiative_created_in_existing_issue"),

	initiative_revoked("initiative_revoked"),

	new_draft_created("new_draft_created"),

	suggestion_created("suggestion_created");

	private final java.lang.String literal;

	private EventType(java.lang.String literal) {
		this.literal = literal;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Schema getSchema() {
		return org.glottotopia.generated.DefaultSchema.DEFAULT_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String getName() {
		return "event_type";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String getLiteral() {
		return literal;
	}
}
