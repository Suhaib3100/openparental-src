package androidx.compose.foundation.gestures;

import androidx.compose.foundation.a2;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJA\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2'\u0010\u0012\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e¢\u0006\u0002\b\u0011H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u000bR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u0006R\"\u0010!\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Landroidx/compose/foundation/gestures/o0;", "Landroidx/compose/foundation/gestures/d0;", "Landroidx/compose/foundation/gestures/v;", "Landroidx/compose/foundation/gestures/y0;", "scrollLogic", "<init>", "(Landroidx/compose/foundation/gestures/y0;)V", "", "pixels", "Lkotlin/k2;", "c", "(F)V", "Landroidx/compose/foundation/a2;", "dragPriority", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "a", "(Landroidx/compose/foundation/a2;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "delta", "b", "Landroidx/compose/foundation/gestures/y0;", "f", "()Landroidx/compose/foundation/gestures/y0;", "h", "Landroidx/compose/foundation/gestures/q0;", "Landroidx/compose/foundation/gestures/q0;", "e", "()Landroidx/compose/foundation/gestures/q0;", "g", "(Landroidx/compose/foundation/gestures/q0;)V", "latestScrollScope", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollDraggableState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1021:1\n1#2:1022\n*E\n"})
/* loaded from: classes.dex */
final class o0 implements d0, v {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private y0 scrollLogic;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private q0 latestScrollScope;

    /* compiled from: Scrollable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollDraggableState$drag$2", f = "Scrollable.kt", i = {}, l = {894}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/q0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/q0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<q0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f4170b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f4171c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<v, kotlin.coroutines.d<? super k2>, Object> f4173e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.p<? super v, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f4173e = pVar;
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
            a aVar = o0.this.new a(this.f4173e, dVar);
            aVar.f4171c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f4170b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                o0.this.g((q0) this.f4171c);
                ld.p<v, kotlin.coroutines.d<? super k2>, Object> pVar = this.f4173e;
                o0 o0Var = o0.this;
                this.f4170b = 1;
                if (pVar.invoke(o0Var, this) == aVar) {
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

    public o0(@fg.l y0 y0Var) {
        q0 q0Var;
        this.scrollLogic = y0Var;
        q0Var = t0.f4326c;
        this.latestScrollScope = q0Var;
    }

    @Override // androidx.compose.foundation.gestures.d0
    @fg.m
    public Object a(@fg.l a2 a2Var, @fg.l ld.p<? super v, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object f4 = this.scrollLogic.getScrollableState().f(a2Var, new a(pVar, null), dVar);
        return f4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? f4 : k2.f75408a;
    }

    @Override // androidx.compose.foundation.gestures.d0
    public void b(float delta) {
        y0 y0Var = this.scrollLogic;
        y0Var.h(y0Var.r(delta));
    }

    @Override // androidx.compose.foundation.gestures.v
    public void c(float pixels) {
        y0 y0Var = this.scrollLogic;
        q0 q0Var = this.latestScrollScope;
        long r4 = y0Var.r(pixels);
        androidx.compose.ui.input.nestedscroll.f.INSTANCE.getClass();
        y0Var.c(q0Var, r4, androidx.compose.ui.input.nestedscroll.f.f18687c);
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final q0 getLatestScrollScope() {
        return this.latestScrollScope;
    }

    @fg.l
    /* renamed from: f, reason: from getter */
    public final y0 getScrollLogic() {
        return this.scrollLogic;
    }

    public final void g(@fg.l q0 q0Var) {
        this.latestScrollScope = q0Var;
    }

    public final void h(@fg.l y0 y0Var) {
        this.scrollLogic = y0Var;
    }
}
