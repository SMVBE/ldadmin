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
public class Session extends org.jooq.impl.TableImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SessionRecord> {

	private static final long serialVersionUID = 1587510849;

	/**
	 * The singleton instance of <code>session</code>
	 */
	public static final de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Session SESSION = new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Session();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SessionRecord> getRecordType() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SessionRecord.class;
	}

	/**
	 * The column <code>session.ident</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SessionRecord, java.lang.String> IDENT = createField("ident", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>session.additional_secret</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SessionRecord, java.lang.String> ADDITIONAL_SECRET = createField("additional_secret", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>session.expiry</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SessionRecord, java.sql.Timestamp> EXPIRY = createField("expiry", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>session.member_id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SessionRecord, java.lang.Long> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>session.authority</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SessionRecord, java.lang.String> AUTHORITY = createField("authority", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>session.authority_uid</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SessionRecord, java.lang.String> AUTHORITY_UID = createField("authority_uid", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>session.authority_login</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SessionRecord, java.lang.String> AUTHORITY_LOGIN = createField("authority_login", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>session.needs_delegation_check</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SessionRecord, java.lang.Boolean> NEEDS_DELEGATION_CHECK = createField("needs_delegation_check", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>session.lang</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SessionRecord, java.lang.String> LANG = createField("lang", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * Create a <code>session</code> table reference
	 */
	public Session() {
		this("session", null);
	}

	/**
	 * Create an aliased <code>session</code> table reference
	 */
	public Session(java.lang.String alias) {
		this(alias, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Session.SESSION);
	}

	private Session(java.lang.String alias, org.jooq.Table<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SessionRecord> aliased) {
		this(alias, aliased, null);
	}

	private Session(java.lang.String alias, org.jooq.Table<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SessionRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, de.piratenpartei.berlin.ldadmin.dbaccess.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SessionRecord> getPrimaryKey() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.SESSION_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SessionRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SessionRecord>>asList(de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.SESSION_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SessionRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SessionRecord, ?>>asList(de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.SESSION__SESSION_MEMBER_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Session as(java.lang.String alias) {
		return new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Session(alias, this);
	}

	/**
	 * Rename this table
	 */
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Session rename(java.lang.String name) {
		return new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Session(name, null);
	}
}
