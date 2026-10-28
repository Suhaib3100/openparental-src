package kotlin.reflect.jvm.internal.impl.builtins;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b0;
import kotlin.collections.j0;
import kotlin.collections.z;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.y;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: suspendFunctionTypes.kt */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private static final y f24093a;

    static {
        List<f1> k5;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.m mVar = new kotlin.reflect.jvm.internal.impl.descriptors.impl.m(kotlin.reflect.jvm.internal.impl.types.error.k.f26404a.i(), l.f24027m);
        kotlin.reflect.jvm.internal.impl.descriptors.f fVar = kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE;
        kotlin.reflect.jvm.internal.impl.name.f g5 = l.f24030p.g();
        a1 a1Var = a1.f24103a;
        kotlin.reflect.jvm.internal.impl.storage.n nVar = kotlin.reflect.jvm.internal.impl.storage.f.f26300e;
        y yVar = new y(mVar, fVar, false, false, g5, a1Var, nVar);
        yVar.T0(e0.ABSTRACT);
        yVar.V0(t.f24440e);
        k5 = z.k(k0.Y0(yVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b(), false, x1.IN_VARIANCE, kotlin.reflect.jvm.internal.impl.name.f.p(ProtectedSandApp.s("䚨")), 0, nVar));
        yVar.U0(k5);
        yVar.R0();
        f24093a = yVar;
    }

    @d5.d
    public static final p0 a(@d5.d h0 h0Var) {
        int b02;
        List k5;
        List E4;
        p0 b6;
        l0.p(h0Var, ProtectedSandApp.s("䚩"));
        g.q(h0Var);
        h i5 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.i(h0Var);
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = h0Var.getAnnotations();
        h0 j5 = g.j(h0Var);
        List<h0> e6 = g.e(h0Var);
        List<l1> l5 = g.l(h0Var);
        b02 = b0.b0(l5, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<T> it = l5.iterator();
        while (it.hasNext()) {
            arrayList.add(((l1) it.next()).getType());
        }
        d1.f26381p.getClass();
        d1 d1Var = d1.f26382q;
        h1 m5 = f24093a.m();
        l0.o(m5, ProtectedSandApp.s("䚪"));
        k5 = z.k(kotlin.reflect.jvm.internal.impl.types.typeUtil.a.a(g.k(h0Var)));
        E4 = j0.E4(arrayList, i0.l(d1Var, m5, k5, false, null, 16, null));
        p0 I = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.i(h0Var).I();
        l0.o(I, ProtectedSandApp.s("䚫"));
        b6 = g.b(i5, annotations, j5, e6, E4, null, I, (r17 & 128) != 0 ? false : false);
        return b6.b1(h0Var.V0());
    }
}
