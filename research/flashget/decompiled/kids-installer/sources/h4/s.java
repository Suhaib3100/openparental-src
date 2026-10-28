package h4;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: TypeSystemContext.kt */
/* loaded from: classes5.dex */
public final class s {

    /* compiled from: TypeSystemContext.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22725a;

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
            f22725a = iArr;
        }
    }

    @d5.d
    public static final w a(@d5.d x1 x1Var) {
        l0.p(x1Var, ProtectedSandApp.s("㛮"));
        int i5 = a.f22725a[x1Var.ordinal()];
        if (i5 == 1) {
            return w.INV;
        }
        if (i5 == 2) {
            return w.IN;
        }
        if (i5 == 3) {
            return w.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
