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
public class DirectPopulationSnapshot extends org.jooq.impl.TableImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DirectPopulationSnapshotRecord> {

	private static final long serialVersionUID = -621315335;

	/**
	 * The singleton instance of <code>direct_population_snapshot</code>
	 */
	public static final de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.DirectPopulationSnapshot DIRECT_POPULATION_SNAPSHOT = new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.DirectPopulationSnapshot();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DirectPopulationSnapshotRecord> getRecordType() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DirectPopulationSnapshotRecord.class;
	}

	/**
	 * The column <code>direct_population_snapshot.issue_id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DirectPopulationSnapshotRecord, java.lang.Integer> ISSUE_ID = createField("issue_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>direct_population_snapshot.event</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DirectPopulationSnapshotRecord, de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.SnapshotEvent> EVENT = createField("event", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.SnapshotEvent.class), this, "");

	/**
	 * The column <code>direct_population_snapshot.member_id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DirectPopulationSnapshotRecord, java.lang.Integer> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>direct_population_snapshot.weight</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DirectPopulationSnapshotRecord, java.lang.Integer> WEIGHT = createField("weight", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>direct_population_snapshot</code> table reference
	 */
	public DirectPopulationSnapshot() {
		this("direct_population_snapshot", null);
	}

	/**
	 * Create an aliased <code>direct_population_snapshot</code> table reference
	 */
	public DirectPopulationSnapshot(java.lang.String alias) {
		this(alias, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.DirectPopulationSnapshot.DIRECT_POPULATION_SNAPSHOT);
	}

	private DirectPopulationSnapshot(java.lang.String alias, org.jooq.Table<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DirectPopulationSnapshotRecord> aliased) {
		this(alias, aliased, null);
	}

	private DirectPopulationSnapshot(java.lang.String alias, org.jooq.Table<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DirectPopulationSnapshotRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, de.piratenpartei.berlin.ldadmin.dbaccess.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DirectPopulationSnapshotRecord> getPrimaryKey() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.DIRECT_POPULATION_SNAPSHOT_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DirectPopulationSnapshotRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DirectPopulationSnapshotRecord>>asList(de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.DIRECT_POPULATION_SNAPSHOT_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DirectPopulationSnapshotRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DirectPopulationSnapshotRecord, ?>>asList(de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.DIRECT_POPULATION_SNAPSHOT__DIRECT_POPULATION_SNAPSHOT_ISSUE_ID_FKEY, de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.DIRECT_POPULATION_SNAPSHOT__DIRECT_POPULATION_SNAPSHOT_MEMBER_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.DirectPopulationSnapshot as(java.lang.String alias) {
		return new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.DirectPopulationSnapshot(alias, this);
	}

	/**
	 * Rename this table
	 */
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.DirectPopulationSnapshot rename(java.lang.String name) {
		return new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.DirectPopulationSnapshot(name, null);
	}
}
