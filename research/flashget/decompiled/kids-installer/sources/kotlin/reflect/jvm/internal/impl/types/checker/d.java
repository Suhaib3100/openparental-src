package kotlin.reflect.jvm.internal.impl.types.checker;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.b0;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.types.e0;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.w1;

/* compiled from: IntersectionType.kt */
/* loaded from: classes5.dex */
public final class d {
    @d5.d
    public static final w1 a(@d5.d List<? extends w1> list) {
        Object h5;
        int b02;
        int b03;
        p0 c12;
        l0.p(list, ProtectedSandApp.s("喘"));
        int size = list.size();
        if (size == 0) {
            throw new IllegalStateException(ProtectedSandApp.s("喙").toString());
        }
        if (size == 1) {
            h5 = j0.h5(list);
            return (w1) h5;
        }
        b02 = b0.b0(list, 10);
        ArrayList arrayList = new ArrayList(b02);
        boolean z5 = false;
        boolean z6 = false;
        for (w1 w1Var : list) {
            z5 = z5 || kotlin.reflect.jvm.internal.impl.types.j0.a(w1Var);
            if (w1Var instanceof p0) {
                c12 = (p0) w1Var;
            } else {
                if (!(w1Var instanceof kotlin.reflect.jvm.internal.impl.types.b0)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (kotlin.reflect.jvm.internal.impl.types.x.a(w1Var)) {
                    return w1Var;
                }
                c12 = ((kotlin.reflect.jvm.internal.impl.types.b0) w1Var).c1();
                z6 = true;
            }
            arrayList.add(c12);
        }
        if (z5) {
            return kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.INTERSECTION_OF_ERROR_TYPES, list.toString());
        }
        if (!z6) {
            return w.f26374a.c(arrayList);
        }
        b03 = b0.b0(list, 10);
        ArrayList arrayList2 = new ArrayList(b03);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(e0.d((w1) it.next()));
        }
        w wVar = w.f26374a;
        return i0.d(wVar.c(arrayList), wVar.c(arrayList2));
    }
}
