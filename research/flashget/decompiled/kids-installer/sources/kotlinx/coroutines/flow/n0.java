package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: Share.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/flow/n0;", "T", "", "Lkotlinx/coroutines/flow/i;", "a", "Lkotlinx/coroutines/flow/i;", "upstream", "", "b", "I", "extraBufferCapacity", "Lkotlinx/coroutines/channels/m;", "c", "Lkotlinx/coroutines/channels/m;", "onBufferOverflow", "Lkotlin/coroutines/g;", "d", "Lkotlin/coroutines/g;", "context", "<init>", "(Lkotlinx/coroutines/flow/i;ILkotlinx/coroutines/channels/m;Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
final class n0<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public final i<T> upstream;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @p3.f
    public final int extraBufferCapacity;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public final kotlinx.coroutines.channels.m onBufferOverflow;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public final CoroutineContext context;

    /* JADX WARN: Multi-variable type inference failed */
    public n0(@d5.d i<? extends T> iVar, int i5, @d5.d kotlinx.coroutines.channels.m mVar, @d5.d CoroutineContext coroutineContext) {
        this.upstream = iVar;
        this.extraBufferCapacity = i5;
        this.onBufferOverflow = mVar;
        this.context = coroutineContext;
    }
}
