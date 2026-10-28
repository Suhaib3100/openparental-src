package androidx.compose.foundation;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.ui.q;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AndroidOverscroll.android.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J'\u0010\u0016\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0012J'\u0010\u0018\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0012J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\"\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001dH\u0002ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\"\u0010&\u001a\u00020#2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001dH\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010%J\"\u0010'\u001a\u00020#2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001dH\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010%J\"\u0010(\u001a\u00020#2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001dH\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010%J6\u0010-\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020)2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0+H\u0016ø\u0001\u0000¢\u0006\u0004\b-\u0010.J?\u00105\u001a\u00020\u00192\u0006\u00100\u001a\u00020/2\"\u00104\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020/\u0012\n\u0012\b\u0012\u0004\u0012\u00020/02\u0012\u0006\u0012\u0004\u0018\u00010301H\u0096@ø\u0001\u0000¢\u0006\u0004\b5\u00106J\u0011\u00107\u001a\u00020\u0019*\u00020\u000b¢\u0006\u0004\b7\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001e\u0010=\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010>R\u0014\u0010@\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010>R\u0014\u0010B\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010>R\u0014\u0010D\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010>R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\f0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010>R\u0014\u0010L\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010>R\u0014\u0010N\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010>R\u0014\u0010P\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010>R\u0016\u0010T\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR+\u0010[\u001a\u00020Q2\u0006\u0010U\u001a\u00020Q8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bS\u0010ZR(\u0010b\u001a\u00020\b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\\\u0010]\u0012\u0004\ba\u0010\u001b\u001a\u0004\b^\u0010\n\"\u0004\b_\u0010`R\u0016\u0010d\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010]R\u001c\u0010g\u001a\u00020e8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bf\u0010_R \u0010k\u001a\u000e\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020\u00190+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u001e\u0010o\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bm\u0010nR\u001a\u0010t\u001a\u00020p8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\b;\u0010sR\u0014\u0010u\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006v"}, d2 = {"Landroidx/compose/foundation/d;", "Landroidx/compose/foundation/i2;", "Landroid/content/Context;", "context", "Landroidx/compose/foundation/g2;", "overscrollConfig", "<init>", "(Landroid/content/Context;Landroidx/compose/foundation/g2;)V", "", "K", "()Z", "Landroidx/compose/ui/graphics/drawscope/f;", "Landroid/widget/EdgeEffect;", "left", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "canvas", "v", "(Landroidx/compose/ui/graphics/drawscope/f;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "top", "y", "right", "x", "bottom", "u", "Lkotlin/k2;", "C", "()V", "t", "Li0/f;", "delta", "H", "(J)Z", "scroll", "displacement", "", "G", "(JJ)F", "D", "E", "F", "Landroidx/compose/ui/input/nestedscroll/f;", "source", "Lkotlin/Function1;", "performScroll", "c", "(JILld/l;)J", "Landroidx/compose/ui/unit/c0;", "velocity", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "performFling", "d", "(JLld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "w", "(Landroidx/compose/ui/graphics/drawscope/f;)V", "a", "Landroidx/compose/foundation/g2;", "b", "Li0/f;", "pointerPosition", "Landroid/widget/EdgeEffect;", "topEffect", "bottomEffect", "e", "leftEffect", "f", "rightEffect", "", "g", "Ljava/util/List;", "allEffects", "h", "topEffectNegation", "i", "bottomEffectNegation", "j", "leftEffectNegation", "k", "rightEffectNegation", "", "l", "I", "consumeCount", "<set-?>", "m", "Landroidx/compose/runtime/i2;", "z", "()I", "(I)V", "invalidateCount", "n", "Z", "A", "J", "(Z)V", "B", "invalidationEnabled", "o", "scrollCycleInProgress", "Li0/n;", "p", "containerSize", "Landroidx/compose/ui/unit/u;", "q", "Lld/l;", "onNewSize", "Landroidx/compose/ui/input/pointer/a0;", "r", "Landroidx/compose/ui/input/pointer/a0;", "pointerId", "Landroidx/compose/ui/q;", "s", "Landroidx/compose/ui/q;", "()Landroidx/compose/ui/q;", "effectModifier", "isInProgress", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 4 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,595:1\n33#2,6:596\n101#2,2:606\n33#2,6:608\n103#2:614\n33#2,6:616\n135#3:602\n75#4:603\n108#4,2:604\n246#5:615\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n*L\n125#1:596,6\n270#1:606,2\n270#1:608,6\n270#1:614\n451#1:616,6\n345#1:602\n130#1:603\n130#1:604,2\n355#1:615\n*E\n"})
/* loaded from: classes.dex */
public final class d implements i2 {

    /* renamed from: t, reason: collision with root package name */
    public static final int f3569t = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final g2 overscrollConfig;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private i0.f pointerPosition;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final EdgeEffect topEffect;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final EdgeEffect bottomEffect;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final EdgeEffect leftEffect;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final EdgeEffect rightEffect;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<EdgeEffect> allEffects;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final EdgeEffect topEffectNegation;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final EdgeEffect bottomEffectNegation;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final EdgeEffect leftEffectNegation;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final EdgeEffect rightEffectNegation;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int consumeCount;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.i2 invalidateCount;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean invalidationEnabled;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean scrollCycleInProgress;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private long containerSize;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<androidx.compose.ui.unit.u, kotlin.k2> onNewSize;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.input.pointer.a0 pointerId;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.q effectModifier;

    /* compiled from: AndroidOverscroll.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", f = "AndroidOverscroll.android.kt", i = {1, 1}, l = {223, 248}, m = "applyToFling-BMRW4eQ", n = {"this", "remainingVelocity"}, s = {"L$0", "J$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f3589b;

        /* renamed from: c, reason: collision with root package name */
        long f3590c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f3591d;

        /* renamed from: f, reason: collision with root package name */
        int f3593f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f3591d = obj;
            this.f3593f |= Integer.MIN_VALUE;
            return d.this.d(0L, null, this);
        }
    }

    /* compiled from: AndroidOverscroll.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1", f = "AndroidOverscroll.android.kt", i = {}, l = {320}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/k0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<androidx.compose.ui.input.pointer.k0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f3594b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f3595c;

        /* compiled from: AndroidOverscroll.android.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1", f = "AndroidOverscroll.android.kt", i = {0, 1}, l = {321, 325}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture"}, s = {"L$0", "L$0"})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect$effectModifier$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,595:1\n235#2,3:596\n33#2,4:599\n238#2,2:603\n38#2:605\n240#2:606\n116#2,2:607\n33#2,6:609\n118#2:615\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect$effectModifier$1$1\n*L\n325#1:596,3\n325#1:599,4\n325#1:603,2\n325#1:605\n325#1:606\n329#1:607,2\n329#1:609,6\n329#1:615\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.k implements ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: c, reason: collision with root package name */
            int f3597c;

            /* renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f3598d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ d f3599e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, kotlin.coroutines.d<? super a> dVar2) {
                super(2, dVar2);
                this.f3599e = dVar;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l androidx.compose.ui.input.pointer.c cVar, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f3599e, dVar);
                aVar.f3598d = obj;
                return aVar;
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0097  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00b5  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0064 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00de  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00b0 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:8:0x007c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0062 -> B:6:0x0065). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r13) {
                /*
                    r12 = this;
                    kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r1 = r12.f3597c
                    r2 = 2
                    r3 = 0
                    r4 = 1
                    if (r1 == 0) goto L25
                    if (r1 == r4) goto L1d
                    if (r1 != r2) goto L15
                    java.lang.Object r1 = r12.f3598d
                    androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                    kotlin.a1.n(r13)
                    goto L65
                L15:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L1d:
                    java.lang.Object r1 = r12.f3598d
                    androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                    kotlin.a1.n(r13)
                    goto L3e
                L25:
                    kotlin.a1.n(r13)
                    java.lang.Object r13 = r12.f3598d
                    r1 = r13
                    androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                    r12.f3598d = r1
                    r12.f3597c = r4
                    r6 = 0
                    r7 = 0
                    r9 = 2
                    r10 = 0
                    r5 = r1
                    r8 = r12
                    java.lang.Object r13 = androidx.compose.foundation.gestures.z0.f(r5, r6, r7, r8, r9, r10)
                    if (r13 != r0) goto L3e
                    return r0
                L3e:
                    androidx.compose.ui.input.pointer.b0 r13 = (androidx.compose.ui.input.pointer.b0) r13
                    androidx.compose.foundation.d r5 = r12.f3599e
                    long r6 = r13.getId()
                    androidx.compose.ui.input.pointer.a0 r6 = androidx.compose.ui.input.pointer.a0.a(r6)
                    androidx.compose.foundation.d.r(r5, r6)
                    androidx.compose.foundation.d r5 = r12.f3599e
                    long r6 = r13.getPosition()
                    i0.f r13 = i0.f.d(r6)
                    androidx.compose.foundation.d.s(r5, r13)
                L5a:
                    r12.f3598d = r1
                    r12.f3597c = r2
                    java.lang.Object r13 = androidx.compose.ui.input.pointer.c.a1(r1, r3, r12, r4, r3)
                    if (r13 != r0) goto L65
                    return r0
                L65:
                    androidx.compose.ui.input.pointer.p r13 = (androidx.compose.ui.input.pointer.p) r13
                    java.util.List r13 = r13.e()
                    java.util.ArrayList r5 = new java.util.ArrayList
                    int r6 = r13.size()
                    r5.<init>(r6)
                    int r6 = r13.size()
                    r7 = 0
                    r8 = r7
                L7a:
                    if (r8 >= r6) goto L8f
                    java.lang.Object r9 = r13.get(r8)
                    r10 = r9
                    androidx.compose.ui.input.pointer.b0 r10 = (androidx.compose.ui.input.pointer.b0) r10
                    boolean r10 = r10.getPressed()
                    if (r10 == 0) goto L8c
                    r5.add(r9)
                L8c:
                    int r8 = r8 + 1
                    goto L7a
                L8f:
                    androidx.compose.foundation.d r13 = r12.f3599e
                    int r6 = r5.size()
                L95:
                    if (r7 >= r6) goto Lb0
                    java.lang.Object r8 = r5.get(r7)
                    r9 = r8
                    androidx.compose.ui.input.pointer.b0 r9 = (androidx.compose.ui.input.pointer.b0) r9
                    long r9 = r9.getId()
                    androidx.compose.ui.input.pointer.a0 r11 = androidx.compose.foundation.d.k(r13)
                    boolean r9 = androidx.compose.ui.input.pointer.a0.c(r9, r11)
                    if (r9 == 0) goto Lad
                    goto Lb1
                Lad:
                    int r7 = r7 + 1
                    goto L95
                Lb0:
                    r8 = r3
                Lb1:
                    androidx.compose.ui.input.pointer.b0 r8 = (androidx.compose.ui.input.pointer.b0) r8
                    if (r8 != 0) goto Lbc
                    java.lang.Object r13 = kotlin.collections.w.G2(r5)
                    r8 = r13
                    androidx.compose.ui.input.pointer.b0 r8 = (androidx.compose.ui.input.pointer.b0) r8
                Lbc:
                    if (r8 == 0) goto Ld8
                    androidx.compose.foundation.d r13 = r12.f3599e
                    long r6 = r8.getId()
                    androidx.compose.ui.input.pointer.a0 r6 = androidx.compose.ui.input.pointer.a0.a(r6)
                    androidx.compose.foundation.d.r(r13, r6)
                    androidx.compose.foundation.d r13 = r12.f3599e
                    long r6 = r8.getPosition()
                    i0.f r6 = i0.f.d(r6)
                    androidx.compose.foundation.d.s(r13, r6)
                Ld8:
                    boolean r13 = r5.isEmpty()
                    if (r13 == 0) goto L5a
                    androidx.compose.foundation.d r13 = r12.f3599e
                    androidx.compose.foundation.d.r(r13, r3)
                    kotlin.k2 r13 = kotlin.k2.f75408a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.d.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((b) create(k0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            b bVar = d.this.new b(dVar);
            bVar.f3595c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f3594b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.compose.ui.input.pointer.k0 k0Var = (androidx.compose.ui.input.pointer.k0) this.f3595c;
                a aVar2 = new a(d.this, null);
                this.f3594b = 1;
                if (androidx.compose.foundation.gestures.f0.d(k0Var, aVar2, this) == aVar) {
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

    /* compiled from: AndroidOverscroll.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/unit/u;", "size", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.unit.u, kotlin.k2> {
        c() {
            super(1);
        }

        public final void a(long j4) {
            boolean k4 = i0.n.k(androidx.compose.ui.unit.v.f(j4), d.this.containerSize);
            d.this.containerSize = androidx.compose.ui.unit.v.f(j4);
            if (!k4) {
                int i4 = (int) (4294967295L & j4);
                d.this.topEffect.setSize(androidx.compose.ui.unit.u.m(j4), i4);
                int i5 = (int) (j4 >> 32);
                d.this.bottomEffect.setSize(i5, i4);
                d.this.leftEffect.setSize(i4, i5);
                d.this.rightEffect.setSize(i4, i5);
                d.this.topEffectNegation.setSize(i5, i4);
                d.this.bottomEffectNegation.setSize(i5, i4);
                d.this.leftEffectNegation.setSize(i4, i5);
                d.this.rightEffectNegation.setSize(i4, i5);
            }
            if (k4) {
                return;
            }
            d.this.C();
            d.this.t();
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.unit.u uVar) {
            a(uVar.getPackedValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n*L\n1#1,170:1\n346#2,3:171\n*E\n"})
    /* renamed from: androidx.compose.foundation.d$d, reason: collision with other inner class name */
    public static final class C0053d extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {
        public C0053d() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("overscroll");
            a2Var.e(d.this);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    public d(@fg.l Context context, @fg.l g2 g2Var) {
        androidx.compose.ui.q qVar;
        this.overscrollConfig = g2Var;
        u0 u0Var = u0.f9093a;
        EdgeEffect a5 = u0Var.a(context, null);
        this.topEffect = a5;
        EdgeEffect a6 = u0Var.a(context, null);
        this.bottomEffect = a6;
        EdgeEffect a7 = u0Var.a(context, null);
        this.leftEffect = a7;
        EdgeEffect a8 = u0Var.a(context, null);
        this.rightEffect = a8;
        List<EdgeEffect> O = kotlin.collections.w.O(a7, a5, a8, a6);
        this.allEffects = O;
        this.topEffectNegation = u0Var.a(context, null);
        this.bottomEffectNegation = u0Var.a(context, null);
        this.leftEffectNegation = u0Var.a(context, null);
        this.rightEffectNegation = u0Var.a(context, null);
        int size = O.size();
        for (int i4 = 0; i4 < size; i4++) {
            O.get(i4).setColor(androidx.compose.ui.graphics.f2.r(this.overscrollConfig.getGlowColor()));
        }
        this.consumeCount = -1;
        this.invalidateCount = androidx.compose.runtime.b.c(0);
        this.invalidationEnabled = true;
        i0.n.INSTANCE.getClass();
        this.containerSize = i0.n.f74171c;
        c cVar = new c();
        this.onNewSize = cVar;
        q.Companion companion = androidx.compose.ui.q.INSTANCE;
        qVar = l.f4760a;
        companion.getClass();
        this.effectModifier = androidx.compose.ui.layout.c1.a(androidx.compose.ui.input.pointer.u0.e(qVar, kotlin.k2.f75408a, new b(null)), cVar).w3(new t0(this, androidx.compose.ui.platform.y1.e() ? new C0053d() : androidx.compose.ui.platform.y1.b()));
    }

    @androidx.annotation.m1
    public static /* synthetic */ void B() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        if (this.invalidationEnabled && this.consumeCount == this.invalidateCount.f()) {
            I(this.invalidateCount.f() + 1);
        }
    }

    private final float D(long scroll, long displacement) {
        float p4 = i0.f.p(displacement) / i0.n.t(this.containerSize);
        float r4 = i0.f.r(scroll) / i0.n.m(this.containerSize);
        u0 u0Var = u0.f9093a;
        return u0Var.b(this.bottomEffect) == 0.0f ? i0.n.m(this.containerSize) * (-u0Var.d(this.bottomEffect, -r4, 1 - p4)) : i0.f.r(scroll);
    }

    private final float E(long scroll, long displacement) {
        float r4 = i0.f.r(displacement) / i0.n.m(this.containerSize);
        float p4 = i0.f.p(scroll) / i0.n.t(this.containerSize);
        u0 u0Var = u0.f9093a;
        return u0Var.b(this.leftEffect) == 0.0f ? i0.n.t(this.containerSize) * u0Var.d(this.leftEffect, p4, 1 - r4) : i0.f.p(scroll);
    }

    private final float F(long scroll, long displacement) {
        float r4 = i0.f.r(displacement) / i0.n.m(this.containerSize);
        float p4 = i0.f.p(scroll) / i0.n.t(this.containerSize);
        u0 u0Var = u0.f9093a;
        return u0Var.b(this.rightEffect) == 0.0f ? i0.n.t(this.containerSize) * (-u0Var.d(this.rightEffect, -p4, r4)) : i0.f.p(scroll);
    }

    private final float G(long scroll, long displacement) {
        float p4 = i0.f.p(displacement) / i0.n.t(this.containerSize);
        float r4 = i0.f.r(scroll) / i0.n.m(this.containerSize);
        u0 u0Var = u0.f9093a;
        return u0Var.b(this.topEffect) == 0.0f ? i0.n.m(this.containerSize) * u0Var.d(this.topEffect, r4, p4) : i0.f.r(scroll);
    }

    private final boolean H(long delta) {
        boolean z4;
        if (this.leftEffect.isFinished() || i0.f.p(delta) >= 0.0f) {
            z4 = false;
        } else {
            u0.f9093a.e(this.leftEffect, i0.f.p(delta));
            z4 = this.leftEffect.isFinished();
        }
        if (!this.rightEffect.isFinished() && i0.f.p(delta) > 0.0f) {
            u0.f9093a.e(this.rightEffect, i0.f.p(delta));
            z4 = z4 || this.rightEffect.isFinished();
        }
        if (!this.topEffect.isFinished() && i0.f.r(delta) < 0.0f) {
            u0.f9093a.e(this.topEffect, i0.f.r(delta));
            z4 = z4 || this.topEffect.isFinished();
        }
        if (this.bottomEffect.isFinished() || i0.f.r(delta) <= 0.0f) {
            return z4;
        }
        u0.f9093a.e(this.bottomEffect, i0.f.r(delta));
        return z4 || this.bottomEffect.isFinished();
    }

    private final void I(int i4) {
        this.invalidateCount.k(i4);
    }

    private final boolean K() {
        boolean z4;
        long b5 = i0.o.b(this.containerSize);
        u0 u0Var = u0.f9093a;
        if (u0Var.b(this.leftEffect) == 0.0f) {
            z4 = false;
        } else {
            i0.f.INSTANCE.getClass();
            E(i0.f.f74147c, b5);
            z4 = true;
        }
        if (u0Var.b(this.rightEffect) != 0.0f) {
            i0.f.INSTANCE.getClass();
            F(i0.f.f74147c, b5);
            z4 = true;
        }
        if (u0Var.b(this.topEffect) != 0.0f) {
            i0.f.INSTANCE.getClass();
            G(i0.f.f74147c, b5);
            z4 = true;
        }
        if (u0Var.b(this.bottomEffect) == 0.0f) {
            return z4;
        }
        i0.f.INSTANCE.getClass();
        D(i0.f.f74147c, b5);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        List<EdgeEffect> list = this.allEffects;
        int size = list.size();
        boolean z4 = false;
        for (int i4 = 0; i4 < size; i4++) {
            EdgeEffect edgeEffect = list.get(i4);
            edgeEffect.onRelease();
            z4 = edgeEffect.isFinished() || z4;
        }
        if (z4) {
            C();
        }
    }

    private final boolean u(androidx.compose.ui.graphics.drawscope.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-i0.n.t(this.containerSize), (-i0.n.m(this.containerSize)) + fVar.v5(this.overscrollConfig.getDrawPadding().getBottom()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean v(androidx.compose.ui.graphics.drawscope.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-i0.n.m(this.containerSize), fVar.v5(this.overscrollConfig.getDrawPadding().b(fVar.getLayoutDirection())));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean x(androidx.compose.ui.graphics.drawscope.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        int L0 = kotlin.math.b.L0(i0.n.t(this.containerSize));
        float c5 = this.overscrollConfig.getDrawPadding().c(fVar.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, fVar.v5(c5) + (-L0));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean y(androidx.compose.ui.graphics.drawscope.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.translate(0.0f, fVar.v5(this.overscrollConfig.getDrawPadding().getTop()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final int z() {
        return this.invalidateCount.f();
    }

    /* renamed from: A, reason: from getter */
    public final boolean getInvalidationEnabled() {
        return this.invalidationEnabled;
    }

    public final void J(boolean z4) {
        this.invalidationEnabled = z4;
    }

    @Override // androidx.compose.foundation.i2
    public boolean a() {
        List<EdgeEffect> list = this.allEffects;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!(u0.f9093a.b(list.get(i4)) == 0.0f)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.foundation.i2
    @fg.l
    /* renamed from: b, reason: from getter */
    public androidx.compose.ui.q getEffectModifier() {
        return this.effectModifier;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0140 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0131  */
    @Override // androidx.compose.foundation.i2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long c(long r18, int r20, @fg.l ld.l<? super i0.f, i0.f> r21) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.d.c(long, int, ld.l):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0123 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.foundation.i2
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(long r11, @fg.l ld.p<? super androidx.compose.ui.unit.c0, ? super kotlin.coroutines.d<? super androidx.compose.ui.unit.c0>, ? extends java.lang.Object> r13, @fg.l kotlin.coroutines.d<? super kotlin.k2> r14) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.d.d(long, ld.p, kotlin.coroutines.d):java.lang.Object");
    }

    public final void w(@fg.l androidx.compose.ui.graphics.drawscope.f fVar) {
        boolean z4;
        if (i0.n.v(this.containerSize)) {
            return;
        }
        androidx.compose.ui.graphics.v1 i4 = fVar.getDrawContext().i();
        this.consumeCount = this.invalidateCount.f();
        Canvas d5 = androidx.compose.ui.graphics.h0.d(i4);
        u0 u0Var = u0.f9093a;
        if (u0Var.b(this.leftEffectNegation) != 0.0f) {
            x(fVar, this.leftEffectNegation, d5);
            this.leftEffectNegation.finish();
        }
        if (this.leftEffect.isFinished()) {
            z4 = false;
        } else {
            z4 = v(fVar, this.leftEffect, d5);
            u0Var.d(this.leftEffectNegation, u0Var.b(this.leftEffect), 0.0f);
        }
        if (u0Var.b(this.topEffectNegation) != 0.0f) {
            u(fVar, this.topEffectNegation, d5);
            this.topEffectNegation.finish();
        }
        if (!this.topEffect.isFinished()) {
            z4 = y(fVar, this.topEffect, d5) || z4;
            u0Var.d(this.topEffectNegation, u0Var.b(this.topEffect), 0.0f);
        }
        if (u0Var.b(this.rightEffectNegation) != 0.0f) {
            v(fVar, this.rightEffectNegation, d5);
            this.rightEffectNegation.finish();
        }
        if (!this.rightEffect.isFinished()) {
            z4 = x(fVar, this.rightEffect, d5) || z4;
            u0Var.d(this.rightEffectNegation, u0Var.b(this.rightEffect), 0.0f);
        }
        if (u0Var.b(this.bottomEffectNegation) != 0.0f) {
            y(fVar, this.bottomEffectNegation, d5);
            this.bottomEffectNegation.finish();
        }
        if (!this.bottomEffect.isFinished()) {
            boolean z5 = u(fVar, this.bottomEffect, d5) || z4;
            u0Var.d(this.bottomEffectNegation, u0Var.b(this.bottomEffect), 0.0f);
            z4 = z5;
        }
        if (z4) {
            C();
        }
    }
}
