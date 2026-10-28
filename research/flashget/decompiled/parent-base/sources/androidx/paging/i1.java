package androidx.paging;

import kotlin.Metadata;

/* compiled from: RemoteMediatorAccessor.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/r0;", "scope", "Landroidx/paging/f1;", "delegate", "Landroidx/paging/h1;", "a", "(Lkotlinx/coroutines/r0;Landroidx/paging/f1;)Landroidx/paging/h1;", "paging-common"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class i1 {
    @fg.l
    public static final <Key, Value> h1<Key, Value> a(@fg.l kotlinx.coroutines.r0 scope, @fg.l f1<Key, Value> delegate) {
        kotlin.jvm.internal.l0.p(scope, "scope");
        kotlin.jvm.internal.l0.p(delegate, "delegate");
        return new g1(scope, delegate);
    }
}
