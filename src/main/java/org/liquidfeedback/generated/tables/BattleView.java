/**
 * This class is generated by jOOQ
 */
package org.liquidfeedback.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BattleView extends org.jooq.impl.TableImpl<org.liquidfeedback.generated.tables.records.BattleViewRecord> {

	private static final long serialVersionUID = -1155316444;

	/**
	 * The singleton instance of <code>battle_view</code>
	 */
	public static final org.liquidfeedback.generated.tables.BattleView BATTLE_VIEW = new org.liquidfeedback.generated.tables.BattleView();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.liquidfeedback.generated.tables.records.BattleViewRecord> getRecordType() {
		return org.liquidfeedback.generated.tables.records.BattleViewRecord.class;
	}

	/**
	 * The column <code>battle_view.issue_id</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.BattleViewRecord, java.lang.Integer> ISSUE_ID = createField("issue_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>battle_view.winning_initiative_id</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.BattleViewRecord, java.lang.Integer> WINNING_INITIATIVE_ID = createField("winning_initiative_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>battle_view.losing_initiative_id</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.BattleViewRecord, java.lang.Integer> LOSING_INITIATIVE_ID = createField("losing_initiative_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>battle_view.count</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.BattleViewRecord, java.lang.Long> COUNT = createField("count", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>battle_view</code> table reference
	 */
	public BattleView() {
		this("battle_view", null);
	}

	/**
	 * Create an aliased <code>battle_view</code> table reference
	 */
	public BattleView(java.lang.String alias) {
		this(alias, org.liquidfeedback.generated.tables.BattleView.BATTLE_VIEW);
	}

	private BattleView(java.lang.String alias, org.jooq.Table<org.liquidfeedback.generated.tables.records.BattleViewRecord> aliased) {
		this(alias, aliased, null);
	}

	private BattleView(java.lang.String alias, org.jooq.Table<org.liquidfeedback.generated.tables.records.BattleViewRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.liquidfeedback.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.liquidfeedback.generated.tables.BattleView as(java.lang.String alias) {
		return new org.liquidfeedback.generated.tables.BattleView(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.liquidfeedback.generated.tables.BattleView rename(java.lang.String name) {
		return new org.liquidfeedback.generated.tables.BattleView(name, null);
	}
}