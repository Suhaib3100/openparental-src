package androidx.compose.foundation.gestures;

import android.view.KeyEvent;
import androidx.compose.foundation.a2;
import androidx.compose.foundation.gestures.t0;
import androidx.compose.foundation.i1;
import androidx.compose.foundation.i2;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.node.k1;
import androidx.compose.ui.node.l1;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005BM\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JS\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u0019J\u0017\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!H\u0016ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u001a\u0010%\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!H\u0016ø\u0001\u0000¢\u0006\u0004\b%\u0010$R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010-R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0017\u00108\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010>\u001a\u0002098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010D\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010J\u001a\u00020E8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010P\u001a\u00020K8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0017\u0010V\u001a\u00020Q8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010\\\u001a\u00020W8\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006]"}, d2 = {"Landroidx/compose/foundation/gestures/v0;", "Landroidx/compose/ui/node/l;", "Landroidx/compose/ui/node/k1;", "Landroidx/compose/ui/node/h;", "Landroidx/compose/ui/focus/w;", "Landroidx/compose/ui/input/key/g;", "Landroidx/compose/foundation/gestures/w0;", "state", "Landroidx/compose/foundation/gestures/j0;", "orientation", "Landroidx/compose/foundation/i2;", "overscrollEffect", "", "enabled", "reverseDirection", "Landroidx/compose/foundation/gestures/e0;", "flingBehavior", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "Landroidx/compose/foundation/gestures/k;", "bringIntoViewSpec", "<init>", "(Landroidx/compose/foundation/gestures/w0;Landroidx/compose/foundation/gestures/j0;Landroidx/compose/foundation/i2;ZZLandroidx/compose/foundation/gestures/e0;Landroidx/compose/foundation/interaction/k;Landroidx/compose/foundation/gestures/k;)V", "Lkotlin/k2;", "R7", "()V", "Q7", "i7", "d2", "Landroidx/compose/ui/focus/t;", "focusProperties", "V3", "(Landroidx/compose/ui/focus/t;)V", "Landroidx/compose/ui/input/key/c;", "event", "k4", "(Landroid/view/KeyEvent;)Z", "n3", "s", "Landroidx/compose/foundation/gestures/w0;", "t", "Landroidx/compose/foundation/gestures/j0;", "u", "Landroidx/compose/foundation/i2;", "v", "Z", "w", "x", "Landroidx/compose/foundation/gestures/e0;", "y", "Landroidx/compose/foundation/interaction/k;", "Landroidx/compose/ui/input/nestedscroll/b;", "z", "Landroidx/compose/ui/input/nestedscroll/b;", "M7", "()Landroidx/compose/ui/input/nestedscroll/b;", "nestedScrollDispatcher", "Landroidx/compose/foundation/gestures/p;", "A", "Landroidx/compose/foundation/gestures/p;", "K7", "()Landroidx/compose/foundation/gestures/p;", "defaultFlingBehavior", "Landroidx/compose/foundation/gestures/y0;", "B", "Landroidx/compose/foundation/gestures/y0;", "P7", "()Landroidx/compose/foundation/gestures/y0;", "scrollingLogic", "Landroidx/compose/foundation/gestures/u0;", "C", "Landroidx/compose/foundation/gestures/u0;", "L7", "()Landroidx/compose/foundation/gestures/u0;", "nestedScrollConnection", "Landroidx/compose/foundation/gestures/l;", "D", "Landroidx/compose/foundation/gestures/l;", "J7", "()Landroidx/compose/foundation/gestures/l;", "contentInViewNode", "Landroidx/compose/foundation/gestures/h0;", "E", "Landroidx/compose/foundation/gestures/h0;", "N7", "()Landroidx/compose/foundation/gestures/h0;", "scrollableContainer", "Landroidx/compose/foundation/gestures/s0;", "F", "Landroidx/compose/foundation/gestures/s0;", "O7", "()Landroidx/compose/foundation/gestures/s0;", "scrollableGesturesNode", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class v0 extends androidx.compose.ui.node.l implements k1, androidx.compose.ui.node.h, androidx.compose.ui.focus.w, androidx.compose.ui.input.key.g {

    /* renamed from: A, reason: from kotlin metadata */
    @fg.l
    private final p defaultFlingBehavior;

    /* renamed from: B, reason: from kotlin metadata */
    @fg.l
    private final y0 scrollingLogic;

    /* renamed from: C, reason: from kotlin metadata */
    @fg.l
    private final u0 nestedScrollConnection;

    /* renamed from: D, reason: from kotlin metadata */
    @fg.l
    private final l contentInViewNode;

    /* renamed from: E, reason: from kotlin metadata */
    @fg.l
    private final h0 scrollableContainer;

    /* renamed from: F, reason: from kotlin metadata */
    @fg.l
    private final s0 scrollableGesturesNode;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private w0 state;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private j0 orientation;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private i2 overscrollEffect;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean reverseDirection;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private e0 flingBehavior;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.foundation.interaction.k interactionSource;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.input.nestedscroll.b nestedScrollDispatcher;

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/u;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/u;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.layout.u, k2> {
        a() {
            super(1);
        }

        public final void a(@fg.m androidx.compose.ui.layout.u uVar) {
            v0.this.getContentInViewNode().T7(uVar);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.layout.u uVar) {
            a(uVar);
            return k2.f75408a;
        }
    }

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<k2> {
        b() {
            super(0);
        }

        public final void a() {
            androidx.compose.ui.node.i.a(v0.this, androidx.compose.ui.platform.h1.i());
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: Scrollable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1", f = "Scrollable.kt", i = {}, l = {442}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f4513b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ y0 f4514c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f4515d;

        /* compiled from: Scrollable.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1$1", f = "Scrollable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/q0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/q0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<q0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f4516b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f4517c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ y0 f4518d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ long f4519e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y0 y0Var, long j4, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f4518d = y0Var;
                this.f4519e = j4;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l q0 q0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f4518d, this.f4519e, dVar);
                aVar.f4517c = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                if (this.f4516b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
                q0 q0Var = (q0) this.f4517c;
                y0 y0Var = this.f4518d;
                long j4 = this.f4519e;
                androidx.compose.ui.input.nestedscroll.f.INSTANCE.getClass();
                y0Var.c(q0Var, j4, androidx.compose.ui.input.nestedscroll.f.f18690f);
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(y0 y0Var, long j4, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f4514c = y0Var;
            this.f4515d = j4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new c(this.f4514c, this.f4515d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f4513b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                w0 scrollableState = this.f4514c.getScrollableState();
                a2 a2Var = a2.UserInput;
                a aVar2 = new a(this.f4514c, this.f4515d, null);
                this.f4513b = 1;
                if (scrollableState.f(a2Var, aVar2, this) == aVar) {
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
            return ((c) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    public v0(@fg.l w0 w0Var, @fg.l j0 j0Var, @fg.m i2 i2Var, boolean z4, boolean z5, @fg.m e0 e0Var, @fg.m androidx.compose.foundation.interaction.k kVar, @fg.l k kVar2) {
        t0.g gVar;
        this.state = w0Var;
        this.orientation = j0Var;
        this.overscrollEffect = i2Var;
        this.enabled = z4;
        this.reverseDirection = z5;
        this.flingBehavior = e0Var;
        this.interactionSource = kVar;
        androidx.compose.ui.input.nestedscroll.b bVar = new androidx.compose.ui.input.nestedscroll.b();
        this.nestedScrollDispatcher = bVar;
        gVar = t0.f4331h;
        p pVar = new p(androidx.compose.animation.a1.c(gVar), null, 2, null);
        this.defaultFlingBehavior = pVar;
        w0 w0Var2 = this.state;
        j0 j0Var2 = this.orientation;
        i2 i2Var2 = this.overscrollEffect;
        boolean z6 = this.reverseDirection;
        e0 e0Var2 = this.flingBehavior;
        y0 y0Var = new y0(w0Var2, j0Var2, i2Var2, z6, e0Var2 == null ? pVar : e0Var2, bVar);
        this.scrollingLogic = y0Var;
        u0 u0Var = new u0(y0Var, this.enabled);
        this.nestedScrollConnection = u0Var;
        l lVar = (l) y7(new l(this.orientation, this.state, this.reverseDirection, kVar2));
        this.contentInViewNode = lVar;
        this.scrollableContainer = (h0) y7(new h0(this.enabled));
        y7(androidx.compose.ui.input.nestedscroll.e.b(u0Var, bVar));
        y7(new FocusTargetNode());
        y7(new androidx.compose.foundation.relocation.j(lVar));
        y7(new i1(new a()));
        this.scrollableGesturesNode = (s0) y7(new s0(y0Var, this.orientation, this.enabled, bVar, this.interactionSource));
    }

    private final void R7() {
        this.defaultFlingBehavior.d(androidx.compose.animation.a1.c((androidx.compose.ui.unit.d) androidx.compose.ui.node.i.a(this, androidx.compose.ui.platform.h1.i())));
    }

    @fg.l
    /* renamed from: J7, reason: from getter */
    public final l getContentInViewNode() {
        return this.contentInViewNode;
    }

    @fg.l
    /* renamed from: K7, reason: from getter */
    public final p getDefaultFlingBehavior() {
        return this.defaultFlingBehavior;
    }

    @fg.l
    /* renamed from: L7, reason: from getter */
    public final u0 getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    @fg.l
    /* renamed from: M7, reason: from getter */
    public final androidx.compose.ui.input.nestedscroll.b getNestedScrollDispatcher() {
        return this.nestedScrollDispatcher;
    }

    @fg.l
    /* renamed from: N7, reason: from getter */
    public final h0 getScrollableContainer() {
        return this.scrollableContainer;
    }

    @fg.l
    /* renamed from: O7, reason: from getter */
    public final s0 getScrollableGesturesNode() {
        return this.scrollableGesturesNode;
    }

    @fg.l
    /* renamed from: P7, reason: from getter */
    public final y0 getScrollingLogic() {
        return this.scrollingLogic;
    }

    public final void Q7(@fg.l w0 state, @fg.l j0 orientation, @fg.m i2 overscrollEffect, boolean enabled, boolean reverseDirection, @fg.m e0 flingBehavior, @fg.m androidx.compose.foundation.interaction.k interactionSource, @fg.l k bringIntoViewSpec) {
        if (this.enabled != enabled) {
            this.nestedScrollConnection.c(enabled);
            this.scrollableContainer.z7(enabled);
        }
        this.scrollingLogic.s(state, orientation, overscrollEffect, reverseDirection, flingBehavior == null ? this.defaultFlingBehavior : flingBehavior, this.nestedScrollDispatcher);
        this.scrollableGesturesNode.Q7(orientation, enabled, interactionSource);
        this.contentInViewNode.V7(orientation, state, reverseDirection, bringIntoViewSpec);
        this.state = state;
        this.orientation = orientation;
        this.overscrollEffect = overscrollEffect;
        this.enabled = enabled;
        this.reverseDirection = reverseDirection;
        this.flingBehavior = flingBehavior;
        this.interactionSource = interactionSource;
    }

    @Override // androidx.compose.ui.focus.w
    public void V3(@fg.l androidx.compose.ui.focus.t focusProperties) {
        focusProperties.m(false);
    }

    @Override // androidx.compose.ui.node.k1
    public void d2() {
        R7();
    }

    @Override // androidx.compose.ui.q.d
    public void i7() {
        R7();
        l1.a(this, new b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (androidx.compose.ui.input.key.b.E4(r0, androidx.compose.ui.input.key.b.f18583n1) != false) goto L8;
     */
    @Override // androidx.compose.ui.input.key.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean k4(@fg.l android.view.KeyEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.enabled
            if (r0 == 0) goto La4
            long r0 = androidx.compose.ui.input.key.e.a(r10)
            androidx.compose.ui.input.key.b$a r2 = androidx.compose.ui.input.key.b.INSTANCE
            r2.getClass()
            long r3 = androidx.compose.ui.input.key.b.C2()
            boolean r0 = androidx.compose.ui.input.key.b.E4(r0, r3)
            if (r0 != 0) goto L28
            long r0 = androidx.compose.ui.input.key.e.a(r10)
            r2.getClass()
            long r3 = androidx.compose.ui.input.key.b.D2()
            boolean r0 = androidx.compose.ui.input.key.b.E4(r0, r3)
            if (r0 == 0) goto La4
        L28:
            int r0 = androidx.compose.ui.input.key.e.b(r10)
            androidx.compose.ui.input.key.d$a r1 = androidx.compose.ui.input.key.d.INSTANCE
            r1.getClass()
            int r1 = androidx.compose.ui.input.key.d.a()
            boolean r0 = androidx.compose.ui.input.key.d.g(r0, r1)
            if (r0 == 0) goto La4
            boolean r0 = r10.isCtrlPressed()
            if (r0 != 0) goto La4
            androidx.compose.foundation.gestures.y0 r0 = r9.scrollingLogic
            androidx.compose.foundation.gestures.j0 r1 = r9.orientation
            androidx.compose.foundation.gestures.j0 r3 = androidx.compose.foundation.gestures.j0.Vertical
            r4 = 0
            if (r1 != r3) goto L6e
            androidx.compose.foundation.gestures.l r1 = r9.contentInViewNode
            long r5 = r1.getViewportSize()
            int r1 = androidx.compose.ui.unit.u.j(r5)
            long r5 = androidx.compose.ui.input.key.e.a(r10)
            r2.getClass()
            long r2 = androidx.compose.ui.input.key.b.D2()
            boolean r10 = androidx.compose.ui.input.key.b.E4(r5, r2)
            if (r10 == 0) goto L67
            float r10 = (float) r1
            goto L69
        L67:
            float r10 = (float) r1
            float r10 = -r10
        L69:
            long r1 = i0.g.a(r4, r10)
            goto L91
        L6e:
            androidx.compose.foundation.gestures.l r1 = r9.contentInViewNode
            long r5 = r1.getViewportSize()
            int r1 = androidx.compose.ui.unit.u.m(r5)
            long r5 = androidx.compose.ui.input.key.e.a(r10)
            r2.getClass()
            long r2 = androidx.compose.ui.input.key.b.D2()
            boolean r10 = androidx.compose.ui.input.key.b.E4(r5, r2)
            if (r10 == 0) goto L8b
            float r10 = (float) r1
            goto L8d
        L8b:
            float r10 = (float) r1
            float r10 = -r10
        L8d:
            long r1 = i0.g.a(r10, r4)
        L91:
            kotlinx.coroutines.r0 r3 = r9.V6()
            androidx.compose.foundation.gestures.v0$c r6 = new androidx.compose.foundation.gestures.v0$c
            r10 = 0
            r6.<init>(r0, r1, r10)
            r7 = 3
            r8 = 0
            r4 = 0
            r5 = 0
            kotlinx.coroutines.i.e(r3, r4, r5, r6, r7, r8)
            r10 = 1
            goto La5
        La4:
            r10 = 0
        La5:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.v0.k4(android.view.KeyEvent):boolean");
    }

    @Override // androidx.compose.ui.input.key.g
    public boolean n3(@fg.l KeyEvent event) {
        return false;
    }
}
