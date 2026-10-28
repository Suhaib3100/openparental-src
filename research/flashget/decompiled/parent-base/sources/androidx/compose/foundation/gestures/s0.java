package androidx.compose.foundation.gestures;

import androidx.constraintlayout.core.motion.utils.w;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010*\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-RJ\u0010:\u001a8\b\u0001\u0012\u0004\u0012\u000200\u0012\u0013\u0012\u001101¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e05\u0012\u0006\u0012\u0004\u0018\u0001060/¢\u0006\u0002\b78\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0017\u0010@\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"Landroidx/compose/foundation/gestures/s0;", "Landroidx/compose/ui/node/l;", "Landroidx/compose/foundation/gestures/y0;", "scrollLogic", "Landroidx/compose/foundation/gestures/j0;", "orientation", "", "enabled", "Landroidx/compose/ui/input/nestedscroll/b;", "nestedScrollDispatcher", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "<init>", "(Landroidx/compose/foundation/gestures/y0;Landroidx/compose/foundation/gestures/j0;ZLandroidx/compose/ui/input/nestedscroll/b;Landroidx/compose/foundation/interaction/k;)V", "Lkotlin/k2;", "Q7", "(Landroidx/compose/foundation/gestures/j0;ZLandroidx/compose/foundation/interaction/k;)V", "s", "Landroidx/compose/foundation/gestures/y0;", "P7", "()Landroidx/compose/foundation/gestures/y0;", "t", "Landroidx/compose/foundation/gestures/j0;", "O7", "()Landroidx/compose/foundation/gestures/j0;", "u", "Z", "L7", "()Z", "v", "Landroidx/compose/ui/input/nestedscroll/b;", "N7", "()Landroidx/compose/ui/input/nestedscroll/b;", "w", "Landroidx/compose/foundation/interaction/k;", "M7", "()Landroidx/compose/foundation/interaction/k;", "Landroidx/compose/foundation/gestures/o0;", "x", "Landroidx/compose/foundation/gestures/o0;", "K7", "()Landroidx/compose/foundation/gestures/o0;", "draggableState", "Lkotlin/Function0;", "y", "Lld/a;", "startDragImmediately", "Lkotlin/Function3;", "Lkotlinx/coroutines/r0;", "Landroidx/compose/ui/unit/c0;", "Lkotlin/r0;", "name", "velocity", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "z", "Lld/q;", "onDragStopped", "Landroidx/compose/foundation/gestures/c0;", "A", "Landroidx/compose/foundation/gestures/c0;", "J7", "()Landroidx/compose/foundation/gestures/c0;", "draggableGesturesNode", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class s0 extends androidx.compose.ui.node.l {

    /* renamed from: A, reason: from kotlin metadata */
    @fg.l
    private final c0 draggableGesturesNode;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final y0 scrollLogic;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j0 orientation;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.input.nestedscroll.b nestedScrollDispatcher;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final androidx.compose.foundation.interaction.k interactionSource;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final o0 draggableState;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<Boolean> startDragImmediately;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.q<kotlinx.coroutines.r0, androidx.compose.ui.unit.c0, kotlin.coroutines.d<? super k2>, Object> onDragStopped;

    /* compiled from: Scrollable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableGesturesNode$onDragStopped$1", f = "Scrollable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/r0;", "Landroidx/compose/ui/unit/c0;", "velocity", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;Landroidx/compose/ui/unit/c0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.r0, androidx.compose.ui.unit.c0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f4242b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ long f4243c;

        /* compiled from: Scrollable.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableGesturesNode$onDragStopped$1$1", f = "Scrollable.kt", i = {}, l = {w.e.B}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.gestures.s0$a$a, reason: collision with other inner class name */
        static final class C0075a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f4245b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ s0 f4246c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ long f4247d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0075a(s0 s0Var, long j4, kotlin.coroutines.d<? super C0075a> dVar) {
                super(2, dVar);
                this.f4246c = s0Var;
                this.f4247d = j4;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new C0075a(this.f4246c, this.f4247d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f4245b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    y0 scrollLogic = this.f4246c.getScrollLogic();
                    long j4 = this.f4247d;
                    this.f4245b = 1;
                    if (scrollLogic.g(j4, this) == aVar) {
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

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((C0075a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Object R(kotlinx.coroutines.r0 r0Var, androidx.compose.ui.unit.c0 c0Var, kotlin.coroutines.d<? super k2> dVar) {
            return a(r0Var, c0Var.getPackedValue(), dVar);
        }

        @fg.m
        public final Object a(@fg.l kotlinx.coroutines.r0 r0Var, long j4, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            a aVar = s0.this.new a(dVar);
            aVar.f4243c = j4;
            return aVar.invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f4242b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            kotlinx.coroutines.k.f(s0.this.getNestedScrollDispatcher().f(), null, null, new C0075a(s0.this, this.f4243c, null), 3, null);
            return k2.f75408a;
        }
    }

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {
        b() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(s0.this.getScrollLogic().m());
        }
    }

    public s0(@fg.l y0 y0Var, @fg.l j0 j0Var, boolean z4, @fg.l androidx.compose.ui.input.nestedscroll.b bVar, @fg.m androidx.compose.foundation.interaction.k kVar) {
        ld.l lVar;
        ld.q qVar;
        this.scrollLogic = y0Var;
        this.orientation = j0Var;
        this.enabled = z4;
        this.nestedScrollDispatcher = bVar;
        this.interactionSource = kVar;
        y7(new i0(y0Var));
        o0 o0Var = new o0(y0Var);
        this.draggableState = o0Var;
        b bVar2 = new b();
        this.startDragImmediately = bVar2;
        a aVar = new a(null);
        this.onDragStopped = aVar;
        lVar = t0.f4324a;
        qVar = t0.f4325b;
        this.draggableGesturesNode = (c0) y7(new c0(o0Var, lVar, j0Var, z4, kVar, bVar2, qVar, aVar, false));
    }

    @fg.l
    /* renamed from: J7, reason: from getter */
    public final c0 getDraggableGesturesNode() {
        return this.draggableGesturesNode;
    }

    @fg.l
    /* renamed from: K7, reason: from getter */
    public final o0 getDraggableState() {
        return this.draggableState;
    }

    /* renamed from: L7, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @fg.m
    /* renamed from: M7, reason: from getter */
    public final androidx.compose.foundation.interaction.k getInteractionSource() {
        return this.interactionSource;
    }

    @fg.l
    /* renamed from: N7, reason: from getter */
    public final androidx.compose.ui.input.nestedscroll.b getNestedScrollDispatcher() {
        return this.nestedScrollDispatcher;
    }

    @fg.l
    /* renamed from: O7, reason: from getter */
    public final j0 getOrientation() {
        return this.orientation;
    }

    @fg.l
    /* renamed from: P7, reason: from getter */
    public final y0 getScrollLogic() {
        return this.scrollLogic;
    }

    public final void Q7(@fg.l j0 orientation, boolean enabled, @fg.m androidx.compose.foundation.interaction.k interactionSource) {
        ld.q<? super kotlinx.coroutines.r0, ? super i0.f, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar;
        ld.l<? super androidx.compose.ui.input.pointer.b0, Boolean> lVar;
        c0 c0Var = this.draggableGesturesNode;
        o0 o0Var = this.draggableState;
        ld.a<Boolean> aVar = this.startDragImmediately;
        qVar = t0.f4325b;
        ld.q<kotlinx.coroutines.r0, androidx.compose.ui.unit.c0, kotlin.coroutines.d<? super k2>, Object> qVar2 = this.onDragStopped;
        lVar = t0.f4324a;
        c0Var.t8(o0Var, lVar, orientation, enabled, interactionSource, aVar, qVar, qVar2, false);
    }
}
