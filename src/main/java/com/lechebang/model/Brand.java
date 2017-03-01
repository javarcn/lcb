package com.lechebang.model;

/**
 * Created by Administrator on 2017/3/1.
 */
public class Brand {

    /**
     * brandName : 奥迪
     * id : 4595
     * imgUrl : https://ocpvd5a60.qnssl.com/2e89006f-67a6-4e6d-ab65-a6f8540b0d79.png
     * minPrice : null
     * price : null
     */

    private String brandName;
    private int id;
    private String imgUrl;
    private Object minPrice;
    private Object price;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Object getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Object minPrice) {
        this.minPrice = minPrice;
    }

    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "brandName='" + brandName + '\'' +
                ", id=" + id +
                ", imgUrl='" + imgUrl + '\'' +
                ", minPrice=" + minPrice +
                ", price=" + price +
                '}';
    }
}
