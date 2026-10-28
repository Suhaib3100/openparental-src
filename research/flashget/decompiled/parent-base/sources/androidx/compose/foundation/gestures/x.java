package androidx.compose.foundation.gestures;

import androidx.compose.foundation.a2;
import androidx.compose.foundation.gestures.t;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Draggable2D.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\u0083\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u00012\b\u0000\u0018\u00002\u00020\u0001BÇ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b\u0012<\u0010\u0017\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00150\r¢\u0006\u0002\b\u0016\u0012<\u0010\u001a\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00150\r¢\u0006\u0002\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ9\u0010!\u001a\u00020\u00142'\u0010 \u001a#\b\u0001\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u001e¢\u0006\u0002\b\u0016H\u0096@¢\u0006\u0004\b!\u0010\"J\u001c\u0010%\u001a\u00020\u0014*\u00020\u001f2\u0006\u0010$\u001a\u00020#H\u0096@¢\u0006\u0004\b%\u0010&JÍ\u0001\u0010'\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2<\u0010\u0017\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00150\r¢\u0006\u0002\b\u00162<\u0010\u001a\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00150\r¢\u0006\u0002\b\u00162\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b'\u0010\u001dR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u0010;\u001a\u0002068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"Landroidx/compose/foundation/gestures/x;", "Landroidx/compose/foundation/gestures/b;", "Landroidx/compose/foundation/gestures/y;", "state", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/b0;", "", "canDrag", "enabled", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "Lkotlin/Function0;", "startDragImmediately", "Lkotlin/Function3;", "Lkotlinx/coroutines/r0;", "Li0/f;", "Lkotlin/r0;", "name", "startedPosition", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "onDragStarted", "Landroidx/compose/ui/unit/c0;", "velocity", "onDragStopped", "reverseDirection", "<init>", "(Landroidx/compose/foundation/gestures/y;Lld/l;ZLandroidx/compose/foundation/interaction/k;Lld/a;Lld/q;Lld/q;Z)V", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/a;", "block", "T7", "(Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/t$b;", "dragDelta", "U7", "(Landroidx/compose/foundation/gestures/a;Landroidx/compose/foundation/gestures/t$b;Lkotlin/coroutines/d;)Ljava/lang/Object;", "s8", "H", "Landroidx/compose/foundation/gestures/y;", "Landroidx/compose/foundation/gestures/s;", "I", "Landroidx/compose/foundation/gestures/s;", "q8", "()Landroidx/compose/foundation/gestures/s;", "r8", "(Landroidx/compose/foundation/gestures/s;)V", "drag2DScope", "androidx/compose/foundation/gestures/x$a", "J", "Landroidx/compose/foundation/gestures/x$a;", "abstractDragScope", "Landroidx/compose/foundation/gestures/k0;", "K", "Landroidx/compose/foundation/gestures/k0;", "a8", "()Landroidx/compose/foundation/gestures/k0;", "pointerDirectionConfig", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class x extends androidx.compose.foundation.gestures.b {
    public static final int L = 8;

    /* renamed from: H, reason: from kotlin metadata */
    @fg.l
    private y state;

    /* renamed from: I, reason: from kotlin metadata */
    @fg.l
    private s drag2DScope;

    /* renamed from: J, reason: from kotlin metadata */
    @fg.l
    private final a abstractDragScope;

    /* renamed from: K, reason: from kotlin metadata */
    @fg.l
    private final k0 pointerDirectionConfig;

    /* compiled from: Draggable2D.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"androidx/compose/foundation/gestures/x$a", "Landroidx/compose/foundation/gestures/a;", "Li0/f;", "pixels", "Lkotlin/k2;", "a", "(J)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements androidx.compose.foundation.gestures.a {
        a() {
        }

        @Override // androidx.compose.foundation.gestures.a
        public void a(long pixels) {
            x.this.getDrag2DScope().a(pixels);
        }
    }

    /* compiled from: Draggable2D.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.Draggable2DNode$drag$2", f = "Draggable2D.kt", i = {}, l = {288}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/s;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/s;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<s, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f4527b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f4528c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.foundation.gestures.a, kotlin.coroutines.d<? super k2>, Object> f4530e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ld.p<? super androidx.compose.foundation.gestures.a, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f4530e = pVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l s sVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((b) create(sVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            b bVar = x.this.new b(this.f4530e, dVar);
            bVar.f4528c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f4527b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                x.this.r8((s) this.f4528c);
                ld.p<androidx.compose.foundation.gestures.a, kotlin.coroutines.d<? super k2>, Object> pVar = this.f4530e;
                a aVar2 = x.this.abstractDragScope;
                this.f4527b = 1;
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

    public x(@fg.l y yVar, @fg.l ld.l<? super androidx.compose.ui.input.pointer.b0, Boolean> lVar, boolean z4, @fg.m androidx.compose.foundation.interaction.k kVar, @fg.l ld.a<Boolean> aVar, @fg.l ld.q<? super kotlinx.coroutines.r0, ? super i0.f, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar, @fg.l ld.q<? super kotlinx.coroutines.r0, ? super androidx.compose.ui.unit.c0, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar2, boolean z5) {
        super(lVar, z4, kVar, aVar, qVar, qVar2, z5);
        s sVar;
        this.state = yVar;
        sVar = w.f4520a;
        this.drag2DScope = sVar;
        this.abstractDragScope = new a();
        this.pointerDirectionConfig = u.y();
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
    /* renamed from: q8, reason: from getter */
    public final s getDrag2DScope() {
        return this.drag2DScope;
    }

    public final void r8(@fg.l s sVar) {
        this.drag2DScope = sVar;
    }

    public final void s8(@fg.l y state, @fg.l ld.l<? super androidx.compose.ui.input.pointer.b0, Boolean> canDrag, boolean enabled, @fg.m androidx.compose.foundation.interaction.k interactionSource, @fg.l ld.a<Boolean> startDragImmediately, @fg.l ld.q<? super kotlinx.coroutines.r0, ? super i0.f, ? super kotlin.coroutines.d<? super k2>, ? extends Object> onDragStarted, @fg.l ld.q<? super kotlinx.coroutines.r0, ? super androidx.compose.ui.unit.c0, ? super kotlin.coroutines.d<? super k2>, ? extends Object> onDragStopped, boolean reverseDirection) {
        boolean z4;
        boolean z5 = true;
        if (kotlin.jvm.internal.l0.g(this.state, state)) {
            z4 = false;
        } else {
            this.state = state;
            z4 = true;
        }
        h8(canDrag);
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
