package androidx.compose.foundation.gestures;

import androidx.compose.runtime.b5;
import androidx.compose.runtime.o4;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: Draggable2D.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001aÅ\u0001\u0010\u001d\u001a\u00020\t*\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2>\b\u0002\u0010\u0018\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0010¢\u0006\u0002\b\u00172>\b\u0002\u0010\u001b\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0010¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\"\u001a\u0010#\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u0012\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lkotlin/Function1;", "Li0/f;", "Lkotlin/k2;", "onDelta", "Landroidx/compose/foundation/gestures/y;", "a", "(Lld/l;)Landroidx/compose/foundation/gestures/y;", "f", "(Lld/l;Landroidx/compose/runtime/t;I)Landroidx/compose/foundation/gestures/y;", "Landroidx/compose/ui/q;", "state", "", "enabled", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lkotlinx/coroutines/r0;", "Lkotlin/r0;", "name", "startedPosition", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "onDragStarted", "Landroidx/compose/ui/unit/c0;", "velocity", "onDragStopped", "reverseDirection", "c", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/gestures/y;ZLandroidx/compose/foundation/interaction/k;ZLld/q;Lld/q;Z)Landroidx/compose/ui/q;", "Landroidx/compose/foundation/gestures/s;", "Landroidx/compose/foundation/gestures/s;", "e", "()V", "NoOpDrag2DScope", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nDraggable2D.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable2D.kt\nandroidx/compose/foundation/gestures/Draggable2DKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,362:1\n25#2:363\n1116#3,6:364\n*S KotlinDebug\n*F\n+ 1 Draggable2D.kt\nandroidx/compose/foundation/gestures/Draggable2DKt\n*L\n121#1:363\n121#1:364,6\n*E\n"})
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final s f4520a = new a();

    /* compiled from: Draggable2D.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"androidx/compose/foundation/gestures/w$a", "Landroidx/compose/foundation/gestures/s;", "Li0/f;", "pixels", "Lkotlin/k2;", "a", "(J)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements s {
        a() {
        }

        @Override // androidx.compose.foundation.gestures.s
        public void a(long pixels) {
        }
    }

    /* compiled from: Draggable2D.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.Draggable2DKt$draggable2D$1", f = "Draggable2D.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/r0;", "Li0/f;", "it", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;Li0/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.r0, i0.f, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f4521b;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(3, dVar);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Object R(kotlinx.coroutines.r0 r0Var, i0.f fVar, kotlin.coroutines.d<? super k2> dVar) {
            return a(r0Var, fVar.getPackedValue(), dVar);
        }

        @fg.m
        public final Object a(@fg.l kotlinx.coroutines.r0 r0Var, long j4, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return new b(3, dVar).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f4521b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            return k2.f75408a;
        }
    }

    /* compiled from: Draggable2D.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.Draggable2DKt$draggable2D$2", f = "Draggable2D.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/r0;", "Landroidx/compose/ui/unit/c0;", "it", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;Landroidx/compose/ui/unit/c0;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.r0, androidx.compose.ui.unit.c0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f4522b;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(3, dVar);
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Object R(kotlinx.coroutines.r0 r0Var, androidx.compose.ui.unit.c0 c0Var, kotlin.coroutines.d<? super k2> dVar) {
            return a(r0Var, c0Var.getPackedValue(), dVar);
        }

        @fg.m
        public final Object a(@fg.l kotlinx.coroutines.r0 r0Var, long j4, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return new c(3, dVar).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f4522b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            return k2.f75408a;
        }
    }

    /* compiled from: Draggable2D.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/b0;", "it", "", "a", "(Landroidx/compose/ui/input/pointer/b0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.input.pointer.b0, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f4523b = new d(1);

        d() {
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

    /* compiled from: Draggable2D.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f4524b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z4) {
            super(0);
            this.f4524b = z4;
        }

        @fg.l
        public final Boolean a() {
            return Boolean.valueOf(this.f4524b);
        }

        @Override // ld.a
        public Boolean invoke() {
            return Boolean.valueOf(this.f4524b);
        }
    }

    /* compiled from: Draggable2D.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "it", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.l<i0.f, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b5<ld.l<i0.f, k2>> f4525b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(b5<? extends ld.l<? super i0.f, k2>> b5Var) {
            super(1);
            this.f4525b = b5Var;
        }

        public final void a(long j4) {
            this.f4525b.getValue().invoke(i0.f.d(j4));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(i0.f fVar) {
            a(fVar.getPackedValue());
            return k2.f75408a;
        }
    }

    @fg.l
    @androidx.compose.foundation.z0
    public static final y a(@fg.l ld.l<? super i0.f, k2> lVar) {
        return new n(lVar);
    }

    @fg.l
    @androidx.compose.foundation.z0
    public static final androidx.compose.ui.q c(@fg.l androidx.compose.ui.q qVar, @fg.l y yVar, boolean z4, @fg.m androidx.compose.foundation.interaction.k kVar, boolean z5, @fg.l ld.q<? super kotlinx.coroutines.r0, ? super i0.f, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar2, @fg.l ld.q<? super kotlinx.coroutines.r0, ? super androidx.compose.ui.unit.c0, ? super kotlin.coroutines.d<? super k2>, ? extends Object> qVar3, boolean z6) {
        return qVar.w3(new Draggable2DElement(yVar, d.f4523b, z4, kVar, new e(z5), qVar2, qVar3, z6));
    }

    public static androidx.compose.ui.q d(androidx.compose.ui.q qVar, y yVar, boolean z4, androidx.compose.foundation.interaction.k kVar, boolean z5, ld.q qVar2, ld.q qVar3, boolean z6, int i4, Object obj) {
        return c(qVar, yVar, (i4 & 2) != 0 ? true : z4, (i4 & 4) != 0 ? null : kVar, (i4 & 8) != 0 ? false : z5, (i4 & 16) != 0 ? new b(3, null) : qVar2, (i4 & 32) != 0 ? new c(3, null) : qVar3, (i4 & 64) == 0 ? z6 : false);
    }

    private static /* synthetic */ void e() {
    }

    @fg.l
    @androidx.compose.foundation.z0
    @androidx.compose.runtime.i
    public static final y f(@fg.l ld.l<? super i0.f, k2> lVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1150277615);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1150277615, i4, -1, "androidx.compose.foundation.gestures.rememberDraggable2DState (Draggable2D.kt:118)");
        }
        b5 u4 = o4.u(lVar, tVar, i4 & 14);
        tVar.P(-492369756);
        Object Q = tVar.Q();
        if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
            n nVar = new n(new f(u4));
            tVar.E(nVar);
            Q = nVar;
        }
        tVar.p0();
        y yVar = (y) Q;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return yVar;
    }
}
