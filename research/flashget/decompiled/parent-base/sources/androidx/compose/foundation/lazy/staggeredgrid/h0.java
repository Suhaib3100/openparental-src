package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;

/* compiled from: LazyStaggeredGrid.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/h0;", "", "", "positions", "sizes", "<init>", "([I[I)V", "a", "[I", "()[I", "b", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f6345c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final int[] positions;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final int[] sizes;

    public h0(@fg.l int[] iArr, @fg.l int[] iArr2) {
        this.positions = iArr;
        this.sizes = iArr2;
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final int[] getPositions() {
        return this.positions;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final int[] getSizes() {
        return this.sizes;
    }
}
