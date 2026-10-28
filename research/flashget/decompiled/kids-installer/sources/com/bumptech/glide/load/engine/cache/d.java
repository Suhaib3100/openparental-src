package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.engine.cache.a;
import java.io.File;

/* compiled from: DiskLruCacheFactory.java */
/* loaded from: classes3.dex */
public class d implements a.InterfaceC0138a {

    /* renamed from: c, reason: collision with root package name */
    private final long f11229c;

    /* renamed from: d, reason: collision with root package name */
    private final c f11230d;

    /* compiled from: DiskLruCacheFactory.java */
    class a implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f11231a;

        a(String str) {
            this.f11231a = str;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public File a() {
            return new File(this.f11231a);
        }
    }

    /* compiled from: DiskLruCacheFactory.java */
    class b implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f11232a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f11233b;

        b(String str, String str2) {
            this.f11232a = str;
            this.f11233b = str2;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public File a() {
            return new File(this.f11232a, this.f11233b);
        }
    }

    /* compiled from: DiskLruCacheFactory.java */
    /* loaded from: classes.dex */
    public interface c {
        File a();
    }

    public d(String str, long j5) {
        this(new a(str), j5);
    }

    @Override // com.bumptech.glide.load.engine.cache.a.InterfaceC0138a
    public com.bumptech.glide.load.engine.cache.a build() {
        File a6 = this.f11230d.a();
        if (a6 == null) {
            return null;
        }
        if (a6.isDirectory() || a6.mkdirs()) {
            return new e(a6, this.f11229c);
        }
        return null;
    }

    public d(String str, String str2, long j5) {
        this(new b(str, str2), j5);
    }

    public d(c cVar, long j5) {
        this.f11229c = j5;
        this.f11230d = cVar;
    }
}
