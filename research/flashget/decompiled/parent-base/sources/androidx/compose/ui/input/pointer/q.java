package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.x0;

/* compiled from: PointerEvent.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0011\u0010\u0007\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0011\u0010\b\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0003\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\f\u001a\u00020\t*\u00020\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a\u001d\u0010\u000e\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0010\u0010\u0003\u001a\u0013\u0010\u0011\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0011\u0010\u0003\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0015\u001a\u00020\u0012*\u00020\u0000H\u0007¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u0013\u0010\u0016\u001a\u00020\u0012*\u00020\u0000H\u0007¢\u0006\u0004\b\u0016\u0010\u0014\u001a\u001e\u0010\u0019\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a$\u0010\u001d\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/input/pointer/b0;", "", "b", "(Landroidx/compose/ui/input/pointer/b0;)Z", "c", "d", "e", "p", "q", "Li0/f;", "k", "(Landroidx/compose/ui/input/pointer/b0;)J", "m", "ignoreConsumed", "n", "(Landroidx/compose/ui/input/pointer/b0;Z)J", "l", "a", "Lkotlin/k2;", "g", "(Landroidx/compose/ui/input/pointer/b0;)V", "h", "f", "Landroidx/compose/ui/unit/u;", "size", "i", "(Landroidx/compose/ui/input/pointer/b0;J)Z", "Li0/n;", "extendedTouchPadding", "j", "(Landroidx/compose/ui/input/pointer/b0;JJ)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q {
    @kotlin.k(message = "Partial consumption has been deprecated. Use isConsumed instead", replaceWith = @x0(expression = "isConsumed", imports = {}))
    public static final boolean a(@fg.l b0 b0Var) {
        return b0Var.D();
    }

    public static final boolean b(@fg.l b0 b0Var) {
        return (b0Var.D() || b0Var.getPreviousPressed() || !b0Var.getPressed()) ? false : true;
    }

    public static final boolean c(@fg.l b0 b0Var) {
        return !b0Var.getPreviousPressed() && b0Var.getPressed();
    }

    public static final boolean d(@fg.l b0 b0Var) {
        return (b0Var.D() || !b0Var.getPreviousPressed() || b0Var.getPressed()) ? false : true;
    }

    public static final boolean e(@fg.l b0 b0Var) {
        return b0Var.getPreviousPressed() && !b0Var.getPressed();
    }

    @kotlin.k(message = "Use consume() instead", replaceWith = @x0(expression = "consume()", imports = {}))
    public static final void f(@fg.l b0 b0Var) {
        b0Var.a();
    }

    @kotlin.k(message = "Partial consumption has been deprecated. Use consume() instead.", replaceWith = @x0(expression = "if (pressed != previousPressed) consume()", imports = {}))
    public static final void g(@fg.l b0 b0Var) {
        if (b0Var.getPressed() != b0Var.getPreviousPressed()) {
            b0Var.a();
        }
    }

    @kotlin.k(message = "Partial consumption has been deprecated. Use consume() instead.", replaceWith = @x0(expression = "if (positionChange() != Offset.Zero) consume()", imports = {}))
    public static final void h(@fg.l b0 b0Var) {
        long n4 = n(b0Var, false);
        i0.f.INSTANCE.getClass();
        if (i0.f.l(n4, i0.f.f74147c)) {
            return;
        }
        b0Var.a();
    }

    @kotlin.k(message = "Use isOutOfBounds() that supports minimum touch target", replaceWith = @x0(expression = "this.isOutOfBounds(size, extendedTouchPadding)", imports = {}))
    public static final boolean i(@fg.l b0 b0Var, long j4) {
        long position = b0Var.getPosition();
        float p4 = i0.f.p(position);
        float r4 = i0.f.r(position);
        return p4 < 0.0f || p4 > ((float) androidx.compose.ui.unit.u.m(j4)) || r4 < 0.0f || r4 > ((float) ((int) (j4 & 4294967295L)));
    }

    public static final boolean j(@fg.l b0 b0Var, long j4, long j5) {
        int type = b0Var.getType();
        q0.INSTANCE.getClass();
        if (!q0.i(type, q0.f18817d)) {
            return i(b0Var, j4);
        }
        long position = b0Var.getPosition();
        float p4 = i0.f.p(position);
        float r4 = i0.f.r(position);
        return p4 < (-i0.n.t(j5)) || p4 > i0.n.t(j5) + ((float) androidx.compose.ui.unit.u.m(j4)) || r4 < (-i0.n.m(j5)) || r4 > i0.n.m(j5) + ((float) ((int) (j4 & 4294967295L)));
    }

    public static final long k(@fg.l b0 b0Var) {
        return n(b0Var, false);
    }

    @kotlin.k(message = "Partial consumption has been deprecated. Use isConsumed instead", replaceWith = @x0(expression = "isConsumed", imports = {}))
    public static final boolean l(@fg.l b0 b0Var) {
        return b0Var.D();
    }

    public static final long m(@fg.l b0 b0Var) {
        return n(b0Var, true);
    }

    private static final long n(b0 b0Var, boolean z4) {
        long u4 = i0.f.u(b0Var.getPosition(), b0Var.getPreviousPosition());
        if (z4 || !b0Var.D()) {
            return u4;
        }
        i0.f.INSTANCE.getClass();
        return i0.f.f74147c;
    }

    static /* synthetic */ long o(b0 b0Var, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        return n(b0Var, z4);
    }

    public static final boolean p(@fg.l b0 b0Var) {
        long n4 = n(b0Var, false);
        i0.f.INSTANCE.getClass();
        return !i0.f.l(n4, i0.f.f74147c);
    }

    public static final boolean q(@fg.l b0 b0Var) {
        long n4 = n(b0Var, true);
        i0.f.INSTANCE.getClass();
        return !i0.f.l(n4, i0.f.f74147c);
    }
}
