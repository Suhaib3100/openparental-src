package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: flexibleTypes.kt */
@kotlin.jvm.internal.r1({"SMAP\nflexibleTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 flexibleTypes.kt\norg/jetbrains/kotlin/types/FlexibleTypesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,174:1\n288#2:175\n1726#2,3:176\n289#2:179\n1549#2:180\n1620#2,3:181\n1549#2:184\n1620#2,3:185\n*S KotlinDebug\n*F\n+ 1 flexibleTypes.kt\norg/jetbrains/kotlin/types/FlexibleTypesKt\n*L\n50#1:175\n51#1:176,3\n50#1:179\n62#1:180\n62#1:181,3\n65#1:184\n65#1:185,3\n*E\n"})
/* loaded from: classes7.dex */
public final class e0 {
    @fg.l
    public static final b0 a(@fg.l h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("縈\u0001"));
        w1 R0 = h0Var.R0();
        kotlin.jvm.internal.l0.n(R0, ProtectedSandApp.s("縉\u0001"));
        return (b0) R0;
    }

    public static final boolean b(@fg.l h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("縈\u0001"));
        return h0Var.R0() instanceof b0;
    }

    @fg.l
    public static final p0 c(@fg.l h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("縈\u0001"));
        w1 R0 = h0Var.R0();
        if (R0 instanceof b0) {
            return ((b0) R0).W0();
        }
        if (R0 instanceof p0) {
            return (p0) R0;
        }
        throw new NoWhenBranchMatchedException();
    }

    @fg.l
    public static final p0 d(@fg.l h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("縈\u0001"));
        w1 R0 = h0Var.R0();
        if (R0 instanceof b0) {
            return ((b0) R0).X0();
        }
        if (R0 instanceof p0) {
            return (p0) R0;
        }
        throw new NoWhenBranchMatchedException();
    }
}
