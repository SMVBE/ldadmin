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
public class RenderedDraftDao extends org.jooq.impl.DAOImpl<org.liquidfeedback.generated.tables.records.RenderedDraftRecord, org.liquidfeedback.generated.tables.pojos.RenderedDraft, org.jooq.Record2<java.lang.Long, java.lang.String>> {

	/**
	 * Create a new RenderedDraftDao without any configuration
	 */
	public RenderedDraftDao() {
		super(org.liquidfeedback.generated.tables.RenderedDraft.RENDERED_DRAFT, org.liquidfeedback.generated.tables.pojos.RenderedDraft.class);
	}

	/**
	 * Create a new RenderedDraftDao with an attached configuration
	 */
	public RenderedDraftDao(org.jooq.Configuration configuration) {
		super(org.liquidfeedback.generated.tables.RenderedDraft.RENDERED_DRAFT, org.liquidfeedback.generated.tables.pojos.RenderedDraft.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected org.jooq.Record2<java.lang.Long, java.lang.String> getId(org.liquidfeedback.generated.tables.pojos.RenderedDraft object) {
		return compositeKeyRecord(object.getDraftId(), object.getFormat());
	}

	/**
	 * Fetch records that have <code>draft_id IN (values)</code>
	 */
	public java.util.List<org.liquidfeedback.generated.tables.pojos.RenderedDraft> fetchByDraftId(java.lang.Long... values) {
		return fetch(org.liquidfeedback.generated.tables.RenderedDraft.RENDERED_DRAFT.DRAFT_ID, values);
	}

	/**
	 * Fetch records that have <code>format IN (values)</code>
	 */
	public java.util.List<org.liquidfeedback.generated.tables.pojos.RenderedDraft> fetchByFormat(java.lang.String... values) {
		return fetch(org.liquidfeedback.generated.tables.RenderedDraft.RENDERED_DRAFT.FORMAT, values);
	}

	/**
	 * Fetch records that have <code>content IN (values)</code>
	 */
	public java.util.List<org.liquidfeedback.generated.tables.pojos.RenderedDraft> fetchByContent(java.lang.String... values) {
		return fetch(org.liquidfeedback.generated.tables.RenderedDraft.RENDERED_DRAFT.CONTENT, values);
	}
}