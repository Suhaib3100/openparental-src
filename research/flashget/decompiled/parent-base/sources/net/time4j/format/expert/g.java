package net.time4j.format.expert;

import androidx.content.preferences.protobuf.m2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Set;

/* compiled from: DecimalProcessor.java */
/* loaded from: classes7.dex */
final class g implements i<BigDecimal> {

    /* renamed from: b, reason: collision with root package name */
    private final i<Void> f82912b;

    /* renamed from: c, reason: collision with root package name */
    private final net.time4j.engine.q<BigDecimal> f82913c;

    /* renamed from: d, reason: collision with root package name */
    private final int f82914d;

    /* renamed from: e, reason: collision with root package name */
    private final int f82915e;

    /* renamed from: f, reason: collision with root package name */
    private final char f82916f;

    /* renamed from: g, reason: collision with root package name */
    private final net.time4j.format.g f82917g;

    /* renamed from: h, reason: collision with root package name */
    private final int f82918h;

    g(net.time4j.engine.q<BigDecimal> qVar, int i4, int i5) {
        this.f82912b = new o(net.time4j.format.a.f82793o);
        this.f82913c = qVar;
        this.f82914d = i4;
        this.f82915e = i5;
        if (qVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("钒\u0001"));
        }
        if (i4 < 2) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("钑\u0001"), i4));
        }
        if (i5 >= i4) {
            throw new IllegalArgumentException(androidx.compose.foundation.text.q.a(ProtectedSandApp.s("钏\u0001"), i4, ProtectedSandApp.s("钐\u0001"), i5));
        }
        if (i5 < 1) {
            throw new IllegalArgumentException(ProtectedSandApp.s("钎\u0001"));
        }
        this.f82916f = '0';
        this.f82917g = net.time4j.format.g.SMART;
        this.f82918h = 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f82913c.equals(gVar.f82913c) && this.f82914d == gVar.f82914d && this.f82915e == gVar.f82915e;
    }

    @Override // net.time4j.format.expert.i
    public net.time4j.engine.q<BigDecimal> getElement() {
        return this.f82913c;
    }

    public int hashCode() {
        return (((this.f82914d * 10) + this.f82915e) * 31) + (this.f82913c.hashCode() * 7);
    }

    @Override // net.time4j.format.expert.i
    public boolean isNumerical() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fb, code lost:
    
        r23.l(r6, com.flashget.parentalcontrol.ProtectedSandApp.s("钖\u0001"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0105, code lost:
    
        return;
     */
    @Override // net.time4j.format.expert.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void parse(java.lang.CharSequence r22, net.time4j.format.expert.w r23, net.time4j.engine.d r24, net.time4j.format.expert.x<?> r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.format.expert.g.parse(java.lang.CharSequence, net.time4j.format.expert.w, net.time4j.engine.d, net.time4j.format.expert.x, boolean):void");
    }

    @Override // net.time4j.format.expert.i
    public int print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar, Set<h> set, boolean z4) throws IOException {
        String plainString = ((BigDecimal) pVar.r(this.f82913c)).setScale(this.f82915e, RoundingMode.FLOOR).toPlainString();
        int length = plainString.length();
        int i4 = 0;
        int i5 = 0;
        int i6 = -1;
        for (int i7 = 0; i7 < length; i7++) {
            if (plainString.charAt(i7) == '.') {
                i6 = i7;
            } else if (i6 >= 0) {
                i5++;
            } else {
                i4++;
            }
        }
        int i10 = this.f82914d;
        int i11 = (i10 - this.f82915e) - i4;
        if (i11 < 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("钘\u0001").concat(plainString));
        }
        StringBuilder sb = new StringBuilder(i10 + 1);
        for (int i12 = 0; i12 < i11; i12++) {
            sb.append('0');
        }
        for (int i13 = 0; i13 < i4; i13++) {
            sb.append(plainString.charAt(i13));
        }
        this.f82912b.print(pVar, sb, dVar, set, z4);
        for (int i14 = 0; i14 < i5; i14++) {
            sb.append(plainString.charAt(i4 + 1 + i14));
        }
        for (int i15 = 0; i15 < this.f82915e - i5; i15++) {
            sb.append('0');
        }
        String sb2 = sb.toString();
        char charValue = z4 ? this.f82916f : ((Character) dVar.b(net.time4j.format.a.f82791m, '0')).charValue();
        if (charValue != '0') {
            int i16 = charValue - '0';
            char[] charArray = sb2.toCharArray();
            for (int i17 = 0; i17 < charArray.length; i17++) {
                char c5 = charArray[i17];
                if (c5 >= '0' && c5 <= '9') {
                    charArray[i17] = (char) (c5 + i16);
                }
            }
            sb2 = new String(charArray);
        }
        int length2 = sb2.length();
        int length3 = appendable instanceof CharSequence ? ((CharSequence) appendable).length() : -1;
        appendable.append(sb2);
        if (length3 != -1 && length2 > 0 && set != null) {
            set.add(new h(this.f82913c, length3, length3 + length2));
        }
        return length2;
    }

    @Override // net.time4j.format.expert.i
    public i<BigDecimal> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i4) {
        return new g(this.f82912b, this.f82913c, this.f82914d, this.f82915e, ((Character) dVar.b(net.time4j.format.a.f82791m, '0')).charValue(), (net.time4j.format.g) dVar.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART), ((Integer) dVar.b(net.time4j.format.a.f82797s, 0)).intValue());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        m2.a(g.class, sb, ProtectedSandApp.s("钙\u0001"));
        sb.append(this.f82913c.name());
        sb.append(ProtectedSandApp.s("钚\u0001"));
        sb.append(this.f82914d);
        sb.append(ProtectedSandApp.s("钛\u0001"));
        return androidx.view.e.a(sb, this.f82915e, ']');
    }

    @Override // net.time4j.format.expert.i
    public i<BigDecimal> withElement(net.time4j.engine.q<BigDecimal> qVar) {
        return this.f82913c == qVar ? this : new g(qVar, this.f82914d, this.f82915e);
    }

    private g(i<Void> iVar, net.time4j.engine.q<BigDecimal> qVar, int i4, int i5, char c5, net.time4j.format.g gVar, int i6) {
        this.f82912b = iVar;
        this.f82913c = qVar;
        this.f82914d = i4;
        this.f82915e = i5;
        this.f82916f = c5;
        this.f82917g = gVar;
        this.f82918h = i6;
    }
}
