package androidx.paging;

import kotlin.Metadata;
import kotlin.k2;

/* compiled from: CachedPagingData.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0007J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Landroidx/paging/c;", "", "Landroidx/paging/c$a;", "flowType", "Lkotlin/k2;", "b", "(Landroidx/paging/c$a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "a", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
@androidx.annotation.m1
/* loaded from: classes3.dex */
public interface c {

    /* compiled from: CachedPagingData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/paging/c$a;", "", "<init>", "(Ljava/lang/String;I)V", "PAGED_DATA_FLOW", "PAGE_EVENT_FLOW", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum a {
        PAGED_DATA_FLOW,
        PAGE_EVENT_FLOW
    }

    @fg.m
    Object a(@fg.l a aVar, @fg.l kotlin.coroutines.d<? super k2> dVar);

    @fg.m
    Object b(@fg.l a aVar, @fg.l kotlin.coroutines.d<? super k2> dVar);
}
