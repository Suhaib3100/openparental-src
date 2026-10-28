package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.o0;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.p;
import com.bumptech.glide.load.model.s;
import com.bumptech.glide.load.resource.bitmap.q0;
import java.io.InputStream;

/* compiled from: MediaStoreVideoThumbLoader.java */
/* loaded from: classes3.dex */
public class e implements o<Uri, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f44351a;

    /* compiled from: MediaStoreVideoThumbLoader.java */
    public static class a implements p<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f44352a;

        public a(Context context) {
            this.f44352a = context;
        }

        @Override // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override // com.bumptech.glide.load.model.p
        @o0
        public o<Uri, InputStream> e(s sVar) {
            return new e(this.f44352a);
        }
    }

    public e(Context context) {
        this.f44351a = context.getApplicationContext();
    }

    private boolean e(com.bumptech.glide.load.i iVar) {
        Long l4 = (Long) iVar.c(q0.f44535g);
        return l4 != null && l4.longValue() == -1;
    }

    @Override // com.bumptech.glide.load.model.o
    @androidx.annotation.q0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> b(@o0 Uri uri, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) {
        if (com.bumptech.glide.load.data.mediastore.b.e(i4, i5) && e(iVar)) {
            return new o.a<>(new com.bumptech.glide.signature.e(uri), com.bumptech.glide.load.data.mediastore.c.g(this.f44351a, uri));
        }
        return null;
    }

    @Override // com.bumptech.glide.load.model.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 Uri uri) {
        return com.bumptech.glide.load.data.mediastore.b.d(uri);
    }
}
