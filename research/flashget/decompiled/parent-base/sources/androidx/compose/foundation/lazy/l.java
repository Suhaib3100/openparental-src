package androidx.compose.foundation.lazy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.r0;

/* compiled from: LazyListItemAnimator.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ[\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u0003J\u001f\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010+R$\u00101\u001a\u0012\u0012\u0004\u0012\u00020\u00010-j\b\u0012\u0004\u0012\u00020\u0001`.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00102R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00102R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00102R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00102R\u0018\u00109\u001a\u00020\u0016*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u00108¨\u0006:"}, d2 = {"Landroidx/compose/foundation/lazy/l;", "", "<init>", "()V", "Landroidx/compose/foundation/lazy/v;", "item", "", "mainAxisOffset", "Landroidx/compose/foundation/lazy/l$a;", "itemInfo", "Lkotlin/k2;", "c", "(Landroidx/compose/foundation/lazy/v;ILandroidx/compose/foundation/lazy/l$a;)V", "g", "(Landroidx/compose/foundation/lazy/v;)V", "consumedScroll", "layoutWidth", "layoutHeight", "", "positionedItems", "Landroidx/compose/foundation/lazy/x;", "itemProvider", "", "isVertical", "isLookingAhead", "hasLookaheadOccurred", "Lkotlinx/coroutines/r0;", "coroutineScope", "e", "(IIILjava/util/List;Landroidx/compose/foundation/lazy/x;ZZZLkotlinx/coroutines/r0;)V", "f", "key", "placeableIndex", "Landroidx/compose/foundation/lazy/layout/h;", "a", "(Ljava/lang/Object;I)Landroidx/compose/foundation/lazy/layout/h;", "", "Ljava/util/Map;", "keyToItemInfoMap", "Landroidx/compose/foundation/lazy/layout/v;", "b", "Landroidx/compose/foundation/lazy/layout/v;", "keyIndexMap", "I", "firstVisibleIndex", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "d", "Ljava/util/LinkedHashSet;", "movingAwayKeys", "Ljava/util/List;", "movingInFromStartBound", "movingInFromEndBound", "movingAwayToStartBound", "h", "movingAwayToEndBound", "(Landroidx/compose/foundation/lazy/v;)Z", "hasAnimations", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nLazyListItemAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListItemAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,331:1\n101#2,2:332\n33#2,6:334\n103#2:340\n33#2,4:341\n38#2:351\n33#2,6:354\n33#2,6:362\n33#2,6:374\n33#2,6:382\n1#3:345\n13579#4,2:346\n13579#4:348\n13580#4:350\n12744#4,2:369\n13644#4,2:388\n13646#4:392\n13644#4,2:393\n13646#4:396\n86#5:349\n79#5:390\n86#5:391\n79#5:395\n1011#6,2:352\n1002#6,2:360\n1855#6:368\n1856#6:371\n1011#6,2:372\n1002#6,2:380\n*S KotlinDebug\n*F\n+ 1 LazyListItemAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemAnimator\n*L\n72#1:332,2\n72#1:334,6\n72#1:340\n97#1:341,4\n97#1:351\n149#1:354,6\n157#1:362,6\n193#1:374,6\n208#1:382,6\n122#1:346,2\n130#1:348\n130#1:350\n178#1:369,2\n257#1:388,2\n257#1:392\n268#1:393,2\n268#1:396\n134#1:349\n260#1:390\n261#1:391\n275#1:395\n148#1:352,2\n156#1:360,2\n165#1:368\n165#1:371\n192#1:372,2\n207#1:380,2\n*E\n"})
/* loaded from: classes.dex */
public final class l {

    /* renamed from: i, reason: collision with root package name */
    public static final int f5896i = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.foundation.lazy.layout.v keyIndexMap;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int firstVisibleIndex;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<Object, a> keyToItemInfoMap = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final LinkedHashSet<Object> movingAwayKeys = new LinkedHashSet<>();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<v> movingInFromStartBound = new ArrayList();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<v> movingInFromEndBound = new ArrayList();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<v> movingAwayToStartBound = new ArrayList();

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<v> movingAwayToEndBound = new ArrayList();

