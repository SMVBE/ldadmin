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
public class IssueSettingDao extends org.jooq.impl.DAOImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.IssueSettingRecord, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.IssueSetting, org.jooq.Record3<java.lang.Integer, java.lang.String, java.lang.Integer>> {

	/**
	 * Create a new IssueSettingDao without any configuration
	 */
	public IssueSettingDao() {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueSetting.ISSUE_SETTING, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.IssueSetting.class);
	}

	/**
	 * Create a new IssueSettingDao with an attached configuration
	 */
	public IssueSettingDao(org.jooq.Configuration configuration) {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueSetting.ISSUE_SETTING, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.IssueSetting.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected org.jooq.Record3<java.lang.Integer, java.lang.String, java.lang.Integer> getId(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.IssueSetting object) {
		return compositeKeyRecord(object.getMemberId(), object.getKey(), object.getIssueId());
	}

	/**
	 * Fetch records that have <code>member_id IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.IssueSetting> fetchByMemberId(java.lang.Integer... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueSetting.ISSUE_SETTING.MEMBER_ID, values);
	}

	/**
	 * Fetch records that have <code>key IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.IssueSetting> fetchByKey(java.lang.String... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueSetting.ISSUE_SETTING.KEY, values);
	}

	/**
	 * Fetch records that have <code>issue_id IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.IssueSetting> fetchByIssueId(java.lang.Integer... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueSetting.ISSUE_SETTING.ISSUE_ID, values);
	}

	/**
	 * Fetch records that have <code>value IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.IssueSetting> fetchByValue(java.lang.String... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueSetting.ISSUE_SETTING.VALUE, values);
	}
}