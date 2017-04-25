package net.irext.webapi.request;

/**
 * Filename:       DownloadBinaryRequest.java
 * Revised:        Date: 2017-04-14
 * Revision:       Revision: 1.0
 * <p>
 * Description:    HTTP download IR binary
 * <p>
 * Revision log:
 * 2017-04-14: created by strawmanbobi
 */
public class DownloadBinaryRequest extends BaseRequest {

    private int index_id;

    public DownloadBinaryRequest(int index_id) {
        this.index_id = index_id;
    }

    public DownloadBinaryRequest() {

    }

    public int getIndex_id() {
        return index_id;
    }

    public void setIndex_id(int index_id) {
        this.index_id = index_id;
    }
}
