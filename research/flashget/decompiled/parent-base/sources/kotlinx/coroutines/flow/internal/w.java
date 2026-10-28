package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.k2;
import kotlinx.coroutines.channels.e0;
import kotlinx.coroutines.f2;

/* compiled from: SendingCollector.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/flow/internal/w;", "T", "Lkotlinx/coroutines/flow/j;", "Lkotlinx/coroutines/channels/e0;", "channel", "<init>", "(Lkotlinx/coroutines/channels/e0;)V", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "Lkotlinx/coroutines/channels/e0;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f2
/* loaded from: classes7.dex */
public final class w<T> implements kotlinx.coroutines.flow.j<T> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e0<T> channel;

    /* JADX WARN: Multi-variable type inference failed */
    public w(@fg.l e0<? super T> e0Var) {
        this.channel = e0Var;
    }

    @Override // kotlinx.coroutines.flow.j
    @fg.m
    public Object emit(T t4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object f02 = this.channel.f0(t4, dVar);
        return f02 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? f02 : k2.f75408a;
    }
}
