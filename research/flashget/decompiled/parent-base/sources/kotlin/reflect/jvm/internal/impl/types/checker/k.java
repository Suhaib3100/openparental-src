package kotlin.reflect.jvm.internal.impl.types.checker;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.types.checker.f;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.i1;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.q1;
import kotlin.reflect.jvm.internal.impl.types.w1;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: NewCapturedType.kt */
@r1({"SMAP\nNewCapturedType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewCapturedType.kt\norg/jetbrains/kotlin/types/checker/NewCapturedTypeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,290:1\n1#2:291\n1#2:310\n1655#3,8:292\n1603#3,9:300\n1855#3:309\n1856#3:311\n1612#3:312\n1726#3,3:313\n1549#3:316\n1620#3,3:317\n1620#3,3:320\n1549#3:323\n1620#3,3:324\n*S KotlinDebug\n*F\n+ 1 NewCapturedType.kt\norg/jetbrains/kotlin/types/checker/NewCapturedTypeKt\n*L\n122#1:310\n117#1:292,8\n122#1:300,9\n122#1:309\n122#1:311\n122#1:312\n154#1:313,3\n156#1:316\n156#1:317,3\n176#1:320,3\n81#1:323\n81#1:324,3\n*E\n"})
/* loaded from: classes7.dex */
public final class k {
    private static final List<l1> a(w1 w1Var, ce.b bVar) {
        if (w1Var.M0().size() != w1Var.O0().getParameters().size()) {
            return null;
        }
        List<l1> M0 = w1Var.M0();
        List<l1> list = M0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((l1) it.next()).c() != x1.INVARIANT) {
                    List<f1> parameters = w1Var.O0().getParameters();
                    l0.o(parameters, ProtectedSandApp.s("綃\u0001"));
                    List<q0> i6 = kotlin.collections.w.i6(list, parameters);
                    ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(i6, 10));
                    for (q0 q0Var : i6) {
                        l1 l1Var = (l1) q0Var.a();
                        f1 f1Var = (f1) q0Var.b();
                        if (l1Var.c() != x1.INVARIANT) {
                            w1 R0 = (l1Var.b() || l1Var.c() != x1.IN_VARIANCE) ? null : l1Var.getType().R0();
                            l0.m(f1Var);
                            l1Var = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.a(new i(bVar, R0, l1Var, f1Var));
                        }
                        arrayList.add(l1Var);
                    }
                    q1 c5 = i1.f78491c.b(w1Var.O0(), arrayList).c();
                    int size = M0.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        l1 l1Var2 = M0.get(i4);
                        l1 l1Var3 = (l1) arrayList.get(i4);
                        if (l1Var2.c() != x1.INVARIANT) {
                            List<h0> upperBounds = w1Var.O0().getParameters().get(i4).getUpperBounds();
                            l0.o(upperBounds, ProtectedSandApp.s("綄\u0001"));
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<T> it2 = upperBounds.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(f.a.f78350a.a(c5.n((h0) it2.next(), x1.INVARIANT).R0()));
                            }
                            if (!l1Var2.b() && l1Var2.c() == x1.OUT_VARIANCE) {
                                arrayList2.add(f.a.f78350a.a(l1Var2.getType().R0()));
                            }
                            h0 type = l1Var3.getType();
                            l0.n(type, ProtectedSandApp.s("綅\u0001"));
                            ((i) type).Y0().h(arrayList2);
                        }
                    }
                    return arrayList;
                }
            }
        }
        return null;
    }

    @fg.m
    public static final p0 b(@fg.l p0 p0Var, @fg.l ce.b bVar) {
        l0.p(p0Var, ProtectedSandApp.s("綆\u0001"));
        l0.p(bVar, ProtectedSandApp.s("綇\u0001"));
        List<l1> a5 = a(p0Var, bVar);
        if (a5 != null) {
            return c(p0Var, a5);
        }
        return null;
    }

    private static final p0 c(w1 w1Var, List<? extends l1> list) {
        return i0.l(w1Var.N0(), w1Var.O0(), list, w1Var.P0(), null, 16, null);
    }
}
