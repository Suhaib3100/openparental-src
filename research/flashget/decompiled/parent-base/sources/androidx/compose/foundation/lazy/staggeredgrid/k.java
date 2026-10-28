package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.collection.j2;
import androidx.collection.k2;
import androidx.collection.x2;
import androidx.collection.z2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: LazyStaggeredGridItemPlacementAnimator.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJS\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u0003J\u001f\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010(R\u0016\u0010,\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00010-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010.R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00101R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00101R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00101R\u0018\u00107\u001a\u00020\u0016*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u00106¨\u00068"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/k;", "", "<init>", "()V", "Landroidx/compose/foundation/lazy/staggeredgrid/a0;", "item", "", "mainAxisOffset", "Landroidx/compose/foundation/lazy/staggeredgrid/a;", "itemInfo", "Lkotlin/k2;", "d", "(Landroidx/compose/foundation/lazy/staggeredgrid/a0;ILandroidx/compose/foundation/lazy/staggeredgrid/a;)V", "h", "(Landroidx/compose/foundation/lazy/staggeredgrid/a0;)V", "consumedScroll", "layoutWidth", "layoutHeight", "", "positionedItems", "Landroidx/compose/foundation/lazy/staggeredgrid/x;", "itemProvider", "", "isVertical", "laneCount", "Lkotlinx/coroutines/r0;", "coroutineScope", "f", "(IIILjava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/x;ZILkotlinx/coroutines/r0;)V", "g", "key", "placeableIndex", "Landroidx/compose/foundation/lazy/layout/h;", "b", "(Ljava/lang/Object;I)Landroidx/compose/foundation/lazy/layout/h;", "Landroidx/collection/j2;", "a", "Landroidx/collection/j2;", "keyToItemInfoMap", "Landroidx/compose/foundation/lazy/layout/v;", "Landroidx/compose/foundation/lazy/layout/v;", "keyIndexMap", "c", "I", "firstVisibleIndex", "Landroidx/collection/k2;", "Landroidx/collection/k2;", "movingAwayKeys", "e", "Ljava/util/List;", "movingInFromStartBound", "movingInFromEndBound", "movingAwayToStartBound", "movingAwayToEndBound", "(Landroidx/compose/foundation/lazy/staggeredgrid/a0;)Z", "hasAnimations", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyStaggeredGridItemPlacementAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 ScatterSet.kt\nandroidx/collection/ScatterSet\n*L\n1#1,329:1\n101#2,2:330\n33#2,6:332\n103#2:338\n33#2,4:364\n38#2:372\n33#2,6:375\n33#2,6:383\n33#2,6:420\n33#2,6:428\n405#3,3:339\n363#3,6:342\n373#3,3:349\n376#3,2:353\n409#3,2:355\n379#3,6:357\n411#3:363\n1810#4:348\n1672#4:352\n1810#4:400\n1672#4:404\n1#5:368\n13579#6:369\n13580#6:371\n12744#6,2:408\n13579#6:434\n13580#6:437\n13579#6:438\n13580#6:440\n86#7:370\n79#7:435\n86#7:436\n79#7:439\n1011#8,2:373\n1002#8,2:381\n1011#8,2:418\n1002#8,2:426\n267#9,4:389\n237#9,7:393\n248#9,3:401\n251#9,2:405\n272#9:407\n273#9:410\n254#9,6:411\n274#9:417\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator\n*L\n68#1:330,2\n68#1:332,6\n68#1:338\n91#1:364,4\n91#1:372\n138#1:375,6\n148#1:383,6\n188#1:420,6\n201#1:428,6\n89#1:339,3\n89#1:342,6\n89#1:349,3\n89#1:353,2\n89#1:355,2\n89#1:357,6\n89#1:363\n89#1:348\n89#1:352\n157#1:400\n157#1:404\n117#1:369\n117#1:371\n173#1:408,2\n243#1:434\n243#1:437\n254#1:438\n254#1:440\n121#1:370\n246#1:435\n247#1:436\n261#1:439\n137#1:373,2\n147#1:381,2\n187#1:418,2\n200#1:426,2\n157#1:389,4\n157#1:393,7\n157#1:401,3\n157#1:405,2\n157#1:407\n157#1:410\n157#1:411,6\n157#1:417\n*E\n"})
/* loaded from: classes.dex */
public final class k {

    /* renamed from: i, reason: collision with root package name */
    public static final int f6398i = 8;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int firstVisibleIndex;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j2<Object, androidx.compose.foundation.lazy.staggeredgrid.a> keyToItemInfoMap = x2.t();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.foundation.lazy.layout.v keyIndexMap = androidx.compose.foundation.lazy.layout.v.INSTANCE;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2<Object> movingAwayKeys = z2.b();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<a0> movingInFromStartBound = new ArrayList();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<a0> movingInFromEndBound = new ArrayList();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<a0> movingAwayToStartBound = new ArrayList();

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<a0> movingAwayToEndBound = new ArrayList();

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 LazyStaggeredGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator\n*L\n1#1,328:1\n147#2:329\n*E\n"})
    public static final class a<T> implements Comparator {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.v f6407b;

        public a(androidx.compose.foundation.lazy.layout.v vVar) {
            this.f6407b = vVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            return kotlin.comparisons.a.l(Integer.valueOf(this.f6407b.c(((a0) t4).getKey())), Integer.valueOf(this.f6407b.c(((a0) t5).getKey())));
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 LazyStaggeredGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator\n*L\n1#1,328:1\n200#2:329\n*E\n"})
    public static final class b<T> implements Comparator {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            return kotlin.comparisons.a.l(Integer.valueOf(k.this.keyIndexMap.c(((a0) t4).getKey())), Integer.valueOf(k.this.keyIndexMap.c(((a0) t5).getKey())));
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$c", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 LazyStaggeredGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator\n*L\n1#1,328:1\n137#2:329\n*E\n"})
    public static final class c<T> implements Comparator {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.v f6409b;

        public c(androidx.compose.foundation.lazy.layout.v vVar) {
            this.f6409b = vVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            return kotlin.comparisons.a.l(Integer.valueOf(this.f6409b.c(((a0) t5).getKey())), Integer.valueOf(this.f6409b.c(((a0) t4).getKey())));
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$c", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 LazyStaggeredGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator\n*L\n1#1,328:1\n187#2:329\n*E\n"})
    public static final class d<T> implements Comparator {
        public d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            return kotlin.comparisons.a.l(Integer.valueOf(k.this.keyIndexMap.c(((a0) t5).getKey())), Integer.valueOf(k.this.keyIndexMap.c(((a0) t4).getKey())));
        }
    }

    private final boolean c(a0 a0Var) {
        androidx.compose.foundation.lazy.layout.j c5;
        int n4 = a0Var.n();
        for (int i4 = 0; i4 < n4; i4++) {
            c5 = l.c(a0Var.m(i4));
            if (c5 != null) {
                return true;
            }
        }
        return false;
    }

    private final void d(a0 item, int mainAxisOffset, androidx.compose.foundation.lazy.staggeredgrid.a itemInfo) {
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

    static /* synthetic */ void e(k kVar, a0 a0Var, int i4, androidx.compose.foundation.lazy.staggeredgrid.a aVar, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            androidx.compose.foundation.lazy.staggeredgrid.a p4 = kVar.keyToItemInfoMap.p(a0Var.getKey());
            kotlin.jvm.internal.l0.m(p4);
            aVar = p4;
        }
        kVar.d(a0Var, i4, aVar);
    }

    private final void h(a0 item) {
        androidx.compose.foundation.lazy.staggeredgrid.a p4 = this.keyToItemInfoMap.p(item.getKey());
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
        androidx.compose.foundation.lazy.staggeredgrid.a p4;
        androidx.compose.foundation.lazy.layout.h[] animations;
        if (this.keyToItemInfoMap.x() || (p4 = this.keyToItemInfoMap.p(key)) == null || (animations = p4.getAnimations()) == null) {
            return null;
        }
        return animations[placeableIndex];
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02c2, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02c3, code lost:
    
        r4 = r0[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02cd, code lost:
    
        if (((((~r4) << 7) & r4) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02cf, code lost:
    
        r12 = 8 - ((~(r3 - r2)) >>> 31);
        r13 = r4;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02da, code lost:
    
        if (r4 >= r12) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02e4, code lost:
    
        if ((r13 & 255) >= 128) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02e6, code lost:
    
        r5 = r1[(r3 << 3) + r4];
        r15 = r29.keyToItemInfoMap.p(r5);
        kotlin.jvm.internal.l0.m(r15);
        r15 = r15;
        r9 = r29.keyIndexMap.c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02fc, code lost:
    
        if (r9 != r8) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02fe, code lost:
    
        r29.keyToItemInfoMap.k0(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        r29.firstVisibleIndex = r3;
        r9 = r29.keyIndexMap;
        r29.keyIndexMap = r34.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0304, code lost:
    
        r21 = r0;
        r22 = r1;
        r0 = r34.c(r9, androidx.compose.foundation.lazy.staggeredgrid.l0.b(r15.c(), r15.d()));
        r0.u(true);
        r15 = r15.a();
        r1 = r15.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0324, code lost:
    
        if (r8 >= r1) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0326, code lost:
    
        r25 = r15[r8];
        r26 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x032a, code lost:
    
        if (r25 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x032c, code lost:
    
        r35 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0333, code lost:
    
        if (r25.t() != true) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x034d, code lost:
    
        if (r9 >= r29.firstVisibleIndex) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x034f, code lost:
    
        r29.movingAwayToStartBound.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        if (r35 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0362, code lost:
    
        r13 = r13 >> 8;
        r4 = r4 + 1;
        r0 = r21;
        r1 = r22;
        r8 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0355, code lost:
    
        r29.movingAwayToEndBound.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0338, code lost:
    
        r8 = r8 + 1;
        r15 = r35;
        r1 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0336, code lost:
    
        r35 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0343, code lost:
    
        if (r9 != r11.c(r5)) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        r10 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0345, code lost:
    
        r29.keyToItemInfoMap.k0(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x035d, code lost:
    
        r21 = r0;
        r22 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x036d, code lost:
    
        r21 = r0;
        r22 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0377, code lost:
    
        if (r12 != 8) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0384, code lost:
    
        if (r3 == r2) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0386, code lost:
    
        r3 = r3 + 1;
        r0 = r21;
        r1 = r22;
        r8 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x037a, code lost:
    
        r21 = r0;
        r22 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (r35 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0398, code lost:
    
        if (r29.movingAwayToStartBound.isEmpty() != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x039a, code lost:
    
        r0 = r29.movingAwayToStartBound;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03a1, code lost:
    
        if (r0.size() <= 1) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03a3, code lost:
    
        kotlin.collections.w.p0(r0, new androidx.compose.foundation.lazy.staggeredgrid.k.d(r29));
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03ab, code lost:
    
        r0 = r29.movingAwayToStartBound;
        r1 = r0.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03b2, code lost:
    
        if (r2 >= r1) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03b4, code lost:
    
        r3 = r0.get(r2);
        r4 = r3.a();
        r7[r4] = r3.j() + r7[r4];
        r8 = 0 - r7[r3.a()];
        r4 = r29.keyToItemInfoMap.p(r3.getKey());
        kotlin.jvm.internal.l0.m(r4);
        r3.t(r8, r4.b(), r10);
        r33.add(r3);
        h(r3);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x03f1, code lost:
    
        r4 = r33;
        r5 = 0;
        kotlin.collections.l.T1(r7, 0, 0, 0, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r3 = androidx.compose.ui.unit.r.a(0, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x040f, code lost:
    
        if (r29.movingAwayToEndBound.isEmpty() != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0411, code lost:
    
        r0 = r29.movingAwayToEndBound;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0418, code lost:
    
        if (r0.size() <= 1) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x041a, code lost:
    
        kotlin.collections.w.p0(r0, new androidx.compose.foundation.lazy.staggeredgrid.k.b(r29));
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0422, code lost:
    
        r0 = r29.movingAwayToEndBound;
        r1 = r0.size();
        r8 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0429, code lost:
    
        if (r8 >= r1) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x042b, code lost:
    
        r2 = r0.get(r8);
        r3 = r7[r2.a()] + r10;
        r5 = r2.a();
        r7[r5] = r2.j() + r7[r5];
        r5 = r29.keyToItemInfoMap.p(r2.getKey());
        kotlin.jvm.internal.l0.m(r5);
        r2.t(r3, r5.b(), r10);
        r4.add(r2);
        h(r2);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0464, code lost:
    
        r29.movingInFromStartBound.clear();
        r29.movingInFromEndBound.clear();
        r29.movingAwayToStartBound.clear();
        r29.movingAwayToEndBound.clear();
        r29.movingAwayKeys.K();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        r0 = r29.keyToItemInfoMap;
        r5 = r0.f2412b;
        r0 = r0.f2411a;
        r11 = r0.length - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x047d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0404, code lost:
    
        r4 = r33;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0211, code lost:
    
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0258, code lost:
    
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x00b6, code lost:
    
        r22 = r0;
        r21 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x00c4, code lost:
    
        r13 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0054, code lost:
    
        r3 = androidx.compose.ui.unit.r.a(r30, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x004b, code lost:
    
        r10 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        if (r11 < 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x003b, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        r14 = r0[r12];
        r13 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        if (((((~r14) << 7) & r14) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        r8 = 8 - ((~(r12 - r11)) >>> 31);
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        if (r9 >= r8) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
    
        if ((r14 & 255) >= 128) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
    
        r22 = r0;
        r21 = r5;
        r29.movingAwayKeys.C(r5[(r12 << 3) + r9]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a5, code lost:
    
        r14 = r14 >> 8;
        r9 = r9 + 1;
        r5 = r21;
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
    
        r22 = r0;
        r21 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ad, code lost:
    
        r22 = r0;
        r21 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b3, code lost:
    
        if (r8 != 8) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ba, code lost:
    
        if (r12 == r11) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bc, code lost:
    
        r12 = r12 + 1;
        r9 = r13;
        r5 = r21;
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c5, code lost:
    
        r0 = r33.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ca, code lost:
    
        r8 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cb, code lost:
    
        if (r5 >= r0) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cd, code lost:
    
        r9 = r7.get(r5);
        r29.movingAwayKeys.c0(r9.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e0, code lost:
    
        if (c(r9) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e2, code lost:
    
        r11 = r29.keyToItemInfoMap.p(r9.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ee, code lost:
    
        if (r11 != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f0, code lost:
    
        r11 = new androidx.compose.foundation.lazy.staggeredgrid.a(r9.a(), r9.p(), r9.f());
        r11.h(r9, r37);
        r29.keyToItemInfoMap.q0(r9.getKey(), r11);
        r14 = r13.c(r9.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0117, code lost:
    
        if (r14 == (-1)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011d, code lost:
    
        if (r9.getIndex() == r14) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011f, code lost:
    
        if (r14 >= r2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0121, code lost:
    
        r29.movingInFromStartBound.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0126, code lost:
    
        r35 = r0;
        r14 = r2;
        r22 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01d8, code lost:
    
        r5 = r5 + 1;
        r7 = r33;
        r0 = r35;
        r1 = r36;
        r2 = r14;
        r13 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012d, code lost:
    
        r29.movingInFromEndBound.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0133, code lost:
    
        r14 = r9.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013b, code lost:
    
        if (r9.q() == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013d, code lost:
    
        r8 = androidx.compose.ui.unit.q.o(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0146, code lost:
    
        d(r9, r8, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0142, code lost:
    
        r8 = androidx.compose.ui.unit.q.m(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014a, code lost:
    
        r8 = r11.a();
        r14 = r8.length;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0152, code lost:
    
        if (r15 >= r14) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0154, code lost:
    
        r35 = r0;
        r0 = r8[r15];
        r21 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015a, code lost:
    
        if (r0 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015c, code lost:
    
        r7 = r0.getRawOffset();
        androidx.compose.foundation.lazy.layout.h.INSTANCE.getClass();
        r22 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016f, code lost:
    
        if (androidx.compose.ui.unit.q.j(r7, androidx.compose.foundation.lazy.layout.h.f6001o) != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0171, code lost:
    
        r7 = r0.getRawOffset();
        r23 = r14;
        r14 = r2;
        r0.A(androidx.compose.ui.unit.r.a(((int) (r7 >> 32)) + ((int) (r3 >> 32)), ((int) (r7 & 4294967295L)) + ((int) (4294967295L & r3))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x019a, code lost:
    
        r15 = r15 + 1;
        r0 = r35;
        r2 = r14;
        r8 = r21;
        r13 = r22;
        r14 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0193, code lost:
    
        r23 = r14;
        r14 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0197, code lost:
    
        r22 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ac, code lost:
    
        r35 = r0;
        r14 = r2;
        r22 = r13;
        r11.f(r9.a());
        r11.g(r9.p());
        r11.e(r9.f());
        h(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ca, code lost:
    
        r35 = r0;
        r14 = r2;
        r22 = r13;
        r29.keyToItemInfoMap.k0(r9.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01e5, code lost:
    
        r0 = r1;
        r22 = r13;
        r7 = new int[r0];
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01eb, code lost:
    
        if (r1 >= r0) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ed, code lost:
    
        r7[r1] = 0;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01fc, code lost:
    
        if (r29.movingInFromStartBound.isEmpty() != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
    
        r2 = r29.firstVisibleIndex;
        r3 = (androidx.compose.foundation.lazy.staggeredgrid.a0) kotlin.collections.w.G2(r33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01fe, code lost:
    
        r0 = r29.movingInFromStartBound;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0204, code lost:
    
        if (r0.size() <= 1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0206, code lost:
    
        r11 = r22;
        kotlin.collections.w.p0(r0, new androidx.compose.foundation.lazy.staggeredgrid.k.c(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0213, code lost:
    
        r12 = r29.movingInFromStartBound;
        r13 = r12.size();
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x021a, code lost:
    
        if (r14 >= r13) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x021c, code lost:
    
        r15 = r12.get(r14);
        r0 = r15.a();
        r7[r0] = r15.j() + r7[r0];
        e(r29, r15, 0 - r7[r15.a()], null, 4, null);
        h(r15);
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0248, code lost:
    
        kotlin.collections.l.T1(r7, 0, 0, 0, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0262, code lost:
    
        if (r29.movingInFromEndBound.isEmpty() != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r3 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0264, code lost:
    
        r0 = r29.movingInFromEndBound;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x026a, code lost:
    
        if (r0.size() <= 1) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x026c, code lost:
    
        kotlin.collections.w.p0(r0, new androidx.compose.foundation.lazy.staggeredgrid.k.a(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0274, code lost:
    
        r12 = r29.movingInFromEndBound;
        r13 = r12.size();
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x027b, code lost:
    
        if (r14 >= r13) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x027d, code lost:
    
        r15 = r12.get(r14);
        r2 = r10 + r7[r15.a()];
        r0 = r15.a();
        r7[r0] = r15.j() + r7[r0];
        e(r29, r15, r2, null, 4, null);
        h(r15);
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02a8, code lost:
    
        kotlin.collections.l.T1(r7, 0, 0, 0, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02b7, code lost:
    
        r0 = r29.movingAwayKeys;
        r1 = r0.f2472b;
        r0 = r0.f2471a;
        r2 = r0.length - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02c0, code lost:
    
        if (r2 < 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        r3 = r3.getIndex();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r30, int r31, int r32, @fg.l java.util.List<androidx.compose.foundation.lazy.staggeredgrid.a0> r33, @fg.l androidx.compose.foundation.lazy.staggeredgrid.x r34, boolean r35, int r36, @fg.l kotlinx.coroutines.r0 r37) {
        /*
            Method dump skipped, instructions count: 1150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.k.f(int, int, int, java.util.List, androidx.compose.foundation.lazy.staggeredgrid.x, boolean, int, kotlinx.coroutines.r0):void");
    }

    public final void g() {
        this.keyToItemInfoMap.K();
        this.keyIndexMap = androidx.compose.foundation.lazy.layout.v.INSTANCE;
        this.firstVisibleIndex = -1;
    }
}
