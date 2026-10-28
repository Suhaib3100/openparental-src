package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import androidx.annotation.q0;
import com.bumptech.glide.load.engine.cache.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;

/* compiled from: ExternalPreferredCacheDiskCacheFactory.java */
/* loaded from: classes3.dex */
public final class g extends d {

    /* compiled from: ExternalPreferredCacheDiskCacheFactory.java */
    class a implements d.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f43953a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f43954b;

        a(Context context, String str) {
            this.f43953a = context;
            this.f43954b = str;
        }

        @q0
        private File b() {
            File cacheDir = this.f43953a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f43954b != null ? new File(cacheDir, this.f43954b) : cacheDir;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public File a() {
            File b5 = b();
            if (b5 != null && b5.exists()) {
                return b5;
            }
            File externalCacheDir = this.f43953a.getExternalCacheDir();
            return (externalCacheDir == null || !externalCacheDir.canWrite()) ? b5 : this.f43954b != null ? new File(externalCacheDir, this.f43954b) : externalCacheDir;
        }
    }

    public g(Context context) {
        this(context, ProtectedSandApp.s("࣍"), 262144000L);
    }

    public g(Context context, long j4) {
        this(context, ProtectedSandApp.s("࣍"), j4);
    }

    public g(Context context, String str, long j4) {
        super(new a(context, str), j4);
    }
}
