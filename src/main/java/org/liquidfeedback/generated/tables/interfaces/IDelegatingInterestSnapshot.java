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
public interface IDelegatingInterestSnapshot extends java.io.Serializable {

	/**
	 * Getter for <code>delegating_interest_snapshot.issue_id</code>.
	 */
	public java.lang.Integer getIssueId();

	/**
	 * Getter for <code>delegating_interest_snapshot.event</code>.
	 */
	public org.liquidfeedback.generated.enums.SnapshotEvent getEvent();

	/**
	 * Getter for <code>delegating_interest_snapshot.member_id</code>.
	 */
	public java.lang.Integer getMemberId();

	/**
	 * Getter for <code>delegating_interest_snapshot.weight</code>.
	 */
	public java.lang.Integer getWeight();

	/**
	 * Getter for <code>delegating_interest_snapshot.scope</code>.
	 */
	public org.liquidfeedback.generated.enums.DelegationScope getScope();

	/**
	 * Getter for <code>delegating_interest_snapshot.delegate_member_ids</code>.
	 */
	public java.lang.Integer[] getDelegateMemberIds();
}
