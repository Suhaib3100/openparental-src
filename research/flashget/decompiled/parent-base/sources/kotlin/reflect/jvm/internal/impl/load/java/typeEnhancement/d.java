package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
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
@r1({"SMAP\ntypeEnhancement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/JavaTypeEnhancement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,262:1\n1#2:263\n3433#3,7:264\n1726#3,3:271\n3433#3,7:274\n*S KotlinDebug\n*F\n+ 1 typeEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/JavaTypeEnhancement\n*L\n117#1:264,7\n143#1:271,3\n155#1:274,7\n*E\n"})
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.c f76708a;

    /* compiled from: typeEnhancement.kt */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @fg.m
        private final h0 f76709a;

        /* renamed from: b, reason: collision with root package name */
        private final int f76710b;

        public a(@fg.m h0 h0Var, int i4) {
            this.f76709a = h0Var;
            this.f76710b = i4;
        }

        public final int a() {
            return this.f76710b;
        }

        @fg.m
        public final h0 b() {
            return this.f76709a;
        }
    }

    /* compiled from: typeEnhancement.kt */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        @fg.m
        private final p0 f76711a;

        /* renamed from: b, reason: collision with root package name */
        private final int f76712b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f76713c;

        public b(@fg.m p0 p0Var, int i4, boolean z4) {
            this.f76711a = p0Var;
            this.f76712b = i4;
            this.f76713c = z4;
        }

        public final boolean a() {
            return this.f76713c;
        }

        public final int b() {
            return this.f76712b;
        }

        @fg.m
        public final p0 c() {
            return this.f76711a;
        }
    }

    public d(@fg.l kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("犘\u0001"));
        this.f76708a = cVar;
    }

    private final b b(p0 p0Var, ld.l<? super Integer, e> lVar, int i4, o oVar, boolean z4, boolean z5) {
        kotlin.reflect.jvm.internal.impl.descriptors.h f4;
        Boolean h4;
        h1 O0;
        c cVar;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g e4;
        boolean z6;
        a aVar;
        l1 s4;
        ld.l<? super Integer, e> lVar2 = lVar;
        boolean a5 = p.a(oVar);
        boolean z7 = (z5 && z4) ? false : true;
        h0 h0Var = null;
        if (!a5 && p0Var.M0().isEmpty()) {
            return new b(null, 1, false);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h c5 = p0Var.O0().c();
        if (c5 == null) {
            return new b(null, 1, false);
        }
        e invoke = lVar2.invoke(Integer.valueOf(i4));
        f4 = r.f(c5, invoke, oVar);
        h4 = r.h(invoke, oVar);
        if (f4 == null || (O0 = f4.j()) == null) {
            O0 = p0Var.O0();
        }
        h1 h1Var = O0;
        l0.m(h1Var);
        int i5 = i4 + 1;
        List<l1> M0 = p0Var.M0();
        List<f1> parameters = h1Var.getParameters();
        l0.o(parameters, ProtectedSandApp.s("犙\u0001"));
        List<f1> list = parameters;
        Iterator<T> it = M0.iterator();
        Iterator<T> it2 = list.iterator();
        ArrayList arrayList = new ArrayList(Math.min(w.b0(M0, 10), w.b0(list, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            f1 f1Var = (f1) it2.next();
            l1 l1Var = (l1) next;
            if (z7) {
                z6 = z7;
                if (!l1Var.b()) {
                    aVar = d(l1Var.getType().R0(), lVar2, i5, z5);
                } else if (lVar2.invoke(Integer.valueOf(i5)).d() == h.FORCE_FLEXIBILITY) {
                    w1 R0 = l1Var.getType().R0();
                    aVar = new a(i0.d(e0.c(R0).V0(false), e0.d(R0).V0(true)), 1);
                } else {
                    aVar = new a(null, 1);
                }
            } else {
                z6 = z7;
                aVar = new a(h0Var, 0);
            }
            i5 += aVar.a();
            h0 b5 = aVar.b();
            String s5 = ProtectedSandApp.s("犚\u0001");
            if (b5 != null) {
                h0 b6 = aVar.b();
                x1 c6 = l1Var.c();
                l0.o(c6, s5);
                s4 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.f(b6, c6, f1Var);
            } else if (f4 == null || l1Var.b()) {
                s4 = f4 != null ? t1.s(f1Var) : null;
            } else {
                h0 type = l1Var.getType();
                l0.o(type, ProtectedSandApp.s("犛\u0001"));
                x1 c7 = l1Var.c();
                l0.o(c7, s5);
                s4 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.f(type, c7, f1Var);
            }
            arrayList.add(s4);
            lVar2 = lVar;
            z7 = z6;
            h0Var = null;
        }
        int i6 = i5 - i4;
        if (f4 == null && h4 == null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (((l1) it3.next()) == null) {
                    }
                }
            }
            return new b(null, i6, false);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = p0Var.getAnnotations();
        cVar = r.f76783b;
        if (f4 == null) {
            cVar = null;
        }
        boolean z10 = false;
        e4 = r.e(w.Q(annotations, cVar, h4 != null ? r.g() : null));
        d1 b7 = e1.b(e4);
        List<l1> M02 = p0Var.M0();
        Iterator it4 = arrayList.iterator();
        Iterator<T> it5 = M02.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(w.b0(arrayList, 10), w.b0(M02, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            l1 l1Var2 = (l1) it5.next();
            l1 l1Var3 = (l1) next2;
            if (l1Var3 != null) {
                l1Var2 = l1Var3;
            }
            arrayList2.add(l1Var2);
        }
        p0 l4 = i0.l(b7, h1Var, arrayList2, h4 != null ? h4.booleanValue() : p0Var.P0(), null, 16, null);
        if (invoke.b()) {
            l4 = e(l4);
        }
        if (h4 != null && invoke.e()) {
            z10 = true;
        }
        return new b(l4, i6, z10);
    }

    static /* synthetic */ b c(d dVar, p0 p0Var, ld.l lVar, int i4, o oVar, boolean z4, boolean z5, int i5, Object obj) {
        return dVar.b(p0Var, lVar, i4, oVar, (i5 & 8) != 0 ? false : z4, (i5 & 16) != 0 ? false : z5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0096, code lost:
    
        if (r13 == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d.a d(kotlin.reflect.jvm.internal.impl.types.w1 r12, ld.l<? super java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e> r13, int r14, boolean r15) {
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
            kotlin.reflect.jvm.internal.impl.types.p0 r3 = r9.W0()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.o r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.o.FLEXIBLE_LOWER
            r2 = r11
            r4 = r13
            r5 = r14
            r7 = r0
            r8 = r15
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$b r10 = r2.b(r3, r4, r5, r6, r7, r8)
            kotlin.reflect.jvm.internal.impl.types.p0 r3 = r9.X0()
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
            kotlin.reflect.jvm.internal.impl.types.p0 r12 = r9.W0()
        L5e:
            kotlin.reflect.jvm.internal.impl.types.p0 r13 = r13.c()
            if (r13 != 0) goto L68
            kotlin.reflect.jvm.internal.impl.types.p0 r13 = r9.X0()
        L68:
            r1.<init>(r12, r13)
            goto La3
        L6c:
            kotlin.reflect.jvm.internal.impl.types.p0 r12 = r10.c()
            if (r12 != 0) goto L76
            kotlin.reflect.jvm.internal.impl.types.p0 r12 = r9.W0()
        L76:
            kotlin.reflect.jvm.internal.impl.types.p0 r13 = r13.c()
            if (r13 != 0) goto L80
            kotlin.reflect.jvm.internal.impl.types.p0 r13 = r9.X0()
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
            r8 = 8
            r9 = 0
            r6 = 0
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d.d(kotlin.reflect.jvm.internal.impl.types.w1, ld.l, int, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$a");
    }

    private final p0 e(p0 p0Var) {
        return this.f76708a.a() ? t0.h(p0Var, true) : new g(p0Var);
    }

    @fg.m
    public final h0 a(@fg.l h0 h0Var, @fg.l ld.l<? super Integer, e> lVar, boolean z4) {
        l0.p(h0Var, ProtectedSandApp.s("犜\u0001"));
        l0.p(lVar, ProtectedSandApp.s("犝\u0001"));
        return d(h0Var.R0(), lVar, 0, z4).b();
    }
}
