package com.example.wattabyte.flickrtask.flickrutil.JSONObject;

import com.example.wattabyte.flickrtask.flickrutil.Sizes;

/**
 * Created by WATTABYTE on 07/04/2016.
 */
public class PhotosJSON extends FlickrBaseItemJSON {
    public Sizes getSizes() {
        return sizes;
    }

    public void setSizes(Sizes sizes) {
        this.sizes = sizes;
    }

    private Sizes sizes;
}
