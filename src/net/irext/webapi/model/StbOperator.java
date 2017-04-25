package net.irext.webapi.model;

/**
 * Filename:       StbOperator.java
 * Revised:        Date: 2017-03-28
 * Revision:       Revision: 1.0
 * <p>
 * Description:    StbOperator bean
 * <p>
 * Revision log:
 * 2017-03-28: created by strawmanbobi
 */
public class StbOperator {

    private int id;
    private String operator_id;
    private String operator_name;
    private String city_code;
    private String city_name;
    private int status;
    private String operator_name_tw;

    public StbOperator(int id, String operator_id, String operator_name,
                       String city_code, String city_name, int status, String operator_name_tw) {
        this.id = id;
        this.operator_id = operator_id;
        this.operator_name = operator_name;
        this.city_code = city_code;
        this.city_name = city_name;
        this.status = status;
        this.operator_name_tw = operator_name_tw;
    }

    public StbOperator() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOperator_id() {
        return operator_id;
    }

    public void setOperator_id(String operator_id) {
        this.operator_id = operator_id;
    }

    public String getOperator_name() {
        return operator_name;
    }

    public void setOperator_name(String operator_name) {
        this.operator_name = operator_name;
    }

    public String getCity_code() {
        return city_code;
    }

    public void setCity_code(String city_code) {
        this.city_code = city_code;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getOperator_name_tw() {
        return operator_name_tw;
    }

    public void setOperator_name_tw(String operator_name_tw) {
        this.operator_name_tw = operator_name_tw;
    }
}
