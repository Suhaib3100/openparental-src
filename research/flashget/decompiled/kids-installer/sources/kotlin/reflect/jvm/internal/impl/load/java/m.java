package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.f1;
import kotlin.jvm.internal.l0;

/* compiled from: FakePureImplementationsProvider.kt */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final m f24807a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final Map<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> f24808b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private static final Map<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.c> f24809c;

    static {
        Map<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.name.c> B0;
        m mVar = new m();
        f24807a = mVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f24808b = linkedHashMap;
        kotlin.reflect.jvm.internal.impl.name.i iVar = kotlin.reflect.jvm.internal.impl.name.i.f25623a;
        mVar.c(iVar.l(), mVar.a(ProtectedSandApp.s("䪷"), ProtectedSandApp.s("䪸")));
        mVar.c(iVar.n(), mVar.a(ProtectedSandApp.s("䪻"), ProtectedSandApp.s("䪹"), ProtectedSandApp.s("䪺")));
        mVar.c(iVar.m(), mVar.a(ProtectedSandApp.s("䪾"), ProtectedSandApp.s("䪿"), ProtectedSandApp.s("䫀"), ProtectedSandApp.s("䪼"), ProtectedSandApp.s("䪽")));
        kotlin.reflect.jvm.internal.impl.name.b m5 = kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("䫁")));
        l0.o(m5, ProtectedSandApp.s("䫂"));
        mVar.c(m5, mVar.a(ProtectedSandApp.s("䫃")));
        kotlin.reflect.jvm.internal.impl.name.b m6 = kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("䫄")));
        l0.o(m6, ProtectedSandApp.s("䫅"));
        mVar.c(m6, mVar.a(ProtectedSandApp.s("䫆")));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(((kotlin.reflect.jvm.internal.impl.name.b) entry.getKey()).b(), ((kotlin.reflect.jvm.internal.impl.name.b) entry.getValue()).b()));
        }
        B0 = f1.B0(arrayList);
        f24809c = B0;
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
        Map<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> map = f24808b;
        for (Object obj : list) {
            map.put(obj, bVar);
        }
    }

    @d5.e
    public final kotlin.reflect.jvm.internal.impl.name.c b(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("䫇"));
        return f24809c.get(cVar);
    }
}
