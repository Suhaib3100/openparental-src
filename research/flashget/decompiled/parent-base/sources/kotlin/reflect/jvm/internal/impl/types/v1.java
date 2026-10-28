package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: TypeWithEnhancement.kt */
@kotlin.jvm.internal.r1({"SMAP\nTypeWithEnhancement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeWithEnhancement.kt\norg/jetbrains/kotlin/types/TypeWithEnhancementKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,169:1\n1549#2:170\n1620#2,3:171\n1726#2,3:174\n*S KotlinDebug\n*F\n+ 1 TypeWithEnhancement.kt\norg/jetbrains/kotlin/types/TypeWithEnhancementKt\n*L\n97#1:170\n97#1:171,3\n112#1:174,3\n*E\n"})
/* loaded from: classes7.dex */
public final class v1 {
    /* JADX WARN: Multi-variable type inference failed */
    @fg.m
    public static final h0 a(@fg.l h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("聿\u0001"));
        if (h0Var instanceof u1) {
            return ((u1) h0Var).j0();
        }
        return null;
    }

    @fg.l
    public static final w1 b(@fg.l w1 w1Var, @fg.l h0 h0Var) {
        kotlin.jvm.internal.l0.p(w1Var, ProtectedSandApp.s("聿\u0001"));
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("肀\u0001"));
        return d(w1Var, a(h0Var));
    }

    @fg.l
    public static final w1 c(@fg.l w1 w1Var, @fg.l h0 h0Var, @fg.l ld.l<? super h0, ? extends h0> lVar) {
        kotlin.jvm.internal.l0.p(w1Var, ProtectedSandApp.s("聿\u0001"));
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("肀\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("肁\u0001"));
        h0 a5 = a(h0Var);
        return d(w1Var, a5 != null ? lVar.invoke(a5) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public static final w1 d(@fg.l w1 w1Var, @fg.m h0 h0Var) {
        kotlin.jvm.internal.l0.p(w1Var, ProtectedSandApp.s("聿\u0001"));
        if (w1Var instanceof u1) {
            return d(((u1) w1Var).I0(), h0Var);
        }
        if (h0Var == null || kotlin.jvm.internal.l0.g(h0Var, w1Var)) {
            return w1Var;
        }
        if (w1Var instanceof p0) {
            return new s0((p0) w1Var, h0Var);
        }
        if (w1Var instanceof b0) {
            return new d0((b0) w1Var, h0Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
