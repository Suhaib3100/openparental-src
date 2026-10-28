package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.o0;
import com.bumptech.glide.load.data.d;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;

/* compiled from: AssetPathFetcher.java */
/* loaded from: classes3.dex */
public abstract class b<T> implements d<T> {

    /* renamed from: r, reason: collision with root package name */
    private static final String f11056r = ProtectedSandApp.s("ᱴ");

    /* renamed from: o, reason: collision with root package name */
    private final String f11057o;

    /* renamed from: p, reason: collision with root package name */
    private final AssetManager f11058p;

    /* renamed from: q, reason: collision with root package name */
    private T f11059q;

    public b(AssetManager assetManager, String str) {
        this.f11058p = assetManager;
        this.f11057o = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        T t5 = this.f11059q;
        if (t5 == null) {
            return;
        }
        try {
            c(t5);
        } catch (IOException unused) {
        }
    }

    protected abstract void c(T t5) throws IOException;

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    @o0
    public com.bumptech.glide.load.a d() {
        return com.bumptech.glide.load.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(@o0 com.bumptech.glide.i iVar, @o0 d.a<? super T> aVar) {
        try {
            T f6 = f(this.f11058p, this.f11057o);
            this.f11059q = f6;
            aVar.f(f6);
        } catch (IOException e6) {
            Log.isLoggable(ProtectedSandApp.s("ᱳ"), 3);
            aVar.c(e6);
        }
    }

    protected abstract T f(AssetManager assetManager, String str) throws IOException;
}
