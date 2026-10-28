package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
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
/* loaded from: classes7.dex */
public final class f extends y {

    /* compiled from: RawProjectionComputer.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76671a;

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
            f76671a = iArr;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    @l
    public l1 a(@l f1 f1Var, @l z zVar, @l k1 k1Var, @l h0 h0Var) {
        l1 n1Var;
        l0.p(f1Var, ProtectedSandApp.s("爭\u0001"));
        l0.p(zVar, ProtectedSandApp.s("爮\u0001"));
        l0.p(k1Var, ProtectedSandApp.s("爯\u0001"));
        l0.p(h0Var, ProtectedSandApp.s("爰\u0001"));
        if (!(zVar instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a)) {
            return super.a(f1Var, zVar, k1Var, h0Var);
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar = (kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a) zVar;
        if (!aVar.i()) {
            aVar = aVar.l(c.INFLEXIBLE);
        }
        int i4 = a.f76671a[aVar.g().ordinal()];
        if (i4 == 1) {
            return new n1(x1.INVARIANT, h0Var);
        }
        if (i4 != 2 && i4 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (f1Var.o().getAllowsOutPosition()) {
            List<f1> parameters = h0Var.O0().getParameters();
            l0.o(parameters, ProtectedSandApp.s("爱\u0001"));
            n1Var = !parameters.isEmpty() ? new n1(x1.OUT_VARIANCE, h0Var) : t1.t(f1Var, aVar);
        } else {
            n1Var = new n1(x1.INVARIANT, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(f1Var).H());
        }
        l0.m(n1Var);
        return n1Var;
    }
}
