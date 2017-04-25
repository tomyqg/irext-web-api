package net.irext.webapi.response;

import net.irext.webapi.model.Admin;

/**
 * Filename:       LoginResponse.java
 * Revised:        Date: 2017-03-31
 * Revision:       Revision: 1.0
 * <p>
 * Description:    HTTP Admin login response
 * <p>
 * Revision log:
 * 2017-03-31: created by strawmanbobi
 */
public class LoginResponse extends ServiceResponse {

    private Admin entity;

    public LoginResponse(Status status, Admin admin) {
        super(status);
        this.entity = admin;
    }

    public LoginResponse() {

    }

    public Admin getEntity() {
        return entity;
    }

    public void setEntity(Admin entity) {
        this.entity = entity;
    }
}
