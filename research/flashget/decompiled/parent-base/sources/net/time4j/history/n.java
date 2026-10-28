package net.time4j.history;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewYearRule.java */
/* loaded from: classes7.dex */
public abstract class n {
    private static final /* synthetic */ n[] $VALUES;
    public static final n BEGIN_OF_JANUARY;
    public static final n BEGIN_OF_MARCH;
    public static final n BEGIN_OF_SEPTEMBER;
    public static final n CALCULUS_PISANUS;
    public static final n CHRISTMAS_STYLE;
    private static final int COUNCIL_OF_TOURS = 567;
    public static final n EASTER_STYLE;
    public static final n EPIPHANY;
    public static final n GOOD_FRIDAY;
    public static final n MARIA_ANUNCIATA;

    /* compiled from: NewYearRule.java */
    enum a extends n {
        a(String str, int i4) {
            super(str, i4, null);
        }

        @Override // net.time4j.history.n
        int displayedYear(o oVar, net.time4j.history.h hVar) {
            return hVar.e();
        }

        @Override // net.time4j.history.n
        net.time4j.history.h newYear(j jVar, int i4) {
            return net.time4j.history.h.g(jVar, i4, 1, 1);
        }
    }

    static {
        a aVar = new a(ProtectedSandApp.s("隶\u0001"), 0);
        BEGIN_OF_JANUARY = aVar;
        n nVar = new n(ProtectedSandApp.s("隷\u0001"), 1) { // from class: net.time4j.history.n.b
            {
                a aVar2 = null;
            }

            @Override // net.time4j.history.n
            net.time4j.history.h newYear(j jVar, int i4) {
                return net.time4j.history.h.g(jVar, i4, 3, 1);
            }
        };
        BEGIN_OF_MARCH = nVar;
        n nVar2 = new n(ProtectedSandApp.s("隸\u0001"), 2) { // from class: net.time4j.history.n.c
            {
                a aVar2 = null;
            }

            @Override // net.time4j.history.n
            int displayedYear(o oVar, net.time4j.history.h hVar) {
                j c5 = hVar.c();
                int e4 = hVar.e();
                int i4 = e4 + 1;
                return hVar.compareTo(oVar.d(c5, i4)) >= 0 ? i4 : e4;
            }

            @Override // net.time4j.history.n
            net.time4j.history.h newYear(j jVar, int i4) {
                return net.time4j.history.h.g(jVar, i4 - 1, 9, 1);
            }
        };
        BEGIN_OF_SEPTEMBER = nVar2;
        n nVar3 = new n(ProtectedSandApp.s("隹\u0001"), 3) { // from class: net.time4j.history.n.d
            {
                a aVar2 = null;
            }

            @Override // net.time4j.history.n
            int displayedYear(o oVar, net.time4j.history.h hVar) {
                int e4 = hVar.e();
                int i4 = e4 + 1;
                return hVar.compareTo(oVar.d(hVar.c(), i4)) >= 0 ? i4 : e4;
            }

            @Override // net.time4j.history.n
            net.time4j.history.h newYear(j jVar, int i4) {
                return net.time4j.history.h.g(jVar, i4 - 1, 12, 25);
            }
        };
        CHRISTMAS_STYLE = nVar3;
        n nVar4 = new n(ProtectedSandApp.s("隺\u0001"), 4) { // from class: net.time4j.history.n.e
            {
                a aVar2 = null;
            }

            @Override // net.time4j.history.n
            net.time4j.history.h newYear(j jVar, int i4) {
                int i5;
                int marchDay = net.time4j.history.e.EASTERN.marchDay(jVar.annoDomini(i4));
                int i6 = marchDay - 1;
                if (i6 > 31) {
                    i6 = marchDay - 32;
                    i5 = 4;
                } else {
                    i5 = 3;
                }
                return net.time4j.history.h.g(jVar, i4, i5, i6);
            }
        };
        EASTER_STYLE = nVar4;
        n nVar5 = new n(ProtectedSandApp.s("隻\u0001"), 5) { // from class: net.time4j.history.n.f
            {
                a aVar2 = null;
            }

            @Override // net.time4j.history.n
            net.time4j.history.h newYear(j jVar, int i4) {
                int i5;
                int marchDay = net.time4j.history.e.EASTERN.marchDay(jVar.annoDomini(i4));
                int i6 = marchDay - 2;
                if (i6 > 31) {
                    i6 = marchDay - 33;
                    i5 = 4;
                } else {
                    i5 = 3;
                }
                return net.time4j.history.h.g(jVar, i4, i5, i6);
            }
        };
        GOOD_FRIDAY = nVar5;
        n nVar6 = new n(ProtectedSandApp.s("隼\u0001"), 6) { // from class: net.time4j.history.n.g
            {
                a aVar2 = null;
            }

            @Override // net.time4j.history.n
            net.time4j.history.h newYear(j jVar, int i4) {
                return net.time4j.history.h.g(jVar, i4, 3, 25);
            }
        };
        MARIA_ANUNCIATA = nVar6;
        n nVar7 = new n(ProtectedSandApp.s("隽\u0001"), 7) { // from class: net.time4j.history.n.h
            {
                a aVar2 = null;
            }

            @Override // net.time4j.history.n
            int displayedYear(o oVar, net.time4j.history.h hVar) {
                int e4 = hVar.e();
                int i4 = e4 - 1;
                return hVar.compareTo(newYear(hVar.c(), i4)) < 0 ? e4 - 2 : i4;
            }

            @Override // net.time4j.history.n
            net.time4j.history.h newYear(j jVar, int i4) {
                return n.MARIA_ANUNCIATA.newYear(jVar, i4 + 1);
            }

            @Override // net.time4j.history.n
            int standardYear(boolean z4, o oVar, j jVar, int i4, int i5, int i6) {
                return n.MARIA_ANUNCIATA.standardYear(z4, oVar, jVar, i4 + 1, i5, i6);
            }
        };
        CALCULUS_PISANUS = nVar7;
        n nVar8 = new n(ProtectedSandApp.s("难\u0001"), 8) { // from class: net.time4j.history.n.i
            {
                a aVar2 = null;
            }

            @Override // net.time4j.history.n
            net.time4j.history.h newYear(j jVar, int i4) {
                return net.time4j.history.h.g(jVar, i4, 1, 6);
            }
        };
        EPIPHANY = nVar8;
        $VALUES = new n[]{aVar, nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8};
    }

