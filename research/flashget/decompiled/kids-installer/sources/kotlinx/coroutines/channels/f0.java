package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.m2;
import kotlinx.coroutines.internal.r0;

/* compiled from: AbstractChannel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0014\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&J%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/channels/f0;", "E", "Lkotlinx/coroutines/internal/y;", "Lkotlinx/coroutines/channels/h0;", "Lkotlinx/coroutines/channels/w;", "closed", "Lkotlin/m2;", "b1", "value", "Lkotlin/Function1;", "", "a1", "(Ljava/lang/Object;)Lq3/l;", "Lkotlinx/coroutines/internal/r0;", "Z0", "()Lkotlinx/coroutines/internal/r0;", "offerResult", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public abstract class f0<E> extends kotlinx.coroutines.internal.y implements h0<E> {
    @Override // kotlinx.coroutines.channels.h0
    @d5.d
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public r0 k() {
        return b.f27304d;
    }

    @d5.e
    public q3.l<Throwable, m2> a1(E value) {
        return null;
    }

    public abstract void b1(@d5.d w<?> wVar);
}
