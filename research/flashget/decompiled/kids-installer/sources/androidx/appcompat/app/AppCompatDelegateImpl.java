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
import android.view.a0;
import android.view.t;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.c1;
import androidx.annotation.d0;
import androidx.annotation.h1;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.appcompat.app.a;
import androidx.appcompat.view.b;
import androidx.appcompat.view.f;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.f1;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.g1;
import androidx.appcompat.widget.x;
import androidx.appcompat.widget.z0;
import androidx.core.app.z;
import androidx.core.content.res.i;
import androidx.core.view.f0;
import androidx.core.view.o1;
import androidx.core.view.r3;
import androidx.core.view.s1;
import androidx.core.view.t3;
import androidx.core.view.v4;
import androidx.core.view.y1;
import d.a;
import java.lang.Thread;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

@c1({c1.a.LIBRARY})
/* loaded from: classes2.dex */
class AppCompatDelegateImpl extends androidx.appcompat.app.e implements g.a, LayoutInflater.Factory2 {
    private static boolean G0;
    private androidx.appcompat.app.k A0;
    final Object D;
    final Context E;
    Window F;
    private o G;
    final androidx.appcompat.app.d H;
    ActionBar I;
    MenuInflater J;
    private CharSequence K;
    private x L;
    private i M;
    private u N;
    androidx.appcompat.view.b O;
    ActionBarContextView P;
    PopupWindow Q;
    Runnable R;
    r3 S;
    private boolean T;
    private boolean U;
    ViewGroup V;
    private TextView W;
    private View X;
    private boolean Y;
    private boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    boolean f250a0;

    /* renamed from: b0, reason: collision with root package name */
    boolean f251b0;

    /* renamed from: c0, reason: collision with root package name */
    boolean f252c0;

    /* renamed from: d0, reason: collision with root package name */
    boolean f253d0;

    /* renamed from: e0, reason: collision with root package name */
    boolean f254e0;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f255f0;

    /* renamed from: g0, reason: collision with root package name */
    private PanelFeatureState[] f256g0;

    /* renamed from: h0, reason: collision with root package name */
    private PanelFeatureState f257h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f258i0;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f259j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f260k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f261l0;

    /* renamed from: m0, reason: collision with root package name */
    boolean f262m0;

    /* renamed from: n0, reason: collision with root package name */
    private int f263n0;

    /* renamed from: o0, reason: collision with root package name */
    private int f264o0;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f265p0;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f266q0;

    /* renamed from: r0, reason: collision with root package name */
    private q f267r0;

    /* renamed from: s0, reason: collision with root package name */
    private q f268s0;

    /* renamed from: t0, reason: collision with root package name */
    boolean f269t0;

    /* renamed from: u0, reason: collision with root package name */
    int f270u0;

    /* renamed from: v0, reason: collision with root package name */
    private final Runnable f271v0;

    /* renamed from: w0, reason: collision with root package name */
    private boolean f272w0;

    /* renamed from: x0, reason: collision with root package name */
    private Rect f273x0;

    /* renamed from: y0, reason: collision with root package name */
    private Rect f274y0;

    /* renamed from: z0, reason: collision with root package name */
    private androidx.appcompat.app.j f275z0;
    static final String H0 = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";
    private static final androidx.collection.i<String, Integer> B0 = new androidx.collection.i<>();
    private static final boolean C0 = false;
    private static final int[] D0 = {R.attr.windowBackground};
    private static final boolean E0 = !"robolectric".equals(Build.FINGERPRINT);
    private static final boolean F0 = true;

    /* loaded from: classes.dex */
    protected static final class PanelFeatureState {

        /* renamed from: a, reason: collision with root package name */
        int f276a;

        /* renamed from: b, reason: collision with root package name */
        int f277b;

        /* renamed from: c, reason: collision with root package name */
        int f278c;

        /* renamed from: d, reason: collision with root package name */
        int f279d;

        /* renamed from: e, reason: collision with root package name */
        int f280e;

        /* renamed from: f, reason: collision with root package name */
        int f281f;

        /* renamed from: g, reason: collision with root package name */
        ViewGroup f282g;

        /* renamed from: h, reason: collision with root package name */
        View f283h;

        /* renamed from: i, reason: collision with root package name */
        View f284i;

        /* renamed from: j, reason: collision with root package name */
        androidx.appcompat.view.menu.g f285j;

        /* renamed from: k, reason: collision with root package name */
        androidx.appcompat.view.menu.e f286k;

        /* renamed from: l, reason: collision with root package name */
        Context f287l;

        /* renamed from: m, reason: collision with root package name */
        boolean f288m;

        /* renamed from: n, reason: collision with root package name */
        boolean f289n;

        /* renamed from: o, reason: collision with root package name */
        boolean f290o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f291p;

        /* renamed from: q, reason: collision with root package name */
        boolean f292q = false;

        /* renamed from: r, reason: collision with root package name */
        boolean f293r;

        /* renamed from: s, reason: collision with root package name */
        boolean f294s;

        /* renamed from: t, reason: collision with root package name */
        Bundle f295t;

        /* renamed from: u, reason: collision with root package name */
        Bundle f296u;

        @SuppressLint({"BanParcelableUsage"})
        private static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* renamed from: o, reason: collision with root package name */
            int f297o;

            /* renamed from: p, reason: collision with root package name */
            boolean f298p;

            /* renamed from: q, reason: collision with root package name */
            Bundle f299q;

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
                public SavedState[] newArray(int i5) {
                    return new SavedState[i5];
                }
            }

            SavedState() {
            }

