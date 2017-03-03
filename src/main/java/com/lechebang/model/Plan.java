package com.lechebang.model;

/**
 * Created by Administrator on 2017/3/3.
 */
public class Plan {

    /**
     * descrption : 原厂件
     * hoursPrice : 26100
     * hoursStorePrice : 34800
     * itemId : 1
     * itemPrice : 27000
     * itemStorePrice : 36000
     * modelNumber : null
     * name : 机油
     * quantity : null
     * remarks : 5.0
     * salePrice : 53100
     * storeContractPrice : null
     * storePrice : 70800
     * unitDesc : null
     */

    private String descrption;
    private int hoursPrice;
    private int hoursStorePrice;
    private int itemId;
    private int itemPrice;
    private int itemStorePrice;
    private Object modelNumber;
    private String name;
    private Object quantity;
    private String remarks;
    private int salePrice;
    private Object storeContractPrice;
    private int storePrice;
    private Object unitDesc;

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    public int getHoursPrice() {
        return hoursPrice;
    }

    public void setHoursPrice(int hoursPrice) {
        this.hoursPrice = hoursPrice;
    }

    public int getHoursStorePrice() {
        return hoursStorePrice;
    }

    public void setHoursStorePrice(int hoursStorePrice) {
        this.hoursStorePrice = hoursStorePrice;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemStorePrice() {
        return itemStorePrice;
    }

    public void setItemStorePrice(int itemStorePrice) {
        this.itemStorePrice = itemStorePrice;
    }

    public Object getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(Object modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getQuantity() {
        return quantity;
    }

    public void setQuantity(Object quantity) {
        this.quantity = quantity;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public Object getStoreContractPrice() {
        return storeContractPrice;
    }

    public void setStoreContractPrice(Object storeContractPrice) {
        this.storeContractPrice = storeContractPrice;
    }

    public int getStorePrice() {
        return storePrice;
    }

    public void setStorePrice(int storePrice) {
        this.storePrice = storePrice;
    }

    public Object getUnitDesc() {
        return unitDesc;
    }

    public void setUnitDesc(Object unitDesc) {
        this.unitDesc = unitDesc;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "descrption='" + descrption + '\'' +
                ", hoursPrice=" + hoursPrice +
                ", hoursStorePrice=" + hoursStorePrice +
                ", itemId=" + itemId +
                ", itemPrice=" + itemPrice +
                ", itemStorePrice=" + itemStorePrice +
                ", modelNumber=" + modelNumber +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", remarks='" + remarks + '\'' +
                ", salePrice=" + salePrice +
                ", storeContractPrice=" + storeContractPrice +
                ", storePrice=" + storePrice +
                ", unitDesc=" + unitDesc +
                '}';
    }
}
