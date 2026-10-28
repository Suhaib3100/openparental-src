package net.time4j.format.expert;

import androidx.content.preferences.protobuf.m2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.mmkv.MMKV;
import java.io.IOException;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: LocalizedGMTProcessor.java */
/* loaded from: classes7.dex */
final class p implements i<net.time4j.tz.k> {

    /* renamed from: j, reason: collision with root package name */
    private static final net.time4j.tz.p f83011j = net.time4j.tz.p.o(64800);

    /* renamed from: k, reason: collision with root package name */
    private static final ConcurrentMap<Locale, String> f83012k = new ConcurrentHashMap();

    /* renamed from: l, reason: collision with root package name */
    private static final ConcurrentMap<Locale, a> f83013l = new ConcurrentHashMap();

    /* renamed from: m, reason: collision with root package name */
    static final /* synthetic */ boolean f83014m = false;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f83015b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f83016c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f83017d;

    /* renamed from: e, reason: collision with root package name */
    private final Locale f83018e;

    /* renamed from: f, reason: collision with root package name */
    private final String f83019f;

    /* renamed from: g, reason: collision with root package name */
    private final String f83020g;

    /* renamed from: h, reason: collision with root package name */
    private final char f83021h;

    /* renamed from: i, reason: collision with root package name */
    private final net.time4j.format.g f83022i;

    /* compiled from: LocalizedGMTProcessor.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f83023a;

        /* renamed from: b, reason: collision with root package name */
        private final String f83024b;

        /* renamed from: c, reason: collision with root package name */
        private final int f83025c;

        /* renamed from: d, reason: collision with root package name */
        private final int f83026d;

