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
public class EventSeenByMember extends org.jooq.impl.TableImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventSeenByMemberRecord> {

	private static final long serialVersionUID = 1653860278;

	/**
	 * The singleton instance of <code>event_seen_by_member</code>
	 */
	public static final de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.EventSeenByMember EVENT_SEEN_BY_MEMBER = new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.EventSeenByMember();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventSeenByMemberRecord> getRecordType() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventSeenByMemberRecord.class;
	}

	/**
	 * The column <code>event_seen_by_member.seen_by_member_id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventSeenByMemberRecord, java.lang.Integer> SEEN_BY_MEMBER_ID = createField("seen_by_member_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>event_seen_by_member.notify_level</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventSeenByMemberRecord, de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.NotifyLevel> NOTIFY_LEVEL = createField("notify_level", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.NotifyLevel.class), this, "");

	/**
	 * The column <code>event_seen_by_member.id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventSeenByMemberRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>event_seen_by_member.occurrence</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventSeenByMemberRecord, java.sql.Timestamp> OCCURRENCE = createField("occurrence", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>event_seen_by_member.event</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventSeenByMemberRecord, de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.EventType> EVENT = createField("event", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.EventType.class), this, "");

	/**
	 * The column <code>event_seen_by_member.member_id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventSeenByMemberRecord, java.lang.Integer> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>event_seen_by_member.issue_id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventSeenByMemberRecord, java.lang.Integer> ISSUE_ID = createField("issue_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>event_seen_by_member.state</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventSeenByMemberRecord, de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.IssueState> STATE = createField("state", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.IssueState.class), this, "");

	/**
	 * The column <code>event_seen_by_member.initiative_id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventSeenByMemberRecord, java.lang.Integer> INITIATIVE_ID = createField("initiative_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>event_seen_by_member.draft_id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventSeenByMemberRecord, java.lang.Long> DRAFT_ID = createField("draft_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>event_seen_by_member.suggestion_id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventSeenByMemberRecord, java.lang.Long> SUGGESTION_ID = createField("suggestion_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>event_seen_by_member</code> table reference
	 */
	public EventSeenByMember() {
		this("event_seen_by_member", null);
	}

	/**
	 * Create an aliased <code>event_seen_by_member</code> table reference
	 */
	public EventSeenByMember(java.lang.String alias) {
		this(alias, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.EventSeenByMember.EVENT_SEEN_BY_MEMBER);
	}

	private EventSeenByMember(java.lang.String alias, org.jooq.Table<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventSeenByMemberRecord> aliased) {
		this(alias, aliased, null);
	}

	private EventSeenByMember(java.lang.String alias, org.jooq.Table<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.EventSeenByMemberRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, de.piratenpartei.berlin.ldadmin.dbaccess.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.EventSeenByMember as(java.lang.String alias) {
		return new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.EventSeenByMember(alias, this);
	}

	/**
	 * Rename this table
	 */
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.EventSeenByMember rename(java.lang.String name) {
		return new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.EventSeenByMember(name, null);
	}
}