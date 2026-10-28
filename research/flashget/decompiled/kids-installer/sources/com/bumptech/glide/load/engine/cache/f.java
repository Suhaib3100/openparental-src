package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import com.bumptech.glide.load.engine.cache.a;
import com.bumptech.glide.load.engine.cache.d;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;

/* compiled from: ExternalCacheDiskCacheFactory.java */
@Deprecated
/* loaded from: classes3.dex */
public final class f extends d {

    /* compiled from: ExternalCacheDiskCacheFactory.java */
    class a implements d.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f11243a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f11244b;

        a(Context context, String str) {
            this.f11243a = context;
            this.f11244b = str;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public File a() {
            File externalCacheDir = this.f11243a.getExternalCacheDir();
            if (externalCacheDir == null) {
                return null;
            }
            return this.f11244b != null ? new File(externalCacheDir, this.f11244b) : externalCacheDir;
        }
    }

    public f(Context context) {
        this(context, ProtectedSandApp.s("\u1ccb"), a.InterfaceC0138a.f11221a);
    }

    public f(Context context, int i5) {
        this(context, ProtectedSandApp.s("\u1ccc"), i5);
    }

    public f(Context context, String str, int i5) {
        super(new a(context, str), i5);
    }
}
