package androidx.compose.foundation;

import kotlin.Metadata;

/* compiled from: Focusable.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\tJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\f*\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Landroidx/compose/foundation/d1;", "Landroidx/compose/ui/node/l;", "Landroidx/compose/ui/focus/i;", "Landroidx/compose/ui/node/b0;", "Landroidx/compose/ui/node/y1;", "Landroidx/compose/ui/node/s;", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "<init>", "(Landroidx/compose/foundation/interaction/k;)V", "Landroidx/compose/ui/layout/u;", "coordinates", "Lkotlin/k2;", "q", "(Landroidx/compose/ui/layout/u;)V", "K7", "Landroidx/compose/ui/focus/j0;", "focusState", "e0", "(Landroidx/compose/ui/focus/j0;)V", "Landroidx/compose/ui/semantics/z;", "f6", "(Landroidx/compose/ui/semantics/z;)V", "W", "s", "Landroidx/compose/ui/focus/j0;", "Landroidx/compose/foundation/f1;", "t", "Landroidx/compose/foundation/f1;", "focusableSemanticsNode", "Landroidx/compose/foundation/c1;", "u", "Landroidx/compose/foundation/c1;", "focusableInteractionNode", "Landroidx/compose/foundation/e1;", "v", "Landroidx/compose/foundation/e1;", "focusablePinnableContainer", "Landroidx/compose/foundation/h1;", "w", "Landroidx/compose/foundation/h1;", "focusedBoundsNode", "Landroidx/compose/foundation/relocation/d;", "x", "Landroidx/compose/foundation/relocation/d;", "bringIntoViewRequester", "Landroidx/compose/foundation/relocation/g;", "y", "Landroidx/compose/foundation/relocation/g;", "bringIntoViewRequesterNode", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nFocusable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,374:1\n1#2:375\n*E\n"})
/* loaded from: classes.dex */
final class d1 extends androidx.compose.ui.node.l implements androidx.compose.ui.focus.i, androidx.compose.ui.node.b0, androidx.compose.ui.node.y1, androidx.compose.ui.node.s {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.focus.j0 focusState;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c1 focusableInteractionNode;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.relocation.d bringIntoViewRequester;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.relocation.g bringIntoViewRequesterNode;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final f1 focusableSemanticsNode = (f1) y7(new f1());

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e1 focusablePinnableContainer = (e1) y7(new e1());

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h1 focusedBoundsNode = (h1) y7(new h1());

    /* compiled from: Focusable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.FocusableNode$onFocusEvent$1", f = "Focusable.kt", i = {}, l = {238}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f3609b;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return d1.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f3609b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.compose.foundation.relocation.d dVar = d1.this.bringIntoViewRequester;
                this.f3609b = 1;
                if (androidx.compose.foundation.relocation.d.b(dVar, null, this, 1, null) == aVar) {
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

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    public d1(@fg.m androidx.compose.foundation.interaction.k kVar) {
        this.focusableInteractionNode = (c1) y7(new c1(kVar));
        androidx.compose.foundation.relocation.d a5 = androidx.compose.foundation.relocation.f.a();
        this.bringIntoViewRequester = a5;
        this.bringIntoViewRequesterNode = (androidx.compose.foundation.relocation.g) y7(new androidx.compose.foundation.relocation.g(a5));
    }

    public final void K7(@fg.m androidx.compose.foundation.interaction.k interactionSource) {
        this.focusableInteractionNode.B7(interactionSource);
    }

    @Override // androidx.compose.ui.node.s
    public void W(@fg.l androidx.compose.ui.layout.u coordinates) {
        this.focusedBoundsNode.W(coordinates);
    }

    @Override // androidx.compose.ui.focus.i
    public void e0(@fg.l androidx.compose.ui.focus.j0 focusState) {
        if (kotlin.jvm.internal.l0.g(this.focusState, focusState)) {
            return;
        }
        boolean isFocused = focusState.isFocused();
        if (isFocused) {
            kotlinx.coroutines.k.f(V6(), null, null, new a(null), 3, null);
        }
        if (getIsAttached()) {
            androidx.compose.ui.node.z1.b(this);
        }
        this.focusableInteractionNode.A7(isFocused);
        this.focusedBoundsNode.A7(isFocused);
        this.focusablePinnableContainer.z7(isFocused);
        this.focusableSemanticsNode.y7(isFocused);
        this.focusState = focusState;
    }

    @Override // androidx.compose.ui.node.y1
    public void f6(@fg.l androidx.compose.ui.semantics.z zVar) {
        this.focusableSemanticsNode.f6(zVar);
    }

    @Override // androidx.compose.ui.node.b0
    public void q(@fg.l androidx.compose.ui.layout.u coordinates) {
        this.bringIntoViewRequesterNode.q(coordinates);
    }
}
