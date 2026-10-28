package net.time4j.engine;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.mmkv.MMKV;

/* compiled from: StartOfDay.java */
/* loaded from: classes7.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f82720a = b(0);

    /* renamed from: b, reason: collision with root package name */
    public static final g0 f82721b = b(-21600);

    /* renamed from: c, reason: collision with root package name */
    public static final g0 f82722c = b(21600);

    /* compiled from: StartOfDay.java */
    private static class b extends g0 {

        /* renamed from: d, reason: collision with root package name */
        private final int f82723d;

        @Override // net.time4j.engine.g0
        public int c(h hVar, net.time4j.tz.k kVar) {
            return this.f82723d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f82723d == ((b) obj).f82723d;
        }

        public int hashCode() {
            return this.f82723d;
        }

        public String toString() {
            return android.support.v4.media.b.a(new StringBuilder(ProtectedSandApp.s("鋻\u0001")), this.f82723d, ProtectedSandApp.s("鋼\u0001"));
        }

        private b(int i4) {
            this.f82723d = i4;
        }
    }

    /* compiled from: StartOfDay.java */
    private static class c<T extends net.time4j.base.f> extends g0 {

        /* renamed from: d, reason: collision with root package name */
        private final t<h, T> f82724d;

        @Override // net.time4j.engine.g0
        public int c(h hVar, net.time4j.tz.k kVar) {
            T apply = this.f82724d.apply(hVar);
            if (apply == null) {
                throw new ChronoException(ProtectedSandApp.s("鋾\u0001"));
            }
            int g4 = net.time4j.base.c.g(((apply.j() - 63072000) + net.time4j.tz.l.c0(kVar).I(apply).i()) - (hVar.b() * 86400));
            return g4 >= 43200 ? g4 - MMKV.ExpireInDay : g4;
        }

        private c(t<h, T> tVar) {
            if (tVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("鋽\u0001"));
            }
            this.f82724d = tVar;
        }
    }

    protected g0() {
    }

    public static <T extends net.time4j.base.f> g0 a(t<h, T> tVar) {
        return new c(tVar);
    }

    private static g0 b(int i4) {
        return new b(i4);
    }

    public static g0 d(int i4) {
        if (i4 == 0) {
            return f82720a;
        }
        if (i4 == -21600) {
            return f82721b;
        }
        if (i4 > 43200 || i4 <= -43200) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鋺\u0001"), i4));
        }
        return new b(i4);
    }

    public abstract int c(h hVar, net.time4j.tz.k kVar);
}
