package androidx.compose.foundation;

import kotlin.Metadata;

/* compiled from: BorderStroke.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/c0;", "", "Landroidx/compose/ui/unit/h;", "width", "Landroidx/compose/ui/graphics/t1;", "brush", "<init>", "(FLandroidx/compose/ui/graphics/t1;Lkotlin/jvm/internal/w;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(FLandroidx/compose/ui/graphics/t1;)Landroidx/compose/foundation/c0;", "F", "d", "()F", "b", "Landroidx/compose/ui/graphics/t1;", "c", "()Landroidx/compose/ui/graphics/t1;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f3538c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float width;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.graphics.t1 brush;

    public /* synthetic */ c0(float f4, androidx.compose.ui.graphics.t1 t1Var, kotlin.jvm.internal.w wVar) {
        this(f4, t1Var);
    }

    public static c0 b(c0 c0Var, float f4, androidx.compose.ui.graphics.t1 t1Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = c0Var.width;
        }
        if ((i4 & 2) != 0) {
            t1Var = c0Var.brush;
        }
        c0Var.getClass();
        return new c0(f4, t1Var);
    }

    @fg.l
    public final c0 a(float width, @fg.l androidx.compose.ui.graphics.t1 brush) {
        return new c0(width, brush);
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final androidx.compose.ui.graphics.t1 getBrush() {
        return this.brush;
    }

    /* renamed from: d, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) other;
        return androidx.compose.ui.unit.h.l(this.width, c0Var.width) && kotlin.jvm.internal.l0.g(this.brush, c0Var.brush);
    }

    public int hashCode() {
        return this.brush.hashCode() + (androidx.compose.ui.unit.h.n(this.width) * 31);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("BorderStroke(width=");
        b0.a(this.width, sb, ", brush=");
        sb.append(this.brush);
        sb.append(')');
        return sb.toString();
    }

    private c0(float f4, androidx.compose.ui.graphics.t1 t1Var) {
        this.width = f4;
        this.brush = t1Var;
    }
}
