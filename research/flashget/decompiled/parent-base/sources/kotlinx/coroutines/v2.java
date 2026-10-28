package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: MainCoroutineDispatcher.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0005¢\u0006\u0004\b\u000b\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/v2;", "Lkotlinx/coroutines/m0;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "parallelism", "e1", "(I)Lkotlinx/coroutines/m0;", "k1", "j1", "()Lkotlinx/coroutines/v2;", "immediate", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class v2 extends m0 {
    @Override // kotlinx.coroutines.m0
    @fg.l
    public m0 e1(int parallelism) {
        kotlinx.coroutines.internal.t.a(parallelism);
        return this;
    }

    @fg.l
    public abstract v2 j1();

    @fg.m
    @f2
    protected final String k1() {
        v2 v2Var;
        v2 e4 = j1.e();
        if (this == e4) {
            return ProtectedSandApp.s("薞\u0001");
        }
        try {
            v2Var = e4.j1();
        } catch (UnsupportedOperationException unused) {
            v2Var = null;
        }
        if (this == v2Var) {
            return ProtectedSandApp.s("薟\u0001");
        }
        return null;
    }

    @Override // kotlinx.coroutines.m0
    @fg.l
    public String toString() {
        String k12 = k1();
        if (k12 != null) {
            return k12;
        }
        return w0.a(this) + '@' + w0.b(this);
    }
}
