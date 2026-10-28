package androidx.compose.ui.unit;

import androidx.collection.m1;
import androidx.collection.q2;
import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: Constraints.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a7\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001c\u0010\t\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\r\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\n\u001a\u001e\u0010\u000f\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001e\u0010\u0012\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0010\u001a\u001e\u0010\u0014\u001a\u00020\u0013*\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a*\u0010\u0018\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001f\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"", "minWidth", "maxWidth", "minHeight", "maxHeight", "Landroidx/compose/ui/unit/b;", "a", "(IIII)J", "otherConstraints", "e", "(JJ)J", "Landroidx/compose/ui/unit/u;", "size", "d", "width", "g", "(JI)I", "height", "f", "", "h", "(JJ)Z", "horizontal", "vertical", "i", "(JII)J", "max", "value", "c", "(II)I", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {
    @x4
    public static final long a(int i4, int i5, int i6, int i7) {
        if (i5 < i4) {
            throw new IllegalArgumentException(m1.a("maxWidth(", i5, ") must be >= than minWidth(", i4, ')').toString());
        }
        if (i7 < i6) {
            throw new IllegalArgumentException(m1.a("maxHeight(", i7, ") must be >= than minHeight(", i6, ')').toString());
        }
        if (i4 < 0 || i6 < 0) {
            throw new IllegalArgumentException(q2.a("minWidth(", i4, ") and minHeight(", i6, ") must be >= 0").toString());
        }
        return b.INSTANCE.b(i4, i5, i6, i7);
    }

    public static /* synthetic */ long b(int i4, int i5, int i6, int i7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i4 = 0;
        }
        if ((i10 & 2) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        if ((i10 & 4) != 0) {
            i6 = 0;
        }
        if ((i10 & 8) != 0) {
            i7 = Integer.MAX_VALUE;
        }
        return a(i4, i5, i6, i7);
    }

    private static final int c(int i4, int i5) {
        if (i4 == Integer.MAX_VALUE) {
            return i4;
        }
        int i6 = i4 + i5;
        if (i6 < 0) {
            return 0;
        }
        return i6;
    }

    @x4
    public static final long d(long j4, long j5) {
        return v.a(kotlin.ranges.s.I(u.m(j5), b.r(j4), b.p(j4)), kotlin.ranges.s.I((int) (j5 & 4294967295L), b.q(j4), b.o(j4)));
    }

    public static final long e(long j4, long j5) {
        return a(kotlin.ranges.s.I(b.r(j5), b.r(j4), b.p(j4)), kotlin.ranges.s.I(b.p(j5), b.r(j4), b.p(j4)), kotlin.ranges.s.I(b.q(j5), b.q(j4), b.o(j4)), kotlin.ranges.s.I(b.o(j5), b.q(j4), b.o(j4)));
    }

    @x4
    public static final int f(long j4, int i4) {
        return kotlin.ranges.s.I(i4, b.q(j4), b.o(j4));
    }

    @x4
    public static final int g(long j4, int i4) {
        return kotlin.ranges.s.I(i4, b.r(j4), b.p(j4));
    }

    @x4
    public static final boolean h(long j4, long j5) {
        int r4 = b.r(j4);
        int p4 = b.p(j4);
        int m4 = u.m(j5);
        if (r4 <= m4 && m4 <= p4) {
            int q4 = b.q(j4);
            int o4 = b.o(j4);
            int i4 = (int) (j5 & 4294967295L);
            if (q4 <= i4 && i4 <= o4) {
                return true;
            }
        }
        return false;
    }

    @x4
    public static final long i(long j4, int i4, int i5) {
        int r4 = b.r(j4) + i4;
        if (r4 < 0) {
            r4 = 0;
        }
        int c5 = c(b.p(j4), i4);
        int q4 = b.q(j4) + i5;
        return a(r4, c5, q4 >= 0 ? q4 : 0, c(b.o(j4), i5));
    }

    public static /* synthetic */ long j(long j4, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return i(j4, i4, i5);
    }
}
