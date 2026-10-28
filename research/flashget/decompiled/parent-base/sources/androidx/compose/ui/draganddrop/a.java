package androidx.compose.ui.draganddrop;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import androidx.compose.runtime.internal.u;
import androidx.compose.ui.graphics.drawscope.a;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.graphics.v1;
import fg.l;
import i0.n;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k2;

/* compiled from: ComposeDragShadowBuilder.android.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B0\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R%\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/draganddrop/a;", "Landroid/view/View$DragShadowBuilder;", "Landroidx/compose/ui/unit/d;", "density", "Li0/n;", "decorationSize", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "Lkotlin/u;", "drawDragDecoration", "<init>", "(Landroidx/compose/ui/unit/d;JLld/l;Lkotlin/jvm/internal/w;)V", "Landroid/graphics/Point;", "outShadowSize", "outShadowTouchPoint", "onProvideShadowMetrics", "(Landroid/graphics/Point;Landroid/graphics/Point;)V", "Landroid/graphics/Canvas;", "canvas", "onDrawShadow", "(Landroid/graphics/Canvas;)V", "a", "Landroidx/compose/ui/unit/d;", "b", "J", "c", "Lld/l;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nComposeDragShadowBuilder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeDragShadowBuilder.android.kt\nandroidx/compose/ui/draganddrop/ComposeDragShadowBuilder\n+ 2 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,63:1\n542#2,17:64\n*S KotlinDebug\n*F\n+ 1 ComposeDragShadowBuilder.android.kt\nandroidx/compose/ui/draganddrop/ComposeDragShadowBuilder\n*L\n54#1:64,17\n*E\n"})
/* loaded from: classes.dex */
public final class a extends View.DragShadowBuilder {

    /* renamed from: d, reason: collision with root package name */
    public static final int f17389d = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final androidx.compose.ui.unit.d density;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long decorationSize;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final ld.l<androidx.compose.ui.graphics.drawscope.f, k2> drawDragDecoration;

    public /* synthetic */ a(androidx.compose.ui.unit.d dVar, long j4, ld.l lVar, w wVar) {
        this(dVar, j4, lVar);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onDrawShadow(@l Canvas canvas) {
        androidx.compose.ui.graphics.drawscope.a aVar = new androidx.compose.ui.graphics.drawscope.a();
        androidx.compose.ui.unit.d dVar = this.density;
        long j4 = this.decorationSize;
        androidx.compose.ui.unit.w wVar = androidx.compose.ui.unit.w.Ltr;
        v1 b5 = h0.b(canvas);
        ld.l<androidx.compose.ui.graphics.drawscope.f, k2> lVar = this.drawDragDecoration;
        a.C0331a drawParams = aVar.getDrawParams();
        androidx.compose.ui.unit.d density = drawParams.getDensity();
        androidx.compose.ui.unit.w layoutDirection = drawParams.getLayoutDirection();
        v1 canvas2 = drawParams.getCanvas();
        long size = drawParams.getSize();
        a.C0331a drawParams2 = aVar.getDrawParams();
        drawParams2.l(dVar);
        drawParams2.m(wVar);
        drawParams2.k(b5);
        drawParams2.n(j4);
        b5.C();
        lVar.invoke(aVar);
        b5.o();
        a.C0331a drawParams3 = aVar.getDrawParams();
        drawParams3.l(density);
        drawParams3.m(layoutDirection);
        drawParams3.k(canvas2);
        drawParams3.n(size);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onProvideShadowMetrics(@l Point outShadowSize, @l Point outShadowTouchPoint) {
        androidx.compose.ui.unit.d dVar = this.density;
        outShadowSize.set(dVar.q2(dVar.S(n.t(this.decorationSize))), dVar.q2(dVar.S(n.m(this.decorationSize))));
        outShadowTouchPoint.set(outShadowSize.x / 2, outShadowSize.y / 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private a(androidx.compose.ui.unit.d dVar, long j4, ld.l<? super androidx.compose.ui.graphics.drawscope.f, k2> lVar) {
        this.density = dVar;
        this.decorationSize = j4;
        this.drawDragDecoration = lVar;
    }
}
