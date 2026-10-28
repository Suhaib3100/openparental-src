package kotlinx.coroutines.channels;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlinx.coroutines.a3;
import kotlinx.coroutines.internal.s0;

/* compiled from: BroadcastChannel.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007¨\u0006\t"}, d2 = {"E", "", "capacity", "Lkotlinx/coroutines/channels/d;", "a", "(I)Lkotlinx/coroutines/channels/d;", "Lkotlinx/coroutines/internal/s0;", "Lkotlinx/coroutines/internal/s0;", "NO_ELEMENT", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final s0 f79300a = new s0(ProtectedSandApp.s("蘢\u0001"));

    @fg.l
    @a3
    @kotlin.k(level = kotlin.m.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and StateFlow, and is no longer supported")
    public static final <E> d<E> a(int i4) {
        if (i4 == -2) {
            return new e(l.INSTANCE.a());
        }
        if (i4 == -1) {
            return new v();
        }
        if (i4 == 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("蘤\u0001"));
        }
        if (i4 != Integer.MAX_VALUE) {
            return new e(i4);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("蘣\u0001"));
    }
}
