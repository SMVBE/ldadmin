/**
 * This class is generated by jOOQ
 */
package org.liquidfeedback.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AreaMemberCountRecord extends org.jooq.impl.TableRecordImpl<org.liquidfeedback.generated.tables.records.AreaMemberCountRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.Long, java.lang.Long>, org.liquidfeedback.generated.tables.interfaces.IAreaMemberCount {

	private static final long serialVersionUID = 342708681;

	/**
	 * Setter for <code>area_member_count.area_id</code>.
	 */
	public void setAreaId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>area_member_count.area_id</code>.
	 */
	@Override
	public java.lang.Integer getAreaId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>area_member_count.direct_member_count</code>.
	 */
	public void setDirectMemberCount(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>area_member_count.direct_member_count</code>.
	 */
	@Override
	public java.lang.Long getDirectMemberCount() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>area_member_count.member_weight</code>.
	 */
	public void setMemberWeight(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>area_member_count.member_weight</code>.
	 */
	@Override
	public java.lang.Long getMemberWeight() {
		return (java.lang.Long) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Long, java.lang.Long> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Long, java.lang.Long> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.liquidfeedback.generated.tables.AreaMemberCount.AREA_MEMBER_COUNT.AREA_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return org.liquidfeedback.generated.tables.AreaMemberCount.AREA_MEMBER_COUNT.DIRECT_MEMBER_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return org.liquidfeedback.generated.tables.AreaMemberCount.AREA_MEMBER_COUNT.MEMBER_WEIGHT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getAreaId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value2() {
		return getDirectMemberCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value3() {
		return getMemberWeight();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AreaMemberCountRecord value1(java.lang.Integer value) {
		setAreaId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AreaMemberCountRecord value2(java.lang.Long value) {
		setDirectMemberCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AreaMemberCountRecord value3(java.lang.Long value) {
		setMemberWeight(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AreaMemberCountRecord values(java.lang.Integer value1, java.lang.Long value2, java.lang.Long value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AreaMemberCountRecord
	 */
	public AreaMemberCountRecord() {
		super(org.liquidfeedback.generated.tables.AreaMemberCount.AREA_MEMBER_COUNT);
	}

	/**
	 * Create a detached, initialised AreaMemberCountRecord
	 */
	public AreaMemberCountRecord(java.lang.Integer areaId, java.lang.Long directMemberCount, java.lang.Long memberWeight) {
		super(org.liquidfeedback.generated.tables.AreaMemberCount.AREA_MEMBER_COUNT);

		setValue(0, areaId);
		setValue(1, directMemberCount);
		setValue(2, memberWeight);
	}
}
