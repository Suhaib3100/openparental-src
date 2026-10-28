package net.time4j.format.expert;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.List;
import java.util.Set;

/* compiled from: TimezoneIDProcessor.java */
/* loaded from: classes7.dex */
enum h0 implements i<net.time4j.tz.k> {
    INSTANCE;

    @Override // net.time4j.format.expert.i
    public net.time4j.engine.q<net.time4j.tz.k> getElement() {
        return f0.TIMEZONE_ID;
    }

    @Override // net.time4j.format.expert.i
    public boolean isNumerical() {
        return false;
    }

    @Override // net.time4j.format.expert.i
    public void parse(CharSequence charSequence, w wVar, net.time4j.engine.d dVar, x<?> xVar, boolean z4) {
        char charAt;
        char charAt2;
        int length = charSequence.length();
        int f4 = wVar.f();
        if (f4 >= length) {
            wVar.l(f4, ProtectedSandApp.s("钝\u0001"));
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i4 = f4;
        while (i4 < length && (((charAt2 = charSequence.charAt(i4)) >= 'a' && charAt2 <= 'z') || ((charAt2 >= 'A' && charAt2 <= 'Z') || charAt2 == '-' || charAt2 == '_' || charAt2 == '/'))) {
            sb.append(charAt2);
            i4++;
        }
        if (!Character.isLetter(sb.charAt(sb.length() - 1))) {
            sb.deleteCharAt(sb.length() - 1);
            i4--;
        }
        String sb2 = sb.toString();
        if (sb2.isEmpty()) {
            wVar.l(f4, ProtectedSandApp.s("钞\u0001"));
            return;
        }
        if (sb2.startsWith(ProtectedSandApp.s("钟\u0001"))) {
            wVar.l(f4, ProtectedSandApp.s("钠\u0001"));
            return;
        }
        if (sb2.equals(ProtectedSandApp.s("钡\u0001"))) {
            xVar.R(f0.TIMEZONE_OFFSET, net.time4j.tz.p.f83649l);
            wVar.m(i4);
            return;
        }
        if (sb2.equals(ProtectedSandApp.s("钢\u0001")) || sb2.equals(ProtectedSandApp.s("钣\u0001")) || sb2.equals(ProtectedSandApp.s("钤\u0001"))) {
            if (length <= i4 || !((charAt = charSequence.charAt(i4)) == '+' || charAt == '-')) {
                xVar.R(f0.TIMEZONE_OFFSET, net.time4j.tz.p.f83649l);
                wVar.m(i4);
                return;
            } else {
                wVar.m(i4);
                j0.f82953g.parse(charSequence, wVar, dVar, xVar, z4);
                return;
            }
        }
        List<net.time4j.tz.k> A = net.time4j.tz.l.A(ProtectedSandApp.s("钥\u0001"));
        int size = A.size() - 1;
        int i5 = 0;
        while (i5 <= size) {
            int i6 = (i5 + size) >>> 1;
            net.time4j.tz.k kVar = A.get(i6);
            int compareTo = kVar.canonical().compareTo(sb2);
            if (compareTo < 0) {
                i5 = i6 + 1;
            } else {
                if (compareTo <= 0) {
                    xVar.R(f0.TIMEZONE_ID, kVar);
                    wVar.m(i4);
                    return;
                }
                size = i6 - 1;
            }
        }
        wVar.l(f4, ProtectedSandApp.s("钦\u0001").concat(sb2));
    }

    @Override // net.time4j.format.expert.i
    public int print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar, Set<h> set, boolean z4) throws IOException {
        if (!pVar.e()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("钧\u0001") + pVar);
        }
        int length = appendable instanceof CharSequence ? ((CharSequence) appendable).length() : -1;
        String canonical = pVar.v().canonical();
        appendable.append(canonical);
        int length2 = canonical.length();
        if (length != -1 && length2 > 0 && set != null) {
            set.add(new h(f0.TIMEZONE_ID, length, length + length2));
        }
        return length2;
    }

    @Override // net.time4j.format.expert.i
    public i<net.time4j.tz.k> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i4) {
        return INSTANCE;
    }

    @Override // net.time4j.format.expert.i
    public i<net.time4j.tz.k> withElement(net.time4j.engine.q<net.time4j.tz.k> qVar) {
        return INSTANCE;
    }
}
