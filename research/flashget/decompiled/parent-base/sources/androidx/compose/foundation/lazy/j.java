package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.p;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: LazyListIntervalContent.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0084\u0001\u0012#\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012#\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002\u00121\u0010\u000f\u001a-\u0012\u0004\u0012\u00020\u000b\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000e¢\u0006\u0004\b\u0010\u0010\u0011R7\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R7\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015RB\u0010\u000f\u001a-\u0012\u0004\u0012\u00020\u000b\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000e8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0012\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/lazy/j;", "Landroidx/compose/foundation/lazy/layout/p$a;", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "index", "", "key", "type", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/b;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "Lkotlin/u;", "item", "<init>", "(Lld/l;Lld/l;Lld/r;)V", "a", "Lld/l;", "getKey", "()Lld/l;", "b", "getType", "c", "Lld/r;", "()Lld/r;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j implements p.a {

    /* renamed from: d, reason: collision with root package name */
    public static final int f5886d = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.l<Integer, Object> key;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<Integer, Object> type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.r<b, Integer, androidx.compose.runtime.t, Integer, k2> item;

    /* JADX WARN: Multi-variable type inference failed */
    public j(@fg.m ld.l<? super Integer, ? extends Object> lVar, @fg.l ld.l<? super Integer, ? extends Object> lVar2, @fg.l ld.r<? super b, ? super Integer, ? super androidx.compose.runtime.t, ? super Integer, k2> rVar) {
        this.key = lVar;
        this.type = lVar2;
        this.item = rVar;
    }

    @fg.l
    public final ld.r<b, Integer, androidx.compose.runtime.t, Integer, k2> a() {
        return this.item;
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
