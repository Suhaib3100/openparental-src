package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.d0;
import com.squareup.picasso.w;
import java.io.IOException;
import okhttp3.d;
import okhttp3.d0;

/* compiled from: NetworkRequestHandler.java */
/* loaded from: classes6.dex */
class u extends d0 {

    /* renamed from: c, reason: collision with root package name */
    private static final String f70959c = "http";

    /* renamed from: d, reason: collision with root package name */
    private static final String f70960d = "https";

    /* renamed from: a, reason: collision with root package name */
    private final k f70961a;

    /* renamed from: b, reason: collision with root package name */
    private final f0 f70962b;

    /* compiled from: NetworkRequestHandler.java */
    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    /* compiled from: NetworkRequestHandler.java */
    static final class b extends IOException {

        /* renamed from: b, reason: collision with root package name */
        final int f70963b;

        /* renamed from: c, reason: collision with root package name */
        final int f70964c;

        b(int i4, int i5) {
            super(android.support.v4.media.a.a("HTTP ", i4));
            this.f70963b = i4;
            this.f70964c = i5;
        }
    }

    u(k kVar, f0 f0Var) {
        this.f70961a = kVar;
        this.f70962b = f0Var;
    }

    private static okhttp3.d0 j(b0 b0Var, int i4) {
        okhttp3.d dVar;
        if (i4 == 0) {
            dVar = null;
        } else if (t.isOfflineOnly(i4)) {
            dVar = okhttp3.d.f84056o;
        } else {
            d.a aVar = new d.a();
            if (!t.shouldReadFromDiskCache(i4)) {
                aVar.g();
            }
            if (!t.shouldWriteToDiskCache(i4)) {
                aVar.h();
            }
            dVar = aVar.a();
        }
        d0.a B = new d0.a().B(b0Var.f70750d.toString());
        if (dVar != null) {
            B.c(dVar);
        }
        return B.b();
    }

    @Override // com.squareup.picasso.d0
    public boolean c(b0 b0Var) {
        String scheme = b0Var.f70750d.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    @Override // com.squareup.picasso.d0
    int e() {
        return 2;
    }

    @Override // com.squareup.picasso.d0
    public d0.a f(b0 b0Var, int i4) throws IOException {
        okhttp3.f0 a5 = this.f70961a.a(j(b0Var, i4));
        okhttp3.g0 o4 = a5.o();
        if (!a5.r1()) {
            o4.close();
            throw new b(a5.u(), b0Var.f70749c);
        }
        w.e eVar = a5.s() == null ? w.e.NETWORK : w.e.DISK;
        if (eVar == w.e.DISK && o4.getContentLength() == 0) {
            o4.close();
            throw new a("Received response with 0 content-length header.");
        }
        if (eVar == w.e.NETWORK && o4.getContentLength() > 0) {
            this.f70962b.f(o4.getContentLength());
        }
        return new d0.a(o4.getSource(), eVar);
    }

    @Override // com.squareup.picasso.d0
    boolean h(boolean z4, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    @Override // com.squareup.picasso.d0
    boolean i() {
        return true;
    }
}
