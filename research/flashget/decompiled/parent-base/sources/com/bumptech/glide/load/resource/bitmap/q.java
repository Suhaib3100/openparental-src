package com.bumptech.glide.load.resource.bitmap;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: DownsampleStrategy.java */
/* loaded from: classes3.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f44523a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final q f44524b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final q f44525c = new e();

    /* renamed from: d, reason: collision with root package name */
    public static final q f44526d = new c();

    /* renamed from: e, reason: collision with root package name */
    public static final q f44527e;

    /* renamed from: f, reason: collision with root package name */
    public static final q f44528f;

    /* renamed from: g, reason: collision with root package name */
    public static final q f44529g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.bumptech.glide.load.h<q> f44530h;

    /* renamed from: i, reason: collision with root package name */
    static final boolean f44531i;

    /* compiled from: DownsampleStrategy.java */
    private static class a extends q {
        a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        public g a(int i4, int i5, int i6, int i7) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        public float b(int i4, int i5, int i6, int i7) {
            if (Math.min(i5 / i7, i4 / i6) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    private static class b extends q {
        b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        public g a(int i4, int i5, int i6, int i7) {
            return g.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        public float b(int i4, int i5, int i6, int i7) {
            int ceil = (int) Math.ceil(Math.max(i5 / i7, i4 / i6));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(ceil)) >= ceil ? 0 : 1));
        }
    }

    /* compiled from: DownsampleStrategy.java */
    private static class c extends q {
        c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        public g a(int i4, int i5, int i6, int i7) {
            return b(i4, i5, i6, i7) == 1.0f ? g.QUALITY : q.f44525c.a(i4, i5, i6, i7);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        public float b(int i4, int i5, int i6, int i7) {
            return Math.min(1.0f, q.f44525c.b(i4, i5, i6, i7));
        }
    }

    /* compiled from: DownsampleStrategy.java */
    private static class d extends q {
        d() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        public g a(int i4, int i5, int i6, int i7) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        public float b(int i4, int i5, int i6, int i7) {
            return Math.max(i6 / i4, i7 / i5);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    private static class e extends q {
        e() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        public g a(int i4, int i5, int i6, int i7) {
            return q.f44531i ? g.QUALITY : g.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        public float b(int i4, int i5, int i6, int i7) {
            if (q.f44531i) {
                return Math.min(i6 / i4, i7 / i5);
            }
            if (Math.max(i5 / i7, i4 / i6) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    private static class f extends q {
        f() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        public g a(int i4, int i5, int i6, int i7) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q
        public float b(int i4, int i5, int i6, int i7) {
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
        f44527e = dVar;
        f44528f = new f();
        f44529g = dVar;
        f44530h = com.bumptech.glide.load.h.g(ProtectedSandApp.s("\u09e5"), dVar);
        f44531i = true;
    }

    public abstract g a(int i4, int i5, int i6, int i7);

    public abstract float b(int i4, int i5, int i6, int i7);
}
