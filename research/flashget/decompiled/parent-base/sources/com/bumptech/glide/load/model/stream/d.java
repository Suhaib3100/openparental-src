package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.o0;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.p;
import com.bumptech.glide.load.model.s;
import java.io.InputStream;

/* compiled from: MediaStoreImageThumbLoader.java */
/* loaded from: classes3.dex */
public class d implements o<Uri, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f44349a;

    /* compiled from: MediaStoreImageThumbLoader.java */
    public static class a implements p<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f44350a;

        public a(Context context) {
            this.f44350a = context;
        }

        @Override // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override // com.bumptech.glide.load.model.p
        @o0
        public o<Uri, InputStream> e(s sVar) {
            return new d(this.f44350a);
        }
    }

    public d(Context context) {
        this.f44349a = context.getApplicationContext();
    }

    @Override // com.bumptech.glide.load.model.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> b(@o0 Uri uri, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) {
        if (com.bumptech.glide.load.data.mediastore.b.e(i4, i5)) {
            return new o.a<>(new com.bumptech.glide.signature.e(uri), com.bumptech.glide.load.data.mediastore.c.f(this.f44349a, uri));
        }
        return null;
    }

    @Override // com.bumptech.glide.load.model.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 Uri uri) {
        return com.bumptech.glide.load.data.mediastore.b.b(uri);
    }
}
