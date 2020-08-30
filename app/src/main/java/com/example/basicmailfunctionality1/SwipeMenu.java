package com.example.basicmailfunctionality1;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class SwipeMenu {

    private Context cont;
    private List<SwipeMenuItem> items;
    private int mViewType;

    public SwipeMenu(Context context) {
        cont = context;
        items = new ArrayList<SwipeMenuItem>();
    }

    public Context getContext() {
        return cont;
    }

    public void addMenuItem(SwipeMenuItem item) {
        items.add(item);
    }

    public void removeMenuItem(SwipeMenuItem item) {
        items.remove(item);
    }

    public List<SwipeMenuItem> getMenuItems() {
        return items;
    }

    public SwipeMenuItem getMenuItem(int index) {
        return items.get(index);
    }

    public int getViewType() {
        return mViewType;
    }

    public void setViewType(int viewType) {
        this.mViewType = viewType;
    }

}
