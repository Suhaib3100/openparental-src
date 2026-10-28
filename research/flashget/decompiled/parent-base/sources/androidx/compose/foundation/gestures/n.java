package androidx.compose.foundation.gestures;

import androidx.compose.foundation.a2;
import androidx.compose.foundation.c2;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Draggable2D.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007JA\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\n¢\u0006\u0002\b\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/gestures/n;", "Landroidx/compose/foundation/gestures/y;", "Lkotlin/Function1;", "Li0/f;", "Lkotlin/k2;", "onDelta", "<init>", "(Lld/l;)V", "Landroidx/compose/foundation/a2;", "dragPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/s;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "a", "(Landroidx/compose/foundation/a2;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "delta", "c", "(J)V", "Lld/l;", "f", "()Lld/l;", "b", "Landroidx/compose/foundation/gestures/s;", "drag2DScope", "Landroidx/compose/foundation/c2;", "Landroidx/compose/foundation/c2;", "drag2DMutex", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class n implements y {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<i0.f, k2> onDelta;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final s drag2DScope = new b();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c2 drag2DMutex = new c2();

    /* compiled from: Draggable2D.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DefaultDraggable2DState$drag$2", f = "Draggable2D.kt", i = {}, l = {355}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f4155b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a2 f4157d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<s, kotlin.coroutines.d<? super k2>, Object> f4158e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(a2 a2Var, ld.p<? super s, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f4157d = a2Var;
            this.f4158e = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return n.this.new a(this.f4157d, this.f4158e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f4155b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                c2 c2Var = n.this.drag2DMutex;
                s sVar = n.this.drag2DScope;
                a2 a2Var = this.f4157d;
                ld.p<s, kotlin.coroutines.d<? super k2>, Object> pVar = this.f4158e;
                this.f4155b = 1;
                if (c2Var.f(sVar, a2Var, pVar, this) == aVar) {
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
            return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: Draggable2D.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"androidx/compose/foundation/gestures/n$b", "Landroidx/compose/foundation/gestures/s;", "Li0/f;", "pixels", "Lkotlin/k2;", "a", "(J)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements s {
        b() {
        }

        @Override // androidx.compose.foundation.gestures.s
        public void a(long pixels) {
            n.this.f().invoke(i0.f.d(pixels));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(@fg.l ld.l<? super i0.f, k2> lVar) {
        this.onDelta = lVar;
    }

    @Override // androidx.compose.foundation.gestures.y
    @fg.m
    public Object a(@fg.l a2 a2Var, @fg.l ld.p<? super s, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object g4 = kotlinx.coroutines.s0.g(new a(a2Var, pVar, null), dVar);
        return g4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? g4 : k2.f75408a;
    }

    @Override // androidx.compose.foundation.gestures.y
    public void c(long delta) {
        this.onDelta.invoke(i0.f.d(delta));
    }

    @fg.l
    public final ld.l<i0.f, k2> f() {
        return this.onDelta;
    }
}
