package com.lechebang.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/4.
 */
public class ManualResult {

    /**
     * brandTypeId : null
     * current : true
     * extraItems : null
     */

    private List<Manual> items=new ArrayList<Manual>();
    private List<Manual> nearItems=new ArrayList<Manual>();
    private List<Manual> otherItems=new ArrayList<Manual>();
    private ManualPlan plan=new ManualPlan();

    public List<Manual> getItems() {
        return items;
    }

    public void setItems(List<Manual> items) {
        this.items = items;
    }

    public List<Manual> getNearItems() {
        return nearItems;
    }

    public void setNearItems(List<Manual> nearItems) {
        this.nearItems = nearItems;
    }

    public List<Manual> getOtherItems() {
        return otherItems;
    }

    public void setOtherItems(List<Manual> otherItems) {
        this.otherItems = otherItems;
    }

    public ManualPlan getPlan() {
        return plan;
    }

    public void setPlan(ManualPlan plan) {
        this.plan = plan;
    }
}
