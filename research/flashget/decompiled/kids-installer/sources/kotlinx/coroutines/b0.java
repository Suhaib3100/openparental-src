package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: CompletableDeferred.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0011\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJJ\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0001\u0010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016R\u0014\u0010\u001b\u001a\u00020\u00138PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lkotlinx/coroutines/b0;", "T", "Lkotlinx/coroutines/u2;", "Lkotlinx/coroutines/a0;", "Lkotlinx/coroutines/selects/d;", "t", "()Ljava/lang/Object;", "R", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/f;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "block", "Lkotlin/m2;", "L", "(Lkotlinx/coroutines/selects/f;Lq3/p;)V", "value", "", "i0", "(Ljava/lang/Object;)Z", "", "exception", "k", "Q0", "()Z", "onCancelComplete", "D", "()Lkotlinx/coroutines/selects/d;", "onAwait", "Lkotlinx/coroutines/n2;", "parent", "<init>", "(Lkotlinx/coroutines/n2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
final class b0<T> extends u2 implements a0<T>, kotlinx.coroutines.selects.d<T> {
    public b0(@d5.e n2 n2Var) {
        super(true);
        W0(n2Var);
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

    @Override // kotlinx.coroutines.u2
    public boolean Q0() {
        return true;
    }

    @Override // kotlinx.coroutines.c1
    @d5.e
    public Object R(@d5.d Continuation<? super T> continuation) {
        Object t02 = t0(continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return t02;
    }

    @Override // kotlinx.coroutines.a0
    public boolean i0(T value) {
        return e1(value);
    }

    @Override // kotlinx.coroutines.a0
    public boolean k(@d5.d Throwable exception) {
        return e1(new f0(exception, false, 2, null));
    }

    @Override // kotlinx.coroutines.c1
    public T t() {
        return (T) K0();
    }
}
