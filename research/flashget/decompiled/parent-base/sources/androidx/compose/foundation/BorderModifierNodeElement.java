package androidx.compose.foundation;

import androidx.compose.ui.graphics.e6;
import androidx.compose.ui.graphics.g6;
import kotlin.Metadata;

/* compiled from: Border.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u000e*\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u0003HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0019\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Landroidx/compose/foundation/BorderModifierNodeElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/a0;", "Landroidx/compose/ui/unit/h;", "width", "Landroidx/compose/ui/graphics/t1;", "brush", "Landroidx/compose/ui/graphics/e6;", "shape", "<init>", "(FLandroidx/compose/ui/graphics/t1;Landroidx/compose/ui/graphics/e6;Lkotlin/jvm/internal/w;)V", "v", "()Landroidx/compose/foundation/a0;", "node", "Lkotlin/k2;", "A", "(Landroidx/compose/foundation/a0;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "n", "()F", "o", "()Landroidx/compose/ui/graphics/t1;", "r", "()Landroidx/compose/ui/graphics/e6;", "s", "(FLandroidx/compose/ui/graphics/t1;Landroidx/compose/ui/graphics/e6;)Landroidx/compose/foundation/BorderModifierNodeElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "F", "z", "e", "Landroidx/compose/ui/graphics/t1;", "w", "f", "Landroidx/compose/ui/graphics/e6;", "x", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BorderModifierNodeElement extends androidx.compose.ui.node.y0<a0> {

    /* renamed from: g, reason: collision with root package name */
    public static final int f3434g = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float width;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.graphics.t1 brush;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e6 shape;

    public /* synthetic */ BorderModifierNodeElement(float f4, androidx.compose.ui.graphics.t1 t1Var, e6 e6Var, kotlin.jvm.internal.w wVar) {
        this(f4, t1Var, e6Var);
    }

    public static BorderModifierNodeElement u(BorderModifierNodeElement borderModifierNodeElement, float f4, androidx.compose.ui.graphics.t1 t1Var, e6 e6Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = borderModifierNodeElement.width;
        }
        if ((i4 & 2) != 0) {
            t1Var = borderModifierNodeElement.brush;
        }
        if ((i4 & 4) != 0) {
            e6Var = borderModifierNodeElement.shape;
        }
        borderModifierNodeElement.getClass();
        return new BorderModifierNodeElement(f4, t1Var, e6Var);
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l a0 node) {
        node.Q7(this.width);
        node.P7(this.brush);
        node.h5(this.shape);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) other;
        return androidx.compose.ui.unit.h.l(this.width, borderModifierNodeElement.width) && kotlin.jvm.internal.l0.g(this.brush, borderModifierNodeElement.brush) && kotlin.jvm.internal.l0.g(this.shape, borderModifierNodeElement.shape);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return this.shape.hashCode() + ((this.brush.hashCode() + (androidx.compose.ui.unit.h.n(this.width) * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l androidx.compose.ui.platform.a2 a2Var) {
        a2Var.d("border");
        a2Var.getProperties().c("width", androidx.compose.ui.unit.h.d(this.width));
        if (this.brush instanceof g6) {
            a2Var.getProperties().c("color", androidx.compose.ui.graphics.d2.n(((g6) this.brush).getValue()));
            a2Var.e(androidx.compose.ui.graphics.d2.n(((g6) this.brush).getValue()));
        } else {
            a2Var.getProperties().c("brush", this.brush);
        }
        a2Var.getProperties().c("shape", this.shape);
    }

    /* renamed from: n, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    @fg.l
    /* renamed from: o, reason: from getter */
    public final androidx.compose.ui.graphics.t1 getBrush() {
        return this.brush;
    }

    @fg.l
    /* renamed from: r, reason: from getter */
    public final e6 getShape() {
        return this.shape;
    }

    @fg.l
    public final BorderModifierNodeElement s(float width, @fg.l androidx.compose.ui.graphics.t1 brush, @fg.l e6 shape) {
        return new BorderModifierNodeElement(width, brush, shape);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("BorderModifierNodeElement(width=");
        b0.a(this.width, sb, ", brush=");
        sb.append(this.brush);
        sb.append(", shape=");
        sb.append(this.shape);
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public a0 i() {
        return new a0(this.width, this.brush, this.shape, null);
    }

    @fg.l
    public final androidx.compose.ui.graphics.t1 w() {
        return this.brush;
    }

    @fg.l
    public final e6 x() {
        return this.shape;
    }

    public final float z() {
        return this.width;
    }

    private BorderModifierNodeElement(float f4, androidx.compose.ui.graphics.t1 t1Var, e6 e6Var) {
        this.width = f4;
        this.brush = t1Var;
        this.shape = e6Var;
    }
}
