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
public class IssueSetting extends org.jooq.impl.TableImpl<org.liquidfeedback.generated.tables.records.IssueSettingRecord> {

	private static final long serialVersionUID = -1479153000;

	/**
	 * The singleton instance of <code>issue_setting</code>
	 */
	public static final org.liquidfeedback.generated.tables.IssueSetting ISSUE_SETTING = new org.liquidfeedback.generated.tables.IssueSetting();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.liquidfeedback.generated.tables.records.IssueSettingRecord> getRecordType() {
		return org.liquidfeedback.generated.tables.records.IssueSettingRecord.class;
	}

	/**
	 * The column <code>issue_setting.member_id</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.IssueSettingRecord, java.lang.Integer> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>issue_setting.key</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.IssueSettingRecord, java.lang.String> KEY = createField("key", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>issue_setting.issue_id</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.IssueSettingRecord, java.lang.Integer> ISSUE_ID = createField("issue_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>issue_setting.value</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.IssueSettingRecord, java.lang.String> VALUE = createField("value", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * Create a <code>issue_setting</code> table reference
	 */
	public IssueSetting() {
		this("issue_setting", null);
	}

	/**
	 * Create an aliased <code>issue_setting</code> table reference
	 */
	public IssueSetting(java.lang.String alias) {
		this(alias, org.liquidfeedback.generated.tables.IssueSetting.ISSUE_SETTING);
	}

	private IssueSetting(java.lang.String alias, org.jooq.Table<org.liquidfeedback.generated.tables.records.IssueSettingRecord> aliased) {
		this(alias, aliased, null);
	}

	private IssueSetting(java.lang.String alias, org.jooq.Table<org.liquidfeedback.generated.tables.records.IssueSettingRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.liquidfeedback.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.liquidfeedback.generated.tables.records.IssueSettingRecord> getPrimaryKey() {
		return org.liquidfeedback.generated.Keys.ISSUE_SETTING_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.liquidfeedback.generated.tables.records.IssueSettingRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.liquidfeedback.generated.tables.records.IssueSettingRecord>>asList(org.liquidfeedback.generated.Keys.ISSUE_SETTING_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.liquidfeedback.generated.tables.records.IssueSettingRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.liquidfeedback.generated.tables.records.IssueSettingRecord, ?>>asList(org.liquidfeedback.generated.Keys.ISSUE_SETTING__ISSUE_SETTING_MEMBER_ID_FKEY, org.liquidfeedback.generated.Keys.ISSUE_SETTING__ISSUE_SETTING_ISSUE_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.liquidfeedback.generated.tables.IssueSetting as(java.lang.String alias) {
		return new org.liquidfeedback.generated.tables.IssueSetting(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.liquidfeedback.generated.tables.IssueSetting rename(java.lang.String name) {
		return new org.liquidfeedback.generated.tables.IssueSetting(name, null);
	}
}
