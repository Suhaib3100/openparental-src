package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: Unconfined.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/v3;", "Lkotlinx/coroutines/m0;", "<init>", "()V", "", "parallelism", "e1", "(I)Lkotlinx/coroutines/m0;", "Lkotlin/coroutines/g;", "context", "", "c1", "(Lkotlin/coroutines/g;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/k2;", "S0", "(Lkotlin/coroutines/g;Ljava/lang/Runnable;)V", "", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class v3 extends m0 {

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    public static final v3 f81184d = new v3();

    private v3() {
    }

    @Override // kotlinx.coroutines.m0
    public void S0(@fg.l kotlin.coroutines.g context, @fg.l Runnable block) {
        z3 z3Var = (z3) context.c(z3.INSTANCE);
        if (z3Var == null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("褑\u0001"));
        }
        z3Var.dispatcherWasUnconfined = true;
    }

    @Override // kotlinx.coroutines.m0
    public boolean c1(@fg.l kotlin.coroutines.g context) {
        return false;
    }

    @Override // kotlinx.coroutines.m0
    @fg.l
    @z1
    public m0 e1(int parallelism) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("褒\u0001"));
    }

    @Override // kotlinx.coroutines.m0
    @fg.l
    public String toString() {
        return ProtectedSandApp.s("褓\u0001");
    }
}
