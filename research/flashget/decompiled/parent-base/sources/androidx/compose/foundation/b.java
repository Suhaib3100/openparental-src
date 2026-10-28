package androidx.compose.foundation;

import androidx.compose.foundation.a;
import kotlin.Metadata;

/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B1\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0011\u001a\u00020\n*\u00020\u0010H¤@¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\n*\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001eH\u0084@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\nH\u0004¢\u0006\u0004\b\"\u0010\u001cR\"\u0010\u0006\u001a\u00020\u00058\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u0010\r\u001a\u00020\f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00100R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=\u0082\u0001\u0002?@\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A"}, d2 = {"Landroidx/compose/foundation/b;", "Landroidx/compose/ui/node/l;", "Landroidx/compose/ui/modifier/j;", "Landroidx/compose/ui/node/h;", "Landroidx/compose/ui/node/u1;", "", "enabled", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "Lkotlin/Function0;", "Lkotlin/k2;", "onClick", "Landroidx/compose/foundation/a$a;", "interactionData", "<init>", "(ZLandroidx/compose/foundation/interaction/k;Lld/a;Landroidx/compose/foundation/a$a;)V", "Landroidx/compose/ui/input/pointer/k0;", "O7", "(Landroidx/compose/ui/input/pointer/k0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/p;", "pointerEvent", "Landroidx/compose/ui/input/pointer/r;", "pass", "Landroidx/compose/ui/unit/u;", "bounds", "g1", "(Landroidx/compose/ui/input/pointer/p;Landroidx/compose/ui/input/pointer/r;J)V", "E4", "()V", "Landroidx/compose/foundation/gestures/l0;", "Li0/f;", "offset", "N7", "(Landroidx/compose/foundation/gestures/l0;JLkotlin/coroutines/d;)Ljava/lang/Object;", "g3", "s", "Z", "J7", "()Z", "P7", "(Z)V", "t", "Landroidx/compose/foundation/interaction/k;", "L7", "()Landroidx/compose/foundation/interaction/k;", "Q7", "(Landroidx/compose/foundation/interaction/k;)V", "u", "Lld/a;", "M7", "()Lld/a;", "R7", "(Lld/a;)V", "v", "Landroidx/compose/foundation/a$a;", "K7", "()Landroidx/compose/foundation/a$a;", "w", "delayPressInteraction", "Landroidx/compose/ui/input/pointer/v0;", "x", "Landroidx/compose/ui/input/pointer/v0;", "pointerInputNode", "Landroidx/compose/foundation/j0;", "Landroidx/compose/foundation/p0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
abstract class b extends androidx.compose.ui.node.l implements androidx.compose.ui.modifier.j, androidx.compose.ui.node.h, androidx.compose.ui.node.u1 {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.foundation.interaction.k interactionSource;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.a<kotlin.k2> onClick;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final a.C0051a interactionData;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<Boolean> delayPressInteraction;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.input.pointer.v0 pointerInputNode;

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {
        a() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(((Boolean) b.this.v(androidx.compose.foundation.gestures.t0.h())).booleanValue() || l0.c(b.this));
        }
    }

    /* compiled from: Clickable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickablePointerInputNode$pointerInputNode$1", f = "Clickable.kt", i = {}, l = {938}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/k0;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.b$b, reason: collision with other inner class name */
    static final class C0052b extends kotlin.coroutines.jvm.internal.o implements ld.p<androidx.compose.ui.input.pointer.k0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f3535b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f3536c;

        C0052b(kotlin.coroutines.d<? super C0052b> dVar) {
            super(2, dVar);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((C0052b) create(k0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            C0052b c0052b = b.this.new C0052b(dVar);
            c0052b.f3536c = obj;
            return c0052b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f3535b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.compose.ui.input.pointer.k0 k0Var = (androidx.compose.ui.input.pointer.k0) this.f3536c;
                b bVar = b.this;
                this.f3535b = 1;
                if (bVar.O7(k0Var, this) == aVar) {
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

    public /* synthetic */ b(boolean z4, androidx.compose.foundation.interaction.k kVar, ld.a aVar, a.C0051a c0051a, kotlin.jvm.internal.w wVar) {
        this(z4, kVar, aVar, c0051a);
    }

    @Override // androidx.compose.ui.node.u1
    public void E4() {
        this.pointerInputNode.E4();
    }

    /* renamed from: J7, reason: from getter */
    protected final boolean getEnabled() {
        return this.enabled;
    }

    @fg.l
    /* renamed from: K7, reason: from getter */
    protected final a.C0051a getInteractionData() {
        return this.interactionData;
    }

    @fg.m
    /* renamed from: L7, reason: from getter */
    protected final androidx.compose.foundation.interaction.k getInteractionSource() {
        return this.interactionSource;
    }

    @fg.l
    protected final ld.a<kotlin.k2> M7() {
        return this.onClick;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0004, code lost:
    
        r8 = androidx.compose.foundation.g0.n(r8, r9, r3, r7.interactionData, r7.delayPressInteraction, r11);
     */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final java.lang.Object N7(@fg.l androidx.compose.foundation.gestures.l0 r8, long r9, @fg.l kotlin.coroutines.d<? super kotlin.k2> r11) {
        /*
            r7 = this;
            androidx.compose.foundation.interaction.k r3 = r7.interactionSource
            if (r3 == 0) goto L14
            androidx.compose.foundation.a$a r4 = r7.interactionData
            ld.a<java.lang.Boolean> r5 = r7.delayPressInteraction
            r0 = r8
            r1 = r9
            r6 = r11
            java.lang.Object r8 = androidx.compose.foundation.g0.b(r0, r1, r3, r4, r5, r6)
            kotlin.coroutines.intrinsics.a r9 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            if (r8 != r9) goto L14
            return r8
        L14:
            kotlin.k2 r8 = kotlin.k2.f75408a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.b.N7(androidx.compose.foundation.gestures.l0, long, kotlin.coroutines.d):java.lang.Object");
    }

    @fg.m
    protected abstract Object O7(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar);

    protected final void P7(boolean z4) {
        this.enabled = z4;
    }

    protected final void Q7(@fg.m androidx.compose.foundation.interaction.k kVar) {
        this.interactionSource = kVar;
    }

    protected final void R7(@fg.l ld.a<kotlin.k2> aVar) {
        this.onClick = aVar;
    }

    @Override // androidx.compose.ui.node.u1
    public void g1(@fg.l androidx.compose.ui.input.pointer.p pointerEvent, @fg.l androidx.compose.ui.input.pointer.r pass, long bounds) {
        this.pointerInputNode.g1(pointerEvent, pass, bounds);
    }

    protected final void g3() {
        this.pointerInputNode.g3();
    }

    private b(boolean z4, androidx.compose.foundation.interaction.k kVar, ld.a<kotlin.k2> aVar, a.C0051a c0051a) {
        this.enabled = z4;
        this.interactionSource = kVar;
        this.onClick = aVar;
        this.interactionData = c0051a;
        this.delayPressInteraction = new a();
        this.pointerInputNode = (androidx.compose.ui.input.pointer.v0) y7(androidx.compose.ui.input.pointer.u0.a(new C0052b(null)));
    }
}
