package net.irext.webapi.model;

/**
 * Filename:       Brand.java
 * Revised:        Date: 2017-03-28
 * Revision:       Revision: 1.0
 * <p>
 * Description:    Brand bean
 * <p>
 * Revision log:
 * 2017-03-28: created by strawmanbobi
 */
public class Brand {

    private int id;
    private String name;
    private int category_id;
    private String category_name;
    private int status;
    private String update_time;
    private int priority;
    private String name_en;
    private String name_tw;
    private String contributor;

    public Brand(int id, String name, int category_id, String category_name, int status,
                 String update_time, int priority,
                 String name_en, String name_tw, String contributor) {
        this.id = id;
        this.name = name;
        this.category_id = category_id;
        this.category_name = category_name;
        this.status = status;
        this.update_time = update_time;
        this.priority = priority;
        this.name_en = name_en;
        this.name_tw = name_tw;
        this.contributor = contributor;
    }

    public Brand() {

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

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
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