            static SavedState a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f297o = parcel.readInt();
                boolean z5 = parcel.readInt() == 1;
                savedState.f298p = z5;
                if (z5) {
                    savedState.f299q = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i5) {
                parcel.writeInt(this.f297o);
                parcel.writeInt(this.f298p ? 1 : 0);
                if (this.f298p) {
                    parcel.writeBundle(this.f299q);
                }
            }
        }

        PanelFeatureState(int i5) {
            this.f276a = i5;
        }

        void a() {
            Bundle bundle;
            androidx.appcompat.view.menu.g gVar = this.f285j;
            if (gVar == null || (bundle = this.f295t) == null) {
                return;
            }
            gVar.U(bundle);
            this.f295t = null;
        }

        public void b() {
            androidx.appcompat.view.menu.g gVar = this.f285j;
            if (gVar != null) {
                gVar.S(this.f286k);
            }
            this.f286k = null;
        }

        androidx.appcompat.view.menu.o c(n.a aVar) {
            if (this.f285j == null) {
                return null;
            }
            if (this.f286k == null) {
                androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(this.f287l, a.k.f21960q);
                this.f286k = eVar;
                eVar.h(aVar);
                this.f285j.b(this.f286k);
            }
            return this.f286k.m(this.f282g);
        }

        public boolean d() {
            if (this.f283h == null) {
                return false;
            }
            return this.f284i != null || this.f286k.a().getCount() > 0;
        }

        void e(Parcelable parcelable) {
            SavedState savedState = (SavedState) parcelable;
            this.f276a = savedState.f297o;
            this.f294s = savedState.f298p;
            this.f295t = savedState.f299q;
            this.f283h = null;
            this.f282g = null;
        }

        Parcelable f() {
            SavedState savedState = new SavedState();
            savedState.f297o = this.f276a;
            savedState.f298p = this.f290o;
            if (this.f285j != null) {
                Bundle bundle = new Bundle();
                savedState.f299q = bundle;
                this.f285j.W(bundle);
            }
            return savedState;
        }

        void g(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.f285j;
            if (gVar == gVar2) {
                return;
            }
            if (gVar2 != null) {
                gVar2.S(this.f286k);
            }
            this.f285j = gVar;
            if (gVar == null || (eVar = this.f286k) == null) {
                return;
            }
            gVar.b(eVar);
        }

        void h(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(a.c.f21541c, typedValue, true);
            int i5 = typedValue.resourceId;
            if (i5 != 0) {
                newTheme.applyStyle(i5, true);
            }
            newTheme.resolveAttribute(a.c.E2, typedValue, true);
            int i6 = typedValue.resourceId;
            if (i6 != 0) {
                newTheme.applyStyle(i6, true);
            } else {
                newTheme.applyStyle(a.m.U3, true);
            }
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f287l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(a.n.f22195f1);
            this.f277b = obtainStyledAttributes.getResourceId(a.n.O2, 0);
            this.f281f = obtainStyledAttributes.getResourceId(a.n.f22208h1, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f300a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f300a = uncaughtExceptionHandler;
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
                this.f300a.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f300a.uncaughtException(thread, notFoundException);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f270u0 & 1) != 0) {
                appCompatDelegateImpl.h0(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.f270u0 & 4096) != 0) {
                appCompatDelegateImpl2.h0(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.f269t0 = false;
            appCompatDelegateImpl3.f270u0 = 0;
        }
    }

    class c implements o1 {
        c() {
        }

        @Override // androidx.core.view.o1
        public v4 a(View view, v4 v4Var) {
            int r5 = v4Var.r();
            int Y0 = AppCompatDelegateImpl.this.Y0(v4Var, null);
            if (r5 != Y0) {
                v4Var = v4Var.D(v4Var.p(), Y0, v4Var.q(), v4Var.o());
            }
            return y1.g1(view, v4Var);
        }
    }

    class d implements g0.a {
        d() {
        }

        @Override // androidx.appcompat.widget.g0.a
        public void a(Rect rect) {
            rect.top = AppCompatDelegateImpl.this.Y0(null, rect);
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
            AppCompatDelegateImpl.this.f0();
        }
    }

    /* loaded from: classes.dex */
    class f implements Runnable {

        /* loaded from: classes3.dex */
        class a extends t3 {
            a() {
            }

            @Override // androidx.core.view.t3, androidx.core.view.s3
            public void b(View view) {
                AppCompatDelegateImpl.this.P.setAlpha(1.0f);
                AppCompatDelegateImpl.this.S.u(null);
                AppCompatDelegateImpl.this.S = null;
            }

            @Override // androidx.core.view.t3, androidx.core.view.s3
            public void c(View view) {
                AppCompatDelegateImpl.this.P.setVisibility(0);
            }
        }

        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.Q.showAtLocation(appCompatDelegateImpl.P, 55, 0, 0);
            AppCompatDelegateImpl.this.i0();
            if (!AppCompatDelegateImpl.this.R0()) {
                AppCompatDelegateImpl.this.P.setAlpha(1.0f);
                AppCompatDelegateImpl.this.P.setVisibility(0);
            } else {
                AppCompatDelegateImpl.this.P.setAlpha(0.0f);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.S = y1.g(appCompatDelegateImpl2.P).b(1.0f);
                AppCompatDelegateImpl.this.S.u(new a());
            }
        }
    }

    /* loaded from: classes3.dex */
    class g extends t3 {
        g() {
        }

        @Override // androidx.core.view.t3, androidx.core.view.s3
        public void b(View view) {
            AppCompatDelegateImpl.this.P.setAlpha(1.0f);
            AppCompatDelegateImpl.this.S.u(null);
            AppCompatDelegateImpl.this.S = null;
        }

        @Override // androidx.core.view.t3, androidx.core.view.s3
        public void c(View view) {
            AppCompatDelegateImpl.this.P.setVisibility(0);
            AppCompatDelegateImpl.this.P.sendAccessibilityEvent(32);
            if (AppCompatDelegateImpl.this.P.getParent() instanceof View) {
                y1.v1((View) AppCompatDelegateImpl.this.P.getParent());
            }
        }
    }

    private class h implements a.b {
        h() {
        }

        @Override // androidx.appcompat.app.a.b
        public boolean a() {
            ActionBar s5 = AppCompatDelegateImpl.this.s();
            return (s5 == null || (s5.o() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.a.b
        public Context b() {
            return AppCompatDelegateImpl.this.n0();
        }

        @Override // androidx.appcompat.app.a.b
        public void c(Drawable drawable, int i5) {
            ActionBar s5 = AppCompatDelegateImpl.this.s();
            if (s5 != null) {
                s5.k0(drawable);
                s5.h0(i5);
            }
        }

        @Override // androidx.appcompat.app.a.b
        public Drawable d() {
            z0 F = z0.F(b(), null, new int[]{a.c.L1});
            Drawable h5 = F.h(0);
            F.I();
            return h5;
        }

        @Override // androidx.appcompat.app.a.b
        public void e(int i5) {
            ActionBar s5 = AppCompatDelegateImpl.this.s();
            if (s5 != null) {
                s5.h0(i5);
            }
        }
    }

    private final class i implements n.a {
        i() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void b(@o0 androidx.appcompat.view.menu.g gVar, boolean z5) {
            AppCompatDelegateImpl.this.Z(gVar);
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean c(@o0 androidx.appcompat.view.menu.g gVar) {
            Window.Callback u02 = AppCompatDelegateImpl.this.u0();
            if (u02 == null) {
                return true;
            }
            u02.onMenuOpened(108, gVar);
            return true;
        }
    }

    class j implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private b.a f310a;

        /* loaded from: classes3.dex */
        class a extends t3 {
            a() {
            }

            @Override // androidx.core.view.t3, androidx.core.view.s3
            public void b(View view) {
                AppCompatDelegateImpl.this.P.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.Q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.P.getParent() instanceof View) {
                    y1.v1((View) AppCompatDelegateImpl.this.P.getParent());
                }
                AppCompatDelegateImpl.this.P.y();
                AppCompatDelegateImpl.this.S.u(null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.S = null;
                y1.v1(appCompatDelegateImpl2.V);
            }
        }

        public j(b.a aVar) {
            this.f310a = aVar;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(androidx.appcompat.view.b bVar) {
            this.f310a.a(bVar);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.Q != null) {
                appCompatDelegateImpl.F.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.R);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.P != null) {
                appCompatDelegateImpl2.i0();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.S = y1.g(appCompatDelegateImpl3.P).b(0.0f);
                AppCompatDelegateImpl.this.S.u(new a());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            androidx.appcompat.app.d dVar = appCompatDelegateImpl4.H;
            if (dVar != null) {
                dVar.l(appCompatDelegateImpl4.O);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.O = null;
            y1.v1(appCompatDelegateImpl5.V);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f310a.b(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(androidx.appcompat.view.b bVar, Menu menu) {
            y1.v1(AppCompatDelegateImpl.this.V);
            return this.f310a.c(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return this.f310a.d(bVar, menuItem);
        }
    }

    @x0(17)
    /* loaded from: classes.dex */
    static class k {
        private k() {
        }

        static Context a(@o0 Context context, @o0 Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        static void b(@o0 Configuration configuration, @o0 Configuration configuration2, @o0 Configuration configuration3) {
            int i5 = configuration.densityDpi;
            int i6 = configuration2.densityDpi;
            if (i5 != i6) {
                configuration3.densityDpi = i6;
            }
        }
    }

    @x0(21)
    /* loaded from: classes.dex */
    static class l {
        private l() {
        }

        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    @x0(24)
    /* loaded from: classes.dex */
    static class m {
        private m() {
        }

        static void a(@o0 Configuration configuration, @o0 Configuration configuration2, @o0 Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    @x0(26)
    /* loaded from: classes.dex */
    static class n {
        private n() {
        }

        static void a(@o0 Configuration configuration, @o0 Configuration configuration2, @o0 Configuration configuration3) {
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            i5 = configuration.colorMode;
            int i13 = i5 & 3;
            i6 = configuration2.colorMode;
            if (i13 != (i6 & 3)) {
                i11 = configuration3.colorMode;
                i12 = configuration2.colorMode;
                configuration3.colorMode = i11 | (i12 & 3);
            }
            i7 = configuration.colorMode;
            int i14 = i7 & 12;
            i8 = configuration2.colorMode;
            if (i14 != (i8 & 12)) {
                i9 = configuration3.colorMode;
                i10 = configuration2.colorMode;
                configuration3.colorMode = i9 | (i10 & 12);
            }
        }
    }

    class o extends androidx.appcompat.view.k {
        o(Window.Callback callback) {
            super(callback);
        }

        final ActionMode b(ActionMode.Callback callback) {
            f.a aVar = new f.a(AppCompatDelegateImpl.this.E, callback);
            androidx.appcompat.view.b T = AppCompatDelegateImpl.this.T(aVar);
            if (T != null) {
                return aVar.e(T);
            }
            return null;
        }

        @Override // androidx.appcompat.view.k, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.g0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.k, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.F0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // androidx.appcompat.view.k, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // androidx.appcompat.view.k, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i5, Menu menu) {
            if (i5 != 0 || (menu instanceof androidx.appcompat.view.menu.g)) {
                return super.onCreatePanelMenu(i5, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.k, android.view.Window.Callback
        public boolean onMenuOpened(int i5, Menu menu) {
            super.onMenuOpened(i5, menu);
            AppCompatDelegateImpl.this.I0(i5);
            return true;
        }

        @Override // androidx.appcompat.view.k, android.view.Window.Callback
        public void onPanelClosed(int i5, Menu menu) {
            super.onPanelClosed(i5, menu);
            AppCompatDelegateImpl.this.J0(i5);
        }

        @Override // androidx.appcompat.view.k, android.view.Window.Callback
        public boolean onPreparePanel(int i5, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar = menu instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menu : null;
            if (i5 == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.i0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i5, view, menu);
            if (gVar != null) {
                gVar.i0(false);
            }
            return onPreparePanel;
        }

        @Override // androidx.appcompat.view.k, android.view.Window.Callback
        @x0(24)
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i5) {
            androidx.appcompat.view.menu.g gVar;
            PanelFeatureState r02 = AppCompatDelegateImpl.this.r0(0, true);
            if (r02 == null || (gVar = r02.f285j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i5);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i5);
            }
        }

        @Override // androidx.appcompat.view.k, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // androidx.appcompat.view.k, android.view.Window.Callback
        @x0(23)
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i5) {
            return (AppCompatDelegateImpl.this.x() && i5 == 0) ? b(callback) : super.onWindowStartingActionMode(callback, i5);
        }
    }

    private class p extends q {

        /* renamed from: c, reason: collision with root package name */
        private final PowerManager f314c;

        p(@o0 Context context) {
            super();
            this.f314c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.q
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.q
        public int c() {
            return this.f314c.isPowerSaveMode() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.q
        public void e() {
            AppCompatDelegateImpl.this.e();
        }
    }

    @c1({c1.a.LIBRARY})
    @m1
    /* loaded from: classes.dex */
    abstract class q {

        /* renamed from: a, reason: collision with root package name */
        private BroadcastReceiver f316a;

        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                q.this.e();
            }
        }

        q() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f316a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.E.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f316a = null;
            }
        }

        @q0
        abstract IntentFilter b();

        abstract int c();

        boolean d() {
            return this.f316a != null;
        }

        abstract void e();

        void f() {
            a();
            IntentFilter b6 = b();
            if (b6 == null || b6.countActions() == 0) {
                return;
            }
            if (this.f316a == null) {
                this.f316a = new a();
            }
            AppCompatDelegateImpl.this.E.registerReceiver(this.f316a, b6);
        }
    }

    private class r extends q {

        /* renamed from: c, reason: collision with root package name */
        private final androidx.appcompat.app.p f319c;

        r(@o0 androidx.appcompat.app.p pVar) {
            super();
            this.f319c = pVar;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.q
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.q
        public int c() {
            return this.f319c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.q
        public void e() {
            AppCompatDelegateImpl.this.e();
        }
    }

    @x0(17)
    /* loaded from: classes.dex */
    private static class s {
        private s() {
        }

        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    private class t extends ContentFrameLayout {
        public t(Context context) {
            super(context, null);
        }

        private boolean j(int i5, int i6) {
            return i5 < -5 || i6 < -5 || i5 > getWidth() + 5 || i6 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.g0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !j((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.b0(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i5) {
            setBackgroundDrawable(androidx.appcompat.content.res.a.d(getContext(), i5));
        }
    }

    private final class u implements n.a {
        u() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void b(@o0 androidx.appcompat.view.menu.g gVar, boolean z5) {
            androidx.appcompat.view.menu.g G = gVar.G();
            boolean z6 = G != gVar;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z6) {
                gVar = G;
            }
            PanelFeatureState l02 = appCompatDelegateImpl.l0(gVar);
            if (l02 != null) {
                if (!z6) {
                    AppCompatDelegateImpl.this.c0(l02, z5);
                } else {
                    AppCompatDelegateImpl.this.Y(l02.f276a, l02, G);
                    AppCompatDelegateImpl.this.c0(l02, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean c(@o0 androidx.appcompat.view.menu.g gVar) {
            Window.Callback u02;
            if (gVar != gVar.G()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.f250a0 || (u02 = appCompatDelegateImpl.u0()) == null || AppCompatDelegateImpl.this.f262m0) {
                return true;
            }
            u02.onMenuOpened(108, gVar);
            return true;
        }
    }

    AppCompatDelegateImpl(Activity activity, androidx.appcompat.app.d dVar) {
        this(activity, null, dVar, activity);
    }

    private boolean A0() {
        if (!this.f266q0 && (this.D instanceof Activity)) {
            PackageManager packageManager = this.E.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.E, this.D.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                this.f265p0 = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException unused) {
                this.f265p0 = false;
            }
        }
        this.f266q0 = true;
        return this.f265p0;
    }

    private boolean E0(int i5, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        PanelFeatureState r02 = r0(i5, true);
        if (r02.f290o) {
            return false;
        }
        return O0(r02, keyEvent);
    }

    private boolean H0(int i5, KeyEvent keyEvent) {
        boolean z5;
        AudioManager audioManager;
        x xVar;
        if (this.O != null) {
            return false;
        }
        boolean z6 = true;
        PanelFeatureState r02 = r0(i5, true);
        if (i5 != 0 || (xVar = this.L) == null || !xVar.j() || ViewConfiguration.get(this.E).hasPermanentMenuKey()) {
            boolean z7 = r02.f290o;
            if (z7 || r02.f289n) {
                c0(r02, true);
                z6 = z7;
            } else {
                if (r02.f288m) {
                    if (r02.f293r) {
                        r02.f288m = false;
                        z5 = O0(r02, keyEvent);
                    } else {
                        z5 = true;
                    }
                    if (z5) {
                        L0(r02, keyEvent);
                    }
                }
                z6 = false;
            }
        } else if (this.L.f()) {
            z6 = this.L.o();
        } else {
            if (!this.f262m0 && O0(r02, keyEvent)) {
                z6 = this.L.p();
            }
            z6 = false;
        }
        if (z6 && (audioManager = (AudioManager) this.E.getApplicationContext().getSystemService("audio")) != null) {
            audioManager.playSoundEffect(0);
        }
        return z6;
    }

    private void L0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i5;
        ViewGroup.LayoutParams layoutParams;
        if (panelFeatureState.f290o || this.f262m0) {
            return;
        }
        if (panelFeatureState.f276a == 0) {
            if ((this.E.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback u02 = u0();
        if (u02 != null && !u02.onMenuOpened(panelFeatureState.f276a, panelFeatureState.f285j)) {
            c0(panelFeatureState, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.E.getSystemService("window");
        if (windowManager != null && O0(panelFeatureState, keyEvent)) {
            ViewGroup viewGroup = panelFeatureState.f282g;
            if (viewGroup == null || panelFeatureState.f292q) {
                if (viewGroup == null) {
                    if (!x0(panelFeatureState) || panelFeatureState.f282g == null) {
                        return;
                    }
                } else if (panelFeatureState.f292q && viewGroup.getChildCount() > 0) {
                    panelFeatureState.f282g.removeAllViews();
                }
                if (!w0(panelFeatureState) || !panelFeatureState.d()) {
                    panelFeatureState.f292q = true;
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = panelFeatureState.f283h.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                panelFeatureState.f282g.setBackgroundResource(panelFeatureState.f277b);
                ViewParent parent = panelFeatureState.f283h.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(panelFeatureState.f283h);
                }
                panelFeatureState.f282g.addView(panelFeatureState.f283h, layoutParams2);
                if (!panelFeatureState.f283h.hasFocus()) {
                    panelFeatureState.f283h.requestFocus();
                }
            } else {
                View view = panelFeatureState.f284i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i5 = -1;
                    panelFeatureState.f289n = false;
                    WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i5, -2, panelFeatureState.f279d, panelFeatureState.f280e, s1.f5664e, 8519680, -3);
                    layoutParams3.gravity = panelFeatureState.f278c;
                    layoutParams3.windowAnimations = panelFeatureState.f281f;
                    windowManager.addView(panelFeatureState.f282g, layoutParams3);
                    panelFeatureState.f290o = true;
                }
            }
            i5 = -2;
            panelFeatureState.f289n = false;
            WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i5, -2, panelFeatureState.f279d, panelFeatureState.f280e, s1.f5664e, 8519680, -3);
            layoutParams32.gravity = panelFeatureState.f278c;
            layoutParams32.windowAnimations = panelFeatureState.f281f;
            windowManager.addView(panelFeatureState.f282g, layoutParams32);
            panelFeatureState.f290o = true;
        }
    }

    private boolean N0(PanelFeatureState panelFeatureState, int i5, KeyEvent keyEvent, int i6) {
        androidx.appcompat.view.menu.g gVar;
        boolean z5 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f288m || O0(panelFeatureState, keyEvent)) && (gVar = panelFeatureState.f285j) != null) {
            z5 = gVar.performShortcut(i5, keyEvent, i6);
        }
        if (z5 && (i6 & 1) == 0 && this.L == null) {
            c0(panelFeatureState, true);
        }
        return z5;
    }

    private boolean O0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        x xVar;
        x xVar2;
        x xVar3;
        if (this.f262m0) {
            return false;
        }
        if (panelFeatureState.f288m) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.f257h0;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            c0(panelFeatureState2, false);
        }
        Window.Callback u02 = u0();
        if (u02 != null) {
            panelFeatureState.f284i = u02.onCreatePanelView(panelFeatureState.f276a);
        }
        int i5 = panelFeatureState.f276a;
        boolean z5 = i5 == 0 || i5 == 108;
        if (z5 && (xVar3 = this.L) != null) {
            xVar3.g();
        }
        if (panelFeatureState.f284i == null && (!z5 || !(M0() instanceof androidx.appcompat.app.n))) {
            androidx.appcompat.view.menu.g gVar = panelFeatureState.f285j;
            if (gVar == null || panelFeatureState.f293r) {
                if (gVar == null && (!y0(panelFeatureState) || panelFeatureState.f285j == null)) {
                    return false;
                }
                if (z5 && this.L != null) {
                    if (this.M == null) {
                        this.M = new i();
                    }
                    this.L.a(panelFeatureState.f285j, this.M);
                }
                panelFeatureState.f285j.m0();
                if (!u02.onCreatePanelMenu(panelFeatureState.f276a, panelFeatureState.f285j)) {
                    panelFeatureState.g(null);
                    if (z5 && (xVar = this.L) != null) {
                        xVar.a(null, this.M);
                    }
                    return false;
                }
                panelFeatureState.f293r = false;
            }
            panelFeatureState.f285j.m0();
            Bundle bundle = panelFeatureState.f296u;
            if (bundle != null) {
                panelFeatureState.f285j.T(bundle);
                panelFeatureState.f296u = null;
            }
            if (!u02.onPreparePanel(0, panelFeatureState.f284i, panelFeatureState.f285j)) {
                if (z5 && (xVar2 = this.L) != null) {
                    xVar2.a(null, this.M);
                }
                panelFeatureState.f285j.l0();
                return false;
            }
            boolean z6 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.f291p = z6;
            panelFeatureState.f285j.setQwertyMode(z6);
            panelFeatureState.f285j.l0();
        }
        panelFeatureState.f288m = true;
        panelFeatureState.f289n = false;
        this.f257h0 = panelFeatureState;
        return true;
    }

    private void P0(boolean z5) {
        x xVar = this.L;
        if (xVar == null || !xVar.j() || (ViewConfiguration.get(this.E).hasPermanentMenuKey() && !this.L.n())) {
            PanelFeatureState r02 = r0(0, true);
            r02.f292q = true;
            c0(r02, false);
            L0(r02, null);
            return;
        }
        Window.Callback u02 = u0();
        if (this.L.f() && z5) {
            this.L.o();
            if (this.f262m0) {
                return;
            }
            u02.onPanelClosed(108, r0(0, true).f285j);
            return;
        }
        if (u02 == null || this.f262m0) {
            return;
        }
        if (this.f269t0 && (this.f270u0 & 1) != 0) {
            this.F.getDecorView().removeCallbacks(this.f271v0);
            this.f271v0.run();
        }
        PanelFeatureState r03 = r0(0, true);
        androidx.appcompat.view.menu.g gVar = r03.f285j;
        if (gVar == null || r03.f293r || !u02.onPreparePanel(0, r03.f284i, gVar)) {
            return;
        }
        u02.onMenuOpened(108, r03.f285j);
        this.L.p();
    }

    private int Q0(int i5) {
        if (i5 == 8) {
            return 108;
        }
        if (i5 == 9) {
            return 109;
        }
        return i5;
    }

    private boolean S0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.F.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || y1.O0((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean U(boolean z5) {
        if (this.f262m0) {
            return false;
        }
        int X = X();
        boolean W0 = W0(B0(this.E, X), z5);
        if (X == 0) {
            q0(this.E).f();
        } else {
            q qVar = this.f267r0;
            if (qVar != null) {
                qVar.a();
            }
        }
        if (X == 3) {
            o0(this.E).f();
        } else {
            q qVar2 = this.f268s0;
            if (qVar2 != null) {
                qVar2.a();
            }
        }
        return W0;
    }

    private void U0() {
        if (this.U) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void V() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.V.findViewById(R.id.content);
        View decorView = this.F.getDecorView();
        contentFrameLayout.i(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.E.obtainStyledAttributes(a.n.f22195f1);
        obtainStyledAttributes.getValue(a.n.A3, contentFrameLayout.f());
        obtainStyledAttributes.getValue(a.n.B3, contentFrameLayout.g());
        int i5 = a.n.f22312y3;
        if (obtainStyledAttributes.hasValue(i5)) {
            obtainStyledAttributes.getValue(i5, contentFrameLayout.d());
        }
        int i6 = a.n.f22318z3;
        if (obtainStyledAttributes.hasValue(i6)) {
            obtainStyledAttributes.getValue(i6, contentFrameLayout.e());
        }
        int i7 = a.n.f22300w3;
        if (obtainStyledAttributes.hasValue(i7)) {
            obtainStyledAttributes.getValue(i7, contentFrameLayout.b());
        }
        int i8 = a.n.f22306x3;
        if (obtainStyledAttributes.hasValue(i8)) {
            obtainStyledAttributes.getValue(i8, contentFrameLayout.c());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    @q0
    private AppCompatActivity V0() {
        for (Context context = this.E; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof AppCompatActivity) {
                return (AppCompatActivity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void W(@o0 Window window) {
        if (this.F != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof o) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        o oVar = new o(callback);
        this.G = oVar;
        window.setCallback(oVar);
        z0 F = z0.F(this.E, null, D0);
        Drawable i5 = F.i(0);
        if (i5 != null) {
            window.setBackgroundDrawable(i5);
        }
        F.I();
        this.F = window;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean W0(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.E
            r1 = 0
            android.content.res.Configuration r0 = r6.d0(r0, r7, r1)
            boolean r2 = r6.A0()
            android.content.Context r3 = r6.E
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L47
            if (r8 == 0) goto L47
            if (r2 != 0) goto L47
            boolean r8 = r6.f259j0
            if (r8 == 0) goto L47
            boolean r8 = androidx.appcompat.app.AppCompatDelegateImpl.E0
            if (r8 != 0) goto L30
            boolean r8 = r6.f260k0
            if (r8 == 0) goto L47
        L30:
            java.lang.Object r8 = r6.D
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L47
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L47
            java.lang.Object r8 = r6.D
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.core.app.b.E(r8)
            r8 = r4
            goto L48
        L47:
            r8 = 0
        L48:
            if (r8 != 0) goto L50
            if (r3 == r0) goto L50
            r6.X0(r0, r2, r1)
            goto L51
        L50:
            r4 = r8
        L51:
            if (r4 == 0) goto L5e
            java.lang.Object r8 = r6.D
            boolean r0 = r8 instanceof androidx.appcompat.app.AppCompatActivity
            if (r0 == 0) goto L5e
            androidx.appcompat.app.AppCompatActivity r8 = (androidx.appcompat.app.AppCompatActivity) r8
            r8.w0(r7)
        L5e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.W0(int, boolean):boolean");
    }

    private int X() {
        int i5 = this.f263n0;
        return i5 != -100 ? i5 : androidx.appcompat.app.e.o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void X0(int i5, boolean z5, @q0 Configuration configuration) {
        Resources resources = this.E.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i5 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            androidx.appcompat.app.m.a(resources);
        }
        int i6 = this.f264o0;
        if (i6 != 0) {
            this.E.setTheme(i6);
            this.E.getTheme().applyStyle(this.f264o0, true);
        }
        if (z5) {
            Object obj = this.D;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof a0) {
                    if (((a0) activity).getLifecycle().b().isAtLeast(t.c.STARTED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else if (this.f261l0) {
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    private void Z0(View view) {
        view.setBackgroundColor((y1.C0(view) & 8192) != 0 ? androidx.core.content.d.f(this.E, a.e.f21694g) : androidx.core.content.d.f(this.E, a.e.f21692f));
    }

    private void a0() {
        q qVar = this.f267r0;
        if (qVar != null) {
            qVar.a();
        }
        q qVar2 = this.f268s0;
        if (qVar2 != null) {
            qVar2.a();
        }
    }

    @o0
    private Configuration d0(@o0 Context context, int i5, @q0 Configuration configuration) {
        int i6 = i5 != 1 ? i5 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i6 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    private ViewGroup e0() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.E.obtainStyledAttributes(a.n.f22195f1);
        int i5 = a.n.f22282t3;
        if (!obtainStyledAttributes.hasValue(i5)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(a.n.C3, false)) {
            I(1);
        } else if (obtainStyledAttributes.getBoolean(i5, false)) {
            I(108);
        }
        if (obtainStyledAttributes.getBoolean(a.n.f22288u3, false)) {
            I(109);
        }
        if (obtainStyledAttributes.getBoolean(a.n.f22294v3, false)) {
            I(10);
        }
        this.f253d0 = obtainStyledAttributes.getBoolean(a.n.f22202g1, false);
        obtainStyledAttributes.recycle();
        k0();
        this.F.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.E);
        if (this.f254e0) {
            viewGroup = this.f252c0 ? (ViewGroup) from.inflate(a.k.f21966w, (ViewGroup) null) : (ViewGroup) from.inflate(a.k.f21965v, (ViewGroup) null);
        } else if (this.f253d0) {
            viewGroup = (ViewGroup) from.inflate(a.k.f21956m, (ViewGroup) null);
            this.f251b0 = false;
            this.f250a0 = false;
        } else if (this.f250a0) {
            TypedValue typedValue = new TypedValue();
            this.E.getTheme().resolveAttribute(a.c.f21583j, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new androidx.appcompat.view.d(this.E, typedValue.resourceId) : this.E).inflate(a.k.f21967x, (ViewGroup) null);
            x xVar = (x) viewGroup.findViewById(a.h.f21891m0);
            this.L = xVar;
            xVar.k(u0());
            if (this.f251b0) {
                this.L.s(109);
            }
            if (this.Y) {
                this.L.s(2);
            }
            if (this.Z) {
                this.L.s(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f250a0 + ", windowActionBarOverlay: " + this.f251b0 + ", android:windowIsFloating: " + this.f253d0 + ", windowActionModeOverlay: " + this.f252c0 + ", windowNoTitle: " + this.f254e0 + " }");
        }
        y1.a2(viewGroup, new c());
        if (this.L == null) {
            this.W = (TextView) viewGroup.findViewById(a.h.L1);
        }
        g1.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(a.h.I);
        ViewGroup viewGroup2 = (ViewGroup) this.F.findViewById(R.id.content);
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
        this.F.setContentView(viewGroup);
        contentFrameLayout.h(new e());
        return viewGroup;
    }

    private void j0() {
        if (this.U) {
            return;
        }
        this.V = e0();
        CharSequence t02 = t0();
        if (!TextUtils.isEmpty(t02)) {
            x xVar = this.L;
            if (xVar != null) {
                xVar.e(t02);
            } else if (M0() != null) {
                M0().A0(t02);
            } else {
                TextView textView = this.W;
                if (textView != null) {
                    textView.setText(t02);
                }
            }
        }
        V();
        K0(this.V);
        this.U = true;
        PanelFeatureState r02 = r0(0, false);
        if (this.f262m0) {
            return;
        }
        if (r02 == null || r02.f285j == null) {
            z0(108);
        }
    }

    private void k0() {
        if (this.F == null) {
            Object obj = this.D;
            if (obj instanceof Activity) {
                W(((Activity) obj).getWindow());
            }
        }
        if (this.F == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    @o0
    private static Configuration m0(@o0 Configuration configuration, @q0 Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f6 = configuration.fontScale;
            float f7 = configuration2.fontScale;
            if (f6 != f7) {
                configuration3.fontScale = f7;
            }
            int i5 = configuration.mcc;
            int i6 = configuration2.mcc;
            if (i5 != i6) {
                configuration3.mcc = i6;
            }
            int i7 = configuration.mnc;
            int i8 = configuration2.mnc;
            if (i7 != i8) {
                configuration3.mnc = i8;
            }
            int i9 = Build.VERSION.SDK_INT;
            m.a(configuration, configuration2, configuration3);
            int i10 = configuration.touchscreen;
            int i11 = configuration2.touchscreen;
            if (i10 != i11) {
                configuration3.touchscreen = i11;
            }
            int i12 = configuration.keyboard;
            int i13 = configuration2.keyboard;
            if (i12 != i13) {
                configuration3.keyboard = i13;
            }
            int i14 = configuration.keyboardHidden;
            int i15 = configuration2.keyboardHidden;
            if (i14 != i15) {
                configuration3.keyboardHidden = i15;
            }
            int i16 = configuration.navigation;
            int i17 = configuration2.navigation;
            if (i16 != i17) {
                configuration3.navigation = i17;
            }
            int i18 = configuration.navigationHidden;
            int i19 = configuration2.navigationHidden;
            if (i18 != i19) {
                configuration3.navigationHidden = i19;
            }
            int i20 = configuration.orientation;
            int i21 = configuration2.orientation;
            if (i20 != i21) {
                configuration3.orientation = i21;
            }
            int i22 = configuration.screenLayout & 15;
            int i23 = configuration2.screenLayout;
            if (i22 != (i23 & 15)) {
                configuration3.screenLayout |= i23 & 15;
            }
            int i24 = configuration.screenLayout & 192;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & 192)) {
                configuration3.screenLayout |= i25 & 192;
            }
            int i26 = configuration.screenLayout & 48;
            int i27 = configuration2.screenLayout;
            if (i26 != (i27 & 48)) {
                configuration3.screenLayout |= i27 & 48;
            }
            int i28 = configuration.screenLayout & 768;
            int i29 = configuration2.screenLayout;
            if (i28 != (i29 & 768)) {
                configuration3.screenLayout |= i29 & 768;
            }
            if (i9 >= 26) {
                n.a(configuration, configuration2, configuration3);
            }
            int i30 = configuration.uiMode & 15;
            int i31 = configuration2.uiMode;
            if (i30 != (i31 & 15)) {
                configuration3.uiMode |= i31 & 15;
            }
            int i32 = configuration.uiMode & 48;
            int i33 = configuration2.uiMode;
            if (i32 != (i33 & 48)) {
                configuration3.uiMode |= i33 & 48;
            }
            int i34 = configuration.screenWidthDp;
            int i35 = configuration2.screenWidthDp;
            if (i34 != i35) {
                configuration3.screenWidthDp = i35;
            }
            int i36 = configuration.screenHeightDp;
            int i37 = configuration2.screenHeightDp;
            if (i36 != i37) {
                configuration3.screenHeightDp = i37;
            }
            int i38 = configuration.smallestScreenWidthDp;
            int i39 = configuration2.smallestScreenWidthDp;
            if (i38 != i39) {
                configuration3.smallestScreenWidthDp = i39;
            }
            k.b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    private q o0(@o0 Context context) {
        if (this.f268s0 == null) {
            this.f268s0 = new p(context);
        }
        return this.f268s0;
    }

    private q q0(@o0 Context context) {
        if (this.f267r0 == null) {
            this.f267r0 = new r(androidx.appcompat.app.p.a(context));
        }
        return this.f267r0;
    }

    private void v0() {
        j0();
        if (this.f250a0 && this.I == null) {
            Object obj = this.D;
            if (obj instanceof Activity) {
                this.I = new androidx.appcompat.app.q((Activity) this.D, this.f251b0);
            } else if (obj instanceof Dialog) {
                this.I = new androidx.appcompat.app.q((Dialog) this.D);
            }
            ActionBar actionBar = this.I;
            if (actionBar != null) {
                actionBar.W(this.f272w0);
            }
        }
    }

    private boolean w0(PanelFeatureState panelFeatureState) {
        View view = panelFeatureState.f284i;
        if (view != null) {
            panelFeatureState.f283h = view;
            return true;
        }
        if (panelFeatureState.f285j == null) {
            return false;
        }
        if (this.N == null) {
            this.N = new u();
        }
        View view2 = (View) panelFeatureState.c(this.N);
        panelFeatureState.f283h = view2;
        return view2 != null;
    }

    private boolean x0(PanelFeatureState panelFeatureState) {
        panelFeatureState.h(n0());
        panelFeatureState.f282g = new t(panelFeatureState.f287l);
        panelFeatureState.f278c = 81;
        return true;
    }

    private boolean y0(PanelFeatureState panelFeatureState) {
        Resources.Theme theme;
        Context context = this.E;
        int i5 = panelFeatureState.f276a;
        if ((i5 == 0 || i5 == 108) && this.L != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(a.c.f21583j, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(a.c.f21589k, typedValue, true);
            } else {
                theme2.resolveAttribute(a.c.f21589k, typedValue, true);
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
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        gVar.X(this);
        panelFeatureState.g(gVar);
        return true;
    }

    private void z0(int i5) {
        this.f270u0 = (1 << i5) | this.f270u0;
        if (this.f269t0) {
            return;
        }
        y1.p1(this.F.getDecorView(), this.f271v0);
        this.f269t0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    @Override // androidx.appcompat.app.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.D
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.e.G(r3)
        L9:
            boolean r0 = r3.f269t0
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.F
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f271v0
            r0.removeCallbacks(r1)
        L18:
            r0 = 0
            r3.f261l0 = r0
            r0 = 1
            r3.f262m0 = r0
            int r0 = r3.f263n0
            r1 = -100
            if (r0 == r1) goto L48
            java.lang.Object r0 = r3.D
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L48
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L48
            androidx.collection.i<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.AppCompatDelegateImpl.B0
            java.lang.Object r1 = r3.D
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f263n0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L57
        L48:
            androidx.collection.i<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.AppCompatDelegateImpl.B0
            java.lang.Object r1 = r3.D
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L57:
            androidx.appcompat.app.ActionBar r0 = r3.I
            if (r0 == 0) goto L5e
            r0.I()
        L5e:
            r3.a0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.A():void");
    }

    @Override // androidx.appcompat.app.e
    public void B(Bundle bundle) {
        j0();
    }

    int B0(@o0 Context context, int i5) {
        if (i5 == -100) {
            return -1;
        }
        if (i5 != -1) {
            if (i5 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return q0(context).c();
            }
            if (i5 != 1 && i5 != 2) {
                if (i5 == 3) {
                    return o0(context).c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i5;
    }

    @Override // androidx.appcompat.app.e
    public void C() {
        ActionBar s5 = s();
        if (s5 != null) {
            s5.t0(true);
        }
    }

    boolean C0() {
        androidx.appcompat.view.b bVar = this.O;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        ActionBar s5 = s();
        return s5 != null && s5.l();
    }

    @Override // androidx.appcompat.app.e
    public void D(Bundle bundle) {
    }

    boolean D0(int i5, KeyEvent keyEvent) {
        if (i5 == 4) {
            this.f258i0 = (keyEvent.getFlags() & 128) != 0;
        } else if (i5 == 82) {
            E0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.e
    public void E() {
        this.f261l0 = true;
        e();
    }

    @Override // androidx.appcompat.app.e
    public void F() {
        this.f261l0 = false;
        ActionBar s5 = s();
        if (s5 != null) {
            s5.t0(false);
        }
    }

    boolean F0(int i5, KeyEvent keyEvent) {
        ActionBar s5 = s();
        if (s5 != null && s5.J(i5, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.f257h0;
        if (panelFeatureState != null && N0(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            PanelFeatureState panelFeatureState2 = this.f257h0;
            if (panelFeatureState2 != null) {
                panelFeatureState2.f289n = true;
            }
            return true;
        }
        if (this.f257h0 == null) {
            PanelFeatureState r02 = r0(0, true);
            O0(r02, keyEvent);
            boolean N0 = N0(r02, keyEvent.getKeyCode(), keyEvent, 1);
            r02.f288m = false;
            if (N0) {
                return true;
            }
        }
        return false;
    }

    boolean G0(int i5, KeyEvent keyEvent) {
        if (i5 == 4) {
            boolean z5 = this.f258i0;
            this.f258i0 = false;
            PanelFeatureState r02 = r0(0, false);
            if (r02 != null && r02.f290o) {
                if (!z5) {
                    c0(r02, true);
                }
                return true;
            }
            if (C0()) {
                return true;
            }
        } else if (i5 == 82) {
            H0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.e
    public boolean I(int i5) {
        int Q0 = Q0(i5);
        if (this.f254e0 && Q0 == 108) {
            return false;
        }
        if (this.f250a0 && Q0 == 1) {
            this.f250a0 = false;
        }
        if (Q0 == 1) {
            U0();
            this.f254e0 = true;
            return true;
        }
        if (Q0 == 2) {
            U0();
            this.Y = true;
            return true;
        }
        if (Q0 == 5) {
            U0();
            this.Z = true;
            return true;
        }
        if (Q0 == 10) {
            U0();
            this.f252c0 = true;
            return true;
        }
        if (Q0 == 108) {
            U0();
            this.f250a0 = true;
            return true;
        }
        if (Q0 != 109) {
            return this.F.requestFeature(Q0);
        }
        U0();
        this.f251b0 = true;
        return true;
    }

    void I0(int i5) {
        ActionBar s5;
        if (i5 != 108 || (s5 = s()) == null) {
            return;
        }
        s5.m(true);
    }

    void J0(int i5) {
        if (i5 == 108) {
            ActionBar s5 = s();
            if (s5 != null) {
                s5.m(false);
                return;
            }
            return;
        }
        if (i5 == 0) {
            PanelFeatureState r02 = r0(i5, true);
            if (r02.f290o) {
                c0(r02, false);
            }
        }
    }

    @Override // androidx.appcompat.app.e
    public void K(int i5) {
        j0();
        ViewGroup viewGroup = (ViewGroup) this.V.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.E).inflate(i5, viewGroup);
        this.G.a().onContentChanged();
    }

    void K0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.e
    public void L(View view) {
        j0();
        ViewGroup viewGroup = (ViewGroup) this.V.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.G.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.e
    public void M(View view, ViewGroup.LayoutParams layoutParams) {
        j0();
        ViewGroup viewGroup = (ViewGroup) this.V.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.G.a().onContentChanged();
    }

    final ActionBar M0() {
        return this.I;
    }

    @Override // androidx.appcompat.app.e
    public void O(boolean z5) {
        this.T = z5;
    }

    @Override // androidx.appcompat.app.e
    @x0(17)
    public void P(int i5) {
        if (this.f263n0 != i5) {
            this.f263n0 = i5;
            if (this.f259j0) {
                e();
            }
        }
    }

    @Override // androidx.appcompat.app.e
    public void Q(Toolbar toolbar) {
        if (this.D instanceof Activity) {
            ActionBar s5 = s();
            if (s5 instanceof androidx.appcompat.app.q) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.J = null;
            if (s5 != null) {
                s5.I();
            }
            if (toolbar != null) {
                androidx.appcompat.app.n nVar = new androidx.appcompat.app.n(toolbar, t0(), this.G);
                this.I = nVar;
                this.F.setCallback(nVar.f388k);
            } else {
                this.I = null;
                this.F.setCallback(this.G);
            }
            v();
        }
    }

    @Override // androidx.appcompat.app.e
    public void R(@h1 int i5) {
        this.f264o0 = i5;
    }

    final boolean R0() {
        ViewGroup viewGroup;
        return this.U && (viewGroup = this.V) != null && y1.U0(viewGroup);
    }

    @Override // androidx.appcompat.app.e
    public final void S(CharSequence charSequence) {
        this.K = charSequence;
        x xVar = this.L;
        if (xVar != null) {
            xVar.e(charSequence);
            return;
        }
        if (M0() != null) {
            M0().A0(charSequence);
            return;
        }
        TextView textView = this.W;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.app.e
    public androidx.appcompat.view.b T(@o0 b.a aVar) {
        androidx.appcompat.app.d dVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        androidx.appcompat.view.b bVar = this.O;
        if (bVar != null) {
            bVar.c();
        }
        j jVar = new j(aVar);
        ActionBar s5 = s();
        if (s5 != null) {
            androidx.appcompat.view.b C02 = s5.C0(jVar);
            this.O = C02;
            if (C02 != null && (dVar = this.H) != null) {
                dVar.i(C02);
            }
        }
        if (this.O == null) {
            this.O = T0(jVar);
        }
        return this.O;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.appcompat.view.b T0(@androidx.annotation.o0 androidx.appcompat.view.b.a r8) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.T0(androidx.appcompat.view.b$a):androidx.appcompat.view.b");
    }

    void Y(int i5, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i5 >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.f256g0;
                if (i5 < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i5];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f285j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f290o) && !this.f262m0) {
            this.G.a().onPanelClosed(i5, menu);
        }
    }

    final int Y0(@q0 v4 v4Var, @q0 Rect rect) {
        boolean z5;
        boolean z6;
        int r5 = v4Var != null ? v4Var.r() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.P;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z5 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.P.getLayoutParams();
            if (this.P.isShown()) {
                if (this.f273x0 == null) {
                    this.f273x0 = new Rect();
                    this.f274y0 = new Rect();
                }
                Rect rect2 = this.f273x0;
                Rect rect3 = this.f274y0;
                if (v4Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(v4Var.p(), v4Var.r(), v4Var.q(), v4Var.o());
                }
                g1.a(this.V, rect2, rect3);
                int i5 = rect2.top;
                int i6 = rect2.left;
                int i7 = rect2.right;
                v4 o02 = y1.o0(this.V);
                int p5 = o02 == null ? 0 : o02.p();
                int q5 = o02 == null ? 0 : o02.q();
                if (marginLayoutParams.topMargin == i5 && marginLayoutParams.leftMargin == i6 && marginLayoutParams.rightMargin == i7) {
                    z6 = false;
                } else {
                    marginLayoutParams.topMargin = i5;
                    marginLayoutParams.leftMargin = i6;
                    marginLayoutParams.rightMargin = i7;
                    z6 = true;
                }
                if (i5 <= 0 || this.X != null) {
                    View view = this.X;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i8 = marginLayoutParams2.height;
                        int i9 = marginLayoutParams.topMargin;
                        if (i8 != i9 || marginLayoutParams2.leftMargin != p5 || marginLayoutParams2.rightMargin != q5) {
                            marginLayoutParams2.height = i9;
                            marginLayoutParams2.leftMargin = p5;
                            marginLayoutParams2.rightMargin = q5;
                            this.X.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.E);
                    this.X = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = p5;
                    layoutParams.rightMargin = q5;
                    this.V.addView(this.X, -1, layoutParams);
                }
                View view3 = this.X;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    Z0(this.X);
                }
                if (!this.f252c0 && r5) {
                    r5 = 0;
                }
                z5 = r5;
                r5 = z6;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z5 = false;
            } else {
                z5 = false;
                r5 = false;
            }
            if (r5) {
                this.P.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.X;
        if (view4 != null) {
            view4.setVisibility(z5 ? 0 : 8);
        }
        return r5;
    }

    void Z(@o0 androidx.appcompat.view.menu.g gVar) {
        if (this.f255f0) {
            return;
        }
        this.f255f0 = true;
        this.L.t();
        Window.Callback u02 = u0();
        if (u02 != null && !this.f262m0) {
            u02.onPanelClosed(108, gVar);
        }
        this.f255f0 = false;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(@o0 androidx.appcompat.view.menu.g gVar, @o0 MenuItem menuItem) {
        PanelFeatureState l02;
        Window.Callback u02 = u0();
        if (u02 == null || this.f262m0 || (l02 = l0(gVar.G())) == null) {
            return false;
        }
        return u02.onMenuItemSelected(l02.f276a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(@o0 androidx.appcompat.view.menu.g gVar) {
        P0(true);
    }

    void b0(int i5) {
        c0(r0(i5, true), true);
    }

    void c0(PanelFeatureState panelFeatureState, boolean z5) {
        ViewGroup viewGroup;
        x xVar;
        if (z5 && panelFeatureState.f276a == 0 && (xVar = this.L) != null && xVar.f()) {
            Z(panelFeatureState.f285j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.E.getSystemService("window");
        if (windowManager != null && panelFeatureState.f290o && (viewGroup = panelFeatureState.f282g) != null) {
            windowManager.removeView(viewGroup);
            if (z5) {
                Y(panelFeatureState.f276a, panelFeatureState, null);
            }
        }
        panelFeatureState.f288m = false;
        panelFeatureState.f289n = false;
        panelFeatureState.f290o = false;
        panelFeatureState.f283h = null;
        panelFeatureState.f292q = true;
        if (this.f257h0 == panelFeatureState) {
            this.f257h0 = null;
        }
    }

    @Override // androidx.appcompat.app.e
    public void d(View view, ViewGroup.LayoutParams layoutParams) {
        j0();
        ((ViewGroup) this.V.findViewById(R.id.content)).addView(view, layoutParams);
        this.G.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.e
    public boolean e() {
        return U(true);
    }

    void f0() {
        androidx.appcompat.view.menu.g gVar;
        x xVar = this.L;
        if (xVar != null) {
            xVar.t();
        }
        if (this.Q != null) {
            this.F.getDecorView().removeCallbacks(this.R);
            if (this.Q.isShowing()) {
                try {
                    this.Q.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.Q = null;
        }
        i0();
        PanelFeatureState r02 = r0(0, false);
        if (r02 == null || (gVar = r02.f285j) == null) {
            return;
        }
        gVar.close();
    }

    boolean g0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.D;
        if (((obj instanceof f0.a) || (obj instanceof androidx.appcompat.app.h)) && (decorView = this.F.getDecorView()) != null && f0.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.G.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? D0(keyCode, keyEvent) : G0(keyCode, keyEvent);
    }

    @Override // androidx.appcompat.app.e
    @androidx.annotation.i
    @o0
    public Context h(@o0 Context context) {
        this.f259j0 = true;
        int B02 = B0(context, X());
        if (F0 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(d0(context, B02, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof androidx.appcompat.view.d) {
            try {
                ((androidx.appcompat.view.d) context).a(d0(context, B02, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!E0) {
            g(context);
            return context;
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration d02 = d0(context, B02, configuration2.equals(configuration3) ? null : m0(configuration2, configuration3));
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, a.m.f22043g4);
        dVar.a(d02);
        boolean z5 = false;
        try {
            z5 = context.getTheme() != null;
        } catch (NullPointerException unused3) {
        }
        if (z5) {
            i.h.a(dVar.getTheme());
        }
        g(dVar);
        return dVar;
    }

    void h0(int i5) {
        PanelFeatureState r02;
        PanelFeatureState r03 = r0(i5, true);
        if (r03.f285j != null) {
            Bundle bundle = new Bundle();
            r03.f285j.V(bundle);
            if (bundle.size() > 0) {
                r03.f296u = bundle;
            }
            r03.f285j.m0();
            r03.f285j.clear();
        }
        r03.f293r = true;
        r03.f292q = true;
        if ((i5 != 108 && i5 != 0) || this.L == null || (r02 = r0(0, false)) == null) {
            return;
        }
        r02.f288m = false;
        O0(r02, null);
    }

    void i0() {
        r3 r3Var = this.S;
        if (r3Var != null) {
            r3Var.d();
        }
    }

    PanelFeatureState l0(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.f256g0;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i5 = 0; i5 < length; i5++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i5];
            if (panelFeatureState != null && panelFeatureState.f285j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.app.e
    public View m(View view, String str, @o0 Context context, @o0 AttributeSet attributeSet) {
        boolean z5;
        boolean z6 = false;
        if (this.f275z0 == null) {
            String string = this.E.obtainStyledAttributes(a.n.f22195f1).getString(a.n.f22276s3);
            if (string == null) {
                this.f275z0 = new androidx.appcompat.app.j();
            } else {
                try {
                    this.f275z0 = (androidx.appcompat.app.j) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable unused) {
                    this.f275z0 = new androidx.appcompat.app.j();
                }
            }
        }
        boolean z7 = C0;
        if (z7) {
            if (this.A0 == null) {
                this.A0 = new androidx.appcompat.app.k();
            }
            if (this.A0.a(attributeSet)) {
                z5 = true;
                return this.f275z0.q(view, str, context, attributeSet, z5, z7, true, f1.c());
            }
            if (!(attributeSet instanceof XmlPullParser)) {
                z6 = S0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z6 = true;
            }
        }
        z5 = z6;
        return this.f275z0.q(view, str, context, attributeSet, z5, z7, true, f1.c());
    }

    @Override // androidx.appcompat.app.e
    @q0
    public <T extends View> T n(@d0 int i5) {
        j0();
        return (T) this.F.findViewById(i5);
    }

    final Context n0() {
        ActionBar s5 = s();
        Context z5 = s5 != null ? s5.z() : null;
        return z5 == null ? this.E : z5;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.e
    public final a.b p() {
        return new h();
    }

    @c1({c1.a.LIBRARY})
    @o0
    @m1
    final q p0() {
        return q0(this.E);
    }

    @Override // androidx.appcompat.app.e
    public int q() {
        return this.f263n0;
    }

    @Override // androidx.appcompat.app.e
    public MenuInflater r() {
        if (this.J == null) {
            v0();
            ActionBar actionBar = this.I;
            this.J = new androidx.appcompat.view.h(actionBar != null ? actionBar.z() : this.E);
        }
        return this.J;
    }

    protected PanelFeatureState r0(int i5, boolean z5) {
        PanelFeatureState[] panelFeatureStateArr = this.f256g0;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i5) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i5 + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f256g0 = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i5];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i5);
        panelFeatureStateArr[i5] = panelFeatureState2;
        return panelFeatureState2;
    }

    @Override // androidx.appcompat.app.e
    public ActionBar s() {
        v0();
        return this.I;
    }

    ViewGroup s0() {
        return this.V;
    }

    @Override // androidx.appcompat.app.e
    public boolean t(int i5) {
        int Q0 = Q0(i5);
        return (Q0 != 1 ? Q0 != 2 ? Q0 != 5 ? Q0 != 10 ? Q0 != 108 ? Q0 != 109 ? false : this.f251b0 : this.f250a0 : this.f252c0 : this.Z : this.Y : this.f254e0) || this.F.hasFeature(i5);
    }

    final CharSequence t0() {
        Object obj = this.D;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.K;
    }

    @Override // androidx.appcompat.app.e
    public void u() {
        LayoutInflater from = LayoutInflater.from(this.E);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            boolean z5 = from.getFactory2() instanceof AppCompatDelegateImpl;
        }
    }

    final Window.Callback u0() {
        return this.F.getCallback();
    }

    @Override // androidx.appcompat.app.e
    public void v() {
        ActionBar s5 = s();
        if (s5 == null || !s5.C()) {
            z0(0);
        }
    }

    @Override // androidx.appcompat.app.e
    public boolean x() {
        return this.T;
    }

    @Override // androidx.appcompat.app.e
    public void y(Configuration configuration) {
        ActionBar s5;
        if (this.f250a0 && this.U && (s5 = s()) != null) {
            s5.H(configuration);
        }
        androidx.appcompat.widget.f.b().g(this.E);
        U(false);
    }

    @Override // androidx.appcompat.app.e
    public void z(Bundle bundle) {
        String str;
        this.f259j0 = true;
        U(false);
        k0();
        Object obj = this.D;
        if (obj instanceof Activity) {
            try {
                str = z.d((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                ActionBar M0 = M0();
                if (M0 == null) {
                    this.f272w0 = true;
                } else {
                    M0.W(true);
                }
            }
            androidx.appcompat.app.e.c(this);
        }
        this.f260k0 = true;
    }

    AppCompatDelegateImpl(Dialog dialog, androidx.appcompat.app.d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    AppCompatDelegateImpl(Context context, Window window, androidx.appcompat.app.d dVar) {
        this(context, window, dVar, context);
    }

    AppCompatDelegateImpl(Context context, Activity activity, androidx.appcompat.app.d dVar) {
        this(context, null, dVar, activity);
    }

    private AppCompatDelegateImpl(Context context, Window window, androidx.appcompat.app.d dVar, Object obj) {
        androidx.collection.i<String, Integer> iVar;
        Integer num;
        AppCompatActivity V0;
        this.S = null;
        this.T = true;
        this.f263n0 = -100;
        this.f271v0 = new b();
        this.E = context;
        this.H = dVar;
        this.D = obj;
        if (this.f263n0 == -100 && (obj instanceof Dialog) && (V0 = V0()) != null) {
            this.f263n0 = V0.s0().q();
        }
        if (this.f263n0 == -100 && (num = (iVar = B0).get(obj.getClass().getName())) != null) {
            this.f263n0 = num.intValue();
            iVar.remove(obj.getClass().getName());
        }
        if (window != null) {
            W(window);
        }
        androidx.appcompat.widget.f.i();
    }
}
