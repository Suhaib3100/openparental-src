package kotlin.reflect.jvm.internal.impl.types.checker;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.types.b0;
import kotlin.reflect.jvm.internal.impl.types.e0;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.w1;

/* compiled from: IntersectionType.kt */
@r1({"SMAP\nIntersectionType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntersectionType.kt\norg/jetbrains/kotlin/types/checker/IntersectionTypeKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,183:1\n1549#2:184\n1620#2,3:185\n1549#2:188\n1620#2,3:189\n1549#2:192\n1620#2,3:193\n*S KotlinDebug\n*F\n+ 1 IntersectionType.kt\norg/jetbrains/kotlin/types/checker/IntersectionTypeKt\n*L\n26#1:184\n26#1:185,3\n38#1:188\n38#1:189,3\n58#1:192\n58#1:193,3\n*E\n"})
/* loaded from: classes7.dex */
public final class d {
    @fg.l
    public static final w1 a(@fg.l List<? extends w1> list) {
        p0 W0;
        l0.p(list, ProtectedSandApp.s("絢\u0001"));
        int size = list.size();
        if (size == 0) {
            throw new IllegalStateException(ProtectedSandApp.s("絣\u0001"));
        }
        if (size == 1) {
            return (w1) kotlin.collections.w.h5(list);
        }
        List<? extends w1> list2 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list2, 10));
        boolean z4 = false;
        boolean z5 = false;
        for (w1 w1Var : list2) {
            z4 = z4 || j0.a(w1Var);
            if (w1Var instanceof p0) {
                W0 = (p0) w1Var;
            } else {
                if (!(w1Var instanceof b0)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (kotlin.reflect.jvm.internal.impl.types.x.a(w1Var)) {
                    return w1Var;
                }
                W0 = ((b0) w1Var).W0();
                z5 = true;
            }
            arrayList.add(W0);
        }
        if (z4) {
            return kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.INTERSECTION_OF_ERROR_TYPES, list.toString());
        }
        if (!z5) {
            return w.f78382a.c(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.w.b0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(e0.d((w1) it.next()));
        }
        w wVar = w.f78382a;
        return i0.d(wVar.c(arrayList), wVar.c(arrayList2));
    }
}
