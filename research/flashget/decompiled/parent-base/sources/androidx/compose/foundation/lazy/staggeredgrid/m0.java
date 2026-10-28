package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: LazyStaggeredGridCells.kt */
@x4
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0003\u0007\t\nJ#\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/m0;", "", "Landroidx/compose/ui/unit/d;", "", "availableSize", "spacing", "", "a", "(Landroidx/compose/ui/unit/d;II)[I", "b", "c", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface m0 {

    /* compiled from: LazyStaggeredGridCells.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/m0$a;", "Landroidx/compose/foundation/lazy/staggeredgrid/m0;", "Landroidx/compose/ui/unit/h;", "minSize", "<init>", "(FLkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/unit/d;", "", "availableSize", "spacing", "", "a", "(Landroidx/compose/ui/unit/d;II)[I", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    @r1({"SMAP\nLazyStaggeredGridCells.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridCells.kt\nandroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$Adaptive\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n154#2:155\n1#3:156\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridCells.kt\nandroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$Adaptive\n*L\n87#1:155\n*E\n"})
    public static final class a implements m0 {

        /* renamed from: b, reason: collision with root package name */
        public static final int f6415b = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float minSize;

        public /* synthetic */ a(float f4, kotlin.jvm.internal.w wVar) {
            this(f4);
        }

        @Override // androidx.compose.foundation.lazy.staggeredgrid.m0
        @fg.l
        public int[] a(@fg.l androidx.compose.ui.unit.d dVar, int i4, int i5) {
            int[] b5;
            b5 = f.b(i4, Math.max((i4 + i5) / (dVar.q2(this.minSize) + i5), 1), i5);
            return b5;
        }

        public boolean equals(@fg.m Object other) {
            return (other instanceof a) && androidx.compose.ui.unit.h.l(this.minSize, ((a) other).minSize);
        }

        public int hashCode() {
            return androidx.compose.ui.unit.h.n(this.minSize);
        }

        private a(float f4) {
            this.minSize = f4;
            if (Float.compare(f4, androidx.compose.ui.unit.h.g(0)) <= 0) {
                throw new IllegalArgumentException("invalid minSize");
            }
        }
    }

    /* compiled from: LazyStaggeredGridCells.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/m0$b;", "Landroidx/compose/foundation/lazy/staggeredgrid/m0;", "", "count", "<init>", "(I)V", "Landroidx/compose/ui/unit/d;", "availableSize", "spacing", "", "a", "(Landroidx/compose/ui/unit/d;II)[I", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    @r1({"SMAP\nLazyStaggeredGridCells.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridCells.kt\nandroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$Fixed\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n1#2:155\n*E\n"})
    public static final class b implements m0 {

        /* renamed from: b, reason: collision with root package name */
        public static final int f6417b = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int count;

        public b(int i4) {
            this.count = i4;
            if (i4 <= 0) {
                throw new IllegalArgumentException("grid with no rows/columns");
            }
        }

        @Override // androidx.compose.foundation.lazy.staggeredgrid.m0
        @fg.l
        public int[] a(@fg.l androidx.compose.ui.unit.d dVar, int i4, int i5) {
            int[] b5;
            b5 = f.b(i4, this.count, i5);
            return b5;
        }

        public boolean equals(@fg.m Object other) {
            return (other instanceof b) && this.count == ((b) other).count;
        }

        public int hashCode() {
            return -this.count;
        }
    }

    /* compiled from: LazyStaggeredGridCells.kt */
    @androidx.compose.runtime.internal.u(parameters = 1)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/m0$c;", "Landroidx/compose/foundation/lazy/staggeredgrid/m0;", "Landroidx/compose/ui/unit/h;", "size", "<init>", "(FLkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/unit/d;", "", "availableSize", "spacing", "", "a", "(Landroidx/compose/ui/unit/d;II)[I", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements m0 {

        /* renamed from: b, reason: collision with root package name */
        public static final int f6419b = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float size;

        public /* synthetic */ c(float f4, kotlin.jvm.internal.w wVar) {
            this(f4);
        }

        @Override // androidx.compose.foundation.lazy.staggeredgrid.m0
        @fg.l
        public int[] a(@fg.l androidx.compose.ui.unit.d dVar, int i4, int i5) {
            int q22 = dVar.q2(this.size);
            int i6 = q22 + i5;
            int i7 = i5 + i4;
            if (i6 >= i7) {
                return new int[]{i4};
            }
            int i10 = i7 / i6;
            int[] iArr = new int[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                iArr[i11] = q22;
            }
            return iArr;
        }

        public boolean equals(@fg.m Object other) {
            return (other instanceof c) && androidx.compose.ui.unit.h.l(this.size, ((c) other).size);
        }

        public int hashCode() {
            return androidx.compose.ui.unit.h.n(this.size);
        }

        private c(float f4) {
            this.size = f4;
        }
    }

    @fg.l
    int[] a(@fg.l androidx.compose.ui.unit.d dVar, int i4, int i5);
}
