/**
 * This class is generated by jOOQ
 */
package org.liquidfeedback.generated.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RenderedSuggestion implements org.liquidfeedback.generated.tables.interfaces.IRenderedSuggestion {

	private static final long serialVersionUID = -542526056;

	private final java.lang.Long   suggestionId;
	private final java.lang.String format;
	private final java.lang.String content;

	public RenderedSuggestion(
		java.lang.Long   suggestionId,
		java.lang.String format,
		java.lang.String content
	) {
		this.suggestionId = suggestionId;
		this.format = format;
		this.content = content;
	}

	@Override
	public java.lang.Long getSuggestionId() {
		return this.suggestionId;
	}

	@Override
	public java.lang.String getFormat() {
		return this.format;
	}

	@Override
	public java.lang.String getContent() {
		return this.content;
	}
}