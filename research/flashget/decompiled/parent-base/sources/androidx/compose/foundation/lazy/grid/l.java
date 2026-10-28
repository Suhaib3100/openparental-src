package androidx.compose.foundation.lazy.grid;

import androidx.collection.j2;
import androidx.collection.k2;
import androidx.collection.x2;
import androidx.collection.z2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: LazyGridItemPlacementAnimator.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJS\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u0003J\u001f\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010)R\u0016\u0010-\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00010.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010/R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00102R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00102R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00102R\u0018\u00108\u001a\u00020\u0018*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u00107¨\u00069"}, d2 = {"Landroidx/compose/foundation/lazy/grid/l;", "", "<init>", "()V", "Landroidx/compose/foundation/lazy/grid/x;", "item", "", "mainAxisOffset", "Landroidx/compose/foundation/lazy/grid/d;", "itemInfo", "Lkotlin/k2;", "d", "(Landroidx/compose/foundation/lazy/grid/x;ILandroidx/compose/foundation/lazy/grid/d;)V", "h", "(Landroidx/compose/foundation/lazy/grid/x;)V", "consumedScroll", "layoutWidth", "layoutHeight", "", "positionedItems", "Landroidx/compose/foundation/lazy/grid/z;", "itemProvider", "Landroidx/compose/foundation/lazy/grid/j0;", "spanLayoutProvider", "", "isVertical", "Lkotlinx/coroutines/r0;", "coroutineScope", "f", "(IIILjava/util/List;Landroidx/compose/foundation/lazy/grid/z;Landroidx/compose/foundation/lazy/grid/j0;ZLkotlinx/coroutines/r0;)V", "g", "key", "placeableIndex", "Landroidx/compose/foundation/lazy/layout/h;", "b", "(Ljava/lang/Object;I)Landroidx/compose/foundation/lazy/layout/h;", "Landroidx/collection/j2;", "a", "Landroidx/collection/j2;", "keyToItemInfoMap", "Landroidx/compose/foundation/lazy/layout/v;", "Landroidx/compose/foundation/lazy/layout/v;", "keyIndexMap", "c", "I", "firstVisibleIndex", "Landroidx/collection/k2;", "Landroidx/collection/k2;", "movingAwayKeys", "e", "Ljava/util/List;", "movingInFromStartBound", "movingInFromEndBound", "movingAwayToStartBound", "movingAwayToEndBound", "(Landroidx/compose/foundation/lazy/grid/x;)Z", "hasAnimations", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyGridItemPlacementAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 ScatterSet.kt\nandroidx/collection/ScatterSet\n*L\n1#1,368:1\n101#2,2:369\n33#2,6:371\n103#2:377\n33#2,4:403\n38#2:411\n33#2,6:414\n33#2,6:422\n33#2,6:459\n33#2,6:467\n405#3,3:378\n363#3,6:381\n373#3,3:388\n376#3,2:392\n409#3,2:394\n379#3,6:396\n411#3:402\n1810#4:387\n1672#4:391\n1810#4:439\n1672#4:443\n1#5:407\n13579#6:408\n13580#6:410\n12744#6,2:447\n13579#6:473\n13580#6:476\n13579#6:477\n13580#6:479\n86#7:409\n79#7:474\n86#7:475\n79#7:478\n1011#8,2:412\n1002#8,2:420\n1011#8,2:457\n1002#8,2:465\n267#9,4:428\n237#9,7:432\n248#9,3:440\n251#9,2:444\n272#9:446\n273#9:449\n254#9,6:450\n274#9:456\n*S KotlinDebug\n*F\n+ 1 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n*L\n68#1:369,2\n68#1:371,6\n68#1:377\n91#1:403,4\n91#1:411\n138#1:414,6\n155#1:422,6\n206#1:459,6\n232#1:467,6\n89#1:378,3\n89#1:381,6\n89#1:388,3\n89#1:392,2\n89#1:394,2\n89#1:396,6\n89#1:402\n89#1:387\n89#1:391\n169#1:439\n169#1:443\n117#1:408\n117#1:410\n189#1:447,2\n286#1:473\n286#1:476\n297#1:477\n297#1:479\n121#1:409\n289#1:474\n290#1:475\n304#1:478\n137#1:412,2\n154#1:420,2\n205#1:457,2\n231#1:465,2\n169#1:428,4\n169#1:432,7\n169#1:440,3\n169#1:444,2\n169#1:446\n169#1:449\n169#1:450,6\n169#1:456\n*E\n"})
/* loaded from: classes.dex */
public final class l {

