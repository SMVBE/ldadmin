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
public interface IIssueSupporterInAdmissionState extends java.io.Serializable {

	/**
	 * Getter for <code>issue_supporter_in_admission_state.unit_id</code>.
	 */
	public java.lang.Integer getUnitId();

	/**
	 * Getter for <code>issue_supporter_in_admission_state.area_id</code>.
	 */
	public java.lang.Integer getAreaId();

	/**
	 * Getter for <code>issue_supporter_in_admission_state.issue_id</code>.
	 */
	public java.lang.Integer getIssueId();

	/**
	 * Getter for <code>issue_supporter_in_admission_state.member_id</code>.
	 */
	public java.lang.Integer getMemberId();

	/**
	 * Getter for <code>issue_supporter_in_admission_state.weight</code>.
	 */
	public java.lang.Integer getWeight();
}