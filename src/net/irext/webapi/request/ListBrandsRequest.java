package net.irext.webapi.request;

/**
 * Filename:       ListBrandsRequest.java
 * Revised:        Date: 2017-04-07
 * Revision:       Revision: 1.0
 * <p>
 * Description:    HTTP list brands request
 * <p>
 * Revision log:
 * 2017-04-07: created by strawmanbobi
 */
public class ListBrandsRequest extends BaseRequest {

    private int category_id;
    private int from;
    private int count;

    public ListBrandsRequest(int category_id, int from, int count) {
        this.category_id = category_id;
        this.from = from;
        this.count = count;
    }

    public ListBrandsRequest() {

    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
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
}
