package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.o0;
import com.bumptech.glide.load.model.n;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.r;
import java.io.InputStream;

/* compiled from: MediaStoreImageThumbLoader.java */
/* loaded from: classes3.dex */
public class d implements n<Uri, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11606a;

    /* compiled from: MediaStoreImageThumbLoader.java */
    public static class a implements o<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f11607a;

        public a(Context context) {
            this.f11607a = context;
        }

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @o0
        public n<Uri, InputStream> c(r rVar) {
            return new d(this.f11607a);
        }
    }

    public d(Context context) {
        this.f11606a = context.getApplicationContext();
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<InputStream> b(@o0 Uri uri, int i5, int i6, @o0 com.bumptech.glide.load.i iVar) {
        if (com.bumptech.glide.load.data.mediastore.b.d(i5, i6)) {
            return new n.a<>(new com.bumptech.glide.signature.e(uri), com.bumptech.glide.load.data.mediastore.c.f(this.f11606a, uri));
        }
        return null;
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 Uri uri) {
        return com.bumptech.glide.load.data.mediastore.b.a(uri);
    }
}
