package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* compiled from: WindowInsets.kt */
@kd.g
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0005J\u001a\u0010\u0012\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/layout/g3;", "", "", "value", "n", "(I)I", "sides", "s", "(II)I", "", "q", "(II)Z", "", "t", "(I)Ljava/lang/String;", "v", "r", "other", "o", "(ILjava/lang/Object;)Z", "a", "I", "b", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g3 {

    /* renamed from: c, reason: collision with root package name */
    private static final int f5041c = 8;

    /* renamed from: d, reason: collision with root package name */
    private static final int f5042d = 4;

    /* renamed from: e, reason: collision with root package name */
    private static final int f5043e = 2;

    /* renamed from: f, reason: collision with root package name */
    private static final int f5044f = 1;

    /* renamed from: i, reason: collision with root package name */
    private static final int f5047i = 16;

    /* renamed from: j, reason: collision with root package name */
    private static final int f5048j = 32;

    /* renamed from: k, reason: collision with root package name */
    private static final int f5049k;

    /* renamed from: l, reason: collision with root package name */
    private static final int f5050l;

    /* renamed from: m, reason: collision with root package name */
    private static final int f5051m;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: g, reason: collision with root package name */
    private static final int f5045g = 8 | 1;

    /* renamed from: h, reason: collision with root package name */
    private static final int f5046h = 4 | 2;

    /* renamed from: n, reason: collision with root package name */
    private static final int f5052n = 16 | 32;

    /* compiled from: WindowInsets.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR \u0010\u000b\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR \u0010\r\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001d\u0010\u0013\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001d\u0010\u0015\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001d\u0010\u0017\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001d\u0010\u0019\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001d\u0010\u001b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001d\u0010\u001d\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/layout/g3$a;", "", "<init>", "()V", "Landroidx/compose/foundation/layout/g3;", "AllowLeftInLtr", "I", "a", "()I", "AllowRightInLtr", "c", "AllowLeftInRtl", "b", "AllowRightInRtl", "d", "Start", "j", "End", "f", "Top", "k", "Bottom", "e", "Left", "h", "Right", "i", "Horizontal", "g", "Vertical", "l", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.g3$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final int a() {
            return g3.f5041c;
        }

        public final int b() {
            return g3.f5043e;
        }

        public final int c() {
            return g3.f5042d;
        }

        public final int d() {
            return g3.f5044f;
        }

        public final int e() {
            return g3.f5048j;
        }

        public final int f() {
            return g3.f5046h;
        }

        public final int g() {
            return g3.f5051m;
        }

        public final int h() {
            return g3.f5049k;
        }

        public final int i() {
            return g3.f5050l;
        }

        public final int j() {
            return g3.f5045g;
        }

        public final int k() {
            return g3.f5047i;
        }

        public final int l() {
            return g3.f5052n;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    static {
        int i4 = 8 | 2;
        f5049k = i4;
        int i5 = 4 | 1;
        f5050l = i5;
        f5051m = i4 | i5;
    }

    private /* synthetic */ g3(int i4) {
        this.value = i4;
    }

    public static final /* synthetic */ g3 m(int i4) {
        return new g3(i4);
    }

    private static int n(int i4) {
        return i4;
    }

    public static boolean o(int i4, Object obj) {
        return (obj instanceof g3) && i4 == ((g3) obj).value;
    }

    public static final boolean p(int i4, int i5) {
        return i4 == i5;
    }

    public static final boolean q(int i4, int i5) {
        return (i4 & i5) != 0;
    }

    public static int r(int i4) {
        return Integer.hashCode(i4);
    }

    public static final int s(int i4, int i5) {
        return i4 | i5;
    }

    @fg.l
    public static String t(int i4) {
        return f3.a(new StringBuilder("WindowInsetsSides("), v(i4), ')');
    }

    private static final String v(int i4) {
        StringBuilder sb = new StringBuilder();
        int i5 = f5045g;
        if ((i4 & i5) == i5) {
            w(sb, "Start");
        }
        int i6 = f5049k;
        if ((i4 & i6) == i6) {
            w(sb, "Left");
        }
        int i7 = f5047i;
        if ((i4 & i7) == i7) {
            w(sb, "Top");
        }
        int i10 = f5046h;
        if ((i4 & i10) == i10) {
            w(sb, "End");
        }
        int i11 = f5050l;
        if ((i4 & i11) == i11) {
            w(sb, "Right");
        }
        int i12 = f5048j;
        if ((i4 & i12) == i12) {
            w(sb, "Bottom");
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    private static final void w(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public boolean equals(Object obj) {
        return o(this.value, obj);
    }

    public int hashCode() {
        return Integer.hashCode(this.value);
    }

    @fg.l
    public String toString() {
        return t(this.value);
    }

    /* renamed from: u, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }
}
