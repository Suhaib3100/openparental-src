package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.time4j.engine.n0;
import net.time4j.z;

/* compiled from: Duration.java */
/* loaded from: classes7.dex */
public final class p<U extends z> extends net.time4j.engine.a<U> implements Serializable {
    private static final int A = 1;
    private static final int B = 2;
    static final /* synthetic */ boolean C = false;

    /* renamed from: e, reason: collision with root package name */
    private static final char f83425e;

    /* renamed from: f, reason: collision with root package name */
    private static final long f83426f = 1000000000;

    /* renamed from: g, reason: collision with root package name */
    private static final long f83427g = 1000000;

    /* renamed from: h, reason: collision with root package name */
    private static final p f83428h;

    /* renamed from: i, reason: collision with root package name */
    private static final e<net.time4j.h> f83429i;

    /* renamed from: j, reason: collision with root package name */
    private static final e<net.time4j.h> f83430j;

    /* renamed from: k, reason: collision with root package name */
    private static final e<net.time4j.h> f83431k;

    /* renamed from: l, reason: collision with root package name */
    private static final e<net.time4j.h> f83432l;

    /* renamed from: m, reason: collision with root package name */
    private static final e<j> f83433m;

    /* renamed from: n, reason: collision with root package name */
    private static final e<j> f83434n;

    /* renamed from: o, reason: collision with root package name */
    private static final Comparator<n0.a<? extends net.time4j.engine.w>> f83435o;

    /* renamed from: p, reason: collision with root package name */
    public static net.time4j.engine.f0<z> f83436p = null;

    /* renamed from: q, reason: collision with root package name */
    public static net.time4j.engine.f0<net.time4j.h> f83437q = null;

    /* renamed from: r, reason: collision with root package name */
    public static net.time4j.engine.f0<j> f83438r = null;

    /* renamed from: s, reason: collision with root package name */
    private static final int f83439s = 0;
    private static final long serialVersionUID = -6321211763598951499L;

    /* renamed from: t, reason: collision with root package name */
    private static final int f83440t = 1;

    /* renamed from: u, reason: collision with root package name */
    private static final int f83441u = 2;

    /* renamed from: v, reason: collision with root package name */
    private static final net.time4j.engine.l0<net.time4j.h, p<net.time4j.h>> f83442v;

    /* renamed from: w, reason: collision with root package name */
    private static final net.time4j.engine.l0<j, p<j>> f83443w;

    /* renamed from: x, reason: collision with root package name */
    private static final net.time4j.engine.l0<x, p<x>> f83444x;

    /* renamed from: y, reason: collision with root package name */
    private static final int f83445y = -1;

    /* renamed from: z, reason: collision with root package name */
    private static final int f83446z = 0;

    /* renamed from: c, reason: collision with root package name */
    private final transient List<n0.a<U>> f83447c;

    /* renamed from: d, reason: collision with root package name */
    private final transient boolean f83448d;

