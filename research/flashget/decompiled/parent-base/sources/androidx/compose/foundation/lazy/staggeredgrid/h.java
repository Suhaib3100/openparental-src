package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.p;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: LazyStaggeredGridIntervalContent.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u009a\u0001\u0012#\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012#\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002\u0012#\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0002\u0012\"\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010¢\u0006\u0004\b\u0012\u0010\u0013R7\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R7\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R4\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R3\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u00108\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/h;", "Landroidx/compose/foundation/lazy/layout/p$a;", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "index", "", "key", "type", "Landroidx/compose/foundation/lazy/staggeredgrid/n0;", "span", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/staggeredgrid/p;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "Lkotlin/u;", "item", "<init>", "(Lld/l;Lld/l;Lld/l;Lld/r;)V", "a", "Lld/l;", "getKey", "()Lld/l;", "b", "getType", "c", "d", "Lld/r;", "()Lld/r;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h implements p.a {

    /* renamed from: e, reason: collision with root package name */
    public static final int f6340e = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.l<Integer, Object> key;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<Integer, Object> type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.l<Integer, n0> span;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.r<p, Integer, androidx.compose.runtime.t, Integer, k2> item;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@fg.m ld.l<? super Integer, ? extends Object> lVar, @fg.l ld.l<? super Integer, ? extends Object> lVar2, @fg.m ld.l<? super Integer, n0> lVar3, @fg.l ld.r<? super p, ? super Integer, ? super androidx.compose.runtime.t, ? super Integer, k2> rVar) {
        this.key = lVar;
        this.type = lVar2;
        this.span = lVar3;
        this.item = rVar;
    }

    @fg.l
    public final ld.r<p, Integer, androidx.compose.runtime.t, Integer, k2> a() {
        return this.item;
    }

    @fg.m
    public final ld.l<Integer, n0> b() {
        return this.span;
    }

    @Override // androidx.compose.foundation.lazy.layout.p.a
    @fg.m
    public ld.l<Integer, Object> getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.p.a
    @fg.l
    public ld.l<Integer, Object> getType() {
        return this.type;
    }
}
