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
public interface IIssueOrderInAdmissionState extends java.io.Serializable {

	/**
	 * Getter for <code>issue_order_in_admission_state.id</code>.
	 */
	public java.lang.Long getId();

	/**
	 * Getter for <code>issue_order_in_admission_state.order_in_area</code>.
	 */
	public java.lang.Integer getOrderInArea();

	/**
	 * Getter for <code>issue_order_in_admission_state.order_in_unit</code>.
	 */
	public java.lang.Integer getOrderInUnit();
}
