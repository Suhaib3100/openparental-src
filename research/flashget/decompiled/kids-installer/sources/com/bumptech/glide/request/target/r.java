package com.bumptech.glide.request.target;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.j;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ViewTarget.java */
@Deprecated
/* loaded from: classes4.dex */
public abstract class r<T extends View, Z> extends com.bumptech.glide.request.target.b<Z> {

    /* renamed from: v, reason: collision with root package name */
    private static boolean f12091v;

    /* renamed from: p, reason: collision with root package name */
    protected final T f12093p;

    /* renamed from: q, reason: collision with root package name */
    private final b f12094q;

    /* renamed from: r, reason: collision with root package name */
    @q0
    private View.OnAttachStateChangeListener f12095r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f12096s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f12097t;

    /* renamed from: u, reason: collision with root package name */
    private static final String f12090u = ProtectedSandApp.s("⯮");

    /* renamed from: w, reason: collision with root package name */
    private static int f12092w = j.e.f10961l;

    /* compiled from: ViewTarget.java */
    /* loaded from: classes.dex */
    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            r.this.m();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            r.this.l();
        }
    }

    /* compiled from: ViewTarget.java */
    @m1
    /* loaded from: classes.dex */
    static final class b {

        /* renamed from: e, reason: collision with root package name */
        private static final int f12099e = 0;

        /* renamed from: f, reason: collision with root package name */
        @q0
        @m1
        static Integer f12100f;

        /* renamed from: a, reason: collision with root package name */
        private final View f12101a;

        /* renamed from: b, reason: collision with root package name */
        private final List<o> f12102b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        boolean f12103c;

        /* renamed from: d, reason: collision with root package name */
        @q0
        private a f12104d;

        /* compiled from: ViewTarget.java */
        private static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: o, reason: collision with root package name */
            private final WeakReference<b> f12105o;

            a(@o0 b bVar) {
                this.f12105o = new WeakReference<>(bVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                Log.isLoggable(ProtectedSandApp.s("Ȝ"), 2);
                b bVar = this.f12105o.get();
                if (bVar == null) {
                    return true;
                }
                bVar.a();
                return true;
            }
        }

        b(@o0 View view) {
            this.f12101a = view;
        }

        private static int c(@o0 Context context) {
            if (f12100f == null) {
                Display defaultDisplay = ((WindowManager) com.bumptech.glide.util.l.d((WindowManager) context.getSystemService(ProtectedSandApp.s("ȝ")))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f12100f = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f12100f.intValue();
        }

        private int e(int i5, int i6, int i7) {
            int i8 = i6 - i7;
            if (i8 > 0) {
                return i8;
            }
            if (this.f12103c && this.f12101a.isLayoutRequested()) {
                return 0;
            }
            int i9 = i5 - i7;
            if (i9 > 0) {
                return i9;
            }
            if (this.f12101a.isLayoutRequested() || i6 != -2) {
                return 0;
            }
            Log.isLoggable(ProtectedSandApp.s("Ȟ"), 4);
            return c(this.f12101a.getContext());
        }

        private int f() {
            int paddingBottom = this.f12101a.getPaddingBottom() + this.f12101a.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = this.f12101a.getLayoutParams();
            return e(this.f12101a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        private int g() {
            int paddingRight = this.f12101a.getPaddingRight() + this.f12101a.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = this.f12101a.getLayoutParams();
            return e(this.f12101a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }

        private boolean h(int i5) {
            return i5 > 0 || i5 == Integer.MIN_VALUE;
        }

        private boolean i(int i5, int i6) {
            return h(i5) && h(i6);
        }

        private void j(int i5, int i6) {
            Iterator it = new ArrayList(this.f12102b).iterator();
            while (it.hasNext()) {
                ((o) it.next()).e(i5, i6);
            }
        }

        void a() {
            if (this.f12102b.isEmpty()) {
                return;
            }
            int g5 = g();
            int f6 = f();
            if (i(g5, f6)) {
                j(g5, f6);
                b();
            }
        }

        void b() {
            ViewTreeObserver viewTreeObserver = this.f12101a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f12104d);
            }
            this.f12104d = null;
            this.f12102b.clear();
        }

        void d(@o0 o oVar) {
            int g5 = g();
            int f6 = f();
            if (i(g5, f6)) {
                oVar.e(g5, f6);
                return;
            }
            if (!this.f12102b.contains(oVar)) {
                this.f12102b.add(oVar);
            }
            if (this.f12104d == null) {
                ViewTreeObserver viewTreeObserver = this.f12101a.getViewTreeObserver();
                a aVar = new a(this);
                this.f12104d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        void k(@o0 o oVar) {
            this.f12102b.remove(oVar);
        }
    }

    public r(@o0 T t5) {
        this.f12093p = (T) com.bumptech.glide.util.l.d(t5);
        this.f12094q = new b(t5);
    }

    @q0
    private Object g() {
        return this.f12093p.getTag(f12092w);
    }

    private void i() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f12095r;
        if (onAttachStateChangeListener == null || this.f12097t) {
            return;
        }
        this.f12093p.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f12097t = true;
    }

    private void j() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f12095r;
        if (onAttachStateChangeListener == null || !this.f12097t) {
            return;
        }
        this.f12093p.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f12097t = false;
    }

    private void r(@q0 Object obj) {
        f12091v = true;
        this.f12093p.setTag(f12092w, obj);
    }

    @Deprecated
    public static void s(int i5) {
        if (f12091v) {
            throw new IllegalArgumentException(ProtectedSandApp.s("⯯"));
        }
        f12092w = i5;
    }

    @Override // com.bumptech.glide.request.target.p
    @androidx.annotation.i
    public void a(@o0 o oVar) {
        this.f12094q.k(oVar);
    }

    @o0
    public T d() {
        return this.f12093p;
    }

    @o0
    public final r<T, Z> f() {
        if (this.f12095r != null) {
            return this;
        }
        this.f12095r = new a();
        i();
        return this;
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    public void h(@q0 com.bumptech.glide.request.e eVar) {
        r(eVar);
    }

    void l() {
        com.bumptech.glide.request.e o5 = o();
        if (o5 != null) {
            this.f12096s = true;
            o5.clear();
            this.f12096s = false;
        }
    }

    void m() {
        com.bumptech.glide.request.e o5 = o();
        if (o5 == null || !o5.f()) {
            return;
        }
        o5.h();
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    @androidx.annotation.i
    public void n(@q0 Drawable drawable) {
        i();
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    @q0
    public com.bumptech.glide.request.e o() {
        Object g5 = g();
        if (g5 == null) {
            return null;
        }
        if (g5 instanceof com.bumptech.glide.request.e) {
            return (com.bumptech.glide.request.e) g5;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("⯰"));
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    @androidx.annotation.i
    public void p(@q0 Drawable drawable) {
        this.f12094q.b();
        if (this.f12096s) {
            return;
        }
        j();
    }

    @Override // com.bumptech.glide.request.target.p
    @androidx.annotation.i
    public void q(@o0 o oVar) {
        this.f12094q.d(oVar);
    }

    @o0
    public final r<T, Z> t() {
        this.f12094q.f12103c = true;
        return this;
    }

    public String toString() {
        return ProtectedSandApp.s("⯱") + this.f12093p;
    }

    @Deprecated
    public r(@o0 T t5, boolean z5) {
        this(t5);
        if (z5) {
            t();
        }
    }
}
