package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import androidx.annotation.m1;
import androidx.annotation.o0;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.g;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ThumbFetcher.java */
/* loaded from: classes3.dex */
public class c implements com.bumptech.glide.load.data.d<InputStream> {

    /* renamed from: e, reason: collision with root package name */
    private static final String f43799e = ProtectedSandApp.s("ࡿ");

    /* renamed from: b, reason: collision with root package name */
    private final Uri f43800b;

    /* renamed from: c, reason: collision with root package name */
    private final e f43801c;

    /* renamed from: d, reason: collision with root package name */
    private InputStream f43802d;

    /* compiled from: ThumbFetcher.java */
    static class a implements d {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f43805a;

        /* renamed from: c, reason: collision with root package name */
        private static final String f43804c = ProtectedSandApp.s("ࡻ");

        /* renamed from: b, reason: collision with root package name */
        private static final String[] f43803b = {ProtectedSandApp.s("ࡼ")};

        a(ContentResolver contentResolver) {
            this.f43805a = contentResolver;
        }

        @Override // com.bumptech.glide.load.data.mediastore.d
        public Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f43805a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f43803b, ProtectedSandApp.s("ࡻ"), new String[]{lastPathSegment}, null);
        }
    }

    /* compiled from: ThumbFetcher.java */
    static class b implements d {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f43808a;

        /* renamed from: c, reason: collision with root package name */
        private static final String f43807c = ProtectedSandApp.s("ࡽ");

        /* renamed from: b, reason: collision with root package name */
        private static final String[] f43806b = {ProtectedSandApp.s("ࡾ")};

        b(ContentResolver contentResolver) {
            this.f43808a = contentResolver;
        }

        @Override // com.bumptech.glide.load.data.mediastore.d
        public Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f43808a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f43806b, ProtectedSandApp.s("ࡽ"), new String[]{lastPathSegment}, null);
        }
    }

    @m1
    c(Uri uri, e eVar) {
        this.f43800b = uri;
        this.f43801c = eVar;
    }

    private static c c(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.c.e(context).n().g(), dVar, com.bumptech.glide.c.e(context).g(), context.getContentResolver()));
    }

    public static c f(Context context, Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }

    public static c g(Context context, Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }

    private InputStream h() throws FileNotFoundException {
        InputStream d5 = this.f43801c.d(this.f43800b);
        int a5 = d5 != null ? this.f43801c.a(this.f43800b) : -1;
        return a5 != -1 ? new g(d5, a5) : d5;
    }

    @Override // com.bumptech.glide.load.data.d
    @o0
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f43802d;
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
    public void e(@o0 j jVar, @o0 d.a<? super InputStream> aVar) {
        try {
            InputStream h4 = h();
            this.f43802d = h4;
            aVar.f(h4);
        } catch (FileNotFoundException e4) {
            Log.isLoggable(ProtectedSandApp.s("ࡿ"), 3);
            aVar.c(e4);
        }
    }
}
