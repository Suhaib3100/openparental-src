package androidx.compose.foundation.lazy.grid;

import androidx.collection.r2;
import androidx.compose.runtime.x4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: LazyGridDsl.kt */
@x4
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0003\u0007\t\nJ)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/a;", "", "Landroidx/compose/ui/unit/d;", "", "availableSize", "spacing", "", "a", "(Landroidx/compose/ui/unit/d;II)Ljava/util/List;", "b", "c", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface a {

    /* compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/lazy/grid/a$a;", "Landroidx/compose/foundation/lazy/grid/a;", "Landroidx/compose/ui/unit/h;", "minSize", "<init>", "(FLkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/unit/d;", "", "availableSize", "spacing", "", "a", "(Landroidx/compose/ui/unit/d;II)Ljava/util/List;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    @r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$Adaptive\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,563:1\n154#2:564\n1#3:565\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$Adaptive\n*L\n304#1:564\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.grid.a$a, reason: collision with other inner class name */
    public static final class C0102a implements a {

        /* renamed from: b, reason: collision with root package name */
        public static final int f5568b = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float minSize;

        public /* synthetic */ C0102a(float f4, kotlin.jvm.internal.w wVar) {
            this(f4);
        }

        @Override // androidx.compose.foundation.lazy.grid.a
        @fg.l
        public List<Integer> a(@fg.l androidx.compose.ui.unit.d dVar, int i4, int i5) {
            List<Integer> d5;
            d5 = h.d(i4, Math.max((i4 + i5) / (dVar.q2(this.minSize) + i5), 1), i5);
            return d5;
        }

        public boolean equals(@fg.m Object other) {
            return (other instanceof C0102a) && androidx.compose.ui.unit.h.l(this.minSize, ((C0102a) other).minSize);
        }

        public int hashCode() {
            return androidx.compose.ui.unit.h.n(this.minSize);
        }

        private C0102a(float f4) {
            this.minSize = f4;
            if (Float.compare(f4, androidx.compose.ui.unit.h.g(0)) > 0) {
                return;
            }
            throw new IllegalArgumentException(("Provided min size " + ((Object) androidx.compose.ui.unit.h.s(f4)) + " should be larger than zero.").toString());
        }
    }

    /* compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/lazy/grid/a$b;", "Landroidx/compose/foundation/lazy/grid/a;", "", "count", "<init>", "(I)V", "Landroidx/compose/ui/unit/d;", "availableSize", "spacing", "", "a", "(Landroidx/compose/ui/unit/d;II)Ljava/util/List;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    @r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$Fixed\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,563:1\n1#2:564\n*E\n"})
    public static final class b implements a {

        /* renamed from: b, reason: collision with root package name */
        public static final int f5570b = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int count;

        public b(int i4) {
            this.count = i4;
            if (i4 <= 0) {
                throw new IllegalArgumentException(r2.a("Provided count ", i4, " should be larger than zero").toString());
            }
        }

        @Override // androidx.compose.foundation.lazy.grid.a
        @fg.l
        public List<Integer> a(@fg.l androidx.compose.ui.unit.d dVar, int i4, int i5) {
            List<Integer> d5;
            d5 = h.d(i4, this.count, i5);
            return d5;
        }

        public boolean equals(@fg.m Object other) {
            return (other instanceof b) && this.count == ((b) other).count;
        }

        public int hashCode() {
            return -this.count;
        }
    }

    /* compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/lazy/grid/a$c;", "Landroidx/compose/foundation/lazy/grid/a;", "Landroidx/compose/ui/unit/h;", "size", "<init>", "(FLkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/unit/d;", "", "availableSize", "spacing", "", "a", "(Landroidx/compose/ui/unit/d;II)Ljava/util/List;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    @r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$FixedSize\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,563:1\n154#2:564\n1#3:565\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$FixedSize\n*L\n337#1:564\n*E\n"})
    public static final class c implements a {

        /* renamed from: b, reason: collision with root package name */
        public static final int f5572b = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float size;

        public /* synthetic */ c(float f4, kotlin.jvm.internal.w wVar) {
            this(f4);
        }

        @Override // androidx.compose.foundation.lazy.grid.a
        @fg.l
        public List<Integer> a(@fg.l androidx.compose.ui.unit.d dVar, int i4, int i5) {
            int q22 = dVar.q2(this.size);
            int i6 = q22 + i5;
            int i7 = i5 + i4;
            if (i6 >= i7) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(Integer.valueOf(i4));
                return arrayList;
            }
            int i10 = i7 / i6;
            ArrayList arrayList2 = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList2.add(Integer.valueOf(q22));
            }
            return arrayList2;
        }

        public boolean equals(@fg.m Object other) {
            return (other instanceof c) && androidx.compose.ui.unit.h.l(this.size, ((c) other).size);
        }

        public int hashCode() {
            return androidx.compose.ui.unit.h.n(this.size);
        }

        private c(float f4) {
            this.size = f4;
            if (Float.compare(f4, androidx.compose.ui.unit.h.g(0)) > 0) {
                return;
            }
            throw new IllegalArgumentException(("Provided size " + ((Object) androidx.compose.ui.unit.h.s(f4)) + " should be larger than zero.").toString());
        }
    }

    @fg.l
    List<Integer> a(@fg.l androidx.compose.ui.unit.d dVar, int i4, int i5);
}
