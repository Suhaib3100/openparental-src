package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import androidx.annotation.q0;
import com.bumptech.glide.load.engine.cache.d;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;

/* compiled from: ExternalPreferredCacheDiskCacheFactory.java */
/* loaded from: classes3.dex */
public final class g extends d {

    /* compiled from: ExternalPreferredCacheDiskCacheFactory.java */
    class a implements d.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f11245a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f11246b;

        a(Context context, String str) {
            this.f11245a = context;
            this.f11246b = str;
        }

        @q0
        private File b() {
            File cacheDir = this.f11245a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f11246b != null ? new File(cacheDir, this.f11246b) : cacheDir;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public File a() {
            File b6 = b();
            if (b6 != null && b6.exists()) {
                return b6;
            }
            File externalCacheDir = this.f11245a.getExternalCacheDir();
            return (externalCacheDir == null || !externalCacheDir.canWrite()) ? b6 : this.f11246b != null ? new File(externalCacheDir, this.f11246b) : externalCacheDir;
        }
    }

    public g(Context context) {
        this(context, ProtectedSandApp.s("\u1ccd"), 262144000L);
    }

    public g(Context context, long j5) {
        this(context, ProtectedSandApp.s("\u1cce"), j5);
    }

    public g(Context context, String str, long j5) {
        super(new a(context, str), j5);
    }
}
