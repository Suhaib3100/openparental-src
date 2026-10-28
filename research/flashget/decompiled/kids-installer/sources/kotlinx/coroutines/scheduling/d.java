package kotlinx.coroutines.scheduling;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: Dispatcher.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/scheduling/d;", "Lkotlinx/coroutines/scheduling/i;", "Lkotlin/m2;", "U0", "()V", "close", "", "toString", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class d extends i {

    /* renamed from: w, reason: collision with root package name */
    @d5.d
    public static final d f28866w = new d();

    private d() {
        super(o.f28890c, o.f28891d, o.f28892e, ProtectedSandApp.s("酧"));
    }

    public final void U0() {
        super.close();
    }

    @Override // kotlinx.coroutines.scheduling.i, kotlinx.coroutines.z1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("酨"));
    }

    @Override // kotlinx.coroutines.o0
    @d5.d
    public String toString() {
        return ProtectedSandApp.s("酩");
    }
}
