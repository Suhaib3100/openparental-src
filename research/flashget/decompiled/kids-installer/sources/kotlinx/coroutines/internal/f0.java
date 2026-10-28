package kotlinx.coroutines.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlinx.coroutines.i2;
import kotlinx.coroutines.y2;

/* compiled from: MainDispatchers.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\t\u001a\u001a\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0007\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0003H\u0007\u001a \u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002\u001a\b\u0010\u000e\u001a\u00020\rH\u0000\"\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000f\"\u001a\u0010\u0015\u001a\u00020\u00058\u0002X\u0082D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/internal/d0;", "", "factories", "Lkotlinx/coroutines/y2;", "f", "", "d", "", "cause", "", "errorHint", "Lkotlinx/coroutines/internal/g0;", "a", "", "e", "Ljava/lang/String;", "FAST_SERVICE_LOADER_PROPERTY_NAME", "b", "Z", "getSUPPORT_MISSING$annotations", "()V", "SUPPORT_MISSING", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private static final String f28705a = ProtectedSandApp.s("巓");

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f28706b = true;

    private static final g0 a(Throwable th, String str) {
        if (f28706b) {
            return new g0(th, str);
        }
        if (th != null) {
            throw th;
        }
        e();
        throw new KotlinNothingValueException();
    }

    static /* synthetic */ g0 b(Throwable th, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            th = null;
        }
        if ((i5 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    private static /* synthetic */ void c() {
    }

    @i2
    public static final boolean d(@d5.d y2 y2Var) {
        return y2Var.J0() instanceof g0;
    }

    @d5.d
    public static final Void e() {
        throw new IllegalStateException(ProtectedSandApp.s("巔"));
    }

    @d5.d
    @i2
    public static final y2 f(@d5.d d0 d0Var, @d5.d List<? extends d0> list) {
        try {
            return d0Var.b(list);
        } catch (Throwable th) {
            return a(th, d0Var.a());
        }
    }
}
