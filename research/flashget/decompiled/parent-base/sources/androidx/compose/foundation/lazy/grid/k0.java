package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.w0;
import androidx.compose.foundation.gestures.x0;
import androidx.compose.foundation.lazy.layout.d0;
import androidx.compose.runtime.i2;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.o4;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.x4;
import androidx.compose.ui.layout.k1;
import androidx.compose.ui.layout.l1;
import java.util.List;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.q0;

/* compiled from: LazyGridState.kt */
@Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ©\u00012\u00020\u0001:\u00018B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0013\u001a\u00020\u000b2\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0006JA\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162'\u0010\u001d\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0018¢\u0006\u0002\b\u001cH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0000¢\u0006\u0004\b#\u0010!J$\u0010$\u001a\u00020\u000b2\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b$\u0010\u0014J!\u0010)\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'H\u0000¢\u0006\u0004\b)\u0010*J\u001f\u0010.\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u0002H\u0000¢\u0006\u0004\b.\u0010/R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020%048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00105R\u001a\u0010<\u001a\u0002078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R$\u0010B\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u00078\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR+\u0010I\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010P\u001a\u00020J8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010V\u001a\u00020'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u0010.\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0014\u0010Y\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR$\u0010\\\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bZ\u0010@\u001a\u0004\b[\u0010FR\"\u0010^\u001a\u00020'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010.\u001a\u0004\b?\u0010S\"\u0004\b]\u0010UR\u0016\u0010`\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010@R\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020b0a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010cR\u0016\u0010f\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010.R$\u0010m\u001a\u0004\u0018\u00010g8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u001a\u0010s\u001a\u00020n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u001a\u0010x\u001a\u00020t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bo\u0010wR\u008a\u0001\u0010\u0084\u0001\u001a/\u0012\u0013\u0012\u00110\u0002¢\u0006\f\bz\u0012\b\b{\u0012\u0004\b\b(|\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u007f0~0}0y23\u0010=\u001a/\u0012\u0013\u0012\u00110\u0002¢\u0006\f\bz\u0012\b\b{\u0012\u0004\b\b(|\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u007f0~0}0y8@@@X\u0080\u008e\u0002¢\u0006\u0016\n\u0004\bL\u00105\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R \u0010\u008a\u0001\u001a\u00030\u0085\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001f\u0010\u008f\u0001\u001a\u00030\u008b\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0005\bu\u0010\u008e\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0090\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001f\u0010\u0098\u0001\u001a\u00030\u0094\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b:\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R%\u0010\u009d\u0001\u001a\u00030\u0099\u00018\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\n\u0005\b\u009a\u0001\u00105\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R.\u0010 \u0001\u001a\u00020'2\u0006\u0010=\u001a\u00020'8V@RX\u0096\u008e\u0002¢\u0006\u0014\n\u0005\b\u009e\u0001\u00105\u001a\u0004\b1\u0010S\"\u0005\b\u009f\u0001\u0010UR.\u0010£\u0001\u001a\u00020'2\u0006\u0010=\u001a\u00020'8V@RX\u0096\u008e\u0002¢\u0006\u0014\n\u0005\b¡\u0001\u00105\u001a\u0004\bC\u0010S\"\u0005\b¢\u0001\u0010UR\u001f\u0010¨\u0001\u001a\u00030¤\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b[\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R\u0016\u0010ª\u0001\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b©\u0001\u0010FR\u0012\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010FR\u0012\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010FR\u0013\u0010\n\u001a\u00020\t8F¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010«\u0001R\u0015\u0010®\u0001\u001a\u00030¬\u00018F¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u00ad\u0001R!\u0010³\u0001\u001a\u00030¯\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\b\u009e\u0001\u0010°\u0001*\u0006\b±\u0001\u0010²\u0001R\u0015\u0010´\u0001\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010S\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006µ\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/k0;", "Landroidx/compose/foundation/gestures/w0;", "", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "<init>", "(II)V", "", "delta", "Landroidx/compose/foundation/lazy/grid/u;", "layoutInfo", "Lkotlin/k2;", "L", "(FLandroidx/compose/foundation/lazy/grid/u;)V", "info", "n", "(Landroidx/compose/foundation/lazy/grid/u;)V", "index", "scrollOffset", "O", "(IILkotlin/coroutines/d;)Ljava/lang/Object;", "Y", "Landroidx/compose/foundation/a2;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/q0;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "f", "(Landroidx/compose/foundation/a2;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "(F)F", "distance", "N", "j", "Landroidx/compose/foundation/lazy/grid/w;", "result", "", "visibleItemsStayedTheSame", "l", "(Landroidx/compose/foundation/lazy/grid/w;Z)V", "Landroidx/compose/foundation/lazy/grid/n;", "itemProvider", "firstItemIndex", "Z", "(Landroidx/compose/foundation/lazy/grid/n;I)I", "Landroidx/compose/foundation/lazy/grid/e0;", "a", "Landroidx/compose/foundation/lazy/grid/e0;", "scrollPosition", "Landroidx/compose/runtime/k2;", "Landroidx/compose/runtime/k2;", "layoutInfoState", "Landroidx/compose/foundation/interaction/k;", "c", "Landroidx/compose/foundation/interaction/k;", "u", "()Landroidx/compose/foundation/interaction/k;", "internalInteractionSource", "<set-?>", "d", "F", "I", "()F", "scrollToBeConsumed", "e", "Landroidx/compose/runtime/i2;", "J", "()I", "W", "(I)V", "slotsPerLine", "Landroidx/compose/ui/unit/d;", "Landroidx/compose/ui/unit/d;", "q", "()Landroidx/compose/ui/unit/d;", "S", "(Landroidx/compose/ui/unit/d;)V", "density", "g", "K", "()Z", "X", "(Z)V", "isVertical", "h", "Landroidx/compose/foundation/gestures/w0;", "scrollableState", "i", "y", "numMeasurePasses", "U", "prefetchingEnabled", "k", "lineToPrefetch", "Landroidx/compose/runtime/collection/g;", "Landroidx/compose/foundation/lazy/layout/d0$a;", "Landroidx/compose/runtime/collection/g;", "currentLinePrefetchHandles", "m", "wasScrollingForward", "Landroidx/compose/ui/layout/k1;", "Landroidx/compose/ui/layout/k1;", "G", "()Landroidx/compose/ui/layout/k1;", "V", "(Landroidx/compose/ui/layout/k1;)V", "remeasurement", "Landroidx/compose/ui/layout/l1;", "o", "Landroidx/compose/ui/layout/l1;", "H", "()Landroidx/compose/ui/layout/l1;", "remeasurementModifier", "Landroidx/compose/foundation/lazy/layout/a;", "p", "Landroidx/compose/foundation/lazy/layout/a;", "()Landroidx/compose/foundation/lazy/layout/a;", "awaitLayoutModifier", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "line", "", "Lkotlin/q0;", "Landroidx/compose/ui/unit/b;", "D", "()Lld/l;", "T", "(Lld/l;)V", "prefetchInfoRetriever", "Landroidx/compose/foundation/lazy/grid/l;", "r", "Landroidx/compose/foundation/lazy/grid/l;", "B", "()Landroidx/compose/foundation/lazy/grid/l;", "placementAnimator", "Landroidx/compose/foundation/lazy/layout/k;", "s", "Landroidx/compose/foundation/lazy/layout/k;", "()Landroidx/compose/foundation/lazy/layout/k;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/grid/e;", "t", "Landroidx/compose/foundation/lazy/grid/e;", "animateScrollScope", "Landroidx/compose/foundation/lazy/layout/c0;", "Landroidx/compose/foundation/lazy/layout/c0;", "A", "()Landroidx/compose/foundation/lazy/layout/c0;", "pinnedItems", "Landroidx/compose/foundation/lazy/layout/n0;", "v", "C", "()Landroidx/compose/runtime/k2;", "placementScopeInvalidator", "w", "R", "canScrollForward", "x", "Q", "canScrollBackward", "Landroidx/compose/foundation/lazy/layout/d0;", "Landroidx/compose/foundation/lazy/layout/d0;", "E", "()Landroidx/compose/foundation/lazy/layout/d0;", "prefetchState", "z", "numOfItemsToTeleport", "()Landroidx/compose/foundation/lazy/grid/u;", "Landroidx/compose/foundation/interaction/i;", "()Landroidx/compose/foundation/interaction/i;", "interactionSource", "Lkotlin/ranges/l;", "()Lkotlin/ranges/l;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/lazy/grid/k0;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x4
@r1({"SMAP\nLazyGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,508:1\n1208#2:509\n1187#2,2:510\n75#3:512\n108#3,2:513\n81#4:515\n107#4,2:516\n81#4:518\n81#4:519\n107#4,2:520\n81#4:522\n107#4,2:523\n460#5,11:525\n460#5,11:542\n33#6,6:536\n*S KotlinDebug\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState\n*L\n201#1:509\n201#1:510,2\n161#1:512\n161#1:513,2\n234#1:515\n234#1:516,2\n247#1:518\n299#1:519\n299#1:520,2\n301#1:522\n301#1:523,2\n385#1:525,11\n412#1:542,11\n390#1:536,6\n*E\n"})
/* loaded from: classes.dex */
public final class k0 implements w0 {
    public static final int A = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e0 scrollPosition;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2<w> layoutInfoState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.interaction.k internalInteractionSource;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float scrollToBeConsumed;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i2 slotsPerLine;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.unit.d density;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isVertical;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final w0 scrollableState;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int numMeasurePasses;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean prefetchingEnabled;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int lineToPrefetch;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.collection.g<d0.a> currentLinePrefetchHandles;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean wasScrollingForward;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private k1 remeasurement;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l1 remeasurementModifier;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.layout.a awaitLayoutModifier;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 prefetchInfoRetriever;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l placementAnimator;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.layout.k beyondBoundsInfo;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.grid.e animateScrollScope;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.layout.c0 pinnedItems;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2<kotlin.k2> placementScopeInvalidator;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 canScrollForward;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 canScrollBackward;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.layout.d0 prefetchState;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    @fg.l
    private static final androidx.compose.runtime.saveable.l<k0, ?> B = androidx.compose.runtime.saveable.a.a(a.f5749b, b.f5750b);

    /* compiled from: LazyGridState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/foundation/lazy/grid/k0;", "it", "", "", "a", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/foundation/lazy/grid/k0;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.p<androidx.compose.runtime.saveable.n, k0, List<? extends Integer>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f5749b = new a(2);

        a() {
            super(2);
        }

        @Override // ld.p
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Integer> invoke(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l k0 k0Var) {
            return kotlin.collections.w.O(Integer.valueOf(k0Var.r()), Integer.valueOf(k0Var.s()));
        }
    }

    /* compiled from: LazyGridState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Landroidx/compose/foundation/lazy/grid/k0;", "a", "(Ljava/util/List;)Landroidx/compose/foundation/lazy/grid/k0;"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.l<List<? extends Integer>, k0> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f5750b = new b(1);

        b() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke(@fg.l List<Integer> list) {
            return new k0(list.get(0).intValue(), list.get(1).intValue());
        }
    }

    /* compiled from: LazyGridState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/lazy/grid/k0$c;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/foundation/lazy/grid/k0;", "Saver", "Landroidx/compose/runtime/saveable/l;", "a", "()Landroidx/compose/runtime/saveable/l;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.grid.k0$c, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final androidx.compose.runtime.saveable.l<k0, ?> a() {
            return k0.B;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: LazyGridState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "it", "", "Lkotlin/q0;", "Landroidx/compose/ui/unit/b;", "a", "(I)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class d extends n0 implements ld.l<Integer, List<? extends q0<? extends Integer, ? extends androidx.compose.ui.unit.b>>> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f5751b = new d(1);

        d() {
            super(1);
        }

        @fg.l
        public final List<q0<Integer, androidx.compose.ui.unit.b>> a(int i4) {
            return kotlin.collections.j0.f74919b;
        }

        @Override // ld.l
        public List<? extends q0<? extends Integer, ? extends androidx.compose.ui.unit.b>> invoke(Integer num) {
            num.intValue();
            return kotlin.collections.j0.f74919b;
        }
    }

    /* compiled from: LazyGridState.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/foundation/lazy/grid/k0$e", "Landroidx/compose/ui/layout/l1;", "Landroidx/compose/ui/layout/k1;", "remeasurement", "Lkotlin/k2;", "K2", "(Landroidx/compose/ui/layout/k1;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e implements l1 {
        e() {
        }

        @Override // androidx.compose.ui.layout.l1
        public void K2(@fg.l k1 remeasurement) {
            k0.this.V(remeasurement);
        }
    }

    /* compiled from: LazyGridState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.grid.LazyGridState", f = "LazyGridState.kt", i = {0, 0, 0}, l = {289, 290}, m = "scroll", n = {"this", "scrollPriority", "block"}, s = {"L$0", "L$1", "L$2"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f5753b;

        /* renamed from: c, reason: collision with root package name */
        Object f5754c;

        /* renamed from: d, reason: collision with root package name */
        Object f5755d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f5756e;

        /* renamed from: g, reason: collision with root package name */
        int f5758g;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f5756e = obj;
            this.f5758g |= Integer.MIN_VALUE;
            return k0.this.f(null, null, this);
        }
    }

    /* compiled from: LazyGridState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2", f = "LazyGridState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/q0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/q0;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.coroutines.jvm.internal.o implements ld.p<androidx.compose.foundation.gestures.q0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f5759b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f5761d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f5762e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i4, int i5, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f5761d = i4;
            this.f5762e = i5;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.foundation.gestures.q0 q0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return k0.this.new g(this.f5761d, this.f5762e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f5759b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
            k0.this.Y(this.f5761d, this.f5762e);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: LazyGridState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class h extends n0 implements ld.l<Float, Float> {
        h() {
            super(1);
        }

        @fg.l
        public final Float a(float f4) {
            return Float.valueOf(-k0.this.N(-f4));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Float invoke(Float f4) {
            return a(f4.floatValue());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k0() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.k0.<init>():void");
    }

    private final void L(float delta, u layoutInfo) {
        int row;
        int index;
        androidx.compose.runtime.collection.g<d0.a> gVar;
        int size;
        androidx.compose.foundation.lazy.layout.d0 d0Var = this.prefetchState;
        if (this.prefetchingEnabled && !layoutInfo.j().isEmpty()) {
            boolean z4 = delta < 0.0f;
            if (z4) {
                k kVar = (k) kotlin.collections.w.p3(layoutInfo.j());
                row = (this.isVertical ? kVar.getRow() : kVar.getColumn()) + 1;
                index = ((k) kotlin.collections.w.p3(layoutInfo.j())).getIndex() + 1;
            } else {
                k kVar2 = (k) kotlin.collections.w.B2(layoutInfo.j());
                row = (this.isVertical ? kVar2.getRow() : kVar2.getColumn()) - 1;
                index = ((k) kotlin.collections.w.B2(layoutInfo.j())).getIndex() - 1;
            }
            if (row == this.lineToPrefetch || index < 0 || index >= layoutInfo.getTotalItemsCount()) {
                return;
            }
            if (this.wasScrollingForward != z4 && (size = (gVar = this.currentLinePrefetchHandles).getSize()) > 0) {
                d0.a[] L = gVar.L();
                int i4 = 0;
                do {
                    L[i4].cancel();
                    i4++;
                } while (i4 < size);
            }
            this.wasScrollingForward = z4;
            this.lineToPrefetch = row;
            this.currentLinePrefetchHandles.m();
            List<q0<Integer, androidx.compose.ui.unit.b>> invoke = D().invoke(Integer.valueOf(row));
            int size2 = invoke.size();
            for (int i5 = 0; i5 < size2; i5++) {
                q0<Integer, androidx.compose.ui.unit.b> q0Var = invoke.get(i5);
                this.currentLinePrefetchHandles.b(d0Var.b(q0Var.e().intValue(), q0Var.f().getValue()));
            }
        }
    }

    static /* synthetic */ void M(k0 k0Var, float f4, u uVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            uVar = k0Var.layoutInfoState.getValue();
        }
        k0Var.L(f4, uVar);
    }

    public static /* synthetic */ Object P(k0 k0Var, int i4, int i5, kotlin.coroutines.d dVar, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return k0Var.O(i4, i5, dVar);
    }

    private void Q(boolean z4) {
        this.canScrollBackward.setValue(Boolean.valueOf(z4));
    }

    private void R(boolean z4) {
        this.canScrollForward.setValue(Boolean.valueOf(z4));
    }

    public static /* synthetic */ Object k(k0 k0Var, int i4, int i5, kotlin.coroutines.d dVar, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return k0Var.j(i4, i5, dVar);
    }

    public static /* synthetic */ void m(k0 k0Var, w wVar, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        k0Var.l(wVar, z4);
    }

    private final void n(u info) {
        int row;
        if (this.lineToPrefetch == -1 || info.j().isEmpty()) {
            return;
        }
        if (this.wasScrollingForward) {
            k kVar = (k) kotlin.collections.w.p3(info.j());
            row = (this.isVertical ? kVar.getRow() : kVar.getColumn()) + 1;
        } else {
            k kVar2 = (k) kotlin.collections.w.B2(info.j());
            row = (this.isVertical ? kVar2.getRow() : kVar2.getColumn()) - 1;
        }
        if (this.lineToPrefetch != row) {
            this.lineToPrefetch = -1;
            androidx.compose.runtime.collection.g<d0.a> gVar = this.currentLinePrefetchHandles;
            int size = gVar.getSize();
            if (size > 0) {
                d0.a[] L = gVar.L();
                int i4 = 0;
                do {
                    L[i4].cancel();
                    i4++;
                } while (i4 < size);
            }
            this.currentLinePrefetchHandles.m();
        }
    }

    private static Object x(k0 k0Var) {
        return k0Var.scrollPosition.getNearestRangeState();
    }

    private final int z() {
        return this.slotsPerLine.f() * 100;
    }

    @fg.l
    /* renamed from: A, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.c0 getPinnedItems() {
        return this.pinnedItems;
    }

    @fg.l
    /* renamed from: B, reason: from getter */
    public final l getPlacementAnimator() {
        return this.placementAnimator;
    }

    @fg.l
    public final k2<kotlin.k2> C() {
        return this.placementScopeInvalidator;
    }

    @fg.l
    public final ld.l<Integer, List<q0<Integer, androidx.compose.ui.unit.b>>> D() {
        return (ld.l) this.prefetchInfoRetriever.getValue();
    }

    @fg.l
    /* renamed from: E, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.d0 getPrefetchState() {
        return this.prefetchState;
    }

    /* renamed from: F, reason: from getter */
    public final boolean getPrefetchingEnabled() {
        return this.prefetchingEnabled;
    }

    @fg.m
    /* renamed from: G, reason: from getter */
    public final k1 getRemeasurement() {
        return this.remeasurement;
    }

    @fg.l
    /* renamed from: H, reason: from getter */
    public final l1 getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    /* renamed from: I, reason: from getter */
    public final float getScrollToBeConsumed() {
        return this.scrollToBeConsumed;
    }

    public final int J() {
        return this.slotsPerLine.f();
    }

    /* renamed from: K, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    public final float N(float distance) {
        if ((distance < 0.0f && !a()) || (distance > 0.0f && !e())) {
            return 0.0f;
        }
        if (Math.abs(this.scrollToBeConsumed) > 0.5f) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.scrollToBeConsumed).toString());
        }
        float f4 = this.scrollToBeConsumed + distance;
        this.scrollToBeConsumed = f4;
        if (Math.abs(f4) > 0.5f) {
            w value = this.layoutInfoState.getValue();
            float f5 = this.scrollToBeConsumed;
            if (value.v(kotlin.math.b.L0(f5))) {
                l(value, true);
                androidx.compose.foundation.lazy.layout.n0.h(this.placementScopeInvalidator);
                L(f5 - this.scrollToBeConsumed, value);
            } else {
                k1 k1Var = this.remeasurement;
                if (k1Var != null) {
                    k1Var.p();
                }
                M(this, f5 - this.scrollToBeConsumed, null, 2, null);
            }
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return distance;
        }
        float f6 = distance - this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return f6;
    }

    @fg.m
    public final Object O(@androidx.annotation.g0(from = 0) int i4, int i5, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object h4 = w0.h(this, null, new g(i4, i5, null), dVar, 1, null);
        return h4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? h4 : kotlin.k2.f75408a;
    }

    public final void S(@fg.l androidx.compose.ui.unit.d dVar) {
        this.density = dVar;
    }

    public final void T(@fg.l ld.l<? super Integer, ? extends List<q0<Integer, androidx.compose.ui.unit.b>>> lVar) {
        this.prefetchInfoRetriever.setValue(lVar);
    }

    public final void U(boolean z4) {
        this.prefetchingEnabled = z4;
    }

    public final void V(@fg.m k1 k1Var) {
        this.remeasurement = k1Var;
    }

    public final void W(int i4) {
        this.slotsPerLine.k(i4);
    }

    public final void X(boolean z4) {
        this.isVertical = z4;
    }

    public final void Y(int index, int scrollOffset) {
        this.scrollPosition.d(index, scrollOffset);
        this.placementAnimator.g();
        k1 k1Var = this.remeasurement;
        if (k1Var != null) {
            k1Var.p();
        }
    }

    public final int Z(@fg.l n itemProvider, int firstItemIndex) {
        return this.scrollPosition.j(itemProvider, firstItemIndex);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.w0
    public boolean a() {
        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.w0
    public float b(float delta) {
        return this.scrollableState.b(delta);
    }

    @Override // androidx.compose.foundation.gestures.w0
    public boolean d() {
        return this.scrollableState.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.w0
    public boolean e() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
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
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.grid.k0.f
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.grid.k0$f r0 = (androidx.compose.foundation.lazy.grid.k0.f) r0
            int r1 = r0.f5758g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5758g = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.grid.k0$f r0 = new androidx.compose.foundation.lazy.grid.k0$f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f5756e
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f5758g
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
            java.lang.Object r6 = r0.f5755d
            r7 = r6
            ld.p r7 = (ld.p) r7
            java.lang.Object r6 = r0.f5754c
            androidx.compose.foundation.a2 r6 = (androidx.compose.foundation.a2) r6
            java.lang.Object r2 = r0.f5753b
            androidx.compose.foundation.lazy.grid.k0 r2 = (androidx.compose.foundation.lazy.grid.k0) r2
            kotlin.a1.n(r8)
            goto L58
        L43:
            kotlin.a1.n(r8)
            androidx.compose.foundation.lazy.layout.a r8 = r5.awaitLayoutModifier
            r0.f5753b = r5
            r0.f5754c = r6
            r0.f5755d = r7
            r0.f5758g = r4
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L57
            return r1
        L57:
            r2 = r5
        L58:
            androidx.compose.foundation.gestures.w0 r8 = r2.scrollableState
            r2 = 0
            r0.f5753b = r2
            r0.f5754c = r2
            r0.f5755d = r2
            r0.f5758g = r3
            java.lang.Object r6 = r8.f(r6, r7, r0)
            if (r6 != r1) goto L6a
            return r1
        L6a:
            kotlin.k2 r6 = kotlin.k2.f75408a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.k0.f(androidx.compose.foundation.a2, ld.p, kotlin.coroutines.d):java.lang.Object");
    }

    @fg.m
    public final Object j(@androidx.annotation.g0(from = 0) int i4, int i5, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object d5 = androidx.compose.foundation.lazy.layout.f.d(this.animateScrollScope, i4, i5, z(), this.density, dVar);
        return d5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? d5 : kotlin.k2.f75408a;
    }

    public final void l(@fg.l w result, boolean visibleItemsStayedTheSame) {
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.layoutInfoState.setValue(result);
        if (visibleItemsStayedTheSame) {
            this.scrollPosition.i(result.getFirstVisibleLineScrollOffset());
        } else {
            this.scrollPosition.h(result);
            n(result);
        }
        Q(result.k());
        R(result.getCanScrollForward());
        this.numMeasurePasses++;
    }

    @fg.l
    /* renamed from: o, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.a getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    @fg.l
    /* renamed from: p, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.k getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    @fg.l
    /* renamed from: q, reason: from getter */
    public final androidx.compose.ui.unit.d getDensity() {
        return this.density;
    }

    public final int r() {
        return this.scrollPosition.a();
    }

    public final int s() {
        return this.scrollPosition.c();
    }

    @fg.l
    public final androidx.compose.foundation.interaction.i t() {
        return this.internalInteractionSource;
    }

    @fg.l
    /* renamed from: u, reason: from getter */
    public final androidx.compose.foundation.interaction.k getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    @fg.l
    public final u v() {
        return this.layoutInfoState.getValue();
    }

    @fg.l
    public final kotlin.ranges.l w() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    /* renamed from: y, reason: from getter */
    public final int getNumMeasurePasses() {
        return this.numMeasurePasses;
    }

    public k0(int i4, int i5) {
        w wVar;
        k2 g4;
        k2 g5;
        k2 g6;
        e0 e0Var = new e0(i4, i5);
        this.scrollPosition = e0Var;
        wVar = l0.f5777a;
        this.layoutInfoState = androidx.compose.runtime.b.e(wVar, o4.m());
        this.internalInteractionSource = androidx.compose.foundation.interaction.j.a();
        this.slotsPerLine = androidx.compose.runtime.b.c(0);
        this.density = androidx.compose.ui.unit.f.a(1.0f, 1.0f);
        this.isVertical = true;
        this.scrollableState = x0.a(new h());
        this.prefetchingEnabled = true;
        this.lineToPrefetch = -1;
        this.currentLinePrefetchHandles = new androidx.compose.runtime.collection.g<>(new d0.a[16], 0);
        this.remeasurementModifier = new e();
        this.awaitLayoutModifier = new androidx.compose.foundation.lazy.layout.a();
        g4 = t4.g(d.f5751b, null, 2, null);
        this.prefetchInfoRetriever = g4;
        this.placementAnimator = new l();
        this.beyondBoundsInfo = new androidx.compose.foundation.lazy.layout.k();
        this.animateScrollScope = new androidx.compose.foundation.lazy.grid.e(this);
        this.pinnedItems = new androidx.compose.foundation.lazy.layout.c0();
        e0Var.getNearestRangeState();
        this.placementScopeInvalidator = androidx.compose.foundation.lazy.layout.n0.d(null, 1, null);
        Boolean bool = Boolean.FALSE;
        g5 = t4.g(bool, null, 2, null);
        this.canScrollForward = g5;
        g6 = t4.g(bool, null, 2, null);
        this.canScrollBackward = g6;
        this.prefetchState = new androidx.compose.foundation.lazy.layout.d0();
    }

    public /* synthetic */ k0(int i4, int i5, int i6, kotlin.jvm.internal.w wVar) {
        this((i6 & 1) != 0 ? 0 : i4, (i6 & 2) != 0 ? 0 : i5);
    }
}
