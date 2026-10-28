package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.q0;

/* compiled from: FakePureImplementationsProvider.kt */
@r1({"SMAP\nFakePureImplementationsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FakePureImplementationsProvider.kt\norg/jetbrains/kotlin/load/java/FakePureImplementationsProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,38:1\n1285#2,4:39\n11065#3:43\n11400#3,3:44\n125#4:47\n152#4,3:48\n*S KotlinDebug\n*F\n+ 1 FakePureImplementationsProvider.kt\norg/jetbrains/kotlin/load/java/FakePureImplementationsProvider\n*L\n18#1:39,4\n36#1:43\n36#1:44,3\n32#1:47\n32#1:48,3\n*E\n"})
/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final m f76682a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final Map<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> f76683b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final Map<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.c> f76684c;

    static {
        m mVar = new m();
        f76682a = mVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f76683b = linkedHashMap;
        kotlin.reflect.jvm.internal.impl.name.i iVar = kotlin.reflect.jvm.internal.impl.name.i.f77605a;
        mVar.c(iVar.l(), mVar.a(ProtectedSandApp.s("牑\u0001"), ProtectedSandApp.s("牒\u0001")));
        mVar.c(iVar.n(), mVar.a(ProtectedSandApp.s("牕\u0001"), ProtectedSandApp.s("牓\u0001"), ProtectedSandApp.s("牔\u0001")));
        mVar.c(iVar.m(), mVar.a(ProtectedSandApp.s("牘\u0001"), ProtectedSandApp.s("牙\u0001"), ProtectedSandApp.s("牚\u0001"), ProtectedSandApp.s("牖\u0001"), ProtectedSandApp.s("牗\u0001")));
        kotlin.reflect.jvm.internal.impl.name.b m4 = kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("牛\u0001")));
        String s4 = ProtectedSandApp.s("牜\u0001");
        l0.o(m4, s4);
        mVar.c(m4, mVar.a(ProtectedSandApp.s("牝\u0001")));
        kotlin.reflect.jvm.internal.impl.name.b m5 = kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("牞\u0001")));
        l0.o(m5, s4);
        mVar.c(m5, mVar.a(ProtectedSandApp.s("牟\u0001")));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new q0(((kotlin.reflect.jvm.internal.impl.name.b) entry.getKey()).b(), ((kotlin.reflect.jvm.internal.impl.name.b) entry.getValue()).b()));
        }
        f76684c = z0.B0(arrayList);
    }

    private m() {
    }

    private final List<kotlin.reflect.jvm.internal.impl.name.b> a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(str)));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void c(kotlin.reflect.jvm.internal.impl.name.b bVar, List<kotlin.reflect.jvm.internal.impl.name.b> list) {
        Map<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> map = f76683b;
        for (Object obj : list) {
            map.put(obj, bVar);
        }
    }

    @fg.m
    public final kotlin.reflect.jvm.internal.impl.name.c b(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("牠\u0001"));
        return f76684c.get(cVar);
    }
}
