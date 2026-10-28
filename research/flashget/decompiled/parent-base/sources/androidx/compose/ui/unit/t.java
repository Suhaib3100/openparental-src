package androidx.compose.ui.unit;

import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: IntRect.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006\u001a\"\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0018\u001a\u00020\u0004*\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/unit/q;", "offset", "Landroidx/compose/ui/unit/u;", "size", "Landroidx/compose/ui/unit/s;", "b", "(JJ)Landroidx/compose/ui/unit/s;", "topLeft", "bottomRight", "a", "center", "", "radius", "c", "(JI)Landroidx/compose/ui/unit/s;", "start", "stop", "", "fraction", "d", "(Landroidx/compose/ui/unit/s;Landroidx/compose/ui/unit/s;F)Landroidx/compose/ui/unit/s;", "Li0/i;", "f", "(Landroidx/compose/ui/unit/s;)Li0/i;", "e", "(Li0/i;)Landroidx/compose/ui/unit/s;", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t {
    @x4
    @fg.l
    public static final s a(long j4, long j5) {
        return new s(q.m(j4), (int) (j4 & 4294967295L), (int) (j5 >> 32), (int) (j5 & 4294967295L));
    }

    @x4
    @fg.l
    public static final s b(long j4, long j5) {
        int i4 = (int) (j4 & 4294967295L);
        return new s(q.m(j4), i4, u.m(j5) + ((int) (j4 >> 32)), ((int) (j5 & 4294967295L)) + i4);
    }

    @x4
    @fg.l
    public static final s c(long j4, int i4) {
        int i5 = (int) (4294967295L & j4);
        return new s(q.m(j4) - i4, i5 - i4, ((int) (j4 >> 32)) + i4, i5 + i4);
    }

    @x4
    @fg.l
    public static final s d(@fg.l s sVar, @fg.l s sVar2, float f4) {
        return new s(androidx.compose.ui.util.d.b(sVar.t(), sVar2.t(), f4), androidx.compose.ui.util.d.b(sVar.getTop(), sVar2.getTop(), f4), androidx.compose.ui.util.d.b(sVar.x(), sVar2.x(), f4), androidx.compose.ui.util.d.b(sVar.j(), sVar2.j(), f4));
    }

    @x4
    @fg.l
    public static final s e(@fg.l i0.i iVar) {
        return new s(kotlin.math.b.L0(iVar.t()), kotlin.math.b.L0(iVar.getTop()), kotlin.math.b.L0(iVar.x()), kotlin.math.b.L0(iVar.j()));
    }

    @x4
    @fg.l
    public static final i0.i f(@fg.l s sVar) {
        return new i0.i(sVar.t(), sVar.getTop(), sVar.x(), sVar.j());
    }
}
