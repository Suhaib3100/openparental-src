package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.u;
import androidx.compose.ui.graphics.a1;
import androidx.compose.ui.graphics.b5;
import androidx.compose.ui.graphics.g5;
import androidx.compose.ui.unit.w;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: AbsoluteCutCornerShape.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJB\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0015\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/foundation/shape/a;", "Landroidx/compose/foundation/shape/e;", "Landroidx/compose/foundation/shape/f;", "topLeft", "topRight", "bottomRight", "bottomLeft", "<init>", "(Landroidx/compose/foundation/shape/f;Landroidx/compose/foundation/shape/f;Landroidx/compose/foundation/shape/f;Landroidx/compose/foundation/shape/f;)V", "Li0/n;", "size", "", "topStart", "topEnd", "bottomEnd", "bottomStart", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/graphics/b5;", "e", "(JFFFFLandroidx/compose/ui/unit/w;)Landroidx/compose/ui/graphics/b5;", "j", "(Landroidx/compose/foundation/shape/f;Landroidx/compose/foundation/shape/f;Landroidx/compose/foundation/shape/f;Landroidx/compose/foundation/shape/f;)Landroidx/compose/foundation/shape/a;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: f, reason: collision with root package name */
    public static final int f7057f = 0;

    public a(@fg.l f fVar, @fg.l f fVar2, @fg.l f fVar3, @fg.l f fVar4) {
        super(fVar, fVar2, fVar3, fVar4);
    }

    @Override // androidx.compose.foundation.shape.e
    public e c(f fVar, f fVar2, f fVar3, f fVar4) {
        return new a(fVar, fVar2, fVar3, fVar4);
    }

    @Override // androidx.compose.foundation.shape.e
    @fg.l
    public b5 e(long size, float topStart, float topEnd, float bottomEnd, float bottomStart, @fg.l w layoutDirection) {
        if (topStart + topEnd + bottomStart + bottomEnd == 0.0f) {
            return new b5.b(i0.o.m(size));
        }
        g5 a5 = a1.a();
        a5.s(0.0f, topStart);
        a5.z(topStart, 0.0f);
        a5.z(i0.n.t(size) - topEnd, 0.0f);
        a5.z(i0.n.t(size), topEnd);
        a5.z(i0.n.t(size), i0.n.m(size) - bottomEnd);
        a5.z(i0.n.t(size) - bottomEnd, i0.n.m(size));
        a5.z(bottomStart, i0.n.m(size));
        a5.z(0.0f, i0.n.m(size) - bottomStart);
        a5.close();
        return new b5.a(a5);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return l0.g(getTopStart(), aVar.getTopStart()) && l0.g(getTopEnd(), aVar.getTopEnd()) && l0.g(getBottomEnd(), aVar.getBottomEnd()) && l0.g(getBottomStart(), aVar.getBottomStart());
    }

    public int hashCode() {
        return getBottomStart().hashCode() + ((getBottomEnd().hashCode() + ((getTopEnd().hashCode() + (getTopStart().hashCode() * 31)) * 31)) * 31);
    }

    @fg.l
    public a j(@fg.l f topStart, @fg.l f topEnd, @fg.l f bottomEnd, @fg.l f bottomStart) {
        return new a(topStart, topEnd, bottomEnd, bottomStart);
    }

    @fg.l
    public String toString() {
        return "AbsoluteCutCornerShape(topLeft = " + getTopStart() + ", topRight = " + getTopEnd() + ", bottomRight = " + getBottomEnd() + ", bottomLeft = " + getBottomStart() + ')';
    }
}
