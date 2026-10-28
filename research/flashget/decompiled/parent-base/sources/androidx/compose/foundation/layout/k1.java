package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.i1;
import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: Padding.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R(\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R(\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Landroidx/compose/foundation/layout/k1;", "Landroidx/compose/ui/node/c0;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/unit/h;", "start", "top", "end", "bottom", "", "rtlAware", "<init>", "(FFFFZLkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "p", "F", "B7", "()F", "G7", "(F)V", "q", "C7", "H7", "r", "z7", "E7", "s", "y7", "D7", "t", "Z", "A7", "()Z", "F7", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingNode\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,467:1\n154#2:468\n154#2:469\n154#2:470\n154#2:471\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingNode\n*L\n382#1:468\n383#1:469\n384#1:470\n385#1:471\n*E\n"})
/* loaded from: classes.dex */
final class k1 extends q.d implements androidx.compose.ui.node.c0 {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float start;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private float top;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float end;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private float bottom;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean rtlAware;

    /* compiled from: Padding.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f5178c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.o0 f5179d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.i1 i1Var, androidx.compose.ui.layout.o0 o0Var) {
            super(1);
            this.f5178c = i1Var;
            this.f5179d = o0Var;
        }

        public final void a(@fg.l i1.a aVar) {
            if (k1.this.getRtlAware()) {
                i1.a.m(aVar, this.f5178c, this.f5179d.q2(k1.this.getStart()), this.f5179d.q2(k1.this.getTop()), 0.0f, 4, null);
            } else {
                i1.a.g(aVar, this.f5178c, this.f5179d.q2(k1.this.getStart()), this.f5179d.q2(k1.this.getTop()), 0.0f, 4, null);
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    public /* synthetic */ k1(float f4, float f5, float f6, float f7, boolean z4, kotlin.jvm.internal.w wVar) {
        this(f4, f5, f6, f7, z4);
    }

    /* renamed from: A7, reason: from getter */
    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: B7, reason: from getter */
    public final float getStart() {
        return this.start;
    }

    /* renamed from: C7, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    public final void D7(float f4) {
        this.bottom = f4;
    }

    public final void E7(float f4) {
        this.end = f4;
    }

    public final void F7(boolean z4) {
        this.rtlAware = z4;
    }

    public final void G7(float f4) {
        this.start = f4;
    }

    public final void H7(float f4) {
        this.top = f4;
    }

    @Override // androidx.compose.ui.node.c0
    @fg.l
    public androidx.compose.ui.layout.n0 f(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
        int q22 = o0Var.q2(this.end) + o0Var.q2(this.start);
        int q23 = o0Var.q2(this.bottom) + o0Var.q2(this.top);
        androidx.compose.ui.layout.i1 m02 = l0Var.m0(androidx.compose.ui.unit.c.i(j4, -q22, -q23));
        return androidx.compose.ui.layout.o0.x2(o0Var, androidx.compose.ui.unit.c.g(j4, m02.getWidth() + q22), androidx.compose.ui.unit.c.f(j4, m02.getHeight() + q23), null, new a(m02, o0Var), 4, null);
    }

    /* renamed from: y7, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: z7, reason: from getter */
    public final float getEnd() {
        return this.end;
    }

    private k1(float f4, float f5, float f6, float f7, boolean z4) {
        this.start = f4;
        this.top = f5;
        this.end = f6;
        this.bottom = f7;
        this.rtlAware = z4;
    }

    public /* synthetic */ k1(float f4, float f5, float f6, float f7, boolean z4, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? androidx.compose.ui.unit.h.g(0) : f4, (i4 & 2) != 0 ? androidx.compose.ui.unit.h.g(0) : f5, (i4 & 4) != 0 ? androidx.compose.ui.unit.h.g(0) : f6, (i4 & 8) != 0 ? androidx.compose.ui.unit.h.g(0) : f7, z4);
    }
}
