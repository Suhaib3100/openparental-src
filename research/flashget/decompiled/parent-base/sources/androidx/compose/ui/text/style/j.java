package androidx.compose.ui.text.style;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.w;

/* compiled from: TextAlign.kt */
@kd.g
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/style/j;", "", "", "value", "i", "(I)I", "", "m", "(I)Ljava/lang/String;", "l", "other", "", "j", "(ILjava/lang/Object;)Z", "a", "I", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    private static final int f21354c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f21355d = 2;

    /* renamed from: e, reason: collision with root package name */
    private static final int f21356e = 3;

    /* renamed from: f, reason: collision with root package name */
    private static final int f21357f = 4;

    /* renamed from: g, reason: collision with root package name */
    private static final int f21358g = 5;

    /* renamed from: h, reason: collision with root package name */
    private static final int f21359h = 6;

    /* renamed from: i, reason: collision with root package name */
    private static final int f21360i = Integer.MIN_VALUE;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* compiled from: TextAlign.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\f\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001d\u0010\u000e\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\u001d\u0010\u0010\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR\u001d\u0010\u0012\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0013\u0010\u000bR\u001d\u0010\u0014\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0015\u0010\u000bR\u001d\u0010\u0016\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0017\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/style/j$a;", "", "<init>", "()V", "", "Landroidx/compose/ui/text/style/j;", "h", "()Ljava/util/List;", "Left", "I", "d", "()I", "Right", "e", "Center", "a", "Justify", "c", "Start", "f", "End", "b", "Unspecified", "g", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.style.j$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final int a() {
            return j.f21356e;
        }

        public final int b() {
            return j.f21359h;
        }

        public final int c() {
            return j.f21357f;
        }

        public final int d() {
            return j.f21354c;
        }

        public final int e() {
            return j.f21355d;
        }

        public final int f() {
            return j.f21358g;
        }

        public final int g() {
            return j.f21360i;
        }

        @fg.l
        public final List<j> h() {
            return w.O(j.h(j.f21354c), j.h(j.f21355d), j.h(j.f21356e), j.h(j.f21357f), j.h(j.f21358g), j.h(j.f21359h));
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    private /* synthetic */ j(int i4) {
        this.value = i4;
    }

    public static final /* synthetic */ j h(int i4) {
        return new j(i4);
    }

    public static int i(int i4) {
        return i4;
    }

    public static boolean j(int i4, Object obj) {
        return (obj instanceof j) && i4 == ((j) obj).value;
    }

    public static final boolean k(int i4, int i5) {
        return i4 == i5;
    }

    public static int l(int i4) {
        return Integer.hashCode(i4);
    }

    @fg.l
    public static String m(int i4) {
        return k(i4, f21354c) ? "Left" : k(i4, f21355d) ? "Right" : k(i4, f21356e) ? "Center" : k(i4, f21357f) ? "Justify" : k(i4, f21358g) ? "Start" : k(i4, f21359h) ? "End" : k(i4, f21360i) ? "Unspecified" : "Invalid";
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
