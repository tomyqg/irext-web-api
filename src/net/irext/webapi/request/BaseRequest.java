package net.irext.webapi.request;

import com.google.gson.Gson;

/**
 * Filename:       BaseRequest.java
 * Revised:        Date: 2017-04-07
 * Revision:       Revision: 1.0
 * <p>
 * Description:    authentication factors included
 * <p>
 * Revision log:
 * 2017-04-07: created by strawmanbobi
 */
public class BaseRequest {

    private int admin_id;
    private String token;

    public BaseRequest(int adminID, String token) {
        this.admin_id = adminID;
        this.token = token;
    }

    public BaseRequest() {

    }

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String toJson() {
        return new Gson().toJson(this, this.getClass());
    }
}
