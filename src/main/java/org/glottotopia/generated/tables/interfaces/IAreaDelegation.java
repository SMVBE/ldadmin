/**
 * This class is generated by jOOQ
 */
package org.glottotopia.generated.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IAreaDelegation extends java.io.Serializable {

	/**
	 * Getter for <code>area_delegation.area_id</code>.
	 */
	public java.lang.Integer getAreaId();

	/**
	 * Getter for <code>area_delegation.id</code>.
	 */
	public java.lang.Long getId();

	/**
	 * Getter for <code>area_delegation.truster_id</code>.
	 */
	public java.lang.Integer getTrusterId();

	/**
	 * Getter for <code>area_delegation.trustee_id</code>.
	 */
	public java.lang.Integer getTrusteeId();

	/**
	 * Getter for <code>area_delegation.scope</code>.
	 */
	public org.glottotopia.generated.enums.DelegationScope getScope();
}
