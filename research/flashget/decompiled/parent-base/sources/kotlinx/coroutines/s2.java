package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006\"\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010\"\u0014\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0010\"\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006\"\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001c"}, d2 = {"", "g", "(Ljava/lang/Object;)Ljava/lang/Object;", "h", "Lkotlinx/coroutines/internal/s0;", "a", "Lkotlinx/coroutines/internal/s0;", "COMPLETING_ALREADY", "b", "COMPLETING_WAITING_CHILDREN", "c", "COMPLETING_RETRY", "d", "TOO_LATE_TO_CANCEL", "", "e", "I", "RETRY", "f", "FALSE", "TRUE", "SEALED", "Lkotlinx/coroutines/p1;", "i", "Lkotlinx/coroutines/p1;", "EMPTY_NEW", "j", "EMPTY_ACTIVE", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class s2 {

    /* renamed from: e, reason: collision with root package name */
    private static final int f80936e = -1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f80937f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static final int f80938g = 1;

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final kotlinx.coroutines.internal.s0 f80932a = new kotlinx.coroutines.internal.s0(ProtectedSandApp.s("衧\u0001"));

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final kotlinx.coroutines.internal.s0 f80933b = new kotlinx.coroutines.internal.s0(ProtectedSandApp.s("表\u0001"));

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final kotlinx.coroutines.internal.s0 f80934c = new kotlinx.coroutines.internal.s0(ProtectedSandApp.s("衩\u0001"));

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final kotlinx.coroutines.internal.s0 f80935d = new kotlinx.coroutines.internal.s0(ProtectedSandApp.s("衪\u0001"));

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final kotlinx.coroutines.internal.s0 f80939h = new kotlinx.coroutines.internal.s0(ProtectedSandApp.s("衫\u0001"));

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private static final p1 f80940i = new p1(false);

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    private static final p1 f80941j = new p1(true);

    @fg.m
    public static final Object g(@fg.m Object obj) {
        return obj instanceof d2 ? new e2((d2) obj) : obj;
    }

    @fg.m
    public static final Object h(@fg.m Object obj) {
        d2 d2Var;
        e2 e2Var = obj instanceof e2 ? (e2) obj : null;
        return (e2Var == null || (d2Var = e2Var.state) == null) ? obj : d2Var;
    }
}
