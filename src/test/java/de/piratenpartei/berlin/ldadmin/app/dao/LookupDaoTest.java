package de.piratenpartei.berlin.ldadmin.app.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import de.piratenpartei.berlin.ldadmin.app.dao.LookupDao;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * This class tests the current LookupDao implementation class
 * @author mraible
 */
public class LookupDaoTest extends BaseDaoTestCase {
    @Autowired
    LookupDao lookupDao;

    @Test
    public void testGetRoles() {
        List roles = lookupDao.getRoles();
        log.debug(roles);
        assertTrue(roles.size() > 0);
    }
}