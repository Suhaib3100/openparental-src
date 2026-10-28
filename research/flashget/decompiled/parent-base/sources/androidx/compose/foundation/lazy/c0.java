package androidx.compose.foundation.lazy;

import androidx.annotation.g0;
import androidx.compose.animation.core.c2;
import androidx.compose.animation.core.y1;
import androidx.compose.foundation.gestures.q0;
import androidx.compose.foundation.gestures.w0;
import androidx.compose.foundation.gestures.x0;
import androidx.compose.foundation.lazy.layout.d0;
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
import kotlinx.coroutines.r0;

/* compiled from: LazyListState.kt */
@Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 ±\u00012\u00020\u0001:\u0001=B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0015\u001a\u00020\u000b2\b\b\u0001\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0017\u0010\u0006JA\u0010 \u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182'\u0010\u001f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001a¢\u0006\u0002\b\u001eH\u0096@¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0007H\u0000¢\u0006\u0004\b%\u0010#J$\u0010&\u001a\u00020\u000b2\b\b\u0001\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b&\u0010\u0016J)\u0010,\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020)H\u0000¢\u0006\u0004\b,\u0010-J\u001f\u00101\u001a\u00020\u00022\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u0002H\u0000¢\u0006\u0004\b1\u00102R$\u00107\u001a\u00020)2\u0006\u00103\u001a\u00020)8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b4\u0010\u0017\u001a\u0004\b5\u00106R(\u0010;\u001a\u0004\u0018\u00010'2\b\u00103\u001a\u0004\u0018\u00010'8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\"\u00108\u001a\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020'0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010L\u001a\u00020H8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010I\u001a\u0004\bJ\u0010KR$\u0010Q\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00078\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u0014\u0010\\\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R$\u0010a\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\"\u0010e\u001a\u00020)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bb\u0010\u0017\u001a\u0004\b^\u00106\"\u0004\bc\u0010dR\u0016\u0010f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010^R\u0018\u0010j\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010k\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u0017R(\u0010q\u001a\u0004\u0018\u00010l2\b\u00103\u001a\u0004\u0018\u00010l8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u001a\u0010v\u001a\u00020r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010s\u001a\u0004\bt\u0010uR\u001a\u0010{\u001a\u00020w8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bx\u0010zR\u001c\u0010\u0081\u0001\u001a\u00020|8\u0000X\u0080\u0004¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001f\u0010\u0086\u0001\u001a\u00030\u0082\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0005\b}\u0010\u0085\u0001R/\u0010\u008c\u0001\u001a\u00030\u0087\u00018\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0017\n\u0005\bU\u0010\u0088\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R \u0010\u0092\u0001\u001a\u00030\u008d\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R.\u0010\u0095\u0001\u001a\u00020)2\u0006\u00103\u001a\u00020)8V@RX\u0096\u008e\u0002¢\u0006\u0014\n\u0005\b\u0093\u0001\u0010F\u001a\u0004\b4\u00106\"\u0005\b\u0094\u0001\u0010dR-\u0010\u0097\u0001\u001a\u00020)2\u0006\u00103\u001a\u00020)8V@RX\u0096\u008e\u0002¢\u0006\u0013\n\u0004\b5\u0010F\u001a\u0004\bE\u00106\"\u0005\b\u0096\u0001\u0010dR$\u0010\u009b\u0001\u001a\u00030\u0098\u00018\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010F\u001a\u0005\bN\u0010\u009a\u0001R\u001f\u0010 \u0001\u001a\u00030\u009c\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\bJ\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R+\u0010¦\u0001\u001a\u0005\u0018\u00010¡\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010¢\u0001\u001a\u0006\b\u0083\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R'\u0010«\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030¨\u00010§\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u0012\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010`R\u0012\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010`R\u0013\u0010\n\u001a\u00020\t8F¢\u0006\b\u001a\u0006\b©\u0001\u0010¬\u0001R\u0015\u0010¯\u0001\u001a\u00030\u00ad\u00018F¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010®\u0001R!\u0010µ\u0001\u001a\u00030°\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\b±\u0001\u0010²\u0001*\u0006\b³\u0001\u0010´\u0001R\u0015\u0010¶\u0001\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u00106R\u0016\u0010¸\u0001\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b·\u0001\u0010P\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¹\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/c0;", "Landroidx/compose/foundation/gestures/w0;", "", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "<init>", "(II)V", "", "delta", "Landroidx/compose/foundation/lazy/s;", "layoutInfo", "Lkotlin/k2;", "O", "(FLandroidx/compose/foundation/lazy/s;)V", "info", "p", "(Landroidx/compose/foundation/lazy/s;)V", "a0", "(F)V", "index", "scrollOffset", "R", "(IILkotlin/coroutines/d;)Ljava/lang/Object;", "Z", "Landroidx/compose/foundation/a2;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/q0;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "f", "(Landroidx/compose/foundation/a2;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "(F)F", "distance", "Q", "l", "Landroidx/compose/foundation/lazy/u;", "result", "", "isLookingAhead", "visibleItemsStayedTheSame", "n", "(Landroidx/compose/foundation/lazy/u;ZZ)V", "Landroidx/compose/foundation/lazy/o;", "itemProvider", "firstItemIndex", "b0", "(Landroidx/compose/foundation/lazy/o;I)I", "<set-?>", "a", "w", "()Z", "hasLookaheadPassOccurred", "Landroidx/compose/foundation/lazy/u;", "G", "()Landroidx/compose/foundation/lazy/u;", "postLookaheadLayoutInfo", "Landroidx/compose/foundation/lazy/z;", "c", "Landroidx/compose/foundation/lazy/z;", "scrollPosition", "Landroidx/compose/foundation/lazy/f;", "d", "Landroidx/compose/foundation/lazy/f;", "animateScrollScope", "Landroidx/compose/runtime/k2;", "e", "Landroidx/compose/runtime/k2;", "layoutInfoState", "Landroidx/compose/foundation/interaction/k;", "Landroidx/compose/foundation/interaction/k;", "y", "()Landroidx/compose/foundation/interaction/k;", "internalInteractionSource", "g", "F", "N", "()F", "scrollToBeConsumed", "Landroidx/compose/ui/unit/d;", "h", "Landroidx/compose/ui/unit/d;", "t", "()Landroidx/compose/ui/unit/d;", "W", "(Landroidx/compose/ui/unit/d;)V", "density", "i", "Landroidx/compose/foundation/gestures/w0;", "scrollableState", "j", "I", "D", "()I", "numMeasurePasses", "k", "X", "(Z)V", "prefetchingEnabled", "indexToPrefetch", "Landroidx/compose/foundation/lazy/layout/d0$a;", "m", "Landroidx/compose/foundation/lazy/layout/d0$a;", "currentPrefetchHandle", "wasScrollingForward", "Landroidx/compose/ui/layout/k1;", "o", "Landroidx/compose/ui/layout/k1;", "K", "()Landroidx/compose/ui/layout/k1;", "remeasurement", "Landroidx/compose/ui/layout/l1;", "Landroidx/compose/ui/layout/l1;", "L", "()Landroidx/compose/ui/layout/l1;", "remeasurementModifier", "Landroidx/compose/foundation/lazy/layout/a;", "q", "Landroidx/compose/foundation/lazy/layout/a;", "()Landroidx/compose/foundation/lazy/layout/a;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/l;", "r", "Landroidx/compose/foundation/lazy/l;", "z", "()Landroidx/compose/foundation/lazy/l;", "itemAnimator", "Landroidx/compose/foundation/lazy/layout/k;", "s", "Landroidx/compose/foundation/lazy/layout/k;", "()Landroidx/compose/foundation/lazy/layout/k;", "beyondBoundsInfo", "Landroidx/compose/ui/unit/b;", "J", "()J", "Y", "(J)V", "premeasureConstraints", "Landroidx/compose/foundation/lazy/layout/c0;", "u", "Landroidx/compose/foundation/lazy/layout/c0;", "E", "()Landroidx/compose/foundation/lazy/layout/c0;", "pinnedItems", "v", "U", "canScrollForward", "T", "canScrollBackward", "Landroidx/compose/foundation/lazy/layout/n0;", "x", "()Landroidx/compose/runtime/k2;", "placementScopeInvalidator", "Landroidx/compose/foundation/lazy/layout/d0;", "Landroidx/compose/foundation/lazy/layout/d0;", "H", "()Landroidx/compose/foundation/lazy/layout/d0;", "prefetchState", "Lkotlinx/coroutines/r0;", "Lkotlinx/coroutines/r0;", "()Lkotlinx/coroutines/r0;", "V", "(Lkotlinx/coroutines/r0;)V", "coroutineScope", "Landroidx/compose/animation/core/m;", "Landroidx/compose/animation/core/o;", "A", "Landroidx/compose/animation/core/m;", "_scrollDeltaBetweenPasses", "()Landroidx/compose/foundation/lazy/s;", "Landroidx/compose/foundation/interaction/i;", "()Landroidx/compose/foundation/interaction/i;", "interactionSource", "Lkotlin/ranges/l;", "B", "()Lkotlin/ranges/l;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/lazy/c0;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "M", "scrollDeltaBetweenPasses", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x4
@r1({"SMAP\nLazyListState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,567:1\n81#2:568\n81#2:569\n107#2,2:570\n81#2:572\n107#2,2:573\n1#3:575\n495#4,4:576\n500#4:585\n129#5,5:580\n*S KotlinDebug\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListState\n*L\n254#1:568\n304#1:569\n304#1:570,2\n306#1:572\n306#1:573,2\n489#1:576,4\n489#1:585\n489#1:580,5\n*E\n"})
/* loaded from: classes.dex */
public final class c0 implements w0 {
    public static final int C = 0;

    /* renamed from: A, reason: from kotlin metadata */
    @fg.l
    private androidx.compose.animation.core.m<Float, androidx.compose.animation.core.o> _scrollDeltaBetweenPasses;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean hasLookaheadPassOccurred;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private u postLookaheadLayoutInfo;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final z scrollPosition;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.f animateScrollScope;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2<u> layoutInfoState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.interaction.k internalInteractionSource;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float scrollToBeConsumed;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.unit.d density;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final w0 scrollableState;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int numMeasurePasses;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean prefetchingEnabled;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int indexToPrefetch;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private d0.a currentPrefetchHandle;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean wasScrollingForward;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private k1 remeasurement;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l1 remeasurementModifier;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.layout.a awaitLayoutModifier;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l itemAnimator;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.layout.k beyondBoundsInfo;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private long premeasureConstraints;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.layout.c0 pinnedItems;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 canScrollForward;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 canScrollBackward;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2<kotlin.k2> placementScopeInvalidator;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.layout.d0 prefetchState;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private r0 coroutineScope;

    /* renamed from: B, reason: from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    @fg.l
    private static final androidx.compose.runtime.saveable.l<c0, ?> D = androidx.compose.runtime.saveable.a.a(a.f5533b, b.f5534b);

    /* compiled from: LazyListState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/foundation/lazy/c0;", "it", "", "", "a", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/foundation/lazy/c0;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.p<androidx.compose.runtime.saveable.n, c0, List<? extends Integer>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f5533b = new a(2);

        a() {
            super(2);
        }

        @Override // ld.p
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Integer> invoke(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l c0 c0Var) {
            return kotlin.collections.w.O(Integer.valueOf(c0Var.u()), Integer.valueOf(c0Var.v()));
        }
    }

    /* compiled from: LazyListState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Landroidx/compose/foundation/lazy/c0;", "a", "(Ljava/util/List;)Landroidx/compose/foundation/lazy/c0;"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.l<List<? extends Integer>, c0> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f5534b = new b(1);

        b() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c0 invoke(@fg.l List<Integer> list) {
            return new c0(list.get(0).intValue(), list.get(1).intValue());
        }
    }

    /* compiled from: LazyListState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/lazy/c0$c;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/foundation/lazy/c0;", "Saver", "Landroidx/compose/runtime/saveable/l;", "a", "()Landroidx/compose/runtime/saveable/l;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.c0$c, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final androidx.compose.runtime.saveable.l<c0, ?> a() {
            return c0.D;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: LazyListState.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/foundation/lazy/c0$d", "Landroidx/compose/ui/layout/l1;", "Landroidx/compose/ui/layout/k1;", "remeasurement", "Lkotlin/k2;", "K2", "(Landroidx/compose/ui/layout/k1;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements l1 {
        d() {
        }

        @Override // androidx.compose.ui.layout.l1
        public void K2(@fg.l k1 remeasurement) {
            c0.this.remeasurement = remeasurement;
        }
    }

    /* compiled from: LazyListState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.LazyListState", f = "LazyListState.kt", i = {0, 0, 0}, l = {294, 295}, m = "scroll", n = {"this", "scrollPriority", "block"}, s = {"L$0", "L$1", "L$2"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f5536b;

        /* renamed from: c, reason: collision with root package name */
        Object f5537c;

        /* renamed from: d, reason: collision with root package name */
        Object f5538d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f5539e;

        /* renamed from: g, reason: collision with root package name */
        int f5541g;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f5539e = obj;
            this.f5541g |= Integer.MIN_VALUE;
            return c0.this.f(null, null, this);
        }
    }

    /* compiled from: LazyListState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", f = "LazyListState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/q0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/q0;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.coroutines.jvm.internal.o implements ld.p<q0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f5542b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f5544d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f5545e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i4, int i5, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f5544d = i4;
            this.f5545e = i5;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l q0 q0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return c0.this.new f(this.f5544d, this.f5545e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f5542b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1.n(obj);
            c0.this.Z(this.f5544d, this.f5545e);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: LazyListState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class g extends n0 implements ld.l<Float, Float> {
        g() {
            super(1);
        }

        @fg.l
        public final Float a(float f4) {
            return Float.valueOf(-c0.this.Q(-f4));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Float invoke(Float f4) {
            return a(f4.floatValue());
        }
    }

    /* compiled from: LazyListState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.LazyListState$updateScrollDeltaForPostLookahead$2$1", f = "LazyListState.kt", i = {}, l = {495}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f5547b;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return c0.this.new h(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f5547b;
            if (i4 == 0) {
                a1.n(obj);
                androidx.compose.animation.core.m mVar = c0.this._scrollDeltaBetweenPasses;
                Float f4 = new Float(0.0f);
                y1 p4 = androidx.compose.animation.core.l.p(0.0f, 400.0f, new Float(0.5f), 1, null);
                this.f5547b = 1;
                if (c2.m(mVar, f4, p4, true, null, this, 8, null) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((h) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: LazyListState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.LazyListState$updateScrollDeltaForPostLookahead$2$2", f = "LazyListState.kt", i = {}, l = {504}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f5549b;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return c0.this.new i(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f5549b;
            if (i4 == 0) {
                a1.n(obj);
                androidx.compose.animation.core.m mVar = c0.this._scrollDeltaBetweenPasses;
                Float f4 = new Float(0.0f);
                y1 p4 = androidx.compose.animation.core.l.p(0.0f, 400.0f, new Float(0.5f), 1, null);
                this.f5549b = 1;
                if (c2.m(mVar, f4, p4, true, null, this, 8, null) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((i) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c0() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.c0.<init>():void");
    }

    private static Object C(c0 c0Var) {
        return c0Var.scrollPosition.getNearestRangeState();
    }

    private final void O(float delta, s layoutInfo) {
        d0.a aVar;
        if (this.prefetchingEnabled && !layoutInfo.j().isEmpty()) {
            boolean z4 = delta < 0.0f;
            int index = z4 ? ((n) kotlin.collections.w.p3(layoutInfo.j())).getIndex() + 1 : ((n) kotlin.collections.w.B2(layoutInfo.j())).getIndex() - 1;
            if (index == this.indexToPrefetch || index < 0 || index >= layoutInfo.getTotalItemsCount()) {
                return;
            }
            if (this.wasScrollingForward != z4 && (aVar = this.currentPrefetchHandle) != null) {
                aVar.cancel();
            }
            this.wasScrollingForward = z4;
            this.indexToPrefetch = index;
            this.currentPrefetchHandle = this.prefetchState.b(index, this.premeasureConstraints);
        }
    }

    static /* synthetic */ void P(c0 c0Var, float f4, s sVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            sVar = c0Var.A();
        }
        c0Var.O(f4, sVar);
    }

    public static /* synthetic */ Object S(c0 c0Var, int i4, int i5, kotlin.coroutines.d dVar, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return c0Var.R(i4, i5, dVar);
    }

    private void T(boolean z4) {
        this.canScrollBackward.setValue(Boolean.valueOf(z4));
    }

    private void U(boolean z4) {
        this.canScrollForward.setValue(Boolean.valueOf(z4));
    }

    private final void a0(float delta) {
        float f4;
        androidx.compose.ui.unit.d dVar = this.density;
        f4 = d0.f5551a;
        if (delta <= dVar.v5(f4)) {
            return;
        }
        androidx.compose.runtime.snapshots.m c5 = androidx.compose.runtime.snapshots.m.INSTANCE.c();
        try {
            androidx.compose.runtime.snapshots.m r4 = c5.r();
            try {
                float floatValue = this._scrollDeltaBetweenPasses.getValue().floatValue();
                if (this._scrollDeltaBetweenPasses.getIsRunning()) {
                    this._scrollDeltaBetweenPasses = androidx.compose.animation.core.n.g(this._scrollDeltaBetweenPasses, floatValue - delta, 0.0f, 0L, 0L, false, 30, null);
                    r0 r0Var = this.coroutineScope;
                    if (r0Var != null) {
                        kotlinx.coroutines.k.f(r0Var, null, null, new h(null), 3, null);
                    }
                } else {
                    this._scrollDeltaBetweenPasses = new androidx.compose.animation.core.m<>(androidx.compose.animation.core.k2.i(kotlin.jvm.internal.a0.f75283a), Float.valueOf(-delta), null, 0L, 0L, false, 60, null);
                    r0 r0Var2 = this.coroutineScope;
                    if (r0Var2 != null) {
                        kotlinx.coroutines.k.f(r0Var2, null, null, new i(null), 3, null);
                    }
                }
                c5.y(r4);
            } catch (Throwable th) {
                c5.y(r4);
                throw th;
            }
        } finally {
            c5.d();
        }
    }

    public static /* synthetic */ Object m(c0 c0Var, int i4, int i5, kotlin.coroutines.d dVar, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return c0Var.l(i4, i5, dVar);
    }

    public static /* synthetic */ void o(c0 c0Var, u uVar, boolean z4, boolean z5, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z5 = false;
        }
        c0Var.n(uVar, z4, z5);
    }

    private final void p(s info) {
        if (this.indexToPrefetch == -1 || info.j().isEmpty()) {
            return;
        }
        if (this.indexToPrefetch != (this.wasScrollingForward ? ((n) kotlin.collections.w.p3(info.j())).getIndex() + 1 : ((n) kotlin.collections.w.B2(info.j())).getIndex() - 1)) {
            this.indexToPrefetch = -1;
            d0.a aVar = this.currentPrefetchHandle;
            if (aVar != null) {
                aVar.cancel();
            }
            this.currentPrefetchHandle = null;
        }
    }

    @fg.l
    public final s A() {
        return this.layoutInfoState.getValue();
    }

    @fg.l
    public final kotlin.ranges.l B() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    /* renamed from: D, reason: from getter */
    public final int getNumMeasurePasses() {
        return this.numMeasurePasses;
    }

    @fg.l
    /* renamed from: E, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.c0 getPinnedItems() {
        return this.pinnedItems;
    }

    @fg.l
    public final k2<kotlin.k2> F() {
        return this.placementScopeInvalidator;
    }

    @fg.m
    /* renamed from: G, reason: from getter */
    public final u getPostLookaheadLayoutInfo() {
        return this.postLookaheadLayoutInfo;
    }

    @fg.l
    /* renamed from: H, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.d0 getPrefetchState() {
        return this.prefetchState;
    }

    /* renamed from: I, reason: from getter */
    public final boolean getPrefetchingEnabled() {
        return this.prefetchingEnabled;
    }

    /* renamed from: J, reason: from getter */
    public final long getPremeasureConstraints() {
        return this.premeasureConstraints;
    }

    @fg.m
    /* renamed from: K, reason: from getter */
    public final k1 getRemeasurement() {
        return this.remeasurement;
    }

    @fg.l
    /* renamed from: L, reason: from getter */
    public final l1 getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    public final float M() {
        return this._scrollDeltaBetweenPasses.getValue().floatValue();
    }

    /* renamed from: N, reason: from getter */
    public final float getScrollToBeConsumed() {
        return this.scrollToBeConsumed;
    }

    public final float Q(float distance) {
        if ((distance < 0.0f && !a()) || (distance > 0.0f && !e())) {
            return 0.0f;
        }
        if (Math.abs(this.scrollToBeConsumed) > 0.5f) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.scrollToBeConsumed).toString());
        }
        float f4 = this.scrollToBeConsumed + distance;
        this.scrollToBeConsumed = f4;
        if (Math.abs(f4) > 0.5f) {
            u value = this.layoutInfoState.getValue();
            float f5 = this.scrollToBeConsumed;
            int L0 = kotlin.math.b.L0(f5);
            u uVar = this.postLookaheadLayoutInfo;
            boolean C2 = value.C(L0, !this.hasLookaheadPassOccurred);
            if (C2 && uVar != null) {
                C2 = uVar.C(L0, true);
            }
            if (C2) {
                n(value, this.hasLookaheadPassOccurred, true);
                androidx.compose.foundation.lazy.layout.n0.h(this.placementScopeInvalidator);
                O(f5 - this.scrollToBeConsumed, value);
            } else {
                k1 k1Var = this.remeasurement;
                if (k1Var != null) {
                    k1Var.p();
                }
                P(this, f5 - this.scrollToBeConsumed, null, 2, null);
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
    public final Object R(@g0(from = 0) int i4, int i5, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object h4 = w0.h(this, null, new f(i4, i5, null), dVar, 1, null);
        return h4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? h4 : kotlin.k2.f75408a;
    }

    public final void V(@fg.m r0 r0Var) {
        this.coroutineScope = r0Var;
    }

    public final void W(@fg.l androidx.compose.ui.unit.d dVar) {
        this.density = dVar;
    }

    public final void X(boolean z4) {
        this.prefetchingEnabled = z4;
    }

    public final void Y(long j4) {
        this.premeasureConstraints = j4;
    }

    public final void Z(int index, int scrollOffset) {
        this.scrollPosition.d(index, scrollOffset);
        this.itemAnimator.f();
        k1 k1Var = this.remeasurement;
        if (k1Var != null) {
            k1Var.p();
        }
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

    public final int b0(@fg.l o itemProvider, int firstItemIndex) {
        return this.scrollPosition.j(itemProvider, firstItemIndex);
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
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.c0.e
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.c0$e r0 = (androidx.compose.foundation.lazy.c0.e) r0
            int r1 = r0.f5541g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5541g = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.c0$e r0 = new androidx.compose.foundation.lazy.c0$e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f5539e
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f5541g
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
            java.lang.Object r6 = r0.f5538d
            r7 = r6
            ld.p r7 = (ld.p) r7
            java.lang.Object r6 = r0.f5537c
            androidx.compose.foundation.a2 r6 = (androidx.compose.foundation.a2) r6
            java.lang.Object r2 = r0.f5536b
            androidx.compose.foundation.lazy.c0 r2 = (androidx.compose.foundation.lazy.c0) r2
            kotlin.a1.n(r8)
            goto L58
        L43:
            kotlin.a1.n(r8)
            androidx.compose.foundation.lazy.layout.a r8 = r5.awaitLayoutModifier
            r0.f5536b = r5
            r0.f5537c = r6
            r0.f5538d = r7
            r0.f5541g = r4
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L57
            return r1
        L57:
            r2 = r5
        L58:
            androidx.compose.foundation.gestures.w0 r8 = r2.scrollableState
            r2 = 0
            r0.f5536b = r2
            r0.f5537c = r2
            r0.f5538d = r2
            r0.f5541g = r3
            java.lang.Object r6 = r8.f(r6, r7, r0)
            if (r6 != r1) goto L6a
            return r1
        L6a:
            kotlin.k2 r6 = kotlin.k2.f75408a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.c0.f(androidx.compose.foundation.a2, ld.p, kotlin.coroutines.d):java.lang.Object");
    }

    @fg.m
    public final Object l(@g0(from = 0) int i4, int i5, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object d5 = androidx.compose.foundation.lazy.layout.f.d(this.animateScrollScope, i4, i5, 100, this.density, dVar);
        return d5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? d5 : kotlin.k2.f75408a;
    }

    public final void n(@fg.l u result, boolean isLookingAhead, boolean visibleItemsStayedTheSame) {
        if (!isLookingAhead && this.hasLookaheadPassOccurred) {
            this.postLookaheadLayoutInfo = result;
            return;
        }
        if (isLookingAhead) {
            this.hasLookaheadPassOccurred = true;
        }
        if (visibleItemsStayedTheSame) {
            this.scrollPosition.i(result.getFirstVisibleItemScrollOffset());
        } else {
            this.scrollPosition.h(result);
            p(result);
        }
        T(result.s());
        U(result.getCanScrollForward());
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.layoutInfoState.setValue(result);
        if (isLookingAhead) {
            a0(result.getScrollBackAmount());
        }
        this.numMeasurePasses++;
    }

    @fg.l
    /* renamed from: q, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.a getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    @fg.l
    /* renamed from: r, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.k getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    @fg.m
    /* renamed from: s, reason: from getter */
    public final r0 getCoroutineScope() {
        return this.coroutineScope;
    }

    @fg.l
    /* renamed from: t, reason: from getter */
    public final androidx.compose.ui.unit.d getDensity() {
        return this.density;
    }

    public final int u() {
        return this.scrollPosition.a();
    }

    public final int v() {
        return this.scrollPosition.c();
    }

    /* renamed from: w, reason: from getter */
    public final boolean getHasLookaheadPassOccurred() {
        return this.hasLookaheadPassOccurred;
    }

    @fg.l
    public final androidx.compose.foundation.interaction.i x() {
        return this.internalInteractionSource;
    }

    @fg.l
    /* renamed from: y, reason: from getter */
    public final androidx.compose.foundation.interaction.k getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    @fg.l
    /* renamed from: z, reason: from getter */
    public final l getItemAnimator() {
        return this.itemAnimator;
    }

    public c0(int i4, int i5) {
        u uVar;
        k2 g4;
        k2 g5;
        androidx.compose.animation.core.m<Float, androidx.compose.animation.core.o> b5;
        z zVar = new z(i4, i5);
        this.scrollPosition = zVar;
        this.animateScrollScope = new androidx.compose.foundation.lazy.f(this);
        uVar = d0.f5552b;
        this.layoutInfoState = androidx.compose.runtime.b.e(uVar, o4.m());
        this.internalInteractionSource = androidx.compose.foundation.interaction.j.a();
        this.density = androidx.compose.ui.unit.f.a(1.0f, 1.0f);
        this.scrollableState = x0.a(new g());
        this.prefetchingEnabled = true;
        this.indexToPrefetch = -1;
        this.remeasurementModifier = new d();
        this.awaitLayoutModifier = new androidx.compose.foundation.lazy.layout.a();
        this.itemAnimator = new l();
        this.beyondBoundsInfo = new androidx.compose.foundation.lazy.layout.k();
        this.premeasureConstraints = androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null);
        this.pinnedItems = new androidx.compose.foundation.lazy.layout.c0();
        zVar.getNearestRangeState();
        Boolean bool = Boolean.FALSE;
        g4 = t4.g(bool, null, 2, null);
        this.canScrollForward = g4;
        g5 = t4.g(bool, null, 2, null);
        this.canScrollBackward = g5;
        this.placementScopeInvalidator = androidx.compose.foundation.lazy.layout.n0.d(null, 1, null);
        this.prefetchState = new androidx.compose.foundation.lazy.layout.d0();
        b5 = androidx.compose.animation.core.n.b(androidx.compose.animation.core.k2.i(kotlin.jvm.internal.a0.f75283a), Float.valueOf(0.0f), Float.valueOf(0.0f), (r19 & 8) != 0 ? Long.MIN_VALUE : 0L, (r19 & 16) != 0 ? Long.MIN_VALUE : 0L, (r19 & 32) != 0 ? false : false);
        this._scrollDeltaBetweenPasses = b5;
    }

    public /* synthetic */ c0(int i4, int i5, int i6, kotlin.jvm.internal.w wVar) {
        this((i6 & 1) != 0 ? 0 : i4, (i6 & 2) != 0 ? 0 : i5);
    }
}
