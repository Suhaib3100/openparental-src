package androidx.compose.foundation.gestures;

import androidx.compose.foundation.a2;
import androidx.compose.foundation.gestures.t;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Draggable.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\u0089\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u00016\b\u0000\u0018\u00002\u00020\u0001BÏ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012<\u0010\u0019\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u000f¢\u0006\u0002\b\u0018\u0012<\u0010\u001c\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u000f¢\u0006\u0002\b\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ9\u0010#\u001a\u00020\u00162'\u0010\"\u001a#\b\u0001\u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00170 ¢\u0006\u0002\b\u0018H\u0096@¢\u0006\u0004\b#\u0010$J\u001c\u0010'\u001a\u00020\u0016*\u00020!2\u0006\u0010&\u001a\u00020%H\u0096@¢\u0006\u0004\b'\u0010(JÕ\u0001\u0010)\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r2<\u0010\u0019\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u000f¢\u0006\u0002\b\u00182<\u0010\u001c\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u000f¢\u0006\u0002\b\u00182\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b)\u0010\u001fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010?\u001a\u00020:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"Landroidx/compose/foundation/gestures/c0;", "Landroidx/compose/foundation/gestures/b;", "Landroidx/compose/foundation/gestures/d0;", "state", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/b0;", "", "canDrag", "Landroidx/compose/foundation/gestures/j0;", "orientation", "enabled", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "Lkotlin/Function0;", "startDragImmediately", "Lkotlin/Function3;", "Lkotlinx/coroutines/r0;", "Li0/f;", "Lkotlin/r0;", "name", "startedPosition", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "onDragStarted", "Landroidx/compose/ui/unit/c0;", "velocity", "onDragStopped", "reverseDirection", "<init>", "(Landroidx/compose/foundation/gestures/d0;Lld/l;Landroidx/compose/foundation/gestures/j0;ZLandroidx/compose/foundation/interaction/k;Lld/a;Lld/q;Lld/q;Z)V", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/a;", "block", "T7", "(Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/t$b;", "dragDelta", "U7", "(Landroidx/compose/foundation/gestures/a;Landroidx/compose/foundation/gestures/t$b;Lkotlin/coroutines/d;)Ljava/lang/Object;", "t8", "H", "Landroidx/compose/foundation/gestures/d0;", "I", "Landroidx/compose/foundation/gestures/j0;", "Landroidx/compose/foundation/gestures/v;", "J", "Landroidx/compose/foundation/gestures/v;", "r8", "()Landroidx/compose/foundation/gestures/v;", "s8", "(Landroidx/compose/foundation/gestures/v;)V", "dragScope", "androidx/compose/foundation/gestures/c0$a", "K", "Landroidx/compose/foundation/gestures/c0$a;", "abstractDragScope", "Landroidx/compose/foundation/gestures/k0;", "L", "Landroidx/compose/foundation/gestures/k0;", "a8", "()Landroidx/compose/foundation/gestures/k0;", "pointerDirectionConfig", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c0 extends androidx.compose.foundation.gestures.b {
    public static final int M = 8;

    /* renamed from: H, reason: from kotlin metadata */
    @fg.l
    private d0 state;

    /* renamed from: I, reason: from kotlin metadata */
    @fg.l
    private j0 orientation;

    /* renamed from: J, reason: from kotlin metadata */
    @fg.l
    private v dragScope;

    /* renamed from: K, reason: from kotlin metadata */
    @fg.l
    private final a abstractDragScope;

    /* renamed from: L, reason: from kotlin metadata */
    @fg.l
    private final k0 pointerDirectionConfig;

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"androidx/compose/foundation/gestures/c0$a", "Landroidx/compose/foundation/gestures/a;", "Li0/f;", "pixels", "Lkotlin/k2;", "a", "(J)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements androidx.compose.foundation.gestures.a {
        a() {
        }

        @Override // androidx.compose.foundation.gestures.a
        public void a(long pixels) {
            float n4;
            v dragScope = c0.this.getDragScope();
            n4 = b0.n(pixels, c0.this.orientation);
            dragScope.c(n4);
        }
    }

    /* compiled from: Draggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableNode$drag$2", f = "Draggable.kt", i = {}, l = {322}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/v;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/v;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<v, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f3867b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f3868c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.foundation.gestures.a, kotlin.coroutines.d<? super k2>, Object> f3870e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ld.p<? super androidx.compose.foundation.gestures.a, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f3870e = pVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l v vVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((b) create(vVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            b bVar = c0.this.new b(this.f3870e, dVar);
            bVar.f3868c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f3867b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                c0.this.s8((v) this.f3868c);
                ld.p<androidx.compose.foundation.gestures.a, kotlin.coroutines.d<? super k2>, Object> pVar = this.f3870e;
                a aVar2 = c0.this.abstractDragScope;
                this.f3867b = 1;
                if (pVar.invoke(aVar2, this) == aVar) {
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

    public c0(@fg.l d0 d0Var, @fg.l ld.l<? super androidx.compose.ui.input.pointer.b0, Boolean> lVar, @fg.l j0 j0Var, boolean z4, @fg.m androidx.compose.foundation.interaction.k kVar, @fg.l ld.a<Boolean> aVar, @fg.l ld.q<? super kotlinx.coroutines.r0, ? super i0.f, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, @fg.l ld.q<? super kotlinx.coroutines.r0, ? super androidx.compose.ui.unit.c0, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar2, boolean z5) {
        super(lVar, z4, kVar, aVar, qVar, qVar2, z5);
        v vVar;
        this.state = d0Var;
        this.orientation = j0Var;
        vVar = b0.f3823a;
        this.dragScope = vVar;
        this.abstractDragScope = new a();
        this.pointerDirectionConfig = u.E(this.orientation);
    }

    @Override // androidx.compose.foundation.gestures.b
    @fg.m
    public Object T7(@fg.l ld.p<? super androidx.compose.foundation.gestures.a, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object a5 = this.state.a(a2.UserInput, new b(pVar, null), dVar);
        return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
    }

    @Override // androidx.compose.foundation.gestures.b
    @fg.m
    public Object U7(@fg.l androidx.compose.foundation.gestures.a aVar, @fg.l t.b bVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        aVar.a(bVar.getDelta());
        return k2.f75408a;
    }

    @Override // androidx.compose.foundation.gestures.b
    @fg.l
    /* renamed from: a8, reason: from getter */
    public k0 getPointerDirectionConfig() {
        return this.pointerDirectionConfig;
    }

    @fg.l
    /* renamed from: r8, reason: from getter */
    public final v getDragScope() {
        return this.dragScope;
    }

    public final void s8(@fg.l v vVar) {
        this.dragScope = vVar;
    }

    public final void t8(@fg.l d0 state, @fg.l ld.l<? super androidx.compose.ui.input.pointer.b0, Boolean> canDrag, @fg.l j0 orientation, boolean enabled, @fg.m androidx.compose.foundation.interaction.k interactionSource, @fg.l ld.a<Boolean> startDragImmediately, @fg.l ld.q<? super kotlinx.coroutines.r0, ? super i0.f, ? super kotlin.coroutines.d<? super k2>, ? extends Object> onDragStarted, @fg.l ld.q<? super kotlinx.coroutines.r0, ? super androidx.compose.ui.unit.c0, ? super kotlin.coroutines.d<? super k2>, ? extends Object> onDragStopped, boolean reverseDirection) {
        boolean z4;
        boolean z5 = true;
        if (kotlin.jvm.internal.l0.g(this.state, state)) {
            z4 = false;
        } else {
            this.state = state;
            z4 = true;
        }
        h8(canDrag);
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z4 = true;
        }
        if (getEnabled() != enabled) {
            i8(enabled);
            if (!enabled) {
                S7();
            }
            z4 = true;
        }
        if (!kotlin.jvm.internal.l0.g(getInteractionSource(), interactionSource)) {
            S7();
            j8(interactionSource);
        }
        n8(startDragImmediately);
        k8(onDragStarted);
        l8(onDragStopped);
        if (getReverseDirection() != reverseDirection) {
            m8(reverseDirection);
        } else {
            z5 = z4;
        }
        if (z5) {
            getPointerInputNode().g3();
        }
    }
}
