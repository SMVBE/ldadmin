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
public class RenderedMemberStatement implements org.liquidfeedback.generated.tables.interfaces.IRenderedMemberStatement {

	private static final long serialVersionUID = 1799088795;

	private final java.lang.Long   memberId;
	private final java.lang.String format;
	private final java.lang.String content;

	public RenderedMemberStatement(
		java.lang.Long   memberId,
		java.lang.String format,
		java.lang.String content
	) {
		this.memberId = memberId;
		this.format = format;
		this.content = content;
	}

	@Override
	public java.lang.Long getMemberId() {
		return this.memberId;
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