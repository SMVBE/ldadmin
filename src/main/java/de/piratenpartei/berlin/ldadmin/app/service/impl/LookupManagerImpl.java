package de.piratenpartei.berlin.ldadmin.app.service.impl;

import de.piratenpartei.berlin.ldadmin.app.dao.LookupDao;
import de.piratenpartei.berlin.ldadmin.app.model.LabelValue;
import de.piratenpartei.berlin.ldadmin.app.model.Role;
import de.piratenpartei.berlin.ldadmin.app.service.LookupManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * Implementation of LookupManager interface to talk to the persistence layer.
 *
 * @author <a href="mailto:matt@raibledesigns.com">Matt Raible</a>
 */
@Service("lookupManager")
public class LookupManagerImpl implements LookupManager {
    @Autowired
    LookupDao dao;

    /**
     * {@inheritDoc}
     */
    public List<LabelValue> getAllRoles() {
        List<Role> roles = dao.getRoles();
        List<LabelValue> list = new ArrayList<LabelValue>();

        for (Role role1 : roles) {
            list.add(new LabelValue(role1.getName(), role1.getName()));
        }

        return list;
    }
}