        a(String str, String str2, int i4, int i5) {
            this.f83023a = str;
            this.f83024b = str2;
            this.f83025c = i4;
            this.f83026d = i5;
        }
    }

    p(boolean z4) {
        this(z4, true, false, Locale.ROOT, ProtectedSandApp.s("锑\u0001"), ProtectedSandApp.s("锒\u0001"), '0', net.time4j.format.g.SMART);
    }

    private static boolean a(char c5, char c6) {
        return c5 == c6 || Character.toUpperCase(c5) == Character.toUpperCase(c6) || Character.toLowerCase(c5) == Character.toLowerCase(c6);
    }

    private static String b(Locale locale) {
        ConcurrentMap<Locale, String> concurrentMap = f83012k;
        String str = concurrentMap.get(locale);
        if (str != null) {
            return str;
        }
        String l4 = net.time4j.tz.p.f83649l.l(locale);
        String putIfAbsent = concurrentMap.putIfAbsent(locale, l4);
        return putIfAbsent != null ? putIfAbsent : l4;
    }

    private static net.time4j.tz.p c(net.time4j.engine.p pVar, net.time4j.engine.d dVar) {
        net.time4j.engine.c<net.time4j.tz.k> cVar = net.time4j.format.a.f82782d;
        if (dVar.c(cVar)) {
            net.time4j.tz.k kVar = (net.time4j.tz.k) dVar.a(cVar);
            if (kVar instanceof net.time4j.tz.p) {
                return (net.time4j.tz.p) kVar;
            }
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("锓\u0001") + pVar);
    }

    private static a d(Locale locale) {
        a aVar = f83013l.get(locale);
        if (aVar != null) {
            return aVar;
        }
        String l4 = f83011j.l(locale);
        int length = l4.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (l4.charAt(i4) == 177) {
                int indexOf = l4.indexOf(ProtectedSandApp.s("锔\u0001"), i4) + 2;
                int indexOf2 = l4.indexOf(ProtectedSandApp.s("锕\u0001"), indexOf);
                a aVar2 = new a(l4, l4.substring(indexOf, indexOf2), i4, indexOf2 + 2);
                a putIfAbsent = f83013l.putIfAbsent(locale, aVar2);
                return putIfAbsent != null ? putIfAbsent : aVar2;
            }
        }
        return aVar;
    }

    private static int e(CharSequence charSequence, int i4, char c5) {
        int i5 = 0;
        int i6 = 0;
        while (i5 < 2) {
            int i7 = i4 + i5;
            if (i7 >= charSequence.length()) {
                return i5 == 0 ? androidx.core.app.k0.f25787v : ~i6;
            }
            int charAt = charSequence.charAt(i7) - c5;
            if (charAt < 0 || charAt > 9) {
                return i5 == 0 ? androidx.core.app.k0.f25787v : ~i6;
            }
            i6 = (i6 * 10) + charAt;
            i5++;
        }
        return i6;
    }

    private static int f(CharSequence charSequence, int i4, char c5) {
        int charAt;
        int i5 = 0;
        for (int i6 = 0; i6 < 2; i6++) {
            int i7 = i4 + i6;
            if (i7 >= charSequence.length() || (charAt = charSequence.charAt(i7) - c5) < 0 || charAt > 9) {
                return androidx.core.app.k0.f25787v;
            }
            i5 = (i5 * 10) + charAt;
        }
        return i5;
    }

    private static int g(CharSequence charSequence, int i4, int i5, Locale locale, boolean z4) {
        String[] strArr = {ProtectedSandApp.s("锘\u0001"), b(locale), ProtectedSandApp.s("锖\u0001"), ProtectedSandApp.s("锗\u0001")};
        for (int i6 = 0; i6 < 4; i6++) {
            String str = strArr[i6];
            int length = str.length();
            if (i4 - i5 >= length) {
                String charSequence2 = charSequence.subSequence(i5, i5 + length).toString();
                if ((z4 && charSequence2.equalsIgnoreCase(str)) || (!z4 && charSequence2.equals(str))) {
                    return length;
                }
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.f83015b == ((p) obj).f83015b;
    }

    @Override // net.time4j.format.expert.i
    public net.time4j.engine.q<net.time4j.tz.k> getElement() {
        return f0.TIMEZONE_OFFSET;
    }

    public int hashCode() {
        return this.f83015b ? 1 : 0;
    }

    @Override // net.time4j.format.expert.i
    public boolean isNumerical() {
        return false;
    }

    @Override // net.time4j.format.expert.i
    public void parse(CharSequence charSequence, w wVar, net.time4j.engine.d dVar, x<?> xVar, boolean z4) {
        int i4;
        Locale locale;
        boolean z5;
        String str;
        String str2;
        net.time4j.tz.f fVar;
        int i5;
        net.time4j.format.g gVar;
        int i6;
        int i7;
        net.time4j.tz.p n4;
        int h4;
        int length = charSequence.length();
        int f4 = wVar.f();
        if (f4 >= length) {
            wVar.l(f4, ProtectedSandApp.s("错\u0001"));
            return;
        }
        Locale locale2 = z4 ? this.f83018e : (Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT);
        boolean s4 = net.time4j.format.b.s(locale2);
        boolean booleanValue = z4 ? this.f83017d : ((Boolean) dVar.b(net.time4j.format.a.f82792n, Boolean.FALSE)).booleanValue();
        boolean booleanValue2 = z4 ? this.f83016c : ((Boolean) dVar.b(net.time4j.format.a.f82787i, Boolean.TRUE)).booleanValue();
        char charValue = z4 ? this.f83021h : ((Character) dVar.b(net.time4j.format.a.f82791m, '0')).charValue();
        String str3 = z4 ? this.f83019f : (String) dVar.b(b.f82829g, ProtectedSandApp.s("锑\u0001"));
        String str4 = z4 ? this.f83020g : (String) dVar.b(b.f82830h, ProtectedSandApp.s("锒\u0001"));
        a d5 = d(locale2);
        int length2 = d5.f83023a.length();
        int i10 = f4;
        int i11 = 0;
        net.time4j.tz.p pVar = null;
        while (i11 < length2) {
            int i12 = length2;
            char charAt = d5.f83023a.charAt(i11);
            if (d5.f83025c > i11 || d5.f83026d <= i11) {
                i4 = f4;
                locale = locale2;
                z5 = s4;
                str = str3;
                str2 = str4;
                if (!booleanValue) {
                    char charAt2 = i10 < length ? charSequence.charAt(i10) : (char) 0;
                    if ((booleanValue2 || charAt != charAt2) && !(booleanValue2 && a(charAt, charAt2))) {
                        int g4 = g(charSequence, length, i4, locale, booleanValue2);
                        if (g4 <= 0) {
                            wVar.l(i4, ProtectedSandApp.s("锟\u0001"));
                            return;
                        } else {
                            xVar.R(f0.TIMEZONE_OFFSET, net.time4j.tz.p.f83649l);
                            wVar.m(i4 + g4);
                            return;
                        }
                    }
                    i10++;
                }
            } else {
                int h5 = o.h(charSequence, i10, str3, booleanValue2, s4);
                if (h5 == -1) {
                    h5 = o.h(charSequence, i10, str4, booleanValue2, s4);
                    if (h5 == -1) {
                        int g5 = booleanValue ? 0 : g(charSequence, length, f4, locale2, booleanValue2);
                        if (g5 <= 0) {
                            wVar.l(f4, ProtectedSandApp.s("锚\u0001"));
                            return;
                        } else {
                            xVar.R(f0.TIMEZONE_OFFSET, net.time4j.tz.p.f83649l);
                            wVar.m(f4 + g5);
                            return;
                        }
                    }
                    fVar = net.time4j.tz.f.BEHIND_UTC;
                } else {
                    fVar = net.time4j.tz.f.AHEAD_OF_UTC;
                }
                net.time4j.tz.f fVar2 = fVar;
                int i13 = i10 + h5;
                int e4 = e(charSequence, i13, charValue);
                str = str3;
                if (e4 == -1000) {
                    wVar.l(i13, ProtectedSandApp.s("锛\u0001"));
                    return;
                }
                if (e4 < 0) {
                    e4 = ~e4;
                    i5 = i13 + 1;
                } else {
                    i5 = i13 + 2;
                }
                if (i5 >= length) {
                    if (!this.f83015b) {
                        wVar.l(i5, ProtectedSandApp.s("锜\u0001"));
                        return;
                    } else {
                        xVar.R(f0.TIMEZONE_OFFSET, net.time4j.tz.p.m(fVar2, e4));
                        wVar.m(i5);
                        return;
                    }
                }
                str2 = str4;
                if (z4) {
                    gVar = this.f83022i;
                    i4 = f4;
                    locale = locale2;
                } else {
                    i4 = f4;
                    locale = locale2;
                    gVar = (net.time4j.format.g) dVar.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART);
                }
                int h6 = o.h(charSequence, i5, d5.f83024b, booleanValue2, s4);
                if (h6 != -1) {
                    i5 += h6;
                } else if (this.f83015b) {
                    xVar.R(f0.TIMEZONE_OFFSET, net.time4j.tz.p.m(fVar2, e4));
                    wVar.m(i5);
                    return;
                } else if (gVar.isStrict()) {
                    wVar.l(i5, ProtectedSandApp.s("锝\u0001"));
                    return;
                }
                int f5 = f(charSequence, i5, charValue);
                if (f5 == -1000) {
                    wVar.l(i5, ProtectedSandApp.s("锞\u0001"));
                    return;
                }
                i10 = i5 + 2;
                if (i10 >= length || (h4 = o.h(charSequence, i10, d5.f83024b, booleanValue2, s4)) == -1) {
                    z5 = s4;
                    i6 = androidx.core.app.k0.f25787v;
                    i7 = 0;
                } else {
                    int i14 = i10 + h4;
                    i7 = f(charSequence, i14, charValue);
                    z5 = s4;
                    i6 = androidx.core.app.k0.f25787v;
                    i10 = i7 == -1000 ? i14 - h4 : i14 + 2;
                }
                if (i7 == 0 || i7 == i6) {
                    n4 = net.time4j.tz.p.n(fVar2, e4, f5);
                } else {
                    int i15 = (f5 * 60) + (e4 * MMKV.ExpireInHour) + i7;
                    if (fVar2 == net.time4j.tz.f.BEHIND_UTC) {
                        i15 = -i15;
                    }
                    n4 = net.time4j.tz.p.o(i15);
                }
                pVar = n4;
                i11 = d5.f83026d - 1;
            }
            f4 = i4;
            locale2 = locale;
            i11++;
            length2 = i12;
            str3 = str;
            str4 = str2;
            s4 = z5;
        }
        net.time4j.tz.p pVar2 = pVar;
        if (pVar2 == null) {
            wVar.l(i10, ProtectedSandApp.s("锠\u0001"));
        } else {
            xVar.R(f0.TIMEZONE_OFFSET, pVar2);
            wVar.m(i10);
        }
    }

    @Override // net.time4j.format.expert.i
    public int print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar, Set<h> set, boolean z4) throws IOException {
        net.time4j.tz.p I;
        int i4;
        net.time4j.tz.p pVar2;
        char c5;
        int length;
        int length2 = appendable instanceof CharSequence ? ((CharSequence) appendable).length() : -1;
        net.time4j.tz.k v4 = pVar.e() ? pVar.v() : null;
        if (v4 == null) {
            I = c(pVar, dVar);
        } else if (v4 instanceof net.time4j.tz.p) {
            I = (net.time4j.tz.p) v4;
        } else {
            if (!(pVar instanceof net.time4j.base.f)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("锡\u0001") + pVar);
            }
            I = net.time4j.tz.l.c0(v4).I((net.time4j.base.f) pVar);
        }
        Locale locale = z4 ? this.f83018e : (Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT);
        char c6 = '0';
        char charValue = z4 ? this.f83021h : ((Character) dVar.b(net.time4j.format.a.f82791m, '0')).charValue();
        String str = z4 ? this.f83019f : (String) dVar.b(b.f82829g, ProtectedSandApp.s("锑\u0001"));
        String str2 = z4 ? this.f83020g : (String) dVar.b(b.f82830h, ProtectedSandApp.s("锒\u0001"));
        boolean booleanValue = z4 ? this.f83017d : ((Boolean) dVar.b(net.time4j.format.a.f82792n, Boolean.FALSE)).booleanValue();
        int i5 = I.i();
        int h4 = I.h();
        if (!booleanValue && i5 == 0 && h4 == 0) {
            String b5 = b(locale);
            appendable.append(b5);
            i4 = b5.length();
        } else {
            a d5 = d(locale);
            int length3 = d5.f83023a.length();
            int i6 = 0;
            int i7 = 0;
            while (i7 < length3) {
                char charAt = d5.f83023a.charAt(i7);
                if (d5.f83025c > i7 || d5.f83026d <= i7) {
                    pVar2 = I;
                    c5 = c6;
                    if (!booleanValue) {
                        appendable.append(charAt);
                        i6++;
                    }
                } else {
                    if (I.k() == net.time4j.tz.f.BEHIND_UTC) {
                        appendable.append(str2);
                        length = str2.length();
                    } else {
                        appendable.append(str);
                        length = str.length();
                    }
                    int i10 = length + i6;
                    int e4 = I.e();
                    int f4 = I.f();
                    int g4 = I.g();
                    if (e4 < 10 && !this.f83015b) {
                        appendable.append(charValue);
                        i10++;
                    }
                    String valueOf = String.valueOf(e4);
                    pVar2 = I;
                    for (int i11 = 0; i11 < valueOf.length(); i11++) {
                        appendable.append((char) ((valueOf.charAt(i11) - '0') + charValue));
                        i10++;
                    }
                    if (f4 == 0 && g4 == 0 && this.f83015b) {
                        i6 = i10;
                        c5 = '0';
                    } else {
                        appendable.append(d5.f83024b);
                        int length4 = d5.f83024b.length() + i10;
                        if (f4 < 10) {
                            appendable.append(charValue);
                            length4++;
                        }
                        String valueOf2 = String.valueOf(f4);
                        for (int i12 = 0; i12 < valueOf2.length(); i12++) {
                            appendable.append((char) ((valueOf2.charAt(i12) - '0') + charValue));
                            length4++;
                        }
                        if (g4 != 0) {
                            appendable.append(d5.f83024b);
                            int length5 = d5.f83024b.length() + length4;
                            if (g4 < 10) {
                                appendable.append(charValue);
                                length5++;
                            }
                            String valueOf3 = String.valueOf(g4);
                            for (int i13 = 0; i13 < valueOf3.length(); i13++) {
                                appendable.append((char) ((valueOf3.charAt(i13) - '0') + charValue));
                                length5++;
                            }
                            c5 = '0';
                            i6 = length5;
                        } else {
                            c5 = '0';
                            i6 = length4;
                        }
                    }
                    i7 = d5.f83026d - 1;
                }
                i7++;
                c6 = c5;
                I = pVar2;
            }
            i4 = i6;
        }
        if (length2 != -1 && i4 > 0 && set != null) {
            set.add(new h(f0.TIMEZONE_ID, length2, length2 + i4));
        }
        return i4;
    }

    @Override // net.time4j.format.expert.i
    public i<net.time4j.tz.k> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i4) {
        return new p(this.f83015b, ((Boolean) dVar.b(net.time4j.format.a.f82787i, Boolean.TRUE)).booleanValue(), ((Boolean) dVar.b(net.time4j.format.a.f82792n, Boolean.FALSE)).booleanValue(), (Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT), (String) dVar.b(b.f82829g, ProtectedSandApp.s("锑\u0001")), (String) dVar.b(b.f82830h, ProtectedSandApp.s("锒\u0001")), ((Character) dVar.b(net.time4j.format.a.f82791m, '0')).charValue(), (net.time4j.format.g) dVar.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        m2.a(p.class, sb, ProtectedSandApp.s("锢\u0001"));
        return androidx.compose.animation.l.a(sb, this.f83015b, ']');
    }

    @Override // net.time4j.format.expert.i
    public i<net.time4j.tz.k> withElement(net.time4j.engine.q<net.time4j.tz.k> qVar) {
        return this;
    }

    private p(boolean z4, boolean z5, boolean z6, Locale locale, String str, String str2, char c5, net.time4j.format.g gVar) {
        this.f83015b = z4;
        this.f83016c = z5;
        this.f83017d = z6;
        this.f83018e = locale;
        this.f83019f = str;
        this.f83020g = str2;
        this.f83021h = c5;
        this.f83022i = gVar;
    }
}
