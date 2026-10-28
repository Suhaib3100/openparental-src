package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.m1;
import androidx.annotation.q0;
import androidx.annotation.x0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.NavigableMap;

/* compiled from: SizeStrategy.java */
@x0(19)
/* loaded from: classes3.dex */
final class p implements l {

    /* renamed from: d, reason: collision with root package name */
    private static final int f11206d = 8;

    /* renamed from: a, reason: collision with root package name */
    private final b f11207a = new b();

    /* renamed from: b, reason: collision with root package name */
    private final h<a, Bitmap> f11208b = new h<>();

    /* renamed from: c, reason: collision with root package name */
    private final NavigableMap<Integer, Integer> f11209c = new n();

    /* compiled from: SizeStrategy.java */
    @m1
    static final class a implements m {

        /* renamed from: a, reason: collision with root package name */
        private final b f11210a;

        /* renamed from: b, reason: collision with root package name */
        int f11211b;

        a(b bVar) {
            this.f11210a = bVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
        public void a() {
            this.f11210a.c(this);
        }

        public void b(int i5) {
            this.f11211b = i5;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && this.f11211b == ((a) obj).f11211b;
        }

        public int hashCode() {
            return this.f11211b;
        }

        public String toString() {
            return p.g(this.f11211b);
        }
    }

    /* compiled from: SizeStrategy.java */
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

        public a e(int i5) {
            a aVar = (a) super.b();
            aVar.f11211b = i5;
            return aVar;
        }
    }

    p() {
    }

    private void e(Integer num) {
        Integer num2 = this.f11209c.get(num);
        if (num2.intValue() == 1) {
            this.f11209c.remove(num);
        } else {
            this.f11209c.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    static String g(int i5) {
        return androidx.constraintlayout.solver.f.a(ProtectedSandApp.s("᳁"), i5, ProtectedSandApp.s("᳂"));
    }

    private static String h(Bitmap bitmap) {
        return g(com.bumptech.glide.util.n.h(bitmap));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String a(int i5, int i6, Bitmap.Config config) {
        return g(com.bumptech.glide.util.n.g(i5, i6, config));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public int b(Bitmap bitmap) {
        return com.bumptech.glide.util.n.h(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String c(Bitmap bitmap) {
        return h(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public void d(Bitmap bitmap) {
        a e6 = this.f11207a.e(com.bumptech.glide.util.n.h(bitmap));
        this.f11208b.d(e6, bitmap);
        Integer num = this.f11209c.get(Integer.valueOf(e6.f11211b));
        this.f11209c.put(Integer.valueOf(e6.f11211b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    @q0
    public Bitmap f(int i5, int i6, Bitmap.Config config) {
        int g5 = com.bumptech.glide.util.n.g(i5, i6, config);
        a e6 = this.f11207a.e(g5);
        Integer ceilingKey = this.f11209c.ceilingKey(Integer.valueOf(g5));
        if (ceilingKey != null && ceilingKey.intValue() != g5 && ceilingKey.intValue() <= g5 * 8) {
            this.f11207a.c(e6);
            e6 = this.f11207a.e(ceilingKey.intValue());
        }
        Bitmap a6 = this.f11208b.a(e6);
        if (a6 != null) {
            a6.reconfigure(i5, i6, config);
            e(ceilingKey);
        }
        return a6;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    @q0
    public Bitmap removeLast() {
        Bitmap f6 = this.f11208b.f();
        if (f6 != null) {
            e(Integer.valueOf(com.bumptech.glide.util.n.h(f6)));
        }
        return f6;
    }

    public String toString() {
        return ProtectedSandApp.s("᳃") + this.f11208b + ProtectedSandApp.s("᳄") + this.f11209c;
    }
}
