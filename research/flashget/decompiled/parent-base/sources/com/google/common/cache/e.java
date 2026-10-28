package com.google.common.cache;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.d0;
import com.google.common.base.f0;
import com.google.common.base.l0;
import com.google.common.base.q0;
import com.google.common.base.t0;
import com.google.common.cache.k;
import com.google.common.collect.f3;
import com.google.common.collect.h3;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: CacheBuilderSpec.java */
@d9.c
@com.google.common.cache.g
/* loaded from: classes6.dex */
public final class e {

    /* renamed from: o, reason: collision with root package name */
    private static final q0 f55133o = q0.h(',').q();

    /* renamed from: p, reason: collision with root package name */
    private static final q0 f55134p = q0.h('=').q();

    /* renamed from: q, reason: collision with root package name */
    private static final h3<String, m> f55135q;

    /* renamed from: a, reason: collision with root package name */
    @d9.d
    @zc.a
    Integer f55136a;

    /* renamed from: b, reason: collision with root package name */
    @d9.d
    @zc.a
    Long f55137b;

    /* renamed from: c, reason: collision with root package name */
    @d9.d
    @zc.a
    Long f55138c;

    /* renamed from: d, reason: collision with root package name */
    @d9.d
    @zc.a
    Integer f55139d;

    /* renamed from: e, reason: collision with root package name */
    @d9.d
    @zc.a
    k.t f55140e;

    /* renamed from: f, reason: collision with root package name */
    @d9.d
    @zc.a
    k.t f55141f;

    /* renamed from: g, reason: collision with root package name */
    @d9.d
    @zc.a
    Boolean f55142g;

    /* renamed from: h, reason: collision with root package name */
    @d9.d
    long f55143h;

    /* renamed from: i, reason: collision with root package name */
    @d9.d
    @zc.a
    TimeUnit f55144i;

    /* renamed from: j, reason: collision with root package name */
    @d9.d
    long f55145j;

    /* renamed from: k, reason: collision with root package name */
    @d9.d
    @zc.a
    TimeUnit f55146k;

    /* renamed from: l, reason: collision with root package name */
    @d9.d
    long f55147l;

    /* renamed from: m, reason: collision with root package name */
    @d9.d
    @zc.a
    TimeUnit f55148m;

    /* renamed from: n, reason: collision with root package name */
    private final String f55149n;

    /* compiled from: CacheBuilderSpec.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f55150a;

        static {
            int[] iArr = new int[k.t.values().length];
            f55150a = iArr;
            try {
                iArr[k.t.WEAK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55150a[k.t.SOFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: CacheBuilderSpec.java */
    static class b extends d {
        b() {
        }

        @Override // com.google.common.cache.e.d
        protected void b(e eVar, long j4, TimeUnit timeUnit) {
            l0.e(eVar.f55146k == null, ProtectedSandApp.s("\uf3f5"));
            eVar.f55145j = j4;
            eVar.f55146k = timeUnit;
        }
    }

    /* compiled from: CacheBuilderSpec.java */
    static class c extends f {
        c() {
        }

        @Override // com.google.common.cache.e.f
        protected void b(e eVar, int i4) {
            Integer num = eVar.f55139d;
            l0.u(num == null, ProtectedSandApp.s("\uf3f9"), num);
            eVar.f55139d = Integer.valueOf(i4);
        }
    }

    /* compiled from: CacheBuilderSpec.java */
    static abstract class d implements m {
        d() {
        }

        @Override // com.google.common.cache.e.m
        public void a(e eVar, String str, @zc.a String str2) {
            TimeUnit timeUnit;
            if (t0.d(str2)) {
                throw new IllegalArgumentException(com.google.common.base.h.a(com.google.android.gms.common.internal.b.a(str, 21), ProtectedSandApp.s("\uf3f3"), str, ProtectedSandApp.s("\uf3f4")));
            }
            try {
                char charAt = str2.charAt(str2.length() - 1);
                if (charAt == 'd') {
                    timeUnit = TimeUnit.DAYS;
                } else if (charAt == 'h') {
                    timeUnit = TimeUnit.HOURS;
                } else if (charAt == 'm') {
                    timeUnit = TimeUnit.MINUTES;
                } else {
                    if (charAt != 's') {
                        throw new IllegalArgumentException(e.a(ProtectedSandApp.s("\uf3f1"), new Object[]{str, str2}));
                    }
                    timeUnit = TimeUnit.SECONDS;
                }
                b(eVar, Long.parseLong(str2.substring(0, str2.length() - 1)), timeUnit);
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(e.a(ProtectedSandApp.s("\uf3f2"), new Object[]{str, str2}));
            }
        }

        protected abstract void b(e eVar, long j4, TimeUnit timeUnit);
    }

    /* compiled from: CacheBuilderSpec.java */
    /* renamed from: com.google.common.cache.e$e, reason: collision with other inner class name */
    static class C0835e extends f {
        C0835e() {
        }

        @Override // com.google.common.cache.e.f
        protected void b(e eVar, int i4) {
            Integer num = eVar.f55136a;
            l0.u(num == null, ProtectedSandApp.s("\uf3fa"), num);
            eVar.f55136a = Integer.valueOf(i4);
        }
    }

