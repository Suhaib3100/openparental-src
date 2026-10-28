package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: util.kt */
@r1({"SMAP\nutil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 util.kt\norg/jetbrains/kotlin/load/java/descriptors/UtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n1549#2:69\n1620#2,3:70\n*S KotlinDebug\n*F\n+ 1 util.kt\norg/jetbrains/kotlin/load/java/descriptors/UtilKt\n*L\n40#1:69\n40#1:70,3\n*E\n"})
/* loaded from: classes7.dex */
public final class h {
    @l
    public static final List<j1> a(@l Collection<? extends h0> collection, @l Collection<? extends j1> collection2, @l kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        l0.p(collection, ProtectedSandApp.s("炅\u0001"));
        l0.p(collection2, ProtectedSandApp.s("炆\u0001"));
        l0.p(aVar, ProtectedSandApp.s("炇\u0001"));
        collection.size();
        collection2.size();
        List i6 = w.i6(collection, collection2);
        ArrayList arrayList = new ArrayList(w.b0(i6, 10));
        for (Iterator it = i6.iterator(); it.hasNext(); it = it) {
            q0 q0Var = (q0) it.next();
            h0 h0Var = (h0) q0Var.a();
            j1 j1Var = (j1) q0Var.b();
            int index = j1Var.getIndex();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = j1Var.getAnnotations();
            kotlin.reflect.jvm.internal.impl.name.f name = j1Var.getName();
            l0.o(name, ProtectedSandApp.s("炈\u0001"));
            boolean C0 = j1Var.C0();
            boolean t02 = j1Var.t0();
            boolean r02 = j1Var.r0();
            h0 k4 = j1Var.x0() != null ? kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.p(aVar).p().k(h0Var) : null;
            a1 f4 = j1Var.f();
            l0.o(f4, ProtectedSandApp.s("炉\u0001"));
            arrayList.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.l0(aVar, null, index, annotations, name, h0Var, C0, t02, r02, k4, f4));
        }
        return arrayList;
    }

    @m
    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.l b(@l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(eVar, ProtectedSandApp.s("炊\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.e u4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.u(eVar);
        if (u4 == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h o02 = u4.o0();
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.l lVar = o02 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.l ? (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.l) o02 : null;
        return lVar == null ? b(u4) : lVar;
    }
}
