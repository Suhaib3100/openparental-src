package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.q;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: MultiWidgetSelectionDelegate.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a6\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\u0012\u001a\u00020\u0010*\u00020\u000b2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00060\fj\b\u0012\u0004\u0012\u00020\u0006`\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\"\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\"\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0019\u001a#\u0010\u001c\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0017H\u0002¢\u0006\u0004\b!\u0010\"\u001a\"\u0010#\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/foundation/text/selection/e0;", "Landroidx/compose/ui/text/n0;", "textLayoutResult", "Li0/f;", "localPosition", "previousHandlePosition", "", "selectableId", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text/selection/e0;Landroidx/compose/ui/text/n0;JJJ)V", "Landroidx/compose/foundation/text/selection/q$a;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "selectableIdOrderingComparator", "currentSelectableId", "", "currentTextLength", "e", "(Landroidx/compose/foundation/text/selection/q$a;Ljava/util/Comparator;JI)I", "position", "Li0/i;", "bounds", "Landroidx/compose/foundation/text/selection/f;", "f", "(JLi0/i;)Landroidx/compose/foundation/text/selection/f;", "g", "anchorSelectableId", "c", "(Landroidx/compose/foundation/text/selection/e0;JJ)Landroidx/compose/foundation/text/selection/f;", "currentDirection", "otherDirection", "", "h", "(Landroidx/compose/foundation/text/selection/f;Landroidx/compose/foundation/text/selection/f;)Z", "d", "(JLandroidx/compose/ui/text/n0;)I", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nMultiWidgetSelectionDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiWidgetSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,335:1\n1#2:336\n*E\n"})
/* loaded from: classes.dex */
public final class m {
    public static final void a(@fg.l e0 e0Var, @fg.l androidx.compose.ui.text.n0 n0Var, long j4, long j5, long j6) {
        f b5;
        f fVar;
        f fVar2;
        f fVar3;
        f fVar4;
        int i4;
        int e4;
        q.a h4;
        q.a f4;
        i0.i iVar = new i0.i(0.0f, 0.0f, androidx.compose.ui.unit.u.m(n0Var.getSize()), (int) (n0Var.getSize() & 4294967295L));
        f f5 = f(j4, iVar);
        f g4 = g(j4, iVar);
        if (e0Var.getIsStartHandle()) {
            q previousSelection = e0Var.getPreviousSelection();
            b5 = b(f5, g4, e0Var, j6, previousSelection != null ? previousSelection.f() : null);
            fVar3 = b5;
            fVar4 = fVar3;
            fVar = f5;
            fVar2 = g4;
        } else {
            q previousSelection2 = e0Var.getPreviousSelection();
            b5 = b(f5, g4, e0Var, j6, previousSelection2 != null ? previousSelection2.h() : null);
            fVar = b5;
            fVar2 = fVar;
            fVar3 = f5;
            fVar4 = g4;
        }
        if (h(f0.f(f5, g4), b5)) {
            int length = n0Var.getLayoutInput().getText().length();
            if (e0Var.getIsStartHandle()) {
                int d5 = d(j4, n0Var);
                q previousSelection3 = e0Var.getPreviousSelection();
                e4 = d5;
                i4 = (previousSelection3 == null || (f4 = previousSelection3.f()) == null) ? d5 : e(f4, e0Var.g(), j6, length);
            } else {
                int d6 = d(j4, n0Var);
                q previousSelection4 = e0Var.getPreviousSelection();
                i4 = d6;
                e4 = (previousSelection4 == null || (h4 = previousSelection4.h()) == null) ? d6 : e(h4, e0Var.g(), j6, length);
            }
            e0Var.a(j6, e4, fVar, fVar2, i4, fVar3, fVar4, i0.g.f(j5) ? -1 : d(j5, n0Var), n0Var);
        }
    }

    private static final f b(f fVar, f fVar2, e0 e0Var, long j4, q.a aVar) {
        f c5;
        return (aVar == null || (c5 = c(e0Var, aVar.h(), j4)) == null) ? f0.f(fVar, fVar2) : c5;
    }

    private static final f c(e0 e0Var, long j4, long j5) {
        int compare = e0Var.g().compare(Long.valueOf(j4), Long.valueOf(j5));
        return compare < 0 ? f.BEFORE : compare > 0 ? f.AFTER : f.ON;
    }

    private static final int d(long j4, androidx.compose.ui.text.n0 n0Var) {
        if (i0.f.r(j4) <= 0.0f) {
            return 0;
        }
        return i0.f.r(j4) >= n0Var.getMultiParagraph().getHeight() ? n0Var.getLayoutInput().getText().length() : n0Var.x(j4);
    }

    private static final int e(q.a aVar, Comparator<Long> comparator, long j4, int i4) {
        int compare = comparator.compare(Long.valueOf(aVar.h()), Long.valueOf(j4));
        if (compare < 0) {
            return 0;
        }
        return compare > 0 ? i4 : aVar.g();
    }

    private static final f f(long j4, i0.i iVar) {
        return i0.f.p(j4) < iVar.t() ? f.BEFORE : i0.f.p(j4) > iVar.x() ? f.AFTER : f.ON;
    }

    private static final f g(long j4, i0.i iVar) {
        return i0.f.r(j4) < iVar.getTop() ? f.BEFORE : i0.f.r(j4) > iVar.j() ? f.AFTER : f.ON;
    }

    private static final boolean h(f fVar, f fVar2) {
        return fVar == f.ON || fVar != fVar2;
    }
}
