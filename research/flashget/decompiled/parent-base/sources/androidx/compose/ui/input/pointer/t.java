package androidx.compose.ui.input.pointer;

import kotlin.Metadata;

/* compiled from: PointerEvent.kt */
@kd.g
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/input/pointer/t;", "", "", "value", "i", "(I)I", "", "m", "(I)Ljava/lang/String;", "l", "other", "", "j", "(ILjava/lang/Object;)Z", "a", "I", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    private static final int f18824c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final int f18825d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f18826e = 2;

    /* renamed from: f, reason: collision with root package name */
    private static final int f18827f = 3;

    /* renamed from: g, reason: collision with root package name */
    private static final int f18828g = 4;

    /* renamed from: h, reason: collision with root package name */
    private static final int f18829h = 5;

    /* renamed from: i, reason: collision with root package name */
    private static final int f18830i = 6;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* compiled from: PointerEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001d\u0010\u0013\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/input/pointer/t$a;", "", "<init>", "()V", "Landroidx/compose/ui/input/pointer/t;", "Unknown", "I", "g", "()I", "Press", "d", "Release", "e", "Move", "c", "Enter", "a", "Exit", "b", "Scroll", "f", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.input.pointer.t$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final int a() {
            return t.f18828g;
        }

        public final int b() {
            return t.f18829h;
        }

        public final int c() {
            return t.f18827f;
        }

        public final int d() {
            return t.f18825d;
        }

        public final int e() {
            return t.f18826e;
        }

        public final int f() {
            return t.f18830i;
        }

        public final int g() {
            return t.f18824c;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    private /* synthetic */ t(int i4) {
        this.value = i4;
    }

    public static final /* synthetic */ t h(int i4) {
        return new t(i4);
    }

    private static int i(int i4) {
        return i4;
    }

    public static boolean j(int i4, Object obj) {
        return (obj instanceof t) && i4 == ((t) obj).value;
    }

    public static final boolean k(int i4, int i5) {
        return i4 == i5;
    }

    public static int l(int i4) {
        return Integer.hashCode(i4);
    }

    @fg.l
    public static String m(int i4) {
        return k(i4, f18825d) ? "Press" : k(i4, f18826e) ? "Release" : k(i4, f18827f) ? "Move" : k(i4, f18828g) ? "Enter" : k(i4, f18829h) ? "Exit" : k(i4, f18830i) ? "Scroll" : "Unknown";
    }

    public boolean equals(Object obj) {
        return j(this.value, obj);
    }

    public int hashCode() {
        return Integer.hashCode(this.value);
    }

    /* renamed from: n, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    @fg.l
    public String toString() {
        return m(this.value);
    }
}
