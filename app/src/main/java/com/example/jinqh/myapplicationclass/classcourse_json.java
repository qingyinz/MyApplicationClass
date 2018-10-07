package com.example.jinqh.myapplicationclass;

public class classcourse_json {
    private int id;
    private String name;
    private int zhouci;
    private int weizhi;


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

    public int getZhouci() {
        return zhouci;
    }

    public void setZhouci(int zhouci) {
        this.zhouci = zhouci;
    }

    public int getWeizhi() {
        return weizhi;
    }

    public void setWeizhi(int weizhi) {
        this.weizhi = weizhi;
    }

    public classcourse_json(int id, String name, int zhouci, int weizhi) {
        super();
        this.id = id;
        this.name = name;
        this.zhouci = zhouci;
        this.weizhi = weizhi;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", zhouci=" + zhouci
                + ",weizhi=" + weizhi + "]";
    }

}
