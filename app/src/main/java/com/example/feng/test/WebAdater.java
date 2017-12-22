package com.example.feng.test;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Feng on 2017/11/28.
 */

public class WebAdater extends BaseAdapter {
    private final Context mContext;
    private final List<ViewTypeData> mData = new ArrayList<>();
    private final List<ItemTypeBlogDetailWebView> webItems = new ArrayList<>();
    private final int webMaxCount = ViewTypeData.WEB_MAX_COUNT;

    public WebAdater(Context mContext) {
        this.mContext = mContext;
    }

    public void update() {
        int webCount = 0;
        for (int i = 0; i < 3; i++) {
            if (i % 3 == 0) {
                mData.add(new ViewTypeData(ViewTypeData.VIEW_TYPE_WEB + (webCount++ % webMaxCount), "http://115.181.155.185/67719C2079B3882864F1433D08/03000801005A1C9A8F529608BD8A985D108DD5-0A23-01FC-4476-D8357743DED3.mp4?ccode=0590&duration=315&expire=18000&psid=94090aa5e7cf876d92a42906c9cf99f5&ups_client_netip=7ccf0842&ups_ts=1512035904&ups_userid=&utid=GLimEsfH8iACAXzPCEJPmUst&vid=XMzE4OTUyMTA0MA%3D%3D&vkey=A7ae14f5061aee6230bf0a1c86af874bb"));
            } else  if (i % 3 == 1) {
                mData.add(new ViewTypeData(ViewTypeData.VIEW_TYPE_WEB + (webCount++ % webMaxCount), "http://115.181.156.22/69737AA8D823582630F7062B3B/03000801005A1BD68B259A011BA6A9E36B60C8-4932-9F0D-6F0D-12534FD8420C.mp4?ccode=0590&duration=362&expire=18000&psid=41b3ef0d6c922f9437f7249066620cdb&ups_client_netip=7ccf0842&ups_ts=1512036443&ups_userid=&utid=GLimEsfH8iACAXzPCEJPmUst&vid=XMzE4ODMzNzc0OA%3D%3D&vkey=A22046a1fbad74017612e45a52d21f160"));
            } else /*if (i % 3 == 2)*/ {
                mData.add(new ViewTypeData(ViewTypeData.VIEW_TYPE_WEB + (webCount++ % webMaxCount), "http://player.youku.com/embed/XMzE4ODMzNzc0OA=="));
                mData.add(new ViewTypeData(ViewTypeData.VIEW_TYPE_WEB + (webCount++ % webMaxCount), "http://player.youku.com/embed/XMzE4OTUyMTA0MA=="));
            }
            mData.add(new ViewTypeData(ViewTypeData.VIEW_TYPE_EMPTY, null));
        }
    }

    public void stopAll() {
        for (int i = 0; i < webItems.size(); i++) {
            webItems.get(i).doStop();
        }
    }

    public void stop(int mFirstVisibleItemPosition, int mLastVisibleItemPosition) {
        for (int i = 0; i < webItems.size(); i++) {
            int position = webItems.get(i).getPosition();
            if (position < mFirstVisibleItemPosition || position > mLastVisibleItemPosition) {
                webItems.get(i).doPause();
            }
        }
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public ViewTypeData getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        return getItem(position).viewType;
    }

    @Override
    public int getViewTypeCount() {
        return ViewTypeData.ViewTypeCount;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        int viewType = getItemViewType(position);
        switch (viewType) {
            case ViewTypeData.VIEW_TYPE_EMPTY:
                if (convertView == null) {
                    convertView = new ItemTypeDivider(mContext).mConvertView;
                }
                return convertView;
            default:
                if (viewType >= ViewTypeData.VIEW_TYPE_WEB && viewType < ViewTypeData.VIEW_TYPE_WEB + webMaxCount) {
                    ItemTypeBlogDetailWebView webItem;
                    if (convertView == null) {
                        webItem = new ItemTypeBlogDetailWebView(mContext);
                        convertView = webItem.mConvertView;
                        webItems.add(webItem);
                    } else {
                        webItem = (ItemTypeBlogDetailWebView) convertView.getTag();
                    }
                    webItem.bind((String) getItem(position).data, position);
                }
                return convertView;
        }
    }


    public static class ViewTypeData {
        public static final int VIEW_TYPE_EMPTY = 0;
        public static final int VIEW_TYPE_WEB = 1;
        public static final int[] VIEWTYPE = {VIEW_TYPE_EMPTY, VIEW_TYPE_WEB};
        public static final int WEB_MAX_COUNT = 10;
        public static final int ViewTypeCount = VIEWTYPE.length + WEB_MAX_COUNT - 1;
        int viewType;
        Object data;

        public ViewTypeData(int viewType, Object data) {
            this.viewType = viewType;
            this.data = data;
        }
    }
}
