package androidx.compose.foundation;

import androidx.compose.ui.graphics.e6;
import kotlin.Metadata;

/* compiled from: Background.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BF\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\r*\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R%\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/foundation/BackgroundElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/o;", "Landroidx/compose/ui/graphics/d2;", "color", "Landroidx/compose/ui/graphics/t1;", "brush", "", "alpha", "Landroidx/compose/ui/graphics/e6;", "shape", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "Lkotlin/u;", "inspectorInfo", "<init>", "(JLandroidx/compose/ui/graphics/t1;FLandroidx/compose/ui/graphics/e6;Lld/l;Lkotlin/jvm/internal/w;)V", "n", "()Landroidx/compose/foundation/o;", "node", "o", "(Landroidx/compose/foundation/o;)V", "k", "(Landroidx/compose/ui/platform/a2;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "J", "e", "Landroidx/compose/ui/graphics/t1;", "f", "F", "g", "Landroidx/compose/ui/graphics/e6;", "h", "Lld/l;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BackgroundElement extends androidx.compose.ui.node.y0<o> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long color;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final androidx.compose.ui.graphics.t1 brush;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float alpha;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e6 shape;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<androidx.compose.ui.platform.a2, kotlin.k2> inspectorInfo;

    public /* synthetic */ BackgroundElement(long j4, androidx.compose.ui.graphics.t1 t1Var, float f4, e6 e6Var, ld.l lVar, kotlin.jvm.internal.w wVar) {
        this(j4, t1Var, f4, e6Var, lVar);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        BackgroundElement backgroundElement = other instanceof BackgroundElement ? (BackgroundElement) other : null;
        return backgroundElement != null && androidx.compose.ui.graphics.d2.y(this.color, backgroundElement.color) && kotlin.jvm.internal.l0.g(this.brush, backgroundElement.brush) && this.alpha == backgroundElement.alpha && kotlin.jvm.internal.l0.g(this.shape, backgroundElement.shape);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        int K = androidx.compose.ui.graphics.d2.K(this.color) * 31;
        androidx.compose.ui.graphics.t1 t1Var = this.brush;
        return this.shape.hashCode() + androidx.compose.animation.l0.a(this.alpha, (K + (t1Var != null ? t1Var.hashCode() : 0)) * 31, 31);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l androidx.compose.ui.platform.a2 a2Var) {
        this.inspectorInfo.invoke(a2Var);
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public o i() {
        return new o(this.color, this.brush, this.alpha, this.shape, null);
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l o node) {
        node.D7(this.color);
        node.C7(this.brush);
        node.k(this.alpha);
        node.h5(this.shape);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BackgroundElement(long r8, androidx.compose.ui.graphics.t1 r10, float r11, androidx.compose.ui.graphics.e6 r12, ld.l r13, int r14, kotlin.jvm.internal.w r15) {
        /*
            r7 = this;
            r15 = r14 & 1
            if (r15 == 0) goto Ld
            androidx.compose.ui.graphics.d2$a r8 = androidx.compose.ui.graphics.d2.INSTANCE
            r8.getClass()
            long r8 = androidx.compose.ui.graphics.d2.k()
        Ld:
            r1 = r8
            r8 = r14 & 2
            if (r8 == 0) goto L13
            r10 = 0
        L13:
            r3 = r10
            r0 = r7
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BackgroundElement.<init>(long, androidx.compose.ui.graphics.t1, float, androidx.compose.ui.graphics.e6, ld.l, int, kotlin.jvm.internal.w):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private BackgroundElement(long j4, androidx.compose.ui.graphics.t1 t1Var, float f4, e6 e6Var, ld.l<? super androidx.compose.ui.platform.a2, kotlin.k2> lVar) {
        this.color = j4;
        this.brush = t1Var;
        this.alpha = f4;
        this.shape = e6Var;
        this.inspectorInfo = lVar;
    }
}
