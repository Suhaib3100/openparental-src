package net.time4j.format.expert;

import androidx.content.preferences.protobuf.m2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Set;

/* compiled from: FractionProcessor.java */
/* loaded from: classes7.dex */
final class k implements i<Integer> {

    /* renamed from: i, reason: collision with root package name */
    private static final int f82959i = 999999999;

    /* renamed from: b, reason: collision with root package name */
    private final i<Void> f82960b;

    /* renamed from: c, reason: collision with root package name */
    private final net.time4j.engine.q<Integer> f82961c;

    /* renamed from: d, reason: collision with root package name */
    private final int f82962d;

    /* renamed from: e, reason: collision with root package name */
    private final int f82963e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f82964f;

    /* renamed from: g, reason: collision with root package name */
    private final char f82965g;

    /* renamed from: h, reason: collision with root package name */
    private final net.time4j.format.g f82966h;

    k(net.time4j.engine.q<Integer> qVar, int i4, int i5, boolean z4) {
        this.f82961c = qVar;
        this.f82962d = i4;
        this.f82963e = i5;
        this.f82964f = !z4 && i4 == i5;
        this.f82960b = z4 ? new o(net.time4j.format.a.f82793o) : null;
        if (qVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("铳\u0001"));
        }
        if (i4 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("铲\u0001"), i4));
        }
        if (i4 > i5) {
            throw new IllegalArgumentException(androidx.compose.foundation.text.q.a(ProtectedSandApp.s("铰\u0001"), i5, ProtectedSandApp.s("铱\u0001"), i4));
        }
        if (i4 > 9) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("铯\u0001"), i4));
        }
        if (i5 > 9) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("铮\u0001"), i5));
        }
        this.f82965g = '0';
        this.f82966h = net.time4j.format.g.SMART;
    }

    private int a(BigDecimal bigDecimal, int i4, int i5) {
        BigDecimal valueOf = BigDecimal.valueOf(i4);
        return bigDecimal.multiply(BigDecimal.valueOf(i5).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).intValueExact();
    }

    private boolean b() {
        return this.f82960b != null;
    }

    private static BigDecimal c(Number number) {
        return BigDecimal.valueOf(number.longValue());
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [net.time4j.engine.r, net.time4j.engine.r<?>] */
    net.time4j.engine.r<?> d(net.time4j.engine.r<?> rVar, net.time4j.engine.r<?> rVar2) {
        l lVar = l.FRACTION;
        if (!rVar2.w(lVar)) {
            return rVar;
        }
        int a5 = a((BigDecimal) rVar2.r(lVar), ((Integer) rVar.i(this.f82961c)).intValue(), ((Integer) rVar.g(this.f82961c)).intValue());
        rVar2.M(lVar, null);
        rVar2.K(this.f82961c, a5);
        return rVar.K(this.f82961c, a5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f82961c.equals(kVar.f82961c) && this.f82962d == kVar.f82962d && this.f82963e == kVar.f82963e && b() == kVar.b();
    }

    @Override // net.time4j.format.expert.i
    public net.time4j.engine.q<Integer> getElement() {
        return this.f82961c;
    }

    public int hashCode() {
        return (((this.f82963e * 10) + this.f82962d) * 31) + (this.f82961c.hashCode() * 7);
    }

    @Override // net.time4j.format.expert.i
    public boolean isNumerical() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0135  */
    @Override // net.time4j.format.expert.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void parse(java.lang.CharSequence r20, net.time4j.format.expert.w r21, net.time4j.engine.d r22, net.time4j.format.expert.x<?> r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.format.expert.k.parse(java.lang.CharSequence, net.time4j.format.expert.w, net.time4j.engine.d, net.time4j.format.expert.x, boolean):void");
    }

    @Override // net.time4j.format.expert.i
    public int print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar, Set<h> set, boolean z4) throws IOException {
        int i4;
        int i5;
        int i6;
        int i7;
        BigDecimal c5 = c((Number) pVar.r(this.f82961c));
        BigDecimal c6 = c((Number) pVar.i(this.f82961c));
        BigDecimal c7 = c((Number) pVar.g(this.f82961c));
        if (c5.compareTo(c7) > 0) {
            c5 = c7;
        }
        BigDecimal subtract = c5.subtract(c6);
        BigDecimal add = c7.subtract(c6).add(BigDecimal.ONE);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal divide = subtract.divide(add, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (divide.compareTo(bigDecimal) != 0) {
            bigDecimal = com.google.android.gms.internal.measurement.a.a(divide);
        }
        BigDecimal bigDecimal2 = bigDecimal;
        char charValue = z4 ? this.f82965g : ((Character) dVar.b(net.time4j.format.a.f82791m, '0')).charValue();
        int length = appendable instanceof CharSequence ? ((CharSequence) appendable).length() : -1;
        int i10 = 0;
        if (bigDecimal2.scale() != 0) {
            if (b()) {
                i10 = 1;
                this.f82960b.print(pVar, appendable, dVar, set, z4);
                i4 = 1;
            } else {
                i4 = 1;
            }
            String plainString = bigDecimal2.setScale(Math.min(Math.max(bigDecimal2.scale(), this.f82962d), this.f82963e), roundingMode).toPlainString();
            int i11 = charValue - '0';
            int length2 = plainString.length();
            for (int i12 = 2; i12 < length2; i12++) {
                appendable.append((char) (plainString.charAt(i12) + i11));
                i10++;
            }
        } else if (this.f82962d > 0) {
            if (b()) {
                i5 = 1;
                this.f82960b.print(pVar, appendable, dVar, set, z4);
                i6 = 1;
            } else {
                i5 = 1;
                i6 = 0;
            }
            while (true) {
                i7 = this.f82962d;
                if (i10 >= i7) {
                    break;
                }
                appendable.append(charValue);
                i10++;
            }
            i10 = i6 + i7;
            i4 = i5;
        } else {
            i4 = 1;
        }
        if (length != -1 && i10 > i4 && set != null) {
            set.add(new h(this.f82961c, length + 1, length + i10));
        }
        return i10;
    }

    @Override // net.time4j.format.expert.i
    public i<Integer> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i4) {
        return new k(this.f82960b, this.f82961c, this.f82962d, this.f82963e, this.f82964f, ((Character) dVar.b(net.time4j.format.a.f82791m, '0')).charValue(), (net.time4j.format.g) dVar.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        m2.a(k.class, sb, ProtectedSandApp.s("铸\u0001"));
        sb.append(this.f82961c.name());
        sb.append(ProtectedSandApp.s("铹\u0001"));
        sb.append(this.f82962d);
        sb.append(ProtectedSandApp.s("铺\u0001"));
        return androidx.view.e.a(sb, this.f82963e, ']');
    }

    @Override // net.time4j.format.expert.i
    public i<Integer> withElement(net.time4j.engine.q<Integer> qVar) {
        return this.f82961c == qVar ? this : new k(qVar, this.f82962d, this.f82963e, b());
    }

    private k(i<Void> iVar, net.time4j.engine.q<Integer> qVar, int i4, int i5, boolean z4, char c5, net.time4j.format.g gVar) {
        this.f82960b = iVar;
        this.f82961c = qVar;
        this.f82962d = i4;
        this.f82963e = i5;
        this.f82964f = z4;
        this.f82965g = c5;
        this.f82966h = gVar;
    }
}
