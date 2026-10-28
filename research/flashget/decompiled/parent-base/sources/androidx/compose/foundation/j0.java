package androidx.compose.foundation;

import androidx.compose.foundation.a;
import kotlin.Metadata;

/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u000e\u001a\u00020\u0007*\u00020\rH\u0094@¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/j0;", "Landroidx/compose/foundation/b;", "", "enabled", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "Lkotlin/Function0;", "Lkotlin/k2;", "onClick", "Landroidx/compose/foundation/a$a;", "interactionData", "<init>", "(ZLandroidx/compose/foundation/interaction/k;Lld/a;Landroidx/compose/foundation/a$a;)V", "Landroidx/compose/ui/input/pointer/k0;", "O7", "(Landroidx/compose/ui/input/pointer/k0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "S7", "(ZLandroidx/compose/foundation/interaction/k;Lld/a;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickablePointerInputNode\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,1070:1\n157#2:1071\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickablePointerInputNode\n*L\n980#1:1071\n*E\n"})
/* loaded from: classes.dex */
final class j0 extends androidx.compose.foundation.b {

    /* compiled from: Clickable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.ClickablePointerInputNode$pointerInput$2", f = "Clickable.kt", i = {}, l = {984}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/l0;", "Li0/f;", "offset", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/l0;Li0/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.q<androidx.compose.foundation.gestures.l0, i0.f, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f4715b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f4716c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ long f4717d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Object R(androidx.compose.foundation.gestures.l0 l0Var, i0.f fVar, kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return a(l0Var, fVar.getPackedValue(), dVar);
        }

        @fg.m
        public final Object a(@fg.l androidx.compose.foundation.gestures.l0 l0Var, long j4, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            a aVar = j0.this.new a(dVar);
            aVar.f4716c = l0Var;
            aVar.f4717d = j4;
            return aVar.invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f4715b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.compose.foundation.gestures.l0 l0Var = (androidx.compose.foundation.gestures.l0) this.f4716c;
                long j4 = this.f4717d;
                if (j0.this.getEnabled()) {
                    j0 j0Var = j0.this;
                    this.f4715b = 1;
                    if (j0Var.N7(l0Var, j4, this) == aVar) {
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
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<i0.f, kotlin.k2> {
        b() {
            super(1);
        }

        public final void a(long j4) {
            if (j0.this.getEnabled()) {
                j0.this.M7().invoke();
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i0.f fVar) {
            a(fVar.getPackedValue());
            return kotlin.k2.f75408a;
        }
    }

    public j0(boolean z4, @fg.l androidx.compose.foundation.interaction.k kVar, @fg.l ld.a<kotlin.k2> aVar, @fg.l a.C0051a c0051a) {
        super(z4, kVar, aVar, c0051a, null);
    }

    @Override // androidx.compose.foundation.b
    @fg.m
    protected Object O7(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        a.C0051a interactionData = getInteractionData();
        long b5 = androidx.compose.ui.unit.v.b(k0Var.getBoundsSize());
        interactionData.d(i0.g.a(androidx.compose.ui.unit.q.m(b5), (int) (b5 & 4294967295L)));
        Object j4 = androidx.compose.foundation.gestures.z0.j(k0Var, new a(null), new b(), dVar);
        return j4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? j4 : kotlin.k2.f75408a;
    }

    public final void S7(boolean enabled, @fg.l androidx.compose.foundation.interaction.k interactionSource, @fg.l ld.a<kotlin.k2> onClick) {
        P7(enabled);
        R7(onClick);
        Q7(interactionSource);
    }
}
