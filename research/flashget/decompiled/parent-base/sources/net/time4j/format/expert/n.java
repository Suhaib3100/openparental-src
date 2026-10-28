package net.time4j.format.expert;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.text.ParseException;
import java.util.Collections;
import java.util.Locale;
import net.time4j.format.expert.c;
import net.time4j.i1;
import net.time4j.m0;
import net.time4j.n0;

/* compiled from: Iso8601Format.java */
/* loaded from: classes7.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private static final char f82980a;

    /* renamed from: b, reason: collision with root package name */
    private static final c f82981b;

    /* renamed from: c, reason: collision with root package name */
    private static final c f82982c;

    /* renamed from: d, reason: collision with root package name */
    private static final net.time4j.engine.o<net.time4j.engine.p> f82983d;

    /* renamed from: e, reason: collision with root package name */
    private static final net.time4j.engine.o<Character> f82984e;

    /* renamed from: f, reason: collision with root package name */
    public static final net.time4j.format.expert.c<net.time4j.l0> f82985f;

    /* renamed from: g, reason: collision with root package name */
    public static final net.time4j.format.expert.c<net.time4j.l0> f82986g;

    /* renamed from: h, reason: collision with root package name */
    public static final net.time4j.format.expert.c<net.time4j.l0> f82987h;

    /* renamed from: i, reason: collision with root package name */
    public static final net.time4j.format.expert.c<net.time4j.l0> f82988i;

    /* renamed from: j, reason: collision with root package name */
    public static final net.time4j.format.expert.c<net.time4j.l0> f82989j;

    /* renamed from: k, reason: collision with root package name */
    public static final net.time4j.format.expert.c<net.time4j.l0> f82990k;

    /* renamed from: l, reason: collision with root package name */
    public static final net.time4j.format.expert.c<net.time4j.l0> f82991l;

    /* renamed from: m, reason: collision with root package name */
    public static final net.time4j.format.expert.c<net.time4j.l0> f82992m;

    /* renamed from: n, reason: collision with root package name */
    public static final net.time4j.format.expert.c<m0> f82993n;

    /* renamed from: o, reason: collision with root package name */
    public static final net.time4j.format.expert.c<m0> f82994o;

    /* renamed from: p, reason: collision with root package name */
    public static final net.time4j.format.expert.c<n0> f82995p;

    /* renamed from: q, reason: collision with root package name */
    public static final net.time4j.format.expert.c<n0> f82996q;

    /* renamed from: r, reason: collision with root package name */
    public static final net.time4j.format.expert.c<net.time4j.d0> f82997r;

    /* renamed from: s, reason: collision with root package name */
    public static final net.time4j.format.expert.c<net.time4j.d0> f82998s;

    /* compiled from: Iso8601Format.java */
    static class a implements e<net.time4j.l0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f82999a;

        a(boolean z4) {
            this.f82999a = z4;
        }

        @Override // net.time4j.format.expert.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public <R> R g(net.time4j.l0 l0Var, Appendable appendable, net.time4j.engine.d dVar, net.time4j.engine.t<net.time4j.engine.p, R> tVar) throws IOException {
            (this.f82999a ? n.f82986g : n.f82985f).d0(l0Var, appendable, dVar);
            return null;
        }
    }

    /* compiled from: Iso8601Format.java */
    static class b implements net.time4j.format.expert.d<net.time4j.l0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f83000a;

        b(boolean z4) {
            this.f83000a = z4;
        }

        @Override // net.time4j.format.expert.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public net.time4j.l0 b(CharSequence charSequence, w wVar, net.time4j.engine.d dVar) {
            int length = charSequence.length();
            int f4 = wVar.f();
            int i4 = length - f4;
            int i5 = 0;
            for (int i6 = f4 + 1; i6 < length; i6++) {
                char charAt = charSequence.charAt(i6);
                if (charAt == '-') {
                    i5++;
                } else {
                    if (charAt == '/' || charAt == 'T') {
                        i4 = i6 - f4;
                        break;
                    }
                    if (charAt == 'W') {
                        return this.f83000a ? n.f82990k.X(charSequence, wVar) : n.f82989j.X(charSequence, wVar);
                    }
                }
            }
            if (this.f83000a) {
                return i5 == 1 ? n.f82988i.X(charSequence, wVar) : n.f82986g.X(charSequence, wVar);
            }
            int i7 = i4 - 4;
            char charAt2 = charSequence.charAt(f4);
            if (charAt2 == '+' || charAt2 == '-') {
                i7 = i4 - 6;
            }
            return i7 == 3 ? n.f82987h.X(charSequence, wVar) : n.f82985f.X(charSequence, wVar);
        }
    }

    /* compiled from: Iso8601Format.java */
    private static class c implements net.time4j.engine.o<net.time4j.engine.p> {

        /* renamed from: b, reason: collision with root package name */
        private final net.time4j.engine.q<Integer> f83001b;

        /* compiled from: Iso8601Format.java */
        class a implements net.time4j.engine.o<net.time4j.engine.p> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f83002b;

            a(c cVar) {
                this.f83002b = cVar;
            }

            @Override // net.time4j.engine.o
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean test(net.time4j.engine.p pVar) {
                return c.this.test(pVar) || this.f83002b.test(pVar);
            }
        }

        c(net.time4j.engine.q<Integer> qVar) {
            this.f83001b = qVar;
        }

        net.time4j.engine.o<net.time4j.engine.p> a(c cVar) {
            return new a(cVar);
        }

        @Override // net.time4j.engine.o
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean test(net.time4j.engine.p pVar) {
            return pVar.l(this.f83001b) > 0;
        }
    }

    /* compiled from: Iso8601Format.java */
    private static class d implements net.time4j.engine.o<Character> {
        private d() {
        }

        @Override // net.time4j.engine.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(Character ch) {
            return ch.charValue() == 'T';
        }

        d(a aVar) {
        }
    }

    static {
        f82980a = Boolean.getBoolean(ProtectedSandApp.s("锃\u0001")) ? '.' : ',';
        c cVar = new c(m0.C);
        f82981b = cVar;
        c cVar2 = new c(m0.G);
        f82982c = cVar2;
        f82983d = cVar.a(cVar2);
        f82984e = new d();
        f82985f = b(false);
        f82986g = b(true);
        f82987h = h(false);
        f82988i = h(true);
        f82989j = m(false);
        f82990k = m(true);
        f82991l = c(false);
        f82992m = c(true);
        f82993n = k(false);
        f82994o = k(true);
        f82995p = l(false);
        f82996q = l(true);
        f82997r = g(false);
        f82998s = g(true);
    }

    private n() {
    }

    private static <T extends net.time4j.engine.r<T>> void a(c.d<T> dVar, boolean z4) {
        dVar.u0(net.time4j.format.a.f82790l, net.time4j.format.j.ARABIC);
        dVar.s0(net.time4j.format.a.f82791m, '0');
        dVar.l(m0.f83375z, 2);
        dVar.r0(null);
        if (z4) {
            dVar.r(':');
        }
        dVar.l(m0.A, 2);
        dVar.r0(f82983d);
        if (z4) {
            dVar.r(':');
        }
        dVar.l(m0.C, 2);
        dVar.r0(f82982c);
        if (f82980a == ',') {
            dVar.s(',', '.');
        } else {
            dVar.s('.', ',');
        }
        dVar.n(m0.G, 0, 9, false);
        for (int i4 = 0; i4 < 5; i4++) {
            dVar.a0();
        }
    }

    private static net.time4j.format.expert.c<net.time4j.l0> b(boolean z4) {
        c.d q4 = net.time4j.format.expert.c.i0(net.time4j.l0.class, Locale.ROOT).u0(net.time4j.format.a.f82790l, net.time4j.format.j.ARABIC).s0(net.time4j.format.a.f82791m, '0').q(net.time4j.l0.f83327r, 4, 9, b0.SHOW_WHEN_BIG_NUMBER);
        if (z4) {
            q4.r('-');
        }
        q4.l(net.time4j.l0.f83331v, 2);
        if (z4) {
            q4.r('-');
        }
        net.time4j.format.expert.c U = q4.l(net.time4j.l0.f83332w, 2).a0().a0().U();
        net.time4j.format.g gVar = net.time4j.format.g.STRICT;
        U.getClass();
        return U.u0(net.time4j.format.a.f82784f, gVar);
    }

    private static net.time4j.format.expert.c<net.time4j.l0> c(boolean z4) {
        c.d i02 = net.time4j.format.expert.c.i0(net.time4j.l0.class, Locale.ROOT);
        i02.e(net.time4j.l0.f83326q, new a(z4), new b(z4));
        net.time4j.format.expert.c U = i02.U();
        net.time4j.format.g gVar = net.time4j.format.g.STRICT;
        U.getClass();
        return U.u0(net.time4j.format.a.f82784f, gVar);
    }

    private static net.time4j.format.expert.d<net.time4j.l0> d(boolean z4) {
        return new b(z4);
    }

    private static e<net.time4j.l0> e(boolean z4) {
        return new a(z4);
    }

    private static net.time4j.format.expert.c<net.time4j.d0> f(net.time4j.format.e eVar, boolean z4) {
        c.d i02 = net.time4j.format.expert.c.i0(net.time4j.d0.class, Locale.ROOT);
        i02.e(net.time4j.l0.f83326q, new a(z4), new b(z4));
        i02.r('T');
        a(i02, z4);
        i02.R(eVar, z4, Collections.singletonList(ProtectedSandApp.s("锄\u0001")));
        return i02.U();
    }

    private static net.time4j.format.expert.c<net.time4j.d0> g(boolean z4) {
        c.d i02 = net.time4j.format.expert.c.i0(net.time4j.d0.class, Locale.ROOT);
        i02.e(net.time4j.d0.r0().q0(), f(net.time4j.format.e.MEDIUM, z4), f(net.time4j.format.e.SHORT, z4));
        net.time4j.format.expert.c U = i02.U();
        net.time4j.format.g gVar = net.time4j.format.g.STRICT;
        U.getClass();
        return U.u0(net.time4j.format.a.f82784f, gVar).a(net.time4j.tz.p.f83649l);
    }

    private static net.time4j.format.expert.c<net.time4j.l0> h(boolean z4) {
        c.d q4 = net.time4j.format.expert.c.i0(net.time4j.l0.class, Locale.ROOT).u0(net.time4j.format.a.f82790l, net.time4j.format.j.ARABIC).s0(net.time4j.format.a.f82791m, '0').q(net.time4j.l0.f83327r, 4, 9, b0.SHOW_WHEN_BIG_NUMBER);
        if (z4) {
            q4.r('-');
        }
        net.time4j.format.expert.c U = q4.l(net.time4j.l0.f83334y, 3).a0().a0().U();
        net.time4j.format.g gVar = net.time4j.format.g.STRICT;
        U.getClass();
        return U.u0(net.time4j.format.a.f82784f, gVar);
    }

    public static net.time4j.l0 i(CharSequence charSequence) throws ParseException {
        w wVar = new w(0);
        net.time4j.l0 j4 = j(charSequence, wVar);
        if (j4 == null || wVar.i()) {
            throw new ParseException(wVar.d(), wVar.c());
        }
        if (wVar.f() >= charSequence.length()) {
            return j4;
        }
        throw new ParseException(ProtectedSandApp.s("锅\u0001") + ((Object) charSequence), wVar.f());
    }

    public static net.time4j.l0 j(CharSequence charSequence, w wVar) {
        int length = charSequence.length();
        int f4 = wVar.f();
        int i4 = length - f4;
        if (i4 < 7) {
            wVar.l(length, ProtectedSandApp.s("锆\u0001") + ((Object) charSequence.subSequence(f4, length)));
            return null;
        }
        int i5 = 0;
        for (int i6 = f4 + 1; i6 < length; i6++) {
            char charAt = charSequence.charAt(i6);
            if (charAt == '-') {
                i5++;
            } else {
                if (charAt == '/' || charAt == 'T') {
                    i4 = i6 - f4;
                    break;
                }
                if (charAt == 'W') {
                    return (i5 > 0 ? f82990k : f82989j).X(charSequence, wVar);
                }
            }
        }
        if (i5 != 0) {
            return i5 == 1 ? f82988i.X(charSequence, wVar) : f82986g.X(charSequence, wVar);
        }
        int i7 = i4 - 4;
        char charAt2 = charSequence.charAt(f4);
        if (charAt2 == '+' || charAt2 == '-') {
            i7 = i4 - 6;
        }
        return (i7 == 3 ? f82987h : f82985f).X(charSequence, wVar);
    }

    private static net.time4j.format.expert.c<m0> k(boolean z4) {
        c.d i02 = net.time4j.format.expert.c.i0(m0.class, Locale.ROOT);
        i02.p0(f82984e, 1);
        a(i02, z4);
        net.time4j.format.expert.c U = i02.U();
        net.time4j.format.g gVar = net.time4j.format.g.STRICT;
        U.getClass();
        return U.u0(net.time4j.format.a.f82784f, gVar);
    }

    private static net.time4j.format.expert.c<n0> l(boolean z4) {
        c.d i02 = net.time4j.format.expert.c.i0(n0.class, Locale.ROOT);
        i02.e(net.time4j.l0.f83326q, new a(z4), new b(z4));
        i02.r('T');
        a(i02, z4);
        net.time4j.format.expert.c U = i02.U();
        net.time4j.format.g gVar = net.time4j.format.g.STRICT;
        U.getClass();
        return U.u0(net.time4j.format.a.f82784f, gVar);
    }

    private static net.time4j.format.expert.c<net.time4j.l0> m(boolean z4) {
        c.d q4 = net.time4j.format.expert.c.i0(net.time4j.l0.class, Locale.ROOT).u0(net.time4j.format.a.f82790l, net.time4j.format.j.ARABIC).s0(net.time4j.format.a.f82791m, '0').q(net.time4j.l0.f83328s, 4, 9, b0.SHOW_WHEN_BIG_NUMBER);
        if (z4) {
            q4.r('-');
        }
        q4.r('W');
        q4.l(i1.f83248r.p(), 2);
        if (z4) {
            q4.r('-');
        }
        net.time4j.format.expert.c U = q4.m(net.time4j.l0.f83333x, 1).a0().a0().U();
        net.time4j.format.g gVar = net.time4j.format.g.STRICT;
        U.getClass();
        return U.u0(net.time4j.format.a.f82784f, gVar);
    }
}
