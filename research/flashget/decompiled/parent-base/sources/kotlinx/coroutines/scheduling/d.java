package kotlinx.coroutines.scheduling;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlinx.coroutines.internal.t;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.z1;

/* compiled from: Dispatcher.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/scheduling/d;", "Lkotlinx/coroutines/scheduling/i;", "<init>", "()V", "", "parallelism", "Lkotlinx/coroutines/m0;", "e1", "(I)Lkotlinx/coroutines/m0;", "Lkotlin/k2;", "B1", "close", "", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class d extends i {

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    public static final d f80983j = new d();

    private d() {
        super(o.f81007c, o.f81008d, o.f81009e, o.f81005a);
    }

    public final void B1() {
        super.close();
    }

    @Override // kotlinx.coroutines.scheduling.i, kotlinx.coroutines.w1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("袕\u0001"));
    }

    @Override // kotlinx.coroutines.m0
    @fg.l
    @z1
    public m0 e1(int parallelism) {
        t.a(parallelism);
        return parallelism >= o.f81007c ? this : super.e1(parallelism);
    }

    @Override // kotlinx.coroutines.m0
    @fg.l
    public String toString() {
        return ProtectedSandApp.s("袖\u0001");
    }
}
