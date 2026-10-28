package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.j0;
import androidx.compose.foundation.layout.i;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.i1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: PagerMeasure.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\u001aé\u0001\u0010'\u001a\u00020&*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2/\u0010%\u001a+\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 ¢\u0006\u0002\b#\u0012\u0004\u0012\u00020$0\u001fH\u0000ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001aO\u0010-\u001a\b\u0012\u0004\u0012\u00020+0\u00192\u0006\u0010)\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020+0 H\u0002¢\u0006\u0004\b-\u0010.\u001aG\u00100\u001a\b\u0012\u0004\u0012\u00020+0\u00192\u0006\u0010/\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020+0 H\u0002¢\u0006\u0004\b0\u00101\u001aG\u00105\u001a\u0004\u0018\u00010+2\u0006\u00102\u001a\u00020\u00012\f\u00103\u001a\b\u0012\u0004\u0012\u00020+0\u00192\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b5\u00106\u001aj\u0010;\u001a\u00020+*\u00020\u00002\u0006\u00107\u001a\u00020\u00012\u0006\u00108\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010:\u001a\u0002092\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a\u0093\u0001\u0010H\u001a\b\u0012\u0004\u0012\u00020+0G*\u00020\u00002\f\u0010=\u001a\b\u0012\u0004\u0012\u00020+0\u00192\f\u0010>\u001a\b\u0012\u0004\u0012\u00020+0\u00192\f\u0010?\u001a\b\u0012\u0004\u0012\u00020+0\u00192\u0006\u0010@\u001a\u00020\u00012\u0006\u0010A\u001a\u00020\u00012\u0006\u0010B\u001a\u00020\u00012\u0006\u0010C\u001a\u00020\u00012\u0006\u0010D\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010F\u001a\u00020E2\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0002¢\u0006\u0004\bH\u0010I\u001a\u001e\u0010M\u001a\u00020\"2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020K0JH\u0082\b¢\u0006\u0004\bM\u0010N\"\u0014\u0010R\u001a\u00020O8\u0000X\u0080T¢\u0006\u0006\n\u0004\bP\u0010Q\"\u0014\u0010S\u001a\u00020O8\u0000X\u0080T¢\u0006\u0006\n\u0004\b5\u0010Q\"\u0014\u0010U\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\bH\u0010T\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006V"}, d2 = {"Landroidx/compose/foundation/lazy/layout/x;", "", "pageCount", "Landroidx/compose/foundation/pager/r;", "pagerItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenPages", "currentPage", "currentPageOffset", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/foundation/gestures/j0;", "orientation", "Landroidx/compose/ui/c$c;", "verticalAlignment", "Landroidx/compose/ui/c$b;", "horizontalAlignment", "", "reverseLayout", "Landroidx/compose/ui/unit/q;", "visualPageOffset", "pageAvailableSize", "beyondBoundsPageCount", "", "pinnedPages", "Landroidx/compose/foundation/gestures/snapping/l;", "snapPositionInLayout", "Landroidx/compose/foundation/lazy/layout/n0;", "placementScopeInvalidator", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "Lkotlin/u;", "Landroidx/compose/ui/layout/n0;", "layout", "Landroidx/compose/foundation/pager/u;", "i", "(Landroidx/compose/foundation/lazy/layout/x;ILandroidx/compose/foundation/pager/r;IIIIIIJLandroidx/compose/foundation/gestures/j0;Landroidx/compose/ui/c$c;Landroidx/compose/ui/c$b;ZJIILjava/util/List;Landroidx/compose/foundation/gestures/snapping/l;Landroidx/compose/runtime/k2;Lld/q;)Landroidx/compose/foundation/pager/u;", "currentLastPage", "pagesCount", "Landroidx/compose/foundation/pager/d;", "getAndMeasure", "e", "(IIILjava/util/List;Lld/l;)Ljava/util/List;", "currentFirstPage", "f", "(IILjava/util/List;Lld/l;)Ljava/util/List;", "viewportSize", "visiblePagesInfo", "itemSize", "b", "(ILjava/util/List;IIILandroidx/compose/foundation/gestures/snapping/l;)Landroidx/compose/foundation/pager/d;", "index", "childConstraints", "Landroidx/compose/ui/unit/w;", "layoutDirection", "h", "(Landroidx/compose/foundation/lazy/layout/x;IJLandroidx/compose/foundation/pager/r;JLandroidx/compose/foundation/gestures/j0;Landroidx/compose/ui/c$b;Landroidx/compose/ui/c$c;Landroidx/compose/ui/unit/w;ZI)Landroidx/compose/foundation/pager/d;", "pages", "extraPagesBefore", "extraPagesAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "pagesScrollOffset", "Landroidx/compose/ui/unit/d;", "density", "", "c", "(Landroidx/compose/foundation/lazy/layout/x;Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIILandroidx/compose/foundation/gestures/j0;ZLandroidx/compose/ui/unit/d;II)Ljava/util/List;", "Lkotlin/Function0;", "", "generateMsg", "g", "(Lld/a;)V", "", "a", "F", "MinPageOffset", "MaxPageOffset", "Z", "DEBUG", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPagerMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,631:1\n627#1,4:633\n627#1,4:660\n1#2:632\n33#3,6:637\n33#3,6:643\n235#3,3:649\n33#3,4:652\n238#3,2:656\n38#3:658\n240#3:659\n33#3,6:664\n33#3,6:670\n171#3,13:676\n33#3,6:689\n33#3,6:695\n33#3,6:701\n*S KotlinDebug\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt\n*L\n66#1:633,4\n402#1:660,4\n312#1:637,6\n338#1:643,6\n378#1:649,3\n378#1:652,4\n378#1:656,2\n378#1:658\n378#1:659\n449#1:664,6\n474#1:670,6\n493#1:676,13\n600#1:689,6\n607#1:695,6\n613#1:701,6\n*E\n"})
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final float f6880a = -0.5f;

    /* renamed from: b, reason: collision with root package name */
    public static final float f6881b = 0.5f;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f6882c = false;

    /* compiled from: PagerMeasure.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.l<i1.a, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f6883b = new a(1);

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

    /* compiled from: PagerMeasure.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nPagerMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt$measurePager$9\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,631:1\n33#2,6:632\n*S KotlinDebug\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt$measurePager$9\n*L\n410#1:632,6\n*E\n"})
    static final class b extends n0 implements ld.l<i1.a, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<androidx.compose.foundation.pager.d> f6884b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<k2> f6885c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<androidx.compose.foundation.pager.d> list, androidx.compose.runtime.k2<k2> k2Var) {
            super(1);
            this.f6884b = list;
            this.f6885c = k2Var;
        }

        public final void a(@fg.l i1.a aVar) {
            List<androidx.compose.foundation.pager.d> list = this.f6884b;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                list.get(i4).h(aVar);
            }
            this.f6885c.getValue();
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(i1.a aVar) {
            a(aVar);
            return k2.f75408a;
        }
    }

    /* compiled from: PagerMeasure.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/foundation/pager/d;", "a", "(I)Landroidx/compose/foundation/pager/d;"}, k = 3, mv = {1, 8, 0})
    static final class c extends n0 implements ld.l<Integer, androidx.compose.foundation.pager.d> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.x f6886b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f6887c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ r f6888d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f6889e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ j0 f6890f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ c.b f6891g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ c.InterfaceC0326c f6892h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f6893i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f6894j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.foundation.lazy.layout.x xVar, long j4, r rVar, long j5, j0 j0Var, c.b bVar, c.InterfaceC0326c interfaceC0326c, boolean z4, int i4) {
            super(1);
            this.f6886b = xVar;
            this.f6887c = j4;
            this.f6888d = rVar;
            this.f6889e = j5;
            this.f6890f = j0Var;
            this.f6891g = bVar;
            this.f6892h = interfaceC0326c;
            this.f6893i = z4;
            this.f6894j = i4;
        }

        @fg.l
        public final androidx.compose.foundation.pager.d a(int i4) {
            androidx.compose.foundation.lazy.layout.x xVar = this.f6886b;
            return s.h(xVar, i4, this.f6887c, this.f6888d, this.f6889e, this.f6890f, this.f6891g, this.f6892h, xVar.getLayoutDirection(), this.f6893i, this.f6894j);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ androidx.compose.foundation.pager.d invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: PagerMeasure.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/foundation/pager/d;", "a", "(I)Landroidx/compose/foundation/pager/d;"}, k = 3, mv = {1, 8, 0})
    static final class d extends n0 implements ld.l<Integer, androidx.compose.foundation.pager.d> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.x f6895b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f6896c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ r f6897d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f6898e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ j0 f6899f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ c.b f6900g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ c.InterfaceC0326c f6901h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f6902i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f6903j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.foundation.lazy.layout.x xVar, long j4, r rVar, long j5, j0 j0Var, c.b bVar, c.InterfaceC0326c interfaceC0326c, boolean z4, int i4) {
            super(1);
            this.f6895b = xVar;
            this.f6896c = j4;
            this.f6897d = rVar;
            this.f6898e = j5;
            this.f6899f = j0Var;
            this.f6900g = bVar;
            this.f6901h = interfaceC0326c;
            this.f6902i = z4;
            this.f6903j = i4;
        }

        @fg.l
        public final androidx.compose.foundation.pager.d a(int i4) {
            androidx.compose.foundation.lazy.layout.x xVar = this.f6895b;
            return s.h(xVar, i4, this.f6896c, this.f6897d, this.f6898e, this.f6899f, this.f6900g, this.f6901h, xVar.getLayoutDirection(), this.f6902i, this.f6903j);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ androidx.compose.foundation.pager.d invoke(Integer num) {
            return a(num.intValue());
        }
    }

    private static final androidx.compose.foundation.pager.d b(int i4, List<androidx.compose.foundation.pager.d> list, int i5, int i6, int i7, androidx.compose.foundation.gestures.snapping.l lVar) {
        androidx.compose.foundation.pager.d dVar;
        if (list.isEmpty()) {
            dVar = null;
        } else {
            androidx.compose.foundation.pager.d dVar2 = list.get(0);
            androidx.compose.foundation.pager.d dVar3 = dVar2;
            float f4 = -Math.abs(androidx.compose.foundation.gestures.snapping.m.a(i4, i5, i6, i7, dVar3.getOffset(), dVar3.getIndex(), lVar));
            int J = kotlin.collections.w.J(list);
            int i10 = 1;
            if (1 <= J) {
                while (true) {
                    androidx.compose.foundation.pager.d dVar4 = list.get(i10);
                    androidx.compose.foundation.pager.d dVar5 = dVar4;
                    float f5 = -Math.abs(androidx.compose.foundation.gestures.snapping.m.a(i4, i5, i6, i7, dVar5.getOffset(), dVar5.getIndex(), lVar));
                    if (Float.compare(f4, f5) < 0) {
                        dVar2 = dVar4;
                        f4 = f5;
                    }
                    if (i10 == J) {
                        break;
                    }
                    i10++;
                }
            }
            dVar = dVar2;
        }
        return dVar;
    }

    private static final List<androidx.compose.foundation.pager.d> c(androidx.compose.foundation.lazy.layout.x xVar, List<androidx.compose.foundation.pager.d> list, List<androidx.compose.foundation.pager.d> list2, List<androidx.compose.foundation.pager.d> list3, int i4, int i5, int i6, int i7, int i10, j0 j0Var, boolean z4, androidx.compose.ui.unit.d dVar, int i11, int i12) {
        int i13;
        int i14;
        int i15 = i10;
        int i16 = i12 + i11;
        if (j0Var == j0.Vertical) {
            i13 = i7;
            i14 = i5;
        } else {
            i13 = i7;
            i14 = i4;
        }
        boolean z5 = i6 < Math.min(i14, i13);
        if (z5 && i15 != 0) {
            throw new IllegalStateException(android.support.v4.media.a.a("non-zero pagesScrollOffset=", i15).toString());
        }
        ArrayList arrayList = new ArrayList(list3.size() + list2.size() + list.size());
        if (!z5) {
            int size = list2.size();
            int i17 = i15;
            for (int i18 = 0; i18 < size; i18++) {
                androidx.compose.foundation.pager.d dVar2 = list2.get(i18);
                i17 -= i16;
                dVar2.i(i17, i4, i5);
                arrayList.add(dVar2);
            }
            int size2 = list.size();
            for (int i19 = 0; i19 < size2; i19++) {
                androidx.compose.foundation.pager.d dVar3 = list.get(i19);
                dVar3.i(i15, i4, i5);
                arrayList.add(dVar3);
                i15 += i16;
            }
            int size3 = list3.size();
            for (int i20 = 0; i20 < size3; i20++) {
                androidx.compose.foundation.pager.d dVar4 = list3.get(i20);
                dVar4.i(i15, i4, i5);
                arrayList.add(dVar4);
                i15 += i16;
            }
        } else {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("No extra pages");
            }
            int size4 = list.size();
            int[] iArr = new int[size4];
            for (int i21 = 0; i21 < size4; i21++) {
                iArr[i21] = i12;
            }
            int[] iArr2 = new int[size4];
            for (int i22 = 0; i22 < size4; i22++) {
                iArr2[i22] = 0;
            }
            i.f n4 = i.a.f5083a.n(xVar.R(i11));
            if (j0Var == j0.Vertical) {
                n4.d(dVar, i14, iArr, iArr2);
            } else {
                n4.e(dVar, i14, iArr, androidx.compose.ui.unit.w.Ltr, iArr2);
            }
            kotlin.ranges.j le2 = kotlin.collections.l.le(iArr2);
            if (z4) {
                le2 = kotlin.ranges.s.q1(le2);
            }
            int first = le2.getFirst();
            int last = le2.getLast();
            int step = le2.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int i23 = iArr2[first];
                    androidx.compose.foundation.pager.d dVar5 = list.get(d(first, z4, size4));
                    if (z4) {
                        i23 = (i14 - i23) - dVar5.getSize();
                    }
                    dVar5.i(i23, i4, i5);
                    arrayList.add(dVar5);
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        }
        return arrayList;
    }

    private static final int d(int i4, boolean z4, int i5) {
        return !z4 ? i4 : (i5 - i4) - 1;
    }

    private static final List<androidx.compose.foundation.pager.d> e(int i4, int i5, int i6, List<Integer> list, ld.l<? super Integer, androidx.compose.foundation.pager.d> lVar) {
        int min = Math.min(i6 + i4, i5 - 1);
        int i7 = i4 + 1;
        ArrayList arrayList = null;
        if (i7 <= min) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.invoke(Integer.valueOf(i7)));
                if (i7 == min) {
                    break;
                }
                i7++;
            }
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int intValue = list.get(i10).intValue();
            if (min + 1 <= intValue && intValue < i5) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.invoke(Integer.valueOf(intValue)));
            }
        }
        return arrayList == null ? kotlin.collections.j0.f74919b : arrayList;
    }

    private static final List<androidx.compose.foundation.pager.d> f(int i4, int i5, List<Integer> list, ld.l<? super Integer, androidx.compose.foundation.pager.d> lVar) {
        int max = Math.max(0, i4 - i5);
        int i6 = i4 - 1;
        ArrayList arrayList = null;
        if (max <= i6) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.invoke(Integer.valueOf(i6)));
                if (i6 == max) {
                    break;
                }
                i6--;
            }
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            int intValue = list.get(i7).intValue();
            if (intValue < max) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.invoke(Integer.valueOf(intValue)));
            }
        }
        return arrayList == null ? kotlin.collections.j0.f74919b : arrayList;
    }

    private static final void g(ld.a<String> aVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.pager.d h(androidx.compose.foundation.lazy.layout.x xVar, int i4, long j4, r rVar, long j5, j0 j0Var, c.b bVar, c.InterfaceC0326c interfaceC0326c, androidx.compose.ui.unit.w wVar, boolean z4, int i5) {
        return new androidx.compose.foundation.pager.d(i4, i5, xVar.p1(i4, j4), j5, rVar.d(i4), j0Var, bVar, interfaceC0326c, wVar, z4, null);
    }

    @fg.l
    public static final u i(@fg.l androidx.compose.foundation.lazy.layout.x xVar, int i4, @fg.l r rVar, int i5, int i6, int i7, int i10, int i11, int i12, long j4, @fg.l j0 j0Var, @fg.m c.InterfaceC0326c interfaceC0326c, @fg.m c.b bVar, boolean z4, long j5, int i13, int i14, @fg.l List<Integer> list, @fg.l androidx.compose.foundation.gestures.snapping.l lVar, @fg.l androidx.compose.runtime.k2<k2> k2Var, @fg.l ld.q<? super Integer, ? super Integer, ? super ld.l<? super i1.a, k2>, ? extends androidx.compose.ui.layout.n0> qVar) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        long j6;
        int i23;
        List<androidx.compose.foundation.pager.d> list2;
        int i24;
        int i25;
        int i26;
        if (i6 < 0) {
            throw new IllegalArgumentException("negative beforeContentPadding");
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("negative afterContentPadding");
        }
        int i27 = i13 + i10;
        int i28 = i27 < 0 ? 0 : i27;
        if (i4 <= 0) {
            return new u(kotlin.collections.j0.f74919b, i13, i10, i7, j0Var, -i6, i5 + i7, false, i14, null, null, 0.0f, 0, false, qVar.R(Integer.valueOf(androidx.compose.ui.unit.b.r(j4)), Integer.valueOf(androidx.compose.ui.unit.b.q(j4)), a.f6883b), false);
        }
        j0 j0Var2 = j0.Vertical;
        long b5 = androidx.compose.ui.unit.c.b(0, j0Var == j0Var2 ? androidx.compose.ui.unit.b.p(j4) : i13, 0, j0Var != j0Var2 ? androidx.compose.ui.unit.b.o(j4) : i13, 5, null);
        int i29 = i11;
        int i30 = i12;
        while (i29 > 0 && i30 > 0) {
            i29--;
            i30 -= i28;
        }
        int i31 = i30 * (-1);
        if (i29 >= i4) {
            i29 = i4 - 1;
            i31 = 0;
        }
        kotlin.collections.k kVar = new kotlin.collections.k();
        int i32 = -i6;
        if (i10 < 0) {
            i16 = i10;
            i15 = i29;
        } else {
            i15 = i29;
            i16 = 0;
        }
        int i33 = i32 + i16;
        int i34 = 0;
        int i35 = i31 + i33;
        int i36 = i15;
        while (i35 < 0 && i36 > 0) {
            int i37 = i36 - 1;
            androidx.compose.foundation.pager.d h4 = h(xVar, i37, b5, rVar, j5, j0Var, bVar, interfaceC0326c, xVar.getLayoutDirection(), z4, i13);
            kVar.add(0, h4);
            i34 = Math.max(i34, h4.getCrossAxisSize());
            i35 += i28;
            i36 = i37;
        }
        if (i35 < i33) {
            i35 = i33;
        }
        int i38 = i35 - i33;
        int i39 = i5 + i7;
        int i40 = i39 < 0 ? 0 : i39;
        int i41 = i36;
        int i42 = i41;
        boolean z5 = false;
        int i43 = -i38;
        int i44 = 0;
        while (i44 < kVar.getSize()) {
            if (i43 >= i40) {
                kVar.c(i44);
                z5 = true;
            } else {
                i42++;
                i43 += i28;
                i44++;
            }
        }
        int i45 = i38;
        boolean z6 = z5;
        int i46 = i42;
        while (i46 < i4 && (i43 < i40 || i43 <= 0 || kVar.isEmpty())) {
            int i47 = i40;
            androidx.compose.foundation.pager.d h5 = h(xVar, i46, b5, rVar, j5, j0Var, bVar, interfaceC0326c, xVar.getLayoutDirection(), z4, i13);
            int i48 = i4 - 1;
            i43 += i46 == i48 ? i13 : i28;
            if (i43 > i33 || i46 == i48) {
                i34 = Math.max(i34, h5.getCrossAxisSize());
                kVar.addLast(h5);
                i26 = i41;
            } else {
                i26 = i46 + 1;
                i45 -= i28;
                z6 = true;
            }
            i46++;
            i41 = i26;
            i40 = i47;
        }
        if (i43 < i5) {
            int i49 = i5 - i43;
            i43 += i49;
            i17 = i45 - i49;
            i19 = i41;
            while (i17 < i6 && i19 > 0) {
                i19--;
                androidx.compose.foundation.pager.d h6 = h(xVar, i19, b5, rVar, j5, j0Var, bVar, interfaceC0326c, xVar.getLayoutDirection(), z4, i13);
                kVar.add(0, h6);
                i34 = Math.max(i34, h6.getCrossAxisSize());
                i17 += i28;
            }
            if (i17 < 0) {
                i43 += i17;
                i18 = i34;
                i17 = 0;
            } else {
                i18 = i34;
            }
        } else {
            i17 = i45;
            i18 = i34;
            i19 = i41;
        }
        int i50 = i43;
        if (i17 < 0) {
            throw new IllegalArgumentException("invalid currentFirstPageScrollOffset");
        }
        int i51 = -i17;
        androidx.compose.foundation.pager.d dVar = (androidx.compose.foundation.pager.d) kVar.first();
        if (i6 > 0 || i10 < 0) {
            int size = kVar.getSize();
            i20 = i18;
            int i52 = i17;
            int i53 = 0;
            while (i53 < size && i52 != 0 && i28 <= i52) {
                i21 = i51;
                if (i53 == kotlin.collections.w.J(kVar)) {
                    break;
                }
                i52 -= i28;
                i53++;
                dVar = (androidx.compose.foundation.pager.d) kVar.get(i53);
                i51 = i21;
            }
            i21 = i51;
            i22 = i52;
        } else {
            i22 = i17;
            i20 = i18;
            i21 = i51;
        }
        androidx.compose.foundation.pager.d dVar2 = dVar;
        List<androidx.compose.foundation.pager.d> f4 = f(i19, i14, list, new d(xVar, b5, rVar, j5, j0Var, bVar, interfaceC0326c, z4, i13));
        int i54 = i20;
        int i55 = 0;
        for (int size2 = f4.size(); i55 < size2; size2 = size2) {
            i54 = Math.max(i54, f4.get(i55).getCrossAxisSize());
            i55++;
        }
        List<androidx.compose.foundation.pager.d> e4 = e(((androidx.compose.foundation.pager.d) kVar.last()).getIndex(), i4, i14, list, new c(xVar, b5, rVar, j5, j0Var, bVar, interfaceC0326c, z4, i13));
        int size3 = e4.size();
        for (int i56 = 0; i56 < size3; i56++) {
            i54 = Math.max(i54, e4.get(i56).getCrossAxisSize());
        }
        boolean z7 = l0.g(dVar2, kVar.first()) && f4.isEmpty() && e4.isEmpty();
        j0 j0Var3 = j0.Vertical;
        if (j0Var == j0Var3) {
            j6 = j4;
            i23 = i54;
        } else {
            j6 = j4;
            i23 = i54;
            i54 = i50;
        }
        int g4 = androidx.compose.ui.unit.c.g(j6, i54);
        int f5 = androidx.compose.ui.unit.c.f(j6, j0Var == j0Var3 ? i50 : i23);
        int i57 = i28;
        int i58 = i46;
        List<androidx.compose.foundation.pager.d> c5 = c(xVar, kVar, f4, e4, g4, f5, i50, i5, i21, j0Var, z4, xVar, i10, i13);
        if (z7) {
            list2 = c5;
        } else {
            ArrayList arrayList = new ArrayList(c5.size());
            int size4 = c5.size();
            for (int i59 = 0; i59 < size4; i59++) {
                androidx.compose.foundation.pager.d dVar3 = c5.get(i59);
                androidx.compose.foundation.pager.d dVar4 = dVar3;
                if (dVar4.getIndex() >= ((androidx.compose.foundation.pager.d) kVar.first()).getIndex() && dVar4.getIndex() <= ((androidx.compose.foundation.pager.d) kVar.last()).getIndex()) {
                    arrayList.add(dVar3);
                }
            }
            list2 = arrayList;
        }
        androidx.compose.foundation.pager.d b6 = b(j0Var == j0.Vertical ? f5 : g4, list2, i6, i7, i57, lVar);
        if (b6 != null) {
            i25 = b6.getOffset();
            i24 = i57;
        } else {
            i24 = i57;
            i25 = 0;
        }
        return new u(list2, i13, i10, i7, j0Var, i32, i39, z4, i14, dVar2, b6, i24 == 0 ? 0.0f : kotlin.ranges.s.H((-i25) / i24, -0.5f, 0.5f), i22, i58 < i4 || i50 > i5, qVar.R(Integer.valueOf(g4), Integer.valueOf(f5), new b(c5, k2Var)), z6);
    }
}
