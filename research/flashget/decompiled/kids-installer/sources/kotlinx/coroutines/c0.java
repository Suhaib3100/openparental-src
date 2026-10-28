package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Result;

/* compiled from: CompletableDeferred.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a.\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u001a!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"T", "Lkotlinx/coroutines/a0;", "Lkotlin/z0;", "result", "", "d", "(Lkotlinx/coroutines/a0;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/n2;", "parent", "b", "value", "a", "(Ljava/lang/Object;)Lkotlinx/coroutines/a0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class c0 {
    @d5.d
    public static final <T> a0<T> a(T t5) {
        b0 b0Var = new b0(null);
        b0Var.e1(t5);
        return b0Var;
    }

    @d5.d
    public static final <T> a0<T> b(@d5.e n2 n2Var) {
        return new b0(n2Var);
    }

    public static a0 c(n2 n2Var, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            n2Var = null;
        }
        return new b0(n2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean d(@d5.d a0<T> a0Var, @d5.d Object obj) {
        Throwable e6 = Result.e(obj);
        return e6 == null ? a0Var.i0(obj) : a0Var.k(e6);
    }
}
