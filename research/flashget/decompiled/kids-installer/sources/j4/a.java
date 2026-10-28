package j4;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.d;
import d5.e;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;

/* compiled from: scopeUtils.kt */
/* loaded from: classes5.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    @e
    public static final <T> Collection<T> a(@e Collection<? extends T> collection, @d Collection<? extends T> collection2) {
        l0.p(collection2, ProtectedSandApp.s("㜒"));
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == 0) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    @d
    public static final kotlin.reflect.jvm.internal.impl.utils.e<h> b(@d Iterable<? extends h> iterable) {
        l0.p(iterable, ProtectedSandApp.s("㜓"));
        kotlin.reflect.jvm.internal.impl.utils.e<h> eVar = new kotlin.reflect.jvm.internal.impl.utils.e<>();
        for (h hVar : iterable) {
            h hVar2 = hVar;
            if ((hVar2 == null || hVar2 == h.c.f26018b) ? false : true) {
                eVar.add(hVar);
            }
        }
        return eVar;
    }
}