    /* compiled from: CacheBuilderSpec.java */
    static abstract class f implements m {
        f() {
        }

        @Override // com.google.common.cache.e.m
        public void a(e eVar, String str, String str2) {
            if (t0.d(str2)) {
                throw new IllegalArgumentException(com.google.common.base.h.a(com.google.android.gms.common.internal.b.a(str, 21), ProtectedSandApp.s("\uf3f7"), str, ProtectedSandApp.s("\uf3f8")));
            }
            try {
                b(eVar, Integer.parseInt(str2));
            } catch (NumberFormatException e4) {
                throw new IllegalArgumentException(e.a(ProtectedSandApp.s("\uf3f6"), new Object[]{str, str2}), e4);
            }
        }

        protected abstract void b(e eVar, int i4);
    }

    /* compiled from: CacheBuilderSpec.java */
    static class g implements m {

        /* renamed from: a, reason: collision with root package name */
        private final k.t f55151a;

        public g(k.t tVar) {
            this.f55151a = tVar;
        }

        @Override // com.google.common.cache.e.m
        public void a(e eVar, String str, @zc.a String str2) {
            l0.u(str2 == null, ProtectedSandApp.s("\uf3fb"), str);
            k.t tVar = eVar.f55140e;
            l0.y(tVar == null, ProtectedSandApp.s("\uf3fc"), str, tVar);
            eVar.f55140e = this.f55151a;
        }
    }

    /* compiled from: CacheBuilderSpec.java */
    static abstract class h implements m {
        h() {
        }

        @Override // com.google.common.cache.e.m
        public void a(e eVar, String str, String str2) {
            if (t0.d(str2)) {
                throw new IllegalArgumentException(com.google.common.base.h.a(com.google.android.gms.common.internal.b.a(str, 21), ProtectedSandApp.s("\uf3fe"), str, ProtectedSandApp.s("\uf3ff")));
            }
            try {
                b(eVar, Long.parseLong(str2));
            } catch (NumberFormatException e4) {
                throw new IllegalArgumentException(e.a(ProtectedSandApp.s("\uf3fd"), new Object[]{str, str2}), e4);
            }
        }

        protected abstract void b(e eVar, long j4);
    }

    /* compiled from: CacheBuilderSpec.java */
    static class i extends h {
        i() {
        }

        @Override // com.google.common.cache.e.h
        protected void b(e eVar, long j4) {
            Long l4 = eVar.f55137b;
            l0.u(l4 == null, ProtectedSandApp.s("\uf400"), l4);
            Long l5 = eVar.f55138c;
            l0.u(l5 == null, ProtectedSandApp.s("\uf401"), l5);
            eVar.f55137b = Long.valueOf(j4);
        }
    }

    /* compiled from: CacheBuilderSpec.java */
    static class j extends h {
        j() {
        }

        @Override // com.google.common.cache.e.h
        protected void b(e eVar, long j4) {
            Long l4 = eVar.f55138c;
            l0.u(l4 == null, ProtectedSandApp.s("\uf402"), l4);
            Long l5 = eVar.f55137b;
            l0.u(l5 == null, ProtectedSandApp.s("\uf403"), l5);
            eVar.f55138c = Long.valueOf(j4);
        }
    }

    /* compiled from: CacheBuilderSpec.java */
    static class k implements m {
        k() {
        }

        @Override // com.google.common.cache.e.m
        public void a(e eVar, String str, @zc.a String str2) {
            l0.e(str2 == null, ProtectedSandApp.s("\uf404"));
            l0.e(eVar.f55142g == null, ProtectedSandApp.s("\uf405"));
            eVar.f55142g = Boolean.TRUE;
        }
    }

    /* compiled from: CacheBuilderSpec.java */
    static class l extends d {
        l() {
        }

        @Override // com.google.common.cache.e.d
        protected void b(e eVar, long j4, TimeUnit timeUnit) {
            l0.e(eVar.f55148m == null, ProtectedSandApp.s("\uf406"));
            eVar.f55147l = j4;
            eVar.f55148m = timeUnit;
        }
    }

    /* compiled from: CacheBuilderSpec.java */
    private interface m {
        void a(e eVar, String str, @zc.a String str2);
    }

    /* compiled from: CacheBuilderSpec.java */
    static class n implements m {

        /* renamed from: a, reason: collision with root package name */
        private final k.t f55152a;

        public n(k.t tVar) {
            this.f55152a = tVar;
        }

        @Override // com.google.common.cache.e.m
        public void a(e eVar, String str, @zc.a String str2) {
            l0.u(str2 == null, ProtectedSandApp.s("\uf407"), str);
            k.t tVar = eVar.f55141f;
            l0.y(tVar == null, ProtectedSandApp.s("\uf408"), str, tVar);
            eVar.f55141f = this.f55152a;
        }
    }

    /* compiled from: CacheBuilderSpec.java */
    static class o extends d {
        o() {
        }

