/**
 * This class is generated by jOOQ
 */
package org.glottotopia.generated.routines;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NonVoterDeletesDirectVoterTrigger extends org.jooq.impl.AbstractRoutine<java.lang.Object> {

	private static final long serialVersionUID = 1838885900;

	/**
	 * The parameter <code>non_voter_deletes_direct_voter_trigger.RETURN_VALUE</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("trigger"));

	/**
	 * Create a new routine call instance
	 */
	public NonVoterDeletesDirectVoterTrigger() {
		super("non_voter_deletes_direct_voter_trigger", org.glottotopia.generated.DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.DefaultDataType.getDefaultDataType("trigger"));

		setReturnParameter(RETURN_VALUE);
	}
}
