/**
 * This class is generated by jOOQ
 */
package org.glottotopia.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Delegation extends org.jooq.impl.TableImpl<org.glottotopia.generated.tables.records.DelegationRecord> {

	private static final long serialVersionUID = -873354522;

	/**
	 * The singleton instance of <code>delegation</code>
	 */
	public static final org.glottotopia.generated.tables.Delegation DELEGATION = new org.glottotopia.generated.tables.Delegation();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.glottotopia.generated.tables.records.DelegationRecord> getRecordType() {
		return org.glottotopia.generated.tables.records.DelegationRecord.class;
	}

	/**
	 * The column <code>delegation.id</code>.
	 */
	public final org.jooq.TableField<org.glottotopia.generated.tables.records.DelegationRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>delegation.truster_id</code>.
	 */
	public final org.jooq.TableField<org.glottotopia.generated.tables.records.DelegationRecord, java.lang.Integer> TRUSTER_ID = createField("truster_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>delegation.trustee_id</code>.
	 */
	public final org.jooq.TableField<org.glottotopia.generated.tables.records.DelegationRecord, java.lang.Integer> TRUSTEE_ID = createField("trustee_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>delegation.scope</code>.
	 */
	public final org.jooq.TableField<org.glottotopia.generated.tables.records.DelegationRecord, org.glottotopia.generated.enums.DelegationScope> SCOPE = createField("scope", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(org.glottotopia.generated.enums.DelegationScope.class), this, "");

	/**
	 * The column <code>delegation.unit_id</code>.
	 */
	public final org.jooq.TableField<org.glottotopia.generated.tables.records.DelegationRecord, java.lang.Integer> UNIT_ID = createField("unit_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>delegation.area_id</code>.
	 */
	public final org.jooq.TableField<org.glottotopia.generated.tables.records.DelegationRecord, java.lang.Integer> AREA_ID = createField("area_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>delegation.issue_id</code>.
	 */
	public final org.jooq.TableField<org.glottotopia.generated.tables.records.DelegationRecord, java.lang.Integer> ISSUE_ID = createField("issue_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>delegation</code> table reference
	 */
	public Delegation() {
		this("delegation", null);
	}

	/**
	 * Create an aliased <code>delegation</code> table reference
	 */
	public Delegation(java.lang.String alias) {
		this(alias, org.glottotopia.generated.tables.Delegation.DELEGATION);
	}

	private Delegation(java.lang.String alias, org.jooq.Table<org.glottotopia.generated.tables.records.DelegationRecord> aliased) {
		this(alias, aliased, null);
	}

	private Delegation(java.lang.String alias, org.jooq.Table<org.glottotopia.generated.tables.records.DelegationRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.glottotopia.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.glottotopia.generated.tables.records.DelegationRecord, java.lang.Long> getIdentity() {
		return org.glottotopia.generated.Keys.IDENTITY_DELEGATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.glottotopia.generated.tables.records.DelegationRecord> getPrimaryKey() {
		return org.glottotopia.generated.Keys.DELEGATION_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.glottotopia.generated.tables.records.DelegationRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.glottotopia.generated.tables.records.DelegationRecord>>asList(org.glottotopia.generated.Keys.DELEGATION_PKEY, org.glottotopia.generated.Keys.DELEGATION_AREA_ID_TRUSTER_ID_KEY, org.glottotopia.generated.Keys.DELEGATION_ISSUE_ID_TRUSTER_ID_KEY, org.glottotopia.generated.Keys.DELEGATION_UNIT_ID_TRUSTER_ID_KEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.glottotopia.generated.tables.records.DelegationRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.glottotopia.generated.tables.records.DelegationRecord, ?>>asList(org.glottotopia.generated.Keys.DELEGATION__DELEGATION_TRUSTER_ID_FKEY, org.glottotopia.generated.Keys.DELEGATION__DELEGATION_TRUSTEE_ID_FKEY, org.glottotopia.generated.Keys.DELEGATION__DELEGATION_UNIT_ID_FKEY, org.glottotopia.generated.Keys.DELEGATION__DELEGATION_AREA_ID_FKEY, org.glottotopia.generated.Keys.DELEGATION__DELEGATION_ISSUE_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.glottotopia.generated.tables.Delegation as(java.lang.String alias) {
		return new org.glottotopia.generated.tables.Delegation(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.glottotopia.generated.tables.Delegation rename(java.lang.String name) {
		return new org.glottotopia.generated.tables.Delegation(name, null);
	}
}
