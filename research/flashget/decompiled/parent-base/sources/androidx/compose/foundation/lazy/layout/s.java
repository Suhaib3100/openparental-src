package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.z0;
import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: LazyLayoutItemProvider.kt */
@x4
@z0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/s;", "", "", "index", "key", "Lkotlin/k2;", "i", "(ILjava/lang/Object;Landroidx/compose/runtime/t;I)V", "e", "(I)Ljava/lang/Object;", "d", "c", "(Ljava/lang/Object;)I", "b", "()I", "itemCount", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface s {
    int b();

    default int c(@fg.l Object key) {
        return -1;
    }

    @fg.l
    default Object d(int index) {
        return new DefaultLazyKey(index);
    }

    @fg.m
    default Object e(int index) {
        return null;
    }

    @androidx.compose.runtime.i
    void i(int i4, @fg.l Object obj, @fg.m androidx.compose.runtime.t tVar, int i5);
}
