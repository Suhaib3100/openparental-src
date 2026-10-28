package kotlin.ranges;

import kotlin.Metadata;
import kotlin.c1;

@Metadata(d1 = {"kotlin/ranges/t", "kotlin/ranges/u"}, d2 = {}, k = 4, mv = {1, 9, 0}, xi = 49)
/* loaded from: classes7.dex */
public final class s extends u {
    private s() {
    }

    public static int B(int i4, int i5) {
        return i4 > i5 ? i5 : i4;
    }

    @fg.l
    @c1(version = "1.1")
    public static f d(double d5, double d6) {
        return new d(d5, d6);
    }

    @fg.l
    @c1(version = "1.1")
    public static f e(float f4, float f5) {
        return new e(f4, f5);
    }

    public static int u(int i4, int i5) {
        return i4 < i5 ? i5 : i4;
    }
}
