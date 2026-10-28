package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.o0;
import com.bumptech.glide.load.model.n;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.r;
import com.bumptech.glide.load.resource.bitmap.q0;
import java.io.InputStream;

/* compiled from: MediaStoreVideoThumbLoader.java */
/* loaded from: classes3.dex */
public class e implements n<Uri, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11608a;

    /* compiled from: MediaStoreVideoThumbLoader.java */
    public static class a implements o<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f11609a;

        public a(Context context) {
            this.f11609a = context;
        }

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @o0
        public n<Uri, InputStream> c(r rVar) {
            return new e(this.f11609a);
        }
    }

    public e(Context context) {
        this.f11608a = context.getApplicationContext();
    }

    private boolean e(com.bumptech.glide.load.i iVar) {
        Long l5 = (Long) iVar.c(q0.f11770g);
        return l5 != null && l5.longValue() == -1;
    }

    @Override // com.bumptech.glide.load.model.n
    @androidx.annotation.q0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<InputStream> b(@o0 Uri uri, int i5, int i6, @o0 com.bumptech.glide.load.i iVar) {
        if (com.bumptech.glide.load.data.mediastore.b.d(i5, i6) && e(iVar)) {
            return new n.a<>(new com.bumptech.glide.signature.e(uri), com.bumptech.glide.load.data.mediastore.c.g(this.f11608a, uri));
        }
        return null;
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 Uri uri) {
        return com.bumptech.glide.load.data.mediastore.b.c(uri);
    }
}
