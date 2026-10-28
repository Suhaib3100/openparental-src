package androidx.paging;

import androidx.paging.f1;
import kotlin.Metadata;

/* compiled from: RemoteMediatorAccessor.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004J\u0013\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Landroidx/paging/h1;", "", "Key", "Value", "Landroidx/paging/j1;", "Landroidx/paging/f1$a;", "a", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/t0;", "Landroidx/paging/f0;", "getState", "()Lkotlinx/coroutines/flow/t0;", "state", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface h1<Key, Value> extends j1<Key, Value> {
    @fg.m
    Object a(@fg.l kotlin.coroutines.d<? super f1.a> dVar);

    @fg.l
    kotlinx.coroutines.flow.t0<f0> getState();
}
