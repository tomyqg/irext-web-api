package net.irext.webapi.model;

/**
 * Filename:       RemoteIndex.java
 * Revised:        Date: 2017-03-28
 * Revision:       Revision: 1.0
 * <p>
 * Description:    RemoteIndex bean
 * <p>
 * Revision log:
 * 2017-03-28: created by strawmanbobi
 */
public class RemoteIndex {

    private int id;
    private int category_id;
    private String category_name;
    private int brand_id;
    private String brand_name;
    private String city_code;
    private String city_name;
    private String operator_id;
    private String operator_name;
    private String protocol;
    private String remote;
    private String remote_map;
    private int status;
    private int sub_cate;
    private int priority;
    private String remote_number;
    private String category_name_tw;
    private String brand_name_tw;
    private String city_name_tw;
    private String operator_name_tw;
    private String binary_md5;
    private String contributor;
    private String update_time;

    public RemoteIndex(int id,
                       int category_id, String category_name, int brand_id, String brand_name,
                       String city_code, String city_name, String operator_id, String operator_name,
                       String protocol, String remote, String remote_map, int status, int sub_cate,
                       int priority, String remote_number,
                       String category_name_tw, String brand_name_tw,
                       String city_name_tw, String operator_name_tw,
                       String binary_md5, String contributor, String update_time) {
        this.id = id;
        this.category_id = category_id;
        this.category_name = category_name;
        this.brand_id = brand_id;
        this.brand_name = brand_name;
        this.city_code = city_code;
        this.city_name = city_name;
        this.operator_id = operator_id;
        this.operator_name = operator_name;
        this.protocol = protocol;
        this.remote = remote;
        this.remote_map = remote_map;
        this.status = status;
        this.sub_cate = sub_cate;
        this.priority = priority;
        this.remote_number = remote_number;
        this.category_name_tw = category_name_tw;
        this.brand_name_tw = brand_name_tw;
        this.city_name_tw = city_name_tw;
        this.operator_name_tw = operator_name_tw;
        this.binary_md5 = binary_md5;
        this.contributor = contributor;
        this.update_time = update_time;
    }

    public RemoteIndex() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
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

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getRemote() {
        return remote;
    }

    public void setRemote(String remote) {
        this.remote = remote;
    }

    public String getRemote_map() {
        return remote_map;
    }

    public void setRemote_map(String remote_map) {
        this.remote_map = remote_map;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getSub_cate() {
        return sub_cate;
    }

    public void setSub_cate(int sub_cate) {
        this.sub_cate = sub_cate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getRemote_number() {
        return remote_number;
    }

    public void setRemote_number(String remote_number) {
        this.remote_number = remote_number;
    }

    public String getCategory_name_tw() {
        return category_name_tw;
    }

    public void setCategory_name_tw(String category_name_tw) {
        this.category_name_tw = category_name_tw;
    }

    public String getBrand_name_tw() {
        return brand_name_tw;
    }

    public void setBrand_name_tw(String brand_name_tw) {
        this.brand_name_tw = brand_name_tw;
    }

    public String getCity_name_tw() {
        return city_name_tw;
    }

    public void setCity_name_tw(String city_name_tw) {
        this.city_name_tw = city_name_tw;
    }

    public String getOperator_name_tw() {
        return operator_name_tw;
    }

    public void setOperator_name_tw(String operator_name_tw) {
        this.operator_name_tw = operator_name_tw;
    }

    public String getBinary_md5() {
        return binary_md5;
    }

    public void setBinary_md5(String binary_md5) {
        this.binary_md5 = binary_md5;
    }

    public String getContributor() {
        return contributor;
    }

    public void setContributor(String contributor) {
        this.contributor = contributor;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }
}
