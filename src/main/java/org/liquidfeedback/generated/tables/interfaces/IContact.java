/**
 * This class is generated by jOOQ
 */
package org.liquidfeedback.generated.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IContact extends java.io.Serializable {

	/**
	 * Getter for <code>contact.member_id</code>.
	 */
	public java.lang.Integer getMemberId();

	/**
	 * Getter for <code>contact.other_member_id</code>.
	 */
	public java.lang.Integer getOtherMemberId();

	/**
	 * Getter for <code>contact.public</code>.
	 */
	public java.lang.Boolean getPublic();
}
