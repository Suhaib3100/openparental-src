package androidx.compose.foundation;

import androidx.compose.foundation.z;
import androidx.compose.ui.graphics.b5;
import androidx.compose.ui.graphics.e6;
import androidx.compose.ui.graphics.g5;
import androidx.compose.ui.graphics.s4;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.k1;

/* compiled from: Border.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0013\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014JF\u0010\u001a\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR0\u0010'\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00028\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010\u000b\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u00104\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Landroidx/compose/foundation/a0;", "Landroidx/compose/ui/node/l;", "Landroidx/compose/ui/unit/h;", "widthParameter", "Landroidx/compose/ui/graphics/t1;", "brushParameter", "Landroidx/compose/ui/graphics/e6;", "shapeParameter", "<init>", "(FLandroidx/compose/ui/graphics/t1;Landroidx/compose/ui/graphics/e6;Lkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/draw/g;", "brush", "Landroidx/compose/ui/graphics/b5$a;", "outline", "", "fillArea", "", "strokeWidth", "Landroidx/compose/ui/draw/m;", "L7", "(Landroidx/compose/ui/draw/g;Landroidx/compose/ui/graphics/t1;Landroidx/compose/ui/graphics/b5$a;ZF)Landroidx/compose/ui/draw/m;", "Landroidx/compose/ui/graphics/b5$c;", "Li0/f;", "topLeft", "Li0/n;", "borderSize", "M7", "(Landroidx/compose/ui/draw/g;Landroidx/compose/ui/graphics/t1;Landroidx/compose/ui/graphics/b5$c;JJZF)Landroidx/compose/ui/draw/m;", "Landroidx/compose/foundation/y;", "s", "Landroidx/compose/foundation/y;", "borderCache", "value", "t", "F", "O7", "()F", "Q7", "(F)V", "width", "u", "Landroidx/compose/ui/graphics/t1;", "N7", "()Landroidx/compose/ui/graphics/t1;", "P7", "(Landroidx/compose/ui/graphics/t1;)V", "v", "Landroidx/compose/ui/graphics/e6;", "K4", "()Landroidx/compose/ui/graphics/e6;", "h5", "(Landroidx/compose/ui/graphics/e6;)V", "shape", "Landroidx/compose/ui/draw/e;", "w", "Landroidx/compose/ui/draw/e;", "drawWithCacheModifierNode", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode\n+ 2 Border.kt\nandroidx/compose/foundation/BorderCache\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,516:1\n386#2,26:517\n412#2,4:544\n421#2,6:557\n427#2:584\n428#2,2:593\n1#3:543\n542#4,9:548\n551#4,8:585\n121#5,2:563\n174#5,6:565\n262#5,11:571\n123#5,2:582\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode\n*L\n263#1:517,26\n263#1:544,4\n263#1:557,6\n263#1:584\n263#1:593,2\n263#1:543\n263#1:548,9\n263#1:585,8\n269#1:563,2\n281#1:565,6\n281#1:571,11\n269#1:582,2\n*E\n"})
/* loaded from: classes.dex */
public final class a0 extends androidx.compose.ui.node.l {

    /* renamed from: x, reason: collision with root package name */
    public static final int f3504x = 8;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private y borderCache;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float width;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.graphics.t1 brush;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private e6 shape;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.draw.e drawWithCacheModifierNode;

