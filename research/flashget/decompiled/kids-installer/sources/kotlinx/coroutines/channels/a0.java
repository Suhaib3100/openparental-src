package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.m2;

/* compiled from: Broadcast.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BO\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012-\u0010\u0013\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000f¢\u0006\u0002\b\u0012ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0014R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/channels/a0;", "E", "Lkotlinx/coroutines/channels/k;", "Lkotlinx/coroutines/channels/g0;", "S", "Lkotlin/m2;", "o1", "Lkotlin/coroutines/d;", "r", "Lkotlin/coroutines/d;", "continuation", "Lkotlin/coroutines/g;", "parentContext", "Lkotlinx/coroutines/channels/i;", "channel", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/e0;", "", "Lkotlin/u;", "block", "<init>", "(Lkotlin/coroutines/g;Lkotlinx/coroutines/channels/i;Lq3/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
final class a0<E> extends k<E> {

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final Continuation<m2> continuation;

    public a0(@d5.d CoroutineContext coroutineContext, @d5.d i<E> iVar, @d5.d q3.p<? super e0<? super E>, ? super Continuation<? super m2>, ? extends Object> pVar) {
        super(coroutineContext, iVar, false);
        Continuation<m2> c6;
        c6 = kotlin.coroutines.intrinsics.c.c(pVar, this, this);
        this.continuation = c6;
    }

    @Override // kotlinx.coroutines.channels.k, kotlinx.coroutines.channels.i
    @d5.d
    public g0<E> S() {
        g0<E> S = K1().S();
        start();
        return S;
    }

    @Override // kotlinx.coroutines.u2
    protected void o1() {
        q4.a.c(this.continuation, this);
    }
}
