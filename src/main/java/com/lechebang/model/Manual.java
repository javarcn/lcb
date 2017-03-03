package com.lechebang.model;

/**
 * Created by Administrator on 2017/3/4.
 */
public class Manual {

    /**
     * description :
     * id : 1
     * itemId : null
     * itemName : 机油
     * percent : 0
     */

    private String description;
    private int id;
    private Object itemId;
    private String itemName;
    private int percent;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getItemId() {
        return itemId;
    }

    public void setItemId(Object itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }
}
