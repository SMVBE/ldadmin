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
public interface IBattle extends java.io.Serializable {

	/**
	 * Getter for <code>battle.issue_id</code>.
	 */
	public java.lang.Integer getIssueId();

	/**
	 * Getter for <code>battle.winning_initiative_id</code>.
	 */
	public java.lang.Integer getWinningInitiativeId();

	/**
	 * Getter for <code>battle.losing_initiative_id</code>.
	 */
	public java.lang.Integer getLosingInitiativeId();

	/**
	 * Getter for <code>battle.count</code>.
	 */
	public java.lang.Integer getCount();
}
