package com.keepearly.bean;

import cn.bmob.v3.BmobObject;

public class User extends BmobObject {
	private int id;
    private String name;
    private String address;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}