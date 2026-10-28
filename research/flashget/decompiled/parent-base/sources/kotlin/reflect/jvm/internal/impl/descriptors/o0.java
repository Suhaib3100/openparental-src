package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PackageFragmentProvider.kt */
/* loaded from: classes7.dex */
public final class o0 {
    public static final void a(@fg.l m0 m0Var, @fg.l kotlin.reflect.jvm.internal.impl.name.c cVar, @fg.l Collection<l0> collection) {
        kotlin.jvm.internal.l0.p(m0Var, ProtectedSandApp.s("渴\u0001"));
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("渵\u0001"));
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("渶\u0001"));
        if (m0Var instanceof p0) {
            ((p0) m0Var).b(cVar, collection);
        } else {
            collection.addAll(m0Var.a(cVar));
        }
    }

    public static final boolean b(@fg.l m0 m0Var, @fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        kotlin.jvm.internal.l0.p(m0Var, ProtectedSandApp.s("渴\u0001"));
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("渵\u0001"));
        return m0Var instanceof p0 ? ((p0) m0Var).c(cVar) : c(m0Var, cVar).isEmpty();
    }

    @fg.l
    public static final List<l0> c(@fg.l m0 m0Var, @fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        kotlin.jvm.internal.l0.p(m0Var, ProtectedSandApp.s("渴\u0001"));
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("渵\u0001"));
        ArrayList arrayList = new ArrayList();
        a(m0Var, cVar, arrayList);
        return arrayList;
    }
}
