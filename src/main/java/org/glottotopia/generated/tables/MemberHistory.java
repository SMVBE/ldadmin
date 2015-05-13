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
public class MemberHistory extends org.jooq.impl.TableImpl<org.liquidfeedback.generated.tables.records.MemberHistoryRecord> {

	private static final long serialVersionUID = -973432806;

	/**
	 * The singleton instance of <code>member_history</code>
	 */
	public static final org.liquidfeedback.generated.tables.MemberHistory MEMBER_HISTORY = new org.liquidfeedback.generated.tables.MemberHistory();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.liquidfeedback.generated.tables.records.MemberHistoryRecord> getRecordType() {
		return org.liquidfeedback.generated.tables.records.MemberHistoryRecord.class;
	}

	/**
	 * The column <code>member_history.id</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.MemberHistoryRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>member_history.member_id</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.MemberHistoryRecord, java.lang.Integer> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>member_history.until</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.MemberHistoryRecord, java.sql.Timestamp> UNTIL = createField("until", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>member_history.active</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.MemberHistoryRecord, java.lang.Boolean> ACTIVE = createField("active", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>member_history.name</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.MemberHistoryRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * Create a <code>member_history</code> table reference
	 */
	public MemberHistory() {
		this("member_history", null);
	}

	/**
	 * Create an aliased <code>member_history</code> table reference
	 */
	public MemberHistory(java.lang.String alias) {
		this(alias, org.liquidfeedback.generated.tables.MemberHistory.MEMBER_HISTORY);
	}

	private MemberHistory(java.lang.String alias, org.jooq.Table<org.liquidfeedback.generated.tables.records.MemberHistoryRecord> aliased) {
		this(alias, aliased, null);
	}

	private MemberHistory(java.lang.String alias, org.jooq.Table<org.liquidfeedback.generated.tables.records.MemberHistoryRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.liquidfeedback.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.liquidfeedback.generated.tables.records.MemberHistoryRecord, java.lang.Long> getIdentity() {
		return org.liquidfeedback.generated.Keys.IDENTITY_MEMBER_HISTORY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.liquidfeedback.generated.tables.records.MemberHistoryRecord> getPrimaryKey() {
		return org.liquidfeedback.generated.Keys.MEMBER_HISTORY_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.liquidfeedback.generated.tables.records.MemberHistoryRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.liquidfeedback.generated.tables.records.MemberHistoryRecord>>asList(org.liquidfeedback.generated.Keys.MEMBER_HISTORY_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.liquidfeedback.generated.tables.records.MemberHistoryRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.liquidfeedback.generated.tables.records.MemberHistoryRecord, ?>>asList(org.liquidfeedback.generated.Keys.MEMBER_HISTORY__MEMBER_HISTORY_MEMBER_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.liquidfeedback.generated.tables.MemberHistory as(java.lang.String alias) {
		return new org.liquidfeedback.generated.tables.MemberHistory(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.liquidfeedback.generated.tables.MemberHistory rename(java.lang.String name) {
		return new org.liquidfeedback.generated.tables.MemberHistory(name, null);
	}
}