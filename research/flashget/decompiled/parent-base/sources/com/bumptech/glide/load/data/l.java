package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.o0;
import com.bumptech.glide.load.data.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: LocalUriFetcher.java */
/* loaded from: classes3.dex */
public abstract class l<T> implements d<T> {

    /* renamed from: e, reason: collision with root package name */
    private static final String f43793e = ProtectedSandApp.s("ࡥ");

    /* renamed from: b, reason: collision with root package name */
    private final Uri f43794b;

    /* renamed from: c, reason: collision with root package name */
    private final ContentResolver f43795c;

    /* renamed from: d, reason: collision with root package name */
    private T f43796d;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f43795c = contentResolver;
        this.f43794b = uri;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        T t4 = this.f43796d;
        if (t4 != null) {
            try {
                c(t4);
            } catch (IOException unused) {
            }
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
    public final void e(@o0 com.bumptech.glide.j jVar, @o0 d.a<? super T> aVar) {
        try {
            T f4 = f(this.f43794b, this.f43795c);
            this.f43796d = f4;
            aVar.f(f4);
        } catch (FileNotFoundException e4) {
            Log.isLoggable(ProtectedSandApp.s("ࡥ"), 3);
            aVar.c(e4);
        }
    }

    protected abstract T f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;
}
