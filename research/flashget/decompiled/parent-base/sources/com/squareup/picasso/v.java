package com.squareup.picasso;

import android.content.Context;
import androidx.annotation.m1;
import androidx.annotation.o0;
import java.io.File;
import java.io.IOException;
import okhttp3.e;

/* compiled from: OkHttp3Downloader.java */
/* loaded from: classes6.dex */
public final class v implements k {

    /* renamed from: a, reason: collision with root package name */
    @m1
    final e.a f70965a;

    /* renamed from: b, reason: collision with root package name */
    private final okhttp3.c f70966b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f70967c;

    public v(Context context) {
        this(k0.f(context));
    }

    @Override // com.squareup.picasso.k
    @o0
    public okhttp3.f0 a(@o0 okhttp3.d0 d0Var) throws IOException {
        return this.f70965a.b(d0Var).j();
    }

    @Override // com.squareup.picasso.k
    public void shutdown() {
        okhttp3.c cVar;
        if (this.f70967c || (cVar = this.f70966b) == null) {
            return;
        }
        try {
            cVar.close();
        } catch (IOException unused) {
        }
    }

    public v(File file) {
        this(file, k0.a(file));
    }

    public v(Context context, long j4) {
        this(k0.f(context), j4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v(java.io.File r3, long r4) {
        /*
            r2 = this;
            okhttp3.b0$a r0 = new okhttp3.b0$a
            r0.<init>()
            okhttp3.c r1 = new okhttp3.c
            r1.<init>(r3, r4)
            okhttp3.b0$a r3 = r0.g(r1)
            r3.getClass()
            okhttp3.b0 r4 = new okhttp3.b0
            r4.<init>(r3)
            r2.<init>(r4)
            r3 = 0
            r2.f70967c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.v.<init>(java.io.File, long):void");
    }

    public v(okhttp3.b0 b0Var) {
        this.f70967c = true;
        this.f70965a = b0Var;
        this.f70966b = b0Var.getCache();
    }

    public v(e.a aVar) {
        this.f70967c = true;
        this.f70965a = aVar;
        this.f70966b = null;
    }
}
