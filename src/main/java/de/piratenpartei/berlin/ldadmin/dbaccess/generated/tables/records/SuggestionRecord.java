/**
 * This class is generated by jOOQ
 */
package de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SuggestionRecord extends org.jooq.impl.UpdatableRecordImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SuggestionRecord> implements org.jooq.Record18<java.lang.Integer, java.lang.Long, java.lang.Long, java.sql.Timestamp, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer>, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.interfaces.ISuggestion {

	private static final long serialVersionUID = -1635989444;

	/**
	 * Setter for <code>suggestion.initiative_id</code>.
	 */
	public void setInitiativeId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>suggestion.initiative_id</code>.
	 */
	@Override
	public java.lang.Integer getInitiativeId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>suggestion.id</code>.
	 */
	public void setId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>suggestion.id</code>.
	 */
	@Override
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>suggestion.draft_id</code>.
	 */
	public void setDraftId(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>suggestion.draft_id</code>.
	 */
	@Override
	public java.lang.Long getDraftId() {
		return (java.lang.Long) getValue(2);
	}

	/**
	 * Setter for <code>suggestion.created</code>.
	 */
	public void setCreated(java.sql.Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>suggestion.created</code>.
	 */
	@Override
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>suggestion.author_id</code>.
	 */
	public void setAuthorId(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>suggestion.author_id</code>.
	 */
	@Override
	public java.lang.Integer getAuthorId() {
		return (java.lang.Integer) getValue(4);
	}

	/**
	 * Setter for <code>suggestion.name</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>suggestion.name</code>.
	 */
	@Override
	public java.lang.String getName() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>suggestion.formatting_engine</code>.
	 */
	public void setFormattingEngine(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>suggestion.formatting_engine</code>.
	 */
	@Override
	public java.lang.String getFormattingEngine() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>suggestion.content</code>.
	 */
	public void setContent(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>suggestion.content</code>.
	 */
	@Override
	public java.lang.String getContent() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>suggestion.text_search_data</code>.
	 */
	public void setTextSearchData(java.lang.Object value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>suggestion.text_search_data</code>.
	 */
	@Override
	public java.lang.Object getTextSearchData() {
		return (java.lang.Object) getValue(8);
	}

	/**
	 * Setter for <code>suggestion.minus2_unfulfilled_count</code>.
	 */
	public void setMinus2UnfulfilledCount(java.lang.Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>suggestion.minus2_unfulfilled_count</code>.
	 */
	@Override
	public java.lang.Integer getMinus2UnfulfilledCount() {
		return (java.lang.Integer) getValue(9);
	}

	/**
	 * Setter for <code>suggestion.minus2_fulfilled_count</code>.
	 */
	public void setMinus2FulfilledCount(java.lang.Integer value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>suggestion.minus2_fulfilled_count</code>.
	 */
	@Override
	public java.lang.Integer getMinus2FulfilledCount() {
		return (java.lang.Integer) getValue(10);
	}

	/**
	 * Setter for <code>suggestion.minus1_unfulfilled_count</code>.
	 */
	public void setMinus1UnfulfilledCount(java.lang.Integer value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>suggestion.minus1_unfulfilled_count</code>.
	 */
	@Override
	public java.lang.Integer getMinus1UnfulfilledCount() {
		return (java.lang.Integer) getValue(11);
	}

	/**
	 * Setter for <code>suggestion.minus1_fulfilled_count</code>.
	 */
	public void setMinus1FulfilledCount(java.lang.Integer value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>suggestion.minus1_fulfilled_count</code>.
	 */
	@Override
	public java.lang.Integer getMinus1FulfilledCount() {
		return (java.lang.Integer) getValue(12);
	}

	/**
	 * Setter for <code>suggestion.plus1_unfulfilled_count</code>.
	 */
	public void setPlus1UnfulfilledCount(java.lang.Integer value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>suggestion.plus1_unfulfilled_count</code>.
	 */
	@Override
	public java.lang.Integer getPlus1UnfulfilledCount() {
		return (java.lang.Integer) getValue(13);
	}

	/**
	 * Setter for <code>suggestion.plus1_fulfilled_count</code>.
	 */
	public void setPlus1FulfilledCount(java.lang.Integer value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>suggestion.plus1_fulfilled_count</code>.
	 */
	@Override
	public java.lang.Integer getPlus1FulfilledCount() {
		return (java.lang.Integer) getValue(14);
	}

	/**
	 * Setter for <code>suggestion.plus2_unfulfilled_count</code>.
	 */
	public void setPlus2UnfulfilledCount(java.lang.Integer value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>suggestion.plus2_unfulfilled_count</code>.
	 */
	@Override
	public java.lang.Integer getPlus2UnfulfilledCount() {
		return (java.lang.Integer) getValue(15);
	}

	/**
	 * Setter for <code>suggestion.plus2_fulfilled_count</code>.
	 */
	public void setPlus2FulfilledCount(java.lang.Integer value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>suggestion.plus2_fulfilled_count</code>.
	 */
	@Override
	public java.lang.Integer getPlus2FulfilledCount() {
		return (java.lang.Integer) getValue(16);
	}

	/**
	 * Setter for <code>suggestion.proportional_order</code>.
	 */
	public void setProportionalOrder(java.lang.Integer value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>suggestion.proportional_order</code>.
	 */
	@Override
	public java.lang.Integer getProportionalOrder() {
		return (java.lang.Integer) getValue(17);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record18 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row18<java.lang.Integer, java.lang.Long, java.lang.Long, java.sql.Timestamp, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row18) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row18<java.lang.Integer, java.lang.Long, java.lang.Long, java.sql.Timestamp, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row18) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.INITIATIVE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.DRAFT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.FORMATTING_ENGINE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.CONTENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field9() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.TEXT_SEARCH_DATA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field10() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.MINUS2_UNFULFILLED_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field11() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.MINUS2_FULFILLED_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field12() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.MINUS1_UNFULFILLED_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field13() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.MINUS1_FULFILLED_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field14() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.PLUS1_UNFULFILLED_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field15() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.PLUS1_FULFILLED_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field16() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.PLUS2_UNFULFILLED_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field17() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.PLUS2_FULFILLED_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field18() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION.PROPORTIONAL_ORDER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getInitiativeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value2() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value3() {
		return getDraftId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value4() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getAuthorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getFormattingEngine();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getContent();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value9() {
		return getTextSearchData();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value10() {
		return getMinus2UnfulfilledCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value11() {
		return getMinus2FulfilledCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value12() {
		return getMinus1UnfulfilledCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value13() {
		return getMinus1FulfilledCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value14() {
		return getPlus1UnfulfilledCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value15() {
		return getPlus1FulfilledCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value16() {
		return getPlus2UnfulfilledCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value17() {
		return getPlus2FulfilledCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value18() {
		return getProportionalOrder();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SuggestionRecord value1(java.lang.Integer value) {
		setInitiativeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SuggestionRecord value2(java.lang.Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SuggestionRecord value3(java.lang.Long value) {
		setDraftId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SuggestionRecord value4(java.sql.Timestamp value) {
		setCreated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SuggestionRecord value5(java.lang.Integer value) {
		setAuthorId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SuggestionRecord value6(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SuggestionRecord value7(java.lang.String value) {
		setFormattingEngine(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SuggestionRecord value8(java.lang.String value) {
		setContent(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SuggestionRecord value9(java.lang.Object value) {
		setTextSearchData(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SuggestionRecord value10(java.lang.Integer value) {
		setMinus2UnfulfilledCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SuggestionRecord value11(java.lang.Integer value) {
		setMinus2FulfilledCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SuggestionRecord value12(java.lang.Integer value) {
		setMinus1UnfulfilledCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SuggestionRecord value13(java.lang.Integer value) {
		setMinus1FulfilledCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SuggestionRecord value14(java.lang.Integer value) {
		setPlus1UnfulfilledCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SuggestionRecord value15(java.lang.Integer value) {
		setPlus1FulfilledCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SuggestionRecord value16(java.lang.Integer value) {
		setPlus2UnfulfilledCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SuggestionRecord value17(java.lang.Integer value) {
		setPlus2FulfilledCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SuggestionRecord value18(java.lang.Integer value) {
		setProportionalOrder(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SuggestionRecord values(java.lang.Integer value1, java.lang.Long value2, java.lang.Long value3, java.sql.Timestamp value4, java.lang.Integer value5, java.lang.String value6, java.lang.String value7, java.lang.String value8, java.lang.Object value9, java.lang.Integer value10, java.lang.Integer value11, java.lang.Integer value12, java.lang.Integer value13, java.lang.Integer value14, java.lang.Integer value15, java.lang.Integer value16, java.lang.Integer value17, java.lang.Integer value18) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SuggestionRecord
	 */
	public SuggestionRecord() {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION);
	}

	/**
	 * Create a detached, initialised SuggestionRecord
	 */
	public SuggestionRecord(java.lang.Integer initiativeId, java.lang.Long id, java.lang.Long draftId, java.sql.Timestamp created, java.lang.Integer authorId, java.lang.String name, java.lang.String formattingEngine, java.lang.String content, java.lang.Object textSearchData, java.lang.Integer minus2UnfulfilledCount, java.lang.Integer minus2FulfilledCount, java.lang.Integer minus1UnfulfilledCount, java.lang.Integer minus1FulfilledCount, java.lang.Integer plus1UnfulfilledCount, java.lang.Integer plus1FulfilledCount, java.lang.Integer plus2UnfulfilledCount, java.lang.Integer plus2FulfilledCount, java.lang.Integer proportionalOrder) {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Suggestion.SUGGESTION);

		setValue(0, initiativeId);
		setValue(1, id);
		setValue(2, draftId);
		setValue(3, created);
		setValue(4, authorId);
		setValue(5, name);
		setValue(6, formattingEngine);
		setValue(7, content);
		setValue(8, textSearchData);
		setValue(9, minus2UnfulfilledCount);
		setValue(10, minus2FulfilledCount);
		setValue(11, minus1UnfulfilledCount);
		setValue(12, minus1FulfilledCount);
		setValue(13, plus1UnfulfilledCount);
		setValue(14, plus1FulfilledCount);
		setValue(15, plus2UnfulfilledCount);
		setValue(16, plus2FulfilledCount);
		setValue(17, proportionalOrder);
	}
}
