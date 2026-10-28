package kotlin.reflect.jvm.internal.impl.name;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.w;
import kotlin.collections.z0;
import kotlin.jvm.internal.r1;
import kotlin.q0;

/* compiled from: StandardClassIds.kt */
@r1({"SMAP\nStandardClassIds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardClassIds.kt\norg/jetbrains/kotlin/name/StandardClassIdsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,287:1\n1179#2,2:288\n1253#2,4:290\n*S KotlinDebug\n*F\n+ 1 StandardClassIds.kt\norg/jetbrains/kotlin/name/StandardClassIdsKt\n*L\n286#1:288,2\n286#1:290,4\n*E\n"})
/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @l
    private static final c f77657a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private static final c f77658b;

    static {
        c cVar = new c(ProtectedSandApp.s("皞\u0001"));
        f77657a = cVar;
        f77658b = kotlin.reflect.jvm.internal.impl.builtins.k.a(ProtectedSandApp.s("皟\u0001"), cVar, ProtectedSandApp.s("皠\u0001"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b k(String str) {
        return new b(i.f77605a.b(), f.f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b l(String str) {
        return new b(i.f77605a.f(), f.f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b m(String str) {
        return new b(i.f77605a.c(), f.f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b n(String str) {
        return new b(i.f77605a.d(), f.f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b o(String str) {
        return new b(i.f77605a.e(), f.f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<V, K> p(Map<K, ? extends V> map) {
        Set<Map.Entry<K, ? extends V>> entrySet = map.entrySet();
        int j4 = z0.j(w.b0(entrySet, 10));
        if (j4 < 16) {
            j4 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(j4);
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            q0 q0Var = new q0(entry.getValue(), entry.getKey());
            linkedHashMap.put(q0Var.e(), q0Var.f());
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b q(f fVar) {
        i iVar = i.f77605a;
        return new b(iVar.a().h(), f.f(fVar.d() + iVar.a().j().d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b r(String str) {
        return new b(i.f77605a.g(), f.f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b s(String str) {
        return new b(i.f77605a.h(), f.f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b t(b bVar) {
        return new b(i.f77605a.f(), f.f(ProtectedSandApp.s("皡\u0001") + bVar.j().d()));
    }
}
