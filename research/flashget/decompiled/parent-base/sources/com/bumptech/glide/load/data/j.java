package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.m1;
import androidx.annotation.o0;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* compiled from: HttpUrlFetcher.java */
/* loaded from: classes3.dex */
public class j implements d<InputStream> {

    /* renamed from: i, reason: collision with root package name */
    private static final int f43780i = 5;

    /* renamed from: l, reason: collision with root package name */
    @m1
    static final int f43783l = -1;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.model.h f43784b;

    /* renamed from: c, reason: collision with root package name */
    private final int f43785c;

    /* renamed from: d, reason: collision with root package name */
    private final b f43786d;

    /* renamed from: e, reason: collision with root package name */
    private HttpURLConnection f43787e;

    /* renamed from: f, reason: collision with root package name */
    private InputStream f43788f;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f43789g;

    /* renamed from: h, reason: collision with root package name */
    private static final String f43779h = ProtectedSandApp.s("\u086d");

    /* renamed from: j, reason: collision with root package name */
    @m1
    static final String f43781j = ProtectedSandApp.s("\u086e");

    /* renamed from: k, reason: collision with root package name */
    @m1
    static final b f43782k = new a();

    /* compiled from: HttpUrlFetcher.java */
    private static class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.data.j.b
        public HttpURLConnection a(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* compiled from: HttpUrlFetcher.java */
    interface b {
        HttpURLConnection a(URL url) throws IOException;
    }

    public j(com.bumptech.glide.load.model.h hVar, int i4) {
        this(hVar, i4, f43782k);
    }

    private HttpURLConnection c(URL url, Map<String, String> map) throws HttpException {
        try {
            HttpURLConnection a5 = this.f43786d.a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                a5.addRequestProperty(entry.getKey(), entry.getValue());
            }
            a5.setConnectTimeout(this.f43785c);
            a5.setReadTimeout(this.f43785c);
            a5.setUseCaches(false);
            a5.setDoInput(true);
            a5.setInstanceFollowRedirects(false);
            return a5;
        } catch (IOException e4) {
            throw new HttpException(ProtectedSandApp.s("\u086f"), 0, e4);
        }
    }

    private static int f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException unused) {
            Log.isLoggable(ProtectedSandApp.s("\u086d"), 3);
            return -1;
        }
    }

    private InputStream g(HttpURLConnection httpURLConnection) throws HttpException {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f43788f = com.bumptech.glide.util.c.b(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable(ProtectedSandApp.s("\u086d"), 3)) {
                    httpURLConnection.getContentEncoding();
                }
                this.f43788f = httpURLConnection.getInputStream();
            }
            return this.f43788f;
        } catch (IOException e4) {
            throw new HttpException(ProtectedSandApp.s("ࡰ"), f(httpURLConnection), e4);
        }
    }

    private static boolean h(int i4) {
        return i4 / 100 == 2;
    }

    private static boolean i(int i4) {
        return i4 / 100 == 3;
    }

    private InputStream j(URL url, int i4, URL url2, Map<String, String> map) throws HttpException {
        if (i4 >= 5) {
            throw new HttpException(ProtectedSandApp.s("ࡶ"), -1, null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException(ProtectedSandApp.s("ࡱ"), -1, null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection c5 = c(url, map);
        this.f43787e = c5;
        try {
            c5.connect();
            this.f43788f = this.f43787e.getInputStream();
            if (this.f43789g) {
                return null;
            }
            int f4 = f(this.f43787e);
            if (h(f4)) {
                return g(this.f43787e);
            }
            if (!i(f4)) {
                if (f4 == -1) {
                    throw new HttpException(f4);
                }
                try {
                    throw new HttpException(this.f43787e.getResponseMessage(), f4, null);
                } catch (IOException e4) {
                    throw new HttpException(ProtectedSandApp.s("ࡴ"), f4, e4);
                }
            }
            String headerField = this.f43787e.getHeaderField(ProtectedSandApp.s("\u086e"));
            if (TextUtils.isEmpty(headerField)) {
                throw new HttpException(ProtectedSandApp.s("ࡳ"), f4, null);
            }
            try {
                URL url3 = new URL(url, headerField);
                b();
                return j(url3, i4 + 1, url, map);
            } catch (MalformedURLException e5) {
                throw new HttpException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("ࡲ"), headerField), f4, e5);
            }
        } catch (IOException e6) {
            throw new HttpException(ProtectedSandApp.s("ࡵ"), f(this.f43787e), e6);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    @o0
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f43788f;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f43787e;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f43787e = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        this.f43789g = true;
    }

    @Override // com.bumptech.glide.load.data.d
    @o0
    public com.bumptech.glide.load.a d() {
        return com.bumptech.glide.load.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(@o0 com.bumptech.glide.j jVar, @o0 d.a<? super InputStream> aVar) {
        String s4 = ProtectedSandApp.s("\u086d");
        long b5 = com.bumptech.glide.util.i.b();
        try {
            try {
                aVar.f(j(this.f43784b.i(), 0, null, this.f43784b.e()));
                if (!Log.isLoggable(s4, 2)) {
                    return;
                }
            } catch (IOException e4) {
                Log.isLoggable(s4, 3);
                aVar.c(e4);
                if (!Log.isLoggable(s4, 2)) {
                    return;
                }
            }
            com.bumptech.glide.util.i.a(b5);
        } catch (Throwable th) {
            if (Log.isLoggable(s4, 2)) {
                com.bumptech.glide.util.i.a(b5);
            }
            throw th;
        }
    }

    @m1
    j(com.bumptech.glide.load.model.h hVar, int i4, b bVar) {
        this.f43784b = hVar;
        this.f43785c = i4;
        this.f43786d = bVar;
    }
}
