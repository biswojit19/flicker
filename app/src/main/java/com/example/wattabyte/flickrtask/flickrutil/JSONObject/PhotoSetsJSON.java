package com.example.wattabyte.flickrtask.flickrutil.JSONObject;

import com.example.wattabyte.flickrtask.flickrutil.PhotoSet;

/**
 * Created by WATTABYTE on 07/04/2016.
 */
public class PhotoSetsJSON extends FlickrBaseItemJSON {
    public PhotoSet getPhotoset() {
        return photoset;
    }

    public void setPhotoset(PhotoSet photoset) {
        this.photoset = photoset;
    }

    private PhotoSet photoset;


}
