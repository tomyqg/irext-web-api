package net.irext.webapi.model;

/**
 * Filename:       Category.java
 * Revised:        Date: 2017-03-28
 * Revision:       Revision: 1.0
 * <p>
 * Description:    Category bean
 * <p>
 * Revision log:
 * 2017-03-28: created by strawmanbobi
 */
public class Category {

    private int id;
    private String name;
    private int status;
    private String update_time;
    private String name_en;
    private String name_tw;
    private String contributor;

    public Category(int id, String name, int status, String update_time,
                    String name_en, String name_tw, String contributor) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.update_time = update_time;
        this.name_en = name_en;
        this.name_tw = name_tw;
        this.contributor = contributor;
    }

    public Category() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public String getName_en() {
        return name_en;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }

    public String getName_tw() {
        return name_tw;
    }

    public void setName_tw(String name_tw) {
        this.name_tw = name_tw;
    }

    public String getContributor() {
        return contributor;
    }

    public void setContributor(String contributor) {
        this.contributor = contributor;
    }
}
