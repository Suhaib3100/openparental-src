package androidx.compose.ui.layout;

import androidx.collection.q2;
import androidx.compose.runtime.r3;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.x4;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.layout.q1;
import androidx.compose.ui.layout.r1;
import androidx.compose.ui.layout.t1;
import androidx.compose.ui.node.h0;
import androidx.compose.ui.node.m0;
import androidx.compose.ui.platform.l6;
import androidx.core.view.x1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: SubcomposeLayout.kt */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0004\u008b\u0001SUB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u000f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014JD\u0010\u001d\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u0004\u0018\u00010\t2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u0018H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010'J\u0013\u0010(\u001a\u00020\f*\u00020\u0002H\u0002¢\u0006\u0004\b(\u0010)J\u001b\u0010*\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\fH\u0002¢\u0006\u0004\b,\u0010'J(\u00100\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\u000e\b\u0004\u0010/\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082\b¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b2\u00103J)\u00107\u001a\u00020\f2\u0006\u00104\u001a\u00020\u001f2\u0006\u00105\u001a\u00020\u001f2\b\b\u0002\u00106\u001a\u00020\u001fH\u0002¢\u0006\u0004\b7\u00108J\u001e\u0010:\u001a\u00020\f2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082\b¢\u0006\u0004\b:\u0010;J2\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\fH\u0016¢\u0006\u0004\b@\u0010'J\u000f\u0010A\u001a\u00020\fH\u0016¢\u0006\u0004\bA\u0010'J\u000f\u0010B\u001a\u00020\fH\u0016¢\u0006\u0004\bB\u0010'J0\u0010C\u001a\b\u0012\u0004\u0012\u00020=0<2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r¢\u0006\u0004\bC\u0010?J\u0015\u0010E\u001a\u00020\f2\u0006\u0010D\u001a\u00020\u001f¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\f¢\u0006\u0004\bG\u0010'J,\u0010M\u001a\u00020L2\u001d\u00109\u001a\u0019\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020-0H¢\u0006\u0002\bK¢\u0006\u0004\bM\u0010NJ*\u0010P\u001a\u00020O2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r¢\u0006\u0004\bP\u0010QJ\r\u0010R\u001a\u00020\f¢\u0006\u0004\bR\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR$\u0010[\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR*\u0010\u0005\u001a\u00020\u00042\u0006\u0010\\\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u0016\u0010d\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010cR\u0016\u0010f\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010cR0\u0010k\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110gj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011`h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR4\u0010m\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00020gj\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u0002`h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010jR\u0018\u0010q\u001a\u00060nR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010u\u001a\u00060rR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR4\u0010v\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00020gj\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u0002`h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010jR\u0014\u0010z\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\"\u0010~\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020O0{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u001f\u0010\u0082\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0084\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010cR\u0018\u0010\u0086\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010cR\u0018\u0010\u008a\u0001\u001a\u00030\u0087\u00018\u0002X\u0082D¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001¨\u0006\u008c\u0001"}, d2 = {"Landroidx/compose/ui/layout/e0;", "Landroidx/compose/runtime/r;", "Landroidx/compose/ui/node/h0;", "root", "Landroidx/compose/ui/layout/t1;", "slotReusePolicy", "<init>", "(Landroidx/compose/ui/node/h0;Landroidx/compose/ui/layout/t1;)V", "node", "", "slotId", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "content", "Q", "(Landroidx/compose/ui/node/h0;Ljava/lang/Object;Lld/p;)V", "Landroidx/compose/ui/layout/e0$a;", "nodeState", "P", "(Landroidx/compose/ui/node/h0;Landroidx/compose/ui/layout/e0$a;)V", "Landroidx/compose/runtime/r3;", "existing", "container", "", "reuseContent", "Landroidx/compose/runtime/z;", "parent", "composable", "R", "(Landroidx/compose/runtime/r3;Landroidx/compose/ui/node/h0;ZLandroidx/compose/runtime/z;Lld/p;)Landroidx/compose/runtime/r3;", "", "index", "C", "(I)Ljava/lang/Object;", "deactivate", "G", "(Z)V", "x", "()V", "L", "(Landroidx/compose/ui/node/h0;)V", "S", "(Ljava/lang/Object;)Landroidx/compose/ui/node/h0;", "z", "Landroidx/compose/ui/layout/n0;", "result", "placeChildrenBlock", "v", "(Landroidx/compose/ui/layout/n0;Lld/a;)Landroidx/compose/ui/layout/n0;", "w", "(I)Landroidx/compose/ui/node/h0;", "from", "to", "count", "H", "(III)V", "block", "E", "(Lld/a;)V", "", "Landroidx/compose/ui/layout/l0;", "J", "(Ljava/lang/Object;Lld/p;)Ljava/util/List;", "r", "k", "e", "O", "startIndex", "y", "(I)V", "F", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/s1;", "Landroidx/compose/ui/unit/b;", "Lkotlin/u;", "Landroidx/compose/ui/layout/m0;", "u", "(Lld/p;)Landroidx/compose/ui/layout/m0;", "Landroidx/compose/ui/layout/r1$a;", "K", "(Ljava/lang/Object;Lld/p;)Landroidx/compose/ui/layout/r1$a;", "A", "b", "Landroidx/compose/ui/node/h0;", "c", "Landroidx/compose/runtime/z;", "B", "()Landroidx/compose/runtime/z;", "M", "(Landroidx/compose/runtime/z;)V", "compositionContext", "value", "d", "Landroidx/compose/ui/layout/t1;", "D", "()Landroidx/compose/ui/layout/t1;", "N", "(Landroidx/compose/ui/layout/t1;)V", "I", "currentIndex", "f", "currentPostLookaheadIndex", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "g", "Ljava/util/HashMap;", "nodeToNodeState", "h", "slotIdToNode", "Landroidx/compose/ui/layout/e0$c;", "i", "Landroidx/compose/ui/layout/e0$c;", "scope", "Landroidx/compose/ui/layout/e0$b;", "j", "Landroidx/compose/ui/layout/e0$b;", "postLookaheadMeasureScope", "precomposeMap", "Landroidx/compose/ui/layout/t1$a;", "l", "Landroidx/compose/ui/layout/t1$a;", "reusableSlotIdsSet", "", "m", "Ljava/util/Map;", "postLookaheadPrecomposeSlotHandleMap", "Landroidx/compose/runtime/collection/g;", "n", "Landroidx/compose/runtime/collection/g;", "postLookaheadComposedSlotIds", "o", "reusableCount", "p", "precomposedCount", "", "q", "Ljava/lang/String;", "NoIntrinsicsMessage", "a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 6 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 9 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,987:1\n847#1:1012\n847#1:1026\n847#1:1058\n847#1:1063\n1208#2:988\n1187#2,2:989\n361#3,7:991\n361#3,7:998\n361#3,7:1049\n495#4,4:1005\n500#4:1018\n495#4,4:1019\n500#4:1032\n495#4,4:1033\n500#4:1042\n129#5,3:1009\n133#5:1017\n129#5,3:1023\n133#5:1031\n129#5,5:1037\n1072#6,4:1013\n1072#6,4:1027\n1072#6,2:1043\n1074#6,2:1047\n1072#6,4:1059\n1072#6,4:1064\n1072#6,4:1068\n1855#7,2:1045\n215#8,2:1056\n33#9,6:1072\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState\n*L\n470#1:1012\n540#1:1026\n835#1:1058\n841#1:1063\n384#1:988\n384#1:989,2\n421#1:991,7\n457#1:998,7\n763#1:1049,7\n469#1:1005,4\n469#1:1018\n527#1:1019,4\n527#1:1032\n567#1:1033,4\n567#1:1042\n469#1:1009,3\n469#1:1017\n527#1:1023,3\n527#1:1031\n567#1:1037,5\n470#1:1013,4\n540#1:1027,4\n591#1:1043,2\n591#1:1047,2\n835#1:1059,4\n841#1:1064,4\n847#1:1068,4\n592#1:1045,2\n824#1:1056,2\n947#1:1072,6\n*E\n"})
/* loaded from: classes.dex */
public final class e0 implements androidx.compose.runtime.r {

    /* renamed from: r, reason: collision with root package name */
    public static final int f18938r = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.node.h0 root;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.runtime.z compositionContext;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private t1 slotReusePolicy;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int currentIndex;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int currentPostLookaheadIndex;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int reusableCount;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int precomposedCount;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final HashMap<androidx.compose.ui.node.h0, a> nodeToNodeState = new HashMap<>();

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final HashMap<Object, androidx.compose.ui.node.h0> slotIdToNode = new HashMap<>();

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c scope = new c();

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b postLookaheadMeasureScope = new b();

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final HashMap<Object, androidx.compose.ui.node.h0> precomposeMap = new HashMap<>();

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final t1.a reusableSlotIdsSet = new t1.a(null, 1, null);

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<Object, r1.a> postLookaheadPrecomposeSlotHandleMap = new LinkedHashMap();

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.collection.g<Object> postLookaheadComposedSlotIds = new androidx.compose.runtime.collection.g<>(new Object[16], 0);

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String NoIntrinsicsMessage = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004JO\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u0005*\u00020\u0013H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u0005*\u00020\u0016H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u0013*\u00020\u0016H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u0013*\u00020\u001bH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\u0013*\u00020\u0005H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!*\u00020 H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u001b*\u00020\u0013H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010\u001dJ\u0017\u0010%\u001a\u00020\u001b*\u00020\u0016H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010\u001aJ\u0014\u0010(\u001a\u00020'*\u00020&H\u0097\u0001¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020 *\u00020!H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010#J\u0017\u0010+\u001a\u00020\u0016*\u00020\u0013H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001a\u0010-\u001a\u00020\u0016*\u00020\u001bH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010,J\u001a\u0010.\u001a\u00020\u0016*\u00020\u0005H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b.\u0010/J2\u00107\u001a\b\u0012\u0004\u0012\u000206052\b\u00101\u001a\u0004\u0018\u0001002\u0011\u00104\u001a\r\u0012\u0004\u0012\u00020\r02¢\u0006\u0002\b3H\u0016¢\u0006\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u001b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020\u001b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b<\u0010:R\u0014\u0010A\u001a\u00020>8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bC\u0010D\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006F"}, d2 = {"Landroidx/compose/ui/layout/e0$b;", "Landroidx/compose/ui/layout/s1;", "Landroidx/compose/ui/layout/o0;", "<init>", "(Landroidx/compose/ui/layout/e0;)V", "", "width", "height", "", "Landroidx/compose/ui/layout/a;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "Lkotlin/u;", "placementBlock", "Landroidx/compose/ui/layout/n0;", "U3", "(IILjava/util/Map;Lld/l;)Landroidx/compose/ui/layout/n0;", "Landroidx/compose/ui/unit/h;", "q2", "(F)I", "Landroidx/compose/ui/unit/z;", "J5", "(J)I", "i", "(J)F", "", "S", "(F)F", "R", "(I)F", "Li0/n;", "Landroidx/compose/ui/unit/l;", "n", "(J)J", "v5", "J2", "Landroidx/compose/ui/unit/k;", "Li0/i;", "c5", "(Landroidx/compose/ui/unit/k;)Li0/i;", "d0", "h", "(F)J", "w", "u", "(I)J", "", "slotId", "Lkotlin/Function0;", "Landroidx/compose/runtime/i;", "content", "", "Landroidx/compose/ui/layout/l0;", "E2", "(Ljava/lang/Object;Lld/p;)Ljava/util/List;", "b", "()F", "density", "U", "fontScale", "", "E1", "()Z", "isLookingAhead", "Landroidx/compose/ui/unit/w;", "getLayoutDirection", "()Landroidx/compose/ui/unit/w;", "layoutDirection", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class b implements s1, o0 {

        /* renamed from: b, reason: collision with root package name */
        private final /* synthetic */ c f18961b;

        public b() {
            this.f18961b = e0.this.scope;
        }

        @Override // androidx.compose.ui.layout.q
        public boolean E1() {
            return this.f18961b.E1();
        }

        @Override // androidx.compose.ui.layout.s1
        @fg.l
        public List<l0> E2(@fg.m Object slotId, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> content) {
            androidx.compose.ui.node.h0 h0Var = (androidx.compose.ui.node.h0) e0.this.slotIdToNode.get(slotId);
            List<l0> X = h0Var != null ? h0Var.X() : null;
            return X != null ? X : e0.this.J(slotId, content);
        }

        @Override // androidx.compose.ui.unit.d
        @x4
        public float J2(long j4) {
            return this.f18961b.J2(j4);
        }

        @Override // androidx.compose.ui.unit.d
        @x4
        public int J5(long j4) {
            return this.f18961b.J5(j4);
        }

        @Override // androidx.compose.ui.unit.d
        @x4
        public float R(int i4) {
            return this.f18961b.R(i4);
        }

        @Override // androidx.compose.ui.unit.d
        @x4
        public float S(float f4) {
            return this.f18961b.S(f4);
        }

        @Override // androidx.compose.ui.unit.n
        /* renamed from: U */
        public float getFontScale() {
            return this.f18961b.getFontScale();
        }

        @Override // androidx.compose.ui.layout.o0
        @fg.l
        public n0 U3(int width, int height, @fg.l Map<androidx.compose.ui.layout.a, Integer> alignmentLines, @fg.l ld.l<? super i1.a, k2> placementBlock) {
            return this.f18961b.U3(width, height, alignmentLines, placementBlock);
        }

        @Override // androidx.compose.ui.unit.d
        /* renamed from: b */
        public float getDensity() {
            return this.f18961b.getDensity();
        }

        @Override // androidx.compose.ui.unit.d
        @x4
        @fg.l
        public i0.i c5(@fg.l androidx.compose.ui.unit.k kVar) {
            return this.f18961b.c5(kVar);
        }

        @Override // androidx.compose.ui.unit.d
        @x4
        public long d0(long j4) {
            return this.f18961b.d0(j4);
        }

        @Override // androidx.compose.ui.layout.q
        @fg.l
        public androidx.compose.ui.unit.w getLayoutDirection() {
            return this.f18961b.getLayoutDirection();
        }

        @Override // androidx.compose.ui.unit.n
        @x4
        public long h(float f4) {
            return this.f18961b.h(f4);
        }

        @Override // androidx.compose.ui.unit.n
        @x4
        public float i(long j4) {
            return this.f18961b.i(j4);
        }

        @Override // androidx.compose.ui.unit.d
        @x4
        public long n(long j4) {
            return this.f18961b.n(j4);
        }

        @Override // androidx.compose.ui.unit.d
        @x4
        public int q2(float f4) {
            return this.f18961b.q2(f4);
        }

        @Override // androidx.compose.ui.unit.d
        @x4
        public long u(int i4) {
            return this.f18961b.u(i4);
        }

        @Override // androidx.compose.ui.unit.d
        @x4
        public float v5(float f4) {
            return this.f18961b.getDensity() * f4;
        }

        @Override // androidx.compose.ui.unit.d
        @x4
        public long w(float f4) {
            return this.f18961b.w(f4);
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0016¢\u0006\u0004\b\f\u0010\rJL\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u00112\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0002\b\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010)\u001a\u00020#8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b\u001c\u0010&\"\u0004\b'\u0010(R\"\u0010-\u001a\u00020#8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b*\u0010%\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\u0014\u00101\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Landroidx/compose/ui/layout/e0$c;", "Landroidx/compose/ui/layout/s1;", "<init>", "(Landroidx/compose/ui/layout/e0;)V", "", "slotId", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "content", "", "Landroidx/compose/ui/layout/l0;", "E2", "(Ljava/lang/Object;Lld/p;)Ljava/util/List;", "", "width", "height", "", "Landroidx/compose/ui/layout/a;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/i1$a;", "Lkotlin/u;", "placementBlock", "Landroidx/compose/ui/layout/n0;", "U3", "(IILjava/util/Map;Lld/l;)Landroidx/compose/ui/layout/n0;", "Landroidx/compose/ui/unit/w;", "b", "Landroidx/compose/ui/unit/w;", "getLayoutDirection", "()Landroidx/compose/ui/unit/w;", "l", "(Landroidx/compose/ui/unit/w;)V", "layoutDirection", "", "c", "F", "()F", "a", "(F)V", "density", "d", "U", "f", "fontScale", "", "E1", "()Z", "isLookingAhead", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n*L\n1#1,987:1\n120#2,5:988\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope\n*L\n880#1:988,5\n*E\n"})
    private final class c implements s1 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private androidx.compose.ui.unit.w layoutDirection = androidx.compose.ui.unit.w.Rtl;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private float density;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private float fontScale;

        /* compiled from: SubcomposeLayout.kt */
        @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"androidx/compose/ui/layout/e0$c$a", "Landroidx/compose/ui/layout/n0;", "Lkotlin/k2;", "q", "()V", "", "getWidth", "()I", "width", "getHeight", "height", "", "Landroidx/compose/ui/layout/a;", "p", "()Ljava/util/Map;", "alignmentLines", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements n0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f18967a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f18968b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Map<androidx.compose.ui.layout.a, Integer> f18969c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ c f18970d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ e0 f18971e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ld.l<i1.a, k2> f18972f;

            /* JADX WARN: Multi-variable type inference failed */
            a(int i4, int i5, Map<androidx.compose.ui.layout.a, Integer> map, c cVar, e0 e0Var, ld.l<? super i1.a, k2> lVar) {
                this.f18967a = i4;
                this.f18968b = i5;
                this.f18969c = map;
                this.f18970d = cVar;
                this.f18971e = e0Var;
                this.f18972f = lVar;
            }

            @Override // androidx.compose.ui.layout.n0
            public int getHeight() {
                return this.f18968b;
            }

            @Override // androidx.compose.ui.layout.n0
            public int getWidth() {
                return this.f18967a;
            }

            @Override // androidx.compose.ui.layout.n0
            @fg.l
            public Map<androidx.compose.ui.layout.a, Integer> p() {
                return this.f18969c;
            }

            @Override // androidx.compose.ui.layout.n0
            public void q() {
                androidx.compose.ui.node.r0 lookaheadDelegate;
                if (!this.f18970d.E1() || (lookaheadDelegate = this.f18971e.root.d0().getLookaheadDelegate()) == null) {
                    this.f18972f.invoke(this.f18971e.root.d0().getPlacementScope());
                } else {
                    this.f18972f.invoke(lookaheadDelegate.getPlacementScope());
                }
            }
        }

        public c() {
        }

        @Override // androidx.compose.ui.layout.q
        public boolean E1() {
            return e0.this.root.l0() == h0.e.LookaheadLayingOut || e0.this.root.l0() == h0.e.LookaheadMeasuring;
        }

        @Override // androidx.compose.ui.layout.s1
        @fg.l
        public List<l0> E2(@fg.m Object slotId, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> content) {
            return e0.this.O(slotId, content);
        }

        @Override // androidx.compose.ui.unit.n
        /* renamed from: U, reason: from getter */
        public float getFontScale() {
            return this.fontScale;
        }

        @Override // androidx.compose.ui.layout.o0
        @fg.l
        public n0 U3(int width, int height, @fg.l Map<androidx.compose.ui.layout.a, Integer> alignmentLines, @fg.l ld.l<? super i1.a, k2> placementBlock) {
            if ((width & x1.f27484y) == 0 && ((-16777216) & height) == 0) {
                return new a(width, height, alignmentLines, this, e0.this, placementBlock);
            }
            throw new IllegalStateException(q2.a("Size(", width, " x ", height, ") is out of range. Each dimension must be between 0 and 16777215.").toString());
        }

        public void a(float f4) {
            this.density = f4;
        }

        @Override // androidx.compose.ui.unit.d
        /* renamed from: b, reason: from getter */
        public float getDensity() {
            return this.density;
        }

        public void f(float f4) {
            this.fontScale = f4;
        }

        @Override // androidx.compose.ui.layout.q
        @fg.l
        public androidx.compose.ui.unit.w getLayoutDirection() {
            return this.layoutDirection;
        }

        public void l(@fg.l androidx.compose.ui.unit.w wVar) {
            this.layoutDirection = wVar;
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"androidx/compose/ui/layout/e0$d", "Landroidx/compose/ui/node/h0$f;", "Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$createMeasurePolicy$1\n+ 2 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState\n*L\n1#1,987:1\n737#2,5:988\n737#2,5:993\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$createMeasurePolicy$1\n*L\n701#1:988,5\n711#1:993,5\n*E\n"})
    public static final class d extends h0.f {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<s1, androidx.compose.ui.unit.b, n0> f18974d;

        /* compiled from: SubcomposeLayout.kt */
        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0010¸\u0006\u0000"}, d2 = {"androidx/compose/ui/layout/e0$e", "Landroidx/compose/ui/layout/n0;", "Lkotlin/k2;", "q", "()V", "", "Landroidx/compose/ui/layout/a;", "", "p", "()Ljava/util/Map;", "alignmentLines", "getHeight", "()I", "height", "getWidth", "width", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlin.jvm.internal.r1({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$createMeasureResult$1\n+ 2 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$createMeasurePolicy$1\n*L\n1#1,987:1\n702#2,5:988\n*E\n"})
        public static final class a implements n0 {

            /* renamed from: a, reason: collision with root package name */
            private final /* synthetic */ n0 f18975a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e0 f18976b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f18977c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ n0 f18978d;

            public a(n0 n0Var, e0 e0Var, int i4, n0 n0Var2) {
                this.f18976b = e0Var;
                this.f18977c = i4;
                this.f18978d = n0Var2;
                this.f18975a = n0Var;
            }

            @Override // androidx.compose.ui.layout.n0
            public int getHeight() {
                return this.f18975a.getHeight();
            }

            @Override // androidx.compose.ui.layout.n0
            public int getWidth() {
                return this.f18975a.getWidth();
            }

            @Override // androidx.compose.ui.layout.n0
            @fg.l
            public Map<androidx.compose.ui.layout.a, Integer> p() {
                return this.f18975a.p();
            }

            @Override // androidx.compose.ui.layout.n0
            public void q() {
                this.f18976b.currentPostLookaheadIndex = this.f18977c;
                this.f18978d.q();
                this.f18976b.z();
            }
        }

        /* compiled from: SubcomposeLayout.kt */
        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0010¸\u0006\u0000"}, d2 = {"androidx/compose/ui/layout/e0$e", "Landroidx/compose/ui/layout/n0;", "Lkotlin/k2;", "q", "()V", "", "Landroidx/compose/ui/layout/a;", "", "p", "()Ljava/util/Map;", "alignmentLines", "getHeight", "()I", "height", "getWidth", "width", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlin.jvm.internal.r1({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$createMeasureResult$1\n+ 2 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$createMeasurePolicy$1\n*L\n1#1,987:1\n712#2,4:988\n*E\n"})
        public static final class b implements n0 {

            /* renamed from: a, reason: collision with root package name */
            private final /* synthetic */ n0 f18979a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e0 f18980b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f18981c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ n0 f18982d;

            public b(n0 n0Var, e0 e0Var, int i4, n0 n0Var2) {
                this.f18980b = e0Var;
                this.f18981c = i4;
                this.f18982d = n0Var2;
                this.f18979a = n0Var;
            }

            @Override // androidx.compose.ui.layout.n0
            public int getHeight() {
                return this.f18979a.getHeight();
            }

            @Override // androidx.compose.ui.layout.n0
            public int getWidth() {
                return this.f18979a.getWidth();
            }

            @Override // androidx.compose.ui.layout.n0
            @fg.l
            public Map<androidx.compose.ui.layout.a, Integer> p() {
                return this.f18979a.p();
            }

            @Override // androidx.compose.ui.layout.n0
            public void q() {
                this.f18980b.currentIndex = this.f18981c;
                this.f18982d.q();
                e0 e0Var = this.f18980b;
                e0Var.y(e0Var.currentIndex);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ld.p<? super s1, ? super androidx.compose.ui.unit.b, ? extends n0> pVar, String str) {
            super(str);
            this.f18974d = pVar;
        }

        @Override // androidx.compose.ui.layout.m0
        @fg.l
        public n0 a(@fg.l o0 o0Var, @fg.l List<? extends l0> list, long j4) {
            e0.this.scope.l(o0Var.getLayoutDirection());
            e0.this.scope.a(o0Var.getDensity());
            e0.this.scope.f(o0Var.getFontScale());
            if (o0Var.E1() || e0.this.root.getLookaheadRoot() == null) {
                e0.this.currentIndex = 0;
                n0 invoke = this.f18974d.invoke(e0.this.scope, androidx.compose.ui.unit.b.b(j4));
                return new b(invoke, e0.this, e0.this.currentIndex, invoke);
            }
            e0.this.currentPostLookaheadIndex = 0;
            n0 invoke2 = this.f18974d.invoke(e0.this.postLookaheadMeasureScope, androidx.compose.ui.unit.b.b(j4));
            return new a(invoke2, e0.this, e0.this.currentPostLookaheadIndex, invoke2);
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0010"}, d2 = {"androidx/compose/ui/layout/e0$e", "Landroidx/compose/ui/layout/n0;", "Lkotlin/k2;", "q", "()V", "", "Landroidx/compose/ui/layout/a;", "", "p", "()Ljava/util/Map;", "alignmentLines", "getHeight", "()I", "height", "getWidth", "width", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$createMeasureResult$1\n*L\n1#1,987:1\n*E\n"})
    public static final class e implements n0 {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ n0 f18983a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<k2> f18984b;

        public e(n0 n0Var, ld.a<k2> aVar) {
            this.f18984b = aVar;
            this.f18983a = n0Var;
        }

        @Override // androidx.compose.ui.layout.n0
        public int getHeight() {
            return this.f18983a.getHeight();
        }

        @Override // androidx.compose.ui.layout.n0
        public int getWidth() {
            return this.f18983a.getWidth();
        }

        @Override // androidx.compose.ui.layout.n0
        @fg.l
        public Map<androidx.compose.ui.layout.a, Integer> p() {
            return this.f18983a.p();
        }

        @Override // androidx.compose.ui.layout.n0
        public void q() {
            this.f18984b.invoke();
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010'\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Landroidx/compose/ui/layout/r1$a;", "<name for destructuring parameter 0>", "", "a", "(Ljava/util/Map$Entry;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.l<Map.Entry<Object, r1.a>, Boolean> {
        f() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l Map.Entry<Object, r1.a> entry) {
            boolean z4;
            Object key = entry.getKey();
            r1.a value = entry.getValue();
            int R = e0.this.postLookaheadComposedSlotIds.R(key);
            if (R < 0 || R >= e0.this.currentPostLookaheadIndex) {
                value.dispose();
                z4 = true;
            } else {
                z4 = false;
            }
            return Boolean.valueOf(z4);
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/layout/e0$g", "Landroidx/compose/ui/layout/r1$a;", "Lkotlin/k2;", "dispose", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class g implements r1.a {
        g() {
        }

        @Override // androidx.compose.ui.layout.r1.a
        public void dispose() {
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"androidx/compose/ui/layout/e0$h", "Landroidx/compose/ui/layout/r1$a;", "Lkotlin/k2;", "dispose", "()V", "", "index", "Landroidx/compose/ui/unit/b;", "constraints", "b", "(IJ)V", "a", "()I", "placeablesCount", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$precompose$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n1#1,987:1\n1#2:988\n1072#3,4:989\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$precompose$2\n*L\n811#1:989,4\n*E\n"})
    public static final class h implements r1.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f18987b;

        h(Object obj) {
            this.f18987b = obj;
        }

        @Override // androidx.compose.ui.layout.r1.a
        public int a() {
            List<androidx.compose.ui.node.h0> Y;
            androidx.compose.ui.node.h0 h0Var = (androidx.compose.ui.node.h0) e0.this.precomposeMap.get(this.f18987b);
            if (h0Var == null || (Y = h0Var.Y()) == null) {
                return 0;
            }
            return Y.size();
        }

        @Override // androidx.compose.ui.layout.r1.a
        public void b(int index, long constraints) {
            androidx.compose.ui.node.h0 h0Var = (androidx.compose.ui.node.h0) e0.this.precomposeMap.get(this.f18987b);
            if (h0Var == null || !h0Var.f()) {
                return;
            }
            int size = h0Var.Y().size();
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException(androidx.collection.m1.a("Index (", index, ") is out of bound of [0, ", size, ')'));
            }
            if (h0Var.l()) {
                throw new IllegalArgumentException("Pre-measure called on node that is not placed");
            }
            androidx.compose.ui.node.h0 h0Var2 = e0.this.root;
            h0Var2.ignoreRemeasureRequests = true;
            androidx.compose.ui.node.l0.d(h0Var).V(h0Var.Y().get(index), constraints);
            h0Var2.ignoreRemeasureRequests = false;
        }

        @Override // androidx.compose.ui.layout.r1.a
        public void dispose() {
            e0.this.F();
            androidx.compose.ui.node.h0 h0Var = (androidx.compose.ui.node.h0) e0.this.precomposeMap.remove(this.f18987b);
            if (h0Var != null) {
                if (e0.this.precomposedCount <= 0) {
                    throw new IllegalStateException("No pre-composed items to dispose");
                }
                int indexOf = e0.this.root.b0().indexOf(h0Var);
                if (indexOf < e0.this.root.b0().size() - e0.this.precomposedCount) {
                    throw new IllegalStateException("Item is not in pre-composed item range");
                }
                e0.this.reusableCount++;
                e0 e0Var = e0.this;
                e0Var.precomposedCount--;
                int size = (e0.this.root.b0().size() - e0.this.precomposedCount) - e0.this.reusableCount;
                e0.this.H(indexOf, size, 1);
                e0.this.y(size);
            }
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$subcompose$3$1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,987:1\n169#2,9:988\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$subcompose$3$1$1\n*L\n478#1:988,9\n*E\n"})
    static final class i extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f18988b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, k2> f18989c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(a aVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar) {
            super(2);
            this.f18988b = aVar;
            this.f18989c = pVar;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 11) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1750409193, i4, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:477)");
            }
            boolean a5 = this.f18988b.a();
            ld.p<androidx.compose.runtime.t, Integer, k2> pVar = this.f18989c;
            tVar.Z(207, Boolean.valueOf(a5));
            boolean b5 = tVar.b(a5);
            if (a5) {
                pVar.invoke(tVar, 0);
            } else {
                tVar.m(b5);
            }
            tVar.O();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    public e0(@fg.l androidx.compose.ui.node.h0 h0Var, @fg.l t1 t1Var) {
        this.root = h0Var;
        this.slotReusePolicy = t1Var;
    }

    private final Object C(int index) {
        a aVar = this.nodeToNodeState.get(this.root.b0().get(index));
        kotlin.jvm.internal.l0.m(aVar);
        return aVar.getSlotId();
    }

    private final void E(ld.a<k2> block) {
        androidx.compose.ui.node.h0 h0Var = this.root;
        h0Var.ignoreRemeasureRequests = true;
        block.invoke();
        h0Var.ignoreRemeasureRequests = false;
    }

    private final void G(boolean deactivate) {
        q1.a aVar;
        androidx.compose.runtime.k2<Boolean> g4;
        this.precomposedCount = 0;
        this.precomposeMap.clear();
        int size = this.root.b0().size();
        if (this.reusableCount != size) {
            this.reusableCount = size;
            androidx.compose.runtime.snapshots.m c5 = androidx.compose.runtime.snapshots.m.INSTANCE.c();
            try {
                androidx.compose.runtime.snapshots.m r4 = c5.r();
                for (int i4 = 0; i4 < size; i4++) {
                    try {
                        androidx.compose.ui.node.h0 h0Var = this.root.b0().get(i4);
                        a aVar2 = this.nodeToNodeState.get(h0Var);
                        if (aVar2 != null && aVar2.a()) {
                            L(h0Var);
                            if (deactivate) {
                                r3 composition = aVar2.getComposition();
                                if (composition != null) {
                                    composition.deactivate();
                                }
                                g4 = t4.g(Boolean.FALSE, null, 2, null);
                                aVar2.i(g4);
                            } else {
                                aVar2.h(false);
                            }
                            aVar = q1.f19076a;
                            aVar2.n(aVar);
                        }
                    } catch (Throwable th) {
                        c5.y(r4);
                        throw th;
                    }
                }
                k2 k2Var = k2.f75408a;
                c5.y(r4);
                c5.d();
                this.slotIdToNode.clear();
            } catch (Throwable th2) {
                c5.d();
                throw th2;
            }
        }
        F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(int from, int to, int count) {
        androidx.compose.ui.node.h0 h0Var = this.root;
        h0Var.ignoreRemeasureRequests = true;
        this.root.i1(from, to, count);
        h0Var.ignoreRemeasureRequests = false;
    }

    static /* synthetic */ void I(e0 e0Var, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            i6 = 1;
        }
        e0Var.H(i4, i5, i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<l0> J(Object slotId, ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> content) {
        if (this.postLookaheadComposedSlotIds.getSize() < this.currentPostLookaheadIndex) {
            throw new IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.");
        }
        int size = this.postLookaheadComposedSlotIds.getSize();
        int i4 = this.currentPostLookaheadIndex;
        if (size == i4) {
            this.postLookaheadComposedSlotIds.b(slotId);
        } else {
            this.postLookaheadComposedSlotIds.s0(i4, slotId);
        }
        this.currentPostLookaheadIndex++;
        if (!this.precomposeMap.containsKey(slotId)) {
            this.postLookaheadPrecomposeSlotHandleMap.put(slotId, K(slotId, content));
            if (this.root.l0() == h0.e.LayingOut) {
                this.root.t1(true);
            } else {
                androidx.compose.ui.node.h0.w1(this.root, true, false, 2, null);
            }
        }
        androidx.compose.ui.node.h0 h0Var = this.precomposeMap.get(slotId);
        if (h0Var == null) {
            return kotlin.collections.j0.f74919b;
        }
        List<m0.b> Z0 = h0Var.r0().Z0();
        int size2 = Z0.size();
        for (int i5 = 0; i5 < size2; i5++) {
            Z0.get(i5).A1();
        }
        return Z0;
    }

    private final void L(androidx.compose.ui.node.h0 h0Var) {
        m0.b r02 = h0Var.r0();
        h0.g gVar = h0.g.NotUsed;
        r02.m2(gVar);
        m0.a o02 = h0Var.o0();
        if (o02 != null) {
            o02.Z1(gVar);
        }
    }

    private final void P(androidx.compose.ui.node.h0 node, a nodeState) {
        androidx.compose.runtime.snapshots.m c5 = androidx.compose.runtime.snapshots.m.INSTANCE.c();
        try {
            androidx.compose.runtime.snapshots.m r4 = c5.r();
            try {
                androidx.compose.ui.node.h0 h0Var = this.root;
                h0Var.ignoreRemeasureRequests = true;
                ld.p<androidx.compose.runtime.t, Integer, k2> d5 = nodeState.d();
                r3 composition = nodeState.getComposition();
                androidx.compose.runtime.z zVar = this.compositionContext;
                if (zVar == null) {
                    throw new IllegalStateException("parent composition reference not set");
                }
                nodeState.j(R(composition, node, nodeState.getForceReuse(), zVar, new androidx.compose.runtime.internal.b(-1750409193, true, new i(nodeState, d5))));
                nodeState.m(false);
                h0Var.ignoreRemeasureRequests = false;
                k2 k2Var = k2.f75408a;
            } finally {
                c5.y(r4);
            }
        } finally {
            c5.d();
        }
    }

    private final void Q(androidx.compose.ui.node.h0 node, Object slotId, ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> content) {
        HashMap<androidx.compose.ui.node.h0, a> hashMap = this.nodeToNodeState;
        a aVar = hashMap.get(node);
        if (aVar == null) {
            androidx.compose.ui.layout.e.f18935a.getClass();
            aVar = new a(slotId, androidx.compose.ui.layout.e.f18936b, null, 4, null);
            hashMap.put(node, aVar);
        }
        a aVar2 = aVar;
        r3 composition = aVar2.getComposition();
        boolean i4 = composition != null ? composition.i() : true;
        if (aVar2.d() != content || i4 || aVar2.getForceRecompose()) {
            aVar2.k(content);
            P(node, aVar2);
            aVar2.l(false);
        }
    }

    @androidx.compose.runtime.j(scheme = "[0[0]]")
    private final r3 R(r3 existing, androidx.compose.ui.node.h0 container, boolean reuseContent, androidx.compose.runtime.z parent, ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> composable) {
        if (existing == null || existing.getDisposed()) {
            existing = l6.a(container, parent);
        }
        if (reuseContent) {
            existing.g(composable);
        } else {
            existing.e(composable);
        }
        return existing;
    }

    private final androidx.compose.ui.node.h0 S(Object slotId) {
        int i4;
        androidx.compose.runtime.k2<Boolean> g4;
        q1.a aVar;
        if (this.reusableCount == 0) {
            return null;
        }
        int size = this.root.b0().size() - this.precomposedCount;
        int i5 = size - this.reusableCount;
        int i6 = size - 1;
        int i7 = i6;
        while (true) {
            if (i7 < i5) {
                i4 = -1;
                break;
            }
            if (kotlin.jvm.internal.l0.g(C(i7), slotId)) {
                i4 = i7;
                break;
            }
            i7--;
        }
        if (i4 == -1) {
            while (i6 >= i5) {
                a aVar2 = this.nodeToNodeState.get(this.root.b0().get(i6));
                kotlin.jvm.internal.l0.m(aVar2);
                a aVar3 = aVar2;
                Object slotId2 = aVar3.getSlotId();
                aVar = q1.f19076a;
                if (slotId2 == aVar || this.slotReusePolicy.b(slotId, aVar3.getSlotId())) {
                    aVar3.n(slotId);
                    i7 = i6;
                    i4 = i7;
                    break;
                }
                i6--;
            }
            i7 = i6;
        }
        if (i4 == -1) {
            return null;
        }
        if (i7 != i5) {
            H(i7, i5, 1);
        }
        this.reusableCount--;
        androidx.compose.ui.node.h0 h0Var = this.root.b0().get(i5);
        a aVar4 = this.nodeToNodeState.get(h0Var);
        kotlin.jvm.internal.l0.m(aVar4);
        a aVar5 = aVar4;
        g4 = t4.g(Boolean.TRUE, null, 2, null);
        aVar5.i(g4);
        aVar5.m(true);
        aVar5.l(true);
        return h0Var;
    }

    private final n0 v(n0 result, ld.a<k2> placeChildrenBlock) {
        return new e(result, placeChildrenBlock);
    }

    private final androidx.compose.ui.node.h0 w(int index) {
        androidx.compose.ui.node.h0 h0Var = new androidx.compose.ui.node.h0(true, 0, 2, null);
        androidx.compose.ui.node.h0 h0Var2 = this.root;
        h0Var2.ignoreRemeasureRequests = true;
        this.root.N0(index, h0Var);
        h0Var2.ignoreRemeasureRequests = false;
        return h0Var;
    }

    private final void x() {
        androidx.compose.ui.node.h0 h0Var = this.root;
        h0Var.ignoreRemeasureRequests = true;
        Iterator<T> it = this.nodeToNodeState.values().iterator();
        while (it.hasNext()) {
            r3 composition = ((a) it.next()).getComposition();
            if (composition != null) {
                composition.dispose();
            }
        }
        this.root.q1();
        h0Var.ignoreRemeasureRequests = false;
        this.nodeToNodeState.clear();
        this.slotIdToNode.clear();
        this.precomposedCount = 0;
        this.reusableCount = 0;
        this.precomposeMap.clear();
        F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        kotlin.collections.w.G0(this.postLookaheadPrecomposeSlotHandleMap.entrySet(), new f());
    }

    public final void A() {
        if (this.reusableCount != this.root.b0().size()) {
            Iterator<Map.Entry<androidx.compose.ui.node.h0, a>> it = this.nodeToNodeState.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().l(true);
            }
            if (this.root.s0()) {
                return;
            }
            androidx.compose.ui.node.h0.A1(this.root, false, false, 3, null);
        }
    }

    @fg.m
    /* renamed from: B, reason: from getter */
    public final androidx.compose.runtime.z getCompositionContext() {
        return this.compositionContext;
    }

    @fg.l
    /* renamed from: D, reason: from getter */
    public final t1 getSlotReusePolicy() {
        return this.slotReusePolicy;
    }

    public final void F() {
        int size = this.root.b0().size();
        if (this.nodeToNodeState.size() != size) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + this.nodeToNodeState.size() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if ((size - this.reusableCount) - this.precomposedCount < 0) {
            StringBuilder a5 = androidx.collection.s.a("Incorrect state. Total children ", size, ". Reusable children ");
            a5.append(this.reusableCount);
            a5.append(". Precomposed children ");
            a5.append(this.precomposedCount);
            throw new IllegalArgumentException(a5.toString().toString());
        }
        if (this.precomposeMap.size() == this.precomposedCount) {
            return;
        }
        throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.precomposedCount + ". Map size " + this.precomposeMap.size()).toString());
    }

    @fg.l
    public final r1.a K(@fg.m Object slotId, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> content) {
        if (!this.root.f()) {
            return new g();
        }
        F();
        if (!this.slotIdToNode.containsKey(slotId)) {
            this.postLookaheadPrecomposeSlotHandleMap.remove(slotId);
            HashMap<Object, androidx.compose.ui.node.h0> hashMap = this.precomposeMap;
            androidx.compose.ui.node.h0 h0Var = hashMap.get(slotId);
            if (h0Var == null) {
                h0Var = S(slotId);
                if (h0Var != null) {
                    H(this.root.b0().indexOf(h0Var), this.root.b0().size(), 1);
                    this.precomposedCount++;
                } else {
                    h0Var = w(this.root.b0().size());
                    this.precomposedCount++;
                }
                hashMap.put(slotId, h0Var);
            }
            Q(h0Var, slotId, content);
        }
        return new h(slotId);
    }

    public final void M(@fg.m androidx.compose.runtime.z zVar) {
        this.compositionContext = zVar;
    }

    public final void N(@fg.l t1 t1Var) {
        if (this.slotReusePolicy != t1Var) {
            this.slotReusePolicy = t1Var;
            G(false);
            androidx.compose.ui.node.h0.A1(this.root, false, false, 3, null);
        }
    }

    @fg.l
    public final List<l0> O(@fg.m Object slotId, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> content) {
        F();
        h0.e l02 = this.root.l0();
        h0.e eVar = h0.e.Measuring;
        if (l02 != eVar && l02 != h0.e.LayingOut && l02 != h0.e.LookaheadMeasuring && l02 != h0.e.LookaheadLayingOut) {
            throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks");
        }
        HashMap<Object, androidx.compose.ui.node.h0> hashMap = this.slotIdToNode;
        androidx.compose.ui.node.h0 h0Var = hashMap.get(slotId);
        if (h0Var == null) {
            h0Var = this.precomposeMap.remove(slotId);
            if (h0Var != null) {
                int i4 = this.precomposedCount;
                if (i4 <= 0) {
                    throw new IllegalStateException("Check failed.");
                }
                this.precomposedCount = i4 - 1;
            } else {
                h0Var = S(slotId);
                if (h0Var == null) {
                    h0Var = w(this.currentIndex);
                }
            }
            hashMap.put(slotId, h0Var);
        }
        androidx.compose.ui.node.h0 h0Var2 = h0Var;
        if (kotlin.collections.w.W2(this.root.b0(), this.currentIndex) != h0Var2) {
            int indexOf = this.root.b0().indexOf(h0Var2);
            int i5 = this.currentIndex;
            if (indexOf < i5) {
                throw new IllegalArgumentException(("Key \"" + slotId + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
            }
            if (i5 != indexOf) {
                I(this, indexOf, i5, 0, 4, null);
            }
        }
        this.currentIndex++;
        Q(h0Var2, slotId, content);
        return (l02 == eVar || l02 == h0.e.LayingOut) ? h0Var2.X() : h0Var2.W();
    }

    @Override // androidx.compose.runtime.r
    public void e() {
        x();
    }

    @Override // androidx.compose.runtime.r
    public void k() {
        G(true);
    }

    @Override // androidx.compose.runtime.r
    public void r() {
        G(false);
    }

    @fg.l
    public final m0 u(@fg.l ld.p<? super s1, ? super androidx.compose.ui.unit.b, ? extends n0> block) {
        return new d(block, this.NoIntrinsicsMessage);
    }

    public final void y(int startIndex) {
        boolean z4 = false;
        this.reusableCount = 0;
        int size = (this.root.b0().size() - this.precomposedCount) - 1;
        if (startIndex <= size) {
            this.reusableSlotIdsSet.clear();
            if (startIndex <= size) {
                int i4 = startIndex;
                while (true) {
                    this.reusableSlotIdsSet.b(C(i4));
                    if (i4 == size) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            this.slotReusePolicy.a(this.reusableSlotIdsSet);
            androidx.compose.runtime.snapshots.m c5 = androidx.compose.runtime.snapshots.m.INSTANCE.c();
            try {
                androidx.compose.runtime.snapshots.m r4 = c5.r();
                boolean z5 = false;
                while (size >= startIndex) {
                    try {
                        androidx.compose.ui.node.h0 h0Var = this.root.b0().get(size);
                        a aVar = this.nodeToNodeState.get(h0Var);
                        kotlin.jvm.internal.l0.m(aVar);
                        a aVar2 = aVar;
                        Object slotId = aVar2.getSlotId();
                        if (this.reusableSlotIdsSet.contains(slotId)) {
                            this.reusableCount++;
                            if (aVar2.a()) {
                                L(h0Var);
                                aVar2.h(false);
                                z5 = true;
                            }
                        } else {
                            androidx.compose.ui.node.h0 h0Var2 = this.root;
                            h0Var2.ignoreRemeasureRequests = true;
                            this.nodeToNodeState.remove(h0Var);
                            r3 composition = aVar2.getComposition();
                            if (composition != null) {
                                composition.dispose();
                            }
                            this.root.r1(size, 1);
                            h0Var2.ignoreRemeasureRequests = false;
                        }
                        this.slotIdToNode.remove(slotId);
                        size--;
                    } catch (Throwable th) {
                        c5.y(r4);
                        throw th;
                    }
                }
                k2 k2Var = k2.f75408a;
                c5.y(r4);
                c5.d();
                z4 = z5;
            } catch (Throwable th2) {
                c5.d();
                throw th2;
            }
        }
        if (z4) {
            androidx.compose.runtime.snapshots.m.INSTANCE.q();
        }
        F();
    }

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B0\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R-\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\"\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010%\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R(\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001c0&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010'\u001a\u0004\b\u0011\u0010(\"\u0004\b)\u0010*R$\u0010.\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u001c8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u001f\"\u0004\b-\u0010!¨\u0006/"}, d2 = {"Landroidx/compose/ui/layout/e0$a;", "", "slotId", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "content", "Landroidx/compose/runtime/r3;", "composition", "<init>", "(Ljava/lang/Object;Lld/p;Landroidx/compose/runtime/r3;)V", "a", "Ljava/lang/Object;", "g", "()Ljava/lang/Object;", "n", "(Ljava/lang/Object;)V", "b", "Lld/p;", "d", "()Lld/p;", "k", "(Lld/p;)V", "c", "Landroidx/compose/runtime/r3;", "()Landroidx/compose/runtime/r3;", "j", "(Landroidx/compose/runtime/r3;)V", "", "Z", "e", "()Z", "l", "(Z)V", "forceRecompose", "f", "m", "forceReuse", "Landroidx/compose/runtime/k2;", "Landroidx/compose/runtime/k2;", "()Landroidx/compose/runtime/k2;", "i", "(Landroidx/compose/runtime/k2;)V", "activeState", "value", "h", "active", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private Object slotId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> content;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private r3 composition;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean forceRecompose;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean forceReuse;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private androidx.compose.runtime.k2<Boolean> activeState;

        public a(@fg.m Object obj, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, @fg.m r3 r3Var) {
            androidx.compose.runtime.k2<Boolean> g4;
            this.slotId = obj;
            this.content = pVar;
            this.composition = r3Var;
            g4 = t4.g(Boolean.TRUE, null, 2, null);
            this.activeState = g4;
        }

        public final boolean a() {
            return this.activeState.getValue().booleanValue();
        }

        @fg.l
        public final androidx.compose.runtime.k2<Boolean> b() {
            return this.activeState;
        }

        @fg.m
        /* renamed from: c, reason: from getter */
        public final r3 getComposition() {
            return this.composition;
        }

        @fg.l
        public final ld.p<androidx.compose.runtime.t, Integer, k2> d() {
            return this.content;
        }

        /* renamed from: e, reason: from getter */
        public final boolean getForceRecompose() {
            return this.forceRecompose;
        }

        /* renamed from: f, reason: from getter */
        public final boolean getForceReuse() {
            return this.forceReuse;
        }

        @fg.m
        /* renamed from: g, reason: from getter */
        public final Object getSlotId() {
            return this.slotId;
        }

        public final void h(boolean z4) {
            this.activeState.setValue(Boolean.valueOf(z4));
        }

        public final void i(@fg.l androidx.compose.runtime.k2<Boolean> k2Var) {
            this.activeState = k2Var;
        }

        public final void j(@fg.m r3 r3Var) {
            this.composition = r3Var;
        }

        public final void k(@fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar) {
            this.content = pVar;
        }

        public final void l(boolean z4) {
            this.forceRecompose = z4;
        }

        public final void m(boolean z4) {
            this.forceReuse = z4;
        }

        public final void n(@fg.m Object obj) {
            this.slotId = obj;
        }

        public /* synthetic */ a(Object obj, ld.p pVar, r3 r3Var, int i4, kotlin.jvm.internal.w wVar) {
            this(obj, pVar, (i4 & 4) != 0 ? null : r3Var);
        }
    }
}
