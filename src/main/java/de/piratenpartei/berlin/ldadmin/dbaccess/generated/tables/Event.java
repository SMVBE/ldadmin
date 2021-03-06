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
public class Event extends org.jooq.impl.TableImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventRecord> {

	private static final long serialVersionUID = -1934064148;

	/**
	 * The singleton instance of <code>event</code>
	 */
	public static final de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Event EVENT = new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Event();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventRecord> getRecordType() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventRecord.class;
	}

	/**
	 * The column <code>event.id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>event.occurrence</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventRecord, java.sql.Timestamp> OCCURRENCE = createField("occurrence", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>event.event</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventRecord, de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.EventType> EVENT_ = createField("event", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.EventType.class), this, "");

	/**
	 * The column <code>event.member_id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventRecord, java.lang.Integer> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>event.issue_id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventRecord, java.lang.Integer> ISSUE_ID = createField("issue_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>event.state</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventRecord, de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.IssueState> STATE = createField("state", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.IssueState.class), this, "");

	/**
	 * The column <code>event.initiative_id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventRecord, java.lang.Integer> INITIATIVE_ID = createField("initiative_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>event.draft_id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventRecord, java.lang.Long> DRAFT_ID = createField("draft_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>event.suggestion_id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventRecord, java.lang.Long> SUGGESTION_ID = createField("suggestion_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>event</code> table reference
	 */
	public Event() {
		this("event", null);
	}

	/**
	 * Create an aliased <code>event</code> table reference
	 */
	public Event(java.lang.String alias) {
		this(alias, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Event.EVENT);
	}

	private Event(java.lang.String alias, org.jooq.Table<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventRecord> aliased) {
		this(alias, aliased, null);
	}

	private Event(java.lang.String alias, org.jooq.Table<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, de.piratenpartei.berlin.ldadmin.dbaccess.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventRecord, java.lang.Long> getIdentity() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.IDENTITY_EVENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventRecord> getPrimaryKey() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.EVENT_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventRecord>>asList(de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.EVENT_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventRecord, ?>>asList(de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.EVENT__EVENT_MEMBER_ID_FKEY, de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.EVENT__EVENT_ISSUE_ID_FKEY, de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.EVENT__EVENT_ISSUE_ID_FKEY1, de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.EVENT__EVENT_INITIATIVE_ID_FKEY, de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.EVENT__EVENT_INITIATIVE_ID_FKEY1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Event as(java.lang.String alias) {
		return new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Event(alias, this);
	}

	/**
	 * Rename this table
	 */
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Event rename(java.lang.String name) {
		return new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Event(name, null);
	}
}
