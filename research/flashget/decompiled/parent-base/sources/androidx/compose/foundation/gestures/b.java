package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.t;
import androidx.compose.foundation.interaction.a;
import androidx.compose.ui.node.u1;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: Draggable.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B¿\u0001\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b\u0012<\u0010\u0017\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00150\r¢\u0006\u0002\b\u0016\u0012<\u0010\u001a\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00150\r¢\u0006\u0002\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001c\u0010\"\u001a\u00020\u0014*\u00020\u000e2\u0006\u0010!\u001a\u00020 H\u0082@¢\u0006\u0004\b\"\u0010#J\u001c\u0010%\u001a\u00020\u0014*\u00020\u000e2\u0006\u0010!\u001a\u00020$H\u0082@¢\u0006\u0004\b%\u0010&J\u0014\u0010'\u001a\u00020\u0014*\u00020\u000eH\u0082@¢\u0006\u0004\b'\u0010(J9\u0010,\u001a\u00020\u00142'\u0010+\u001a#\b\u0001\u0012\u0004\u0012\u00020*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00150)¢\u0006\u0002\b\u0016H¦@¢\u0006\u0004\b,\u0010-J\u001c\u00100\u001a\u00020\u0014*\u00020*2\u0006\u0010/\u001a\u00020.H¦@¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0014H\u0016¢\u0006\u0004\b2\u0010\u001fJ*\u00109\u001a\u00020\u00142\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0016ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0014H\u0016¢\u0006\u0004\b;\u0010\u001fJ\r\u0010<\u001a\u00020\u0014¢\u0006\u0004\b<\u0010\u001fR.\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TRX\u0010\u0017\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00150\r¢\u0006\u0002\b\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZRX\u0010\u001a\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00150\r¢\u0006\u0002\b\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010V\u001a\u0004\b\\\u0010X\"\u0004\b]\u0010ZR\"\u0010\u001b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010D\u001a\u0004\b_\u0010F\"\u0004\b`\u0010HR \u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010>R\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010PR\u0014\u0010h\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010j\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010DR\u0017\u0010p\u001a\u00020k8\u0006¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u001a\u0010u\u001a\b\u0012\u0004\u0012\u00020r0q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010y\u001a\u0004\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010}\u001a\u00020z8&X¦\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006~"}, d2 = {"Landroidx/compose/foundation/gestures/b;", "Landroidx/compose/ui/node/l;", "Landroidx/compose/ui/node/u1;", "Landroidx/compose/ui/node/h;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/b0;", "", "canDrag", "enabled", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "Lkotlin/Function0;", "startDragImmediately", "Lkotlin/Function3;", "Lkotlinx/coroutines/r0;", "Li0/f;", "Lkotlin/r0;", "name", "startedPosition", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "onDragStarted", "Landroidx/compose/ui/unit/c0;", "velocity", "onDragStopped", "reverseDirection", "<init>", "(Lld/l;ZLandroidx/compose/foundation/interaction/k;Lld/a;Lld/q;Lld/q;Z)V", "o8", "()V", "Landroidx/compose/foundation/gestures/t$c;", "event", "f8", "(Lkotlinx/coroutines/r0;Landroidx/compose/foundation/gestures/t$c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/t$d;", "g8", "(Lkotlinx/coroutines/r0;Landroidx/compose/foundation/gestures/t$d;Lkotlin/coroutines/d;)Ljava/lang/Object;", "e8", "(Lkotlinx/coroutines/r0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/a;", "block", "T7", "(Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/t$b;", "dragDelta", "U7", "(Landroidx/compose/foundation/gestures/a;Landroidx/compose/foundation/gestures/t$b;Lkotlin/coroutines/d;)Ljava/lang/Object;", "j7", "Landroidx/compose/ui/input/pointer/p;", "pointerEvent", "Landroidx/compose/ui/input/pointer/r;", "pass", "Landroidx/compose/ui/unit/u;", "bounds", "g1", "(Landroidx/compose/ui/input/pointer/p;Landroidx/compose/ui/input/pointer/r;J)V", "E4", "S7", "s", "Lld/l;", "V7", "()Lld/l;", "h8", "(Lld/l;)V", "t", "Z", "W7", "()Z", "i8", "(Z)V", "u", "Landroidx/compose/foundation/interaction/k;", "X7", "()Landroidx/compose/foundation/interaction/k;", "j8", "(Landroidx/compose/foundation/interaction/k;)V", "v", "Lld/a;", "d8", "()Lld/a;", "n8", "(Lld/a;)V", "w", "Lld/q;", "Y7", "()Lld/q;", "k8", "(Lld/q;)V", "x", "Z7", "l8", "y", "c8", "m8", "z", "_canDrag", "A", "_startDragImmediately", "Lm0/d;", "B", "Lm0/d;", "velocityTracker", "C", "isListeningForEvents", "Landroidx/compose/ui/input/pointer/v0;", "D", "Landroidx/compose/ui/input/pointer/v0;", "b8", "()Landroidx/compose/ui/input/pointer/v0;", "pointerInputNode", "Lkotlinx/coroutines/channels/l;", "Landroidx/compose/foundation/gestures/t;", "E", "Lkotlinx/coroutines/channels/l;", "channel", "Landroidx/compose/foundation/interaction/a$b;", "F", "Landroidx/compose/foundation/interaction/a$b;", "dragInteraction", "Landroidx/compose/foundation/gestures/k0;", "a8", "()Landroidx/compose/foundation/gestures/k0;", "pointerDirectionConfig", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class b extends androidx.compose.ui.node.l implements u1, androidx.compose.ui.node.h {
    public static final int G = 8;

    /* renamed from: C, reason: from kotlin metadata */
    private boolean isListeningForEvents;

    /* renamed from: F, reason: from kotlin metadata */
    @fg.m
    private a.b dragInteraction;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super androidx.compose.ui.input.pointer.b0, Boolean> canDrag;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.foundation.interaction.k interactionSource;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.a<Boolean> startDragImmediately;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.q<? super kotlinx.coroutines.r0, ? super i0.f, ? super kotlin.coroutines.d<? super k2>, ? extends Object> onDragStarted;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.q<? super kotlinx.coroutines.r0, ? super androidx.compose.ui.unit.c0, ? super kotlin.coroutines.d<? super k2>, ? extends Object> onDragStopped;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean reverseDirection;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<androidx.compose.ui.input.pointer.b0, Boolean> _canDrag = new a();

    /* renamed from: A, reason: from kotlin metadata */
    @fg.l
    private final ld.a<Boolean> _startDragImmediately = new C0055b();

    /* renamed from: B, reason: from kotlin metadata */
    @fg.l
    private final m0.d velocityTracker = new m0.d();

    /* renamed from: D, reason: from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.input.pointer.v0 pointerInputNode = (androidx.compose.ui.input.pointer.v0) y7(androidx.compose.ui.input.pointer.u0.a(new c(null)));

    /* renamed from: E, reason: from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.channels.l<t> channel = kotlinx.coroutines.channels.o.d(Integer.MAX_VALUE, null, null, 6, null);

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/b0;", "it", "", "a", "(Landroidx/compose/ui/input/pointer/b0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.input.pointer.b0, Boolean> {
        a() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l androidx.compose.ui.input.pointer.b0 b0Var) {
            return b.this.V7().invoke(b0Var);
        }
    }

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.gestures.b$b, reason: collision with other inner class name */
    static final class C0055b extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {
        C0055b() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return b.this.d8().invoke();
        }
    }

    /* compiled from: Draggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1", f = "Draggable.kt", i = {}, l = {456}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/k0;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<androidx.compose.ui.input.pointer.k0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f3780b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f3781c;

        /* compiled from: Draggable.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1", f = "Draggable.kt", i = {0}, l = {458}, m = "invokeSuspend", n = {"$this$coroutineScope"}, s = {"L$0"})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f3783b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f3784c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.k0 f3785d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ b f3786e;

            /* compiled from: Draggable.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1$1", f = "Draggable.kt", i = {0, 1, 1}, l = {460, 475}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "isDragSuccessful"}, s = {"L$0", "L$0", "I$0"})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.gestures.b$c$a$a, reason: collision with other inner class name */
            static final class C0056a extends kotlin.coroutines.jvm.internal.k implements ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: c, reason: collision with root package name */
                Object f3787c;

                /* renamed from: d, reason: collision with root package name */
                Object f3788d;

                /* renamed from: e, reason: collision with root package name */
                int f3789e;

                /* renamed from: f, reason: collision with root package name */
                int f3790f;

                /* renamed from: g, reason: collision with root package name */
                private /* synthetic */ Object f3791g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.r0 f3792h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ b f3793i;

                /* compiled from: Draggable.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/b0;", "event", "", "a", "(Landroidx/compose/ui/input/pointer/b0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.foundation.gestures.b$c$a$a$a, reason: collision with other inner class name */
                static final class C0057a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.input.pointer.b0, Boolean> {

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ b f3794b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0057a(b bVar) {
                        super(1);
                        this.f3794b = bVar;
                    }

                    @Override // ld.l
                    @fg.l
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(@fg.l androidx.compose.ui.input.pointer.b0 b0Var) {
                        return Boolean.valueOf(!(this.f3794b.getPointerDirectionConfig().b(androidx.compose.ui.input.pointer.q.m(b0Var)) == 0.0f));
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0056a(kotlinx.coroutines.r0 r0Var, b bVar, kotlin.coroutines.d<? super C0056a> dVar) {
                    super(2, dVar);
                    this.f3792h = r0Var;
                    this.f3793i = bVar;
                }

                @Override // ld.p
                @fg.m
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@fg.l androidx.compose.ui.input.pointer.c cVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                    return ((C0056a) create(cVar, dVar)).invokeSuspend(k2.f75408a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    C0056a c0056a = new C0056a(this.f3792h, this.f3793i, dVar);
                    c0056a.f3791g = obj;
                    return c0056a;
                }

                /* JADX WARN: Can't wrap try/catch for region: R(8:27|(1:29)|30|31|32|33|34|(1:36)(10:38|9|10|11|(0)(0)|17|18|19|20|(2:67|68)(0))) */
                /* JADX WARN: Code restructure failed: missing block: B:40:0x0135, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:41:0x0136, code lost:
                
                    r4 = r16;
                    r2 = r19;
                    r3 = r20;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:58:0x0131, code lost:
                
                    r0 = th;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:59:0x0132, code lost:
                
                    r3 = r20;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:61:0x0142, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:62:0x0143, code lost:
                
                    r19 = r5;
                    r20 = r6;
                    r16 = r7;
                    r12 = r8;
                    r18 = r9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:63:0x013d, code lost:
                
                    r0 = th;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:64:0x013e, code lost:
                
                    r20 = r6;
                    r12 = r8;
                 */
                /* JADX WARN: Removed duplicated region for block: B:13:0x00fa  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x0153  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x016f A[Catch: all -> 0x0170, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0170, blocks: (B:43:0x014d, B:46:0x016f), top: B:42:0x014d }] */
                /* JADX WARN: Removed duplicated region for block: B:51:0x0181  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x01a7  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x01b1  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x01b7  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x0121  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00dd -> B:9:0x00e4). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0153 -> B:18:0x012a). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x01b1 -> B:20:0x0052). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r22) {
                    /*
                        Method dump skipped, instructions count: 442
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.c.a.C0056a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.input.pointer.k0 k0Var, b bVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f3785d = k0Var;
                this.f3786e = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f3785d, this.f3786e, dVar);
                aVar.f3784c = obj;
                return aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r8) {
                /*
                    r7 = this;
                    kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r1 = r7.f3783b
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r0 = r7.f3784c
                    kotlinx.coroutines.r0 r0 = (kotlinx.coroutines.r0) r0
                    kotlin.a1.n(r8)     // Catch: java.util.concurrent.CancellationException -> L11
                    goto L41
                L11:
                    r8 = move-exception
                    goto L3b
                L13:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1b:
                    kotlin.a1.n(r8)
                    java.lang.Object r8 = r7.f3784c
                    kotlinx.coroutines.r0 r8 = (kotlinx.coroutines.r0) r8
                    androidx.compose.ui.input.pointer.k0 r1 = r7.f3785d     // Catch: java.util.concurrent.CancellationException -> L37
                    androidx.compose.foundation.gestures.b$c$a$a r3 = new androidx.compose.foundation.gestures.b$c$a$a     // Catch: java.util.concurrent.CancellationException -> L37
                    androidx.compose.foundation.gestures.b r4 = r7.f3786e     // Catch: java.util.concurrent.CancellationException -> L37
                    r5 = 0
                    r3.<init>(r8, r4, r5)     // Catch: java.util.concurrent.CancellationException -> L37
                    r7.f3784c = r8     // Catch: java.util.concurrent.CancellationException -> L37
                    r7.f3783b = r2     // Catch: java.util.concurrent.CancellationException -> L37
                    java.lang.Object r8 = r1.o3(r3, r7)     // Catch: java.util.concurrent.CancellationException -> L37
                    if (r8 != r0) goto L41
                    return r0
                L37:
                    r0 = move-exception
                    r6 = r0
                    r0 = r8
                    r8 = r6
                L3b:
                    boolean r0 = kotlinx.coroutines.s0.k(r0)
                    if (r0 == 0) goto L44
                L41:
                    kotlin.k2 r8 = kotlin.k2.f75408a
                    return r8
                L44:
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((c) create(k0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            c cVar = b.this.new c(dVar);
            cVar.f3781c = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f3780b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.compose.ui.input.pointer.k0 k0Var = (androidx.compose.ui.input.pointer.k0) this.f3781c;
                if (!b.this.getEnabled()) {
                    return k2.f75408a;
                }
                a aVar2 = new a(k0Var, b.this, null);
                this.f3780b = 1;
                if (kotlinx.coroutines.s0.g(aVar2, this) == aVar) {
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
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AbstractDraggableNode", f = "Draggable.kt", i = {0, 0}, l = {554, 557}, m = "processDragCancel", n = {"this", "$this$processDragCancel"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f3795b;

        /* renamed from: c, reason: collision with root package name */
        Object f3796c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f3797d;

        /* renamed from: f, reason: collision with root package name */
        int f3799f;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f3797d = obj;
            this.f3799f |= Integer.MIN_VALUE;
            return b.this.e8(null, this);
        }
    }

    /* compiled from: Draggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AbstractDraggableNode", f = "Draggable.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {536, 539, 541}, m = "processDragStart", n = {"this", "$this$processDragStart", "event", "this", "$this$processDragStart", "event", "interaction"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f3800b;

        /* renamed from: c, reason: collision with root package name */
        Object f3801c;

        /* renamed from: d, reason: collision with root package name */
        Object f3802d;

        /* renamed from: e, reason: collision with root package name */
        Object f3803e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3804f;

        /* renamed from: h, reason: collision with root package name */
        int f3806h;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f3804f = obj;
            this.f3806h |= Integer.MIN_VALUE;
            return b.this.f8(null, null, this);
        }
    }

    /* compiled from: Draggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AbstractDraggableNode", f = "Draggable.kt", i = {0, 0, 0}, l = {546, 549}, m = "processDragStop", n = {"this", "$this$processDragStop", "event"}, s = {"L$0", "L$1", "L$2"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f3807b;

        /* renamed from: c, reason: collision with root package name */
        Object f3808c;

        /* renamed from: d, reason: collision with root package name */
        Object f3809d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f3810e;

        /* renamed from: g, reason: collision with root package name */
        int f3812g;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f3810e = obj;
            this.f3812g |= Integer.MIN_VALUE;
            return b.this.g8(null, null, this);
        }
    }

    /* compiled from: Draggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1", f = "Draggable.kt", i = {0, 0, 1, 1, 2, 2, 3, 4, 5}, l = {431, 433, 435, 442, 444, 447}, m = "invokeSuspend", n = {"$this$launch", "event", "$this$launch", "event", "$this$launch", "event", "$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0"})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f3813b;

        /* renamed from: c, reason: collision with root package name */
        Object f3814c;

        /* renamed from: d, reason: collision with root package name */
        int f3815d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f3816e;

        /* compiled from: Draggable.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1$1", f = "Draggable.kt", i = {0, 1}, l = {437, 438}, m = "invokeSuspend", n = {"$this$drag", "$this$drag"}, s = {"L$0", "L$0"})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/a;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/a;)V"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<androidx.compose.foundation.gestures.a, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            Object f3818b;

            /* renamed from: c, reason: collision with root package name */
            int f3819c;

            /* renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f3820d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ k1.h<t> f3821e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f3822f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k1.h<t> hVar, b bVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f3821e = hVar;
                this.f3822f = bVar;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l androidx.compose.foundation.gestures.a aVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((a) create(aVar, dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f3821e, this.f3822f, dVar);
                aVar.f3820d = obj;
                return aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0073 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0071 -> B:6:0x0074). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r8) {
                /*
                    r7 = this;
                    kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r1 = r7.f3819c
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L28
                    if (r1 == r3) goto L20
                    if (r1 != r2) goto L18
                    java.lang.Object r1 = r7.f3818b
                    kotlin.jvm.internal.k1$h r1 = (kotlin.jvm.internal.k1.h) r1
                    java.lang.Object r4 = r7.f3820d
                    androidx.compose.foundation.gestures.a r4 = (androidx.compose.foundation.gestures.a) r4
                    kotlin.a1.n(r8)
                    goto L74
                L18:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L20:
                    java.lang.Object r1 = r7.f3820d
                    androidx.compose.foundation.gestures.a r1 = (androidx.compose.foundation.gestures.a) r1
                    kotlin.a1.n(r8)
                    goto L5e
                L28:
                    kotlin.a1.n(r8)
                    java.lang.Object r8 = r7.f3820d
                    androidx.compose.foundation.gestures.a r8 = (androidx.compose.foundation.gestures.a) r8
                    r1 = r8
                L30:
                    kotlin.jvm.internal.k1$h<androidx.compose.foundation.gestures.t> r8 = r7.f3821e
                    T r8 = r8.f75329b
                    boolean r4 = r8 instanceof androidx.compose.foundation.gestures.t.d
                    if (r4 != 0) goto L78
                    boolean r4 = r8 instanceof androidx.compose.foundation.gestures.t.a
                    if (r4 != 0) goto L78
                    boolean r4 = r8 instanceof androidx.compose.foundation.gestures.t.b
                    r5 = 0
                    if (r4 == 0) goto L45
                    r4 = r8
                    androidx.compose.foundation.gestures.t$b r4 = (androidx.compose.foundation.gestures.t.b) r4
                    goto L46
                L45:
                    r4 = r5
                L46:
                    if (r4 == 0) goto L5e
                    androidx.compose.foundation.gestures.b r4 = r7.f3822f
                    java.lang.String r6 = "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragDelta"
                    kotlin.jvm.internal.l0.n(r8, r6)
                    androidx.compose.foundation.gestures.t$b r8 = (androidx.compose.foundation.gestures.t.b) r8
                    r7.f3820d = r1
                    r7.f3818b = r5
                    r7.f3819c = r3
                    java.lang.Object r8 = r4.U7(r1, r8, r7)
                    if (r8 != r0) goto L5e
                    return r0
                L5e:
                    r4 = r1
                    kotlin.jvm.internal.k1$h<androidx.compose.foundation.gestures.t> r1 = r7.f3821e
                    androidx.compose.foundation.gestures.b r8 = r7.f3822f
                    kotlinx.coroutines.channels.l r8 = androidx.compose.foundation.gestures.b.J7(r8)
                    r7.f3820d = r4
                    r7.f3818b = r1
                    r7.f3819c = r2
                    java.lang.Object r8 = r8.a0(r7)
                    if (r8 != r0) goto L74
                    return r0
                L74:
                    r1.f75329b = r8
                    r1 = r4
                    goto L30
                L78:
                    kotlin.k2 r8 = kotlin.k2.f75408a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        g(kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            g gVar = b.this.new g(dVar);
            gVar.f3816e = obj;
            return gVar;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:19|20|(1:39)|22|23|24|(2:29|(2:31|(1:33)))(2:26|(1:28))|8|(2:43|44)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00cf, code lost:
        
            r1 = r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00f4, code lost:
        
            return r0;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00b8 A[Catch: CancellationException -> 0x00cf, TryCatch #0 {CancellationException -> 0x00cf, blocks: (B:24:0x00b2, B:26:0x00b8, B:29:0x00d1, B:31:0x00d5), top: B:23:0x00b2 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00d1 A[Catch: CancellationException -> 0x00cf, TryCatch #0 {CancellationException -> 0x00cf, blocks: (B:24:0x00b2, B:26:0x00b8, B:29:0x00d1, B:31:0x00d5), top: B:23:0x00b2 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00f4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00b1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00f5  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00f8  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00cc -> B:8:0x005b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00d3 -> B:8:0x005b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00e2 -> B:8:0x005b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00f2 -> B:7:0x0025). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00f5 -> B:8:0x005b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r7) {
            /*
                Method dump skipped, instructions count: 270
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((g) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    public b(@fg.l ld.l<? super androidx.compose.ui.input.pointer.b0, Boolean> lVar, boolean z4, @fg.m androidx.compose.foundation.interaction.k kVar, @fg.l ld.a<Boolean> aVar, @fg.l ld.q<? super kotlinx.coroutines.r0, ? super i0.f, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, @fg.l ld.q<? super kotlinx.coroutines.r0, ? super androidx.compose.ui.unit.c0, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar2, boolean z5) {
        this.canDrag = lVar;
        this.enabled = z4;
        this.interactionSource = kVar;
        this.startDragImmediately = aVar;
        this.onDragStarted = qVar;
        this.onDragStopped = qVar2;
        this.reverseDirection = z5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e8(kotlinx.coroutines.r0 r9, kotlin.coroutines.d<? super kotlin.k2> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.b.d
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.b$d r0 = (androidx.compose.foundation.gestures.b.d) r0
            int r1 = r0.f3799f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3799f = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.b$d r0 = new androidx.compose.foundation.gestures.b$d
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f3797d
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f3799f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            kotlin.a1.n(r10)
            goto L7d
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            java.lang.Object r9 = r0.f3796c
            kotlinx.coroutines.r0 r9 = (kotlinx.coroutines.r0) r9
            java.lang.Object r2 = r0.f3795b
            androidx.compose.foundation.gestures.b r2 = (androidx.compose.foundation.gestures.b) r2
            kotlin.a1.n(r10)
            goto L5d
        L3f:
            kotlin.a1.n(r10)
            androidx.compose.foundation.interaction.a$b r10 = r8.dragInteraction
            if (r10 == 0) goto L60
            androidx.compose.foundation.interaction.k r2 = r8.interactionSource
            if (r2 == 0) goto L5c
            androidx.compose.foundation.interaction.a$a r6 = new androidx.compose.foundation.interaction.a$a
            r6.<init>(r10)
            r0.f3795b = r8
            r0.f3796c = r9
            r0.f3799f = r4
            java.lang.Object r10 = r2.a(r6, r0)
            if (r10 != r1) goto L5c
            return r1
        L5c:
            r2 = r8
        L5d:
            r2.dragInteraction = r5
            goto L61
        L60:
            r2 = r8
        L61:
            ld.q<? super kotlinx.coroutines.r0, ? super androidx.compose.ui.unit.c0, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends java.lang.Object> r10 = r2.onDragStopped
            androidx.compose.ui.unit.c0$a r2 = androidx.compose.ui.unit.c0.INSTANCE
            r2.getClass()
            long r6 = androidx.compose.ui.unit.c0.a()
            androidx.compose.ui.unit.c0 r2 = androidx.compose.ui.unit.c0.b(r6)
            r0.f3795b = r5
            r0.f3796c = r5
            r0.f3799f = r3
            java.lang.Object r9 = r10.R(r9, r2, r0)
            if (r9 != r1) goto L7d
            return r1
        L7d:
            kotlin.k2 r9 = kotlin.k2.f75408a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.e8(kotlinx.coroutines.r0, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f8(kotlinx.coroutines.r0 r8, androidx.compose.foundation.gestures.t.c r9, kotlin.coroutines.d<? super kotlin.k2> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.b.e
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.b$e r0 = (androidx.compose.foundation.gestures.b.e) r0
            int r1 = r0.f3806h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3806h = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.b$e r0 = new androidx.compose.foundation.gestures.b$e
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f3804f
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f3806h
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L5b
            if (r2 == r5) goto L4a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            kotlin.a1.n(r10)
            goto Lb9
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.Object r8 = r0.f3803e
            androidx.compose.foundation.interaction.a$b r8 = (androidx.compose.foundation.interaction.a.b) r8
            java.lang.Object r9 = r0.f3802d
            androidx.compose.foundation.gestures.t$c r9 = (androidx.compose.foundation.gestures.t.c) r9
            java.lang.Object r2 = r0.f3801c
            kotlinx.coroutines.r0 r2 = (kotlinx.coroutines.r0) r2
            java.lang.Object r4 = r0.f3800b
            androidx.compose.foundation.gestures.b r4 = (androidx.compose.foundation.gestures.b) r4
            kotlin.a1.n(r10)
            goto L98
        L4a:
            java.lang.Object r8 = r0.f3802d
            r9 = r8
            androidx.compose.foundation.gestures.t$c r9 = (androidx.compose.foundation.gestures.t.c) r9
            java.lang.Object r8 = r0.f3801c
            kotlinx.coroutines.r0 r8 = (kotlinx.coroutines.r0) r8
            java.lang.Object r2 = r0.f3800b
            androidx.compose.foundation.gestures.b r2 = (androidx.compose.foundation.gestures.b) r2
            kotlin.a1.n(r10)
            goto L7b
        L5b:
            kotlin.a1.n(r10)
            androidx.compose.foundation.interaction.a$b r10 = r7.dragInteraction
            if (r10 == 0) goto L7a
            androidx.compose.foundation.interaction.k r2 = r7.interactionSource
            if (r2 == 0) goto L7a
            androidx.compose.foundation.interaction.a$a r6 = new androidx.compose.foundation.interaction.a$a
            r6.<init>(r10)
            r0.f3800b = r7
            r0.f3801c = r8
            r0.f3802d = r9
            r0.f3806h = r5
            java.lang.Object r10 = r2.a(r6, r0)
            if (r10 != r1) goto L7a
            return r1
        L7a:
            r2 = r7
        L7b:
            androidx.compose.foundation.interaction.a$b r10 = new androidx.compose.foundation.interaction.a$b
            r10.<init>()
            androidx.compose.foundation.interaction.k r5 = r2.interactionSource
            if (r5 == 0) goto L9b
            r0.f3800b = r2
            r0.f3801c = r8
            r0.f3802d = r9
            r0.f3803e = r10
            r0.f3806h = r4
            java.lang.Object r4 = r5.a(r10, r0)
            if (r4 != r1) goto L95
            return r1
        L95:
            r4 = r2
            r2 = r8
            r8 = r10
        L98:
            r10 = r8
            r8 = r2
            r2 = r4
        L9b:
            r2.dragInteraction = r10
            ld.q<? super kotlinx.coroutines.r0, ? super i0.f, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends java.lang.Object> r10 = r2.onDragStarted
            long r4 = r9.getStartPoint()
            i0.f r9 = i0.f.d(r4)
            r2 = 0
            r0.f3800b = r2
            r0.f3801c = r2
            r0.f3802d = r2
            r0.f3803e = r2
            r0.f3806h = r3
            java.lang.Object r8 = r10.R(r8, r9, r0)
            if (r8 != r1) goto Lb9
            return r1
        Lb9:
            kotlin.k2 r8 = kotlin.k2.f75408a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.f8(kotlinx.coroutines.r0, androidx.compose.foundation.gestures.t$c, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g8(kotlinx.coroutines.r0 r9, androidx.compose.foundation.gestures.t.d r10, kotlin.coroutines.d<? super kotlin.k2> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.compose.foundation.gestures.b.f
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.gestures.b$f r0 = (androidx.compose.foundation.gestures.b.f) r0
            int r1 = r0.f3812g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3812g = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.b$f r0 = new androidx.compose.foundation.gestures.b$f
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f3810e
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f3812g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L44
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            kotlin.a1.n(r11)
            goto L81
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            java.lang.Object r9 = r0.f3809d
            r10 = r9
            androidx.compose.foundation.gestures.t$d r10 = (androidx.compose.foundation.gestures.t.d) r10
            java.lang.Object r9 = r0.f3808c
            kotlinx.coroutines.r0 r9 = (kotlinx.coroutines.r0) r9
            java.lang.Object r2 = r0.f3807b
            androidx.compose.foundation.gestures.b r2 = (androidx.compose.foundation.gestures.b) r2
            kotlin.a1.n(r11)
            goto L64
        L44:
            kotlin.a1.n(r11)
            androidx.compose.foundation.interaction.a$b r11 = r8.dragInteraction
            if (r11 == 0) goto L67
            androidx.compose.foundation.interaction.k r2 = r8.interactionSource
            if (r2 == 0) goto L63
            androidx.compose.foundation.interaction.a$c r6 = new androidx.compose.foundation.interaction.a$c
            r6.<init>(r11)
            r0.f3807b = r8
            r0.f3808c = r9
            r0.f3809d = r10
            r0.f3812g = r4
            java.lang.Object r11 = r2.a(r6, r0)
            if (r11 != r1) goto L63
            return r1
        L63:
            r2 = r8
        L64:
            r2.dragInteraction = r5
            goto L68
        L67:
            r2 = r8
        L68:
            ld.q<? super kotlinx.coroutines.r0, ? super androidx.compose.ui.unit.c0, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends java.lang.Object> r11 = r2.onDragStopped
            long r6 = r10.getVelocity()
            androidx.compose.ui.unit.c0 r10 = androidx.compose.ui.unit.c0.b(r6)
            r0.f3807b = r5
            r0.f3808c = r5
            r0.f3809d = r5
            r0.f3812g = r3
            java.lang.Object r9 = r11.R(r9, r10, r0)
            if (r9 != r1) goto L81
            return r1
        L81:
            kotlin.k2 r9 = kotlin.k2.f75408a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.g8(kotlinx.coroutines.r0, androidx.compose.foundation.gestures.t$d, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o8() {
        this.isListeningForEvents = true;
        kotlinx.coroutines.k.f(V6(), null, null, new g(null), 3, null);
    }

    @Override // androidx.compose.ui.node.u1
    public void E4() {
        this.pointerInputNode.E4();
    }

    public final void S7() {
        a.b bVar = this.dragInteraction;
        if (bVar != null) {
            androidx.compose.foundation.interaction.k kVar = this.interactionSource;
            if (kVar != null) {
                kVar.b(new a.C0082a(bVar));
            }
            this.dragInteraction = null;
        }
    }

    @fg.m
    public abstract Object T7(@fg.l ld.p<? super androidx.compose.foundation.gestures.a, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super k2> dVar);

    @fg.m
    public abstract Object U7(@fg.l androidx.compose.foundation.gestures.a aVar, @fg.l t.b bVar, @fg.l kotlin.coroutines.d<? super k2> dVar);

    @fg.l
    public final ld.l<androidx.compose.ui.input.pointer.b0, Boolean> V7() {
        return this.canDrag;
    }

    /* renamed from: W7, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @fg.m
    /* renamed from: X7, reason: from getter */
    public final androidx.compose.foundation.interaction.k getInteractionSource() {
        return this.interactionSource;
    }

    @fg.l
    public final ld.q<kotlinx.coroutines.r0, i0.f, kotlin.coroutines.d<? super k2>, Object> Y7() {
        return this.onDragStarted;
    }

    @fg.l
    public final ld.q<kotlinx.coroutines.r0, androidx.compose.ui.unit.c0, kotlin.coroutines.d<? super k2>, Object> Z7() {
        return this.onDragStopped;
    }

    @fg.l
    /* renamed from: a8 */
    public abstract k0 getPointerDirectionConfig();

    @fg.l
    /* renamed from: b8, reason: from getter */
    public final androidx.compose.ui.input.pointer.v0 getPointerInputNode() {
        return this.pointerInputNode;
    }

    /* renamed from: c8, reason: from getter */
    public final boolean getReverseDirection() {
        return this.reverseDirection;
    }

    @fg.l
    public final ld.a<Boolean> d8() {
        return this.startDragImmediately;
    }

    @Override // androidx.compose.ui.node.u1
    public void g1(@fg.l androidx.compose.ui.input.pointer.p pointerEvent, @fg.l androidx.compose.ui.input.pointer.r pass, long bounds) {
        this.pointerInputNode.g1(pointerEvent, pass, bounds);
    }

    public final void h8(@fg.l ld.l<? super androidx.compose.ui.input.pointer.b0, Boolean> lVar) {
        this.canDrag = lVar;
    }

    public final void i8(boolean z4) {
        this.enabled = z4;
    }

    @Override // androidx.compose.ui.q.d
    public void j7() {
        this.isListeningForEvents = false;
        S7();
    }

    public final void j8(@fg.m androidx.compose.foundation.interaction.k kVar) {
        this.interactionSource = kVar;
    }

    public final void k8(@fg.l ld.q<? super kotlinx.coroutines.r0, ? super i0.f, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar) {
        this.onDragStarted = qVar;
    }

    public final void l8(@fg.l ld.q<? super kotlinx.coroutines.r0, ? super androidx.compose.ui.unit.c0, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar) {
        this.onDragStopped = qVar;
    }

    public final void m8(boolean z4) {
        this.reverseDirection = z4;
    }

    public final void n8(@fg.l ld.a<Boolean> aVar) {
        this.startDragImmediately = aVar;
    }
}