    /* compiled from: Duration.java */
    static class a implements Comparator<p<j>> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(p<j> pVar, p<j> pVar2) {
            long V = p.V(pVar);
            long V2 = p.V(pVar2);
            if (V < V2) {
                return -1;
            }
            if (V > V2) {
                return 1;
            }
            j jVar = j.NANOS;
            pVar.getClass();
            long e4 = pVar.e(jVar) % p.f83426f;
            pVar2.getClass();
            long e5 = pVar2.e(jVar) % p.f83426f;
            if (pVar.d()) {
                e4 = net.time4j.base.c.k(e4);
            }
            if (pVar2.d()) {
                e5 = net.time4j.base.c.k(e5);
            }
            if (e4 < e5) {
                return -1;
            }
            return e4 > e5 ? 1 : 0;
        }
    }

    /* compiled from: Duration.java */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f83449a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f83450b;

        static {
            int[] iArr = new int[j.values().length];
            f83450b = iArr;
            try {
                iArr[j.HOURS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83450b[j.MINUTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f83450b[j.SECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f83450b[j.MILLIS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f83450b[j.MICROS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f83450b[j.NANOS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[net.time4j.h.values().length];
            f83449a = iArr2;
            try {
                iArr2[net.time4j.h.MILLENNIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f83449a[net.time4j.h.CENTURIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f83449a[net.time4j.h.DECADES.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f83449a[net.time4j.h.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f83449a[net.time4j.h.QUARTERS.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f83449a[net.time4j.h.MONTHS.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f83449a[net.time4j.h.WEEKS.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f83449a[net.time4j.h.DAYS.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* compiled from: Duration.java */
    public static class d {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f83455b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f83456c = false;

        /* renamed from: d, reason: collision with root package name */
        private boolean f83457d = false;

        /* renamed from: e, reason: collision with root package name */
        private boolean f83458e = false;

        /* renamed from: a, reason: collision with root package name */
        private final List<n0.a<z>> f83454a = new ArrayList(10);

        d(boolean z4) {
            this.f83455b = z4;
        }

        private void e() {
            if (!this.f83457d) {
                this.f83457d = true;
            } else {
                throw new IllegalStateException(ProtectedSandApp.s("頎\u0001") + j.MICROS.name());
            }
        }

        private void g() {
            if (!this.f83456c) {
                this.f83456c = true;
            } else {
                throw new IllegalStateException(ProtectedSandApp.s("頎\u0001") + j.MILLIS.name());
            }
        }

        private void k() {
            if (!this.f83458e) {
                this.f83458e = true;
            } else {
                throw new IllegalStateException(ProtectedSandApp.s("頎\u0001") + j.NANOS.name());
            }
        }

        private d m(long j4, z zVar) {
            int size = this.f83454a.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (this.f83454a.get(i4).b() == zVar) {
                    throw new IllegalStateException(ProtectedSandApp.s("頏\u0001") + zVar);
                }
            }
            if (j4 != 0) {
                this.f83454a.add(n0.a.c(j4, zVar));
            }
            return this;
        }

        private void n(long j4, long j5) {
            if (j4 < 0) {
                throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("預\u0001"), j4));
            }
            j jVar = j.NANOS;
            for (int size = this.f83454a.size() - 1; size >= 0; size--) {
                n0.a<z> aVar = this.f83454a.get(size);
                if (aVar.b().equals(j.NANOS)) {
                    this.f83454a.set(size, n0.a.c(net.time4j.base.c.f(net.time4j.base.c.i(j4, j5), aVar.a()), jVar));
                    return;
                }
            }
            if (j4 != 0) {
                this.f83454a.add(n0.a.c(net.time4j.base.c.i(j4, j5), jVar));
            }
        }

        public p<z> a() {
            if (this.f83454a.isEmpty()) {
                throw new IllegalStateException(ProtectedSandApp.s("頑\u0001"));
            }
            return new p<>(this.f83454a, this.f83455b);
        }

        public d b(int i4) {
            m(i4, net.time4j.h.DAYS);
            return this;
        }

        public d c(int i4) {
            m(i4, j.HOURS);
            return this;
        }

        public d d(int i4) {
            e();
            n(i4, 1000L);
            return this;
        }

        public d f(int i4) {
            g();
            n(i4, 1000000L);
            return this;
        }

        public d h(int i4) {
            m(i4, j.MINUTES);
            return this;
        }

        public d i(int i4) {
            m(i4, net.time4j.h.MONTHS);
            return this;
        }

        public d j(int i4) {
            k();
            n(i4, 1L);
            return this;
        }

        public d l(int i4) {
            m(i4, j.SECONDS);
            return this;
        }

        public d o(int i4) {
            m(i4, net.time4j.h.YEARS);
            return this;
        }
    }

    /* compiled from: Duration.java */
    public static final class e<U extends z> extends net.time4j.format.y<U, p<U>> {

        /* renamed from: e, reason: collision with root package name */
        private static final String f83459e = ProtectedSandApp.s("頒\u0001");

        private e(Class<U> cls, String str) {
            super(cls, str);
        }

        public static e<z> t() {
            return new e<>(z.class, ProtectedSandApp.s("頒\u0001"));
        }

        public static <U extends z> e<U> u(Class<U> cls, String str) {
            return new e<>(cls, str);
        }

        public static e<z> v(String str) {
            return new e<>(z.class, str);
        }

        @Override // net.time4j.format.y
        protected net.time4j.engine.n0 f(Map map, boolean z4) {
            return p.B(map, z4);
        }

        protected p<U> r(Map<U, Long> map, boolean z4) {
            return p.B(map, z4);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // net.time4j.format.y
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public U k(char c5) {
            if (c5 == 'I') {
                return net.time4j.h.MILLENNIA;
            }
            if (c5 == 'M') {
                return net.time4j.h.MONTHS;
            }
            if (c5 == 'Q') {
                return net.time4j.h.QUARTERS;
            }
            if (c5 == 'W') {
                return net.time4j.h.WEEKS;
            }
            if (c5 == 'Y') {
                return net.time4j.h.YEARS;
            }
            if (c5 == 'f') {
                return j.NANOS;
            }
            if (c5 == 'h') {
                return j.HOURS;
            }
            if (c5 == 'm') {
                return j.MINUTES;
            }
            if (c5 == 's') {
                return j.SECONDS;
            }
            switch (c5) {
                case 'C':
                    return net.time4j.h.CENTURIES;
                case 'D':
                    return net.time4j.h.DAYS;
                case 'E':
                    return net.time4j.h.DECADES;
                default:
                    throw new IllegalArgumentException(androidx.compose.ui.graphics.vector.j.a(ProtectedSandApp.s("頓\u0001"), c5));
            }
        }
    }

    /* compiled from: Duration.java */
    private static class f<U extends z, T extends net.time4j.engine.m0<U, T>> implements Comparator<p<? extends U>> {

        /* renamed from: b, reason: collision with root package name */
        private final T f83460b;

        /* synthetic */ f(net.time4j.engine.m0 m0Var, a aVar) {
            this(m0Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(p<? extends U> pVar, p<? extends U> pVar2) {
            boolean d5 = pVar.d();
            boolean d6 = pVar2.d();
            if (d5 && !d6) {
                return -1;
            }
            if (!d5 && d6) {
                return 1;
            }
            if (pVar.isEmpty() && pVar2.isEmpty()) {
                return 0;
            }
            return this.f83460b.X(pVar).compareTo(this.f83460b.X(pVar2));
        }

        private f(T t4) {
            if (t4 == null) {
                throw new NullPointerException(ProtectedSandApp.s("頔\u0001"));
            }
            this.f83460b = t4;
        }
    }

    /* compiled from: Duration.java */
    private static class g<U extends z> extends net.time4j.engine.b<U, p<U>> {
        /* synthetic */ g(Collection collection, a aVar) {
            this(collection);
        }

        @Override // net.time4j.engine.b
        protected n0.a<U> F(n0.a<U> aVar) {
            U b5 = aVar.b();
            return b5.equals(j.MILLIS) ? n0.a.c(net.time4j.base.c.i(aVar.a(), 1000000L), j.NANOS) : b5.equals(j.MICROS) ? n0.a.c(net.time4j.base.c.i(aVar.a(), 1000L), j.NANOS) : aVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // net.time4j.engine.b
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public p<U> t() {
            return p.f0();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // net.time4j.engine.b
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public p<U> u(List<n0.a<U>> list, boolean z4) {
            return new p<>(list, z4);
        }

        /* synthetic */ g(z[] zVarArr, a aVar) {
            this(zVarArr);
        }

        private g(U... uArr) {
            super(uArr.length > 1, uArr);
        }

        private g(Collection<? extends U> collection) {
            super(collection.size() > 1, collection);
        }
    }

    /* compiled from: Duration.java */
    private static class h implements net.time4j.engine.l0<z, p<z>> {

        /* renamed from: b, reason: collision with root package name */
        private final net.time4j.tz.l f83461b;

        /* renamed from: c, reason: collision with root package name */
        private final net.time4j.engine.l0<z, p<z>> f83462c;

        /* synthetic */ h(net.time4j.tz.l lVar, z[] zVarArr, a aVar) {
            this(lVar, zVarArr);
        }

        private int c(net.time4j.engine.r<?> rVar) {
            return this.f83461b.O().b((net.time4j.base.a) rVar.r(l0.f83326q), (net.time4j.base.g) rVar.r(m0.f83369t), this.f83461b).i();
        }

        @Override // net.time4j.engine.l0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public <T extends net.time4j.engine.m0<? super z, T>> p<z> a(T t4, T t5) {
            boolean z4;
            if (t4.compareTo(t5) > 0) {
                z4 = true;
                t5 = t4;
                t4 = t5;
            } else {
                z4 = false;
            }
            p<z> a5 = this.f83462c.a(t4, t5.W(c(t4) - c(t5), j.SECONDS));
            return z4 ? a5.X(-1) : a5;
        }

        @Override // net.time4j.engine.l0
        public net.time4j.engine.l0<z, p<z>> d() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("頖\u0001"));
        }

        private h(net.time4j.tz.l lVar, z... zVarArr) {
            if (lVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("頕\u0001"));
            }
            this.f83461b = lVar;
            this.f83462c = new g(zVarArr, (a) null);
        }
    }

    static {
        f83425e = Boolean.getBoolean(ProtectedSandApp.s("頞\u0001")) ? '.' : ',';
        f83428h = new p();
        f83429i = C(true, false);
        f83430j = C(true, true);
        f83431k = C(false, false);
        f83432l = C(false, true);
        f83433m = D(true);
        f83434n = D(false);
        f83435o = v0.a();
        f83436p = v0.t();
        f83437q = v0.n();
        f83438r = v0.o();
        net.time4j.h hVar = net.time4j.h.YEARS;
        net.time4j.h hVar2 = net.time4j.h.MONTHS;
        net.time4j.h hVar3 = net.time4j.h.DAYS;
        f83442v = O(hVar, hVar2, hVar3);
        f83443w = O(j.HOURS, j.MINUTES, j.SECONDS, j.NANOS);
        f83444x = O(net.time4j.h.weekBasedYears(), net.time4j.h.WEEKS, hVar3);
    }

    p(List<n0.a<U>> list, boolean z4) {
        boolean isEmpty = list.isEmpty();
        if (isEmpty) {
            this.f83447c = Collections.emptyList();
        } else {
            Collections.sort(list, f83435o);
            this.f83447c = Collections.unmodifiableList(list);
        }
        this.f83448d = !isEmpty && z4;
    }

    private int A() {
        return this.f83447c.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <U extends z> p<U> B(Map<U, Long> map, boolean z4) {
        if (map.isEmpty()) {
            return f83428h;
        }
        ArrayList arrayList = new ArrayList(map.size());
        long j4 = 0;
        for (Map.Entry<U, Long> entry : map.entrySet()) {
            long longValue = entry.getValue().longValue();
            if (longValue != 0) {
                U key = entry.getKey();
                if (key == j.MILLIS) {
                    j4 = net.time4j.base.c.f(j4, net.time4j.base.c.i(longValue, 1000000L));
                } else if (key == j.MICROS) {
                    j4 = net.time4j.base.c.f(j4, net.time4j.base.c.i(longValue, 1000L));
                } else if (key == j.NANOS) {
                    j4 = net.time4j.base.c.f(j4, longValue);
                } else {
                    arrayList.add(n0.a.c(longValue, key));
                }
            }
        }
        if (j4 != 0) {
            arrayList.add(n0.a.c(j4, j.NANOS));
        } else if (arrayList.isEmpty()) {
            return f83428h;
        }
        return new p<>(arrayList, z4);
    }

    private static e<net.time4j.h> C(boolean z4, boolean z5) {
        return e.u(net.time4j.h.class, z4 ? z5 ? ProtectedSandApp.s("頟\u0001") : ProtectedSandApp.s("頠\u0001") : z5 ? ProtectedSandApp.s("頡\u0001") : ProtectedSandApp.s("頢\u0001"));
    }

    private static e<j> D(boolean z4) {
        return e.u(j.class, z4 ? ProtectedSandApp.s("頣\u0001") : ProtectedSandApp.s("頤\u0001"));
    }

    public static <U extends z> e<U> E(Class<U> cls, String str) {
        return e.u(cls, str);
    }

    public static e<z> F(String str) {
        return e.v(str);
    }

    private static e<net.time4j.h> G(boolean z4, boolean z5) {
        return z4 ? z5 ? f83430j : f83429i : z5 ? f83432l : f83431k;
    }

    private static e<j> H(boolean z4) {
        return z4 ? f83433m : f83434n;
    }

    private int I(net.time4j.engine.w wVar) {
        return J(wVar, this.f83447c);
    }

    private static <U extends net.time4j.engine.w> int J(net.time4j.engine.w wVar, List<n0.a<U>> list) {
        int size = list.size() - 1;
        int i4 = 0;
        while (i4 <= size) {
            int i5 = (i4 + size) >>> 1;
            int e4 = v0.e(list.get(i5).b(), wVar);
            if (e4 < 0) {
                i4 = i5 + 1;
            } else {
                if (e4 <= 0) {
                    return i5;
                }
                size = i5 - 1;
            }
        }
        return -1;
    }

    private static boolean L(long j4, long j5) {
        return (j4 < 0 && j5 > 0) || (j4 > 0 && j5 < 0);
    }

    public static <U extends z> net.time4j.engine.l0<U, p<U>> M(Collection<? extends U> collection) {
        return new g(collection, (a) null);
    }

    public static net.time4j.engine.l0<z, p<z>> N(net.time4j.tz.l lVar, z... zVarArr) {
        return new h(lVar, zVarArr, null);
    }

    public static <U extends z> net.time4j.engine.l0<U, p<U>> O(U... uArr) {
        return new g(uArr, (a) null);
    }

    public static net.time4j.engine.l0<j, p<j>> P() {
        return f83443w;
    }

    public static net.time4j.engine.l0<x, p<x>> Q() {
        return f83444x;
    }

    public static net.time4j.engine.l0<net.time4j.h, p<net.time4j.h>> R() {
        return f83442v;
    }

    private static <U> boolean T(net.time4j.engine.n0<U> n0Var) {
        List<n0.a<U>> f4 = n0Var.f();
        int size = f4.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (f4.get(i4).a() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean U(z zVar) {
        char symbol = zVar.getSymbol();
        return symbol >= '1' && symbol <= '9';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long V(p<j> pVar) {
        j jVar = j.HOURS;
        pVar.getClass();
        long f4 = net.time4j.base.c.f(net.time4j.base.c.f(net.time4j.base.c.f(net.time4j.base.c.i(pVar.e(jVar), 3600L), net.time4j.base.c.i(pVar.e(j.MINUTES), 60L)), pVar.e(j.SECONDS)), pVar.e(j.NANOS) / f83426f);
        return ((p) pVar).f83448d ? net.time4j.base.c.k(f4) : f4;
    }

    private static <U extends z> p<U> W(p<U> pVar, net.time4j.engine.n0<? extends U> n0Var) {
        int i4;
        if (pVar.isEmpty()) {
            if (T(n0Var)) {
                return pVar;
            }
            if (n0Var instanceof p) {
                return (p) n0Var;
            }
        }
        HashMap hashMap = new HashMap();
        int size = ((p) pVar).f83447c.size();
        int i5 = 0;
        while (true) {
            int i6 = -1;
            if (i5 >= size) {
                break;
            }
            n0.a<U> aVar = ((p) pVar).f83447c.get(i5);
            U b5 = aVar.b();
            long a5 = aVar.a();
            if (!((p) pVar).f83448d) {
                i6 = 1;
            }
            hashMap.put(b5, Long.valueOf(net.time4j.base.c.i(a5, i6)));
            i5++;
        }
        boolean d5 = n0Var.d();
        int size2 = n0Var.f().size();
        int i7 = 0;
        while (i7 < size2) {
            n0.a<? extends U> aVar2 = n0Var.f().get(i7);
            U b6 = aVar2.b();
            long a6 = aVar2.a();
            n0.a t02 = t0(a6, b6);
            if (t02 != null) {
                a6 = t02.a();
                b6 = (U) t02.b();
            }
            if (hashMap.containsKey(b6)) {
                i4 = size2;
                hashMap.put(b6, Long.valueOf(net.time4j.base.c.f(((Long) hashMap.get(b6)).longValue(), net.time4j.base.c.i(a6, d5 ? -1 : 1))));
            } else {
                i4 = size2;
                hashMap.put(b6, Long.valueOf(net.time4j.base.c.i(a6, d5 ? -1 : 1)));
            }
            i7++;
            size2 = i4;
        }
        if (((p) pVar).f83448d != d5) {
            Iterator it = hashMap.entrySet().iterator();
            boolean z4 = true;
            d5 = false;
            while (it.hasNext()) {
                boolean z5 = ((Long) ((Map.Entry) it.next()).getValue()).longValue() < 0;
                if (z4) {
                    d5 = z5;
                    z4 = false;
                } else if (d5 != z5) {
                    return null;
                }
            }
        }
        if (d5) {
            for (Map.Entry entry : hashMap.entrySet()) {
                long longValue = ((Long) entry.getValue()).longValue();
                Object key = entry.getKey();
                if (longValue < 0) {
                    longValue = net.time4j.base.c.k(longValue);
                }
                hashMap.put(key, Long.valueOf(longValue));
            }
        }
        return B(hashMap, d5);
    }

    public static <U extends z> p<U> Y(long j4, U u4) {
        if (j4 == 0) {
            return f83428h;
        }
        if (j4 < 0) {
            j4 = net.time4j.base.c.k(j4);
        }
        if (u4 instanceof j) {
            char symbol = u4.getSymbol();
            if (symbol == '3') {
                u4 = j.NANOS;
                j4 = net.time4j.base.c.i(j4, 1000000L);
            } else if (symbol == '6') {
                u4 = j.NANOS;
                j4 = net.time4j.base.c.i(j4, 1000L);
            }
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(n0.a.c(j4, u4));
        return new p<>(arrayList, j4 < 0);
    }

    public static p<net.time4j.h> Z(int i4, int i5, int i6) {
        return a0(i4, i5, i6, false);
    }

    private static p<net.time4j.h> a0(long j4, long j5, long j6, boolean z4) {
        ArrayList arrayList = new ArrayList(3);
        if (j4 != 0) {
            arrayList.add(n0.a.c(j4, net.time4j.h.YEARS));
        }
        if (j5 != 0) {
            arrayList.add(n0.a.c(j5, net.time4j.h.MONTHS));
        }
        if (j6 != 0) {
            arrayList.add(n0.a.c(j6, net.time4j.h.DAYS));
        }
        return new p<>(arrayList, z4);
    }

    public static p<j> b0(int i4, int i5, int i6) {
        return c0(i4, i5, i6, 0L, false);
    }

    private static p<j> c0(long j4, long j5, long j6, long j7, boolean z4) {
        ArrayList arrayList = new ArrayList(4);
        if (j4 != 0) {
            arrayList.add(n0.a.c(j4, j.HOURS));
        }
        if (j5 != 0) {
            arrayList.add(n0.a.c(j5, j.MINUTES));
        }
        if (j6 != 0) {
            arrayList.add(n0.a.c(j6, j.SECONDS));
        }
        if (j7 != 0) {
            arrayList.add(n0.a.c(j7, j.NANOS));
        }
        return new p<>(arrayList, z4);
    }

    public static d d0() {
        return new d(true);
    }

    public static d e0() {
        return new d(false);
    }

    public static <U extends z> p<U> f0() {
        return f83428h;
    }

    private static <U extends net.time4j.engine.w> boolean g0(String str, int i4, int i5, int i6, List<n0.a<U>> list) throws ParseException {
        int i7;
        int i10;
        char charAt = str.charAt(i5 - 1);
        char c5 = '9';
        char c6 = '0';
        if (charAt >= '0' && charAt <= '9' && i6 != 2) {
            h0(str, i4, i5, i6 == 0, list);
            return true;
        }
        if (i4 == i5) {
            throw new ParseException(str, i4);
        }
        int i11 = i4;
        int i12 = i11;
        boolean z4 = false;
        boolean z5 = false;
        net.time4j.engine.w wVar = null;
        StringBuilder sb = null;
        while (i12 < i5) {
            char charAt2 = str.charAt(i12);
            if (charAt2 < c6 || charAt2 > c5) {
                String s4 = ProtectedSandApp.s("頥\u0001");
                if (charAt2 == ',' || charAt2 == '.') {
                    i7 = i12;
                    int i13 = i11;
                    if (sb == null || i6 != 1) {
                        throw new ParseException(s4.concat(str), i7);
                    }
                    wVar = o(j.SECONDS, wVar, i0(str, sb.toString(), i13), str, i7, list);
                    i11 = i13;
                    z4 = true;
                    z5 = true;
                } else {
                    if (z4) {
                        throw new ParseException(ProtectedSandApp.s("頧\u0001") + charAt2 + ProtectedSandApp.s("頨\u0001") + str, i12);
                    }
                    if (!z5) {
                        i10 = i11;
                        i7 = i12;
                        wVar = o(i6 == 1 ? o0(charAt2, str, i7) : i6 == 2 ? q0(charAt2, str, i7) : l0(charAt2, str, i7), wVar, i0(str, sb == null ? String.valueOf(charAt2) : sb.toString(), i10), str, i7, list);
                    } else {
                        if (charAt2 != 'S') {
                            throw new ParseException(ProtectedSandApp.s("頦\u0001").concat(str), i12);
                        }
                        if (sb == null) {
                            throw new ParseException(s4.concat(str), i12 - 1);
                        }
                        if (sb.length() > 9) {
                            sb.delete(9, sb.length());
                        }
                        for (int length = sb.length(); length < 9; length++) {
                            sb.append(c6);
                        }
                        i10 = i11;
                        i7 = i12;
                        wVar = o(j.NANOS, wVar, i0(str, sb.toString(), i11), str, i12, list);
                    }
                    i11 = i10;
                    z4 = true;
                }
                sb = null;
            } else {
                if (sb == null) {
                    sb = new StringBuilder();
                    i11 = i12;
                    z4 = false;
                }
                sb.append(charAt2);
                i7 = i12;
            }
            i12 = i7 + 1;
            c5 = '9';
            c6 = '0';
        }
        if (z4) {
            return false;
        }
        throw new ParseException(ProtectedSandApp.s("頩\u0001").concat(str), i5);
    }

    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    private static <U extends net.time4j.engine.w> void h0(String str, int i4, int i5, boolean z4, List<n0.a<U>> list) throws ParseException {
        long e4;
        long j4;
        r5 = true;
        boolean z5 = true;
        if (z4) {
            int i6 = i4 + 4;
            ?? r10 = (i6 >= i5 || str.charAt(i6) != '-') ? 0 : 1;
            if (r10 == 0 ? i4 + 7 != i5 : i4 + 8 != i5) {
                z5 = false;
            }
            p o4 = G(r10, z5).o(str, i4);
            net.time4j.h hVar = net.time4j.h.YEARS;
            long e5 = o4.e(hVar);
            if (z5) {
                j4 = o4.e(net.time4j.h.DAYS);
                e4 = 0;
            } else {
                e4 = o4.e(net.time4j.h.MONTHS);
                long e6 = o4.e(net.time4j.h.DAYS);
                if (e4 > 12) {
                    throw new ParseException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("頫\u0001"), str), i6 + r10);
                }
                if (e6 > 30) {
                    throw new ParseException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("頪\u0001"), str), i4 + 6 + (r10 == 0 ? 0 : 2));
                }
                j4 = e6;
            }
            if (e5 > 0) {
                list.add(n0.a.c(e5, hVar));
            }
            if (e4 > 0) {
                list.add(n0.a.c(e4, net.time4j.h.MONTHS));
            }
            if (j4 > 0) {
                list.add(n0.a.c(j4, net.time4j.h.DAYS));
                return;
            }
            return;
        }
        int i7 = i4 + 2;
        ?? r5 = (i7 >= i5 || str.charAt(i7) != ':') ? 0 : 1;
        p o5 = H(r5).o(str, i4);
        j jVar = j.HOURS;
        long e7 = o5.e(jVar);
        if (e7 > 0) {
            if (e7 > 24) {
                throw new ParseException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("頬\u0001"), str), i4);
            }
            list.add(n0.a.c(e7, jVar));
        }
        j jVar2 = j.MINUTES;
        long e10 = o5.e(jVar2);
        if (e10 > 0) {
            if (e10 > 60) {
                throw new ParseException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("頭\u0001"), str), i7 + r5);
            }
            list.add(n0.a.c(e10, jVar2));
        }
        j jVar3 = j.SECONDS;
        long e11 = o5.e(jVar3);
        if (e11 > 0) {
            if (e11 > 60) {
                throw new ParseException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("頮\u0001"), str), i4 + 4 + (r5 == 0 ? 0 : 2));
            }
            list.add(n0.a.c(e11, jVar3));
        }
        j jVar4 = j.NANOS;
        long e12 = o5.e(jVar4);
        if (e12 > 0) {
            list.add(n0.a.c(e12, jVar4));
        }
    }

    private static long i0(String str, String str2, int i4) throws ParseException {
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException e4) {
            ParseException parseException = new ParseException(str, i4);
            parseException.initCause(e4);
            throw parseException;
        }
    }

    public static p<net.time4j.h> j0(String str) throws ParseException {
        return n0(str, net.time4j.h.class);
    }

    public static p<j> k0(String str) throws ParseException {
        return n0(str, j.class);
    }

    private static net.time4j.h l0(char c5, String str, int i4) throws ParseException {
        if (c5 == 'I') {
            return net.time4j.h.MILLENNIA;
        }
        if (c5 == 'M') {
            return net.time4j.h.MONTHS;
        }
        if (c5 == 'Q') {
            return net.time4j.h.QUARTERS;
        }
        if (c5 == 'W') {
            return net.time4j.h.WEEKS;
        }
        if (c5 == 'Y') {
            return net.time4j.h.YEARS;
        }
        switch (c5) {
            case 'C':
                return net.time4j.h.CENTURIES;
            case 'D':
                return net.time4j.h.DAYS;
            case 'E':
                return net.time4j.h.DECADES;
            default:
                throw new ParseException(ProtectedSandApp.s("頯\u0001") + c5 + ProtectedSandApp.s("頰\u0001") + str, i4);
        }
    }

    public static p<z> m0(String str) throws ParseException {
        return n0(str, z.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <U extends z> p<U> n0(String str, Class<U> cls) throws ParseException {
        boolean z4;
        String s4 = ProtectedSandApp.s("頱\u0001");
        String s5 = ProtectedSandApp.s("頲\u0001");
        String s6 = ProtectedSandApp.s("頳\u0001");
        String s7 = ProtectedSandApp.s("頴\u0001");
        int i4 = 0;
        if (str.length() == 0) {
            throw new ParseException(ProtectedSandApp.s("頶\u0001"), 0);
        }
        int i5 = str.charAt(0) == '-' ? 1 : 0;
        boolean z5 = i5;
        try {
            if (str.charAt(i5) != 'P') {
                throw new ParseException(s7.concat(str), i5);
            }
            int i6 = i5 + 1;
            ArrayList arrayList = new ArrayList();
            int indexOf = str.indexOf(84, i6);
            boolean z6 = indexOf == -1;
            int i7 = cls == net.time4j.h.class ? 0 : cls == j.class ? 1 : cls == x.class ? 2 : -1;
            if (!z6) {
                if (indexOf <= i6) {
                    z4 = false;
                } else {
                    if (i7 == 1) {
                        throw new ParseException(s5.concat(str), i6);
                    }
                    z4 = g0(str.substring(0, indexOf), i6, indexOf, 0, arrayList);
                }
                if (cls == net.time4j.h.class) {
                    throw new ParseException(s4.concat(str), indexOf);
                }
                if (z4) {
                    h0(str, indexOf + 1, str.length(), false, arrayList);
                } else {
                    g0(str, indexOf + 1, str.length(), 1, arrayList);
                }
            } else {
                if (i7 == 1) {
                    throw new ParseException(s6.concat(str), i6);
                }
                int length = str.length();
                if (i7 != -1) {
                    i4 = i7;
                }
                g0(str, i6, length, i4, arrayList);
            }
            return new p<>(arrayList, z5);
        } catch (IndexOutOfBoundsException e4) {
            ParseException parseException = new ParseException(ProtectedSandApp.s("頵\u0001").concat(str), i5);
            parseException.initCause(e4);
            throw parseException;
        }
    }

    private static <U extends net.time4j.engine.w> net.time4j.engine.w o(net.time4j.engine.w wVar, net.time4j.engine.w wVar2, long j4, String str, int i4, List<n0.a<U>> list) throws ParseException {
        if (wVar2 == null || Double.compare(wVar.getLength(), wVar2.getLength()) < 0) {
            if (j4 != 0) {
                list.add(n0.a.c(j4, wVar));
            }
            return wVar;
        }
        if (Double.compare(wVar.getLength(), wVar2.getLength()) == 0) {
            throw new ParseException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("頷\u0001"), str), i4);
        }
        throw new ParseException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("頸\u0001"), str), i4);
    }

    private static j o0(char c5, String str, int i4) throws ParseException {
        if (c5 == 'H') {
            return j.HOURS;
        }
        if (c5 == 'M') {
            return j.MINUTES;
        }
        if (c5 == 'S') {
            return j.SECONDS;
        }
        throw new ParseException(ProtectedSandApp.s("頯\u0001") + c5 + ProtectedSandApp.s("頰\u0001") + str, i4);
    }

    public static net.time4j.engine.f0<z> p(int i4) {
        return new c(i4, j.HOURS);
    }

    public static p<x> p0(String str) throws ParseException {
        return n0(str, x.class);
    }

    public static net.time4j.engine.f0<z> q() {
        return new c(false);
    }

    private static x q0(char c5, String str, int i4) throws ParseException {
        if (c5 == 'D') {
            return net.time4j.h.DAYS;
        }
        if (c5 == 'W') {
            return net.time4j.h.WEEKS;
        }
        if (c5 == 'Y') {
            return net.time4j.h.weekBasedYears();
        }
        throw new ParseException(ProtectedSandApp.s("頯\u0001") + c5 + ProtectedSandApp.s("頰\u0001") + str, i4);
    }

    public static net.time4j.engine.f0<z> r() {
        return new c(true);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("頹\u0001"));
    }

    public static net.time4j.engine.f0<z> s(int i4) {
        return new c(i4, j.MINUTES);
    }

    public static net.time4j.engine.f0<z> t(int i4) {
        return new c(i4, j.SECONDS);
    }

    private static <U extends z> n0.a<U> t0(long j4, U u4) {
        long i4;
        j jVar;
        if (u4.equals(j.MILLIS)) {
            i4 = net.time4j.base.c.i(j4, 1000000L);
            jVar = j.NANOS;
        } else {
            if (!u4.equals(j.MICROS)) {
                return null;
            }
            i4 = net.time4j.base.c.i(j4, 1000L);
            jVar = j.NANOS;
        }
        return n0.a.c(i4, jVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> T u(Object obj) {
        return obj;
    }

    private static <U extends z> boolean u0(net.time4j.engine.n0<? extends U> n0Var, long[] jArr) {
        long j4;
        long j5;
        long f4;
        long j6 = jArr[0];
        long j7 = jArr[1];
        long j10 = jArr[2];
        long j11 = jArr[3];
        for (n0.a<? extends U> aVar : n0Var.f()) {
            U b5 = aVar.b();
            long a5 = aVar.a();
            if (n0Var.d()) {
                a5 = net.time4j.base.c.k(a5);
            }
            long j12 = j10;
            long j13 = a5;
            if (b5 instanceof net.time4j.h) {
                net.time4j.h hVar = (net.time4j.h) net.time4j.h.class.cast(b5);
                switch (b.f83449a[hVar.ordinal()]) {
                    case 1:
                        j6 = net.time4j.base.c.f(j6, net.time4j.base.c.i(j13, 12000L));
                        break;
                    case 2:
                        j6 = net.time4j.base.c.f(j6, net.time4j.base.c.i(j13, 1200L));
                        break;
                    case 3:
                        j6 = net.time4j.base.c.f(j6, net.time4j.base.c.i(j13, 120L));
                        break;
                    case 4:
                        j6 = net.time4j.base.c.f(j6, net.time4j.base.c.i(j13, 12L));
                        break;
                    case 5:
                        j6 = net.time4j.base.c.f(j6, net.time4j.base.c.i(j13, 3L));
                        break;
                    case 6:
                        j6 = net.time4j.base.c.f(j6, j13);
                        break;
                    case 7:
                        j7 = net.time4j.base.c.f(j7, net.time4j.base.c.i(j13, 7L));
                        break;
                    case 8:
                        j7 = net.time4j.base.c.f(j7, j13);
                        break;
                    default:
                        throw new UnsupportedOperationException(hVar.name());
                }
            } else {
                if (!(b5 instanceof j)) {
                    return false;
                }
                j jVar = (j) j.class.cast(b5);
                switch (b.f83450b[jVar.ordinal()]) {
                    case 1:
                        j5 = j7;
                        f4 = net.time4j.base.c.f(j12, net.time4j.base.c.i(j13, 3600L));
                        j7 = j5;
                        j12 = f4;
                        break;
                    case 2:
                        j5 = j7;
                        f4 = net.time4j.base.c.f(j12, net.time4j.base.c.i(j13, 60L));
                        j7 = j5;
                        j12 = f4;
                        break;
                    case 3:
                        j5 = j7;
                        f4 = net.time4j.base.c.f(j12, j13);
                        j7 = j5;
                        j12 = f4;
                        break;
                    case 4:
                        j11 = net.time4j.base.c.f(j11, net.time4j.base.c.i(j13, 1000000L));
                        f4 = j12;
                        j5 = j7;
                        j7 = j5;
                        j12 = f4;
                        break;
                    case 5:
                        j11 = net.time4j.base.c.f(j11, net.time4j.base.c.i(j13, 1000L));
                        f4 = j12;
                        j5 = j7;
                        j7 = j5;
                        j12 = f4;
                        break;
                    case 6:
                        j11 = net.time4j.base.c.f(j11, j13);
                        f4 = j12;
                        j5 = j7;
                        j7 = j5;
                        j12 = f4;
                        break;
                    default:
                        throw new UnsupportedOperationException(jVar.name());
                }
            }
            j10 = j12;
        }
        long j14 = j7;
        long j15 = j10;
        if (j11 != 0) {
            j11 = net.time4j.base.c.f(net.time4j.base.c.f(j11, net.time4j.base.c.i(j14, 86400000000000L)), net.time4j.base.c.i(j15, f83426f));
            j15 = 0;
            j4 = 0;
        } else if (j15 != 0) {
            j15 = net.time4j.base.c.f(j15, net.time4j.base.c.i(j14, 86400L));
            j4 = 0;
        } else {
            j4 = j14;
        }
        jArr[0] = j6;
        jArr[1] = j4;
        jArr[2] = j15;
        jArr[3] = j11;
        return true;
    }

    public static <U extends z, T extends net.time4j.engine.m0<U, T>> Comparator<p<? extends U>> v(T t4) {
        return new f(t4, null);
    }

    public static Comparator<p<j>> w() {
        return new a();
    }

    private Object writeReplace() {
        return new SPX(this, 6);
    }

    public static p<z> x(p<net.time4j.h> pVar, p<j> pVar2) {
        return f83428h.s0(pVar).s0(pVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String y0(int r22) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.p.y0(int):java.lang.String");
    }

    private static <U extends z> p<U> z(net.time4j.engine.n0<U> n0Var) {
        return n0Var instanceof p ? (p) n0Var : f83428h.s0(n0Var);
    }

    public String A0() {
        return y0(2);
    }

    public p<U> B0(U u4) {
        if (isEmpty()) {
            return f83428h;
        }
        double length = u4.getLength();
        ArrayList arrayList = new ArrayList();
        for (n0.a<U> aVar : this.f83447c) {
            if (Double.compare(aVar.b().getLength(), length) < 0) {
                break;
            }
            arrayList.add(aVar);
        }
        return arrayList.isEmpty() ? f83428h : new p<>(arrayList, this.f83448d);
    }

    public List<p<U>> C0(net.time4j.engine.n0<? extends U> n0Var) {
        p W = W(this, n0Var);
        if (W != null) {
            return Collections.singletonList(W);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        arrayList.add(f83428h.s0(n0Var));
        return Collections.unmodifiableList(arrayList);
    }

    public p<U> D0(long j4, U u4) {
        if (j4 < 0) {
            j4 = net.time4j.base.c.k(j4);
        }
        n0.a t02 = t0(j4, u4);
        if (t02 != null) {
            j4 = t02.a();
            u4 = (U) t02.b();
        }
        return r0(net.time4j.base.c.m(net.time4j.base.c.i(j4, j4 < 0 ? -1L : 1L), net.time4j.base.c.i(e(u4), this.f83448d ? -1L : 1L)), u4);
    }

    public p<U> E0(net.time4j.engine.f0<U> f0Var) {
        return z(f0Var.d(this));
    }

    @Override // net.time4j.engine.a
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public long e(z zVar) {
        if (zVar == null) {
            return 0L;
        }
        boolean U = U(zVar);
        int size = this.f83447c.size();
        for (int i4 = 0; i4 < size; i4++) {
            n0.a<U> aVar = this.f83447c.get(i4);
            U b5 = aVar.b();
            if (b5.equals(zVar)) {
                return aVar.a();
            }
            if (U && U(b5)) {
                int symbol = b5.getSymbol() - '0';
                int symbol2 = zVar.getSymbol() - '0';
                int i5 = 1;
                for (int i6 = 0; i6 < Math.abs(symbol - symbol2); i6++) {
                    i5 *= 10;
                }
                return symbol >= symbol2 ? aVar.a() / i5 : aVar.a() * i5;
            }
        }
        return 0L;
    }

    public p<U> S() {
        return X(-1);
    }

    public p<U> X(int i4) {
        if (!isEmpty()) {
            boolean z4 = true;
            if (i4 != 1) {
                if (i4 == 0) {
                    return f83428h;
                }
                if (i4 == -1) {
                    return new p<>((p) this, true);
                }
                ArrayList arrayList = new ArrayList(this.f83447c.size());
                int abs = Math.abs(i4);
                int size = this.f83447c.size();
                for (int i5 = 0; i5 < size; i5++) {
                    n0.a<U> aVar = this.f83447c.get(i5);
                    arrayList.add(n0.a.c(net.time4j.base.c.i(aVar.a(), abs), aVar.b()));
                }
                if (i4 >= 0) {
                    z4 = this.f83448d;
                } else if (this.f83448d) {
                    z4 = false;
                }
                return new p<>(arrayList, z4);
            }
        }
        return this;
    }

    @Override // net.time4j.engine.n0
    public boolean d() {
        return this.f83448d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) p.class.cast(obj);
        return this.f83448d == pVar.f83448d && this.f83447c.equals(pVar.f83447c);
    }

    @Override // net.time4j.engine.n0
    public List<n0.a<U>> f() {
        return this.f83447c;
    }

    public int hashCode() {
        int hashCode = this.f83447c.hashCode();
        if (this.f83448d) {
            return 0;
        }
        return hashCode;
    }

    @Override // net.time4j.engine.a
    public net.time4j.engine.a k() {
        return X(-1);
    }

    public p<U> l() {
        return this.f83448d ? X(-1) : this;
    }

    public p<U> r0(long j4, U u4) {
        long j5;
        boolean z4;
        z zVar;
        if (u4 == null) {
            throw new NullPointerException(ProtectedSandApp.s("顂\u0001"));
        }
        if (j4 == 0) {
            return this;
        }
        if (j4 < 0) {
            j5 = net.time4j.base.c.k(j4);
            z4 = true;
        } else {
            j5 = j4;
            z4 = false;
        }
        ArrayList arrayList = new ArrayList(this.f83447c);
        n0.a t02 = t0(j5, u4);
        if (t02 != null) {
            j5 = t02.a();
            zVar = (z) t02.b();
        } else {
            zVar = u4;
        }
        if (isEmpty()) {
            if (t02 == null) {
                t02 = n0.a.c(j5, zVar);
            }
            arrayList.add(t02);
            return new p<>(arrayList, z4);
        }
        int J = J(zVar, this.f83447c);
        boolean z5 = this.f83448d;
        if (J >= 0) {
            long f4 = net.time4j.base.c.f(net.time4j.base.c.i(((n0.a) arrayList.get(J)).a(), this.f83448d ? -1 : 1), net.time4j.base.c.i(j5, z4 ? -1 : 1));
            if (f4 == 0) {
                arrayList.remove(J);
            } else {
                if (this.f83447c.size() != 1) {
                    if (this.f83448d != (f4 < 0)) {
                        return s0(Y(j4, u4));
                    }
                }
                if (f4 < 0) {
                    f4 = net.time4j.base.c.k(f4);
                }
                arrayList.set(J, n0.a.c(f4, zVar));
                z5 = f4 < 0;
            }
        } else {
            if (z5 != z4) {
                return s0(Y(j4, u4));
            }
            arrayList.add(n0.a.c(j5, zVar));
        }
        return new p<>(arrayList, z5);
    }

    public p<U> s0(net.time4j.engine.n0<? extends U> n0Var) {
        long j4;
        long j5;
        long j6;
        long j7 = 0;
        p<U> W = W(this, n0Var);
        if (W != null) {
            return W;
        }
        long[] jArr = {0, 0, 0, 0};
        if (u0(this, jArr) && u0(n0Var, jArr)) {
            long j10 = jArr[0];
            long j11 = jArr[1];
            long j12 = jArr[2];
            long j13 = jArr[3];
            if (j13 != 0) {
                j4 = j11;
                j5 = j13;
            } else if (j12 != 0) {
                j4 = j11;
                j5 = j12;
            } else {
                j4 = j11;
                j5 = j4;
            }
            if (!L(j10, j5)) {
                boolean z4 = j10 < 0 || j5 < 0;
                if (z4) {
                    j10 = net.time4j.base.c.k(j10);
                    j6 = net.time4j.base.c.k(j4);
                    j12 = net.time4j.base.c.k(j12);
                    j13 = net.time4j.base.c.k(j13);
                } else {
                    j6 = j4;
                }
                long j14 = j10 / 12;
                long j15 = j10 % 12;
                if (j13 != 0) {
                    long j16 = j13 % f83426f;
                    j12 = j13 / f83426f;
                    j7 = j16;
                }
                long j17 = j12 / 3600;
                long j18 = j12 % 3600;
                HashMap hashMap = new HashMap();
                hashMap.put(net.time4j.h.YEARS, Long.valueOf(j14));
                hashMap.put(net.time4j.h.MONTHS, Long.valueOf(j15));
                hashMap.put(net.time4j.h.DAYS, Long.valueOf(j6));
                hashMap.put(j.HOURS, Long.valueOf(j17));
                hashMap.put(j.MINUTES, Long.valueOf(j18 / 60));
                hashMap.put(j.SECONDS, Long.valueOf(j18 % 60));
                hashMap.put(j.NANOS, Long.valueOf(j7));
                return B(hashMap, z4);
            }
        }
        throw new IllegalStateException(ProtectedSandApp.s("顃\u0001") + this + ProtectedSandApp.s("顄\u0001") + n0Var);
    }

    @Override // net.time4j.engine.a
    public String toString() {
        return y0(0);
    }

    public p<net.time4j.h> v0() {
        if (isEmpty()) {
            return f83428h;
        }
        ArrayList arrayList = new ArrayList();
        for (n0.a<U> aVar : this.f83447c) {
            if (aVar.b() instanceof net.time4j.h) {
                arrayList.add(n0.a.c(aVar.a(), net.time4j.h.class.cast(aVar.b())));
            }
        }
        return arrayList.isEmpty() ? f83428h : new p<>(arrayList, this.f83448d);
    }

    public p<j> w0() {
        if (isEmpty()) {
            return f83428h;
        }
        ArrayList arrayList = new ArrayList();
        for (n0.a<U> aVar : this.f83447c) {
            if (aVar.b() instanceof j) {
                arrayList.add(n0.a.c(aVar.a(), j.class.cast(aVar.b())));
            }
        }
        return arrayList.isEmpty() ? f83428h : new p<>(arrayList, this.f83448d);
    }

    public p<j> x0() {
        if (isEmpty()) {
            return f83428h;
        }
        ArrayList arrayList = new ArrayList();
        long j4 = 0;
        for (n0.a<U> aVar : this.f83447c) {
            if (aVar.b() instanceof j) {
                arrayList.add(n0.a.c(aVar.a(), j.class.cast(aVar.b())));
            } else if (aVar.b().equals(net.time4j.h.DAYS)) {
                j4 = net.time4j.base.c.i(aVar.a(), 24L);
            }
        }
        if (j4 != 0) {
            int size = arrayList.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    arrayList.add(n0.a.c(j4, j.HOURS));
                    break;
                }
                n0.a aVar2 = (n0.a) arrayList.get(i4);
                Object b5 = aVar2.b();
                j jVar = j.HOURS;
                if (b5 == jVar) {
                    arrayList.set(i4, n0.a.c(net.time4j.base.c.f(aVar2.a(), j4), jVar));
                    break;
                }
                i4++;
            }
        } else if (arrayList.isEmpty()) {
            return f83428h;
        }
        return new p<>(arrayList, this.f83448d);
    }

    @Override // net.time4j.engine.a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public boolean contains(z zVar) {
        if (zVar == null) {
            return false;
        }
        boolean U = U(zVar);
        int size = this.f83447c.size();
        for (int i4 = 0; i4 < size; i4++) {
            n0.a<U> aVar = this.f83447c.get(i4);
            U b5 = aVar.b();
            if (b5.equals(zVar) || (U && U(b5))) {
                return aVar.a() > 0;
            }
        }
        return false;
    }

    public String z0() {
        return y0(1);
    }

    /* compiled from: Duration.java */
    private static class c implements net.time4j.engine.f0<z> {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f83451b;

        /* renamed from: c, reason: collision with root package name */
        private final int f83452c;

        /* renamed from: d, reason: collision with root package name */
        private final j f83453d;

        c(boolean z4) {
            this.f83451b = z4;
            this.f83452c = 1;
            this.f83453d = null;
        }

        private static z a(double d5) {
            for (z zVar : Arrays.asList(net.time4j.h.YEARS, net.time4j.h.MONTHS, net.time4j.h.DAYS, j.HOURS, j.MINUTES)) {
                if (d5 >= zVar.getLength()) {
                    return zVar;
                }
            }
            return j.SECONDS;
        }

        private static int c(double d5) {
            if (d5 < -2.147483648E9d || d5 > 2.147483647E9d) {
                throw new ArithmeticException(androidx.compose.ui.graphics.colorspace.b0.a(ProtectedSandApp.s("頍\u0001"), d5));
            }
            return (int) d5;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0143  */
        @Override // net.time4j.engine.f0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public net.time4j.p<net.time4j.z> d(net.time4j.engine.n0<? extends net.time4j.z> r17) {
            /*
                Method dump skipped, instructions count: 382
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: net.time4j.p.c.d(net.time4j.engine.n0):net.time4j.p");
        }

        c(int i4, j jVar) {
            if (i4 >= 1) {
                if (jVar.compareTo(j.SECONDS) <= 0) {
                    this.f83451b = false;
                    this.f83452c = i4;
                    this.f83453d = jVar;
                    return;
                }
                throw new IllegalArgumentException(ProtectedSandApp.s("頋\u0001"));
            }
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("頌\u0001"), i4));
        }
    }

    private p(p<U> pVar, boolean z4) {
        this.f83447c = pVar.f83447c;
        boolean z5 = pVar.f83448d;
        this.f83448d = z4 ? !z5 : z5;
    }

    private p() {
        this.f83447c = Collections.emptyList();
        this.f83448d = false;
    }
}
