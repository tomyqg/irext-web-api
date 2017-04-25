package net.irext.webapi.request;

/**
 * Filename:       ListCitiesRequest.java
 * Revised:        Date: 2017-04-07
 * Revision:       Revision: 1.0
 * <p>
 * Description:    HTTP list cities request
 * <p>
 * Revision log:
 * 2017-04-07: created by strawmanbobi
 */
public class ListCitiesRequest extends BaseRequest {

    private String province_prefix;

    public ListCitiesRequest(String province_prefix) {
        this.province_prefix = province_prefix;
    }

    public ListCitiesRequest() {

    }

    public String getProvince_prefix() {
        return province_prefix;
    }

    public void setProvince_prefix(String province_prefix) {
        this.province_prefix = province_prefix;
    }
}
