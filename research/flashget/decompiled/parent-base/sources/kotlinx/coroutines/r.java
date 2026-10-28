package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: CancellableContinuationImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a \u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0082\b¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0006\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005\"\u0014\u0010\b\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005\"\u0014\u0010\n\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0005\"\u0014\u0010\f\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005\"\u0014\u0010\u000e\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0005\"\u0014\u0010\u0010\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005\"\u0014\u0010\u0014\u001a\u00020\u00118\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0019\u0010\u0001\u001a\u00020\u0000*\u00020\u00008Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0015\"\u0019\u0010\u0002\u001a\u00020\u0000*\u00020\u00008Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0015¨\u0006\u0016"}, d2 = {"", "decision", "index", "a", "(II)I", "I", "UNDECIDED", "b", "SUSPENDED", "c", "RESUMED", "d", "DECISION_SHIFT", "e", "INDEX_MASK", "f", "NO_INDEX", "Lkotlinx/coroutines/internal/s0;", "g", "Lkotlinx/coroutines/internal/s0;", "RESUME_TOKEN", "(I)I", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private static final int f80891a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f80892b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f80893c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final int f80894d = 29;

    /* renamed from: e, reason: collision with root package name */
    private static final int f80895e = 536870911;

    /* renamed from: f, reason: collision with root package name */
    private static final int f80896f = 536870911;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final kotlinx.coroutines.internal.s0 f80897g = new kotlinx.coroutines.internal.s0(ProtectedSandApp.s("补\u0001"));

    private static final int a(int i4, int i5) {
        return (i4 << 29) + i5;
    }

    private static final int b(int i4) {
        return i4 >> 29;
    }

    private static final int c(int i4) {
        return i4 & 536870911;
    }
}
