package kotlin.reflect.jvm.internal.impl.name;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.b0;
import kotlin.collections.e1;

/* compiled from: StandardClassIds.kt */
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private static final c f25675a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final c f25676b;

    static {
        c cVar = new c(ProtectedSandApp.s("优"));
        f25675a = cVar;
        f25676b = kotlin.reflect.jvm.internal.impl.builtins.k.a(ProtectedSandApp.s("伙"), cVar, ProtectedSandApp.s("会"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b k(String str) {
        return new b(i.f25623a.b(), f.p(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b l(String str) {
        return new b(i.f25623a.f(), f.p(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b m(String str) {
        return new b(i.f25623a.c(), f.p(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b n(String str) {
        return new b(i.f25623a.d(), f.p(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b o(String str) {
        return new b(i.f25623a.e(), f.p(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<V, K> p(Map<K, ? extends V> map) {
        int b02;
        int j5;
        Set<Map.Entry<K, ? extends V>> entrySet = map.entrySet();
        b02 = b0.b0(entrySet, 10);
        j5 = e1.j(b02);
        if (j5 < 16) {
            j5 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(j5);
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pair = new Pair(entry.getValue(), entry.getKey());
            linkedHashMap.put(pair.e(), pair.f());
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b q(f fVar) {
        i iVar = i.f25623a;
        return new b(iVar.a().h(), f.p(fVar.l() + iVar.a().j().l()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b r(String str) {
        return new b(i.f25623a.g(), f.p(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b s(String str) {
        return new b(i.f25623a.h(), f.p(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b t(b bVar) {
        return new b(i.f25623a.f(), f.p(ProtectedSandApp.s("伛") + bVar.j().l()));
    }
}
