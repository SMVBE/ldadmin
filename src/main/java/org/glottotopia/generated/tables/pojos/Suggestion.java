/**
 * This class is generated by jOOQ
 */
package org.glottotopia.generated.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Suggestion implements org.glottotopia.generated.tables.interfaces.ISuggestion {

	private static final long serialVersionUID = -184861972;

	private final java.lang.Integer  initiativeId;
	private final java.lang.Long     id;
	private final java.lang.Long     draftId;
	private final java.sql.Timestamp created;
	private final java.lang.Integer  authorId;
	private final java.lang.String   name;
	private final java.lang.String   formattingEngine;
	private final java.lang.String   content;
	private final java.lang.Object   textSearchData;
	private final java.lang.Integer  minus2UnfulfilledCount;
	private final java.lang.Integer  minus2FulfilledCount;
	private final java.lang.Integer  minus1UnfulfilledCount;
	private final java.lang.Integer  minus1FulfilledCount;
	private final java.lang.Integer  plus1UnfulfilledCount;
	private final java.lang.Integer  plus1FulfilledCount;
	private final java.lang.Integer  plus2UnfulfilledCount;
	private final java.lang.Integer  plus2FulfilledCount;
	private final java.lang.Integer  proportionalOrder;

	public Suggestion(
		java.lang.Integer  initiativeId,
		java.lang.Long     id,
		java.lang.Long     draftId,
		java.sql.Timestamp created,
		java.lang.Integer  authorId,
		java.lang.String   name,
		java.lang.String   formattingEngine,
		java.lang.String   content,
		java.lang.Object   textSearchData,
		java.lang.Integer  minus2UnfulfilledCount,
		java.lang.Integer  minus2FulfilledCount,
		java.lang.Integer  minus1UnfulfilledCount,
		java.lang.Integer  minus1FulfilledCount,
		java.lang.Integer  plus1UnfulfilledCount,
		java.lang.Integer  plus1FulfilledCount,
		java.lang.Integer  plus2UnfulfilledCount,
		java.lang.Integer  plus2FulfilledCount,
		java.lang.Integer  proportionalOrder
	) {
		this.initiativeId = initiativeId;
		this.id = id;
		this.draftId = draftId;
		this.created = created;
		this.authorId = authorId;
		this.name = name;
		this.formattingEngine = formattingEngine;
		this.content = content;
		this.textSearchData = textSearchData;
		this.minus2UnfulfilledCount = minus2UnfulfilledCount;
		this.minus2FulfilledCount = minus2FulfilledCount;
		this.minus1UnfulfilledCount = minus1UnfulfilledCount;
		this.minus1FulfilledCount = minus1FulfilledCount;
		this.plus1UnfulfilledCount = plus1UnfulfilledCount;
		this.plus1FulfilledCount = plus1FulfilledCount;
		this.plus2UnfulfilledCount = plus2UnfulfilledCount;
		this.plus2FulfilledCount = plus2FulfilledCount;
		this.proportionalOrder = proportionalOrder;
	}

	@Override
	public java.lang.Integer getInitiativeId() {
		return this.initiativeId;
	}

	@Override
	public java.lang.Long getId() {
		return this.id;
	}

	@Override
	public java.lang.Long getDraftId() {
		return this.draftId;
	}

	@Override
	public java.sql.Timestamp getCreated() {
		return this.created;
	}

	@Override
	public java.lang.Integer getAuthorId() {
		return this.authorId;
	}

	@Override
	public java.lang.String getName() {
		return this.name;
	}

	@Override
	public java.lang.String getFormattingEngine() {
		return this.formattingEngine;
	}

	@Override
	public java.lang.String getContent() {
		return this.content;
	}

	@Override
	public java.lang.Object getTextSearchData() {
		return this.textSearchData;
	}

	@Override
	public java.lang.Integer getMinus2UnfulfilledCount() {
		return this.minus2UnfulfilledCount;
	}

	@Override
	public java.lang.Integer getMinus2FulfilledCount() {
		return this.minus2FulfilledCount;
	}

	@Override
	public java.lang.Integer getMinus1UnfulfilledCount() {
		return this.minus1UnfulfilledCount;
	}

	@Override
	public java.lang.Integer getMinus1FulfilledCount() {
		return this.minus1FulfilledCount;
	}

	@Override
	public java.lang.Integer getPlus1UnfulfilledCount() {
		return this.plus1UnfulfilledCount;
	}

	@Override
	public java.lang.Integer getPlus1FulfilledCount() {
		return this.plus1FulfilledCount;
	}

	@Override
	public java.lang.Integer getPlus2UnfulfilledCount() {
		return this.plus2UnfulfilledCount;
	}

	@Override
	public java.lang.Integer getPlus2FulfilledCount() {
		return this.plus2FulfilledCount;
	}

	@Override
	public java.lang.Integer getProportionalOrder() {
		return this.proportionalOrder;
	}
}
