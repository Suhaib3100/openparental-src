package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.e2;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.layout.o0;
import androidx.compose.ui.layout.o1;
import androidx.compose.ui.node.c0;
import androidx.compose.ui.q;
import androidx.compose.ui.unit.v;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k2;

/* compiled from: PainterModifier.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b*\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0015J\u0016\u0010\u0019\u001a\u00020\u0006*\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\u00020\u0006*\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ&\u0010 \u001a\u00020\u001f*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!J#\u0010&\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b(\u0010'J#\u0010*\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b*\u0010'J#\u0010+\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b+\u0010'J\u0013\u0010.\u001a\u00020-*\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010;R\u0014\u0010Y\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010;\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Z"}, d2 = {"Landroidx/compose/ui/draw/q;", "Landroidx/compose/ui/node/c0;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/node/q;", "Landroidx/compose/ui/graphics/painter/e;", "painter", "", "sizeToIntrinsics", "Landroidx/compose/ui/c;", "alignment", "Landroidx/compose/ui/layout/f;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/e2;", "colorFilter", "<init>", "(Landroidx/compose/ui/graphics/painter/e;ZLandroidx/compose/ui/c;Landroidx/compose/ui/layout/f;FLandroidx/compose/ui/graphics/e2;)V", "Li0/n;", "dstSize", "y7", "(J)J", "Landroidx/compose/ui/unit/b;", "constraints", "H7", "G7", "(J)Z", "F7", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "Landroidx/compose/ui/layout/q;", "Landroidx/compose/ui/layout/p;", "", "height", "P", "(Landroidx/compose/ui/layout/q;Landroidx/compose/ui/layout/p;I)I", "V", "width", "G", "p", "Landroidx/compose/ui/graphics/drawscope/c;", "Lkotlin/k2;", "E", "(Landroidx/compose/ui/graphics/drawscope/c;)V", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/painter/e;", "C7", "()Landroidx/compose/ui/graphics/painter/e;", "L7", "(Landroidx/compose/ui/graphics/painter/e;)V", "q", "Z", "D7", "()Z", "M7", "(Z)V", "r", "Landroidx/compose/ui/c;", "z7", "()Landroidx/compose/ui/c;", "I7", "(Landroidx/compose/ui/c;)V", "s", "Landroidx/compose/ui/layout/f;", "B7", "()Landroidx/compose/ui/layout/f;", "K7", "(Landroidx/compose/ui/layout/f;)V", "t", "F", "g", "()F", "k", "(F)V", "u", "Landroidx/compose/ui/graphics/e2;", "A7", "()Landroidx/compose/ui/graphics/e2;", "J7", "(Landroidx/compose/ui/graphics/e2;)V", "E7", "useIntrinsicSize", "b7", "shouldAutoInvalidate", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPainterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PainterModifier.kt\nandroidx/compose/ui/draw/PainterNode\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,361:1\n152#2:362\n121#3,4:363\n*S KotlinDebug\n*F\n+ 1 PainterModifier.kt\nandroidx/compose/ui/draw/PainterNode\n*L\n162#1:362\n340#1:363,4\n*E\n"})
/* loaded from: classes.dex */
final class q extends q.d implements c0, androidx.compose.ui.node.q {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.graphics.painter.e painter;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean sizeToIntrinsics;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.c alignment;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.layout.f contentScale;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private e2 colorFilter;

    /* compiled from: PainterModifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.l<i1.a, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1 f17460b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i1 i1Var) {
            super(1);
            this.f17460b = i1Var;
        }

        public final void a(@fg.l i1.a aVar) {
            i1.a.m(aVar, this.f17460b, 0, 0, 0.0f, 4, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(i1.a aVar) {
            a(aVar);
            return k2.f75408a;
        }
    }

    public /* synthetic */ q(androidx.compose.ui.graphics.painter.e eVar, boolean z4, androidx.compose.ui.c cVar, androidx.compose.ui.layout.f fVar, float f4, e2 e2Var, int i4, w wVar) {
        this(eVar, z4, (i4 & 4) != 0 ? androidx.compose.ui.c.INSTANCE.i() : cVar, (i4 & 8) != 0 ? androidx.compose.ui.layout.f.INSTANCE.k() : fVar, (i4 & 16) != 0 ? 1.0f : f4, (i4 & 32) != 0 ? null : e2Var);
    }

