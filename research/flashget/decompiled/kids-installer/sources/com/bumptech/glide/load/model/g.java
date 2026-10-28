package com.bumptech.glide.load.model;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* compiled from: GlideUrl.java */
/* loaded from: classes3.dex */
public class g implements com.bumptech.glide.load.f {

    /* renamed from: j, reason: collision with root package name */
    private static final String f11538j = ProtectedSandApp.s("ᴮ");

    /* renamed from: c, reason: collision with root package name */
    private final h f11539c;

    /* renamed from: d, reason: collision with root package name */
    @q0
    private final URL f11540d;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private final String f11541e;

    /* renamed from: f, reason: collision with root package name */
    @q0
    private String f11542f;

    /* renamed from: g, reason: collision with root package name */
    @q0
    private URL f11543g;

    /* renamed from: h, reason: collision with root package name */
    @q0
    private volatile byte[] f11544h;

    /* renamed from: i, reason: collision with root package name */
    private int f11545i;

    public g(URL url) {
        this(url, h.f11547b);
    }

    private byte[] d() {
        if (this.f11544h == null) {
            this.f11544h = c().getBytes(com.bumptech.glide.load.f.f11501b);
        }
        return this.f11544h;
    }

    private String f() {
        if (TextUtils.isEmpty(this.f11542f)) {
            String str = this.f11541e;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) com.bumptech.glide.util.l.d(this.f11540d)).toString();
            }
            this.f11542f = Uri.encode(str, ProtectedSandApp.s("ᴭ"));
        }
        return this.f11542f;
    }

    private URL g() throws MalformedURLException {
        if (this.f11543g == null) {
            this.f11543g = new URL(f());
        }
        return this.f11543g;
    }

    @Override // com.bumptech.glide.load.f
    public void a(@o0 MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f11541e;
        return str != null ? str : ((URL) com.bumptech.glide.util.l.d(this.f11540d)).toString();
    }

    public Map<String, String> e() {
        return this.f11539c.a();
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return c().equals(gVar.c()) && this.f11539c.equals(gVar.f11539c);
    }

    public String h() {
        return f();
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        if (this.f11545i == 0) {
            int hashCode = c().hashCode();
            this.f11545i = hashCode;
            this.f11545i = this.f11539c.hashCode() + (hashCode * 31);
        }
        return this.f11545i;
    }

    public URL i() throws MalformedURLException {
        return g();
    }

    public String toString() {
        return c();
    }

    public g(String str) {
        this(str, h.f11547b);
    }

    public g(URL url, h hVar) {
        this.f11540d = (URL) com.bumptech.glide.util.l.d(url);
        this.f11541e = null;
        this.f11539c = (h) com.bumptech.glide.util.l.d(hVar);
    }

    public g(String str, h hVar) {
        this.f11540d = null;
        this.f11541e = com.bumptech.glide.util.l.b(str);
        this.f11539c = (h) com.bumptech.glide.util.l.d(hVar);
    }
}
