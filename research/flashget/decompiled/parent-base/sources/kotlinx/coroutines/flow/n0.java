package kotlinx.coroutines.flow;

import kotlin.Metadata;

/* compiled from: Share.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/flow/n0;", "T", "", "Lkotlinx/coroutines/flow/i;", "upstream", "", "extraBufferCapacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "Lkotlin/coroutines/g;", "context", "<init>", "(Lkotlinx/coroutines/flow/i;ILkotlinx/coroutines/channels/i;Lkotlin/coroutines/g;)V", "a", "Lkotlinx/coroutines/flow/i;", "b", "I", "c", "Lkotlinx/coroutines/channels/i;", "d", "Lkotlin/coroutines/g;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class n0<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final i<T> upstream;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public final int extraBufferCapacity;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final kotlinx.coroutines.channels.i onBufferOverflow;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final kotlin.coroutines.g context;

    /* JADX WARN: Multi-variable type inference failed */
    public n0(@fg.l i<? extends T> iVar, int i4, @fg.l kotlinx.coroutines.channels.i iVar2, @fg.l kotlin.coroutines.g gVar) {
        this.upstream = iVar;
        this.extraBufferCapacity = i4;
        this.onBufferOverflow = iVar2;
        this.context = gVar;
    }
}
