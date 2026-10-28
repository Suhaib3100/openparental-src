package androidx.compose.ui.node;

import androidx.compose.ui.graphics.q4;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: LayoutModifierNode.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001:\u0005\u0011\u0010\u000f\f\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\rJ/\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0010\u0010\rJ/\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0011\u0010\r¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/node/i1;", "", "<init>", "()V", "Landroidx/compose/ui/node/i1$e;", "measureBlock", "Landroidx/compose/ui/layout/q;", "intrinsicMeasureScope", "Landroidx/compose/ui/layout/p;", "intrinsicMeasurable", "", "h", "d", "(Landroidx/compose/ui/node/i1$e;Landroidx/compose/ui/layout/q;Landroidx/compose/ui/layout/p;I)I", "w", "c", "b", "a", "e", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final i1 f19334a = new i1();

    /* renamed from: b, reason: collision with root package name */
    public static final int f19335b = 0;

    /* compiled from: LayoutModifierNode.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0016\u0010#\u001a\u0004\u0018\u00010 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/node/i1$a;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/p;", "measurable", "Landroidx/compose/ui/node/i1$c;", "minMax", "Landroidx/compose/ui/node/i1$d;", "widthHeight", "<init>", "(Landroidx/compose/ui/layout/p;Landroidx/compose/ui/node/i1$c;Landroidx/compose/ui/node/i1$d;)V", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/i1;", "m0", "(J)Landroidx/compose/ui/layout/i1;", "", "height", "k0", "(I)I", "l0", "width", "Z", "t", "b", "Landroidx/compose/ui/layout/p;", "()Landroidx/compose/ui/layout/p;", "c", "Landroidx/compose/ui/node/i1$c;", "()Landroidx/compose/ui/node/i1$c;", "d", "Landroidx/compose/ui/node/i1$d;", "()Landroidx/compose/ui/node/i1$d;", "", "a", "()Ljava/lang/Object;", "parentData", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a implements androidx.compose.ui.layout.l0 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.compose.ui.layout.p measurable;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final c minMax;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final d widthHeight;

        public a(@fg.l androidx.compose.ui.layout.p pVar, @fg.l c cVar, @fg.l d dVar) {
            this.measurable = pVar;
            this.minMax = cVar;
            this.widthHeight = dVar;
        }

        @Override // androidx.compose.ui.layout.p
        public int Z(int width) {
            return this.measurable.Z(width);
        }

        @Override // androidx.compose.ui.layout.p
        @fg.m
        public Object a() {
            return this.measurable.a();
        }

        @fg.l
        /* renamed from: b, reason: from getter */
        public final androidx.compose.ui.layout.p getMeasurable() {
            return this.measurable;
        }

        @fg.l
        /* renamed from: c, reason: from getter */
        public final c getMinMax() {
            return this.minMax;
        }

        @fg.l
        /* renamed from: d, reason: from getter */
        public final d getWidthHeight() {
            return this.widthHeight;
        }

        @Override // androidx.compose.ui.layout.p
        public int k0(int height) {
            return this.measurable.k0(height);
        }

        @Override // androidx.compose.ui.layout.p
        public int l0(int height) {
            return this.measurable.l0(height);
        }

        @Override // androidx.compose.ui.layout.l0
        @fg.l
        public androidx.compose.ui.layout.i1 m0(long constraints) {
            d dVar = this.widthHeight;
            d dVar2 = d.Width;
            int i4 = androidx.compose.ui.layout.a0.f18904a;
            if (dVar == dVar2) {
                int l02 = this.minMax == c.Max ? this.measurable.l0(androidx.compose.ui.unit.b.o(constraints)) : this.measurable.k0(androidx.compose.ui.unit.b.o(constraints));
                if (androidx.compose.ui.unit.b.i(constraints)) {
                    i4 = androidx.compose.ui.unit.b.o(constraints);
                }
                return new b(l02, i4);
            }
            int t4 = this.minMax == c.Max ? this.measurable.t(androidx.compose.ui.unit.b.p(constraints)) : this.measurable.Z(androidx.compose.ui.unit.b.p(constraints));
            if (androidx.compose.ui.unit.b.j(constraints)) {
                i4 = androidx.compose.ui.unit.b.p(constraints);
            }
            return new b(i4, t4);
        }

        @Override // androidx.compose.ui.layout.p
        public int t(int width) {
            return this.measurable.t(width);
        }
    }

    /* compiled from: LayoutModifierNode.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0019\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\u0002\b\u0012H\u0014ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/node/i1$b;", "Landroidx/compose/ui/layout/i1;", "", "width", "height", "<init>", "(II)V", "Landroidx/compose/ui/layout/a;", "alignmentLine", "q", "(Landroidx/compose/ui/layout/a;)I", "Landroidx/compose/ui/unit/q;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/q4;", "Lkotlin/k2;", "Lkotlin/u;", "layerBlock", "H0", "(JFLld/l;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b extends androidx.compose.ui.layout.i1 {
        public b(int i4, int i5) {
            I0(androidx.compose.ui.unit.v.a(i4, i5));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.i1
        public void H0(long position, float zIndex, @fg.m ld.l<? super q4, k2> layerBlock) {
        }

        @Override // androidx.compose.ui.layout.p0
        public int q(@fg.l androidx.compose.ui.layout.a alignmentLine) {
            return Integer.MIN_VALUE;
        }
    }

    /* compiled from: LayoutModifierNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/i1$c;", "", "<init>", "(Ljava/lang/String;I)V", "Min", "Max", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private enum c {
        Min,
        Max
    }

    /* compiled from: LayoutModifierNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/i1$d;", "", "<init>", "(Ljava/lang/String;I)V", "Width", "Height", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private enum d {
        Width,
        Height
    }

    /* compiled from: LayoutModifierNode.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J&\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/i1$e;", "", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface e {
        @fg.l
        androidx.compose.ui.layout.n0 f(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4);
    }

    private i1() {
    }

    public final int a(@fg.l e measureBlock, @fg.l androidx.compose.ui.layout.q intrinsicMeasureScope, @fg.l androidx.compose.ui.layout.p intrinsicMeasurable, int w4) {
        return measureBlock.f(new androidx.compose.ui.layout.t(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new a(intrinsicMeasurable, c.Max, d.Height), androidx.compose.ui.unit.c.b(0, w4, 0, 0, 13, null)).getHeight();
    }

    public final int b(@fg.l e measureBlock, @fg.l androidx.compose.ui.layout.q intrinsicMeasureScope, @fg.l androidx.compose.ui.layout.p intrinsicMeasurable, int h4) {
        return measureBlock.f(new androidx.compose.ui.layout.t(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new a(intrinsicMeasurable, c.Max, d.Width), androidx.compose.ui.unit.c.b(0, 0, 0, h4, 7, null)).getWidth();
    }

    public final int c(@fg.l e measureBlock, @fg.l androidx.compose.ui.layout.q intrinsicMeasureScope, @fg.l androidx.compose.ui.layout.p intrinsicMeasurable, int w4) {
        return measureBlock.f(new androidx.compose.ui.layout.t(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new a(intrinsicMeasurable, c.Min, d.Height), androidx.compose.ui.unit.c.b(0, w4, 0, 0, 13, null)).getHeight();
    }

    public final int d(@fg.l e measureBlock, @fg.l androidx.compose.ui.layout.q intrinsicMeasureScope, @fg.l androidx.compose.ui.layout.p intrinsicMeasurable, int h4) {
        return measureBlock.f(new androidx.compose.ui.layout.t(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new a(intrinsicMeasurable, c.Min, d.Width), androidx.compose.ui.unit.c.b(0, 0, 0, h4, 7, null)).getWidth();
    }
}
