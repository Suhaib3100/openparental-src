package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.i;
import androidx.compose.foundation.z0;
import androidx.compose.ui.layout.i1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.r0;

/* compiled from: LazyGridMeasure.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0003\u001aõ\u0001\u0010+\u001a\u00020*2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00000\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2/\u0010)\u001a+\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$¢\u0006\u0002\b'\u0012\u0004\u0012\u00020(0#H\u0000ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001aT\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00000\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000e0$2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00100$H\u0083\b¢\u0006\u0004\b0\u00101\u001a\u0093\u0001\u0010<\u001a\b\u0012\u0004\u0012\u00020/0;2\f\u00103\u001a\b\u0012\u0004\u0012\u0002020\u001d2\f\u00104\u001a\b\u0012\u0004\u0012\u00020/0\u001d2\f\u00105\u001a\b\u0012\u0004\u0012\u00020/0\u001d2\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b<\u0010=\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006>"}, d2 = {"", "itemsCount", "Landroidx/compose/foundation/lazy/grid/b0;", "measuredLineProvider", "Landroidx/compose/foundation/lazy/grid/z;", "measuredItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenLines", "firstVisibleLineIndex", "firstVisibleLineScrollOffset", "", "scrollToBeConsumed", "Landroidx/compose/ui/unit/b;", "constraints", "", "isVertical", "Landroidx/compose/foundation/layout/i$m;", "verticalArrangement", "Landroidx/compose/foundation/layout/i$e;", "horizontalArrangement", "reverseLayout", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/foundation/lazy/grid/l;", "placementAnimator", "Landroidx/compose/foundation/lazy/grid/j0;", "spanLayoutProvider", "", "pinnedItems", "Lkotlinx/coroutines/r0;", "coroutineScope", "Landroidx/compose/foundation/lazy/layout/n0;", "placementScopeInvalidator", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "Lkotlin/u;", "Landroidx/compose/ui/layout/n0;", "layout", "Landroidx/compose/foundation/lazy/grid/w;", "d", "(ILandroidx/compose/foundation/lazy/grid/b0;Landroidx/compose/foundation/lazy/grid/z;IIIIIIFJZLandroidx/compose/foundation/layout/i$m;Landroidx/compose/foundation/layout/i$e;ZLandroidx/compose/ui/unit/d;Landroidx/compose/foundation/lazy/grid/l;Landroidx/compose/foundation/lazy/grid/j0;Ljava/util/List;Lkotlinx/coroutines/r0;Landroidx/compose/runtime/k2;Lld/q;)Landroidx/compose/foundation/lazy/grid/w;", "itemConstraints", "filter", "Landroidx/compose/foundation/lazy/grid/x;", "a", "(Ljava/util/List;Landroidx/compose/foundation/lazy/grid/z;Lld/l;Lld/l;)Ljava/util/List;", "Landroidx/compose/foundation/lazy/grid/a0;", "lines", "itemsBefore", "itemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "firstLineScrollOffset", "", "b", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/i$m;Landroidx/compose/foundation/layout/i$e;ZLandroidx/compose/ui/unit/d;)Ljava/util/List;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,440:1\n334#1,3:442\n337#1,12:449\n350#1:462\n334#1,3:463\n337#1,12:470\n350#1:483\n1#2:441\n33#3,4:445\n38#3:461\n33#3,4:466\n38#3:482\n235#3,3:484\n33#3,4:487\n238#3,2:491\n38#3:493\n240#3:494\n33#3,6:495\n132#3,3:501\n33#3,4:504\n135#3,2:508\n38#3:510\n137#3:511\n51#3,6:512\n33#3,6:518\n33#3,6:524\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n*L\n230#1:442,3\n230#1:449,12\n230#1:462\n237#1:463,3\n237#1:470,12\n237#1:483\n230#1:445,4\n230#1:461\n237#1:466,4\n237#1:482\n313#1:484,3\n313#1:487,4\n313#1:491,2\n313#1:493\n313#1:494\n336#1:495,6\n377#1:501,3\n377#1:504,4\n377#1:508,2\n377#1:510\n377#1:511\n420#1:512,6\n427#1:518,6\n432#1:524,6\n*E\n"})
/* loaded from: classes.dex */
public final class v {

