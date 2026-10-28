package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: MainCoroutineDispatcher.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0005R\u0014\u0010\n\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/y2;", "Lkotlinx/coroutines/o0;", "", "toString", "", "parallelism", "E0", "M0", "J0", "()Lkotlinx/coroutines/y2;", "immediate", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public abstract class y2 extends o0 {
    @Override // kotlinx.coroutines.o0
    @d5.d
    public o0 E0(int parallelism) {
        kotlinx.coroutines.internal.t.a(parallelism);
        return this;
    }

    @d5.d
    public abstract y2 J0();

    @d5.e
    @i2
    protected final String M0() {
        y2 y2Var;
        y2 e6 = m1.e();
        if (this == e6) {
            return ProtectedSandApp.s("遳");
        }
        try {
            y2Var = e6.J0();
        } catch (UnsupportedOperationException unused) {
            y2Var = null;
        }
        if (this == y2Var) {
            return ProtectedSandApp.s("遴");
        }
        return null;
    }

    @Override // kotlinx.coroutines.o0
    @d5.d
    public String toString() {
        String M0 = M0();
        if (M0 != null) {
            return M0;
        }
        return z0.a(this) + '@' + z0.b(this);
    }
}
