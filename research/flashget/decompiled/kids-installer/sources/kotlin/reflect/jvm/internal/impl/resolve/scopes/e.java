package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.f0;
import kotlin.collections.j0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.k;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: GivenFunctionsMemberScope.kt */
/* loaded from: classes6.dex */
public abstract class e extends i {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f26005d = {l1.u(new g1(l1.d(e.class), ProtectedSandApp.s("聤"), ProtectedSandApp.s("聥")))};

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.e f26006b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i f26007c;

    /* compiled from: GivenFunctionsMemberScope.kt */
    static final class a extends Lambda implements q3.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.m>> {
        a() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<kotlin.reflect.jvm.internal.impl.descriptors.m> n() {
            List<kotlin.reflect.jvm.internal.impl.descriptors.m> D4;
            List<z> j5 = e.this.j();
            D4 = j0.D4(j5, e.this.k(j5));
            return D4;
        }
    }

    /* compiled from: GivenFunctionsMemberScope.kt */
    public static final class b extends kotlin.reflect.jvm.internal.impl.resolve.i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.m> f26009a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f26010b;

        b(ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.m> arrayList, e eVar) {
            this.f26009a = arrayList;
            this.f26010b = eVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.j
        public void a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("蛂"));
            kotlin.reflect.jvm.internal.impl.resolve.k.K(bVar, null);
            this.f26009a.add(bVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.i
        protected void e(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar2) {
            l0.p(bVar, ProtectedSandApp.s("蛃"));
            l0.p(bVar2, ProtectedSandApp.s("蛄"));
            throw new IllegalStateException((ProtectedSandApp.s("蛅") + this.f26010b.m() + ProtectedSandApp.s("蛆") + bVar + ProtectedSandApp.s("蛇") + bVar2).toString());
        }
    }

    public e(@d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(nVar, ProtectedSandApp.s("聦"));
        l0.p(eVar, ProtectedSandApp.s("聧"));
        this.f26006b = eVar;
        this.f26007c = nVar.d(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<kotlin.reflect.jvm.internal.impl.descriptors.m> k(List<? extends z> list) {
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection;
        ArrayList arrayList = new ArrayList(3);
        Collection<h0> m5 = this.f26006b.m().m();
        l0.o(m5, ProtectedSandApp.s("聨"));
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = m5.iterator();
        while (it.hasNext()) {
            f0.q0(arrayList2, k.a.a(((h0) it.next()).C(), null, null, 3, null));
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
                kotlin.reflect.jvm.internal.impl.resolve.k kVar = kotlin.reflect.jvm.internal.impl.resolve.k.f25946f;
                if (booleanValue) {
                    collection = new ArrayList<>();
                    for (Object obj6 : list) {
                        if (l0.g(((z) obj6).getName(), fVar)) {
                            collection.add(obj6);
                        }
                    }
                } else {
                    collection = EmptyList.f23167o;
                }
                kVar.v(fVar, list3, collection, this.f26006b, new b(arrayList, this));
            }
        }
        return kotlin.reflect.jvm.internal.impl.utils.a.c(arrayList);
    }

    private final List<kotlin.reflect.jvm.internal.impl.descriptors.m> l() {
        return (List) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f26007c, this, f26005d[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.d
    public Collection<z0> a(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("聩"));
        l0.p(bVar, ProtectedSandApp.s("聪"));
        List<kotlin.reflect.jvm.internal.impl.descriptors.m> l5 = l();
        kotlin.reflect.jvm.internal.impl.utils.e eVar = new kotlin.reflect.jvm.internal.impl.utils.e();
        for (Object obj : l5) {
            if ((obj instanceof z0) && l0.g(((z0) obj).getName(), fVar)) {
                eVar.add(obj);
            }
        }
        return eVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Collection<u0> d(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("聫"));
        l0.p(bVar, ProtectedSandApp.s("聬"));
        List<kotlin.reflect.jvm.internal.impl.descriptors.m> l5 = l();
        kotlin.reflect.jvm.internal.impl.utils.e eVar = new kotlin.reflect.jvm.internal.impl.utils.e();
        for (Object obj : l5) {
            if ((obj instanceof u0) && l0.g(((u0) obj).getName(), fVar)) {
                eVar.add(obj);
            }
        }
        return eVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g(@d5.d d dVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("聭"));
        l0.p(lVar, ProtectedSandApp.s("聮"));
        return !dVar.a(d.f25990p.m()) ? EmptyList.f23167o : l();
    }

    @d5.d
    protected abstract List<z> j();

    @d5.d
    protected final kotlin.reflect.jvm.internal.impl.descriptors.e m() {
        return this.f26006b;
    }
}
