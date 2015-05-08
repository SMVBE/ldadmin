/**
 * This class is generated by jOOQ
 */
package org.liquidfeedback.generated.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RenderedMemberStatementDao extends org.jooq.impl.DAOImpl<org.liquidfeedback.generated.tables.records.RenderedMemberStatementRecord, org.liquidfeedback.generated.tables.pojos.RenderedMemberStatement, org.jooq.Record2<java.lang.Long, java.lang.String>> {

	/**
	 * Create a new RenderedMemberStatementDao without any configuration
	 */
	public RenderedMemberStatementDao() {
		super(org.liquidfeedback.generated.tables.RenderedMemberStatement.RENDERED_MEMBER_STATEMENT, org.liquidfeedback.generated.tables.pojos.RenderedMemberStatement.class);
	}

	/**
	 * Create a new RenderedMemberStatementDao with an attached configuration
	 */
	public RenderedMemberStatementDao(org.jooq.Configuration configuration) {
		super(org.liquidfeedback.generated.tables.RenderedMemberStatement.RENDERED_MEMBER_STATEMENT, org.liquidfeedback.generated.tables.pojos.RenderedMemberStatement.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected org.jooq.Record2<java.lang.Long, java.lang.String> getId(org.liquidfeedback.generated.tables.pojos.RenderedMemberStatement object) {
		return compositeKeyRecord(object.getMemberId(), object.getFormat());
	}

	/**
	 * Fetch records that have <code>member_id IN (values)</code>
	 */
	public java.util.List<org.liquidfeedback.generated.tables.pojos.RenderedMemberStatement> fetchByMemberId(java.lang.Long... values) {
		return fetch(org.liquidfeedback.generated.tables.RenderedMemberStatement.RENDERED_MEMBER_STATEMENT.MEMBER_ID, values);
	}

	/**
	 * Fetch records that have <code>format IN (values)</code>
	 */
	public java.util.List<org.liquidfeedback.generated.tables.pojos.RenderedMemberStatement> fetchByFormat(java.lang.String... values) {
		return fetch(org.liquidfeedback.generated.tables.RenderedMemberStatement.RENDERED_MEMBER_STATEMENT.FORMAT, values);
	}

	/**
	 * Fetch records that have <code>content IN (values)</code>
	 */
	public java.util.List<org.liquidfeedback.generated.tables.pojos.RenderedMemberStatement> fetchByContent(java.lang.String... values) {
		return fetch(org.liquidfeedback.generated.tables.RenderedMemberStatement.RENDERED_MEMBER_STATEMENT.CONTENT, values);
	}
}
