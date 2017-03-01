package com.lechebang.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/1.
 */
public class CityResult {
    private List<City> all=new ArrayList<City>();
    private List<City> hot=new ArrayList<City>();

    public List<City> getAll() {
        return all;
    }

    public void setAll(List<City> all) {
        this.all = all;
    }

    public List<City> getHot() {
        return hot;
    }

    public void setHot(List<City> hot) {
        this.hot = hot;
    }
}
