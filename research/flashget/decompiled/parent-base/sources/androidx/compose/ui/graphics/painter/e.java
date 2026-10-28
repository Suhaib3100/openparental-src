package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.d5;
import androidx.compose.ui.graphics.drawscope.f;
import androidx.compose.ui.graphics.e2;
import androidx.compose.ui.graphics.t0;
import androidx.compose.ui.graphics.v1;
import androidx.compose.ui.unit.w;
import fg.l;
import fg.m;
import i0.i;
import i0.j;
import i0.n;
import i0.o;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: Painter.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\t*\u00020\u0014H$¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00172\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ2\u0010!\u001a\u00020\t*\u00020\u00142\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u0016\u0010&\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010%R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010'R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010(R\u0016\u0010\u001c\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010)R%\u0010-\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0*¢\u0006\u0002\b+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010,R\u001a\u00100\u001a\u00020\u001f8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b.\u0010/\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Landroidx/compose/ui/graphics/painter/e;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/d5;", "j", "()Landroidx/compose/ui/graphics/d5;", "Landroidx/compose/ui/graphics/e2;", "colorFilter", "Lkotlin/k2;", "e", "(Landroidx/compose/ui/graphics/e2;)V", "", "alpha", "d", "(F)V", "Landroidx/compose/ui/unit/w;", "rtl", "f", "(Landroidx/compose/ui/unit/w;)V", "Landroidx/compose/ui/graphics/drawscope/f;", "k", "(Landroidx/compose/ui/graphics/drawscope/f;)V", "", "a", "(F)Z", "b", "(Landroidx/compose/ui/graphics/e2;)Z", "layoutDirection", "c", "(Landroidx/compose/ui/unit/w;)Z", "Li0/n;", "size", "g", "(Landroidx/compose/ui/graphics/drawscope/f;JFLandroidx/compose/ui/graphics/e2;)V", "Landroidx/compose/ui/graphics/d5;", "layerPaint", "Z", "useLayer", "Landroidx/compose/ui/graphics/e2;", "F", "Landroidx/compose/ui/unit/w;", "Lkotlin/Function1;", "Lkotlin/u;", "Lld/l;", "drawLambda", "i", "()J", "intrinsicSize", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Painter.kt\nandroidx/compose/ui/graphics/painter/Painter\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Canvas.kt\nandroidx/compose/ui/graphics/CanvasKt\n*L\n1#1,218:1\n67#2,2:219\n246#2:221\n69#2,2:229\n111#3,7:222\n*S KotlinDebug\n*F\n+ 1 Painter.kt\nandroidx/compose/ui/graphics/painter/Painter\n*L\n195#1:219,2\n206#1:221\n195#1:229,2\n207#1:222,7\n*E\n"})
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @m
    private d5 layerPaint;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean useLayer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private e2 colorFilter;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float alpha = 1.0f;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private w layoutDirection = w.Ltr;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private final ld.l<f, k2> drawLambda = new a();

    /* compiled from: Painter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.l<f, k2> {
        a() {
            super(1);
        }

        public final void a(@l f fVar) {
            e.this.k(fVar);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(f fVar) {
            a(fVar);
            return k2.f75408a;
        }
    }

    private final void d(float alpha) {
        if (this.alpha == alpha) {
            return;
        }
        if (!a(alpha)) {
            if (alpha == 1.0f) {
                d5 d5Var = this.layerPaint;
                if (d5Var != null) {
                    d5Var.k(alpha);
                }
                this.useLayer = false;
            } else {
                j().k(alpha);
                this.useLayer = true;
            }
        }
        this.alpha = alpha;
    }

    private final void e(e2 colorFilter) {
        if (l0.g(this.colorFilter, colorFilter)) {
            return;
        }
        if (!b(colorFilter)) {
            if (colorFilter == null) {
                d5 d5Var = this.layerPaint;
                if (d5Var != null) {
                    d5Var.u(null);
                }
                this.useLayer = false;
            } else {
                j().u(colorFilter);
                this.useLayer = true;
            }
        }
        this.colorFilter = colorFilter;
    }

    private final void f(w rtl) {
        if (this.layoutDirection != rtl) {
            c(rtl);
            this.layoutDirection = rtl;
        }
    }

    public static /* synthetic */ void h(e eVar, f fVar, long j4, float f4, e2 e2Var, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
        }
        if ((i4 & 2) != 0) {
            f4 = 1.0f;
        }
        float f5 = f4;
        if ((i4 & 4) != 0) {
            e2Var = null;
        }
        eVar.g(fVar, j4, f5, e2Var);
    }

    private final d5 j() {
        d5 d5Var = this.layerPaint;
        if (d5Var != null) {
            return d5Var;
        }
        t0 t0Var = new t0();
        this.layerPaint = t0Var;
        return t0Var;
    }

    protected boolean a(float alpha) {
        return false;
    }

    protected boolean b(@m e2 colorFilter) {
        return false;
    }

    protected boolean c(@l w layoutDirection) {
        return false;
    }

    public final void g(@l f fVar, long j4, float f4, @m e2 e2Var) {
        d(f4);
        e(e2Var);
        f(fVar.getLayoutDirection());
        float t4 = n.t(fVar.e()) - n.t(j4);
        float m4 = n.m(fVar.e()) - n.m(j4);
        fVar.getDrawContext().getTransform().m(0.0f, 0.0f, t4, m4);
        if (f4 > 0.0f && n.t(j4) > 0.0f && n.m(j4) > 0.0f) {
            if (this.useLayer) {
                i0.f.INSTANCE.getClass();
                i c5 = j.c(i0.f.f74147c, o.a(n.t(j4), n.m(j4)));
                v1 i4 = fVar.getDrawContext().i();
                try {
                    i4.z(c5, j());
                    k(fVar);
                } finally {
                    i4.o();
                }
            } else {
                k(fVar);
            }
        }
        fVar.getDrawContext().getTransform().m(-0.0f, -0.0f, -t4, -m4);
    }

    public abstract long i();

    protected abstract void k(@l f fVar);
}
