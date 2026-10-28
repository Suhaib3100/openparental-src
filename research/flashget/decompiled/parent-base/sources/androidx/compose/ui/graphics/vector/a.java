package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.graphics.drawscope.a;
import androidx.compose.ui.graphics.e2;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.graphics.k1;
import androidx.compose.ui.graphics.s4;
import androidx.compose.ui.graphics.t4;
import androidx.compose.ui.graphics.u4;
import androidx.compose.ui.graphics.v1;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.w0;

/* compiled from: DrawCache.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007JI\u0010\u0013\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\u0002\b\u0011ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bR*\u0010#\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u001d\u0012\u0004\b\"\u0010\u0003\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010'R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001e\u0010+R\u001c\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\"\u0010,R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, d2 = {"Landroidx/compose/ui/graphics/vector/a;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/f;)V", "Landroidx/compose/ui/graphics/t4;", "config", "Landroidx/compose/ui/unit/u;", "size", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Lkotlin/Function1;", "Lkotlin/u;", "block", "b", "(IJLandroidx/compose/ui/unit/d;Landroidx/compose/ui/unit/w;Lld/l;)V", "target", "", "alpha", "Landroidx/compose/ui/graphics/e2;", "colorFilter", "c", "(Landroidx/compose/ui/graphics/drawscope/f;FLandroidx/compose/ui/graphics/e2;)V", "Landroidx/compose/ui/graphics/s4;", "Landroidx/compose/ui/graphics/s4;", "e", "()Landroidx/compose/ui/graphics/s4;", "g", "(Landroidx/compose/ui/graphics/s4;)V", "f", "mCachedImage", "Landroidx/compose/ui/graphics/v1;", "Landroidx/compose/ui/graphics/v1;", "cachedCanvas", "Landroidx/compose/ui/unit/d;", "scopeDensity", "d", "Landroidx/compose/ui/unit/w;", "J", "I", "Landroidx/compose/ui/graphics/drawscope/a;", "Landroidx/compose/ui/graphics/drawscope/a;", "cacheScope", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nDrawCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawCache.kt\nandroidx/compose/ui/graphics/vector/DrawCache\n+ 2 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,112:1\n542#2,17:113\n*S KotlinDebug\n*F\n+ 1 DrawCache.kt\nandroidx/compose/ui/graphics/vector/DrawCache\n*L\n81#1:113,17\n*E\n"})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static final int f18059h = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private s4 mCachedImage;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private v1 cachedCanvas;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.unit.d scopeDensity;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.unit.w layoutDirection = androidx.compose.ui.unit.w.Ltr;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int config;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.graphics.drawscope.a cacheScope;

    public a() {
        androidx.compose.ui.unit.u.INSTANCE.getClass();
        this.size = androidx.compose.ui.unit.u.f21529c;
        t4.INSTANCE.getClass();
        this.config = t4.f18042c;
        this.cacheScope = new androidx.compose.ui.graphics.drawscope.a();
    }

    private final void a(androidx.compose.ui.graphics.drawscope.f fVar) {
        d2.INSTANCE.getClass();
        long j4 = d2.f17766c;
        k1.INSTANCE.getClass();
        androidx.compose.ui.graphics.drawscope.f.t5(fVar, j4, 0L, 0L, 0.0f, null, null, k1.f17874c, 62, null);
    }

    public static /* synthetic */ void d(a aVar, androidx.compose.ui.graphics.drawscope.f fVar, float f4, e2 e2Var, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            f4 = 1.0f;
        }
        if ((i4 & 4) != 0) {
            e2Var = null;
        }
        aVar.c(fVar, f4, e2Var);
    }

    @w0
    public static /* synthetic */ void f() {
    }

    public final void b(int config, long size, @fg.l androidx.compose.ui.unit.d density, @fg.l androidx.compose.ui.unit.w layoutDirection, @fg.l ld.l<? super androidx.compose.ui.graphics.drawscope.f, k2> block) {
        this.scopeDensity = density;
        this.layoutDirection = layoutDirection;
        s4 s4Var = this.mCachedImage;
        v1 v1Var = this.cachedCanvas;
        if (s4Var == null || v1Var == null || androidx.compose.ui.unit.u.m(size) > s4Var.getWidth() || ((int) (size & 4294967295L)) > s4Var.getHeight() || !t4.i(this.config, config)) {
            s4Var = u4.b(androidx.compose.ui.unit.u.m(size), (int) (size & 4294967295L), config, false, null, 24, null);
            v1Var = h0.a(s4Var);
            this.mCachedImage = s4Var;
            this.cachedCanvas = v1Var;
            this.config = config;
        }
        this.size = size;
        androidx.compose.ui.graphics.drawscope.a aVar = this.cacheScope;
        long f4 = androidx.compose.ui.unit.v.f(size);
        a.C0331a drawParams = aVar.getDrawParams();
        androidx.compose.ui.unit.d density2 = drawParams.getDensity();
        androidx.compose.ui.unit.w layoutDirection2 = drawParams.getLayoutDirection();
        v1 canvas = drawParams.getCanvas();
        long size2 = drawParams.getSize();
        a.C0331a drawParams2 = aVar.getDrawParams();
        drawParams2.l(density);
        drawParams2.m(layoutDirection);
        drawParams2.k(v1Var);
        drawParams2.n(f4);
        v1Var.C();
        a(aVar);
        block.invoke(aVar);
        v1Var.o();
        a.C0331a drawParams3 = aVar.getDrawParams();
        drawParams3.l(density2);
        drawParams3.m(layoutDirection2);
        drawParams3.k(canvas);
        drawParams3.n(size2);
        s4Var.c();
    }

    public final void c(@fg.l androidx.compose.ui.graphics.drawscope.f target, float alpha, @fg.m e2 colorFilter) {
        s4 s4Var = this.mCachedImage;
        if (s4Var == null) {
            throw new IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        androidx.compose.ui.graphics.drawscope.f.u0(target, s4Var, 0L, this.size, 0L, 0L, alpha, null, colorFilter, 0, 0, 858, null);
    }

    @fg.m
    /* renamed from: e, reason: from getter */
    public final s4 getMCachedImage() {
        return this.mCachedImage;
    }

    public final void g(@fg.m s4 s4Var) {
        this.mCachedImage = s4Var;
    }
}
