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
public interface IEvent extends java.io.Serializable {

	/**
	 * Getter for <code>event.id</code>.
	 */
	public java.lang.Long getId();

	/**
	 * Getter for <code>event.occurrence</code>.
	 */
	public java.sql.Timestamp getOccurrence();

	/**
	 * Getter for <code>event.event</code>.
	 */
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.EventType getEvent();

	/**
	 * Getter for <code>event.member_id</code>.
	 */
	public java.lang.Integer getMemberId();

	/**
	 * Getter for <code>event.issue_id</code>.
	 */
	public java.lang.Integer getIssueId();

	/**
	 * Getter for <code>event.state</code>.
	 */
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.IssueState getState();

	/**
	 * Getter for <code>event.initiative_id</code>.
	 */
	public java.lang.Integer getInitiativeId();

	/**
	 * Getter for <code>event.draft_id</code>.
	 */
	public java.lang.Long getDraftId();

	/**
	 * Getter for <code>event.suggestion_id</code>.
	 */
	public java.lang.Long getSuggestionId();
}