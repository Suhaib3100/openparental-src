package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.n1;
import kotlin.reflect.jvm.internal.impl.types.t1;
import kotlin.reflect.jvm.internal.impl.types.x1;
import kotlin.reflect.jvm.internal.impl.types.y;
import kotlin.reflect.jvm.internal.impl.types.z;

/* compiled from: RawProjectionComputer.kt */
/* loaded from: classes5.dex */
public final class f extends y {

    /* compiled from: RawProjectionComputer.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24796a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.INFLEXIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f24796a = iArr;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    @d5.d
    public l1 a(@d5.d f1 f1Var, @d5.d z zVar, @d5.d k1 k1Var, @d5.d h0 h0Var) {
        l1 n1Var;
        l0.p(f1Var, ProtectedSandApp.s("䪤"));
        l0.p(zVar, ProtectedSandApp.s("䪥"));
        l0.p(k1Var, ProtectedSandApp.s("䪦"));
        l0.p(h0Var, ProtectedSandApp.s("䪧"));
        if (!(zVar instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a)) {
            return super.a(f1Var, zVar, k1Var, h0Var);
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar = (kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a) zVar;
        if (!aVar.i()) {
            aVar = aVar.l(c.INFLEXIBLE);
        }
        int i5 = a.f24796a[aVar.g().ordinal()];
        if (i5 == 1) {
            return new n1(x1.INVARIANT, h0Var);
        }
        if (i5 != 2 && i5 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (f1Var.z().getAllowsOutPosition()) {
            List<f1> r5 = h0Var.U0().r();
            l0.o(r5, ProtectedSandApp.s("䪨"));
            n1Var = r5.isEmpty() ^ true ? new n1(x1.OUT_VARIANCE, h0Var) : t1.t(f1Var, aVar);
        } else {
            n1Var = new n1(x1.INVARIANT, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(f1Var).H());
        }
        l0.o(n1Var, ProtectedSandApp.s("䪩"));
        return n1Var;
    }
}
