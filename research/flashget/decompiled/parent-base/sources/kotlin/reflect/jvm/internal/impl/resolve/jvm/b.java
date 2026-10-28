package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: inlineClassManglingRules.kt */
@r1({"SMAP\ninlineClassManglingRules.kt\nKotlin\n*S Kotlin\n*F\n+ 1 inlineClassManglingRules.kt\norg/jetbrains/kotlin/resolve/jvm/InlineClassManglingRulesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1747#2,3:54\n1747#2,3:57\n1#3:60\n*S KotlinDebug\n*F\n+ 1 inlineClassManglingRules.kt\norg/jetbrains/kotlin/resolve/jvm/InlineClassManglingRulesKt\n*L\n21#1:54,3\n27#1:57,3\n*E\n"})
/* loaded from: classes7.dex */
public final class b {
    private static final boolean a(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        return l0.g(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.l(eVar), l.f75832u);
    }

    private static final boolean b(h0 h0Var, boolean z4) {
        h c5 = h0Var.O0().c();
        f1 f1Var = c5 instanceof f1 ? (f1) c5 : null;
        if (f1Var == null) {
            return false;
        }
        return (z4 || !kotlin.reflect.jvm.internal.impl.resolve.h.d(f1Var)) && e(kotlin.reflect.jvm.internal.impl.types.typeUtil.a.j(f1Var));
    }

    public static final boolean c(@fg.l m mVar) {
        l0.p(mVar, ProtectedSandApp.s("禝\u0001"));
        return kotlin.reflect.jvm.internal.impl.resolve.h.g(mVar) && !a((kotlin.reflect.jvm.internal.impl.descriptors.e) mVar);
    }

    public static final boolean d(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("禝\u0001"));
        h c5 = h0Var.O0().c();
        if (c5 != null) {
            return (kotlin.reflect.jvm.internal.impl.resolve.h.b(c5) && c(c5)) || kotlin.reflect.jvm.internal.impl.resolve.h.i(h0Var);
        }
        return false;
    }

    private static final boolean e(h0 h0Var) {
        return d(h0Var) || b(h0Var, true);
    }

    public static final boolean f(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("禞\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar = bVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.d ? (kotlin.reflect.jvm.internal.impl.descriptors.d) bVar : null;
        if (dVar == null || t.g(dVar.getVisibility())) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e g02 = dVar.g0();
        l0.o(g02, ProtectedSandApp.s("禟\u0001"));
        if (kotlin.reflect.jvm.internal.impl.resolve.h.g(g02) || kotlin.reflect.jvm.internal.impl.resolve.f.G(dVar.g0())) {
            return false;
        }
        List<j1> i4 = dVar.i();
        l0.o(i4, ProtectedSandApp.s("禠\u0001"));
        List<j1> list = i4;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            h0 type = ((j1) it.next()).getType();
            l0.o(type, ProtectedSandApp.s("禡\u0001"));
            if (e(type)) {
                return true;
            }
        }
        return false;
    }
}