    /* renamed from: i, reason: collision with root package name */
    public static final int f5764i = 8;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int firstVisibleIndex;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j2<Object, androidx.compose.foundation.lazy.grid.d> keyToItemInfoMap = x2.t();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.foundation.lazy.layout.v keyIndexMap = androidx.compose.foundation.lazy.layout.v.INSTANCE;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2<Object> movingAwayKeys = z2.b();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<x> movingInFromStartBound = new ArrayList();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<x> movingInFromEndBound = new ArrayList();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<x> movingAwayToStartBound = new ArrayList();

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<x> movingAwayToEndBound = new ArrayList();

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n*L\n1#1,328:1\n154#2:329\n*E\n"})
    public static final class a<T> implements Comparator {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.v f5773b;

        public a(androidx.compose.foundation.lazy.layout.v vVar) {
            this.f5773b = vVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            return kotlin.comparisons.a.l(Integer.valueOf(this.f5773b.c(((x) t4).getKey())), Integer.valueOf(this.f5773b.c(((x) t5).getKey())));
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n*L\n1#1,328:1\n231#2:329\n*E\n"})
    public static final class b<T> implements Comparator {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            return kotlin.comparisons.a.l(Integer.valueOf(l.this.keyIndexMap.c(((x) t4).getKey())), Integer.valueOf(l.this.keyIndexMap.c(((x) t5).getKey())));
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$c", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n*L\n1#1,328:1\n137#2:329\n*E\n"})
    public static final class c<T> implements Comparator {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.v f5775b;

        public c(androidx.compose.foundation.lazy.layout.v vVar) {
            this.f5775b = vVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            return kotlin.comparisons.a.l(Integer.valueOf(this.f5775b.c(((x) t5).getKey())), Integer.valueOf(this.f5775b.c(((x) t4).getKey())));
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$c", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n*L\n1#1,328:1\n205#2:329\n*E\n"})
    public static final class d<T> implements Comparator {
        public d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            return kotlin.comparisons.a.l(Integer.valueOf(l.this.keyIndexMap.c(((x) t5).getKey())), Integer.valueOf(l.this.keyIndexMap.c(((x) t4).getKey())));
        }
    }

    private final boolean c(x xVar) {
        androidx.compose.foundation.lazy.layout.j c5;
        int o4 = xVar.o();
        for (int i4 = 0; i4 < o4; i4++) {
            c5 = m.c(xVar.n(i4));
            if (c5 != null) {
                return true;
            }
        }
        return false;
    }

    private final void d(x item, int mainAxisOffset, androidx.compose.foundation.lazy.grid.d itemInfo) {
        long offset = item.getOffset();
        long g4 = item.getIsVertical() ? androidx.compose.ui.unit.q.g(offset, 0, mainAxisOffset, 1, null) : androidx.compose.ui.unit.q.g(offset, mainAxisOffset, 0, 2, null);
        for (androidx.compose.foundation.lazy.layout.h hVar : itemInfo.getAnimations()) {
            if (hVar != null) {
                long offset2 = item.getOffset();
                long a5 = androidx.compose.ui.unit.r.a(androidx.compose.ui.unit.q.m(offset2) - ((int) (offset >> 32)), ((int) (offset2 & 4294967295L)) - ((int) (offset & 4294967295L)));
                hVar.A(androidx.compose.ui.unit.r.a(((int) (g4 >> 32)) + ((int) (a5 >> 32)), ((int) (g4 & 4294967295L)) + ((int) (a5 & 4294967295L))));
            }
        }
    }

