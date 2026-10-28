package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import com.bumptech.glide.load.engine.cache.d;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;

/* compiled from: InternalCacheDiskCacheFactory.java */
/* loaded from: classes3.dex */
public final class h extends d {

    /* compiled from: InternalCacheDiskCacheFactory.java */
    class a implements d.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f11247a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f11248b;

        a(Context context, String str) {
            this.f11247a = context;
            this.f11248b = str;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public File a() {
            File cacheDir = this.f11247a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f11248b != null ? new File(cacheDir, this.f11248b) : cacheDir;
        }
    }

    public h(Context context) {
        this(context, ProtectedSandApp.s("\u1ccf"), 262144000L);
    }

    public h(Context context, long j5) {
        this(context, ProtectedSandApp.s("᳐"), j5);
    }

    public h(Context context, String str, long j5) {
        super(new a(context, str), j5);
    }
}
