package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.builtins.l;

/* compiled from: BuiltinSpecialProperties.kt */
@r1({"SMAP\nBuiltinSpecialProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltinSpecialProperties.kt\norg/jetbrains/kotlin/load/java/BuiltinSpecialProperties\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,47:1\n1549#2:48\n1620#2,3:49\n1490#2:52\n1520#2,3:53\n1523#2,3:63\n1238#2,4:68\n1549#2:75\n1620#2,3:76\n372#3,7:56\n453#3:66\n403#3:67\n152#4,3:72\n*S KotlinDebug\n*F\n+ 1 BuiltinSpecialProperties.kt\norg/jetbrains/kotlin/load/java/BuiltinSpecialProperties\n*L\n28#1:48\n28#1:49,3\n29#1:52\n29#1:53,3\n29#1:63,3\n30#1:68,4\n39#1:75\n39#1:76,3\n29#1:56,7\n30#1:66\n30#1:67\n34#1:72,3\n*E\n"})
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final g f76425a = new g();

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final Map<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.f> f76426b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final Map<kotlin.reflect.jvm.internal.impl.name.f, List<kotlin.reflect.jvm.internal.impl.name.f>> f76427c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final Set<kotlin.reflect.jvm.internal.impl.name.c> f76428d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final Set<kotlin.reflect.jvm.internal.impl.name.c> f76429e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final Set<kotlin.reflect.jvm.internal.impl.name.f> f76430f;

    static {
        kotlin.reflect.jvm.internal.impl.name.c d5;
        kotlin.reflect.jvm.internal.impl.name.c d6;
        kotlin.reflect.jvm.internal.impl.name.c c5;
        kotlin.reflect.jvm.internal.impl.name.c c6;
        kotlin.reflect.jvm.internal.impl.name.c d7;
        kotlin.reflect.jvm.internal.impl.name.c c7;
        kotlin.reflect.jvm.internal.impl.name.c c10;
        kotlin.reflect.jvm.internal.impl.name.c c11;
        kotlin.reflect.jvm.internal.impl.name.d dVar = l.a.f75874s;
        d5 = h.d(dVar, ProtectedSandApp.s("烉\u0001"));
        q0 q0Var = new q0(d5, kotlin.reflect.jvm.internal.impl.builtins.l.f75822k);
        String s4 = ProtectedSandApp.s("烊\u0001");
        d6 = h.d(dVar, s4);
        q0 q0Var2 = new q0(d6, kotlin.reflect.jvm.internal.impl.name.f.f(s4));
        kotlin.reflect.jvm.internal.impl.name.c cVar = l.a.V;
        String s5 = ProtectedSandApp.s("烋\u0001");
        c5 = h.c(cVar, s5);
        q0 q0Var3 = new q0(c5, kotlin.reflect.jvm.internal.impl.name.f.f(s5));
        kotlin.reflect.jvm.internal.impl.name.c cVar2 = l.a.Z;
        c6 = h.c(cVar2, s5);
        q0 q0Var4 = new q0(c6, kotlin.reflect.jvm.internal.impl.name.f.f(s5));
        kotlin.reflect.jvm.internal.impl.name.d dVar2 = l.a.f75850g;
        String s6 = ProtectedSandApp.s("烌\u0001");
        d7 = h.d(dVar2, s6);
        q0 q0Var5 = new q0(d7, kotlin.reflect.jvm.internal.impl.name.f.f(s6));
        c7 = h.c(cVar2, ProtectedSandApp.s("烍\u0001"));
        q0 q0Var6 = new q0(c7, kotlin.reflect.jvm.internal.impl.name.f.f(ProtectedSandApp.s("烎\u0001")));
        String s7 = ProtectedSandApp.s("烏\u0001");
        c10 = h.c(cVar2, s7);
        q0 q0Var7 = new q0(c10, kotlin.reflect.jvm.internal.impl.name.f.f(s7));
        c11 = h.c(cVar2, ProtectedSandApp.s("烐\u0001"));
        Map<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.f> W = z0.W(q0Var, q0Var2, q0Var3, q0Var4, q0Var5, q0Var6, q0Var7, new q0(c11, kotlin.reflect.jvm.internal.impl.name.f.f(ProtectedSandApp.s("烑\u0001"))));
        f76426b = W;
        Set<Map.Entry<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.f>> entrySet = W.entrySet();
        ArrayList<q0> arrayList = new ArrayList(kotlin.collections.w.b0(entrySet, 10));
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new q0(((kotlin.reflect.jvm.internal.impl.name.c) entry.getKey()).g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (q0 q0Var8 : arrayList) {
            kotlin.reflect.jvm.internal.impl.name.f fVar = (kotlin.reflect.jvm.internal.impl.name.f) q0Var8.f();
            Object obj = linkedHashMap.get(fVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(fVar, obj);
            }
            ((List) obj).add((kotlin.reflect.jvm.internal.impl.name.f) q0Var8.e());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(z0.j(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), kotlin.collections.w.a2((Iterable) entry2.getValue()));
        }
        f76427c = linkedHashMap2;
        Map<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.f> map = f76426b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.f> entry3 : map.entrySet()) {
            kotlin.reflect.jvm.internal.impl.builtins.jvm.c cVar3 = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f75734a;
            kotlin.reflect.jvm.internal.impl.name.d j4 = entry3.getKey().e().j();
            l0.o(j4, ProtectedSandApp.s("烒\u0001"));
            kotlin.reflect.jvm.internal.impl.name.b n4 = cVar3.n(j4);
            l0.m(n4);
            linkedHashSet.add(n4.b().c(entry3.getValue()));
        }
        f76428d = linkedHashSet;
        Set<kotlin.reflect.jvm.internal.impl.name.c> keySet = f76426b.keySet();
        f76429e = keySet;
        Set<kotlin.reflect.jvm.internal.impl.name.c> set = keySet;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.w.b0(set, 10));
        Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((kotlin.reflect.jvm.internal.impl.name.c) it2.next()).g());
        }
        f76430f = kotlin.collections.w.a6(arrayList2);
    }

    private g() {
    }

    @fg.l
    public final Map<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.f> a() {
        return f76426b;
    }

    @fg.l
    public final List<kotlin.reflect.jvm.internal.impl.name.f> b(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(fVar, ProtectedSandApp.s("烓\u0001"));
        List<kotlin.reflect.jvm.internal.impl.name.f> list = f76427c.get(fVar);
        return list == null ? kotlin.collections.j0.f74919b : list;
    }

    @fg.l
    public final Set<kotlin.reflect.jvm.internal.impl.name.c> c() {
        return f76429e;
    }

    @fg.l
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
        return f76430f;
    }
}
