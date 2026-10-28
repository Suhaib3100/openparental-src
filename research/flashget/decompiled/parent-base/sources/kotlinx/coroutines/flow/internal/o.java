package kotlinx.coroutines.flow.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.w0;

/* compiled from: FlowExceptions.common.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0081\b¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/flow/internal/AbortFlowException;", "Lkotlinx/coroutines/flow/j;", "owner", "Lkotlin/k2;", "b", "(Lkotlinx/coroutines/flow/internal/AbortFlowException;Lkotlinx/coroutines/flow/j;)V", "", "index", "a", "(I)I", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class o {
    @w0
    public static final int a(int i4) {
        if (i4 >= 0) {
            return i4;
        }
        throw new ArithmeticException(ProtectedSandApp.s("蜧\u0001"));
    }

    public static final void b(@fg.l AbortFlowException abortFlowException, @fg.l kotlinx.coroutines.flow.j<?> jVar) {
        if (abortFlowException.owner != jVar) {
            throw abortFlowException;
        }
    }
}