    private final boolean E7() {
        if (this.sizeToIntrinsics) {
            long intrinsicSize = this.painter.getIntrinsicSize();
            i0.n.INSTANCE.getClass();
            if (intrinsicSize != i0.n.f74172d) {
                return true;
            }
        }
        return false;
    }

    private final boolean F7(long j4) {
        i0.n.INSTANCE.getClass();
        if (!i0.n.k(j4, i0.n.f74172d)) {
            float m4 = i0.n.m(j4);
            if (!Float.isInfinite(m4) && !Float.isNaN(m4)) {
                return true;
            }
        }
        return false;
    }

    private final boolean G7(long j4) {
        i0.n.INSTANCE.getClass();
        if (!i0.n.k(j4, i0.n.f74172d)) {
            float t4 = i0.n.t(j4);
            if (!Float.isInfinite(t4) && !Float.isNaN(t4)) {
                return true;
            }
        }
        return false;
    }

    private final long H7(long constraints) {
        boolean z4 = false;
        boolean z5 = androidx.compose.ui.unit.b.j(constraints) && androidx.compose.ui.unit.b.i(constraints);
        if (androidx.compose.ui.unit.b.n(constraints) && androidx.compose.ui.unit.b.l(constraints)) {
            z4 = true;
        }
        if ((!E7() && z5) || z4) {
            return androidx.compose.ui.unit.b.e(constraints, androidx.compose.ui.unit.b.p(constraints), 0, androidx.compose.ui.unit.b.o(constraints), 0, 10, null);
        }
        long intrinsicSize = this.painter.getIntrinsicSize();
        long y7 = y7(i0.o.a(androidx.compose.ui.unit.c.g(constraints, G7(intrinsicSize) ? kotlin.math.b.L0(i0.n.t(intrinsicSize)) : androidx.compose.ui.unit.b.r(constraints)), androidx.compose.ui.unit.c.f(constraints, F7(intrinsicSize) ? kotlin.math.b.L0(i0.n.m(intrinsicSize)) : androidx.compose.ui.unit.b.q(constraints))));
        return androidx.compose.ui.unit.b.e(constraints, androidx.compose.ui.unit.c.g(constraints, kotlin.math.b.L0(i0.n.t(y7))), 0, androidx.compose.ui.unit.c.f(constraints, kotlin.math.b.L0(i0.n.m(y7))), 0, 10, null);
    }

    private final long y7(long dstSize) {
        if (!E7()) {
            return dstSize;
        }
        long a5 = i0.o.a(!G7(this.painter.getIntrinsicSize()) ? i0.n.t(dstSize) : i0.n.t(this.painter.getIntrinsicSize()), !F7(this.painter.getIntrinsicSize()) ? i0.n.m(dstSize) : i0.n.m(this.painter.getIntrinsicSize()));
        if (i0.n.t(dstSize) != 0.0f && i0.n.m(dstSize) != 0.0f) {
            return o1.k(a5, this.contentScale.a(a5, dstSize));
        }
        i0.n.INSTANCE.getClass();
        return i0.n.f74171c;
    }

    @fg.m
    /* renamed from: A7, reason: from getter */
    public final e2 getColorFilter() {
        return this.colorFilter;
    }

    @fg.l
    /* renamed from: B7, reason: from getter */
    public final androidx.compose.ui.layout.f getContentScale() {
        return this.contentScale;
    }

    @fg.l
    /* renamed from: C7, reason: from getter */
    public final androidx.compose.ui.graphics.painter.e getPainter() {
        return this.painter;
    }

