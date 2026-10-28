package kotlinx.coroutines.debug.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.internal.r0;

/* compiled from: ConcurrentWeakMap.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u000e\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0002\u001a\b\u0010\u0004\u001a\u00020\u0003H\u0002\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f¨\u0006\u0012"}, d2 = {"", "Lkotlinx/coroutines/debug/internal/m;", "d", "", "e", "", "a", "I", "MAGIC", "b", "MIN_CAPACITY", "Lkotlinx/coroutines/internal/r0;", "c", "Lkotlinx/coroutines/internal/r0;", "REHASH", "Lkotlinx/coroutines/debug/internal/m;", "MARKED_NULL", "MARKED_TRUE", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final int f27643a = -1640531527;

    /* renamed from: b, reason: collision with root package name */
    private static final int f27644b = 16;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private static final r0 f27645c = new r0(ProtectedSandApp.s("峺"));

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private static final m f27646d = new m(null);

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private static final m f27647e = new m(Boolean.TRUE);

    /* JADX INFO: Access modifiers changed from: private */
    public static final m d(Object obj) {
        return obj == null ? f27646d : l0.g(obj, Boolean.TRUE) ? f27647e : new m(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void e() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("峻"));
    }
}
