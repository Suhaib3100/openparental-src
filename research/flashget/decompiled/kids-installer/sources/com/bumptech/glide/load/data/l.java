package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.o0;
import com.bumptech.glide.load.data.d;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: LocalUriFetcher.java */
/* loaded from: classes3.dex */
public abstract class l<T> implements d<T> {

    /* renamed from: r, reason: collision with root package name */
    private static final String f11087r = ProtectedSandApp.s("ᱰ");

    /* renamed from: o, reason: collision with root package name */
    private final Uri f11088o;

    /* renamed from: p, reason: collision with root package name */
    private final ContentResolver f11089p;

    /* renamed from: q, reason: collision with root package name */
    private T f11090q;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f11089p = contentResolver;
        this.f11088o = uri;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        T t5 = this.f11090q;
        if (t5 != null) {
            try {
                c(t5);
            } catch (IOException unused) {
            }
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
    public final void e(@o0 com.bumptech.glide.i iVar, @o0 d.a<? super T> aVar) {
        try {
            T f6 = f(this.f11088o, this.f11089p);
            this.f11090q = f6;
            aVar.f(f6);
        } catch (FileNotFoundException e6) {
            Log.isLoggable(ProtectedSandApp.s("ᱯ"), 3);
            aVar.c(e6);
        }
    }

    protected abstract T f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;
}
