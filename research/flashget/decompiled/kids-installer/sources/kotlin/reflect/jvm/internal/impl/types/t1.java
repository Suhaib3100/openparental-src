package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: TypeUtils.java */
/* loaded from: classes5.dex */
public class t1 {

    /* renamed from: a, reason: collision with root package name */
    public static final p0 f26532a = kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.DONT_CARE, new String[0]);

    /* renamed from: b, reason: collision with root package name */
    public static final p0 f26533b = kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    public static final p0 f26534c = new a(ProtectedSandApp.s("埊"));

    /* renamed from: d, reason: collision with root package name */
    public static final p0 f26535d = new a(ProtectedSandApp.s("埋"));

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ boolean f26536e = false;

    /* compiled from: TypeUtils.java */
    /* loaded from: classes6.dex */
    public static class a extends s {

        /* renamed from: p, reason: collision with root package name */
        private final String f26537p;

        public a(String str) {
            this.f26537p = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x005a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static /* synthetic */ void g1(int r9) {
            /*
                r0 = 4
                r1 = 1
                if (r9 == r1) goto Ld
                if (r9 == r0) goto Ld
                java.lang.String r2 = "覔"
                java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
                goto L13
            Ld:
                java.lang.String r2 = "覕"
                java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            L13:
                r3 = 3
                r4 = 2
                if (r9 == r1) goto L1b
                if (r9 == r0) goto L1b
                r5 = r3
                goto L1c
            L1b:
                r5 = r4
            L1c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "視"
                java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
                r7 = 0
                if (r9 == r1) goto L48
                if (r9 == r4) goto L3f
                if (r9 == r3) goto L36
                if (r9 == r0) goto L48
                java.lang.String r8 = "覗"
                java.lang.String r8 = com.flashget.kidsdownloader.ProtectedSandApp.s(r8)
                r5[r7] = r8
                goto L4a
            L36:
                java.lang.String r8 = "覘"
                java.lang.String r8 = com.flashget.kidsdownloader.ProtectedSandApp.s(r8)
                r5[r7] = r8
                goto L4a
            L3f:
                java.lang.String r8 = "覙"
                java.lang.String r8 = com.flashget.kidsdownloader.ProtectedSandApp.s(r8)
                r5[r7] = r8
                goto L4a
            L48:
                r5[r7] = r6
            L4a:
                java.lang.String r7 = "覚"
                java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
                if (r9 == r1) goto L5a
                if (r9 == r0) goto L57
                r5[r1] = r6
                goto L62
            L57:
                r5[r1] = r7
                goto L62
            L5a:
                java.lang.String r6 = "覛"
                java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
                r5[r1] = r6
            L62:
                if (r9 == r1) goto L7e
                if (r9 == r4) goto L76
                if (r9 == r3) goto L73
                if (r9 == r0) goto L7e
                java.lang.String r3 = "覜"
                java.lang.String r3 = com.flashget.kidsdownloader.ProtectedSandApp.s(r3)
                r5[r4] = r3
                goto L7e
            L73:
                r5[r4] = r7
                goto L7e
            L76:
                java.lang.String r3 = "覝"
                java.lang.String r3 = com.flashget.kidsdownloader.ProtectedSandApp.s(r3)
                r5[r4] = r3
            L7e:
                java.lang.String r2 = java.lang.String.format(r2, r5)
                if (r9 == r1) goto L8c
                if (r9 == r0) goto L8c
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                r9.<init>(r2)
                goto L91
            L8c:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>(r2)
            L91:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.t1.a.g1(int):void");
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.w1
        @d5.d
        public p0 b1(boolean z5) {
            throw new IllegalStateException(this.f26537p);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.w1
        @d5.d
        /* renamed from: c1 */
        public p0 a1(@d5.d d1 d1Var) {
            if (d1Var == null) {
                g1(0);
            }
            throw new IllegalStateException(this.f26537p);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.s
        @d5.d
        protected p0 d1() {
            throw new IllegalStateException(this.f26537p);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.s
        @d5.d
        public s f1(@d5.d p0 p0Var) {
            if (p0Var == null) {
                g1(2);
            }
            throw new IllegalStateException(this.f26537p);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.s
        @d5.d
        /* renamed from: h1, reason: merged with bridge method [inline-methods] */
        public a e1(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            if (gVar == null) {
                g1(3);
            }
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.p0
        @d5.d
        public String toString() {
            String str = this.f26537p;
            if (str == null) {
                g1(1);
            }
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void a(int r24) {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.t1.a(int):void");
    }

    public static boolean b(@d5.d h0 h0Var) {
        if (h0Var == null) {
            a(28);
        }
        if (h0Var.V0()) {
            return true;
        }
        return e0.b(h0Var) && b(e0.a(h0Var).d1());
    }

    public static boolean c(@d5.e h0 h0Var, @d5.d q3.l<w1, Boolean> lVar) {
        if (lVar == null) {
            a(43);
        }
        return d(h0Var, lVar, null);
    }

    private static boolean d(@d5.e h0 h0Var, @d5.d q3.l<w1, Boolean> lVar, kotlin.reflect.jvm.internal.impl.utils.f<h0> fVar) {
        if (lVar == null) {
            a(44);
        }
        if (h0Var == null) {
            return false;
        }
        w1 X0 = h0Var.X0();
        if (w(h0Var)) {
            return lVar.N(X0).booleanValue();
        }
        if (fVar != null && fVar.contains(h0Var)) {
            return false;
        }
        if (lVar.N(X0).booleanValue()) {
            return true;
        }
        if (fVar == null) {
            fVar = kotlin.reflect.jvm.internal.impl.utils.f.b();
        }
        fVar.add(h0Var);
        b0 b0Var = X0 instanceof b0 ? (b0) X0 : null;
        if (b0Var != null && (d(b0Var.c1(), lVar, fVar) || d(b0Var.d1(), lVar, fVar))) {
            return true;
        }
        if ((X0 instanceof q) && d(((q) X0).g1(), lVar, fVar)) {
            return true;
        }
        h1 U0 = h0Var.U0();
        if (U0 instanceof g0) {
            Iterator<h0> it = ((g0) U0).m().iterator();
            while (it.hasNext()) {
                if (d(it.next(), lVar, fVar)) {
                    return true;
                }
            }
            return false;
        }
        for (l1 l1Var : h0Var.S0()) {
            if (!l1Var.c() && d(l1Var.getType(), lVar, fVar)) {
                return true;
            }
        }
        return false;
    }

    @d5.e
    public static h0 e(@d5.d h0 h0Var, @d5.d h0 h0Var2, @d5.d q1 q1Var) {
        if (h0Var == null) {
            a(20);
        }
        if (h0Var2 == null) {
            a(21);
        }
        if (q1Var == null) {
            a(22);
        }
        h0 p5 = q1Var.p(h0Var2, x1.INVARIANT);
        if (p5 != null) {
            return q(p5, h0Var.V0());
        }
        return null;
    }

    @d5.e
    public static kotlin.reflect.jvm.internal.impl.descriptors.e f(@d5.d h0 h0Var) {
        if (h0Var == null) {
            a(30);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h b6 = h0Var.U0().b();
        if (b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.e) b6;
        }
        return null;
    }

    @d5.d
    public static List<l1> g(@d5.d List<kotlin.reflect.jvm.internal.impl.descriptors.f1> list) {
        List<l1> V5;
        if (list == null) {
            a(16);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.f1> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new n1(it.next().E()));
        }
        V5 = kotlin.collections.j0.V5(arrayList);
        if (V5 == null) {
            a(17);
        }
        return V5;
    }

    @d5.d
    public static List<h0> h(@d5.d h0 h0Var) {
        if (h0Var == null) {
            a(18);
        }
        q1 f6 = q1.f(h0Var);
        Collection<h0> m5 = h0Var.U0().m();
        ArrayList arrayList = new ArrayList(m5.size());
        Iterator<h0> it = m5.iterator();
        while (it.hasNext()) {
            h0 e6 = e(h0Var, it.next(), f6);
            if (e6 != null) {
                arrayList.add(e6);
            }
        }
        return arrayList;
    }

    @d5.e
    public static kotlin.reflect.jvm.internal.impl.descriptors.f1 i(@d5.d h0 h0Var) {
        if (h0Var == null) {
            a(63);
        }
        if (h0Var.U0().b() instanceof kotlin.reflect.jvm.internal.impl.descriptors.f1) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.f1) h0Var.U0().b();
        }
        return null;
    }

    public static boolean j(@d5.d h0 h0Var) {
        if (h0Var == null) {
            a(29);
        }
        if (h0Var.U0().b() instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            return false;
        }
        Iterator<h0> it = h(h0Var).iterator();
        while (it.hasNext()) {
            if (l(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(@d5.e h0 h0Var) {
        return h0Var != null && h0Var.U0() == f26532a.U0();
    }

    public static boolean l(@d5.d h0 h0Var) {
        if (h0Var == null) {
            a(27);
        }
        if (h0Var.V0()) {
            return true;
        }
        if (e0.b(h0Var) && l(e0.a(h0Var).d1())) {
            return true;
        }
        if (t0.c(h0Var)) {
            return false;
        }
        if (m(h0Var)) {
            return j(h0Var);
        }
        if (h0Var instanceof f) {
            kotlin.reflect.jvm.internal.impl.descriptors.f1 c6 = ((f) h0Var).d1().c();
            return c6 == null || j(c6.E());
        }
        h1 U0 = h0Var.U0();
        if (U0 instanceof g0) {
            Iterator<h0> it = U0.m().iterator();
            while (it.hasNext()) {
                if (l(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean m(@d5.d h0 h0Var) {
        if (h0Var == null) {
            a(60);
        }
        return i(h0Var) != null || (h0Var.U0() instanceof kotlin.reflect.jvm.internal.impl.types.checker.n);
    }

    @d5.d
    public static h0 n(@d5.d h0 h0Var) {
        if (h0Var == null) {
            a(2);
        }
        return p(h0Var, false);
    }

    @d5.d
    public static h0 o(@d5.d h0 h0Var) {
        if (h0Var == null) {
            a(1);
        }
        return p(h0Var, true);
    }

    @d5.d
    public static h0 p(@d5.d h0 h0Var, boolean z5) {
        if (h0Var == null) {
            a(3);
        }
        w1 b12 = h0Var.X0().b1(z5);
        if (b12 == null) {
            a(4);
        }
        return b12;
    }

    @d5.d
    public static h0 q(@d5.d h0 h0Var, boolean z5) {
        if (h0Var == null) {
            a(8);
        }
        if (z5) {
            return o(h0Var);
        }
        if (h0Var == null) {
            a(9);
        }
        return h0Var;
    }

    @d5.d
    public static p0 r(@d5.d p0 p0Var, boolean z5) {
        if (p0Var == null) {
            a(5);
        }
        if (!z5) {
            if (p0Var == null) {
                a(7);
            }
            return p0Var;
        }
        p0 b12 = p0Var.b1(true);
        if (b12 == null) {
            a(6);
        }
        return b12;
    }

    @d5.d
    public static l1 s(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var) {
        if (f1Var == null) {
            a(45);
        }
        return new v0(f1Var);
    }

    @d5.d
    public static l1 t(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var, z zVar) {
        if (f1Var == null) {
            a(46);
        }
        return zVar.b() == s1.SUPERTYPE ? new n1(w0.b(f1Var)) : new v0(f1Var);
    }

    @d5.d
    public static p0 u(kotlin.reflect.jvm.internal.impl.descriptors.h hVar, kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar2, q3.l<kotlin.reflect.jvm.internal.impl.types.checker.g, p0> lVar) {
        if (!kotlin.reflect.jvm.internal.impl.types.error.k.m(hVar)) {
            return v(hVar.m(), hVar2, lVar);
        }
        kotlin.reflect.jvm.internal.impl.types.error.h d6 = kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.UNABLE_TO_SUBSTITUTE_TYPE, hVar.toString());
        if (d6 == null) {
            a(11);
        }
        return d6;
    }

    @d5.d
    public static p0 v(@d5.d h1 h1Var, @d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar, @d5.d q3.l<kotlin.reflect.jvm.internal.impl.types.checker.g, p0> lVar) {
        if (h1Var == null) {
            a(12);
        }
        if (hVar == null) {
            a(13);
        }
        if (lVar == null) {
            a(14);
        }
        List<l1> g5 = g(h1Var.r());
        d1.f26381p.getClass();
        p0 n5 = i0.n(d1.f26382q, h1Var, g5, false, hVar, lVar);
        if (n5 == null) {
            a(15);
        }
        return n5;
    }

    public static boolean w(@d5.d h0 h0Var) {
        if (h0Var == null) {
            a(0);
        }
        return h0Var == f26534c || h0Var == f26535d;
    }
}
