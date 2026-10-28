package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.c1;
import androidx.annotation.h1;
import androidx.annotation.j0;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.s0;
import androidx.annotation.x0;
import androidx.appcompat.app.a;
import androidx.appcompat.app.v;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d1;
import androidx.core.os.b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: AppCompatDelegate.java */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: b, reason: collision with root package name */
    static final boolean f916b = false;

    /* renamed from: e, reason: collision with root package name */
    public static final int f919e = -1;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f920f = 0;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final int f921g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f922h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static final int f923i = 2;

    /* renamed from: j, reason: collision with root package name */
    public static final int f924j = 3;

    /* renamed from: k, reason: collision with root package name */
    public static final int f925k = -100;

    /* renamed from: t, reason: collision with root package name */
    public static final int f934t = 108;

    /* renamed from: u, reason: collision with root package name */
    public static final int f935u = 109;

    /* renamed from: v, reason: collision with root package name */
    public static final int f936v = 10;

    /* renamed from: c, reason: collision with root package name */
    static final String f917c = "AppCompatDelegate";

    /* renamed from: d, reason: collision with root package name */
    static v.a f918d = new v.a(new v.b());

    /* renamed from: l, reason: collision with root package name */
    private static int f926l = -100;

    /* renamed from: m, reason: collision with root package name */
    private static androidx.core.os.p f927m = null;

    /* renamed from: n, reason: collision with root package name */
    private static androidx.core.os.p f928n = null;

    /* renamed from: o, reason: collision with root package name */
    private static Boolean f929o = null;

    /* renamed from: p, reason: collision with root package name */
    private static boolean f930p = false;

    /* renamed from: q, reason: collision with root package name */
    private static final androidx.collection.d<WeakReference<g>> f931q = new androidx.collection.d<>();

    /* renamed from: r, reason: collision with root package name */
    private static final Object f932r = new Object();

    /* renamed from: s, reason: collision with root package name */
    private static final Object f933s = new Object();

    /* compiled from: AppCompatDelegate.java */
    @x0(24)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* compiled from: AppCompatDelegate.java */
    @x0(33)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        @androidx.annotation.u
        static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* compiled from: AppCompatDelegate.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    g() {
    }

    @q0
    static androidx.core.os.p A() {
        return f927m;
    }

    @q0
    static androidx.core.os.p B() {
        return f928n;
    }

    static boolean G(Context context) {
        if (f929o == null) {
            try {
                Bundle bundle = AppLocalesMetadataHolderService.a(context).metaData;
                if (bundle != null) {
                    f929o = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f929o = Boolean.FALSE;
            }
        }
        return f929o.booleanValue();
    }

    public static boolean H() {
        return d1.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void K(Context context) {
        v.c(context);
        f930p = true;
    }

    static void T(@o0 g gVar) {
        synchronized (f932r) {
            U(gVar);
        }
    }

    private static void U(@o0 g gVar) {
        synchronized (f932r) {
            try {
                Iterator<WeakReference<g>> it = f931q.iterator();
                while (it.hasNext()) {
                    g gVar2 = it.next().get();
                    if (gVar2 == gVar || gVar2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @m1
    static void W() {
        f927m = null;
        f928n = null;
    }

    @s0(markerClass = {b.InterfaceC0422b.class})
    public static void X(@o0 androidx.core.os.p pVar) {
        Objects.requireNonNull(pVar);
        if (androidx.core.os.b.k()) {
            Object y4 = y();
            if (y4 != null) {
                b.b(y4, a.a(pVar.m()));
                return;
            }
            return;
        }
        if (pVar.equals(f927m)) {
            return;
        }
        synchronized (f932r) {
            f927m = pVar;
            j();
        }
    }

    public static void Y(boolean z4) {
        d1.c(z4);
    }

    public static void c0(int i4) {
        if ((i4 == -1 || i4 == 0 || i4 == 1 || i4 == 2 || i4 == 3) && f926l != i4) {
            f926l = i4;
            i();
        }
    }

    static void e(@o0 g gVar) {
        synchronized (f932r) {
            U(gVar);
            f931q.add(new WeakReference<>(gVar));
        }
    }

    @m1
    static void e0(boolean z4) {
        f929o = Boolean.valueOf(z4);
    }

    private static void i() {
        synchronized (f932r) {
            try {
                Iterator<WeakReference<g>> it = f931q.iterator();
                while (it.hasNext()) {
                    g gVar = it.next().get();
                    if (gVar != null) {
                        gVar.h();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void j() {
        Iterator<WeakReference<g>> it = f931q.iterator();
        while (it.hasNext()) {
            g gVar = it.next().get();
            if (gVar != null) {
                gVar.g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @s0(markerClass = {b.InterfaceC0422b.class})
    public static void l0(final Context context) {
        if (G(context)) {
            if (androidx.core.os.b.k()) {
                if (f930p) {
                    return;
                }
                f918d.execute(new Runnable() { // from class: androidx.appcompat.app.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.K(context);
                    }
                });
                return;
            }
            synchronized (f933s) {
                try {
                    androidx.core.os.p pVar = f927m;
                    if (pVar == null) {
                        if (f928n == null) {
                            f928n = androidx.core.os.p.c(v.b(context));
                        }
                        if (f928n.j()) {
                        } else {
                            f927m = f928n;
                        }
                    } else if (!pVar.equals(f928n)) {
                        androidx.core.os.p pVar2 = f927m;
                        f928n = pVar2;
                        v.a(context, pVar2.m());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @o0
    public static g n(@o0 Activity activity, @q0 d dVar) {
        return new AppCompatDelegateImpl(activity, dVar);
    }

    @o0
    public static g o(@o0 Dialog dialog, @q0 d dVar) {
        return new AppCompatDelegateImpl(dialog, dVar);
    }

    @o0
    public static g p(@o0 Context context, @o0 Activity activity, @q0 d dVar) {
        return new AppCompatDelegateImpl(context, activity, dVar);
    }

    @o0
    public static g q(@o0 Context context, @o0 Window window, @q0 d dVar) {
        return new AppCompatDelegateImpl(context, window, dVar);
    }

    @androidx.annotation.d
    @o0
    @s0(markerClass = {b.InterfaceC0422b.class})
    public static androidx.core.os.p t() {
        if (androidx.core.os.b.k()) {
            Object y4 = y();
            if (y4 != null) {
                return androidx.core.os.p.o(b.a(y4));
            }
        } else {
            androidx.core.os.p pVar = f927m;
            if (pVar != null) {
                return pVar;
            }
        }
        return androidx.core.os.p.g();
    }

    public static int v() {
        return f926l;
    }

    @x0(33)
    static Object y() {
        Context u4;
        Iterator<WeakReference<g>> it = f931q.iterator();
        while (it.hasNext()) {
            g gVar = it.next().get();
            if (gVar != null && (u4 = gVar.u()) != null) {
                return u4.getSystemService("locale");
            }
        }
        return null;
    }

    @q0
    public abstract ActionBar C();

    public abstract boolean D(int i4);

    public abstract void E();

    public abstract void F();

    public abstract boolean I();

    public abstract void L(Configuration configuration);

    public abstract void M(Bundle bundle);

    public abstract void N();

    public abstract void O(Bundle bundle);

    public abstract void P();

    public abstract void Q(Bundle bundle);

    public abstract void R();

    public abstract void S();

    public abstract boolean V(int i4);

    public abstract void Z(@j0 int i4);

    public abstract void a0(View view);

    public abstract void b0(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void d0(boolean z4);

    public abstract void f(View view, ViewGroup.LayoutParams layoutParams);

    @x0(17)
    public abstract void f0(int i4);

    boolean g() {
        return false;
    }

    @androidx.annotation.i
    @x0(33)
    public void g0(@q0 OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract boolean h();

    public abstract void h0(@q0 Toolbar toolbar);

    public void i0(@h1 int i4) {
    }

    public abstract void j0(@q0 CharSequence charSequence);

    void k(final Context context) {
        f918d.execute(new Runnable() { // from class: androidx.appcompat.app.f
            @Override // java.lang.Runnable
            public final void run() {
                g.l0(context);
            }
        });
    }

    @q0
    public abstract androidx.appcompat.view.b k0(@o0 b.a aVar);

    @Deprecated
    public void l(Context context) {
    }

    @androidx.annotation.i
    @o0
    public Context m(@o0 Context context) {
        l(context);
        return context;
    }

    public abstract View r(@q0 View view, String str, @o0 Context context, @o0 AttributeSet attributeSet);

    @q0
    public abstract <T extends View> T s(@androidx.annotation.d0 int i4);

    @q0
    public Context u() {
        return null;
    }

    @q0
    public abstract a.b w();

    public int x() {
        return -100;
    }

    public abstract MenuInflater z();
}
