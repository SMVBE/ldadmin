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
public interface IAllowedPolicy extends java.io.Serializable {

	/**
	 * Getter for <code>allowed_policy.area_id</code>.
	 */
	public java.lang.Integer getAreaId();

	/**
	 * Getter for <code>allowed_policy.policy_id</code>.
	 */
	public java.lang.Integer getPolicyId();

	/**
	 * Getter for <code>allowed_policy.default_policy</code>.
	 */
	public java.lang.Boolean getDefaultPolicy();
}
