package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.j0;
import kotlin.collections.w;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.k;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.o;

/* compiled from: GivenFunctionsMemberScope.kt */
@r1({"SMAP\nGivenFunctionsMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GivenFunctionsMemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/GivenFunctionsMemberScope\n+ 2 CollectionUtil.kt\norg/jetbrains/kotlin/utils/CollectionUtilKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,91:1\n32#2,2:92\n9#2,6:94\n32#2,2:100\n9#2,6:102\n1360#3:108\n1446#3,5:109\n800#3,11:114\n1477#3:125\n1502#3,3:126\n1505#3,3:136\n1477#3:139\n1502#3,3:140\n1505#3,3:150\n766#3:153\n857#3,2:154\n372#4,7:129\n372#4,7:143\n*S KotlinDebug\n*F\n+ 1 GivenFunctionsMemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/GivenFunctionsMemberScope\n*L\n51#1:92,2\n51#1:94,6\n55#1:100,2\n55#1:102,6\n61#1:108\n61#1:109,5\n62#1:114,11\n63#1:125\n63#1:126,3\n63#1:136,3\n64#1:139\n64#1:140,3\n64#1:150,3\n68#1:153\n68#1:154,2\n63#1:129,7\n64#1:143,7\n*E\n"})
/* loaded from: classes7.dex */
public abstract class e extends i {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ o<Object>[] f77989d = {l1.u(new g1(l1.d(e.class), ProtectedSandApp.s("桤\u0001"), ProtectedSandApp.s("桥\u0001")))};

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.descriptors.e f77990b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i f77991c;

    /* compiled from: GivenFunctionsMemberScope.kt */
    static final class a extends n0 implements ld.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.m>> {
        a() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<kotlin.reflect.jvm.internal.impl.descriptors.m> invoke() {
            List<z> j4 = e.this.j();
            return w.D4(j4, e.this.k(j4));
        }
    }

    /* compiled from: GivenFunctionsMemberScope.kt */
    public static final class b extends kotlin.reflect.jvm.internal.impl.resolve.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.m> f77993a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f77994b;

        b(ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.m> arrayList, e eVar) {
            this.f77993a = arrayList;
            this.f77994b = eVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.k
        public void a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("窍\u0001"));
            kotlin.reflect.jvm.internal.impl.resolve.l.K(bVar, null);
            this.f77993a.add(bVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.j
        protected void e(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar2) {
            l0.p(bVar, ProtectedSandApp.s("窎\u0001"));
            l0.p(bVar2, ProtectedSandApp.s("窏\u0001"));
            throw new IllegalStateException((ProtectedSandApp.s("窐\u0001") + this.f77994b.m() + ProtectedSandApp.s("窑\u0001") + bVar + ProtectedSandApp.s("窒\u0001") + bVar2).toString());
        }
    }

    public e(@fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(nVar, ProtectedSandApp.s("桦\u0001"));
        l0.p(eVar, ProtectedSandApp.s("桧\u0001"));
        this.f77990b = eVar;
        this.f77991c = nVar.h(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<kotlin.reflect.jvm.internal.impl.descriptors.m> k(List<? extends z> list) {
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection;
        ArrayList arrayList = new ArrayList(3);
        Collection<h0> j4 = this.f77990b.j().j();
        l0.o(j4, ProtectedSandApp.s("桨\u0001"));
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = j4.iterator();
        while (it.hasNext()) {
            w.q0(arrayList2, k.a.a(((h0) it.next()).q(), null, null, 3, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) {
                arrayList3.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList3) {
            kotlin.reflect.jvm.internal.impl.name.f name = ((kotlin.reflect.jvm.internal.impl.descriptors.b) obj2).getName();
            Object obj3 = linkedHashMap.get(name);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(name, obj3);
            }
            ((List) obj3).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            kotlin.reflect.jvm.internal.impl.name.f fVar = (kotlin.reflect.jvm.internal.impl.name.f) entry.getKey();
            List list2 = (List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj4 : list2) {
                Boolean valueOf = Boolean.valueOf(((kotlin.reflect.jvm.internal.impl.descriptors.b) obj4) instanceof z);
                Object obj5 = linkedHashMap2.get(valueOf);
                if (obj5 == null) {
                    obj5 = new ArrayList();
                    linkedHashMap2.put(valueOf, obj5);
                }
                ((List) obj5).add(obj4);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean booleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list3 = (List) entry2.getValue();
                kotlin.reflect.jvm.internal.impl.resolve.l lVar = kotlin.reflect.jvm.internal.impl.resolve.l.f77929f;
                List list4 = list3;
                if (booleanValue) {
                    collection = new ArrayList<>();
                    for (Object obj6 : list) {
                        if (l0.g(((z) obj6).getName(), fVar)) {
                            collection.add(obj6);
                        }
                    }
                } else {
                    collection = j0.f74919b;
                }
                lVar.v(fVar, list4, collection, this.f77990b, new b(arrayList, this));
            }
        }
        return kotlin.reflect.jvm.internal.impl.utils.a.c(arrayList);
    }

    private final List<kotlin.reflect.jvm.internal.impl.descriptors.m> l() {
        return (List) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f77991c, this, f77989d[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.l
    public Collection<z0> a(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        Collection<z0> collection;
        l0.p(fVar, ProtectedSandApp.s("桩\u0001"));
        l0.p(bVar, ProtectedSandApp.s("桪\u0001"));
        List<kotlin.reflect.jvm.internal.impl.descriptors.m> l4 = l();
        if (l4.isEmpty()) {
            collection = j0.f74919b;
        } else {
            kotlin.reflect.jvm.internal.impl.utils.f fVar2 = new kotlin.reflect.jvm.internal.impl.utils.f();
            for (Object obj : l4) {
                if ((obj instanceof z0) && l0.g(((z0) obj).getName(), fVar)) {
                    fVar2.add(obj);
                }
            }
            collection = fVar2;
        }
        return collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    public Collection<u0> b(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        Collection<u0> collection;
        l0.p(fVar, ProtectedSandApp.s("桩\u0001"));
        l0.p(bVar, ProtectedSandApp.s("桪\u0001"));
        List<kotlin.reflect.jvm.internal.impl.descriptors.m> l4 = l();
        if (l4.isEmpty()) {
            collection = j0.f74919b;
        } else {
            kotlin.reflect.jvm.internal.impl.utils.f fVar2 = new kotlin.reflect.jvm.internal.impl.utils.f();
            for (Object obj : l4) {
                if ((obj instanceof u0) && l0.g(((u0) obj).getName(), fVar)) {
                    fVar2.add(obj);
                }
            }
            collection = fVar2;
        }
        return collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.l
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g(@fg.l d dVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("桫\u0001"));
        l0.p(lVar, ProtectedSandApp.s("桬\u0001"));
        return !dVar.a(d.f77974p.m()) ? j0.f74919b : l();
    }

    @fg.l
    protected abstract List<z> j();

    @fg.l
    protected final kotlin.reflect.jvm.internal.impl.descriptors.e m() {
        return this.f77990b;
    }
}
