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
import androidx.annotation.d0;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.j;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: CustomViewTarget.java */
/* loaded from: classes3.dex */
public abstract class f<T extends View, Z> implements p<Z> {

    /* renamed from: t, reason: collision with root package name */
    private static final String f12053t = ProtectedSandApp.s("ᱩ");

    /* renamed from: u, reason: collision with root package name */
    @d0
    private static final int f12054u = j.e.f10961l;

    /* renamed from: o, reason: collision with root package name */
    private final b f12055o;

    /* renamed from: p, reason: collision with root package name */
    protected final T f12056p;

    /* renamed from: q, reason: collision with root package name */
    @q0
    private View.OnAttachStateChangeListener f12057q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f12058r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f12059s;

    /* compiled from: CustomViewTarget.java */
    /* loaded from: classes.dex */
    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            f.this.m();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            f.this.l();
        }
    }

    /* compiled from: CustomViewTarget.java */
    @m1
    /* loaded from: classes.dex */
    static final class b {

        /* renamed from: e, reason: collision with root package name */
        private static final int f12061e = 0;

        /* renamed from: f, reason: collision with root package name */
        @q0
        @m1
        static Integer f12062f;

        /* renamed from: a, reason: collision with root package name */
        private final View f12063a;

        /* renamed from: b, reason: collision with root package name */
        private final List<o> f12064b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        boolean f12065c;

        /* renamed from: d, reason: collision with root package name */
        @q0
        private a f12066d;

        /* compiled from: CustomViewTarget.java */
        private static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: o, reason: collision with root package name */
            private final WeakReference<b> f12067o;

            a(@o0 b bVar) {
                this.f12067o = new WeakReference<>(bVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                Log.isLoggable(ProtectedSandApp.s("ȗ"), 2);
                b bVar = this.f12067o.get();
                if (bVar == null) {
                    return true;
                }
                bVar.a();
                return true;
            }
        }

        b(@o0 View view) {
            this.f12063a = view;
        }

        private static int c(@o0 Context context) {
            if (f12062f == null) {
                Display defaultDisplay = ((WindowManager) com.bumptech.glide.util.l.d((WindowManager) context.getSystemService(ProtectedSandApp.s("Ș")))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f12062f = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f12062f.intValue();
        }

        private int e(int i5, int i6, int i7) {
            int i8 = i6 - i7;
            if (i8 > 0) {
                return i8;
            }
            if (this.f12065c && this.f12063a.isLayoutRequested()) {
                return 0;
            }
            int i9 = i5 - i7;
            if (i9 > 0) {
                return i9;
            }
            if (this.f12063a.isLayoutRequested() || i6 != -2) {
                return 0;
            }
            Log.isLoggable(ProtectedSandApp.s("ș"), 4);
            return c(this.f12063a.getContext());
        }

        private int f() {
            int paddingBottom = this.f12063a.getPaddingBottom() + this.f12063a.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = this.f12063a.getLayoutParams();
            return e(this.f12063a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        private int g() {
            int paddingRight = this.f12063a.getPaddingRight() + this.f12063a.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = this.f12063a.getLayoutParams();
            return e(this.f12063a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }

        private boolean h(int i5) {
            return i5 > 0 || i5 == Integer.MIN_VALUE;
        }

        private boolean i(int i5, int i6) {
            return h(i5) && h(i6);
        }

        private void j(int i5, int i6) {
            Iterator it = new ArrayList(this.f12064b).iterator();
            while (it.hasNext()) {
                ((o) it.next()).e(i5, i6);
            }
        }

        void a() {
            if (this.f12064b.isEmpty()) {
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
            ViewTreeObserver viewTreeObserver = this.f12063a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f12066d);
            }
            this.f12066d = null;
            this.f12064b.clear();
        }

        void d(@o0 o oVar) {
            int g5 = g();
            int f6 = f();
            if (i(g5, f6)) {
                oVar.e(g5, f6);
                return;
            }
            if (!this.f12064b.contains(oVar)) {
                this.f12064b.add(oVar);
            }
            if (this.f12066d == null) {
                ViewTreeObserver viewTreeObserver = this.f12063a.getViewTreeObserver();
                a aVar = new a(this);
                this.f12066d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        void k(@o0 o oVar) {
            this.f12064b.remove(oVar);
        }
    }

    public f(@o0 T t5) {
        this.f12056p = (T) com.bumptech.glide.util.l.d(t5);
        this.f12055o = new b(t5);
    }

    @q0
    private Object d() {
        return this.f12056p.getTag(f12054u);
    }

    private void f() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f12057q;
        if (onAttachStateChangeListener == null || this.f12059s) {
            return;
        }
        this.f12056p.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f12059s = true;
    }

    private void g() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f12057q;
        if (onAttachStateChangeListener == null || !this.f12059s) {
            return;
        }
        this.f12056p.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f12059s = false;
    }

    private void r(@q0 Object obj) {
        this.f12056p.setTag(f12054u, obj);
    }

    @Override // com.bumptech.glide.request.target.p
    public final void a(@o0 o oVar) {
        this.f12055o.k(oVar);
    }

    @o0
    public final f<T, Z> c() {
        if (this.f12057q != null) {
            return this;
        }
        this.f12057q = new a();
        f();
        return this;
    }

    @o0
    public final T e() {
        return this.f12056p;
    }

    @Override // com.bumptech.glide.request.target.p
    public final void h(@q0 com.bumptech.glide.request.e eVar) {
        r(eVar);
    }

    protected abstract void i(@q0 Drawable drawable);

    protected void j(@q0 Drawable drawable) {
    }

    final void l() {
        com.bumptech.glide.request.e o5 = o();
        if (o5 != null) {
            this.f12058r = true;
            o5.clear();
            this.f12058r = false;
        }
    }

    final void m() {
        com.bumptech.glide.request.e o5 = o();
        if (o5 == null || !o5.f()) {
            return;
        }
        o5.h();
    }

    @Override // com.bumptech.glide.request.target.p
    public final void n(@q0 Drawable drawable) {
        f();
        j(drawable);
    }

    @Override // com.bumptech.glide.request.target.p
    @q0
    public final com.bumptech.glide.request.e o() {
        Object d6 = d();
        if (d6 == null) {
            return null;
        }
        if (d6 instanceof com.bumptech.glide.request.e) {
            return (com.bumptech.glide.request.e) d6;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ᱪ"));
    }

    @Override // com.bumptech.glide.manager.m
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.m
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.m
    public void onStop() {
    }

    @Override // com.bumptech.glide.request.target.p
    public final void p(@q0 Drawable drawable) {
        this.f12055o.b();
        i(drawable);
        if (this.f12058r) {
            return;
        }
        g();
    }

    @Override // com.bumptech.glide.request.target.p
    public final void q(@o0 o oVar) {
        this.f12055o.d(oVar);
    }

    @Deprecated
    public final f<T, Z> s(@d0 int i5) {
        return this;
    }

    @o0
    public final f<T, Z> t() {
        this.f12055o.f12065c = true;
        return this;
    }

    public String toString() {
        return ProtectedSandApp.s("ᱫ") + this.f12056p;
    }
}
