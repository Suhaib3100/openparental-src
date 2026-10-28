package kotlin.reflect.jvm.internal.impl.builtins;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.w;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.t1;

/* compiled from: UnsignedType.kt */
@r1({"SMAP\nUnsignedType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnsignedType.kt\norg/jetbrains/kotlin/builtins/UnsignedTypes\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,122:1\n11065#2:123\n11400#2,3:124\n11065#2:127\n11400#2,3:128\n11400#2,3:131\n*S KotlinDebug\n*F\n+ 1 UnsignedType.kt\norg/jetbrains/kotlin/builtins/UnsignedTypes\n*L\n36#1:123\n36#1:124,3\n37#1:127\n37#1:128,3\n47#1:131,3\n*E\n"})
/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final p f75891a = new p();

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final Set<kotlin.reflect.jvm.internal.impl.name.f> f75892b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final Set<kotlin.reflect.jvm.internal.impl.name.f> f75893c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final HashMap<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> f75894d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final HashMap<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> f75895e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final HashMap<n, kotlin.reflect.jvm.internal.impl.name.f> f75896f;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final Set<kotlin.reflect.jvm.internal.impl.name.f> f75897g;

    static {
        o[] values = o.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (o oVar : values) {
            arrayList.add(oVar.getTypeName());
        }
        f75892b = w.a6(arrayList);
        n[] values2 = n.values();
        ArrayList arrayList2 = new ArrayList(values2.length);
        for (n nVar : values2) {
            arrayList2.add(nVar.getTypeName());
        }
        f75893c = w.a6(arrayList2);
        f75894d = new HashMap<>();
        f75895e = new HashMap<>();
        f75896f = z0.M(new q0(n.UBYTEARRAY, kotlin.reflect.jvm.internal.impl.name.f.f(ProtectedSandApp.s("櫇\u0001"))), new q0(n.USHORTARRAY, kotlin.reflect.jvm.internal.impl.name.f.f(ProtectedSandApp.s("櫈\u0001"))), new q0(n.UINTARRAY, kotlin.reflect.jvm.internal.impl.name.f.f(ProtectedSandApp.s("櫉\u0001"))), new q0(n.ULONGARRAY, kotlin.reflect.jvm.internal.impl.name.f.f(ProtectedSandApp.s("櫊\u0001"))));
        o[] values3 = o.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (o oVar2 : values3) {
            linkedHashSet.add(oVar2.getArrayClassId().j());
        }
        f75897g = linkedHashSet;
        for (o oVar3 : o.values()) {
            f75894d.put(oVar3.getArrayClassId(), oVar3.getClassId());
            f75895e.put(oVar3.getClassId(), oVar3.getArrayClassId());
        }
    }

    private p() {
    }

    @kd.n
    public static final boolean d(@fg.l h0 h0Var) {
        kotlin.reflect.jvm.internal.impl.descriptors.h c5;
        l0.p(h0Var, ProtectedSandApp.s("櫋\u0001"));
        if (t1.w(h0Var) || (c5 = h0Var.O0().c()) == null) {
            return false;
        }
        return f75891a.c(c5);
    }

    @fg.m
    public final kotlin.reflect.jvm.internal.impl.name.b a(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("櫌\u0001"));
        return f75894d.get(bVar);
    }

    public final boolean b(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(fVar, ProtectedSandApp.s("櫍\u0001"));
        return f75897g.contains(fVar);
    }

    public final boolean c(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        l0.p(mVar, ProtectedSandApp.s("櫎\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.m c5 = mVar.c();
        return (c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0) && l0.g(((kotlin.reflect.jvm.internal.impl.descriptors.l0) c5).g(), l.f75836y) && f75892b.contains(mVar.getName());
    }
}
