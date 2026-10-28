package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.p;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: LazyLayoutPager.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B_\u0012#\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u00121\u0010\u000e\u001a-\u0012\u0004\u0012\u00020\n\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0002\b\r¢\u0006\u0004\b\u000f\u0010\u0010R7\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014RB\u0010\u000e\u001a-\u0012\u0004\u0012\u00020\n\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0002\b\r8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/pager/l;", "Landroidx/compose/foundation/lazy/layout/p$a;", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "page", "", "key", "Lkotlin/Function2;", "Landroidx/compose/foundation/pager/v;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "Lkotlin/u;", "item", "<init>", "(Lld/l;Lld/r;)V", "a", "Lld/l;", "getKey", "()Lld/l;", "b", "Lld/r;", "()Lld/r;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l implements p.a {

    /* renamed from: c, reason: collision with root package name */
    public static final int f6807c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.l<Integer, Object> key;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.r<v, Integer, androidx.compose.runtime.t, Integer, k2> item;

    /* JADX WARN: Multi-variable type inference failed */
    public l(@fg.m ld.l<? super Integer, ? extends Object> lVar, @fg.l ld.r<? super v, ? super Integer, ? super androidx.compose.runtime.t, ? super Integer, k2> rVar) {
        this.key = lVar;
        this.item = rVar;
    }

    @fg.l
    public final ld.r<v, Integer, androidx.compose.runtime.t, Integer, k2> a() {
        return this.item;
    }

    @Override // androidx.compose.foundation.lazy.layout.p.a
    @fg.m
    public ld.l<Integer, Object> getKey() {
        return this.key;
    }
}
