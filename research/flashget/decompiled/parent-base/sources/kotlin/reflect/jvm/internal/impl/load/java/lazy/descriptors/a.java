package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.j0;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import wd.p;
import wd.q;
import wd.r;
import wd.w;

/* compiled from: DeclaredMemberIndex.kt */
@r1({"SMAP\nDeclaredMemberIndex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeclaredMemberIndex.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/ClassDeclaredMemberIndex\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n988#2:67\n1017#2,3:68\n1020#2,3:78\n674#2:81\n704#2,4:82\n1155#2,3:95\n1155#2,3:98\n372#3,7:71\n766#4:86\n857#4,2:87\n1194#4,2:89\n1222#4,4:91\n*S KotlinDebug\n*F\n+ 1 DeclaredMemberIndex.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/ClassDeclaredMemberIndex\n*L\n52#1:67\n52#1:68,3\n52#1:78,3\n53#1:81\n53#1:82,4\n57#1:95,3\n60#1:98,3\n52#1:71,7\n54#1:86\n54#1:87,2\n54#1:89,2\n54#1:91,4\n*E\n"})
/* loaded from: classes7.dex */
public class a implements b {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final wd.g f76494a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final ld.l<q, Boolean> f76495b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final ld.l<r, Boolean> f76496c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final Map<kotlin.reflect.jvm.internal.impl.name.f, List<r>> f76497d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private final Map<kotlin.reflect.jvm.internal.impl.name.f, wd.n> f76498e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private final Map<kotlin.reflect.jvm.internal.impl.name.f, w> f76499f;

    /* compiled from: DeclaredMemberIndex.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a$a, reason: collision with other inner class name */
    static final class C1089a extends n0 implements ld.l<r, Boolean> {
        C1089a() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l r rVar) {
            l0.p(rVar, ProtectedSandApp.s("焱\u0001"));
            return Boolean.valueOf(((Boolean) a.this.f76495b.invoke(rVar)).booleanValue() && !p.c(rVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@fg.l wd.g gVar, @fg.l ld.l<? super q, Boolean> lVar) {
        l0.p(gVar, ProtectedSandApp.s("焲\u0001"));
        l0.p(lVar, ProtectedSandApp.s("焳\u0001"));
        this.f76494a = gVar;
        this.f76495b = lVar;
        C1089a c1089a = new C1089a();
        this.f76496c = c1089a;
        kotlin.sequences.m p02 = kotlin.sequences.p.p0(kotlin.collections.w.A1(gVar.e()), c1089a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : p02) {
            kotlin.reflect.jvm.internal.impl.name.f name = ((r) obj).getName();
            Object obj2 = linkedHashMap.get(name);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(name, obj2);
            }
            ((List) obj2).add(obj);
        }
        this.f76497d = linkedHashMap;
        kotlin.sequences.m p03 = kotlin.sequences.p.p0(kotlin.collections.w.A1(this.f76494a.l()), this.f76495b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj3 : p03) {
            linkedHashMap2.put(((wd.n) obj3).getName(), obj3);
        }
        this.f76498e = linkedHashMap2;
        Collection<w> r4 = this.f76494a.r();
        ld.l<q, Boolean> lVar2 = this.f76495b;
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : r4) {
            if (((Boolean) lVar2.invoke(obj4)).booleanValue()) {
                arrayList.add(obj4);
            }
        }
        int j4 = z0.j(kotlin.collections.w.b0(arrayList, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(j4 < 16 ? 16 : j4);
        for (Object obj5 : arrayList) {
            linkedHashMap3.put(((w) obj5).getName(), obj5);
        }
        this.f76499f = linkedHashMap3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b
    @fg.l
    public Set<kotlin.reflect.jvm.internal.impl.name.f> a() {
        kotlin.sequences.m p02 = kotlin.sequences.p.p0(kotlin.collections.w.A1(this.f76494a.e()), this.f76496c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = p02.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((r) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b
    @fg.l
    public Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
        return this.f76499f.keySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b
    @fg.l
    public Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
        kotlin.sequences.m p02 = kotlin.sequences.p.p0(kotlin.collections.w.A1(this.f76494a.l()), this.f76495b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = p02.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((wd.n) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b
    @fg.l
    public Collection<r> d(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(fVar, ProtectedSandApp.s("焴\u0001"));
        List<r> list = this.f76497d.get(fVar);
        return list != null ? list : j0.f74919b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b
    @fg.m
    public w e(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(fVar, ProtectedSandApp.s("焴\u0001"));
        return this.f76499f.get(fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b
    @fg.m
    public wd.n f(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(fVar, ProtectedSandApp.s("焴\u0001"));
        return this.f76498e.get(fVar);
    }
}
