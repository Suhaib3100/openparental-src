package androidx.compose.ui.text.style;

import androidx.compose.runtime.m1;
import androidx.compose.runtime.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.w;

/* compiled from: LineBreak.android.kt */
@kd.g
@m1
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087@\u0018\u0000 \u001d2\u00020\u0001:\u0004\u0018\u001d\u001e\u001fB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001c\u0010\r\u0088\u0001\u000b\u0092\u0001\u00020\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/ui/text/style/f;", "", "Landroidx/compose/ui/text/style/f$b;", "strategy", "Landroidx/compose/ui/text/style/f$c;", "strictness", "Landroidx/compose/ui/text/style/f$d;", "wordBreak", "g", "(III)I", "", "mask", "f", "(I)I", "h", "(IIII)I", "", "p", "(I)Ljava/lang/String;", "o", "other", "", "j", "(ILjava/lang/Object;)Z", "a", "I", "l", "m", "n", "b", "c", "d", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    private static final int f21311c;

    /* renamed from: d, reason: collision with root package name */
    private static final int f21312d;

    /* renamed from: e, reason: collision with root package name */
    private static final int f21313e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f21314f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int mask;

    /* compiled from: LineBreak.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR&\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR&\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/style/f$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/f;", "Simple", "I", "e", "()I", "f", "Heading", "a", "b", "Paragraph", "c", "d", "Unspecified", "g", "h", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.style.f$a, reason: from kotlin metadata */
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

        public final int a() {
            return f.f21312d;
        }

        public final int c() {
            return f.f21313e;
        }

        public final int e() {
            return f.f21311c;
        }

        public final int g() {
            return f.f21314f;
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: LineBreak.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/style/f$b;", "", "", "value", "f", "(I)I", "", "j", "(I)Ljava/lang/String;", "i", "other", "", "g", "(ILjava/lang/Object;)Z", "a", "I", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kd.g
    public static final class b {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public static final Companion INSTANCE = new Companion();

        /* renamed from: c, reason: collision with root package name */
        private static final int f21317c = 1;

        /* renamed from: d, reason: collision with root package name */
        private static final int f21318d = 2;

        /* renamed from: e, reason: collision with root package name */
        private static final int f21319e = 3;

        /* renamed from: f, reason: collision with root package name */
        private static final int f21320f = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int value;

        /* compiled from: LineBreak.android.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/style/f$b$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/f$b;", "Simple", "I", "c", "()I", "HighQuality", "b", "Balanced", "a", "Unspecified", "d", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.text.style.f$b$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final int a() {
                return b.f21319e;
            }

            public final int b() {
                return b.f21318d;
            }

            public final int c() {
                return b.f21317c;
            }

            public final int d() {
                return b.f21320f;
            }

            public Companion(w wVar) {
            }
        }

        private /* synthetic */ b(int i4) {
            this.value = i4;
        }

        public static final /* synthetic */ b e(int i4) {
            return new b(i4);
        }

        public static int f(int i4) {
            return i4;
        }

        public static boolean g(int i4, Object obj) {
            return (obj instanceof b) && i4 == ((b) obj).value;
        }

        public static final boolean h(int i4, int i5) {
            return i4 == i5;
        }

        public static int i(int i4) {
            return Integer.hashCode(i4);
        }

        @fg.l
        public static String j(int i4) {
            return h(i4, f21317c) ? "Strategy.Simple" : h(i4, f21318d) ? "Strategy.HighQuality" : h(i4, f21319e) ? "Strategy.Balanced" : h(i4, f21320f) ? "Strategy.Unspecified" : "Invalid";
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

    /* compiled from: LineBreak.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/style/f$c;", "", "", "value", "g", "(I)I", "", "k", "(I)Ljava/lang/String;", "j", "other", "", "h", "(ILjava/lang/Object;)Z", "a", "I", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kd.g
    public static final class c {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public static final Companion INSTANCE = new Companion();

        /* renamed from: c, reason: collision with root package name */
        private static final int f21323c = 1;

        /* renamed from: d, reason: collision with root package name */
        private static final int f21324d = 2;

        /* renamed from: e, reason: collision with root package name */
        private static final int f21325e = 3;

        /* renamed from: f, reason: collision with root package name */
        private static final int f21326f = 4;

        /* renamed from: g, reason: collision with root package name */
        private static final int f21327g = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int value;

        /* compiled from: LineBreak.android.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/style/f$c$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/f$c;", "Default", "I", "a", "()I", "Loose", "b", "Normal", "c", "Strict", "d", "Unspecified", "e", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.text.style.f$c$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final int a() {
                return c.f21323c;
            }

            public final int b() {
                return c.f21324d;
            }

            public final int c() {
                return c.f21325e;
            }

            public final int d() {
                return c.f21326f;
            }

            public final int e() {
                return c.f21327g;
            }

            public Companion(w wVar) {
            }
        }

        private /* synthetic */ c(int i4) {
            this.value = i4;
        }

        public static final /* synthetic */ c f(int i4) {
            return new c(i4);
        }

        public static int g(int i4) {
            return i4;
        }

        public static boolean h(int i4, Object obj) {
            return (obj instanceof c) && i4 == ((c) obj).value;
        }

        public static final boolean i(int i4, int i5) {
            return i4 == i5;
        }

        public static int j(int i4) {
            return Integer.hashCode(i4);
        }

        @fg.l
        public static String k(int i4) {
            return i(i4, f21323c) ? "Strictness.None" : i(i4, f21324d) ? "Strictness.Loose" : i(i4, f21325e) ? "Strictness.Normal" : i(i4, f21326f) ? "Strictness.Strict" : i(i4, f21327g) ? "Strictness.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return h(this.value, obj);
        }

        public int hashCode() {
            return Integer.hashCode(this.value);
        }

        /* renamed from: l, reason: from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }

        @fg.l
        public String toString() {
            return k(this.value);
        }
    }

    /* compiled from: LineBreak.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/style/f$d;", "", "", "value", "e", "(I)I", "", "i", "(I)Ljava/lang/String;", "h", "other", "", "f", "(ILjava/lang/Object;)Z", "a", "I", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kd.g
    public static final class d {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public static final Companion INSTANCE = new Companion();

        /* renamed from: c, reason: collision with root package name */
        private static final int f21330c = 1;

        /* renamed from: d, reason: collision with root package name */
        private static final int f21331d = 2;

        /* renamed from: e, reason: collision with root package name */
        private static final int f21332e = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int value;

        /* compiled from: LineBreak.android.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/style/f$d$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/f$d;", "Default", "I", "a", "()I", "Phrase", "b", "Unspecified", "c", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.text.style.f$d$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final int a() {
                return d.f21330c;
            }

            public final int b() {
                return d.f21331d;
            }

            public final int c() {
                return d.f21332e;
            }

            public Companion(w wVar) {
            }
        }

        private /* synthetic */ d(int i4) {
            this.value = i4;
        }

        public static final /* synthetic */ d d(int i4) {
            return new d(i4);
        }

        public static int e(int i4) {
            return i4;
        }

        public static boolean f(int i4, Object obj) {
            return (obj instanceof d) && i4 == ((d) obj).value;
        }

        public static final boolean g(int i4, int i5) {
            return i4 == i5;
        }

        public static int h(int i4) {
            return Integer.hashCode(i4);
        }

        @fg.l
        public static String i(int i4) {
            return g(i4, f21330c) ? "WordBreak.None" : g(i4, f21331d) ? "WordBreak.Phrase" : g(i4, f21332e) ? "WordBreak.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return f(this.value, obj);
        }

        public int hashCode() {
            return Integer.hashCode(this.value);
        }

        /* renamed from: j, reason: from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }

        @fg.l
        public String toString() {
            return i(this.value);
        }
    }

    static {
        int e4;
        int e5;
        int e6;
        b.Companion companion = b.INSTANCE;
        companion.getClass();
        int i4 = b.f21317c;
        c.Companion companion2 = c.INSTANCE;
        companion2.getClass();
        int i5 = c.f21325e;
        d.Companion companion3 = d.INSTANCE;
        companion3.getClass();
        e4 = g.e(i4, i5, d.f21330c);
        f21311c = e4;
        companion.getClass();
        int i6 = b.f21319e;
        companion2.getClass();
        int i7 = c.f21324d;
        companion3.getClass();
        e5 = g.e(i6, i7, d.f21331d);
        f21312d = e5;
        companion.getClass();
        int i10 = b.f21318d;
        companion2.getClass();
        int i11 = c.f21326f;
        companion3.getClass();
        e6 = g.e(i10, i11, d.f21330c);
        f21313e = e6;
        f21314f = 0;
    }

    private /* synthetic */ f(int i4) {
        this.mask = i4;
    }

    public static final /* synthetic */ f e(int i4) {
        return new f(i4);
    }

    private static int f(int i4) {
        return i4;
    }

    public static int g(int i4, int i5, int i6) {
        int e4;
        e4 = g.e(i4, i5, i6);
        return e4;
    }

    public static final int h(int i4, int i5, int i6, int i7) {
        int e4;
        e4 = g.e(i5, i6, i7);
        return e4;
    }

    public static int i(int i4, int i5, int i6, int i7, int i10, Object obj) {
        int e4;
        if ((i10 & 1) != 0) {
            i5 = l(i4);
        }
        if ((i10 & 2) != 0) {
            i6 = m(i4);
        }
        if ((i10 & 4) != 0) {
            i7 = n(i4);
        }
        e4 = g.e(i5, i6, i7);
        return e4;
    }

    public static boolean j(int i4, Object obj) {
        return (obj instanceof f) && i4 == ((f) obj).mask;
    }

    public static final boolean k(int i4, int i5) {
        return i4 == i5;
    }

    public static final int l(int i4) {
        return b.f(i4 & 255);
    }

    public static final int m(int i4) {
        int g4;
        g4 = g.g(i4);
        return c.g(g4);
    }

    public static final int n(int i4) {
        int h4;
        h4 = g.h(i4);
        return d.e(h4);
    }

    public static int o(int i4) {
        return Integer.hashCode(i4);
    }

    @fg.l
    public static String p(int i4) {
        return "LineBreak(strategy=" + ((Object) b.j(l(i4))) + ", strictness=" + ((Object) c.k(m(i4))) + ", wordBreak=" + ((Object) d.i(n(i4))) + ')';
    }

    public boolean equals(Object obj) {
        return j(this.mask, obj);
    }

    public int hashCode() {
        return Integer.hashCode(this.mask);
    }

    /* renamed from: q, reason: from getter */
    public final /* synthetic */ int getMask() {
        return this.mask;
    }

    @fg.l
    public String toString() {
        return p(this.mask);
    }
}
