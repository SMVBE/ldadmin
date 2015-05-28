/**
 * This class is generated by jOOQ
 */
package de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SuggestionDao extends org.jooq.impl.DAOImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SuggestionRecord, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Suggestion, java.lang.Long> {

	/**
	 * Create a new SuggestionDao without any configuration
	 */
	public SuggestionDao() {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Suggestion.class);
	}

	/**
	 * Create a new SuggestionDao with an attached configuration
	 */
	public SuggestionDao(org.jooq.Configuration configuration) {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Suggestion.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Suggestion object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>initiative_id IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Suggestion> fetchByInitiativeId(java.lang.Integer... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.INITIATIVE_ID, values);
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Suggestion> fetchById(java.lang.Long... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Suggestion fetchOneById(java.lang.Long value) {
		return fetchOne(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.ID, value);
	}

	/**
	 * Fetch records that have <code>draft_id IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Suggestion> fetchByDraftId(java.lang.Long... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.DRAFT_ID, values);
	}

	/**
	 * Fetch records that have <code>created IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Suggestion> fetchByCreated(java.sql.Timestamp... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.CREATED, values);
	}

	/**
	 * Fetch records that have <code>author_id IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Suggestion> fetchByAuthorId(java.lang.Integer... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.AUTHOR_ID, values);
	}

	/**
	 * Fetch records that have <code>name IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Suggestion> fetchByName(java.lang.String... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.NAME, values);
	}

	/**
	 * Fetch records that have <code>formatting_engine IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Suggestion> fetchByFormattingEngine(java.lang.String... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.FORMATTING_ENGINE, values);
	}

	/**
	 * Fetch records that have <code>content IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Suggestion> fetchByContent(java.lang.String... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.CONTENT, values);
	}

	/**
	 * Fetch records that have <code>text_search_data IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Suggestion> fetchByTextSearchData(java.lang.Object... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.TEXT_SEARCH_DATA, values);
	}

	/**
	 * Fetch records that have <code>minus2_unfulfilled_count IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Suggestion> fetchByMinus2UnfulfilledCount(java.lang.Integer... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.MINUS2_UNFULFILLED_COUNT, values);
	}

	/**
	 * Fetch records that have <code>minus2_fulfilled_count IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Suggestion> fetchByMinus2FulfilledCount(java.lang.Integer... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.MINUS2_FULFILLED_COUNT, values);
	}

	/**
	 * Fetch records that have <code>minus1_unfulfilled_count IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Suggestion> fetchByMinus1UnfulfilledCount(java.lang.Integer... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.MINUS1_UNFULFILLED_COUNT, values);
	}

	/**
	 * Fetch records that have <code>minus1_fulfilled_count IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Suggestion> fetchByMinus1FulfilledCount(java.lang.Integer... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.MINUS1_FULFILLED_COUNT, values);
	}

	/**
	 * Fetch records that have <code>plus1_unfulfilled_count IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Suggestion> fetchByPlus1UnfulfilledCount(java.lang.Integer... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.PLUS1_UNFULFILLED_COUNT, values);
	}

	/**
	 * Fetch records that have <code>plus1_fulfilled_count IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Suggestion> fetchByPlus1FulfilledCount(java.lang.Integer... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.PLUS1_FULFILLED_COUNT, values);
	}

	/**
	 * Fetch records that have <code>plus2_unfulfilled_count IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Suggestion> fetchByPlus2UnfulfilledCount(java.lang.Integer... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.PLUS2_UNFULFILLED_COUNT, values);
	}

	/**
	 * Fetch records that have <code>plus2_fulfilled_count IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Suggestion> fetchByPlus2FulfilledCount(java.lang.Integer... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.PLUS2_FULFILLED_COUNT, values);
	}

	/**
	 * Fetch records that have <code>proportional_order IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Suggestion> fetchByProportionalOrder(java.lang.Integer... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.PROPORTIONAL_ORDER, values);
	}
}