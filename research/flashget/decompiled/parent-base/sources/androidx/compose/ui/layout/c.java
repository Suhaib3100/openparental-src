package androidx.compose.ui.layout;

import kotlin.Metadata;

/* compiled from: BeyondBoundsLayout.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\u000b\tJ=\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0019\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005¢\u0006\u0002\b\u0007H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/c;", "", "T", "Landroidx/compose/ui/layout/c$b;", "direction", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/c$a;", "Lkotlin/u;", "block", "b", "(ILld/l;)Ljava/lang/Object;", "a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface c {

    /* compiled from: BeyondBoundsLayout.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/c$a;", "", "", "a", "()Z", "hasMoreContent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a {
        boolean a();
    }

    /* compiled from: BeyondBoundsLayout.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/layout/c$b;", "", "", "value", "h", "(I)I", "", "l", "(I)Ljava/lang/String;", "k", "other", "", "i", "(ILjava/lang/Object;)Z", "a", "I", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kd.g
    public static final class b {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public static final Companion INSTANCE = new Companion();

        /* renamed from: c, reason: collision with root package name */
        private static final int f18921c = 1;

        /* renamed from: d, reason: collision with root package name */
        private static final int f18922d = 2;

        /* renamed from: e, reason: collision with root package name */
        private static final int f18923e = 3;

        /* renamed from: f, reason: collision with root package name */
        private static final int f18924f = 4;

        /* renamed from: g, reason: collision with root package name */
        private static final int f18925g = 5;

        /* renamed from: h, reason: collision with root package name */
        private static final int f18926h = 6;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int value;

        /* compiled from: BeyondBoundsLayout.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/layout/c$b$a;", "", "<init>", "()V", "Landroidx/compose/ui/layout/c$b;", "Before", "I", "c", "()I", "After", "b", "Left", "e", "Right", "f", "Above", "a", "Below", "d", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.layout.c$b$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final int a() {
                return b.f18925g;
            }

            public final int b() {
                return b.f18922d;
            }

            public final int c() {
                return b.f18921c;
            }

            public final int d() {
                return b.f18926h;
            }

            public final int e() {
                return b.f18923e;
            }

            public final int f() {
                return b.f18924f;
            }

            public Companion(kotlin.jvm.internal.w wVar) {
            }
        }

        private /* synthetic */ b(int i4) {
            this.value = i4;
        }

        public static final /* synthetic */ b g(int i4) {
            return new b(i4);
        }

        public static int h(int i4) {
            return i4;
        }

        public static boolean i(int i4, Object obj) {
            return (obj instanceof b) && i4 == ((b) obj).value;
        }

        public static final boolean j(int i4, int i5) {
            return i4 == i5;
        }

        public static int k(int i4) {
            return Integer.hashCode(i4);
        }

        @fg.l
        public static String l(int i4) {
            return j(i4, f18921c) ? "Before" : j(i4, f18922d) ? "After" : j(i4, f18923e) ? "Left" : j(i4, f18924f) ? "Right" : j(i4, f18925g) ? "Above" : j(i4, f18926h) ? "Below" : "invalid LayoutDirection";
        }

        public boolean equals(Object obj) {
            return i(this.value, obj);
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

    @fg.m
    <T> T b(int direction, @fg.l ld.l<? super a, ? extends T> block);
}
