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
public class FindBestPaths extends org.jooq.impl.AbstractRoutine<org.glottotopia.generated.udt.records.LinkStrengthRecord[]> {

	private static final long serialVersionUID = -486080364;

	/**
	 * The parameter <code>find_best_paths.RETURN_VALUE</code>.
	 */
	public static final org.jooq.Parameter<org.glottotopia.generated.udt.records.LinkStrengthRecord[]> RETURN_VALUE = createParameter("RETURN_VALUE", org.glottotopia.generated.udt.LinkStrength.LINK_STRENGTH.getDataType().getArrayDataType());

	/**
	 * The parameter <code>find_best_paths.matrix_d</code>.
	 */
	public static final org.jooq.Parameter<org.glottotopia.generated.udt.records.LinkStrengthRecord[]> MATRIX_D = createParameter("matrix_d", org.glottotopia.generated.udt.LinkStrength.LINK_STRENGTH.getDataType().getArrayDataType());

	/**
	 * Create a new routine call instance
	 */
	public FindBestPaths() {
		super("find_best_paths", org.glottotopia.generated.DefaultSchema.DEFAULT_SCHEMA, org.glottotopia.generated.udt.LinkStrength.LINK_STRENGTH.getDataType().getArrayDataType());

		setReturnParameter(RETURN_VALUE);
		addInParameter(MATRIX_D);
	}

	/**
	 * Set the <code>matrix_d</code> parameter IN value to the routine
	 */
	public void setMatrixD(org.glottotopia.generated.udt.records.LinkStrengthRecord[] value) {
		setValue(org.glottotopia.generated.routines.FindBestPaths.MATRIX_D, value);
	}

	/**
	 * Set the <code>matrix_d</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setMatrixD(org.jooq.Field<org.glottotopia.generated.udt.records.LinkStrengthRecord[]> field) {
		setField(MATRIX_D, field);
	}
}
