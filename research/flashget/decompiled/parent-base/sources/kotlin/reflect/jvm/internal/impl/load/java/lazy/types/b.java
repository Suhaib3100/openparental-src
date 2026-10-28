package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.collections.l1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.types.s1;

/* compiled from: JavaTypeAttributes.kt */
@r1({"SMAP\nJavaTypeAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaTypeAttributes.kt\norg/jetbrains/kotlin/load/java/lazy/types/JavaTypeAttributesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
/* loaded from: classes7.dex */
public final class b {
    @l
    public static final a a(@l s1 s1Var, boolean z4, boolean z5, @m f1 f1Var) {
        l0.p(s1Var, ProtectedSandApp.s("爕\u0001"));
        return new a(s1Var, null, z5, z4, f1Var != null ? l1.f(f1Var) : null, null, 34, null);
    }

    public static /* synthetic */ a b(s1 s1Var, boolean z4, boolean z5, f1 f1Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        if ((i4 & 2) != 0) {
            z5 = false;
        }
        if ((i4 & 4) != 0) {
            f1Var = null;
        }
        return a(s1Var, z4, z5, f1Var);
    }
}
