/**
 * This class is generated by jOOQ
 */
package de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IDelegation extends java.io.Serializable {

	/**
	 * Getter for <code>delegation.id</code>.
	 */
	public java.lang.Long getId();

	/**
	 * Getter for <code>delegation.truster_id</code>.
	 */
	public java.lang.Integer getTrusterId();

	/**
	 * Getter for <code>delegation.trustee_id</code>.
	 */
	public java.lang.Integer getTrusteeId();

	/**
	 * Getter for <code>delegation.scope</code>.
	 */
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationScope getScope();

	/**
	 * Getter for <code>delegation.unit_id</code>.
	 */
	public java.lang.Integer getUnitId();

	/**
	 * Getter for <code>delegation.area_id</code>.
	 */
	public java.lang.Integer getAreaId();

	/**
	 * Getter for <code>delegation.issue_id</code>.
	 */
	public java.lang.Integer getIssueId();
}
