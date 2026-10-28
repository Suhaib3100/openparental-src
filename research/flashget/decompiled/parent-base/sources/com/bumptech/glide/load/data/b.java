package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.o0;
import com.bumptech.glide.load.data.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: AssetPathFetcher.java */
/* loaded from: classes3.dex */
public abstract class b<T> implements d<T> {

    /* renamed from: e, reason: collision with root package name */
    private static final String f43762e = ProtectedSandApp.s("ࡨ");

    /* renamed from: b, reason: collision with root package name */
    private final String f43763b;

    /* renamed from: c, reason: collision with root package name */
    private final AssetManager f43764c;

    /* renamed from: d, reason: collision with root package name */
    private T f43765d;

    public b(AssetManager assetManager, String str) {
        this.f43764c = assetManager;
        this.f43763b = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        T t4 = this.f43765d;
        if (t4 == null) {
            return;
        }
        try {
            c(t4);
        } catch (IOException unused) {
        }
    }

    protected abstract void c(T t4) throws IOException;

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    @o0
    public com.bumptech.glide.load.a d() {
        return com.bumptech.glide.load.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(@o0 com.bumptech.glide.j jVar, @o0 d.a<? super T> aVar) {
        try {
            T f4 = f(this.f43764c, this.f43763b);
            this.f43765d = f4;
            aVar.f(f4);
        } catch (IOException e4) {
            Log.isLoggable(ProtectedSandApp.s("ࡨ"), 3);
            aVar.c(e4);
        }
    }

    protected abstract T f(AssetManager assetManager, String str) throws IOException;
}
