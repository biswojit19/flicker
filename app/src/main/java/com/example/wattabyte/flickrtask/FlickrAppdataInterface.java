package com.example.wattabyte.flickrtask;

import java.util.List;

/**
 * Created by WATTABYTE on 07/04/2016.
 */
public interface FlickrAppdataInterface {

    List<ImageInfo> getImageInfos();

    void setImageInfos(List<ImageInfo> imageInfos);

    int getCurrentPosition();

    void setCurrentPosition(int currentPosition);
}

