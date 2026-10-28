package net.time4j.format.expert;

import androidx.content.preferences.protobuf.o1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import net.time4j.engine.ChronoException;
import net.time4j.engine.p0;
import net.time4j.engine.q0;
import net.time4j.format.a;
import net.time4j.m0;
import net.time4j.n0;

/* compiled from: ChronoFormatter.java */
/* loaded from: classes7.dex */
public final class c<T> implements net.time4j.format.expert.e<T>, net.time4j.format.expert.d<T>, net.time4j.format.t<T> {

    /* renamed from: r, reason: collision with root package name */
    public static final c<net.time4j.d0> f82846r = g0();

    /* renamed from: s, reason: collision with root package name */
    static final /* synthetic */ boolean f82847s = false;

    /* renamed from: a, reason: collision with root package name */
    private final net.time4j.engine.x<T> f82848a;

    /* renamed from: b, reason: collision with root package name */
    private final e<?> f82849b;

    /* renamed from: c, reason: collision with root package name */
    private final net.time4j.format.expert.b f82850c;

    /* renamed from: d, reason: collision with root package name */
    private final List<j> f82851d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<net.time4j.engine.q<?>, Object> f82852e;

    /* renamed from: f, reason: collision with root package name */
    private final k f82853f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f82854g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f82855h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f82856i;

    /* renamed from: j, reason: collision with root package name */
    private final int f82857j;

    /* renamed from: k, reason: collision with root package name */
    private final net.time4j.format.g f82858k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f82859l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f82860m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f82861n;

    /* renamed from: o, reason: collision with root package name */
    private final net.time4j.engine.x<?> f82862o;

    /* renamed from: p, reason: collision with root package name */
    private final int f82863p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f82864q;

    /* compiled from: ChronoFormatter.java */
    static class a implements net.time4j.format.expert.e<net.time4j.tz.k> {
        a() {
        }

        public <R> R a(net.time4j.tz.k kVar, Appendable appendable, net.time4j.engine.d dVar, net.time4j.engine.t<net.time4j.engine.p, R> tVar) throws IOException {
            return null;
        }

        @Override // net.time4j.format.expert.e
        public Object g(net.time4j.tz.k kVar, Appendable appendable, net.time4j.engine.d dVar, net.time4j.engine.t tVar) throws IOException {
            return null;
        }
    }

    /* compiled from: ChronoFormatter.java */
    static class b implements net.time4j.format.expert.d<net.time4j.tz.k> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f82865a;

        b(Map map) {
            this.f82865a = map;
        }

