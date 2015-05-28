package de.piratenpartei.berlin.ldadmin.app.service.impl;

import de.piratenpartei.berlin.ldadmin.app.model.User;


public interface PasswordTokenManager {

    /**
     * {@inheritDoc}
     */
    String generateRecoveryToken(User user);

    /**
     * {@inheritDoc}
     */
    boolean isRecoveryTokenValid(User user, String token);

    void invalidateRecoveryToken(User user, String token);
}