package androidx.compose.material3.carousel;

import androidx.collection.o1;
import androidx.collection.t;
import androidx.compose.foundation.w1;
import androidx.compose.runtime.internal.u;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.u0;
import kotlin.collections.w;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.ranges.s;

/* compiled from: Strategy.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0013BM\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006 "}, d2 = {"Landroidx/compose/material3/carousel/h;", "", "Landroidx/compose/material3/carousel/e;", "defaultKeylines", "", "startKeylineSteps", "endKeylineSteps", "", "startShiftDistance", "endShiftDistance", "Landroidx/collection/t;", "startShiftPoints", "endShiftPoints", "<init>", "(Landroidx/compose/material3/carousel/e;Ljava/util/List;Ljava/util/List;FFLandroidx/collection/t;Landroidx/collection/t;)V", "scrollOffset", "maxScrollOffset", "", "roundToNearestStep", "a", "(FFZ)Landroidx/compose/material3/carousel/e;", "Landroidx/compose/material3/carousel/e;", "b", "Ljava/util/List;", "c", "d", "F", "e", "f", "Landroidx/collection/t;", "g", "h", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: i, reason: collision with root package name */
    public static final int f10332i = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final e defaultKeylines;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final List<e> startKeylineSteps;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final List<e> endKeylineSteps;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float startShiftDistance;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float endShiftDistance;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private final t startShiftPoints;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    private final t endShiftPoints;

    /* compiled from: Strategy.kt */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001'B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ/\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f*\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0004H\u0000¢\u0006\u0004\b%\u0010&¨\u0006("}, d2 = {"Landroidx/compose/material3/carousel/h$a;", "", "<init>", "()V", "Landroidx/compose/material3/carousel/e;", "defaultKeylines", "", "carouselMainAxisSize", "", "f", "(Landroidx/compose/material3/carousel/e;F)Ljava/util/List;", "d", "from", "", "srcIndex", "dstIndex", "i", "(Landroidx/compose/material3/carousel/e;IIF)Landroidx/compose/material3/carousel/e;", "totalShiftDistance", "steps", "", "isShiftingLeft", "Landroidx/collection/t;", "g", "(FLjava/util/List;Z)Landroidx/collection/t;", "stepsCount", "shiftPoint", "interpolation", "Landroidx/compose/material3/carousel/h$a$a;", "e", "(ILandroidx/collection/t;F)Landroidx/compose/material3/carousel/h$a$a;", "", "Landroidx/compose/material3/carousel/c;", "h", "(Ljava/util/List;II)Ljava/util/List;", "keylineList", "Landroidx/compose/material3/carousel/h;", "c", "(FLandroidx/compose/material3/carousel/e;)Landroidx/compose/material3/carousel/h;", "a", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strategy.kt\nandroidx/compose/material3/carousel/Strategy$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,509:1\n1549#2:510\n1620#2,3:511\n1855#2,2:514\n*S KotlinDebug\n*F\n+ 1 Strategy.kt\nandroidx/compose/material3/carousel/Strategy$Companion\n*L\n405#1:510\n405#1:511,3\n432#1:514,2\n*E\n"})
    /* renamed from: androidx.compose.material3.carousel.h$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: Strategy.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\r¨\u0006\u001d"}, d2 = {"Landroidx/compose/material3/carousel/h$a$a;", "", "", "fromStepIndex", "toStepIndex", "", "steppedInterpolation", "<init>", "(IIF)V", "a", "()I", "b", "c", "()F", "d", "(IIF)Landroidx/compose/material3/carousel/h$a$a;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "f", "h", "F", "g", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material3.carousel.h$a$a, reason: collision with other inner class name */
        private static final /* data */ class C0229a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final int fromStepIndex;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final int toStepIndex;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final float steppedInterpolation;

            public C0229a(int i4, int i5, float f4) {
                this.fromStepIndex = i4;
                this.toStepIndex = i5;
                this.steppedInterpolation = f4;
            }

            public static C0229a e(C0229a c0229a, int i4, int i5, float f4, int i6, Object obj) {
                if ((i6 & 1) != 0) {
                    i4 = c0229a.fromStepIndex;
                }
                if ((i6 & 2) != 0) {
                    i5 = c0229a.toStepIndex;
                }
                if ((i6 & 4) != 0) {
                    f4 = c0229a.steppedInterpolation;
                }
                c0229a.getClass();
                return new C0229a(i4, i5, f4);
            }

            /* renamed from: a, reason: from getter */
            public final int getFromStepIndex() {
                return this.fromStepIndex;
            }

            /* renamed from: b, reason: from getter */
            public final int getToStepIndex() {
                return this.toStepIndex;
            }

            /* renamed from: c, reason: from getter */
            public final float getSteppedInterpolation() {
                return this.steppedInterpolation;
            }

            @l
            public final C0229a d(int fromStepIndex, int toStepIndex, float steppedInterpolation) {
                return new C0229a(fromStepIndex, toStepIndex, steppedInterpolation);
            }

            public boolean equals(@m Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C0229a)) {
                    return false;
                }
                C0229a c0229a = (C0229a) other;
                return this.fromStepIndex == c0229a.fromStepIndex && this.toStepIndex == c0229a.toStepIndex && Float.compare(this.steppedInterpolation, c0229a.steppedInterpolation) == 0;
            }

            public final int f() {
                return this.fromStepIndex;
            }

            public final float g() {
                return this.steppedInterpolation;
            }

            public final int h() {
                return this.toStepIndex;
            }

            public int hashCode() {
                return Float.hashCode(this.steppedInterpolation) + w1.a(this.toStepIndex, Integer.hashCode(this.fromStepIndex) * 31, 31);
            }

            @l
            public String toString() {
                StringBuilder sb = new StringBuilder("ShiftPointRange(fromStepIndex=");
                sb.append(this.fromStepIndex);
                sb.append(", toStepIndex=");
                sb.append(this.toStepIndex);
                sb.append(", steppedInterpolation=");
                return androidx.compose.animation.b.a(sb, this.steppedInterpolation, ')');
            }
        }

        /* compiled from: Strategy.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/material3/carousel/f;", "Lkotlin/k2;", "a", "(Landroidx/compose/material3/carousel/f;)V"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strategy.kt\nandroidx/compose/material3/carousel/Strategy$Companion$moveKeylineAndCreateShiftedKeylineList$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,509:1\n33#2,6:510\n*S KotlinDebug\n*F\n+ 1 Strategy.kt\nandroidx/compose/material3/carousel/Strategy$Companion$moveKeylineAndCreateShiftedKeylineList$1\n*L\n362#1:510,6\n*E\n"})
        /* renamed from: androidx.compose.material3.carousel.h$a$b */
        static final class b extends n0 implements ld.l<f, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f10343b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f10344c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f10345d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(e eVar, int i4, int i5) {
                super(1);
                this.f10343b = eVar;
                this.f10344c = i4;
                this.f10345d = i5;
            }

            public final void a(@l f fVar) {
                List h4 = h.INSTANCE.h(w.Y5(this.f10343b), this.f10344c, this.f10345d);
                int size = h4.size();
                for (int i4 = 0; i4 < size; i4++) {
                    c cVar = (c) h4.get(i4);
                    fVar.b(cVar.l(), cVar.n());
                }
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(f fVar) {
                a(fVar);
                return k2.f75408a;
            }
        }

        private Companion() {
        }

        private final List<e> d(e defaultKeylines, float carouselMainAxisSize) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(defaultKeylines);
            if (defaultKeylines.I(carouselMainAxisSize)) {
                return arrayList;
            }
            int lastFocalIndex = defaultKeylines.getLastFocalIndex();
            int lastNonAnchorIndex = defaultKeylines.getLastNonAnchorIndex();
            int i4 = lastNonAnchorIndex - lastFocalIndex;
            if (i4 <= 0 && defaultKeylines.getLastFocal().j() > 0.0f) {
                arrayList.add(i(defaultKeylines, 0, 0, carouselMainAxisSize));
                return arrayList;
            }
            for (int i5 = 0; i5 < i4; i5++) {
                e eVar = (e) w.p3(arrayList);
                int i6 = lastNonAnchorIndex - i5;
                arrayList.add(i(eVar, defaultKeylines.getLastNonAnchorIndex(), i6 < w.J(defaultKeylines) ? eVar.L(defaultKeylines.get(i6 + 1).l()) + 1 : 0, carouselMainAxisSize));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C0229a e(int stepsCount, t shiftPoint, float interpolation) {
            float b5;
            float s4 = shiftPoint.s(0);
            Iterator<Integer> it = s.W1(1, stepsCount).iterator();
            while (it.hasNext()) {
                int c5 = ((u0) it).c();
                float s5 = shiftPoint.s(c5);
                if (interpolation <= s5) {
                    b5 = i.b(0.0f, 1.0f, s4, s5, interpolation);
                    return new C0229a(c5 - 1, c5, b5);
                }
                s4 = s5;
            }
            return new C0229a(0, 0, 0.0f);
        }

        private final List<e> f(e defaultKeylines, float carouselMainAxisSize) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(defaultKeylines);
            if (defaultKeylines.H()) {
                return arrayList;
            }
            int firstNonAnchorIndex = defaultKeylines.getFirstNonAnchorIndex();
            int firstFocalIndex = defaultKeylines.getFirstFocalIndex() - firstNonAnchorIndex;
            if (firstFocalIndex <= 0 && defaultKeylines.getFirstFocal().j() > 0.0f) {
                arrayList.add(i(defaultKeylines, 0, 0, carouselMainAxisSize));
                return arrayList;
            }
            for (int i4 = 0; i4 < firstFocalIndex; i4++) {
                e eVar = (e) w.p3(arrayList);
                int i5 = firstNonAnchorIndex + i4;
                int J = w.J(defaultKeylines);
                if (i5 > 0) {
                    J = eVar.h(defaultKeylines.get(i5 - 1).l()) - 1;
                }
                arrayList.add(i(eVar, defaultKeylines.getFirstNonAnchorIndex(), J, carouselMainAxisSize));
            }
            return arrayList;
        }

        private final t g(float totalShiftDistance, List<e> steps, boolean isShiftingLeft) {
            o1 h4 = androidx.collection.u.h(0.0f);
            if (totalShiftDistance == 0.0f) {
                return h4;
            }
            kotlin.ranges.l W1 = s.W1(1, steps.size());
            ArrayList arrayList = new ArrayList(w.b0(W1, 10));
            Iterator<Integer> it = W1.iterator();
            while (it.hasNext()) {
                int c5 = ((u0) it).c();
                int i4 = c5 - 1;
                e eVar = steps.get(i4);
                e eVar2 = steps.get(c5);
                arrayList.add(Boolean.valueOf(h4.X(c5 == w.J(steps) ? 1.0f : h4.s(i4) + ((isShiftingLeft ? ((c) w.B2(eVar2)).m() - ((c) w.B2(eVar)).m() : ((c) w.p3(eVar)).m() - ((c) w.p3(eVar2)).m()) / totalShiftDistance))));
            }
            return h4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<c> h(List<c> list, int i4, int i5) {
            c cVar = list.get(i4);
            list.remove(i4);
            list.add(i5, cVar);
            return list;
        }

        private final e i(e from, int srcIndex, int dstIndex, float carouselMainAxisSize) {
            int i4 = srcIndex > dstIndex ? 1 : -1;
            return d.a(carouselMainAxisSize, from.getPivotIndex() + i4, from.getPivot().k() + (from.get(srcIndex).l() * i4), new b(from, srcIndex, dstIndex));
        }

        @l
        public final h c(float carouselMainAxisSize, @l e keylineList) {
            List<e> f4 = f(keylineList, carouselMainAxisSize);
            List<e> d5 = d(keylineList, carouselMainAxisSize);
            float m4 = ((c) w.B2((List) w.p3(f4))).m() - ((c) w.B2(keylineList)).m();
            float m5 = ((c) w.p3(keylineList)).m() - ((c) w.p3((List) w.p3(d5))).m();
            return new h(keylineList, f4, d5, m4, m5, g(m4, f4, true), g(m5, d5, false), null);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ h(e eVar, List list, List list2, float f4, float f5, t tVar, t tVar2, kotlin.jvm.internal.w wVar) {
        this(eVar, list, list2, f4, f5, tVar, tVar2);
    }

    public static /* synthetic */ e b(h hVar, float f4, float f5, boolean z4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        return hVar.a(f4, f5, z4);
    }

    @l
    public final e a(float scrollOffset, float maxScrollOffset, boolean roundToNearestStep) {
        float b5;
        float f4 = this.startShiftDistance;
        float f5 = maxScrollOffset - this.endShiftDistance;
        if (f4 <= scrollOffset && scrollOffset <= f5) {
            return this.defaultKeylines;
        }
        b5 = i.b(1.0f, 0.0f, 0.0f, f4, scrollOffset);
        t tVar = this.startShiftPoints;
        List<e> list = this.startKeylineSteps;
        if (scrollOffset > f5) {
            b5 = i.b(0.0f, 1.0f, f5, maxScrollOffset, scrollOffset);
            tVar = this.endShiftPoints;
            list = this.endKeylineSteps;
        }
        Companion.C0229a e4 = INSTANCE.e(list.size(), tVar, b5);
        if (roundToNearestStep) {
            return list.get(kotlin.math.b.L0(e4.g()) == 0 ? e4.f() : e4.h());
        }
        return i.d(list.get(e4.f()), list.get(e4.h()), e4.g());
    }

    private h(e eVar, List<e> list, List<e> list2, float f4, float f5, t tVar, t tVar2) {
        this.defaultKeylines = eVar;
        this.startKeylineSteps = list;
        this.endKeylineSteps = list2;
        this.startShiftDistance = f4;
        this.endShiftDistance = f5;
        this.startShiftPoints = tVar;
        this.endShiftPoints = tVar2;
    }
}
