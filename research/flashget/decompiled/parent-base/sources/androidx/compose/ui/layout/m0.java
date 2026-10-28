package androidx.compose.ui.layout;

import androidx.compose.runtime.x4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MeasurePolicy.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u00002\u00020\u0001J)\u0010\b\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000b\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\tJ)\u0010\f\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\tJ)\u0010\r\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\tJ,\u0010\u0013\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/m0;", "", "Landroidx/compose/ui/layout/q;", "", "Landroidx/compose/ui/layout/p;", "measurables", "", "height", "d", "(Landroidx/compose/ui/layout/q;Ljava/util/List;I)I", "width", "c", "b", "e", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "measure", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;Landroidx/compose/ui/unit/b;)Landroidx/compose/ui/layout/n0;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x4
@kotlin.jvm.internal.r1({"SMAP\nMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasurePolicy.kt\nandroidx/compose/ui/layout/MeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,163:1\n151#2,3:164\n33#2,4:167\n154#2,2:171\n38#2:173\n156#2:174\n151#2,3:175\n33#2,4:178\n154#2,2:182\n38#2:184\n156#2:185\n151#2,3:186\n33#2,4:189\n154#2,2:193\n38#2:195\n156#2:196\n151#2,3:197\n33#2,4:200\n154#2,2:204\n38#2:206\n156#2:207\n*S KotlinDebug\n*F\n+ 1 MeasurePolicy.kt\nandroidx/compose/ui/layout/MeasurePolicy\n*L\n102#1:164,3\n102#1:167,4\n102#1:171,2\n102#1:173\n102#1:174\n120#1:175,3\n120#1:178,4\n120#1:182,2\n120#1:184\n120#1:185\n137#1:186,3\n137#1:189,4\n137#1:193,2\n137#1:195\n137#1:196\n154#1:197,3\n154#1:200,4\n154#1:204,2\n154#1:206\n154#1:207\n*E\n"})
/* loaded from: classes.dex */
public interface m0 {

    /* compiled from: MeasurePolicy.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @Deprecated
        public static int a(@fg.l m0 m0Var, @fg.l q qVar, @fg.l List<? extends p> list, int i4) {
            return m0.super.e(qVar, list, i4);
        }

        @Deprecated
        public static int b(@fg.l m0 m0Var, @fg.l q qVar, @fg.l List<? extends p> list, int i4) {
            return m0.super.b(qVar, list, i4);
        }

        @Deprecated
        public static int c(@fg.l m0 m0Var, @fg.l q qVar, @fg.l List<? extends p> list, int i4) {
            return m0.super.c(qVar, list, i4);
        }

        @Deprecated
        public static int d(@fg.l m0 m0Var, @fg.l q qVar, @fg.l List<? extends p> list, int i4) {
            return m0.super.d(qVar, list, i4);
        }
    }

    @fg.l
    n0 a(@fg.l o0 o0Var, @fg.l List<? extends l0> list, long j4);

    default int b(@fg.l q qVar, @fg.l List<? extends p> list, int i4) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(new h(list.get(i5), r.Max, s.Width));
        }
        return a(new t(qVar, qVar.getLayoutDirection()), arrayList, androidx.compose.ui.unit.c.b(0, 0, 0, i4, 7, null)).getF19104a();
    }

    default int c(@fg.l q qVar, @fg.l List<? extends p> list, int i4) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(new h(list.get(i5), r.Min, s.Height));
        }
        return a(new t(qVar, qVar.getLayoutDirection()), arrayList, androidx.compose.ui.unit.c.b(0, i4, 0, 0, 13, null)).getF19105b();
    }

    default int d(@fg.l q qVar, @fg.l List<? extends p> list, int i4) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(new h(list.get(i5), r.Min, s.Width));
        }
        return a(new t(qVar, qVar.getLayoutDirection()), arrayList, androidx.compose.ui.unit.c.b(0, 0, 0, i4, 7, null)).getF19104a();
    }

    default int e(@fg.l q qVar, @fg.l List<? extends p> list, int i4) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(new h(list.get(i5), r.Max, s.Height));
        }
        return a(new t(qVar, qVar.getLayoutDirection()), arrayList, androidx.compose.ui.unit.c.b(0, i4, 0, 0, 13, null)).getF19105b();
    }
}
