package androidx.compose.foundation;

import androidx.compose.ui.graphics.b5;
import androidx.compose.ui.graphics.c5;
import androidx.compose.ui.graphics.e6;
import androidx.compose.ui.graphics.r5;
import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: Background.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u000e*\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0010R(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00108\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Landroidx/compose/foundation/o;", "Landroidx/compose/ui/node/q;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/graphics/d2;", "color", "Landroidx/compose/ui/graphics/t1;", "brush", "", "alpha", "Landroidx/compose/ui/graphics/e6;", "shape", "<init>", "(JLandroidx/compose/ui/graphics/t1;FLandroidx/compose/ui/graphics/e6;Lkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/graphics/drawscope/c;", "Lkotlin/k2;", "z7", "(Landroidx/compose/ui/graphics/drawscope/c;)V", "y7", "E", "p", "J", "B7", "()J", "D7", "(J)V", "q", "Landroidx/compose/ui/graphics/t1;", "A7", "()Landroidx/compose/ui/graphics/t1;", "C7", "(Landroidx/compose/ui/graphics/t1;)V", "r", "F", "g", "()F", "k", "(F)V", "s", "Landroidx/compose/ui/graphics/e6;", "K4", "()Landroidx/compose/ui/graphics/e6;", "h5", "(Landroidx/compose/ui/graphics/e6;)V", "Li0/n;", "t", "Li0/n;", "lastSize", "Landroidx/compose/ui/unit/w;", "u", "Landroidx/compose/ui/unit/w;", "lastLayoutDirection", "Landroidx/compose/ui/graphics/b5;", "v", "Landroidx/compose/ui/graphics/b5;", "lastOutline", "w", "lastShape", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nBackground.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Background.kt\nandroidx/compose/foundation/BackgroundNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
/* loaded from: classes.dex */
final class o extends q.d implements androidx.compose.ui.node.q {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private long color;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.graphics.t1 brush;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private e6 shape;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private i0.n lastSize;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.unit.w lastLayoutDirection;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private b5 lastOutline;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private e6 lastShape;

    public /* synthetic */ o(long j4, androidx.compose.ui.graphics.t1 t1Var, float f4, e6 e6Var, kotlin.jvm.internal.w wVar) {
        this(j4, t1Var, f4, e6Var);
    }

    private final void y7(androidx.compose.ui.graphics.drawscope.c cVar) {
        b5 a5;
        if (i0.n.j(cVar.e(), this.lastSize) && cVar.getLayoutDirection() == this.lastLayoutDirection && kotlin.jvm.internal.l0.g(this.lastShape, this.shape)) {
            a5 = this.lastOutline;
            kotlin.jvm.internal.l0.m(a5);
        } else {
            a5 = this.shape.a(cVar.e(), cVar.getLayoutDirection(), cVar);
        }
        long j4 = this.color;
        androidx.compose.ui.graphics.d2.INSTANCE.getClass();
        if (!kotlin.a2.o(j4, androidx.compose.ui.graphics.d2.f17778o)) {
            c5.f(cVar, a5, this.color, (r17 & 4) != 0 ? 1.0f : 0.0f, (r17 & 8) != 0 ? androidx.compose.ui.graphics.drawscope.m.f17797a : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? androidx.compose.ui.graphics.drawscope.f.INSTANCE.a() : 0);
        }
        androidx.compose.ui.graphics.t1 t1Var = this.brush;
        if (t1Var != null) {
            c5.e(cVar, a5, t1Var, this.alpha, null, null, 0, 56, null);
        }
        this.lastOutline = a5;
        this.lastSize = i0.n.c(cVar.e());
        this.lastLayoutDirection = cVar.getLayoutDirection();
        this.lastShape = this.shape;
    }

    private final void z7(androidx.compose.ui.graphics.drawscope.c cVar) {
        long j4 = this.color;
        androidx.compose.ui.graphics.d2.INSTANCE.getClass();
        if (!kotlin.a2.o(j4, androidx.compose.ui.graphics.d2.f17778o)) {
            androidx.compose.ui.graphics.drawscope.f.t5(cVar, this.color, 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        androidx.compose.ui.graphics.t1 t1Var = this.brush;
        if (t1Var != null) {
            androidx.compose.ui.graphics.drawscope.f.a4(cVar, t1Var, 0L, 0L, this.alpha, null, null, 0, 118, null);
        }
    }

    @fg.m
    /* renamed from: A7, reason: from getter */
    public final androidx.compose.ui.graphics.t1 getBrush() {
        return this.brush;
    }

    /* renamed from: B7, reason: from getter */
    public final long getColor() {
        return this.color;
    }

    public final void C7(@fg.m androidx.compose.ui.graphics.t1 t1Var) {
        this.brush = t1Var;
    }

    public final void D7(long j4) {
        this.color = j4;
    }

    @Override // androidx.compose.ui.node.q
    public void E(@fg.l androidx.compose.ui.graphics.drawscope.c cVar) {
        if (this.shape == r5.a()) {
            z7(cVar);
        } else {
            y7(cVar);
        }
        cVar.G6();
    }

    @fg.l
    /* renamed from: K4, reason: from getter */
    public final e6 getShape() {
        return this.shape;
    }

    /* renamed from: g, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    public final void h5(@fg.l e6 e6Var) {
        this.shape = e6Var;
    }

    public final void k(float f4) {
        this.alpha = f4;
    }

    private o(long j4, androidx.compose.ui.graphics.t1 t1Var, float f4, e6 e6Var) {
        this.color = j4;
        this.brush = t1Var;
        this.alpha = f4;
        this.shape = e6Var;
    }
}
