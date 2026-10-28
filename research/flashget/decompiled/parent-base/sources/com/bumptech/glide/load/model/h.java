package com.bumptech.glide.load.model;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* compiled from: GlideUrl.java */
/* loaded from: classes3.dex */
public class h implements com.bumptech.glide.load.f {

    /* renamed from: j, reason: collision with root package name */
    private static final String f44288j = ProtectedSandApp.s("॥");

    /* renamed from: c, reason: collision with root package name */
    private final i f44289c;

    /* renamed from: d, reason: collision with root package name */
    @q0
    private final URL f44290d;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private final String f44291e;

    /* renamed from: f, reason: collision with root package name */
    @q0
    private String f44292f;

    /* renamed from: g, reason: collision with root package name */
    @q0
    private URL f44293g;

    /* renamed from: h, reason: collision with root package name */
    @q0
    private volatile byte[] f44294h;

    /* renamed from: i, reason: collision with root package name */
    private int f44295i;

    public h(URL url) {
        this(url, i.f44297b);
    }

    private byte[] d() {
        if (this.f44294h == null) {
            this.f44294h = c().getBytes(com.bumptech.glide.load.f.f44241b);
        }
        return this.f44294h;
    }

    private String f() {
        if (TextUtils.isEmpty(this.f44292f)) {
            String str = this.f44291e;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) com.bumptech.glide.util.m.f(this.f44290d, ProtectedSandApp.s("।"))).toString();
            }
            this.f44292f = Uri.encode(str, ProtectedSandApp.s("॥"));
        }
        return this.f44292f;
    }

    private URL g() throws MalformedURLException {
        if (this.f44293g == null) {
            this.f44293g = new URL(f());
        }
        return this.f44293g;
    }

    @Override // com.bumptech.glide.load.f
    public void b(@o0 MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f44291e;
        return str != null ? str : ((URL) com.bumptech.glide.util.m.f(this.f44290d, ProtectedSandApp.s("।"))).toString();
    }

    public Map<String, String> e() {
        return this.f44289c.a();
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return c().equals(hVar.c()) && this.f44289c.equals(hVar.f44289c);
    }

    public String h() {
        return f();
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        if (this.f44295i == 0) {
            int hashCode = c().hashCode();
            this.f44295i = hashCode;
            this.f44295i = this.f44289c.hashCode() + (hashCode * 31);
        }
        return this.f44295i;
    }

    public URL i() throws MalformedURLException {
        return g();
    }

    public String toString() {
        return c();
    }

    public h(String str) {
        this(str, i.f44297b);
    }

    public h(URL url, i iVar) {
        String s4 = ProtectedSandApp.s("।");
        this.f44290d = (URL) com.bumptech.glide.util.m.f(url, s4);
        this.f44291e = null;
        this.f44289c = (i) com.bumptech.glide.util.m.f(iVar, s4);
    }

    public h(String str, i iVar) {
        this.f44290d = null;
        this.f44291e = com.bumptech.glide.util.m.c(str);
        this.f44289c = (i) com.bumptech.glide.util.m.f(iVar, ProtectedSandApp.s("।"));
    }
}
