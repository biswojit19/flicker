package com.example.wattabyte.flickrtask.flickrutil.JSONObject;

import java.io.Serializable;

/**
 * Created by WATTABYTE on 07/04/2016.
 */
public class FlickrBaseItemJSON implements Serializable {
    private String stat;

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }
}
