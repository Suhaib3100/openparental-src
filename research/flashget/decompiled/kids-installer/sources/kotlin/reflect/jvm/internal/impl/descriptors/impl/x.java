package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;

/* compiled from: ModuleDescriptorImpl.kt */
/* loaded from: classes6.dex */
public final class x extends j implements kotlin.reflect.jvm.internal.impl.descriptors.h0 {

    @d5.d
    private final Lazy A;

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.n f24307q;

    /* renamed from: r, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.builtins.h f24308r;

    /* renamed from: s, reason: collision with root package name */
    @d5.e
    private final d4.c f24309s;

    /* renamed from: t, reason: collision with root package name */
    @d5.e
    private final kotlin.reflect.jvm.internal.impl.name.f f24310t;

    /* renamed from: u, reason: collision with root package name */
    @d5.d
    private final Map<kotlin.reflect.jvm.internal.impl.descriptors.g0<?>, Object> f24311u;

    /* renamed from: v, reason: collision with root package name */
    @d5.d
    private final a0 f24312v;

    /* renamed from: w, reason: collision with root package name */
    @d5.e
    private v f24313w;

    /* renamed from: x, reason: collision with root package name */
    @d5.e
    private kotlin.reflect.jvm.internal.impl.descriptors.m0 f24314x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f24315y;

    /* renamed from: z, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.c, q0> f24316z;

    /* compiled from: ModuleDescriptorImpl.kt */
    static final class a extends Lambda implements q3.a<i> {
        a() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i n() {
            int b02;
            v vVar = x.this.f24313w;
            x xVar = x.this;
            if (vVar == null) {
                throw new AssertionError(ProtectedSandApp.s("茁") + xVar.W0() + ProtectedSandApp.s("茂"));
            }
            List<x> a6 = vVar.a();
            x.this.V0();
            a6.contains(x.this);
            Iterator<T> it = a6.iterator();
            while (it.hasNext()) {
                ((x) it.next()).a1();
            }
            b02 = kotlin.collections.b0.b0(a6, 10);
            ArrayList arrayList = new ArrayList(b02);
            Iterator<T> it2 = a6.iterator();
            while (it2.hasNext()) {
                kotlin.reflect.jvm.internal.impl.descriptors.m0 m0Var = ((x) it2.next()).f24314x;
                kotlin.jvm.internal.l0.m(m0Var);
                arrayList.add(m0Var);
            }
            return new i(arrayList, ProtectedSandApp.s("茀") + x.this.getName());
        }
    }

