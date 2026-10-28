package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.m2;

/* compiled from: Builders.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012-\u0010\u000e\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R>\u0010\u000e\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\u0002\b\u000b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/flow/h0;", "T", "Lkotlinx/coroutines/flow/a;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "e", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "o", "Lq3/p;", "block", "<init>", "(Lq3/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
final class h0<T> extends a<T> {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final q3.p<j<? super T>, Continuation<? super m2>, Object> block;

    /* JADX WARN: Multi-variable type inference failed */
    public h0(@d5.d q3.p<? super j<? super T>, ? super Continuation<? super m2>, ? extends Object> pVar) {
        this.block = pVar;
    }

    @Override // kotlinx.coroutines.flow.a
    @d5.e
    public Object e(@d5.d j<? super T> jVar, @d5.d Continuation<? super m2> continuation) {
        Object g02 = this.block.g0(jVar, continuation);
        return g02 == CoroutineSingletons.COROUTINE_SUSPENDED ? g02 : m2.f23662a;
    }
}
