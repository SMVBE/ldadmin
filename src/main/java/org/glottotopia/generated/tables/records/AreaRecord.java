/**
 * This class is generated by jOOQ
 */
package org.glottotopia.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AreaRecord extends org.jooq.impl.UpdatableRecordImpl<org.glottotopia.generated.tables.records.AreaRecord> implements org.jooq.Record8<java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Object>, org.glottotopia.generated.tables.interfaces.IArea {

	private static final long serialVersionUID = -346644190;

	/**
	 * Setter for <code>area.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>area.id</code>.
	 */
	@Override
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>area.unit_id</code>.
	 */
	public void setUnitId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>area.unit_id</code>.
	 */
	@Override
	public java.lang.Integer getUnitId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>area.active</code>.
	 */
	public void setActive(java.lang.Boolean value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>area.active</code>.
	 */
	@Override
	public java.lang.Boolean getActive() {
		return (java.lang.Boolean) getValue(2);
	}

	/**
	 * Setter for <code>area.name</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>area.name</code>.
	 */
	@Override
	public java.lang.String getName() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>area.description</code>.
	 */
	public void setDescription(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>area.description</code>.
	 */
	@Override
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>area.direct_member_count</code>.
	 */
	public void setDirectMemberCount(java.lang.Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>area.direct_member_count</code>.
	 */
	@Override
	public java.lang.Integer getDirectMemberCount() {
		return (java.lang.Integer) getValue(5);
	}

	/**
	 * Setter for <code>area.member_weight</code>.
	 */
	public void setMemberWeight(java.lang.Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>area.member_weight</code>.
	 */
	@Override
	public java.lang.Integer getMemberWeight() {
		return (java.lang.Integer) getValue(6);
	}

	/**
	 * Setter for <code>area.text_search_data</code>.
	 */
	public void setTextSearchData(java.lang.Object value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>area.text_search_data</code>.
	 */
	@Override
	public java.lang.Object getTextSearchData() {
		return (java.lang.Object) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Object> fieldsRow() {
		return (org.jooq.Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Object> valuesRow() {
		return (org.jooq.Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.glottotopia.generated.tables.Area.AREA.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.glottotopia.generated.tables.Area.AREA.UNIT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field3() {
		return org.glottotopia.generated.tables.Area.AREA.ACTIVE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.glottotopia.generated.tables.Area.AREA.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.glottotopia.generated.tables.Area.AREA.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return org.glottotopia.generated.tables.Area.AREA.DIRECT_MEMBER_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return org.glottotopia.generated.tables.Area.AREA.MEMBER_WEIGHT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field8() {
		return org.glottotopia.generated.tables.Area.AREA.TEXT_SEARCH_DATA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getUnitId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value3() {
		return getActive();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getDirectMemberCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value7() {
		return getMemberWeight();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value8() {
		return getTextSearchData();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AreaRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AreaRecord value2(java.lang.Integer value) {
		setUnitId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AreaRecord value3(java.lang.Boolean value) {
		setActive(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AreaRecord value4(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AreaRecord value5(java.lang.String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AreaRecord value6(java.lang.Integer value) {
		setDirectMemberCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AreaRecord value7(java.lang.Integer value) {
		setMemberWeight(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AreaRecord value8(java.lang.Object value) {
		setTextSearchData(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AreaRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Boolean value3, java.lang.String value4, java.lang.String value5, java.lang.Integer value6, java.lang.Integer value7, java.lang.Object value8) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AreaRecord
	 */
	public AreaRecord() {
		super(org.glottotopia.generated.tables.Area.AREA);
	}

	/**
	 * Create a detached, initialised AreaRecord
	 */
	public AreaRecord(java.lang.Integer id, java.lang.Integer unitId, java.lang.Boolean active, java.lang.String name, java.lang.String description, java.lang.Integer directMemberCount, java.lang.Integer memberWeight, java.lang.Object textSearchData) {
		super(org.glottotopia.generated.tables.Area.AREA);

		setValue(0, id);
		setValue(1, unitId);
		setValue(2, active);
		setValue(3, name);
		setValue(4, description);
		setValue(5, directMemberCount);
		setValue(6, memberWeight);
		setValue(7, textSearchData);
	}
}
