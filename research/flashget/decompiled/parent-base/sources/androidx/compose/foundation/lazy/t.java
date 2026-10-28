package androidx.compose.foundation.lazy;

import androidx.compose.foundation.layout.i;
import androidx.compose.ui.layout.i1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.r0;

/* compiled from: LazyListMeasure.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a\u0095\u0002\u0010-\u001a\u00020,2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2/\u0010+\u001a+\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&¢\u0006\u0002\b)\u0012\u0004\u0012\u00020*0%H\u0000ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001ac\u00104\u001a\b\u0012\u0004\u0012\u0002000\u00102\f\u00101\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\u0006\u00102\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u000e2\b\u00103\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b4\u00105\u001a;\u00107\u001a\b\u0012\u0004\u0012\u0002000\u00102\u0006\u00106\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010H\u0002¢\u0006\u0004\b7\u00108\u001a\u0093\u0001\u0010A\u001a\b\u0012\u0004\u0012\u0002000/2\f\u00109\u001a\b\u0012\u0004\u0012\u0002000\u00102\f\u0010:\u001a\b\u0012\u0004\u0012\u0002000\u00102\f\u0010;\u001a\b\u0012\u0004\u0012\u0002000\u00102\u0006\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\bA\u0010B\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006C"}, d2 = {"", "itemsCount", "Landroidx/compose/foundation/lazy/x;", "measuredItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenItems", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "", "scrollToBeConsumed", "Landroidx/compose/ui/unit/b;", "constraints", "", "isVertical", "", "headerIndexes", "Landroidx/compose/foundation/layout/i$m;", "verticalArrangement", "Landroidx/compose/foundation/layout/i$e;", "horizontalArrangement", "reverseLayout", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/foundation/lazy/l;", "itemAnimator", "beyondBoundsItemCount", "pinnedItems", "hasLookaheadPassOccurred", "isLookingAhead", "Landroidx/compose/foundation/lazy/s;", "postLookaheadLayoutInfo", "Lkotlinx/coroutines/r0;", "coroutineScope", "Landroidx/compose/foundation/lazy/layout/n0;", "placementScopeInvalidator", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "Lkotlin/u;", "Landroidx/compose/ui/layout/n0;", "layout", "Landroidx/compose/foundation/lazy/u;", "e", "(ILandroidx/compose/foundation/lazy/x;IIIIIIFJZLjava/util/List;Landroidx/compose/foundation/layout/i$m;Landroidx/compose/foundation/layout/i$e;ZLandroidx/compose/ui/unit/d;Landroidx/compose/foundation/lazy/l;ILjava/util/List;ZZLandroidx/compose/foundation/lazy/s;Lkotlinx/coroutines/r0;Landroidx/compose/runtime/k2;Lld/q;)Landroidx/compose/foundation/lazy/u;", "", "Landroidx/compose/foundation/lazy/v;", "visibleItems", "consumedScroll", "lastPostLookaheadLayoutInfo", "c", "(Ljava/util/List;Landroidx/compose/foundation/lazy/x;IILjava/util/List;FZLandroidx/compose/foundation/lazy/s;)Ljava/util/List;", "currentFirstItemIndex", "d", "(ILandroidx/compose/foundation/lazy/x;ILjava/util/List;)Ljava/util/List;", "items", "extraItemsBefore", "extraItemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "itemsScrollOffset", "a", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/i$m;Landroidx/compose/foundation/layout/i$e;ZLandroidx/compose/ui/unit/d;)Ljava/util/List;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyListMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,606:1\n1#2:607\n33#3,6:608\n33#3,6:614\n235#3,3:620\n33#3,4:623\n238#3,2:627\n38#3:629\n240#3:630\n116#3,2:631\n33#3,6:633\n118#3:639\n116#3,2:640\n33#3,6:642\n118#3:648\n116#3,2:649\n33#3,6:651\n118#3:657\n33#3,6:658\n51#3,6:664\n33#3,6:670\n33#3,6:676\n33#3,6:682\n*S KotlinDebug\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n*L\n288#1:608,6\n305#1:614,6\n376#1:620,3\n376#1:623,4\n376#1:627,2\n376#1:629\n376#1:630\n434#1:631,2\n434#1:633,6\n434#1:639\n451#1:640,2\n451#1:642,6\n451#1:648\n453#1:649,2\n453#1:651,6\n453#1:657\n474#1:658,6\n501#1:664,6\n585#1:670,6\n592#1:676,6\n598#1:682,6\n*E\n"})
/* loaded from: classes.dex */
public final class t {

