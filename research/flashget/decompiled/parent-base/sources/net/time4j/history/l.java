package net.time4j.history;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.text.ParsePosition;
import java.util.List;
import java.util.Locale;
import net.time4j.e0;
import net.time4j.engine.ChronoException;
import net.time4j.engine.a0;
import net.time4j.engine.q;
import net.time4j.engine.r;
import net.time4j.format.u;
import net.time4j.format.x;
import net.time4j.l0;

/* compiled from: HistoricIntegerElement.java */
/* loaded from: classes7.dex */
final class l extends net.time4j.history.internal.c implements pe.a {

    /* renamed from: h, reason: collision with root package name */
    static final int f83214h = 2;

    /* renamed from: i, reason: collision with root package name */
    static final int f83215i = 3;

    /* renamed from: j, reason: collision with root package name */
    static final int f83216j = 4;

    /* renamed from: k, reason: collision with root package name */
    static final int f83217k = 5;

    /* renamed from: l, reason: collision with root package name */
    static final int f83218l = 6;

    /* renamed from: m, reason: collision with root package name */
    static final int f83219m = 7;

    /* renamed from: n, reason: collision with root package name */
    static final int f83220n = 8;
    private static final long serialVersionUID = -6283098762945747308L;

    /* renamed from: g, reason: collision with root package name */
    private final transient int f83221g;
    private final d history;

    /* compiled from: HistoricIntegerElement.java */
    private static class a<C extends r<C>> implements a0<C, Integer> {

        /* renamed from: b, reason: collision with root package name */
        private final int f83222b;

        /* renamed from: c, reason: collision with root package name */
        private final d f83223c;

        a(int i4, d dVar) {
            this.f83222b = i4;
            this.f83223c = dVar;
        }

