package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b0;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.l;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: util.kt */
/* loaded from: classes5.dex */
public final class h {
    @d5.d
    public static final List<j1> a(@d5.d Collection<? extends h0> collection, @d5.d Collection<? extends j1> collection2, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        List<Pair> i6;
        int b02;
        l0.p(collection, ProtectedSandApp.s("䦡"));
        l0.p(collection2, ProtectedSandApp.s("䦢"));
        l0.p(aVar, ProtectedSandApp.s("䦣"));
        collection.size();
        collection2.size();
        i6 = j0.i6(collection, collection2);
        b02 = b0.b0(i6, 10);
        ArrayList arrayList = new ArrayList(b02);
        for (Pair pair : i6) {
            h0 h0Var = (h0) pair.a();
            j1 j1Var = (j1) pair.b();
            int index = j1Var.getIndex();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = j1Var.getAnnotations();
            kotlin.reflect.jvm.internal.impl.name.f name = j1Var.getName();
            l0.o(name, ProtectedSandApp.s("䦤"));
            boolean B0 = j1Var.B0();
            boolean i02 = j1Var.i0();
            boolean f02 = j1Var.f0();
            h0 k5 = j1Var.s0() != null ? kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.p(aVar).A().k(h0Var) : null;
            a1 k6 = j1Var.k();
            l0.o(k6, ProtectedSandApp.s("䦥"));
            arrayList.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.l0(aVar, null, index, annotations, name, h0Var, B0, i02, f02, k5, k6));
        }
        return arrayList;
    }

    @d5.e
    public static final l b(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(eVar, ProtectedSandApp.s("䦦"));
        kotlin.reflect.jvm.internal.impl.descriptors.e t5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.t(eVar);
        if (t5 == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h Z = t5.Z();
        l lVar = Z instanceof l ? (l) Z : null;
        return lVar == null ? b(t5) : lVar;
    }
}
