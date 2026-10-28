package com.bumptech.glide.load.model;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.o0;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.model.o;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: MediaStoreFileLoader.java */
/* loaded from: classes3.dex */
public final class l implements o<Uri, File> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f44307a;

    /* compiled from: MediaStoreFileLoader.java */
    public static final class a implements p<Uri, File> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f44308a;

        public a(Context context) {
            this.f44308a = context;
        }

        @Override // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override // com.bumptech.glide.load.model.p
        @o0
        public o<Uri, File> e(s sVar) {
            return new l(this.f44308a);
        }
    }

    /* compiled from: MediaStoreFileLoader.java */
    private static class b implements com.bumptech.glide.load.data.d<File> {

        /* renamed from: d, reason: collision with root package name */
        private static final String[] f44309d = {ProtectedSandApp.s("५")};

        /* renamed from: b, reason: collision with root package name */
        private final Context f44310b;

        /* renamed from: c, reason: collision with root package name */
        private final Uri f44311c;

        b(Context context, Uri uri) {
            this.f44310b = context;
            this.f44311c = uri;
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
        public void e(@o0 com.bumptech.glide.j jVar, @o0 d.a<? super File> aVar) {
            Cursor query = this.f44310b.getContentResolver().query(this.f44311c, f44309d, null, null, null);
            if (query != null) {
                try {
                    r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow(ProtectedSandApp.s("५"))) : null;
                } finally {
                    query.close();
                }
            }
            if (!TextUtils.isEmpty(r0)) {
                aVar.f(new File(r0));
                return;
            }
            aVar.c(new FileNotFoundException(ProtectedSandApp.s("६") + this.f44311c));
        }
    }

    public l(Context context) {
        this.f44307a = context;
    }

    @Override // com.bumptech.glide.load.model.o
    public boolean a(@o0 Uri uri) {
        return com.bumptech.glide.load.data.mediastore.b.c(uri);
    }

    @Override // com.bumptech.glide.load.model.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<File> b(@o0 Uri uri, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) {
        return new o.a<>(new com.bumptech.glide.signature.e(uri), new b(this.f44307a, uri));
    }

    public boolean d(@o0 Uri uri) {
        return com.bumptech.glide.load.data.mediastore.b.c(uri);
    }
}
