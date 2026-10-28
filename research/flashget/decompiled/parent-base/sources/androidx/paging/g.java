package androidx.paging;

import kotlin.Metadata;
import kotlin.k2;

/* compiled from: FlowExt.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroidx/paging/g;", "T", "Lkotlinx/coroutines/flow/j;", "Lkotlinx/coroutines/channels/e0;", "channel", "<init>", "(Lkotlinx/coroutines/channels/e0;)V", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "Lkotlinx/coroutines/channels/e0;", "a", "()Lkotlinx/coroutines/channels/e0;", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class g<T> implements kotlinx.coroutines.flow.j<T> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.channels.e0<T> channel;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@fg.l kotlinx.coroutines.channels.e0<? super T> channel) {
        kotlin.jvm.internal.l0.p(channel, "channel");
        this.channel = channel;
    }

    @fg.l
    public final kotlinx.coroutines.channels.e0<T> a() {
        return this.channel;
    }

    @Override // kotlinx.coroutines.flow.j
    @fg.m
    public Object emit(T t4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object f02 = this.channel.f0(t4, dVar);
        return f02 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? f02 : k2.f75408a;
    }
}
