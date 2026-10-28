package androidx.compose.ui.semantics;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: SemanticsOwner.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/semantics/r;", "", "mergingEnabled", "skipDeactivatedNodes", "", "Landroidx/compose/ui/semantics/p;", "b", "(Landroidx/compose/ui/semantics/r;ZZ)Ljava/util/List;", "a", "(Landroidx/compose/ui/semantics/r;Z)Ljava/util/List;", "useUnmergedTree", "", "", "d", "(Landroidx/compose/ui/semantics/r;ZZ)Ljava/util/Map;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSemanticsOwner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwnerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,100:1\n33#2,6:101\n*S KotlinDebug\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwnerKt\n*L\n90#1:101,6\n*E\n"})
/* loaded from: classes.dex */
public final class s {
    @fg.l
    public static final List<p> b(@fg.l r rVar, boolean z4, boolean z5) {
        return kotlin.collections.w.V5(d(rVar, !z4, z5).values());
    }

    public static /* synthetic */ List c(r rVar, boolean z4, boolean z5, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z5 = true;
        }
        return b(rVar, z4, z5);
    }

    @fg.l
    public static final Map<Integer, p> d(@fg.l r rVar, boolean z4, boolean z5) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f(z5, linkedHashMap, z4 ? rVar.b() : rVar.a());
        return linkedHashMap;
    }

    public static /* synthetic */ Map e(r rVar, boolean z4, boolean z5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        if ((i4 & 2) != 0) {
            z5 = true;
        }
        return d(rVar, z4, z5);
    }

    private static final void f(boolean z4, Map<Integer, p> map, p pVar) {
        if (z4 && pVar.p().getIsDeactivated()) {
            return;
        }
        map.put(Integer.valueOf(pVar.getId()), pVar);
        List<p> l4 = pVar.l();
        int size = l4.size();
        for (int i4 = 0; i4 < size; i4++) {
            f(z4, map, l4.get(i4));
        }
    }
}
