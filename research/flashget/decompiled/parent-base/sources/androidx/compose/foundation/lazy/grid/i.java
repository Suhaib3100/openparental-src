package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.p;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: LazyGridIntervalContent.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u0094\u0001\u0012#\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u001d\u0010\r\u001a\u0019\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f\u0012#\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002\u0012\"\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\t¢\u0006\u0002\b\u0011¢\u0006\u0002\b\f¢\u0006\u0004\b\u0013\u0010\u0014R7\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R.\u0010\r\u001a\u0019\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR7\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R3\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\t¢\u0006\u0002\b\u0011¢\u0006\u0002\b\f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0015\u0010 ¨\u0006!"}, d2 = {"Landroidx/compose/foundation/lazy/grid/i;", "Landroidx/compose/foundation/lazy/layout/p$a;", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "index", "", "key", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/grid/s;", "Landroidx/compose/foundation/lazy/grid/b;", "Lkotlin/u;", "span", "type", "Landroidx/compose/foundation/lazy/grid/q;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "item", "<init>", "(Lld/l;Lld/p;Lld/l;Lld/r;)V", "a", "Lld/l;", "getKey", "()Lld/l;", "b", "Lld/p;", "()Lld/p;", "c", "getType", "d", "Lld/r;", "()Lld/r;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i implements p.a {

    /* renamed from: e, reason: collision with root package name */
    public static final int f5682e = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.l<Integer, Object> key;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.p<s, Integer, b> span;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<Integer, Object> type;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.r<q, Integer, androidx.compose.runtime.t, Integer, k2> item;

    /* JADX WARN: Multi-variable type inference failed */
    public i(@fg.m ld.l<? super Integer, ? extends Object> lVar, @fg.l ld.p<? super s, ? super Integer, b> pVar, @fg.l ld.l<? super Integer, ? extends Object> lVar2, @fg.l ld.r<? super q, ? super Integer, ? super androidx.compose.runtime.t, ? super Integer, k2> rVar) {
        this.key = lVar;
        this.span = pVar;
        this.type = lVar2;
        this.item = rVar;
    }

    @fg.l
    public final ld.r<q, Integer, androidx.compose.runtime.t, Integer, k2> a() {
        return this.item;
    }

    @fg.l
    public final ld.p<s, Integer, b> b() {
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
