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
public class NotificationSent implements org.glottotopia.generated.tables.interfaces.INotificationSent {

	private static final long serialVersionUID = -376990822;

	private final java.lang.Long eventId;

	public NotificationSent(
		java.lang.Long eventId
	) {
		this.eventId = eventId;
	}

	@Override
	public java.lang.Long getEventId() {
		return this.eventId;
	}
}
