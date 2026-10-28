package kotlin.reflect.jvm.internal.impl.builtins.functions;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.builtins.functions.c;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.text.e0;

/* compiled from: BuiltInFictitiousFunctionClassFactory.kt */
/* loaded from: classes5.dex */
public final class a implements w3.b {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final n f23893a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final h0 f23894b;

    public a(@d5.d n nVar, @d5.d h0 h0Var) {
        l0.p(nVar, ProtectedSandApp.s("䒟"));
        l0.p(h0Var, ProtectedSandApp.s("䒠"));
        this.f23893a = nVar;
        this.f23894b = h0Var;
    }

    @Override // w3.b
    @d5.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> a(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("䒡"));
        return EmptySet.f23181o;
    }

    @Override // w3.b
    public boolean b(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar, @d5.d f fVar) {
        boolean s22;
        boolean s23;
        boolean s24;
        boolean s25;
        l0.p(cVar, ProtectedSandApp.s("䒢"));
        l0.p(fVar, ProtectedSandApp.s("䒣"));
        String h5 = fVar.h();
        l0.o(h5, ProtectedSandApp.s("䒤"));
        s22 = e0.s2(h5, ProtectedSandApp.s("䒥"), false, 2, null);
        if (!s22) {
            s23 = e0.s2(h5, ProtectedSandApp.s("䒦"), false, 2, null);
            if (!s23) {
                s24 = e0.s2(h5, ProtectedSandApp.s("䒧"), false, 2, null);
                if (!s24) {
                    s25 = e0.s2(h5, ProtectedSandApp.s("䒨"), false, 2, null);
                    if (!s25) {
                        return false;
                    }
                }
            }
        }
        return c.Companion.c(h5, cVar) != null;
    }

    @Override // w3.b
    @d5.e
    public kotlin.reflect.jvm.internal.impl.descriptors.e c(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar) {
        boolean T2;
        Object G2;
        Object B2;
        l0.p(bVar, ProtectedSandApp.s("䒩"));
        if (bVar.k() || bVar.l()) {
            return null;
        }
        String b6 = bVar.i().b();
        l0.o(b6, ProtectedSandApp.s("䒪"));
        T2 = kotlin.text.h0.T2(b6, ProtectedSandApp.s("䒫"), false, 2, null);
        if (!T2) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.c h5 = bVar.h();
        l0.o(h5, ProtectedSandApp.s("䒬"));
        c.a.C0271a c6 = c.Companion.c(b6, h5);
        if (c6 == null) {
            return null;
        }
        c a6 = c6.a();
        int b7 = c6.b();
        List<kotlin.reflect.jvm.internal.impl.descriptors.l0> R = this.f23894b.V(h5).R();
        ArrayList arrayList = new ArrayList();
        for (Object obj : R) {
            if (obj instanceof kotlin.reflect.jvm.internal.impl.builtins.b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof kotlin.reflect.jvm.internal.impl.builtins.f) {
                arrayList2.add(obj2);
            }
        }
        G2 = j0.G2(arrayList2);
        kotlin.reflect.jvm.internal.impl.descriptors.l0 l0Var = (kotlin.reflect.jvm.internal.impl.builtins.f) G2;
        if (l0Var == null) {
            B2 = j0.B2(arrayList);
            l0Var = (kotlin.reflect.jvm.internal.impl.builtins.b) B2;
        }
        return new b(this.f23893a, l0Var, a6, b7);
    }
}
