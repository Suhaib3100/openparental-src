package ce;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: TypeSystemContext.kt */
/* loaded from: classes7.dex */
public final class r {

    /* compiled from: TypeSystemContext.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38614a;

        static {
            int[] iArr = new int[x1.values().length];
            try {
                iArr[x1.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x1.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x1.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f38614a = iArr;
        }
    }

    @fg.l
    public static final v a(@fg.l x1 x1Var) {
        l0.p(x1Var, ProtectedSandApp.s("㨗\u0001"));
        int i4 = a.f38614a[x1Var.ordinal()];
        if (i4 == 1) {
            return v.INV;
        }
        if (i4 == 2) {
            return v.IN;
        }
        if (i4 == 3) {
            return v.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
