package androidx.compose.ui.graphics.colorspace;

import androidx.compose.runtime.m1;
import kotlin.Metadata;

/* compiled from: RenderIntent.kt */
@kd.g
@m1
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/m;", "", "", "value", "f", "(I)I", "", "j", "(I)Ljava/lang/String;", "i", "other", "", "g", "(ILjava/lang/Object;)Z", "a", "I", "b", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    private static final int f17748c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final int f17749d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f17750e = 2;

    /* renamed from: f, reason: collision with root package name */
    private static final int f17751f = 3;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* compiled from: RenderIntent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/m$a;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/colorspace/m;", "Perceptual", "I", "b", "()I", "Relative", "c", "Saturation", "d", "Absolute", "a", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.colorspace.m$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final int a() {
            return m.f17751f;
        }

        public final int b() {
            return m.f17748c;
        }

        public final int c() {
            return m.f17749d;
        }

        public final int d() {
            return m.f17750e;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    private /* synthetic */ m(int i4) {
        this.value = i4;
    }

    public static final /* synthetic */ m e(int i4) {
        return new m(i4);
    }

    public static int f(int i4) {
        return i4;
    }

    public static boolean g(int i4, Object obj) {
        return (obj instanceof m) && i4 == ((m) obj).value;
    }

    public static final boolean h(int i4, int i5) {
        return i4 == i5;
    }

    public static int i(int i4) {
        return Integer.hashCode(i4);
    }

    @fg.l
    public static String j(int i4) {
        return h(i4, f17748c) ? "Perceptual" : h(i4, f17749d) ? "Relative" : h(i4, f17750e) ? "Saturation" : h(i4, f17751f) ? "Absolute" : "Unknown";
    }

    public boolean equals(Object obj) {
        return g(this.value, obj);
    }

    public int hashCode() {
        return Integer.hashCode(this.value);
    }

    /* renamed from: k, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    @fg.l
    public String toString() {
        return j(this.value);
    }
}
