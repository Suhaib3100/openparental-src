package androidx.compose.foundation.shape;

import androidx.annotation.g0;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: RoundedCornerShape.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\t¢\u0006\u0004\b\n\u0010\b\u001a\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a8\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a5\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0014\u001a5\u0010\u001a\u001a\u00020\u00022\b\b\u0003\u0010\u0016\u001a\u00020\u000b2\b\b\u0003\u0010\u0017\u001a\u00020\u000b2\b\b\u0003\u0010\u0018\u001a\u00020\u000b2\b\b\u0003\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001b\"\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/foundation/shape/f;", "corner", "Landroidx/compose/foundation/shape/o;", "e", "(Landroidx/compose/foundation/shape/f;)Landroidx/compose/foundation/shape/o;", "Landroidx/compose/ui/unit/h;", "size", "h", "(F)Landroidx/compose/foundation/shape/o;", "", "a", "", "percent", "c", "(I)Landroidx/compose/foundation/shape/o;", "topStart", "topEnd", "bottomEnd", "bottomStart", "i", "(FFFF)Landroidx/compose/foundation/shape/o;", "b", "topStartPercent", "topEndPercent", "bottomEndPercent", "bottomStartPercent", "d", "(IIII)Landroidx/compose/foundation/shape/o;", "Landroidx/compose/foundation/shape/o;", "k", "()Landroidx/compose/foundation/shape/o;", "CircleShape", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nRoundedCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundedCornerShape.kt\nandroidx/compose/foundation/shape/RoundedCornerShapeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,201:1\n154#2:202\n154#2:203\n154#2:204\n154#2:205\n*S KotlinDebug\n*F\n+ 1 RoundedCornerShape.kt\nandroidx/compose/foundation/shape/RoundedCornerShapeKt\n*L\n148#1:202\n149#1:203\n150#1:204\n151#1:205\n*E\n"})
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final o f7072a = c(50);

    @fg.l
    public static final o a(float f4) {
        f a5 = g.a(f4);
        return new o(a5, a5, a5, a5);
    }

    @fg.l
    public static final o b(float f4, float f5, float f6, float f7) {
        return new o(g.a(f4), new n(f5), new n(f6), new n(f7));
    }

    @fg.l
    public static final o c(int i4) {
        f b5 = g.b(i4);
        return new o(b5, b5, b5, b5);
    }

    @fg.l
    public static final o d(@g0(from = 0, to = 100) int i4, @g0(from = 0, to = 100) int i5, @g0(from = 0, to = 100) int i6, @g0(from = 0, to = 100) int i7) {
        return new o(g.b(i4), g.b(i5), g.b(i6), g.b(i7));
    }

    @fg.l
    public static final o e(@fg.l f fVar) {
        return new o(fVar, fVar, fVar, fVar);
    }

    public static /* synthetic */ o f(float f4, float f5, float f6, float f7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = 0.0f;
        }
        if ((i4 & 2) != 0) {
            f5 = 0.0f;
        }
        if ((i4 & 4) != 0) {
            f6 = 0.0f;
        }
        if ((i4 & 8) != 0) {
            f7 = 0.0f;
        }
        return b(f4, f5, f6, f7);
    }

    public static /* synthetic */ o g(int i4, int i5, int i6, int i7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i4 = 0;
        }
        if ((i10 & 2) != 0) {
            i5 = 0;
        }
        if ((i10 & 4) != 0) {
            i6 = 0;
        }
        if ((i10 & 8) != 0) {
            i7 = 0;
        }
        return d(i4, i5, i6, i7);
    }

    @fg.l
    public static final o h(float f4) {
        f c5 = g.c(f4);
        return new o(c5, c5, c5, c5);
    }

    @fg.l
    public static final o i(float f4, float f5, float f6, float f7) {
        return new o(g.c(f4), g.c(f5), g.c(f6), g.c(f7));
    }

    public static /* synthetic */ o j(float f4, float f5, float f6, float f7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = androidx.compose.ui.unit.h.g(0);
        }
        if ((i4 & 2) != 0) {
            f5 = androidx.compose.ui.unit.h.g(0);
        }
        if ((i4 & 4) != 0) {
            f6 = androidx.compose.ui.unit.h.g(0);
        }
        if ((i4 & 8) != 0) {
            f7 = androidx.compose.ui.unit.h.g(0);
        }
        return i(f4, f5, f6, f7);
    }

    @fg.l
    public static final o k() {
        return f7072a;
    }
}
