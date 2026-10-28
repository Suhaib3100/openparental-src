package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: Builders.common.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJJ\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0001\u0010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/d1;", "T", "Lkotlinx/coroutines/a;", "Lkotlinx/coroutines/c1;", "Lkotlinx/coroutines/selects/d;", "t", "()Ljava/lang/Object;", "R", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/f;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "block", "Lkotlin/m2;", "L", "(Lkotlinx/coroutines/selects/f;Lq3/p;)V", "D", "()Lkotlinx/coroutines/selects/d;", "onAwait", "Lkotlin/coroutines/g;", "parentContext", "", "active", "<init>", "(Lkotlin/coroutines/g;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
class d1<T> extends a<T> implements c1<T>, kotlinx.coroutines.selects.d<T> {
    public d1(@d5.d CoroutineContext coroutineContext, boolean z5) {
        super(coroutineContext, true, z5);
    }

    static Object K1(d1 d1Var, Continuation continuation) {
        Object t02 = d1Var.t0(continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return t02;
    }

    @Override // kotlinx.coroutines.c1
    @d5.d
    public kotlinx.coroutines.selects.d<T> D() {
        return this;
    }

    @Override // kotlinx.coroutines.selects.d
    public <R> void L(@d5.d kotlinx.coroutines.selects.f<? super R> select, @d5.d q3.p<? super T, ? super Continuation<? super R>, ? extends Object> block) {
        r1(select, block);
    }

    @Override // kotlinx.coroutines.c1
    @d5.e
    public Object R(@d5.d Continuation<? super T> continuation) {
        return K1(this, continuation);
    }

    @Override // kotlinx.coroutines.c1
    public T t() {
        return (T) K0();
    }
}
