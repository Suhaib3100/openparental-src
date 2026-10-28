package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;

/* compiled from: typeParameterUtils.kt */
/* loaded from: classes5.dex */
public final class g1 {

    /* compiled from: typeParameterUtils.kt */
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.l<m, Boolean> {

        /* renamed from: p, reason: collision with root package name */
        public static final a f24136p = new a();

        a() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean N(@d5.d m mVar) {
            kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("脛"));
            return Boolean.valueOf(mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.a);
        }
    }

    /* compiled from: typeParameterUtils.kt */
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.l<m, Boolean> {

        /* renamed from: p, reason: collision with root package name */
        public static final b f24137p = new b();

        b() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean N(@d5.d m mVar) {
            kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("脜"));
            return Boolean.valueOf(!(mVar instanceof l));
        }
    }

    /* compiled from: typeParameterUtils.kt */
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements q3.l<m, Sequence<? extends f1>> {

        /* renamed from: p, reason: collision with root package name */
        public static final c f24138p = new c();

        c() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Sequence<f1> N(@d5.d m mVar) {
            Sequence<f1> A1;
            kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("脝"));
            List<f1> typeParameters = ((kotlin.reflect.jvm.internal.impl.descriptors.a) mVar).getTypeParameters();
            kotlin.jvm.internal.l0.o(typeParameters, ProtectedSandApp.s("脞"));
            A1 = kotlin.collections.j0.A1(typeParameters);
            return A1;
        }
    }

    @d5.e
    public static final s0 a(@d5.d kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("䞇"));
        h b6 = h0Var.U0().b();
        return b(h0Var, b6 instanceof i ? (i) b6 : null, 0);
    }

    private static final s0 b(kotlin.reflect.jvm.internal.impl.types.h0 h0Var, i iVar, int i5) {
        if (iVar == null || kotlin.reflect.jvm.internal.impl.types.error.k.m(iVar)) {
            return null;
        }
        int size = iVar.G().size() + i5;
        if (iVar.y()) {
            List<kotlin.reflect.jvm.internal.impl.types.l1> subList = h0Var.S0().subList(i5, size);
            m b6 = iVar.b();
            return new s0(iVar, subList, b(h0Var, b6 instanceof i ? (i) b6 : null, size));
        }
        if (size != h0Var.S0().size()) {
            kotlin.reflect.jvm.internal.impl.resolve.e.E(iVar);
        }
        return new s0(iVar, h0Var.S0().subList(i5, h0Var.S0().size()), null);
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.c c(f1 f1Var, m mVar, int i5) {
        return new kotlin.reflect.jvm.internal.impl.descriptors.c(f1Var, mVar, i5);
    }

    @d5.d
    public static final List<f1> d(@d5.d i iVar) {
        Sequence Z2;
        Sequence p02;
        Sequence H0;
        List<f1> list;
        m mVar;
        List<f1> D4;
        int b02;
        List<f1> D42;
        kotlin.reflect.jvm.internal.impl.types.h1 m5;
        kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("䞈"));
        List<f1> G = iVar.G();
        String s5 = ProtectedSandApp.s("䞉");
        kotlin.jvm.internal.l0.o(G, s5);
        if (!iVar.y() && !(iVar.b() instanceof kotlin.reflect.jvm.internal.impl.descriptors.a)) {
            return G;
        }
        Z2 = kotlin.sequences.v.Z2(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.q(iVar), a.f24136p);
        p02 = kotlin.sequences.v.p0(Z2, b.f24137p);
        H0 = kotlin.sequences.v.H0(p02, c.f24138p);
        List c32 = kotlin.sequences.v.c3(H0);
        Iterator<m> it = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.q(iVar).iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                mVar = null;
                break;
            }
            mVar = it.next();
            if (mVar instanceof e) {
                break;
            }
        }
        e eVar = (e) mVar;
        if (eVar != null && (m5 = eVar.m()) != null) {
            list = m5.r();
        }
        if (list == null) {
            list = EmptyList.f23167o;
        }
        if (c32.isEmpty() && list.isEmpty()) {
            List<f1> G2 = iVar.G();
            kotlin.jvm.internal.l0.o(G2, s5);
            return G2;
        }
        D4 = kotlin.collections.j0.D4(c32, list);
        b02 = kotlin.collections.b0.b0(D4, 10);
        ArrayList arrayList = new ArrayList(b02);
        for (f1 f1Var : D4) {
            kotlin.jvm.internal.l0.o(f1Var, ProtectedSandApp.s("䞊"));
            arrayList.add(new kotlin.reflect.jvm.internal.impl.descriptors.c(f1Var, iVar, G.size()));
        }
        D42 = kotlin.collections.j0.D4(G, arrayList);
        return D42;
    }
}
