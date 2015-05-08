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
public class UnitMemberCount extends org.jooq.impl.TableImpl<org.liquidfeedback.generated.tables.records.UnitMemberCountRecord> {

	private static final long serialVersionUID = 1606931738;

	/**
	 * The singleton instance of <code>unit_member_count</code>
	 */
	public static final org.liquidfeedback.generated.tables.UnitMemberCount UNIT_MEMBER_COUNT = new org.liquidfeedback.generated.tables.UnitMemberCount();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.liquidfeedback.generated.tables.records.UnitMemberCountRecord> getRecordType() {
		return org.liquidfeedback.generated.tables.records.UnitMemberCountRecord.class;
	}

	/**
	 * The column <code>unit_member_count.unit_id</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.UnitMemberCountRecord, java.lang.Integer> UNIT_ID = createField("unit_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>unit_member_count.member_count</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.UnitMemberCountRecord, java.lang.Long> MEMBER_COUNT = createField("member_count", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>unit_member_count</code> table reference
	 */
	public UnitMemberCount() {
		this("unit_member_count", null);
	}

	/**
	 * Create an aliased <code>unit_member_count</code> table reference
	 */
	public UnitMemberCount(java.lang.String alias) {
		this(alias, org.liquidfeedback.generated.tables.UnitMemberCount.UNIT_MEMBER_COUNT);
	}

	private UnitMemberCount(java.lang.String alias, org.jooq.Table<org.liquidfeedback.generated.tables.records.UnitMemberCountRecord> aliased) {
		this(alias, aliased, null);
	}

	private UnitMemberCount(java.lang.String alias, org.jooq.Table<org.liquidfeedback.generated.tables.records.UnitMemberCountRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.liquidfeedback.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.liquidfeedback.generated.tables.UnitMemberCount as(java.lang.String alias) {
		return new org.liquidfeedback.generated.tables.UnitMemberCount(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.liquidfeedback.generated.tables.UnitMemberCount rename(java.lang.String name) {
		return new org.liquidfeedback.generated.tables.UnitMemberCount(name, null);
	}
}
