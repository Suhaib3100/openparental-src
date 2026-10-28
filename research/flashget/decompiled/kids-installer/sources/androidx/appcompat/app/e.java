package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.c1;
import androidx.annotation.d0;
import androidx.annotation.h1;
import androidx.annotation.j0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.appcompat.app.a;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.f1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: AppCompatDelegate.java */
/* loaded from: classes.dex */
public abstract class e {
    public static final int A = 108;
    public static final int B = 109;
    public static final int C = 10;

    /* renamed from: o, reason: collision with root package name */
    static final boolean f350o = false;

    /* renamed from: q, reason: collision with root package name */
    public static final int f352q = -1;

    /* renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final int f353r = 0;

    /* renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final int f354s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static final int f355t = 1;

    /* renamed from: u, reason: collision with root package name */
    public static final int f356u = 2;

    /* renamed from: v, reason: collision with root package name */
    public static final int f357v = 3;

    /* renamed from: w, reason: collision with root package name */
    public static final int f358w = -100;

    /* renamed from: x, reason: collision with root package name */
    private static int f359x = -100;

    /* renamed from: p, reason: collision with root package name */
    static final String f351p = "AppCompatDelegate";

    /* renamed from: y, reason: collision with root package name */
    private static final androidx.collection.b<WeakReference<e>> f360y = new androidx.collection.b<>();

    /* renamed from: z, reason: collision with root package name */
    private static final Object f361z = new Object();

    /* compiled from: AppCompatDelegate.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    e() {
    }

    static void G(@o0 e eVar) {
        synchronized (f361z) {
            H(eVar);
        }
    }

    private static void H(@o0 e eVar) {
        synchronized (f361z) {
            Iterator<WeakReference<e>> it = f360y.iterator();
            while (it.hasNext()) {
                e eVar2 = it.next().get();
                if (eVar2 == eVar || eVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public static void J(boolean z5) {
        f1.b(z5);
    }

    public static void N(int i5) {
        if ((i5 == -1 || i5 == 0 || i5 == 1 || i5 == 2 || i5 == 3) && f359x != i5) {
            f359x = i5;
            f();
        }
    }

    static void c(@o0 e eVar) {
        synchronized (f361z) {
            H(eVar);
            f360y.add(new WeakReference<>(eVar));
        }
    }

    private static void f() {
        synchronized (f361z) {
            Iterator<WeakReference<e>> it = f360y.iterator();
            while (it.hasNext()) {
                e eVar = it.next().get();
                if (eVar != null) {
                    eVar.e();
                }
            }
        }
    }

    @o0
    public static e i(@o0 Activity activity, @q0 d dVar) {
        return new AppCompatDelegateImpl(activity, dVar);
    }

    @o0
    public static e j(@o0 Dialog dialog, @q0 d dVar) {
        return new AppCompatDelegateImpl(dialog, dVar);
    }

    @o0
    public static e k(@o0 Context context, @o0 Activity activity, @q0 d dVar) {
        return new AppCompatDelegateImpl(context, activity, dVar);
    }

    @o0
    public static e l(@o0 Context context, @o0 Window window, @q0 d dVar) {
        return new AppCompatDelegateImpl(context, window, dVar);
    }

    public static int o() {
        return f359x;
    }

    public static boolean w() {
        return f1.a();
    }

    public abstract void A();

    public abstract void B(Bundle bundle);

    public abstract void C();

    public abstract void D(Bundle bundle);

    public abstract void E();

    public abstract void F();

    public abstract boolean I(int i5);

    public abstract void K(@j0 int i5);

    public abstract void L(View view);

    public abstract void M(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void O(boolean z5);

    @x0(17)
    public abstract void P(int i5);

    public abstract void Q(@q0 Toolbar toolbar);

    public void R(@h1 int i5) {
    }

    public abstract void S(@q0 CharSequence charSequence);

    @q0
    public abstract androidx.appcompat.view.b T(@o0 b.a aVar);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean e();

    @Deprecated
    public void g(Context context) {
    }

    @androidx.annotation.i
    @o0
    public Context h(@o0 Context context) {
        g(context);
        return context;
    }

    public abstract View m(@q0 View view, String str, @o0 Context context, @o0 AttributeSet attributeSet);

    @q0
    public abstract <T extends View> T n(@d0 int i5);

    @q0
    public abstract a.b p();

    public int q() {
        return -100;
    }

    public abstract MenuInflater r();

    @q0
    public abstract ActionBar s();

    public abstract boolean t(int i5);

    public abstract void u();

    public abstract void v();

    public abstract boolean x();

    public abstract void y(Configuration configuration);

    public abstract void z(Bundle bundle);
}