    /* compiled from: Border.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/c;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.drawscope.c, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b5.a f3510b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.t1 f3511c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b5.a aVar, androidx.compose.ui.graphics.t1 t1Var) {
            super(1);
            this.f3510b = aVar;
            this.f3511c = t1Var;
        }

        public final void a(@fg.l androidx.compose.ui.graphics.drawscope.c cVar) {
            cVar.G6();
            androidx.compose.ui.graphics.drawscope.f.a5(cVar, this.f3510b.getPath(), this.f3511c, 0.0f, null, null, 0, 60, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.graphics.drawscope.c cVar) {
            a(cVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Border.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/c;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/c;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode$drawGenericBorder$3\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,516:1\n121#2,4:517\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode$drawGenericBorder$3\n*L\n294#1:517,4\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.drawscope.c, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i0.i f3512b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k1.h<s4> f3513c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f3514d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e2 f3515e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i0.i iVar, k1.h<s4> hVar, long j4, androidx.compose.ui.graphics.e2 e2Var) {
            super(1);
            this.f3512b = iVar;
            this.f3513c = hVar;
            this.f3514d = j4;
            this.f3515e = e2Var;
        }

        public final void a(@fg.l androidx.compose.ui.graphics.drawscope.c cVar) {
            cVar.G6();
            float t4 = this.f3512b.t();
            float top2 = this.f3512b.getTop();
            k1.h<s4> hVar = this.f3513c;
            long j4 = this.f3514d;
            androidx.compose.ui.graphics.e2 e2Var = this.f3515e;
            cVar.getDrawContext().getTransform().translate(t4, top2);
            androidx.compose.ui.graphics.drawscope.f.u0(cVar, hVar.f75329b, 0L, j4, 0L, 0L, 0.0f, null, e2Var, 0, 0, 890, null);
            cVar.getDrawContext().getTransform().translate(-t4, -top2);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.graphics.drawscope.c cVar) {
            a(cVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Border.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/c;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/c;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode$drawRoundRectBorder$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,516:1\n222#2:517\n262#2,11:518\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode$drawRoundRectBorder$1\n*L\n329#1:517\n329#1:518,11\n*E\n"})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.drawscope.c, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f3516b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.t1 f3517c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f3518d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f3519e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f3520f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f3521g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f3522h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.drawscope.n f3523i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z4, androidx.compose.ui.graphics.t1 t1Var, long j4, float f4, float f5, long j5, long j6, androidx.compose.ui.graphics.drawscope.n nVar) {
            super(1);
            this.f3516b = z4;
            this.f3517c = t1Var;
            this.f3518d = j4;
            this.f3519e = f4;
            this.f3520f = f5;
            this.f3521g = j5;
            this.f3522h = j6;
            this.f3523i = nVar;
        }

        public final void a(@fg.l androidx.compose.ui.graphics.drawscope.c cVar) {
            long n4;
            cVar.G6();
            if (this.f3516b) {
                androidx.compose.ui.graphics.drawscope.f.D6(cVar, this.f3517c, 0L, 0L, this.f3518d, 0.0f, null, null, 0, 246, null);
                return;
            }
            float m4 = i0.a.m(this.f3518d);
            float f4 = this.f3519e;
            if (m4 >= f4) {
                androidx.compose.ui.graphics.t1 t1Var = this.f3517c;
                long j4 = this.f3521g;
                long j5 = this.f3522h;
                n4 = z.n(this.f3518d, f4);
                androidx.compose.ui.graphics.drawscope.f.D6(cVar, t1Var, j4, j5, n4, 0.0f, this.f3523i, null, 0, 208, null);
                return;
            }
            float f5 = this.f3520f;
            float t4 = i0.n.t(cVar.e()) - this.f3520f;
            float m5 = i0.n.m(cVar.e()) - this.f3520f;
            androidx.compose.ui.graphics.c2.INSTANCE.getClass();
            int i4 = androidx.compose.ui.graphics.c2.f17636c;
            androidx.compose.ui.graphics.t1 t1Var2 = this.f3517c;
            long j6 = this.f3518d;
            androidx.compose.ui.graphics.drawscope.d drawContext = cVar.getDrawContext();
            long e4 = drawContext.e();
            drawContext.i().C();
            drawContext.getTransform().b(f5, f5, t4, m5, i4);
            androidx.compose.ui.graphics.drawscope.f.D6(cVar, t1Var2, 0L, 0L, j6, 0.0f, null, null, 0, 246, null);
            drawContext.i().o();
            drawContext.j(e4);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.graphics.drawscope.c cVar) {
            a(cVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Border.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/c;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.drawscope.c, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g5 f3524b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.t1 f3525c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(g5 g5Var, androidx.compose.ui.graphics.t1 t1Var) {
            super(1);
            this.f3524b = g5Var;
            this.f3525c = t1Var;
        }

        public final void a(@fg.l androidx.compose.ui.graphics.drawscope.c cVar) {
            cVar.G6();
            androidx.compose.ui.graphics.drawscope.f.a5(cVar, this.f3524b, this.f3525c, 0.0f, null, null, 0, 60, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.graphics.drawscope.c cVar) {
            a(cVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Border.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/draw/g;", "Landroidx/compose/ui/draw/m;", "a", "(Landroidx/compose/ui/draw/g;)Landroidx/compose/ui/draw/m;"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.draw.g, androidx.compose.ui.draw.m> {
        e() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.draw.m invoke(@fg.l androidx.compose.ui.draw.g gVar) {
            androidx.compose.ui.draw.m m4;
            if (gVar.getDensity() * a0.this.getWidth() < 0.0f || i0.n.q(gVar.e()) <= 0.0f) {
                return gVar.p(z.a.f9271b);
            }
            float width = a0.this.getWidth();
            androidx.compose.ui.unit.h.INSTANCE.getClass();
            float f4 = 2;
            float min = Math.min(androidx.compose.ui.unit.h.l(width, androidx.compose.ui.unit.h.f21499d) ? 1.0f : (float) Math.ceil(gVar.getDensity() * a0.this.getWidth()), (float) Math.ceil(i0.n.q(gVar.e()) / f4));
            float f5 = min / f4;
            long a5 = i0.g.a(f5, f5);
            long a6 = i0.o.a(i0.n.t(gVar.e()) - min, i0.n.m(gVar.e()) - min);
            boolean z4 = f4 * min > i0.n.q(gVar.e());
            b5 a7 = a0.this.getShape().a(gVar.e(), gVar.getLayoutDirection(), gVar);
            if (a7 instanceof b5.a) {
                a0 a0Var = a0.this;
                return a0Var.L7(gVar, a0Var.getBrush(), (b5.a) a7, z4, min);
            }
            if (a7 instanceof b5.c) {
                a0 a0Var2 = a0.this;
                return a0Var2.M7(gVar, a0Var2.getBrush(), (b5.c) a7, a5, a6, z4, min);
            }
            if (!(a7 instanceof b5.b)) {
                throw new NoWhenBranchMatchedException();
            }
            m4 = z.m(gVar, a0.this.getBrush(), a5, a6, z4, min);
            return m4;
        }
    }

    public /* synthetic */ a0(float f4, androidx.compose.ui.graphics.t1 t1Var, e6 e6Var, kotlin.jvm.internal.w wVar) {
        this(f4, t1Var, e6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e4, code lost:
    
        if (androidx.compose.ui.graphics.t4.h(r14, r5 != null ? androidx.compose.ui.graphics.t4.f(r5.f()) : null) != false) goto L26;
     */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [T, androidx.compose.ui.graphics.s4] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.draw.m L7(androidx.compose.ui.draw.g r46, androidx.compose.ui.graphics.t1 r47, androidx.compose.ui.graphics.b5.a r48, boolean r49, float r50) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.a0.L7(androidx.compose.ui.draw.g, androidx.compose.ui.graphics.t1, androidx.compose.ui.graphics.b5$a, boolean, float):androidx.compose.ui.draw.m");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.draw.m M7(androidx.compose.ui.draw.g gVar, androidx.compose.ui.graphics.t1 t1Var, b5.c cVar, long j4, long j5, boolean z4, float f4) {
        g5 k4;
        if (i0.m.q(cVar.getRoundRect())) {
            return gVar.p(new c(z4, t1Var, cVar.getRoundRect().t(), f4 / 2, f4, j4, j5, new androidx.compose.ui.graphics.drawscope.n(f4, 0.0f, 0, 0, null, 30, null)));
        }
        if (this.borderCache == null) {
            this.borderCache = new y(null, null, null, null, 15, null);
        }
        y yVar = this.borderCache;
        kotlin.jvm.internal.l0.m(yVar);
        k4 = z.k(yVar.n(), cVar.getRoundRect(), f4, z4);
        return gVar.p(new d(k4, t1Var));
    }

    @fg.l
    /* renamed from: K4, reason: from getter */
    public final e6 getShape() {
        return this.shape;
    }

    @fg.l
    /* renamed from: N7, reason: from getter */
    public final androidx.compose.ui.graphics.t1 getBrush() {
        return this.brush;
    }

    /* renamed from: O7, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public final void P7(@fg.l androidx.compose.ui.graphics.t1 t1Var) {
        if (kotlin.jvm.internal.l0.g(this.brush, t1Var)) {
            return;
        }
        this.brush = t1Var;
        this.drawWithCacheModifierNode.A3();
    }

    public final void Q7(float f4) {
        if (androidx.compose.ui.unit.h.l(this.width, f4)) {
            return;
        }
        this.width = f4;
        this.drawWithCacheModifierNode.A3();
    }

    public final void h5(@fg.l e6 e6Var) {
        if (kotlin.jvm.internal.l0.g(this.shape, e6Var)) {
            return;
        }
        this.shape = e6Var;
        this.drawWithCacheModifierNode.A3();
    }

    private a0(float f4, androidx.compose.ui.graphics.t1 t1Var, e6 e6Var) {
        this.width = f4;
        this.brush = t1Var;
        this.shape = e6Var;
        this.drawWithCacheModifierNode = (androidx.compose.ui.draw.e) y7(androidx.compose.ui.draw.l.a(new e()));
    }
}
