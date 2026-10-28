package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.c1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: WindowInsetsCompat.java */
/* loaded from: classes3.dex */
public class j3 {

    /* renamed from: b, reason: collision with root package name */
    private static final String f27271b = "WindowInsetsCompat";

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.o0
    public static final j3 f27272c;

    /* renamed from: a, reason: collision with root package name */
    private final l f27273a;

    /* compiled from: WindowInsetsCompat.java */
    @SuppressLint({"SoonBlockedPrivateApi"})
    @androidx.annotation.x0(21)
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static Field f27274a;

        /* renamed from: b, reason: collision with root package name */
        private static Field f27275b;

        /* renamed from: c, reason: collision with root package name */
        private static Field f27276c;

        /* renamed from: d, reason: collision with root package name */
        private static boolean f27277d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f27274a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f27275b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f27276c = declaredField3;
                declaredField3.setAccessible(true);
                f27277d = true;
            } catch (ReflectiveOperationException e4) {
                e4.getMessage();
            }
        }

        private a() {
        }

        @androidx.annotation.q0
        public static j3 a(@androidx.annotation.o0 View view) {
            if (f27277d && view.isAttachedToWindow()) {
                try {
                    Object obj = f27274a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f27275b.get(obj);
                        Rect rect2 = (Rect) f27276c.get(obj);
                        if (rect != null && rect2 != null) {
                            j3 a5 = new b().f(androidx.core.graphics.e0.e(rect)).h(androidx.core.graphics.e0.e(rect2)).a();
                            a5.H(a5);
                            a5.d(view.getRootView());
                            return a5;
                        }
                    }
                } catch (IllegalAccessException e4) {
                    e4.getMessage();
                }
            }
            return null;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    @androidx.annotation.x0(30)
    private static class e extends d {
        e() {
        }

        @Override // androidx.core.view.j3.f
        void d(int i4, @androidx.annotation.o0 androidx.core.graphics.e0 e0Var) {
            this.f27285c.setInsets(n.a(i4), e0Var.h());
        }

        @Override // androidx.core.view.j3.f
        void e(int i4, @androidx.annotation.o0 androidx.core.graphics.e0 e0Var) {
            this.f27285c.setInsetsIgnoringVisibility(n.a(i4), e0Var.h());
        }

        @Override // androidx.core.view.j3.f
        void k(int i4, boolean z4) {
            this.f27285c.setVisible(n.a(i4), z4);
        }

        e(@androidx.annotation.o0 j3 j3Var) {
            super(j3Var);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    private static class f {

        /* renamed from: a, reason: collision with root package name */
        private final j3 f27286a;

        /* renamed from: b, reason: collision with root package name */
        androidx.core.graphics.e0[] f27287b;

        f() {
            this(new j3((j3) null));
        }

        protected final void a() {
            androidx.core.graphics.e0[] e0VarArr = this.f27287b;
            if (e0VarArr != null) {
                androidx.core.graphics.e0 e0Var = e0VarArr[m.e(1)];
                androidx.core.graphics.e0 e0Var2 = this.f27287b[m.e(2)];
                if (e0Var2 == null) {
                    e0Var2 = this.f27286a.f(2);
                }
                if (e0Var == null) {
                    e0Var = this.f27286a.f(1);
                }
                i(androidx.core.graphics.e0.b(e0Var, e0Var2));
                androidx.core.graphics.e0 e0Var3 = this.f27287b[m.e(16)];
                if (e0Var3 != null) {
                    h(e0Var3);
                }
                androidx.core.graphics.e0 e0Var4 = this.f27287b[m.e(32)];
                if (e0Var4 != null) {
                    f(e0Var4);
                }
                androidx.core.graphics.e0 e0Var5 = this.f27287b[m.e(64)];
                if (e0Var5 != null) {
                    j(e0Var5);
                }
            }
        }

        @androidx.annotation.o0
        j3 b() {
            a();
            return this.f27286a;
        }

        void c(@androidx.annotation.q0 z zVar) {
        }

        void d(int i4, @androidx.annotation.o0 androidx.core.graphics.e0 e0Var) {
            if (this.f27287b == null) {
                this.f27287b = new androidx.core.graphics.e0[9];
            }
            for (int i5 = 1; i5 <= 256; i5 <<= 1) {
                if ((i4 & i5) != 0) {
                    this.f27287b[m.e(i5)] = e0Var;
                }
            }
        }

        void e(int i4, @androidx.annotation.o0 androidx.core.graphics.e0 e0Var) {
            if (i4 == 8) {
                throw new IllegalArgumentException("Ignoring visibility inset not available for IME");
            }
        }

        void f(@androidx.annotation.o0 androidx.core.graphics.e0 e0Var) {
        }

        void g(@androidx.annotation.o0 androidx.core.graphics.e0 e0Var) {
        }

        void h(@androidx.annotation.o0 androidx.core.graphics.e0 e0Var) {
        }

        void i(@androidx.annotation.o0 androidx.core.graphics.e0 e0Var) {
        }

        void j(@androidx.annotation.o0 androidx.core.graphics.e0 e0Var) {
        }

        void k(int i4, boolean z4) {
        }

        f(@androidx.annotation.o0 j3 j3Var) {
            this.f27286a = j3Var;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    @androidx.annotation.x0(28)
    private static class i extends h {
        i(@androidx.annotation.o0 j3 j3Var, @androidx.annotation.o0 WindowInsets windowInsets) {
            super(j3Var, windowInsets);
        }

        @Override // androidx.core.view.j3.l
        @androidx.annotation.o0
        j3 a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.f27293c.consumeDisplayCutout();
            return j3.K(consumeDisplayCutout);
        }

        @Override // androidx.core.view.j3.g, androidx.core.view.j3.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f27293c, iVar.f27293c) && Objects.equals(this.f27297g, iVar.f27297g);
        }

        @Override // androidx.core.view.j3.l
        @androidx.annotation.q0
        z f() {
            DisplayCutout displayCutout;
            displayCutout = this.f27293c.getDisplayCutout();
            return z.j(displayCutout);
        }

        @Override // androidx.core.view.j3.l
        public int hashCode() {
            return this.f27293c.hashCode();
        }

        i(@androidx.annotation.o0 j3 j3Var, @androidx.annotation.o0 i iVar) {
            super(j3Var, iVar);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    @androidx.annotation.x0(30)
    private static class k extends j {

        /* renamed from: q, reason: collision with root package name */
        @androidx.annotation.o0
        static final j3 f27302q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            f27302q = j3.K(windowInsets);
        }

        k(@androidx.annotation.o0 j3 j3Var, @androidx.annotation.o0 WindowInsets windowInsets) {
            super(j3Var, windowInsets);
        }

        @Override // androidx.core.view.j3.g, androidx.core.view.j3.l
        final void d(@androidx.annotation.o0 View view) {
        }

        @Override // androidx.core.view.j3.g, androidx.core.view.j3.l
        @androidx.annotation.o0
        public androidx.core.graphics.e0 g(int i4) {
            Insets insets;
            insets = this.f27293c.getInsets(n.a(i4));
            return androidx.core.graphics.e0.g(insets);
        }

        @Override // androidx.core.view.j3.g, androidx.core.view.j3.l
        @androidx.annotation.o0
        public androidx.core.graphics.e0 h(int i4) {
            Insets insetsIgnoringVisibility;
            insetsIgnoringVisibility = this.f27293c.getInsetsIgnoringVisibility(n.a(i4));
            return androidx.core.graphics.e0.g(insetsIgnoringVisibility);
        }

        @Override // androidx.core.view.j3.g, androidx.core.view.j3.l
        public boolean q(int i4) {
            boolean isVisible;
            isVisible = this.f27293c.isVisible(n.a(i4));
            return isVisible;
        }

        k(@androidx.annotation.o0 j3 j3Var, @androidx.annotation.o0 k kVar) {
            super(j3Var, kVar);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    private static class l {

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.o0
        static final j3 f27303b = new b().a().a().b().c();

        /* renamed from: a, reason: collision with root package name */
        final j3 f27304a;

        l(@androidx.annotation.o0 j3 j3Var) {
            this.f27304a = j3Var;
        }

        @androidx.annotation.o0
        j3 a() {
            return this.f27304a;
        }

        @androidx.annotation.o0
        j3 b() {
            return this.f27304a;
        }

        @androidx.annotation.o0
        j3 c() {
            return this.f27304a;
        }

        void d(@androidx.annotation.o0 View view) {
        }

        void e(@androidx.annotation.o0 j3 j3Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return p() == lVar.p() && o() == lVar.o() && Objects.equals(l(), lVar.l()) && Objects.equals(j(), lVar.j()) && Objects.equals(f(), lVar.f());
        }

        @androidx.annotation.q0
        z f() {
            return null;
        }

        @androidx.annotation.o0
        androidx.core.graphics.e0 g(int i4) {
            return androidx.core.graphics.e0.f26244e;
        }

        @androidx.annotation.o0
        androidx.core.graphics.e0 h(int i4) {
            if ((i4 & 8) == 0) {
                return androidx.core.graphics.e0.f26244e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        @androidx.annotation.o0
        androidx.core.graphics.e0 i() {
            return l();
        }

        @androidx.annotation.o0
        androidx.core.graphics.e0 j() {
            return androidx.core.graphics.e0.f26244e;
        }

        @androidx.annotation.o0
        androidx.core.graphics.e0 k() {
            return l();
        }

        @androidx.annotation.o0
        androidx.core.graphics.e0 l() {
            return androidx.core.graphics.e0.f26244e;
        }

        @androidx.annotation.o0
        androidx.core.graphics.e0 m() {
            return l();
        }

        @androidx.annotation.o0
        j3 n(int i4, int i5, int i6, int i7) {
            return f27303b;
        }

        boolean o() {
            return false;
        }

        boolean p() {
            return false;
        }

        boolean q(int i4) {
            return true;
        }

        public void r(androidx.core.graphics.e0[] e0VarArr) {
        }

        void s(@androidx.annotation.o0 androidx.core.graphics.e0 e0Var) {
        }

        void t(@androidx.annotation.q0 j3 j3Var) {
        }

        public void u(androidx.core.graphics.e0 e0Var) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static final class m {

        /* renamed from: a, reason: collision with root package name */
        static final int f27305a = 1;

        /* renamed from: b, reason: collision with root package name */
        static final int f27306b = 1;

        /* renamed from: c, reason: collision with root package name */
        static final int f27307c = 2;

        /* renamed from: d, reason: collision with root package name */
        static final int f27308d = 4;

        /* renamed from: e, reason: collision with root package name */
        static final int f27309e = 8;

        /* renamed from: f, reason: collision with root package name */
        static final int f27310f = 16;

        /* renamed from: g, reason: collision with root package name */
        static final int f27311g = 32;

        /* renamed from: h, reason: collision with root package name */
        static final int f27312h = 64;

        /* renamed from: i, reason: collision with root package name */
        static final int f27313i = 128;

        /* renamed from: j, reason: collision with root package name */
        static final int f27314j = 256;

        /* renamed from: k, reason: collision with root package name */
        static final int f27315k = 9;

        /* renamed from: l, reason: collision with root package name */
        static final int f27316l = 256;

        /* compiled from: WindowInsetsCompat.java */
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        private m() {
        }

        @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
        @SuppressLint({"WrongConstant"})
        static int a() {
            return -1;
        }

        public static int b() {
            return 4;
        }

        public static int c() {
            return 128;
        }

        public static int d() {
            return 8;
        }

        static int e(int i4) {
            if (i4 == 1) {
                return 0;
            }
            if (i4 == 2) {
                return 1;
            }
            if (i4 == 4) {
                return 2;
            }
            if (i4 == 8) {
                return 3;
            }
            if (i4 == 16) {
                return 4;
            }
            if (i4 == 32) {
                return 5;
            }
            if (i4 == 64) {
                return 6;
            }
            if (i4 == 128) {
                return 7;
            }
            if (i4 == 256) {
                return 8;
            }
            throw new IllegalArgumentException(android.support.v4.media.a.a("type needs to be >= FIRST and <= LAST, type=", i4));
        }

        public static int f() {
            return 32;
        }

        public static int g() {
            return 2;
        }

        public static int h() {
            return 1;
        }

        public static int i() {
            return 7;
        }

        public static int j() {
            return 16;
        }

        public static int k() {
            return 64;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    @androidx.annotation.x0(30)
    private static final class n {
        private n() {
        }

        static int a(int i4) {
            int statusBars;
            int i5 = 0;
            for (int i6 = 1; i6 <= 256; i6 <<= 1) {
                if ((i4 & i6) != 0) {
                    if (i6 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i6 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i6 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i6 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i6 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i6 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i6 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i6 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i5 |= statusBars;
                }
            }
            return i5;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f27272c = k.f27302q;
        } else {
            f27272c = l.f27303b;
        }
    }

    @androidx.annotation.x0(20)
    private j3(@androidx.annotation.o0 WindowInsets windowInsets) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            this.f27273a = new k(this, windowInsets);
            return;
        }
        if (i4 >= 29) {
            this.f27273a = new j(this, windowInsets);
        } else if (i4 >= 28) {
            this.f27273a = new i(this, windowInsets);
        } else {
            this.f27273a = new h(this, windowInsets);
        }
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(20)
    public static j3 K(@androidx.annotation.o0 WindowInsets windowInsets) {
        return L(windowInsets, null);
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(20)
    public static j3 L(@androidx.annotation.o0 WindowInsets windowInsets, @androidx.annotation.q0 View view) {
        windowInsets.getClass();
        j3 j3Var = new j3(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            j3Var.H(x1.r0(view));
            j3Var.d(view.getRootView());
        }
        return j3Var;
    }

    static androidx.core.graphics.e0 z(@androidx.annotation.o0 androidx.core.graphics.e0 e0Var, int i4, int i5, int i6, int i7) {
        int max = Math.max(0, e0Var.f26245a - i4);
        int max2 = Math.max(0, e0Var.f26246b - i5);
        int max3 = Math.max(0, e0Var.f26247c - i6);
        int max4 = Math.max(0, e0Var.f26248d - i7);
        return (max == i4 && max2 == i5 && max3 == i6 && max4 == i7) ? e0Var : androidx.core.graphics.e0.d(max, max2, max3, max4);
    }

    public boolean A() {
        return this.f27273a.o();
    }

    public boolean B() {
        return this.f27273a.p();
    }

    public boolean C(int i4) {
        return this.f27273a.q(i4);
    }

    @androidx.annotation.o0
    @Deprecated
    public j3 D(int i4, int i5, int i6, int i7) {
        return new b(this).h(androidx.core.graphics.e0.d(i4, i5, i6, i7)).a();
    }

    @androidx.annotation.o0
    @Deprecated
    public j3 E(@androidx.annotation.o0 Rect rect) {
        return new b(this).h(androidx.core.graphics.e0.e(rect)).a();
    }

    void F(androidx.core.graphics.e0[] e0VarArr) {
        this.f27273a.r(e0VarArr);
    }

    void G(@androidx.annotation.o0 androidx.core.graphics.e0 e0Var) {
        this.f27273a.s(e0Var);
    }

    void H(@androidx.annotation.q0 j3 j3Var) {
        this.f27273a.t(j3Var);
    }

    void I(@androidx.annotation.q0 androidx.core.graphics.e0 e0Var) {
        this.f27273a.u(e0Var);
    }

    @androidx.annotation.q0
    @androidx.annotation.x0(20)
    public WindowInsets J() {
        l lVar = this.f27273a;
        if (lVar instanceof g) {
            return ((g) lVar).f27293c;
        }
        return null;
    }

    @androidx.annotation.o0
    @Deprecated
    public j3 a() {
        return this.f27273a.a();
    }

    @androidx.annotation.o0
    @Deprecated
    public j3 b() {
        return this.f27273a.b();
    }

    @androidx.annotation.o0
    @Deprecated
    public j3 c() {
        return this.f27273a.c();
    }

    void d(@androidx.annotation.o0 View view) {
        this.f27273a.d(view);
    }

    @androidx.annotation.q0
    public z e() {
        return this.f27273a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j3) {
            return Objects.equals(this.f27273a, ((j3) obj).f27273a);
        }
        return false;
    }

    @androidx.annotation.o0
    public androidx.core.graphics.e0 f(int i4) {
        return this.f27273a.g(i4);
    }

    @androidx.annotation.o0
    public androidx.core.graphics.e0 g(int i4) {
        return this.f27273a.h(i4);
    }

    @androidx.annotation.o0
    @Deprecated
    public androidx.core.graphics.e0 h() {
        return this.f27273a.i();
    }

    public int hashCode() {
        l lVar = this.f27273a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f27273a.j().f26248d;
    }

    @Deprecated
    public int j() {
        return this.f27273a.j().f26245a;
    }

    @Deprecated
    public int k() {
        return this.f27273a.j().f26247c;
    }

    @Deprecated
    public int l() {
        return this.f27273a.j().f26246b;
    }

    @androidx.annotation.o0
    @Deprecated
    public androidx.core.graphics.e0 m() {
        return this.f27273a.j();
    }

    @androidx.annotation.o0
    @Deprecated
    public androidx.core.graphics.e0 n() {
        return this.f27273a.k();
    }

    @Deprecated
    public int o() {
        return this.f27273a.l().f26248d;
    }

    @Deprecated
    public int p() {
        return this.f27273a.l().f26245a;
    }

    @Deprecated
    public int q() {
        return this.f27273a.l().f26247c;
    }

    @Deprecated
    public int r() {
        return this.f27273a.l().f26246b;
    }

    @androidx.annotation.o0
    @Deprecated
    public androidx.core.graphics.e0 s() {
        return this.f27273a.l();
    }

    @androidx.annotation.o0
    @Deprecated
    public androidx.core.graphics.e0 t() {
        return this.f27273a.m();
    }

    public boolean u() {
        androidx.core.graphics.e0 f4 = f(-1);
        androidx.core.graphics.e0 e0Var = androidx.core.graphics.e0.f26244e;
        return (f4.equals(e0Var) && g(-9).equals(e0Var) && e() == null) ? false : true;
    }

    @Deprecated
    public boolean v() {
        return !this.f27273a.j().equals(androidx.core.graphics.e0.f26244e);
    }

    @Deprecated
    public boolean w() {
        return !this.f27273a.l().equals(androidx.core.graphics.e0.f26244e);
    }

    @androidx.annotation.o0
    public j3 x(@androidx.annotation.g0(from = 0) int i4, @androidx.annotation.g0(from = 0) int i5, @androidx.annotation.g0(from = 0) int i6, @androidx.annotation.g0(from = 0) int i7) {
        return this.f27273a.n(i4, i5, i6, i7);
    }

    @androidx.annotation.o0
    public j3 y(@androidx.annotation.o0 androidx.core.graphics.e0 e0Var) {
        return x(e0Var.f26245a, e0Var.f26246b, e0Var.f26247c, e0Var.f26248d);
    }

    /* compiled from: WindowInsetsCompat.java */
    @androidx.annotation.x0(api = 20)
    private static class c extends f {

        /* renamed from: e, reason: collision with root package name */
        private static Field f27279e;

        /* renamed from: f, reason: collision with root package name */
        private static boolean f27280f;

        /* renamed from: g, reason: collision with root package name */
        private static Constructor<WindowInsets> f27281g;

        /* renamed from: h, reason: collision with root package name */
        private static boolean f27282h;

        /* renamed from: c, reason: collision with root package name */
        private WindowInsets f27283c;

        /* renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.e0 f27284d;

        c() {
            this.f27283c = l();
        }

        @androidx.annotation.q0
        private static WindowInsets l() {
            if (!f27280f) {
                try {
                    f27279e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f27280f = true;
            }
            Field field = f27279e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!f27282h) {
                try {
                    f27281g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException unused3) {
                }
                f27282h = true;
            }
            Constructor<WindowInsets> constructor = f27281g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        @Override // androidx.core.view.j3.f
        @androidx.annotation.o0
        j3 b() {
            a();
            j3 K = j3.K(this.f27283c);
            K.F(this.f27287b);
            K.I(this.f27284d);
            return K;
        }

        @Override // androidx.core.view.j3.f
        void g(@androidx.annotation.q0 androidx.core.graphics.e0 e0Var) {
            this.f27284d = e0Var;
        }

        @Override // androidx.core.view.j3.f
        void i(@androidx.annotation.o0 androidx.core.graphics.e0 e0Var) {
            WindowInsets windowInsets = this.f27283c;
            if (windowInsets != null) {
                this.f27283c = windowInsets.replaceSystemWindowInsets(e0Var.f26245a, e0Var.f26246b, e0Var.f26247c, e0Var.f26248d);
            }
        }

        c(@androidx.annotation.o0 j3 j3Var) {
            super(j3Var);
            this.f27283c = j3Var.J();
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    @androidx.annotation.x0(api = 29)
    private static class d extends f {

        /* renamed from: c, reason: collision with root package name */
        final WindowInsets.Builder f27285c;

        d() {
            this.f27285c = r3.a();
        }

        @Override // androidx.core.view.j3.f
        @androidx.annotation.o0
        j3 b() {
            WindowInsets build;
            a();
            build = this.f27285c.build();
            j3 K = j3.K(build);
            K.F(this.f27287b);
            return K;
        }

        @Override // androidx.core.view.j3.f
        void c(@androidx.annotation.q0 z zVar) {
            this.f27285c.setDisplayCutout(zVar != null ? zVar.i() : null);
        }

        @Override // androidx.core.view.j3.f
        void f(@androidx.annotation.o0 androidx.core.graphics.e0 e0Var) {
            this.f27285c.setMandatorySystemGestureInsets(e0Var.h());
        }

        @Override // androidx.core.view.j3.f
        void g(@androidx.annotation.o0 androidx.core.graphics.e0 e0Var) {
            this.f27285c.setStableInsets(e0Var.h());
        }

        @Override // androidx.core.view.j3.f
        void h(@androidx.annotation.o0 androidx.core.graphics.e0 e0Var) {
            this.f27285c.setSystemGestureInsets(e0Var.h());
        }

        @Override // androidx.core.view.j3.f
        void i(@androidx.annotation.o0 androidx.core.graphics.e0 e0Var) {
            this.f27285c.setSystemWindowInsets(e0Var.h());
        }

        @Override // androidx.core.view.j3.f
        void j(@androidx.annotation.o0 androidx.core.graphics.e0 e0Var) {
            this.f27285c.setTappableElementInsets(e0Var.h());
        }

        d(@androidx.annotation.o0 j3 j3Var) {
            super(j3Var);
            WindowInsets.Builder a5;
            WindowInsets J = j3Var.J();
            if (J != null) {
                a5 = s3.a(J);
            } else {
                a5 = r3.a();
            }
            this.f27285c = a5;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    @androidx.annotation.x0(21)
    private static class h extends g {

        /* renamed from: m, reason: collision with root package name */
        private androidx.core.graphics.e0 f27298m;

        h(@androidx.annotation.o0 j3 j3Var, @androidx.annotation.o0 WindowInsets windowInsets) {
            super(j3Var, windowInsets);
            this.f27298m = null;
        }

        @Override // androidx.core.view.j3.l
        @androidx.annotation.o0
        j3 b() {
            return j3.K(this.f27293c.consumeStableInsets());
        }

        @Override // androidx.core.view.j3.l
        @androidx.annotation.o0
        j3 c() {
            return j3.K(this.f27293c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.j3.l
        @androidx.annotation.o0
        final androidx.core.graphics.e0 j() {
            if (this.f27298m == null) {
                this.f27298m = androidx.core.graphics.e0.d(this.f27293c.getStableInsetLeft(), this.f27293c.getStableInsetTop(), this.f27293c.getStableInsetRight(), this.f27293c.getStableInsetBottom());
            }
            return this.f27298m;
        }

        @Override // androidx.core.view.j3.l
        boolean o() {
            return this.f27293c.isConsumed();
        }

        @Override // androidx.core.view.j3.l
        public void u(@androidx.annotation.q0 androidx.core.graphics.e0 e0Var) {
            this.f27298m = e0Var;
        }

        h(@androidx.annotation.o0 j3 j3Var, @androidx.annotation.o0 h hVar) {
            super(j3Var, hVar);
            this.f27298m = null;
            this.f27298m = hVar.f27298m;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    @androidx.annotation.x0(20)
    private static class g extends l {

        /* renamed from: h, reason: collision with root package name */
        private static boolean f27288h;

        /* renamed from: i, reason: collision with root package name */
        private static Method f27289i;

        /* renamed from: j, reason: collision with root package name */
        private static Class<?> f27290j;

        /* renamed from: k, reason: collision with root package name */
        private static Field f27291k;

        /* renamed from: l, reason: collision with root package name */
        private static Field f27292l;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.o0
        final WindowInsets f27293c;

        /* renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.e0[] f27294d;

        /* renamed from: e, reason: collision with root package name */
        private androidx.core.graphics.e0 f27295e;

        /* renamed from: f, reason: collision with root package name */
        private j3 f27296f;

        /* renamed from: g, reason: collision with root package name */
        androidx.core.graphics.e0 f27297g;

        g(@androidx.annotation.o0 j3 j3Var, @androidx.annotation.o0 WindowInsets windowInsets) {
            super(j3Var);
            this.f27295e = null;
            this.f27293c = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        private static void A() {
            try {
                f27289i = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f27290j = cls;
                f27291k = cls.getDeclaredField("mVisibleInsets");
                f27292l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f27291k.setAccessible(true);
                f27292l.setAccessible(true);
            } catch (ReflectiveOperationException e4) {
                e4.getMessage();
            }
            f27288h = true;
        }

        @androidx.annotation.o0
        @SuppressLint({"WrongConstant"})
        private androidx.core.graphics.e0 v(int i4, boolean z4) {
            androidx.core.graphics.e0 e0Var = androidx.core.graphics.e0.f26244e;
            for (int i5 = 1; i5 <= 256; i5 <<= 1) {
                if ((i4 & i5) != 0) {
                    e0Var = androidx.core.graphics.e0.b(e0Var, w(i5, z4));
                }
            }
            return e0Var;
        }

        private androidx.core.graphics.e0 x() {
            j3 j3Var = this.f27296f;
            return j3Var != null ? j3Var.m() : androidx.core.graphics.e0.f26244e;
        }

        @androidx.annotation.q0
        private androidx.core.graphics.e0 y(@androidx.annotation.o0 View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f27288h) {
                A();
            }
            Method method = f27289i;
            if (method != null && f27290j != null && f27291k != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        return null;
                    }
                    Rect rect = (Rect) f27291k.get(f27292l.get(invoke));
                    if (rect != null) {
                        return androidx.core.graphics.e0.e(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e4) {
                    e4.getMessage();
                }
            }
            return null;
        }

        @Override // androidx.core.view.j3.l
        void d(@androidx.annotation.o0 View view) {
            androidx.core.graphics.e0 y4 = y(view);
            if (y4 == null) {
                y4 = androidx.core.graphics.e0.f26244e;
            }
            s(y4);
        }

        @Override // androidx.core.view.j3.l
        void e(@androidx.annotation.o0 j3 j3Var) {
            j3Var.H(this.f27296f);
            j3Var.G(this.f27297g);
        }

        @Override // androidx.core.view.j3.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f27297g, ((g) obj).f27297g);
            }
            return false;
        }

        @Override // androidx.core.view.j3.l
        @androidx.annotation.o0
        public androidx.core.graphics.e0 g(int i4) {
            return v(i4, false);
        }

        @Override // androidx.core.view.j3.l
        @androidx.annotation.o0
        public androidx.core.graphics.e0 h(int i4) {
            return v(i4, true);
        }

        @Override // androidx.core.view.j3.l
        @androidx.annotation.o0
        final androidx.core.graphics.e0 l() {
            if (this.f27295e == null) {
                this.f27295e = androidx.core.graphics.e0.d(this.f27293c.getSystemWindowInsetLeft(), this.f27293c.getSystemWindowInsetTop(), this.f27293c.getSystemWindowInsetRight(), this.f27293c.getSystemWindowInsetBottom());
            }
            return this.f27295e;
        }

        @Override // androidx.core.view.j3.l
        @androidx.annotation.o0
        j3 n(int i4, int i5, int i6, int i7) {
            b bVar = new b(j3.K(this.f27293c));
            bVar.h(j3.z(l(), i4, i5, i6, i7));
            bVar.f(j3.z(j(), i4, i5, i6, i7));
            return bVar.a();
        }

        @Override // androidx.core.view.j3.l
        boolean p() {
            return this.f27293c.isRound();
        }

        @Override // androidx.core.view.j3.l
        @SuppressLint({"WrongConstant"})
        boolean q(int i4) {
            for (int i5 = 1; i5 <= 256; i5 <<= 1) {
                if ((i4 & i5) != 0 && !z(i5)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.j3.l
        public void r(androidx.core.graphics.e0[] e0VarArr) {
            this.f27294d = e0VarArr;
        }

        @Override // androidx.core.view.j3.l
        void s(@androidx.annotation.o0 androidx.core.graphics.e0 e0Var) {
            this.f27297g = e0Var;
        }

        @Override // androidx.core.view.j3.l
        void t(@androidx.annotation.q0 j3 j3Var) {
            this.f27296f = j3Var;
        }

        @androidx.annotation.o0
        protected androidx.core.graphics.e0 w(int i4, boolean z4) {
            androidx.core.graphics.e0 m4;
            int i5;
            if (i4 == 1) {
                return z4 ? androidx.core.graphics.e0.d(0, Math.max(x().f26246b, l().f26246b), 0, 0) : androidx.core.graphics.e0.d(0, l().f26246b, 0, 0);
            }
            if (i4 == 2) {
                if (z4) {
                    androidx.core.graphics.e0 x4 = x();
                    androidx.core.graphics.e0 j4 = j();
                    return androidx.core.graphics.e0.d(Math.max(x4.f26245a, j4.f26245a), 0, Math.max(x4.f26247c, j4.f26247c), Math.max(x4.f26248d, j4.f26248d));
                }
                androidx.core.graphics.e0 l4 = l();
                j3 j3Var = this.f27296f;
                m4 = j3Var != null ? j3Var.m() : null;
                int i6 = l4.f26248d;
                if (m4 != null) {
                    i6 = Math.min(i6, m4.f26248d);
                }
                return androidx.core.graphics.e0.d(l4.f26245a, 0, l4.f26247c, i6);
            }
            if (i4 != 8) {
                if (i4 == 16) {
                    return k();
                }
                if (i4 == 32) {
                    return i();
                }
                if (i4 == 64) {
                    return m();
                }
                if (i4 != 128) {
                    return androidx.core.graphics.e0.f26244e;
                }
                j3 j3Var2 = this.f27296f;
                z e4 = j3Var2 != null ? j3Var2.e() : f();
                return e4 != null ? androidx.core.graphics.e0.d(e4.e(), e4.g(), e4.f(), e4.d()) : androidx.core.graphics.e0.f26244e;
            }
            androidx.core.graphics.e0[] e0VarArr = this.f27294d;
            m4 = e0VarArr != null ? e0VarArr[m.e(8)] : null;
            if (m4 != null) {
                return m4;
            }
            androidx.core.graphics.e0 l5 = l();
            androidx.core.graphics.e0 x5 = x();
            int i7 = l5.f26248d;
            if (i7 > x5.f26248d) {
                return androidx.core.graphics.e0.d(0, 0, 0, i7);
            }
            androidx.core.graphics.e0 e0Var = this.f27297g;
            return (e0Var == null || e0Var.equals(androidx.core.graphics.e0.f26244e) || (i5 = this.f27297g.f26248d) <= x5.f26248d) ? androidx.core.graphics.e0.f26244e : androidx.core.graphics.e0.d(0, 0, 0, i5);
        }

        protected boolean z(int i4) {
            if (i4 != 1 && i4 != 2) {
                if (i4 == 4) {
                    return false;
                }
                if (i4 != 8 && i4 != 128) {
                    return true;
                }
            }
            return !w(i4, false).equals(androidx.core.graphics.e0.f26244e);
        }

        g(@androidx.annotation.o0 j3 j3Var, @androidx.annotation.o0 g gVar) {
            this(j3Var, new WindowInsets(gVar.f27293c));
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    @androidx.annotation.x0(29)
    private static class j extends i {

        /* renamed from: n, reason: collision with root package name */
        private androidx.core.graphics.e0 f27299n;

        /* renamed from: o, reason: collision with root package name */
        private androidx.core.graphics.e0 f27300o;

        /* renamed from: p, reason: collision with root package name */
        private androidx.core.graphics.e0 f27301p;

        j(@androidx.annotation.o0 j3 j3Var, @androidx.annotation.o0 WindowInsets windowInsets) {
            super(j3Var, windowInsets);
            this.f27299n = null;
            this.f27300o = null;
            this.f27301p = null;
        }

        @Override // androidx.core.view.j3.l
        @androidx.annotation.o0
        androidx.core.graphics.e0 i() {
            Insets mandatorySystemGestureInsets;
            if (this.f27300o == null) {
                mandatorySystemGestureInsets = this.f27293c.getMandatorySystemGestureInsets();
                this.f27300o = androidx.core.graphics.e0.g(mandatorySystemGestureInsets);
            }
            return this.f27300o;
        }

        @Override // androidx.core.view.j3.l
        @androidx.annotation.o0
        androidx.core.graphics.e0 k() {
            Insets systemGestureInsets;
            if (this.f27299n == null) {
                systemGestureInsets = this.f27293c.getSystemGestureInsets();
                this.f27299n = androidx.core.graphics.e0.g(systemGestureInsets);
            }
            return this.f27299n;
        }

        @Override // androidx.core.view.j3.l
        @androidx.annotation.o0
        androidx.core.graphics.e0 m() {
            Insets tappableElementInsets;
            if (this.f27301p == null) {
                tappableElementInsets = this.f27293c.getTappableElementInsets();
                this.f27301p = androidx.core.graphics.e0.g(tappableElementInsets);
            }
            return this.f27301p;
        }

        @Override // androidx.core.view.j3.g, androidx.core.view.j3.l
        @androidx.annotation.o0
        j3 n(int i4, int i5, int i6, int i7) {
            WindowInsets inset;
            inset = this.f27293c.inset(i4, i5, i6, i7);
            return j3.K(inset);
        }

        @Override // androidx.core.view.j3.h, androidx.core.view.j3.l
        public void u(@androidx.annotation.q0 androidx.core.graphics.e0 e0Var) {
        }

        j(@androidx.annotation.o0 j3 j3Var, @androidx.annotation.o0 j jVar) {
            super(j3Var, jVar);
            this.f27299n = null;
            this.f27300o = null;
            this.f27301p = null;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final f f27278a;

        public b() {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                this.f27278a = new e();
            } else if (i4 >= 29) {
                this.f27278a = new d();
            } else {
                this.f27278a = new c();
            }
        }

        @androidx.annotation.o0
        public j3 a() {
            return this.f27278a.b();
        }

        @androidx.annotation.o0
        public b b(@androidx.annotation.q0 z zVar) {
            this.f27278a.c(zVar);
            return this;
        }

        @androidx.annotation.o0
        public b c(int i4, @androidx.annotation.o0 androidx.core.graphics.e0 e0Var) {
            this.f27278a.d(i4, e0Var);
            return this;
        }

        @androidx.annotation.o0
        public b d(int i4, @androidx.annotation.o0 androidx.core.graphics.e0 e0Var) {
            this.f27278a.e(i4, e0Var);
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public b e(@androidx.annotation.o0 androidx.core.graphics.e0 e0Var) {
            this.f27278a.f(e0Var);
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public b f(@androidx.annotation.o0 androidx.core.graphics.e0 e0Var) {
            this.f27278a.g(e0Var);
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public b g(@androidx.annotation.o0 androidx.core.graphics.e0 e0Var) {
            this.f27278a.h(e0Var);
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public b h(@androidx.annotation.o0 androidx.core.graphics.e0 e0Var) {
            this.f27278a.i(e0Var);
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public b i(@androidx.annotation.o0 androidx.core.graphics.e0 e0Var) {
            this.f27278a.j(e0Var);
            return this;
        }

        @androidx.annotation.o0
        public b j(int i4, boolean z4) {
            this.f27278a.k(i4, z4);
            return this;
        }

        public b(@androidx.annotation.o0 j3 j3Var) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                this.f27278a = new e(j3Var);
            } else if (i4 >= 29) {
                this.f27278a = new d(j3Var);
            } else {
                this.f27278a = new c(j3Var);
            }
        }
    }

    public j3(@androidx.annotation.q0 j3 j3Var) {
        if (j3Var != null) {
            l lVar = j3Var.f27273a;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30 && (lVar instanceof k)) {
                this.f27273a = new k(this, (k) lVar);
            } else if (i4 >= 29 && (lVar instanceof j)) {
                this.f27273a = new j(this, (j) lVar);
            } else if (i4 >= 28 && (lVar instanceof i)) {
                this.f27273a = new i(this, (i) lVar);
            } else if (lVar instanceof h) {
                this.f27273a = new h(this, (h) lVar);
            } else if (lVar instanceof g) {
                this.f27273a = new g(this, (g) lVar);
            } else {
                this.f27273a = new l(this);
            }
            lVar.e(this);
            return;
        }
        this.f27273a = new l(this);
    }
}
