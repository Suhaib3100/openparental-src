package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.z0;
import androidx.compose.runtime.internal.u;
import androidx.compose.runtime.x4;
import androidx.compose.ui.input.pointer.k0;
import androidx.compose.ui.input.pointer.u0;
import androidx.compose.ui.node.b0;
import androidx.compose.ui.node.l;
import androidx.compose.ui.platform.s5;
import androidx.compose.ui.unit.k;
import androidx.compose.ui.unit.v;
import fg.m;
import i0.i;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.jvm.internal.o;
import kotlin.k2;
import ld.p;

/* compiled from: DragAndDropSource.kt */
@u(parameters = 0)
@z0
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BI\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u0012'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R3\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018RC\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/foundation/draganddrop/d;", "Landroidx/compose/ui/node/l;", "Landroidx/compose/ui/node/b0;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "Lkotlin/u;", "drawDragDecoration", "Lkotlin/Function2;", "Landroidx/compose/foundation/draganddrop/e;", "Lkotlin/coroutines/d;", "", "dragAndDropSourceHandler", "<init>", "(Lld/l;Lld/p;)V", "Landroidx/compose/ui/unit/u;", "size", "l", "(J)V", "s", "Lld/l;", "K7", "()Lld/l;", "M7", "(Lld/l;)V", "t", "Lld/p;", "J7", "()Lld/p;", "L7", "(Lld/p;)V", "u", "J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d extends l implements b0 {

    /* renamed from: v, reason: collision with root package name */
    public static final int f3622v = 8;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super androidx.compose.ui.graphics.drawscope.f, k2> drawDragDecoration;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private p<? super e, ? super kotlin.coroutines.d<? super k2>, ? extends Object> dragAndDropSourceHandler;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* compiled from: DragAndDropSource.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.draganddrop.DragAndDropSourceNode$1", f = "DragAndDropSource.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/k0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends o implements p<k0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f3626b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f3627c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.draganddrop.d f3629e;

        /* compiled from: DragAndDropSource.kt */
        @Metadata(d1 = {"\u0000\u0081\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J?\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00032'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH\u0096A¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r*\u00020\u0010H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f*\u00020\u0010H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\f*\u00020\u0015H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0003\u001a\u00020\f*\u00020\rH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u0015*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0017J\u0017\u0010\u001e\u001a\u00020\u0015*\u00020\u0010H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0014J\u0014\u0010!\u001a\u00020 *\u00020\u001fH\u0097\u0001¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u0019*\u00020\u001aH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010\u001cJ\u0017\u0010$\u001a\u00020\u0010*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001a\u0010&\u001a\u00020\u0010*\u00020\u0015H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010%J\u001a\u0010'\u001a\u00020\u0010*\u00020\rH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u00158\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001a\u00103\u001a\u00020\u00198VX\u0096\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u00158\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b4\u0010/R$\u0010<\u001a\u0002062\u0006\u00107\u001a\u0002068V@VX\u0096\u000f¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010?\u001a\u00020=8\u0016X\u0096\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b>\u00102R\u0014\u0010C\u001a\u00020@8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bA\u0010B\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006D"}, d2 = {"androidx/compose/foundation/draganddrop/d$a$a", "Landroidx/compose/foundation/draganddrop/e;", "Landroidx/compose/ui/input/pointer/k0;", "R", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/c;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "o3", "(Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/unit/h;", "", "q2", "(F)I", "Landroidx/compose/ui/unit/z;", "J5", "(J)I", "i", "(J)F", "", "S", "(F)F", "(I)F", "Li0/n;", "Landroidx/compose/ui/unit/l;", "n", "(J)J", "v5", "J2", "Landroidx/compose/ui/unit/k;", "Li0/i;", "c5", "(Landroidx/compose/ui/unit/k;)Li0/i;", "d0", "h", "(F)J", "w", "u", "(I)J", "Landroidx/compose/ui/draganddrop/h;", "transferData", "Lkotlin/k2;", "C6", "(Landroidx/compose/ui/draganddrop/h;)V", "b", "()F", "density", "B", "()J", "extendedTouchPadding", "U", "fontScale", "", "<anonymous parameter 0>", "x5", "()Z", "U2", "(Z)V", "interceptOutOfBoundsChildEvents", "Landroidx/compose/ui/unit/u;", "c", "size", "Landroidx/compose/ui/platform/s5;", "d", "()Landroidx/compose/ui/platform/s5;", "viewConfiguration", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.draganddrop.d$a$a, reason: collision with other inner class name */
        public static final class C0054a implements e, k0 {

            /* renamed from: b, reason: collision with root package name */
            private final /* synthetic */ k0 f3630b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.draganddrop.d f3631c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ d f3632d;

            C0054a(k0 k0Var, androidx.compose.ui.draganddrop.d dVar, d dVar2) {
                this.f3631c = dVar;
                this.f3632d = dVar2;
                this.f3630b = k0Var;
            }

            @Override // androidx.compose.ui.input.pointer.k0
            public long B() {
                return this.f3630b.B();
            }

            @Override // androidx.compose.foundation.draganddrop.e
            public void C6(@fg.l androidx.compose.ui.draganddrop.h transferData) {
                this.f3631c.L(transferData, v.f(this.f3630b.getBoundsSize()), this.f3632d.K7());
            }

            @Override // androidx.compose.ui.unit.d
            @x4
            public float J2(long j4) {
                return this.f3630b.J2(j4);
            }

            @Override // androidx.compose.ui.unit.d
            @x4
            public int J5(long j4) {
                return this.f3630b.J5(j4);
            }

            @Override // androidx.compose.ui.unit.d
            @x4
            public float R(int i4) {
                return this.f3630b.R(i4);
            }

            @Override // androidx.compose.ui.unit.d
            @x4
            public float S(float f4) {
                return this.f3630b.S(f4);
            }

            @Override // androidx.compose.ui.unit.n
            /* renamed from: U */
            public float getFontScale() {
                return this.f3630b.getFontScale();
            }

            @Override // androidx.compose.ui.input.pointer.k0
            public void U2(boolean z4) {
                this.f3630b.U2(z4);
            }

            @Override // androidx.compose.ui.unit.d
            /* renamed from: b */
            public float getDensity() {
                return this.f3630b.getDensity();
            }

            @Override // androidx.compose.ui.input.pointer.k0
            /* renamed from: c */
            public long getBoundsSize() {
                return this.f3630b.getBoundsSize();
            }

            @Override // androidx.compose.ui.unit.d
            @x4
            @fg.l
            public i c5(@fg.l k kVar) {
                return this.f3630b.c5(kVar);
            }

            @Override // androidx.compose.ui.input.pointer.k0
            @fg.l
            public s5 d() {
                return this.f3630b.d();
            }

            @Override // androidx.compose.ui.unit.d
            @x4
            public long d0(long j4) {
                return this.f3630b.d0(j4);
            }

            @Override // androidx.compose.ui.unit.n
            @x4
            public long h(float f4) {
                return this.f3630b.h(f4);
            }

            @Override // androidx.compose.ui.unit.n
            @x4
            public float i(long j4) {
                return this.f3630b.i(j4);
            }

            @Override // androidx.compose.ui.unit.d
            @x4
            public long n(long j4) {
                return this.f3630b.n(j4);
            }

            @Override // androidx.compose.ui.input.pointer.k0
            @m
            public <R> Object o3(@fg.l p<? super androidx.compose.ui.input.pointer.c, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super R> dVar) {
                return this.f3630b.o3(pVar, dVar);
            }

            @Override // androidx.compose.ui.unit.d
            @x4
            public int q2(float f4) {
                return this.f3630b.q2(f4);
            }

            @Override // androidx.compose.ui.unit.d
            @x4
            public long u(int i4) {
                return this.f3630b.u(i4);
            }

            @Override // androidx.compose.ui.unit.d
            @x4
            public float v5(float f4) {
                return this.f3630b.v5(f4);
            }

            @Override // androidx.compose.ui.unit.d
            @x4
            public long w(float f4) {
                return this.f3630b.w(f4);
            }

            @Override // androidx.compose.ui.input.pointer.k0
            /* renamed from: x5 */
            public boolean getInterceptOutOfBoundsChildEvents() {
                return this.f3630b.getInterceptOutOfBoundsChildEvents();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.draganddrop.d dVar, kotlin.coroutines.d<? super a> dVar2) {
            super(2, dVar2);
            this.f3629e = dVar;
        }

        @Override // ld.p
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l k0 k0Var, @m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(k0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            a aVar = d.this.new a(this.f3629e, dVar);
            aVar.f3627c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f3626b;
            if (i4 == 0) {
                a1.n(obj);
                k0 k0Var = (k0) this.f3627c;
                p<e, kotlin.coroutines.d<? super k2>, Object> J7 = d.this.J7();
                C0054a c0054a = new C0054a(k0Var, this.f3629e, d.this);
                this.f3626b = 1;
                if (J7.invoke(c0054a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    public d(@fg.l ld.l<? super androidx.compose.ui.graphics.drawscope.f, k2> lVar, @fg.l p<? super e, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        this.drawDragDecoration = lVar;
        this.dragAndDropSourceHandler = pVar;
        androidx.compose.ui.unit.u.INSTANCE.getClass();
        this.size = androidx.compose.ui.unit.u.f21529c;
        y7(u0.a(new a((androidx.compose.ui.draganddrop.d) y7(androidx.compose.ui.draganddrop.f.a()), null)));
    }

    @fg.l
    public final p<e, kotlin.coroutines.d<? super k2>, Object> J7() {
        return this.dragAndDropSourceHandler;
    }

    @fg.l
    public final ld.l<androidx.compose.ui.graphics.drawscope.f, k2> K7() {
        return this.drawDragDecoration;
    }

    public final void L7(@fg.l p<? super e, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        this.dragAndDropSourceHandler = pVar;
    }

    public final void M7(@fg.l ld.l<? super androidx.compose.ui.graphics.drawscope.f, k2> lVar) {
        this.drawDragDecoration = lVar;
    }

    @Override // androidx.compose.ui.node.b0
    public void l(long size) {
        this.size = size;
    }
}
