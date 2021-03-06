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
public class MemberCountView extends org.jooq.impl.TableImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.MemberCountViewRecord> {

	private static final long serialVersionUID = -190470245;

	/**
	 * The singleton instance of <code>member_count_view</code>
	 */
	public static final de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.MemberCountView MEMBER_COUNT_VIEW = new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.MemberCountView();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.MemberCountViewRecord> getRecordType() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.MemberCountViewRecord.class;
	}

	/**
	 * The column <code>member_count_view.total_count</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.MemberCountViewRecord, java.lang.Long> TOTAL_COUNT = createField("total_count", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>member_count_view</code> table reference
	 */
	public MemberCountView() {
		this("member_count_view", null);
	}

	/**
	 * Create an aliased <code>member_count_view</code> table reference
	 */
	public MemberCountView(java.lang.String alias) {
		this(alias, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.MemberCountView.MEMBER_COUNT_VIEW);
	}

	private MemberCountView(java.lang.String alias, org.jooq.Table<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.MemberCountViewRecord> aliased) {
		this(alias, aliased, null);
	}

	private MemberCountView(java.lang.String alias, org.jooq.Table<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.MemberCountViewRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, de.piratenpartei.berlin.ldadmin.dbaccess.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.MemberCountView as(java.lang.String alias) {
		return new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.MemberCountView(alias, this);
	}

	/**
	 * Rename this table
	 */
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.MemberCountView rename(java.lang.String name) {
		return new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.MemberCountView(name, null);
	}
}
