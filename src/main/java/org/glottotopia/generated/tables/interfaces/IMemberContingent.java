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
public interface IMemberContingent extends java.io.Serializable {

	/**
	 * Getter for <code>member_contingent.member_id</code>.
	 */
	public java.lang.Integer getMemberId();

	/**
	 * Getter for <code>member_contingent.polling</code>.
	 */
	public java.lang.Boolean getPolling();

	/**
	 * Getter for <code>member_contingent.time_frame</code>.
	 */
	public java.lang.Object getTimeFrame();

	/**
	 * Getter for <code>member_contingent.text_entry_count</code>.
	 */
	public java.lang.Long getTextEntryCount();

	/**
	 * Getter for <code>member_contingent.text_entry_limit</code>.
	 */
	public java.lang.Integer getTextEntryLimit();

	/**
	 * Getter for <code>member_contingent.initiative_count</code>.
	 */
	public java.lang.Long getInitiativeCount();

	/**
	 * Getter for <code>member_contingent.initiative_limit</code>.
	 */
	public java.lang.Integer getInitiativeLimit();
}
