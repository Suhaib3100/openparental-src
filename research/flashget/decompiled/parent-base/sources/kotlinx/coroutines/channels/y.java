package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Broadcast.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012-\u0010\r\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007¢\u0006\u0002\b\fø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/channels/y;", "E", "Lkotlinx/coroutines/channels/g;", "Lkotlin/coroutines/g;", "parentContext", "Lkotlinx/coroutines/channels/d;", "channel", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/b0;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "block", "<init>", "(Lkotlin/coroutines/g;Lkotlinx/coroutines/channels/d;Lld/p;)V", "Lkotlinx/coroutines/channels/d0;", "w", "()Lkotlinx/coroutines/channels/d0;", "G1", "()V", "f", "Lkotlin/coroutines/d;", "continuation", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class y<E> extends g<E> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.coroutines.d<k2> continuation;

    public y(@fg.l kotlin.coroutines.g gVar, @fg.l d<E> dVar, @fg.l ld.p<? super b0<? super E>, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        super(gVar, dVar, false);
        this.continuation = kotlin.coroutines.intrinsics.b.c(pVar, this, this);
    }

    @Override // kotlinx.coroutines.r2
    protected void G1() {
        me.a.c(this.continuation, this);
    }

    @Override // kotlinx.coroutines.channels.g, kotlinx.coroutines.channels.d
    @fg.l
    public d0<E> w() {
        d0<E> w4 = b2().w();
        start();
        return w4;
    }
}
