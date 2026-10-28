package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.collection.r2;
import androidx.compose.foundation.gestures.q0;
import androidx.compose.foundation.gestures.w0;
import androidx.compose.foundation.gestures.x0;
import androidx.compose.foundation.lazy.layout.d0;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.o4;
import androidx.compose.runtime.t4;
import androidx.compose.ui.layout.k1;
import androidx.compose.ui.layout.l1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.r1;

/* compiled from: LazyStaggeredGridState.kt */
@Metadata(d1 = {"\u0000\u0086\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 À\u00012\u00020\u0001:\u0001FB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJA\u0010'\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f2'\u0010&\u001a#\b\u0001\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120#\u0012\u0006\u0012\u0004\u0018\u00010$0!¢\u0006\u0002\b%H\u0096@¢\u0006\u0004\b'\u0010(J\"\u0010+\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00072\b\b\u0002\u0010*\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b+\u0010,J\"\u0010-\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00072\b\b\u0002\u0010*\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b-\u0010,J#\u0010.\u001a\u00020\u0012*\u00020\"2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007H\u0000¢\u0006\u0004\b.\u0010/J\u001f\u00103\u001a\u00020\u00022\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u0002H\u0000¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b5\u0010\u000eJ!\u0010:\u001a\u00020\u00122\u0006\u00107\u001a\u0002062\b\b\u0002\u00109\u001a\u000208H\u0000¢\u0006\u0004\b:\u0010;R\u001a\u0010A\u001a\u00020<8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u0002060B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010CR\u001a\u0010J\u001a\u00020E8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR+\u0010P\u001a\u0002082\u0006\u0010K\u001a\u0002088V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bL\u0010C\u001a\u0004\b=\u0010M\"\u0004\bN\u0010OR+\u0010S\u001a\u0002082\u0006\u0010K\u001a\u0002088V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u0010C\u001a\u0004\bQ\u0010M\"\u0004\bR\u0010OR\u0014\u0010V\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010UR(\u0010\\\u001a\u0004\u0018\u00010W2\b\u0010K\u001a\u0004\u0018\u00010W8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001a\u0010b\u001a\u00020]8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u001a\u0010h\u001a\u00020c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u001a\u0010n\u001a\u00020i8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\"\u0010r\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bo\u0010N\u001a\u0004\bp\u0010M\"\u0004\bq\u0010OR\u001a\u0010x\u001a\u00020s8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR\u0014\u0010z\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010yR$\u0010\u007f\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R(\u0010\u0085\u0001\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b:\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R&\u0010\u0089\u0001\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010N\u001a\u0005\b\u0087\u0001\u0010M\"\u0005\b\u0088\u0001\u0010OR+\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u0019\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R+\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u0017\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u0098\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001d\u0010\u0080\u0001R$\u0010\u009c\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030\u009a\u00010\u0099\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bf\u0010\u009b\u0001R)\u0010£\u0001\u001a\u00030\u009d\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bl\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R \u0010¨\u0001\u001a\u00030¤\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009f\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R \u0010®\u0001\u001a\u00030©\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R \u0010³\u0001\u001a\u00030¯\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b\u0080\u0001\u0010²\u0001R%\u0010¸\u0001\u001a\u00030´\u00018\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\n\u0005\bµ\u0001\u0010C\u001a\u0006\b¶\u0001\u0010·\u0001R\u0017\u0010º\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\b\u001a\u0006\b¹\u0001\u0010\u0082\u0001R\u0014\u0010»\u0001\u001a\u00020\u00078F¢\u0006\b\u001a\u0006\bª\u0001\u0010\u0082\u0001R\u0014\u0010¼\u0001\u001a\u00020\u00078F¢\u0006\b\u001a\u0006\b°\u0001\u0010\u0082\u0001R\u0014\u0010¿\u0001\u001a\u00020\u00108F¢\u0006\b\u001a\u0006\b½\u0001\u0010¾\u0001R\u0016\u0010\u001c\u001a\u00020\u00078@X\u0080\u0004¢\u0006\b\u001a\u0006\bÀ\u0001\u0010\u0082\u0001R\u0015\u0010Ã\u0001\u001a\u00030Á\u00018F¢\u0006\b\u001a\u0006\bµ\u0001\u0010Â\u0001R!\u0010É\u0001\u001a\u00030Ä\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\bÅ\u0001\u0010Æ\u0001*\u0006\bÇ\u0001\u0010È\u0001R\u0015\u0010Ê\u0001\u001a\u0002088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Ë\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/j0;", "Landroidx/compose/foundation/gestures/w0;", "", "initialFirstVisibleItems", "initialFirstVisibleOffsets", "<init>", "([I[I)V", "", "initialFirstVisibleItemIndex", "initialFirstVisibleItemOffset", "(II)V", "", "distance", "V", "(F)F", "delta", "Landroidx/compose/foundation/lazy/staggeredgrid/t;", "info", "Lkotlin/k2;", "T", "(FLandroidx/compose/foundation/lazy/staggeredgrid/t;)V", "", "prefetchHandlesUsed", "r", "(Ljava/util/Set;)V", "q", "(Landroidx/compose/foundation/lazy/staggeredgrid/t;)V", "itemIndex", "laneCount", "s", "(II)[I", "Landroidx/compose/foundation/a2;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/q0;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "f", "(Landroidx/compose/foundation/a2;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "index", "scrollOffset", "W", "(IILkotlin/coroutines/d;)Ljava/lang/Object;", "m", "g0", "(Landroidx/compose/foundation/gestures/q0;II)V", "Landroidx/compose/foundation/lazy/layout/s;", "itemProvider", "firstItemIndex", "h0", "(Landroidx/compose/foundation/lazy/layout/s;[I)[I", "b", "Landroidx/compose/foundation/lazy/staggeredgrid/y;", "result", "", "visibleItemsStayedTheSame", "o", "(Landroidx/compose/foundation/lazy/staggeredgrid/y;Z)V", "Landroidx/compose/foundation/lazy/staggeredgrid/d0;", "a", "Landroidx/compose/foundation/lazy/staggeredgrid/d0;", "O", "()Landroidx/compose/foundation/lazy/staggeredgrid/d0;", "scrollPosition", "Landroidx/compose/runtime/k2;", "Landroidx/compose/runtime/k2;", "layoutInfoState", "Landroidx/compose/foundation/lazy/staggeredgrid/s;", "c", "Landroidx/compose/foundation/lazy/staggeredgrid/s;", "A", "()Landroidx/compose/foundation/lazy/staggeredgrid/s;", "laneInfo", "<set-?>", "d", "()Z", "Z", "(Z)V", "canScrollForward", "e", "Y", "canScrollBackward", "Landroidx/compose/foundation/lazy/staggeredgrid/c;", "Landroidx/compose/foundation/lazy/staggeredgrid/c;", "animateScrollScope", "Landroidx/compose/ui/layout/k1;", "g", "Landroidx/compose/ui/layout/k1;", "M", "()Landroidx/compose/ui/layout/k1;", "remeasurement", "Landroidx/compose/ui/layout/l1;", "h", "Landroidx/compose/ui/layout/l1;", "N", "()Landroidx/compose/ui/layout/l1;", "remeasurementModifier", "Landroidx/compose/foundation/lazy/layout/a;", "i", "Landroidx/compose/foundation/lazy/layout/a;", "t", "()Landroidx/compose/foundation/lazy/layout/a;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/k;", "j", "Landroidx/compose/foundation/lazy/layout/k;", "u", "()Landroidx/compose/foundation/lazy/layout/k;", "beyondBoundsInfo", "k", "L", "c0", "prefetchingEnabled", "Landroidx/compose/foundation/lazy/layout/d0;", "l", "Landroidx/compose/foundation/lazy/layout/d0;", "K", "()Landroidx/compose/foundation/lazy/layout/d0;", "prefetchState", "Landroidx/compose/foundation/gestures/w0;", "scrollableState", "n", "F", "P", "()F", "scrollToBeConsumed", "I", "C", "()I", "b0", "(I)V", "measurePassCount", "p", "S", "f0", "isVertical", "Landroidx/compose/foundation/lazy/staggeredgrid/h0;", "Landroidx/compose/foundation/lazy/staggeredgrid/h0;", "Q", "()Landroidx/compose/foundation/lazy/staggeredgrid/h0;", "d0", "(Landroidx/compose/foundation/lazy/staggeredgrid/h0;)V", "slots", "Landroidx/compose/foundation/lazy/staggeredgrid/i0;", "Landroidx/compose/foundation/lazy/staggeredgrid/i0;", "R", "()Landroidx/compose/foundation/lazy/staggeredgrid/i0;", "e0", "(Landroidx/compose/foundation/lazy/staggeredgrid/i0;)V", "spanProvider", "prefetchBaseIndex", "", "Landroidx/compose/foundation/lazy/layout/d0$a;", "Ljava/util/Map;", "currentItemPrefetchHandles", "Landroidx/compose/ui/unit/d;", "Landroidx/compose/ui/unit/d;", "v", "()Landroidx/compose/ui/unit/d;", "a0", "(Landroidx/compose/ui/unit/d;)V", "density", "Landroidx/compose/foundation/interaction/k;", "Landroidx/compose/foundation/interaction/k;", "D", "()Landroidx/compose/foundation/interaction/k;", "mutableInteractionSource", "Landroidx/compose/foundation/lazy/layout/c0;", "w", "Landroidx/compose/foundation/lazy/layout/c0;", "H", "()Landroidx/compose/foundation/lazy/layout/c0;", "pinnedItems", "Landroidx/compose/foundation/lazy/staggeredgrid/k;", "x", "Landroidx/compose/foundation/lazy/staggeredgrid/k;", "()Landroidx/compose/foundation/lazy/staggeredgrid/k;", "placementAnimator", "Landroidx/compose/foundation/lazy/layout/n0;", "y", "J", "()Landroidx/compose/runtime/k2;", "placementScopeInvalidator", "G", "numOfItemsToTeleport", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "B", "()Landroidx/compose/foundation/lazy/staggeredgrid/t;", "layoutInfo", "z", "Landroidx/compose/foundation/interaction/i;", "()Landroidx/compose/foundation/interaction/i;", "interactionSource", "Lkotlin/ranges/l;", "E", "()Lkotlin/ranges/l;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/lazy/staggeredgrid/j0;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nLazyStaggeredGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,524:1\n81#2:525\n107#2,2:526\n81#2:528\n107#2,2:529\n81#2:531\n1855#3,2:532\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState\n*L\n138#1:525\n138#1:526,2\n140#1:528\n140#1:529,2\n211#1:531\n436#1:532,2\n*E\n"})
/* loaded from: classes.dex */
public final class j0 implements w0 {
    public static final int A = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d0 scrollPosition;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2<y> layoutInfoState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final s laneInfo;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 canScrollForward;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 canScrollBackward;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c animateScrollScope;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private k1 remeasurement;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l1 remeasurementModifier;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.layout.a awaitLayoutModifier;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.layout.k beyondBoundsInfo;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean prefetchingEnabled;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.layout.d0 prefetchState;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final w0 scrollableState;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float scrollToBeConsumed;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int measurePassCount;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean isVertical;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private h0 slots;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private i0 spanProvider;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int prefetchBaseIndex;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<Integer, d0.a> currentItemPrefetchHandles;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.unit.d density;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.interaction.k mutableInteractionSource;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.layout.c0 pinnedItems;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k placementAnimator;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2<kotlin.k2> placementScopeInvalidator;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    @fg.l
    private static final androidx.compose.runtime.saveable.l<j0, Object> B = androidx.compose.runtime.saveable.a.a(a.f6383b, b.f6384b);

    /* compiled from: LazyStaggeredGridState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0015\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/foundation/lazy/staggeredgrid/j0;", "state", "", "", "a", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/foundation/lazy/staggeredgrid/j0;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, j0, List<? extends int[]>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f6383b = new a(2);

        a() {
            super(2);
        }

        @Override // ld.p
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<int[]> invoke(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l j0 j0Var) {
            return kotlin.collections.w.O(j0Var.getScrollPosition().h(), j0Var.getScrollPosition().k());
        }
    }

    /* compiled from: LazyStaggeredGridState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Landroidx/compose/foundation/lazy/staggeredgrid/j0;", "a", "(Ljava/util/List;)Landroidx/compose/foundation/lazy/staggeredgrid/j0;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<List<? extends int[]>, j0> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f6384b = new b(1);

        b() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j0 invoke(@fg.l List<int[]> list) {
            return new j0(list.get(0), list.get(1), null);
        }
    }

    /* compiled from: LazyStaggeredGridState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/j0$c;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/foundation/lazy/staggeredgrid/j0;", "Saver", "Landroidx/compose/runtime/saveable/l;", "a", "()Landroidx/compose/runtime/saveable/l;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.j0$c, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final androidx.compose.runtime.saveable.l<j0, Object> a() {
            return j0.B;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: LazyStaggeredGridState.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/foundation/lazy/staggeredgrid/j0$d", "Landroidx/compose/ui/layout/l1;", "Landroidx/compose/ui/layout/k1;", "remeasurement", "Lkotlin/k2;", "K2", "(Landroidx/compose/ui/layout/k1;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements l1 {
        d() {
        }

        @Override // androidx.compose.ui.layout.l1
        public void K2(@fg.l k1 remeasurement) {
            j0.this.remeasurement = remeasurement;
        }
    }

    /* compiled from: LazyStaggeredGridState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState", f = "LazyStaggeredGridState.kt", i = {0, 0, 0}, l = {227, 228}, m = "scroll", n = {"this", "scrollPriority", "block"}, s = {"L$0", "L$1", "L$2"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f6386b;

        /* renamed from: c, reason: collision with root package name */
        Object f6387c;

        /* renamed from: d, reason: collision with root package name */
        Object f6388d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f6389e;

        /* renamed from: g, reason: collision with root package name */
        int f6391g;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f6389e = obj;
            this.f6391g |= Integer.MIN_VALUE;
            return j0.this.f(null, null, this);
        }
    }

    /* compiled from: LazyStaggeredGridState.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class f extends kotlin.jvm.internal.h0 implements ld.p<Integer, Integer, int[]> {
        f(Object obj) {
            super(2, obj, j0.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0);
        }

        @fg.l
        public final int[] Z(int i4, int i5) {
            return ((j0) this.receiver).s(i4, i5);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ int[] invoke(Integer num, Integer num2) {
            return Z(num.intValue(), num2.intValue());
        }
    }

    /* compiled from: LazyStaggeredGridState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollToItem$2", f = "LazyStaggeredGridState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/q0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/q0;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.coroutines.jvm.internal.o implements ld.p<q0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f6392b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f6393c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f6395e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f6396f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i4, int i5, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f6395e = i4;
            this.f6396f = i5;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l q0 q0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            g gVar = j0.this.new g(this.f6395e, this.f6396f, dVar);
            gVar.f6393c = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f6392b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
            j0.this.g0((q0) this.f6393c, this.f6395e, this.f6396f);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: LazyStaggeredGridState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.l<Float, Float> {
        h() {
            super(1);
        }

        @fg.l
        public final Float a(float f4) {
            return Float.valueOf(-j0.this.V(-f4));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Float invoke(Float f4) {
            return a(f4.floatValue());
        }
    }

    public /* synthetic */ j0(int[] iArr, int[] iArr2, kotlin.jvm.internal.w wVar) {
        this(iArr, iArr2);
    }

    private static Object F(j0 j0Var) {
        return j0Var.scrollPosition.getNearestRangeState();
    }

    private final int G() {
        return z() * 100;
    }

    private final void T(float delta, t info) {
        int i4;
        if (!this.prefetchingEnabled || info.j().isEmpty()) {
            return;
        }
        boolean z4 = delta < 0.0f;
        int index = z4 ? ((j) kotlin.collections.w.p3(info.j())).getIndex() : ((j) kotlin.collections.w.B2(info.j())).getIndex();
        if (index == this.prefetchBaseIndex) {
            return;
        }
        this.prefetchBaseIndex = index;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int z5 = z();
        for (int i5 = 0; i5 < z5; i5++) {
            index = z4 ? this.laneInfo.e(index, i5) : this.laneInfo.f(index, i5);
            if (index < 0 || index >= info.getTotalItemsCount() || linkedHashSet.contains(Integer.valueOf(index))) {
                break;
            }
            linkedHashSet.add(Integer.valueOf(index));
            if (!this.currentItemPrefetchHandles.containsKey(Integer.valueOf(index))) {
                i0 i0Var = this.spanProvider;
                boolean z6 = i0Var != null && i0Var.b(index);
                int i6 = z6 ? 0 : i5;
                int z7 = z6 ? z() : 1;
                h0 h0Var = this.slots;
                if (h0Var == null) {
                    i4 = 0;
                } else if (z7 == 1) {
                    i4 = h0Var.getSizes()[i6];
                } else {
                    int i7 = h0Var.getPositions()[i6];
                    int i10 = (i6 + z7) - 1;
                    i4 = (h0Var.getPositions()[i10] + h0Var.getSizes()[i10]) - i7;
                }
                this.currentItemPrefetchHandles.put(Integer.valueOf(index), this.prefetchState.b(index, this.isVertical ? androidx.compose.ui.unit.b.INSTANCE.e(i4) : androidx.compose.ui.unit.b.INSTANCE.d(i4)));
            }
        }
        r(linkedHashSet);
    }

    static /* synthetic */ void U(j0 j0Var, float f4, t tVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            tVar = j0Var.layoutInfoState.getValue();
        }
        j0Var.T(f4, tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float V(float distance) {
        if ((distance < 0.0f && !a()) || (distance > 0.0f && !e())) {
            return 0.0f;
        }
        if (Math.abs(this.scrollToBeConsumed) > 0.5f) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.scrollToBeConsumed).toString());
        }
        float f4 = this.scrollToBeConsumed + distance;
        this.scrollToBeConsumed = f4;
        if (Math.abs(f4) > 0.5f) {
            y value = this.layoutInfoState.getValue();
            float f5 = this.scrollToBeConsumed;
            if (value.v(kotlin.math.b.L0(f5))) {
                o(value, true);
                androidx.compose.foundation.lazy.layout.n0.h(this.placementScopeInvalidator);
                T(f5 - this.scrollToBeConsumed, value);
            } else {
                k1 k1Var = this.remeasurement;
                if (k1Var != null) {
                    k1Var.p();
                }
                U(this, f5 - this.scrollToBeConsumed, null, 2, null);
            }
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return distance;
        }
        float f6 = distance - this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return f6;
    }

    public static /* synthetic */ Object X(j0 j0Var, int i4, int i5, kotlin.coroutines.d dVar, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return j0Var.W(i4, i5, dVar);
    }

    private void Y(boolean z4) {
        this.canScrollBackward.setValue(Boolean.valueOf(z4));
    }

    private void Z(boolean z4) {
        this.canScrollForward.setValue(Boolean.valueOf(z4));
    }

    public static /* synthetic */ Object n(j0 j0Var, int i4, int i5, kotlin.coroutines.d dVar, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return j0Var.m(i4, i5, dVar);
    }

    public static /* synthetic */ void p(j0 j0Var, y yVar, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        j0Var.o(yVar, z4);
    }

    private final void q(t info) {
        List<j> j4 = info.j();
        if (this.prefetchBaseIndex == -1 || j4.isEmpty()) {
            return;
        }
        int index = ((j) kotlin.collections.w.B2(j4)).getIndex();
        int index2 = ((j) kotlin.collections.w.p3(j4)).getIndex();
        int i4 = this.prefetchBaseIndex;
        if (index > i4 || i4 > index2) {
            this.prefetchBaseIndex = -1;
            Iterator<T> it = this.currentItemPrefetchHandles.values().iterator();
            while (it.hasNext()) {
                ((d0.a) it.next()).cancel();
            }
            this.currentItemPrefetchHandles.clear();
        }
    }

    private final void r(Set<Integer> prefetchHandlesUsed) {
        Iterator<Map.Entry<Integer, d0.a>> it = this.currentItemPrefetchHandles.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, d0.a> next = it.next();
            if (!prefetchHandlesUsed.contains(next.getKey())) {
                next.getValue().cancel();
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] s(int itemIndex, int laneCount) {
        int i4;
        int[] iArr = new int[laneCount];
        i0 i0Var = this.spanProvider;
        if (i0Var != null && i0Var.b(itemIndex)) {
            kotlin.collections.l.T1(iArr, itemIndex, 0, 0, 6, null);
            return iArr;
        }
        this.laneInfo.d(itemIndex + laneCount);
        int h4 = this.laneInfo.h(itemIndex);
        if (h4 == -2 || h4 == -1) {
            i4 = 0;
        } else {
            if (h4 < 0) {
                throw new IllegalArgumentException(r2.a("Expected positive lane number, got ", h4, " instead.").toString());
            }
            i4 = Math.min(h4, laneCount);
        }
        int i5 = i4;
        int i6 = i5 - 1;
        int i7 = itemIndex;
        while (true) {
            if (-1 >= i6) {
                break;
            }
            i7 = this.laneInfo.f(i7, i6);
            iArr[i6] = i7;
            if (i7 == -1) {
                kotlin.collections.l.T1(iArr, -1, 0, i6, 2, null);
                break;
            }
            i6--;
        }
        iArr[i5] = itemIndex;
        for (int i10 = i5 + 1; i10 < laneCount; i10++) {
            itemIndex = this.laneInfo.e(itemIndex, i10);
            iArr[i10] = itemIndex;
        }
        return iArr;
    }

    @fg.l
    /* renamed from: A, reason: from getter */
    public final s getLaneInfo() {
        return this.laneInfo;
    }

    @fg.l
    public final t B() {
        return this.layoutInfoState.getValue();
    }

    /* renamed from: C, reason: from getter */
    public final int getMeasurePassCount() {
        return this.measurePassCount;
    }

    @fg.l
    /* renamed from: D, reason: from getter */
    public final androidx.compose.foundation.interaction.k getMutableInteractionSource() {
        return this.mutableInteractionSource;
    }

    @fg.l
    public final kotlin.ranges.l E() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    @fg.l
    /* renamed from: H, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.c0 getPinnedItems() {
        return this.pinnedItems;
    }

    @fg.l
    /* renamed from: I, reason: from getter */
    public final k getPlacementAnimator() {
        return this.placementAnimator;
    }

    @fg.l
    public final k2<kotlin.k2> J() {
        return this.placementScopeInvalidator;
    }

    @fg.l
    /* renamed from: K, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.d0 getPrefetchState() {
        return this.prefetchState;
    }

    /* renamed from: L, reason: from getter */
    public final boolean getPrefetchingEnabled() {
        return this.prefetchingEnabled;
    }

    @fg.m
    /* renamed from: M, reason: from getter */
    public final k1 getRemeasurement() {
        return this.remeasurement;
    }

    @fg.l
    /* renamed from: N, reason: from getter */
    public final l1 getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    @fg.l
    /* renamed from: O, reason: from getter */
    public final d0 getScrollPosition() {
        return this.scrollPosition;
    }

    /* renamed from: P, reason: from getter */
    public final float getScrollToBeConsumed() {
        return this.scrollToBeConsumed;
    }

    @fg.m
    /* renamed from: Q, reason: from getter */
    public final h0 getSlots() {
        return this.slots;
    }

    @fg.m
    /* renamed from: R, reason: from getter */
    public final i0 getSpanProvider() {
        return this.spanProvider;
    }

    /* renamed from: S, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    @fg.m
    public final Object W(int i4, int i5, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object h4 = w0.h(this, null, new g(i4, i5, null), dVar, 1, null);
        return h4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? h4 : kotlin.k2.f75408a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.w0
    public boolean a() {
        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    public final void a0(@fg.l androidx.compose.ui.unit.d dVar) {
        this.density = dVar;
    }

    @Override // androidx.compose.foundation.gestures.w0
    public float b(float delta) {
        return this.scrollableState.b(delta);
    }

    public final void b0(int i4) {
        this.measurePassCount = i4;
    }

    public final void c0(boolean z4) {
        this.prefetchingEnabled = z4;
    }

    @Override // androidx.compose.foundation.gestures.w0
    public boolean d() {
        return this.scrollableState.d();
    }

    public final void d0(@fg.m h0 h0Var) {
        this.slots = h0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.w0
    public boolean e() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    public final void e0(@fg.m i0 i0Var) {
        this.spanProvider = i0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.compose.foundation.gestures.w0
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(@fg.l androidx.compose.foundation.a2 r6, @fg.l ld.p<? super androidx.compose.foundation.gestures.q0, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends java.lang.Object> r7, @fg.l kotlin.coroutines.d<? super kotlin.k2> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.staggeredgrid.j0.e
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.staggeredgrid.j0$e r0 = (androidx.compose.foundation.lazy.staggeredgrid.j0.e) r0
            int r1 = r0.f6391g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6391g = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.staggeredgrid.j0$e r0 = new androidx.compose.foundation.lazy.staggeredgrid.j0$e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f6389e
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f6391g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.a1.n(r8)
            goto L6a
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.f6388d
            r7 = r6
            ld.p r7 = (ld.p) r7
            java.lang.Object r6 = r0.f6387c
            androidx.compose.foundation.a2 r6 = (androidx.compose.foundation.a2) r6
            java.lang.Object r2 = r0.f6386b
            androidx.compose.foundation.lazy.staggeredgrid.j0 r2 = (androidx.compose.foundation.lazy.staggeredgrid.j0) r2
            kotlin.a1.n(r8)
            goto L58
        L43:
            kotlin.a1.n(r8)
            androidx.compose.foundation.lazy.layout.a r8 = r5.awaitLayoutModifier
            r0.f6386b = r5
            r0.f6387c = r6
            r0.f6388d = r7
            r0.f6391g = r4
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L57
            return r1
        L57:
            r2 = r5
        L58:
            androidx.compose.foundation.gestures.w0 r8 = r2.scrollableState
            r2 = 0
            r0.f6386b = r2
            r0.f6387c = r2
            r0.f6388d = r2
            r0.f6391g = r3
            java.lang.Object r6 = r8.f(r6, r7, r0)
            if (r6 != r1) goto L6a
            return r1
        L6a:
            kotlin.k2 r6 = kotlin.k2.f75408a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.j0.f(androidx.compose.foundation.a2, ld.p, kotlin.coroutines.d):java.lang.Object");
    }

    public final void f0(boolean z4) {
        this.isVertical = z4;
    }

    public final void g0(@fg.l q0 q0Var, int i4, int i5) {
        j a5 = z.a(B(), i4);
        if (a5 != null) {
            boolean z4 = this.isVertical;
            long offset = a5.getOffset();
            q0Var.a((z4 ? androidx.compose.ui.unit.q.o(offset) : androidx.compose.ui.unit.q.m(offset)) + i5);
        } else {
            this.scrollPosition.l(i4, i5);
            k1 k1Var = this.remeasurement;
            if (k1Var != null) {
                k1Var.p();
            }
        }
    }

    @fg.l
    public final int[] h0(@fg.l androidx.compose.foundation.lazy.layout.s itemProvider, @fg.l int[] firstItemIndex) {
        return this.scrollPosition.t(itemProvider, firstItemIndex);
    }

    @fg.m
    public final Object m(int i4, int i5, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object d5 = androidx.compose.foundation.lazy.layout.f.d(this.animateScrollScope, i4, i5, G(), this.density, dVar);
        return d5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? d5 : kotlin.k2.f75408a;
    }

    public final void o(@fg.l y result, boolean visibleItemsStayedTheSame) {
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.layoutInfoState.setValue(result);
        if (visibleItemsStayedTheSame) {
            this.scrollPosition.s(result.getFirstVisibleItemScrollOffsets());
        } else {
            this.scrollPosition.r(result);
            q(result);
        }
        Y(result.g());
        Z(result.getCanScrollForward());
        this.measurePassCount++;
    }

    @fg.l
    /* renamed from: t, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.a getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    @fg.l
    /* renamed from: u, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.k getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    @fg.l
    /* renamed from: v, reason: from getter */
    public final androidx.compose.ui.unit.d getDensity() {
        return this.density;
    }

    public final int w() {
        return this.scrollPosition.g();
    }

    public final int x() {
        return this.scrollPosition.j();
    }

    @fg.l
    public final androidx.compose.foundation.interaction.i y() {
        return this.mutableInteractionSource;
    }

    public final int z() {
        int[] sizes;
        h0 h0Var = this.slots;
        if (h0Var == null || (sizes = h0Var.getSizes()) == null) {
            return 0;
        }
        return sizes.length;
    }

    private j0(int[] iArr, int[] iArr2) {
        k2 g4;
        k2 g5;
        d0 d0Var = new d0(iArr, iArr2, new f(this));
        this.scrollPosition = d0Var;
        this.layoutInfoState = androidx.compose.runtime.b.e(z.b(), o4.m());
        this.laneInfo = new s();
        Boolean bool = Boolean.FALSE;
        g4 = t4.g(bool, null, 2, null);
        this.canScrollForward = g4;
        g5 = t4.g(bool, null, 2, null);
        this.canScrollBackward = g5;
        this.animateScrollScope = new c(this);
        this.remeasurementModifier = new d();
        this.awaitLayoutModifier = new androidx.compose.foundation.lazy.layout.a();
        this.beyondBoundsInfo = new androidx.compose.foundation.lazy.layout.k();
        this.prefetchingEnabled = true;
        this.prefetchState = new androidx.compose.foundation.lazy.layout.d0();
        this.scrollableState = x0.a(new h());
        this.prefetchBaseIndex = -1;
        this.currentItemPrefetchHandles = new LinkedHashMap();
        this.density = androidx.compose.ui.unit.f.a(1.0f, 1.0f);
        this.mutableInteractionSource = androidx.compose.foundation.interaction.j.a();
        this.pinnedItems = new androidx.compose.foundation.lazy.layout.c0();
        this.placementAnimator = new k();
        d0Var.getNearestRangeState();
        this.placementScopeInvalidator = androidx.compose.foundation.lazy.layout.n0.d(null, 1, null);
    }

    public /* synthetic */ j0(int i4, int i5, int i6, kotlin.jvm.internal.w wVar) {
        this((i6 & 1) != 0 ? 0 : i4, (i6 & 2) != 0 ? 0 : i5);
    }

    public j0(int i4, int i5) {
        this(new int[]{i4}, new int[]{i5});
    }
}
