package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.k2;

/* compiled from: AbstractSharedFlow.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t2\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/flow/internal/c;", "F", "", "<init>", "()V", "flow", "", "a", "(Ljava/lang/Object;)Z", "", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "b", "(Ljava/lang/Object;)[Lkotlin/coroutines/d;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class c<F> {
    public abstract boolean a(F flow);

    @fg.l
    public abstract kotlin.coroutines.d<k2>[] b(F flow);
}
