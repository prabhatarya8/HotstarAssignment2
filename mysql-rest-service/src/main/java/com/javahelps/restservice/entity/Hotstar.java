package com.javahelps.restservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Prabhat Arya on  Jun,24 2019
 **/
@Entity
public class Hotstar {


    @Id
    private String trayname;
    private String showname;

    public String gettrayname() {
        return trayname;
    }

    public void settrayname(String trayname) {
        this.trayname = trayname;
    }

    public String getShowname() {
        return showname;
    }

    public void setShowname(String showname) {
        this.showname = showname;
    }


    @Override
    public String toString() {
        return "HotStar{" +
                "trayname='" + trayname + '\'' +
                ", showname='" + showname + '\'' +
                '}';
    }




}
