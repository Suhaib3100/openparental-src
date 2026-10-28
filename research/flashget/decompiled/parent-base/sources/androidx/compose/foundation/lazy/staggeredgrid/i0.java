package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.c;
import kotlin.Metadata;

/* compiled from: LazyStaggeredGridSpan.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/i0;", "", "Landroidx/compose/foundation/lazy/layout/c;", "Landroidx/compose/foundation/lazy/staggeredgrid/h;", "intervals", "<init>", "(Landroidx/compose/foundation/lazy/layout/c;)V", "", "itemIndex", "", "b", "(I)Z", "a", "Landroidx/compose/foundation/lazy/layout/c;", "()Landroidx/compose/foundation/lazy/layout/c;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f6355b = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.layout.c<h> intervals;

    public i0(@fg.l androidx.compose.foundation.lazy.layout.c<h> cVar) {
        this.intervals = cVar;
    }

    @fg.l
    public final androidx.compose.foundation.lazy.layout.c<h> a() {
        return this.intervals;
    }

    public final boolean b(int itemIndex) {
        if (itemIndex < 0 || itemIndex >= this.intervals.getSize()) {
            return false;
        }
        c.a<h> aVar = this.intervals.get(itemIndex);
        ld.l<Integer, n0> b5 = aVar.c().b();
        int startIndex = itemIndex - aVar.getStartIndex();
        if (b5 == null) {
            return false;
        }
        n0 invoke = b5.invoke(Integer.valueOf(startIndex));
        n0.INSTANCE.getClass();
        return invoke == n0.f6432d;
    }
}
