package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.m1;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.collection.r2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.NavigableMap;

/* compiled from: SizeStrategy.java */
@x0(19)
/* loaded from: classes3.dex */
final class p implements l {

    /* renamed from: d, reason: collision with root package name */
    private static final int f43914d = 8;

    /* renamed from: a, reason: collision with root package name */
    private final b f43915a = new b();

    /* renamed from: b, reason: collision with root package name */
    private final h<a, Bitmap> f43916b = new h<>();

    /* renamed from: c, reason: collision with root package name */
    private final NavigableMap<Integer, Integer> f43917c = new n();

    /* compiled from: SizeStrategy.java */
    @m1
    static final class a implements m {

        /* renamed from: a, reason: collision with root package name */
        private final b f43918a;

        /* renamed from: b, reason: collision with root package name */
        int f43919b;

        a(b bVar) {
            this.f43918a = bVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
        public void a() {
            this.f43918a.c(this);
        }

        public void b(int i4) {
            this.f43919b = i4;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && this.f43919b == ((a) obj).f43919b;
        }

        public int hashCode() {
            return this.f43919b;
        }

        public String toString() {
            return p.g(this.f43919b);
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

        public a e(int i4) {
            a aVar = (a) super.b();
            aVar.f43919b = i4;
            return aVar;
        }
    }

    p() {
    }

    private void d(Integer num) {
        Integer num2 = this.f43917c.get(num);
        if (num2.intValue() == 1) {
            this.f43917c.remove(num);
        } else {
            this.f43917c.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    static String g(int i4) {
        return r2.a(ProtectedSandApp.s("ࢾ"), i4, ProtectedSandApp.s("ࢿ"));
    }

    private static String h(Bitmap bitmap) {
        return g(com.bumptech.glide.util.o.i(bitmap));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String a(Bitmap bitmap) {
        return h(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String b(int i4, int i5, Bitmap.Config config) {
        return g(com.bumptech.glide.util.o.h(i4, i5, config));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public int c(Bitmap bitmap) {
        return com.bumptech.glide.util.o.i(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public void e(Bitmap bitmap) {
        a e4 = this.f43915a.e(com.bumptech.glide.util.o.i(bitmap));
        this.f43916b.d(e4, bitmap);
        Integer num = this.f43917c.get(Integer.valueOf(e4.f43919b));
        this.f43917c.put(Integer.valueOf(e4.f43919b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    @q0
    public Bitmap f(int i4, int i5, Bitmap.Config config) {
        int h4 = com.bumptech.glide.util.o.h(i4, i5, config);
        a e4 = this.f43915a.e(h4);
        Integer ceilingKey = this.f43917c.ceilingKey(Integer.valueOf(h4));
        if (ceilingKey != null && ceilingKey.intValue() != h4 && ceilingKey.intValue() <= h4 * 8) {
            this.f43915a.c(e4);
            e4 = this.f43915a.e(ceilingKey.intValue());
        }
        Bitmap a5 = this.f43916b.a(e4);
        if (a5 != null) {
            a5.reconfigure(i4, i5, config);
            d(ceilingKey);
        }
        return a5;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    @q0
    public Bitmap removeLast() {
        Bitmap f4 = this.f43916b.f();
        if (f4 != null) {
            d(Integer.valueOf(com.bumptech.glide.util.o.i(f4)));
        }
        return f4;
    }

    public String toString() {
        return ProtectedSandApp.s("ࣀ") + this.f43916b + ProtectedSandApp.s("ࣁ") + this.f43917c;
    }
}
