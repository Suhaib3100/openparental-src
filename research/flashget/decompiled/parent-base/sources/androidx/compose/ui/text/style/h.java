package androidx.compose.ui.text.style;

import androidx.compose.runtime.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.w;

/* compiled from: LineHeightStyle.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0003\u0012\u0014\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/style/h;", "", "Landroidx/compose/ui/text/style/h$a;", "alignment", "Landroidx/compose/ui/text/style/h$c;", "trim", "<init>", "(FILkotlin/jvm/internal/w;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "F", "b", "()F", "I", "c", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: d, reason: collision with root package name */
    public static final int f21335d = 0;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final h f21336e;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float alignment;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int trim;

    /* compiled from: LineHeightStyle.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/style/h$a;", "", "", "topRatio", "f", "(F)F", "", "j", "(F)Ljava/lang/String;", "", "i", "(F)I", "other", "", "g", "(FLjava/lang/Object;)Z", "a", "F", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kd.g
    public static final class a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public static final Companion INSTANCE = new Companion();

        /* renamed from: c, reason: collision with root package name */
        private static final float f21340c = f(0.0f);

        /* renamed from: d, reason: collision with root package name */
        private static final float f21341d = f(0.5f);

        /* renamed from: e, reason: collision with root package name */
        private static final float f21342e = f(-1.0f);

        /* renamed from: f, reason: collision with root package name */
        private static final float f21343f = f(1.0f);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float topRatio;

        /* compiled from: LineHeightStyle.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/style/h$a$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/h$a;", "Top", "F", "d", "()F", "Center", "b", "Proportional", "c", "Bottom", "a", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.text.style.h$a$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final float a() {
                return a.f21343f;
            }

            public final float b() {
                return a.f21341d;
            }

            public final float c() {
                return a.f21342e;
            }

            public final float d() {
                return a.f21340c;
            }

            public Companion(w wVar) {
            }
        }

        private /* synthetic */ a(float f4) {
            this.topRatio = f4;
        }

        public static final /* synthetic */ a e(float f4) {
            return new a(f4);
        }

        public static float f(float f4) {
            if ((0.0f > f4 || f4 > 1.0f) && f4 != -1.0f) {
                throw new IllegalStateException("topRatio should be in [0..1] range or -1");
            }
            return f4;
        }

        public static boolean g(float f4, Object obj) {
            return (obj instanceof a) && Float.compare(f4, ((a) obj).topRatio) == 0;
        }

        public static final boolean h(float f4, float f5) {
            return Float.compare(f4, f5) == 0;
        }

        public static int i(float f4) {
            return Float.hashCode(f4);
        }

        @fg.l
        public static String j(float f4) {
            if (f4 == f21340c) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f4 == f21341d) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f4 == f21342e) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f4 == f21343f) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f4 + ')';
        }

        public boolean equals(Object obj) {
            return g(this.topRatio, obj);
        }

        public int hashCode() {
            return Float.hashCode(this.topRatio);
        }

        /* renamed from: k, reason: from getter */
        public final /* synthetic */ float getTopRatio() {
            return this.topRatio;
        }

        @fg.l
        public String toString() {
            return j(this.topRatio);
        }
    }

    /* compiled from: LineHeightStyle.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/style/h$b;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/h;", "Default", "Landroidx/compose/ui/text/style/h;", "a", "()Landroidx/compose/ui/text/style/h;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.style.h$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final h a() {
            return h.f21336e;
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: LineHeightStyle.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0005J\u001a\u0010\u000f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/style/h$c;", "", "", "value", "f", "(I)I", "", "l", "(I)Ljava/lang/String;", "", "j", "(I)Z", "k", "i", "other", "g", "(ILjava/lang/Object;)Z", "a", "I", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kd.g
    public static final class c {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public static final Companion INSTANCE = new Companion();

        /* renamed from: c, reason: collision with root package name */
        private static final int f21346c = 1;

        /* renamed from: d, reason: collision with root package name */
        private static final int f21347d = 16;

        /* renamed from: e, reason: collision with root package name */
        private static final int f21348e = 1;

        /* renamed from: f, reason: collision with root package name */
        private static final int f21349f = 16;

        /* renamed from: g, reason: collision with root package name */
        private static final int f21350g = 17;

        /* renamed from: h, reason: collision with root package name */
        private static final int f21351h = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int value;

        /* compiled from: LineHeightStyle.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/h$c$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/h$c;", "FirstLineTop", "I", "b", "()I", "LastLineBottom", "c", "Both", "a", "None", "d", "", "FlagTrimBottom", "FlagTrimTop", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.text.style.h$c$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final int a() {
                return c.f21350g;
            }

            public final int b() {
                return c.f21348e;
            }

            public final int c() {
                return c.f21349f;
            }

            public final int d() {
                return c.f21351h;
            }

            public Companion(w wVar) {
            }
        }

        private /* synthetic */ c(int i4) {
            this.value = i4;
        }

        public static final /* synthetic */ c e(int i4) {
            return new c(i4);
        }

        private static int f(int i4) {
            return i4;
        }

        public static boolean g(int i4, Object obj) {
            return (obj instanceof c) && i4 == ((c) obj).value;
        }

        public static final boolean h(int i4, int i5) {
            return i4 == i5;
        }

        public static int i(int i4) {
            return Integer.hashCode(i4);
        }

        public static final boolean j(int i4) {
            return (i4 & 1) > 0;
        }

        public static final boolean k(int i4) {
            return (i4 & 16) > 0;
        }

        @fg.l
        public static String l(int i4) {
            return i4 == f21348e ? "LineHeightStyle.Trim.FirstLineTop" : i4 == f21349f ? "LineHeightStyle.Trim.LastLineBottom" : i4 == f21350g ? "LineHeightStyle.Trim.Both" : i4 == f21351h ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return g(this.value, obj);
        }

        public int hashCode() {
            return Integer.hashCode(this.value);
        }

        /* renamed from: m, reason: from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }

        @fg.l
        public String toString() {
            return l(this.value);
        }
    }

    static {
        a.INSTANCE.getClass();
        float f4 = a.f21342e;
        c.INSTANCE.getClass();
        f21336e = new h(f4, c.f21350g);
    }

    public /* synthetic */ h(float f4, int i4, w wVar) {
        this(f4, i4);
    }

    /* renamed from: b, reason: from getter */
    public final float getAlignment() {
        return this.alignment;
    }

    /* renamed from: c, reason: from getter */
    public final int getTrim() {
        return this.trim;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof h)) {
            return false;
        }
        h hVar = (h) other;
        return a.h(this.alignment, hVar.alignment) && c.h(this.trim, hVar.trim);
    }

    public int hashCode() {
        return c.i(this.trim) + (a.i(this.alignment) * 31);
    }

    @fg.l
    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) a.j(this.alignment)) + ", trim=" + ((Object) c.l(this.trim)) + ')';
    }

    private h(float f4, int i4) {
        this.alignment = f4;
        this.trim = i4;
    }
}
