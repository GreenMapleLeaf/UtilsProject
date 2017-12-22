package com.example.feng.base;

import android.content.Context;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Feng on 2017/10/30.
 */

public abstract class BaseListAdapter extends BaseAdapter {
    private final Context mContext;
    private final List< BaseListData> mData;

    public BaseListAdapter(Context mContext) {
        this.mContext = mContext;
        this.mData = new ArrayList<>();
    }

    public abstract int getViewTypeCount();

    public List<BaseListData> getData() {
        return mData;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public int getItemViewType(int position) {
        return getItem(position).viewType;
    }

    @Override
    public BaseListData getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public static class BaseListData {
        final int viewType;
        final Object data;

        public BaseListData(int viewType, Object data) {
            this.viewType = viewType;
            this.data = data;
        }
    }
}
