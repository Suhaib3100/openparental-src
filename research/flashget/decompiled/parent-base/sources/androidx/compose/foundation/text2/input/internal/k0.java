package androidx.compose.foundation.text2.input.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: TextLayoutState.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001e\u0010\u0007\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001e\u0010\t\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"Li0/f;", "Li0/i;", "rect", "a", "(JLi0/i;)J", "Landroidx/compose/foundation/text2/input/internal/j0;", "offset", "c", "(Landroidx/compose/foundation/text2/input/internal/j0;J)J", "b", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextLayoutState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutState.kt\nandroidx/compose/foundation/text2/input/internal/TextLayoutStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,233:1\n1#2:234\n*E\n"})
/* loaded from: classes.dex */
public final class k0 {
    public static final long a(long j4, @fg.l i0.i iVar) {
        return i0.g.a(i0.f.p(j4) < iVar.t() ? iVar.t() : i0.f.p(j4) > iVar.x() ? iVar.x() : i0.f.p(j4), i0.f.r(j4) < iVar.getTop() ? iVar.getTop() : i0.f.r(j4) > iVar.j() ? iVar.j() : i0.f.r(j4));
    }

    public static final long b(@fg.l j0 j0Var, long j4) {
        i0.f fVar;
        androidx.compose.ui.layout.u j5 = j0Var.j();
        if (j5 == null) {
            return j4;
        }
        androidx.compose.ui.layout.u d5 = j0Var.d();
        if (d5 != null) {
            fVar = i0.f.d((j5.f() && d5.f()) ? j5.E(d5, j4) : j4);
        } else {
            fVar = null;
        }
        return fVar != null ? fVar.getPackedValue() : j4;
    }

    public static final long c(@fg.l j0 j0Var, long j4) {
        androidx.compose.ui.layout.u j5 = j0Var.j();
        if (j5 == null) {
            return j4;
        }
        i0.f fVar = null;
        if (!j5.f()) {
            j5 = null;
        }
        if (j5 == null) {
            return j4;
        }
        androidx.compose.ui.layout.u c5 = j0Var.c();
        if (c5 != null) {
            if (!c5.f()) {
                c5 = null;
            }
            if (c5 != null) {
                fVar = i0.f.d(c5.E(j5, j4));
            }
        }
        return fVar != null ? fVar.getPackedValue() : j4;
    }
}
