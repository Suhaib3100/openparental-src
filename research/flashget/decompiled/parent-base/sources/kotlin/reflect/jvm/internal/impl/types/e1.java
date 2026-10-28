package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.reflect.jvm.internal.impl.types.c1;

/* compiled from: TypeAttributes.kt */
@kotlin.jvm.internal.r1({"SMAP\nTypeAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAttributes.kt\norg/jetbrains/kotlin/types/TypeAttributesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
/* loaded from: classes7.dex */
public final class e1 {
    @fg.l
    public static final d1 a(@fg.l d1 d1Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        d1 q4;
        kotlin.jvm.internal.l0.p(d1Var, ProtectedSandApp.s("縊\u0001"));
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("縋\u0001"));
        if (l.a(d1Var) == gVar) {
            return d1Var;
        }
        k b5 = l.b(d1Var);
        if (b5 != null && (q4 = d1Var.q(b5)) != null) {
            d1Var = q4;
        }
        return (gVar.iterator().hasNext() || !gVar.isEmpty()) ? d1Var.p(new k(gVar)) : d1Var;
    }

    @fg.l
    public static final d1 b(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("縊\u0001"));
        return c1.a.a(p.f78523a, gVar, null, null, 6, null);
    }
}
