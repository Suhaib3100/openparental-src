package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b*\b\u0007\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R+\u0010/\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,\"\u0004\b-\u0010.R+\u00102\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010+\u001a\u0004\b!\u0010,\"\u0004\b1\u0010.R0\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b\u0018\u0001038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010@\u001a\u00020;8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R+\u0010D\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bA\u0010+\u001a\u0004\bB\u0010,\"\u0004\bC\u0010.R+\u0010G\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010+\u001a\u0004\bA\u0010,\"\u0004\bF\u0010.R+\u0010M\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010 \"\u0004\bK\u0010LR+\u0010P\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bN\u0010+\u001a\u0004\bO\u0010,\"\u0004\b\u001e\u0010.R+\u0010S\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010+\u001a\u0004\bQ\u0010,\"\u0004\bR\u0010.R+\u0010Y\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u00178@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR&\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\b038\u0000X\u0080\u0004¢\u0006\f\n\u0004\bQ\u00105\u001a\u0004\bE\u00107R+\u0010\u000f\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bO\u0010+\u001a\u0004\bH\u0010,\"\u0004\b[\u0010.R+\u0010\u000e\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\\\u0010+\u001a\u0004\bN\u0010,\"\u0004\b]\u0010.R$\u0010\u0003\u001a\u00020\u00022\u0006\u0010^\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010,\"\u0004\b_\u0010.R$\u0010\u0004\u001a\u00020\u00022\u0006\u0010^\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010,\"\u0004\b`\u0010.R\u0014\u0010a\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u0010,R\u0014\u0010b\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b0\u0010,R\u0014\u0010c\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010 R\u0014\u0010d\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b<\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006e"}, d2 = {"Landroidx/compose/material3/d8;", "", "", "activeRangeStart", "activeRangeEnd", "", "steps", "Lkotlin/Function0;", "Lkotlin/k2;", "onValueChangeFinished", "Lkotlin/ranges/f;", "valueRange", "<init>", "(FFILld/a;Lkotlin/ranges/f;)V", "minPx", "maxPx", "Landroidx/compose/material3/i9;", "offset", "y", "(FFJ)J", "userValue", "x", "(FFF)F", "", "isStart", "w", "(ZF)V", "M", "()V", "a", "I", "r", "()I", "b", "Lld/a;", "m", "()Lld/a;", "c", "Lkotlin/ranges/f;", "u", "()Lkotlin/ranges/f;", "<set-?>", "d", "Landroidx/compose/runtime/h2;", "()F", "C", "(F)V", "activeRangeStartState", "e", "A", "activeRangeEndState", "Lkotlin/Function1;", "f", "Lld/l;", "l", "()Lld/l;", "G", "(Lld/l;)V", "onValueChange", "", "g", "[F", "s", "()[F", "tickFractions", "h", "q", "K", "startThumbWidth", "i", "D", "endThumbWidth", "j", "Landroidx/compose/runtime/i2;", "t", "L", "(I)V", "totalWidth", "k", "o", "rawOffsetStart", "n", "H", "rawOffsetEnd", "Landroidx/compose/runtime/k2;", "v", "()Z", "J", "(Z)V", "isRtl", "gestureEndAction", "E", "p", "F", "newVal", "B", "z", "coercedActiveRangeStartAsFraction", "coercedActiveRangeEndAsFraction", "startSteps", "endSteps", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.x4
@f5
@kotlin.jvm.internal.r1({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/RangeSliderState\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2151:1\n76#2:2152\n109#2,2:2153\n76#2:2155\n109#2,2:2156\n76#2:2158\n109#2,2:2159\n76#2:2161\n109#2,2:2162\n76#2:2167\n109#2,2:2168\n76#2:2170\n109#2,2:2171\n76#2:2176\n109#2,2:2177\n76#2:2179\n109#2,2:2180\n75#3:2164\n108#3,2:2165\n81#4:2173\n107#4,2:2174\n1#5:2182\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/RangeSliderState\n*L\n1923#1:2152\n1923#1:2153,2\n1924#1:2155\n1924#1:2156,2\n1962#1:2158\n1962#1:2159,2\n1963#1:2161\n1963#1:2162,2\n1965#1:2167\n1965#1:2168,2\n1966#1:2170\n1966#1:2171,2\n1974#1:2176\n1974#1:2177,2\n1975#1:2179\n1975#1:2180,2\n1964#1:2164\n1964#1:2165,2\n1968#1:2173\n1968#1:2174,2\n*E\n"})
/* loaded from: classes.dex */
public final class d8 {

    /* renamed from: q, reason: collision with root package name */
    public static final int f10466q = 0;

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
    private final androidx.compose.runtime.h2 activeRangeStartState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.h2 activeRangeEndState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.l<? super i9, kotlin.k2> onValueChange;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final float[] tickFractions;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.h2 startThumbWidth;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.h2 endThumbWidth;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.i2 totalWidth;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.h2 rawOffsetStart;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.h2 rawOffsetEnd;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 isRtl;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<Boolean, kotlin.k2> gestureEndAction;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.h2 maxPx;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.h2 minPx;

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "a", "(Z)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<Boolean, kotlin.k2> {
        a() {
            super(1);
        }

        public final void a(boolean z4) {
            ld.a<kotlin.k2> m4 = d8.this.m();
            if (m4 != null) {
                m4.invoke();
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Boolean bool) {
            a(bool.booleanValue());
            return kotlin.k2.f75408a;
        }
    }

    public d8() {
        this(0.0f, 0.0f, 0, null, null, 31, null);
    }

    private final void A(float f4) {
        this.activeRangeEndState.E(f4);
    }

    private final void C(float f4) {
        this.activeRangeStartState.E(f4);
    }

    private final void E(float f4) {
        this.maxPx.E(f4);
    }

    private final void F(float f4) {
        this.minPx.E(f4);
    }

    private final float b() {
        return this.activeRangeEndState.b();
    }

    private final float d() {
        return this.activeRangeStartState.b();
    }

    private final float j() {
        return this.maxPx.b();
    }

    private final float k() {
        return this.minPx.b();
    }

    private final float x(float minPx, float maxPx, float userValue) {
        float F;
        F = g9.F(this.valueRange.c().floatValue(), this.valueRange.h().floatValue(), userValue, minPx, maxPx);
        return F;
    }

    private final long y(float minPx, float maxPx, long offset) {
        long G;
        G = g9.G(minPx, maxPx, offset, this.valueRange.c().floatValue(), this.valueRange.h().floatValue());
        return G;
    }

    public final void B(float f4) {
        float J;
        J = g9.J(kotlin.ranges.s.H(f4, this.valueRange.c().floatValue(), this.activeRangeEndState.b()), this.tickFractions, this.valueRange.c().floatValue(), this.valueRange.h().floatValue());
        C(J);
    }

    public final void D(float f4) {
        this.endThumbWidth.E(f4);
    }

    public final void G(@fg.m ld.l<? super i9, kotlin.k2> lVar) {
        this.onValueChange = lVar;
    }

    public final void H(float f4) {
        this.rawOffsetEnd.E(f4);
    }

    public final void I(float f4) {
        this.rawOffsetStart.E(f4);
    }

    public final void J(boolean z4) {
        this.isRtl.setValue(Boolean.valueOf(z4));
    }

    public final void K(float f4) {
        this.startThumbWidth.E(f4);
    }

    public final void L(int i4) {
        this.totalWidth.k(i4);
    }

    public final void M() {
        float f4 = 2;
        float max = Math.max(this.totalWidth.f() - (this.endThumbWidth.b() / f4), 0.0f);
        float min = Math.min(this.startThumbWidth.b() / f4, max);
        if (this.minPx.b() == min && this.maxPx.b() == max) {
            return;
        }
        F(min);
        E(max);
        I(x(this.minPx.b(), this.maxPx.b(), this.activeRangeStartState.b()));
        H(x(this.minPx.b(), this.maxPx.b(), this.activeRangeEndState.b()));
    }

    public final float a() {
        return this.activeRangeEndState.b();
    }

    public final float c() {
        return this.activeRangeStartState.b();
    }

    public final float e() {
        float x4;
        x4 = g9.x(this.valueRange.c().floatValue(), this.valueRange.h().floatValue(), this.activeRangeEndState.b());
        return x4;
    }

    public final float f() {
        float x4;
        x4 = g9.x(this.valueRange.c().floatValue(), this.valueRange.h().floatValue(), this.activeRangeStartState.b());
        return x4;
    }

    public final int g() {
        return (int) Math.floor((1.0f - f()) * this.steps);
    }

    public final float h() {
        return this.endThumbWidth.b();
    }

    @fg.l
    public final ld.l<Boolean, kotlin.k2> i() {
        return this.gestureEndAction;
    }

    @fg.m
    public final ld.l<i9, kotlin.k2> l() {
        return this.onValueChange;
    }

    @fg.m
    public final ld.a<kotlin.k2> m() {
        return this.onValueChangeFinished;
    }

    public final float n() {
        return this.rawOffsetEnd.b();
    }

    public final float o() {
        return this.rawOffsetStart.b();
    }

    public final int p() {
        return (int) Math.floor(e() * this.steps);
    }

    public final float q() {
        return this.startThumbWidth.b();
    }

    /* renamed from: r, reason: from getter */
    public final int getSteps() {
        return this.steps;
    }

    @fg.l
    /* renamed from: s, reason: from getter */
    public final float[] getTickFractions() {
        return this.tickFractions;
    }

    public final int t() {
        return this.totalWidth.f();
    }

    @fg.l
    public final kotlin.ranges.f<Float> u() {
        return this.valueRange;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean v() {
        return ((Boolean) this.isRtl.getValue()).booleanValue();
    }

    public final void w(boolean isStart, float offset) {
        float J;
        long i4;
        float J2;
        if (isStart) {
            I(this.rawOffsetStart.b() + offset);
            H(x(this.minPx.b(), this.maxPx.b(), this.activeRangeEndState.b()));
            float b5 = this.rawOffsetEnd.b();
            J2 = g9.J(kotlin.ranges.s.H(this.rawOffsetStart.b(), this.minPx.b(), b5), this.tickFractions, this.minPx.b(), this.maxPx.b());
            i4 = g9.i(J2, b5);
        } else {
            H(this.rawOffsetEnd.b() + offset);
            I(x(this.minPx.b(), this.maxPx.b(), this.activeRangeStartState.b()));
            float b6 = this.rawOffsetStart.b();
            J = g9.J(kotlin.ranges.s.H(this.rawOffsetEnd.b(), b6, this.maxPx.b()), this.tickFractions, this.minPx.b(), this.maxPx.b());
            i4 = g9.i(b6, J);
        }
        long y4 = y(this.minPx.b(), this.maxPx.b(), i4);
        if (i9.e(y4, g9.i(this.activeRangeStartState.b(), this.activeRangeEndState.b()))) {
            return;
        }
        ld.l<? super i9, kotlin.k2> lVar = this.onValueChange;
        if (lVar == null) {
            B(i9.j(y4));
            z(i9.g(y4));
        } else if (lVar != null) {
            lVar.invoke(i9.b(y4));
        }
    }

    public final void z(float f4) {
        float J;
        J = g9.J(kotlin.ranges.s.H(f4, this.activeRangeStartState.b(), this.valueRange.h().floatValue()), this.tickFractions, this.valueRange.c().floatValue(), this.valueRange.h().floatValue());
        A(J);
    }

    public d8(float f4, float f5, @androidx.annotation.g0(from = 0) int i4, @fg.m ld.a<kotlin.k2> aVar, @fg.l kotlin.ranges.f<Float> fVar) {
        float[] K;
        androidx.compose.runtime.k2 g4;
        this.steps = i4;
        this.onValueChangeFinished = aVar;
        this.valueRange = fVar;
        this.activeRangeStartState = androidx.compose.runtime.b.b(f4);
        this.activeRangeEndState = androidx.compose.runtime.b.b(f5);
        K = g9.K(i4);
        this.tickFractions = K;
        this.startThumbWidth = androidx.compose.runtime.b.b(0.0f);
        this.endThumbWidth = androidx.compose.runtime.b.b(0.0f);
        this.totalWidth = androidx.compose.runtime.b.c(0);
        this.rawOffsetStart = androidx.compose.runtime.b.b(0.0f);
        this.rawOffsetEnd = androidx.compose.runtime.b.b(0.0f);
        g4 = androidx.compose.runtime.t4.g(Boolean.FALSE, null, 2, null);
        this.isRtl = g4;
        this.gestureEndAction = new a();
        this.maxPx = androidx.compose.runtime.b.b(0.0f);
        this.minPx = androidx.compose.runtime.b.b(0.0f);
    }

    public /* synthetic */ d8(float f4, float f5, int i4, ld.a aVar, kotlin.ranges.f fVar, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? 0.0f : f4, (i5 & 2) != 0 ? 1.0f : f5, (i5 & 4) != 0 ? 0 : i4, (i5 & 8) != 0 ? null : aVar, (i5 & 16) != 0 ? kotlin.ranges.s.e(0.0f, 1.0f) : fVar);
    }
}
