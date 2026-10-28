package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: Unconfined.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/z3;", "Lkotlinx/coroutines/o0;", "", "parallelism", "E0", "Lkotlin/coroutines/g;", "context", "", "B0", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/m2;", "y0", "", "toString", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class z3 extends o0 {

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    public static final z3 f29088q = new z3();

    private z3() {
    }

    @Override // kotlinx.coroutines.o0
    public boolean B0(@d5.d CoroutineContext context) {
        return false;
    }

    @Override // kotlinx.coroutines.o0
    @c2
    @d5.d
    public o0 E0(int parallelism) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("醖"));
    }

    @Override // kotlinx.coroutines.o0
    @d5.d
    public String toString() {
        return ProtectedSandApp.s("醗");
    }

    @Override // kotlinx.coroutines.o0
    public void y0(@d5.d CoroutineContext coroutineContext, @d5.d Runnable runnable) {
        c4 c4Var = (c4) coroutineContext.b(c4.INSTANCE);
        if (c4Var == null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("醘"));
        }
        c4Var.dispatcherWasUnconfined = true;
    }
}
