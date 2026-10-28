package kotlin.reflect.jvm.internal.impl.types.checker;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.b0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.t1;
import kotlin.reflect.jvm.internal.impl.types.v1;
import kotlin.reflect.jvm.internal.impl.types.w1;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: KotlinTypePreparator.kt */
/* loaded from: classes5.dex */
public abstract class f extends kotlin.reflect.jvm.internal.impl.types.i {

    /* compiled from: KotlinTypePreparator.kt */
    /* loaded from: classes6.dex */
    public static final class a extends f {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        public static final a f26342a = new a();

        private a() {
        }
    }

    /* compiled from: KotlinTypePreparator.kt */
    /* loaded from: classes6.dex */
    /* synthetic */ class b extends g0 implements q3.l<h4.i, w1> {
        b(Object obj) {
            super(1, obj);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: A0, reason: merged with bridge method [inline-methods] */
        public final w1 N(@d5.d h4.i iVar) {
            l0.p(iVar, ProtectedSandApp.s("袍"));
            return ((f) this.f23596p).a(iVar);
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.KCallable
        @d5.d
        public final String getName() {
            return ProtectedSandApp.s("袎");
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final KDeclarationContainer w0() {
            return l1.d(f.class);
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final String y0() {
            return ProtectedSandApp.s("袏");
        }
    }

    private final p0 c(p0 p0Var) {
        int b02;
        int b03;
        int b04;
        h0 type;
        h1 U0 = p0Var.U0();
        boolean z5 = false;
        kotlin.reflect.jvm.internal.impl.types.g0 g0Var = null;
        r5 = null;
        w1 w1Var = null;
        if (U0 instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.c) {
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.c cVar = (kotlin.reflect.jvm.internal.impl.resolve.calls.inference.c) U0;
            kotlin.reflect.jvm.internal.impl.types.l1 e6 = cVar.e();
            if (!(e6.b() == x1.IN_VARIANCE)) {
                e6 = null;
            }
            if (e6 != null && (type = e6.getType()) != null) {
                w1Var = type.X0();
            }
            w1 w1Var2 = w1Var;
            if (cVar.g() == null) {
                kotlin.reflect.jvm.internal.impl.types.l1 e7 = cVar.e();
                Collection<h0> m5 = cVar.m();
                b04 = b0.b0(m5, 10);
                ArrayList arrayList = new ArrayList(b04);
                Iterator<T> it = m5.iterator();
                while (it.hasNext()) {
                    arrayList.add(((h0) it.next()).X0());
                }
                cVar.i(new j(e7, arrayList, null, 4, null));
            }
            h4.b bVar = h4.b.FOR_SUBTYPING;
            j g5 = cVar.g();
            l0.m(g5);
            return new i(bVar, g5, w1Var2, p0Var.T0(), p0Var.V0(), false, 32, null);
        }
        if (U0 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.p) {
            Collection<h0> m6 = ((kotlin.reflect.jvm.internal.impl.resolve.constants.p) U0).m();
            b03 = b0.b0(m6, 10);
            ArrayList arrayList2 = new ArrayList(b03);
            Iterator<T> it2 = m6.iterator();
            while (it2.hasNext()) {
                h0 p5 = t1.p((h0) it2.next(), p0Var.V0());
                l0.o(p5, ProtectedSandApp.s("喚"));
                arrayList2.add(p5);
            }
            return i0.m(p0Var.T0(), new kotlin.reflect.jvm.internal.impl.types.g0(arrayList2), EmptyList.f23167o, false, p0Var.C());
        }
        if (!(U0 instanceof kotlin.reflect.jvm.internal.impl.types.g0) || !p0Var.V0()) {
            return p0Var;
        }
        kotlin.reflect.jvm.internal.impl.types.g0 g0Var2 = (kotlin.reflect.jvm.internal.impl.types.g0) U0;
        Collection<h0> m7 = g0Var2.m();
        b02 = b0.b0(m7, 10);
        ArrayList arrayList3 = new ArrayList(b02);
        Iterator<T> it3 = m7.iterator();
        while (it3.hasNext()) {
            arrayList3.add(kotlin.reflect.jvm.internal.impl.types.typeUtil.a.u((h0) it3.next()));
            z5 = true;
        }
        if (z5) {
            h0 h5 = g0Var2.h();
            g0Var = new kotlin.reflect.jvm.internal.impl.types.g0(arrayList3).l(h5 != null ? kotlin.reflect.jvm.internal.impl.types.typeUtil.a.u(h5) : null);
        }
        if (g0Var != null) {
            g0Var2 = g0Var;
        }
        return g0Var2.g();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.i
    @d5.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public w1 a(@d5.d h4.i iVar) {
        w1 d6;
        l0.p(iVar, ProtectedSandApp.s("喛"));
        if (!(iVar instanceof h0)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("喜").toString());
        }
        w1 X0 = ((h0) iVar).X0();
        if (X0 instanceof p0) {
            d6 = c((p0) X0);
        } else {
            if (!(X0 instanceof kotlin.reflect.jvm.internal.impl.types.b0)) {
                throw new NoWhenBranchMatchedException();
            }
            kotlin.reflect.jvm.internal.impl.types.b0 b0Var = (kotlin.reflect.jvm.internal.impl.types.b0) X0;
            p0 c6 = c(b0Var.c1());
            p0 c7 = c(b0Var.d1());
            d6 = (c6 == b0Var.c1() && c7 == b0Var.d1()) ? X0 : i0.d(c6, c7);
        }
        return v1.c(d6, X0, new b(this));
    }
}
