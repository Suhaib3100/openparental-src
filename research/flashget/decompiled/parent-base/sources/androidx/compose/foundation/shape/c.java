package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.u;
import androidx.compose.ui.graphics.b5;
import androidx.compose.ui.unit.w;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: AbsoluteRoundedCornerShape.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJB\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/foundation/shape/c;", "Landroidx/compose/foundation/shape/e;", "Landroidx/compose/foundation/shape/f;", "topLeft", "topRight", "bottomRight", "bottomLeft", "<init>", "(Landroidx/compose/foundation/shape/f;Landroidx/compose/foundation/shape/f;Landroidx/compose/foundation/shape/f;Landroidx/compose/foundation/shape/f;)V", "", "Li0/a;", "k", "(F)J", "Li0/n;", "size", "topStart", "topEnd", "bottomEnd", "bottomStart", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/graphics/b5;", "e", "(JFFFFLandroidx/compose/ui/unit/w;)Landroidx/compose/ui/graphics/b5;", "j", "(Landroidx/compose/foundation/shape/f;Landroidx/compose/foundation/shape/f;Landroidx/compose/foundation/shape/f;Landroidx/compose/foundation/shape/f;)Landroidx/compose/foundation/shape/c;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: f, reason: collision with root package name */
    public static final int f7058f = 0;

    public c(@fg.l f fVar, @fg.l f fVar2, @fg.l f fVar3, @fg.l f fVar4) {
        super(fVar, fVar2, fVar3, fVar4);
    }

    private final long k(float f4) {
        return i0.b.b(f4, 0.0f, 2, null);
    }

    @Override // androidx.compose.foundation.shape.e
    public e c(f fVar, f fVar2, f fVar3, f fVar4) {
        return new c(fVar, fVar2, fVar3, fVar4);
    }

    @Override // androidx.compose.foundation.shape.e
    @fg.l
    public b5 e(long size, float topStart, float topEnd, float bottomEnd, float bottomStart, @fg.l w layoutDirection) {
        return ((topStart + topEnd) + bottomEnd) + bottomStart == 0.0f ? new b5.b(i0.o.m(size)) : new b5.c(i0.m.c(i0.o.m(size), i0.b.b(topStart, 0.0f, 2, null), i0.b.b(topEnd, 0.0f, 2, null), i0.b.b(bottomEnd, 0.0f, 2, null), i0.b.b(bottomStart, 0.0f, 2, null)));
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return l0.g(getTopStart(), cVar.getTopStart()) && l0.g(getTopEnd(), cVar.getTopEnd()) && l0.g(getBottomEnd(), cVar.getBottomEnd()) && l0.g(getBottomStart(), cVar.getBottomStart());
    }

    public int hashCode() {
        return getBottomStart().hashCode() + ((getBottomEnd().hashCode() + ((getTopEnd().hashCode() + (getTopStart().hashCode() * 31)) * 31)) * 31);
    }

    @fg.l
    public c j(@fg.l f topStart, @fg.l f topEnd, @fg.l f bottomEnd, @fg.l f bottomStart) {
        return new c(topStart, topEnd, bottomEnd, bottomStart);
    }

    @fg.l
    public String toString() {
        return "AbsoluteRoundedCornerShape(topLeft = " + getTopStart() + ", topRight = " + getTopEnd() + ", bottomRight = " + getBottomEnd() + ", bottomLeft = " + getBottomStart() + ')';
    }
}
