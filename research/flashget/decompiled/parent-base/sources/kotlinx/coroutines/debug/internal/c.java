package kotlinx.coroutines.debug.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.internal.s0;

/* compiled from: ConcurrentWeakMap.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\t\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0012\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0011\"\u0014\u0010\u0013\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0014"}, d2 = {"", "Lkotlinx/coroutines/debug/internal/l;", "d", "(Ljava/lang/Object;)Lkotlinx/coroutines/debug/internal/l;", "", "e", "()Ljava/lang/Void;", "", "a", "I", "MAGIC", "b", "MIN_CAPACITY", "Lkotlinx/coroutines/internal/s0;", "c", "Lkotlinx/coroutines/internal/s0;", "REHASH", "Lkotlinx/coroutines/debug/internal/l;", "MARKED_NULL", "MARKED_TRUE", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final int f79670a = -1640531527;

    /* renamed from: b, reason: collision with root package name */
    private static final int f79671b = 16;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final s0 f79672c = new s0(ProtectedSandApp.s("蚑\u0001"));

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final l f79673d = new l(null);

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final l f79674e = new l(Boolean.TRUE);

    /* JADX INFO: Access modifiers changed from: private */
    public static final l d(Object obj) {
        return obj == null ? f79673d : l0.g(obj, Boolean.TRUE) ? f79674e : new l(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void e() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("蚒\u0001"));
    }
}
