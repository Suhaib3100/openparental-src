package androidx.paging;

import kotlin.Metadata;
import kotlin.k2;

/* compiled from: SnapshotPagedList.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000e\u001a\u00020\u00072\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00168\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u00168\u0016X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0019R\u0016\u0010 \u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/paging/q1;", "", "T", "Landroidx/paging/s0;", "pagedList", "<init>", "(Landroidx/paging/s0;)V", "Lkotlin/k2;", "v", "()V", "Lkotlin/Function2;", "Landroidx/paging/g0;", "Landroidx/paging/e0;", "callback", "w", "(Lld/p;)V", "", "index", "Z", "(I)V", "l", "Landroidx/paging/s0;", "", "m", "V", "()Z", "isImmutable", "n", "U", "isDetached", "H", "()Ljava/lang/Object;", "lastKey", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class q1<T> extends s0<T> {

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final s0<T> pagedList;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final boolean isImmutable;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean isDetached;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(@fg.l s0<T> pagedList) {
        super(pagedList.O(), pagedList.getCoroutineScope(), pagedList.getNotifyDispatcher(), pagedList.T().R(), pagedList.getConfig());
        kotlin.jvm.internal.l0.p(pagedList, "pagedList");
        this.pagedList = pagedList;
        this.isImmutable = true;
        this.isDetached = true;
    }

    @Override // androidx.paging.s0
    @fg.m
    public Object H() {
        return this.pagedList.H();
    }

    @Override // androidx.paging.s0
    /* renamed from: U, reason: from getter */
    public boolean getIsDetached() {
        return this.isDetached;
    }

    @Override // androidx.paging.s0
    /* renamed from: V, reason: from getter */
    public boolean getIsImmutable() {
        return this.isImmutable;
    }

    @Override // androidx.paging.s0
    public void Z(int index) {
    }

    @Override // androidx.paging.s0
    public void v() {
    }

    @Override // androidx.paging.s0
    public void w(@fg.l ld.p<? super g0, ? super e0, k2> callback) {
        kotlin.jvm.internal.l0.p(callback, "callback");
    }
}
