package net.time4j.format.expert;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import net.time4j.format.a;

/* compiled from: FormatStep.java */
/* loaded from: classes7.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    private final i<?> f82943a;

    /* renamed from: b, reason: collision with root package name */
    private final int f82944b;

    /* renamed from: c, reason: collision with root package name */
    private final int f82945c;

    /* renamed from: d, reason: collision with root package name */
    private final b f82946d;

    /* renamed from: e, reason: collision with root package name */
    private final net.time4j.engine.d f82947e;

    /* renamed from: f, reason: collision with root package name */
    private final int f82948f;

    /* renamed from: g, reason: collision with root package name */
    private final int f82949g;

    /* renamed from: h, reason: collision with root package name */
    private final int f82950h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f82951i;

    /* renamed from: j, reason: collision with root package name */
    private final int f82952j;

    j(i<?> iVar, int i4, int i5, b bVar) {
        this(iVar, i4, i5, bVar, null, 0, 0, 0, false, -1);
    }

    private void a(CharSequence charSequence, w wVar, net.time4j.engine.d dVar, x<?> xVar, boolean z4) {
        int f4 = wVar.f();
        try {
            this.f82943a.parse(charSequence, wVar, dVar, xVar, z4);
        } catch (RuntimeException e4) {
            wVar.l(f4, e4.getMessage());
        }
    }

    private char c(net.time4j.engine.d dVar) {
        return ((Character) dVar.b(net.time4j.format.a.f82794p, ' ')).charValue();
    }

    private net.time4j.engine.d e(net.time4j.engine.d dVar) {
        b bVar = this.f82946d;
        return bVar == null ? dVar : new r(bVar, dVar);
    }

    private static boolean h(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    private boolean k(net.time4j.engine.p pVar) {
        net.time4j.engine.o<net.time4j.engine.p> f4;
        b bVar = this.f82946d;
        return bVar == null || (f4 = bVar.f()) == null || f4.test(pVar);
    }

    private boolean l(net.time4j.engine.d dVar) {
        return ((net.time4j.format.g) dVar.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART)).isStrict();
    }

    private String o() {
        return net.time4j.g0.a(this.f82943a.getElement(), new StringBuilder(ProtectedSandApp.s("铘\u0001")));
    }

    private String p() {
        return net.time4j.g0.a(this.f82943a.getElement(), new StringBuilder(ProtectedSandApp.s("铙\u0001")));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <V> i<V> w(i<V> iVar, net.time4j.engine.q<?> qVar) {
        if (iVar.getElement() == null) {
            return iVar;
        }
        if (iVar.getElement().getType() == qVar.getType() || (qVar instanceof pe.a)) {
            return iVar.withElement(qVar);
        }
        throw new IllegalArgumentException(net.time4j.g0.a(qVar, new StringBuilder(ProtectedSandApp.s("铚\u0001"))));
    }

    int b() {
        return this.f82944b;
    }

    i<?> d() {
        return this.f82943a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f82943a.equals(jVar.f82943a) && this.f82944b == jVar.f82944b && this.f82945c == jVar.f82945c && h(this.f82946d, jVar.f82946d) && h(this.f82947e, jVar.f82947e) && this.f82948f == jVar.f82948f && this.f82949g == jVar.f82949g && this.f82950h == jVar.f82950h && this.f82951i == jVar.f82951i && this.f82952j == jVar.f82952j;
    }

    int f() {
        return this.f82945c;
    }

    boolean g() {
        i<?> iVar = this.f82943a;
        return (iVar instanceof k) || (iVar instanceof g);
    }

    public int hashCode() {
        int hashCode = this.f82943a.hashCode() * 7;
        b bVar = this.f82946d;
        return ((bVar == null ? 0 : bVar.hashCode()) * 31) + hashCode;
    }

    boolean i() {
        return this.f82951i;
    }

    boolean j() {
        return this.f82943a.isNumerical();
    }

    j m(int i4) {
        if (this.f82951i) {
            return new j(this.f82943a, this.f82944b, this.f82945c, this.f82946d, this.f82947e, this.f82948f, this.f82949g, this.f82950h, true, i4);
        }
        throw new IllegalStateException(ProtectedSandApp.s("铛\u0001"));
    }

    j n(int i4, int i5) {
        return new j(this.f82943a, this.f82944b, this.f82945c, this.f82946d, null, this.f82948f, this.f82949g + i4, this.f82950h + i5, this.f82951i, this.f82952j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008a, code lost:
    
        r11 = r10.f82950h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008c, code lost:
    
        if (r11 <= 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008f, code lost:
    
        if ((r15 + r0) == r11) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        r12.l(r14 - r0, p());
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void q(java.lang.CharSequence r11, net.time4j.format.expert.w r12, net.time4j.engine.d r13, net.time4j.format.expert.x<?> r14, boolean r15) {
        /*
            r10 = this;
            if (r15 == 0) goto L6
            net.time4j.engine.d r13 = r10.f82947e
        L4:
            r3 = r13
            goto Lb
        L6:
            net.time4j.engine.d r13 = r10.e(r13)
            goto L4
        Lb:
            int r13 = r10.f82949g
            if (r13 != 0) goto L1c
            int r13 = r10.f82950h
            if (r13 != 0) goto L1c
            r0 = r10
            r1 = r11
            r2 = r12
            r4 = r14
            r5 = r15
            r0.a(r1, r2, r3, r4, r5)
            return
        L1c:
            boolean r13 = r10.l(r3)
            char r6 = r10.c(r3)
            int r7 = r12.f()
            int r8 = r11.length()
            r0 = r7
        L2d:
            if (r0 >= r8) goto L38
            char r1 = r11.charAt(r0)
            if (r1 != r6) goto L38
            int r0 = r0 + 1
            goto L2d
        L38:
            int r9 = r0 - r7
            if (r13 == 0) goto L48
            int r1 = r10.f82949g
            if (r9 <= r1) goto L48
            java.lang.String r11 = r10.o()
            r12.l(r7, r11)
            return
        L48:
            r12.m(r0)
            r0 = r10
            r1 = r11
            r2 = r12
            r4 = r14
            r5 = r15
            r0.a(r1, r2, r3, r4, r5)
            boolean r14 = r12.i()
            if (r14 == 0) goto L5a
            return
        L5a:
            int r14 = r12.f()
            int r15 = r14 - r7
            int r15 = r15 - r9
            if (r13 == 0) goto L72
            int r0 = r10.f82949g
            if (r0 <= 0) goto L72
            int r9 = r9 + r15
            if (r9 == r0) goto L72
            java.lang.String r11 = r10.p()
            r12.l(r7, r11)
            return
        L72:
            r0 = 0
        L73:
            if (r14 >= r8) goto L88
            if (r13 == 0) goto L7d
            int r1 = r15 + r0
            int r2 = r10.f82950h
            if (r1 >= r2) goto L88
        L7d:
            char r1 = r11.charAt(r14)
            if (r1 != r6) goto L88
            int r14 = r14 + 1
            int r0 = r0 + 1
            goto L73
        L88:
            if (r13 == 0) goto L9a
            int r11 = r10.f82950h
            if (r11 <= 0) goto L9a
            int r15 = r15 + r0
            if (r15 == r11) goto L9a
            int r14 = r14 - r0
            java.lang.String r11 = r10.p()
            r12.l(r14, r11)
            return
        L9a:
            r12.m(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.format.expert.j.q(java.lang.CharSequence, net.time4j.format.expert.w, net.time4j.engine.d, net.time4j.format.expert.x, boolean):void");
    }

    int r(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar, Set<h> set, boolean z4) throws IOException {
        StringBuilder sb;
        int i4;
        LinkedHashSet linkedHashSet;
        int i5;
        int length;
        if (!k(pVar)) {
            return 0;
        }
        net.time4j.engine.d e4 = z4 ? this.f82947e : e(dVar);
        if (this.f82949g == 0 && this.f82950h == 0) {
            return this.f82943a.print(pVar, appendable, e4, set, z4);
        }
        if (appendable instanceof StringBuilder) {
            sb = (StringBuilder) appendable;
            i4 = sb.length();
        } else {
            sb = new StringBuilder();
            i4 = -1;
        }
        if (!(appendable instanceof CharSequence) || set == null) {
            linkedHashSet = null;
            i5 = -1;
        } else {
            if (sb == appendable) {
                i<?> iVar = this.f82943a;
                if ((iVar instanceof f) || (iVar instanceof d0)) {
                    length = 0;
                    linkedHashSet = new LinkedHashSet();
                    i5 = length;
                }
            }
            length = ((CharSequence) appendable).length();
            linkedHashSet = new LinkedHashSet();
            i5 = length;
        }
        LinkedHashSet<h> linkedHashSet2 = linkedHashSet;
        boolean l4 = l(e4);
        char c5 = c(e4);
        int length2 = sb.length();
        this.f82943a.print(pVar, sb, e4, linkedHashSet2, z4);
        int length3 = sb.length() - length2;
        int i6 = this.f82949g;
        if (i6 <= 0) {
            if (l4 && length3 > this.f82950h) {
                throw new IllegalArgumentException(o());
            }
            if (i4 == -1) {
                appendable.append(sb);
            }
            while (length3 < this.f82950h) {
                appendable.append(c5);
                length3++;
            }
            if (i5 != -1) {
                for (h hVar : linkedHashSet2) {
                    set.add(new h(hVar.a(), hVar.c() + i5, hVar.b() + i5));
                }
            }
            return length3;
        }
        if (l4 && length3 > i6) {
            throw new IllegalArgumentException(o());
        }
        int i7 = length3;
        int i10 = 0;
        while (i7 < this.f82949g) {
            if (i4 == -1) {
                appendable.append(c5);
            } else {
                sb.insert(i4, c5);
            }
            i7++;
            i10++;
        }
        if (i4 == -1) {
            appendable.append(sb);
        }
        if (i5 != -1) {
            int i11 = i5 + i10;
            for (h hVar2 : linkedHashSet2) {
                set.add(new h(hVar2.a(), hVar2.c() + i11, hVar2.b() + i11));
            }
        }
        int i12 = this.f82950h;
        if (i12 <= 0) {
            return i7;
        }
        if (l4 && length3 > i12) {
            throw new IllegalArgumentException(o());
        }
        while (length3 < this.f82950h) {
            appendable.append(c5);
            length3++;
            i7++;
        }
        return i7;
    }

    j s(c<?> cVar) {
        b x4 = cVar.x();
        if (this.f82946d != null) {
            x4 = x4.l(new a.b().g(x4.e()).g(this.f82946d.e()).a());
        }
        b bVar = x4;
        return new j(this.f82943a.quickPath(cVar, bVar, this.f82948f), this.f82944b, this.f82945c, this.f82946d, bVar, this.f82948f, this.f82949g, this.f82950h, this.f82951i, this.f82952j);
    }

    j t(int i4) {
        return new j(this.f82943a, this.f82944b, this.f82945c, this.f82946d, null, this.f82948f + i4, this.f82949g, this.f82950h, this.f82951i, this.f82952j);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("铜\u0001"));
        sb.append(this.f82943a);
        sb.append(ProtectedSandApp.s("铝\u0001"));
        sb.append(this.f82944b);
        sb.append(ProtectedSandApp.s("铞\u0001"));
        sb.append(this.f82945c);
        if (this.f82946d != null) {
            sb.append(ProtectedSandApp.s("铟\u0001"));
            sb.append(this.f82946d);
        }
        sb.append(ProtectedSandApp.s("铠\u0001"));
        sb.append(this.f82948f);
        sb.append(ProtectedSandApp.s("铡\u0001"));
        sb.append(this.f82949g);
        sb.append(ProtectedSandApp.s("铢\u0001"));
        sb.append(this.f82950h);
        if (this.f82951i) {
            sb.append(ProtectedSandApp.s("铣\u0001"));
        }
        sb.append(']');
        return sb.toString();
    }

    int u() {
        return this.f82952j;
    }

    j v() {
        if (this.f82951i) {
            throw new IllegalStateException(ProtectedSandApp.s("铤\u0001"));
        }
        return new j(this.f82943a, this.f82944b, this.f82945c, this.f82946d, null, this.f82948f, this.f82949g, this.f82950h, true, -1);
    }

    j x(net.time4j.engine.q<?> qVar) {
        i<?> w4 = w(this.f82943a, qVar);
        return this.f82943a == w4 ? this : new j(w4, this.f82944b, this.f82945c, this.f82946d, this.f82947e, this.f82948f, this.f82949g, this.f82950h, this.f82951i, this.f82952j);
    }

    private j(i<?> iVar, int i4, int i5, b bVar, net.time4j.engine.d dVar, int i6, int i7, int i10, boolean z4, int i11) {
        if (iVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("铗\u0001"));
        }
        if (i4 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("铖\u0001"), i4));
        }
        if (i5 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("铕\u0001"), i5));
        }
        if (i6 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("铔\u0001"), i6));
        }
        String s4 = ProtectedSandApp.s("铓\u0001");
        if (i7 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(s4, i7));
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(s4, i10));
        }
        this.f82943a = iVar;
        this.f82944b = i4;
        this.f82945c = i5;
        this.f82946d = bVar;
        this.f82947e = dVar;
        this.f82948f = i6;
        this.f82949g = i7;
        this.f82950h = i10;
        this.f82951i = z4;
        this.f82952j = i11;
    }
}
