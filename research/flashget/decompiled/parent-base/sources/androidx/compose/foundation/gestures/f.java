package androidx.compose.foundation.gestures;

import androidx.compose.foundation.a2;
import androidx.compose.foundation.c2;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.o4;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: AnchoredDraggable.kt */
@androidx.compose.foundation.z0
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b(\b\u0007\u0018\u0000 C*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001ABs\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u0012#\b\u0002\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0011\u0010\u0012B\u0083\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u0012#\b\u0002\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0011\u0010\u0015J'\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0005¢\u0006\u0004\b \u0010!J%\u0010%\u001a\u00020$2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\b\b\u0002\u0010#\u001a\u00028\u0000¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00020$2\u0006\u0010\u0018\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b'\u0010(J^\u00100\u001a\u00020$2\b\b\u0002\u0010*\u001a\u00020)2B\u0010/\u001a>\b\u0001\u0012\u0004\u0012\u00020,\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0-\u0012\u0006\u0012\u0004\u0018\u00010\u00020+¢\u0006\u0002\b.H\u0086@¢\u0006\u0004\b0\u00101J{\u00103\u001a\u00020$2\u0006\u0010\u001d\u001a\u00028\u00002\b\b\u0002\u0010*\u001a\u00020)2W\u0010/\u001aS\b\u0001\u0012\u0004\u0012\u00020,\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0-\u0012\u0006\u0012\u0004\u0018\u00010\u000202¢\u0006\u0002\b.H\u0086@¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0005H\u0000¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0005¢\u0006\u0004\b8\u00107R5\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR5\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010:\u001a\u0004\bF\u0010<R\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010P\u001a\u00020K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR+\u0010\u0017\u001a\u00028\u00002\u0006\u0010Q\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001b\u0010\u001d\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b0\u0010X\u001a\u0004\bY\u0010UR\u001b\u0010[\u001a\u00028\u00008@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b3\u0010X\u001a\u0004\bZ\u0010UR+\u0010\u0016\u001a\u00020\u00052\u0006\u0010Q\u001a\u00020\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010!\"\u0004\b_\u0010`R\u001b\u0010c\u001a\u00020\u00058GX\u0086\u0084\u0002¢\u0006\f\n\u0004\ba\u0010X\u001a\u0004\bb\u0010!R+\u0010f\u001a\u00020\u00052\u0006\u0010Q\u001a\u00020\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010]\u001a\u0004\bd\u0010!\"\u0004\be\u0010`R/\u0010i\u001a\u0004\u0018\u00018\u00002\b\u0010Q\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010S\u001a\u0004\bg\u0010U\"\u0004\bh\u0010WR7\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010S\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010nR\u0011\u0010r\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bp\u0010q¨\u0006s"}, d2 = {"Landroidx/compose/foundation/gestures/f;", "T", "", "initialValue", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "totalDistance", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "Landroidx/compose/animation/core/k;", "animationSpec", "newValue", "", "confirmValueChange", "<init>", "(Ljava/lang/Object;Lld/l;Lld/a;Landroidx/compose/animation/core/k;Lld/l;)V", "Landroidx/compose/foundation/gestures/z;", "anchors", "(Ljava/lang/Object;Landroidx/compose/foundation/gestures/z;Lld/l;Lld/a;Landroidx/compose/animation/core/k;Lld/l;)V", "offset", "currentValue", "velocity", "l", "(FLjava/lang/Object;F)Ljava/lang/Object;", "m", "(FLjava/lang/Object;)Ljava/lang/Object;", "targetValue", "K", "(Ljava/lang/Object;)Z", "D", "()F", "newAnchors", "newTarget", "Lkotlin/k2;", "L", "(Landroidx/compose/foundation/gestures/z;Ljava/lang/Object;)V", "J", "(FLkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/a2;", "dragPriority", "Lkotlin/Function3;", "Landroidx/compose/foundation/gestures/d;", "Lkotlin/coroutines/d;", "Lkotlin/u;", "block", "h", "(Landroidx/compose/foundation/a2;Lld/q;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function4;", "i", "(Ljava/lang/Object;Landroidx/compose/foundation/a2;Lld/r;Lkotlin/coroutines/d;)Ljava/lang/Object;", "delta", "C", "(F)F", "n", "a", "Lld/l;", "x", "()Lld/l;", "b", "Lld/a;", "A", "()Lld/a;", "c", "Landroidx/compose/animation/core/k;", "p", "()Landroidx/compose/animation/core/k;", "d", "r", "Landroidx/compose/foundation/c2;", "e", "Landroidx/compose/foundation/c2;", "dragMutex", "Landroidx/compose/foundation/gestures/d0;", "f", "Landroidx/compose/foundation/gestures/d0;", "u", "()Landroidx/compose/foundation/gestures/d0;", "draggableState", "<set-?>", "g", "Landroidx/compose/runtime/k2;", "s", "()Ljava/lang/Object;", "F", "(Ljava/lang/Object;)V", "Landroidx/compose/runtime/b5;", "z", "q", "closestValue", "j", "Landroidx/compose/runtime/h2;", "w", "I", "(F)V", "k", "y", "progress", "v", "H", "lastVelocity", "t", "G", "dragTarget", "o", "()Landroidx/compose/foundation/gestures/z;", "E", "(Landroidx/compose/foundation/gestures/z;)V", "Landroidx/compose/foundation/gestures/d;", "anchoredDragScope", "B", "()Z", "isAnimationRunning", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x4
@r1({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex\n*L\n1#1,767:1\n81#2:768\n107#2,2:769\n81#2:771\n81#2:772\n81#2:776\n81#2:780\n107#2,2:781\n81#2:783\n107#2,2:784\n76#3:773\n109#3,2:774\n76#3:777\n109#3,2:778\n195#4,9:786\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableState\n*L\n294#1:768\n294#1:769,2\n302#1:771\n316#1:772\n361#1:776\n381#1:780\n381#1:781,2\n383#1:783\n383#1:784,2\n333#1:773\n333#1:774,2\n378#1:777\n378#1:778,2\n613#1:786,9\n*E\n"})
/* loaded from: classes.dex */
public final class f<T> {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: q, reason: collision with root package name */
    public static final int f3954q = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<Float, Float> positionalThreshold;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<Float> velocityThreshold;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.animation.core.k<Float> animationSpec;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<T, Boolean> confirmValueChange;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c2 dragMutex;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d0 draggableState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 currentValue;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b5 targetValue;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b5 closestValue;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h2 offset;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b5 progress;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h2 lastVelocity;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 dragTarget;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 anchors;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.gestures.d anchoredDragScope;

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<T, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f3970b = new a(1);

        a() {
            super(1);
        }

        @fg.l
        public final Boolean a(T t4) {
            return Boolean.TRUE;
        }

        @Override // ld.l
        public Boolean invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<T, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f3971b = new b(1);

        b() {
            super(1);
        }

        @fg.l
        public final Boolean a(T t4) {
            return Boolean.TRUE;
        }

        @Override // ld.l
        public Boolean invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0080\u0001\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\u0004\u0012\u00028\u00010\u0011\"\b\b\u0001\u0010\u0004*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000f0\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/gestures/f$c;", "", "<init>", "()V", "T", "Landroidx/compose/animation/core/k;", "", "animationSpec", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "distance", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "", "confirmValueChange", "Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/foundation/gestures/f;", "a", "(Landroidx/compose/animation/core/k;Lld/l;Lld/a;Lld/l;)Landroidx/compose/runtime/saveable/l;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.f$c, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.gestures.f$c$a */
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<T, Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f3972b = new a(1);

            a() {
                super(1);
            }

            @fg.l
            public final Boolean a(@fg.l T t4) {
                return Boolean.TRUE;
            }

            @Override // ld.l
            public Boolean invoke(Object obj) {
                return Boolean.TRUE;
            }
        }

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00018\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/foundation/gestures/f;", "it", "a", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/foundation/gestures/f;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.gestures.f$c$b */
        static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, f<T>, T> {

            /* renamed from: b, reason: collision with root package name */
            public static final b f3973b = new b(2);

            b() {
                super(2);
            }

            @fg.m
            public final T a(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l f<T> fVar) {
                return fVar.s();
            }

            @Override // ld.p
            public Object invoke(androidx.compose.runtime.saveable.n nVar, Object obj) {
                return ((f) obj).s();
            }
        }

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "it", "Landroidx/compose/foundation/gestures/f;", "a", "(Ljava/lang/Object;)Landroidx/compose/foundation/gestures/f;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.gestures.f$c$c, reason: collision with other inner class name */
        static final class C0064c extends kotlin.jvm.internal.n0 implements ld.l<T, f<T>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.l<Float, Float> f3974b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.a<Float> f3975c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.animation.core.k<Float> f3976d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ld.l<T, Boolean> f3977e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0064c(ld.l<? super Float, Float> lVar, ld.a<Float> aVar, androidx.compose.animation.core.k<Float> kVar, ld.l<? super T, Boolean> lVar2) {
                super(1);
                this.f3974b = lVar;
                this.f3975c = aVar;
                this.f3976d = kVar;
                this.f3977e = lVar2;
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f<T> invoke(@fg.l T t4) {
                return new f<>(t4, this.f3974b, this.f3975c, this.f3976d, this.f3977e);
            }
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ androidx.compose.runtime.saveable.l b(Companion companion, androidx.compose.animation.core.k kVar, ld.l lVar, ld.a aVar, ld.l lVar2, int i4, Object obj) {
            if ((i4 & 8) != 0) {
                lVar2 = a.f3972b;
            }
            return companion.a(kVar, lVar, aVar, lVar2);
        }

        @fg.l
        @androidx.compose.foundation.z0
        public final <T> androidx.compose.runtime.saveable.l<f<T>, T> a(@fg.l androidx.compose.animation.core.k<Float> animationSpec, @fg.l ld.l<? super Float, Float> positionalThreshold, @fg.l ld.a<Float> velocityThreshold, @fg.l ld.l<? super T, Boolean> confirmValueChange) {
            return androidx.compose.runtime.saveable.m.a(b.f3973b, new C0064c(positionalThreshold, velocityThreshold, animationSpec, confirmValueChange));
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableState", f = "AnchoredDraggable.kt", i = {0}, l = {520}, m = "anchoredDrag", n = {"this"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f3978b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f3979c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f<T> f3980d;

        /* renamed from: e, reason: collision with root package name */
        int f3981e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(f<T> fVar, kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
            this.f3980d = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f3979c = obj;
            this.f3981e |= Integer.MIN_VALUE;
            return this.f3980d.h(null, null, this);
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", i = {}, l = {521}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/k2;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.coroutines.jvm.internal.o implements ld.l<kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f3982b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f<T> f3983c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.gestures.d, z<T>, kotlin.coroutines.d<? super kotlin.k2>, Object> f3984d;

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Landroidx/compose/foundation/gestures/z;", "a", "()Landroidx/compose/foundation/gestures/z;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<z<T>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ f<T> f3985b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f<T> fVar) {
                super(0);
                this.f3985b = fVar;
            }

            @fg.l
            public final z<T> a() {
                return this.f3985b.o();
            }

            @Override // ld.a
            public Object invoke() {
                return this.f3985b.o();
            }
        }

        /* compiled from: AnchoredDraggable.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", i = {}, l = {522}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/compose/foundation/gestures/z;", "latestAnchors", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/z;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<z<T>, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f3986b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f3987c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.q<androidx.compose.foundation.gestures.d, z<T>, kotlin.coroutines.d<? super kotlin.k2>, Object> f3988d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ f<T> f3989e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(ld.q<? super androidx.compose.foundation.gestures.d, ? super z<T>, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> qVar, f<T> fVar, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f3988d = qVar;
                this.f3989e = fVar;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l z<T> zVar, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((b) create(zVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                b bVar = new b(this.f3988d, this.f3989e, dVar);
                bVar.f3987c = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f3986b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    z<T> zVar = (z) this.f3987c;
                    ld.q<androidx.compose.foundation.gestures.d, z<T>, kotlin.coroutines.d<? super kotlin.k2>, Object> qVar = this.f3988d;
                    androidx.compose.foundation.gestures.d dVar = ((f) this.f3989e).anchoredDragScope;
                    this.f3986b = 1;
                    if (qVar.R(dVar, zVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                }
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(f<T> fVar, ld.q<? super androidx.compose.foundation.gestures.d, ? super z<T>, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> qVar, kotlin.coroutines.d<? super e> dVar) {
            super(1, dVar);
            this.f3983c = fVar;
            this.f3984d = qVar;
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((e) create(dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.l kotlin.coroutines.d<?> dVar) {
            return new e(this.f3983c, this.f3984d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f3982b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                a aVar2 = new a(this.f3983c);
                b bVar = new b(this.f3984d, this.f3983c, null);
                this.f3982b = 1;
                if (androidx.compose.foundation.gestures.e.i(aVar2, bVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableState", f = "AnchoredDraggable.kt", i = {0}, l = {566}, m = "anchoredDrag", n = {"this"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.f$f, reason: collision with other inner class name */
    static final class C0065f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f3990b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f3991c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f<T> f3992d;

        /* renamed from: e, reason: collision with root package name */
        int f3993e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0065f(f<T> fVar, kotlin.coroutines.d<? super C0065f> dVar) {
            super(dVar);
            this.f3992d = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f3991c = obj;
            this.f3993e |= Integer.MIN_VALUE;
            return this.f3992d.i(null, null, null, this);
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", i = {}, l = {568}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/k2;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.coroutines.jvm.internal.o implements ld.l<kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f3994b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f<T> f3995c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f3996d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.r<androidx.compose.foundation.gestures.d, z<T>, T, kotlin.coroutines.d<? super kotlin.k2>, Object> f3997e;

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlin/q0;", "Landroidx/compose/foundation/gestures/z;", "a", "()Lkotlin/q0;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<kotlin.q0<? extends z<T>, ? extends T>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ f<T> f3998b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f<T> fVar) {
                super(0);
                this.f3998b = fVar;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.q0<z<T>, T> invoke() {
                return new kotlin.q0<>(this.f3998b.o(), this.f3998b.z());
            }
        }

        /* compiled from: AnchoredDraggable.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", i = {}, l = {571}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlin/q0;", "Landroidx/compose/foundation/gestures/z;", "<name for destructuring parameter 0>", "Lkotlin/k2;", "<anonymous>", "(Lkotlin/q0;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlin.q0<? extends z<T>, ? extends T>, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f3999b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f4000c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.r<androidx.compose.foundation.gestures.d, z<T>, T, kotlin.coroutines.d<? super kotlin.k2>, Object> f4001d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ f<T> f4002e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(ld.r<? super androidx.compose.foundation.gestures.d, ? super z<T>, ? super T, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> rVar, f<T> fVar, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f4001d = rVar;
                this.f4002e = fVar;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l kotlin.q0<? extends z<T>, ? extends T> q0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                b bVar = new b(this.f4001d, this.f4002e, dVar);
                bVar.f4000c = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f3999b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    kotlin.q0 q0Var = (kotlin.q0) this.f4000c;
                    z zVar = (z) q0Var.a();
                    Object b5 = q0Var.b();
                    ld.r<androidx.compose.foundation.gestures.d, z<T>, T, kotlin.coroutines.d<? super kotlin.k2>, Object> rVar = this.f4001d;
                    androidx.compose.foundation.gestures.d dVar = ((f) this.f4002e).anchoredDragScope;
                    this.f3999b = 1;
                    if (rVar.i(dVar, zVar, b5, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                }
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(f<T> fVar, T t4, ld.r<? super androidx.compose.foundation.gestures.d, ? super z<T>, ? super T, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> rVar, kotlin.coroutines.d<? super g> dVar) {
            super(1, dVar);
            this.f3995c = fVar;
            this.f3996d = t4;
            this.f3997e = rVar;
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((g) create(dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.l kotlin.coroutines.d<?> dVar) {
            return new g(this.f3995c, this.f3996d, this.f3997e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f3994b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                this.f3995c.G(this.f3996d);
                a aVar2 = new a(this.f3995c);
                b bVar = new b(this.f3997e, this.f3995c, null);
                this.f3994b = 1;
                if (androidx.compose.foundation.gestures.e.i(aVar2, bVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/compose/foundation/gestures/f$h", "Landroidx/compose/foundation/gestures/d;", "", "newOffset", "lastKnownVelocity", "Lkotlin/k2;", "a", "(FF)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class h implements androidx.compose.foundation.gestures.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f<T> f4003a;

        h(f<T> fVar) {
            this.f4003a = fVar;
        }

        @Override // androidx.compose.foundation.gestures.d
        public void a(float newOffset, float lastKnownVelocity) {
            this.f4003a.I(newOffset);
            this.f4003a.H(lastKnownVelocity);
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class i extends kotlin.jvm.internal.n0 implements ld.a<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f<T> f4004b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(f<T> fVar) {
            super(0);
            this.f4004b = fVar;
        }

        @Override // ld.a
        public final T invoke() {
            T t4 = (T) f.d(this.f4004b);
            if (t4 != null) {
                return t4;
            }
            f<T> fVar = this.f4004b;
            float w4 = fVar.w();
            return !Float.isNaN(w4) ? (T) fVar.m(w4, fVar.s()) : fVar.s();
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\b\u0004*\u0002\u0000\u0011\b\n\u0018\u00002\u00020\u0001JA\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012¨\u0006\u0014"}, d2 = {"androidx/compose/foundation/gestures/f$j", "Landroidx/compose/foundation/gestures/d0;", "Landroidx/compose/foundation/a2;", "dragPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/v;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "block", "a", "(Landroidx/compose/foundation/a2;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "delta", "b", "(F)V", "androidx/compose/foundation/gestures/f$j$b", "Landroidx/compose/foundation/gestures/f$j$b;", "dragScope", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class j implements d0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final b dragScope;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f<T> f4006b;

        /* compiled from: AnchoredDraggable.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", i = {}, l = {282}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/gestures/d;", "Landroidx/compose/foundation/gestures/z;", "it", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/d;Landroidx/compose/foundation/gestures/z;)V"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableState$draggableState$1$drag$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,767:1\n1#2:768\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.q<androidx.compose.foundation.gestures.d, z<T>, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f4007b;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.p<v, kotlin.coroutines.d<? super kotlin.k2>, Object> f4009d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(ld.p<? super v, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, kotlin.coroutines.d<? super a> dVar) {
                super(3, dVar);
                this.f4009d = pVar;
            }

            @Override // ld.q
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object R(@fg.l androidx.compose.foundation.gestures.d dVar, @fg.l z<T> zVar, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar2) {
                return j.this.new a(this.f4009d, dVar2).invokeSuspend(kotlin.k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f4007b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    b bVar = j.this.dragScope;
                    ld.p<v, kotlin.coroutines.d<? super kotlin.k2>, Object> pVar = this.f4009d;
                    this.f4007b = 1;
                    if (pVar.invoke(bVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                }
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/foundation/gestures/f$j$b", "Landroidx/compose/foundation/gestures/v;", "", "pixels", "Lkotlin/k2;", "c", "(F)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class b implements v {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f<T> f4010a;

            b(f<T> fVar) {
                this.f4010a = fVar;
            }

            @Override // androidx.compose.foundation.gestures.v
            public void c(float pixels) {
                androidx.compose.foundation.gestures.d.b(((f) this.f4010a).anchoredDragScope, this.f4010a.C(pixels), 0.0f, 2, null);
            }
        }

        j(f<T> fVar) {
            this.f4006b = fVar;
            this.dragScope = new b(fVar);
        }

        @Override // androidx.compose.foundation.gestures.d0
        @fg.m
        public Object a(@fg.l a2 a2Var, @fg.l ld.p<? super v, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
            Object h4 = this.f4006b.h(a2Var, new a(pVar, null), dVar);
            return h4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? h4 : kotlin.k2.f75408a;
        }

        @Override // androidx.compose.foundation.gestures.d0
        public void b(float delta) {
            this.f4006b.n(delta);
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class k extends kotlin.jvm.internal.n0 implements ld.a<Float> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f<T> f4011b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(f<T> fVar) {
            super(0);
            this.f4011b = fVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            float e4 = this.f4011b.o().e(this.f4011b.s());
            float e5 = this.f4011b.o().e(this.f4011b.q()) - e4;
            float abs = Math.abs(e5);
            float f4 = 1.0f;
            if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                float D = (this.f4011b.D() - e4) / e5;
                if (D < 1.0E-6f) {
                    f4 = 0.0f;
                } else if (D <= 0.999999f) {
                    f4 = D;
                }
            }
            return Float.valueOf(f4);
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class l extends kotlin.jvm.internal.n0 implements ld.a<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f<T> f4012b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(f<T> fVar) {
            super(0);
            this.f4012b = fVar;
        }

        @Override // ld.a
        public final T invoke() {
            T t4 = (T) f.d(this.f4012b);
            if (t4 != null) {
                return t4;
            }
            f<T> fVar = this.f4012b;
            float w4 = fVar.w();
            return !Float.isNaN(w4) ? (T) fVar.l(w4, fVar.s(), 0.0f) : fVar.s();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(T t4, @fg.l ld.l<? super Float, Float> lVar, @fg.l ld.a<Float> aVar, @fg.l androidx.compose.animation.core.k<Float> kVar, @fg.l ld.l<? super T, Boolean> lVar2) {
        k2 g4;
        k2 g5;
        g0 h4;
        k2 g6;
        this.positionalThreshold = lVar;
        this.velocityThreshold = aVar;
        this.animationSpec = kVar;
        this.confirmValueChange = lVar2;
        this.dragMutex = new c2();
        this.draggableState = new j(this);
        g4 = t4.g(t4, null, 2, null);
        this.currentValue = g4;
        this.targetValue = o4.e(new l(this));
        this.closestValue = o4.e(new i(this));
        this.offset = androidx.compose.runtime.b.b(Float.NaN);
        this.progress = o4.d(o4.x(), new k(this));
        this.lastVelocity = androidx.compose.runtime.b.b(0.0f);
        g5 = t4.g(null, null, 2, null);
        this.dragTarget = g5;
        h4 = androidx.compose.foundation.gestures.e.h();
        g6 = t4.g(h4, null, 2, null);
        this.anchors = g6;
        this.anchoredDragScope = new h(this);
    }

    private final void E(z<T> zVar) {
        this.anchors.setValue(zVar);
    }

    private final void F(T t4) {
        this.currentValue.setValue(t4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(T t4) {
        this.dragTarget.setValue(t4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(float f4) {
        this.lastVelocity.E(f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(float f4) {
        this.offset.E(f4);
    }

    private final boolean K(T targetValue) {
        c2 c2Var = this.dragMutex;
        boolean h4 = c2Var.h();
        if (h4) {
            try {
                androidx.compose.foundation.gestures.d dVar = this.anchoredDragScope;
                float e4 = o().e(targetValue);
                if (!Float.isNaN(e4)) {
                    androidx.compose.foundation.gestures.d.b(dVar, e4, 0.0f, 2, null);
                    G(null);
                }
                F(targetValue);
                c2Var.k();
            } catch (Throwable th) {
                c2Var.k();
                throw th;
            }
        }
        return h4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void M(f fVar, z zVar, Object obj, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            if (Float.isNaN(fVar.offset.b())) {
                obj = fVar.targetValue.getValue();
            } else {
                obj = zVar.b(fVar.offset.b());
                if (obj == null) {
                    obj = fVar.targetValue.getValue();
                }
            }
        }
        fVar.L(zVar, obj);
    }

    public static final Object d(f fVar) {
        return fVar.dragTarget.getValue();
    }

    public static /* synthetic */ Object j(f fVar, a2 a2Var, ld.q qVar, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            a2Var = a2.Default;
        }
        return fVar.h(a2Var, qVar, dVar);
    }

    public static /* synthetic */ Object k(f fVar, Object obj, a2 a2Var, ld.r rVar, kotlin.coroutines.d dVar, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            a2Var = a2.Default;
        }
        return fVar.i(obj, a2Var, rVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T l(float offset, T currentValue, float velocity) {
        z<T> o4 = o();
        float e4 = o4.e(currentValue);
        float floatValue = this.velocityThreshold.invoke().floatValue();
        if (e4 == offset || Float.isNaN(e4)) {
            return currentValue;
        }
        if (Math.abs(velocity) >= Math.abs(floatValue)) {
            T a5 = o4.a(offset, offset - e4 > 0.0f);
            kotlin.jvm.internal.l0.m(a5);
            return a5;
        }
        T a6 = o4.a(offset, offset - e4 > 0.0f);
        kotlin.jvm.internal.l0.m(a6);
        return Math.abs(e4 - offset) <= Math.abs(this.positionalThreshold.invoke(Float.valueOf(Math.abs(e4 - o4.e(a6)))).floatValue()) ? currentValue : a6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T m(float offset, T currentValue) {
        z<T> o4 = o();
        float e4 = o4.e(currentValue);
        if (e4 == offset || Float.isNaN(e4)) {
            return currentValue;
        }
        T a5 = o4.a(offset, offset - e4 > 0.0f);
        return a5 == null ? currentValue : a5;
    }

    private final T t() {
        return this.dragTarget.getValue();
    }

    @fg.l
    public final ld.a<Float> A() {
        return this.velocityThreshold;
    }

    public final boolean B() {
        return this.dragTarget.getValue() != null;
    }

    public final float C(float delta) {
        return kotlin.ranges.s.H((Float.isNaN(this.offset.b()) ? 0.0f : this.offset.b()) + delta, o().d(), o().f());
    }

    public final float D() {
        if (Float.isNaN(this.offset.b())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return this.offset.b();
    }

    @fg.m
    public final Object J(float f4, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        T value = this.currentValue.getValue();
        T l4 = l(D(), value, f4);
        if (((Boolean) this.confirmValueChange.invoke(l4)).booleanValue()) {
            Object f5 = androidx.compose.foundation.gestures.e.f(this, l4, f4, dVar);
            return f5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? f5 : kotlin.k2.f75408a;
        }
        Object f6 = androidx.compose.foundation.gestures.e.f(this, value, f4, dVar);
        return f6 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? f6 : kotlin.k2.f75408a;
    }

    public final void L(@fg.l z<T> newAnchors, T newTarget) {
        if (kotlin.jvm.internal.l0.g(o(), newAnchors)) {
            return;
        }
        E(newAnchors);
        if (K(newTarget)) {
            return;
        }
        G(newTarget);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(@fg.l androidx.compose.foundation.a2 r7, @fg.l ld.q<? super androidx.compose.foundation.gestures.d, ? super androidx.compose.foundation.gestures.z<T>, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends java.lang.Object> r8, @fg.l kotlin.coroutines.d<? super kotlin.k2> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.f.d
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.f$d r0 = (androidx.compose.foundation.gestures.f.d) r0
            int r1 = r0.f3981e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3981e = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.f$d r0 = new androidx.compose.foundation.gestures.f$d
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f3979c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f3981e
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r7 = r0.f3978b
            androidx.compose.foundation.gestures.f r7 = (androidx.compose.foundation.gestures.f) r7
            kotlin.a1.n(r9)     // Catch: java.lang.Throwable -> L2d
            goto L4e
        L2d:
            r8 = move-exception
            goto L8b
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.a1.n(r9)
            androidx.compose.foundation.c2 r9 = r6.dragMutex     // Catch: java.lang.Throwable -> L89
            androidx.compose.foundation.gestures.f$e r2 = new androidx.compose.foundation.gestures.f$e     // Catch: java.lang.Throwable -> L89
            r5 = 0
            r2.<init>(r6, r8, r5)     // Catch: java.lang.Throwable -> L89
            r0.f3978b = r6     // Catch: java.lang.Throwable -> L89
            r0.f3981e = r4     // Catch: java.lang.Throwable -> L89
            java.lang.Object r7 = r9.d(r7, r2, r0)     // Catch: java.lang.Throwable -> L89
            if (r7 != r1) goto L4d
            return r1
        L4d:
            r7 = r6
        L4e:
            androidx.compose.foundation.gestures.z r8 = r7.o()
            androidx.compose.runtime.h2 r9 = r7.offset
            float r9 = r9.b()
            java.lang.Object r8 = r8.b(r9)
            if (r8 == 0) goto L86
            androidx.compose.runtime.h2 r9 = r7.offset
            float r9 = r9.b()
            androidx.compose.foundation.gestures.z r0 = r7.o()
            float r0 = r0.e(r8)
            float r9 = r9 - r0
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L86
            ld.l<T, java.lang.Boolean> r9 = r7.confirmValueChange
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L86
            r7.F(r8)
        L86:
            kotlin.k2 r7 = kotlin.k2.f75408a
            return r7
        L89:
            r8 = move-exception
            r7 = r6
        L8b:
            androidx.compose.foundation.gestures.z r9 = r7.o()
            androidx.compose.runtime.h2 r0 = r7.offset
            float r0 = r0.b()
            java.lang.Object r9 = r9.b(r0)
            if (r9 == 0) goto Lc3
            androidx.compose.runtime.h2 r0 = r7.offset
            float r0 = r0.b()
            androidx.compose.foundation.gestures.z r1 = r7.o()
            float r1 = r1.e(r9)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto Lc3
            ld.l<T, java.lang.Boolean> r0 = r7.confirmValueChange
            java.lang.Object r0 = r0.invoke(r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lc3
            r7.F(r9)
        Lc3:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.f.h(androidx.compose.foundation.a2, ld.q, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(T r7, @fg.l androidx.compose.foundation.a2 r8, @fg.l ld.r<? super androidx.compose.foundation.gestures.d, ? super androidx.compose.foundation.gestures.z<T>, ? super T, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends java.lang.Object> r9, @fg.l kotlin.coroutines.d<? super kotlin.k2> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.f.C0065f
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.f$f r0 = (androidx.compose.foundation.gestures.f.C0065f) r0
            int r1 = r0.f3993e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3993e = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.f$f r0 = new androidx.compose.foundation.gestures.f$f
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f3991c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f3993e
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r7 = r0.f3990b
            androidx.compose.foundation.gestures.f r7 = (androidx.compose.foundation.gestures.f) r7
            kotlin.a1.n(r10)     // Catch: java.lang.Throwable -> L2e
            goto L58
        L2e:
            r8 = move-exception
            goto L96
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            kotlin.a1.n(r10)
            androidx.compose.foundation.gestures.z r10 = r6.o()
            boolean r10 = r10.c(r7)
            if (r10 == 0) goto Ld2
            androidx.compose.foundation.c2 r10 = r6.dragMutex     // Catch: java.lang.Throwable -> L94
            androidx.compose.foundation.gestures.f$g r2 = new androidx.compose.foundation.gestures.f$g     // Catch: java.lang.Throwable -> L94
            r2.<init>(r6, r7, r9, r5)     // Catch: java.lang.Throwable -> L94
            r0.f3990b = r6     // Catch: java.lang.Throwable -> L94
            r0.f3993e = r4     // Catch: java.lang.Throwable -> L94
            java.lang.Object r7 = r10.d(r8, r2, r0)     // Catch: java.lang.Throwable -> L94
            if (r7 != r1) goto L57
            return r1
        L57:
            r7 = r6
        L58:
            r7.G(r5)
            androidx.compose.foundation.gestures.z r8 = r7.o()
            androidx.compose.runtime.h2 r9 = r7.offset
            float r9 = r9.b()
            java.lang.Object r8 = r8.b(r9)
            if (r8 == 0) goto Ld5
            androidx.compose.runtime.h2 r9 = r7.offset
            float r9 = r9.b()
            androidx.compose.foundation.gestures.z r10 = r7.o()
            float r10 = r10.e(r8)
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto Ld5
            ld.l<T, java.lang.Boolean> r9 = r7.confirmValueChange
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Ld5
            r7.F(r8)
            goto Ld5
        L94:
            r8 = move-exception
            r7 = r6
        L96:
            r7.G(r5)
            androidx.compose.foundation.gestures.z r9 = r7.o()
            androidx.compose.runtime.h2 r10 = r7.offset
            float r10 = r10.b()
            java.lang.Object r9 = r9.b(r10)
            if (r9 == 0) goto Ld1
            androidx.compose.runtime.h2 r10 = r7.offset
            float r10 = r10.b()
            androidx.compose.foundation.gestures.z r0 = r7.o()
            float r0 = r0.e(r9)
            float r10 = r10 - r0
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 > 0) goto Ld1
            ld.l<T, java.lang.Boolean> r10 = r7.confirmValueChange
            java.lang.Object r10 = r10.invoke(r9)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Ld1
            r7.F(r9)
        Ld1:
            throw r8
        Ld2:
            r6.F(r7)
        Ld5:
            kotlin.k2 r7 = kotlin.k2.f75408a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.f.i(java.lang.Object, androidx.compose.foundation.a2, ld.r, kotlin.coroutines.d):java.lang.Object");
    }

    public final float n(float delta) {
        float C = C(delta);
        float b5 = Float.isNaN(this.offset.b()) ? 0.0f : this.offset.b();
        I(C);
        return C - b5;
    }

    @fg.l
    public final z<T> o() {
        return (z) this.anchors.getValue();
    }

    @fg.l
    public final androidx.compose.animation.core.k<Float> p() {
        return this.animationSpec;
    }

    public final T q() {
        return (T) this.closestValue.getValue();
    }

    @fg.l
    public final ld.l<T, Boolean> r() {
        return this.confirmValueChange;
    }

    public final T s() {
        return this.currentValue.getValue();
    }

    @fg.l
    /* renamed from: u, reason: from getter */
    public final d0 getDraggableState() {
        return this.draggableState;
    }

    public final float v() {
        return this.lastVelocity.b();
    }

    public final float w() {
        return this.offset.b();
    }

    @fg.l
    public final ld.l<Float, Float> x() {
        return this.positionalThreshold;
    }

    @androidx.annotation.x(from = com.google.firebase.remoteconfig.p.f60679p, to = 1.0d)
    public final float y() {
        return ((Number) this.progress.getValue()).floatValue();
    }

    public final T z() {
        return (T) this.targetValue.getValue();
    }

    public /* synthetic */ f(Object obj, ld.l lVar, ld.a aVar, androidx.compose.animation.core.k kVar, ld.l lVar2, int i4, kotlin.jvm.internal.w wVar) {
        this(obj, lVar, aVar, kVar, (i4 & 16) != 0 ? a.f3970b : lVar2);
    }

    public /* synthetic */ f(Object obj, z zVar, ld.l lVar, ld.a aVar, androidx.compose.animation.core.k kVar, ld.l lVar2, int i4, kotlin.jvm.internal.w wVar) {
        this(obj, zVar, lVar, aVar, kVar, (i4 & 32) != 0 ? b.f3971b : lVar2);
    }

    @androidx.compose.foundation.z0
    public f(T t4, @fg.l z<T> zVar, @fg.l ld.l<? super Float, Float> lVar, @fg.l ld.a<Float> aVar, @fg.l androidx.compose.animation.core.k<Float> kVar, @fg.l ld.l<? super T, Boolean> lVar2) {
        this(t4, lVar, aVar, kVar, lVar2);
        E(zVar);
        K(t4);
    }
}
