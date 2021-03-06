/**
 * This class is generated by jOOQ
 */
package de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OpeningDraft implements de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.interfaces.IOpeningDraft {

	private static final long serialVersionUID = 1463804659;

	private final java.lang.Integer  initiativeId;
	private final java.lang.Long     id;
	private final java.sql.Timestamp created;
	private final java.lang.Integer  authorId;
	private final java.lang.String   formattingEngine;
	private final java.lang.String   content;
	private final java.lang.Object   textSearchData;

	public OpeningDraft(
		java.lang.Integer  initiativeId,
		java.lang.Long     id,
		java.sql.Timestamp created,
		java.lang.Integer  authorId,
		java.lang.String   formattingEngine,
		java.lang.String   content,
		java.lang.Object   textSearchData
	) {
		this.initiativeId = initiativeId;
		this.id = id;
		this.created = created;
		this.authorId = authorId;
		this.formattingEngine = formattingEngine;
		this.content = content;
		this.textSearchData = textSearchData;
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
	public java.sql.Timestamp getCreated() {
		return this.created;
	}

	@Override
	public java.lang.Integer getAuthorId() {
		return this.authorId;
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
}
