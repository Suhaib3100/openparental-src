package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.m2;
import kotlinx.coroutines.channels.k0;
import kotlinx.coroutines.i2;

/* compiled from: SendingCollector.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/flow/internal/w;", "T", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/k0;", "o", "Lkotlinx/coroutines/channels/k0;", "channel", "<init>", "(Lkotlinx/coroutines/channels/k0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@i2
/* loaded from: classes5.dex */
public final class w<T> implements kotlinx.coroutines.flow.j<T> {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final k0<T> channel;

    /* JADX WARN: Multi-variable type inference failed */
    public w(@d5.d k0<? super T> k0Var) {
        this.channel = k0Var;
    }

    @Override // kotlinx.coroutines.flow.j
    @d5.e
    public Object b(T t5, @d5.d Continuation<? super m2> continuation) {
        Object a02 = this.channel.a0(t5, continuation);
        return a02 == CoroutineSingletons.COROUTINE_SUSPENDED ? a02 : m2.f23662a;
    }
}