    /* compiled from: LazyListMeasure.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.l<i1.a, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f6526b = new a(1);

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

    /* compiled from: LazyListMeasure.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyListMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt$measureLazyList$7\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,606:1\n33#2,6:607\n*S KotlinDebug\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt$measureLazyList$7\n*L\n365#1:607,6\n*E\n"})
    static final class b extends n0 implements ld.l<i1.a, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<v> f6527b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ v f6528c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f6529d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<k2> f6530e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<v> list, v vVar, boolean z4, androidx.compose.runtime.k2<k2> k2Var) {
            super(1);
            this.f6527b = list;
            this.f6528c = vVar;
            this.f6529d = z4;
            this.f6530e = k2Var;
        }

        public final void a(@fg.l i1.a aVar) {
            List<v> list = this.f6527b;
            v vVar = this.f6528c;
            boolean z4 = this.f6529d;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                v vVar2 = list.get(i4);
                if (vVar2 != vVar) {
                    vVar2.l(aVar, z4);
                }
            }
            v vVar3 = this.f6528c;
            if (vVar3 != null) {
                vVar3.l(aVar, this.f6529d);
            }
            this.f6530e.getValue();
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(i1.a aVar) {
            a(aVar);
            return k2.f75408a;
        }
    }

    private static final List<v> a(List<v> list, List<v> list2, List<v> list3, int i4, int i5, int i6, int i7, int i10, boolean z4, i.m mVar, i.e eVar, boolean z5, androidx.compose.ui.unit.d dVar) {
        int i11 = z4 ? i5 : i4;
        boolean z6 = i6 < Math.min(i11, i7);
        if (z6 && i10 != 0) {
            throw new IllegalStateException("non-zero itemsScrollOffset");
        }
        ArrayList arrayList = new ArrayList(list3.size() + list2.size() + list.size());
        if (!z6) {
            int size = list2.size();
            int i12 = i10;
            for (int i13 = 0; i13 < size; i13++) {
                v vVar = list2.get(i13);
                i12 -= vVar.getSizeWithSpacings();
                vVar.m(i12, i4, i5);
                arrayList.add(vVar);
            }
            int size2 = list.size();
            int i14 = i10;
            for (int i15 = 0; i15 < size2; i15++) {
                v vVar2 = list.get(i15);
                vVar2.m(i14, i4, i5);
                arrayList.add(vVar2);
                i14 += vVar2.getSizeWithSpacings();
            }
            int size3 = list3.size();
            for (int i16 = 0; i16 < size3; i16++) {
                v vVar3 = list3.get(i16);
                vVar3.m(i14, i4, i5);
                arrayList.add(vVar3);
                i14 += vVar3.getSizeWithSpacings();
            }
        } else {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("no extra items");
            }
            int size4 = list.size();
            int[] iArr = new int[size4];
            for (int i17 = 0; i17 < size4; i17++) {
                iArr[i17] = list.get(b(i17, z5, size4)).getSize();
            }
            int[] iArr2 = new int[size4];
            for (int i18 = 0; i18 < size4; i18++) {
                iArr2[i18] = 0;
            }
            if (z4) {
                if (mVar == null) {
                    throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
                }
                mVar.d(dVar, i11, iArr, iArr2);
            } else {
                if (eVar == null) {
                    throw new IllegalArgumentException("null horizontalArrangement when isVertical == false");
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
                    int i19 = iArr2[first];
                    v vVar4 = list.get(b(first, z5, size4));
                    if (z5) {
                        i19 = (i11 - i19) - vVar4.getSize();
                    }
                    vVar4.m(i19, i4, i5);
                    arrayList.add(vVar4);
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        }
        return arrayList;
    }

    private static final int b(int i4, boolean z4, int i5) {
        return !z4 ? i4 : (i5 - i4) - 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        r7 = r7.get(r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.util.List<androidx.compose.foundation.lazy.v> c(java.util.List<androidx.compose.foundation.lazy.v> r14, androidx.compose.foundation.lazy.x r15, int r16, int r17, java.util.List<java.lang.Integer> r18, float r19, boolean r20, androidx.compose.foundation.lazy.s r21) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.t.c(java.util.List, androidx.compose.foundation.lazy.x, int, int, java.util.List, float, boolean, androidx.compose.foundation.lazy.s):java.util.List");
    }

    private static final List<v> d(int i4, x xVar, int i5, List<Integer> list) {
        int max = Math.max(0, i4 - i5);
        int i6 = i4 - 1;
        ArrayList arrayList = null;
        if (max <= i6) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(xVar.b(i6));
                if (i6 == max) {
                    break;
                }
                i6--;
            }
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i7 = size - 1;
                int intValue = list.get(size).intValue();
                if (intValue < max) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(xVar.b(intValue));
                }
                if (i7 < 0) {
                    break;
                }
                size = i7;
            }
        }
        return arrayList == null ? j0.f74919b : arrayList;
    }

    @fg.l
    public static final u e(int i4, @fg.l x xVar, int i5, int i6, int i7, int i10, int i11, int i12, float f4, long j4, boolean z4, @fg.l List<Integer> list, @fg.m i.m mVar, @fg.m i.e eVar, boolean z5, @fg.l androidx.compose.ui.unit.d dVar, @fg.l l lVar, int i13, @fg.l List<Integer> list2, boolean z6, boolean z7, @fg.m s sVar, @fg.l r0 r0Var, @fg.l androidx.compose.runtime.k2<k2> k2Var, @fg.l ld.q<? super Integer, ? super Integer, ? super ld.l<? super i1.a, k2>, ? extends androidx.compose.ui.layout.n0> qVar) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        v vVar;
        List<Integer> list3;
        int i21;
        int i22;
        List<v> list4;
        int i23;
        if (i6 < 0) {
            throw new IllegalArgumentException("invalid beforeContentPadding");
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("invalid afterContentPadding");
        }
        if (i4 <= 0) {
            int r4 = androidx.compose.ui.unit.b.r(j4);
            int q4 = androidx.compose.ui.unit.b.q(j4);
            lVar.e(0, r4, q4, new ArrayList(), xVar, z4, z7, z6, r0Var);
            return new u(null, 0, false, 0.0f, qVar.R(Integer.valueOf(r4), Integer.valueOf(q4), a.f6526b), 0.0f, false, j0.f74919b, -i6, i5 + i7, 0, z5, z4 ? androidx.compose.foundation.gestures.j0.Vertical : androidx.compose.foundation.gestures.j0.Horizontal, i7, i10);
        }
        int i24 = 0;
        int i25 = i11;
        if (i25 >= i4) {
            i25 = i4 - 1;
            i14 = 0;
        } else {
            i14 = i12;
        }
        int L0 = kotlin.math.b.L0(f4);
        int i26 = i14 - L0;
        if (i25 == 0 && i26 < 0) {
            L0 += i26;
            i26 = 0;
        }
        kotlin.collections.k kVar = new kotlin.collections.k();
        int i27 = -i6;
        int i28 = (i10 < 0 ? i10 : 0) + i27;
        int i29 = i26 + i28;
        int i30 = 0;
        while (i29 < 0 && i25 > 0) {
            i25--;
            int i31 = i27;
            v b5 = xVar.b(i25);
            kVar.add(i24, b5);
            i30 = Math.max(i30, b5.getCrossAxisSize());
            i29 += b5.getSizeWithSpacings();
            i27 = i31;
            i24 = 0;
        }
        int i32 = i27;
        if (i29 < i28) {
            L0 += i29;
            i29 = i28;
        }
        int i33 = i29 - i28;
        int i34 = i5 + i7;
        int i35 = i34 < 0 ? 0 : i34;
        int i36 = -i33;
        int i37 = i25;
        int i38 = i37;
        int i39 = 0;
        boolean z10 = false;
        while (i39 < kVar.getSize()) {
            if (i36 >= i35) {
                kVar.c(i39);
                z10 = true;
            } else {
                i38++;
                i36 += ((v) kVar.get(i39)).getSizeWithSpacings();
                i39++;
            }
        }
        int i40 = i37;
        int i41 = i33;
        int i42 = i38;
        boolean z11 = z10;
        while (i42 < i4 && (i36 < i35 || i36 <= 0 || kVar.isEmpty())) {
            int i43 = i40;
            v b6 = xVar.b(i42);
            i36 = b6.getSizeWithSpacings() + i36;
            if (i36 <= i28) {
                i23 = i28;
                if (i42 != i4 - 1) {
                    i41 -= b6.getSizeWithSpacings();
                    i40 = i42 + 1;
                    z11 = true;
                    i42++;
                    i28 = i23;
                }
            } else {
                i23 = i28;
            }
            int max = Math.max(i30, b6.getCrossAxisSize());
            kVar.addLast(b6);
            i40 = i43;
            i30 = max;
            i42++;
            i28 = i23;
        }
        int i44 = i40;
        if (i36 < i5) {
            int i45 = i5 - i36;
            int i46 = i36 + i45;
            i16 = i41 - i45;
            i19 = i44;
            while (i16 < i6 && i19 > 0) {
                i19--;
                v b7 = xVar.b(i19);
                kVar.add(0, b7);
                i30 = Math.max(i30, b7.getCrossAxisSize());
                i16 += b7.getSizeWithSpacings();
                i42 = i42;
            }
            i15 = i42;
            i17 = i45 + L0;
            if (i16 < 0) {
                i17 += i16;
                i18 = i46 + i16;
                i16 = 0;
            } else {
                i18 = i46;
            }
        } else {
            i15 = i42;
            i16 = i41;
            i17 = L0;
            i18 = i36;
            i19 = i44;
        }
        float f5 = (kotlin.math.b.U(kotlin.math.b.L0(f4)) != kotlin.math.b.U(i17) || Math.abs(kotlin.math.b.L0(f4)) < Math.abs(i17)) ? f4 : i17;
        float f6 = f4 - f5;
        float f7 = (!z7 || i17 <= L0 || f6 > 0.0f) ? 0.0f : (i17 - L0) + f6;
        if (i16 < 0) {
            throw new IllegalArgumentException("negative currentFirstItemScrollOffset");
        }
        int i47 = -i16;
        v vVar2 = (v) kVar.first();
        if (i6 > 0 || i10 < 0) {
            int size = kVar.getSize();
            v vVar3 = vVar2;
            int i48 = 0;
            while (i48 < size) {
                int i49 = size;
                int sizeWithSpacings = ((v) kVar.get(i48)).getSizeWithSpacings();
                if (i16 == 0 || sizeWithSpacings > i16) {
                    break;
                }
                i20 = i30;
                if (i48 == kotlin.collections.w.J(kVar)) {
                    break;
                }
                i16 -= sizeWithSpacings;
                i48++;
                vVar3 = (v) kVar.get(i48);
                i30 = i20;
                size = i49;
            }
            i20 = i30;
            vVar = vVar3;
            list3 = list2;
            i21 = i16;
            i22 = i13;
        } else {
            list3 = list2;
            i21 = i16;
            i20 = i30;
            i22 = i13;
            vVar = vVar2;
        }
        List<v> d5 = d(i19, xVar, i22, list3);
        int i50 = i20;
        int i51 = 0;
        for (int size2 = d5.size(); i51 < size2; size2 = size2) {
            i50 = Math.max(i50, d5.get(i51).getCrossAxisSize());
            i51++;
        }
        int i52 = i50;
        v vVar4 = vVar;
        float f10 = f5;
        List<v> c5 = c(kVar, xVar, i4, i13, list2, f5, z7, sVar);
        int size3 = c5.size();
        int i53 = i52;
        for (int i54 = 0; i54 < size3; i54++) {
            i53 = Math.max(i53, c5.get(i54).getCrossAxisSize());
        }
        boolean z12 = l0.g(vVar4, kVar.first()) && d5.isEmpty() && c5.isEmpty();
        int g4 = androidx.compose.ui.unit.c.g(j4, z4 ? i53 : i18);
        if (z4) {
            i53 = i18;
        }
        int f11 = androidx.compose.ui.unit.c.f(j4, i53);
        int i55 = i18;
        int i56 = i15;
        List<v> a5 = a(kVar, d5, c5, g4, f11, i55, i5, i47, z4, mVar, eVar, z5, dVar);
        lVar.e((int) f10, g4, f11, a5, xVar, z4, z7, z6, r0Var);
        v a6 = !list.isEmpty() ? i.a(a5, xVar, list, i6, g4, f11) : null;
        boolean z13 = i56 < i4 || i55 > i5;
        androidx.compose.ui.layout.n0 R = qVar.R(Integer.valueOf(g4), Integer.valueOf(f11), new b(a5, a6, z7, k2Var));
        if (z12) {
            list4 = a5;
        } else {
            ArrayList arrayList = new ArrayList(a5.size());
            int size4 = a5.size();
            for (int i57 = 0; i57 < size4; i57++) {
                v vVar5 = a5.get(i57);
                v vVar6 = vVar5;
                if ((vVar6.getIndex() >= ((v) kVar.first()).getIndex() && vVar6.getIndex() <= ((v) kVar.last()).getIndex()) || vVar6 == a6) {
                    arrayList.add(vVar5);
                }
            }
            list4 = arrayList;
        }
        return new u(vVar4, i21, z13, f10, R, f7, z11, list4, i32, i34, i4, z5, z4 ? androidx.compose.foundation.gestures.j0.Vertical : androidx.compose.foundation.gestures.j0.Horizontal, i7, i10);
    }
}