    /* compiled from: LazyListItemAnimator.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR4\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/lazy/l$a;", "", "<init>", "()V", "Landroidx/compose/foundation/lazy/v;", "positionedItem", "Lkotlinx/coroutines/r0;", "coroutineScope", "Lkotlin/k2;", "b", "(Landroidx/compose/foundation/lazy/v;Lkotlinx/coroutines/r0;)V", "", "Landroidx/compose/foundation/lazy/layout/h;", "<set-?>", "a", "[Landroidx/compose/foundation/lazy/layout/h;", "()[Landroidx/compose/foundation/lazy/layout/h;", "animations", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private androidx.compose.foundation.lazy.layout.h[] animations;

        public a() {
            androidx.compose.foundation.lazy.layout.h[] hVarArr;
            hVarArr = m.f6170a;
            this.animations = hVarArr;
        }

        @fg.l
        /* renamed from: a, reason: from getter */
        public final androidx.compose.foundation.lazy.layout.h[] getAnimations() {
            return this.animations;
        }

        public final void b(@fg.l v positionedItem, @fg.l r0 coroutineScope) {
            androidx.compose.foundation.lazy.layout.j c5;
            int length = this.animations.length;
            for (int i4 = positionedItem.i(); i4 < length; i4++) {
                androidx.compose.foundation.lazy.layout.h hVar = this.animations[i4];
                if (hVar != null) {
                    hVar.C();
                }
            }
            if (this.animations.length != positionedItem.i()) {
                Object[] copyOf = Arrays.copyOf(this.animations, positionedItem.i());
                l0.o(copyOf, "copyOf(this, newSize)");
                this.animations = (androidx.compose.foundation.lazy.layout.h[]) copyOf;
            }
            int i5 = positionedItem.i();
            for (int i6 = 0; i6 < i5; i6++) {
                c5 = m.c(positionedItem.h(i6));
                if (c5 == null) {
                    androidx.compose.foundation.lazy.layout.h hVar2 = this.animations[i6];
                    if (hVar2 != null) {
                        hVar2.C();
                    }
                    this.animations[i6] = null;
                } else {
                    androidx.compose.foundation.lazy.layout.h hVar3 = this.animations[i6];
                    if (hVar3 == null) {
                        hVar3 = new androidx.compose.foundation.lazy.layout.h(coroutineScope);
                        this.animations[i6] = hVar3;
                    }
                    hVar3.v(c5.y7());
                    hVar3.z(c5.z7());
                }
            }
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 LazyListItemAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemAnimator\n*L\n1#1,328:1\n156#2:329\n*E\n"})
    public static final class b<T> implements Comparator {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.v f5906b;

        public b(androidx.compose.foundation.lazy.layout.v vVar) {
            this.f5906b = vVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            return kotlin.comparisons.a.l(Integer.valueOf(this.f5906b.c(((v) t4).getKey())), Integer.valueOf(this.f5906b.c(((v) t5).getKey())));
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 LazyListItemAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemAnimator\n*L\n1#1,328:1\n207#2:329\n*E\n"})
    public static final class c<T> implements Comparator {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.v f5907b;

        public c(androidx.compose.foundation.lazy.layout.v vVar) {
            this.f5907b = vVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            return kotlin.comparisons.a.l(Integer.valueOf(this.f5907b.c(((v) t4).getKey())), Integer.valueOf(this.f5907b.c(((v) t5).getKey())));
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$c", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 LazyListItemAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemAnimator\n*L\n1#1,328:1\n148#2:329\n*E\n"})
    public static final class d<T> implements Comparator {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.v f5908b;

        public d(androidx.compose.foundation.lazy.layout.v vVar) {
            this.f5908b = vVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            return kotlin.comparisons.a.l(Integer.valueOf(this.f5908b.c(((v) t5).getKey())), Integer.valueOf(this.f5908b.c(((v) t4).getKey())));
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$c", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 LazyListItemAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemAnimator\n*L\n1#1,328:1\n192#2:329\n*E\n"})
    public static final class e<T> implements Comparator {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.v f5909b;

        public e(androidx.compose.foundation.lazy.layout.v vVar) {
            this.f5909b = vVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            return kotlin.comparisons.a.l(Integer.valueOf(this.f5909b.c(((v) t5).getKey())), Integer.valueOf(this.f5909b.c(((v) t4).getKey())));
        }
    }

    private final boolean b(v vVar) {
        androidx.compose.foundation.lazy.layout.j c5;
        int i4 = vVar.i();
        for (int i5 = 0; i5 < i4; i5++) {
            c5 = m.c(vVar.h(i5));
            if (c5 != null) {
                return true;
            }
        }
        return false;
    }

    private final void c(v item, int mainAxisOffset, a itemInfo) {
        androidx.compose.foundation.lazy.layout.h[] hVarArr;
        int i4;
        long j4;
        int i5 = 0;
        long g4 = item.g(0);
        long g5 = item.getIsVertical() ? androidx.compose.ui.unit.q.g(g4, 0, mainAxisOffset, 1, null) : androidx.compose.ui.unit.q.g(g4, mainAxisOffset, 0, 2, null);
        androidx.compose.foundation.lazy.layout.h[] animations = itemInfo.getAnimations();
        int length = animations.length;
        int i6 = 0;
        while (i5 < length) {
            androidx.compose.foundation.lazy.layout.h hVar = animations[i5];
            int i7 = i6 + 1;
            if (hVar != null) {
                long g6 = item.g(i6);
                hVarArr = animations;
                i4 = length;
                long a5 = androidx.compose.ui.unit.r.a(androidx.compose.ui.unit.q.m(g6) - ((int) (g4 >> 32)), ((int) (g6 & 4294967295L)) - ((int) (g4 & 4294967295L)));
                j4 = g4;
                hVar.A(androidx.compose.ui.unit.r.a(((int) (g5 >> 32)) + ((int) (a5 >> 32)), ((int) (g5 & 4294967295L)) + ((int) (a5 & 4294967295L))));
            } else {
                hVarArr = animations;
                i4 = length;
                j4 = g4;
            }
            i5++;
            animations = hVarArr;
            i6 = i7;
            length = i4;
            g4 = j4;
        }
    }

    static /* synthetic */ void d(l lVar, v vVar, int i4, a aVar, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            aVar = (a) z0.K(lVar.keyToItemInfoMap, vVar.getKey());
        }
        lVar.c(vVar, i4, aVar);
    }

    private final void g(v item) {
        androidx.compose.foundation.lazy.layout.h[] hVarArr;
        androidx.compose.foundation.lazy.layout.h[] animations = ((a) z0.K(this.keyToItemInfoMap, item.getKey())).getAnimations();
        int length = animations.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            androidx.compose.foundation.lazy.layout.h hVar = animations[i4];
            int i6 = i5 + 1;
            if (hVar != null) {
                long g4 = item.g(i5);
                long rawOffset = hVar.getRawOffset();
                androidx.compose.foundation.lazy.layout.h.INSTANCE.getClass();
                if (androidx.compose.ui.unit.q.j(rawOffset, androidx.compose.foundation.lazy.layout.h.f6001o) || androidx.compose.ui.unit.q.j(rawOffset, g4)) {
                    hVarArr = animations;
                } else {
                    hVarArr = animations;
                    hVar.i(androidx.compose.ui.unit.r.a(((int) (g4 >> 32)) - ((int) (rawOffset >> 32)), ((int) (g4 & 4294967295L)) - ((int) (rawOffset & 4294967295L))));
                }
                hVar.A(g4);
            } else {
                hVarArr = animations;
            }
            i4++;
            animations = hVarArr;
            i5 = i6;
        }
    }

    @fg.m
    public final androidx.compose.foundation.lazy.layout.h a(@fg.l Object key, int placeableIndex) {
        androidx.compose.foundation.lazy.layout.h[] animations;
        a aVar = this.keyToItemInfoMap.get(key);
        if (aVar == null || (animations = aVar.getAnimations()) == null) {
            return null;
        }
        return animations[placeableIndex];
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0252, code lost:
    
        r12 = r10[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0254, code lost:
    
        if (r12 == null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x025a, code lost:
    
        if (r12.t() != r9) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0271, code lost:
    
        if (r3 >= r6.firstVisibleIndex) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0273, code lost:
    
        r6.movingAwayToStartBound.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0279, code lost:
    
        r6.movingAwayToEndBound.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        r6.firstVisibleIndex = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x025d, code lost:
    
        r14 = r14 + 1;
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0261, code lost:
    
        if (r7 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0267, code lost:
    
        if (r3 != r7.c(r1)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0269, code lost:
    
        r6.keyToItemInfoMap.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r25 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0281, code lost:
    
        r2 = r18;
        r0 = r6.movingAwayToStartBound;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x028a, code lost:
    
        if (r0.size() <= 1) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x028c, code lost:
    
        kotlin.collections.w.p0(r0, new androidx.compose.foundation.lazy.l.e(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0294, code lost:
    
        r0 = r6.movingAwayToStartBound;
        r1 = r0.size();
        r3 = 0;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x029c, code lost:
    
        if (r14 >= r1) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x029e, code lost:
    
        r4 = r0.get(r14);
        r3 = r3 + r4.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02a9, code lost:
    
        if (r26 == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02ab, code lost:
    
        r5 = ((androidx.compose.foundation.lazy.v) kotlin.collections.w.B2(r23)).getOffset() - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        r13 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02be, code lost:
    
        r4.m(r5, r21, r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02c1, code lost:
    
        if (r15 == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02c3, code lost:
    
        r6.g(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02c6, code lost:
    
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02bb, code lost:
    
        r5 = 0 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02c9, code lost:
    
        r0 = r6.movingAwayToEndBound;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02d4, code lost:
    
        if (r0.size() <= 1) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (r25 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02d6, code lost:
    
        kotlin.collections.w.p0(r0, new androidx.compose.foundation.lazy.l.c(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02de, code lost:
    
        r0 = r6.movingAwayToEndBound;
        r1 = r0.size();
        r2 = 0;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02e6, code lost:
    
        if (r14 >= r1) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02e8, code lost:
    
        r3 = r0.get(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02ee, code lost:
    
        if (r26 == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02f0, code lost:
    
        r4 = (androidx.compose.foundation.lazy.v) kotlin.collections.w.p3(r23);
        r4 = (r4.j() + r4.getOffset()) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0303, code lost:
    
        r2 = r2 + r3.j();
        r3.m(r4, r21, r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x030b, code lost:
    
        if (r15 == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x030d, code lost:
    
        r6.g(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        r3 = androidx.compose.ui.unit.r.a(0, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0310, code lost:
    
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0301, code lost:
    
        r4 = r13 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0313, code lost:
    
        r0 = r6.movingAwayToStartBound;
        kotlin.collections.w.r1(r0);
        r1 = kotlin.k2.f75408a;
        r23.addAll(0, r0);
        r23.addAll(r6.movingAwayToEndBound);
        r6.movingInFromStartBound.clear();
        r6.movingInFromEndBound.clear();
        r6.movingAwayToStartBound.clear();
        r6.movingAwayToEndBound.clear();
        r6.movingAwayKeys.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0342, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01b0, code lost:
    
        r7 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0215, code lost:
    
        r7 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0061, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r26 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0056, code lost:
    
        r3 = androidx.compose.ui.unit.r.a(r20, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x004e, code lost:
    
        r13 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0047, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        if (r27 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        r6.movingAwayKeys.addAll(r6.keyToItemInfoMap.keySet());
        r0 = r23.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (r5 >= r0) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        r12 = r9.get(r5);
        r27 = r0;
        r6.movingAwayKeys.remove(r12.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
    
        if (r6.b(r12) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
    
        r0 = r6.keyToItemInfoMap.get(r12.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
    
        if (r0 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
    
        r0 = new androidx.compose.foundation.lazy.l.a();
        r0.b(r12, r1);
        r6.keyToItemInfoMap.put(r12.getKey(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
    
        if (r10 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b0, code lost:
    
        r9 = r10.c(r12.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:
    
        if (r12.getIndex() == r9) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
    
        if (r9 == (-1)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c3, code lost:
    
        if (r9 >= r2) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        r6.movingInFromStartBound.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ca, code lost:
    
        r16 = r10;
        r18 = r11;
        r11 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0181, code lost:
    
        r5 = r11 + 1;
        r9 = r23;
        r0 = r27;
        r1 = r28;
        r10 = r16;
        r11 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d1, code lost:
    
        r6.movingInFromEndBound.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d7, code lost:
    
        r17 = r12.g(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e0, code lost:
    
        if (r12.k() == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e2, code lost:
    
        r14 = androidx.compose.ui.unit.q.o(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00eb, code lost:
    
        r6.c(r12, r14, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ef, code lost:
    
        if (r9 != (-1)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f1, code lost:
    
        if (r10 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f3, code lost:
    
        r0 = r0.getAnimations();
        r9 = r0.length;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f9, code lost:
    
        if (r14 >= r9) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fb, code lost:
    
        r12 = r0[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fd, code lost:
    
        if (r12 == null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ff, code lost:
    
        r12.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0102, code lost:
    
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e7, code lost:
    
        r14 = androidx.compose.ui.unit.q.m(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b9, code lost:
    
        r9 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0105, code lost:
    
        if (r15 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0107, code lost:
    
        r0.b(r12, r1);
        r0 = r0.getAnimations();
        r9 = r0.length;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0110, code lost:
    
        if (r14 >= r9) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0112, code lost:
    
        r1 = r0[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0114, code lost:
    
        if (r1 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0116, code lost:
    
        r7 = r1.getRawOffset();
        androidx.compose.foundation.lazy.layout.h.INSTANCE.getClass();
        r17 = r9;
        r16 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012b, code lost:
    
        if (androidx.compose.ui.unit.q.j(r7, androidx.compose.foundation.lazy.layout.h.f6001o) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012d, code lost:
    
        r7 = r1.getRawOffset();
        r18 = r11;
        r11 = r5;
        r1.A(androidx.compose.ui.unit.r.a(((int) (r7 >> 32)) + ((int) (r3 >> 32)), ((int) (r7 & 4294967295L)) + ((int) (4294967295L & r3))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0158, code lost:
    
        r14 = r14 + 1;
        r6 = r19;
        r5 = r11;
        r10 = r16;
        r9 = r17;
        r11 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014f, code lost:
    
        r18 = r11;
        r11 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0153, code lost:
    
        r17 = r9;
        r16 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016a, code lost:
    
        r16 = r10;
        r18 = r11;
        r11 = r5;
        r6.g(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0173, code lost:
    
        r16 = r10;
        r18 = r11;
        r11 = r5;
        r6.keyToItemInfoMap.remove(r12.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0194, code lost:
    
        r16 = r10;
        r18 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0198, code lost:
    
        if (r15 == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019a, code lost:
    
        if (r16 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019c, code lost:
    
        r0 = r6.movingInFromStartBound;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a3, code lost:
    
        if (r0.size() <= 1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a5, code lost:
    
        r7 = r16;
        kotlin.collections.w.p0(r0, new androidx.compose.foundation.lazy.l.d(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01b2, code lost:
    
        r8 = r6.movingInFromStartBound;
        r9 = r8.size();
        r0 = 0;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
    
        r2 = r6.firstVisibleIndex;
        r3 = (androidx.compose.foundation.lazy.v) kotlin.collections.w.G2(r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ba, code lost:
    
        if (r14 >= r9) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01bc, code lost:
    
        r10 = r8.get(r14);
        r11 = r10.j() + r0;
        d(r19, r10, 0 - r11, null, 4, null);
        r6.g(r10);
        r14 = r14 + 1;
        r0 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01db, code lost:
    
        r0 = r6.movingInFromEndBound;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01e2, code lost:
    
        if (r0.size() <= 1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01e4, code lost:
    
        kotlin.collections.w.p0(r0, new androidx.compose.foundation.lazy.l.b(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ec, code lost:
    
        r8 = r6.movingInFromEndBound;
        r9 = r8.size();
        r0 = 0;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01f4, code lost:
    
        if (r14 >= r9) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01f6, code lost:
    
        r10 = r8.get(r14);
        r11 = r10.j() + r0;
        d(r19, r10, r13 + r0, null, 4, null);
        r6.g(r10);
        r14 = r14 + 1;
        r0 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r3 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0217, code lost:
    
        r0 = r6.movingAwayKeys.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0221, code lost:
    
        if (r0.hasNext() == false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0223, code lost:
    
        r1 = r0.next();
        r2 = r18;
        r3 = r2.c(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x022e, code lost:
    
        if (r3 != (-1)) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0230, code lost:
    
        r6.keyToItemInfoMap.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x027e, code lost:
    
        r18 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0238, code lost:
    
        r8 = r24.b(r3);
        r9 = true;
        r8.n(true);
        r10 = ((androidx.compose.foundation.lazy.l.a) kotlin.collections.z0.K(r6.keyToItemInfoMap, r1)).getAnimations();
        r11 = r10.length;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0250, code lost:
    
        if (r14 >= r11) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        r3 = r3.getIndex();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r20, int r21, int r22, @fg.l java.util.List<androidx.compose.foundation.lazy.v> r23, @fg.l androidx.compose.foundation.lazy.x r24, boolean r25, boolean r26, boolean r27, @fg.l kotlinx.coroutines.r0 r28) {
        /*
            Method dump skipped, instructions count: 835
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.l.e(int, int, int, java.util.List, androidx.compose.foundation.lazy.x, boolean, boolean, boolean, kotlinx.coroutines.r0):void");
    }

    public final void f() {
        this.keyToItemInfoMap.clear();
        this.keyIndexMap = androidx.compose.foundation.lazy.layout.v.INSTANCE;
        this.firstVisibleIndex = -1;
    }
}
