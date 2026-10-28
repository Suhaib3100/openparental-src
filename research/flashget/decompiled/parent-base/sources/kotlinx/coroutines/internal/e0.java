package kotlinx.coroutines.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.v2;

/* compiled from: MainDispatchers.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\n\u001a!\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013\"\u001a\u0010\u0019\u001a\u00020\u00068\u0002X\u0082D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/internal/c0;", "", "factories", "Lkotlinx/coroutines/v2;", "f", "(Lkotlinx/coroutines/internal/c0;Ljava/util/List;)Lkotlinx/coroutines/v2;", "", "d", "(Lkotlinx/coroutines/v2;)Z", "", "cause", "", "errorHint", "Lkotlinx/coroutines/internal/f0;", "a", "(Ljava/lang/Throwable;Ljava/lang/String;)Lkotlinx/coroutines/internal/f0;", "", "e", "()Ljava/lang/Void;", "Ljava/lang/String;", "FAST_SERVICE_LOADER_PROPERTY_NAME", "b", "Z", "c", "()V", "SUPPORT_MISSING", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatchersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
/* loaded from: classes7.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final String f80759a = ProtectedSandApp.s("蟚\u0001");

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f80760b = false;

    private static final f0 a(Throwable th, String str) {
        if (th != null) {
            throw th;
        }
        e();
        throw new KotlinNothingValueException();
    }

    static /* synthetic */ f0 b(Throwable th, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            th = null;
        }
        if ((i4 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    private static /* synthetic */ void c() {
    }

    @f2
    public static final boolean d(@fg.l v2 v2Var) {
        return v2Var.j1() instanceof f0;
    }

    @fg.l
    public static final Void e() {
        throw new IllegalStateException(ProtectedSandApp.s("蟛\u0001"));
    }

    @fg.l
    @f2
    public static final v2 f(@fg.l c0 c0Var, @fg.l List<? extends c0> list) {
        try {
            return c0Var.b(list);
        } catch (Throwable th) {
            return a(th, c0Var.a());
        }
    }
}
