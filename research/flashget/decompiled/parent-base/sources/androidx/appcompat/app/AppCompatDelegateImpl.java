package androidx.appcompat.app;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.c1;
import androidx.annotation.h1;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.appcompat.app.a;
import androidx.appcompat.view.b;
import androidx.appcompat.view.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.e1;
import androidx.appcompat.widget.t0;
import androidx.collection.a3;
import androidx.core.content.res.i;
import androidx.core.view.d1;
import androidx.core.view.i0;
import androidx.core.view.i2;
import androidx.core.view.j3;
import androidx.core.view.k2;
import androidx.core.view.x1;
import androidx.view.AbstractC1450w;
import androidx.view.InterfaceC1423e0;
import d.a;
import java.lang.Thread;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

@c1({c1.a.LIBRARY})
/* loaded from: classes.dex */
class AppCompatDelegateImpl extends androidx.appcompat.app.g implements h.a, LayoutInflater.Factory2 {

    /* renamed from: p3, reason: collision with root package name */
    private static boolean f748p3;
    final androidx.appcompat.app.d A;
    ActionBar B;
    MenuInflater C;
    private CharSequence D;
    private androidx.appcompat.widget.u E;
    private j F;
    private w G;
    androidx.appcompat.view.b H;
    ActionBarContextView I;
    PopupWindow J;
    Runnable K;
    i2 L;
    boolean L2;
    private boolean M;
    private boolean M2;
    private boolean N;
    private PanelFeatureState[] N2;
    ViewGroup O;
    private PanelFeatureState O2;
    private TextView P;
    private boolean P2;
    private View Q;
    boolean Q1;
    private boolean Q2;
    private boolean R;
    private boolean R2;
    boolean S2;
    private Configuration T2;
    private int U2;
    boolean V1;
    private int V2;
    private int W2;
    private boolean X;
    private boolean X2;
    boolean Y;
    private s Y2;
    boolean Z;
    private s Z2;

    /* renamed from: a3, reason: collision with root package name */
    boolean f750a3;

    /* renamed from: b3, reason: collision with root package name */
    int f751b3;

    /* renamed from: c3, reason: collision with root package name */
    private final Runnable f752c3;

    /* renamed from: d3, reason: collision with root package name */
    private boolean f753d3;

    /* renamed from: e3, reason: collision with root package name */
    private Rect f754e3;

    /* renamed from: f3, reason: collision with root package name */
    private Rect f755f3;

    /* renamed from: g3, reason: collision with root package name */
    private androidx.appcompat.app.t f756g3;

    /* renamed from: h3, reason: collision with root package name */
    private androidx.appcompat.app.w f757h3;

    /* renamed from: i3, reason: collision with root package name */
    private OnBackInvokedDispatcher f758i3;

    /* renamed from: j3, reason: collision with root package name */
    private OnBackInvokedCallback f759j3;

    /* renamed from: w, reason: collision with root package name */
    final Object f760w;

    /* renamed from: x, reason: collision with root package name */
    final Context f761x;

    /* renamed from: y, reason: collision with root package name */
    Window f762y;

    /* renamed from: z, reason: collision with root package name */
    private q f763z;

    /* renamed from: q3, reason: collision with root package name */
    static final String f749q3 = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";

    /* renamed from: k3, reason: collision with root package name */
    private static final a3<String, Integer> f743k3 = new a3<>();

    /* renamed from: l3, reason: collision with root package name */
    private static final boolean f744l3 = false;

    /* renamed from: m3, reason: collision with root package name */
    private static final int[] f745m3 = {R.attr.windowBackground};

    /* renamed from: n3, reason: collision with root package name */
    private static final boolean f746n3 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: o3, reason: collision with root package name */
    private static final boolean f747o3 = true;

    protected static final class PanelFeatureState {

        /* renamed from: a, reason: collision with root package name */
        int f764a;

        /* renamed from: b, reason: collision with root package name */
        int f765b;

        /* renamed from: c, reason: collision with root package name */
        int f766c;

        /* renamed from: d, reason: collision with root package name */
        int f767d;

        /* renamed from: e, reason: collision with root package name */
        int f768e;

        /* renamed from: f, reason: collision with root package name */
        int f769f;

        /* renamed from: g, reason: collision with root package name */
        ViewGroup f770g;

        /* renamed from: h, reason: collision with root package name */
        View f771h;

        /* renamed from: i, reason: collision with root package name */
        View f772i;

        /* renamed from: j, reason: collision with root package name */
        androidx.appcompat.view.menu.h f773j;

        /* renamed from: k, reason: collision with root package name */
        androidx.appcompat.view.menu.f f774k;

        /* renamed from: l, reason: collision with root package name */
        Context f775l;

        /* renamed from: m, reason: collision with root package name */
        boolean f776m;

        /* renamed from: n, reason: collision with root package name */
        boolean f777n;

        /* renamed from: o, reason: collision with root package name */
        boolean f778o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f779p;

        /* renamed from: q, reason: collision with root package name */
        boolean f780q = false;

        /* renamed from: r, reason: collision with root package name */
        boolean f781r;

        /* renamed from: s, reason: collision with root package name */
        boolean f782s;

        /* renamed from: t, reason: collision with root package name */
        Bundle f783t;

        /* renamed from: u, reason: collision with root package name */
        Bundle f784u;

        @SuppressLint({"BanParcelableUsage"})
        private static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            int f785b;

            /* renamed from: c, reason: collision with root package name */
            boolean f786c;

            /* renamed from: d, reason: collision with root package name */
            Bundle f787d;

            class a implements Parcelable.ClassLoaderCreator<SavedState> {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.a(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.a(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public SavedState[] newArray(int i4) {
                    return new SavedState[i4];
                }
            }

            SavedState() {
            }

            static SavedState a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f785b = parcel.readInt();
                boolean z4 = parcel.readInt() == 1;
                savedState.f786c = z4;
                if (z4) {
                    savedState.f787d = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i4) {
                parcel.writeInt(this.f785b);
                parcel.writeInt(this.f786c ? 1 : 0);
                if (this.f786c) {
                    parcel.writeBundle(this.f787d);
                }
            }
        }

        PanelFeatureState(int i4) {
            this.f764a = i4;
        }

        void a() {
            Bundle bundle;
            androidx.appcompat.view.menu.h hVar = this.f773j;
            if (hVar == null || (bundle = this.f783t) == null) {
                return;
            }
            hVar.U(bundle);
            this.f783t = null;
        }

        public void b() {
            androidx.appcompat.view.menu.h hVar = this.f773j;
            if (hVar != null) {
                hVar.S(this.f774k);
            }
            this.f774k = null;
        }

        androidx.appcompat.view.menu.p c(o.a aVar) {
            if (this.f773j == null) {
                return null;
            }
            if (this.f774k == null) {
                androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(this.f775l, a.j.f73315q);
                this.f774k = fVar;
                fVar.f(aVar);
                this.f773j.b(this.f774k);
            }
            return this.f774k.i(this.f770g);
        }

        public boolean d() {
            if (this.f771h == null) {
                return false;
            }
            return this.f772i != null || this.f774k.b().getCount() > 0;
        }

        void e(Parcelable parcelable) {
            SavedState savedState = (SavedState) parcelable;
            this.f764a = savedState.f785b;
            this.f782s = savedState.f786c;
            this.f783t = savedState.f787d;
            this.f771h = null;
            this.f770g = null;
        }

        Parcelable f() {
            SavedState savedState = new SavedState();
            savedState.f785b = this.f764a;
            savedState.f786c = this.f778o;
            if (this.f773j != null) {
                Bundle bundle = new Bundle();
                savedState.f787d = bundle;
                this.f773j.W(bundle);
            }
            return savedState;
        }

        void g(androidx.appcompat.view.menu.h hVar) {
            androidx.appcompat.view.menu.f fVar;
            androidx.appcompat.view.menu.h hVar2 = this.f773j;
            if (hVar == hVar2) {
                return;
            }
            if (hVar2 != null) {
                hVar2.S(this.f774k);
            }
            this.f773j = hVar;
            if (hVar == null || (fVar = this.f774k) == null) {
                return;
            }
            hVar.b(fVar);
        }

