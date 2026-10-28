package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.i;
import androidx.compose.ui.layout.i1;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: RowColumnMeasurementHelper.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0000\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ9\u0010&\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0016H\u0002¢\u0006\u0004\b&\u0010'J\u0011\u0010(\u001a\u00020\u0016*\u00020\u0012¢\u0006\u0004\b(\u0010)J\u0011\u0010*\u001a\u00020\u0016*\u00020\u0012¢\u0006\u0004\b*\u0010)J0\u00100\u001a\u00020/2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u0016ø\u0001\u0000¢\u0006\u0004\b0\u00101J-\u00107\u001a\u0002062\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020/2\u0006\u00105\u001a\u00020\u00162\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001d\u0010\t\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010D\u001a\u0004\b<\u0010ER\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bF\u0010HR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b>\u0010I\u001a\u0004\b@\u0010JR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bK\u0010MR\u001f\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0006¢\u0006\f\n\u0004\b:\u0010N\u001a\u0004\bO\u0010PR\u001c\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010Q\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006S"}, d2 = {"Landroidx/compose/foundation/layout/u1;", "", "Landroidx/compose/foundation/layout/a1;", "orientation", "Landroidx/compose/foundation/layout/i$e;", "horizontalArrangement", "Landroidx/compose/foundation/layout/i$m;", "verticalArrangement", "Landroidx/compose/ui/unit/h;", "arrangementSpacing", "Landroidx/compose/foundation/layout/d2;", "crossAxisSize", "Landroidx/compose/foundation/layout/x;", "crossAxisAlignment", "", "Landroidx/compose/ui/layout/l0;", "measurables", "", "Landroidx/compose/ui/layout/i1;", "placeables", "<init>", "(Landroidx/compose/foundation/layout/a1;Landroidx/compose/foundation/layout/i$e;Landroidx/compose/foundation/layout/i$m;FLandroidx/compose/foundation/layout/d2;Landroidx/compose/foundation/layout/x;Ljava/util/List;[Landroidx/compose/ui/layout/i1;Lkotlin/jvm/internal/w;)V", "", "mainAxisLayoutSize", "", "childrenMainAxisSize", "mainAxisPositions", "Landroidx/compose/ui/layout/o0;", "measureScope", "k", "(I[I[ILandroidx/compose/ui/layout/o0;)[I", "placeable", "Landroidx/compose/foundation/layout/v1;", "parentData", "crossAxisLayoutSize", "Landroidx/compose/ui/unit/w;", "layoutDirection", "beforeCrossAxisAlignmentLine", "d", "(Landroidx/compose/ui/layout/i1;Landroidx/compose/foundation/layout/v1;ILandroidx/compose/ui/unit/w;I)I", "l", "(Landroidx/compose/ui/layout/i1;)I", "a", "Landroidx/compose/ui/unit/b;", "constraints", "startIndex", "endIndex", "Landroidx/compose/foundation/layout/s1;", "m", "(Landroidx/compose/ui/layout/o0;JII)Landroidx/compose/foundation/layout/s1;", "Landroidx/compose/ui/layout/i1$a;", "placeableScope", "measureResult", "crossAxisOffset", "Lkotlin/k2;", "n", "(Landroidx/compose/ui/layout/i1$a;Landroidx/compose/foundation/layout/s1;ILandroidx/compose/ui/unit/w;)V", "Landroidx/compose/foundation/layout/a1;", "h", "()Landroidx/compose/foundation/layout/a1;", "b", "Landroidx/compose/foundation/layout/i$e;", "f", "()Landroidx/compose/foundation/layout/i$e;", "c", "Landroidx/compose/foundation/layout/i$m;", "j", "()Landroidx/compose/foundation/layout/i$m;", "F", "()F", "e", "Landroidx/compose/foundation/layout/d2;", "()Landroidx/compose/foundation/layout/d2;", "Landroidx/compose/foundation/layout/x;", "()Landroidx/compose/foundation/layout/x;", "g", "Ljava/util/List;", "()Ljava/util/List;", "[Landroidx/compose/ui/layout/i1;", "i", "()[Landroidx/compose/ui/layout/i1;", "[Landroidx/compose/foundation/layout/v1;", "rowColumnParentData", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nRowColumnMeasurementHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnMeasurementHelper.kt\nandroidx/compose/foundation/layout/RowColumnMeasurementHelper\n+ 2 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,343:1\n322#2:344\n322#2:345\n322#2:346\n321#2:347\n324#2:349\n322#2:350\n321#2:351\n324#2:352\n324#2:353\n323#2:354\n1#3:348\n*S KotlinDebug\n*F\n+ 1 RowColumnMeasurementHelper.kt\nandroidx/compose/foundation/layout/RowColumnMeasurementHelper\n*L\n111#1:344\n143#1:345\n144#1:346\n146#1:347\n181#1:349\n191#1:350\n230#1:351\n232#1:352\n235#1:353\n240#1:354\n*E\n"})
/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: j, reason: collision with root package name */
    public static final int f5337j = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final a1 orientation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final i.e horizontalArrangement;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final i.m verticalArrangement;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float arrangementSpacing;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d2 crossAxisSize;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final x crossAxisAlignment;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<androidx.compose.ui.layout.l0> measurables;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.layout.i1[] placeables;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final v1[] rowColumnParentData;

    public /* synthetic */ u1(a1 a1Var, i.e eVar, i.m mVar, float f4, d2 d2Var, x xVar, List list, androidx.compose.ui.layout.i1[] i1VarArr, kotlin.jvm.internal.w wVar) {
        this(a1Var, eVar, mVar, f4, d2Var, xVar, list, i1VarArr);
    }

    private final int d(androidx.compose.ui.layout.i1 placeable, v1 parentData, int crossAxisLayoutSize, androidx.compose.ui.unit.w layoutDirection, int beforeCrossAxisAlignmentLine) {
        x xVar;
        if (parentData == null || (xVar = parentData.f()) == null) {
            xVar = this.crossAxisAlignment;
        }
        int a5 = crossAxisLayoutSize - a(placeable);
        if (this.orientation == a1.Horizontal) {
            layoutDirection = androidx.compose.ui.unit.w.Ltr;
        }
        return xVar.d(a5, layoutDirection, placeable, beforeCrossAxisAlignmentLine);
    }

    private final int[] k(int mainAxisLayoutSize, int[] childrenMainAxisSize, int[] mainAxisPositions, androidx.compose.ui.layout.o0 measureScope) {
        if (this.orientation == a1.Vertical) {
            i.m mVar = this.verticalArrangement;
            if (mVar == null) {
                throw new IllegalArgumentException("null verticalArrangement in Column");
            }
            mVar.d(measureScope, mainAxisLayoutSize, childrenMainAxisSize, mainAxisPositions);
        } else {
            i.e eVar = this.horizontalArrangement;
            if (eVar == null) {
                throw new IllegalArgumentException("null horizontalArrangement in Row");
            }
            eVar.e(measureScope, mainAxisLayoutSize, childrenMainAxisSize, measureScope.getLayoutDirection(), mainAxisPositions);
        }
        return mainAxisPositions;
    }

    public final int a(@fg.l androidx.compose.ui.layout.i1 i1Var) {
        return this.orientation == a1.Horizontal ? i1Var.getHeight() : i1Var.getWidth();
    }

    /* renamed from: b, reason: from getter */
    public final float getArrangementSpacing() {
        return this.arrangementSpacing;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final x getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final d2 getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @fg.m
    /* renamed from: f, reason: from getter */
    public final i.e getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    @fg.l
    public final List<androidx.compose.ui.layout.l0> g() {
        return this.measurables;
    }

    @fg.l
    /* renamed from: h, reason: from getter */
    public final a1 getOrientation() {
        return this.orientation;
    }

    @fg.l
    /* renamed from: i, reason: from getter */
    public final androidx.compose.ui.layout.i1[] getPlaceables() {
        return this.placeables;
    }

    @fg.m
    /* renamed from: j, reason: from getter */
    public final i.m getVerticalArrangement() {
        return this.verticalArrangement;
    }

    public final int l(@fg.l androidx.compose.ui.layout.i1 i1Var) {
        return this.orientation == a1.Horizontal ? i1Var.getWidth() : i1Var.getHeight();
    }

    @fg.l
    public final s1 m(@fg.l androidx.compose.ui.layout.o0 measureScope, long constraints, int startIndex, int endIndex) {
        int i4;
        int i5;
        int K;
        int i6;
        float f4;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        long j4;
        int i14 = endIndex;
        long d5 = i1.d(constraints, this.orientation);
        long q22 = measureScope.q2(this.arrangementSpacing);
        int i15 = i14 - startIndex;
        long j5 = 0;
        int i16 = startIndex;
        long j6 = 0;
        float f5 = 0.0f;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        boolean z4 = false;
        while (true) {
            boolean z5 = true;
            if (i16 >= i14) {
                break;
            }
            androidx.compose.ui.layout.l0 l0Var = this.measurables.get(i16);
            v1 v1Var = this.rowColumnParentData[i16];
            float m4 = r1.m(v1Var);
            if (m4 > 0.0f) {
                f5 += m4;
                i19++;
                i12 = i16;
                j4 = j5;
            } else {
                int p4 = androidx.compose.ui.unit.b.p(d5);
                androidx.compose.ui.layout.i1 i1Var = this.placeables[i16];
                if (i1Var == null) {
                    i11 = i18;
                    i12 = i16;
                    i13 = p4;
                    i1Var = l0Var.m0(i1.q(i1.f(d5, 0, p4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) kotlin.ranges.s.v(p4 - j6, j5), 0, 0, 8, null), this.orientation));
                } else {
                    i11 = i18;
                    i12 = i16;
                    i13 = p4;
                }
                j4 = 0;
                int min = Math.min((int) q22, (int) kotlin.ranges.s.v((i13 - j6) - l(i1Var), 0L));
                j6 += l(i1Var) + min;
                int max = Math.max(i11, a(i1Var));
                if (!z4 && !r1.q(v1Var)) {
                    z5 = false;
                }
                this.placeables[i12] = i1Var;
                i17 = min;
                i18 = max;
                z4 = z5;
            }
            j5 = j4;
            i16 = i12 + 1;
        }
        long j7 = j5;
        if (i19 == 0) {
            j6 -= i17;
            i4 = i15;
            i5 = 0;
            K = 0;
        } else {
            long j10 = q22 * (i19 - 1);
            long v4 = kotlin.ranges.s.v((((f5 <= 0.0f || androidx.compose.ui.unit.b.p(d5) == Integer.MAX_VALUE) ? androidx.compose.ui.unit.b.r(d5) : androidx.compose.ui.unit.b.p(d5)) - j6) - j10, j7);
            float f6 = f5 > 0.0f ? v4 / f5 : 0.0f;
            Iterator<Integer> it = kotlin.ranges.s.W1(startIndex, endIndex).iterator();
            int i20 = 0;
            while (it.hasNext()) {
                i20 += kotlin.math.b.L0(r1.m(this.rowColumnParentData[((kotlin.collections.u0) it).c()]) * f6);
            }
            long j11 = v4 - i20;
            int i21 = startIndex;
            int i22 = 0;
            while (i21 < i14) {
                if (this.placeables[i21] == null) {
                    androidx.compose.ui.layout.l0 l0Var2 = this.measurables.get(i21);
                    v1 v1Var2 = this.rowColumnParentData[i21];
                    float m5 = r1.m(v1Var2);
                    if (m5 <= 0.0f) {
                        throw new IllegalStateException("All weights <= 0 should have placeables");
                    }
                    int V = kotlin.math.b.V(j11);
                    i6 = i15;
                    j11 -= V;
                    int max2 = Math.max(0, kotlin.math.b.L0(m5 * f6) + V);
                    f4 = f6;
                    androidx.compose.ui.layout.i1 m02 = l0Var2.m0(i1.q(androidx.compose.ui.unit.c.a((!r1.k(v1Var2) || max2 == Integer.MAX_VALUE) ? 0 : max2, max2, 0, androidx.compose.ui.unit.b.o(d5)), this.orientation));
                    int l4 = l(m02) + i22;
                    int max3 = Math.max(i18, a(m02));
                    boolean z6 = z4 || r1.q(v1Var2);
                    this.placeables[i21] = m02;
                    i18 = max3;
                    z4 = z6;
                    i22 = l4;
                } else {
                    i6 = i15;
                    f4 = f6;
                }
                i21++;
                i15 = i6;
                i14 = endIndex;
                f6 = f4;
            }
            i4 = i15;
            i5 = 0;
            K = (int) kotlin.ranges.s.K(i22 + j10, 0L, androidx.compose.ui.unit.b.p(d5) - j6);
        }
        if (z4) {
            int i23 = i5;
            i7 = i23;
            for (int i24 = startIndex; i24 < endIndex; i24++) {
                androidx.compose.ui.layout.i1 i1Var2 = this.placeables[i24];
                kotlin.jvm.internal.l0.m(i1Var2);
                x j12 = r1.j(this.rowColumnParentData[i24]);
                Integer e4 = j12 != null ? j12.e(i1Var2) : null;
                if (e4 != null) {
                    int intValue = e4.intValue();
                    if (intValue == Integer.MIN_VALUE) {
                        intValue = i5;
                    }
                    i23 = Math.max(i23, intValue);
                    int a5 = a(i1Var2);
                    int intValue2 = e4.intValue();
                    if (intValue2 == Integer.MIN_VALUE) {
                        intValue2 = a(i1Var2);
                    }
                    i7 = Math.max(i7, a5 - intValue2);
                }
            }
            i10 = i23;
        } else {
            i7 = i5;
            i10 = i7;
        }
        int max4 = Math.max((int) kotlin.ranges.s.v(j6 + K, 0L), androidx.compose.ui.unit.b.r(d5));
        int max5 = (androidx.compose.ui.unit.b.o(d5) == Integer.MAX_VALUE || this.crossAxisSize != d2.Expand) ? Math.max(i18, Math.max(androidx.compose.ui.unit.b.q(d5), i7 + i10)) : androidx.compose.ui.unit.b.o(d5);
        int i25 = i4;
        int[] iArr = new int[i25];
        for (int i26 = i5; i26 < i25; i26++) {
            iArr[i26] = i5;
        }
        int[] iArr2 = new int[i25];
        for (int i27 = i5; i27 < i25; i27++) {
            androidx.compose.ui.layout.i1 i1Var3 = this.placeables[i27 + startIndex];
            kotlin.jvm.internal.l0.m(i1Var3);
            iArr2[i27] = l(i1Var3);
        }
        return new s1(max5, max4, startIndex, endIndex, i10, k(max4, iArr2, iArr, measureScope));
    }

    public final void n(@fg.l i1.a placeableScope, @fg.l s1 measureResult, int crossAxisOffset, @fg.l androidx.compose.ui.unit.w layoutDirection) {
        int endIndex = measureResult.getEndIndex();
        for (int startIndex = measureResult.getStartIndex(); startIndex < endIndex; startIndex++) {
            androidx.compose.ui.layout.i1 i1Var = this.placeables[startIndex];
            kotlin.jvm.internal.l0.m(i1Var);
            int[] mainAxisPositions = measureResult.getMainAxisPositions();
            Object parentData = this.measurables.get(startIndex).getParentData();
            int d5 = d(i1Var, parentData instanceof v1 ? (v1) parentData : null, measureResult.getCrossAxisSize(), layoutDirection, measureResult.getBeforeCrossAxisAlignmentLine()) + crossAxisOffset;
            if (this.orientation == a1.Horizontal) {
                i1.a.g(placeableScope, i1Var, mainAxisPositions[startIndex - measureResult.getStartIndex()], d5, 0.0f, 4, null);
            } else {
                i1.a.g(placeableScope, i1Var, d5, mainAxisPositions[startIndex - measureResult.getStartIndex()], 0.0f, 4, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private u1(a1 a1Var, i.e eVar, i.m mVar, float f4, d2 d2Var, x xVar, List<? extends androidx.compose.ui.layout.l0> list, androidx.compose.ui.layout.i1[] i1VarArr) {
        this.orientation = a1Var;
        this.horizontalArrangement = eVar;
        this.verticalArrangement = mVar;
        this.arrangementSpacing = f4;
        this.crossAxisSize = d2Var;
        this.crossAxisAlignment = xVar;
        this.measurables = list;
        this.placeables = i1VarArr;
        int size = list.size();
        v1[] v1VarArr = new v1[size];
        for (int i4 = 0; i4 < size; i4++) {
            v1VarArr[i4] = r1.l(this.measurables.get(i4));
        }
        this.rowColumnParentData = v1VarArr;
    }
}
