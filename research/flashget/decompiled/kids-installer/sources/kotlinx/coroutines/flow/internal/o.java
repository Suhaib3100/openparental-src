package kotlinx.coroutines.flow.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.PublishedApi;

/* compiled from: FlowExceptions.common.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0000\u001a\u0011\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0081\b¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/flow/internal/AbortFlowException;", "Lkotlinx/coroutines/flow/j;", "owner", "Lkotlin/m2;", "b", "", "index", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class o {
    @PublishedApi
    public static final int a(int i5) {
        if (i5 >= 0) {
            return i5;
        }
        throw new ArithmeticException(ProtectedSandApp.s("嵘"));
    }

    public static final void b(@d5.d AbortFlowException abortFlowException, @d5.d kotlinx.coroutines.flow.j<?> jVar) {
        if (abortFlowException.owner != jVar) {
            throw abortFlowException;
        }
    }
}
