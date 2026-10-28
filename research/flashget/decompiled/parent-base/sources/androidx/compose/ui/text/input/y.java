package androidx.compose.ui.text.input;

import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: ImeAction.kt */
@kd.g
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/input/y;", "", "", "value", "j", "(I)I", "", "n", "(I)Ljava/lang/String;", "m", "other", "", "k", "(ILjava/lang/Object;)Z", "a", "I", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class y {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    private static final int f21131c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f21132d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static final int f21133e = 2;

    /* renamed from: f, reason: collision with root package name */
    private static final int f21134f = 3;

    /* renamed from: g, reason: collision with root package name */
    private static final int f21135g = 4;

    /* renamed from: h, reason: collision with root package name */
    private static final int f21136h = 5;

    /* renamed from: i, reason: collision with root package name */
    private static final int f21137i = 6;

    /* renamed from: j, reason: collision with root package name */
    private static final int f21138j = 7;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* compiled from: ImeAction.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR&\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR&\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR&\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR&\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR&\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR&\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/text/input/y$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/input/y;", "Default", "I", "a", "()I", "b", "None", "i", "j", "Go", "e", "f", "Search", "m", "n", "Send", "o", "p", "Previous", "k", "l", "Next", "g", "h", "Done", "c", "d", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.input.y$a, reason: from kotlin metadata */
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

        public final int a() {
            return y.f21131c;
        }

        public final int c() {
            return y.f21138j;
        }

        public final int e() {
            return y.f21133e;
        }

        public final int g() {
            return y.f21137i;
        }

        public final int i() {
            return y.f21132d;
        }

        public final int k() {
            return y.f21136h;
        }

        public final int m() {
            return y.f21134f;
        }

        public final int o() {
            return y.f21135g;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    private /* synthetic */ y(int i4) {
        this.value = i4;
    }

    public static final /* synthetic */ y i(int i4) {
        return new y(i4);
    }

    public static int j(int i4) {
        return i4;
    }

    public static boolean k(int i4, Object obj) {
        return (obj instanceof y) && i4 == ((y) obj).value;
    }

    public static final boolean l(int i4, int i5) {
        return i4 == i5;
    }

    public static int m(int i4) {
        return Integer.hashCode(i4);
    }

    @fg.l
    public static String n(int i4) {
        return l(i4, f21132d) ? "None" : l(i4, f21131c) ? "Default" : l(i4, f21133e) ? "Go" : l(i4, f21134f) ? "Search" : l(i4, f21135g) ? "Send" : l(i4, f21136h) ? "Previous" : l(i4, f21137i) ? "Next" : l(i4, f21138j) ? "Done" : "Invalid";
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