        @Override // com.google.common.cache.e.d
        protected void b(e eVar, long j4, TimeUnit timeUnit) {
            l0.e(eVar.f55144i == null, ProtectedSandApp.s("\uf409"));
            eVar.f55143h = j4;
            eVar.f55144i = timeUnit;
        }
    }

    static {
        h3.b i4 = h3.c().i(ProtectedSandApp.s("\uf40a"), new C0835e()).i(ProtectedSandApp.s("\uf40b"), new i()).i(ProtectedSandApp.s("\uf40c"), new j()).i(ProtectedSandApp.s("\uf40d"), new c());
        k.t tVar = k.t.WEAK;
        f55135q = i4.i(ProtectedSandApp.s("\uf40e"), new g(tVar)).i(ProtectedSandApp.s("\uf40f"), new n(k.t.SOFT)).i(ProtectedSandApp.s("\uf410"), new n(tVar)).i(ProtectedSandApp.s("\uf411"), new k()).i(ProtectedSandApp.s("\uf412"), new b()).i(ProtectedSandApp.s("\uf413"), new o()).i(ProtectedSandApp.s("\uf414"), new l()).i(ProtectedSandApp.s("\uf415"), new l()).d();
    }

    private e(String str) {
        this.f55149n = str;
    }

    static String a(String str, Object[] objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public static e b() {
        return e(ProtectedSandApp.s("\uf416"));
    }

    @zc.a
    private static Long c(long j4, @zc.a TimeUnit timeUnit) {
        if (timeUnit == null) {
            return null;
        }
        return Long.valueOf(timeUnit.toNanos(j4));
    }

    private static String d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e e(String str) {
        e eVar = new e(str);
        if (!str.isEmpty()) {
            for (String str2 : f55133o.n(str)) {
                f3 w4 = f3.w(f55134p.n(str2));
                l0.e(!w4.isEmpty(), ProtectedSandApp.s("\uf417"));
                l0.u(w4.size() <= 2, ProtectedSandApp.s("\uf418"), str2);
                String str3 = (String) w4.get(0);
                m mVar = f55135q.get(str3);
                l0.u(mVar != null, ProtectedSandApp.s("\uf419"), str3);
                mVar.a(eVar, str3, w4.size() == 1 ? null : (String) w4.get(1));
            }
        }
        return eVar;
    }

    public boolean equals(@zc.a Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return f0.a(this.f55136a, eVar.f55136a) && f0.a(this.f55137b, eVar.f55137b) && f0.a(this.f55138c, eVar.f55138c) && f0.a(this.f55139d, eVar.f55139d) && f0.a(this.f55140e, eVar.f55140e) && f0.a(this.f55141f, eVar.f55141f) && f0.a(this.f55142g, eVar.f55142g) && f0.a(c(this.f55143h, this.f55144i), c(eVar.f55143h, eVar.f55144i)) && f0.a(c(this.f55145j, this.f55146k), c(eVar.f55145j, eVar.f55146k)) && f0.a(c(this.f55147l, this.f55148m), c(eVar.f55147l, eVar.f55148m));
    }

    com.google.common.cache.d<Object, Object> f() {
        com.google.common.cache.d<Object, Object> D = com.google.common.cache.d.D();
        Integer num = this.f55136a;
        if (num != null) {
            D.x(num.intValue());
        }
        Long l4 = this.f55137b;
        if (l4 != null) {
            D.B(l4.longValue());
        }
        Long l5 = this.f55138c;
        if (l5 != null) {
            D.C(l5.longValue());
        }
        Integer num2 = this.f55139d;
        if (num2 != null) {
            D.e(num2.intValue());
        }
        k.t tVar = this.f55140e;
        if (tVar != null) {
            if (a.f55150a[tVar.ordinal()] != 1) {
                throw new AssertionError();
            }
            D.M();
        }
        k.t tVar2 = this.f55141f;
        if (tVar2 != null) {
            int i4 = a.f55150a[tVar2.ordinal()];
            if (i4 == 1) {
                D.N();
            } else {
                if (i4 != 2) {
                    throw new AssertionError();
                }
                D.J();
            }
        }
        Boolean bool = this.f55142g;
        if (bool != null && bool.booleanValue()) {
            D.f55132p = com.google.common.cache.d.f55113w;
        }
        TimeUnit timeUnit = this.f55144i;
        if (timeUnit != null) {
            D.g(this.f55143h, timeUnit);
        }
        TimeUnit timeUnit2 = this.f55146k;
        if (timeUnit2 != null) {
            D.f(this.f55145j, timeUnit2);
        }
        TimeUnit timeUnit3 = this.f55148m;
        if (timeUnit3 != null) {
            D.F(this.f55147l, timeUnit3);
        }
        return D;
    }

    public String g() {
        return this.f55149n;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f55136a, this.f55137b, this.f55138c, this.f55139d, this.f55140e, this.f55141f, this.f55142g, c(this.f55143h, this.f55144i), c(this.f55145j, this.f55146k), c(this.f55147l, this.f55148m)});
    }

    public String toString() {
        return d0.c(this).s(this.f55149n).toString();
    }
}
