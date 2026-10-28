package androidx.recyclerview.widget;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: ViewBoundsCheck.java */
/* loaded from: classes.dex */
class k0 {

    /* renamed from: c, reason: collision with root package name */
    static final int f9374c = 1;

    /* renamed from: d, reason: collision with root package name */
    static final int f9375d = 2;

    /* renamed from: e, reason: collision with root package name */
    static final int f9376e = 4;

    /* renamed from: f, reason: collision with root package name */
    static final int f9377f = 0;

    /* renamed from: g, reason: collision with root package name */
    static final int f9378g = 1;

    /* renamed from: h, reason: collision with root package name */
    static final int f9379h = 2;

    /* renamed from: i, reason: collision with root package name */
    static final int f9380i = 4;

    /* renamed from: j, reason: collision with root package name */
    static final int f9381j = 4;

    /* renamed from: k, reason: collision with root package name */
    static final int f9382k = 16;

    /* renamed from: l, reason: collision with root package name */
    static final int f9383l = 32;

    /* renamed from: m, reason: collision with root package name */
    static final int f9384m = 64;

    /* renamed from: n, reason: collision with root package name */
    static final int f9385n = 8;

    /* renamed from: o, reason: collision with root package name */
    static final int f9386o = 256;

    /* renamed from: p, reason: collision with root package name */
    static final int f9387p = 512;

    /* renamed from: q, reason: collision with root package name */
    static final int f9388q = 1024;

    /* renamed from: r, reason: collision with root package name */
    static final int f9389r = 12;

    /* renamed from: s, reason: collision with root package name */
    static final int f9390s = 4096;

    /* renamed from: t, reason: collision with root package name */
    static final int f9391t = 8192;

    /* renamed from: u, reason: collision with root package name */
    static final int f9392u = 16384;

    /* renamed from: v, reason: collision with root package name */
    static final int f9393v = 7;

    /* renamed from: a, reason: collision with root package name */
    final b f9394a;

    /* renamed from: b, reason: collision with root package name */
    a f9395b = new a();

    /* compiled from: ViewBoundsCheck.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f9396a = 0;

        /* renamed from: b, reason: collision with root package name */
        int f9397b;

        /* renamed from: c, reason: collision with root package name */
        int f9398c;

        /* renamed from: d, reason: collision with root package name */
        int f9399d;

        /* renamed from: e, reason: collision with root package name */
        int f9400e;

        a() {
        }

        void a(int i5) {
            this.f9396a = i5 | this.f9396a;
        }

        boolean b() {
            int i5 = this.f9396a;
            if ((i5 & 7) != 0 && (i5 & (c(this.f9399d, this.f9397b) << 0)) == 0) {
                return false;
            }
            int i6 = this.f9396a;
            if ((i6 & 112) != 0 && (i6 & (c(this.f9399d, this.f9398c) << 4)) == 0) {
                return false;
            }
            int i7 = this.f9396a;
            if ((i7 & 1792) != 0 && (i7 & (c(this.f9400e, this.f9397b) << 8)) == 0) {
                return false;
            }
            int i8 = this.f9396a;
            return (i8 & 28672) == 0 || (i8 & (c(this.f9400e, this.f9398c) << 12)) != 0;
        }

        int c(int i5, int i6) {
            if (i5 > i6) {
                return 1;
            }
            return i5 == i6 ? 2 : 4;
        }

        void d() {
            this.f9396a = 0;
        }

        void e(int i5, int i6, int i7, int i8) {
            this.f9397b = i5;
            this.f9398c = i6;
            this.f9399d = i7;
            this.f9400e = i8;
        }
    }

    /* compiled from: ViewBoundsCheck.java */
    interface b {
        View a(int i5);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    /* compiled from: ViewBoundsCheck.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    k0(b bVar) {
        this.f9394a = bVar;
    }

    View a(int i5, int i6, int i7, int i8) {
        int c6 = this.f9394a.c();
        int d6 = this.f9394a.d();
        int i9 = i6 > i5 ? 1 : -1;
        View view = null;
        while (i5 != i6) {
            View a6 = this.f9394a.a(i5);
            this.f9395b.e(c6, d6, this.f9394a.b(a6), this.f9394a.e(a6));
            if (i7 != 0) {
                this.f9395b.d();
                this.f9395b.a(i7);
                if (this.f9395b.b()) {
                    return a6;
                }
            }
            if (i8 != 0) {
                this.f9395b.d();
                this.f9395b.a(i8);
                if (this.f9395b.b()) {
                    view = a6;
                }
            }
            i5 += i9;
        }
        return view;
    }

    boolean b(View view, int i5) {
        this.f9395b.e(this.f9394a.c(), this.f9394a.d(), this.f9394a.b(view), this.f9394a.e(view));
        if (i5 == 0) {
            return false;
        }
        this.f9395b.d();
        this.f9395b.a(i5);
        return this.f9395b.b();
    }
}