        @Override // net.time4j.format.expert.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public net.time4j.tz.k b(CharSequence charSequence, w wVar, net.time4j.engine.d dVar) {
            int f4 = wVar.f();
            int i4 = f4 + 3;
            if (i4 > charSequence.length()) {
                return null;
            }
            net.time4j.tz.k kVar = (net.time4j.tz.k) this.f82865a.get(charSequence.subSequence(f4, i4).toString());
            if (kVar != null) {
                wVar.m(i4);
                return kVar;
            }
            wVar.l(f4, ProtectedSandApp.s("鏜\u0001"));
            return null;
        }
    }

    /* compiled from: ChronoFormatter.java */
    /* renamed from: net.time4j.format.expert.c$c, reason: collision with other inner class name */
    static /* synthetic */ class C1294c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f82866a;

        static {
            int[] iArr = new int[a0.values().length];
            f82866a = iArr;
            try {
                iArr[a0.CLDR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82866a[a0.CLDR_24.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82866a[a0.CLDR_DATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f82866a[a0.SIMPLE_DATE_FORMAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: ChronoFormatter.java */
    public static final class d<T> {

        /* renamed from: n, reason: collision with root package name */
        private static final net.time4j.engine.c<net.time4j.n> f82867n = net.time4j.format.a.e(ProtectedSandApp.s("鏝\u0001"), net.time4j.n.class);

        /* renamed from: a, reason: collision with root package name */
        private final net.time4j.engine.x<T> f82868a;

        /* renamed from: b, reason: collision with root package name */
        private final net.time4j.engine.x<?> f82869b;

        /* renamed from: c, reason: collision with root package name */
        private final Locale f82870c;

        /* renamed from: d, reason: collision with root package name */
        private List<j> f82871d;

        /* renamed from: e, reason: collision with root package name */
        private LinkedList<net.time4j.format.expert.b> f82872e;

        /* renamed from: f, reason: collision with root package name */
        private int f82873f;

        /* renamed from: g, reason: collision with root package name */
        private int f82874g;

        /* renamed from: h, reason: collision with root package name */
        private int f82875h;

        /* renamed from: i, reason: collision with root package name */
        private String f82876i;

        /* renamed from: j, reason: collision with root package name */
        private net.time4j.n f82877j;

        /* renamed from: k, reason: collision with root package name */
        private Map<net.time4j.engine.q<?>, Object> f82878k;

        /* renamed from: l, reason: collision with root package name */
        private net.time4j.engine.x<?> f82879l;

        /* renamed from: m, reason: collision with root package name */
        private int f82880m;

        /* compiled from: ChronoFormatter.java */
        class a implements net.time4j.engine.o<net.time4j.engine.p> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ net.time4j.engine.o f82881b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ net.time4j.engine.o f82882c;

            a(net.time4j.engine.o oVar, net.time4j.engine.o oVar2) {
                this.f82881b = oVar;
                this.f82882c = oVar2;
            }

            @Override // net.time4j.engine.o
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean test(net.time4j.engine.p pVar) {
                return this.f82881b.test(pVar) && this.f82882c.test(pVar);
            }
        }

        /* synthetic */ d(net.time4j.engine.x xVar, Locale locale, net.time4j.engine.x xVar2, a aVar) {
            this(xVar, locale, (net.time4j.engine.x<?>) xVar2);
        }

        private <V> d<T> A(net.time4j.engine.q<V> qVar, boolean z4, int i4, int i5, b0 b0Var) {
            return B(qVar, z4, i4, i5, b0Var, false);
        }

        private <V> d<T> B(net.time4j.engine.q<V> qVar, boolean z4, int i4, int i5, b0 b0Var, boolean z5) {
            Y(qVar);
            j W = W(qVar);
            u uVar = new u(qVar, z4, i4, i5, b0Var, z5);
            if (z4) {
                int i6 = this.f82874g;
                if (i6 == -1) {
                    G(uVar);
                } else {
                    j jVar = this.f82871d.get(i6);
                    G(uVar);
                    if (jVar.f() == ((j) androidx.appcompat.view.menu.d.a(this.f82871d, 1)).f()) {
                        this.f82874g = i6;
                        this.f82871d.set(i6, jVar.t(i4));
                    }
                }
            } else {
                if (W != null && W.j() && !W.i()) {
                    throw new IllegalStateException(ProtectedSandApp.s("鏠\u0001"));
                }
                G(uVar);
                this.f82874g = this.f82871d.size() - 1;
            }
            return this;
        }

        private d<T> E(net.time4j.engine.q<Integer> qVar, Map<net.time4j.format.n, String> map) {
            Y(qVar);
            j W = W(qVar);
            v vVar = new v(qVar, map);
            if (W != null && W.j() && !W.i()) {
                throw new IllegalStateException(ProtectedSandApp.s("鏡\u0001"));
            }
            G(vVar);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G(i<?> iVar) {
            net.time4j.format.expert.b bVar;
            int i4;
            int i5;
            this.f82874g = -1;
            if (this.f82872e.isEmpty()) {
                bVar = null;
                i4 = 0;
                i5 = 0;
            } else {
                bVar = this.f82872e.getLast();
                i4 = bVar.g();
                i5 = bVar.i();
            }
            j jVar = new j(iVar, i4, i5, bVar);
            int i6 = this.f82875h;
            if (i6 > 0) {
                jVar = jVar.n(i6, 0);
                this.f82875h = 0;
            }
            this.f82871d.add(jVar);
        }

        private j W(net.time4j.engine.q<?> qVar) {
            j jVar = this.f82871d.isEmpty() ? null : (j) androidx.appcompat.view.menu.d.a(this.f82871d, 1);
            if (jVar == null) {
                return null;
            }
            if (!jVar.g() || jVar.i()) {
                return jVar;
            }
            throw new IllegalStateException(qVar.name() + ProtectedSandApp.s("鏢\u0001"));
        }

        private static void X(net.time4j.engine.c<?> cVar) {
            if (cVar.name().charAt(0) != '_') {
                return;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("鏣\u0001") + cVar.name());
        }

        private void Y(net.time4j.engine.q<?> qVar) {
            net.time4j.engine.x<?> s4 = c.s(this.f82868a, this.f82869b, qVar);
            int A = c.A(s4, this.f82868a, this.f82869b);
            if (A >= this.f82880m) {
                this.f82879l = s4;
                this.f82880m = A;
            }
        }

        private void Z() {
            if (!g0(this.f82868a)) {
                throw new IllegalStateException(ProtectedSandApp.s("鏤\u0001"));
            }
        }

        private void b0() {
            for (int size = this.f82871d.size() - 1; size >= 0; size--) {
                j jVar = this.f82871d.get(size);
                if (jVar.i()) {
                    return;
                }
                if (jVar.g()) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("鏥\u0001"));
                }
            }
        }

        private void c0(boolean z4, boolean z5) {
            b0();
            if (!z4 && !z5 && this.f82874g != -1) {
                throw new IllegalArgumentException(ProtectedSandApp.s("鏦\u0001"));
            }
        }

        private net.time4j.format.v<?> d0(boolean z4, net.time4j.n nVar) {
            net.time4j.format.a a5 = new a.b(e0()).a();
            net.time4j.engine.d dVar = a5;
            if (nVar != null) {
                dVar = (this.f82872e.isEmpty() ? new net.time4j.format.expert.b(a5, this.f82870c) : this.f82872e.getLast()).m(f82867n, nVar);
            }
            Iterator<net.time4j.engine.s> it = m0.y0().E().iterator();
            while (it.hasNext()) {
                for (net.time4j.engine.q<?> qVar : it.next().b(this.f82870c, dVar)) {
                    if (z4 && qVar.getSymbol() == 'b' && h0(qVar)) {
                        return (net.time4j.format.v) c.o(qVar);
                    }
                    if (!z4 && qVar.getSymbol() == 'B' && h0(qVar)) {
                        return (net.time4j.format.v) c.o(qVar);
                    }
                }
            }
            throw new IllegalStateException(ProtectedSandApp.s("鏧\u0001") + e0().C());
        }

        private static int f0(net.time4j.format.expert.b bVar) {
            if (bVar == null) {
                return 0;
            }
            return bVar.g();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean g0(net.time4j.engine.x<?> xVar) {
            while (!net.time4j.base.f.class.isAssignableFrom(xVar.C())) {
                xVar = xVar.d();
                if (xVar == null) {
                    return false;
                }
            }
            return true;
        }

        private boolean h0(net.time4j.engine.q<?> qVar) {
            if (!qVar.name().endsWith(ProtectedSandApp.s("鏨\u0001"))) {
                return false;
            }
            if (this.f82869b != null || this.f82868a.M(qVar)) {
                return true;
            }
            net.time4j.engine.x<T> xVar = this.f82868a;
            do {
                xVar = (net.time4j.engine.x<T>) xVar.d();
                if (xVar == null) {
                    return false;
                }
            } while (!xVar.M(qVar));
            return true;
        }

        private static boolean i0(char c5) {
            return (c5 >= 'A' && c5 <= 'Z') || (c5 >= 'a' && c5 <= 'z');
        }

        private void m0() {
            this.f82875h = 0;
        }

        private void v(StringBuilder sb) {
            if (sb.length() > 0) {
                t(sb.toString());
                sb.setLength(0);
            }
        }

        public <V extends Enum<V>> d<T> C(net.time4j.engine.q<V> qVar, int i4, int i5) {
            return B(qVar, false, i4, i5, b0.SHOW_NEVER, false);
        }

        public d<T> D(net.time4j.engine.q<Integer> qVar, Map<net.time4j.format.n, String> map) {
            if (map != null) {
                return E(qVar, map);
            }
            throw new NullPointerException(ProtectedSandApp.s("鏩\u0001"));
        }

        public d<T> F(String str, a0 a0Var) {
            if (a0Var == null) {
                throw new NullPointerException(ProtectedSandApp.s("鏮\u0001"));
            }
            Map<net.time4j.engine.q<?>, net.time4j.engine.q<?>> emptyMap = Collections.emptyMap();
            int length = str.length();
            Locale locale = this.f82870c;
            StringBuilder sb = new StringBuilder();
            if (!this.f82872e.isEmpty()) {
                locale = this.f82872e.getLast().h();
            }
            int i4 = 0;
            while (i4 < length) {
                char charAt = str.charAt(i4);
                if (i0(charAt)) {
                    v(sb);
                    int i5 = i4 + 1;
                    while (i5 < length && str.charAt(i5) == charAt) {
                        i5++;
                    }
                    Map<net.time4j.engine.q<?>, net.time4j.engine.q<?>> registerSymbol = a0Var.registerSymbol(this, locale, charAt, i5 - i4);
                    if (!registerSymbol.isEmpty()) {
                        if (emptyMap.isEmpty()) {
                            emptyMap = registerSymbol;
                        } else {
                            HashMap hashMap = new HashMap(emptyMap);
                            hashMap.putAll(registerSymbol);
                            emptyMap = hashMap;
                        }
                    }
                    i4 = i5 - 1;
                } else {
                    String s4 = ProtectedSandApp.s("鏪\u0001");
                    if (charAt == '\'') {
                        v(sb);
                        int i6 = i4 + 1;
                        int i7 = i6;
                        while (i7 < length) {
                            if (str.charAt(i7) == '\'') {
                                int i10 = i7 + 1;
                                if (i10 >= length || str.charAt(i10) != '\'') {
                                    break;
                                }
                                i7 = i10;
                            }
                            i7++;
                        }
                        if (i7 >= length) {
                            throw new IllegalArgumentException(ProtectedSandApp.s("鏬\u0001").concat(str));
                        }
                        if (i6 == i7) {
                            r('\'');
                        } else {
                            t(str.substring(i6, i7).replace(ProtectedSandApp.s("鏫\u0001"), s4));
                        }
                        i4 = i7;
                    } else if (charAt == '[') {
                        v(sb);
                        r0(null);
                    } else if (charAt == ']') {
                        v(sb);
                        a0();
                    } else if (charAt == '|') {
                        try {
                            v(sb);
                            j0();
                        } catch (IllegalStateException e4) {
                            throw new IllegalArgumentException(e4);
                        }
                    } else {
                        if (charAt == '#' || charAt == '{' || charAt == '}') {
                            throw new IllegalArgumentException(ProtectedSandApp.s("鏭\u0001") + charAt + s4);
                        }
                        sb.append(charAt);
                    }
                }
                i4++;
            }
            v(sb);
            if (!emptyMap.isEmpty()) {
                int size = this.f82871d.size();
                for (int i11 = 0; i11 < size; i11++) {
                    j jVar = this.f82871d.get(i11);
                    net.time4j.engine.q<?> element = jVar.d().getElement();
                    if (emptyMap.containsKey(element)) {
                        this.f82871d.set(i11, jVar.x(emptyMap.get(element)));
                    }
                }
            }
            if (this.f82876i != null) {
                str = "";
            }
            this.f82876i = str;
            return this;
        }

        public d<T> H() {
            G(new p(true));
            return this;
        }

        public d<T> I() {
            Z();
            G(new i0(true));
            return this;
        }

        public d<T> J(Set<net.time4j.tz.k> set) {
            Z();
            G(new i0(true, set));
            return this;
        }

        public <V extends Enum<V>> d<T> K(net.time4j.engine.q<V> qVar) {
            Y(qVar);
            if (qVar instanceof net.time4j.format.v) {
                G(e0.a((net.time4j.format.v) net.time4j.format.v.class.cast(qVar)));
            } else {
                HashMap hashMap = new HashMap();
                for (V v4 : qVar.getType().getEnumConstants()) {
                    hashMap.put(v4, v4.toString());
                }
                G(new q(qVar, hashMap));
            }
            return this;
        }

        public <V> d<T> L(net.time4j.engine.q<V> qVar, Map<V, String> map) {
            Y(qVar);
            G(new q(qVar, map));
            return this;
        }

        public d<T> M(net.time4j.format.v<?> vVar) {
            Y(vVar);
            G(e0.a(vVar));
            return this;
        }

        public d<T> N() {
            if (!g0(this.f82868a)) {
                throw new IllegalStateException(ProtectedSandApp.s("鏯\u0001"));
            }
            G(h0.INSTANCE);
            return this;
        }

        public d<T> O(net.time4j.tz.d dVar) {
            G(new g0(dVar));
            return this;
        }

        public d<T> P(net.time4j.tz.d dVar, Set<net.time4j.tz.k> set) {
            G(new g0(dVar, set));
            return this;
        }

        public d<T> Q() {
            return R(net.time4j.format.e.MEDIUM, true, Collections.singletonList(ProtectedSandApp.s("鏰\u0001")));
        }

        public d<T> R(net.time4j.format.e eVar, boolean z4, List<String> list) {
            G(new j0(eVar, z4, list));
            return this;
        }

        public d<T> S(net.time4j.engine.q<Integer> qVar) {
            Y(qVar);
            W(qVar);
            k0 k0Var = new k0(qVar);
            int i4 = this.f82874g;
            if (i4 == -1) {
                G(k0Var);
                this.f82874g = this.f82871d.size() - 1;
            } else {
                j jVar = this.f82871d.get(i4);
                u0(net.time4j.format.a.f82784f, net.time4j.format.g.STRICT);
                G(k0Var);
                a0();
                if (jVar.f() == ((j) androidx.appcompat.view.menu.d.a(this.f82871d, 1)).f()) {
                    this.f82874g = i4;
                    this.f82871d.set(i4, jVar.t(2));
                }
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        d<T> T(net.time4j.engine.q<Integer> qVar, int i4, boolean z4) {
            j jVar = this.f82871d.isEmpty() ? null : (j) androidx.appcompat.view.menu.d.a(this.f82871d, 1);
            return (jVar == null || jVar.i() || !jVar.j() || i4 != 4) ? B(qVar, false, i4, 10, b0.SHOW_WHEN_NEGATIVE, z4) : B(qVar, true, 4, 4, b0.SHOW_NEVER, z4);
        }

        public c<T> U() {
            return V(net.time4j.format.a.f());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c<T> V(net.time4j.format.a aVar) {
            boolean z4;
            if (aVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("鏲\u0001"));
            }
            int size = this.f82871d.size();
            HashMap hashMap = null;
            for (int i4 = 0; i4 < size; i4++) {
                j jVar = this.f82871d.get(i4);
                if (jVar.i()) {
                    int f4 = jVar.f();
                    int i5 = size - 1;
                    while (true) {
                        if (i5 <= i4) {
                            z4 = false;
                            break;
                        }
                        if (this.f82871d.get(i5).f() == f4) {
                            if (hashMap == null) {
                                hashMap = new HashMap();
                            }
                            hashMap.put(Integer.valueOf(i4), jVar.m(i5));
                            z4 = true;
                        } else {
                            i5--;
                        }
                    }
                    if (!z4) {
                        throw new IllegalStateException(ProtectedSandApp.s("鏱\u0001"));
                    }
                }
            }
            if (hashMap != null) {
                for (Integer num : hashMap.keySet()) {
                    this.f82871d.set(num.intValue(), hashMap.get(num));
                }
            }
            c<T> cVar = new c<>(this.f82868a, this.f82869b, this.f82870c, this.f82871d, this.f82878k, aVar, this.f82879l, null);
            String str = this.f82876i;
            if (str == null) {
                str = "";
            }
            if (this.f82877j == null && str.isEmpty()) {
                return cVar;
            }
            net.time4j.format.expert.b bVar = ((c) cVar).f82850c;
            if (!str.isEmpty()) {
                bVar = bVar.m(net.time4j.format.a.f82802x, str);
            }
            net.time4j.n nVar = this.f82877j;
            if (nVar != null) {
                bVar = bVar.m(f82867n, nVar);
            }
            return new c<>(cVar, bVar, (a) null);
        }

        public d<T> a0() {
            this.f82872e.removeLast();
            this.f82875h = 0;
            return this;
        }

        public <V extends net.time4j.engine.r<V>> d<T> d(net.time4j.engine.q<V> qVar, c<V> cVar) {
            return e(qVar, cVar, cVar);
        }

        public <V> d<T> e(net.time4j.engine.q<V> qVar, net.time4j.format.expert.e<V> eVar, net.time4j.format.expert.d<V> dVar) {
            Y(qVar);
            G(new net.time4j.format.expert.f(qVar, eVar, dVar));
            return this;
        }

        public net.time4j.engine.x<?> e0() {
            net.time4j.engine.x<?> xVar = this.f82869b;
            return xVar == null ? this.f82868a : xVar;
        }

        public d<T> f(Map<m0, String> map) {
            if (this.f82877j != null) {
                throw new IllegalStateException(ProtectedSandApp.s("鏳\u0001"));
            }
            net.time4j.n v4 = net.time4j.n.v(map);
            net.time4j.format.v<?> d02 = d0(false, v4);
            this.f82877j = v4;
            G(e0.b(d02));
            return this;
        }

        public d<T> g() {
            return M(d0(false, null));
        }

        public d<T> h() {
            return M(d0(true, null));
        }

        public d<T> i(net.time4j.engine.q<Integer> qVar) {
            return E(qVar, null);
        }

        public d<T> j(net.time4j.engine.q<BigDecimal> qVar) {
            return k(qVar, 11, 9);
        }

        public d<T> j0() {
            j jVar;
            int i4;
            int i5;
            int i6 = !this.f82872e.isEmpty() ? this.f82872e.getLast().i() : 0;
            if (this.f82871d.isEmpty()) {
                jVar = null;
                i4 = -1;
                i5 = -1;
            } else {
                i4 = this.f82871d.size() - 1;
                jVar = this.f82871d.get(i4);
                i5 = jVar.f();
            }
            if (i6 != i5) {
                throw new IllegalStateException(ProtectedSandApp.s("鏴\u0001"));
            }
            this.f82871d.set(i4, jVar.v());
            this.f82875h = 0;
            this.f82874g = -1;
            return this;
        }

        public d<T> k(net.time4j.engine.q<BigDecimal> qVar, int i4, int i5) {
            Y(qVar);
            b0();
            net.time4j.format.expert.g gVar = new net.time4j.format.expert.g(qVar, i4, i5);
            int i6 = this.f82874g;
            if (i6 != -1) {
                j jVar = this.f82871d.get(i6);
                G(gVar);
                if (jVar.f() == ((j) androidx.appcompat.view.menu.d.a(this.f82871d, 1)).f()) {
                    this.f82874g = i6;
                    this.f82871d.set(i6, jVar.t(i4 - i5));
                }
            } else {
                G(gVar);
            }
            return this;
        }

        public d<T> k0(int i4) {
            if (i4 < 0) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鏵\u0001"), i4));
            }
            if (i4 > 0) {
                this.f82875h = i4;
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d<T> l(net.time4j.engine.q<Integer> qVar, int i4) {
            return B(qVar, true, i4, i4, b0.SHOW_NEVER, false);
        }

        public d<T> l0(int i4) {
            if (i4 < 0) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鏵\u0001"), i4));
            }
            if (!this.f82871d.isEmpty() && i4 > 0) {
                int size = this.f82871d.size() - 1;
                j jVar = this.f82871d.get(size);
                if ((!this.f82872e.isEmpty() ? this.f82872e.getLast().i() : 0) == jVar.f() && !jVar.i()) {
                    this.f82871d.set(size, jVar.n(0, i4));
                }
            }
            return this;
        }

        public <V extends Enum<V>> d<T> m(net.time4j.engine.q<V> qVar, int i4) {
            return B(qVar, true, i4, i4, b0.SHOW_NEVER, false);
        }

        public d<T> n(net.time4j.engine.q<Integer> qVar, int i4, int i5, boolean z4) {
            Y(qVar);
            boolean z5 = !z4 && i4 == i5;
            c0(z5, z4);
            k kVar = new k(qVar, i4, i5, z4);
            int i6 = this.f82874g;
            if (i6 == -1 || !z5) {
                G(kVar);
            } else {
                j jVar = this.f82871d.get(i6);
                G(kVar);
                if (jVar.f() == ((j) androidx.appcompat.view.menu.d.a(this.f82871d, 1)).f()) {
                    this.f82874g = i6;
                    this.f82871d.set(i6, jVar.t(i4));
                }
            }
            return this;
        }

        public <V> d<T> n0(net.time4j.engine.q<V> qVar, V v4) {
            if (v4 == null) {
                throw new NullPointerException(ProtectedSandApp.s("鏶\u0001"));
            }
            Y(qVar);
            this.f82878k.put(qVar, v4);
            return this;
        }

        public d<T> o() {
            G(m.SINGLETON);
            return this;
        }

        public d<T> o0(int i4) {
            G(new c0(i4));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d<T> p(net.time4j.engine.q<Integer> qVar, int i4, int i5) {
            return B(qVar, false, i4, i5, b0.SHOW_NEVER, false);
        }

        public d<T> p0(net.time4j.engine.o<Character> oVar, int i4) {
            G(new c0(oVar, i4));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d<T> q(net.time4j.engine.q<Integer> qVar, int i4, int i5, b0 b0Var) {
            return B(qVar, false, i4, i5, b0Var, false);
        }

        public d<T> q0() {
            return r0(null);
        }

        public d<T> r(char c5) {
            return t(String.valueOf(c5));
        }

        public d<T> r0(net.time4j.engine.o<net.time4j.engine.p> oVar) {
            net.time4j.format.expert.b bVar;
            net.time4j.engine.o<net.time4j.engine.p> oVar2;
            this.f82875h = 0;
            a.b bVar2 = new a.b();
            if (this.f82872e.isEmpty()) {
                bVar = null;
                oVar2 = null;
            } else {
                bVar = this.f82872e.getLast();
                bVar2.g(bVar.e());
                oVar2 = bVar.f();
            }
            int f02 = f0(bVar) + 1;
            int i4 = this.f82873f + 1;
            this.f82873f = i4;
            this.f82872e.addLast(new net.time4j.format.expert.b(bVar2.a(), this.f82870c, f02, i4, oVar != null ? oVar2 == null ? oVar : new a(oVar2, oVar) : oVar2));
            return this;
        }

        public d<T> s(char c5, char c6) {
            G(new o(c5, c6));
            return this;
        }

        public d<T> s0(net.time4j.engine.c<Character> cVar, char c5) {
            net.time4j.format.expert.b l4;
            X(cVar);
            this.f82875h = 0;
            if (this.f82872e.isEmpty()) {
                l4 = new net.time4j.format.expert.b(new a.b().c(cVar, c5).a(), this.f82870c);
            } else {
                net.time4j.format.expert.b last = this.f82872e.getLast();
                a.b bVar = new a.b();
                bVar.g(last.e());
                bVar.c(cVar, c5);
                l4 = last.l(bVar.a());
            }
            this.f82872e.addLast(l4);
            return this;
        }

        public d<T> t(String str) {
            int i4;
            o oVar = new o(str);
            int b5 = oVar.b();
            if (b5 > 0) {
                j jVar = this.f82871d.isEmpty() ? null : (j) androidx.appcompat.view.menu.d.a(this.f82871d, 1);
                if (jVar != null && jVar.g() && !jVar.i()) {
                    throw new IllegalStateException(ProtectedSandApp.s("鏷\u0001"));
                }
            }
            if (b5 == 0 || (i4 = this.f82874g) == -1) {
                G(oVar);
            } else {
                j jVar2 = this.f82871d.get(i4);
                G(oVar);
                if (jVar2.f() == ((j) androidx.appcompat.view.menu.d.a(this.f82871d, 1)).f()) {
                    this.f82874g = i4;
                    this.f82871d.set(i4, jVar2.t(b5));
                }
            }
            return this;
        }

        public d<T> t0(net.time4j.engine.c<Integer> cVar, int i4) {
            net.time4j.format.expert.b l4;
            X(cVar);
            this.f82875h = 0;
            if (this.f82872e.isEmpty()) {
                l4 = new net.time4j.format.expert.b(new a.b().d(cVar, i4).a(), this.f82870c);
            } else {
                net.time4j.format.expert.b last = this.f82872e.getLast();
                a.b bVar = new a.b();
                bVar.g(last.e());
                bVar.d(cVar, i4);
                l4 = last.l(bVar.a());
            }
            this.f82872e.addLast(l4);
            return this;
        }

        public d<T> u(net.time4j.engine.c<Character> cVar) {
            G(new o(cVar));
            return this;
        }

        public <A extends Enum<A>> d<T> u0(net.time4j.engine.c<A> cVar, A a5) {
            net.time4j.format.expert.b l4;
            X(cVar);
            this.f82875h = 0;
            if (this.f82872e.isEmpty()) {
                l4 = new net.time4j.format.expert.b(new a.b().e(cVar, a5).a(), this.f82870c);
            } else {
                net.time4j.format.expert.b last = this.f82872e.getLast();
                a.b bVar = new a.b();
                bVar.g(last.e());
                bVar.e(cVar, a5);
                l4 = last.l(bVar.a());
            }
            this.f82872e.addLast(l4);
            return this;
        }

        public d<T> v0(net.time4j.engine.c<Boolean> cVar, boolean z4) {
            net.time4j.format.expert.b l4;
            X(cVar);
            this.f82875h = 0;
            if (this.f82872e.isEmpty()) {
                l4 = new net.time4j.format.expert.b(new a.b().f(cVar, z4).a(), this.f82870c);
            } else {
                net.time4j.format.expert.b last = this.f82872e.getLast();
                a.b bVar = new a.b();
                bVar.g(last.e());
                bVar.f(cVar, z4);
                l4 = last.l(bVar.a());
            }
            this.f82872e.addLast(l4);
            return this;
        }

        public d<T> w() {
            G(new p(false));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d<T> x(net.time4j.engine.q<Long> qVar, int i4, int i5, b0 b0Var) {
            return B(qVar, false, i4, i5, b0Var, false);
        }

        public d<T> y() {
            Z();
            G(new i0(false));
            return this;
        }

        public d<T> z(Set<net.time4j.tz.k> set) {
            Z();
            G(new i0(false, set));
            return this;
        }

        private d(net.time4j.engine.x<T> xVar, Locale locale) {
            this(xVar, locale, (net.time4j.engine.x<?>) null);
        }

        d(net.time4j.engine.x xVar, Locale locale, a aVar) {
            this(xVar, locale, (net.time4j.engine.x<?>) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private d(net.time4j.engine.x<T> xVar, Locale locale, net.time4j.engine.x<?> xVar2) {
            if (xVar == 0) {
                throw new NullPointerException(ProtectedSandApp.s("鏟\u0001"));
            }
            if (locale != null) {
                this.f82868a = xVar;
                this.f82869b = xVar2;
                this.f82870c = locale;
                this.f82871d = new ArrayList();
                this.f82872e = new LinkedList<>();
                this.f82873f = 0;
                this.f82874g = -1;
                this.f82875h = 0;
                this.f82876i = null;
                this.f82877j = null;
                this.f82878k = new HashMap();
                this.f82879l = xVar;
                this.f82880m = 0;
                return;
            }
            throw new NullPointerException(ProtectedSandApp.s("鏞\u0001"));
        }
    }

    /* compiled from: ChronoFormatter.java */
    private static class e<C> implements net.time4j.engine.u<net.time4j.u<C>> {

        /* renamed from: b, reason: collision with root package name */
        private final net.time4j.engine.x<C> f82884b;

        /* renamed from: c, reason: collision with root package name */
        private final List<net.time4j.engine.s> f82885c;

        private e(net.time4j.engine.x<C> xVar) {
            this.f82884b = xVar;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(xVar.E());
            arrayList.addAll(m0.y0().E());
            this.f82885c = Collections.unmodifiableList(arrayList);
        }

        static <C> e<C> i(net.time4j.engine.x<C> xVar) {
            if (xVar == null) {
                return null;
            }
            return new e<>(xVar);
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.g0 a() {
            return this.f82884b.a();
        }

        @Override // net.time4j.engine.u
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.u<C> o(net.time4j.base.e<?> eVar, net.time4j.engine.d dVar) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("鏸\u0001"));
        }

        @Override // net.time4j.engine.u
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.u<C> e(net.time4j.engine.r<?> rVar, net.time4j.engine.d dVar, boolean z4, boolean z5) {
            net.time4j.u h4;
            C e4 = this.f82884b.e(rVar, dVar, z4, z5);
            m0 e5 = m0.y0().e(rVar, dVar, z4, z5);
            if (e4 instanceof net.time4j.engine.m) {
                h4 = net.time4j.u.f((net.time4j.engine.m) net.time4j.engine.m.class.cast(e4), e5);
            } else {
                if (!(e4 instanceof net.time4j.engine.n)) {
                    throw new IllegalStateException(androidx.databinding.a.a(ProtectedSandApp.s("鏹\u0001"), e4));
                }
                h4 = net.time4j.u.h((net.time4j.engine.n) net.time4j.engine.n.class.cast(e4), e5);
            }
            return (net.time4j.u) c.o(h4);
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.x<?> d() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("鏸\u0001"));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                return this.f82884b.equals(((e) obj).f82884b);
            }
            return false;
        }

        public net.time4j.engine.x<?> f() {
            return this.f82884b;
        }

        @Override // net.time4j.engine.u
        public int g() {
            return this.f82884b.g();
        }

        public List<net.time4j.engine.s> h() {
            return this.f82885c;
        }

        public int hashCode() {
            return this.f82884b.hashCode();
        }

        @Override // net.time4j.engine.u
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p k(net.time4j.u<C> uVar, net.time4j.engine.d dVar) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("鏸\u0001"));
        }

        @Override // net.time4j.engine.u
        public String n(net.time4j.engine.z zVar, Locale locale) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("鏸\u0001"));
        }

        public String toString() {
            return this.f82884b.C().getName();
        }
    }

    /* compiled from: ChronoFormatter.java */
    private static class f<T> extends Format {

        /* renamed from: b, reason: collision with root package name */
        private static final Map<String, DateFormat.Field> f82886b;
        private final c<T> formatter;

        static {
            HashMap hashMap = new HashMap();
            DateFormat.Field field = DateFormat.Field.YEAR;
            hashMap.put(ProtectedSandApp.s("鏺\u0001"), field);
            hashMap.put(ProtectedSandApp.s("鏻\u0001"), field);
            hashMap.put(ProtectedSandApp.s("鏼\u0001"), field);
            DateFormat.Field field2 = DateFormat.Field.WEEK_OF_YEAR;
            hashMap.put(ProtectedSandApp.s("鏽\u0001"), field2);
            DateFormat.Field field3 = DateFormat.Field.WEEK_OF_MONTH;
            hashMap.put(ProtectedSandApp.s("鏾\u0001"), field3);
            hashMap.put(ProtectedSandApp.s("鏿\u0001"), field2);
            hashMap.put(ProtectedSandApp.s("鐀\u0001"), field3);
            DateFormat.Field field4 = DateFormat.Field.MONTH;
            hashMap.put(ProtectedSandApp.s("鐁\u0001"), field4);
            hashMap.put(ProtectedSandApp.s("鐂\u0001"), field4);
            hashMap.put(ProtectedSandApp.s("鐃\u0001"), field4);
            hashMap.put(ProtectedSandApp.s("鐄\u0001"), DateFormat.Field.DAY_OF_WEEK_IN_MONTH);
            hashMap.put(ProtectedSandApp.s("鐅\u0001"), DateFormat.Field.SECOND);
            hashMap.put(ProtectedSandApp.s("鐆\u0001"), DateFormat.Field.MINUTE);
            hashMap.put(ProtectedSandApp.s("鐇\u0001"), DateFormat.Field.MILLISECOND);
            hashMap.put(ProtectedSandApp.s("鐈\u0001"), DateFormat.Field.HOUR_OF_DAY0);
            hashMap.put(ProtectedSandApp.s("鐉\u0001"), DateFormat.Field.HOUR0);
            hashMap.put(ProtectedSandApp.s("鐊\u0001"), DateFormat.Field.HOUR_OF_DAY1);
            hashMap.put(ProtectedSandApp.s("鐋\u0001"), DateFormat.Field.HOUR1);
            hashMap.put(ProtectedSandApp.s("鐌\u0001"), DateFormat.Field.AM_PM);
            DateFormat.Field field5 = DateFormat.Field.DAY_OF_MONTH;
            hashMap.put(ProtectedSandApp.s("鐍\u0001"), field5);
            hashMap.put(ProtectedSandApp.s("鐎\u0001"), field5);
            DateFormat.Field field6 = DateFormat.Field.DAY_OF_WEEK;
            hashMap.put(ProtectedSandApp.s("鐏\u0001"), field6);
            hashMap.put(ProtectedSandApp.s("鐐\u0001"), field6);
            hashMap.put(ProtectedSandApp.s("鐑\u0001"), DateFormat.Field.DAY_OF_YEAR);
            hashMap.put(ProtectedSandApp.s("鐒\u0001"), DateFormat.Field.TIME_ZONE);
            hashMap.put(ProtectedSandApp.s("鐓\u0001"), DateFormat.Field.ERA);
            f82886b = Collections.unmodifiableMap(hashMap);
        }

        f(c<T> cVar) {
            this.formatter = cVar;
        }

        private static DateFormat.Field b(net.time4j.engine.q<?> qVar) {
            return f82886b.get(qVar.name());
        }

        @Override // java.text.Format
        public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
            String s4 = ProtectedSandApp.s("鐔\u0001");
            fieldPosition.setBeginIndex(0);
            fieldPosition.setEndIndex(0);
            try {
                net.time4j.format.expert.b bVar = ((c) this.formatter).f82850c;
                String str = (String) bVar.b(net.time4j.format.a.f82780b, s4);
                Set<h> d02 = this.formatter.d0(this.formatter.y().C().cast(obj), stringBuffer, bVar);
                if (str.equals(s4)) {
                    for (h hVar : d02) {
                        DateFormat.Field b5 = b(hVar.a());
                        if (b5 != null) {
                            if (!b5.equals(fieldPosition.getFieldAttribute())) {
                                if (b5.getCalendarField() == fieldPosition.getField() && fieldPosition.getField() != -1) {
                                }
                                if (b5.equals(DateFormat.Field.TIME_ZONE)) {
                                    if (fieldPosition.getField() == 17) {
                                    }
                                }
                                if (b5.equals(DateFormat.Field.HOUR_OF_DAY1)) {
                                    if (fieldPosition.getField() == 4) {
                                    }
                                }
                                if (b5.equals(DateFormat.Field.HOUR1) && fieldPosition.getField() == 15) {
                                }
                            }
                            fieldPosition.setBeginIndex(hVar.c());
                            fieldPosition.setEndIndex(hVar.b());
                            break;
                        }
                    }
                }
                return stringBuffer;
            } catch (IOException e4) {
                throw new IllegalArgumentException(androidx.databinding.a.a(ProtectedSandApp.s("鐕\u0001"), obj), e4);
            } catch (ClassCastException e5) {
                throw new IllegalArgumentException(androidx.databinding.a.a(ProtectedSandApp.s("鐖\u0001"), obj), e5);
            }
        }

        @Override // java.text.Format
        public AttributedCharacterIterator formatToCharacterIterator(Object obj) {
            net.time4j.format.expert.b bVar = ((c) this.formatter).f82850c;
            net.time4j.engine.c<String> cVar = net.time4j.format.a.f82780b;
            String s4 = ProtectedSandApp.s("鐔\u0001");
            if (!((String) bVar.b(cVar, s4)).equals(s4)) {
                return super.formatToCharacterIterator(obj);
            }
            try {
                StringBuilder sb = new StringBuilder();
                Set<h> e02 = this.formatter.e0(this.formatter.y().C().cast(obj), sb);
                AttributedString attributedString = new AttributedString(sb.toString());
                for (h hVar : e02) {
                    DateFormat.Field b5 = b(hVar.a());
                    if (b5 != null) {
                        attributedString.addAttribute(b5, b5, hVar.c(), hVar.b());
                    }
                }
                return attributedString.getIterator();
            } catch (ClassCastException e4) {
                throw new IllegalArgumentException(androidx.databinding.a.a(ProtectedSandApp.s("鐖\u0001"), obj), e4);
            }
        }

        @Override // java.text.Format
        public Object parseObject(String str, ParsePosition parsePosition) {
            w wVar = new w(parsePosition.getIndex());
            T X = this.formatter.X(str, wVar);
            if (X == null) {
                parsePosition.setErrorIndex(wVar.c());
            } else {
                parsePosition.setIndex(wVar.f());
            }
            return X;
        }
    }

    /* compiled from: ChronoFormatter.java */
    private static class g implements net.time4j.engine.p, q0, net.time4j.base.f {

        /* renamed from: b, reason: collision with root package name */
        private final net.time4j.u<?> f82887b;

        /* renamed from: c, reason: collision with root package name */
        private final String f82888c;

        /* renamed from: d, reason: collision with root package name */
        private final net.time4j.tz.k f82889d;

        /* synthetic */ g(net.time4j.u uVar, String str, net.time4j.tz.k kVar, a aVar) {
            this(uVar, str, kVar);
        }

        private net.time4j.base.f b() {
            net.time4j.engine.g0 g0Var;
            try {
                g0Var = net.time4j.engine.x.N(this.f82887b.m().getClass()).a();
            } catch (RuntimeException unused) {
                g0Var = net.time4j.engine.g0.f82720a;
            }
            return this.f82887b.b(net.time4j.tz.l.c0(this.f82889d), g0Var);
        }

        @Override // net.time4j.base.f
        public int a() {
            return b().a();
        }

        @Override // net.time4j.engine.p
        public boolean e() {
            return true;
        }

        @Override // net.time4j.engine.p
        public <V> V g(net.time4j.engine.q<V> qVar) {
            return (V) this.f82887b.g(qVar);
        }

        @Override // net.time4j.engine.q0
        public String getVariant() {
            return this.f82888c;
        }

        @Override // net.time4j.engine.p
        public <V> V i(net.time4j.engine.q<V> qVar) {
            return (V) this.f82887b.i(qVar);
        }

        @Override // net.time4j.base.f
        public long j() {
            return b().j();
        }

        @Override // net.time4j.engine.p
        public int l(net.time4j.engine.q<Integer> qVar) {
            return this.f82887b.l(qVar);
        }

        @Override // net.time4j.engine.p
        public <V> V r(net.time4j.engine.q<V> qVar) {
            return (V) this.f82887b.r(qVar);
        }

        @Override // net.time4j.engine.p
        public net.time4j.tz.k v() {
            return this.f82889d;
        }

        @Override // net.time4j.engine.p
        public boolean w(net.time4j.engine.q<?> qVar) {
            return this.f82887b.w(qVar);
        }

        private g(net.time4j.u<?> uVar, String str, net.time4j.tz.k kVar) {
            this.f82887b = uVar;
            this.f82888c = str;
            this.f82889d = kVar;
        }
    }

    /* synthetic */ c(net.time4j.engine.x xVar, net.time4j.engine.x xVar2, Locale locale, List list, Map map, net.time4j.format.a aVar, net.time4j.engine.x xVar3, a aVar2) {
        this(xVar, xVar2, locale, list, map, aVar, xVar3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int A(net.time4j.engine.x<?> xVar, net.time4j.engine.x<?> xVar2, net.time4j.engine.x<?> xVar3) {
        if (xVar3 != null) {
            return -1;
        }
        int i4 = 0;
        if (xVar.equals(xVar2)) {
            return 0;
        }
        do {
            xVar2 = xVar2.d();
            if (xVar2 == null) {
                return Integer.MAX_VALUE;
            }
            i4++;
        } while (!xVar.equals(xVar2));
        return i4;
    }

    private static String B(net.time4j.engine.r<?> rVar) {
        Set<net.time4j.engine.q<?>> A = rVar.A();
        StringBuilder sb = new StringBuilder(A.size() * 16);
        sb.append(ProtectedSandApp.s("鐠\u0001"));
        boolean z4 = true;
        for (net.time4j.engine.q<?> qVar : A) {
            if (z4) {
                z4 = false;
            } else {
                sb.append(ProtectedSandApp.s("鐡\u0001"));
            }
            sb.append(qVar.name());
            sb.append('=');
            sb.append(rVar.r(qVar));
        }
        sb.append(ProtectedSandApp.s("鐢\u0001"));
        return sb.toString();
    }

    private String E(String str) {
        return (String) this.f82850c.b(net.time4j.format.a.f82802x, str);
    }

    private static String F(net.time4j.engine.r<?> rVar) {
        p0 p0Var = p0.ERROR_MESSAGE;
        if (!rVar.w(p0Var)) {
            return ProtectedSandApp.s("鐤\u0001");
        }
        String str = ProtectedSandApp.s("鐣\u0001") + ((String) rVar.r(p0Var));
        rVar.M(p0Var, null);
        return str;
    }

    private boolean G() {
        boolean J = J();
        if (!J) {
            return J;
        }
        i<?> d5 = this.f82851d.get(0).d();
        if (d5 instanceof net.time4j.format.expert.f) {
            return ((net.time4j.format.expert.f) net.time4j.format.expert.f.class.cast(d5)).b();
        }
        if (d5 instanceof d0) {
            return J;
        }
        return false;
    }

    private boolean H() {
        return this.f82848a.d() == null && this.f82849b == null;
    }

    private static boolean I(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    private static boolean L(net.time4j.engine.x<?> xVar, net.time4j.engine.x<?> xVar2, net.time4j.engine.q<?> qVar) {
        Iterator<net.time4j.engine.s> it = xVar.E().iterator();
        while (it.hasNext()) {
            if (it.next().c(qVar)) {
                return true;
            }
        }
        if (xVar2 != null) {
            if (qVar.isDateElement()) {
                while (xVar2 instanceof net.time4j.engine.g) {
                    xVar2 = xVar2.d();
                }
                Iterator<net.time4j.engine.s> it2 = xVar2.E().iterator();
                while (it2.hasNext()) {
                    if (it2.next().c(qVar)) {
                        return true;
                    }
                }
                return false;
            }
            if (!qVar.isTimeElement() || !m0.y0().M(qVar)) {
                return false;
            }
            Iterator<net.time4j.engine.s> it3 = m0.y0().E().iterator();
            while (it3.hasNext()) {
                if (it3.next().c(qVar)) {
                    return true;
                }
            }
            return false;
        }
        while (true) {
            xVar = xVar.d();
            if (xVar == null) {
                return false;
            }
            Iterator<net.time4j.engine.s> it4 = xVar.E().iterator();
            while (it4.hasNext()) {
                if (it4.next().c(qVar)) {
                    return true;
                }
            }
        }
    }

    public static c<net.time4j.l0> M(String str, a0 a0Var, Locale locale) {
        d dVar = new d(net.time4j.l0.T0(), locale, (a) null);
        p(dVar, str, a0Var);
        try {
            return dVar.U();
        } catch (IllegalStateException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static c<net.time4j.l0> N(net.time4j.format.e eVar, Locale locale) {
        d dVar = new d(net.time4j.l0.T0(), locale, (a) null);
        dVar.G(new d0(eVar, eVar));
        return dVar.U();
    }

    public static c<net.time4j.d0> O(String str, a0 a0Var, Locale locale, net.time4j.tz.k kVar) {
        d dVar = new d(net.time4j.d0.r0(), locale, (a) null);
        p(dVar, str, a0Var);
        try {
            return dVar.U().a(kVar);
        } catch (IllegalStateException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static net.time4j.format.expert.d<net.time4j.d0> P(String str, a0 a0Var, Locale locale) {
        d dVar = new d(net.time4j.d0.r0(), locale, (a) null);
        p(dVar, str, a0Var);
        try {
            return dVar.U();
        } catch (IllegalStateException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static c<net.time4j.d0> Q(net.time4j.format.e eVar, net.time4j.format.e eVar2, Locale locale, net.time4j.tz.k kVar) {
        d dVar = new d(net.time4j.d0.r0(), locale, (a) null);
        dVar.G(new d0(eVar, eVar2));
        return dVar.U().a(kVar);
    }

    public static <T> c<T> R(String str, a0 a0Var, Locale locale, net.time4j.engine.x<T> xVar) {
        d dVar = new d(xVar, locale, (a) null);
        p(dVar, str, a0Var);
        try {
            return dVar.U();
        } catch (IllegalStateException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static <T extends net.time4j.format.h> c<T> S(net.time4j.engine.z zVar, Locale locale, net.time4j.engine.x<T> xVar) {
        if (net.time4j.format.h.class.isAssignableFrom(xVar.C())) {
            d dVar = new d(xVar, locale, (a) null);
            dVar.G(new d0(zVar, zVar));
            return dVar.U();
        }
        if (xVar.equals(net.time4j.d0.r0())) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("鐥\u0001"));
        }
        throw new UnsupportedOperationException(ProtectedSandApp.s("鐦\u0001") + xVar);
    }

    public static c<m0> T(String str, a0 a0Var, Locale locale) {
        d dVar = new d(m0.y0(), locale, (a) null);
        p(dVar, str, a0Var);
        try {
            return dVar.U();
        } catch (IllegalStateException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static c<m0> U(net.time4j.format.e eVar, Locale locale) {
        d dVar = new d(m0.y0(), locale, (a) null);
        dVar.G(new d0(eVar, eVar));
        return dVar.U();
    }

    public static c<n0> V(String str, a0 a0Var, Locale locale) {
        d dVar = new d(n0.h0(), locale, (a) null);
        p(dVar, str, a0Var);
        try {
            return dVar.U();
        } catch (IllegalStateException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static c<n0> W(net.time4j.format.e eVar, net.time4j.format.e eVar2, Locale locale) {
        d dVar = new d(n0.h0(), locale, (a) null);
        dVar.G(new d0(eVar, eVar2));
        return dVar.U();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static <T> T Y(net.time4j.format.expert.c<?> r15, net.time4j.engine.u<T> r16, java.util.List<net.time4j.engine.s> r17, java.lang.CharSequence r18, net.time4j.format.expert.w r19, net.time4j.engine.d r20, net.time4j.format.g r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.format.expert.c.Y(net.time4j.format.expert.c, net.time4j.engine.u, java.util.List, java.lang.CharSequence, net.time4j.format.expert.w, net.time4j.engine.d, net.time4j.format.g, boolean, boolean):java.lang.Object");
    }

    private static <C> C Z(c<?> cVar, net.time4j.engine.x<C> xVar, int i4, CharSequence charSequence, w wVar, net.time4j.engine.d dVar, net.time4j.format.g gVar, boolean z4) {
        net.time4j.engine.x<?> xVar2;
        C e4;
        String s4 = ProtectedSandApp.s("鐩\u0001");
        net.time4j.engine.x<?> d5 = xVar.d();
        if (d5 == null || xVar == (xVar2 = ((c) cVar).f82862o)) {
            return (C) Y(cVar, xVar, xVar.E(), charSequence, wVar, dVar, gVar, i4 > 0, z4);
        }
        Object Y = d5 == xVar2 ? Y(cVar, d5, d5.E(), charSequence, wVar, dVar, gVar, true, z4) : Z(cVar, d5, i4 + 1, charSequence, wVar, dVar, gVar, z4);
        if (wVar.i()) {
            return null;
        }
        if (Y == null) {
            net.time4j.engine.r<?> g4 = wVar.g();
            wVar.l(charSequence.length(), F(g4) + B(g4));
            return null;
        }
        net.time4j.engine.r<?> h4 = wVar.h();
        try {
            if (d5 instanceof net.time4j.engine.j0) {
                p0(h4, ((net.time4j.engine.j0) net.time4j.engine.j0.class.cast(d5)).q0(), Y);
                e4 = xVar.e(h4, dVar, gVar.isLax(), false);
            } else {
                if (!(xVar instanceof net.time4j.engine.g)) {
                    try {
                        throw new IllegalStateException(s4 + xVar);
                    } catch (RuntimeException e5) {
                        e = e5;
                        wVar.l(charSequence.length(), e.getMessage() + B(h4));
                        return null;
                    }
                }
                e4 = xVar.e((net.time4j.engine.r) net.time4j.engine.r.class.cast(Y), net.time4j.format.a.f(), false, false);
            }
            if (e4 != null) {
                return gVar.isStrict() ? (C) r(h4, e4, charSequence, wVar) : e4;
            }
            if (!wVar.i()) {
                wVar.l(charSequence.length(), F(h4) + B(h4));
            }
            return null;
        } catch (RuntimeException e6) {
            e = e6;
        }
    }

    private net.time4j.engine.r<?> a0(CharSequence charSequence, w wVar, net.time4j.engine.d dVar, boolean z4, int i4) {
        LinkedList linkedList;
        z zVar;
        int i5;
        z zVar2;
        int i6;
        net.time4j.engine.q<?> element;
        z zVar3 = new z(i4, this.f82859l);
        zVar3.m0(wVar.f());
        if (this.f82854g) {
            LinkedList linkedList2 = new LinkedList();
            linkedList2.push(zVar3);
            linkedList = linkedList2;
        } else {
            linkedList = null;
        }
        int size = this.f82851d.size();
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            j jVar = this.f82851d.get(i11);
            if (linkedList == null) {
                zVar2 = zVar3;
                zVar = zVar2;
                i5 = i7;
            } else {
                int b5 = jVar.b();
                int i12 = b5;
                while (i12 > i10) {
                    zVar3 = new z(i4 >>> 1, this.f82859l);
                    zVar3.m0(wVar.f());
                    linkedList.push(zVar3);
                    i12--;
                }
                while (i12 < i10) {
                    zVar3 = (z) linkedList.pop();
                    ((z) linkedList.peek()).g0(zVar3);
                    i12++;
                }
                zVar = zVar3;
                i5 = b5;
                zVar2 = (z) linkedList.peek();
            }
            wVar.b();
            jVar.q(charSequence, wVar, dVar, zVar2, z4);
            if (wVar.j() && (element = jVar.d().getElement()) != null && this.f82852e.containsKey(element)) {
                zVar2.R(element, this.f82852e.get(element));
                zVar2.M(p0.ERROR_MESSAGE, null);
                wVar.a();
                wVar.b();
            }
            if (wVar.i()) {
                int f4 = jVar.f();
                if (!jVar.i()) {
                    i6 = i11 + 1;
                    while (i6 < size) {
                        j jVar2 = this.f82851d.get(i6);
                        if (jVar2.i() && jVar2.f() == f4) {
                            break;
                        }
                        i6++;
                    }
                }
                i6 = i11;
                if (i6 > i11 || jVar.i()) {
                    if (linkedList != null) {
                        zVar = (z) linkedList.pop();
                    }
                    wVar.a();
                    wVar.m(zVar.b0());
                    zVar.k0();
                    if (linkedList != null) {
                        linkedList.push(zVar);
                    }
                    i11 = i6;
                } else {
                    if (i5 == 0) {
                        if (linkedList != null) {
                            zVar = (z) linkedList.peek();
                        }
                        zVar.l0();
                        return zVar;
                    }
                    int b6 = jVar.b();
                    int i13 = i6;
                    for (int i14 = i11 + 1; i14 < size && this.f82851d.get(i14).b() > b6; i14++) {
                        i13 = i14;
                    }
                    int i15 = size - 1;
                    while (true) {
                        if (i15 <= i13) {
                            break;
                        }
                        if (this.f82851d.get(i15).f() == f4) {
                            i13 = i15;
                            break;
                        }
                        i15--;
                    }
                    i5--;
                    zVar3 = (z) linkedList.pop();
                    wVar.a();
                    wVar.m(zVar3.b0());
                    i11 = i13;
                    i10 = i5;
                    i11++;
                    i7 = i10;
                }
            } else if (jVar.i()) {
                i11 = jVar.u();
            }
            zVar3 = zVar;
            i10 = i5;
            i11++;
            i7 = i10;
        }
        while (i7 > 0) {
            zVar3 = (z) linkedList.pop();
            ((z) linkedList.peek()).g0(zVar3);
            i7--;
        }
        if (linkedList != null) {
            zVar3 = (z) linkedList.peek();
        }
        zVar3.l0();
        return zVar3;
    }

    private static c<net.time4j.d0> g0() {
        d i02 = i0(net.time4j.d0.class, Locale.ENGLISH);
        h0(i02);
        i02.R(net.time4j.format.e.MEDIUM, false, Arrays.asList(ProtectedSandApp.s("鐬\u0001"), ProtectedSandApp.s("鐪\u0001"), ProtectedSandApp.s("鐫\u0001")));
        i02.j0();
        h0(i02);
        HashMap hashMap = new HashMap();
        net.time4j.tz.f fVar = net.time4j.tz.f.BEHIND_UTC;
        hashMap.put(ProtectedSandApp.s("鐭\u0001"), net.time4j.tz.p.m(fVar, 5));
        hashMap.put(ProtectedSandApp.s("鐮\u0001"), net.time4j.tz.p.n(fVar, 4, 0));
        hashMap.put(ProtectedSandApp.s("鐯\u0001"), net.time4j.tz.p.n(fVar, 6, 0));
        hashMap.put(ProtectedSandApp.s("鐰\u0001"), net.time4j.tz.p.n(fVar, 5, 0));
        hashMap.put(ProtectedSandApp.s("鐱\u0001"), net.time4j.tz.p.n(fVar, 7, 0));
        hashMap.put(ProtectedSandApp.s("鐲\u0001"), net.time4j.tz.p.n(fVar, 6, 0));
        hashMap.put(ProtectedSandApp.s("鐳\u0001"), net.time4j.tz.p.n(fVar, 8, 0));
        hashMap.put(ProtectedSandApp.s("鐴\u0001"), net.time4j.tz.p.n(fVar, 7, 0));
        i02.G(new net.time4j.format.expert.f(f0.TIMEZONE_OFFSET, new a(), new b(hashMap)));
        return i02.U().a(net.time4j.tz.p.f83649l);
    }

    private static void h0(d<net.time4j.d0> dVar) {
        d<net.time4j.d0> r02 = dVar.r0(null);
        net.time4j.engine.c<net.time4j.format.x> cVar = net.time4j.format.a.f82785g;
        net.time4j.format.x xVar = net.time4j.format.x.ABBREVIATED;
        r02.u0(cVar, xVar).K(net.time4j.l0.f83333x).a0().t(ProtectedSandApp.s("鐡\u0001")).a0().p(net.time4j.l0.f83332w, 1, 2).r(' ').u0(cVar, xVar).K(net.time4j.l0.f83330u).a0().r(' ').l(net.time4j.l0.f83327r, 4).r(' ').l(m0.f83374y, 2).r(':').l(m0.A, 2).r0(null).r(':').l(m0.C, 2).a0().r(' ');
    }

    public static <T extends net.time4j.engine.r<T>> d<T> i0(Class<T> cls, Locale locale) {
        if (cls == null) {
            throw new NullPointerException(ProtectedSandApp.s("鐶\u0001"));
        }
        net.time4j.engine.x N = net.time4j.engine.x.N(cls);
        if (N != null) {
            return new d<>(N, locale, (a) null);
        }
        throw new IllegalArgumentException(o1.a(ProtectedSandApp.s("鐵\u0001"), cls));
    }

    public static <T> d<T> j0(net.time4j.engine.x<T> xVar, Locale locale) {
        return new d<>(xVar, locale, (a) null);
    }

    public static <C extends net.time4j.engine.m<C>> d<net.time4j.d0> k0(Locale locale, net.time4j.engine.k<C> kVar) {
        if (kVar != null) {
            return new d<>(net.time4j.d0.r0(), locale, kVar, null);
        }
        throw new NullPointerException(ProtectedSandApp.s("鐷\u0001"));
    }

    public static <C extends net.time4j.engine.n<?, C>> d<net.time4j.d0> l0(Locale locale, net.time4j.engine.x<C> xVar) {
        if (xVar != null) {
            return new d<>(net.time4j.d0.r0(), locale, xVar, null);
        }
        throw new NullPointerException(ProtectedSandApp.s("鐷\u0001"));
    }

    private static <V> void m0(net.time4j.engine.r<?> rVar, net.time4j.engine.q<V> qVar, Object obj) {
        rVar.M(qVar, qVar.getType().cast(obj));
    }

    private static String n0(int i4, CharSequence charSequence) {
        int length = charSequence.length();
        if (length - i4 <= 10) {
            return charSequence.subSequence(i4, length).toString();
        }
        return charSequence.subSequence(i4, i4 + 10).toString() + ProtectedSandApp.s("鐸\u0001");
    }

    static Object o(Object obj) {
        return obj;
    }

    private static <T> void p(d<T> dVar, String str, a0 a0Var) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        int i4 = 0;
        while (i4 < length) {
            char charAt = str.charAt(i4);
            if (charAt == '\'') {
                int i5 = i4 + 1;
                boolean z4 = str.charAt(i5) == 'Z';
                while (i5 < length) {
                    if (str.charAt(i5) == '\'') {
                        int i6 = i5 + 1;
                        if (i6 >= length || str.charAt(i6) != '\'') {
                            if (z4 && i5 == i4 + 2 && d.g0(((d) dVar).f82868a)) {
                                throw new IllegalArgumentException(ProtectedSandApp.s("鐹\u0001").concat(str));
                            }
                            i4 = i5;
                        } else {
                            i5 = i6;
                        }
                    }
                    i5++;
                }
                i4 = i5;
            } else {
                sb.append(charAt);
            }
            i4++;
        }
        String sb2 = sb.toString();
        int i7 = C1294c.f82866a[a0Var.ordinal()];
        if (i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4) {
            if ((sb2.contains(ProtectedSandApp.s("鐺\u0001")) || sb2.contains(ProtectedSandApp.s("鐻\u0001"))) && !sb2.contains(ProtectedSandApp.s("鐼\u0001")) && !sb2.contains(ProtectedSandApp.s("鐽\u0001")) && !sb2.contains(ProtectedSandApp.s("鐾\u0001"))) {
                throw new IllegalArgumentException(ProtectedSandApp.s("鐿\u0001").concat(str));
            }
            boolean contains = sb2.contains(ProtectedSandApp.s("鑀\u0001"));
            String s4 = ProtectedSandApp.s("鑁\u0001");
            String s5 = ProtectedSandApp.s("鑂\u0001");
            if (contains && ((sb2.contains(s5) || sb2.contains(s4)) && !sb2.contains(ProtectedSandApp.s("鑃\u0001")))) {
                throw new IllegalArgumentException(ProtectedSandApp.s("鑄\u0001").concat(str));
            }
            if (sb2.contains(ProtectedSandApp.s("鑅\u0001")) && ((sb2.contains(s5) || sb2.contains(s4)) && !sb2.contains(ProtectedSandApp.s("鑆\u0001")))) {
                throw new IllegalArgumentException(ProtectedSandApp.s("鑇\u0001").concat(str));
            }
        }
        dVar.F(str, a0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void p0(net.time4j.engine.r<?> rVar, net.time4j.engine.q<T> qVar, Object obj) {
        rVar.M(qVar, qVar.getType().cast(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> T q(Object obj) {
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x011b, code lost:
    
        if (((net.time4j.m0) r9.r(r2)).u() == 24) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static <T> T r(net.time4j.engine.r<?> r9, T r10, java.lang.CharSequence r11, net.time4j.format.expert.w r12) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.format.expert.c.r(net.time4j.engine.r, java.lang.Object, java.lang.CharSequence, net.time4j.format.expert.w):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static net.time4j.engine.x<?> s(net.time4j.engine.x<?> xVar, net.time4j.engine.x<?> xVar2, net.time4j.engine.q<?> qVar) {
        if (xVar.M(qVar)) {
            return xVar;
        }
        if (xVar2 == null) {
            do {
                xVar = xVar.d();
                if (xVar != null) {
                }
            } while (!xVar.M(qVar));
            return xVar;
        }
        if (qVar.isDateElement() && xVar2.M(qVar)) {
            return xVar2;
        }
        if (qVar.isTimeElement() && m0.y0().M(qVar)) {
            return m0.y0();
        }
        throw new IllegalArgumentException(net.time4j.g0.a(qVar, new StringBuilder(ProtectedSandApp.s("鑓\u0001"))));
    }

    private net.time4j.engine.p t(T t4, net.time4j.engine.d dVar) {
        net.time4j.u d12;
        String s4 = ProtectedSandApp.s("鑔\u0001");
        e<?> eVar = this.f82849b;
        if (eVar == null) {
            return this.f82848a.k(t4, dVar);
        }
        try {
            Class<?> C = eVar.f().C();
            net.time4j.engine.g0 g0Var = (net.time4j.engine.g0) dVar.b(net.time4j.format.a.f82799u, this.f82849b.a());
            net.time4j.d0 d0Var = (net.time4j.d0) net.time4j.d0.class.cast(t4);
            net.time4j.tz.k kVar = (net.time4j.tz.k) dVar.a(net.time4j.format.a.f82782d);
            String str = "";
            if (net.time4j.engine.m.class.isAssignableFrom(C)) {
                net.time4j.engine.k kVar2 = (net.time4j.engine.k) this.f82849b.f();
                str = (String) dVar.a(net.time4j.format.a.f82798t);
                d12 = d0Var.c1(kVar2, str, kVar, g0Var);
            } else {
                if (!net.time4j.engine.n.class.isAssignableFrom(C)) {
                    throw new IllegalStateException(s4 + C);
                }
                d12 = d0Var.d1(this.f82849b.f(), kVar, g0Var);
            }
            return new g(d12, str, kVar, null);
        } catch (ClassCastException e4) {
            throw new IllegalArgumentException(androidx.databinding.a.a(ProtectedSandApp.s("鐵\u0001"), t4), e4);
        } catch (NoSuchElementException e5) {
            throw new IllegalArgumentException(e5.getMessage(), e5);
        }
    }

    private String v(net.time4j.engine.p pVar) {
        StringBuilder sb = new StringBuilder(this.f82851d.size() * 8);
        try {
            f0(pVar, sb, this.f82850c, false);
            return sb.toString();
        } catch (IOException e4) {
            throw new IllegalStateException(e4);
        }
    }

    private List<j> w(List<j> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<j> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().s(this));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public c<T> A0(net.time4j.tz.l lVar) {
        if (lVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("鑕\u0001"));
        }
        return new c<>(this, this.f82850c.l(new a.b().g(this.f82850c.e()).m(lVar.G()).a()).m(net.time4j.format.a.f82783e, lVar.O()), (net.time4j.history.d) null);
    }

    public c<T> B0() {
        return new c<>(this, new a.b().g(this.f82850c.e()).f(net.time4j.history.internal.a.f83204b, true).f(net.time4j.history.internal.a.f83205c, false).a());
    }

    public Locale C() {
        return this.f82850c.h();
    }

    public c<T> C0(String str) {
        return new c<>(this, new a.b().g(this.f82850c.e()).h(str).a());
    }

    public String D() {
        String str;
        if (J()) {
            i<?> d5 = this.f82851d.get(0).d();
            if (d5 instanceof d0) {
                str = ((d0) d0.class.cast(d5)).b();
                return E(str);
            }
        }
        str = "";
        return E(str);
    }

    public c<T> D0(q0 q0Var) {
        return C0(q0Var.getVariant());
    }

    public <V> c<T> E0(net.time4j.engine.q<V> qVar, V v4) {
        if (qVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("鑖\u0001"));
        }
        HashMap hashMap = new HashMap();
        hashMap.put(qVar, v4);
        return new c<>(this, hashMap);
    }

    public c<T> F0(net.time4j.l0 l0Var) {
        return z0(net.time4j.history.d.F(l0Var));
    }

    public c<T> G0() {
        return new c<>(this, new a.b().g(this.f82850c.e()).f(net.time4j.history.internal.a.f83204b, false).f(net.time4j.history.internal.a.f83205c, true).a());
    }

    public c<T> H0() {
        return A0(net.time4j.tz.l.e0());
    }

    @Override // net.time4j.format.t
    /* renamed from: I0, reason: merged with bridge method [inline-methods] */
    public c<T> c(String str) {
        return A0(net.time4j.tz.l.Z(str));
    }

    boolean J() {
        return this.f82863p == 1 && !this.f82854g;
    }

    @Override // net.time4j.format.t
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public c<T> a(net.time4j.tz.k kVar) {
        return A0(net.time4j.tz.l.c0(kVar));
    }

    boolean K() {
        return this.f82860m;
    }

    public T X(CharSequence charSequence, w wVar) {
        if (!this.f82861n) {
            return b(charSequence, wVar, this.f82850c);
        }
        net.time4j.engine.x<T> xVar = this.f82848a;
        return (T) Y(this, xVar, xVar.E(), charSequence, wVar, this.f82850c, this.f82858k, false, true);
    }

    @Override // net.time4j.format.expert.d
    public T b(CharSequence charSequence, w wVar, net.time4j.engine.d dVar) {
        net.time4j.format.g gVar;
        boolean z4;
        net.time4j.engine.d dVar2;
        net.time4j.tz.k kVar;
        T t4;
        net.time4j.format.g gVar2 = this.f82858k;
        net.time4j.format.expert.b bVar = this.f82850c;
        if (dVar != bVar) {
            r rVar = new r(dVar, bVar);
            dVar2 = rVar;
            gVar = (net.time4j.format.g) rVar.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART);
            z4 = false;
        } else {
            gVar = gVar2;
            z4 = true;
            dVar2 = dVar;
        }
        e<?> eVar = this.f82849b;
        if (eVar == null) {
            return (T) Z(this, this.f82848a, 0, charSequence, wVar, dVar2, gVar, z4);
        }
        List<net.time4j.engine.s> h4 = eVar.h();
        e<?> eVar2 = this.f82849b;
        net.time4j.u uVar = (net.time4j.u) Y(this, eVar2, h4, charSequence, wVar, dVar2, gVar, true, z4);
        if (wVar.i()) {
            return null;
        }
        net.time4j.engine.r<?> h5 = wVar.h();
        if (h5.e()) {
            kVar = h5.v();
        } else {
            net.time4j.engine.c<net.time4j.tz.k> cVar = net.time4j.format.a.f82782d;
            kVar = dVar2.c(cVar) ? (net.time4j.tz.k) dVar2.a(cVar) : null;
        }
        if (kVar != null) {
            net.time4j.engine.g0 g0Var = (net.time4j.engine.g0) dVar.b(net.time4j.format.a.f82799u, eVar2.a());
            net.time4j.engine.c0 c0Var = net.time4j.engine.c0.DAYLIGHT_SAVING;
            if (h5.w(c0Var)) {
                t4 = (T) uVar.b(net.time4j.tz.l.c0(kVar).h0(((net.time4j.tz.o) dVar2.b(net.time4j.format.a.f82783e, net.time4j.tz.l.f83557e)).a(((Boolean) h5.r(c0Var)).booleanValue() ? net.time4j.tz.g.EARLIER_OFFSET : net.time4j.tz.g.LATER_OFFSET)), g0Var);
            } else {
                net.time4j.engine.c<net.time4j.tz.o> cVar2 = net.time4j.format.a.f82783e;
                t4 = dVar2.c(cVar2) ? (T) uVar.b(net.time4j.tz.l.c0(kVar).h0((net.time4j.tz.o) dVar2.a(cVar2)), g0Var) : (T) uVar.b(net.time4j.tz.l.c0(kVar), g0Var);
            }
        } else {
            t4 = null;
        }
        if (t4 == null) {
            wVar.l(charSequence.length(), ProtectedSandApp.s("鑗\u0001"));
            return null;
        }
        h5.M(net.time4j.d0.r0().q0(), t4);
        if (gVar.isStrict()) {
            r(h5, t4, charSequence, wVar);
        }
        return t4;
    }

    public net.time4j.engine.r<?> b0(CharSequence charSequence, int i4) {
        if (i4 >= charSequence.length()) {
            return new z(0, false);
        }
        w wVar = new w(i4);
        net.time4j.engine.r<?> rVar = null;
        try {
            rVar = a0(charSequence, wVar, this.f82850c, true, this.f82857j);
            wVar.n(rVar);
        } catch (net.time4j.format.expert.a e4) {
            if (!wVar.i()) {
                wVar.l(wVar.f(), e4.getMessage());
            }
        }
        if (rVar == null || wVar.i()) {
            return new z(0, false);
        }
        for (net.time4j.engine.q<?> qVar : this.f82852e.keySet()) {
            if (!rVar.w(qVar)) {
                m0(rVar, qVar, this.f82852e.get(qVar));
            }
        }
        return rVar;
    }

    public net.time4j.engine.r<?> c0(String str) {
        return b0(str, 0);
    }

    @Override // net.time4j.format.t
    public String d(T t4) {
        return h(t4);
    }

    public Set<h> d0(T t4, Appendable appendable, net.time4j.engine.d dVar) throws IOException {
        return f0(t(t4, dVar), appendable, dVar, true);
    }

    public Set<h> e0(T t4, StringBuilder sb) {
        try {
            return f0(t(t4, this.f82850c), sb, this.f82850c, true);
        } catch (IOException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f82848a.equals(cVar.f82848a) && I(this.f82849b, cVar.f82849b) && this.f82850c.equals(cVar.f82850c) && this.f82852e.equals(cVar.f82852e) && this.f82851d.equals(cVar.f82851d);
    }

    @Override // net.time4j.format.t
    public T f(CharSequence charSequence) throws ParseException {
        w wVar = new w(0);
        T X = X(charSequence, wVar);
        if (X == null) {
            throw new ParseException(wVar.d(), wVar.c());
        }
        int f4 = wVar.f();
        if (this.f82860m || f4 >= charSequence.length()) {
            return X;
        }
        throw new ParseException(ProtectedSandApp.s("鑘\u0001") + n0(f4, charSequence), f4);
    }

    Set<h> f0(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar, boolean z4) throws IOException {
        LinkedList linkedList;
        int i4;
        LinkedList linkedList2;
        LinkedList linkedList3;
        int u4;
        int i5;
        if (appendable == null) {
            throw new NullPointerException(ProtectedSandApp.s("鑙\u0001"));
        }
        int size = this.f82851d.size();
        int i6 = 0;
        boolean z5 = dVar == this.f82850c;
        Set<h> linkedHashSet = z4 ? new LinkedHashSet<>(size) : null;
        boolean z6 = this.f82855h;
        String s4 = ProtectedSandApp.s("鐵\u0001");
        if (z6) {
            LinkedList linkedList4 = new LinkedList();
            linkedList4.push(new StringBuilder(size << 2));
            if (z4) {
                LinkedList linkedList5 = new LinkedList();
                linkedList5.push(linkedHashSet);
                linkedList = linkedList5;
            } else {
                linkedList = null;
            }
            int i7 = 0;
            while (i7 < size) {
                j jVar = this.f82851d.get(i7);
                int b5 = jVar.b();
                int i10 = b5;
                while (i10 > i6) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) linkedList4.peek());
                    linkedList4.push(sb);
                    if (z4) {
                        linkedHashSet = new LinkedHashSet<>();
                        linkedHashSet.addAll((Collection) linkedList.peek());
                        linkedList.push(linkedHashSet);
                    }
                    i10--;
                }
                while (i10 < i6) {
                    StringBuilder sb2 = (StringBuilder) linkedList4.pop();
                    linkedList4.pop();
                    linkedList4.push(sb2);
                    if (z4) {
                        linkedHashSet = (Set) linkedList.pop();
                        linkedList.pop();
                        linkedList.push(linkedHashSet);
                    }
                    i10++;
                }
                StringBuilder sb3 = (StringBuilder) linkedList4.peek();
                if (z4) {
                    linkedHashSet = (Set) linkedList.peek();
                }
                Set<h> set = linkedHashSet;
                int i11 = i7;
                LinkedList linkedList6 = linkedList;
                LinkedList linkedList7 = linkedList4;
                try {
                    i4 = jVar.r(pVar, sb3, dVar, set, z5);
                    e = null;
                } catch (IllegalArgumentException | ChronoException e4) {
                    e = e4;
                    i4 = -1;
                }
                if (i4 == -1) {
                    int f4 = jVar.f();
                    if (!jVar.i()) {
                        i5 = i11;
                        u4 = i5 + 1;
                        while (u4 < size) {
                            j jVar2 = this.f82851d.get(u4);
                            if (jVar2.i() && jVar2.f() == f4) {
                                break;
                            }
                            u4++;
                        }
                    } else {
                        i5 = i11;
                    }
                    u4 = i5;
                    if (u4 <= i5 && !jVar.i()) {
                        if (e == null) {
                            throw new IllegalArgumentException(s4 + pVar);
                        }
                        throw new IllegalArgumentException(s4 + pVar, e);
                    }
                    linkedList7.pop();
                    StringBuilder sb4 = new StringBuilder();
                    if (!linkedList7.isEmpty()) {
                        sb4.append((CharSequence) linkedList7.peek());
                    }
                    linkedList3 = linkedList7;
                    linkedList3.push(sb4);
                    if (z4) {
                        linkedList6.pop();
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                        if (!linkedList6.isEmpty()) {
                            linkedHashSet2.addAll((Collection) linkedList6.peek());
                        }
                        linkedList2 = linkedList6;
                        linkedList2.push(linkedHashSet2);
                    } else {
                        linkedList2 = linkedList6;
                    }
                } else {
                    linkedList2 = linkedList6;
                    linkedList3 = linkedList7;
                    u4 = jVar.i() ? jVar.u() : i11;
                }
                i7 = u4 + 1;
                linkedList4 = linkedList3;
                linkedList = linkedList2;
                linkedHashSet = set;
                i6 = b5;
            }
            LinkedList linkedList8 = linkedList;
            LinkedList linkedList9 = linkedList4;
            StringBuilder sb5 = (StringBuilder) linkedList9.peek();
            linkedList9.clear();
            appendable.append(sb5);
            if (z4) {
                linkedHashSet = (Set) linkedList8.peek();
                linkedList8.clear();
            }
        } else {
            int i12 = 0;
            while (i12 < size) {
                try {
                    j jVar3 = this.f82851d.get(i12);
                    jVar3.r(pVar, appendable, dVar, linkedHashSet, z5);
                    if (jVar3.i()) {
                        i12 = jVar3.u();
                    }
                    i12++;
                } catch (ChronoException e5) {
                    throw new IllegalArgumentException(s4 + pVar, e5);
                }
            }
        }
        if (z4) {
            return Collections.unmodifiableSet(linkedHashSet);
        }
        return null;
    }

    @Override // net.time4j.format.expert.e
    public <R> R g(T t4, Appendable appendable, net.time4j.engine.d dVar, net.time4j.engine.t<net.time4j.engine.p, R> tVar) throws IOException {
        net.time4j.engine.p t5 = t(t4, dVar);
        f0(t5, appendable, dVar, false);
        return tVar.apply(t5);
    }

    @Override // net.time4j.format.t
    public String h(T t4) {
        return v(t(t4, this.f82850c));
    }

    public int hashCode() {
        return (this.f82851d.hashCode() * 37) + (this.f82850c.hashCode() * 31) + (this.f82848a.hashCode() * 7);
    }

    @Override // net.time4j.format.t
    public net.time4j.engine.d i() {
        return this.f82850c;
    }

    @Override // net.time4j.format.t
    public T j(CharSequence charSequence, net.time4j.format.r rVar) throws ParseException {
        w wVar = new w(0);
        T X = X(charSequence, wVar);
        rVar.a(wVar.g());
        if (wVar.i()) {
            throw new ParseException(wVar.d(), wVar.c());
        }
        if (X != null) {
            return X;
        }
        throw new ParseException(ProtectedSandApp.s("鑚\u0001") + ((Object) charSequence) + ProtectedSandApp.s("鑛\u0001"), 0);
    }

    @Override // net.time4j.format.t
    public net.time4j.format.t k(net.time4j.format.g gVar) {
        return u0(net.time4j.format.a.f82784f, gVar);
    }

    public Format o0() {
        return new f(this);
    }

    @Override // net.time4j.format.t
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public c<T> e(Locale locale) {
        return locale.equals(this.f82850c.h()) ? this : new c<>(this, this.f82850c.n(locale), (net.time4j.history.d) null);
    }

    c<T> r0(Map<net.time4j.engine.q<?>, Object> map, net.time4j.format.expert.b bVar) {
        net.time4j.format.expert.b k4 = net.time4j.format.expert.b.k(bVar, this.f82850c);
        return new c<>(new c(this, map), k4, (net.time4j.history.d) k4.b(net.time4j.history.internal.a.f83203a, null));
    }

    public c<T> s0(net.time4j.engine.c<Character> cVar, char c5) {
        return new c<>(this, new a.b().g(this.f82850c.e()).c(cVar, c5).a());
    }

    public c<T> t0(net.time4j.engine.c<Integer> cVar, int i4) {
        return new c<>(this, new a.b().g(this.f82850c.e()).d(cVar, i4).a());
    }

    public String toString() {
        StringBuilder a5 = androidx.fragment.app.a.a(256, ProtectedSandApp.s("鑜\u0001"));
        a5.append(this.f82848a.C().getName());
        if (this.f82849b != null) {
            a5.append(ProtectedSandApp.s("鑝\u0001"));
            a5.append(this.f82849b);
        }
        a5.append(ProtectedSandApp.s("鑞\u0001"));
        a5.append(this.f82850c);
        a5.append(ProtectedSandApp.s("鑟\u0001"));
        a5.append(this.f82852e);
        a5.append(ProtectedSandApp.s("鑠\u0001"));
        boolean z4 = true;
        for (j jVar : this.f82851d) {
            if (z4) {
                a5.append('{');
                z4 = false;
            } else {
                a5.append('|');
            }
            a5.append(jVar);
        }
        a5.append(ProtectedSandApp.s("鐢\u0001"));
        return a5.toString();
    }

    public String u(net.time4j.u<?> uVar) {
        return v(uVar);
    }

    public <A extends Enum<A>> c<T> u0(net.time4j.engine.c<A> cVar, A a5) {
        return new c<>(this, new a.b().g(this.f82850c.e()).e(cVar, a5).a());
    }

    public c<T> v0(net.time4j.engine.c<Boolean> cVar, boolean z4) {
        return new c<>(this, new a.b().g(this.f82850c.e()).f(cVar, z4).a());
    }

    public c<T> w0(net.time4j.engine.g0 g0Var) {
        if (g0Var != null) {
            return new c<>(this, this.f82850c.m(net.time4j.format.a.f82799u, g0Var), (net.time4j.history.d) null);
        }
        throw new NullPointerException(ProtectedSandApp.s("鑡\u0001"));
    }

    net.time4j.format.expert.b x() {
        return this.f82850c;
    }

    public c<T> x0(net.time4j.format.a aVar) {
        return new c<>(this, new a.b().g(this.f82850c.e()).g(aVar).a());
    }

    public net.time4j.engine.x<T> y() {
        return this.f82848a;
    }

    public c<T> y0(net.time4j.format.g gVar) {
        return u0(net.time4j.format.a.f82784f, gVar);
    }

    Map<net.time4j.engine.q<?>, Object> z() {
        return this.f82852e;
    }

    public c<T> z0(net.time4j.history.d dVar) {
        if (dVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("鑢\u0001"));
        }
        return new c<>(this, this.f82850c.m(net.time4j.history.internal.a.f83203a, dVar).l(new a.b().g(this.f82850c.e()).h(dVar.getVariant()).a()), dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private c(net.time4j.engine.x<T> xVar, net.time4j.engine.x<?> xVar2, Locale locale, List<j> list, Map<net.time4j.engine.q<?>, Object> map, net.time4j.format.a aVar, net.time4j.engine.x<?> xVar3) {
        if (xVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("鐞\u0001"));
        }
        if (list.isEmpty()) {
            throw new IllegalStateException(ProtectedSandApp.s("鐝\u0001"));
        }
        this.f82848a = xVar;
        this.f82849b = e.i(xVar2);
        this.f82862o = xVar3;
        net.time4j.format.expert.b d5 = net.time4j.format.expert.b.d(xVar2 == 0 ? xVar : xVar2, aVar, locale);
        this.f82850c = d5;
        this.f82858k = (net.time4j.format.g) d5.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART);
        this.f82852e = Collections.unmodifiableMap(map);
        k kVar = null;
        boolean z4 = true;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i4 = 0;
        for (j jVar : list) {
            z6 = jVar.i() ? true : z6;
            if (kVar == null && (jVar.d() instanceof k)) {
                kVar = (k) k.class.cast(jVar.d());
            }
            if (!z5 && jVar.b() > 0) {
                z5 = true;
            }
            net.time4j.engine.q<?> element = jVar.d().getElement();
            if (element != null) {
                i4++;
                if (z4 && !z.c0(element)) {
                    z4 = false;
                }
                if (!z7) {
                    z7 = L(xVar, xVar2, element);
                }
            }
        }
        this.f82853f = kVar;
        this.f82854g = z5;
        this.f82855h = z6;
        this.f82856i = z7;
        this.f82857j = i4;
        this.f82859l = z4;
        this.f82860m = ((Boolean) this.f82850c.b(net.time4j.format.a.f82796r, Boolean.FALSE)).booleanValue();
        this.f82861n = H();
        this.f82863p = list.size();
        this.f82851d = w(list);
        this.f82864q = G();
    }

    private c(c<T> cVar, net.time4j.format.a aVar) {
        this(cVar, cVar.f82850c.l(aVar), (net.time4j.history.d) null);
    }

    private c(c<T> cVar, net.time4j.format.expert.b bVar) {
        this(cVar, bVar, (net.time4j.history.d) null);
    }

    c(c cVar, net.time4j.format.expert.b bVar, a aVar) {
        this(cVar, bVar, (net.time4j.history.d) null);
    }

    private c(c<T> cVar, net.time4j.format.expert.b bVar, net.time4j.history.d dVar) {
        net.time4j.engine.q<Integer> B;
        if (bVar != null) {
            this.f82848a = cVar.f82848a;
            this.f82849b = cVar.f82849b;
            this.f82862o = cVar.f82862o;
            this.f82850c = bVar;
            this.f82858k = (net.time4j.format.g) bVar.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART);
            this.f82852e = Collections.unmodifiableMap(new t(cVar.f82852e));
            this.f82853f = cVar.f82853f;
            this.f82854g = cVar.f82854g;
            this.f82855h = cVar.f82855h;
            this.f82856i = cVar.f82856i || dVar != null;
            this.f82857j = cVar.f82857j;
            int size = cVar.f82851d.size();
            ArrayList arrayList = new ArrayList(cVar.f82851d);
            boolean z4 = cVar.f82859l;
            for (int i4 = 0; i4 < size; i4++) {
                j jVar = (j) arrayList.get(i4);
                net.time4j.engine.q<?> element = jVar.d().getElement();
                net.time4j.engine.x<?> xVar = this.f82848a;
                while (xVar instanceof net.time4j.engine.g) {
                    xVar = xVar.d();
                }
                net.time4j.engine.x<?> d5 = xVar == net.time4j.d0.r0() ? xVar.d() : xVar;
                if (element != null && !d5.K(element)) {
                    Iterator<net.time4j.engine.s> it = d5.E().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        net.time4j.engine.s next = it.next();
                        if (next.b(cVar.f82850c.h(), cVar.f82850c).contains(element)) {
                            Iterator<net.time4j.engine.q<?>> it2 = next.b(bVar.h(), bVar).iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                net.time4j.engine.q<?> next2 = it2.next();
                                if (next2.name().equals(element.name())) {
                                    if (next2 != element) {
                                        arrayList.set(i4, jVar.x(next2));
                                        z4 = false;
                                    }
                                }
                            }
                        }
                    }
                }
                if (dVar != null) {
                    if (element == net.time4j.l0.f83327r) {
                        B = dVar.L();
                    } else if (element != net.time4j.l0.f83330u && element != net.time4j.l0.f83331v) {
                        if (element == net.time4j.l0.f83332w) {
                            B = dVar.g();
                        } else {
                            B = element == net.time4j.l0.f83334y ? dVar.h() : null;
                        }
                    } else {
                        B = dVar.B();
                    }
                    if (B != null) {
                        arrayList.set(i4, jVar.x(B));
                    }
                    z4 = false;
                }
            }
            this.f82859l = z4;
            this.f82860m = ((Boolean) this.f82850c.b(net.time4j.format.a.f82796r, Boolean.FALSE)).booleanValue();
            this.f82861n = H();
            this.f82863p = arrayList.size();
            this.f82851d = w(arrayList);
            this.f82864q = G();
            return;
        }
        throw new NullPointerException(ProtectedSandApp.s("鐟\u0001"));
    }

    private c(c<T> cVar, Map<net.time4j.engine.q<?>, Object> map) {
        e<?> eVar = cVar.f82849b;
        net.time4j.engine.x<?> f4 = eVar == null ? null : eVar.f();
        Iterator<net.time4j.engine.q<?>> it = map.keySet().iterator();
        while (it.hasNext()) {
            s(cVar.f82848a, f4, it.next());
        }
        this.f82848a = cVar.f82848a;
        this.f82849b = cVar.f82849b;
        this.f82862o = cVar.f82862o;
        this.f82850c = cVar.f82850c;
        this.f82858k = cVar.f82858k;
        this.f82853f = cVar.f82853f;
        this.f82854g = cVar.f82854g;
        this.f82855h = cVar.f82855h;
        this.f82856i = cVar.f82856i;
        this.f82857j = cVar.f82857j;
        this.f82860m = cVar.f82860m;
        HashMap hashMap = new HashMap(cVar.f82852e);
        boolean z4 = cVar.f82859l;
        for (net.time4j.engine.q<?> qVar : map.keySet()) {
            Object obj = map.get(qVar);
            if (obj == null) {
                hashMap.remove(qVar);
            } else {
                hashMap.put(qVar, obj);
                z4 = z4 && z.c0(qVar);
            }
        }
        this.f82852e = Collections.unmodifiableMap(hashMap);
        this.f82859l = z4;
        this.f82861n = H();
        this.f82863p = cVar.f82863p;
        this.f82851d = w(cVar.f82851d);
        this.f82864q = G();
    }
}
