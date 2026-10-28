package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.h1;
import kotlin.reflect.jvm.internal.impl.descriptors.i0;
import kotlin.reflect.jvm.internal.impl.metadata.a;

/* compiled from: ValueClassUtil.kt */
@r1({"SMAP\nValueClassUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueClassUtil.kt\norg/jetbrains/kotlin/serialization/deserialization/ValueClassUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n1549#2:47\n1620#2,3:48\n1549#2:51\n1620#2,3:52\n1549#2:55\n1620#2,3:56\n*S KotlinDebug\n*F\n+ 1 ValueClassUtil.kt\norg/jetbrains/kotlin/serialization/deserialization/ValueClassUtilKt\n*L\n25#1:47\n25#1:48,3\n29#1:51\n29#1:52,3\n32#1:55\n32#1:56,3\n*E\n"})
/* loaded from: classes7.dex */
public final class h0 {
    /* JADX WARN: Multi-variable type inference failed */
    @fg.m
    public static final <T extends ce.j> h1<T> a(@fg.l a.c cVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar2, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, @fg.l ld.l<? super a.q, ? extends T> lVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, ? extends T> lVar2) {
        T invoke;
        List<a.q> T0;
        l0.p(cVar, ProtectedSandApp.s("籇\u0001"));
        l0.p(cVar2, ProtectedSandApp.s("籈\u0001"));
        l0.p(gVar, ProtectedSandApp.s("籉\u0001"));
        l0.p(lVar, ProtectedSandApp.s("籊\u0001"));
        l0.p(lVar2, ProtectedSandApp.s("籋\u0001"));
        if (cVar.N0() <= 0) {
            if (!cVar.p1()) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.name.f b5 = z.b(cVar2, cVar.K0());
            a.q i4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.i(cVar, gVar);
            if ((i4 != null && (invoke = lVar.invoke(i4)) != null) || (invoke = lVar2.invoke(b5)) != null) {
                return new kotlin.reflect.jvm.internal.impl.descriptors.a0(b5, invoke);
            }
            throw new IllegalStateException((ProtectedSandApp.s("籐\u0001") + z.b(cVar2, cVar.G0()) + ProtectedSandApp.s("籑\u0001") + b5).toString());
        }
        List<Integer> O0 = cVar.O0();
        l0.o(O0, ProtectedSandApp.s("籌\u0001"));
        List<Integer> list = O0;
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list, 10));
        for (Integer num : list) {
            l0.m(num);
            arrayList.add(z.b(cVar2, num.intValue()));
        }
        q0 q0Var = new q0(Integer.valueOf(cVar.R0()), Integer.valueOf(cVar.Q0()));
        if (l0.g(q0Var, new q0(Integer.valueOf(arrayList.size()), 0))) {
            List<Integer> S0 = cVar.S0();
            l0.o(S0, ProtectedSandApp.s("籍\u0001"));
            List<Integer> list2 = S0;
            T0 = new ArrayList<>(kotlin.collections.w.b0(list2, 10));
            for (Integer num2 : list2) {
                l0.m(num2);
                T0.add(gVar.a(num2.intValue()));
            }
        } else {
            if (!l0.g(q0Var, new q0(0, Integer.valueOf(arrayList.size())))) {
                throw new IllegalStateException((ProtectedSandApp.s("籎\u0001") + z.b(cVar2, cVar.G0()) + ProtectedSandApp.s("籏\u0001")).toString());
            }
            T0 = cVar.T0();
        }
        l0.m(T0);
        List<a.q> list3 = T0;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.w.b0(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList2.add(lVar.invoke(it.next()));
        }
        return new i0(kotlin.collections.w.i6(arrayList, arrayList2));
    }
}
