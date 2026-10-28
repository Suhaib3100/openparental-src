package androidx.compose.runtime.collection;

import fg.l;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: IdentityArraySet.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0080\b¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "T", "", "Lkotlin/Function1;", "Lkotlin/k2;", "block", "a", "(Ljava/util/Set;Lld/l;)V", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nIdentityArraySet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySetKt\n+ 2 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,402:1\n108#2,7:403\n1855#3,2:410\n*S KotlinDebug\n*F\n+ 1 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySetKt\n*L\n397#1:403,7\n399#1:410,2\n*E\n"})
/* loaded from: classes.dex */
public final class e {
    public static final <T> void a(@l Set<? extends T> set, @l ld.l<? super T, k2> lVar) {
        if (!(set instanceof d)) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                lVar.invoke(it.next());
            }
            return;
        }
        d dVar = (d) set;
        Object[] values = dVar.getValues();
        int size = dVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = values[i4];
            l0.n(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            lVar.invoke(obj);
        }
    }
}