    private n(String str, int i4) {
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    int displayedYear(o oVar, net.time4j.history.h hVar) {
        int e4 = hVar.e();
        return hVar.compareTo(newYear(hVar.c(), e4)) < 0 ? e4 - 1 : e4;
    }

    abstract net.time4j.history.h newYear(j jVar, int i4);

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r7.a(r6) >= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r9 > r8) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (r5 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        throw new java.lang.IllegalArgumentException(com.flashget.parentalcontrol.ProtectedSandApp.s("隿\u0001") + r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0042, code lost:
    
        if (r2.a(r6) >= 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    int standardYear(boolean r5, net.time4j.history.o r6, net.time4j.history.j r7, int r8, int r9, int r10) {
        /*
            r4 = this;
            r0 = 5
            if (r9 < r0) goto L8
            r0 = 8
            if (r9 > r0) goto L8
            return r8
        L8:
            net.time4j.history.h r0 = r4.newYear(r7, r8)
            int r1 = r8 + 1
            net.time4j.history.h r6 = r6.d(r7, r1)
            net.time4j.history.h r2 = net.time4j.history.h.g(r7, r8, r9, r10)
            r3 = 4
            if (r9 > r3) goto L2f
            net.time4j.history.h r7 = net.time4j.history.h.g(r7, r1, r9, r10)
            int r9 = r2.compareTo(r0)
            if (r9 < 0) goto L25
            r9 = r8
            goto L26
        L25:
            r9 = r1
        L26:
            int r6 = r7.compareTo(r6)
            if (r6 < 0) goto L2d
            goto L45
        L2d:
            r8 = r1
            goto L45
        L2f:
            int r1 = r8 + (-1)
            net.time4j.history.h r7 = net.time4j.history.h.g(r7, r1, r9, r10)
            int r7 = r7.compareTo(r0)
            if (r7 < 0) goto L3d
            r9 = r1
            goto L3e
        L3d:
            r9 = r8
        L3e:
            int r6 = r2.compareTo(r6)
            if (r6 < 0) goto L45
            goto L2d
        L45:
            if (r9 > r8) goto L4b
            if (r5 == 0) goto L4a
            r8 = r9
        L4a:
            return r8
        L4b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "隿\u0001"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.history.n.standardYear(boolean, net.time4j.history.o, net.time4j.history.j, int, int, int):int");
    }

    public o until(int i4) {
        if (i4 <= COUNCIL_OF_TOURS) {
            throw new IllegalArgumentException(ProtectedSandApp.s("雀\u0001"));
        }
        o oVar = new o(this, i4);
        n nVar = BEGIN_OF_JANUARY;
        return this != nVar ? new o(nVar, COUNCIL_OF_TOURS).b(oVar) : oVar;
    }

    /* synthetic */ n(String str, int i4, a aVar) {
        this(str, i4);
    }
}
