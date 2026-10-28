package androidx.compose.ui.focus;

import kotlin.Metadata;

/* compiled from: FocusDirection.kt */
@kd.g
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/focus/f;", "", "", "value", "j", "(I)I", "", "n", "(I)Ljava/lang/String;", "m", "other", "", "k", "(ILjava/lang/Object;)Z", "a", "I", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    private static final int f17526c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f17527d = 2;

    /* renamed from: e, reason: collision with root package name */
    private static final int f17528e = 3;

    /* renamed from: f, reason: collision with root package name */
    private static final int f17529f = 4;

    /* renamed from: g, reason: collision with root package name */
    private static final int f17530g = 5;

    /* renamed from: h, reason: collision with root package name */
    private static final int f17531h = 6;

    /* renamed from: i, reason: collision with root package name */
    private static final int f17532i = 7;

    /* renamed from: j, reason: collision with root package name */
    private static final int f17533j = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* compiled from: FocusDirection.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00048GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001d\u0010\u0013\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001d\u0010\u0015\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001d\u0010\u0017\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/focus/f$a;", "", "<init>", "()V", "Landroidx/compose/ui/focus/f;", "Enter", "I", "b", "()I", "c", "Exit", "d", "e", "Next", "g", "Previous", "h", "Left", "f", "Right", "i", "Up", "j", "Down", "a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.focus.f$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @androidx.compose.ui.k
        public static /* synthetic */ void c() {
        }

        @androidx.compose.ui.k
        public static /* synthetic */ void e() {
        }

        public final int a() {
            return f.f17531h;
        }

        @androidx.compose.ui.k
        public final int b() {
            return f.f17532i;
        }

        @androidx.compose.ui.k
        public final int d() {
            return f.f17533j;
        }

        public final int f() {
            return f.f17528e;
        }

        public final int g() {
            return f.f17526c;
        }

        public final int h() {
            return f.f17527d;
        }

        public final int i() {
            return f.f17529f;
        }

        public final int j() {
            return f.f17530g;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    private /* synthetic */ f(int i4) {
        this.value = i4;
    }

    public static final /* synthetic */ f i(int i4) {
        return new f(i4);
    }

    public static int j(int i4) {
        return i4;
    }

    public static boolean k(int i4, Object obj) {
        return (obj instanceof f) && i4 == ((f) obj).value;
    }

    public static final boolean l(int i4, int i5) {
        return i4 == i5;
    }

    public static int m(int i4) {
        return Integer.hashCode(i4);
    }

    @fg.l
    public static String n(int i4) {
        return l(i4, f17526c) ? "Next" : l(i4, f17527d) ? "Previous" : l(i4, f17528e) ? "Left" : l(i4, f17529f) ? "Right" : l(i4, f17530g) ? "Up" : l(i4, f17531h) ? "Down" : l(i4, f17532i) ? "Enter" : l(i4, f17533j) ? "Exit" : "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return k(this.value, obj);
    }

    public int hashCode() {
        return Integer.hashCode(this.value);
    }

    /* renamed from: o, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    @fg.l
    public String toString() {
        return n(this.value);
    }
}
