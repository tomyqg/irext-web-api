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

    private String userName;
    private String password;

    public LoginRequest(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public LoginRequest() {

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
