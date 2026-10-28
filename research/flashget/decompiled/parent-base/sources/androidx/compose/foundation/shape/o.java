package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.u;
import androidx.compose.ui.graphics.b5;
import androidx.compose.ui.unit.w;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: RoundedCornerShape.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJB\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/shape/o;", "Landroidx/compose/foundation/shape/e;", "Landroidx/compose/foundation/shape/f;", "topStart", "topEnd", "bottomEnd", "bottomStart", "<init>", "(Landroidx/compose/foundation/shape/f;Landroidx/compose/foundation/shape/f;Landroidx/compose/foundation/shape/f;Landroidx/compose/foundation/shape/f;)V", "Li0/n;", "size", "", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/graphics/b5;", "e", "(JFFFFLandroidx/compose/ui/unit/w;)Landroidx/compose/ui/graphics/b5;", "j", "(Landroidx/compose/foundation/shape/f;Landroidx/compose/foundation/shape/f;Landroidx/compose/foundation/shape/f;Landroidx/compose/foundation/shape/f;)Landroidx/compose/foundation/shape/o;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o extends e {

    /* renamed from: f, reason: collision with root package name */
    public static final int f7071f = 0;

    public o(@fg.l f fVar, @fg.l f fVar2, @fg.l f fVar3, @fg.l f fVar4) {
        super(fVar, fVar2, fVar3, fVar4);
    }

    @Override // androidx.compose.foundation.shape.e
    public e c(f fVar, f fVar2, f fVar3, f fVar4) {
        return new o(fVar, fVar2, fVar3, fVar4);
    }

    @Override // androidx.compose.foundation.shape.e
    @fg.l
    public b5 e(long size, float topStart, float topEnd, float bottomEnd, float bottomStart, @fg.l w layoutDirection) {
        if (topStart + topEnd + bottomEnd + bottomStart == 0.0f) {
            return new b5.b(i0.o.m(size));
        }
        i0.i m4 = i0.o.m(size);
        w wVar = w.Ltr;
        return new b5.c(i0.m.c(m4, i0.b.b(layoutDirection == wVar ? topStart : topEnd, 0.0f, 2, null), i0.b.b(layoutDirection == wVar ? topEnd : topStart, 0.0f, 2, null), i0.b.b(layoutDirection == wVar ? bottomEnd : bottomStart, 0.0f, 2, null), i0.b.b(layoutDirection == wVar ? bottomStart : bottomEnd, 0.0f, 2, null)));
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof o)) {
            return false;
        }
        o oVar = (o) other;
        return l0.g(getTopStart(), oVar.getTopStart()) && l0.g(getTopEnd(), oVar.getTopEnd()) && l0.g(getBottomEnd(), oVar.getBottomEnd()) && l0.g(getBottomStart(), oVar.getBottomStart());
    }

    public int hashCode() {
        return getBottomStart().hashCode() + ((getBottomEnd().hashCode() + ((getTopEnd().hashCode() + (getTopStart().hashCode() * 31)) * 31)) * 31);
    }

    @fg.l
    public o j(@fg.l f topStart, @fg.l f topEnd, @fg.l f bottomEnd, @fg.l f bottomStart) {
        return new o(topStart, topEnd, bottomEnd, bottomStart);
    }

    @fg.l
    public String toString() {
        return "RoundedCornerShape(topStart = " + getTopStart() + ", topEnd = " + getTopEnd() + ", bottomEnd = " + getBottomEnd() + ", bottomStart = " + getBottomStart() + ')';
    }
}
