package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.engine.cache.a;
import java.io.File;

/* compiled from: DiskLruCacheFactory.java */
/* loaded from: classes3.dex */
public class d implements a.InterfaceC0737a {

    /* renamed from: c, reason: collision with root package name */
    private final long f43937c;

    /* renamed from: d, reason: collision with root package name */
    private final c f43938d;

    /* compiled from: DiskLruCacheFactory.java */
    class a implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f43939a;

        a(String str) {
            this.f43939a = str;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public File a() {
            return new File(this.f43939a);
        }
    }

    /* compiled from: DiskLruCacheFactory.java */
    class b implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f43940a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f43941b;

        b(String str, String str2) {
            this.f43940a = str;
            this.f43941b = str2;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public File a() {
            return new File(this.f43940a, this.f43941b);
        }
    }

    /* compiled from: DiskLruCacheFactory.java */
    public interface c {
        File a();
    }

    public d(String str, long j4) {
        this(new a(str), j4);
    }

    @Override // com.bumptech.glide.load.engine.cache.a.InterfaceC0737a
    public com.bumptech.glide.load.engine.cache.a a() {
        File a5 = this.f43938d.a();
        if (a5 == null) {
            return null;
        }
        if (a5.isDirectory() || a5.mkdirs()) {
            return new e(a5, this.f43937c);
        }
        return null;
    }

    public d(String str, String str2, long j4) {
        this(new b(str, str2), j4);
    }

    public d(c cVar, long j4) {
        this.f43937c = j4;
        this.f43938d = cVar;
    }
}
