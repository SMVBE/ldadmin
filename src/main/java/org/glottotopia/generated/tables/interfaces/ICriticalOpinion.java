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
public interface ICriticalOpinion extends java.io.Serializable {

	/**
	 * Getter for <code>critical_opinion.initiative_id</code>.
	 */
	public java.lang.Integer getInitiativeId();

	/**
	 * Getter for <code>critical_opinion.suggestion_id</code>.
	 */
	public java.lang.Long getSuggestionId();

	/**
	 * Getter for <code>critical_opinion.member_id</code>.
	 */
	public java.lang.Integer getMemberId();

	/**
	 * Getter for <code>critical_opinion.degree</code>.
	 */
	public java.lang.Short getDegree();

	/**
	 * Getter for <code>critical_opinion.fulfilled</code>.
	 */
	public java.lang.Boolean getFulfilled();
}
