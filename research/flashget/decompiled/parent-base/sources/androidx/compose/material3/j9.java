package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0013\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0011JA\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142'\u0010\u001b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0016¢\u0006\u0002\b\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0004H\u0000¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00072\u0006\u0010&\u001a\u00020%H\u0000ø\u0001\u0000¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010)\u001a\u0004\b*\u0010+R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R+\u00109\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u0010 R0\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010:8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010G\u001a\u00020B8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR+\u0010M\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010+\"\u0004\bK\u0010LR\"\u0010U\u001a\u00020N8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR+\u0010X\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b=\u00105\u001a\u0004\bV\u00107\"\u0004\bW\u0010 R+\u0010\\\u001a\u00020N2\u0006\u00103\u001a\u00020N8@@BX\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010Y\u001a\u0004\bZ\u0010R\"\u0004\b[\u0010TR \u0010^\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b]\u0010,\u001a\u0004\bO\u0010.R+\u0010a\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b_\u00105\u001a\u0004\b_\u00107\"\u0004\b`\u0010 R+\u0010c\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b*\u00105\u001a\u0004\b]\u00107\"\u0004\bb\u0010 R\u0014\u0010e\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010dR\u0014\u0010h\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010gR$\u0010\u0003\u001a\u00020\u00022\u0006\u0010i\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bj\u00107\"\u0004\bk\u0010 R\u0014\u0010l\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bH\u00107\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006m"}, d2 = {"Landroidx/compose/material3/j9;", "Landroidx/compose/foundation/gestures/d0;", "", "value", "", "steps", "Lkotlin/Function0;", "Lkotlin/k2;", "onValueChangeFinished", "Lkotlin/ranges/f;", "valueRange", "<init>", "(FILld/a;Lkotlin/ranges/f;)V", "minPx", "maxPx", "offset", "x", "(FFF)F", "userValue", "w", "Landroidx/compose/foundation/a2;", "dragPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/v;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "a", "(Landroidx/compose/foundation/a2;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "delta", "b", "(F)V", "newThumbWidth", "newTotalWidth", "H", "(FI)V", "Li0/f;", "pos", "v", "(J)V", "I", "m", "()I", "Lld/a;", "j", "()Lld/a;", "c", "Lkotlin/ranges/f;", "r", "()Lkotlin/ranges/f;", "<set-?>", "d", "Landroidx/compose/runtime/h2;", "s", "()F", "G", "valueState", "Lkotlin/Function1;", "e", "Lld/l;", "i", "()Lld/l;", "z", "(Lld/l;)V", "onValueChange", "", "f", "[F", "o", "()[F", "tickFractions", "g", "Landroidx/compose/runtime/i2;", "p", "E", "(I)V", "totalWidth", "", "h", "Z", "u", "()Z", "C", "(Z)V", "isRtl", "n", "D", "thumbWidth", "Landroidx/compose/runtime/k2;", "t", "y", "isDragging", "k", "gestureEndAction", "l", "B", "rawOffset", "A", "pressOffset", "Landroidx/compose/foundation/gestures/v;", "dragScope", "Landroidx/compose/foundation/c2;", "Landroidx/compose/foundation/c2;", "scrollMutex", "newVal", "q", "F", "coercedValueAsFraction", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.x4
@f5
@kotlin.jvm.internal.r1({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderState\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2151:1\n76#2:2152\n109#2,2:2153\n76#2:2159\n109#2,2:2160\n76#2:2165\n109#2,2:2166\n76#2:2168\n109#2,2:2169\n1#3:2155\n75#4:2156\n108#4,2:2157\n81#5:2162\n107#5,2:2163\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderState\n*L\n1796#1:2152\n1796#1:2153,2\n1848#1:2159\n1848#1:2160,2\n1880#1:2165\n1880#1:2166,2\n1881#1:2168\n1881#1:2169,2\n1846#1:2156\n1846#1:2157,2\n1857#1:2162\n1857#1:2163,2\n*E\n"})
/* loaded from: classes.dex */
public final class j9 implements androidx.compose.foundation.gestures.d0 {

    /* renamed from: p, reason: collision with root package name */
    public static final int f11914p = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int steps;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.a<kotlin.k2> onValueChangeFinished;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.ranges.f<Float> valueRange;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.h2 valueState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.l<? super Float, kotlin.k2> onValueChange;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final float[] tickFractions;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.i2 totalWidth;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isRtl;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.h2 thumbWidth;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 isDragging;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<kotlin.k2> gestureEndAction;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.h2 rawOffset;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.h2 pressOffset;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.gestures.v dragScope;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.c2 scrollMutex;

    /* compiled from: Slider.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SliderState$drag$2", f = "Slider.kt", i = {}, l = {1820}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f11930b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.a2 f11932d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.foundation.gestures.v, kotlin.coroutines.d<? super kotlin.k2>, Object> f11933e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.foundation.a2 a2Var, ld.p<? super androidx.compose.foundation.gestures.v, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f11932d = a2Var;
            this.f11933e = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return j9.this.new a(this.f11932d, this.f11933e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f11930b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                j9.this.y(true);
                androidx.compose.foundation.c2 c2Var = j9.this.scrollMutex;
                androidx.compose.foundation.gestures.v vVar = j9.this.dragScope;
                androidx.compose.foundation.a2 a2Var = this.f11932d;
                ld.p<androidx.compose.foundation.gestures.v, kotlin.coroutines.d<? super kotlin.k2>, Object> pVar = this.f11933e;
                this.f11930b = 1;
                if (c2Var.f(vVar, a2Var, pVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            j9.this.y(false);
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/material3/j9$b", "Landroidx/compose/foundation/gestures/v;", "", "pixels", "Lkotlin/k2;", "c", "(F)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements androidx.compose.foundation.gestures.v {
        b() {
        }

        @Override // androidx.compose.foundation.gestures.v
        public void c(float pixels) {
            j9.this.b(pixels);
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {
        c() {
            super(0);
        }

        public final void a() {
            ld.a<kotlin.k2> j4;
            if (j9.this.t() || (j4 = j9.this.j()) == null) {
                return;
            }
            j4.invoke();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    public j9() {
        this(0.0f, 0, null, null, 15, null);
    }

    private final void A(float f4) {
        this.pressOffset.E(f4);
    }

    private final void B(float f4) {
        this.rawOffset.E(f4);
    }

    private final void D(float f4) {
        this.thumbWidth.E(f4);
    }

    private final void E(int i4) {
        this.totalWidth.k(i4);
    }

    private final void G(float f4) {
        this.valueState.E(f4);
    }

    private final float k() {
        return this.pressOffset.b();
    }

    private final float l() {
        return this.rawOffset.b();
    }

    private final float n() {
        return this.thumbWidth.b();
    }

    private final int p() {
        return this.totalWidth.f();
    }

    private final float s() {
        return this.valueState.b();
    }

    private final float w(float minPx, float maxPx, float userValue) {
        float F;
        F = g9.F(this.valueRange.c().floatValue(), this.valueRange.h().floatValue(), userValue, minPx, maxPx);
        return F;
    }

    private final float x(float minPx, float maxPx, float offset) {
        float F;
        F = g9.F(minPx, maxPx, offset, this.valueRange.c().floatValue(), this.valueRange.h().floatValue());
        return F;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(boolean z4) {
        this.isDragging.setValue(Boolean.valueOf(z4));
    }

    public final void C(boolean z4) {
        this.isRtl = z4;
    }

    public final void F(float f4) {
        float J;
        J = g9.J(kotlin.ranges.s.H(f4, this.valueRange.c().floatValue(), this.valueRange.h().floatValue()), this.tickFractions, this.valueRange.c().floatValue(), this.valueRange.h().floatValue());
        G(J);
    }

    public final void H(float newThumbWidth, int newTotalWidth) {
        D(newThumbWidth);
        E(newTotalWidth);
    }

    @Override // androidx.compose.foundation.gestures.d0
    @fg.m
    public Object a(@fg.l androidx.compose.foundation.a2 a2Var, @fg.l ld.p<? super androidx.compose.foundation.gestures.v, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object g4 = kotlinx.coroutines.s0.g(new a(a2Var, pVar, null), dVar);
        return g4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? g4 : kotlin.k2.f75408a;
    }

    @Override // androidx.compose.foundation.gestures.d0
    public void b(float delta) {
        float J;
        float f4 = 2;
        float max = Math.max(this.totalWidth.f() - (this.thumbWidth.b() / f4), 0.0f);
        float min = Math.min(this.thumbWidth.b() / f4, max);
        B(this.pressOffset.b() + this.rawOffset.b() + delta);
        A(0.0f);
        J = g9.J(this.rawOffset.b(), this.tickFractions, min, max);
        float x4 = x(min, max, J);
        if (x4 == this.valueState.b()) {
            return;
        }
        ld.l<? super Float, kotlin.k2> lVar = this.onValueChange;
        if (lVar == null) {
            F(x4);
        } else if (lVar != null) {
            lVar.invoke(Float.valueOf(x4));
        }
    }

    public final float g() {
        float x4;
        x4 = g9.x(this.valueRange.c().floatValue(), this.valueRange.h().floatValue(), kotlin.ranges.s.H(this.valueState.b(), this.valueRange.c().floatValue(), this.valueRange.h().floatValue()));
        return x4;
    }

    @fg.l
    public final ld.a<kotlin.k2> h() {
        return this.gestureEndAction;
    }

    @fg.m
    public final ld.l<Float, kotlin.k2> i() {
        return this.onValueChange;
    }

    @fg.m
    public final ld.a<kotlin.k2> j() {
        return this.onValueChangeFinished;
    }

    /* renamed from: m, reason: from getter */
    public final int getSteps() {
        return this.steps;
    }

    @fg.l
    /* renamed from: o, reason: from getter */
    public final float[] getTickFractions() {
        return this.tickFractions;
    }

    public final float q() {
        return this.valueState.b();
    }

    @fg.l
    public final kotlin.ranges.f<Float> r() {
        return this.valueRange;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean t() {
        return ((Boolean) this.isDragging.getValue()).booleanValue();
    }

    /* renamed from: u, reason: from getter */
    public final boolean getIsRtl() {
        return this.isRtl;
    }

    public final void v(long pos) {
        A((this.isRtl ? this.totalWidth.f() - i0.f.p(pos) : i0.f.p(pos)) - this.rawOffset.b());
    }

    public final void z(@fg.m ld.l<? super Float, kotlin.k2> lVar) {
        this.onValueChange = lVar;
    }

    public j9(float f4, @androidx.annotation.g0(from = 0) int i4, @fg.m ld.a<kotlin.k2> aVar, @fg.l kotlin.ranges.f<Float> fVar) {
        float[] K;
        androidx.compose.runtime.k2 g4;
        this.steps = i4;
        this.onValueChangeFinished = aVar;
        this.valueRange = fVar;
        this.valueState = androidx.compose.runtime.b.b(f4);
        K = g9.K(i4);
        this.tickFractions = K;
        this.totalWidth = androidx.compose.runtime.b.c(0);
        this.thumbWidth = androidx.compose.runtime.b.b(0.0f);
        g4 = androidx.compose.runtime.t4.g(Boolean.FALSE, null, 2, null);
        this.isDragging = g4;
        this.gestureEndAction = new c();
        this.rawOffset = androidx.compose.runtime.b.b(w(0.0f, 0.0f, f4));
        this.pressOffset = androidx.compose.runtime.b.b(0.0f);
        this.dragScope = new b();
        this.scrollMutex = new androidx.compose.foundation.c2();
    }

    public /* synthetic */ j9(float f4, int i4, ld.a aVar, kotlin.ranges.f fVar, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? 0.0f : f4, (i5 & 2) != 0 ? 0 : i4, (i5 & 4) != 0 ? null : aVar, (i5 & 8) != 0 ? kotlin.ranges.s.e(0.0f, 1.0f) : fVar);
    }
}
