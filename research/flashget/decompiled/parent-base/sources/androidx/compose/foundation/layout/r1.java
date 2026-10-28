package androidx.compose.foundation.layout;

import java.util.List;
import kotlin.Metadata;

/* compiled from: RowColumnImpl.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a5\u0010\u0006\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a5\u0010\b\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\u0007\u001a5\u0010\t\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\u0007\u001a5\u0010\n\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u0007\u001a{\u0010\u0014\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u001d\u0010\u000e\u001a\u0019\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\f¢\u0006\u0002\b\r2\u001d\u0010\u000f\u001a\u0019\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\f¢\u0006\u0002\b\r2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001aL\u0010\u0017\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u001d\u0010\u0016\u001a\u0019\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\f¢\u0006\u0002\b\r2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001ak\u0010\u001b\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u001d\u0010\u0016\u001a\u0019\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\f¢\u0006\u0002\b\r2\u001d\u0010\u0019\u001a\u0019\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\f¢\u0006\u0002\b\r2\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\"\u001a\u0010 \u001a\u0004\u0018\u00010\u001d*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\"\u001a\u0010$\u001a\u00020!*\u0004\u0018\u00010\u001d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#\"\u001a\u0010(\u001a\u00020%*\u0004\u0018\u00010\u001d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'\"\u001c\u0010,\u001a\u0004\u0018\u00010)*\u0004\u0018\u00010\u001d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\"\u001a\u0010.\u001a\u00020%*\u0004\u0018\u00010\u001d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010'¨\u0006/"}, d2 = {"Landroidx/compose/foundation/layout/a1;", "orientation", "Lkotlin/Function3;", "", "Landroidx/compose/ui/layout/p;", "", "d", "(Landroidx/compose/foundation/layout/a1;)Lld/q;", "c", "b", "a", "children", "Lkotlin/Function2;", "Lkotlin/u;", "intrinsicMainSize", "intrinsicCrossSize", "crossAxisAvailable", "mainAxisSpacing", "layoutOrientation", "intrinsicOrientation", "p", "(Ljava/util/List;Lld/p;Lld/p;IILandroidx/compose/foundation/layout/a1;Landroidx/compose/foundation/layout/a1;)I", "mainAxisSize", "o", "(Ljava/util/List;Lld/p;II)I", "crossAxisSize", "mainAxisAvailable", "n", "(Ljava/util/List;Lld/p;Lld/p;II)I", "Landroidx/compose/foundation/layout/v1;", "l", "(Landroidx/compose/ui/layout/p;)Landroidx/compose/foundation/layout/v1;", "rowColumnParentData", "", "m", "(Landroidx/compose/foundation/layout/v1;)F", "weight", "", "k", "(Landroidx/compose/foundation/layout/v1;)Z", "fill", "Landroidx/compose/foundation/layout/x;", "j", "(Landroidx/compose/foundation/layout/v1;)Landroidx/compose/foundation/layout/x;", "crossAxisAlignment", "q", "isRelative", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,871:1\n33#2,6:872\n33#2,6:878\n33#2,6:884\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n*L\n565#1:872,6\n590#1:878,6\n616#1:884,6\n*E\n"})
/* loaded from: classes.dex */
public final class r1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ld.q<List<? extends androidx.compose.ui.layout.p>, Integer, Integer, Integer> a(a1 a1Var) {
        return a1Var == a1.Horizontal ? w0.f5359a.a() : w0.f5359a.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ld.q<List<? extends androidx.compose.ui.layout.p>, Integer, Integer, Integer> b(a1 a1Var) {
        return a1Var == a1.Horizontal ? w0.f5359a.b() : w0.f5359a.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ld.q<List<? extends androidx.compose.ui.layout.p>, Integer, Integer, Integer> c(a1 a1Var) {
        return a1Var == a1.Horizontal ? w0.f5359a.c() : w0.f5359a.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ld.q<List<? extends androidx.compose.ui.layout.p>, Integer, Integer, Integer> d(a1 a1Var) {
        return a1Var == a1.Horizontal ? w0.f5359a.d() : w0.f5359a.h();
    }

    @fg.m
    public static final x j(@fg.m v1 v1Var) {
        if (v1Var != null) {
            return v1Var.f();
        }
        return null;
    }

    public static final boolean k(@fg.m v1 v1Var) {
        if (v1Var != null) {
            return v1Var.g();
        }
        return true;
    }

    @fg.m
    public static final v1 l(@fg.l androidx.compose.ui.layout.p pVar) {
        Object a5 = pVar.a();
        if (a5 instanceof v1) {
            return (v1) a5;
        }
        return null;
    }

    public static final float m(@fg.m v1 v1Var) {
        if (v1Var != null) {
            return v1Var.h();
        }
        return 0.0f;
    }

    private static final int n(List<? extends androidx.compose.ui.layout.p> list, ld.p<? super androidx.compose.ui.layout.p, ? super Integer, Integer> pVar, ld.p<? super androidx.compose.ui.layout.p, ? super Integer, Integer> pVar2, int i4, int i5) {
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * i5, i4);
        int size = list.size();
        int i6 = 0;
        float f4 = 0.0f;
        for (int i7 = 0; i7 < size; i7++) {
            androidx.compose.ui.layout.p pVar3 = list.get(i7);
            float m4 = m(l(pVar3));
            if (m4 == 0.0f) {
                int min2 = Math.min(pVar.invoke(pVar3, Integer.MAX_VALUE).intValue(), i4 - min);
                min += min2;
                i6 = Math.max(i6, pVar2.invoke(pVar3, Integer.valueOf(min2)).intValue());
            } else if (m4 > 0.0f) {
                f4 += m4;
            }
        }
        int L0 = f4 == 0.0f ? 0 : i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : kotlin.math.b.L0(Math.max(i4 - min, 0) / f4);
        int size2 = list.size();
        for (int i10 = 0; i10 < size2; i10++) {
            androidx.compose.ui.layout.p pVar4 = list.get(i10);
            float m5 = m(l(pVar4));
            if (m5 > 0.0f) {
                i6 = Math.max(i6, pVar2.invoke(pVar4, Integer.valueOf(L0 != Integer.MAX_VALUE ? kotlin.math.b.L0(L0 * m5) : Integer.MAX_VALUE)).intValue());
            }
        }
        return i6;
    }

    private static final int o(List<? extends androidx.compose.ui.layout.p> list, ld.p<? super androidx.compose.ui.layout.p, ? super Integer, Integer> pVar, int i4, int i5) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i6 = 0;
        int i7 = 0;
        float f4 = 0.0f;
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.ui.layout.p pVar2 = list.get(i10);
            float m4 = m(l(pVar2));
            int intValue = pVar.invoke(pVar2, Integer.valueOf(i4)).intValue();
            if (m4 == 0.0f) {
                i7 += intValue;
            } else if (m4 > 0.0f) {
                f4 += m4;
                i6 = Math.max(i6, kotlin.math.b.L0(intValue / m4));
            }
        }
        return ((list.size() - 1) * i5) + kotlin.math.b.L0(i6 * f4) + i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(List<? extends androidx.compose.ui.layout.p> list, ld.p<? super androidx.compose.ui.layout.p, ? super Integer, Integer> pVar, ld.p<? super androidx.compose.ui.layout.p, ? super Integer, Integer> pVar2, int i4, int i5, a1 a1Var, a1 a1Var2) {
        return a1Var == a1Var2 ? o(list, pVar, i4, i5) : n(list, pVar2, pVar, i4, i5);
    }

    public static final boolean q(@fg.m v1 v1Var) {
        x j4 = j(v1Var);
        if (j4 != null) {
            return j4.f();
        }
        return false;
    }
}
