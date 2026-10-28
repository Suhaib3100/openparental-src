package androidx.compose.ui.text.input;

import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: KeyboardType.kt */
@kd.g
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/input/g0;", "", "", "value", "k", "(I)I", "", "o", "(I)Ljava/lang/String;", "n", "other", "", "l", "(ILjava/lang/Object;)Z", "a", "I", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    private static final int f21025c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f21026d = 2;

    /* renamed from: e, reason: collision with root package name */
    private static final int f21027e = 3;

    /* renamed from: f, reason: collision with root package name */
    private static final int f21028f = 4;

    /* renamed from: g, reason: collision with root package name */
    private static final int f21029g = 5;

    /* renamed from: h, reason: collision with root package name */
    private static final int f21030h = 6;

    /* renamed from: i, reason: collision with root package name */
    private static final int f21031i = 7;

    /* renamed from: j, reason: collision with root package name */
    private static final int f21032j = 8;

    /* renamed from: k, reason: collision with root package name */
    private static final int f21033k = 9;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* compiled from: KeyboardType.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR&\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR&\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR&\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR&\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR&\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR&\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\bR&\u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/ui/text/input/g0$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/input/g0;", "Text", "I", "o", "()I", "p", "Ascii", "a", "b", "Number", "g", "h", "Phone", "m", "n", "Uri", "q", "r", "Email", "e", "f", "Password", "k", "l", "NumberPassword", "i", "j", "Decimal", "c", "d", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.input.g0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @x4
        public static /* synthetic */ void b() {
        }

        @x4
        public static /* synthetic */ void d() {
        }

        @x4
        public static /* synthetic */ void f() {
        }

        @x4
        public static /* synthetic */ void h() {
        }

        @x4
        public static /* synthetic */ void j() {
        }

        @x4
        public static /* synthetic */ void l() {
        }

        @x4
        public static /* synthetic */ void n() {
        }

        @x4
        public static /* synthetic */ void p() {
        }

        @x4
        public static /* synthetic */ void r() {
        }

        public final int a() {
            return g0.f21026d;
        }

        public final int c() {
            return g0.f21033k;
        }

        public final int e() {
            return g0.f21030h;
        }

        public final int g() {
            return g0.f21027e;
        }

        public final int i() {
            return g0.f21032j;
        }

        public final int k() {
            return g0.f21031i;
        }

        public final int m() {
            return g0.f21028f;
        }

        public final int o() {
            return g0.f21025c;
        }

        public final int q() {
            return g0.f21029g;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    private /* synthetic */ g0(int i4) {
        this.value = i4;
    }

    public static final /* synthetic */ g0 j(int i4) {
        return new g0(i4);
    }

    public static int k(int i4) {
        return i4;
    }

    public static boolean l(int i4, Object obj) {
        return (obj instanceof g0) && i4 == ((g0) obj).value;
    }

    public static final boolean m(int i4, int i5) {
        return i4 == i5;
    }

    public static int n(int i4) {
        return Integer.hashCode(i4);
    }

    @fg.l
    public static String o(int i4) {
        return m(i4, f21025c) ? "Text" : m(i4, f21026d) ? "Ascii" : m(i4, f21027e) ? "Number" : m(i4, f21028f) ? "Phone" : m(i4, f21029g) ? "Uri" : m(i4, f21030h) ? "Email" : m(i4, f21031i) ? "Password" : m(i4, f21032j) ? "NumberPassword" : m(i4, f21033k) ? "Decimal" : "Invalid";
    }

    public boolean equals(Object obj) {
        return l(this.value, obj);
    }

    public int hashCode() {
        return Integer.hashCode(this.value);
    }

    /* renamed from: p, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    @fg.l
    public String toString() {
        return o(this.value);
    }
}
