package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.m1;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: AttributeStrategy.java */
/* loaded from: classes3.dex */
class c implements l {

    /* renamed from: a, reason: collision with root package name */
    private final b f11152a = new b();

    /* renamed from: b, reason: collision with root package name */
    private final h<a, Bitmap> f11153b = new h<>();

    /* compiled from: AttributeStrategy.java */
    @m1
    static class a implements m {

        /* renamed from: a, reason: collision with root package name */
        private final b f11154a;

        /* renamed from: b, reason: collision with root package name */
        private int f11155b;

        /* renamed from: c, reason: collision with root package name */
        private int f11156c;

        /* renamed from: d, reason: collision with root package name */
        private Bitmap.Config f11157d;

        public a(b bVar) {
            this.f11154a = bVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
        public void a() {
            this.f11154a.c(this);
        }

        public void b(int i5, int i6, Bitmap.Config config) {
            this.f11155b = i5;
            this.f11156c = i6;
            this.f11157d = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f11155b == aVar.f11155b && this.f11156c == aVar.f11156c && this.f11157d == aVar.f11157d;
        }

        public int hashCode() {
            int i5 = ((this.f11155b * 31) + this.f11156c) * 31;
            Bitmap.Config config = this.f11157d;
            return i5 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return c.e(this.f11155b, this.f11156c, this.f11157d);
        }
    }

    /* compiled from: AttributeStrategy.java */
    @m1
    static class b extends d<a> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        a e(int i5, int i6, Bitmap.Config config) {
            a b6 = b();
            b6.b(i5, i6, config);
            return b6;
        }
    }

    c() {
    }

    static String e(int i5, int i6, Bitmap.Config config) {
        return ProtectedSandApp.s("Თ") + i5 + ProtectedSandApp.s("Ი") + i6 + ProtectedSandApp.s("Კ") + config;
    }

    private static String g(Bitmap bitmap) {
        return e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String a(int i5, int i6, Bitmap.Config config) {
        return e(i5, i6, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public int b(Bitmap bitmap) {
        return com.bumptech.glide.util.n.h(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String c(Bitmap bitmap) {
        return g(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public void d(Bitmap bitmap) {
        this.f11153b.d(this.f11152a.e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public Bitmap f(int i5, int i6, Bitmap.Config config) {
        return this.f11153b.a(this.f11152a.e(i5, i6, config));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public Bitmap removeLast() {
        return this.f11153b.f();
    }

    public String toString() {
        return ProtectedSandApp.s("Ლ") + this.f11153b;
    }
}
