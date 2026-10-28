package androidx.compose.foundation.lazy.staggeredgrid;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.z0;

/* compiled from: LazyStaggeredGridMeasureResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u001a\u0010\n\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/t;", "", "itemIndex", "Landroidx/compose/foundation/lazy/staggeredgrid/j;", "a", "(Landroidx/compose/foundation/lazy/staggeredgrid/t;I)Landroidx/compose/foundation/lazy/staggeredgrid/j;", "Landroidx/compose/foundation/lazy/staggeredgrid/y;", "Landroidx/compose/foundation/lazy/staggeredgrid/y;", "b", "()Landroidx/compose/foundation/lazy/staggeredgrid/y;", "EmptyLazyStaggeredGridLayoutInfo", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final y f6521a;

    /* compiled from: LazyStaggeredGridMeasureResult.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR,\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0006\u0010\u0004\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"androidx/compose/foundation/lazy/staggeredgrid/z$a", "Landroidx/compose/ui/layout/n0;", "Lkotlin/k2;", "q", "()V", "", "a", "I", "getWidth", "()I", "width", "b", "getHeight", "height", "", "Landroidx/compose/ui/layout/a;", "c", "Ljava/util/Map;", "p", "()Ljava/util/Map;", "alignmentLines", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements androidx.compose.ui.layout.n0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int width;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int height;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Map<androidx.compose.ui.layout.a, Integer> alignmentLines = z0.z();

        a() {
        }

        public static /* synthetic */ void a() {
        }

        @Override // androidx.compose.ui.layout.n0
        public int getHeight() {
            return this.height;
        }

        @Override // androidx.compose.ui.layout.n0
        public int getWidth() {
            return this.width;
        }

        @Override // androidx.compose.ui.layout.n0
        @fg.l
        public Map<androidx.compose.ui.layout.a, Integer> p() {
            return this.alignmentLines;
        }

        @Override // androidx.compose.ui.layout.n0
        public void q() {
        }
    }

    /* compiled from: LazyStaggeredGridMeasureResult.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/j;", "it", "", "a", "(Landroidx/compose/foundation/lazy/staggeredgrid/j;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<j, Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6525b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i4) {
            super(1);
            this.f6525b = i4;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(@fg.l j jVar) {
            return Integer.valueOf(jVar.getIndex() - this.f6525b);
        }
    }

    static {
        a aVar = new a();
        kotlin.collections.j0 j0Var = kotlin.collections.j0.f74919b;
        androidx.compose.ui.unit.u.INSTANCE.getClass();
        f6521a = new y(new int[0], new int[0], 0.0f, aVar, false, false, false, 0, j0Var, androidx.compose.ui.unit.u.f21529c, 0, 0, 0, 0, 0, null);
    }

    @fg.m
    public static final j a(@fg.l t tVar, int i4) {
        if (tVar.j().isEmpty()) {
            return null;
        }
        int index = ((j) kotlin.collections.w.B2(tVar.j())).getIndex();
        if (i4 > ((j) kotlin.collections.w.p3(tVar.j())).getIndex() || index > i4) {
            return null;
        }
        return (j) kotlin.collections.w.W2(tVar.j(), kotlin.collections.w.x(tVar.j(), 0, 0, new b(i4), 3, null));
    }

    @fg.l
    public static final y b() {
        return f6521a;
    }
}
