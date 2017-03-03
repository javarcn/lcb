package com.lechebang.model;

/**
 * Created by Administrator on 2017/3/4.
 */
public class Oil {


    /**
     * brandTypeId : 16228
     * discountType : 0
     * isBaseOil : 0
     * isRecommendOil : 0
     * oilContractPriceId : null
     * oilFullName : 原厂丰田纯牌||0W-40||SM/CF级||全合成
     * oilInfoId : 992661
     * oilName : 原厂丰田纯牌0W-40 SM/CF级全合成
     * priceOriDifference : 21900
     * priceSaleDifference : 16400
     * saleType : 0
     * storeId : 168
     * storeNames : null
     */

    private int brandTypeId;
    private int discountType;
    private int isBaseOil;
    private int isRecommendOil;
    private Object oilContractPriceId;
    private String oilFullName;
    private int oilInfoId;
    private String oilName;
    private int priceOriDifference;
    private int priceSaleDifference;
    private int saleType;
    private int storeId;
    private Object storeNames;

    public int getBrandTypeId() {
        return brandTypeId;
    }

    public void setBrandTypeId(int brandTypeId) {
        this.brandTypeId = brandTypeId;
    }

    public int getDiscountType() {
        return discountType;
    }

    public void setDiscountType(int discountType) {
        this.discountType = discountType;
    }

    public int getIsBaseOil() {
        return isBaseOil;
    }

    public void setIsBaseOil(int isBaseOil) {
        this.isBaseOil = isBaseOil;
    }

    public int getIsRecommendOil() {
        return isRecommendOil;
    }

    public void setIsRecommendOil(int isRecommendOil) {
        this.isRecommendOil = isRecommendOil;
    }

    public Object getOilContractPriceId() {
        return oilContractPriceId;
    }

    public void setOilContractPriceId(Object oilContractPriceId) {
        this.oilContractPriceId = oilContractPriceId;
    }

    public String getOilFullName() {
        return oilFullName;
    }

    public void setOilFullName(String oilFullName) {
        this.oilFullName = oilFullName;
    }

    public int getOilInfoId() {
        return oilInfoId;
    }

    public void setOilInfoId(int oilInfoId) {
        this.oilInfoId = oilInfoId;
    }

    public String getOilName() {
        return oilName;
    }

    public void setOilName(String oilName) {
        this.oilName = oilName;
    }

    public int getPriceOriDifference() {
        return priceOriDifference;
    }

    public void setPriceOriDifference(int priceOriDifference) {
        this.priceOriDifference = priceOriDifference;
    }

    public int getPriceSaleDifference() {
        return priceSaleDifference;
    }

    public void setPriceSaleDifference(int priceSaleDifference) {
        this.priceSaleDifference = priceSaleDifference;
    }

    public int getSaleType() {
        return saleType;
    }

    public void setSaleType(int saleType) {
        this.saleType = saleType;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public Object getStoreNames() {
        return storeNames;
    }

    public void setStoreNames(Object storeNames) {
        this.storeNames = storeNames;
    }

    @Override
    public String toString() {
        return "Oil{" +
                "brandTypeId=" + brandTypeId +
                ", discountType=" + discountType +
                ", isBaseOil=" + isBaseOil +
                ", isRecommendOil=" + isRecommendOil +
                ", oilContractPriceId=" + oilContractPriceId +
                ", oilFullName='" + oilFullName + '\'' +
                ", oilInfoId=" + oilInfoId +
                ", oilName='" + oilName + '\'' +
                ", priceOriDifference=" + priceOriDifference +
                ", priceSaleDifference=" + priceSaleDifference +
                ", saleType=" + saleType +
                ", storeId=" + storeId +
                ", storeNames=" + storeNames +
                '}';
    }
}
