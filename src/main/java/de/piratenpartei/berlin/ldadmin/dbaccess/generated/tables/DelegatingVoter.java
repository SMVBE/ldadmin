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
public class DelegatingVoter extends org.jooq.impl.TableImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DelegatingVoterRecord> {

	private static final long serialVersionUID = -2008413453;

	/**
	 * The singleton instance of <code>delegating_voter</code>
	 */
	public static final de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.DelegatingVoter DELEGATING_VOTER = new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.DelegatingVoter();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DelegatingVoterRecord> getRecordType() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DelegatingVoterRecord.class;
	}

	/**
	 * The column <code>delegating_voter.issue_id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DelegatingVoterRecord, java.lang.Integer> ISSUE_ID = createField("issue_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>delegating_voter.member_id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DelegatingVoterRecord, java.lang.Integer> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>delegating_voter.weight</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DelegatingVoterRecord, java.lang.Integer> WEIGHT = createField("weight", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>delegating_voter.scope</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DelegatingVoterRecord, de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationScope> SCOPE = createField("scope", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationScope.class), this, "");

	/**
	 * The column <code>delegating_voter.delegate_member_ids</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DelegatingVoterRecord, java.lang.Integer[]> DELEGATE_MEMBER_IDS = createField("delegate_member_ids", org.jooq.impl.SQLDataType.INTEGER.getArrayDataType(), this, "");

	/**
	 * Create a <code>delegating_voter</code> table reference
	 */
	public DelegatingVoter() {
		this("delegating_voter", null);
	}

	/**
	 * Create an aliased <code>delegating_voter</code> table reference
	 */
	public DelegatingVoter(java.lang.String alias) {
		this(alias, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.DelegatingVoter.DELEGATING_VOTER);
	}

	private DelegatingVoter(java.lang.String alias, org.jooq.Table<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DelegatingVoterRecord> aliased) {
		this(alias, aliased, null);
	}

	private DelegatingVoter(java.lang.String alias, org.jooq.Table<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DelegatingVoterRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, de.piratenpartei.berlin.ldadmin.dbaccess.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DelegatingVoterRecord> getPrimaryKey() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.DELEGATING_VOTER_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DelegatingVoterRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DelegatingVoterRecord>>asList(de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.DELEGATING_VOTER_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DelegatingVoterRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DelegatingVoterRecord, ?>>asList(de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.DELEGATING_VOTER__DELEGATING_VOTER_ISSUE_ID_FKEY, de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.DELEGATING_VOTER__DELEGATING_VOTER_MEMBER_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.DelegatingVoter as(java.lang.String alias) {
		return new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.DelegatingVoter(alias, this);
	}

	/**
	 * Rename this table
	 */
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.DelegatingVoter rename(java.lang.String name) {
		return new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.DelegatingVoter(name, null);
	}
}
