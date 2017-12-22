package com.example.feng.test;

import android.os.Bundle;
import android.widget.AbsListView;
import android.widget.ListView;

import com.example.feng.base.BaseActivity;

public class WebListActivity extends BaseActivity {
    ListView weblist;
    WebAdater mAdapter;
    int mFirstVisibleItemPosition;
    int mLastVisibleItemPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weblist);
        weblist = (ListView) findViewById(R.id.weblist);
        mAdapter = new WebAdater(getApplicationContext());
        mAdapter.update();
        weblist.setAdapter(mAdapter);
        weblist.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {

            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                boolean changed=false;
                if (mFirstVisibleItemPosition != firstVisibleItem) {
                    mFirstVisibleItemPosition = firstVisibleItem;
                    changed=true;
                }
                if (mLastVisibleItemPosition != firstVisibleItem + visibleItemCount) {
                    mLastVisibleItemPosition = firstVisibleItem + visibleItemCount;
                    changed=true;
                }
                if(changed){
                    mAdapter.stop(mFirstVisibleItemPosition,mLastVisibleItemPosition);
                }
            }
        });

    }

    @Override
    protected void onStop() {
        super.onStop();
        mAdapter.stopAll();
    }
}

