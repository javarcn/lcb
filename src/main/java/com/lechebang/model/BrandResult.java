package com.lechebang.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/1.
 */
public class BrandResult {

    /**
     * pinYin : A
     * results : [{"brandName":"奥迪","id":4595,"imgUrl":"https://ocpvd5a60.qnssl.com/2e89006f-67a6-4e6d-ab65-a6f8540b0d79.png","minPrice":null,"price":null}]
     */

    private String pinYin;
    private List<Brand> results=new ArrayList<Brand>();

    public String getPinYin() {
        return pinYin;
    }

    public void setPinYin(String pinYin) {
        this.pinYin = pinYin;
    }

    public List<Brand> getResults() {
        return results;
    }

    public void setResults(List<Brand> results) {
        this.results = results;
    }
}
