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
public interface IUnit extends java.io.Serializable {

	/**
	 * Getter for <code>unit.id</code>.
	 */
	public java.lang.Integer getId();

	/**
	 * Getter for <code>unit.parent_id</code>.
	 */
	public java.lang.Integer getParentId();

	/**
	 * Getter for <code>unit.active</code>.
	 */
	public java.lang.Boolean getActive();

	/**
	 * Getter for <code>unit.name</code>.
	 */
	public java.lang.String getName();

	/**
	 * Getter for <code>unit.description</code>.
	 */
	public java.lang.String getDescription();

	/**
	 * Getter for <code>unit.member_count</code>.
	 */
	public java.lang.Integer getMemberCount();

	/**
	 * Getter for <code>unit.text_search_data</code>.
	 */
	public java.lang.Object getTextSearchData();
}
