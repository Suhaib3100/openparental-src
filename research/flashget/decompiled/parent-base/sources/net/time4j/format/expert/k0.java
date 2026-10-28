package net.time4j.format.expert;

import androidx.content.preferences.protobuf.m2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.Set;

/* compiled from: TwoDigitYearProcessor.java */
/* loaded from: classes7.dex */
final class k0 implements i<Integer> {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ boolean f82967h = false;

    /* renamed from: b, reason: collision with root package name */
    private final net.time4j.engine.q<Integer> f82968b;

    /* renamed from: c, reason: collision with root package name */
    private final int f82969c;

    /* renamed from: d, reason: collision with root package name */
    private final char f82970d;

    /* renamed from: e, reason: collision with root package name */
    private final net.time4j.format.g f82971e;

    /* renamed from: f, reason: collision with root package name */
    private final int f82972f;

    /* renamed from: g, reason: collision with root package name */
    private final int f82973g;

    k0(net.time4j.engine.q<Integer> qVar) {
        if (!qVar.name().startsWith(ProtectedSandApp.s("铥\u0001"))) {
            throw new IllegalArgumentException(ProtectedSandApp.s("铦\u0001") + qVar);
        }
        this.f82968b = qVar;
        this.f82969c = 0;
        this.f82970d = '0';
        this.f82971e = net.time4j.format.g.SMART;
        this.f82972f = 0;
        this.f82973g = 100;
    }

    private int a(boolean z4, net.time4j.engine.d dVar) {
        int intValue = z4 ? this.f82973g : ((Integer) dVar.b(net.time4j.format.a.f82795q, Integer.valueOf(this.f82973g))).intValue();
        if (intValue >= 100) {
            return intValue;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("铧\u0001"), intValue));
    }

    private static int b(int i4, int i5) {
        return ((i4 >= i5 % 100 ? (i5 / 100) - 1 : i5 / 100) * 100) + i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k0) {
            return this.f82968b.equals(((k0) obj).f82968b);
        }
        return false;
    }

    @Override // net.time4j.format.expert.i
    public net.time4j.engine.q<Integer> getElement() {
        return this.f82968b;
    }

    public int hashCode() {
        return this.f82968b.hashCode();
    }

    @Override // net.time4j.format.expert.i
    public boolean isNumerical() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00db  */
    @Override // net.time4j.format.expert.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void parse(java.lang.CharSequence r11, net.time4j.format.expert.w r12, net.time4j.engine.d r13, net.time4j.format.expert.x<?> r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.format.expert.k0.parse(java.lang.CharSequence, net.time4j.format.expert.w, net.time4j.engine.d, net.time4j.format.expert.x, boolean):void");
    }

    @Override // net.time4j.format.expert.i
    public int print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar, Set<h> set, boolean z4) throws IOException {
        int l4 = pVar.l(this.f82968b);
        if (l4 < 0) {
            if (l4 != Integer.MIN_VALUE) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("铬\u0001"), l4));
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("铫\u0001") + pVar);
        }
        if (a(z4, dVar) != 100) {
            l4 = net.time4j.base.c.c(l4, 100);
        }
        String num = Integer.toString(l4);
        char charValue = z4 ? this.f82970d : ((Character) dVar.b(net.time4j.format.a.f82791m, '0')).charValue();
        int i4 = 0;
        if (charValue != '0') {
            int i5 = charValue - '0';
            char[] charArray = num.toCharArray();
            for (int i6 = 0; i6 < charArray.length; i6++) {
                charArray[i6] = (char) (charArray[i6] + i5);
            }
            num = new String(charArray);
        }
        int length = appendable instanceof CharSequence ? ((CharSequence) appendable).length() : -1;
        if (l4 < 10) {
            appendable.append(charValue);
            i4 = 1;
        }
        appendable.append(num);
        int length2 = num.length() + i4;
        if (length != -1 && length2 > 0 && set != null) {
            set.add(new h(this.f82968b, length, length + length2));
        }
        return length2;
    }

    @Override // net.time4j.format.expert.i
    public i<Integer> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i4) {
        return new k0(this.f82968b, i4, ((Character) dVar.b(net.time4j.format.a.f82791m, '0')).charValue(), (net.time4j.format.g) dVar.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART), ((Integer) dVar.b(net.time4j.format.a.f82797s, 0)).intValue(), ((Integer) dVar.b(net.time4j.format.a.f82795q, Integer.valueOf(cVar.y().g()))).intValue());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        m2.a(k0.class, sb, ProtectedSandApp.s("铭\u0001"));
        sb.append(this.f82968b.name());
        sb.append(']');
        return sb.toString();
    }

    @Override // net.time4j.format.expert.i
    public i<Integer> withElement(net.time4j.engine.q<Integer> qVar) {
        return this.f82968b == qVar ? this : new k0(qVar);
    }

    private k0(net.time4j.engine.q<Integer> qVar, int i4, char c5, net.time4j.format.g gVar, int i5, int i6) {
        this.f82968b = qVar;
        this.f82969c = i4;
        this.f82970d = c5;
        this.f82971e = gVar;
        this.f82972f = i5;
        this.f82973g = i6;
    }
}
