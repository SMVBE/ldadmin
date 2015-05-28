/**
 * This class is generated by jOOQ
 */
package de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MemberRelationSettingRecord extends org.jooq.impl.UpdatableRecordImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.MemberRelationSettingRecord> implements org.jooq.Record4<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String>, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.interfaces.IMemberRelationSetting {

	private static final long serialVersionUID = 468488689;

	/**
	 * Setter for <code>member_relation_setting.member_id</code>.
	 */
	public void setMemberId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>member_relation_setting.member_id</code>.
	 */
	@Override
	public java.lang.Integer getMemberId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>member_relation_setting.key</code>.
	 */
	public void setKey(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>member_relation_setting.key</code>.
	 */
	@Override
	public java.lang.String getKey() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>member_relation_setting.other_member_id</code>.
	 */
	public void setOtherMemberId(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>member_relation_setting.other_member_id</code>.
	 */
	@Override
	public java.lang.Integer getOtherMemberId() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>member_relation_setting.value</code>.
	 */
	public void setValue(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>member_relation_setting.value</code>.
	 */
	@Override
	public java.lang.String getValue() {
		return (java.lang.String) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record3<java.lang.Integer, java.lang.String, java.lang.Integer> key() {
		return (org.jooq.Record3) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.MemberRelationSetting.MEMBER_RELATION_SETTING.MEMBER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.MemberRelationSetting.MEMBER_RELATION_SETTING.KEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.MemberRelationSetting.MEMBER_RELATION_SETTING.OTHER_MEMBER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.MemberRelationSetting.MEMBER_RELATION_SETTING.VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getMemberId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getKey();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getOtherMemberId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemberRelationSettingRecord value1(java.lang.Integer value) {
		setMemberId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemberRelationSettingRecord value2(java.lang.String value) {
		setKey(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemberRelationSettingRecord value3(java.lang.Integer value) {
		setOtherMemberId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemberRelationSettingRecord value4(java.lang.String value) {
		setValue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemberRelationSettingRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.Integer value3, java.lang.String value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached MemberRelationSettingRecord
	 */
	public MemberRelationSettingRecord() {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.MemberRelationSetting.MEMBER_RELATION_SETTING);
	}

	/**
	 * Create a detached, initialised MemberRelationSettingRecord
	 */
	public MemberRelationSettingRecord(java.lang.Integer memberId, java.lang.String key, java.lang.Integer otherMemberId, java.lang.String value) {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.MemberRelationSetting.MEMBER_RELATION_SETTING);

		setValue(0, memberId);
		setValue(1, key);
		setValue(2, otherMemberId);
		setValue(3, value);
	}
}