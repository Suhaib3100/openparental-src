package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.m1;

/* compiled from: Select.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0001\u0014¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/selects/m;", "R", "", "clauseObject", "result", "", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/m1;", "disposableHandle", "Lkotlin/k2;", "f", "(Lkotlinx/coroutines/m1;)V", "internalResult", "d", "(Ljava/lang/Object;)V", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "context", "Lkotlinx/coroutines/selects/n;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f2
/* loaded from: classes7.dex */
public interface m<R> {
    void d(@fg.m Object internalResult);

    void f(@fg.l m1 disposableHandle);

    @fg.l
    kotlin.coroutines.g getContext();

    boolean l(@fg.l Object clauseObject, @fg.m Object result);
}
