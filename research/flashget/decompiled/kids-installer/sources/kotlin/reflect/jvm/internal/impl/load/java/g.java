package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.e1;
import kotlin.collections.f1;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.builtins.l;

/* compiled from: BuiltinSpecialProperties.kt */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final g f24571a = new g();

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final Map<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.f> f24572b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private static final Map<kotlin.reflect.jvm.internal.impl.name.f, List<kotlin.reflect.jvm.internal.impl.name.f>> f24573c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private static final Set<kotlin.reflect.jvm.internal.impl.name.c> f24574d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private static final Set<kotlin.reflect.jvm.internal.impl.name.f> f24575e;

    static {
        kotlin.reflect.jvm.internal.impl.name.c d6;
        kotlin.reflect.jvm.internal.impl.name.c d7;
        kotlin.reflect.jvm.internal.impl.name.c c6;
        kotlin.reflect.jvm.internal.impl.name.c c7;
        kotlin.reflect.jvm.internal.impl.name.c d8;
        kotlin.reflect.jvm.internal.impl.name.c c8;
        kotlin.reflect.jvm.internal.impl.name.c c9;
        kotlin.reflect.jvm.internal.impl.name.c c10;
        Map<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.f> W;
        int b02;
        int j5;
        int b03;
        Set<kotlin.reflect.jvm.internal.impl.name.f> a6;
        List a22;
        kotlin.reflect.jvm.internal.impl.name.d dVar = l.a.f24077s;
        String s5 = ProtectedSandApp.s("䧮");
        d6 = h.d(dVar, s5);
        String s6 = ProtectedSandApp.s("䧯");
        d7 = h.d(dVar, s6);
        kotlin.reflect.jvm.internal.impl.name.c cVar = l.a.U;
        String s7 = ProtectedSandApp.s("䧰");
        c6 = h.c(cVar, s7);
        kotlin.reflect.jvm.internal.impl.name.c cVar2 = l.a.Y;
        c7 = h.c(cVar2, s7);
        kotlin.reflect.jvm.internal.impl.name.d dVar2 = l.a.f24053g;
        String s8 = ProtectedSandApp.s("䧱");
        d8 = h.d(dVar2, s8);
        c8 = h.c(cVar2, ProtectedSandApp.s("䧲"));
        String s9 = ProtectedSandApp.s("䧴");
        c9 = h.c(cVar2, s9);
        c10 = h.c(cVar2, ProtectedSandApp.s("䧵"));
        W = f1.W(new Pair(d6, kotlin.reflect.jvm.internal.impl.name.f.p(s5)), new Pair(d7, kotlin.reflect.jvm.internal.impl.name.f.p(s6)), new Pair(c6, kotlin.reflect.jvm.internal.impl.name.f.p(s7)), new Pair(c7, kotlin.reflect.jvm.internal.impl.name.f.p(s7)), new Pair(d8, kotlin.reflect.jvm.internal.impl.name.f.p(s8)), new Pair(c8, kotlin.reflect.jvm.internal.impl.name.f.p(ProtectedSandApp.s("䧳"))), new Pair(c9, kotlin.reflect.jvm.internal.impl.name.f.p(s9)), new Pair(c10, kotlin.reflect.jvm.internal.impl.name.f.p(ProtectedSandApp.s("䧶"))));
        f24572b = W;
        Set<Map.Entry<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.f>> entrySet = W.entrySet();
        b02 = kotlin.collections.b0.b0(entrySet, 10);
        ArrayList<Pair> arrayList = new ArrayList(b02);
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new Pair(((kotlin.reflect.jvm.internal.impl.name.c) entry.getKey()).g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : arrayList) {
            kotlin.reflect.jvm.internal.impl.name.f fVar = (kotlin.reflect.jvm.internal.impl.name.f) pair.f();
            Object obj = linkedHashMap.get(fVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(fVar, obj);
            }
            ((List) obj).add((kotlin.reflect.jvm.internal.impl.name.f) pair.e());
        }
        j5 = e1.j(linkedHashMap.size());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(j5);
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            a22 = kotlin.collections.j0.a2((Iterable) entry2.getValue());
            linkedHashMap2.put(key, a22);
        }
        f24573c = linkedHashMap2;
        Set<kotlin.reflect.jvm.internal.impl.name.c> keySet = f24572b.keySet();
        f24574d = keySet;
        b03 = kotlin.collections.b0.b0(keySet, 10);
        ArrayList arrayList2 = new ArrayList(b03);
        Iterator<T> it2 = keySet.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((kotlin.reflect.jvm.internal.impl.name.c) it2.next()).g());
        }
        a6 = kotlin.collections.j0.a6(arrayList2);
        f24575e = a6;
    }

    private g() {
    }

    @d5.d
    public final Map<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.f> a() {
        return f24572b;
    }

    @d5.d
    public final List<kotlin.reflect.jvm.internal.impl.name.f> b(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(fVar, ProtectedSandApp.s("䧷"));
        List<kotlin.reflect.jvm.internal.impl.name.f> list = f24573c.get(fVar);
        return list == null ? EmptyList.f23167o : list;
    }

    @d5.d
    public final Set<kotlin.reflect.jvm.internal.impl.name.c> c() {
        return f24574d;
    }

    @d5.d
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
        return f24575e;
    }
}
