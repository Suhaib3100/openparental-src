package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.m2;

/* compiled from: Actor.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003BO\u0012\u0006\u0010$\u001a\u00020#\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%\u0012-\u0010\u001a\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000'\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0017¢\u0006\u0002\b(ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\b\u0010\u0006\u001a\u00020\u0005H\u0014J\u001b\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016JX\u0010\u001b\u001a\u00020\u0005\"\u0004\b\u0001\u0010\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00142\u0006\u0010\u0016\u001a\u00028\u00002(\u0010\u001a\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0017H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR&\u0010\"\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Lkotlinx/coroutines/channels/z;", "E", "Lkotlinx/coroutines/channels/d;", "Lkotlinx/coroutines/selects/e;", "Lkotlinx/coroutines/channels/k0;", "Lkotlin/m2;", "o1", "element", "a0", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "offer", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/channels/r;", "Y", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "cause", "Q", "R", "Lkotlinx/coroutines/selects/f;", "select", "param", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "block", "V", "(Lkotlinx/coroutines/selects/f;Ljava/lang/Object;Lq3/p;)V", "r", "Lkotlin/coroutines/d;", "continuation", "M", "()Lkotlinx/coroutines/selects/e;", "onSend", "Lkotlin/coroutines/g;", "parentContext", "Lkotlinx/coroutines/channels/n;", "channel", "Lkotlinx/coroutines/channels/f;", "Lkotlin/u;", "<init>", "(Lkotlin/coroutines/g;Lkotlinx/coroutines/channels/n;Lq3/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
final class z<E> extends d<E> implements kotlinx.coroutines.selects.e<E, k0<? super E>> {

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private Continuation<? super m2> continuation;

    public z(@d5.d CoroutineContext coroutineContext, @d5.d n<E> nVar, @d5.d q3.p<? super f<E>, ? super Continuation<? super m2>, ? extends Object> pVar) {
        super(coroutineContext, nVar, false);
        Continuation<? super m2> c6;
        c6 = kotlin.coroutines.intrinsics.c.c(pVar, this, this);
        this.continuation = c6;
    }

    @Override // kotlinx.coroutines.channels.o, kotlinx.coroutines.channels.k0
    @d5.d
    public kotlinx.coroutines.selects.e<E, k0<E>> M() {
        return this;
    }

    @Override // kotlinx.coroutines.channels.o, kotlinx.coroutines.channels.k0
    /* renamed from: Q */
    public boolean a(@d5.e Throwable cause) {
        boolean a6 = super.a(cause);
        start();
        return a6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.selects.e
    public <R> void V(@d5.d kotlinx.coroutines.selects.f<? super R> select, E param, @d5.d q3.p<? super k0<? super E>, ? super Continuation<? super R>, ? extends Object> block) {
        start();
        super.M().V(select, param, block);
    }

    @Override // kotlinx.coroutines.channels.o, kotlinx.coroutines.channels.k0
    @d5.d
    public Object Y(E element) {
        start();
        return super.Y(element);
    }

    @Override // kotlinx.coroutines.channels.o, kotlinx.coroutines.channels.k0
    @d5.e
    public Object a0(E e6, @d5.d Continuation<? super m2> continuation) {
        start();
        Object a02 = super.a0(e6, continuation);
        return a02 == CoroutineSingletons.COROUTINE_SUSPENDED ? a02 : m2.f23662a;
    }

    @Override // kotlinx.coroutines.u2
    protected void o1() {
        q4.a.c(this.continuation, this);
    }

    @Override // kotlinx.coroutines.channels.o, kotlinx.coroutines.channels.k0
    public boolean offer(E element) {
        start();
        return super.offer(element);
    }
}
