/**
 * This class is generated by jOOQ
 */
package de.piratenpartei.berlin.ldadmin.dbaccess.generated.udt.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LinkStrength implements de.piratenpartei.berlin.ldadmin.dbaccess.generated.udt.interfaces.ILinkStrength {

	private static final long serialVersionUID = 1434734349;

	private final java.lang.Long primary;
	private final java.lang.Long secondary;

	public LinkStrength(
		java.lang.Long primary,
		java.lang.Long secondary
	) {
		this.primary = primary;
		this.secondary = secondary;
	}

	@Override
	public java.lang.Long getPrimary() {
		return this.primary;
	}

	@Override
	public java.lang.Long getSecondary() {
		return this.secondary;
	}
}