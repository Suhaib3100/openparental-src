package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.m1;
import androidx.collection.n1;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: AttributeStrategy.java */
/* loaded from: classes3.dex */
class c implements l {

    /* renamed from: a, reason: collision with root package name */
    private final b f43860a = new b();

    /* renamed from: b, reason: collision with root package name */
    private final h<a, Bitmap> f43861b = new h<>();

    /* compiled from: AttributeStrategy.java */
    @m1
    static class a implements m {

        /* renamed from: a, reason: collision with root package name */
        private final b f43862a;

        /* renamed from: b, reason: collision with root package name */
        private int f43863b;

        /* renamed from: c, reason: collision with root package name */
        private int f43864c;

        /* renamed from: d, reason: collision with root package name */
        private Bitmap.Config f43865d;

        public a(b bVar) {
            this.f43862a = bVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
        public void a() {
            this.f43862a.c(this);
        }

        public void b(int i4, int i5, Bitmap.Config config) {
            this.f43863b = i4;
            this.f43864c = i5;
            this.f43865d = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f43863b == aVar.f43863b && this.f43864c == aVar.f43864c && this.f43865d == aVar.f43865d;
        }

        public int hashCode() {
            int i4 = ((this.f43863b * 31) + this.f43864c) * 31;
            Bitmap.Config config = this.f43865d;
            return i4 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return c.d(this.f43863b, this.f43864c, this.f43865d);
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

        a e(int i4, int i5, Bitmap.Config config) {
            a b5 = b();
            b5.b(i4, i5, config);
            return b5;
        }
    }

    c() {
    }

    static String d(int i4, int i5, Bitmap.Config config) {
        StringBuilder a5 = n1.a(ProtectedSandApp.s("࢙"), i4, ProtectedSandApp.s("࢚"), i5, ProtectedSandApp.s("࢛"));
        a5.append(config);
        return a5.toString();
    }

    private static String g(Bitmap bitmap) {
        return d(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String a(Bitmap bitmap) {
        return g(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String b(int i4, int i5, Bitmap.Config config) {
        return d(i4, i5, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public int c(Bitmap bitmap) {
        return com.bumptech.glide.util.o.i(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public void e(Bitmap bitmap) {
        this.f43861b.d(this.f43860a.e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public Bitmap f(int i4, int i5, Bitmap.Config config) {
        return this.f43861b.a(this.f43860a.e(i4, i5, config));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public Bitmap removeLast() {
        return this.f43861b.f();
    }

    public String toString() {
        return ProtectedSandApp.s("࢜") + this.f43861b;
    }
}
