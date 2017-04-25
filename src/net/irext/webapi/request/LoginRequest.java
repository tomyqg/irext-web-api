package net.irext.webapi.request;

/**
 * Filename:       LoginRequest.java
 * Revised:        Date: 2017-04-07
 * Revision:       Revision: 1.0
 * <p>
 * Description:    HTTP admin login request
 * <p>
 * Revision log:
 * 2017-04-07: created by strawmanbobi
 */
public class LoginRequest extends BaseRequest {

    private String user_name;
    private String password;

    public LoginRequest(String user_name, String password) {
        this.user_name = user_name;
        this.password = password;
    }

    public LoginRequest() {

    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
