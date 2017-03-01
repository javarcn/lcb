package com.lechebang.model;

/**
 * Created by Administrator on 2017/3/1.
 */
public class City {

    /**
     * capital : B
     * code : 10101
     * drive : 1
     * name : 北京
     */

    private String capital;
    private int code;
    private int drive;
    private String name;

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getDrive() {
        return drive;
    }

    public void setDrive(int drive) {
        this.drive = drive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "capital='" + capital + '\'' +
                ", code=" + code +
                ", drive=" + drive +
                ", name='" + name + '\'' +
                '}';
    }
}
