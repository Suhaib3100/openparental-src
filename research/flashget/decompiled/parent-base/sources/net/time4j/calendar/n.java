package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: EastAsianYear.java */
/* loaded from: classes7.dex */
public abstract class n {

    /* compiled from: EastAsianYear.java */
    static class a extends n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f82614a;

        a(int i4) {
            this.f82614a = i4;
        }

        @Override // net.time4j.calendar.n
        public int f() {
            return net.time4j.base.c.e(this.f82614a, 2636);
        }
    }

    public static n a(int i4) {
        if (i4 >= 1) {
            return new a(net.time4j.base.c.e(i4, -2333));
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("迣\u0001"), i4));
    }

    public static n b(int i4) {
        return new a(i4);
    }

    public static n c(int i4) {
        if (i4 >= 1) {
            return new a(net.time4j.base.c.e(i4, 1911));
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("迤\u0001"), i4));
    }

    public static n d(int i4) {
        if (i4 >= 1) {
            return new a(net.time4j.base.c.e(i4, 1911));
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("迥\u0001"), i4));
    }

    public final int e() {
        return net.time4j.base.c.a(f(), 60) + 1;
    }

    public abstract int f();

    public final g g() {
        int c5 = net.time4j.base.c.c(f() + 1, 60);
        return g.r(c5 != 0 ? c5 : 60);
    }
}
