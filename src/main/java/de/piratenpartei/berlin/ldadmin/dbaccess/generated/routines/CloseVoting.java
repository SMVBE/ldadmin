/**
 * This class is generated by jOOQ
 */
package de.piratenpartei.berlin.ldadmin.dbaccess.generated.routines;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CloseVoting extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -229359206;

	/**
	 * The parameter <code>close_voting.issue_id_p</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer> ISSUE_ID_P = createParameter("issue_id_p", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public CloseVoting() {
		super("close_voting", de.piratenpartei.berlin.ldadmin.dbaccess.generated.DefaultSchema.DEFAULT_SCHEMA);

		addInParameter(ISSUE_ID_P);
	}

	/**
	 * Set the <code>issue_id_p</code> parameter IN value to the routine
	 */
	public void setIssueIdP(java.lang.Integer value) {
		setValue(de.piratenpartei.berlin.ldadmin.dbaccess.generated.routines.CloseVoting.ISSUE_ID_P, value);
	}
}
