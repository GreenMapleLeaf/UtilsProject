package com.example.feng.test;


import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.HashMap;
import java.util.Map;

public class ItemTypeBlogDetailWebView {
    private final Context mPluginContext;
    public final View mConvertView;
    public WebView mWebView;
    private String url;
    private boolean loadFailed;
    private int position;

    public ItemTypeBlogDetailWebView(Context context) {
        this.mPluginContext = context;
        this.mConvertView = LayoutInflater.from(mPluginContext).inflate(R.layout.forum_blog_details_floor_webview, null, false);
        this.mWebView = (WebView) mConvertView.findViewById(R.id.wv_video);
        mConvertView.setTag(this);
        initWebView();
    }

    public void initWebView() {
        mWebView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                loadFailed = false;
            }

            @Override
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                super.onReceivedError(view, request, error);
                loadFailed = true;
            }

            @Override
            public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
                super.onReceivedHttpError(view, request, errorResponse);
                loadFailed = true;
            }

            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                super.onReceivedSslError(view, handler, error);
                loadFailed = true;
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                blockAds(view);//过滤
            }
        });
        mWebView.setWebChromeClient(new WebChromeClient() {

        });
        // 启用javascript
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setPluginState(WebSettings.PluginState.ON);
        webSettings.setUseWideViewPort(true); // 关键点
        webSettings.setAllowFileAccess(true); // 允许访问文件
        webSettings.setSupportZoom(true); // 支持缩放
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setCacheMode(WebSettings.LOAD_NO_CACHE); // 不加载缓存内容
        mWebView.addJavascriptInterface(new Object(), "jss");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        }
        mWebView.getSettings().setUseWideViewPort(true);
    }

    private void blockAds(WebView view) {
//        StringBuilder sb = new StringBuilder();
//        sb.append("javascript: ");
//        String[] alltag = tags.split(",");
//        for (int i = 0; i < alltag.length; i++) {
//            String adTag = alltag[i];
//            if (adTag.trim().length() > 0) {
//                adTag = adTag.trim();
//                if (adTag.contains("#")) {
//                    adTag = adTag.substring(adTag.indexOf("#") + 1);
//                    if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) {//19
//                        sb.append("document.getElementById(\'").append(adTag).append("\').innerHTML=\'\';");
//                    } else {
//                        sb.append("document.getElementById(\'").append(adTag).append("\').remove();");
//                    }
//
//                } else if (adTag.contains(".")) {
//                    adTag = adTag.substring(adTag.indexOf(".") + 1);
//                    if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) {
//                        sb.append("var esc=document.getElementsByClassName(\'").append(adTag).append("\');for (i in esc){esc[i].innerHTML=\'\';};");
//
//                    } else {
//                        sb.append("var esc=document.getElementsByClassName(\'").append(adTag).append("\');for (var i = esc.length - 1; i >= 0; i--){esc[i].remove();};");
//
//                    }
//                } else if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) {
//                    sb.append("var esc=document.getElementsByTagName(\'").append(adTag).append("\');for (i in esc){esc[i].innerHTML=\'\';};");
//                } else {
//                    sb.append("var esc=document.getElementsByTagName(\'").append(adTag).append("\');for (var i = esc.length - 1; i >= 0; i--){esc[i].remove();};");
//                }
//            }
        }

    public void bind(String videoUrl, int position) {
        this.url = videoUrl;
        this.position = position;
        if (url != null) {
            if (loadFailed || !url.equals(mWebView.getUrl())) {
                Map<String, String> header = new HashMap<>();
//                header.put("Upgrade-Insecure-Requests","1");
                header.put("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36");
                mWebView.loadUrl(url);
            } else {
                doPlay();
            }
        }
    }

    public int getPosition() {
        return position;
    }

    public void doPause() {
        if (mWebView != null) {
            mWebView.onPause();
//            mWebView.pauseTimers();
//        mWebView.stopLoading();
        }
    }

    public void doPlay() {
        if (mWebView != null) {
            mWebView.onResume();
//            mWebView.resumeTimers();
        }
    }

    public void doStop() {
        if (mWebView != null) {
            mWebView.onPause();
            mWebView.pauseTimers();
            mWebView.loadUrl("about:blank");
            mWebView.removeAllViews();
            mWebView = null;
        }
    }
}