        void h(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(a.b.f72956c, typedValue, true);
            int i4 = typedValue.resourceId;
            if (i4 != 0) {
                newTheme.applyStyle(i4, true);
            }
            newTheme.resolveAttribute(a.b.f73066x2, typedValue, true);
            int i5 = typedValue.resourceId;
            if (i5 != 0) {
                newTheme.applyStyle(i5, true);
            } else {
                newTheme.applyStyle(a.l.P3, true);
            }
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f775l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(a.m.S0);
            this.f765b = obtainStyledAttributes.getResourceId(a.m.B2, 0);
            this.f769f = obtainStyledAttributes.getResourceId(a.m.U0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f788a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f788a = uncaughtExceptionHandler;
        }

        private boolean a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(@o0 Thread thread, @o0 Throwable th) {
            if (!a(th)) {
                this.f788a.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f788a.uncaughtException(thread, notFoundException);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f751b3 & 1) != 0) {
                appCompatDelegateImpl.B0(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.f751b3 & 4096) != 0) {
                appCompatDelegateImpl2.B0(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.f750a3 = false;
            appCompatDelegateImpl3.f751b3 = 0;
        }
    }

    class c implements d1 {
        c() {
        }

        @Override // androidx.core.view.d1
        public j3 a(View view, j3 j3Var) {
            int r4 = j3Var.r();
            int y12 = AppCompatDelegateImpl.this.y1(j3Var, null);
            if (r4 != y12) {
                j3Var = j3Var.D(j3Var.p(), y12, j3Var.q(), j3Var.o());
            }
            return x1.k1(view, j3Var);
        }
    }

    class d implements d0.a {
        d() {
        }

        @Override // androidx.appcompat.widget.d0.a
        public void a(Rect rect) {
            rect.top = AppCompatDelegateImpl.this.y1(null, rect);
        }
    }

    class e implements ContentFrameLayout.a {
        e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            AppCompatDelegateImpl.this.z0();
        }
    }

    class f implements Runnable {

        class a extends k2 {
            a() {
            }

            @Override // androidx.core.view.k2, androidx.core.view.j2
            public void b(View view) {
                AppCompatDelegateImpl.this.I.setAlpha(1.0f);
                AppCompatDelegateImpl.this.L.u(null);
                AppCompatDelegateImpl.this.L = null;
            }

            @Override // androidx.core.view.k2, androidx.core.view.j2
            public void c(View view) {
                AppCompatDelegateImpl.this.I.setVisibility(0);
            }
        }

        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.J.showAtLocation(appCompatDelegateImpl.I, 55, 0, 0);
            AppCompatDelegateImpl.this.C0();
            if (!AppCompatDelegateImpl.this.o1()) {
                AppCompatDelegateImpl.this.I.setAlpha(1.0f);
                AppCompatDelegateImpl.this.I.setVisibility(0);
            } else {
                AppCompatDelegateImpl.this.I.setAlpha(0.0f);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.L = x1.g(appCompatDelegateImpl2.I).b(1.0f);
                AppCompatDelegateImpl.this.L.u(new a());
            }
        }
    }

    class g extends k2 {
        g() {
        }

        @Override // androidx.core.view.k2, androidx.core.view.j2
        public void b(View view) {
            AppCompatDelegateImpl.this.I.setAlpha(1.0f);
            AppCompatDelegateImpl.this.L.u(null);
            AppCompatDelegateImpl.this.L = null;
        }

        @Override // androidx.core.view.k2, androidx.core.view.j2
        public void c(View view) {
            AppCompatDelegateImpl.this.I.setVisibility(0);
            if (AppCompatDelegateImpl.this.I.getParent() instanceof View) {
                x1.B1((View) AppCompatDelegateImpl.this.I.getParent());
            }
        }
    }

    private class h implements a.b {
        h() {
        }

        @Override // androidx.appcompat.app.a.b
        public void a(Drawable drawable, int i4) {
            ActionBar C = AppCompatDelegateImpl.this.C();
            if (C != null) {
                C.l0(drawable);
                C.i0(i4);
            }
        }

        @Override // androidx.appcompat.app.a.b
        public Drawable b() {
            t0 F = t0.F(d(), null, new int[]{a.b.E1});
            Drawable h4 = F.h(0);
            F.I();
            return h4;
        }

        @Override // androidx.appcompat.app.a.b
        public void c(int i4) {
            ActionBar C = AppCompatDelegateImpl.this.C();
            if (C != null) {
                C.i0(i4);
            }
        }

        @Override // androidx.appcompat.app.a.b
        public Context d() {
            return AppCompatDelegateImpl.this.H0();
        }

        @Override // androidx.appcompat.app.a.b
        public boolean e() {
            ActionBar C = AppCompatDelegateImpl.this.C();
            return (C == null || (C.p() & 4) == 0) ? false : true;
        }
    }

    interface i {
        boolean a(int i4);

        @q0
        View onCreatePanelView(int i4);
    }

    private final class j implements o.a {
        j() {
        }

        @Override // androidx.appcompat.view.menu.o.a
        public void d(@o0 androidx.appcompat.view.menu.h hVar, boolean z4) {
            AppCompatDelegateImpl.this.t0(hVar);
        }

        @Override // androidx.appcompat.view.menu.o.a
        public boolean e(@o0 androidx.appcompat.view.menu.h hVar) {
            Window.Callback callback = AppCompatDelegateImpl.this.f762y.getCallback();
            if (callback == null) {
                return true;
            }
            callback.onMenuOpened(108, hVar);
            return true;
        }
    }

    class k implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private b.a f798a;

        class a extends k2 {
            a() {
            }

            @Override // androidx.core.view.k2, androidx.core.view.j2
            public void b(View view) {
                AppCompatDelegateImpl.this.I.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.J;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.I.getParent() instanceof View) {
                    x1.B1((View) AppCompatDelegateImpl.this.I.getParent());
                }
                AppCompatDelegateImpl.this.I.y();
                AppCompatDelegateImpl.this.L.u(null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.L = null;
                x1.B1(appCompatDelegateImpl2.O);
            }
        }

