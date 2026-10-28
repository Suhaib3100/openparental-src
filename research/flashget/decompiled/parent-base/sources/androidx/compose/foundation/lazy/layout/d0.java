package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.z0;
import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: LazyLayoutPrefetchState.kt */
@x4
@z0
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002\f\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR$\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/lazy/layout/d0;", "", "<init>", "()V", "", "index", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/foundation/lazy/layout/d0$a;", "b", "(IJ)Landroidx/compose/foundation/lazy/layout/d0$a;", "Landroidx/compose/foundation/lazy/layout/d0$b;", "a", "Landroidx/compose/foundation/lazy/layout/d0$b;", "()Landroidx/compose/foundation/lazy/layout/d0$b;", "c", "(Landroidx/compose/foundation/lazy/layout/d0$b;)V", "prefetcher", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f5940b = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private b prefetcher;

    /* compiled from: LazyLayoutPrefetchState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0005\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/d0$a;", "", "Lkotlin/k2;", "cancel", "()V", "Landroidx/compose/foundation/lazy/layout/b;", "Landroidx/compose/foundation/lazy/layout/e0$b;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a {
        void cancel();
    }

    /* compiled from: LazyLayoutPrefetchState.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\"\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/d0$b;", "", "", "index", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/foundation/lazy/layout/d0$a;", "a", "(IJ)Landroidx/compose/foundation/lazy/layout/d0$a;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b {
        @fg.l
        a a(int index, long constraints);
    }

    @fg.m
    /* renamed from: a, reason: from getter */
    public final b getPrefetcher() {
        return this.prefetcher;
    }

    @fg.l
    public final a b(int index, long constraints) {
        a a5;
        b bVar = this.prefetcher;
        return (bVar == null || (a5 = bVar.a(index, constraints)) == null) ? androidx.compose.foundation.lazy.layout.b.f5926a : a5;
    }

    public final void c(@fg.m b bVar) {
        this.prefetcher = bVar;
    }
}
