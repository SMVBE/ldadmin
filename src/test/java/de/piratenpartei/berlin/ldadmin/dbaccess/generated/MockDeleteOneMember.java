/**
 * 
 */
package de.piratenpartei.berlin.ldadmin.dbaccess.generated;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.env.StandardEnvironment;

import de.piratenpartei.berlin.ldadmin.dbaccess.generated.routines.DeleteMember;
import de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.daos.MemberDao;
import de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Member;

/**
 * @author Thomas
 *
 */
@PropertySource("classpath:application.properties")
public class MockDeleteOneMember {

	private static final Logger log = Logger
			.getLogger(MockDeleteOneMember.class);

	@Resource
	public static Environment environment;

	public MockDeleteOneMember() {
		log.info("");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection conn = null;
		log.info("");
		environment = new StandardEnvironment();

		String userName = environment.getRequiredProperty("ldadmin.lf.db.user");
		String password = environment
				.getRequiredProperty("ldadmin.lf.db.password");
		String url = environment.getRequiredProperty("ldadmin.lf.db.url");
		log.info("" + userName + "  " + url);
		try {
			log.info("");
			Class.forName("org.postgresql.Driver").newInstance();
			log.info("");
			conn = DriverManager.getConnection(url, userName, password);
		} catch (Exception e) {
			// For the sake of this tutorial, let's keep exception handling
			// simple
			e.printStackTrace();
		} finally {
			log.info("");
			if (conn != null) {
				try {
					log.info("");
					MemberDao mdao = new MemberDao();
					DSLContext dsl = DSL.using(conn, SQLDialect.POSTGRES);
					mdao.setConfiguration(dsl.configuration());

					Member mbr = mdao
							.fetchOneByIdentification("UID 15,Bönn,1.1.2014");
					// ("UID 3,Bönn,1.1.2014");
					log.info(mbr.getNotifyEmail());
					DeleteMember dm = new DeleteMember();
					dm.setMemberIdP(mbr.getId());
					log.info(dm.execute(dsl.configuration()) + mbr.getEmail()
							+ "UID 15,Bönn,1.1.2014");
					mbr = mdao.fetchOneById(70);

					log.info(mbr.getNotifyEmail());
					// // list all
					// Result<Record> result = dsl.select().from(Tables.MEMBER)
					// .fetch();
					// Integer tobedeleted = 0;
					//
					// for (Record r : result) {
					// log.info(""+r.toString());
					// Member m = r.into(Member.class);
					// tobedeleted = m.getId();
					// log.warn(m.getId());
					// // log.info(m.getName());
					// // log.info(m.getLogin());
					// }
					// // dsl.delete(Tables.MEMBER)
					// // .where(Tables.MEMBER.ID.equal(tobedeleted))
					// // .execute();
					// result = dsl.select().from(Tables.MEMBER).fetch();
					// log.info(result.size());
					// MemberDao mdao = new MemberDao();
					// mdao.setConfiguration(dsl.configuration());
					// Member admin = mdao.fetchOneById(1);
					//
					// log.info(admin.getId());
					// log.info(admin.getLogin());
					// log.info(admin.getName());
					//
					// mdao.deleteById(16);
					// // DeleteMember dm = new DeleteMember();
					// // dm.setMemberIdP(2);
					// // log.info(dm.execute(dsl.configuration()));
					// // log.info(mdao.fetchOneById(2));
					//
					// //
					// log.info(dsl.update(Tables.MEMBER).set(Tables.MEMBER.NAME,
					// // "Thomas4")
					// // .where(Tables.MEMBER.ID.equal(2)).execute());
					// //
					// log.info(dsl.update(Tables.MEMBER).set(Tables.MEMBER.LOGIN,
					// // "Thomas3")
					// // .where(Tables.MEMBER.ID.equal(2)).execute());

					conn.close();
				} catch (SQLException ignore) {
					log.info(ignore.getLocalizedMessage());
					ignore.printStackTrace();
				}
			}
		}

	}

}
