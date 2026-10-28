package androidx.recyclerview.widget;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: ViewBoundsCheck.java */
/* loaded from: classes3.dex */
class k0 {

    /* renamed from: c, reason: collision with root package name */
    static final int f33265c = 1;

    /* renamed from: d, reason: collision with root package name */
    static final int f33266d = 2;

    /* renamed from: e, reason: collision with root package name */
    static final int f33267e = 4;

    /* renamed from: f, reason: collision with root package name */
    static final int f33268f = 0;

    /* renamed from: g, reason: collision with root package name */
    static final int f33269g = 1;

    /* renamed from: h, reason: collision with root package name */
    static final int f33270h = 2;

    /* renamed from: i, reason: collision with root package name */
    static final int f33271i = 4;

    /* renamed from: j, reason: collision with root package name */
    static final int f33272j = 4;

    /* renamed from: k, reason: collision with root package name */
    static final int f33273k = 16;

    /* renamed from: l, reason: collision with root package name */
    static final int f33274l = 32;

    /* renamed from: m, reason: collision with root package name */
    static final int f33275m = 64;

    /* renamed from: n, reason: collision with root package name */
    static final int f33276n = 8;

    /* renamed from: o, reason: collision with root package name */
    static final int f33277o = 256;

    /* renamed from: p, reason: collision with root package name */
    static final int f33278p = 512;

    /* renamed from: q, reason: collision with root package name */
    static final int f33279q = 1024;

    /* renamed from: r, reason: collision with root package name */
    static final int f33280r = 12;

    /* renamed from: s, reason: collision with root package name */
    static final int f33281s = 4096;

    /* renamed from: t, reason: collision with root package name */
    static final int f33282t = 8192;

    /* renamed from: u, reason: collision with root package name */
    static final int f33283u = 16384;

    /* renamed from: v, reason: collision with root package name */
    static final int f33284v = 7;

    /* renamed from: a, reason: collision with root package name */
    final b f33285a;

    /* renamed from: b, reason: collision with root package name */
    a f33286b = new a();

    /* compiled from: ViewBoundsCheck.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f33287a = 0;

        /* renamed from: b, reason: collision with root package name */
        int f33288b;

        /* renamed from: c, reason: collision with root package name */
        int f33289c;

        /* renamed from: d, reason: collision with root package name */
        int f33290d;

        /* renamed from: e, reason: collision with root package name */
        int f33291e;

        a() {
        }

        void a(int i4) {
            this.f33287a = i4 | this.f33287a;
        }

        boolean b() {
            int i4 = this.f33287a;
            if ((i4 & 7) != 0 && (i4 & c(this.f33290d, this.f33288b)) == 0) {
                return false;
            }
            int i5 = this.f33287a;
            if ((i5 & 112) != 0 && (i5 & (c(this.f33290d, this.f33289c) << 4)) == 0) {
                return false;
            }
            int i6 = this.f33287a;
            if ((i6 & 1792) != 0 && (i6 & (c(this.f33291e, this.f33288b) << 8)) == 0) {
                return false;
            }
            int i7 = this.f33287a;
            return (i7 & 28672) == 0 || (i7 & (c(this.f33291e, this.f33289c) << 12)) != 0;
        }

        int c(int i4, int i5) {
            if (i4 > i5) {
                return 1;
            }
            return i4 == i5 ? 2 : 4;
        }

        void d() {
            this.f33287a = 0;
        }

        void e(int i4, int i5, int i6, int i7) {
            this.f33288b = i4;
            this.f33289c = i5;
            this.f33290d = i6;
            this.f33291e = i7;
        }
    }

    /* compiled from: ViewBoundsCheck.java */
    interface b {
        View a(int i4);

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
        this.f33285a = bVar;
    }

    View a(int i4, int i5, int i6, int i7) {
        int c5 = this.f33285a.c();
        int d5 = this.f33285a.d();
        int i10 = i5 > i4 ? 1 : -1;
        View view = null;
        while (i4 != i5) {
            View a5 = this.f33285a.a(i4);
            this.f33286b.e(c5, d5, this.f33285a.b(a5), this.f33285a.e(a5));
            if (i6 != 0) {
                this.f33286b.d();
                this.f33286b.a(i6);
                if (this.f33286b.b()) {
                    return a5;
                }
            }
            if (i7 != 0) {
                this.f33286b.d();
                this.f33286b.a(i7);
                if (this.f33286b.b()) {
                    view = a5;
                }
            }
            i4 += i10;
        }
        return view;
    }

    boolean b(View view, int i4) {
        this.f33286b.e(this.f33285a.c(), this.f33285a.d(), this.f33285a.b(view), this.f33285a.e(view));
        if (i4 == 0) {
            return false;
        }
        this.f33286b.d();
        this.f33286b.a(i4);
        return this.f33286b.b();
    }
}
