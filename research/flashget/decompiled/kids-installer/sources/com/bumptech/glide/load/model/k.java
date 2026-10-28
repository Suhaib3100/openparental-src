package com.bumptech.glide.load.model;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.o0;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.model.n;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: MediaStoreFileLoader.java */
/* loaded from: classes3.dex */
public final class k implements n<Uri, File> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11557a;

    /* compiled from: MediaStoreFileLoader.java */
    public static final class a implements o<Uri, File> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f11558a;

        public a(Context context) {
            this.f11558a = context;
        }

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @o0
        public n<Uri, File> c(r rVar) {
            return new k(this.f11558a);
        }
    }

    /* compiled from: MediaStoreFileLoader.java */
    private static class b implements com.bumptech.glide.load.data.d<File> {

        /* renamed from: q, reason: collision with root package name */
        private static final String[] f11559q = {ProtectedSandApp.s("ᴲ")};

        /* renamed from: o, reason: collision with root package name */
        private final Context f11560o;

        /* renamed from: p, reason: collision with root package name */
        private final Uri f11561p;

        b(Context context, Uri uri) {
            this.f11560o = context;
            this.f11561p = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        @o0
        public Class<File> a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
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
        public void e(@o0 com.bumptech.glide.i iVar, @o0 d.a<? super File> aVar) {
            Cursor query = this.f11560o.getContentResolver().query(this.f11561p, f11559q, null, null, null);
            if (query != null) {
                try {
                    r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow(ProtectedSandApp.s("ᴳ"))) : null;
                } finally {
                    query.close();
                }
            }
            if (!TextUtils.isEmpty(r0)) {
                aVar.f(new File(r0));
                return;
            }
            aVar.c(new FileNotFoundException(ProtectedSandApp.s("ᴴ") + this.f11561p));
        }
    }

    public k(Context context) {
        this.f11557a = context;
    }

    @Override // com.bumptech.glide.load.model.n
    public boolean a(@o0 Uri uri) {
        return com.bumptech.glide.load.data.mediastore.b.b(uri);
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<File> b(@o0 Uri uri, int i5, int i6, @o0 com.bumptech.glide.load.i iVar) {
        return new n.a<>(new com.bumptech.glide.signature.e(uri), new b(this.f11557a, uri));
    }

    public boolean d(@o0 Uri uri) {
        return com.bumptech.glide.load.data.mediastore.b.b(uri);
    }
}
