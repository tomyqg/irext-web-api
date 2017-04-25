package net.irext.webapi.request;

/**
 * Filename:       ListIndexesRequest.java
 * Revised:        Date: 2017-04-12
 * Revision:       Revision: 1.0
 * <p>
 * Description:    HTTP list remote indexes request
 * <p>
 * Revision log:
 * 2017-04-12: created by strawmanbobi
 */
public class ListIndexesRequest extends BaseRequest {

    private int from;
    private int count;
    private int category_id;
    private int brand_id;
    private String city_code;
    private String operator_id;

    public ListIndexesRequest(int from, int count, int category_id, int brand_id,
                              String city_code, String operator_id) {
        this.from = from;
        this.count = count;
        this.category_id = category_id;
        this.brand_id = brand_id;
        this.city_code = city_code;
        this.operator_id = operator_id;
    }

    public ListIndexesRequest() {

    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public String getCity_code() {
        return city_code;
    }

    public void setCity_code(String city_code) {
        this.city_code = city_code;
    }

    public String getOperator_id() {
        return operator_id;
    }

    public void setOperator_id(String operator_id) {
        this.operator_id = operator_id;
    }
}
