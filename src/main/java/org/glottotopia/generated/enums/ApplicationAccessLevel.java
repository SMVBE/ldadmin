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
public enum ApplicationAccessLevel implements org.jooq.EnumType {

	member("member"),

	full("full"),

	pseudonymous("pseudonymous"),

	anonymous("anonymous");

	private final java.lang.String literal;

	private ApplicationAccessLevel(java.lang.String literal) {
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
		return "application_access_level";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String getLiteral() {
		return literal;
	}
}
