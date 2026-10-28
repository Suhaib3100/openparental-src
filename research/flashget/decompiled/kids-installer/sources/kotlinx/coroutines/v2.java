package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\u001a\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\"\u001a\u0010\b\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u0012\u0004\b\n\u0010\u0007\"\u001a\u0010\u000e\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\f\u0010\u0005\u0012\u0004\b\r\u0010\u0007\"\u001a\u0010\u0011\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u0012\u0004\b\u0010\u0010\u0007\"\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0014\"\u001a\u0010\u001b\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0005\u0012\u0004\b\u001a\u0010\u0007\"\u001a\u0010 \u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010\u0007\"\u001a\u0010#\u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u0012\u0004\b\"\u0010\u0007¨\u0006$"}, d2 = {"", "g", "o", "Lkotlinx/coroutines/internal/r0;", "a", "Lkotlinx/coroutines/internal/r0;", "getCOMPLETING_ALREADY$annotations", "()V", "COMPLETING_ALREADY", "b", "getCOMPLETING_WAITING_CHILDREN$annotations", "COMPLETING_WAITING_CHILDREN", "c", "getCOMPLETING_RETRY$annotations", "COMPLETING_RETRY", "d", "getTOO_LATE_TO_CANCEL$annotations", "TOO_LATE_TO_CANCEL", "", "e", "I", "RETRY", "f", "FALSE", "TRUE", "h", "getSEALED$annotations", "SEALED", "Lkotlinx/coroutines/s1;", "i", "Lkotlinx/coroutines/s1;", "getEMPTY_NEW$annotations", "EMPTY_NEW", "j", "getEMPTY_ACTIVE$annotations", "EMPTY_ACTIVE", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class v2 {

    /* renamed from: e, reason: collision with root package name */
    private static final int f29048e = -1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f29049f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static final int f29050g = 1;

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private static final kotlinx.coroutines.internal.r0 f29044a = new kotlinx.coroutines.internal.r0(ProtectedSandApp.s("庍"));

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final kotlinx.coroutines.internal.r0 f29045b = new kotlinx.coroutines.internal.r0(ProtectedSandApp.s("庎"));

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private static final kotlinx.coroutines.internal.r0 f29046c = new kotlinx.coroutines.internal.r0(ProtectedSandApp.s("序"));

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private static final kotlinx.coroutines.internal.r0 f29047d = new kotlinx.coroutines.internal.r0(ProtectedSandApp.s("庐"));

    /* renamed from: h, reason: collision with root package name */
    @d5.d
    private static final kotlinx.coroutines.internal.r0 f29051h = new kotlinx.coroutines.internal.r0(ProtectedSandApp.s("庑"));

    /* renamed from: i, reason: collision with root package name */
    @d5.d
    private static final s1 f29052i = new s1(false);

    /* renamed from: j, reason: collision with root package name */
    @d5.d
    private static final s1 f29053j = new s1(true);

    @d5.e
    public static final Object g(@d5.e Object obj) {
        return obj instanceof g2 ? new h2((g2) obj) : obj;
    }

    private static /* synthetic */ void h() {
    }

    private static /* synthetic */ void i() {
    }

    public static /* synthetic */ void j() {
    }

    private static /* synthetic */ void k() {
    }

    private static /* synthetic */ void l() {
    }

    private static /* synthetic */ void m() {
    }

    private static /* synthetic */ void n() {
    }

    @d5.e
    public static final Object o(@d5.e Object obj) {
        g2 g2Var;
        h2 h2Var = obj instanceof h2 ? (h2) obj : null;
        return (h2Var == null || (g2Var = h2Var.state) == null) ? obj : g2Var;
    }
}
