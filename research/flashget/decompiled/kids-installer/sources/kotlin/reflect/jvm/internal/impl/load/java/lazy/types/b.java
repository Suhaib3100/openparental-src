package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.collections.p1;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.types.s1;

/* compiled from: JavaTypeAttributes.kt */
/* loaded from: classes5.dex */
public final class b {
    @d5.d
    public static final a a(@d5.d s1 s1Var, boolean z5, boolean z6, @d5.e f1 f1Var) {
        l0.p(s1Var, ProtectedSandApp.s("䪇"));
        return new a(s1Var, null, z6, z5, f1Var != null ? p1.f(f1Var) : null, null, 34, null);
    }

    public static /* synthetic */ a b(s1 s1Var, boolean z5, boolean z6, f1 f1Var, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z5 = false;
        }
        if ((i5 & 2) != 0) {
            z6 = false;
        }
        if ((i5 & 4) != 0) {
            f1Var = null;
        }
        return a(s1Var, z5, z6, f1Var);
    }
}
