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
public class Supporter extends org.jooq.impl.TableImpl<org.liquidfeedback.generated.tables.records.SupporterRecord> {

	private static final long serialVersionUID = 503124230;

	/**
	 * The singleton instance of <code>supporter</code>
	 */
	public static final org.liquidfeedback.generated.tables.Supporter SUPPORTER = new org.liquidfeedback.generated.tables.Supporter();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.liquidfeedback.generated.tables.records.SupporterRecord> getRecordType() {
		return org.liquidfeedback.generated.tables.records.SupporterRecord.class;
	}

	/**
	 * The column <code>supporter.issue_id</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.SupporterRecord, java.lang.Integer> ISSUE_ID = createField("issue_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>supporter.initiative_id</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.SupporterRecord, java.lang.Integer> INITIATIVE_ID = createField("initiative_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>supporter.member_id</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.SupporterRecord, java.lang.Integer> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>supporter.draft_id</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.SupporterRecord, java.lang.Long> DRAFT_ID = createField("draft_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * Create a <code>supporter</code> table reference
	 */
	public Supporter() {
		this("supporter", null);
	}

	/**
	 * Create an aliased <code>supporter</code> table reference
	 */
	public Supporter(java.lang.String alias) {
		this(alias, org.liquidfeedback.generated.tables.Supporter.SUPPORTER);
	}

	private Supporter(java.lang.String alias, org.jooq.Table<org.liquidfeedback.generated.tables.records.SupporterRecord> aliased) {
		this(alias, aliased, null);
	}

	private Supporter(java.lang.String alias, org.jooq.Table<org.liquidfeedback.generated.tables.records.SupporterRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.liquidfeedback.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.liquidfeedback.generated.tables.records.SupporterRecord> getPrimaryKey() {
		return org.liquidfeedback.generated.Keys.SUPPORTER_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.liquidfeedback.generated.tables.records.SupporterRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.liquidfeedback.generated.tables.records.SupporterRecord>>asList(org.liquidfeedback.generated.Keys.SUPPORTER_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.liquidfeedback.generated.tables.records.SupporterRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.liquidfeedback.generated.tables.records.SupporterRecord, ?>>asList(org.liquidfeedback.generated.Keys.SUPPORTER__SUPPORTER_ISSUE_ID_FKEY, org.liquidfeedback.generated.Keys.SUPPORTER__SUPPORTER_INITIATIVE_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.liquidfeedback.generated.tables.Supporter as(java.lang.String alias) {
		return new org.liquidfeedback.generated.tables.Supporter(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.liquidfeedback.generated.tables.Supporter rename(java.lang.String name) {
		return new org.liquidfeedback.generated.tables.Supporter(name, null);
	}
}
