package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.m1;
import androidx.annotation.o0;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.d;
import com.flashget.kidsdownloader.ProtectedSandApp;
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

    /* renamed from: v, reason: collision with root package name */
    private static final int f11074v = 5;

    /* renamed from: y, reason: collision with root package name */
    @m1
    static final int f11077y = -1;

    /* renamed from: o, reason: collision with root package name */
    private final com.bumptech.glide.load.model.g f11078o;

    /* renamed from: p, reason: collision with root package name */
    private final int f11079p;

    /* renamed from: q, reason: collision with root package name */
    private final b f11080q;

    /* renamed from: r, reason: collision with root package name */
    private HttpURLConnection f11081r;

    /* renamed from: s, reason: collision with root package name */
    private InputStream f11082s;

    /* renamed from: t, reason: collision with root package name */
    private volatile boolean f11083t;

    /* renamed from: u, reason: collision with root package name */
    private static final String f11073u = ProtectedSandApp.s("ᱸ");

    /* renamed from: w, reason: collision with root package name */
    @m1
    static final String f11075w = ProtectedSandApp.s("ᱹ");

    /* renamed from: x, reason: collision with root package name */
    @m1
    static final b f11076x = new a();

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
    /* loaded from: classes.dex */
    interface b {
        HttpURLConnection a(URL url) throws IOException;
    }

    public j(com.bumptech.glide.load.model.g gVar, int i5) {
        this(gVar, i5, f11076x);
    }

    private HttpURLConnection c(URL url, Map<String, String> map) throws HttpException {
        try {
            HttpURLConnection a6 = this.f11080q.a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                a6.addRequestProperty(entry.getKey(), entry.getValue());
            }
            a6.setConnectTimeout(this.f11079p);
            a6.setReadTimeout(this.f11079p);
            a6.setUseCaches(false);
            a6.setDoInput(true);
            a6.setInstanceFollowRedirects(false);
            return a6;
        } catch (IOException e6) {
            throw new HttpException(ProtectedSandApp.s("ᱺ"), 0, e6);
        }
    }

    private static int f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException unused) {
            Log.isLoggable(ProtectedSandApp.s("ᱻ"), 3);
            return -1;
        }
    }

    private InputStream g(HttpURLConnection httpURLConnection) throws HttpException {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f11082s = com.bumptech.glide.util.c.b(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable(ProtectedSandApp.s("ᱼ"), 3)) {
                    httpURLConnection.getContentEncoding();
                }
                this.f11082s = httpURLConnection.getInputStream();
            }
            return this.f11082s;
        } catch (IOException e6) {
            throw new HttpException(ProtectedSandApp.s("ᱽ"), f(httpURLConnection), e6);
        }
    }

    private static boolean h(int i5) {
        return i5 / 100 == 2;
    }

    private static boolean i(int i5) {
        return i5 / 100 == 3;
    }

    private InputStream j(URL url, int i5, URL url2, Map<String, String> map) throws HttpException {
        if (i5 >= 5) {
            throw new HttpException(ProtectedSandApp.s("ᲄ"), -1, null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException(ProtectedSandApp.s("᱾"), -1, null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection c6 = c(url, map);
        this.f11081r = c6;
        try {
            c6.connect();
            this.f11082s = this.f11081r.getInputStream();
            if (this.f11083t) {
                return null;
            }
            int f6 = f(this.f11081r);
            if (h(f6)) {
                return g(this.f11081r);
            }
            if (!i(f6)) {
                if (f6 == -1) {
                    throw new HttpException(f6);
                }
                try {
                    throw new HttpException(this.f11081r.getResponseMessage(), f6, null);
                } catch (IOException e6) {
                    throw new HttpException(ProtectedSandApp.s("ᲂ"), f6, e6);
                }
            }
            String headerField = this.f11081r.getHeaderField(ProtectedSandApp.s("᱿"));
            if (TextUtils.isEmpty(headerField)) {
                throw new HttpException(ProtectedSandApp.s("ᲁ"), f6, null);
            }
            try {
                URL url3 = new URL(url, headerField);
                b();
                return j(url3, i5 + 1, url, map);
            } catch (MalformedURLException e7) {
                throw new HttpException(androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("ᲀ"), headerField), f6, e7);
            }
        } catch (IOException e8) {
            throw new HttpException(ProtectedSandApp.s("ᲃ"), f(this.f11081r), e8);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    @o0
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f11082s;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f11081r;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f11081r = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        this.f11083t = true;
    }

    @Override // com.bumptech.glide.load.data.d
    @o0
    public com.bumptech.glide.load.a d() {
        return com.bumptech.glide.load.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(@o0 com.bumptech.glide.i iVar, @o0 d.a<? super InputStream> aVar) {
        String s5 = ProtectedSandApp.s("ᲅ");
        long b6 = com.bumptech.glide.util.h.b();
        try {
            try {
                aVar.f(j(this.f11078o.i(), 0, null, this.f11078o.e()));
                if (!Log.isLoggable(s5, 2)) {
                    return;
                }
            } catch (IOException e6) {
                Log.isLoggable(s5, 3);
                aVar.c(e6);
                if (!Log.isLoggable(s5, 2)) {
                    return;
                }
            }
            com.bumptech.glide.util.h.a(b6);
        } catch (Throwable th) {
            if (Log.isLoggable(s5, 2)) {
                com.bumptech.glide.util.h.a(b6);
            }
            throw th;
        }
    }

    @m1
    j(com.bumptech.glide.load.model.g gVar, int i5, b bVar) {
        this.f11078o = gVar;
        this.f11079p = i5;
        this.f11080q = bVar;
    }
}
