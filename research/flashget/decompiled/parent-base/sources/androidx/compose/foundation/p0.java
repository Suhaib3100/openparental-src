package androidx.compose.foundation;

import androidx.compose.foundation.a;
import kotlin.Metadata;

/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0010\u001a\u00020\u0007*\u00020\u000fH\u0094@¢\u0006\u0004\b\u0010\u0010\u0011JK\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\u0012\u0010\u0013R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/p0;", "Landroidx/compose/foundation/b;", "", "enabled", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "Lkotlin/Function0;", "Lkotlin/k2;", "onClick", "Landroidx/compose/foundation/a$a;", "interactionData", "onLongClick", "onDoubleClick", "<init>", "(ZLandroidx/compose/foundation/interaction/k;Lld/a;Landroidx/compose/foundation/a$a;Lld/a;Lld/a;)V", "Landroidx/compose/ui/input/pointer/k0;", "O7", "(Landroidx/compose/ui/input/pointer/k0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "U7", "(ZLandroidx/compose/foundation/interaction/k;Lld/a;Lld/a;Lld/a;)V", "y", "Lld/a;", "z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/CombinedClickablePointerInputNode\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,1070:1\n157#2:1071\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/CombinedClickablePointerInputNode\n*L\n1018#1:1071\n*E\n"})
/* loaded from: classes.dex */
final class p0 extends androidx.compose.foundation.b {

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.a<kotlin.k2> onLongClick;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.a<kotlin.k2> onDoubleClick;

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "it", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<i0.f, kotlin.k2> {
        a() {
            super(1);
        }

        public final void a(long j4) {
            ld.a aVar = p0.this.onDoubleClick;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i0.f fVar) {
            a(fVar.getPackedValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "it", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<i0.f, kotlin.k2> {
        b() {
            super(1);
        }

        public final void a(long j4) {
            ld.a aVar = p0.this.onLongClick;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i0.f fVar) {
            a(fVar.getPackedValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Clickable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.CombinedClickablePointerInputNode$pointerInput$4", f = "Clickable.kt", i = {}, l = {1028}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/l0;", "Li0/f;", "offset", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/l0;Li0/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.coroutines.jvm.internal.o implements ld.q<androidx.compose.foundation.gestures.l0, i0.f, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f6642b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f6643c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ long f6644d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(3, dVar);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Object R(androidx.compose.foundation.gestures.l0 l0Var, i0.f fVar, kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return a(l0Var, fVar.getPackedValue(), dVar);
        }

        @fg.m
        public final Object a(@fg.l androidx.compose.foundation.gestures.l0 l0Var, long j4, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            c cVar = p0.this.new c(dVar);
            cVar.f6643c = l0Var;
            cVar.f6644d = j4;
            return cVar.invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f6642b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.compose.foundation.gestures.l0 l0Var = (androidx.compose.foundation.gestures.l0) this.f6643c;
                long j4 = this.f6644d;
                if (p0.this.getEnabled()) {
                    p0 p0Var = p0.this;
                    this.f6642b = 1;
                    if (p0Var.N7(l0Var, j4, this) == aVar) {
                        return aVar;
                    }
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

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "it", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<i0.f, kotlin.k2> {
        d() {
            super(1);
        }

        public final void a(long j4) {
            if (p0.this.getEnabled()) {
                p0.this.M7().invoke();
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i0.f fVar) {
            a(fVar.getPackedValue());
            return kotlin.k2.f75408a;
        }
    }

    public p0(boolean z4, @fg.l androidx.compose.foundation.interaction.k kVar, @fg.l ld.a<kotlin.k2> aVar, @fg.l a.C0051a c0051a, @fg.m ld.a<kotlin.k2> aVar2, @fg.m ld.a<kotlin.k2> aVar3) {
        super(z4, kVar, aVar, c0051a, null);
        this.onLongClick = aVar2;
        this.onDoubleClick = aVar3;
    }

    @Override // androidx.compose.foundation.b
    @fg.m
    protected Object O7(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        a.C0051a interactionData = getInteractionData();
        long b5 = androidx.compose.ui.unit.v.b(k0Var.getBoundsSize());
        interactionData.d(i0.g.a(androidx.compose.ui.unit.q.m(b5), (int) (b5 & 4294967295L)));
        Object l4 = androidx.compose.foundation.gestures.z0.l(k0Var, (!getEnabled() || this.onDoubleClick == null) ? null : new a(), (!getEnabled() || this.onLongClick == null) ? null : new b(), new c(null), new d(), dVar);
        return l4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? l4 : kotlin.k2.f75408a;
    }

    public final void U7(boolean enabled, @fg.l androidx.compose.foundation.interaction.k interactionSource, @fg.l ld.a<kotlin.k2> onClick, @fg.m ld.a<kotlin.k2> onLongClick, @fg.m ld.a<kotlin.k2> onDoubleClick) {
        boolean z4;
        R7(onClick);
        Q7(interactionSource);
        if (getEnabled() != enabled) {
            P7(enabled);
            z4 = true;
        } else {
            z4 = false;
        }
        if ((this.onLongClick == null) != (onLongClick == null)) {
            z4 = true;
        }
        this.onLongClick = onLongClick;
        boolean z5 = (this.onDoubleClick == null) == (onDoubleClick == null) ? z4 : true;
        this.onDoubleClick = onDoubleClick;
        if (z5) {
            g3();
        }
    }
}
