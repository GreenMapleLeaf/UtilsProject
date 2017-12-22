package com.example.feng.test;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.feng.base.BaseActivity;

import java.util.HashMap;
import java.util.Map;

public class WebActivity extends BaseActivity {
    WebView mWebView;
String mUrl="http://player.youku.com/embed/XMzE4ODMzNzc0OA==";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        mWebView = (WebView) findViewById(R.id.web);
        mWebView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
                return super.shouldInterceptRequest(view, request);
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return super.shouldOverrideUrlLoading(view, request);
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if(url.equals(mUrl)){
                    return super.shouldOverrideUrlLoading(view, url);
                }else{
                    return true;
                }
            }
//
//            @Override
//            public void onPageFinished(WebView view, String url) {
//                super.onPageFinished(view, url);
//
//            }
//
//            @Override
//            public void onLoadResource(WebView view, String url) {
//                super.onLoadResource(view, url);
//            }
//
//            @Override
//            public void onPageCommitVisible(WebView view, String url) {
//                super.onPageCommitVisible(view, url);
//            }
//
//            @Override
//            public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
//                return super.shouldInterceptRequest(view, url);
//            }
//
//            @Override
//            public void onTooManyRedirects(WebView view, Message cancelMsg, Message continueMsg) {
//                super.onTooManyRedirects(view, cancelMsg, continueMsg);
//            }
//
//            @Override
//            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
//                super.onReceivedError(view, errorCode, description, failingUrl);
//            }
//
//            @Override
//            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
//                super.onReceivedError(view, request, error);
//            }
//
//            @Override
//            public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
//                super.onReceivedHttpError(view, request, errorResponse);
//            }
//
//            @Override
//            public void onFormResubmission(WebView view, Message dontResend, Message resend) {
//                super.onFormResubmission(view, dontResend, resend);
//            }
//
//            @Override
//            public void doUpdateVisitedHistory(WebView view, String url, boolean isReload) {
//                super.doUpdateVisitedHistory(view, url, isReload);
//            }
//
//            @Override
//            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
//                super.onReceivedSslError(view, handler, error);
//            }
//
//            @Override
//            public void onReceivedClientCertRequest(WebView view, ClientCertRequest request) {
//                super.onReceivedClientCertRequest(view, request);
//            }
//
//            @Override
//            public void onReceivedHttpAuthRequest(WebView view, HttpAuthHandler handler, String host, String realm) {
//                super.onReceivedHttpAuthRequest(view, handler, host, realm);
//            }
//
//            @Override
//            public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
//                return super.shouldOverrideKeyEvent(view, event);
//            }
//
//            @Override
//            public void onUnhandledKeyEvent(WebView view, KeyEvent event) {
//                super.onUnhandledKeyEvent(view, event);
//            }
//
//            @Override
//            public void onScaleChanged(WebView view, float oldScale, float newScale) {
//                super.onScaleChanged(view, oldScale, newScale);
//            }
//
//            @Override
//            public void onReceivedLoginRequest(WebView view, String realm, String account, String args) {
//                super.onReceivedLoginRequest(view, realm, account, args);
//            }
        });
        mWebView.setWebChromeClient(new WebChromeClient(){
//            @Override
//            public void onProgressChanged(WebView view, int newProgress) {
//                super.onProgressChanged(view, newProgress);
//            }
//
//            @Override
//            public void onReceivedTitle(WebView view, String title) {
//                super.onReceivedTitle(view, title);
//            }
//
//            @Override
//            public void onReceivedIcon(WebView view, Bitmap icon) {
//                super.onReceivedIcon(view, icon);
//            }
//
//            @Override
//            public void onReceivedTouchIconUrl(WebView view, String url, boolean precomposed) {
//                super.onReceivedTouchIconUrl(view, url, precomposed);
//            }
//
//            @Override
//            public void onShowCustomView(View view, CustomViewCallback callback) {
//                super.onShowCustomView(view, callback);
//            }
//
//            @Override
//            public void onShowCustomView(View view, int requestedOrientation, CustomViewCallback callback) {
//                super.onShowCustomView(view, requestedOrientation, callback);
//            }
//
//            @Override
//            public void onHideCustomView() {
//                super.onHideCustomView();
//            }
//
//            @Override
//            public boolean onCreateWindow(WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg) {
//                return super.onCreateWindow(view, isDialog, isUserGesture, resultMsg);
//            }
//
//            @Override
//            public void onRequestFocus(WebView view) {
//                super.onRequestFocus(view);
//            }
//
//            @Override
//            public void onCloseWindow(WebView window) {
//                super.onCloseWindow(window);
//            }
//
//            @Override
//            public void onExceededDatabaseQuota(String url, String databaseIdentifier, long quota, long estimatedDatabaseSize, long totalQuota, WebStorage.QuotaUpdater quotaUpdater) {
//                super.onExceededDatabaseQuota(url, databaseIdentifier, quota, estimatedDatabaseSize, totalQuota, quotaUpdater);
//            }
//
//            @Override
//            public void onReachedMaxAppCacheSize(long requiredStorage, long quota, WebStorage.QuotaUpdater quotaUpdater) {
//                super.onReachedMaxAppCacheSize(requiredStorage, quota, quotaUpdater);
//            }
//
//            @Override
//            public void onGeolocationPermissionsShowPrompt(String origin, GeolocationPermissions.Callback callback) {
//                super.onGeolocationPermissionsShowPrompt(origin, callback);
//            }
//
//            @Override
//            public void onGeolocationPermissionsHidePrompt() {
//                super.onGeolocationPermissionsHidePrompt();
//            }
//
//            @Override
//            public void onPermissionRequest(PermissionRequest request) {
//                super.onPermissionRequest(request);
//            }
//
//            @Override
//            public void onPermissionRequestCanceled(PermissionRequest request) {
//                super.onPermissionRequestCanceled(request);
//            }
//
//            @Override
//            public void onConsoleMessage(String message, int lineNumber, String sourceID) {
//                super.onConsoleMessage(message, lineNumber, sourceID);
//            }
//
//            @Override
//            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
//                return super.onConsoleMessage(consoleMessage);
//            }
//
//            @Override
//            public Bitmap getDefaultVideoPoster() {
//                return super.getDefaultVideoPoster();
//            }
//
//            @Override
//            public View getVideoLoadingProgressView() {
//                return super.getVideoLoadingProgressView();
//            }
//
//            @Override
//            public void getVisitedHistory(ValueCallback<String[]> callback) {
//                super.getVisitedHistory(callback);
//            }
//
//            @Override
//            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, FileChooserParams fileChooserParams) {
//                return super.onShowFileChooser(webView, filePathCallback, fileChooserParams);
//            }
//
//            @Override
//            public int hashCode() {
//                return super.hashCode();
//            }
//
//            @Override
//            public boolean equals(Object obj) {
//                return super.equals(obj);
//            }
//
//            @Override
//            protected Object clone() throws CloneNotSupportedException {
//                return super.clone();
//            }
//
//            @Override
//            public String toString() {
//                return super.toString();
//            }
//
//            @Override
//            protected void finalize() throws Throwable {
//                super.finalize();
//            }
//
//            @Override
//            public boolean onJsBeforeUnload(WebView view, String url, String message, JsResult result) {
//                return super.onJsBeforeUnload(view, url, message, result);
//            }
//
//            @Override
//            public boolean onJsPrompt(WebView view, String url, String message, String defaultValue, JsPromptResult result) {
//                return super.onJsPrompt(view, url, message, defaultValue, result);
//            }
//
//            @Override
//            public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
//                return super.onJsAlert(view, url, message, result);
//            }
//
//            @Override
//            public boolean onJsConfirm(WebView view, String url, String message, JsResult result) {
//                return super.onJsConfirm(view, url, message, result);
//            }
//
//            @Override
//            public boolean onJsTimeout() {
//                return super.onJsTimeout();
//            }
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

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        }
        mWebView.getSettings().setUseWideViewPort(true);
        mWebView.addJavascriptInterface(new MyJavaScript(), "");
        Map<String,String> map=new HashMap<>();
        map.put("Cache-Control","max-age=0");
        map.put("Accept-Language","zh-CN,en-US;q=0.8");
        map.put("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
        map.put("Accept-Encoding","gzip, deflate, sdch");
        map.put("Accept-Language","zh-CN,zh;q=0.8");
        map.put("User-Agent","Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36");
        map.put("Cookie","__ysuid=1487728551125fbS; juid=01bcur4phc2m7d; __yscnt=1; yseidcount=2; __guid=24571643.4432041707763954700.1511863079659.5063; ysestep=9; ystep=14; cna=VeEzEQKaWj8CAXzPCEJL8GPq; _m_h5_tk=b78dccf401f1d57e89a98a85a236805c_1513338894218; _m_h5_tk_enc=869da422ba505776fb261fb7d457c239; monitor_count=2; __ayft=1513333846919; __aysid=15133338469191Wj; __arpvid=1513334071434od4sZs-1513334071451; __ayscnt=1; __aypstp=2; __ayspstp=2; __ayvstp=4; __aysvstp=4; isg=AlJSCZvQXN4dk6AMYgrc-3otoxg0Y1b9UfWt4ByqLYXwL_EpBPIbDTmN65T7");
        map.put("Upgrade-Insecure-Requests","1");
        map.put("Connection","keep-alive");
//        map.put("","");
//        map.put("","");
        mWebView.loadUrl(mUrl);
    }
    private class MyJavaScript {
    }
}

