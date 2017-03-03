package com.lechebang.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/3.
 */
public class PlanResult {

    /**
     * brandTypeId : 16228
     * contractBasePrice : null
     * contractPrice : null
     * discountType : 0
     * lstAllItemLcbPrice : 0
     */

    private int brandTypeId;
    private Object contractBasePrice;
    private Object contractPrice;
    private int discountType;
    private List<Plan> lstAllItemLcbPrice=new ArrayList<Plan>();

    public int getBrandTypeId() {
        return brandTypeId;
    }

    public void setBrandTypeId(int brandTypeId) {
        this.brandTypeId = brandTypeId;
    }

    public Object getContractBasePrice() {
        return contractBasePrice;
    }

    public void setContractBasePrice(Object contractBasePrice) {
        this.contractBasePrice = contractBasePrice;
    }

    public Object getContractPrice() {
        return contractPrice;
    }

    public void setContractPrice(Object contractPrice) {
        this.contractPrice = contractPrice;
    }

    public int getDiscountType() {
        return discountType;
    }

    public void setDiscountType(int discountType) {
        this.discountType = discountType;
    }

    public List<Plan> getLstAllItemLcbPrice() {
        return lstAllItemLcbPrice;
    }

    public void setLstAllItemLcbPrice(List<Plan> lstAllItemLcbPrice) {
        this.lstAllItemLcbPrice = lstAllItemLcbPrice;
    }
}
