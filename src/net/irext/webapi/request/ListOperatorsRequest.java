package net.irext.webapi.request;

/**
 * Filename:       ListOperatorsRequest.java
 * Revised:        Date: 2017-04-10
 * Revision:       Revision: 1.0
 * <p>
 * Description:    HTTP list STB operators request
 * <p>
 * Revision log:
 * 2017-04-10: created by strawmanbobi
 */
public class ListOperatorsRequest extends BaseRequest {

    private int from;
    private int count;
    private String city_code;

    public ListOperatorsRequest(int from, int count, String city_code) {
        this.from = from;
        this.count = count;
        this.city_code = city_code;
    }

    public ListOperatorsRequest() {

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

    public String getCity_code() {
        return city_code;
    }

    public void setCity_code(String city_code) {
        this.city_code = city_code;
    }
}
