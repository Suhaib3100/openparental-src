package androidx.compose.ui;

import androidx.compose.runtime.x4;
import androidx.compose.ui.f;
import kotlin.Metadata;

/* compiled from: Alignment.kt */
@x4
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bç\u0080\u0001\u0018\u0000 \b2\u00020\u0001:\u0003\b\n\u000bJ*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/c;", "", "Landroidx/compose/ui/unit/u;", "size", "space", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/unit/q;", "a", "(JJLandroidx/compose/ui/unit/w;)J", "b", "c", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f17373a;

    /* compiled from: Alignment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\f\u0010\bR \u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0006\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0010\u0010\bR \u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR \u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0006\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u0018\u0010\bR \u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u0006\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u001c\u0010\bR \u0010 \u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b\u001b\u0010\bR \u0010!\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\"\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0013\u0010\bR \u0010(\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010$\u0012\u0004\b'\u0010\u0003\u001a\u0004\b%\u0010&R \u0010+\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010$\u0012\u0004\b*\u0010\u0003\u001a\u0004\b)\u0010&R \u0010.\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010$\u0012\u0004\b\u0005\u0010\u0003\u001a\u0004\b-\u0010&R \u00105\u001a\u00020/8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u0010\u0003\u001a\u0004\b2\u00103R \u00106\u001a\u00020/8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u00101\u0012\u0004\b0\u0010\u0003\u001a\u0004\b,\u00103R \u00109\u001a\u00020/8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u00101\u0012\u0004\b8\u0010\u0003\u001a\u0004\b7\u00103¨\u0006:"}, d2 = {"Landroidx/compose/ui/c$a;", "", "<init>", "()V", "Landroidx/compose/ui/c;", "b", "Landroidx/compose/ui/c;", "C", "()Landroidx/compose/ui/c;", "D", "TopStart", "c", "y", "z", "TopCenter", "d", "A", "B", "TopEnd", "e", "o", "p", "CenterStart", "f", "i", "j", "Center", "g", "k", "l", "CenterEnd", "h", "BottomStart", "BottomCenter", "BottomEnd", "Landroidx/compose/ui/c$c;", "Landroidx/compose/ui/c$c;", "w", "()Landroidx/compose/ui/c$c;", "x", "Top", "q", "r", "CenterVertically", "m", "a", "Bottom", "Landroidx/compose/ui/c$b;", "n", "Landroidx/compose/ui/c$b;", "u", "()Landroidx/compose/ui/c$b;", "v", "Start", "CenterHorizontally", "s", "t", "End", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.c$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f17373a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final c TopStart = new f(-1.0f, -1.0f);

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final c TopCenter = new f(0.0f, -1.0f);

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final c TopEnd = new f(1.0f, -1.0f);

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final c CenterStart = new f(-1.0f, 0.0f);

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final c Center = new f(0.0f, 0.0f);

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final c CenterEnd = new f(1.0f, 0.0f);

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final c BottomStart = new f(-1.0f, 1.0f);

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final c BottomCenter = new f(0.0f, 1.0f);

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final c BottomEnd = new f(1.0f, 1.0f);

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final InterfaceC0326c Top = new f.b(-1.0f);

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final InterfaceC0326c CenterVertically = new f.b(0.0f);

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final InterfaceC0326c Bottom = new f.b(1.0f);

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final b Start = new f.a(-1.0f);

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final b CenterHorizontally = new f.a(0.0f);

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final b End = new f.a(1.0f);

        private Companion() {
        }

        @x4
        public static /* synthetic */ void B() {
        }

        @x4
        public static /* synthetic */ void D() {
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

        @x4
        public static /* synthetic */ void t() {
        }

        @x4
        public static /* synthetic */ void v() {
        }

        @x4
        public static /* synthetic */ void x() {
        }

        @x4
        public static /* synthetic */ void z() {
        }

        @fg.l
        public final c A() {
            return TopEnd;
        }

        @fg.l
        public final c C() {
            return TopStart;
        }

        @fg.l
        public final InterfaceC0326c a() {
            return Bottom;
        }

        @fg.l
        public final c c() {
            return BottomCenter;
        }

        @fg.l
        public final c e() {
            return BottomEnd;
        }

        @fg.l
        public final c g() {
            return BottomStart;
        }

        @fg.l
        public final c i() {
            return Center;
        }

        @fg.l
        public final c k() {
            return CenterEnd;
        }

        @fg.l
        public final b m() {
            return CenterHorizontally;
        }

        @fg.l
        public final c o() {
            return CenterStart;
        }

        @fg.l
        public final InterfaceC0326c q() {
            return CenterVertically;
        }

        @fg.l
        public final b s() {
            return End;
        }

        @fg.l
        public final b u() {
            return Start;
        }

        @fg.l
        public final InterfaceC0326c w() {
            return Top;
        }

        @fg.l
        public final c y() {
            return TopCenter;
        }
    }

    /* compiled from: Alignment.kt */
    @x4
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bç\u0080\u0001\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/c$b;", "", "", "size", "space", "Landroidx/compose/ui/unit/w;", "layoutDirection", "a", "(IILandroidx/compose/ui/unit/w;)I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b {
        int a(int size, int space, @fg.l androidx.compose.ui.unit.w layoutDirection);
    }

    /* compiled from: Alignment.kt */
    @x4
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/c$c;", "", "", "size", "space", "a", "(II)I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.c$c, reason: collision with other inner class name */
    public interface InterfaceC0326c {
        int a(int size, int space);
    }

    long a(long size, long space, @fg.l androidx.compose.ui.unit.w layoutDirection);
}
