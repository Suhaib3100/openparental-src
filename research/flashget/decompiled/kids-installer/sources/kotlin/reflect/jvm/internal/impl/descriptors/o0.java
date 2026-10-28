package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PackageFragmentProvider.kt */
/* loaded from: classes5.dex */
public final class o0 {
    public static final void a(@d5.d m0 m0Var, @d5.d kotlin.reflect.jvm.internal.impl.name.c cVar, @d5.d Collection<l0> collection) {
        kotlin.jvm.internal.l0.p(m0Var, ProtectedSandApp.s("䠌"));
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("䠍"));
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("䠎"));
        if (m0Var instanceof p0) {
            ((p0) m0Var).b(cVar, collection);
        } else {
            collection.addAll(m0Var.a(cVar));
        }
    }

    public static final boolean b(@d5.d m0 m0Var, @d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        kotlin.jvm.internal.l0.p(m0Var, ProtectedSandApp.s("䠏"));
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("䠐"));
        return m0Var instanceof p0 ? ((p0) m0Var).c(cVar) : c(m0Var, cVar).isEmpty();
    }

    @d5.d
    public static final List<l0> c(@d5.d m0 m0Var, @d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        kotlin.jvm.internal.l0.p(m0Var, ProtectedSandApp.s("䠑"));
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("䠒"));
        ArrayList arrayList = new ArrayList();
        a(m0Var, cVar, arrayList);
        return arrayList;
    }
}
