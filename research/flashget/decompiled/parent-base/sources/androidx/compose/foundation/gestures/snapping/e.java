package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.a1;
import androidx.compose.animation.core.b0;
import androidx.compose.foundation.gestures.j0;
import androidx.compose.foundation.lazy.grid.k0;
import androidx.compose.foundation.lazy.grid.u;
import androidx.compose.foundation.z0;
import androidx.compose.ui.unit.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.ranges.s;

/* compiled from: LazyGridSnapLayoutInfoProvider.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\r\u001a\u00020\n*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\r\u0010\f\"\u0018\u0010\u0011\u001a\u00020\n*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/lazy/grid/k0;", "lazyGridState", "Landroidx/compose/foundation/gestures/snapping/l;", "positionInLayout", "Landroidx/compose/foundation/gestures/snapping/j;", "a", "(Landroidx/compose/foundation/lazy/grid/k0;Landroidx/compose/foundation/gestures/snapping/l;)Landroidx/compose/foundation/gestures/snapping/j;", "Landroidx/compose/foundation/lazy/grid/k;", "Landroidx/compose/foundation/gestures/j0;", "orientation", "", "e", "(Landroidx/compose/foundation/lazy/grid/k;Landroidx/compose/foundation/gestures/j0;)I", "d", "Landroidx/compose/foundation/lazy/grid/u;", "c", "(Landroidx/compose/foundation/lazy/grid/u;)I", "singleAxisViewportSize", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {

    /* compiled from: LazyGridSnapLayoutInfoProvider.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"androidx/compose/foundation/gestures/snapping/e$a", "Landroidx/compose/foundation/gestures/snapping/j;", "", "Landroidx/compose/foundation/lazy/grid/k;", "e", "()Ljava/util/List;", "", "initialVelocity", "b", "(F)F", "currentVelocity", "a", "c", "()F", "Landroidx/compose/foundation/lazy/grid/u;", "d", "()Landroidx/compose/foundation/lazy/grid/u;", "layoutInfo", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nLazyGridSnapLayoutInfoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyGridSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n235#2,3:155\n33#2,4:158\n238#2,2:162\n38#2:164\n240#2:165\n33#2,6:166\n132#2,3:173\n33#2,4:176\n135#2,2:180\n38#2:182\n137#2:183\n132#2,3:184\n33#2,4:187\n135#2,2:191\n38#2:193\n137#2:194\n1#3:172\n*S KotlinDebug\n*F\n+ 1 LazyGridSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyGridSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1\n*L\n72#1:155,3\n72#1:158,4\n72#1:162,2\n72#1:164\n72#1:165\n87#1:166,6\n121#1:173,3\n121#1:176,4\n121#1:180,2\n121#1:182\n121#1:183\n123#1:184,3\n123#1:187,4\n123#1:191,2\n123#1:193\n123#1:194\n*E\n"})
    public static final class a implements j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k0 f4257a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f4258b;

        a(k0 k0Var, l lVar) {
            this.f4257a = k0Var;
            this.f4258b = lVar;
        }

        private final u d() {
            return this.f4257a.v();
        }

        private final List<androidx.compose.foundation.lazy.grid.k> e() {
            int i4;
            List<androidx.compose.foundation.lazy.grid.k> j4 = this.f4257a.v().j();
            k0 k0Var = this.f4257a;
            ArrayList arrayList = new ArrayList(j4.size());
            int size = j4.size();
            while (i4 < size) {
                androidx.compose.foundation.lazy.grid.k kVar = j4.get(i4);
                androidx.compose.foundation.lazy.grid.k kVar2 = kVar;
                if (k0Var.v().a() == j0.Horizontal) {
                    i4 = kVar2.getRow() != 0 ? i4 + 1 : 0;
                    arrayList.add(kVar);
                } else {
                    if (kVar2.getColumn() != 0) {
                    }
                    arrayList.add(kVar);
                }
            }
            return arrayList;
        }

        @Override // androidx.compose.foundation.gestures.snapping.j
        public float a(float currentVelocity) {
            List<androidx.compose.foundation.lazy.grid.k> j4 = this.f4257a.v().j();
            l lVar = this.f4258b;
            int size = j4.size();
            float f4 = Float.NEGATIVE_INFINITY;
            float f5 = Float.POSITIVE_INFINITY;
            for (int i4 = 0; i4 < size; i4++) {
                androidx.compose.foundation.lazy.grid.k kVar = j4.get(i4);
                float a5 = m.a(e.c(this.f4257a.v()), this.f4257a.v().e(), this.f4257a.v().c(), e.e(kVar, this.f4257a.v().a()), e.d(kVar, this.f4257a.v().a()), kVar.getIndex(), lVar);
                if (a5 <= 0.0f && a5 > f4) {
                    f4 = a5;
                }
                if (a5 >= 0.0f && a5 < f5) {
                    f5 = a5;
                }
            }
            return i.j(f.c(this.f4257a.getDensity(), currentVelocity), f4, f5);
        }

        @Override // androidx.compose.foundation.gestures.snapping.j
        public float b(float initialVelocity) {
            float t4 = s.t((c() * ((float) Math.floor(Math.abs(Math.abs(b0.a(a1.c(this.f4257a.getDensity()), 0.0f, initialVelocity))) / c()))) - c(), 0.0f);
            return t4 == 0.0f ? t4 : t4 * Math.signum(initialVelocity);
        }

        public final float c() {
            int i4;
            List<androidx.compose.foundation.lazy.grid.k> e4 = e();
            if (e4.isEmpty()) {
                return 0.0f;
            }
            int i5 = 0;
            if (this.f4257a.v().a() == j0.Vertical) {
                int size = e4.size();
                i4 = 0;
                while (i5 < size) {
                    i4 += androidx.compose.ui.unit.u.j(e4.get(i5).getSize());
                    i5++;
                }
            } else {
                int size2 = e4.size();
                i4 = 0;
                while (i5 < size2) {
                    i4 += androidx.compose.ui.unit.u.m(e4.get(i5).getSize());
                    i5++;
                }
            }
            return i4 / e4.size();
        }
    }

    @fg.l
    @z0
    public static final j a(@fg.l k0 k0Var, @fg.l l lVar) {
        return new a(k0Var, lVar);
    }

    public static j b(k0 k0Var, l lVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            lVar = l.INSTANCE.c();
        }
        return new a(k0Var, lVar);
    }

    public static final int c(@fg.l u uVar) {
        return uVar.a() == j0.Vertical ? androidx.compose.ui.unit.u.j(uVar.b()) : androidx.compose.ui.unit.u.m(uVar.b());
    }

    public static final int d(@fg.l androidx.compose.foundation.lazy.grid.k kVar, @fg.l j0 j0Var) {
        return j0Var == j0.Vertical ? q.o(kVar.getOffset()) : q.m(kVar.getOffset());
    }

    public static final int e(@fg.l androidx.compose.foundation.lazy.grid.k kVar, @fg.l j0 j0Var) {
        return j0Var == j0.Vertical ? androidx.compose.ui.unit.u.j(kVar.getSize()) : androidx.compose.ui.unit.u.m(kVar.getSize());
    }
}
