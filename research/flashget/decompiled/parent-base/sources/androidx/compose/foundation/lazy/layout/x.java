package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.z0;
import androidx.compose.runtime.x4;
import androidx.compose.ui.layout.i1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: LazyLayoutMeasureScope.kt */
@z0
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\u00020\u000b*\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b*\u00020\u0002H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u000b*\u00020\u0010H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\n*\u00020\u0010H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\n*\u00020\u0002H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\n*\u00020\u000bH\u0017ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0014J\u0016\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0017ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u0018*\u00020\u0019H\u0017ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001b\u0082\u0001\u0001\u001dø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/x;", "Landroidx/compose/ui/layout/o0;", "", "index", "Landroidx/compose/ui/unit/b;", "constraints", "", "Landroidx/compose/ui/layout/i1;", "p1", "(IJ)Ljava/util/List;", "Landroidx/compose/ui/unit/z;", "Landroidx/compose/ui/unit/h;", "i", "(J)F", "R", "(I)F", "", "S", "(F)F", "w", "(F)J", "u", "(I)J", "h", "Landroidx/compose/ui/unit/l;", "Li0/n;", "d0", "(J)J", "n", "Landroidx/compose/foundation/lazy/layout/y;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x4
@r1({"SMAP\nLazyLayoutMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,154:1\n1#2:155\n174#3:156\n174#3:157\n473#3:158\n152#4:159\n*S KotlinDebug\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope\n*L\n74#1:156\n77#1:157\n89#1:158\n96#1:159\n*E\n"})
/* loaded from: classes.dex */
public interface x extends androidx.compose.ui.layout.o0 {
    @Override // androidx.compose.ui.unit.d
    @x4
    default float R(int i4) {
        return androidx.compose.ui.unit.h.g(i4 / getDensity());
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    default float S(float f4) {
        return androidx.compose.ui.unit.h.g(f4 / getDensity());
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    default long d0(long j4) {
        androidx.compose.ui.unit.l.INSTANCE.getClass();
        if (j4 != androidx.compose.ui.unit.l.f21515d) {
            return i0.o.a(v5(androidx.compose.ui.unit.l.p(j4)), v5(androidx.compose.ui.unit.l.m(j4)));
        }
        i0.n.INSTANCE.getClass();
        return i0.n.f74172d;
    }

    @Override // androidx.compose.ui.unit.n
    @x4
    default long h(float f4) {
        return androidx.compose.ui.unit.a0.v(4294967296L, f4 / getFontScale());
    }

    @Override // androidx.compose.ui.unit.n
    @x4
    default float i(long j4) {
        long m4 = androidx.compose.ui.unit.z.m(j4);
        androidx.compose.ui.unit.b0.INSTANCE.getClass();
        if (!androidx.compose.ui.unit.b0.g(m4, androidx.compose.ui.unit.b0.f21487d)) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        return androidx.compose.ui.unit.h.g(getFontScale() * androidx.compose.ui.unit.z.n(j4));
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    default long n(long j4) {
        i0.n.INSTANCE.getClass();
        if (j4 != i0.n.f74172d) {
            return androidx.compose.ui.unit.i.b(S(i0.n.t(j4)), S(i0.n.m(j4)));
        }
        androidx.compose.ui.unit.l.INSTANCE.getClass();
        return androidx.compose.ui.unit.l.f21515d;
    }

    @fg.l
    List<i1> p1(int index, long constraints);

    @Override // androidx.compose.ui.unit.d
    @x4
    default long u(int i4) {
        return androidx.compose.ui.unit.a0.v(4294967296L, i4 / (getDensity() * getFontScale()));
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    default long w(float f4) {
        return androidx.compose.ui.unit.a0.v(4294967296L, f4 / (getDensity() * getFontScale()));
    }
}
