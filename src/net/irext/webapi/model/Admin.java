package net.irext.webapi.model;

/**
 * Filename:       Admin.java
 * Revised:        Date: 2017-04-01
 * Revision:       Revision: 1.0
 * <p>
 * Description:    Admin bean
 * <p>
 * Revision log:
 * 2017-04-01: created by strawmanbobi
 */
public class Admin {

    private int id;
    private String userName;
    private String password;
    private String token;
    private String permissions;
    private int adminType;

    public Admin() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    public int getAdminType() {
        return adminType;
    }

    public void setAdminType(int adminType) {
        this.adminType = adminType;
    }
}
