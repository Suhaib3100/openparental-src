package com.bumptech.glide.load.resource.bitmap;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: DownsampleStrategy.java */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final p f11758a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final p f11759b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final p f11760c = new e();

    /* renamed from: d, reason: collision with root package name */
    public static final p f11761d = new c();

    /* renamed from: e, reason: collision with root package name */
    public static final p f11762e;

    /* renamed from: f, reason: collision with root package name */
    public static final p f11763f;

    /* renamed from: g, reason: collision with root package name */
    public static final p f11764g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.bumptech.glide.load.h<p> f11765h;

    /* renamed from: i, reason: collision with root package name */
    static final boolean f11766i;

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: classes3.dex */
    private static class a extends p {
        a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.p
        public g a(int i5, int i6, int i7, int i8) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.p
        public float b(int i5, int i6, int i7, int i8) {
            if (Math.min(i6 / i8, i5 / i7) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: classes3.dex */
    private static class b extends p {
        b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.p
        public g a(int i5, int i6, int i7, int i8) {
            return g.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.p
        public float b(int i5, int i6, int i7, int i8) {
            int ceil = (int) Math.ceil(Math.max(i6 / i8, i5 / i7));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(ceil)) >= ceil ? 0 : 1));
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: classes3.dex */
    private static class c extends p {
        c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.p
        public g a(int i5, int i6, int i7, int i8) {
            return b(i5, i6, i7, i8) == 1.0f ? g.QUALITY : p.f11760c.a(i5, i6, i7, i8);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.p
        public float b(int i5, int i6, int i7, int i8) {
            return Math.min(1.0f, p.f11760c.b(i5, i6, i7, i8));
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: classes3.dex */
    private static class d extends p {
        d() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.p
        public g a(int i5, int i6, int i7, int i8) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.p
        public float b(int i5, int i6, int i7, int i8) {
            return Math.max(i7 / i5, i8 / i6);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: classes3.dex */
    private static class e extends p {
        e() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.p
        public g a(int i5, int i6, int i7, int i8) {
            return p.f11766i ? g.QUALITY : g.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.p
        public float b(int i5, int i6, int i7, int i8) {
            if (p.f11766i) {
                return Math.min(i7 / i5, i8 / i6);
            }
            if (Math.max(i6 / i8, i5 / i7) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: classes3.dex */
    private static class f extends p {
        f() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.p
        public g a(int i5, int i6, int i7, int i8) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.p
        public float b(int i5, int i6, int i7, int i8) {
            return 1.0f;
        }
    }

    /* compiled from: DownsampleStrategy.java */
    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        f11762e = dVar;
        f11763f = new f();
        f11764g = dVar;
        f11765h = com.bumptech.glide.load.h.g(ProtectedSandApp.s("ǁ"), dVar);
        f11766i = true;
    }

    public abstract g a(int i5, int i6, int i7, int i8);

    public abstract float b(int i5, int i6, int i7, int i8);
}
