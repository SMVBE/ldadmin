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
public interface IRemainingHarmonicSupporterWeight extends java.io.Serializable {

	/**
	 * Getter for <code>remaining_harmonic_supporter_weight.issue_id</code>.
	 */
	public java.lang.Integer getIssueId();

	/**
	 * Getter for <code>remaining_harmonic_supporter_weight.event</code>.
	 */
	public org.liquidfeedback.generated.enums.SnapshotEvent getEvent();

	/**
	 * Getter for <code>remaining_harmonic_supporter_weight.member_id</code>.
	 */
	public java.lang.Integer getMemberId();

	/**
	 * Getter for <code>remaining_harmonic_supporter_weight.weight_num</code>.
	 */
	public java.lang.Integer getWeightNum();

	/**
	 * Getter for <code>remaining_harmonic_supporter_weight.weight_den</code>.
	 */
	public java.lang.Long getWeightDen();
}