package net.time4j.format.expert;

import androidx.compose.ui.graphics.l6;
import androidx.content.preferences.protobuf.m2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.mmkv.MMKV;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: TimezoneOffsetProcessor.java */
/* loaded from: classes7.dex */
final class j0 implements i<net.time4j.tz.k> {

    /* renamed from: g, reason: collision with root package name */
    static final j0 f82953g = new j0();

    /* renamed from: b, reason: collision with root package name */
    private final net.time4j.format.e f82954b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f82955c;

    /* renamed from: d, reason: collision with root package name */
    private final List<String> f82956d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f82957e;

    /* renamed from: f, reason: collision with root package name */
    private final net.time4j.format.g f82958f;

    j0(net.time4j.format.e eVar, boolean z4, List<String> list) {
        if (eVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("铂\u0001"));
        }
        if (list.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("铁\u0001"));
        }
        ArrayList arrayList = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).trim().isEmpty()) {
                throw new IllegalArgumentException(ProtectedSandApp.s("铀\u0001"));
            }
        }
        this.f82954b = eVar;
        this.f82955c = z4;
        this.f82956d = Collections.unmodifiableList(arrayList);
        this.f82957e = true;
        this.f82958f = net.time4j.format.g.SMART;
    }

    private static net.time4j.tz.p a(net.time4j.engine.p pVar, net.time4j.engine.d dVar) {
        net.time4j.engine.c<net.time4j.tz.k> cVar = net.time4j.format.a.f82782d;
        if (dVar.c(cVar)) {
            net.time4j.tz.k kVar = (net.time4j.tz.k) dVar.a(cVar);
            if (kVar instanceof net.time4j.tz.p) {
                return (net.time4j.tz.p) kVar;
            }
            if (kVar != null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("铃\u0001") + kVar.canonical() + ProtectedSandApp.s("铄\u0001") + pVar + ProtectedSandApp.s("铅\u0001"));
            }
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("铆\u0001") + pVar);
    }

    private static int b(CharSequence charSequence, int i4, net.time4j.format.g gVar) {
        int i5 = 0;
        int i6 = 0;
        while (i5 < 2) {
            int i7 = i4 + i5;
            char charAt = i7 >= charSequence.length() ? (char) 0 : charSequence.charAt(i7);
            if (charAt < '0' || charAt > '9') {
                return (i5 == 0 || gVar.isStrict()) ? androidx.core.app.k0.f25787v : ~i6;
            }
            i6 = (i6 * 10) + (charAt - '0');
            i5++;
        }
        return i6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f82954b == j0Var.f82954b && this.f82955c == j0Var.f82955c && this.f82956d.equals(j0Var.f82956d);
    }

    @Override // net.time4j.format.expert.i
    public net.time4j.engine.q<net.time4j.tz.k> getElement() {
        return f0.TIMEZONE_OFFSET;
    }

    public int hashCode() {
        return (this.f82956d.hashCode() * 31) + (this.f82954b.hashCode() * 7) + (this.f82955c ? 1 : 0);
    }

    @Override // net.time4j.format.expert.i
    public boolean isNumerical() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0178  */
    @Override // net.time4j.format.expert.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void parse(java.lang.CharSequence r17, net.time4j.format.expert.w r18, net.time4j.engine.d r19, net.time4j.format.expert.x<?> r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.format.expert.j0.parse(java.lang.CharSequence, net.time4j.format.expert.w, net.time4j.engine.d, net.time4j.format.expert.x, boolean):void");
    }

    @Override // net.time4j.format.expert.i
    public int print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar, Set<h> set, boolean z4) throws IOException {
        net.time4j.tz.p I;
        int i4;
        int i5;
        int length = appendable instanceof CharSequence ? ((CharSequence) appendable).length() : -1;
        net.time4j.tz.k v4 = pVar.e() ? pVar.v() : null;
        if (v4 == null) {
            I = a(pVar, dVar);
        } else if (v4 instanceof net.time4j.tz.p) {
            I = (net.time4j.tz.p) v4;
        } else {
            if (!(pVar instanceof net.time4j.base.f)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("铏\u0001") + pVar);
            }
            I = net.time4j.tz.l.c0(v4).I((net.time4j.base.f) pVar);
        }
        int i6 = I.i();
        int h4 = I.h();
        if ((i6 | h4) == 0) {
            String str = this.f82956d.get(0);
            appendable.append(str);
            i5 = str.length();
        } else {
            appendable.append((i6 < 0 || h4 < 0) ? '-' : '+');
            int abs = Math.abs(i6);
            int i7 = abs / MMKV.ExpireInHour;
            int i10 = (abs / 60) % 60;
            int i11 = abs % 60;
            if (i7 < 10) {
                appendable.append('0');
                i4 = 2;
            } else {
                i4 = 1;
            }
            String valueOf = String.valueOf(i7);
            appendable.append(valueOf);
            int length2 = valueOf.length() + i4;
            net.time4j.format.e eVar = this.f82954b;
            net.time4j.format.e eVar2 = net.time4j.format.e.SHORT;
            if (eVar != eVar2 || i10 != 0) {
                if (this.f82955c) {
                    appendable.append(':');
                    length2++;
                }
                if (i10 < 10) {
                    appendable.append('0');
                    length2++;
                }
                String valueOf2 = String.valueOf(i10);
                appendable.append(valueOf2);
                length2 += valueOf2.length();
                net.time4j.format.e eVar3 = this.f82954b;
                if (eVar3 != eVar2 && eVar3 != net.time4j.format.e.MEDIUM && (eVar3 == net.time4j.format.e.FULL || (i11 | h4) != 0)) {
                    if (this.f82955c) {
                        appendable.append(':');
                        length2++;
                    }
                    if (i11 < 10) {
                        appendable.append('0');
                        length2++;
                    }
                    String valueOf3 = String.valueOf(i11);
                    appendable.append(valueOf3);
                    int length3 = valueOf3.length() + length2;
                    if (h4 != 0) {
                        appendable.append('.');
                        int i12 = length3 + 1;
                        String valueOf4 = String.valueOf(Math.abs(h4));
                        int length4 = 9 - valueOf4.length();
                        for (int i13 = 0; i13 < length4; i13++) {
                            appendable.append('0');
                            i12++;
                        }
                        appendable.append(valueOf4);
                        i5 = valueOf4.length() + i12;
                    } else {
                        i5 = length3;
                    }
                }
            }
            i5 = length2;
        }
        if (length != -1 && i5 > 0 && set != null) {
            set.add(new h(f0.TIMEZONE_ID, length, length + i5));
        }
        return i5;
    }

    @Override // net.time4j.format.expert.i
    public i<net.time4j.tz.k> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i4) {
        return new j0(this.f82954b, this.f82955c, this.f82956d, ((Boolean) dVar.b(net.time4j.format.a.f82787i, Boolean.TRUE)).booleanValue(), (net.time4j.format.g) dVar.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        m2.a(j0.class, sb, ProtectedSandApp.s("铐\u0001"));
        sb.append(this.f82954b);
        sb.append(ProtectedSandApp.s("铑\u0001"));
        sb.append(this.f82955c);
        sb.append(ProtectedSandApp.s("铒\u0001"));
        return l6.a(sb, this.f82956d, ']');
    }

    @Override // net.time4j.format.expert.i
    public i<net.time4j.tz.k> withElement(net.time4j.engine.q<net.time4j.tz.k> qVar) {
        return this;
    }

    private j0() {
        this.f82954b = net.time4j.format.e.LONG;
        this.f82955c = true;
        this.f82956d = Collections.emptyList();
        this.f82957e = true;
        this.f82958f = net.time4j.format.g.SMART;
    }

    private j0(net.time4j.format.e eVar, boolean z4, List<String> list, boolean z5, net.time4j.format.g gVar) {
        this.f82954b = eVar;
        this.f82955c = z4;
        this.f82956d = list;
        this.f82957e = z5;
        this.f82958f = gVar;
    }
}