    /* compiled from: LazyGridMeasure.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.l<i1.a, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f5837b = new a(1);

        a() {
            super(1);
        }

        public final void a(@fg.l i1.a aVar) {
        }

        @Override // ld.l
        public k2 invoke(i1.a aVar) {
            return k2.f75408a;
        }
    }

    /* compiled from: LazyGridMeasure.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt$measureLazyGrid$5\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,440:1\n33#2,6:441\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt$measureLazyGrid$5\n*L\n304#1:441,6\n*E\n"})
    static final class b extends n0 implements ld.l<i1.a, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<x> f5838b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<k2> f5839c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<x> list, androidx.compose.runtime.k2<k2> k2Var) {
            super(1);
            this.f5838b = list;
            this.f5839c = k2Var;
        }

        public final void a(@fg.l i1.a aVar) {
            List<x> list = this.f5838b;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                list.get(i4).q(aVar);
            }
            this.f5839c.getValue();
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(i1.a aVar) {
            a(aVar);
            return k2.f75408a;
        }
    }

    @z0
    private static final List<x> a(List<Integer> list, z zVar, ld.l<? super Integer, androidx.compose.ui.unit.b> lVar, ld.l<? super Integer, Boolean> lVar2) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < size; i4++) {
            int intValue = list.get(i4).intValue();
            if (lVar2.invoke(Integer.valueOf(intValue)).booleanValue()) {
                x c5 = z.c(zVar, intValue, 0, lVar.invoke(Integer.valueOf(intValue)).getValue(), 2, null);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c5);
            }
        }
        return arrayList == null ? kotlin.collections.j0.f74919b : arrayList;
    }

    private static final List<x> b(List<a0> list, List<x> list2, List<x> list3, int i4, int i5, int i6, int i7, int i10, boolean z4, i.m mVar, i.e eVar, boolean z5, androidx.compose.ui.unit.d dVar) {
        int i11 = z4 ? i5 : i4;
        boolean z6 = i6 < Math.min(i11, i7);
        if (z6 && i10 != 0) {
            throw new IllegalStateException("non-zero firstLineScrollOffset");
        }
        int size = list.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            i12 += list.get(i13).getItems().length;
        }
        ArrayList arrayList = new ArrayList(i12);
        if (!z6) {
            int size2 = list2.size() - 1;
            if (size2 >= 0) {
                int i14 = i10;
                while (true) {
                    int i15 = size2 - 1;
                    x xVar = list2.get(size2);
                    int mainAxisSizeWithSpacings = i14 - xVar.getMainAxisSizeWithSpacings();
                    xVar.r(mainAxisSizeWithSpacings, 0, i4, i5, (r16 & 16) != 0 ? -1 : 0, (r16 & 32) != 0 ? -1 : 0);
                    arrayList.add(xVar);
                    if (i15 < 0) {
                        break;
                    }
                    size2 = i15;
                    i14 = mainAxisSizeWithSpacings;
                }
            }
            int size3 = list.size();
            int i16 = i10;
            for (int i17 = 0; i17 < size3; i17++) {
                a0 a0Var = list.get(i17);
                kotlin.collections.w.s0(arrayList, a0Var.f(i16, i4, i5));
                i16 += a0Var.getMainAxisSizeWithSpacings();
            }
            int i18 = i16;
            int i19 = 0;
            for (int size4 = list3.size(); i19 < size4; size4 = size4) {
                x xVar2 = list3.get(i19);
                xVar2.r(i18, 0, i4, i5, (r16 & 16) != 0 ? -1 : 0, (r16 & 32) != 0 ? -1 : 0);
                arrayList.add(xVar2);
                i18 += xVar2.getMainAxisSizeWithSpacings();
                i19++;
            }
        } else {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("no items");
            }
            int size5 = list.size();
            int[] iArr = new int[size5];
            for (int i20 = 0; i20 < size5; i20++) {
                iArr[i20] = list.get(c(i20, z5, size5)).getMainAxisSize();
            }
            int[] iArr2 = new int[size5];
            for (int i21 = 0; i21 < size5; i21++) {
                iArr2[i21] = 0;
            }
            if (z4) {
                if (mVar == null) {
                    throw new IllegalArgumentException("null verticalArrangement");
                }
                mVar.d(dVar, i11, iArr, iArr2);
            } else {
                if (eVar == null) {
                    throw new IllegalArgumentException("null horizontalArrangement");
                }
                eVar.e(dVar, i11, iArr, androidx.compose.ui.unit.w.Ltr, iArr2);
            }
            kotlin.ranges.j le2 = kotlin.collections.l.le(iArr2);
            if (z5) {
                le2 = kotlin.ranges.s.q1(le2);
            }
            int first = le2.getFirst();
            int last = le2.getLast();
            int step = le2.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int i22 = iArr2[first];
                    a0 a0Var2 = list.get(c(first, z5, size5));
                    if (z5) {
                        i22 = (i11 - i22) - a0Var2.getMainAxisSize();
                    }
                    kotlin.collections.w.s0(arrayList, a0Var2.f(i22, i4, i5));
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        }
        return arrayList;
    }

    private static final int c(int i4, boolean z4, int i5) {
        return !z4 ? i4 : (i5 - i4) - 1;
    }

    @fg.l
    public static final w d(int i4, @fg.l b0 b0Var, @fg.l z zVar, int i5, int i6, int i7, int i10, int i11, int i12, float f4, long j4, boolean z4, @fg.m i.m mVar, @fg.m i.e eVar, boolean z5, @fg.l androidx.compose.ui.unit.d dVar, @fg.l l lVar, @fg.l j0 j0Var, @fg.l List<Integer> list, @fg.l r0 r0Var, @fg.l androidx.compose.runtime.k2<k2> k2Var, @fg.l ld.q<? super Integer, ? super Integer, ? super ld.l<? super i1.a, k2>, ? extends androidx.compose.ui.layout.n0> qVar) {
        boolean z6;
        boolean z7;
        int i13;
        int i14;
        int i15;
        int i16;
        a0 a0Var;
        a0 a0Var2;
        int i17;
        int i18;
        x[] items;
        x xVar;
        int i19;
        int i20;
        boolean z10;
        int i21;
        List<Integer> list2 = list;
        if (i6 < 0) {
            throw new IllegalArgumentException("negative beforeContentPadding");
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("negative afterContentPadding");
        }
        if (i4 <= 0) {
            return new w(null, 0, false, 0.0f, qVar.R(Integer.valueOf(androidx.compose.ui.unit.b.r(j4)), Integer.valueOf(androidx.compose.ui.unit.b.q(j4)), a.f5837b), false, kotlin.collections.j0.f74919b, -i6, i5 + i7, 0, z5, z4 ? androidx.compose.foundation.gestures.j0.Vertical : androidx.compose.foundation.gestures.j0.Horizontal, i7, i10);
        }
        int L0 = kotlin.math.b.L0(f4);
        int i22 = i12 - L0;
        if (i11 == 0 && i22 < 0) {
            L0 += i22;
            i22 = 0;
        }
        kotlin.collections.k kVar = new kotlin.collections.k();
        int i23 = -i6;
        int i24 = (i10 < 0 ? i10 : 0) + i23;
        int i25 = i22 + i24;
        int i26 = i11;
        while (i25 < 0 && i26 > 0) {
            i26--;
            a0 c5 = b0Var.c(i26);
            kVar.add(0, c5);
            i25 += c5.getMainAxisSizeWithSpacings();
        }
        if (i25 < i24) {
            L0 += i25;
            i25 = i24;
        }
        int i27 = i25 - i24;
        int i28 = i5 + i7;
        int i29 = i28 < 0 ? 0 : i28;
        int i30 = -i27;
        int i31 = i26;
        int i32 = i31;
        int i33 = i27;
        int i34 = 0;
        boolean z11 = false;
        while (true) {
            z6 = true;
            if (i34 >= kVar.getSize()) {
                break;
            }
            if (i30 >= i29) {
                kVar.c(i34);
                z11 = true;
            } else {
                i32++;
                i30 += ((a0) kVar.get(i34)).getMainAxisSizeWithSpacings();
                i34++;
            }
        }
        int i35 = i30;
        int i36 = i32;
        boolean z12 = z11;
        while (i36 < i4 && (i35 < i29 || i35 <= 0 || kVar.isEmpty())) {
            int i37 = i29;
            a0 c6 = b0Var.c(i36);
            if (c6.e()) {
                break;
            }
            int mainAxisSizeWithSpacings = c6.getMainAxisSizeWithSpacings() + i35;
            if (mainAxisSizeWithSpacings <= i24) {
                i19 = i24;
                i20 = mainAxisSizeWithSpacings;
                if (((x) kotlin.collections.l.Ah(c6.getItems())).getIndex() != i4 - 1) {
                    i21 = i36 + 1;
                    i33 -= c6.getMainAxisSizeWithSpacings();
                    z10 = true;
                    i36++;
                    i31 = i21;
                    z12 = z10;
                    i29 = i37;
                    i35 = i20;
                    i24 = i19;
                }
            } else {
                i19 = i24;
                i20 = mainAxisSizeWithSpacings;
            }
            kVar.addLast(c6);
            z10 = z12;
            i21 = i31;
            i36++;
            i31 = i21;
            z12 = z10;
            i29 = i37;
            i35 = i20;
            i24 = i19;
        }
        if (i35 < i5) {
            int i38 = i5 - i35;
            int i39 = i35 + i38;
            int i40 = i31;
            i16 = i33 - i38;
            while (i16 < i6 && i40 > 0) {
                i40--;
                int i41 = i23;
                a0 c7 = b0Var.c(i40);
                kVar.add(0, c7);
                i16 += c7.getMainAxisSizeWithSpacings();
                z12 = z12;
                i23 = i41;
            }
            z7 = z12;
            i13 = i23;
            i14 = 0;
            L0 += i38;
            if (i16 < 0) {
                L0 += i16;
                i39 += i16;
                i16 = 0;
            }
            i15 = i39;
        } else {
            z7 = z12;
            i13 = i23;
            i14 = 0;
            i15 = i35;
            i16 = i33;
        }
        float f5 = (kotlin.math.b.U(kotlin.math.b.L0(f4)) != kotlin.math.b.U(L0) || Math.abs(kotlin.math.b.L0(f4)) < Math.abs(L0)) ? f4 : L0;
        if (i16 < 0) {
            throw new IllegalArgumentException("negative initial offset");
        }
        int i42 = -i16;
        a0 a0Var3 = (a0) kVar.first();
        x xVar2 = (x) kotlin.collections.l.nc(a0Var3.getItems());
        int index = xVar2 != null ? xVar2.getIndex() : i14;
        a0 a0Var4 = (a0) kVar.v();
        if (a0Var4 == null || (items = a0Var4.getItems()) == null || (xVar = (x) kotlin.collections.l.di(items)) == null) {
            a0Var = a0Var3;
        } else {
            a0Var = a0Var3;
            i14 = xVar.getIndex();
        }
        int size = list.size();
        List list3 = null;
        int i43 = i16;
        List list4 = null;
        int i44 = 0;
        while (i44 < size) {
            int i45 = size;
            int intValue = list2.get(i44).intValue();
            if (intValue < 0 || intValue >= index) {
                i18 = index;
            } else {
                x c10 = z.c(zVar, intValue, 0, b0Var.e(intValue), 2, null);
                if (list4 == null) {
                    list4 = new ArrayList();
                }
                i18 = index;
                List list5 = list4;
                list5.add(c10);
                list4 = list5;
            }
            i44++;
            index = i18;
            size = i45;
        }
        int i46 = index;
        if (list4 == null) {
            list4 = kotlin.collections.j0.f74919b;
        }
        List list6 = list4;
        int size2 = list.size();
        int i47 = 0;
        while (i47 < size2) {
            int intValue2 = list2.get(i47).intValue();
            if (i14 + 1 <= intValue2 && intValue2 < i4) {
                x c11 = z.c(zVar, intValue2, 0, b0Var.e(intValue2), 2, null);
                if (list3 == null) {
                    list3 = new ArrayList();
                }
                List list7 = list3;
                list7.add(c11);
                list3 = list7;
            }
            i47++;
            list2 = list;
        }
        if (list3 == null) {
            list3 = kotlin.collections.j0.f74919b;
        }
        List list8 = list3;
        if (i6 > 0 || i10 < 0) {
            int size3 = kVar.getSize();
            a0 a0Var5 = a0Var;
            int i48 = i43;
            int i49 = 0;
            while (i49 < size3) {
                int mainAxisSizeWithSpacings2 = ((a0) kVar.get(i49)).getMainAxisSizeWithSpacings();
                if (i48 == 0 || mainAxisSizeWithSpacings2 > i48) {
                    break;
                }
                int i50 = size3;
                if (i49 == kotlin.collections.w.J(kVar)) {
                    break;
                }
                i48 -= mainAxisSizeWithSpacings2;
                i49++;
                a0Var5 = (a0) kVar.get(i49);
                size3 = i50;
            }
            a0Var2 = a0Var5;
            i17 = i48;
        } else {
            a0Var2 = a0Var;
            i17 = i43;
        }
        int p4 = z4 ? androidx.compose.ui.unit.b.p(j4) : androidx.compose.ui.unit.c.g(j4, i15);
        int f6 = z4 ? androidx.compose.ui.unit.c.f(j4, i15) : androidx.compose.ui.unit.b.o(j4);
        int i51 = i13;
        List<x> b5 = b(kVar, list6, list8, p4, f6, i15, i5, i42, z4, mVar, eVar, z5, dVar);
        lVar.f((int) f5, p4, f6, b5, zVar, j0Var, z4, r0Var);
        if (i14 == i4 - 1 && i15 <= i5) {
            z6 = false;
        }
        List<x> list9 = b5;
        androidx.compose.ui.layout.n0 R = qVar.R(Integer.valueOf(p4), Integer.valueOf(f6), new b(list9, k2Var));
        if (!list6.isEmpty() || !list8.isEmpty()) {
            ArrayList arrayList = new ArrayList(list9.size());
            int size4 = list9.size();
            for (int i52 = 0; i52 < size4; i52++) {
                x xVar3 = list9.get(i52);
                int index2 = xVar3.getIndex();
                if (i46 <= index2 && index2 <= i14) {
                    arrayList.add(xVar3);
                }
            }
            list9 = arrayList;
        }
        return new w(a0Var2, i17, z6, f5, R, z7, list9, i51, i28, i4, z5, z4 ? androidx.compose.foundation.gestures.j0.Vertical : androidx.compose.foundation.gestures.j0.Horizontal, i7, i10);
    }
}