        private h b(C c5, int i4) {
            h e4 = this.f83223c.e((l0) c5.r(l0.f83326q));
            p pVar = p.DUAL_DATING;
            o v4 = this.f83223c.v();
            int i5 = this.f83222b;
            switch (i5) {
                case 2:
                    break;
                case 3:
                    return this.f83223c.a(h.g(e4.c(), e4.e(), i4, e4.b()));
                case 4:
                    return h.g(e4.c(), e4.e(), e4.d(), i4);
                case 5:
                    o v5 = this.f83223c.v();
                    e4.getClass();
                    int c6 = v5.c(e4);
                    h m4 = this.f83223c.m(e4.c(), c6);
                    int u4 = this.f83223c.u(e4.c(), c6);
                    if (i4 == 1) {
                        return m4;
                    }
                    if (i4 <= 1 || i4 > u4) {
                        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("障\u0001"), i4));
                    }
                    return this.f83223c.e(this.f83223c.d(m4).h0(net.time4j.engine.i.i(i4 - 1)));
                case 6:
                case 7:
                    pVar = i5 == 6 ? p.AFTER_NEW_YEAR : p.BEFORE_NEW_YEAR;
                    break;
                case 8:
                    int e5 = e4.e() % 100;
                    return this.f83223c.a(h.h(e4.c(), ((i4 - 1) * 100) + (e5 != 0 ? e5 : 100), e4.d(), e4.b(), pVar, v4));
                default:
                    throw new UnsupportedOperationException(ProtectedSandApp.s("際\u0001") + this.f83222b);
            }
            return this.f83223c.a(h.h(e4.c(), i4, e4.d(), e4.b(), pVar, v4));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtCeiling(C c5) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("隝\u0001"));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtFloor(C c5) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("隝\u0001"));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(C c5) {
            h b5;
            int i4;
            String s4 = ProtectedSandApp.s("際\u0001");
            try {
                h e4 = this.f83223c.e((l0) c5.r(l0.f83326q));
                int i5 = 8;
                int i6 = 999984973;
                switch (this.f83222b) {
                    case 2:
                    case 6:
                    case 7:
                    case 8:
                        d dVar = this.f83223c;
                        if (dVar != d.f83161t) {
                            if (dVar == d.f83160s) {
                                i6 = e4.c() == j.BC ? 999979466 : 999979465;
                            } else if (dVar == d.f83159r) {
                                i6 = e4.c() == j.BC ? 1000000000 : 999999999;
                            } else {
                                i6 = e4.c() == j.BC ? 45 : org.threeten.bp.chrono.m.f87989n;
                            }
                        }
                        if (this.f83222b == 8) {
                            i6 = ((i6 - 1) / 100) + 1;
                        }
                        return Integer.valueOf(i6);
                    case 3:
                        if (e4.c() != j.BYZANTINE || e4.e() != 999984973) {
                            i5 = 12;
                        }
                        b5 = b(c5, i5);
                        i4 = i5;
                        break;
                    case 4:
                        i4 = this.f83223c.k(e4).getMaximumDayOfMonth(e4);
                        b5 = b(c5, i4);
                        break;
                    case 5:
                        o v4 = this.f83223c.v();
                        e4.getClass();
                        int u4 = this.f83223c.u(e4.c(), v4.c(e4));
                        if (u4 != -1) {
                            return Integer.valueOf(u4);
                        }
                        throw new ChronoException(ProtectedSandApp.s("隞\u0001"));
                    default:
                        throw new UnsupportedOperationException(s4 + this.f83222b);
                }
                if (this.f83223c.A(b5)) {
                    return Integer.valueOf(i4);
                }
                List<f> p4 = this.f83223c.p();
                int size = p4.size() - 1;
                while (true) {
                    if (size >= 0) {
                        f fVar = p4.get(size);
                        if (e4.compareTo(fVar.f83188c) < 0) {
                            b5 = fVar.f83189d;
                        } else {
                            size--;
                        }
                    }
                }
                return Integer.valueOf(this.f83222b == 3 ? b5.d() : b5.b());
            } catch (RuntimeException e5) {
                throw new ChronoException(e5.getMessage(), (Throwable) e5);
            }
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(C c5) {
            try {
                h e4 = this.f83223c.e((l0) c5.r(l0.f83326q));
                int i4 = this.f83222b;
                if (i4 != 2 && i4 != 6 && i4 != 7 && i4 != 8) {
                    h b5 = b(c5, 1);
                    if (this.f83223c.A(b5)) {
                        return 1;
                    }
                    if (this.f83222b == 5) {
                        throw new ChronoException(ProtectedSandApp.s("隟\u0001"));
                    }
                    List<f> p4 = this.f83223c.p();
                    int size = p4.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        f fVar = p4.get(size);
                        if (e4.compareTo(fVar.f83188c) >= 0) {
                            b5 = fVar.f83188c;
                            break;
                        }
                        size--;
                    }
                    return Integer.valueOf(this.f83222b == 3 ? b5.d() : b5.b());
                }
                return (e4.c() != j.BYZANTINE || e4.d() < 9) ? 1 : 0;
            } catch (IllegalArgumentException e5) {
                throw new ChronoException(e5.getMessage(), (Throwable) e5);
            }
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Integer getValue(C c5) {
            int e4;
            String s4 = ProtectedSandApp.s("際\u0001");
            try {
                l0 l0Var = (l0) c5.r(l0.f83326q);
                h e5 = this.f83223c.e(l0Var);
                switch (this.f83222b) {
                    case 2:
                        e4 = e5.e();
                        break;
                    case 3:
                        e4 = e5.d();
                        break;
                    case 4:
                        e4 = e5.b();
                        break;
                    case 5:
                        long b5 = l0Var.b();
                        o v4 = this.f83223c.v();
                        e5.getClass();
                        e4 = (int) ((b5 - this.f83223c.d(this.f83223c.m(e5.c(), v4.c(e5))).b()) + 1);
                        break;
                    case 6:
                    case 7:
                        o v5 = this.f83223c.v();
                        e5.getClass();
                        e4 = v5.c(e5);
                        break;
                    case 8:
                        e4 = ((e5.e() - 1) / 100) + 1;
                        break;
                    default:
                        throw new UnsupportedOperationException(s4 + this.f83222b);
                }
                return Integer.valueOf(e4);
            } catch (IllegalArgumentException e6) {
                throw new ChronoException(e6.getMessage(), (Throwable) e6);
            }
        }

        @Override // net.time4j.engine.a0
        public boolean j(C c5, Integer num) {
            if (num == null) {
                return false;
            }
            try {
                return this.f83223c.A(b(c5, num.intValue()));
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        @Override // net.time4j.engine.a0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public C withValue(C c5, Integer num, boolean z4) {
            if (num == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("隠\u0001"));
            }
            return (C) c5.M(l0.f83326q, this.f83223c.d(b(c5, num.intValue())));
        }
    }

    l(char c5, int i4, int i5, d dVar, int i6) {
        super(J(i6), c5, i4, i5);
        this.history = dVar;
        this.f83221g = i6;
    }

    private void B(String str, int i4) {
        if (str.length() <= i4) {
            return;
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("隡\u0001"));
        sb.append(name());
        sb.append(ProtectedSandApp.s("隢\u0001"));
        sb.append(str);
        sb.append(ProtectedSandApp.s("隣\u0001"));
        throw new IllegalArgumentException(android.support.v4.media.b.a(sb, i4, ProtectedSandApp.s("隤\u0001")));
    }

    private String C(net.time4j.format.j jVar, char c5, int i4, int i5, int i6) {
        StringBuilder sb = new StringBuilder();
        sb.append(jVar.toNumeral(i4));
        sb.append('/');
        if (jVar.isDecimal() && i5 >= 100 && net.time4j.base.c.a(i4, 100) == net.time4j.base.c.a(i5, 100)) {
            int c6 = net.time4j.base.c.c(i5, 100);
            if (c6 < 10) {
                sb.append(c5);
            }
            sb.append(jVar.toNumeral(c6));
        } else {
            sb.append(jVar.toNumeral(i5));
        }
        return jVar.isDecimal() ? F(sb.toString(), i6, c5) : sb.toString();
    }

    private int D(int i4, int i5, int i6) {
        if (i5 < 0) {
            return Integer.MAX_VALUE;
        }
        if (i5 >= 100 || i4 < 100) {
            return Integer.MAX_VALUE;
        }
        int i7 = i5 < 10 ? 10 : 100;
        if (Math.abs(i5 - net.time4j.base.c.c(i4, i7)) <= i6) {
            return (net.time4j.base.c.a(i4, i7) * i7) + i5;
        }
        return Integer.MAX_VALUE;
    }

    private u E(net.time4j.engine.d dVar, net.time4j.format.m mVar) {
        return net.time4j.format.b.f((Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT)).n((x) dVar.b(net.time4j.format.a.f82785g, x.WIDE), mVar);
    }

    private static String F(String str, int i4, char c5) {
        int length = str.length();
        if (i4 <= length) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int i5 = i4 - length;
        for (int i6 = 0; i6 < i5; i6++) {
            sb.append(c5);
        }
        sb.append(str);
        return sb.toString();
    }

    private static int I(net.time4j.format.j jVar, char c5, CharSequence charSequence, int i4, ParsePosition parsePosition, net.time4j.format.g gVar) {
        int i5;
        boolean z4;
        int charAt;
        int i6 = 0;
        long j4 = 0;
        if (jVar.isDecimal()) {
            if (jVar == net.time4j.format.j.ARABIC && charSequence.charAt(i4) == '-') {
                i5 = i4 + 1;
                z4 = true;
            } else {
                i5 = i4;
                z4 = false;
            }
            char charAt2 = gVar.isStrict() ? (char) 0 : jVar.getDigits().charAt(0);
            int min = Math.min(i5 + 9, charSequence.length());
            int i7 = i5;
            while (i5 < min) {
                int charAt3 = charSequence.charAt(i5) - c5;
                if (charAt3 >= 0 && charAt3 <= 9) {
                    j4 = (j4 * 10) + charAt3;
                    i7++;
                } else {
                    if (charAt2 == 0 || c5 == charAt2 || (charAt = charSequence.charAt(i5) - charAt2) < 0 || charAt > 9) {
                        break;
                    }
                    j4 = (j4 * 10) + charAt;
                    i7++;
                    c5 = charAt2;
                }
                i5++;
            }
            if (j4 > 2147483647L) {
                parsePosition.setErrorIndex(i4);
                return Integer.MIN_VALUE;
            }
            if (z4) {
                if (i7 != i4 + 1) {
                    j4 = net.time4j.base.c.k(j4);
                }
            }
            i4 = i7;
        } else {
            int length = charSequence.length();
            for (int i10 = i4; i10 < length && jVar.contains(charSequence.charAt(i10)); i10++) {
                i6++;
            }
            if (i6 > 0) {
                int i11 = i6 + i4;
                j4 = jVar.toInteger(charSequence.subSequence(i4, i11).toString(), gVar);
                i4 = i11;
            }
        }
        parsePosition.setIndex(i4);
        return (int) j4;
    }

    private static String J(int i4) {
        switch (i4) {
            case 2:
                return ProtectedSandApp.s("隬\u0001");
            case 3:
                return ProtectedSandApp.s("隫\u0001");
            case 4:
                return ProtectedSandApp.s("險\u0001");
            case 5:
                return ProtectedSandApp.s("隩\u0001");
            case 6:
                return ProtectedSandApp.s("隨\u0001");
            case 7:
                return ProtectedSandApp.s("隧\u0001");
            case 8:
                return ProtectedSandApp.s("隦\u0001");
            default:
                throw new UnsupportedOperationException(android.support.v4.media.a.a(ProtectedSandApp.s("隥\u0001"), i4));
        }
    }

    private Object readResolve() throws ObjectStreamException {
        String name = name();
        if (name.equals(ProtectedSandApp.s("隬\u0001"))) {
            return this.history.L();
        }
        if (name.equals(ProtectedSandApp.s("隫\u0001"))) {
            return this.history.B();
        }
        if (name.equals(ProtectedSandApp.s("險\u0001"))) {
            return this.history.g();
        }
        if (name.equals(ProtectedSandApp.s("隩\u0001"))) {
            return this.history.h();
        }
        if (name.equals(ProtectedSandApp.s("隨\u0001"))) {
            return this.history.K(p.AFTER_NEW_YEAR);
        }
        if (name.equals(ProtectedSandApp.s("隧\u0001"))) {
            return this.history.K(p.BEFORE_NEW_YEAR);
        }
        if (name.equals(ProtectedSandApp.s("隦\u0001"))) {
            return this.history.b();
        }
        throw new InvalidObjectException(ProtectedSandApp.s("隭\u0001").concat(name));
    }

    public Integer H(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
        return x(charSequence, parsePosition, dVar, null);
    }

    @Override // pe.a
    public void T(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar, net.time4j.format.j jVar, char c5, int i4, int i5) throws IOException {
        int c6;
        if (this.f83221g == 5) {
            appendable.append(String.valueOf(pVar.r(this.history.h())));
            return;
        }
        h e4 = pVar instanceof net.time4j.base.a ? this.history.e(l0.Y0((net.time4j.base.a) pVar)) : (h) pVar.r(this.history.f());
        int i6 = this.f83221g;
        if (i6 != 2) {
            if (i6 != 3) {
                if (i6 != 4) {
                    throw new ChronoException(ProtectedSandApp.s("隮\u0001") + name());
                }
                appendable.append(String.valueOf(e4.b()));
                return;
            }
            int intValue = ((Integer) dVar.b(pe.a.G2, 0)).intValue();
            int d5 = e4.d();
            if (intValue == 0) {
                appendable.append(E(dVar, (net.time4j.format.m) dVar.b(net.time4j.format.a.f82786h, net.time4j.format.m.FORMAT)).g(e0.valueOf(d5)));
                return;
            }
            String numeral = jVar.toNumeral(d5);
            if (jVar.isDecimal()) {
                numeral = F(numeral, intValue, c5);
            }
            appendable.append(numeral);
            return;
        }
        o v4 = this.history.v();
        int e5 = e4.e();
        String str = null;
        if (!o.f83227d.equals(v4) && (c6 = v4.c(e4)) != e5) {
            net.time4j.engine.c<p> cVar = d.f83158q;
            p pVar2 = p.DUAL_DATING;
            if (dVar.b(cVar, pVar2) == pVar2) {
                str = C(jVar, c5, c6, e5, i4);
            } else {
                e5 = c6;
            }
        }
        if (str == null) {
            str = jVar.isDecimal() ? F(jVar.toNumeral(e5), i4, c5) : jVar.toNumeral(e5);
        }
        if (jVar.isDecimal()) {
            char charAt = jVar.getDigits().charAt(0);
            if (c5 != charAt) {
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                for (int i7 = 0; i7 < length; i7++) {
                    char charAt2 = str.charAt(i7);
                    if (jVar.contains(charAt2)) {
                        sb.append((char) ((c5 - charAt) + charAt2));
                    } else {
                        sb.append(charAt2);
                    }
                }
                str = sb.toString();
            }
            B(str, i5);
        }
        appendable.append(str);
    }

    @Override // net.time4j.engine.e
    protected <T extends r<T>> a0<T, Integer> g(net.time4j.engine.x<T> xVar) {
        if (xVar.K(l0.f83326q)) {
            return new a(this.f83221g, this.history);
        }
        return null;
    }

    @Override // net.time4j.engine.e
    protected boolean k(net.time4j.engine.e<?> eVar) {
        return this.history.equals(((l) eVar).history);
    }

    @Override // net.time4j.format.v
    public Integer parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
        return x(charSequence, parsePosition, dVar, null);
    }

    @Override // net.time4j.format.v
    public void print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException {
        net.time4j.format.j jVar = (net.time4j.format.j) dVar.b(net.time4j.format.a.f82790l, net.time4j.format.j.ARABIC);
        net.time4j.engine.c<Character> cVar = net.time4j.format.a.f82791m;
        T(pVar, appendable, dVar, jVar, dVar.c(cVar) ? ((Character) dVar.a(cVar)).charValue() : jVar.isDecimal() ? jVar.getDigits().charAt(0) : '0', 1, 10);
    }

    @Override // net.time4j.history.internal.c, net.time4j.engine.e
    protected boolean u() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0166  */
    @Override // pe.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Integer x(java.lang.CharSequence r17, java.text.ParsePosition r18, net.time4j.engine.d r19, net.time4j.engine.r<?> r20) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.history.l.x(java.lang.CharSequence, java.text.ParsePosition, net.time4j.engine.d, net.time4j.engine.r):java.lang.Integer");
    }
}
