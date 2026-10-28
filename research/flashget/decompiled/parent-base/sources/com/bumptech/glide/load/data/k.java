package com.bumptech.glide.load.data;

import androidx.annotation.o0;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.resource.bitmap.h0;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: InputStreamRewinder.java */
/* loaded from: classes3.dex */
public final class k implements e<InputStream> {

    /* renamed from: b, reason: collision with root package name */
    private static final int f43790b = 5242880;

    /* renamed from: a, reason: collision with root package name */
    private final h0 f43791a;

    /* compiled from: InputStreamRewinder.java */
    public static final class a implements e.a<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.engine.bitmap_recycle.b f43792a;

        public a(com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f43792a = bVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @o0
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @o0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e<InputStream> b(InputStream inputStream) {
            return new k(inputStream, this.f43792a);
        }
    }

    public k(InputStream inputStream, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        h0 h0Var = new h0(inputStream, bVar);
        this.f43791a = h0Var;
        h0Var.mark(f43790b);
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
        this.f43791a.release();
    }

    public void c() {
        this.f43791a.b();
    }

    @Override // com.bumptech.glide.load.data.e
    @o0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream a() throws IOException {
        this.f43791a.reset();
        return this.f43791a;
    }
}
