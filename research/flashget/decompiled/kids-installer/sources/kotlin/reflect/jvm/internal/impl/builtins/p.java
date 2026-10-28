package kotlin.reflect.jvm.internal.impl.builtins;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.f1;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.t1;

/* compiled from: UnsignedType.kt */
/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final p f24094a = new p();

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final Set<kotlin.reflect.jvm.internal.impl.name.f> f24095b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private static final Set<kotlin.reflect.jvm.internal.impl.name.f> f24096c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private static final HashMap<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> f24097d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private static final HashMap<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> f24098e;

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    private static final HashMap<n, kotlin.reflect.jvm.internal.impl.name.f> f24099f;

    /* renamed from: g, reason: collision with root package name */
    @d5.d
    private static final Set<kotlin.reflect.jvm.internal.impl.name.f> f24100g;

    static {
        Set<kotlin.reflect.jvm.internal.impl.name.f> a6;
        Set<kotlin.reflect.jvm.internal.impl.name.f> a62;
        HashMap<n, kotlin.reflect.jvm.internal.impl.name.f> M;
        o[] values = o.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (o oVar : values) {
            arrayList.add(oVar.getTypeName());
        }
        a6 = j0.a6(arrayList);
        f24095b = a6;
        n[] values2 = n.values();
        ArrayList arrayList2 = new ArrayList(values2.length);
        for (n nVar : values2) {
            arrayList2.add(nVar.getTypeName());
        }
        a62 = j0.a6(arrayList2);
        f24096c = a62;
        f24097d = new HashMap<>();
        f24098e = new HashMap<>();
        M = f1.M(new Pair(n.UBYTEARRAY, kotlin.reflect.jvm.internal.impl.name.f.p(ProtectedSandApp.s("䛇"))), new Pair(n.USHORTARRAY, kotlin.reflect.jvm.internal.impl.name.f.p(ProtectedSandApp.s("䛈"))), new Pair(n.UINTARRAY, kotlin.reflect.jvm.internal.impl.name.f.p(ProtectedSandApp.s("䛉"))), new Pair(n.ULONGARRAY, kotlin.reflect.jvm.internal.impl.name.f.p(ProtectedSandApp.s("䛊"))));
        f24099f = M;
        o[] values3 = o.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (o oVar2 : values3) {
            linkedHashSet.add(oVar2.getArrayClassId().j());
        }
        f24100g = linkedHashSet;
        for (o oVar3 : o.values()) {
            f24097d.put(oVar3.getArrayClassId(), oVar3.getClassId());
            f24098e.put(oVar3.getClassId(), oVar3.getArrayClassId());
        }
    }

    private p() {
    }

    @p3.n
    public static final boolean d(@d5.d h0 h0Var) {
        kotlin.reflect.jvm.internal.impl.descriptors.h b6;
        l0.p(h0Var, ProtectedSandApp.s("䛋"));
        if (t1.w(h0Var) || (b6 = h0Var.U0().b()) == null) {
            return false;
        }
        return f24094a.c(b6);
    }

    @d5.e
    public final kotlin.reflect.jvm.internal.impl.name.b a(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("䛌"));
        return f24097d.get(bVar);
    }

    public final boolean b(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(fVar, ProtectedSandApp.s("䛍"));
        return f24100g.contains(fVar);
    }

    public final boolean c(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        l0.p(mVar, ProtectedSandApp.s("䛎"));
        kotlin.reflect.jvm.internal.impl.descriptors.m b6 = mVar.b();
        return (b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0) && l0.g(((kotlin.reflect.jvm.internal.impl.descriptors.l0) b6).f(), l.f24035u) && f24095b.contains(mVar.getName());
    }
}
