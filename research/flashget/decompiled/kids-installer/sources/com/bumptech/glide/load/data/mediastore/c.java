package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import androidx.annotation.m1;
import androidx.annotation.o0;
import com.bumptech.glide.i;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.g;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ThumbFetcher.java */
/* loaded from: classes3.dex */
public class c implements com.bumptech.glide.load.data.d<InputStream> {

    /* renamed from: r, reason: collision with root package name */
    private static final String f11093r = ProtectedSandApp.s("\u1c8d");

    /* renamed from: o, reason: collision with root package name */
    private final Uri f11094o;

    /* renamed from: p, reason: collision with root package name */
    private final e f11095p;

    /* renamed from: q, reason: collision with root package name */
    private InputStream f11096q;

    /* compiled from: ThumbFetcher.java */
    static class a implements d {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f11099a;

        /* renamed from: c, reason: collision with root package name */
        private static final String f11098c = ProtectedSandApp.s("ᲆ");

        /* renamed from: b, reason: collision with root package name */
        private static final String[] f11097b = {ProtectedSandApp.s("ᲇ")};

        a(ContentResolver contentResolver) {
            this.f11099a = contentResolver;
        }

        @Override // com.bumptech.glide.load.data.mediastore.d
        public Cursor a(Uri uri) {
            return this.f11099a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f11097b, ProtectedSandApp.s("ᲈ"), new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* compiled from: ThumbFetcher.java */
    static class b implements d {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f11102a;

        /* renamed from: c, reason: collision with root package name */
        private static final String f11101c = ProtectedSandApp.s("\u1c89");

        /* renamed from: b, reason: collision with root package name */
        private static final String[] f11100b = {ProtectedSandApp.s("\u1c8a")};

        b(ContentResolver contentResolver) {
            this.f11102a = contentResolver;
        }

        @Override // com.bumptech.glide.load.data.mediastore.d
        public Cursor a(Uri uri) {
            return this.f11102a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f11100b, ProtectedSandApp.s("\u1c8b"), new String[]{uri.getLastPathSegment()}, null);
        }
    }

    @m1
    c(Uri uri, e eVar) {
        this.f11094o = uri;
        this.f11095p = eVar;
    }

    private static c c(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.b.e(context).n().g(), dVar, com.bumptech.glide.b.e(context).g(), context.getContentResolver()));
    }

    public static c f(Context context, Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }

    public static c g(Context context, Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }

    private InputStream h() throws FileNotFoundException {
        InputStream d6 = this.f11095p.d(this.f11094o);
        int a6 = d6 != null ? this.f11095p.a(this.f11094o) : -1;
        return a6 != -1 ? new g(d6, a6) : d6;
    }

    @Override // com.bumptech.glide.load.data.d
    @o0
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f11096q;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    @o0
    public com.bumptech.glide.load.a d() {
        return com.bumptech.glide.load.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(@o0 i iVar, @o0 d.a<? super InputStream> aVar) {
        try {
            InputStream h5 = h();
            this.f11096q = h5;
            aVar.f(h5);
        } catch (FileNotFoundException e6) {
            Log.isLoggable(ProtectedSandApp.s("\u1c8c"), 3);
            aVar.c(e6);
        }
    }
}