    /* compiled from: ModuleDescriptorImpl.kt */
    static final class b extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.name.c, q0> {
        b() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q0 N(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
            kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("范"));
            a0 a0Var = x.this.f24312v;
            x xVar = x.this;
            return a0Var.a(xVar, cVar, xVar.f24307q);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @p3.j
    public x(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar, @d5.d kotlin.reflect.jvm.internal.impl.builtins.h hVar, @d5.e d4.c cVar) {
        this(fVar, nVar, hVar, cVar, null, null, 48, null);
        kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("茄"));
        kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("茅"));
        kotlin.jvm.internal.l0.p(hVar, ProtectedSandApp.s("茆"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String W0() {
        String fVar = getName().toString();
        kotlin.jvm.internal.l0.o(fVar, ProtectedSandApp.s("茌"));
        return fVar;
    }

    private final i Y0() {
        return (i) this.A.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a1() {
        return this.f24314x != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.builtins.h A() {
        return this.f24308r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    @d5.d
    public List<kotlin.reflect.jvm.internal.impl.descriptors.h0> A0() {
        v vVar = this.f24313w;
        if (vVar != null) {
            return vVar.c();
        }
        throw new AssertionError(androidx.concurrent.futures.a.a(new StringBuilder(ProtectedSandApp.s("茍")), W0(), ProtectedSandApp.s("茎")));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    @d5.e
    public <T> T P0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.g0<T> g0Var) {
        kotlin.jvm.internal.l0.p(g0Var, ProtectedSandApp.s("茏"));
        T t5 = (T) this.f24311u.get(g0Var);
        if (t5 == null) {
            return null;
        }
        return t5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.e
    public <R, D> R T(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d6) {
        return (R) h0.a.a(this, oVar, d6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    @d5.d
    public q0 V(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("茐"));
        V0();
        return this.f24316z.N(cVar);
    }

    public void V0() {
        if (this.f24315y) {
            return;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.b0.a(this);
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.descriptors.m0 X0() {
        V0();
        return Y0();
    }

    public final void Z0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m0 m0Var) {
        kotlin.jvm.internal.l0.p(m0Var, ProtectedSandApp.s("茑"));
        a1();
        this.f24314x = m0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.e
    public kotlin.reflect.jvm.internal.impl.descriptors.m b() {
        return null;
    }

    public boolean b1() {
        return this.f24315y;
    }

    public final void c1(@d5.d List<x> list) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("茒"));
        d1(list, EmptySet.f23181o);
    }

    public final void d1(@d5.d List<x> list, @d5.d Set<x> set) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("茓"));
        kotlin.jvm.internal.l0.p(set, ProtectedSandApp.s("茔"));
        e1(new w(list, set, EmptyList.f23167o, EmptySet.f23181o));
    }

    public final void e1(@d5.d v vVar) {
        kotlin.jvm.internal.l0.p(vVar, ProtectedSandApp.s("茕"));
        this.f24313w = vVar;
    }

    public final void f1(@d5.d x... xVarArr) {
        List<x> Jy;
        kotlin.jvm.internal.l0.p(xVarArr, ProtectedSandApp.s("茖"));
        Jy = kotlin.collections.t.Jy(xVarArr);
        c1(Jy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    public boolean l0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var) {
        boolean W1;
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("茗"));
        if (kotlin.jvm.internal.l0.g(this, h0Var)) {
            return true;
        }
        v vVar = this.f24313w;
        kotlin.jvm.internal.l0.m(vVar);
        W1 = kotlin.collections.j0.W1(vVar.b(), h0Var);
        return W1 || A0().contains(h0Var) || h0Var.A0().contains(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    @d5.d
    public Collection<kotlin.reflect.jvm.internal.impl.name.c> t(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("茘"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("茙"));
        V0();
        return X0().t(cVar, lVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ x(kotlin.reflect.jvm.internal.impl.name.f r10, kotlin.reflect.jvm.internal.impl.storage.n r11, kotlin.reflect.jvm.internal.impl.builtins.h r12, d4.c r13, java.util.Map r14, kotlin.reflect.jvm.internal.impl.name.f r15, int r16, kotlin.jvm.internal.w r17) {
        /*
            r9 = this;
            r0 = r16 & 8
            r1 = 0
            if (r0 == 0) goto L7
            r6 = r1
            goto L8
        L7:
            r6 = r13
        L8:
            r0 = r16 & 16
            if (r0 == 0) goto L12
            java.util.Map r0 = kotlin.collections.c1.z()
            r7 = r0
            goto L13
        L12:
            r7 = r14
        L13:
            r0 = r16 & 32
            if (r0 == 0) goto L19
            r8 = r1
            goto L1a
        L19:
            r8 = r15
        L1a:
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.x.<init>(kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.storage.n, kotlin.reflect.jvm.internal.impl.builtins.h, d4.c, java.util.Map, kotlin.reflect.jvm.internal.impl.name.f, int, kotlin.jvm.internal.w):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @p3.j
    public x(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar, @d5.d kotlin.reflect.jvm.internal.impl.builtins.h hVar, @d5.e d4.c cVar, @d5.d Map<kotlin.reflect.jvm.internal.impl.descriptors.g0<?>, ? extends Object> map, @d5.e kotlin.reflect.jvm.internal.impl.name.f fVar2) {
        super(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b(), fVar);
        Lazy c6;
        kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("茇"));
        kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("茈"));
        kotlin.jvm.internal.l0.p(hVar, ProtectedSandApp.s("茉"));
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("茊"));
        this.f24307q = nVar;
        this.f24308r = hVar;
        this.f24309s = cVar;
        this.f24310t = fVar2;
        if (fVar.q()) {
            this.f24311u = map;
            a0 a0Var = (a0) P0(a0.f24150a.a());
            this.f24312v = a0Var == null ? a0.b.f24153b : a0Var;
            this.f24315y = true;
            this.f24316z = nVar.g(new b());
            c6 = kotlin.d0.c(new a());
            this.A = c6;
            return;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("茋") + fVar);
    }
}