        public k(b.a aVar) {
            this.f798a = aVar;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(androidx.appcompat.view.b bVar) {
            this.f798a.a(bVar);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.J != null) {
                appCompatDelegateImpl.f762y.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.K);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.I != null) {
                appCompatDelegateImpl2.C0();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.L = x1.g(appCompatDelegateImpl3.I).b(0.0f);
                AppCompatDelegateImpl.this.L.u(new a());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            androidx.appcompat.app.d dVar = appCompatDelegateImpl4.A;
            if (dVar != null) {
                dVar.onSupportActionModeFinished(appCompatDelegateImpl4.H);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.H = null;
            x1.B1(appCompatDelegateImpl5.O);
            AppCompatDelegateImpl.this.w1();
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f798a.b(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return this.f798a.c(bVar, menuItem);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(androidx.appcompat.view.b bVar, Menu menu) {
            x1.B1(AppCompatDelegateImpl.this.O);
            return this.f798a.d(bVar, menu);
        }
    }

    @x0(17)
    static class l {
        private l() {
        }

        static Context a(@o0 Context context, @o0 Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        static void b(@o0 Configuration configuration, @o0 Configuration configuration2, @o0 Configuration configuration3) {
            int i4 = configuration.densityDpi;
            int i5 = configuration2.densityDpi;
            if (i4 != i5) {
                configuration3.densityDpi = i5;
            }
        }

        @androidx.annotation.u
        static void c(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        @androidx.annotation.u
        static void d(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    @x0(21)
    static class m {
        private m() {
        }

        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        @androidx.annotation.u
        static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    @x0(24)
    static class n {
        private n() {
        }

        @androidx.annotation.u
        static void a(@o0 Configuration configuration, @o0 Configuration configuration2, @o0 Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        @androidx.annotation.u
        static androidx.core.os.p b(Configuration configuration) {
            return androidx.core.os.p.c(configuration.getLocales().toLanguageTags());
        }

        @androidx.annotation.u
        public static void c(androidx.core.os.p pVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(pVar.m()));
        }

        @androidx.annotation.u
        static void d(Configuration configuration, androidx.core.os.p pVar) {
            configuration.setLocales(LocaleList.forLanguageTags(pVar.m()));
        }
    }

    @x0(26)
    static class o {
        private o() {
        }

        static void a(@o0 Configuration configuration, @o0 Configuration configuration2, @o0 Configuration configuration3) {
            int i4;
            int i5;
            int i6;
            int i7;
            int i10;
            int i11;
            int i12;
            int i13;
            i4 = configuration.colorMode;
            int i14 = i4 & 3;
            i5 = configuration2.colorMode;
            if (i14 != (i5 & 3)) {
                i12 = configuration3.colorMode;
                i13 = configuration2.colorMode;
                configuration3.colorMode = i12 | (i13 & 3);
            }
            i6 = configuration.colorMode;
            int i15 = i6 & 12;
            i7 = configuration2.colorMode;
            if (i15 != (i7 & 12)) {
                i10 = configuration3.colorMode;
                i11 = configuration2.colorMode;
                configuration3.colorMode = i10 | (i11 & 12);
            }
        }
    }

    @x0(33)
    static class p {
        private p() {
        }

        @androidx.annotation.u
        static OnBackInvokedDispatcher a(Activity activity) {
            OnBackInvokedDispatcher onBackInvokedDispatcher;
            onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            return onBackInvokedDispatcher;
        }

        @androidx.annotation.u
        static OnBackInvokedCallback b(Object obj, final AppCompatDelegateImpl appCompatDelegateImpl) {
            Objects.requireNonNull(appCompatDelegateImpl);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.p
                public final void onBackInvoked() {
                    AppCompatDelegateImpl.this.X0();
                }
            };
            androidx.appcompat.app.l.a(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        @androidx.annotation.u
        static void c(Object obj, Object obj2) {
            androidx.appcompat.app.l.a(obj).unregisterOnBackInvokedCallback(androidx.appcompat.app.k.a(obj2));
        }
    }

    class q extends androidx.appcompat.view.j {

        /* renamed from: c, reason: collision with root package name */
        private i f801c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f802d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f803e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f804f;

        q(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f803e = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f803e = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.f802d = true;
                callback.onContentChanged();
            } finally {
                this.f802d = false;
            }
        }

        public void d(Window.Callback callback, int i4, Menu menu) {
            try {
                this.f804f = true;
                callback.onPanelClosed(i4, menu);
            } finally {
                this.f804f = false;
            }
        }

        @Override // androidx.appcompat.view.j, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f803e ? a().dispatchKeyEvent(keyEvent) : AppCompatDelegateImpl.this.A0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.j, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.a1(keyEvent.getKeyCode(), keyEvent);
        }

        void e(@q0 i iVar) {
            this.f801c = iVar;
        }

        final ActionMode f(ActionMode.Callback callback) {
            f.a aVar = new f.a(AppCompatDelegateImpl.this.f761x, callback);
            androidx.appcompat.view.b k02 = AppCompatDelegateImpl.this.k0(aVar);
            if (k02 != null) {
                return aVar.e(k02);
            }
            return null;
        }

        @Override // androidx.appcompat.view.j, android.view.Window.Callback
        public void onContentChanged() {
            if (this.f802d) {
                a().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.j, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i4, Menu menu) {
            if (i4 != 0 || (menu instanceof androidx.appcompat.view.menu.h)) {
                return super.onCreatePanelMenu(i4, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.j, android.view.Window.Callback
        public View onCreatePanelView(int i4) {
            View onCreatePanelView;
            i iVar = this.f801c;
            return (iVar == null || (onCreatePanelView = iVar.onCreatePanelView(i4)) == null) ? super.onCreatePanelView(i4) : onCreatePanelView;
        }

        @Override // androidx.appcompat.view.j, android.view.Window.Callback
        public boolean onMenuOpened(int i4, Menu menu) {
            super.onMenuOpened(i4, menu);
            AppCompatDelegateImpl.this.d1(i4);
            return true;
        }

        @Override // androidx.appcompat.view.j, android.view.Window.Callback
        public void onPanelClosed(int i4, Menu menu) {
            if (this.f804f) {
                a().onPanelClosed(i4, menu);
            } else {
                super.onPanelClosed(i4, menu);
                AppCompatDelegateImpl.this.e1(i4);
            }
        }

        @Override // androidx.appcompat.view.j, android.view.Window.Callback
        public boolean onPreparePanel(int i4, View view, Menu menu) {
            androidx.appcompat.view.menu.h hVar = menu instanceof androidx.appcompat.view.menu.h ? (androidx.appcompat.view.menu.h) menu : null;
            if (i4 == 0 && hVar == null) {
                return false;
            }
            if (hVar != null) {
                hVar.i0(true);
            }
            i iVar = this.f801c;
            boolean z4 = iVar != null && iVar.a(i4);
            if (!z4) {
                z4 = super.onPreparePanel(i4, view, menu);
            }
            if (hVar != null) {
                hVar.i0(false);
            }
            return z4;
        }

        @Override // androidx.appcompat.view.j, android.view.Window.Callback
        @x0(24)
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i4) {
            androidx.appcompat.view.menu.h hVar;
            PanelFeatureState N0 = AppCompatDelegateImpl.this.N0(0, true);
            if (N0 == null || (hVar = N0.f773j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i4);
            } else {
                super.onProvideKeyboardShortcuts(list, hVar, i4);
            }
        }

        @Override // androidx.appcompat.view.j, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // androidx.appcompat.view.j, android.view.Window.Callback
        @x0(23)
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i4) {
            return (AppCompatDelegateImpl.this.I() && i4 == 0) ? f(callback) : super.onWindowStartingActionMode(callback, i4);
        }
    }

    private class r extends s {

        /* renamed from: c, reason: collision with root package name */
        private final PowerManager f806c;

        r(@o0 Context context) {
            super();
            this.f806c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.s
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.s
        public int c() {
            return this.f806c.isPowerSaveMode() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.s
        public void e() {
            AppCompatDelegateImpl.this.h();
        }
    }

    @c1({c1.a.LIBRARY})
    @m1
    abstract class s {

        /* renamed from: a, reason: collision with root package name */
        private BroadcastReceiver f808a;

        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                s.this.e();
            }
        }

        s() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f808a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f761x.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f808a = null;
            }
        }

        @q0
        abstract IntentFilter b();

        abstract int c();

        boolean d() {
            return this.f808a != null;
        }

        abstract void e();

        void f() {
            a();
            IntentFilter b5 = b();
            if (b5 == null || b5.countActions() == 0) {
                return;
            }
            if (this.f808a == null) {
                this.f808a = new a();
            }
            AppCompatDelegateImpl.this.f761x.registerReceiver(this.f808a, b5);
        }
    }

    private class t extends s {

        /* renamed from: c, reason: collision with root package name */
        private final d0 f811c;

        t(@o0 d0 d0Var) {
            super();
            this.f811c = d0Var;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.s
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.s
        public int c() {
            return this.f811c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.s
        public void e() {
            AppCompatDelegateImpl.this.h();
        }
    }

    @x0(17)
    private static class u {
        private u() {
        }

        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    private class v extends ContentFrameLayout {
        public v(Context context) {
            super(context, null);
        }

        private boolean j(int i4, int i5) {
            return i4 < -5 || i5 < -5 || i4 > getWidth() + 5 || i5 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.A0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !j((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.v0(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i4) {
            setBackgroundDrawable(e.a.b(getContext(), i4));
        }
    }

    private final class w implements o.a {
        w() {
        }

        @Override // androidx.appcompat.view.menu.o.a
        public void d(@o0 androidx.appcompat.view.menu.h hVar, boolean z4) {
            androidx.appcompat.view.menu.h G = hVar.G();
            boolean z5 = G != hVar;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z5) {
                hVar = G;
            }
            PanelFeatureState F0 = appCompatDelegateImpl.F0(hVar);
            if (F0 != null) {
                if (!z5) {
                    AppCompatDelegateImpl.this.w0(F0, z4);
                } else {
                    AppCompatDelegateImpl.this.s0(F0.f764a, F0, G);
                    AppCompatDelegateImpl.this.w0(F0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.o.a
        public boolean e(@o0 androidx.appcompat.view.menu.h hVar) {
            Window.Callback callback;
            if (hVar != hVar.G()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.Y || (callback = appCompatDelegateImpl.f762y.getCallback()) == null || AppCompatDelegateImpl.this.S2) {
                return true;
            }
            callback.onMenuOpened(108, hVar);
            return true;
        }
    }

    AppCompatDelegateImpl(Activity activity, androidx.appcompat.app.d dVar) {
        this(activity, null, dVar, activity);
    }

    private void D0() {
        if (this.N) {
            return;
        }
        this.O = y0();
        CharSequence P0 = P0();
        if (!TextUtils.isEmpty(P0)) {
            androidx.appcompat.widget.u uVar = this.E;
            if (uVar != null) {
                uVar.g(P0);
            } else {
                ActionBar actionBar = this.B;
                if (actionBar != null) {
                    actionBar.B0(P0);
                } else {
                    TextView textView = this.P;
                    if (textView != null) {
                        textView.setText(P0);
                    }
                }
            }
        }
        o0();
        f1(this.O);
        this.N = true;
        PanelFeatureState N0 = N0(0, false);
        if (this.S2) {
            return;
        }
        if (N0 == null || N0.f773j == null) {
            V0(108);
        }
    }

    private void E0() {
        if (this.f762y == null) {
            Object obj = this.f760w;
            if (obj instanceof Activity) {
                p0(((Activity) obj).getWindow());
            }
        }
        if (this.f762y == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    @o0
    private static Configuration G0(@o0 Configuration configuration, @q0 Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f4 = configuration.fontScale;
            float f5 = configuration2.fontScale;
            if (f4 != f5) {
                configuration3.fontScale = f5;
            }
            int i4 = configuration.mcc;
            int i5 = configuration2.mcc;
            if (i4 != i5) {
                configuration3.mcc = i5;
            }
            int i6 = configuration.mnc;
            int i7 = configuration2.mnc;
            if (i6 != i7) {
                configuration3.mnc = i7;
            }
            int i10 = Build.VERSION.SDK_INT;
            n.a(configuration, configuration2, configuration3);
            int i11 = configuration.touchscreen;
            int i12 = configuration2.touchscreen;
            if (i11 != i12) {
                configuration3.touchscreen = i12;
            }
            int i13 = configuration.keyboard;
            int i14 = configuration2.keyboard;
            if (i13 != i14) {
                configuration3.keyboard = i14;
            }
            int i15 = configuration.keyboardHidden;
            int i16 = configuration2.keyboardHidden;
            if (i15 != i16) {
                configuration3.keyboardHidden = i16;
            }
            int i17 = configuration.navigation;
            int i18 = configuration2.navigation;
            if (i17 != i18) {
                configuration3.navigation = i18;
            }
            int i19 = configuration.navigationHidden;
            int i20 = configuration2.navigationHidden;
            if (i19 != i20) {
                configuration3.navigationHidden = i20;
            }
            int i21 = configuration.orientation;
            int i22 = configuration2.orientation;
            if (i21 != i22) {
                configuration3.orientation = i22;
            }
            int i23 = configuration.screenLayout & 15;
            int i24 = configuration2.screenLayout;
            if (i23 != (i24 & 15)) {
                configuration3.screenLayout |= i24 & 15;
            }
            int i25 = configuration.screenLayout & 192;
            int i26 = configuration2.screenLayout;
            if (i25 != (i26 & 192)) {
                configuration3.screenLayout |= i26 & 192;
            }
            int i27 = configuration.screenLayout & 48;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 48)) {
                configuration3.screenLayout |= i28 & 48;
            }
            int i29 = configuration.screenLayout & 768;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & 768)) {
                configuration3.screenLayout |= i30 & 768;
            }
            if (i10 >= 26) {
                o.a(configuration, configuration2, configuration3);
            }
            int i31 = configuration.uiMode & 15;
            int i32 = configuration2.uiMode;
            if (i31 != (i32 & 15)) {
                configuration3.uiMode |= i32 & 15;
            }
            int i33 = configuration.uiMode & 48;
            int i34 = configuration2.uiMode;
            if (i33 != (i34 & 48)) {
                configuration3.uiMode |= i34 & 48;
            }
            int i35 = configuration.screenWidthDp;
            int i36 = configuration2.screenWidthDp;
            if (i35 != i36) {
                configuration3.screenWidthDp = i36;
            }
            int i37 = configuration.screenHeightDp;
            int i38 = configuration2.screenHeightDp;
            if (i37 != i38) {
                configuration3.screenHeightDp = i38;
            }
            int i39 = configuration.smallestScreenWidthDp;
            int i40 = configuration2.smallestScreenWidthDp;
            if (i39 != i40) {
                configuration3.smallestScreenWidthDp = i40;
            }
            l.b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    private int I0(Context context) {
        if (!this.X2 && (this.f760w instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f760w.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.W2 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                this.W2 = 0;
            }
        }
        this.X2 = true;
        return this.W2;
    }

    private s J0(@o0 Context context) {
        if (this.Z2 == null) {
            this.Z2 = new r(context);
        }
        return this.Z2;
    }

    private s L0(@o0 Context context) {
        if (this.Y2 == null) {
            this.Y2 = new t(d0.a(context));
        }
        return this.Y2;
    }

    private void R0() {
        D0();
        if (this.Y && this.B == null) {
            Object obj = this.f760w;
            if (obj instanceof Activity) {
                this.B = new e0((Activity) this.f760w, this.Z);
            } else if (obj instanceof Dialog) {
                this.B = new e0((Dialog) this.f760w);
            }
            ActionBar actionBar = this.B;
            if (actionBar != null) {
                actionBar.X(this.f753d3);
            }
        }
    }

    private boolean S0(PanelFeatureState panelFeatureState) {
        View view = panelFeatureState.f772i;
        if (view != null) {
            panelFeatureState.f771h = view;
            return true;
        }
        if (panelFeatureState.f773j == null) {
            return false;
        }
        if (this.G == null) {
            this.G = new w();
        }
        View view2 = (View) panelFeatureState.c(this.G);
        panelFeatureState.f771h = view2;
        return view2 != null;
    }

    private boolean T0(PanelFeatureState panelFeatureState) {
        panelFeatureState.h(H0());
        panelFeatureState.f770g = new v(panelFeatureState.f775l);
        panelFeatureState.f766c = 81;
        return true;
    }

    private boolean U0(PanelFeatureState panelFeatureState) {
        Resources.Theme theme;
        Context context = this.f761x;
        int i4 = panelFeatureState.f764a;
        if ((i4 == 0 || i4 == 108) && this.E != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(a.b.f72993j, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(a.b.f72998k, typedValue, true);
            } else {
                theme2.resolveAttribute(a.b.f72998k, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
                dVar.getTheme().setTo(theme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.h hVar = new androidx.appcompat.view.menu.h(context);
        hVar.X(this);
        panelFeatureState.g(hVar);
        return true;
    }

    private void V0(int i4) {
        this.f751b3 = (1 << i4) | this.f751b3;
        if (this.f750a3) {
            return;
        }
        x1.v1(this.f762y.getDecorView(), this.f752c3);
        this.f750a3 = true;
    }

    private boolean Z0(int i4, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        PanelFeatureState N0 = N0(i4, true);
        if (N0.f778o) {
            return false;
        }
        return j1(N0, keyEvent);
    }

    private boolean c1(int i4, KeyEvent keyEvent) {
        boolean z4;
        AudioManager audioManager;
        androidx.appcompat.widget.u uVar;
        if (this.H != null) {
            return false;
        }
        boolean z5 = true;
        PanelFeatureState N0 = N0(i4, true);
        if (i4 != 0 || (uVar = this.E) == null || !uVar.c() || ViewConfiguration.get(this.f761x).hasPermanentMenuKey()) {
            boolean z6 = N0.f778o;
            if (z6 || N0.f777n) {
                w0(N0, true);
                z5 = z6;
            } else {
                if (N0.f776m) {
                    if (N0.f781r) {
                        N0.f776m = false;
                        z4 = j1(N0, keyEvent);
                    } else {
                        z4 = true;
                    }
                    if (z4) {
                        g1(N0, keyEvent);
                    }
                }
                z5 = false;
            }
        } else if (this.E.h()) {
            z5 = this.E.d();
        } else {
            if (!this.S2 && j1(N0, keyEvent)) {
                z5 = this.E.e();
            }
            z5 = false;
        }
        if (z5 && (audioManager = (AudioManager) this.f761x.getApplicationContext().getSystemService("audio")) != null) {
            audioManager.playSoundEffect(0);
        }
        return z5;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void g1(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.g1(androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState, android.view.KeyEvent):void");
    }

    private boolean i1(PanelFeatureState panelFeatureState, int i4, KeyEvent keyEvent, int i5) {
        androidx.appcompat.view.menu.h hVar;
        boolean z4 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f776m || j1(panelFeatureState, keyEvent)) && (hVar = panelFeatureState.f773j) != null) {
            z4 = hVar.performShortcut(i4, keyEvent, i5);
        }
        if (z4 && (i5 & 1) == 0 && this.E == null) {
            w0(panelFeatureState, true);
        }
        return z4;
    }

    private boolean j1(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        androidx.appcompat.widget.u uVar;
        androidx.appcompat.widget.u uVar2;
        androidx.appcompat.widget.u uVar3;
        if (this.S2) {
            return false;
        }
        if (panelFeatureState.f776m) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.O2;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            w0(panelFeatureState2, false);
        }
        Window.Callback callback = this.f762y.getCallback();
        if (callback != null) {
            panelFeatureState.f772i = callback.onCreatePanelView(panelFeatureState.f764a);
        }
        int i4 = panelFeatureState.f764a;
        boolean z4 = i4 == 0 || i4 == 108;
        if (z4 && (uVar3 = this.E) != null) {
            uVar3.i();
        }
        if (panelFeatureState.f772i == null && (!z4 || !(this.B instanceof a0))) {
            androidx.appcompat.view.menu.h hVar = panelFeatureState.f773j;
            if (hVar == null || panelFeatureState.f781r) {
                if (hVar == null && (!U0(panelFeatureState) || panelFeatureState.f773j == null)) {
                    return false;
                }
                if (z4 && this.E != null) {
                    if (this.F == null) {
                        this.F = new j();
                    }
                    this.E.f(panelFeatureState.f773j, this.F);
                }
                panelFeatureState.f773j.m0();
                if (!callback.onCreatePanelMenu(panelFeatureState.f764a, panelFeatureState.f773j)) {
                    panelFeatureState.g(null);
                    if (z4 && (uVar = this.E) != null) {
                        uVar.f(null, this.F);
                    }
                    return false;
                }
                panelFeatureState.f781r = false;
            }
            panelFeatureState.f773j.m0();
            Bundle bundle = panelFeatureState.f784u;
            if (bundle != null) {
                panelFeatureState.f773j.T(bundle);
                panelFeatureState.f784u = null;
            }
            if (!callback.onPreparePanel(0, panelFeatureState.f772i, panelFeatureState.f773j)) {
                if (z4 && (uVar2 = this.E) != null) {
                    uVar2.f(null, this.F);
                }
                panelFeatureState.f773j.l0();
                return false;
            }
            boolean z5 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.f779p = z5;
            panelFeatureState.f773j.setQwertyMode(z5);
            panelFeatureState.f773j.l0();
        }
        panelFeatureState.f776m = true;
        panelFeatureState.f777n = false;
        this.O2 = panelFeatureState;
        return true;
    }

    private void k1(boolean z4) {
        androidx.appcompat.widget.u uVar = this.E;
        if (uVar == null || !uVar.c() || (ViewConfiguration.get(this.f761x).hasPermanentMenuKey() && !this.E.m())) {
            PanelFeatureState N0 = N0(0, true);
            N0.f780q = true;
            w0(N0, false);
            g1(N0, null);
            return;
        }
        Window.Callback callback = this.f762y.getCallback();
        if (this.E.h() && z4) {
            this.E.d();
            if (this.S2) {
                return;
            }
            callback.onPanelClosed(108, N0(0, true).f773j);
            return;
        }
        if (callback == null || this.S2) {
            return;
        }
        if (this.f750a3 && (this.f751b3 & 1) != 0) {
            this.f762y.getDecorView().removeCallbacks(this.f752c3);
            this.f752c3.run();
        }
        PanelFeatureState N02 = N0(0, true);
        androidx.appcompat.view.menu.h hVar = N02.f773j;
        if (hVar == null || N02.f781r || !callback.onPreparePanel(0, N02.f772i, hVar)) {
            return;
        }
        callback.onMenuOpened(108, N02.f773j);
        this.E.e();
    }

    private int l1(int i4) {
        if (i4 == 8) {
            return 108;
        }
        if (i4 == 9) {
            return 109;
        }
        return i4;
    }

    private boolean m0(boolean z4) {
        return n0(z4, true);
    }

    private boolean n0(boolean z4, boolean z5) {
        if (this.S2) {
            return false;
        }
        int r02 = r0();
        int W0 = W0(this.f761x, r02);
        androidx.core.os.p q02 = Build.VERSION.SDK_INT < 33 ? q0(this.f761x) : null;
        if (!z5 && q02 != null) {
            q02 = M0(this.f761x.getResources().getConfiguration());
        }
        boolean v12 = v1(W0, q02, z4);
        if (r02 == 0) {
            L0(this.f761x).f();
        } else {
            s sVar = this.Y2;
            if (sVar != null) {
                sVar.a();
            }
        }
        if (r02 == 3) {
            J0(this.f761x).f();
        } else {
            s sVar2 = this.Z2;
            if (sVar2 != null) {
                sVar2.a();
            }
        }
        return v12;
    }

    private void o0() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.O.findViewById(R.id.content);
        View decorView = this.f762y.getDecorView();
        contentFrameLayout.i(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f761x.obtainStyledAttributes(a.m.S0);
        obtainStyledAttributes.getValue(a.m.f73558n3, contentFrameLayout.f());
        obtainStyledAttributes.getValue(a.m.f73563o3, contentFrameLayout.g());
        int i4 = a.m.f73548l3;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.d());
        }
        int i5 = a.m.f73553m3;
        if (obtainStyledAttributes.hasValue(i5)) {
            obtainStyledAttributes.getValue(i5, contentFrameLayout.e());
        }
        int i6 = a.m.f73538j3;
        if (obtainStyledAttributes.hasValue(i6)) {
            obtainStyledAttributes.getValue(i6, contentFrameLayout.b());
        }
        int i7 = a.m.f73543k3;
        if (obtainStyledAttributes.hasValue(i7)) {
            obtainStyledAttributes.getValue(i7, contentFrameLayout.c());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void p0(@o0 Window window) {
        if (this.f762y != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof q) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        q qVar = new q(callback);
        this.f763z = qVar;
        window.setCallback(qVar);
        t0 F = t0.F(this.f761x, null, f745m3);
        Drawable i4 = F.i(0);
        if (i4 != null) {
            window.setBackgroundDrawable(i4);
        }
        F.I();
        this.f762y = window;
        if (Build.VERSION.SDK_INT < 33 || this.f758i3 != null) {
            return;
        }
        g0(null);
    }

    private boolean p1(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f762y.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || x1.R0((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private int r0() {
        int i4 = this.U2;
        return i4 != -100 ? i4 : androidx.appcompat.app.g.v();
    }

    private void s1() {
        if (this.N) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @q0
    private AppCompatActivity t1() {
        for (Context context = this.f761x; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof AppCompatActivity) {
                return (AppCompatActivity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void u0() {
        s sVar = this.Y2;
        if (sVar != null) {
            sVar.a();
        }
        s sVar2 = this.Z2;
        if (sVar2 != null) {
            sVar2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void u1(Configuration configuration) {
        Activity activity = (Activity) this.f760w;
        if (activity instanceof InterfaceC1423e0) {
            if (((InterfaceC1423e0) activity).getLifecycle().getState().isAtLeast(AbstractC1450w.b.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.R2 || this.S2) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean v1(int r9, @androidx.annotation.q0 androidx.core.os.p r10, boolean r11) {
        /*
            r8 = this;
            android.content.Context r1 = r8.f761x
            r4 = 0
            r5 = 0
            r0 = r8
            r2 = r9
            r3 = r10
            android.content.res.Configuration r0 = r0.x0(r1, r2, r3, r4, r5)
            android.content.Context r1 = r8.f761x
            int r1 = r8.I0(r1)
            android.content.res.Configuration r2 = r8.T2
            if (r2 != 0) goto L1f
            android.content.Context r2 = r8.f761x
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
        L1f:
            int r3 = r2.uiMode
            r3 = r3 & 48
            int r4 = r0.uiMode
            r4 = r4 & 48
            androidx.core.os.p r2 = r8.M0(r2)
            r5 = 0
            if (r10 != 0) goto L30
            r0 = r5
            goto L34
        L30:
            androidx.core.os.p r0 = r8.M0(r0)
        L34:
            r6 = 0
            if (r3 == r4) goto L3a
            r3 = 512(0x200, float:7.17E-43)
            goto L3b
        L3a:
            r3 = r6
        L3b:
            if (r0 == 0) goto L45
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L45
            r3 = r3 | 8196(0x2004, float:1.1485E-41)
        L45:
            int r2 = ~r1
            r2 = r2 & r3
            r7 = 1
            if (r2 == 0) goto L6f
            if (r11 == 0) goto L6f
            boolean r11 = r8.Q2
            if (r11 == 0) goto L6f
            boolean r11 = androidx.appcompat.app.AppCompatDelegateImpl.f746n3
            if (r11 != 0) goto L58
            boolean r11 = r8.R2
            if (r11 == 0) goto L6f
        L58:
            java.lang.Object r11 = r8.f760w
            boolean r2 = r11 instanceof android.app.Activity
            if (r2 == 0) goto L6f
            android.app.Activity r11 = (android.app.Activity) r11
            boolean r11 = r11.isChild()
            if (r11 != 0) goto L6f
            java.lang.Object r11 = r8.f760w
            android.app.Activity r11 = (android.app.Activity) r11
            androidx.core.app.b.j(r11)
            r11 = r7
            goto L70
        L6f:
            r11 = r6
        L70:
            if (r11 != 0) goto L7d
            if (r3 == 0) goto L7d
            r11 = r3 & r1
            if (r11 != r3) goto L79
            r6 = r7
        L79:
            r8.x1(r4, r0, r6, r5)
            goto L7e
        L7d:
            r7 = r11
        L7e:
            if (r7 == 0) goto L9a
            java.lang.Object r11 = r8.f760w
            boolean r1 = r11 instanceof androidx.appcompat.app.AppCompatActivity
            if (r1 == 0) goto L9a
            r1 = r3 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L8f
            androidx.appcompat.app.AppCompatActivity r11 = (androidx.appcompat.app.AppCompatActivity) r11
            r11.onNightModeChanged(r9)
        L8f:
            r9 = r3 & 4
            if (r9 == 0) goto L9a
            java.lang.Object r9 = r8.f760w
            androidx.appcompat.app.AppCompatActivity r9 = (androidx.appcompat.app.AppCompatActivity) r9
            r9.onLocalesChanged(r10)
        L9a:
            if (r7 == 0) goto Laf
            if (r0 == 0) goto Laf
            android.content.Context r9 = r8.f761x
            android.content.res.Resources r9 = r9.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            androidx.core.os.p r9 = r8.M0(r9)
            r8.n1(r9)
        Laf:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.v1(int, androidx.core.os.p, boolean):boolean");
    }

    @o0
    private Configuration x0(@o0 Context context, int i4, @q0 androidx.core.os.p pVar, @q0 Configuration configuration, boolean z4) {
        int i5 = i4 != 1 ? i4 != 2 ? z4 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i5 | (configuration2.uiMode & (-49));
        if (pVar != null) {
            m1(configuration2, pVar);
        }
        return configuration2;
    }

    private void x1(int i4, @q0 androidx.core.os.p pVar, boolean z4, @q0 Configuration configuration) {
        Resources resources = this.f761x.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i4 | (resources.getConfiguration().uiMode & (-49));
        if (pVar != null) {
            m1(configuration2, pVar);
        }
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            z.a(resources);
        }
        int i5 = this.V2;
        if (i5 != 0) {
            this.f761x.setTheme(i5);
            this.f761x.getTheme().applyStyle(this.V2, true);
        }
        if (z4 && (this.f760w instanceof Activity)) {
            u1(configuration2);
        }
    }

    private ViewGroup y0() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f761x.obtainStyledAttributes(a.m.S0);
        int i4 = a.m.f73523g3;
        if (!obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(a.m.f73568p3, false)) {
            V(1);
        } else if (obtainStyledAttributes.getBoolean(i4, false)) {
            V(108);
        }
        if (obtainStyledAttributes.getBoolean(a.m.f73528h3, false)) {
            V(109);
        }
        if (obtainStyledAttributes.getBoolean(a.m.f73533i3, false)) {
            V(10);
        }
        this.V1 = obtainStyledAttributes.getBoolean(a.m.T0, false);
        obtainStyledAttributes.recycle();
        E0();
        this.f762y.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f761x);
        if (this.L2) {
            viewGroup = this.Q1 ? (ViewGroup) from.inflate(a.j.f73321w, (ViewGroup) null) : (ViewGroup) from.inflate(a.j.f73320v, (ViewGroup) null);
        } else if (this.V1) {
            viewGroup = (ViewGroup) from.inflate(a.j.f73311m, (ViewGroup) null);
            this.Z = false;
            this.Y = false;
        } else if (this.Y) {
            TypedValue typedValue = new TypedValue();
            this.f761x.getTheme().resolveAttribute(a.b.f72993j, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new androidx.appcompat.view.d(this.f761x, typedValue.resourceId) : this.f761x).inflate(a.j.f73322x, (ViewGroup) null);
            androidx.appcompat.widget.u uVar = (androidx.appcompat.widget.u) viewGroup.findViewById(a.g.f73282x);
            this.E = uVar;
            uVar.k(this.f762y.getCallback());
            if (this.Z) {
                this.E.o(109);
            }
            if (this.R) {
                this.E.o(2);
            }
            if (this.X) {
                this.E.o(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.Y);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.Z);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.V1);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.Q1);
            sb.append(", windowNoTitle: ");
            throw new IllegalArgumentException(androidx.appcompat.app.h.a(sb, this.L2, " }"));
        }
        x1.k2(viewGroup, new c());
        if (this.E == null) {
            this.P = (TextView) viewGroup.findViewById(a.g.f73273s0);
        }
        e1.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(a.g.f73238b);
        ViewGroup viewGroup2 = (ViewGroup) this.f762y.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f762y.setContentView(viewGroup);
        contentFrameLayout.h(new e());
        return viewGroup;
    }

    private void z1(View view) {
        view.setBackgroundColor((x1.F0(view) & 8192) != 0 ? androidx.core.content.d.getColor(this.f761x, a.d.f73092g) : androidx.core.content.d.getColor(this.f761x, a.d.f73090f));
    }

    boolean A0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f760w;
        if (((obj instanceof i0.a) || (obj instanceof androidx.appcompat.app.r)) && (decorView = this.f762y.getDecorView()) != null && i0.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f763z.b(this.f762y.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? Y0(keyCode, keyEvent) : b1(keyCode, keyEvent);
    }

    void B0(int i4) {
        PanelFeatureState N0;
        PanelFeatureState N02 = N0(i4, true);
        if (N02.f773j != null) {
            Bundle bundle = new Bundle();
            N02.f773j.V(bundle);
            if (bundle.size() > 0) {
                N02.f784u = bundle;
            }
            N02.f773j.m0();
            N02.f773j.clear();
        }
        N02.f781r = true;
        N02.f780q = true;
        if ((i4 != 108 && i4 != 0) || this.E == null || (N0 = N0(0, false)) == null) {
            return;
        }
        N0.f776m = false;
        j1(N0, null);
    }

    @Override // androidx.appcompat.app.g
    public ActionBar C() {
        R0();
        return this.B;
    }

    void C0() {
        i2 i2Var = this.L;
        if (i2Var != null) {
            i2Var.d();
        }
    }

    @Override // androidx.appcompat.app.g
    public boolean D(int i4) {
        int l12 = l1(i4);
        return (l12 != 1 ? l12 != 2 ? l12 != 5 ? l12 != 10 ? l12 != 108 ? l12 != 109 ? false : this.Z : this.Y : this.Q1 : this.X : this.R : this.L2) || this.f762y.hasFeature(i4);
    }

    @Override // androidx.appcompat.app.g
    public void E() {
        LayoutInflater from = LayoutInflater.from(this.f761x);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            boolean z4 = from.getFactory2() instanceof AppCompatDelegateImpl;
        }
    }

    @Override // androidx.appcompat.app.g
    public void F() {
        if (this.B == null || C().D()) {
            return;
        }
        V0(0);
    }

    PanelFeatureState F0(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.N2;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i4 = 0; i4 < length; i4++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i4];
            if (panelFeatureState != null && panelFeatureState.f773j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    final Context H0() {
        ActionBar C = C();
        Context A = C != null ? C.A() : null;
        return A == null ? this.f761x : A;
    }

    @Override // androidx.appcompat.app.g
    public boolean I() {
        return this.M;
    }

    @c1({c1.a.LIBRARY})
    @o0
    @m1
    final s K0() {
        return L0(this.f761x);
    }

    @Override // androidx.appcompat.app.g
    public void L(Configuration configuration) {
        ActionBar C;
        if (this.Y && this.N && (C = C()) != null) {
            C.I(configuration);
        }
        androidx.appcompat.widget.h.b().g(this.f761x);
        this.T2 = new Configuration(this.f761x.getResources().getConfiguration());
        n0(false, false);
    }

    @Override // androidx.appcompat.app.g
    public void M(Bundle bundle) {
        String str;
        this.Q2 = true;
        n0(false, true);
        E0();
        Object obj = this.f760w;
        if (obj instanceof Activity) {
            try {
                str = androidx.core.app.x.d((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                ActionBar actionBar = this.B;
                if (actionBar == null) {
                    this.f753d3 = true;
                } else {
                    actionBar.X(true);
                }
            }
            androidx.appcompat.app.g.e(this);
        }
        this.T2 = new Configuration(this.f761x.getResources().getConfiguration());
        this.R2 = true;
    }

    androidx.core.os.p M0(Configuration configuration) {
        return n.b(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    @Override // androidx.appcompat.app.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void N() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f760w
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.g.T(r3)
        L9:
            boolean r0 = r3.f750a3
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f762y
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f752c3
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.S2 = r0
            int r0 = r3.U2
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.f760w
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            androidx.collection.a3<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.AppCompatDelegateImpl.f743k3
            java.lang.Object r1 = r3.f760w
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.U2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            androidx.collection.a3<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.AppCompatDelegateImpl.f743k3
            java.lang.Object r1 = r3.f760w
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            androidx.appcompat.app.ActionBar r0 = r3.B
            if (r0 == 0) goto L5b
            r0.J()
        L5b:
            r3.u0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.N():void");
    }

    protected PanelFeatureState N0(int i4, boolean z4) {
        PanelFeatureState[] panelFeatureStateArr = this.N2;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i4) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i4 + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.N2 = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i4];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i4);
        panelFeatureStateArr[i4] = panelFeatureState2;
        return panelFeatureState2;
    }

    @Override // androidx.appcompat.app.g
    public void O(Bundle bundle) {
        D0();
    }

    ViewGroup O0() {
        return this.O;
    }

    @Override // androidx.appcompat.app.g
    public void P() {
        ActionBar C = C();
        if (C != null) {
            C.u0(true);
        }
    }

    final CharSequence P0() {
        Object obj = this.f760w;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.D;
    }

    @Override // androidx.appcompat.app.g
    public void Q(Bundle bundle) {
    }

    final Window.Callback Q0() {
        return this.f762y.getCallback();
    }

    @Override // androidx.appcompat.app.g
    public void R() {
        n0(true, false);
    }

    @Override // androidx.appcompat.app.g
    public void S() {
        ActionBar C = C();
        if (C != null) {
            C.u0(false);
        }
    }

    @Override // androidx.appcompat.app.g
    public boolean V(int i4) {
        int l12 = l1(i4);
        if (this.L2 && l12 == 108) {
            return false;
        }
        if (this.Y && l12 == 1) {
            this.Y = false;
        }
        if (l12 == 1) {
            s1();
            this.L2 = true;
            return true;
        }
        if (l12 == 2) {
            s1();
            this.R = true;
            return true;
        }
        if (l12 == 5) {
            s1();
            this.X = true;
            return true;
        }
        if (l12 == 10) {
            s1();
            this.Q1 = true;
            return true;
        }
        if (l12 == 108) {
            s1();
            this.Y = true;
            return true;
        }
        if (l12 != 109) {
            return this.f762y.requestFeature(l12);
        }
        s1();
        this.Z = true;
        return true;
    }

    int W0(@o0 Context context, int i4) {
        if (i4 == -100) {
            return -1;
        }
        if (i4 != -1) {
            if (i4 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return L0(context).c();
            }
            if (i4 != 1 && i4 != 2) {
                if (i4 == 3) {
                    return J0(context).c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i4;
    }

    boolean X0() {
        boolean z4 = this.P2;
        this.P2 = false;
        PanelFeatureState N0 = N0(0, false);
        if (N0 != null && N0.f778o) {
            if (!z4) {
                w0(N0, true);
            }
            return true;
        }
        androidx.appcompat.view.b bVar = this.H;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        ActionBar C = C();
        return C != null && C.m();
    }

    boolean Y0(int i4, KeyEvent keyEvent) {
        if (i4 == 4) {
            this.P2 = (keyEvent.getFlags() & 128) != 0;
        } else if (i4 == 82) {
            Z0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.g
    public void Z(int i4) {
        D0();
        ViewGroup viewGroup = (ViewGroup) this.O.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f761x).inflate(i4, viewGroup);
        this.f763z.c(this.f762y.getCallback());
    }

    @Override // androidx.appcompat.view.menu.h.a
    public boolean a(@o0 androidx.appcompat.view.menu.h hVar, @o0 MenuItem menuItem) {
        PanelFeatureState F0;
        Window.Callback callback = this.f762y.getCallback();
        if (callback == null || this.S2 || (F0 = F0(hVar.G())) == null) {
            return false;
        }
        return callback.onMenuItemSelected(F0.f764a, menuItem);
    }

    @Override // androidx.appcompat.app.g
    public void a0(View view) {
        D0();
        ViewGroup viewGroup = (ViewGroup) this.O.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f763z.c(this.f762y.getCallback());
    }

    boolean a1(int i4, KeyEvent keyEvent) {
        ActionBar C = C();
        if (C != null && C.K(i4, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.O2;
        if (panelFeatureState != null && i1(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            PanelFeatureState panelFeatureState2 = this.O2;
            if (panelFeatureState2 != null) {
                panelFeatureState2.f777n = true;
            }
            return true;
        }
        if (this.O2 == null) {
            PanelFeatureState N0 = N0(0, true);
            j1(N0, keyEvent);
            boolean i12 = i1(N0, keyEvent.getKeyCode(), keyEvent, 1);
            N0.f776m = false;
            if (i12) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.h.a
    public void b(@o0 androidx.appcompat.view.menu.h hVar) {
        k1(true);
    }

    @Override // androidx.appcompat.app.g
    public void b0(View view, ViewGroup.LayoutParams layoutParams) {
        D0();
        ViewGroup viewGroup = (ViewGroup) this.O.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f763z.c(this.f762y.getCallback());
    }

    boolean b1(int i4, KeyEvent keyEvent) {
        if (i4 != 4) {
            if (i4 == 82) {
                c1(0, keyEvent);
                return true;
            }
        } else if (X0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.g
    public void d0(boolean z4) {
        this.M = z4;
    }

    void d1(int i4) {
        ActionBar C;
        if (i4 != 108 || (C = C()) == null) {
            return;
        }
        C.n(true);
    }

    void e1(int i4) {
        if (i4 == 108) {
            ActionBar C = C();
            if (C != null) {
                C.n(false);
                return;
            }
            return;
        }
        if (i4 == 0) {
            PanelFeatureState N0 = N0(i4, true);
            if (N0.f778o) {
                w0(N0, false);
            }
        }
    }

    @Override // androidx.appcompat.app.g
    public void f(View view, ViewGroup.LayoutParams layoutParams) {
        D0();
        ((ViewGroup) this.O.findViewById(R.id.content)).addView(view, layoutParams);
        this.f763z.c(this.f762y.getCallback());
    }

    @Override // androidx.appcompat.app.g
    @x0(17)
    public void f0(int i4) {
        if (this.U2 != i4) {
            this.U2 = i4;
            if (this.Q2) {
                h();
            }
        }
    }

    void f1(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.g
    boolean g() {
        if (androidx.appcompat.app.g.G(this.f761x) && androidx.appcompat.app.g.A() != null && !androidx.appcompat.app.g.A().equals(androidx.appcompat.app.g.B())) {
            k(this.f761x);
        }
        return n0(true, true);
    }

    @Override // androidx.appcompat.app.g
    @x0(33)
    public void g0(@q0 OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f758i3;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.f759j3) != null) {
            p.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f759j3 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f760w;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                this.f758i3 = p.a((Activity) this.f760w);
                w1();
            }
        }
        this.f758i3 = onBackInvokedDispatcher;
        w1();
    }

    @Override // androidx.appcompat.app.g
    public boolean h() {
        return n0(true, true);
    }

    @Override // androidx.appcompat.app.g
    public void h0(Toolbar toolbar) {
        if (this.f760w instanceof Activity) {
            ActionBar C = C();
            if (C instanceof e0) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.C = null;
            if (C != null) {
                C.J();
            }
            this.B = null;
            if (toolbar != null) {
                a0 a0Var = new a0(toolbar, P0(), this.f763z);
                this.B = a0Var;
                this.f763z.e(a0Var.f834k);
                toolbar.s0(true);
            } else {
                this.f763z.e(null);
            }
            F();
        }
    }

    final ActionBar h1() {
        return this.B;
    }

    @Override // androidx.appcompat.app.g
    public void i0(@h1 int i4) {
        this.V2 = i4;
    }

    @Override // androidx.appcompat.app.g
    public final void j0(CharSequence charSequence) {
        this.D = charSequence;
        androidx.appcompat.widget.u uVar = this.E;
        if (uVar != null) {
            uVar.g(charSequence);
            return;
        }
        ActionBar actionBar = this.B;
        if (actionBar != null) {
            actionBar.B0(charSequence);
            return;
        }
        TextView textView = this.P;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.app.g
    public androidx.appcompat.view.b k0(@o0 b.a aVar) {
        androidx.appcompat.app.d dVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        androidx.appcompat.view.b bVar = this.H;
        if (bVar != null) {
            bVar.c();
        }
        k kVar = new k(aVar);
        ActionBar C = C();
        if (C != null) {
            androidx.appcompat.view.b D0 = C.D0(kVar);
            this.H = D0;
            if (D0 != null && (dVar = this.A) != null) {
                dVar.onSupportActionModeStarted(D0);
            }
        }
        if (this.H == null) {
            this.H = r1(kVar);
        }
        w1();
        return this.H;
    }

    @Override // androidx.appcompat.app.g
    @androidx.annotation.i
    @o0
    public Context m(@o0 Context context) {
        this.Q2 = true;
        int W0 = W0(context, r0());
        if (androidx.appcompat.app.g.G(context)) {
            androidx.appcompat.app.g.l0(context);
        }
        androidx.core.os.p q02 = q0(context);
        if (f747o3 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(x0(context, W0, q02, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof androidx.appcompat.view.d) {
            try {
                ((androidx.appcompat.view.d) context).a(x0(context, W0, q02, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f746n3) {
            l(context);
            return context;
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration x02 = x0(context, W0, q02, !configuration2.equals(configuration3) ? G0(configuration2, configuration3) : null, true);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, a.l.f73362b4);
        dVar.a(x02);
        try {
            if (context.getTheme() != null) {
                i.g.a(dVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        l(dVar);
        return dVar;
    }

    void m1(Configuration configuration, @o0 androidx.core.os.p pVar) {
        n.d(configuration, pVar);
    }

    void n1(androidx.core.os.p pVar) {
        n.c(pVar);
    }

    final boolean o1() {
        ViewGroup viewGroup;
        return this.N && (viewGroup = this.O) != null && x1.Y0(viewGroup);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return r(view, str, context, attributeSet);
    }

    @q0
    androidx.core.os.p q0(@o0 Context context) {
        androidx.core.os.p A;
        if (Build.VERSION.SDK_INT >= 33 || (A = androidx.appcompat.app.g.A()) == null) {
            return null;
        }
        androidx.core.os.p M0 = M0(context.getApplicationContext().getResources().getConfiguration());
        androidx.core.os.p c5 = x.c(A, M0);
        return c5.j() ? M0 : c5;
    }

    boolean q1() {
        if (this.f758i3 == null) {
            return false;
        }
        PanelFeatureState N0 = N0(0, false);
        return (N0 != null && N0.f778o) || this.H != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.app.g
    public View r(View view, String str, @o0 Context context, @o0 AttributeSet attributeSet) {
        boolean z4;
        if (this.f756g3 == null) {
            String string = this.f761x.obtainStyledAttributes(a.m.S0).getString(a.m.f73518f3);
            if (string == null) {
                this.f756g3 = new androidx.appcompat.app.t();
            } else {
                try {
                    this.f756g3 = (androidx.appcompat.app.t) this.f761x.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable unused) {
                    this.f756g3 = new androidx.appcompat.app.t();
                }
            }
        }
        boolean z5 = f744l3;
        boolean z6 = false;
        if (z5) {
            if (this.f757h3 == null) {
                this.f757h3 = new androidx.appcompat.app.w();
            }
            if (this.f757h3.a(attributeSet)) {
                z4 = true;
                return this.f756g3.r(view, str, context, attributeSet, z4, z5, true, androidx.appcompat.widget.d1.d());
            }
            if (!(attributeSet instanceof XmlPullParser)) {
                z6 = p1((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z6 = true;
            }
        }
        z4 = z6;
        return this.f756g3.r(view, str, context, attributeSet, z4, z5, true, androidx.appcompat.widget.d1.d());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.appcompat.view.b r1(@androidx.annotation.o0 androidx.appcompat.view.b.a r8) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.r1(androidx.appcompat.view.b$a):androidx.appcompat.view.b");
    }

    @Override // androidx.appcompat.app.g
    @q0
    public <T extends View> T s(@androidx.annotation.d0 int i4) {
        D0();
        return (T) this.f762y.findViewById(i4);
    }

    void s0(int i4, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i4 >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.N2;
                if (i4 < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i4];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f773j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f778o) && !this.S2) {
            this.f763z.d(this.f762y.getCallback(), i4, menu);
        }
    }

    void t0(@o0 androidx.appcompat.view.menu.h hVar) {
        if (this.M2) {
            return;
        }
        this.M2 = true;
        this.E.q();
        Window.Callback callback = this.f762y.getCallback();
        if (callback != null && !this.S2) {
            callback.onPanelClosed(108, hVar);
        }
        this.M2 = false;
    }

    @Override // androidx.appcompat.app.g
    public Context u() {
        return this.f761x;
    }

    void v0(int i4) {
        w0(N0(i4, true), true);
    }

    @Override // androidx.appcompat.app.g
    public final a.b w() {
        return new h();
    }

    void w0(PanelFeatureState panelFeatureState, boolean z4) {
        ViewGroup viewGroup;
        androidx.appcompat.widget.u uVar;
        if (z4 && panelFeatureState.f764a == 0 && (uVar = this.E) != null && uVar.h()) {
            t0(panelFeatureState.f773j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f761x.getSystemService("window");
        if (windowManager != null && panelFeatureState.f778o && (viewGroup = panelFeatureState.f770g) != null) {
            windowManager.removeView(viewGroup);
            if (z4) {
                s0(panelFeatureState.f764a, panelFeatureState, null);
            }
        }
        panelFeatureState.f776m = false;
        panelFeatureState.f777n = false;
        panelFeatureState.f778o = false;
        panelFeatureState.f771h = null;
        panelFeatureState.f780q = true;
        if (this.O2 == panelFeatureState) {
            this.O2 = null;
        }
        if (panelFeatureState.f764a == 0) {
            w1();
        }
    }

    void w1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean q12 = q1();
            if (q12 && this.f759j3 == null) {
                this.f759j3 = p.b(this.f758i3, this);
            } else {
                if (q12 || (onBackInvokedCallback = this.f759j3) == null) {
                    return;
                }
                p.c(this.f758i3, onBackInvokedCallback);
            }
        }
    }

    @Override // androidx.appcompat.app.g
    public int x() {
        return this.U2;
    }

    final int y1(@q0 j3 j3Var, @q0 Rect rect) {
        boolean z4;
        boolean z5;
        int r4 = j3Var != null ? j3Var.r() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.I;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z4 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.I.getLayoutParams();
            if (this.I.isShown()) {
                if (this.f754e3 == null) {
                    this.f754e3 = new Rect();
                    this.f755f3 = new Rect();
                }
                Rect rect2 = this.f754e3;
                Rect rect3 = this.f755f3;
                if (j3Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(j3Var.p(), j3Var.r(), j3Var.q(), j3Var.o());
                }
                e1.a(this.O, rect2, rect3);
                int i4 = rect2.top;
                int i5 = rect2.left;
                int i6 = rect2.right;
                j3 r02 = x1.r0(this.O);
                int p4 = r02 == null ? 0 : r02.p();
                int q4 = r02 == null ? 0 : r02.q();
                if (marginLayoutParams.topMargin == i4 && marginLayoutParams.leftMargin == i5 && marginLayoutParams.rightMargin == i6) {
                    z5 = false;
                } else {
                    marginLayoutParams.topMargin = i4;
                    marginLayoutParams.leftMargin = i5;
                    marginLayoutParams.rightMargin = i6;
                    z5 = true;
                }
                if (i4 <= 0 || this.Q != null) {
                    View view = this.Q;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i7 = marginLayoutParams2.height;
                        int i10 = marginLayoutParams.topMargin;
                        if (i7 != i10 || marginLayoutParams2.leftMargin != p4 || marginLayoutParams2.rightMargin != q4) {
                            marginLayoutParams2.height = i10;
                            marginLayoutParams2.leftMargin = p4;
                            marginLayoutParams2.rightMargin = q4;
                            this.Q.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f761x);
                    this.Q = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = p4;
                    layoutParams.rightMargin = q4;
                    this.O.addView(this.Q, -1, layoutParams);
                }
                View view3 = this.Q;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    z1(this.Q);
                }
                if (!this.Q1 && r5) {
                    r4 = 0;
                }
                z4 = r5;
                r5 = z5;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z4 = false;
            } else {
                z4 = false;
                r5 = false;
            }
            if (r5) {
                this.I.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.Q;
        if (view4 != null) {
            view4.setVisibility(z4 ? 0 : 8);
        }
        return r4;
    }

    @Override // androidx.appcompat.app.g
    public MenuInflater z() {
        if (this.C == null) {
            R0();
            ActionBar actionBar = this.B;
            this.C = new androidx.appcompat.view.h(actionBar != null ? actionBar.A() : this.f761x);
        }
        return this.C;
    }

    void z0() {
        androidx.appcompat.view.menu.h hVar;
        androidx.appcompat.widget.u uVar = this.E;
        if (uVar != null) {
            uVar.q();
        }
        if (this.J != null) {
            this.f762y.getDecorView().removeCallbacks(this.K);
            if (this.J.isShowing()) {
                try {
                    this.J.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.J = null;
        }
        C0();
        PanelFeatureState N0 = N0(0, false);
        if (N0 == null || (hVar = N0.f773j) == null) {
            return;
        }
        hVar.close();
    }

    AppCompatDelegateImpl(Dialog dialog, androidx.appcompat.app.d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return r(null, str, context, attributeSet);
    }

    AppCompatDelegateImpl(Context context, Window window, androidx.appcompat.app.d dVar) {
        this(context, window, dVar, context);
    }

    AppCompatDelegateImpl(Context context, Activity activity, androidx.appcompat.app.d dVar) {
        this(context, null, dVar, activity);
    }

    private AppCompatDelegateImpl(Context context, Window window, androidx.appcompat.app.d dVar, Object obj) {
        a3<String, Integer> a3Var;
        Integer num;
        AppCompatActivity t12;
        this.L = null;
        this.M = true;
        this.U2 = -100;
        this.f752c3 = new b();
        this.f761x = context;
        this.A = dVar;
        this.f760w = obj;
        if (this.U2 == -100 && (obj instanceof Dialog) && (t12 = t1()) != null) {
            this.U2 = t12.getDelegate().x();
        }
        if (this.U2 == -100 && (num = (a3Var = f743k3).get(obj.getClass().getName())) != null) {
            this.U2 = num.intValue();
            a3Var.remove(obj.getClass().getName());
        }
        if (window != null) {
            p0(window);
        }
        androidx.appcompat.widget.h.i();
    }
}
