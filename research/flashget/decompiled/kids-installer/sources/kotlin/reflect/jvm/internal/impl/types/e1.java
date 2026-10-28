package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.reflect.jvm.internal.impl.types.c1;

/* compiled from: TypeAttributes.kt */
/* loaded from: classes5.dex */
public final class e1 {
    @d5.d
    public static final d1 a(@d5.d d1 d1Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        d1 t5;
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("嘎"));
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("嘏"));
        if (l.a(d1Var) == gVar) {
            return d1Var;
        }
        k b6 = l.b(d1Var);
        if (b6 != null && (t5 = d1Var.t(b6)) != null) {
            d1Var = t5;
        }
        return (gVar.iterator().hasNext() || !gVar.isEmpty()) ? d1Var.s(new k(gVar)) : d1Var;
    }

    @d5.d
    public static final d1 b(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("嘐"));
        return c1.a.a(p.f26514a, gVar, null, null, 6, null);
    }
}
