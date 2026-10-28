package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a0;
import kotlin.collections.b0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.types.e0;
import kotlin.reflect.jvm.internal.impl.types.e1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.t0;
import kotlin.reflect.jvm.internal.impl.types.t1;
import kotlin.reflect.jvm.internal.impl.types.w1;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: typeEnhancement.kt */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.c f24832a;

    /* compiled from: typeEnhancement.kt */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @d5.e
        private final h0 f24833a;

        /* renamed from: b, reason: collision with root package name */
        private final int f24834b;

        public a(@d5.e h0 h0Var, int i5) {
            this.f24833a = h0Var;
            this.f24834b = i5;
        }

        public final int a() {
            return this.f24834b;
        }

        @d5.e
        public final h0 b() {
            return this.f24833a;
        }
    }

    /* compiled from: typeEnhancement.kt */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        @d5.e
        private final p0 f24835a;

        /* renamed from: b, reason: collision with root package name */
        private final int f24836b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f24837c;

        public b(@d5.e p0 p0Var, int i5, boolean z5) {
            this.f24835a = p0Var;
            this.f24836b = i5;
            this.f24837c = z5;
        }

        public final boolean a() {
            return this.f24837c;
        }

        public final int b() {
            return this.f24836b;
        }

        @d5.e
        public final p0 c() {
            return this.f24835a;
        }
    }

    public d(@d5.d kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("䫳"));
        this.f24832a = cVar;
    }

    private final b b(p0 p0Var, q3.l<? super Integer, e> lVar, int i5, o oVar, boolean z5, boolean z6) {
        kotlin.reflect.jvm.internal.impl.descriptors.h f6;
        Boolean h5;
        h1 U0;
        int b02;
        int b03;
        c cVar;
        List Q;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g e6;
        int b04;
        int b05;
        boolean z7;
        boolean z8;
        a aVar;
        l1 s5;
        q3.l<? super Integer, e> lVar2 = lVar;
        boolean a6 = p.a(oVar);
        boolean z9 = (z6 && z5) ? false : true;
        h0 h0Var = null;
        if (!a6 && p0Var.S0().isEmpty()) {
            return new b(null, 1, false);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h b6 = p0Var.U0().b();
        if (b6 == null) {
            return new b(null, 1, false);
        }
        e N = lVar2.N(Integer.valueOf(i5));
        f6 = r.f(b6, N, oVar);
        h5 = r.h(N, oVar);
        if (f6 == null || (U0 = f6.m()) == null) {
            U0 = p0Var.U0();
        }
        h1 h1Var = U0;
        l0.o(h1Var, ProtectedSandApp.s("䫴"));
        int i6 = i5 + 1;
        List<l1> S0 = p0Var.S0();
        List<f1> r5 = h1Var.r();
        l0.o(r5, ProtectedSandApp.s("䫵"));
        Iterator<T> it = S0.iterator();
        Iterator<T> it2 = r5.iterator();
        b02 = b0.b0(S0, 10);
        b03 = b0.b0(r5, 10);
        ArrayList arrayList = new ArrayList(Math.min(b02, b03));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            f1 f1Var = (f1) it2.next();
            l1 l1Var = (l1) next;
            if (z9) {
                z8 = z9;
                if (!l1Var.c()) {
                    aVar = d(l1Var.getType().X0(), lVar2, i6, z6);
                } else if (lVar2.N(Integer.valueOf(i6)).d() == h.FORCE_FLEXIBILITY) {
                    w1 X0 = l1Var.getType().X0();
                    aVar = new a(i0.d(e0.c(X0).b1(false), e0.d(X0).b1(true)), 1);
                } else {
                    aVar = new a(null, 1);
                }
            } else {
                z8 = z9;
                aVar = new a(h0Var, 0);
            }
            i6 += aVar.a();
            h0 b7 = aVar.b();
            String s6 = ProtectedSandApp.s("䫶");
            if (b7 != null) {
                h0 b8 = aVar.b();
                x1 b9 = l1Var.b();
                l0.o(b9, s6);
                s5 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.f(b8, b9, f1Var);
            } else if (f6 == null || l1Var.c()) {
                s5 = f6 != null ? t1.s(f1Var) : null;
            } else {
                h0 type = l1Var.getType();
                l0.o(type, ProtectedSandApp.s("䫷"));
                x1 b10 = l1Var.b();
                l0.o(b10, s6);
                s5 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.f(type, b10, f1Var);
            }
            arrayList.add(s5);
            lVar2 = lVar;
            z9 = z8;
            h0Var = null;
        }
        int i7 = i6 - i5;
        if (f6 == null && h5 == null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (!(((l1) it3.next()) == null)) {
                        z7 = false;
                        break;
                    }
                }
            }
            z7 = true;
            if (z7) {
                return new b(null, i7, false);
            }
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g[] gVarArr = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.g[3];
        gVarArr[0] = p0Var.getAnnotations();
        cVar = r.f24907b;
        if (!(f6 != null)) {
            cVar = null;
        }
        gVarArr[1] = cVar;
        gVarArr[2] = h5 != null ? r.g() : null;
        Q = a0.Q(gVarArr);
        e6 = r.e(Q);
        d1 b11 = e1.b(e6);
        List<l1> S02 = p0Var.S0();
        Iterator it4 = arrayList.iterator();
        Iterator<T> it5 = S02.iterator();
        b04 = b0.b0(arrayList, 10);
        b05 = b0.b0(S02, 10);
        ArrayList arrayList2 = new ArrayList(Math.min(b04, b05));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            l1 l1Var2 = (l1) it5.next();
            l1 l1Var3 = (l1) next2;
            if (l1Var3 != null) {
                l1Var2 = l1Var3;
            }
            arrayList2.add(l1Var2);
        }
        p0 l5 = i0.l(b11, h1Var, arrayList2, h5 != null ? h5.booleanValue() : p0Var.V0(), null, 16, null);
        if (N.b()) {
            l5 = e(l5);
        }
        return new b(l5, i7, h5 != null && N.e());
    }

    static /* synthetic */ b c(d dVar, p0 p0Var, q3.l lVar, int i5, o oVar, boolean z5, boolean z6, int i6, Object obj) {
        return dVar.b(p0Var, lVar, i5, oVar, (i6 & 8) != 0 ? false : z5, (i6 & 16) != 0 ? false : z6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0096, code lost:
    
        if (r13 == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d.a d(kotlin.reflect.jvm.internal.impl.types.w1 r12, q3.l<? super java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e> r13, int r14, boolean r15) {
        /*
            r11 = this;
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.j0.a(r12)
            r1 = 0
            if (r0 == 0) goto Le
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$a r12 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$a
            r13 = 1
            r12.<init>(r1, r13)
            return r12
        Le:
            boolean r0 = r12 instanceof kotlin.reflect.jvm.internal.impl.types.b0
            if (r0 == 0) goto Lad
            boolean r0 = r12 instanceof kotlin.reflect.jvm.internal.impl.types.o0
            r9 = r12
            kotlin.reflect.jvm.internal.impl.types.b0 r9 = (kotlin.reflect.jvm.internal.impl.types.b0) r9
            kotlin.reflect.jvm.internal.impl.types.p0 r3 = r9.c1()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.o r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.o.FLEXIBLE_LOWER
            r2 = r11
            r4 = r13
            r5 = r14
            r7 = r0
            r8 = r15
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$b r10 = r2.b(r3, r4, r5, r6, r7, r8)
            kotlin.reflect.jvm.internal.impl.types.p0 r3 = r9.d1()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.o r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.o.FLEXIBLE_UPPER
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$b r13 = r2.b(r3, r4, r5, r6, r7, r8)
            r10.b()
            r13.b()
            kotlin.reflect.jvm.internal.impl.types.p0 r14 = r10.c()
            if (r14 != 0) goto L43
            kotlin.reflect.jvm.internal.impl.types.p0 r14 = r13.c()
            if (r14 != 0) goto L43
            goto La3
        L43:
            boolean r14 = r10.a()
            if (r14 != 0) goto L85
            boolean r14 = r13.a()
            if (r14 == 0) goto L50
            goto L85
        L50:
            if (r0 == 0) goto L6c
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.h r1 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.h
            kotlin.reflect.jvm.internal.impl.types.p0 r12 = r10.c()
            if (r12 != 0) goto L5e
            kotlin.reflect.jvm.internal.impl.types.p0 r12 = r9.c1()
        L5e:
            kotlin.reflect.jvm.internal.impl.types.p0 r13 = r13.c()
            if (r13 != 0) goto L68
            kotlin.reflect.jvm.internal.impl.types.p0 r13 = r9.d1()
        L68:
            r1.<init>(r12, r13)
            goto La3
        L6c:
            kotlin.reflect.jvm.internal.impl.types.p0 r12 = r10.c()
            if (r12 != 0) goto L76
            kotlin.reflect.jvm.internal.impl.types.p0 r12 = r9.c1()
        L76:
            kotlin.reflect.jvm.internal.impl.types.p0 r13 = r13.c()
            if (r13 != 0) goto L80
            kotlin.reflect.jvm.internal.impl.types.p0 r13 = r9.d1()
        L80:
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = kotlin.reflect.jvm.internal.impl.types.i0.d(r12, r13)
            goto La3
        L85:
            kotlin.reflect.jvm.internal.impl.types.p0 r13 = r13.c()
            if (r13 == 0) goto L98
            kotlin.reflect.jvm.internal.impl.types.p0 r14 = r10.c()
            if (r14 != 0) goto L92
            r14 = r13
        L92:
            kotlin.reflect.jvm.internal.impl.types.w1 r13 = kotlin.reflect.jvm.internal.impl.types.i0.d(r14, r13)
            if (r13 != 0) goto L9f
        L98:
            kotlin.reflect.jvm.internal.impl.types.p0 r13 = r10.c()
            kotlin.jvm.internal.l0.m(r13)
        L9f:
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = kotlin.reflect.jvm.internal.impl.types.v1.d(r12, r13)
        La3:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$a r12 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$a
            int r13 = r10.b()
            r12.<init>(r1, r13)
            goto Ldf
        Lad:
            boolean r0 = r12 instanceof kotlin.reflect.jvm.internal.impl.types.p0
            if (r0 == 0) goto Le0
            r2 = r12
            kotlin.reflect.jvm.internal.impl.types.p0 r2 = (kotlin.reflect.jvm.internal.impl.types.p0) r2
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.o r5 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.o.INFLEXIBLE
            r6 = 0
            r8 = 8
            r9 = 0
            r1 = r11
            r3 = r13
            r4 = r14
            r7 = r15
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$b r13 = c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$a r14 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$a
            boolean r15 = r13.a()
            if (r15 == 0) goto Ld3
            kotlin.reflect.jvm.internal.impl.types.p0 r15 = r13.c()
            kotlin.reflect.jvm.internal.impl.types.w1 r12 = kotlin.reflect.jvm.internal.impl.types.v1.d(r12, r15)
            goto Ld7
        Ld3:
            kotlin.reflect.jvm.internal.impl.types.p0 r12 = r13.c()
        Ld7:
            int r13 = r13.b()
            r14.<init>(r12, r13)
            r12 = r14
        Ldf:
            return r12
        Le0:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d.d(kotlin.reflect.jvm.internal.impl.types.w1, q3.l, int, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$a");
    }

    private final p0 e(p0 p0Var) {
        return this.f24832a.a() ? t0.h(p0Var, true) : new g(p0Var);
    }

    @d5.e
    public final h0 a(@d5.d h0 h0Var, @d5.d q3.l<? super Integer, e> lVar, boolean z5) {
        l0.p(h0Var, ProtectedSandApp.s("䫸"));
        l0.p(lVar, ProtectedSandApp.s("䫹"));
        return d(h0Var.X0(), lVar, 0, z5).b();
    }
}
