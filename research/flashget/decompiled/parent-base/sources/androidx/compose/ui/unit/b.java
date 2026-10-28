package androidx.compose.ui.unit;

import androidx.collection.q2;
import androidx.collection.r2;
import androidx.compose.foundation.layout.f3;
import androidx.compose.runtime.m1;
import androidx.compose.runtime.x4;
import kotlin.Metadata;
import kotlin.w0;

/* compiled from: Constraints.kt */
@kd.g
@m1
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087@\u0018\u0000 .2\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011R\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0011R\u0011\u0010\n\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0011R\u0011\u0010\"\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010$\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b#\u0010!R\u001a\u0010'\u001a\u00020\u00138FX\u0087\u0004¢\u0006\f\u0012\u0004\b&\u0010\u0019\u001a\u0004\b%\u0010!R\u001a\u0010*\u001a\u00020\u00138FX\u0087\u0004¢\u0006\f\u0012\u0004\b)\u0010\u0019\u001a\u0004\b(\u0010!R\u001a\u0010-\u001a\u00020\u00138FX\u0087\u0004¢\u0006\f\u0012\u0004\b,\u0010\u0019\u001a\u0004\b+\u0010!\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Landroidx/compose/ui/unit/b;", "", "", "value", "c", "(J)J", "", "minWidth", "maxWidth", "minHeight", "maxHeight", "d", "(JIIII)J", "", "w", "(J)Ljava/lang/String;", "t", "(J)I", "other", "", "f", "(JLjava/lang/Object;)Z", "a", "J", "s", "()V", "h", "focusIndex", "r", "p", "q", "o", "j", "(J)Z", "hasBoundedWidth", "i", "hasBoundedHeight", "n", "m", "hasFixedWidth", "l", "k", "hasFixedHeight", "v", "u", "isZero", "b", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final int f21467c = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private static final long f21468d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static final long f21469e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final long f21470f = 2;

    /* renamed from: g, reason: collision with root package name */
    private static final long f21471g = 3;

    /* renamed from: h, reason: collision with root package name */
    private static final long f21472h = 3;

    /* renamed from: i, reason: collision with root package name */
    private static final int f21473i = 16;

    /* renamed from: j, reason: collision with root package name */
    private static final int f21474j = 65535;

    /* renamed from: k, reason: collision with root package name */
    private static final int f21475k = 15;

    /* renamed from: l, reason: collision with root package name */
    private static final int f21476l = 32767;

    /* renamed from: m, reason: collision with root package name */
    private static final int f21477m = 18;

    /* renamed from: o, reason: collision with root package name */
    private static final int f21479o = 13;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long value;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: q, reason: collision with root package name */
    @fg.l
    private static final int[] f21481q = {18, 20, 17, 15};

    /* renamed from: n, reason: collision with root package name */
    private static final int f21478n = 262143;

    /* renamed from: p, reason: collision with root package name */
    private static final int f21480p = 8191;

    /* renamed from: r, reason: collision with root package name */
    @fg.l
    private static final int[] f21482r = {65535, f21478n, 32767, f21480p};

    /* renamed from: s, reason: collision with root package name */
    @fg.l
    private static final int[] f21483s = {32767, f21480p, 65535, f21478n};

    /* compiled from: Constraints.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u000eJ5\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0014\u0010!\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u001dR\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u001dR\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u001dR\u0014\u0010%\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u001dR\u0014\u0010'\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u0014\u0010(\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001bR\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\u001dR\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\u001dR\u0014\u0010+\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001b\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"Landroidx/compose/ui/unit/b$a;", "", "<init>", "()V", "", "size", "a", "(I)I", "width", "height", "Landroidx/compose/ui/unit/b;", "c", "(II)J", "e", "(I)J", "d", "minWidth", "maxWidth", "minHeight", "maxHeight", "b", "(IIII)J", "", "FocusMask", "J", "", "HeightMask", "[I", "Infinity", "I", "MaxFocusBits", "MaxFocusHeight", "MaxFocusMask", "MaxFocusWidth", "MaxNonFocusBits", "MaxNonFocusMask", "MinFocusBits", "MinFocusHeight", "MinFocusMask", "MinFocusWidth", "MinHeightOffsets", "MinNonFocusBits", "MinNonFocusMask", "WidthMask", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.unit.b$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        private final int a(int size) {
            if (size < b.f21480p) {
                return 13;
            }
            if (size < 32767) {
                return 15;
            }
            if (size < 65535) {
                return 16;
            }
            if (size < b.f21478n) {
                return 18;
            }
            throw new IllegalArgumentException(r2.a("Can't represent a size of ", size, " in Constraints"));
        }

        public final long b(int minWidth, int maxWidth, int minHeight, int maxHeight) {
            long j4;
            int i4 = maxHeight == Integer.MAX_VALUE ? minHeight : maxHeight;
            int a5 = a(i4);
            int i5 = maxWidth == Integer.MAX_VALUE ? minWidth : maxWidth;
            int a6 = a(i5);
            if (a5 + a6 > 31) {
                throw new IllegalArgumentException(q2.a("Can't represent a width of ", i5, " and height of ", i4, " in Constraints"));
            }
            if (a6 == 13) {
                j4 = 3;
            } else if (a6 == 18) {
                j4 = 1;
            } else if (a6 == 15) {
                j4 = 2;
            } else {
                if (a6 != 16) {
                    throw new IllegalStateException("Should only have the provided constants.");
                }
                j4 = 0;
            }
            int i6 = maxWidth == Integer.MAX_VALUE ? 0 : maxWidth + 1;
            int i7 = maxHeight != Integer.MAX_VALUE ? maxHeight + 1 : 0;
            int i10 = b.f21481q[(int) j4];
            return (i6 << 33) | j4 | (minWidth << 2) | (minHeight << i10) | (i7 << (i10 + 31));
        }

        @x4
        public final long c(int width, int height) {
            if (width < 0 || height < 0) {
                throw new IllegalArgumentException(q2.a("width(", width, ") and height(", height, ") must be >= 0").toString());
            }
            return b(width, width, height, height);
        }

        @x4
        public final long d(int height) {
            if (height >= 0) {
                return b(0, Integer.MAX_VALUE, height, height);
            }
            throw new IllegalArgumentException(r2.a("height(", height, ") must be >= 0").toString());
        }

        @x4
        public final long e(int width) {
            if (width >= 0) {
                return b(width, width, 0, Integer.MAX_VALUE);
            }
            throw new IllegalArgumentException(r2.a("width(", width, ") must be >= 0").toString());
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    private /* synthetic */ b(long j4) {
        this.value = j4;
    }

    public static final /* synthetic */ b b(long j4) {
        return new b(j4);
    }

    public static long c(long j4) {
        return j4;
    }

    public static final long d(long j4, int i4, int i5, int i6, int i7) {
        if (i6 < 0 || i4 < 0) {
            throw new IllegalArgumentException(q2.a("minHeight(", i6, ") and minWidth(", i4, ") must be >= 0").toString());
        }
        if (i5 < i4 && i5 != Integer.MAX_VALUE) {
            throw new IllegalArgumentException(androidx.collection.m1.a("maxWidth(", i5, ") must be >= minWidth(", i4, ')').toString());
        }
        if (i7 >= i6 || i7 == Integer.MAX_VALUE) {
            return INSTANCE.b(i4, i5, i6, i7);
        }
        throw new IllegalArgumentException(androidx.collection.m1.a("maxHeight(", i7, ") must be >= minHeight(", i6, ')').toString());
    }

    public static /* synthetic */ long e(long j4, int i4, int i5, int i6, int i7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i4 = r(j4);
        }
        int i11 = i4;
        if ((i10 & 2) != 0) {
            i5 = p(j4);
        }
        int i12 = i5;
        if ((i10 & 4) != 0) {
            i6 = q(j4);
        }
        int i13 = i6;
        if ((i10 & 8) != 0) {
            i7 = o(j4);
        }
        return d(j4, i11, i12, i13, i7);
    }

    public static boolean f(long j4, Object obj) {
        return (obj instanceof b) && j4 == ((b) obj).value;
    }

    public static final boolean g(long j4, long j5) {
        return j4 == j5;
    }

    private static final int h(long j4) {
        return (int) (j4 & 3);
    }

    public static final boolean i(long j4) {
        int i4 = (int) (3 & j4);
        return (((int) (j4 >> (f21481q[i4] + 31))) & f21483s[i4]) != 0;
    }

    public static final boolean j(long j4) {
        return (((int) (j4 >> 33)) & f21482r[(int) (3 & j4)]) != 0;
    }

    @x4
    public static /* synthetic */ void k() {
    }

    public static final boolean l(long j4) {
        return o(j4) == q(j4);
    }

    @x4
    public static /* synthetic */ void m() {
    }

    public static final boolean n(long j4) {
        return p(j4) == r(j4);
    }

    public static final int o(long j4) {
        int i4 = (int) (3 & j4);
        int i5 = ((int) (j4 >> (f21481q[i4] + 31))) & f21483s[i4];
        if (i5 == 0) {
            return Integer.MAX_VALUE;
        }
        return i5 - 1;
    }

    public static final int p(long j4) {
        int i4 = ((int) (j4 >> 33)) & f21482r[(int) (3 & j4)];
        if (i4 == 0) {
            return Integer.MAX_VALUE;
        }
        return i4 - 1;
    }

    public static final int q(long j4) {
        int i4 = (int) (3 & j4);
        return ((int) (j4 >> f21481q[i4])) & f21483s[i4];
    }

    public static final int r(long j4) {
        return ((int) (j4 >> 2)) & f21482r[(int) (3 & j4)];
    }

    @w0
    public static /* synthetic */ void s() {
    }

    public static int t(long j4) {
        return Long.hashCode(j4);
    }

    @x4
    public static /* synthetic */ void u() {
    }

    public static final boolean v(long j4) {
        return p(j4) == 0 || o(j4) == 0;
    }

    @fg.l
    public static String w(long j4) {
        int p4 = p(j4);
        String valueOf = p4 == Integer.MAX_VALUE ? "Infinity" : String.valueOf(p4);
        int o4 = o(j4);
        String valueOf2 = o4 != Integer.MAX_VALUE ? String.valueOf(o4) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(r(j4));
        sb.append(", maxWidth = ");
        sb.append(valueOf);
        sb.append(", minHeight = ");
        sb.append(q(j4));
        sb.append(", maxHeight = ");
        return f3.a(sb, valueOf2, ')');
    }

    public boolean equals(Object obj) {
        return f(this.value, obj);
    }

    public int hashCode() {
        return Long.hashCode(this.value);
    }

    @fg.l
    public String toString() {
        return w(this.value);
    }

    /* renamed from: x, reason: from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }
}
