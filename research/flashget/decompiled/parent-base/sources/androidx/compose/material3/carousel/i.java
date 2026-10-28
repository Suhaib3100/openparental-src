package androidx.compose.material3.carousel;

import androidx.annotation.m1;
import fg.l;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: Strategy.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a7\u0010\u0011\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/material3/carousel/c;", "start", "end", "", "fraction", "c", "(Landroidx/compose/material3/carousel/c;Landroidx/compose/material3/carousel/c;F)Landroidx/compose/material3/carousel/c;", "Landroidx/compose/material3/carousel/e;", "from", "to", "d", "(Landroidx/compose/material3/carousel/e;Landroidx/compose/material3/carousel/e;F)Landroidx/compose/material3/carousel/e;", "outputMin", "outputMax", "inputMin", "inputMax", "value", "b", "(FFFFF)F", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strategy.kt\nandroidx/compose/material3/carousel/StrategyKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,509:1\n277#2,3:510\n69#2,4:513\n280#2,2:517\n74#2:519\n282#2:520\n*S KotlinDebug\n*F\n+ 1 Strategy.kt\nandroidx/compose/material3/carousel/StrategyKt\n*L\n488#1:510,3\n488#1:513,4\n488#1:517,2\n488#1:519\n488#1:520\n*E\n"})
/* loaded from: classes.dex */
public final class i {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(float f4, float f5, float f6, float f7, float f10) {
        return f10 <= f6 ? f4 : f10 >= f7 ? f5 : androidx.compose.ui.util.d.a(f4, f5, (f10 - f6) / (f7 - f6));
    }

    @l
    @m1
    public static final c c(@l c cVar, @l c cVar2, float f4) {
        return new c(androidx.compose.ui.util.d.a(cVar.l(), cVar2.l(), f4), androidx.compose.ui.util.d.a(cVar.k(), cVar2.k(), f4), androidx.compose.ui.util.d.a(cVar.m(), cVar2.m(), f4), f4 < 0.5f ? cVar.o() : cVar2.o(), f4 < 0.5f ? cVar.n() : cVar2.n(), f4 < 0.5f ? cVar.p() : cVar2.p(), androidx.compose.ui.util.d.a(cVar.j(), cVar2.j(), f4));
    }

    @l
    @m1
    public static final e d(@l e eVar, @l e eVar2, float f4) {
        ArrayList arrayList = new ArrayList(eVar.size());
        int size = eVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(c(eVar.get(i4), eVar2.get(i4), f4));
        }
        return new e(arrayList);
    }
}
