package androidx.compose.ui.layout;

import androidx.compose.runtime.x4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MultiContentMeasurePolicy.kt */
@x4
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\bç\u0080\u0001\u0018\u00002\u00020\u0001J2\u0010\t\u001a\u00020\b*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00032\u0006\u0010\u0007\u001a\u00020\u0006H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000f\u001a\u00020\r*\u00020\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0012\u001a\u00020\r*\u00020\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J/\u0010\u0013\u001a\u00020\r*\u00020\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J/\u0010\u0014\u001a\u00020\r*\u00020\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0010ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/s0;", "", "Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;", "Landroidx/compose/ui/layout/q;", "Landroidx/compose/ui/layout/p;", "", "height", "d", "(Landroidx/compose/ui/layout/q;Ljava/util/List;I)I", "width", "c", "b", "e", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nMultiContentMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiContentMeasurePolicy.kt\nandroidx/compose/ui/layout/MultiContentMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,229:1\n151#2,3:230\n33#2,4:233\n154#2:237\n151#2,3:238\n33#2,4:241\n154#2,2:245\n38#2:247\n156#2:248\n155#2:249\n38#2:250\n156#2:251\n151#2,3:252\n33#2,4:255\n154#2:259\n151#2,3:260\n33#2,4:263\n154#2,2:267\n38#2:269\n156#2:270\n155#2:271\n38#2:272\n156#2:273\n151#2,3:274\n33#2,4:277\n154#2:281\n151#2,3:282\n33#2,4:285\n154#2,2:289\n38#2:291\n156#2:292\n155#2:293\n38#2:294\n156#2:295\n151#2,3:296\n33#2,4:299\n154#2:303\n151#2,3:304\n33#2,4:307\n154#2,2:311\n38#2:313\n156#2:314\n155#2:315\n38#2:316\n156#2:317\n*S KotlinDebug\n*F\n+ 1 MultiContentMeasurePolicy.kt\nandroidx/compose/ui/layout/MultiContentMeasurePolicy\n*L\n112#1:230,3\n112#1:233,4\n112#1:237\n113#1:238,3\n113#1:241,4\n113#1:245,2\n113#1:247\n113#1:248\n112#1:249\n112#1:250\n112#1:251\n137#1:252,3\n137#1:255,4\n137#1:259\n138#1:260,3\n138#1:263,4\n138#1:267,2\n138#1:269\n138#1:270\n137#1:271\n137#1:272\n137#1:273\n161#1:274,3\n161#1:277,4\n161#1:281\n162#1:282,3\n162#1:285,4\n162#1:289,2\n162#1:291\n162#1:292\n161#1:293\n161#1:294\n161#1:295\n185#1:296,3\n185#1:299,4\n185#1:303\n186#1:304,3\n186#1:307,4\n186#1:311,2\n186#1:313\n186#1:314\n185#1:315\n185#1:316\n185#1:317\n*E\n"})
/* loaded from: classes.dex */
public interface s0 {
    @fg.l
    n0 a(@fg.l o0 o0Var, @fg.l List<? extends List<? extends l0>> list, long j4);

    default int b(@fg.l q qVar, @fg.l List<? extends List<? extends p>> list, int i4) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            List<? extends p> list2 = list.get(i5);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                arrayList2.add(new h(list2.get(i6), r.Max, s.Width));
            }
            arrayList.add(arrayList2);
        }
        return a(new t(qVar, qVar.getLayoutDirection()), arrayList, androidx.compose.ui.unit.c.b(0, 0, 0, i4, 7, null)).getF19104a();
    }

    default int c(@fg.l q qVar, @fg.l List<? extends List<? extends p>> list, int i4) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            List<? extends p> list2 = list.get(i5);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                arrayList2.add(new h(list2.get(i6), r.Min, s.Height));
            }
            arrayList.add(arrayList2);
        }
        return a(new t(qVar, qVar.getLayoutDirection()), arrayList, androidx.compose.ui.unit.c.b(0, i4, 0, 0, 13, null)).getF19105b();
    }

    default int d(@fg.l q qVar, @fg.l List<? extends List<? extends p>> list, int i4) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            List<? extends p> list2 = list.get(i5);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                arrayList2.add(new h(list2.get(i6), r.Min, s.Width));
            }
            arrayList.add(arrayList2);
        }
        return a(new t(qVar, qVar.getLayoutDirection()), arrayList, androidx.compose.ui.unit.c.b(0, 0, 0, i4, 7, null)).getF19104a();
    }

    default int e(@fg.l q qVar, @fg.l List<? extends List<? extends p>> list, int i4) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            List<? extends p> list2 = list.get(i5);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                arrayList2.add(new h(list2.get(i6), r.Max, s.Height));
            }
            arrayList.add(arrayList2);
        }
        return a(new t(qVar, qVar.getLayoutDirection()), arrayList, androidx.compose.ui.unit.c.b(0, i4, 0, 0, 13, null)).getF19105b();
    }
}
