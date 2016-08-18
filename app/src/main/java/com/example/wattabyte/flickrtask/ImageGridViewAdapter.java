package com.example.wattabyte.flickrtask;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by WATTABYTE on 07/04/2016.
 */

public class ImageGridViewAdapter extends BaseAdapter {

    FlickrAppdataInterface currentAppData;
    private Activity ac;
    private static LayoutInflater in = null;
    private static List<ImageInfo> imagedata = null;

    public ImageGridViewAdapter(Activity activity , List<ImageInfo> result) {
        ac = activity;
        imagedata = result;
        in = (LayoutInflater) activity
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return imagedata.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView result;
        if (convertView == null)
            result = new ImageView(ac);
        else
            result = (ImageView) convertView;


        result.setScaleType(ImageView.ScaleType.CENTER);
        result.setImageBitmap(imagedata.get(position).getMediumBitmap());
        result.setOnClickListener(new ImageGridViewCellOnClickListener(position));

        return result;
    }

    class ImageGridViewCellOnClickListener implements View.OnClickListener {
        private int position;

        public ImageGridViewCellOnClickListener(int position) {
            this.position = position;
        }

        @Override
        public void onClick(View v) {
            //currentAppData.setCurrentPosition(position);
            //Intent intent = new Intent(activity, MediumViewActivity.class);
            //activity.startActivity(intent);
        }
    }
}
