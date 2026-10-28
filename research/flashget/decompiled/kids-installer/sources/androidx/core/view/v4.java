package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.c1;
import androidx.core.view.y1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: WindowInsetsCompat.java */
/* loaded from: classes.dex */
public class v4 {

    /* renamed from: b, reason: collision with root package name */
    private static final String f5690b = "WindowInsetsCompat";

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.o0
    public static final v4 f5691c;

    /* renamed from: a, reason: collision with root package name */
    private final l f5692a;

    /* compiled from: WindowInsetsCompat.java */
    @SuppressLint({"SoonBlockedPrivateApi"})
    @androidx.annotation.x0(21)
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static Field f5693a;

        /* renamed from: b, reason: collision with root package name */
        private static Field f5694b;

        /* renamed from: c, reason: collision with root package name */
        private static Field f5695c;

        /* renamed from: d, reason: collision with root package name */
        private static boolean f5696d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f5693a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f5694b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f5695c = declaredField3;
                declaredField3.setAccessible(true);
                f5696d = true;
            } catch (ReflectiveOperationException e6) {
                e6.getMessage();
            }
        }

        private a() {
        }

        @androidx.annotation.q0
        public static v4 a(@androidx.annotation.o0 View view) {
            if (f5696d && view.isAttachedToWindow()) {
                try {
                    Object obj = f5693a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f5694b.get(obj);
                        Rect rect2 = (Rect) f5695c.get(obj);
                        if (rect != null && rect2 != null) {
                            v4 a6 = new b().f(androidx.core.graphics.w1.e(rect)).h(androidx.core.graphics.w1.e(rect2)).a();
                            a6.H(a6);
                            a6.d(view.getRootView());
                            return a6;
                        }
                    }
                } catch (IllegalAccessException e6) {
                    e6.getMessage();
                }
            }
            return null;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    @androidx.annotation.x0(30)
    /* loaded from: classes3.dex */
    private static class e extends d {
        e() {
        }

        @Override // androidx.core.view.v4.f
        void d(int i5, @androidx.annotation.o0 androidx.core.graphics.w1 w1Var) {
            this.f5704c.setInsets(n.a(i5), w1Var.h());
        }

        @Override // androidx.core.view.v4.f
        void e(int i5, @androidx.annotation.o0 androidx.core.graphics.w1 w1Var) {
            this.f5704c.setInsetsIgnoringVisibility(n.a(i5), w1Var.h());
        }

        @Override // androidx.core.view.v4.f
        void k(int i5, boolean z5) {
            this.f5704c.setVisible(n.a(i5), z5);
        }

        e(@androidx.annotation.o0 v4 v4Var) {
            super(v4Var);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    private static class f {

        /* renamed from: a, reason: collision with root package name */
        private final v4 f5705a;

        /* renamed from: b, reason: collision with root package name */
        androidx.core.graphics.w1[] f5706b;

        f() {
            this(new v4((v4) null));
        }

        protected final void a() {
            androidx.core.graphics.w1[] w1VarArr = this.f5706b;
            if (w1VarArr != null) {
                androidx.core.graphics.w1 w1Var = w1VarArr[m.e(1)];
                androidx.core.graphics.w1 w1Var2 = this.f5706b[m.e(2)];
                if (w1Var2 == null) {
                    w1Var2 = this.f5705a.f(2);
                }
                if (w1Var == null) {
                    w1Var = this.f5705a.f(1);
                }
                i(androidx.core.graphics.w1.b(w1Var, w1Var2));
                androidx.core.graphics.w1 w1Var3 = this.f5706b[m.e(16)];
                if (w1Var3 != null) {
                    h(w1Var3);
                }
                androidx.core.graphics.w1 w1Var4 = this.f5706b[m.e(32)];
                if (w1Var4 != null) {
                    f(w1Var4);
                }
                androidx.core.graphics.w1 w1Var5 = this.f5706b[m.e(64)];
                if (w1Var5 != null) {
                    j(w1Var5);
                }
            }
        }

        @androidx.annotation.o0
        v4 b() {
            a();
            return this.f5705a;
        }

        void c(@androidx.annotation.q0 w wVar) {
        }

        void d(int i5, @androidx.annotation.o0 androidx.core.graphics.w1 w1Var) {
            if (this.f5706b == null) {
                this.f5706b = new androidx.core.graphics.w1[9];
            }
            for (int i6 = 1; i6 <= 256; i6 <<= 1) {
                if ((i5 & i6) != 0) {
                    this.f5706b[m.e(i6)] = w1Var;
                }
            }
        }

        void e(int i5, @androidx.annotation.o0 androidx.core.graphics.w1 w1Var) {
            if (i5 == 8) {
                throw new IllegalArgumentException("Ignoring visibility inset not available for IME");
            }
        }

        void f(@androidx.annotation.o0 androidx.core.graphics.w1 w1Var) {
        }

        void g(@androidx.annotation.o0 androidx.core.graphics.w1 w1Var) {
        }

        void h(@androidx.annotation.o0 androidx.core.graphics.w1 w1Var) {
        }

        void i(@androidx.annotation.o0 androidx.core.graphics.w1 w1Var) {
        }

        void j(@androidx.annotation.o0 androidx.core.graphics.w1 w1Var) {
        }

        void k(int i5, boolean z5) {
        }

        f(@androidx.annotation.o0 v4 v4Var) {
            this.f5705a = v4Var;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    @androidx.annotation.x0(28)
    /* loaded from: classes3.dex */
    private static class i extends h {
        i(@androidx.annotation.o0 v4 v4Var, @androidx.annotation.o0 WindowInsets windowInsets) {
            super(v4Var, windowInsets);
        }

        @Override // androidx.core.view.v4.l
        @androidx.annotation.o0
        v4 a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.f5712c.consumeDisplayCutout();
            return v4.K(consumeDisplayCutout);
        }

        @Override // androidx.core.view.v4.g, androidx.core.view.v4.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f5712c, iVar.f5712c) && Objects.equals(this.f5716g, iVar.f5716g);
        }

        @Override // androidx.core.view.v4.l
        @androidx.annotation.q0
        w f() {
            DisplayCutout displayCutout;
            displayCutout = this.f5712c.getDisplayCutout();
            return w.i(displayCutout);
        }

        @Override // androidx.core.view.v4.l
        public int hashCode() {
            return this.f5712c.hashCode();
        }

        i(@androidx.annotation.o0 v4 v4Var, @androidx.annotation.o0 i iVar) {
            super(v4Var, iVar);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    @androidx.annotation.x0(30)
    /* loaded from: classes4.dex */
    private static class k extends j {

        /* renamed from: q, reason: collision with root package name */
        @androidx.annotation.o0
        static final v4 f5721q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            f5721q = v4.K(windowInsets);
        }

        k(@androidx.annotation.o0 v4 v4Var, @androidx.annotation.o0 WindowInsets windowInsets) {
            super(v4Var, windowInsets);
        }

        @Override // androidx.core.view.v4.g, androidx.core.view.v4.l
        final void d(@androidx.annotation.o0 View view) {
        }

        @Override // androidx.core.view.v4.g, androidx.core.view.v4.l
        @androidx.annotation.o0
        public androidx.core.graphics.w1 g(int i5) {
            Insets insets;
            insets = this.f5712c.getInsets(n.a(i5));
            return androidx.core.graphics.w1.g(insets);
        }

        @Override // androidx.core.view.v4.g, androidx.core.view.v4.l
        @androidx.annotation.o0
        public androidx.core.graphics.w1 h(int i5) {
            Insets insetsIgnoringVisibility;
            insetsIgnoringVisibility = this.f5712c.getInsetsIgnoringVisibility(n.a(i5));
            return androidx.core.graphics.w1.g(insetsIgnoringVisibility);
        }

        @Override // androidx.core.view.v4.g, androidx.core.view.v4.l
        public boolean q(int i5) {
            boolean isVisible;
            isVisible = this.f5712c.isVisible(n.a(i5));
            return isVisible;
        }

        k(@androidx.annotation.o0 v4 v4Var, @androidx.annotation.o0 k kVar) {
            super(v4Var, kVar);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    private static class l {

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.o0
        static final v4 f5722b = new b().a().a().b().c();

        /* renamed from: a, reason: collision with root package name */
        final v4 f5723a;

        l(@androidx.annotation.o0 v4 v4Var) {
            this.f5723a = v4Var;
        }

        @androidx.annotation.o0
        v4 a() {
            return this.f5723a;
        }

        @androidx.annotation.o0
        v4 b() {
            return this.f5723a;
        }

        @androidx.annotation.o0
        v4 c() {
            return this.f5723a;
        }

        void d(@androidx.annotation.o0 View view) {
        }

        void e(@androidx.annotation.o0 v4 v4Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return p() == lVar.p() && o() == lVar.o() && androidx.core.util.l.a(l(), lVar.l()) && androidx.core.util.l.a(j(), lVar.j()) && androidx.core.util.l.a(f(), lVar.f());
        }

        @androidx.annotation.q0
        w f() {
            return null;
        }

        @androidx.annotation.o0
        androidx.core.graphics.w1 g(int i5) {
            return androidx.core.graphics.w1.f4812e;
        }

        @androidx.annotation.o0
        androidx.core.graphics.w1 h(int i5) {
            if ((i5 & 8) == 0) {
                return androidx.core.graphics.w1.f4812e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return androidx.core.util.l.b(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        @androidx.annotation.o0
        androidx.core.graphics.w1 i() {
            return l();
        }

        @androidx.annotation.o0
        androidx.core.graphics.w1 j() {
            return androidx.core.graphics.w1.f4812e;
        }

        @androidx.annotation.o0
        androidx.core.graphics.w1 k() {
            return l();
        }

        @androidx.annotation.o0
        androidx.core.graphics.w1 l() {
            return androidx.core.graphics.w1.f4812e;
        }

        @androidx.annotation.o0
        androidx.core.graphics.w1 m() {
            return l();
        }

        @androidx.annotation.o0
        v4 n(int i5, int i6, int i7, int i8) {
            return f5722b;
        }

        boolean o() {
            return false;
        }

        boolean p() {
            return false;
        }

        boolean q(int i5) {
            return true;
        }

        public void r(androidx.core.graphics.w1[] w1VarArr) {
        }

        void s(@androidx.annotation.o0 androidx.core.graphics.w1 w1Var) {
        }

        void t(@androidx.annotation.q0 v4 v4Var) {
        }

        public void u(androidx.core.graphics.w1 w1Var) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static final class m {

        /* renamed from: a, reason: collision with root package name */
        static final int f5724a = 1;

        /* renamed from: b, reason: collision with root package name */
        static final int f5725b = 1;

        /* renamed from: c, reason: collision with root package name */
        static final int f5726c = 2;

        /* renamed from: d, reason: collision with root package name */
        static final int f5727d = 4;

        /* renamed from: e, reason: collision with root package name */
        static final int f5728e = 8;

        /* renamed from: f, reason: collision with root package name */
        static final int f5729f = 16;

        /* renamed from: g, reason: collision with root package name */
        static final int f5730g = 32;

        /* renamed from: h, reason: collision with root package name */
        static final int f5731h = 64;

        /* renamed from: i, reason: collision with root package name */
        static final int f5732i = 128;

        /* renamed from: j, reason: collision with root package name */
        static final int f5733j = 256;

        /* renamed from: k, reason: collision with root package name */
        static final int f5734k = 9;

        /* renamed from: l, reason: collision with root package name */
        static final int f5735l = 256;

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

        static int e(int i5) {
            if (i5 == 1) {
                return 0;
            }
            if (i5 == 2) {
                return 1;
            }
            if (i5 == 4) {
                return 2;
            }
            if (i5 == 8) {
                return 3;
            }
            if (i5 == 16) {
                return 4;
            }
            if (i5 == 32) {
                return 5;
            }
            if (i5 == 64) {
                return 6;
            }
            if (i5 == 128) {
                return 7;
            }
            if (i5 == 256) {
                return 8;
            }
            throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a("type needs to be >= FIRST and <= LAST, type=", i5));
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

        static int a(int i5) {
            int statusBars;
            int i6 = 0;
            for (int i7 = 1; i7 <= 256; i7 <<= 1) {
                if ((i5 & i7) != 0) {
                    if (i7 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i7 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i7 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i7 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i7 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i7 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i7 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i7 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i6 |= statusBars;
                }
            }
            return i6;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f5691c = k.f5721q;
        } else {
            f5691c = l.f5722b;
        }
    }

    @androidx.annotation.x0(20)
    private v4(@androidx.annotation.o0 WindowInsets windowInsets) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 30) {
            this.f5692a = new k(this, windowInsets);
            return;
        }
        if (i5 >= 29) {
            this.f5692a = new j(this, windowInsets);
        } else if (i5 >= 28) {
            this.f5692a = new i(this, windowInsets);
        } else {
            this.f5692a = new h(this, windowInsets);
        }
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(20)
    public static v4 K(@androidx.annotation.o0 WindowInsets windowInsets) {
        return L(windowInsets, null);
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(20)
    public static v4 L(@androidx.annotation.o0 WindowInsets windowInsets, @androidx.annotation.q0 View view) {
        windowInsets.getClass();
        v4 v4Var = new v4(windowInsets);
        if (view != null && y1.O0(view)) {
            v4Var.H(y1.n.a(view));
            v4Var.d(view.getRootView());
        }
        return v4Var;
    }

    static androidx.core.graphics.w1 z(@androidx.annotation.o0 androidx.core.graphics.w1 w1Var, int i5, int i6, int i7, int i8) {
        int max = Math.max(0, w1Var.f4813a - i5);
        int max2 = Math.max(0, w1Var.f4814b - i6);
        int max3 = Math.max(0, w1Var.f4815c - i7);
        int max4 = Math.max(0, w1Var.f4816d - i8);
        return (max == i5 && max2 == i6 && max3 == i7 && max4 == i8) ? w1Var : androidx.core.graphics.w1.d(max, max2, max3, max4);
    }

    public boolean A() {
        return this.f5692a.o();
    }

    public boolean B() {
        return this.f5692a.p();
    }

    public boolean C(int i5) {
        return this.f5692a.q(i5);
    }

    @androidx.annotation.o0
    @Deprecated
    public v4 D(int i5, int i6, int i7, int i8) {
        return new b(this).h(androidx.core.graphics.w1.d(i5, i6, i7, i8)).a();
    }

    @androidx.annotation.o0
    @Deprecated
    public v4 E(@androidx.annotation.o0 Rect rect) {
        return new b(this).h(androidx.core.graphics.w1.e(rect)).a();
    }

    void F(androidx.core.graphics.w1[] w1VarArr) {
        this.f5692a.r(w1VarArr);
    }

    void G(@androidx.annotation.o0 androidx.core.graphics.w1 w1Var) {
        this.f5692a.s(w1Var);
    }

    void H(@androidx.annotation.q0 v4 v4Var) {
        this.f5692a.t(v4Var);
    }

    void I(@androidx.annotation.q0 androidx.core.graphics.w1 w1Var) {
        this.f5692a.u(w1Var);
    }

    @androidx.annotation.q0
    @androidx.annotation.x0(20)
    public WindowInsets J() {
        l lVar = this.f5692a;
        if (lVar instanceof g) {
            return ((g) lVar).f5712c;
        }
        return null;
    }

    @androidx.annotation.o0
    @Deprecated
    public v4 a() {
        return this.f5692a.a();
    }

    @androidx.annotation.o0
    @Deprecated
    public v4 b() {
        return this.f5692a.b();
    }

    @androidx.annotation.o0
    @Deprecated
    public v4 c() {
        return this.f5692a.c();
    }

    void d(@androidx.annotation.o0 View view) {
        this.f5692a.d(view);
    }

    @androidx.annotation.q0
    public w e() {
        return this.f5692a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v4) {
            return androidx.core.util.l.a(this.f5692a, ((v4) obj).f5692a);
        }
        return false;
    }

    @androidx.annotation.o0
    public androidx.core.graphics.w1 f(int i5) {
        return this.f5692a.g(i5);
    }

    @androidx.annotation.o0
    public androidx.core.graphics.w1 g(int i5) {
        return this.f5692a.h(i5);
    }

    @androidx.annotation.o0
    @Deprecated
    public androidx.core.graphics.w1 h() {
        return this.f5692a.i();
    }

    public int hashCode() {
        l lVar = this.f5692a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f5692a.j().f4816d;
    }

    @Deprecated
    public int j() {
        return this.f5692a.j().f4813a;
    }

    @Deprecated
    public int k() {
        return this.f5692a.j().f4815c;
    }

    @Deprecated
    public int l() {
        return this.f5692a.j().f4814b;
    }

    @androidx.annotation.o0
    @Deprecated
    public androidx.core.graphics.w1 m() {
        return this.f5692a.j();
    }

    @androidx.annotation.o0
    @Deprecated
    public androidx.core.graphics.w1 n() {
        return this.f5692a.k();
    }

    @Deprecated
    public int o() {
        return this.f5692a.l().f4816d;
    }

    @Deprecated
    public int p() {
        return this.f5692a.l().f4813a;
    }

    @Deprecated
    public int q() {
        return this.f5692a.l().f4815c;
    }

    @Deprecated
    public int r() {
        return this.f5692a.l().f4814b;
    }

    @androidx.annotation.o0
    @Deprecated
    public androidx.core.graphics.w1 s() {
        return this.f5692a.l();
    }

    @androidx.annotation.o0
    @Deprecated
    public androidx.core.graphics.w1 t() {
        return this.f5692a.m();
    }

    public boolean u() {
        androidx.core.graphics.w1 f6 = f(-1);
        androidx.core.graphics.w1 w1Var = androidx.core.graphics.w1.f4812e;
        return (f6.equals(w1Var) && g(-9).equals(w1Var) && e() == null) ? false : true;
    }

    @Deprecated
    public boolean v() {
        return !this.f5692a.j().equals(androidx.core.graphics.w1.f4812e);
    }

    @Deprecated
    public boolean w() {
        return !this.f5692a.l().equals(androidx.core.graphics.w1.f4812e);
    }

    @androidx.annotation.o0
    public v4 x(@androidx.annotation.g0(from = 0) int i5, @androidx.annotation.g0(from = 0) int i6, @androidx.annotation.g0(from = 0) int i7, @androidx.annotation.g0(from = 0) int i8) {
        return this.f5692a.n(i5, i6, i7, i8);
    }

    @androidx.annotation.o0
    public v4 y(@androidx.annotation.o0 androidx.core.graphics.w1 w1Var) {
        return x(w1Var.f4813a, w1Var.f4814b, w1Var.f4815c, w1Var.f4816d);
    }

    /* compiled from: WindowInsetsCompat.java */
    @androidx.annotation.x0(api = 20)
    /* loaded from: classes3.dex */
    private static class c extends f {

        /* renamed from: e, reason: collision with root package name */
        private static Field f5698e;

        /* renamed from: f, reason: collision with root package name */
        private static boolean f5699f;

        /* renamed from: g, reason: collision with root package name */
        private static Constructor<WindowInsets> f5700g;

        /* renamed from: h, reason: collision with root package name */
        private static boolean f5701h;

        /* renamed from: c, reason: collision with root package name */
        private WindowInsets f5702c;

        /* renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.w1 f5703d;

        c() {
            this.f5702c = l();
        }

        @androidx.annotation.q0
        private static WindowInsets l() {
            if (!f5699f) {
                try {
                    f5698e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f5699f = true;
            }
            Field field = f5698e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!f5701h) {
                try {
                    f5700g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException unused3) {
                }
                f5701h = true;
            }
            Constructor<WindowInsets> constructor = f5700g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        @Override // androidx.core.view.v4.f
        @androidx.annotation.o0
        v4 b() {
            a();
            v4 K = v4.K(this.f5702c);
            K.F(this.f5706b);
            K.I(this.f5703d);
            return K;
        }

        @Override // androidx.core.view.v4.f
        void g(@androidx.annotation.q0 androidx.core.graphics.w1 w1Var) {
            this.f5703d = w1Var;
        }

        @Override // androidx.core.view.v4.f
        void i(@androidx.annotation.o0 androidx.core.graphics.w1 w1Var) {
            WindowInsets windowInsets = this.f5702c;
            if (windowInsets != null) {
                this.f5702c = windowInsets.replaceSystemWindowInsets(w1Var.f4813a, w1Var.f4814b, w1Var.f4815c, w1Var.f4816d);
            }
        }

        c(@androidx.annotation.o0 v4 v4Var) {
            super(v4Var);
            this.f5702c = v4Var.J();
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    @androidx.annotation.x0(api = 29)
    /* loaded from: classes3.dex */
    private static class d extends f {

        /* renamed from: c, reason: collision with root package name */
        final WindowInsets.Builder f5704c;

        d() {
            this.f5704c = new WindowInsets.Builder();
        }

        @Override // androidx.core.view.v4.f
        @androidx.annotation.o0
        v4 b() {
            WindowInsets build;
            a();
            build = this.f5704c.build();
            v4 K = v4.K(build);
            K.F(this.f5706b);
            return K;
        }

        @Override // androidx.core.view.v4.f
        void c(@androidx.annotation.q0 w wVar) {
            this.f5704c.setDisplayCutout(wVar != null ? wVar.h() : null);
        }

        @Override // androidx.core.view.v4.f
        void f(@androidx.annotation.o0 androidx.core.graphics.w1 w1Var) {
            this.f5704c.setMandatorySystemGestureInsets(w1Var.h());
        }

        @Override // androidx.core.view.v4.f
        void g(@androidx.annotation.o0 androidx.core.graphics.w1 w1Var) {
            this.f5704c.setStableInsets(w1Var.h());
        }

        @Override // androidx.core.view.v4.f
        void h(@androidx.annotation.o0 androidx.core.graphics.w1 w1Var) {
            this.f5704c.setSystemGestureInsets(w1Var.h());
        }

        @Override // androidx.core.view.v4.f
        void i(@androidx.annotation.o0 androidx.core.graphics.w1 w1Var) {
            this.f5704c.setSystemWindowInsets(w1Var.h());
        }

        @Override // androidx.core.view.v4.f
        void j(@androidx.annotation.o0 androidx.core.graphics.w1 w1Var) {
            this.f5704c.setTappableElementInsets(w1Var.h());
        }

        d(@androidx.annotation.o0 v4 v4Var) {
            super(v4Var);
            WindowInsets.Builder builder;
            WindowInsets J = v4Var.J();
            if (J != null) {
                builder = new WindowInsets.Builder(J);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f5704c = builder;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    @androidx.annotation.x0(21)
    /* loaded from: classes3.dex */
    private static class h extends g {

        /* renamed from: m, reason: collision with root package name */
        private androidx.core.graphics.w1 f5717m;

        h(@androidx.annotation.o0 v4 v4Var, @androidx.annotation.o0 WindowInsets windowInsets) {
            super(v4Var, windowInsets);
            this.f5717m = null;
        }

        @Override // androidx.core.view.v4.l
        @androidx.annotation.o0
        v4 b() {
            return v4.K(this.f5712c.consumeStableInsets());
        }

        @Override // androidx.core.view.v4.l
        @androidx.annotation.o0
        v4 c() {
            return v4.K(this.f5712c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.v4.l
        @androidx.annotation.o0
        final androidx.core.graphics.w1 j() {
            if (this.f5717m == null) {
                this.f5717m = androidx.core.graphics.w1.d(this.f5712c.getStableInsetLeft(), this.f5712c.getStableInsetTop(), this.f5712c.getStableInsetRight(), this.f5712c.getStableInsetBottom());
            }
            return this.f5717m;
        }

        @Override // androidx.core.view.v4.l
        boolean o() {
            return this.f5712c.isConsumed();
        }

        @Override // androidx.core.view.v4.l
        public void u(@androidx.annotation.q0 androidx.core.graphics.w1 w1Var) {
            this.f5717m = w1Var;
        }

        h(@androidx.annotation.o0 v4 v4Var, @androidx.annotation.o0 h hVar) {
            super(v4Var, hVar);
            this.f5717m = null;
            this.f5717m = hVar.f5717m;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    @androidx.annotation.x0(20)
    /* loaded from: classes3.dex */
    private static class g extends l {

        /* renamed from: h, reason: collision with root package name */
        private static boolean f5707h;

        /* renamed from: i, reason: collision with root package name */
        private static Method f5708i;

        /* renamed from: j, reason: collision with root package name */
        private static Class<?> f5709j;

        /* renamed from: k, reason: collision with root package name */
        private static Field f5710k;

        /* renamed from: l, reason: collision with root package name */
        private static Field f5711l;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.o0
        final WindowInsets f5712c;

        /* renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.w1[] f5713d;

        /* renamed from: e, reason: collision with root package name */
        private androidx.core.graphics.w1 f5714e;

        /* renamed from: f, reason: collision with root package name */
        private v4 f5715f;

        /* renamed from: g, reason: collision with root package name */
        androidx.core.graphics.w1 f5716g;

        g(@androidx.annotation.o0 v4 v4Var, @androidx.annotation.o0 WindowInsets windowInsets) {
            super(v4Var);
            this.f5714e = null;
            this.f5712c = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        private static void A() {
            try {
                f5708i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f5709j = cls;
                f5710k = cls.getDeclaredField("mVisibleInsets");
                f5711l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f5710k.setAccessible(true);
                f5711l.setAccessible(true);
            } catch (ReflectiveOperationException e6) {
                e6.getMessage();
            }
            f5707h = true;
        }

        @androidx.annotation.o0
        @SuppressLint({"WrongConstant"})
        private androidx.core.graphics.w1 v(int i5, boolean z5) {
            androidx.core.graphics.w1 w1Var = androidx.core.graphics.w1.f4812e;
            for (int i6 = 1; i6 <= 256; i6 <<= 1) {
                if ((i5 & i6) != 0) {
                    w1Var = androidx.core.graphics.w1.b(w1Var, w(i6, z5));
                }
            }
            return w1Var;
        }

        private androidx.core.graphics.w1 x() {
            v4 v4Var = this.f5715f;
            return v4Var != null ? v4Var.m() : androidx.core.graphics.w1.f4812e;
        }

        @androidx.annotation.q0
        private androidx.core.graphics.w1 y(@androidx.annotation.o0 View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f5707h) {
                A();
            }
            Method method = f5708i;
            if (method != null && f5709j != null && f5710k != null) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        return null;
                    }
                    Rect rect = (Rect) f5710k.get(f5711l.get(invoke));
                    if (rect != null) {
                        return androidx.core.graphics.w1.e(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e6) {
                    e6.getMessage();
                }
            }
            return null;
        }

        @Override // androidx.core.view.v4.l
        void d(@androidx.annotation.o0 View view) {
            androidx.core.graphics.w1 y5 = y(view);
            if (y5 == null) {
                y5 = androidx.core.graphics.w1.f4812e;
            }
            s(y5);
        }

        @Override // androidx.core.view.v4.l
        void e(@androidx.annotation.o0 v4 v4Var) {
            v4Var.H(this.f5715f);
            v4Var.G(this.f5716g);
        }

        @Override // androidx.core.view.v4.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f5716g, ((g) obj).f5716g);
            }
            return false;
        }

        @Override // androidx.core.view.v4.l
        @androidx.annotation.o0
        public androidx.core.graphics.w1 g(int i5) {
            return v(i5, false);
        }

        @Override // androidx.core.view.v4.l
        @androidx.annotation.o0
        public androidx.core.graphics.w1 h(int i5) {
            return v(i5, true);
        }

        @Override // androidx.core.view.v4.l
        @androidx.annotation.o0
        final androidx.core.graphics.w1 l() {
            if (this.f5714e == null) {
                this.f5714e = androidx.core.graphics.w1.d(this.f5712c.getSystemWindowInsetLeft(), this.f5712c.getSystemWindowInsetTop(), this.f5712c.getSystemWindowInsetRight(), this.f5712c.getSystemWindowInsetBottom());
            }
            return this.f5714e;
        }

        @Override // androidx.core.view.v4.l
        @androidx.annotation.o0
        v4 n(int i5, int i6, int i7, int i8) {
            b bVar = new b(v4.K(this.f5712c));
            bVar.h(v4.z(l(), i5, i6, i7, i8));
            bVar.f(v4.z(j(), i5, i6, i7, i8));
            return bVar.a();
        }

        @Override // androidx.core.view.v4.l
        boolean p() {
            return this.f5712c.isRound();
        }

        @Override // androidx.core.view.v4.l
        @SuppressLint({"WrongConstant"})
        boolean q(int i5) {
            for (int i6 = 1; i6 <= 256; i6 <<= 1) {
                if ((i5 & i6) != 0 && !z(i6)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.v4.l
        public void r(androidx.core.graphics.w1[] w1VarArr) {
            this.f5713d = w1VarArr;
        }

        @Override // androidx.core.view.v4.l
        void s(@androidx.annotation.o0 androidx.core.graphics.w1 w1Var) {
            this.f5716g = w1Var;
        }

        @Override // androidx.core.view.v4.l
        void t(@androidx.annotation.q0 v4 v4Var) {
            this.f5715f = v4Var;
        }

        @androidx.annotation.o0
        protected androidx.core.graphics.w1 w(int i5, boolean z5) {
            androidx.core.graphics.w1 m5;
            int i6;
            if (i5 == 1) {
                return z5 ? androidx.core.graphics.w1.d(0, Math.max(x().f4814b, l().f4814b), 0, 0) : androidx.core.graphics.w1.d(0, l().f4814b, 0, 0);
            }
            if (i5 == 2) {
                if (z5) {
                    androidx.core.graphics.w1 x5 = x();
                    androidx.core.graphics.w1 j5 = j();
                    return androidx.core.graphics.w1.d(Math.max(x5.f4813a, j5.f4813a), 0, Math.max(x5.f4815c, j5.f4815c), Math.max(x5.f4816d, j5.f4816d));
                }
                androidx.core.graphics.w1 l5 = l();
                v4 v4Var = this.f5715f;
                m5 = v4Var != null ? v4Var.m() : null;
                int i7 = l5.f4816d;
                if (m5 != null) {
                    i7 = Math.min(i7, m5.f4816d);
                }
                return androidx.core.graphics.w1.d(l5.f4813a, 0, l5.f4815c, i7);
            }
            if (i5 != 8) {
                if (i5 == 16) {
                    return k();
                }
                if (i5 == 32) {
                    return i();
                }
                if (i5 == 64) {
                    return m();
                }
                if (i5 != 128) {
                    return androidx.core.graphics.w1.f4812e;
                }
                v4 v4Var2 = this.f5715f;
                w e6 = v4Var2 != null ? v4Var2.e() : f();
                return e6 != null ? androidx.core.graphics.w1.d(e6.d(), e6.f(), e6.e(), e6.c()) : androidx.core.graphics.w1.f4812e;
            }
            androidx.core.graphics.w1[] w1VarArr = this.f5713d;
            m5 = w1VarArr != null ? w1VarArr[m.e(8)] : null;
            if (m5 != null) {
                return m5;
            }
            androidx.core.graphics.w1 l6 = l();
            androidx.core.graphics.w1 x6 = x();
            int i8 = l6.f4816d;
            if (i8 > x6.f4816d) {
                return androidx.core.graphics.w1.d(0, 0, 0, i8);
            }
            androidx.core.graphics.w1 w1Var = this.f5716g;
            return (w1Var == null || w1Var.equals(androidx.core.graphics.w1.f4812e) || (i6 = this.f5716g.f4816d) <= x6.f4816d) ? androidx.core.graphics.w1.f4812e : androidx.core.graphics.w1.d(0, 0, 0, i6);
        }

        protected boolean z(int i5) {
            if (i5 != 1 && i5 != 2) {
                if (i5 == 4) {
                    return false;
                }
                if (i5 != 8 && i5 != 128) {
                    return true;
                }
            }
            return !w(i5, false).equals(androidx.core.graphics.w1.f4812e);
        }

        g(@androidx.annotation.o0 v4 v4Var, @androidx.annotation.o0 g gVar) {
            this(v4Var, new WindowInsets(gVar.f5712c));
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    @androidx.annotation.x0(29)
    /* loaded from: classes4.dex */
    private static class j extends i {

        /* renamed from: n, reason: collision with root package name */
        private androidx.core.graphics.w1 f5718n;

        /* renamed from: o, reason: collision with root package name */
        private androidx.core.graphics.w1 f5719o;

        /* renamed from: p, reason: collision with root package name */
        private androidx.core.graphics.w1 f5720p;

        j(@androidx.annotation.o0 v4 v4Var, @androidx.annotation.o0 WindowInsets windowInsets) {
            super(v4Var, windowInsets);
            this.f5718n = null;
            this.f5719o = null;
            this.f5720p = null;
        }

        @Override // androidx.core.view.v4.l
        @androidx.annotation.o0
        androidx.core.graphics.w1 i() {
            Insets mandatorySystemGestureInsets;
            if (this.f5719o == null) {
                mandatorySystemGestureInsets = this.f5712c.getMandatorySystemGestureInsets();
                this.f5719o = androidx.core.graphics.w1.g(mandatorySystemGestureInsets);
            }
            return this.f5719o;
        }

        @Override // androidx.core.view.v4.l
        @androidx.annotation.o0
        androidx.core.graphics.w1 k() {
            Insets systemGestureInsets;
            if (this.f5718n == null) {
                systemGestureInsets = this.f5712c.getSystemGestureInsets();
                this.f5718n = androidx.core.graphics.w1.g(systemGestureInsets);
            }
            return this.f5718n;
        }

        @Override // androidx.core.view.v4.l
        @androidx.annotation.o0
        androidx.core.graphics.w1 m() {
            Insets tappableElementInsets;
            if (this.f5720p == null) {
                tappableElementInsets = this.f5712c.getTappableElementInsets();
                this.f5720p = androidx.core.graphics.w1.g(tappableElementInsets);
            }
            return this.f5720p;
        }

        @Override // androidx.core.view.v4.g, androidx.core.view.v4.l
        @androidx.annotation.o0
        v4 n(int i5, int i6, int i7, int i8) {
            WindowInsets inset;
            inset = this.f5712c.inset(i5, i6, i7, i8);
            return v4.K(inset);
        }

        @Override // androidx.core.view.v4.h, androidx.core.view.v4.l
        public void u(@androidx.annotation.q0 androidx.core.graphics.w1 w1Var) {
        }

        j(@androidx.annotation.o0 v4 v4Var, @androidx.annotation.o0 j jVar) {
            super(v4Var, jVar);
            this.f5718n = null;
            this.f5719o = null;
            this.f5720p = null;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final f f5697a;

        public b() {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 30) {
                this.f5697a = new e();
            } else if (i5 >= 29) {
                this.f5697a = new d();
            } else {
                this.f5697a = new c();
            }
        }

        @androidx.annotation.o0
        public v4 a() {
            return this.f5697a.b();
        }

        @androidx.annotation.o0
        public b b(@androidx.annotation.q0 w wVar) {
            this.f5697a.c(wVar);
            return this;
        }

        @androidx.annotation.o0
        public b c(int i5, @androidx.annotation.o0 androidx.core.graphics.w1 w1Var) {
            this.f5697a.d(i5, w1Var);
            return this;
        }

        @androidx.annotation.o0
        public b d(int i5, @androidx.annotation.o0 androidx.core.graphics.w1 w1Var) {
            this.f5697a.e(i5, w1Var);
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public b e(@androidx.annotation.o0 androidx.core.graphics.w1 w1Var) {
            this.f5697a.f(w1Var);
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public b f(@androidx.annotation.o0 androidx.core.graphics.w1 w1Var) {
            this.f5697a.g(w1Var);
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public b g(@androidx.annotation.o0 androidx.core.graphics.w1 w1Var) {
            this.f5697a.h(w1Var);
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public b h(@androidx.annotation.o0 androidx.core.graphics.w1 w1Var) {
            this.f5697a.i(w1Var);
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public b i(@androidx.annotation.o0 androidx.core.graphics.w1 w1Var) {
            this.f5697a.j(w1Var);
            return this;
        }

        @androidx.annotation.o0
        public b j(int i5, boolean z5) {
            this.f5697a.k(i5, z5);
            return this;
        }

        public b(@androidx.annotation.o0 v4 v4Var) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 30) {
                this.f5697a = new e(v4Var);
            } else if (i5 >= 29) {
                this.f5697a = new d(v4Var);
            } else {
                this.f5697a = new c(v4Var);
            }
        }
    }

    public v4(@androidx.annotation.q0 v4 v4Var) {
        if (v4Var != null) {
            l lVar = v4Var.f5692a;
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 30 && (lVar instanceof k)) {
                this.f5692a = new k(this, (k) lVar);
            } else if (i5 >= 29 && (lVar instanceof j)) {
                this.f5692a = new j(this, (j) lVar);
            } else if (i5 >= 28 && (lVar instanceof i)) {
                this.f5692a = new i(this, (i) lVar);
            } else if (lVar instanceof h) {
                this.f5692a = new h(this, (h) lVar);
            } else if (lVar instanceof g) {
                this.f5692a = new g(this, (g) lVar);
            } else {
                this.f5692a = new l(this);
            }
            lVar.e(this);
            return;
        }
        this.f5692a = new l(this);
    }
}
