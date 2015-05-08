/**
 * This class is generated by jOOQ
 */
package org.liquidfeedback.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LiquidFeedbackVersion extends org.jooq.impl.TableImpl<org.liquidfeedback.generated.tables.records.LiquidFeedbackVersionRecord> {

	private static final long serialVersionUID = -1759980704;

	/**
	 * The singleton instance of <code>liquid_feedback_version</code>
	 */
	public static final org.liquidfeedback.generated.tables.LiquidFeedbackVersion LIQUID_FEEDBACK_VERSION = new org.liquidfeedback.generated.tables.LiquidFeedbackVersion();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.liquidfeedback.generated.tables.records.LiquidFeedbackVersionRecord> getRecordType() {
		return org.liquidfeedback.generated.tables.records.LiquidFeedbackVersionRecord.class;
	}

	/**
	 * The column <code>liquid_feedback_version.string</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.LiquidFeedbackVersionRecord, java.lang.String> STRING = createField("string", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>liquid_feedback_version.major</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.LiquidFeedbackVersionRecord, java.lang.Integer> MAJOR = createField("major", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>liquid_feedback_version.minor</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.LiquidFeedbackVersionRecord, java.lang.Integer> MINOR = createField("minor", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>liquid_feedback_version.revision</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.LiquidFeedbackVersionRecord, java.lang.Integer> REVISION = createField("revision", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>liquid_feedback_version</code> table reference
	 */
	public LiquidFeedbackVersion() {
		this("liquid_feedback_version", null);
	}

	/**
	 * Create an aliased <code>liquid_feedback_version</code> table reference
	 */
	public LiquidFeedbackVersion(java.lang.String alias) {
		this(alias, org.liquidfeedback.generated.tables.LiquidFeedbackVersion.LIQUID_FEEDBACK_VERSION);
	}

	private LiquidFeedbackVersion(java.lang.String alias, org.jooq.Table<org.liquidfeedback.generated.tables.records.LiquidFeedbackVersionRecord> aliased) {
		this(alias, aliased, null);
	}

	private LiquidFeedbackVersion(java.lang.String alias, org.jooq.Table<org.liquidfeedback.generated.tables.records.LiquidFeedbackVersionRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.liquidfeedback.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.liquidfeedback.generated.tables.LiquidFeedbackVersion as(java.lang.String alias) {
		return new org.liquidfeedback.generated.tables.LiquidFeedbackVersion(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.liquidfeedback.generated.tables.LiquidFeedbackVersion rename(java.lang.String name) {
		return new org.liquidfeedback.generated.tables.LiquidFeedbackVersion(name, null);
	}
}
