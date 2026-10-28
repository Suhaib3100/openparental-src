package androidx.paging;

import kotlin.Metadata;

/* compiled from: RemoteMediatorAccessor.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000b\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/paging/j1;", "", "Key", "Value", "Landroidx/paging/g0;", "loadType", "Landroidx/paging/d1;", "pagingState", "Lkotlin/k2;", "c", "(Landroidx/paging/g0;Landroidx/paging/d1;)V", "b", "(Landroidx/paging/d1;)V", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface j1<Key, Value> {
    void b(@fg.l d1<Key, Value> pagingState);

    void c(@fg.l g0 loadType, @fg.l d1<Key, Value> pagingState);
}
