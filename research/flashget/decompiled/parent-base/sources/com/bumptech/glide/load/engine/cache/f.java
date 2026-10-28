package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import com.bumptech.glide.load.engine.cache.a;
import com.bumptech.glide.load.engine.cache.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;

/* compiled from: ExternalCacheDiskCacheFactory.java */
@Deprecated
/* loaded from: classes3.dex */
public final class f extends d {

    /* compiled from: ExternalCacheDiskCacheFactory.java */
    class a implements d.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f43951a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f43952b;

        a(Context context, String str) {
            this.f43951a = context;
            this.f43952b = str;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public File a() {
            File externalCacheDir = this.f43951a.getExternalCacheDir();
            if (externalCacheDir == null) {
                return null;
            }
            return this.f43952b != null ? new File(externalCacheDir, this.f43952b) : externalCacheDir;
        }
    }

    public f(Context context) {
        this(context, ProtectedSandApp.s("࣌"), a.InterfaceC0737a.f43929a);
    }

    public f(Context context, int i4) {
        this(context, ProtectedSandApp.s("࣌"), i4);
    }

    public f(Context context, String str, int i4) {
        super(new a(context, str), i4);
    }
}
