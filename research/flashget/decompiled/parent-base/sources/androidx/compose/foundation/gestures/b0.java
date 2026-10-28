package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.t;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.o4;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: Draggable.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001aË\u0001\u0010\u001f\u001a\u00020\t*\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\r2>\b\u0002\u0010\u001b\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0012¢\u0006\u0002\b\u001a2>\b\u0002\u0010\u001d\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0012¢\u0006\u0002\b\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010 \u001aT\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0014\u0018\u00010)*\u00020!2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r0\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0$2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0082@¢\u0006\u0004\b*\u0010+\u001aY\u00102\u001a\u00020\r*\u00020!2\u0006\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020\u00142\u0006\u0010&\u001a\u00020%2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u0010\u001e\u001a\u00020\r2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r0\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001aG\u00107\u001a\u00020\r*\u00020!2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r0\u00002\u0006\u00105\u001a\u0002042\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00020\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b7\u00108\u001a\u001e\u00109\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\f\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a\u001e\u0010<\u001a\u00020\u0001*\u00020;2\u0006\u0010\f\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b<\u0010:\"\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010>\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006@"}, d2 = {"Lkotlin/Function1;", "", "Lkotlin/k2;", "onDelta", "Landroidx/compose/foundation/gestures/d0;", "a", "(Lld/l;)Landroidx/compose/foundation/gestures/d0;", "m", "(Lld/l;Landroidx/compose/runtime/t;I)Landroidx/compose/foundation/gestures/d0;", "Landroidx/compose/ui/q;", "state", "Landroidx/compose/foundation/gestures/j0;", "orientation", "", "enabled", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lkotlinx/coroutines/r0;", "Li0/f;", "Lkotlin/r0;", "name", "startedPosition", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "onDragStarted", "velocity", "onDragStopped", "reverseDirection", "j", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/gestures/d0;Landroidx/compose/foundation/gestures/j0;ZLandroidx/compose/foundation/interaction/k;ZLld/q;Lld/q;Z)Landroidx/compose/ui/q;", "Landroidx/compose/ui/input/pointer/c;", "Landroidx/compose/ui/input/pointer/b0;", "canDrag", "Lkotlin/Function0;", "Lm0/d;", "velocityTracker", "Landroidx/compose/foundation/gestures/k0;", "pointerDirectionConfig", "Lkotlin/q0;", "h", "(Landroidx/compose/ui/input/pointer/c;Lld/l;Lld/a;Lm0/d;Landroidx/compose/foundation/gestures/k0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "startEvent", "initialDelta", "Lkotlinx/coroutines/channels/e0;", "Landroidx/compose/foundation/gestures/t;", "channel", "hasDragged", "i", "(Landroidx/compose/ui/input/pointer/c;Landroidx/compose/ui/input/pointer/b0;JLm0/d;Lkotlinx/coroutines/channels/e0;ZLld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/a0;", "pointerId", "onDrag", "l", "(Landroidx/compose/ui/input/pointer/c;Lld/l;JLld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "n", "(JLandroidx/compose/foundation/gestures/j0;)F", "Landroidx/compose/ui/unit/c0;", "o", "Landroidx/compose/foundation/gestures/v;", "Landroidx/compose/foundation/gestures/v;", "NoOpDragScope", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,680:1\n25#2:681\n1116#3,6:682\n659#4,10:688\n669#4,4:707\n673#4,38:718\n579#4,6:756\n613#4,4:762\n617#4,2:775\n619#4,8:784\n586#4,10:792\n116#5,2:698\n33#5,6:700\n118#5:706\n33#5,6:711\n118#5:717\n116#5,2:766\n33#5,6:768\n118#5:774\n33#5,6:777\n118#5:783\n*S KotlinDebug\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n*L\n144#1:681\n144#1:682,6\n593#1:688,10\n593#1:707,4\n593#1:718,38\n640#1:756,6\n640#1:762,4\n640#1:775,2\n640#1:784,8\n640#1:792,10\n593#1:698,2\n593#1:700,6\n593#1:706\n593#1:711,6\n593#1:717\n640#1:766,2\n640#1:768,6\n640#1:774\n640#1:777,6\n640#1:783\n*E\n"})
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final v f3823a = new a();

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/foundation/gestures/b0$a", "Landroidx/compose/foundation/gestures/v;", "", "pixels", "Lkotlin/k2;", "c", "(F)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements v {
        a() {
        }

        @Override // androidx.compose.foundation.gestures.v
        public void c(float pixels) {
        }
    }

    /* compiled from: Draggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableKt", f = "Draggable.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3}, l = {575, 584, 689, 731}, m = "awaitDownAndSlop", n = {"$this$awaitDownAndSlop", "canDrag", "startDragImmediately", "velocityTracker", "pointerDirectionConfig", "$this$awaitDownAndSlop", "velocityTracker", "pointerDirectionConfig", "pointerDirectionConfig", "initialDelta", "postPointerSlop", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlop$iv", "totalPositionChange$iv", "pointerDirectionConfig", "initialDelta", "postPointerSlop", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "dragEvent$iv", "touchSlop$iv", "totalPositionChange$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "F$0", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "F$0", "J$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f3824b;

        /* renamed from: c, reason: collision with root package name */
        Object f3825c;

        /* renamed from: d, reason: collision with root package name */
        Object f3826d;

        /* renamed from: e, reason: collision with root package name */
        Object f3827e;

        /* renamed from: f, reason: collision with root package name */
        Object f3828f;

        /* renamed from: g, reason: collision with root package name */
        Object f3829g;

        /* renamed from: h, reason: collision with root package name */
        float f3830h;

        /* renamed from: i, reason: collision with root package name */
        long f3831i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f3832j;

        /* renamed from: k, reason: collision with root package name */
        int f3833k;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f3832j = obj;
            this.f3833k |= Integer.MIN_VALUE;
            return b0.h(null, null, null, null, null, this);
        }
    }

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/b0;", "event", "Li0/f;", "offset", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/input/pointer/b0;J)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.input.pointer.b0, i0.f, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0.d f3834b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k1.g f3835c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(m0.d dVar, k1.g gVar) {
            super(2);
            this.f3834b = dVar;
            this.f3835c = gVar;
        }

        public final void a(@fg.l androidx.compose.ui.input.pointer.b0 b0Var, long j4) {
            m0.e.d(this.f3834b, b0Var);
            b0Var.a();
            this.f3835c.f75328b = j4;
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.input.pointer.b0 b0Var, i0.f fVar) {
            a(b0Var, fVar.getPackedValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/b0;", "event", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/input/pointer/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.input.pointer.b0, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0.d f3836b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.e0<t> f3837c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f3838d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(m0.d dVar, kotlinx.coroutines.channels.e0<? super t> e0Var, boolean z4) {
            super(1);
            this.f3836b = dVar;
            this.f3837c = e0Var;
            this.f3838d = z4;
        }

        public final void a(@fg.l androidx.compose.ui.input.pointer.b0 b0Var) {
            m0.e.d(this.f3836b, b0Var);
            if (androidx.compose.ui.input.pointer.q.e(b0Var)) {
                return;
            }
            long k4 = androidx.compose.ui.input.pointer.q.k(b0Var);
            b0Var.a();
            kotlinx.coroutines.channels.e0<t> e0Var = this.f3837c;
            if (this.f3838d) {
                k4 = i0.f.x(k4, -1.0f);
            }
            e0Var.M(new t.b(k4, null));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.input.pointer.b0 b0Var) {
            a(b0Var);
            return k2.f75408a;
        }
    }

    /* compiled from: Draggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$1", f = "Draggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/r0;", "Li0/f;", "it", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;Li0/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.r0, i0.f, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f3839b;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(3, dVar);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Object R(kotlinx.coroutines.r0 r0Var, i0.f fVar, kotlin.coroutines.d<? super k2> dVar) {
            return a(r0Var, fVar.getPackedValue(), dVar);
        }

        @fg.m
        public final Object a(@fg.l kotlinx.coroutines.r0 r0Var, long j4, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return new e(3, dVar).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f3839b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            return k2.f75408a;
        }
    }

    /* compiled from: Draggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$2", f = "Draggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/r0;", "", "it", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;F)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.r0, Float, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f3840b;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(3, dVar);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Object R(kotlinx.coroutines.r0 r0Var, Float f4, kotlin.coroutines.d<? super k2> dVar) {
            return a(r0Var, f4.floatValue(), dVar);
        }

        @fg.m
        public final Object a(@fg.l kotlinx.coroutines.r0 r0Var, float f4, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return new f(3, dVar).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f3840b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            return k2.f75408a;
        }
    }

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/b0;", "it", "", "a", "(Landroidx/compose/ui/input/pointer/b0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.input.pointer.b0, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f3841b = new g(1);

        g() {
            super(1);
        }

        @fg.l
        public final Boolean a(@fg.l androidx.compose.ui.input.pointer.b0 b0Var) {
            return Boolean.TRUE;
        }

        @Override // ld.l
        public Boolean invoke(androidx.compose.ui.input.pointer.b0 b0Var) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f3842b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z4) {
            super(0);
            this.f3842b = z4;
        }

        @fg.l
        public final Boolean a() {
            return Boolean.valueOf(this.f3842b);
        }

        @Override // ld.a
        public Boolean invoke() {
            return Boolean.valueOf(this.f3842b);
        }
    }

    /* compiled from: Draggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$5", f = "Draggable.kt", i = {}, l = {203}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/r0;", "Landroidx/compose/ui/unit/c0;", "velocity", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;Landroidx/compose/ui/unit/c0;)V"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.r0, androidx.compose.ui.unit.c0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f3843b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f3844c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ long f3845d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.q<kotlinx.coroutines.r0, Float, kotlin.coroutines.d<? super k2>, Object> f3846e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ j0 f3847f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(ld.q<? super kotlinx.coroutines.r0, ? super Float, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, j0 j0Var, kotlin.coroutines.d<? super i> dVar) {
            super(3, dVar);
            this.f3846e = qVar;
            this.f3847f = j0Var;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Object R(kotlinx.coroutines.r0 r0Var, androidx.compose.ui.unit.c0 c0Var, kotlin.coroutines.d<? super k2> dVar) {
            return a(r0Var, c0Var.getPackedValue(), dVar);
        }

        @fg.m
        public final Object a(@fg.l kotlinx.coroutines.r0 r0Var, long j4, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            i iVar = new i(this.f3846e, this.f3847f, dVar);
            iVar.f3844c = r0Var;
            iVar.f3845d = j4;
            return iVar.invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f3843b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f3844c;
                long j4 = this.f3845d;
                ld.q<kotlinx.coroutines.r0, Float, kotlin.coroutines.d<? super k2>, Object> qVar = this.f3846e;
                Float f4 = new Float(b0.o(j4, this.f3847f));
                this.f3843b = 1;
                if (qVar.R(r0Var, f4, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: Draggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableKt", f = "Draggable.kt", i = {0, 0, 0, 0, 0}, l = {689}, m = "onDragOrUp-Axegvzg", n = {"hasDragged", "onDrag", "$this$drag_u2dVnAYq1g$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f3848b;

        /* renamed from: c, reason: collision with root package name */
        Object f3849c;

        /* renamed from: d, reason: collision with root package name */
        Object f3850d;

        /* renamed from: e, reason: collision with root package name */
        Object f3851e;

        /* renamed from: f, reason: collision with root package name */
        Object f3852f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f3853g;

        /* renamed from: h, reason: collision with root package name */
        int f3854h;

        j(kotlin.coroutines.d<? super j> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f3853g = obj;
            this.f3854h |= Integer.MIN_VALUE;
            return b0.l(null, null, 0L, null, this);
        }
    }

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "a", "(F)V"}, k = 3, mv = {1, 8, 0})
    static final class k extends kotlin.jvm.internal.n0 implements ld.l<Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b5<ld.l<Float, k2>> f3855b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(b5<? extends ld.l<? super Float, k2>> b5Var) {
            super(1);
            this.f3855b = b5Var;
        }

        public final void a(float f4) {
            this.f3855b.getValue().invoke(Float.valueOf(f4));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Float f4) {
            a(f4.floatValue());
            return k2.f75408a;
        }
    }

    @fg.l
    public static final d0 a(@fg.l ld.l<? super Float, k2> lVar) {
        return new o(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0191 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0284 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0203 -> B:17:0x0179). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x024c -> B:13:0x0250). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0286 -> B:16:0x0259). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(androidx.compose.ui.input.pointer.c r20, ld.l<? super androidx.compose.ui.input.pointer.b0, java.lang.Boolean> r21, ld.a<java.lang.Boolean> r22, m0.d r23, androidx.compose.foundation.gestures.k0 r24, kotlin.coroutines.d<? super kotlin.q0<androidx.compose.ui.input.pointer.b0, i0.f>> r25) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b0.h(androidx.compose.ui.input.pointer.c, ld.l, ld.a, m0.d, androidx.compose.foundation.gestures.k0, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object i(androidx.compose.ui.input.pointer.c cVar, androidx.compose.ui.input.pointer.b0 b0Var, long j4, m0.d dVar, kotlinx.coroutines.channels.e0<? super t> e0Var, boolean z4, ld.l<? super androidx.compose.ui.input.pointer.b0, Boolean> lVar, kotlin.coroutines.d<? super Boolean> dVar2) {
        e0Var.M(new t.c(i0.f.u(b0Var.getPosition(), i0.g.a(i0.f.p(j4) * Math.signum(i0.f.p(b0Var.getPosition())), i0.f.r(j4) * Math.signum(i0.f.r(b0Var.getPosition())))), null));
        e0Var.M(new t.b(z4 ? i0.f.x(j4, -1.0f) : j4, null));
        return l(cVar, lVar, b0Var.getId(), new d(dVar, e0Var, z4), dVar2);
    }

    @fg.l
    public static final androidx.compose.ui.q j(@fg.l androidx.compose.ui.q qVar, @fg.l d0 d0Var, @fg.l j0 j0Var, boolean z4, @fg.m androidx.compose.foundation.interaction.k kVar, boolean z5, @fg.l ld.q<? super kotlinx.coroutines.r0, ? super i0.f, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar2, @fg.l ld.q<? super kotlinx.coroutines.r0, ? super Float, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar3, boolean z6) {
        return qVar.w3(new DraggableElement(d0Var, g.f3841b, j0Var, z4, kVar, new h(z5), qVar2, new i(qVar3, j0Var, null), z6));
    }

    public static androidx.compose.ui.q k(androidx.compose.ui.q qVar, d0 d0Var, j0 j0Var, boolean z4, androidx.compose.foundation.interaction.k kVar, boolean z5, ld.q qVar2, ld.q qVar3, boolean z6, int i4, Object obj) {
        return j(qVar, d0Var, j0Var, (i4 & 4) != 0 ? true : z4, (i4 & 8) != 0 ? null : kVar, (i4 & 16) != 0 ? false : z5, (i4 & 32) != 0 ? new e(3, null) : qVar2, (i4 & 64) != 0 ? new f(3, null) : qVar3, (i4 & 128) != 0 ? false : z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f4, code lost:
    
        if (r1.invoke(r14).booleanValue() != false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0083 -> B:10:0x0088). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(androidx.compose.ui.input.pointer.c r17, ld.l<? super androidx.compose.ui.input.pointer.b0, java.lang.Boolean> r18, long r19, ld.l<? super androidx.compose.ui.input.pointer.b0, kotlin.k2> r21, kotlin.coroutines.d<? super java.lang.Boolean> r22) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b0.l(androidx.compose.ui.input.pointer.c, ld.l, long, ld.l, kotlin.coroutines.d):java.lang.Object");
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final d0 m(@fg.l ld.l<? super Float, k2> lVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-183245213);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-183245213, i4, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:141)");
        }
        b5 u4 = o4.u(lVar, tVar, i4 & 14);
        tVar.P(-492369756);
        Object Q = tVar.Q();
        if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
            o oVar = new o(new k(u4));
            tVar.E(oVar);
            Q = oVar;
        }
        tVar.p0();
        d0 d0Var = (d0) Q;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return d0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float n(long j4, j0 j0Var) {
        return j0Var == j0.Vertical ? i0.f.r(j4) : i0.f.p(j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float o(long j4, j0 j0Var) {
        return j0Var == j0.Vertical ? androidx.compose.ui.unit.c0.n(j4) : androidx.compose.ui.unit.c0.l(j4);
    }
}
