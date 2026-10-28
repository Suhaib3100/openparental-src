package com.androidquery.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Picture;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: WebImage.java */
/* loaded from: classes3.dex */
public class h extends WebViewClient {

    /* renamed from: g, reason: collision with root package name */
    private static String f41275g;

    /* renamed from: h, reason: collision with root package name */
    private static final String f41276h = ProtectedSandApp.s("\u07b4");

    /* renamed from: i, reason: collision with root package name */
    private static final String f41277i = ProtectedSandApp.s("\u07b5");

    /* renamed from: a, reason: collision with root package name */
    private Object f41278a;

    /* renamed from: b, reason: collision with root package name */
    private WebView f41279b;

    /* renamed from: c, reason: collision with root package name */
    private String f41280c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f41281d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f41282e;

    /* renamed from: f, reason: collision with root package name */
    private int f41283f;

    /* compiled from: WebImage.java */
    class a implements WebView.PictureListener {
        a() {
        }

        @Override // android.webkit.WebView.PictureListener
        public void onNewPicture(WebView webView, Picture picture) {
            h.this.f41279b.setPictureListener(null);
            h.this.i();
        }
    }

    public h(WebView webView, String str, Object obj, boolean z4, boolean z5, int i4) {
        this.f41279b = webView;
        this.f41280c = str;
        this.f41278a = obj;
        this.f41281d = z4;
        this.f41282e = z5;
        this.f41283f = i4;
    }

    private void c() {
        this.f41279b.setPictureListener(new a());
        this.f41279b.loadData(ProtectedSandApp.s("\u07b2"), ProtectedSandApp.s("ް"), ProtectedSandApp.s("ޱ"));
        this.f41279b.setBackgroundColor(this.f41283f);
    }

    private static void d(WebView webView) {
        com.androidquery.util.a.C(webView.getSettings(), ProtectedSandApp.s("\u07b3"), false, false, new Class[]{Boolean.TYPE}, Boolean.FALSE);
    }

    private void e(WebView webView) {
        if (this.f41278a != null) {
            webView.setVisibility(0);
            c.E(this.f41278a, this.f41280c, false);
        }
        webView.setWebViewClient(null);
    }

    private static void f(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(ProtectedSandApp.s("\u07b4"), 0);
        String s4 = ProtectedSandApp.s("\u07b5");
        if (sharedPreferences.getInt(s4, 1) > 0) {
            sharedPreferences.edit().putInt(s4, 0).commit();
        }
    }

    private static String g(Context context) {
        if (f41275g == null) {
            try {
                f41275g = new String(com.androidquery.util.a.c0(ProtectedSandApp.a(context.getClassLoader(), ProtectedSandApp.s("\u07b6"))));
            } catch (Exception e4) {
                com.androidquery.util.a.k(e4);
            }
        }
        return f41275g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        String replace = g(this.f41279b.getContext()).replace(ProtectedSandApp.s("\u07b7"), this.f41280c).replace(ProtectedSandApp.s("\u07b8"), Integer.toHexString(this.f41283f));
        this.f41279b.setWebViewClient(this);
        this.f41279b.loadDataWithBaseURL(null, replace, ProtectedSandApp.s("ް"), ProtectedSandApp.s("ޱ"), null);
        this.f41279b.setBackgroundColor(this.f41283f);
    }

    public void h() {
        if (this.f41280c.equals(this.f41279b.getTag(d.f41256v))) {
            return;
        }
        this.f41279b.setTag(d.f41256v, this.f41280c);
        f(this.f41279b.getContext());
        WebSettings settings = this.f41279b.getSettings();
        settings.setSupportZoom(this.f41281d);
        settings.setBuiltInZoomControls(this.f41281d);
        if (!this.f41282e) {
            d(this.f41279b);
        }
        settings.setJavaScriptEnabled(true);
        this.f41279b.setBackgroundColor(this.f41283f);
        Object obj = this.f41278a;
        if (obj != null) {
            c.E(obj, this.f41280c, true);
        }
        if (this.f41279b.getWidth() > 0) {
            i();
        } else {
            c();
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        e(webView);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i4, String str, String str2) {
        e(webView);
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f4, float f5) {
    }
}
