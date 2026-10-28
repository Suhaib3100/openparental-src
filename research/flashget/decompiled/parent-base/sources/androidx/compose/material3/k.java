package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b)\b\u0001\u0018\u0000 k*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001ABs\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u0012#\b\u0002\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0011\u0010\u0012B\u0083\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u0012#\b\u0002\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0011\u0010\u0015J'\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0005¢\u0006\u0004\b \u0010!J%\u0010%\u001a\u00020$2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\b\b\u0002\u0010#\u001a\u00028\u0000¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00020$2\u0006\u0010\u0018\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b'\u0010(J^\u00100\u001a\u00020$2\b\b\u0002\u0010*\u001a\u00020)2B\u0010/\u001a>\b\u0001\u0012\u0004\u0012\u00020,\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0-\u0012\u0006\u0012\u0004\u0018\u00010\u00020+¢\u0006\u0002\b.H\u0086@¢\u0006\u0004\b0\u00101J{\u00103\u001a\u00020$2\u0006\u0010\u001d\u001a\u00028\u00002\b\b\u0002\u0010*\u001a\u00020)2W\u0010/\u001aS\b\u0001\u0012\u0004\u0012\u00020,\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0-\u0012\u0006\u0012\u0004\u0018\u00010\u000202¢\u0006\u0002\b.H\u0086@¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0005H\u0000¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0005¢\u0006\u0004\b8\u00107R5\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR5\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010:\u001a\u0004\bF\u0010<R\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010P\u001a\u00020K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR+\u0010\u0017\u001a\u00028\u00002\u0006\u0010Q\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001b\u0010\u001d\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010UR\u001b\u0010\\\u001a\u00028\u00008@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b0\u0010Y\u001a\u0004\b[\u0010UR+\u0010\u0016\u001a\u00020\u00052\u0006\u0010Q\u001a\u00020\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010]\u001a\u0004\b^\u0010!\"\u0004\b_\u0010`R\u001b\u0010c\u001a\u00020\u00058GX\u0086\u0084\u0002¢\u0006\f\n\u0004\ba\u0010Y\u001a\u0004\bb\u0010!R+\u0010g\u001a\u00020\u00052\u0006\u0010Q\u001a\u00020\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bd\u0010]\u001a\u0004\be\u0010!\"\u0004\bf\u0010`R/\u0010j\u001a\u0004\u0018\u00018\u00002\b\u0010Q\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010S\u001a\u0004\bh\u0010U\"\u0004\bi\u0010WR7\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010S\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u0014\u0010p\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010oR\u0011\u0010s\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bq\u0010r¨\u0006t"}, d2 = {"Landroidx/compose/material3/k;", "T", "", "initialValue", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "totalDistance", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "Landroidx/compose/animation/core/k;", "animationSpec", "newValue", "", "confirmValueChange", "<init>", "(Ljava/lang/Object;Lld/l;Lld/a;Landroidx/compose/animation/core/k;Lld/l;)V", "Landroidx/compose/material3/t4;", "anchors", "(Ljava/lang/Object;Landroidx/compose/material3/t4;Lld/l;Lld/a;Landroidx/compose/animation/core/k;Lld/l;)V", "offset", "currentValue", "velocity", "m", "(FLjava/lang/Object;F)Ljava/lang/Object;", "n", "(FLjava/lang/Object;)Ljava/lang/Object;", "targetValue", "L", "(Ljava/lang/Object;)Z", "E", "()F", "newAnchors", "newTarget", "Lkotlin/k2;", "M", "(Landroidx/compose/material3/t4;Ljava/lang/Object;)V", "K", "(FLkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/a2;", "dragPriority", "Lkotlin/Function3;", "Landroidx/compose/material3/h;", "Lkotlin/coroutines/d;", "Lkotlin/u;", "block", "i", "(Landroidx/compose/foundation/a2;Lld/q;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function4;", "j", "(Ljava/lang/Object;Landroidx/compose/foundation/a2;Lld/r;Lkotlin/coroutines/d;)Ljava/lang/Object;", "delta", "D", "(F)F", "o", "a", "Lld/l;", "y", "()Lld/l;", "b", "Lld/a;", "B", "()Lld/a;", "c", "Landroidx/compose/animation/core/k;", "q", "()Landroidx/compose/animation/core/k;", "d", "s", "Landroidx/compose/material3/b6;", "e", "Landroidx/compose/material3/b6;", "dragMutex", "Landroidx/compose/foundation/gestures/d0;", "f", "Landroidx/compose/foundation/gestures/d0;", "v", "()Landroidx/compose/foundation/gestures/d0;", "draggableState", "<set-?>", "g", "Landroidx/compose/runtime/k2;", "t", "()Ljava/lang/Object;", "G", "(Ljava/lang/Object;)V", "h", "Landroidx/compose/runtime/b5;", "A", "r", "closestValue", "Landroidx/compose/runtime/h2;", "x", "J", "(F)V", "k", "z", "progress", "l", "w", "I", "lastVelocity", "u", "H", "dragTarget", "p", "()Landroidx/compose/material3/t4;", "F", "(Landroidx/compose/material3/t4;)V", "Landroidx/compose/material3/h;", "anchoredDragScope", "C", "()Z", "isAnimationRunning", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.x4
@f5
@kotlin.jvm.internal.r1({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material3/AnchoredDraggableState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,791:1\n81#2:792\n107#2,2:793\n81#2:795\n81#2:796\n81#2:800\n81#2:804\n107#2,2:805\n81#2:807\n107#2,2:808\n76#3:797\n109#3,2:798\n76#3:801\n109#3,2:802\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material3/AnchoredDraggableState\n*L\n294#1:792\n294#1:793,2\n302#1:795\n316#1:796\n361#1:800\n381#1:804\n381#1:805,2\n383#1:807\n383#1:808,2\n333#1:797\n333#1:798,2\n378#1:801\n378#1:802,2\n*E\n"})
/* loaded from: classes.dex */
public final class k<T> {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: q, reason: collision with root package name */
    public static final int f12015q = 0;

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
    private final b6 dragMutex;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.gestures.d0 draggableState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 currentValue;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.b5 targetValue;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.b5 closestValue;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.h2 offset;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.b5 progress;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.h2 lastVelocity;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 dragTarget;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 anchors;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.material3.h anchoredDragScope;

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<T, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f12031b = new a(1);

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
        public static final b f12032b = new b(1);

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
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J~\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\u0004\u0012\u00028\u00010\u0011\"\b\b\u0001\u0010\u0004*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\b2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/material3/k$c;", "", "<init>", "()V", "T", "Landroidx/compose/animation/core/k;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmValueChange", "Lkotlin/r0;", "name", "distance", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/material3/k;", "a", "(Landroidx/compose/animation/core/k;Lld/l;Lld/l;Lld/a;)Landroidx/compose/runtime/saveable/l;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.k$c, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00018\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/material3/k;", "it", "a", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/material3/k;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.k$c$a */
        static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, k<T>, T> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f12033b = new a(2);

            a() {
                super(2);
            }

            @fg.m
            public final T a(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l k<T> kVar) {
                return kVar.t();
            }

            @Override // ld.p
            public Object invoke(androidx.compose.runtime.saveable.n nVar, Object obj) {
                return ((k) obj).t();
            }
        }

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "it", "Landroidx/compose/material3/k;", "a", "(Ljava/lang/Object;)Landroidx/compose/material3/k;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.k$c$b */
        static final class b extends kotlin.jvm.internal.n0 implements ld.l<T, k<T>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.l<Float, Float> f12034b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.a<Float> f12035c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.animation.core.k<Float> f12036d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ld.l<T, Boolean> f12037e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(ld.l<? super Float, Float> lVar, ld.a<Float> aVar, androidx.compose.animation.core.k<Float> kVar, ld.l<? super T, Boolean> lVar2) {
                super(1);
                this.f12034b = lVar;
                this.f12035c = aVar;
                this.f12036d = kVar;
                this.f12037e = lVar2;
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k<T> invoke(@fg.l T t4) {
                return new k<>(t4, this.f12034b, this.f12035c, this.f12036d, this.f12037e);
            }
        }

        private Companion() {
        }

        @fg.l
        @f5
        public final <T> androidx.compose.runtime.saveable.l<k<T>, T> a(@fg.l androidx.compose.animation.core.k<Float> animationSpec, @fg.l ld.l<? super T, Boolean> confirmValueChange, @fg.l ld.l<? super Float, Float> positionalThreshold, @fg.l ld.a<Float> velocityThreshold) {
            return androidx.compose.runtime.saveable.m.a(a.f12033b, new b(positionalThreshold, velocityThreshold, animationSpec, confirmValueChange));
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AnchoredDraggableState", f = "AnchoredDraggable.kt", i = {0}, l = {529}, m = "anchoredDrag", n = {"this"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f12038b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f12039c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k<T> f12040d;

        /* renamed from: e, reason: collision with root package name */
        int f12041e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(k<T> kVar, kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
            this.f12040d = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f12039c = obj;
            this.f12041e |= Integer.MIN_VALUE;
            return this.f12040d.i(null, null, this);
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", i = {}, l = {530}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/k2;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.coroutines.jvm.internal.o implements ld.l<kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f12042b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k<T> f12043c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.material3.h, t4<T>, kotlin.coroutines.d<? super kotlin.k2>, Object> f12044d;

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Landroidx/compose/material3/t4;", "a", "()Landroidx/compose/material3/t4;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<t4<T>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k<T> f12045b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k<T> kVar) {
                super(0);
                this.f12045b = kVar;
            }

            @fg.l
            public final t4<T> a() {
                return this.f12045b.p();
            }

            @Override // ld.a
            public Object invoke() {
                return this.f12045b.p();
            }
        }

        /* compiled from: AnchoredDraggable.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", i = {}, l = {531}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/compose/material3/t4;", "latestAnchors", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/material3/t4;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<t4<T>, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f12046b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f12047c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.q<androidx.compose.material3.h, t4<T>, kotlin.coroutines.d<? super kotlin.k2>, Object> f12048d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ k<T> f12049e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(ld.q<? super androidx.compose.material3.h, ? super t4<T>, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> qVar, k<T> kVar, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f12048d = qVar;
                this.f12049e = kVar;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l t4<T> t4Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((b) create(t4Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                b bVar = new b(this.f12048d, this.f12049e, dVar);
                bVar.f12047c = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f12046b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    t4<T> t4Var = (t4) this.f12047c;
                    ld.q<androidx.compose.material3.h, t4<T>, kotlin.coroutines.d<? super kotlin.k2>, Object> qVar = this.f12048d;
                    androidx.compose.material3.h hVar = ((k) this.f12049e).anchoredDragScope;
                    this.f12046b = 1;
                    if (qVar.R(hVar, t4Var, this) == aVar) {
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
        e(k<T> kVar, ld.q<? super androidx.compose.material3.h, ? super t4<T>, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> qVar, kotlin.coroutines.d<? super e> dVar) {
            super(1, dVar);
            this.f12043c = kVar;
            this.f12044d = qVar;
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
            return new e(this.f12043c, this.f12044d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f12042b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                a aVar2 = new a(this.f12043c);
                b bVar = new b(this.f12044d, this.f12043c, null);
                this.f12042b = 1;
                if (androidx.compose.material3.j.i(aVar2, bVar, this) == aVar) {
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
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AnchoredDraggableState", f = "AnchoredDraggable.kt", i = {0}, l = {575}, m = "anchoredDrag", n = {"this"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f12050b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f12051c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k<T> f12052d;

        /* renamed from: e, reason: collision with root package name */
        int f12053e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(k<T> kVar, kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
            this.f12052d = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f12051c = obj;
            this.f12053e |= Integer.MIN_VALUE;
            return this.f12052d.j(null, null, null, this);
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", i = {}, l = {577}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/k2;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.coroutines.jvm.internal.o implements ld.l<kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f12054b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k<T> f12055c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f12056d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.r<androidx.compose.material3.h, t4<T>, T, kotlin.coroutines.d<? super kotlin.k2>, Object> f12057e;

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlin/q0;", "Landroidx/compose/material3/t4;", "a", "()Lkotlin/q0;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<kotlin.q0<? extends t4<T>, ? extends T>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k<T> f12058b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k<T> kVar) {
                super(0);
                this.f12058b = kVar;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.q0<t4<T>, T> invoke() {
                return new kotlin.q0<>(this.f12058b.p(), this.f12058b.A());
            }
        }

        /* compiled from: AnchoredDraggable.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", i = {}, l = {580}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlin/q0;", "Landroidx/compose/material3/t4;", "<name for destructuring parameter 0>", "Lkotlin/k2;", "<anonymous>", "(Lkotlin/q0;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlin.q0<? extends t4<T>, ? extends T>, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f12059b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f12060c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.r<androidx.compose.material3.h, t4<T>, T, kotlin.coroutines.d<? super kotlin.k2>, Object> f12061d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ k<T> f12062e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(ld.r<? super androidx.compose.material3.h, ? super t4<T>, ? super T, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> rVar, k<T> kVar, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f12061d = rVar;
                this.f12062e = kVar;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l kotlin.q0<? extends t4<T>, ? extends T> q0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                b bVar = new b(this.f12061d, this.f12062e, dVar);
                bVar.f12060c = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f12059b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    kotlin.q0 q0Var = (kotlin.q0) this.f12060c;
                    t4 t4Var = (t4) q0Var.a();
                    Object b5 = q0Var.b();
                    ld.r<androidx.compose.material3.h, t4<T>, T, kotlin.coroutines.d<? super kotlin.k2>, Object> rVar = this.f12061d;
                    androidx.compose.material3.h hVar = ((k) this.f12062e).anchoredDragScope;
                    this.f12059b = 1;
                    if (rVar.i(hVar, t4Var, b5, this) == aVar) {
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
        g(k<T> kVar, T t4, ld.r<? super androidx.compose.material3.h, ? super t4<T>, ? super T, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> rVar, kotlin.coroutines.d<? super g> dVar) {
            super(1, dVar);
            this.f12055c = kVar;
            this.f12056d = t4;
            this.f12057e = rVar;
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
            return new g(this.f12055c, this.f12056d, this.f12057e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f12054b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                this.f12055c.H(this.f12056d);
                a aVar2 = new a(this.f12055c);
                b bVar = new b(this.f12057e, this.f12055c, null);
                this.f12054b = 1;
                if (androidx.compose.material3.j.i(aVar2, bVar, this) == aVar) {
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
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/compose/material3/k$h", "Landroidx/compose/material3/h;", "", "newOffset", "lastKnownVelocity", "Lkotlin/k2;", "a", "(FF)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class h implements androidx.compose.material3.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k<T> f12063a;

        h(k<T> kVar) {
            this.f12063a = kVar;
        }

        @Override // androidx.compose.material3.h
        public void a(float newOffset, float lastKnownVelocity) {
            this.f12063a.J(newOffset);
            this.f12063a.I(lastKnownVelocity);
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class i extends kotlin.jvm.internal.n0 implements ld.a<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k<T> f12064b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(k<T> kVar) {
            super(0);
            this.f12064b = kVar;
        }

        @Override // ld.a
        public final T invoke() {
            T t4 = (T) k.d(this.f12064b);
            if (t4 != null) {
                return t4;
            }
            k<T> kVar = this.f12064b;
            float x4 = kVar.x();
            return !Float.isNaN(x4) ? (T) kVar.n(x4, kVar.t()) : kVar.t();
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\b\u0004*\u0002\u0000\u0011\b\n\u0018\u00002\u00020\u0001JA\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012¨\u0006\u0014"}, d2 = {"androidx/compose/material3/k$j", "Landroidx/compose/foundation/gestures/d0;", "Landroidx/compose/foundation/a2;", "dragPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/v;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "block", "a", "(Landroidx/compose/foundation/a2;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "delta", "b", "(F)V", "androidx/compose/material3/k$j$b", "Landroidx/compose/material3/k$j$b;", "dragScope", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class j implements androidx.compose.foundation.gestures.d0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final b dragScope;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k<T> f12066b;

        /* compiled from: AnchoredDraggable.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", i = {}, l = {282}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/material3/h;", "Landroidx/compose/material3/t4;", "it", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/material3/h;Landroidx/compose/material3/t4;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material3/AnchoredDraggableState$draggableState$1$drag$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,791:1\n1#2:792\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.q<androidx.compose.material3.h, t4<T>, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f12067b;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.foundation.gestures.v, kotlin.coroutines.d<? super kotlin.k2>, Object> f12069d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(ld.p<? super androidx.compose.foundation.gestures.v, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, kotlin.coroutines.d<? super a> dVar) {
                super(3, dVar);
                this.f12069d = pVar;
            }

            @Override // ld.q
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object R(@fg.l androidx.compose.material3.h hVar, @fg.l t4<T> t4Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return j.this.new a(this.f12069d, dVar).invokeSuspend(kotlin.k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f12067b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    b bVar = j.this.dragScope;
                    ld.p<androidx.compose.foundation.gestures.v, kotlin.coroutines.d<? super kotlin.k2>, Object> pVar = this.f12069d;
                    this.f12067b = 1;
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
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/material3/k$j$b", "Landroidx/compose/foundation/gestures/v;", "", "pixels", "Lkotlin/k2;", "c", "(F)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class b implements androidx.compose.foundation.gestures.v {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k<T> f12070a;

            b(k<T> kVar) {
                this.f12070a = kVar;
            }

            @Override // androidx.compose.foundation.gestures.v
            public void c(float pixels) {
                androidx.compose.material3.h.b(((k) this.f12070a).anchoredDragScope, this.f12070a.D(pixels), 0.0f, 2, null);
            }
        }

        j(k<T> kVar) {
            this.f12066b = kVar;
            this.dragScope = new b(kVar);
        }

        @Override // androidx.compose.foundation.gestures.d0
        @fg.m
        public Object a(@fg.l androidx.compose.foundation.a2 a2Var, @fg.l ld.p<? super androidx.compose.foundation.gestures.v, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
            Object i4 = this.f12066b.i(a2Var, new a(pVar, null), dVar);
            return i4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? i4 : kotlin.k2.f75408a;
        }

        @Override // androidx.compose.foundation.gestures.d0
        public void b(float delta) {
            this.f12066b.o(delta);
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.k$k, reason: collision with other inner class name */
    static final class C0266k extends kotlin.jvm.internal.n0 implements ld.a<Float> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k<T> f12071b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0266k(k<T> kVar) {
            super(0);
            this.f12071b = kVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            float e4 = this.f12071b.p().e(this.f12071b.t());
            float e5 = this.f12071b.p().e(this.f12071b.r()) - e4;
            float abs = Math.abs(e5);
            float f4 = 1.0f;
            if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                float E = (this.f12071b.E() - e4) / e5;
                if (E < 1.0E-6f) {
                    f4 = 0.0f;
                } else if (E <= 0.999999f) {
                    f4 = E;
                }
            }
            return Float.valueOf(f4);
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class l extends kotlin.jvm.internal.n0 implements ld.a<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k<T> f12072b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(k<T> kVar) {
            super(0);
            this.f12072b = kVar;
        }

        @Override // ld.a
        public final T invoke() {
            T t4 = (T) k.d(this.f12072b);
            if (t4 != null) {
                return t4;
            }
            k<T> kVar = this.f12072b;
            float x4 = kVar.x();
            return !Float.isNaN(x4) ? (T) kVar.m(x4, kVar.t(), 0.0f) : kVar.t();
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class m extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k<T> f12073b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f12074c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(k<T> kVar, T t4) {
            super(0);
            this.f12073b = kVar;
            this.f12074c = t4;
        }

        public final void a() {
            androidx.compose.material3.h hVar = ((k) this.f12073b).anchoredDragScope;
            k<T> kVar = this.f12073b;
            T t4 = this.f12074c;
            float e4 = kVar.p().e(t4);
            if (!Float.isNaN(e4)) {
                androidx.compose.material3.h.b(hVar, e4, 0.0f, 2, null);
                kVar.H(null);
            }
            kVar.G(t4);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(T t4, @fg.l ld.l<? super Float, Float> lVar, @fg.l ld.a<Float> aVar, @fg.l androidx.compose.animation.core.k<Float> kVar, @fg.l ld.l<? super T, Boolean> lVar2) {
        androidx.compose.runtime.k2 g4;
        androidx.compose.runtime.k2 g5;
        androidx.compose.runtime.k2 g6;
        this.positionalThreshold = lVar;
        this.velocityThreshold = aVar;
        this.animationSpec = kVar;
        this.confirmValueChange = lVar2;
        this.dragMutex = new b6();
        this.draggableState = new j(this);
        g4 = androidx.compose.runtime.t4.g(t4, null, 2, null);
        this.currentValue = g4;
        this.targetValue = androidx.compose.runtime.o4.e(new l(this));
        this.closestValue = androidx.compose.runtime.o4.e(new i(this));
        this.offset = androidx.compose.runtime.b.b(Float.NaN);
        this.progress = androidx.compose.runtime.o4.d(androidx.compose.runtime.o4.x(), new C0266k(this));
        this.lastVelocity = androidx.compose.runtime.b.b(0.0f);
        g5 = androidx.compose.runtime.t4.g(null, null, 2, null);
        this.dragTarget = g5;
        g6 = androidx.compose.runtime.t4.g(androidx.compose.material3.j.h(), null, 2, null);
        this.anchors = g6;
        this.anchoredDragScope = new h(this);
    }

    private final void F(t4<T> t4Var) {
        this.anchors.setValue(t4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(T t4) {
        this.currentValue.setValue(t4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(T t4) {
        this.dragTarget.setValue(t4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(float f4) {
        this.lastVelocity.E(f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(float f4) {
        this.offset.E(f4);
    }

    private final boolean L(T targetValue) {
        return this.dragMutex.h(new m(this, targetValue));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void N(k kVar, t4 t4Var, Object obj, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            if (Float.isNaN(kVar.offset.b())) {
                obj = kVar.targetValue.getValue();
            } else {
                obj = t4Var.b(kVar.offset.b());
                if (obj == null) {
                    obj = kVar.targetValue.getValue();
                }
            }
        }
        kVar.M(t4Var, obj);
    }

    public static final Object d(k kVar) {
        return kVar.dragTarget.getValue();
    }

    public static /* synthetic */ Object k(k kVar, androidx.compose.foundation.a2 a2Var, ld.q qVar, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            a2Var = androidx.compose.foundation.a2.Default;
        }
        return kVar.i(a2Var, qVar, dVar);
    }

    public static /* synthetic */ Object l(k kVar, Object obj, androidx.compose.foundation.a2 a2Var, ld.r rVar, kotlin.coroutines.d dVar, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            a2Var = androidx.compose.foundation.a2.Default;
        }
        return kVar.j(obj, a2Var, rVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T m(float offset, T currentValue, float velocity) {
        T a5;
        t4<T> p4 = p();
        float e4 = p4.e(currentValue);
        float floatValue = this.velocityThreshold.invoke().floatValue();
        if (e4 == offset || Float.isNaN(e4)) {
            return currentValue;
        }
        if (e4 < offset) {
            if (velocity >= floatValue) {
                T a6 = p4.a(offset, true);
                kotlin.jvm.internal.l0.m(a6);
                return a6;
            }
            a5 = p4.a(offset, true);
            kotlin.jvm.internal.l0.m(a5);
            if (offset < Math.abs(Math.abs(this.positionalThreshold.invoke(Float.valueOf(Math.abs(p4.e(a5) - e4))).floatValue()) + e4)) {
                return currentValue;
            }
        } else {
            if (velocity <= (-floatValue)) {
                T a7 = p4.a(offset, false);
                kotlin.jvm.internal.l0.m(a7);
                return a7;
            }
            a5 = p4.a(offset, false);
            kotlin.jvm.internal.l0.m(a5);
            float abs = Math.abs(e4 - Math.abs(this.positionalThreshold.invoke(Float.valueOf(Math.abs(e4 - p4.e(a5)))).floatValue()));
            if (offset < 0.0f) {
                if (Math.abs(offset) < abs) {
                    return currentValue;
                }
            } else if (offset > abs) {
                return currentValue;
            }
        }
        return a5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T n(float offset, T currentValue) {
        T a5;
        t4<T> p4 = p();
        float e4 = p4.e(currentValue);
        if (e4 == offset || Float.isNaN(e4)) {
            return currentValue;
        }
        if (e4 < offset) {
            a5 = p4.a(offset, true);
            if (a5 == null) {
                return currentValue;
            }
        } else {
            a5 = p4.a(offset, false);
            if (a5 == null) {
                return currentValue;
            }
        }
        return a5;
    }

    private final T u() {
        return this.dragTarget.getValue();
    }

    public final T A() {
        return (T) this.targetValue.getValue();
    }

    @fg.l
    public final ld.a<Float> B() {
        return this.velocityThreshold;
    }

    public final boolean C() {
        return this.dragTarget.getValue() != null;
    }

    public final float D(float delta) {
        return kotlin.ranges.s.H((Float.isNaN(this.offset.b()) ? 0.0f : this.offset.b()) + delta, p().d(), p().f());
    }

    public final float E() {
        if (Float.isNaN(this.offset.b())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return this.offset.b();
    }

    @fg.m
    public final Object K(float f4, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        T value = this.currentValue.getValue();
        T m4 = m(E(), value, f4);
        if (((Boolean) this.confirmValueChange.invoke(m4)).booleanValue()) {
            Object f5 = androidx.compose.material3.j.f(this, m4, f4, dVar);
            return f5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? f5 : kotlin.k2.f75408a;
        }
        Object f6 = androidx.compose.material3.j.f(this, value, f4, dVar);
        return f6 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? f6 : kotlin.k2.f75408a;
    }

    public final void M(@fg.l t4<T> newAnchors, T newTarget) {
        if (kotlin.jvm.internal.l0.g(p(), newAnchors)) {
            return;
        }
        F(newAnchors);
        if (L(newTarget)) {
            return;
        }
        H(newTarget);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(@fg.l androidx.compose.foundation.a2 r7, @fg.l ld.q<? super androidx.compose.material3.h, ? super androidx.compose.material3.t4<T>, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends java.lang.Object> r8, @fg.l kotlin.coroutines.d<? super kotlin.k2> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.material3.k.d
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.material3.k$d r0 = (androidx.compose.material3.k.d) r0
            int r1 = r0.f12041e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12041e = r1
            goto L18
        L13:
            androidx.compose.material3.k$d r0 = new androidx.compose.material3.k$d
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f12039c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f12041e
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r7 = r0.f12038b
            androidx.compose.material3.k r7 = (androidx.compose.material3.k) r7
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
            androidx.compose.material3.b6 r9 = r6.dragMutex     // Catch: java.lang.Throwable -> L89
            androidx.compose.material3.k$e r2 = new androidx.compose.material3.k$e     // Catch: java.lang.Throwable -> L89
            r5 = 0
            r2.<init>(r6, r8, r5)     // Catch: java.lang.Throwable -> L89
            r0.f12038b = r6     // Catch: java.lang.Throwable -> L89
            r0.f12041e = r4     // Catch: java.lang.Throwable -> L89
            java.lang.Object r7 = r9.d(r7, r2, r0)     // Catch: java.lang.Throwable -> L89
            if (r7 != r1) goto L4d
            return r1
        L4d:
            r7 = r6
        L4e:
            androidx.compose.material3.t4 r8 = r7.p()
            androidx.compose.runtime.h2 r9 = r7.offset
            float r9 = r9.b()
            java.lang.Object r8 = r8.b(r9)
            if (r8 == 0) goto L86
            androidx.compose.runtime.h2 r9 = r7.offset
            float r9 = r9.b()
            androidx.compose.material3.t4 r0 = r7.p()
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
            r7.G(r8)
        L86:
            kotlin.k2 r7 = kotlin.k2.f75408a
            return r7
        L89:
            r8 = move-exception
            r7 = r6
        L8b:
            androidx.compose.material3.t4 r9 = r7.p()
            androidx.compose.runtime.h2 r0 = r7.offset
            float r0 = r0.b()
            java.lang.Object r9 = r9.b(r0)
            if (r9 == 0) goto Lc3
            androidx.compose.runtime.h2 r0 = r7.offset
            float r0 = r0.b()
            androidx.compose.material3.t4 r1 = r7.p()
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
            r7.G(r9)
        Lc3:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.k.i(androidx.compose.foundation.a2, ld.q, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(T r7, @fg.l androidx.compose.foundation.a2 r8, @fg.l ld.r<? super androidx.compose.material3.h, ? super androidx.compose.material3.t4<T>, ? super T, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends java.lang.Object> r9, @fg.l kotlin.coroutines.d<? super kotlin.k2> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof androidx.compose.material3.k.f
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.material3.k$f r0 = (androidx.compose.material3.k.f) r0
            int r1 = r0.f12053e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12053e = r1
            goto L18
        L13:
            androidx.compose.material3.k$f r0 = new androidx.compose.material3.k$f
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f12051c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f12053e
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r7 = r0.f12050b
            androidx.compose.material3.k r7 = (androidx.compose.material3.k) r7
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
            androidx.compose.material3.t4 r10 = r6.p()
            boolean r10 = r10.c(r7)
            if (r10 == 0) goto Ld2
            androidx.compose.material3.b6 r10 = r6.dragMutex     // Catch: java.lang.Throwable -> L94
            androidx.compose.material3.k$g r2 = new androidx.compose.material3.k$g     // Catch: java.lang.Throwable -> L94
            r2.<init>(r6, r7, r9, r5)     // Catch: java.lang.Throwable -> L94
            r0.f12050b = r6     // Catch: java.lang.Throwable -> L94
            r0.f12053e = r4     // Catch: java.lang.Throwable -> L94
            java.lang.Object r7 = r10.d(r8, r2, r0)     // Catch: java.lang.Throwable -> L94
            if (r7 != r1) goto L57
            return r1
        L57:
            r7 = r6
        L58:
            r7.H(r5)
            androidx.compose.material3.t4 r8 = r7.p()
            androidx.compose.runtime.h2 r9 = r7.offset
            float r9 = r9.b()
            java.lang.Object r8 = r8.b(r9)
            if (r8 == 0) goto Ld5
            androidx.compose.runtime.h2 r9 = r7.offset
            float r9 = r9.b()
            androidx.compose.material3.t4 r10 = r7.p()
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
            r7.G(r8)
            goto Ld5
        L94:
            r8 = move-exception
            r7 = r6
        L96:
            r7.H(r5)
            androidx.compose.material3.t4 r9 = r7.p()
            androidx.compose.runtime.h2 r10 = r7.offset
            float r10 = r10.b()
            java.lang.Object r9 = r9.b(r10)
            if (r9 == 0) goto Ld1
            androidx.compose.runtime.h2 r10 = r7.offset
            float r10 = r10.b()
            androidx.compose.material3.t4 r0 = r7.p()
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
            r7.G(r9)
        Ld1:
            throw r8
        Ld2:
            r6.G(r7)
        Ld5:
            kotlin.k2 r7 = kotlin.k2.f75408a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.k.j(java.lang.Object, androidx.compose.foundation.a2, ld.r, kotlin.coroutines.d):java.lang.Object");
    }

    public final float o(float delta) {
        float D = D(delta);
        float b5 = Float.isNaN(this.offset.b()) ? 0.0f : this.offset.b();
        J(D);
        return D - b5;
    }

    @fg.l
    public final t4<T> p() {
        return (t4) this.anchors.getValue();
    }

    @fg.l
    public final androidx.compose.animation.core.k<Float> q() {
        return this.animationSpec;
    }

    public final T r() {
        return (T) this.closestValue.getValue();
    }

    @fg.l
    public final ld.l<T, Boolean> s() {
        return this.confirmValueChange;
    }

    public final T t() {
        return this.currentValue.getValue();
    }

    @fg.l
    /* renamed from: v, reason: from getter */
    public final androidx.compose.foundation.gestures.d0 getDraggableState() {
        return this.draggableState;
    }

    public final float w() {
        return this.lastVelocity.b();
    }

    public final float x() {
        return this.offset.b();
    }

    @fg.l
    public final ld.l<Float, Float> y() {
        return this.positionalThreshold;
    }

    @androidx.annotation.x(from = com.google.firebase.remoteconfig.p.f60679p, to = 1.0d)
    public final float z() {
        return ((Number) this.progress.getValue()).floatValue();
    }

    public /* synthetic */ k(Object obj, ld.l lVar, ld.a aVar, androidx.compose.animation.core.k kVar, ld.l lVar2, int i4, kotlin.jvm.internal.w wVar) {
        this(obj, lVar, aVar, kVar, (i4 & 16) != 0 ? a.f12031b : lVar2);
    }

    public /* synthetic */ k(Object obj, t4 t4Var, ld.l lVar, ld.a aVar, androidx.compose.animation.core.k kVar, ld.l lVar2, int i4, kotlin.jvm.internal.w wVar) {
        this(obj, t4Var, lVar, aVar, kVar, (i4 & 32) != 0 ? b.f12032b : lVar2);
    }

    @f5
    public k(T t4, @fg.l t4<T> t4Var, @fg.l ld.l<? super Float, Float> lVar, @fg.l ld.a<Float> aVar, @fg.l androidx.compose.animation.core.k<Float> kVar, @fg.l ld.l<? super T, Boolean> lVar2) {
        this(t4, lVar, aVar, kVar, lVar2);
        F(t4Var);
        L(t4);
    }
}
