/**
 * This class is generated by jOOQ
 */
package de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RemainingHarmonicInitiativeWeightSummands extends org.jooq.impl.TableImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.RemainingHarmonicInitiativeWeightSummandsRecord> {

	private static final long serialVersionUID = -4671421;

	/**
	 * The singleton instance of <code>remaining_harmonic_initiative_weight_summands</code>
	 */
	public static final de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.RemainingHarmonicInitiativeWeightSummands REMAINING_HARMONIC_INITIATIVE_WEIGHT_SUMMANDS = new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.RemainingHarmonicInitiativeWeightSummands();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.RemainingHarmonicInitiativeWeightSummandsRecord> getRecordType() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.RemainingHarmonicInitiativeWeightSummandsRecord.class;
	}

	/**
	 * The column <code>remaining_harmonic_initiative_weight_summands.issue_id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.RemainingHarmonicInitiativeWeightSummandsRecord, java.lang.Integer> ISSUE_ID = createField("issue_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>remaining_harmonic_initiative_weight_summands.initiative_id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.RemainingHarmonicInitiativeWeightSummandsRecord, java.lang.Integer> INITIATIVE_ID = createField("initiative_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>remaining_harmonic_initiative_weight_summands.admitted</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.RemainingHarmonicInitiativeWeightSummandsRecord, java.lang.Boolean> ADMITTED = createField("admitted", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

	/**
	 * The column <code>remaining_harmonic_initiative_weight_summands.weight_num</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.RemainingHarmonicInitiativeWeightSummandsRecord, java.lang.Long> WEIGHT_NUM = createField("weight_num", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>remaining_harmonic_initiative_weight_summands.weight_den</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.RemainingHarmonicInitiativeWeightSummandsRecord, java.lang.Long> WEIGHT_DEN = createField("weight_den", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>remaining_harmonic_initiative_weight_summands</code> table reference
	 */
	public RemainingHarmonicInitiativeWeightSummands() {
		this("remaining_harmonic_initiative_weight_summands", null);
	}

	/**
	 * Create an aliased <code>remaining_harmonic_initiative_weight_summands</code> table reference
	 */
	public RemainingHarmonicInitiativeWeightSummands(java.lang.String alias) {
		this(alias, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.RemainingHarmonicInitiativeWeightSummands.REMAINING_HARMONIC_INITIATIVE_WEIGHT_SUMMANDS);
	}

	private RemainingHarmonicInitiativeWeightSummands(java.lang.String alias, org.jooq.Table<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.RemainingHarmonicInitiativeWeightSummandsRecord> aliased) {
		this(alias, aliased, null);
	}

	private RemainingHarmonicInitiativeWeightSummands(java.lang.String alias, org.jooq.Table<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.RemainingHarmonicInitiativeWeightSummandsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, de.piratenpartei.berlin.ldadmin.dbaccess.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.RemainingHarmonicInitiativeWeightSummands as(java.lang.String alias) {
		return new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.RemainingHarmonicInitiativeWeightSummands(alias, this);
	}

	/**
	 * Rename this table
	 */
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.RemainingHarmonicInitiativeWeightSummands rename(java.lang.String name) {
		return new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.RemainingHarmonicInitiativeWeightSummands(name, null);
	}
}
