package net.time4j.format.expert;

import androidx.content.preferences.protobuf.m2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: OrdinalProcessor.java */
/* loaded from: classes7.dex */
final class v implements i<Integer> {

    /* renamed from: i, reason: collision with root package name */
    private static final Map<net.time4j.format.n, String> f83052i;

    /* renamed from: b, reason: collision with root package name */
    private final net.time4j.engine.q<Integer> f83053b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<net.time4j.format.n, String> f83054c;

    /* renamed from: d, reason: collision with root package name */
    private final int f83055d;

    /* renamed from: e, reason: collision with root package name */
    private final int f83056e;

    /* renamed from: f, reason: collision with root package name */
    private final char f83057f;

    /* renamed from: g, reason: collision with root package name */
    private final net.time4j.format.g f83058g;

    /* renamed from: h, reason: collision with root package name */
    private final Locale f83059h;

    static {
        EnumMap enumMap = new EnumMap(net.time4j.format.n.class);
        enumMap.put((EnumMap) net.time4j.format.n.ONE, (net.time4j.format.n) ProtectedSandApp.s("镒\u0001"));
        enumMap.put((EnumMap) net.time4j.format.n.TWO, (net.time4j.format.n) ProtectedSandApp.s("镓\u0001"));
        enumMap.put((EnumMap) net.time4j.format.n.FEW, (net.time4j.format.n) ProtectedSandApp.s("镔\u0001"));
        enumMap.put((EnumMap) net.time4j.format.n.OTHER, (net.time4j.format.n) ProtectedSandApp.s("镕\u0001"));
        f83052i = Collections.unmodifiableMap(enumMap);
    }

    v(net.time4j.engine.q<Integer> qVar, Map<net.time4j.format.n, String> map) {
        if (qVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("镗\u0001"));
        }
        this.f83053b = qVar;
        if (map == null) {
            this.f83054c = null;
        } else {
            Map<net.time4j.format.n, String> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(map));
            this.f83054c = unmodifiableMap;
            if (!unmodifiableMap.containsKey(net.time4j.format.n.OTHER)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("镖\u0001") + map);
            }
        }
        this.f83055d = 0;
        this.f83056e = 0;
        this.f83057f = '0';
        this.f83058g = net.time4j.format.g.SMART;
        this.f83059h = Locale.ROOT;
    }

    private String a(net.time4j.engine.d dVar, boolean z4, int i4) {
        net.time4j.format.n e4 = net.time4j.format.p.h(c() ? Locale.ENGLISH : z4 ? this.f83059h : (Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT), net.time4j.format.k.ORDINALS).e(i4);
        if (!b().containsKey(e4)) {
            e4 = net.time4j.format.n.OTHER;
        }
        return b().get(e4);
    }

    private Map<net.time4j.format.n, String> b() {
        return c() ? f83052i : this.f83054c;
    }

    private boolean c() {
        return this.f83054c == null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f83053b.equals(vVar.f83053b) && b().equals(vVar.b());
    }

    @Override // net.time4j.format.expert.i
    public net.time4j.engine.q<Integer> getElement() {
        return this.f83053b;
    }

    public int hashCode() {
        return (b().hashCode() * 31) + (this.f83053b.hashCode() * 7);
    }

    @Override // net.time4j.format.expert.i
    public boolean isNumerical() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    @Override // net.time4j.format.expert.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void parse(java.lang.CharSequence r21, net.time4j.format.expert.w r22, net.time4j.engine.d r23, net.time4j.format.expert.x<?> r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.format.expert.v.parse(java.lang.CharSequence, net.time4j.format.expert.w, net.time4j.engine.d, net.time4j.format.expert.x, boolean):void");
    }

    @Override // net.time4j.format.expert.i
    public int print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar, Set<h> set, boolean z4) throws IOException {
        int l4 = pVar.l(this.f83053b);
        if (l4 < 0) {
            if (l4 == Integer.MIN_VALUE) {
                return -1;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("镠\u0001") + pVar);
        }
        String num = Integer.toString(l4);
        char charValue = z4 ? this.f83057f : ((Character) dVar.b(net.time4j.format.a.f82791m, '0')).charValue();
        if (charValue != '0') {
            int i4 = charValue - '0';
            char[] charArray = num.toCharArray();
            for (int i5 = 0; i5 < charArray.length; i5++) {
                charArray[i5] = (char) (charArray[i5] + i4);
            }
            num = new String(charArray);
        }
        int length = appendable instanceof CharSequence ? ((CharSequence) appendable).length() : -1;
        appendable.append(num);
        int length2 = num.length();
        String a5 = a(dVar, z4, l4);
        appendable.append(a5);
        int length3 = a5.length() + length2;
        if (length != -1 && length3 > 0 && set != null) {
            set.add(new h(this.f83053b, length, length + length3));
        }
        return length3;
    }

    @Override // net.time4j.format.expert.i
    public i<Integer> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i4) {
        return new v(this.f83053b, this.f83054c, i4, ((Integer) dVar.b(net.time4j.format.a.f82797s, 0)).intValue(), ((Character) dVar.b(net.time4j.format.a.f82791m, '0')).charValue(), (net.time4j.format.g) dVar.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART), (Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        m2.a(v.class, sb, ProtectedSandApp.s("镡\u0001"));
        sb.append(this.f83053b.name());
        sb.append(ProtectedSandApp.s("镢\u0001"));
        sb.append(b());
        sb.append(']');
        return sb.toString();
    }

    @Override // net.time4j.format.expert.i
    public i<Integer> withElement(net.time4j.engine.q<Integer> qVar) {
        return this.f83053b == qVar ? this : new v(qVar, this.f83054c);
    }

    private v(net.time4j.engine.q<Integer> qVar, Map<net.time4j.format.n, String> map, int i4, int i5, char c5, net.time4j.format.g gVar, Locale locale) {
        this.f83053b = qVar;
        this.f83054c = map;
        this.f83055d = i4;
        this.f83056e = i5;
        this.f83057f = c5;
        this.f83058g = gVar;
        this.f83059h = locale;
    }
}
