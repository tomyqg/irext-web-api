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
    private String user_name;
    private String password;
    private String token;
    private String permissions;
    private int admin_type;

    public Admin() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getAdmin_type() {
        return admin_type;
    }

    public void setAdmin_type(int admin_type) {
        this.admin_type = admin_type;
    }
}
