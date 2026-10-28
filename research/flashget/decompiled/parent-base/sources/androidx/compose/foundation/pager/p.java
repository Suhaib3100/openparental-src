package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.l0;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: LazyLayoutPager.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bg\u00121\u0010\f\u001a-\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b\u0012#\u0010\u0010\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013RB\u0010\f\u001a-\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R4\u0010\u0010\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/compose/foundation/pager/p;", "Landroidx/compose/foundation/lazy/layout/p;", "Landroidx/compose/foundation/pager/l;", "Lkotlin/Function2;", "Landroidx/compose/foundation/pager/v;", "", "Lkotlin/r0;", "name", "page", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "Lkotlin/u;", "pageContent", "Lkotlin/Function1;", "index", "", "key", "pageCount", "<init>", "(Lld/r;Lld/l;I)V", "b", "Lld/r;", "C", "()Lld/r;", "c", "Lld/l;", "B", "()Lld/l;", "d", "I", "D", "()I", "Landroidx/compose/foundation/lazy/layout/c;", "e", "Landroidx/compose/foundation/lazy/layout/c;", "x", "()Landroidx/compose/foundation/lazy/layout/c;", "intervals", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class p extends androidx.compose.foundation.lazy.layout.p<l> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.r<v, Integer, androidx.compose.runtime.t, Integer, k2> pageContent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.l<Integer, Object> key;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int pageCount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.layout.c<l> intervals;

    /* JADX WARN: Multi-variable type inference failed */
    public p(@fg.l ld.r<? super v, ? super Integer, ? super androidx.compose.runtime.t, ? super Integer, k2> rVar, @fg.m ld.l<? super Integer, ? extends Object> lVar, int i4) {
        this.pageContent = rVar;
        this.key = lVar;
        this.pageCount = i4;
        l0 l0Var = new l0();
        l0Var.c(i4, new l(lVar, rVar));
        this.intervals = l0Var;
    }

    @fg.m
    public final ld.l<Integer, Object> B() {
        return this.key;
    }

    @fg.l
    public final ld.r<v, Integer, androidx.compose.runtime.t, Integer, k2> C() {
        return this.pageContent;
    }

    /* renamed from: D, reason: from getter */
    public final int getPageCount() {
        return this.pageCount;
    }

    @Override // androidx.compose.foundation.lazy.layout.p
    @fg.l
    public androidx.compose.foundation.lazy.layout.c<l> x() {
        return this.intervals;
    }
}
