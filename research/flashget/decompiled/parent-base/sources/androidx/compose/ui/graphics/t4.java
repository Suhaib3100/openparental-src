package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* compiled from: ImageBitmap.kt */
@kd.g
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/t4;", "", "", "value", "g", "(I)I", "", "l", "(I)Ljava/lang/String;", "k", "other", "", "h", "(ILjava/lang/Object;)Z", "a", "I", "j", "()I", "b", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t4 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    private static final int f18042c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final int f18043d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f18044e = 2;

    /* renamed from: f, reason: collision with root package name */
    private static final int f18045f = 3;

    /* renamed from: g, reason: collision with root package name */
    private static final int f18046g = 4;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* compiled from: ImageBitmap.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/graphics/t4$a;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/t4;", "Argb8888", "I", "b", "()I", "Alpha8", "a", "Rgb565", "e", "F16", "c", "Gpu", "d", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.t4$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final int a() {
            return t4.f18043d;
        }

        public final int b() {
            return t4.f18042c;
        }

        public final int c() {
            return t4.f18045f;
        }

        public final int d() {
            return t4.f18046g;
        }

        public final int e() {
            return t4.f18044e;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    private /* synthetic */ t4(int i4) {
        this.value = i4;
    }

    public static final /* synthetic */ t4 f(int i4) {
        return new t4(i4);
    }

    public static int g(int i4) {
        return i4;
    }

    public static boolean h(int i4, Object obj) {
        return (obj instanceof t4) && i4 == ((t4) obj).value;
    }

    public static final boolean i(int i4, int i5) {
        return i4 == i5;
    }

    public static int k(int i4) {
        return Integer.hashCode(i4);
    }

    @fg.l
    public static String l(int i4) {
        return i(i4, f18042c) ? "Argb8888" : i(i4, f18043d) ? "Alpha8" : i(i4, f18044e) ? "Rgb565" : i(i4, f18045f) ? "F16" : i(i4, f18046g) ? "Gpu" : "Unknown";
    }

    public boolean equals(Object obj) {
        return h(this.value, obj);
    }

    public int hashCode() {
        return Integer.hashCode(this.value);
    }

    /* renamed from: j, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public final /* synthetic */ int m() {
        return this.value;
    }

    @fg.l
    public String toString() {
        return l(this.value);
    }
}
