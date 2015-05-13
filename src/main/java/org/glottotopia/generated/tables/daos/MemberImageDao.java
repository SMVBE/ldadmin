/**
 * This class is generated by jOOQ
 */
package org.glottotopia.generated.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MemberImageDao extends org.jooq.impl.DAOImpl<org.glottotopia.generated.tables.records.MemberImageRecord, org.glottotopia.generated.tables.pojos.MemberImage, org.jooq.Record3<java.lang.Integer, org.glottotopia.generated.enums.MemberImageType, java.lang.Boolean>> {

	/**
	 * Create a new MemberImageDao without any configuration
	 */
	public MemberImageDao() {
		super(org.glottotopia.generated.tables.MemberImage.MEMBER_IMAGE, org.glottotopia.generated.tables.pojos.MemberImage.class);
	}

	/**
	 * Create a new MemberImageDao with an attached configuration
	 */
	public MemberImageDao(org.jooq.Configuration configuration) {
		super(org.glottotopia.generated.tables.MemberImage.MEMBER_IMAGE, org.glottotopia.generated.tables.pojos.MemberImage.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected org.jooq.Record3<java.lang.Integer, org.glottotopia.generated.enums.MemberImageType, java.lang.Boolean> getId(org.glottotopia.generated.tables.pojos.MemberImage object) {
		return compositeKeyRecord(object.getMemberId(), object.getImageType(), object.getScaled());
	}

	/**
	 * Fetch records that have <code>member_id IN (values)</code>
	 */
	public java.util.List<org.glottotopia.generated.tables.pojos.MemberImage> fetchByMemberId(java.lang.Integer... values) {
		return fetch(org.glottotopia.generated.tables.MemberImage.MEMBER_IMAGE.MEMBER_ID, values);
	}

	/**
	 * Fetch records that have <code>image_type IN (values)</code>
	 */
	public java.util.List<org.glottotopia.generated.tables.pojos.MemberImage> fetchByImageType(org.glottotopia.generated.enums.MemberImageType... values) {
		return fetch(org.glottotopia.generated.tables.MemberImage.MEMBER_IMAGE.IMAGE_TYPE, values);
	}

	/**
	 * Fetch records that have <code>scaled IN (values)</code>
	 */
	public java.util.List<org.glottotopia.generated.tables.pojos.MemberImage> fetchByScaled(java.lang.Boolean... values) {
		return fetch(org.glottotopia.generated.tables.MemberImage.MEMBER_IMAGE.SCALED, values);
	}

	/**
	 * Fetch records that have <code>content_type IN (values)</code>
	 */
	public java.util.List<org.glottotopia.generated.tables.pojos.MemberImage> fetchByContentType(java.lang.String... values) {
		return fetch(org.glottotopia.generated.tables.MemberImage.MEMBER_IMAGE.CONTENT_TYPE, values);
	}

	/**
	 * Fetch records that have <code>data IN (values)</code>
	 */
	public java.util.List<org.glottotopia.generated.tables.pojos.MemberImage> fetchByData(byte[]... values) {
		return fetch(org.glottotopia.generated.tables.MemberImage.MEMBER_IMAGE.DATA, values);
	}
}
