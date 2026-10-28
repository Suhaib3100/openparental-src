package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import com.bumptech.glide.load.engine.cache.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;

/* compiled from: InternalCacheDiskCacheFactory.java */
/* loaded from: classes3.dex */
public final class h extends d {

    /* compiled from: InternalCacheDiskCacheFactory.java */
    class a implements d.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f43955a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f43956b;

        a(Context context, String str) {
            this.f43955a = context;
            this.f43956b = str;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public File a() {
            File cacheDir = this.f43955a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f43956b != null ? new File(cacheDir, this.f43956b) : cacheDir;
        }
    }

    public h(Context context) {
        this(context, ProtectedSandApp.s("࣎"), 262144000L);
    }

    public h(Context context, long j4) {
        this(context, ProtectedSandApp.s("࣎"), j4);
    }

    public h(Context context, String str, long j4) {
        super(new a(context, str), j4);
    }
}