    static /* synthetic */ void e(l lVar, x xVar, int i4, androidx.compose.foundation.lazy.grid.d dVar, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            androidx.compose.foundation.lazy.grid.d p4 = lVar.keyToItemInfoMap.p(xVar.getKey());
            kotlin.jvm.internal.l0.m(p4);
            dVar = p4;
        }
        lVar.d(xVar, i4, dVar);
    }

    private final void h(x item) {
        androidx.compose.foundation.lazy.grid.d p4 = this.keyToItemInfoMap.p(item.getKey());
        kotlin.jvm.internal.l0.m(p4);
        for (androidx.compose.foundation.lazy.layout.h hVar : p4.getAnimations()) {
            if (hVar != null) {
                long offset = item.getOffset();
                long rawOffset = hVar.getRawOffset();
                androidx.compose.foundation.lazy.layout.h.INSTANCE.getClass();
                if (!androidx.compose.ui.unit.q.j(rawOffset, androidx.compose.foundation.lazy.layout.h.f6001o) && !androidx.compose.ui.unit.q.j(rawOffset, offset)) {
                    hVar.i(androidx.compose.ui.unit.r.a(((int) (offset >> 32)) - ((int) (rawOffset >> 32)), ((int) (offset & 4294967295L)) - ((int) (rawOffset & 4294967295L))));
                }
                hVar.A(offset);
            }
        }
    }

    @fg.m
    public final androidx.compose.foundation.lazy.layout.h b(@fg.l Object key, int placeableIndex) {
        androidx.compose.foundation.lazy.grid.d p4;
        androidx.compose.foundation.lazy.layout.h[] animations;
        if (this.keyToItemInfoMap.x() || (p4 = this.keyToItemInfoMap.p(key)) == null || (animations = p4.getAnimations()) == null) {
            return null;
        }
        return animations[placeableIndex];
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x027a, code lost:
    
        if (r3 != r0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x027c, code lost:
    
        r14 = r0;
        r15 = java.lang.Math.max(r1, r13.getMainAxisSize());
        r24 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0292, code lost:
    
        e(r33, r13, r25 + r24, null, 4, null);
        h(r13);
        r12 = r12 + 1;
        r0 = r14;
        r1 = r15;
        r2 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0289, code lost:
    
        r15 = r13.getMainAxisSize();
        r24 = r2 + r1;
        r14 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0274, code lost:
    
        r3 = r13.getColumn();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02a7, code lost:
    
        r0 = r33.movingAwayKeys;
        r1 = r0.elements;
        r0 = r0.metadata;
        r2 = r0.length - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02b0, code lost:
    
        if (r2 < 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        r33.firstVisibleIndex = r2;
        r10 = r33.keyIndexMap;
        r33.keyIndexMap = r38.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02b2, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02b3, code lost:
    
        r4 = r0[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02bd, code lost:
    
        if (((((~r4) << 7) & r4) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02bf, code lost:
    
        r10 = 8 - ((~(r3 - r2)) >>> 31);
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02c9, code lost:
    
        if (r11 >= r10) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02d3, code lost:
    
        if ((r4 & 255) >= 128) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02d5, code lost:
    
        r14 = r1[(r3 << 3) + r11];
        r15 = r33.keyToItemInfoMap.p(r14);
        kotlin.jvm.internal.l0.m(r15);
        r15 = r15;
        r12 = r33.keyIndexMap.c(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02eb, code lost:
    
        if (r12 != r9) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02ed, code lost:
    
        r33.keyToItemInfoMap.k0(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        if (r40 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02f4, code lost:
    
        if (r40 == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02f6, code lost:
    
        r26 = androidx.compose.ui.unit.b.INSTANCE.e(r15.getCrossAxisSize());
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x030e, code lost:
    
        r9 = androidx.compose.foundation.lazy.grid.z.c(r38, r12, 0, r26, 2, null);
        r9.t(r7);
        r13 = r15.getAnimations();
        r15 = r13.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0325, code lost:
    
        if (r7 >= r15) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0327, code lost:
    
        r26 = r13[r7];
        r27 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x032b, code lost:
    
        if (r26 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x032d, code lost:
    
        r0 = r26.t();
        r26 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0334, code lost:
    
        if (r0 != true) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        r11 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0352, code lost:
    
        if (r12 >= r33.firstVisibleIndex) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0354, code lost:
    
        r33.movingAwayToStartBound.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0367, code lost:
    
        r4 = r4 >> 8;
        r11 = r11 + 1;
        r1 = r26;
        r0 = r27;
        r7 = true;
        r9 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x035a, code lost:
    
        r33.movingAwayToEndBound.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0339, code lost:
    
        r7 = r7 + 1;
        r1 = r26;
        r0 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0337, code lost:
    
        r26 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (r40 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0340, code lost:
    
        r27 = r0;
        r26 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0348, code lost:
    
        if (r12 != r8.c(r14)) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x034a, code lost:
    
        r33.keyToItemInfoMap.k0(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0303, code lost:
    
        r26 = androidx.compose.ui.unit.b.INSTANCE.d(r15.getCrossAxisSize());
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0362, code lost:
    
        r27 = r0;
        r26 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0372, code lost:
    
        r27 = r0;
        r26 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x037a, code lost:
    
        if (r10 != 8) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0385, code lost:
    
        if (r3 == r2) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r2 = androidx.compose.ui.unit.r.a(0, r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0387, code lost:
    
        r3 = r3 + 1;
        r1 = r26;
        r0 = r27;
        r7 = true;
        r9 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x037d, code lost:
    
        r27 = r0;
        r26 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0391, code lost:
    
        r0 = r33.movingAwayToStartBound;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0398, code lost:
    
        if (r0.size() <= 1) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x039a, code lost:
    
        kotlin.collections.w.p0(r0, new androidx.compose.foundation.lazy.grid.l.d(r33));
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x03a2, code lost:
    
        r0 = r33.movingAwayToStartBound;
        r1 = r0.size();
        r2 = 0;
        r3 = -1;
        r4 = 0;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x03ac, code lost:
    
        if (r2 >= r1) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x03ae, code lost:
    
        r7 = r0.get(r2);
        r8 = r39.d(r7.getIndex());
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        r0 = r33.keyToItemInfoMap;
        r4 = r0.keys;
        r0 = r0.metadata;
        r5 = r0.length - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x03bf, code lost:
    
        if (r8 == (-1)) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03c1, code lost:
    
        if (r8 != r3) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x03c3, code lost:
    
        r4 = java.lang.Math.max(r4, r7.getMainAxisSize());
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03d3, code lost:
    
        r9 = (0 - r5) - r7.getMainAxisSize();
        r8 = r33.keyToItemInfoMap.p(r7.getKey());
        kotlin.jvm.internal.l0.m(r8);
        r7.r(r9, r8.getCrossAxisOffset(), r35, r36, (r16 & 16) != 0 ? -1 : 0, (r16 & 32) != 0 ? -1 : 0);
        r37.add(r7);
        h(r7);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x03cc, code lost:
    
        r5 = r5 + r4;
        r4 = r7.getMainAxisSize();
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x040b, code lost:
    
        r0 = r33.movingAwayToEndBound;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0414, code lost:
    
        if (r0.size() <= 1) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        if (r5 < 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0416, code lost:
    
        kotlin.collections.w.p0(r0, new androidx.compose.foundation.lazy.grid.l.b(r33));
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x041e, code lost:
    
        r0 = r33.movingAwayToEndBound;
        r1 = r0.size();
        r2 = -1;
        r3 = 0;
        r9 = 0;
        r19 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0429, code lost:
    
        if (r9 >= r1) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x042b, code lost:
    
        r4 = r0.get(r9);
        r5 = r39.d(r4.getIndex());
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x043c, code lost:
    
        if (r5 == (-1)) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x043e, code lost:
    
        if (r5 != r2) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0440, code lost:
    
        r3 = java.lang.Math.max(r3, r4.getMainAxisSize());
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0451, code lost:
    
        r5 = r33.keyToItemInfoMap.p(r4.getKey());
        kotlin.jvm.internal.l0.m(r5);
        r4.r(r25 + r19, r5.getCrossAxisOffset(), r35, r36, (r16 & 16) != 0 ? -1 : 0, (r16 & 32) != 0 ? -1 : 0);
        r37.add(r4);
        h(r4);
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0449, code lost:
    
        r19 = r19 + r3;
        r3 = r4.getMainAxisSize();
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0481, code lost:
    
        r33.movingInFromStartBound.clear();
        r33.movingInFromEndBound.clear();
        r33.movingAwayToStartBound.clear();
        r33.movingAwayToEndBound.clear();
        r33.movingAwayKeys.K();
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x049a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x01f5, code lost:
    
        r8 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x00b6, code lost:
    
        r25 = r0;
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x00c4, code lost:
    
        r13 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0054, code lost:
    
        r2 = androidx.compose.ui.unit.r.a(r34, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        r14 = r0[r12];
        r13 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x004b, code lost:
    
        r11 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x003b, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        if (((((~r14) << 7) & r14) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        r9 = 8 - ((~(r12 - r5)) >>> 31);
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        if (r10 >= r9) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
    
        if ((r14 & 255) >= 128) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
    
        r25 = r0;
        r24 = r4;
        r33.movingAwayKeys.C(r4[(r12 << 3) + r10]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a5, code lost:
    
        r14 = r14 >> 8;
        r10 = r10 + 1;
        r4 = r24;
        r0 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
    
        r25 = r0;
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ad, code lost:
    
        r25 = r0;
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b3, code lost:
    
        if (r9 != 8) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ba, code lost:
    
        if (r12 == r5) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bc, code lost:
    
        r12 = r12 + 1;
        r10 = r13;
        r4 = r24;
        r0 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c5, code lost:
    
        r0 = r37.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ca, code lost:
    
        r9 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cb, code lost:
    
        if (r4 >= r0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cd, code lost:
    
        r5 = r7.get(r4);
        r33.movingAwayKeys.c0(r5.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e0, code lost:
    
        if (c(r5) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e2, code lost:
    
        r10 = r33.keyToItemInfoMap.p(r5.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ee, code lost:
    
        if (r10 != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f0, code lost:
    
        r10 = new androidx.compose.foundation.lazy.grid.d(r5.getCrossAxisSize(), r5.g());
        r10.f(r5, r41);
        r33.keyToItemInfoMap.q0(r5.getKey(), r10);
        r14 = r13.c(r5.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0113, code lost:
    
        if (r14 == (-1)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0119, code lost:
    
        if (r5.getIndex() == r14) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011b, code lost:
    
        if (r14 >= r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011d, code lost:
    
        r33.movingInFromStartBound.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0122, code lost:
    
        r24 = r0;
        r25 = r11;
        r26 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01cf, code lost:
    
        r4 = r4 + 1;
        r7 = r37;
        r0 = r24;
        r11 = r25;
        r13 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012a, code lost:
    
        r33.movingInFromEndBound.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0130, code lost:
    
        r14 = r5.getOffset();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (r5.getIsVertical() == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013a, code lost:
    
        r9 = androidx.compose.ui.unit.q.o(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0143, code lost:
    
        d(r5, r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013f, code lost:
    
        r9 = androidx.compose.ui.unit.q.m(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0147, code lost:
    
        r9 = r10.getAnimations();
        r14 = r9.length;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014f, code lost:
    
        if (r15 >= r14) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0151, code lost:
    
        r24 = r0;
        r0 = r9[r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0155, code lost:
    
        if (r0 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0157, code lost:
    
        r7 = r0.getRawOffset();
        androidx.compose.foundation.lazy.layout.h.INSTANCE.getClass();
        r25 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016a, code lost:
    
        if (androidx.compose.ui.unit.q.j(r7, androidx.compose.foundation.lazy.layout.h.f6001o) != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x016c, code lost:
    
        r7 = r0.getRawOffset();
        r26 = r13;
        r27 = r14;
        r0.A(androidx.compose.ui.unit.r.a(((int) (r7 >> 32)) + ((int) (r2 >> 32)), ((int) (r7 & 4294967295L)) + ((int) (4294967295L & r2))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0197, code lost:
    
        r15 = r15 + 1;
        r0 = r24;
        r11 = r25;
        r13 = r26;
        r14 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x018f, code lost:
    
        r26 = r13;
        r27 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0194, code lost:
    
        r25 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a8, code lost:
    
        r24 = r0;
        r25 = r11;
        r26 = r13;
        r10.e(r5.getCrossAxisSize());
        r10.d(r5.g());
        h(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01c0, code lost:
    
        r24 = r0;
        r25 = r11;
        r26 = r13;
        r33.keyToItemInfoMap.k0(r5.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01dd, code lost:
    
        r25 = r11;
        r26 = r13;
        r0 = r33.movingInFromStartBound;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01e8, code lost:
    
        if (r0.size() <= 1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ea, code lost:
    
        r8 = r26;
        kotlin.collections.w.p0(r0, new androidx.compose.foundation.lazy.grid.l.c(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01f7, code lost:
    
        r10 = r33.movingInFromStartBound;
        r11 = r10.size();
        r0 = -1;
        r1 = 0;
        r2 = 0;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0201, code lost:
    
        if (r12 >= r11) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0203, code lost:
    
        r13 = r10.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
    
        r1 = r33.firstVisibleIndex;
        r2 = (androidx.compose.foundation.lazy.grid.x) kotlin.collections.w.G2(r37);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x020a, code lost:
    
        if (r40 == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x020c, code lost:
    
        r3 = r13.getRow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0215, code lost:
    
        if (r3 == (-1)) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0217, code lost:
    
        if (r3 != r0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0219, code lost:
    
        r14 = r0;
        r15 = java.lang.Math.max(r1, r13.getMainAxisSize());
        r24 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x022f, code lost:
    
        e(r33, r13, (0 - r24) - r13.getMainAxisSize(), null, 4, null);
        h(r13);
        r12 = r12 + 1;
        r0 = r14;
        r1 = r15;
        r2 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0226, code lost:
    
        r15 = r13.getMainAxisSize();
        r24 = r2 + r1;
        r14 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0211, code lost:
    
        r3 = r13.getColumn();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r2 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x024a, code lost:
    
        r0 = r33.movingInFromEndBound;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0250, code lost:
    
        if (r0.size() <= 1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0252, code lost:
    
        kotlin.collections.w.p0(r0, new androidx.compose.foundation.lazy.grid.l.a(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x025a, code lost:
    
        r10 = r33.movingInFromEndBound;
        r11 = r10.size();
        r0 = -1;
        r1 = 0;
        r2 = 0;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0264, code lost:
    
        if (r12 >= r11) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0266, code lost:
    
        r13 = r10.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x026d, code lost:
    
        if (r40 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x026f, code lost:
    
        r3 = r13.getRow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0278, code lost:
    
        if (r3 == (-1)) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        r2 = r2.getIndex();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r34, int r35, int r36, @fg.l java.util.List<androidx.compose.foundation.lazy.grid.x> r37, @fg.l androidx.compose.foundation.lazy.grid.z r38, @fg.l androidx.compose.foundation.lazy.grid.j0 r39, boolean r40, @fg.l kotlinx.coroutines.r0 r41) {
        /*
            Method dump skipped, instructions count: 1179
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.l.f(int, int, int, java.util.List, androidx.compose.foundation.lazy.grid.z, androidx.compose.foundation.lazy.grid.j0, boolean, kotlinx.coroutines.r0):void");
    }

    public final void g() {
        this.keyToItemInfoMap.K();
        this.keyIndexMap = androidx.compose.foundation.lazy.layout.v.INSTANCE;
        this.firstVisibleIndex = -1;
    }
}