    /* renamed from: D7, reason: from getter */
    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    @Override // androidx.compose.ui.node.q
    public void E(@fg.l androidx.compose.ui.graphics.drawscope.c cVar) {
        long j4;
        long intrinsicSize = this.painter.getIntrinsicSize();
        long a5 = i0.o.a(G7(intrinsicSize) ? i0.n.t(intrinsicSize) : i0.n.t(cVar.e()), F7(intrinsicSize) ? i0.n.m(intrinsicSize) : i0.n.m(cVar.e()));
        if (i0.n.t(cVar.e()) == 0.0f || i0.n.m(cVar.e()) == 0.0f) {
            i0.n.INSTANCE.getClass();
            j4 = i0.n.f74171c;
        } else {
            j4 = o1.k(a5, this.contentScale.a(a5, cVar.e()));
        }
        long j5 = j4;
        long a6 = this.alignment.a(v.a(kotlin.math.b.L0(i0.n.t(j5)), kotlin.math.b.L0(i0.n.m(j5))), v.a(kotlin.math.b.L0(i0.n.t(cVar.e())), kotlin.math.b.L0(i0.n.m(cVar.e()))), cVar.getLayoutDirection());
        float m4 = androidx.compose.ui.unit.q.m(a6);
        float f4 = (int) (a6 & 4294967295L);
        cVar.getDrawContext().getTransform().translate(m4, f4);
        this.painter.g(cVar, j5, this.alpha, this.colorFilter);
        cVar.getDrawContext().getTransform().translate(-m4, -f4);
        cVar.G6();
    }

    @Override // androidx.compose.ui.node.c0
    public int G(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        if (!E7()) {
            return pVar.Z(i4);
        }
        long H7 = H7(androidx.compose.ui.unit.c.b(0, i4, 0, 0, 13, null));
        return Math.max(androidx.compose.ui.unit.b.q(H7), pVar.Z(i4));
    }

    public final void I7(@fg.l androidx.compose.ui.c cVar) {
        this.alignment = cVar;
    }

    public final void J7(@fg.m e2 e2Var) {
        this.colorFilter = e2Var;
    }

    public final void K7(@fg.l androidx.compose.ui.layout.f fVar) {
        this.contentScale = fVar;
    }

    public final void L7(@fg.l androidx.compose.ui.graphics.painter.e eVar) {
        this.painter = eVar;
    }

    public final void M7(boolean z4) {
        this.sizeToIntrinsics = z4;
    }

    @Override // androidx.compose.ui.node.c0
    public int P(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        if (!E7()) {
            return pVar.k0(i4);
        }
        long H7 = H7(androidx.compose.ui.unit.c.b(0, 0, 0, i4, 7, null));
        return Math.max(androidx.compose.ui.unit.b.r(H7), pVar.k0(i4));
    }

    @Override // androidx.compose.ui.node.c0
    public int V(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        if (!E7()) {
            return pVar.l0(i4);
        }
        long H7 = H7(androidx.compose.ui.unit.c.b(0, 0, 0, i4, 7, null));
        return Math.max(androidx.compose.ui.unit.b.r(H7), pVar.l0(i4));
    }

    @Override // androidx.compose.ui.q.d
    public boolean b7() {
        return false;
    }

    @Override // androidx.compose.ui.node.c0
    @fg.l
    public androidx.compose.ui.layout.n0 f(@fg.l o0 o0Var, @fg.l l0 l0Var, long j4) {
        i1 m02 = l0Var.m0(H7(j4));
        return o0.x2(o0Var, m02.getWidth(), m02.getHeight(), null, new a(m02), 4, null);
    }

    /* renamed from: g, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    public final void k(float f4) {
        this.alpha = f4;
    }

    @Override // androidx.compose.ui.node.c0
    public int p(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        if (!E7()) {
            return pVar.t(i4);
        }
        long H7 = H7(androidx.compose.ui.unit.c.b(0, i4, 0, 0, 13, null));
        return Math.max(androidx.compose.ui.unit.b.q(H7), pVar.t(i4));
    }

    @fg.l
    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    @fg.l
    /* renamed from: z7, reason: from getter */
    public final androidx.compose.ui.c getAlignment() {
        return this.alignment;
    }

    public q(@fg.l androidx.compose.ui.graphics.painter.e eVar, boolean z4, @fg.l androidx.compose.ui.c cVar, @fg.l androidx.compose.ui.layout.f fVar, float f4, @fg.m e2 e2Var) {
        this.painter = eVar;
        this.sizeToIntrinsics = z4;
        this.alignment = cVar;
        this.contentScale = fVar;
        this.alpha = f4;
        this.colorFilter = e2Var;
    }
}
