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
import com.bumptech.glide.k;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: CustomViewTarget.java */
/* loaded from: classes3.dex */
public abstract class f<T extends View, Z> implements p<Z> {

    /* renamed from: g, reason: collision with root package name */
    private static final String f44859g = ProtectedSandApp.s("ੈ");

    /* renamed from: h, reason: collision with root package name */
    @d0
    private static final int f44860h = k.h.f43390u0;

    /* renamed from: b, reason: collision with root package name */
    private final b f44861b;

    /* renamed from: c, reason: collision with root package name */
    protected final T f44862c;

    /* renamed from: d, reason: collision with root package name */
    @q0
    private View.OnAttachStateChangeListener f44863d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f44864e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f44865f;

    /* compiled from: CustomViewTarget.java */
    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            f.this.q();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            f.this.o();
        }
    }

    /* compiled from: CustomViewTarget.java */
    @m1
    static final class b {

        /* renamed from: e, reason: collision with root package name */
        private static final int f44867e = 0;

        /* renamed from: f, reason: collision with root package name */
        @q0
        @m1
        static Integer f44868f;

        /* renamed from: a, reason: collision with root package name */
        private final View f44869a;

        /* renamed from: b, reason: collision with root package name */
        private final List<o> f44870b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        boolean f44871c;

        /* renamed from: d, reason: collision with root package name */
        @q0
        private a f44872d;

        /* compiled from: CustomViewTarget.java */
        private static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: b, reason: collision with root package name */
            private final WeakReference<b> f44873b;

            a(@o0 b bVar) {
                this.f44873b = new WeakReference<>(bVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                Log.isLoggable(ProtectedSandApp.s("\u0a7d"), 2);
                b bVar = this.f44873b.get();
                if (bVar == null) {
                    return true;
                }
                bVar.a();
                return true;
            }
        }

        b(@o0 View view) {
            this.f44869a = view;
        }

        private static int c(@o0 Context context) {
            if (f44868f == null) {
                Display defaultDisplay = ((WindowManager) com.bumptech.glide.util.m.f((WindowManager) context.getSystemService(ProtectedSandApp.s("\u0a7e")), ProtectedSandApp.s("\u0a7f"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f44868f = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f44868f.intValue();
        }

        private int e(int i4, int i5, int i6) {
            int i7 = i5 - i6;
            if (i7 > 0) {
                return i7;
            }
            if (this.f44871c && this.f44869a.isLayoutRequested()) {
                return 0;
            }
            int i10 = i4 - i6;
            if (i10 > 0) {
                return i10;
            }
            if (this.f44869a.isLayoutRequested() || i5 != -2) {
                return 0;
            }
            Log.isLoggable(ProtectedSandApp.s("\u0a80"), 4);
            return c(this.f44869a.getContext());
        }

        private int f() {
            int paddingBottom = this.f44869a.getPaddingBottom() + this.f44869a.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = this.f44869a.getLayoutParams();
            return e(this.f44869a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        private int g() {
            int paddingRight = this.f44869a.getPaddingRight() + this.f44869a.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = this.f44869a.getLayoutParams();
            return e(this.f44869a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }

        private boolean h(int i4) {
            return i4 > 0 || i4 == Integer.MIN_VALUE;
        }

        private boolean i(int i4, int i5) {
            return h(i4) && h(i5);
        }

        private void j(int i4, int i5) {
            Iterator it = new ArrayList(this.f44870b).iterator();
            while (it.hasNext()) {
                ((o) it.next()).d(i4, i5);
            }
        }

        void a() {
            if (this.f44870b.isEmpty()) {
                return;
            }
            int g4 = g();
            int f4 = f();
            if (i(g4, f4)) {
                j(g4, f4);
                b();
            }
        }

        void b() {
            ViewTreeObserver viewTreeObserver = this.f44869a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f44872d);
            }
            this.f44872d = null;
            this.f44870b.clear();
        }

        void d(@o0 o oVar) {
            int g4 = g();
            int f4 = f();
            if (i(g4, f4)) {
                oVar.d(g4, f4);
                return;
            }
            if (!this.f44870b.contains(oVar)) {
                this.f44870b.add(oVar);
            }
            if (this.f44872d == null) {
                ViewTreeObserver viewTreeObserver = this.f44869a.getViewTreeObserver();
                a aVar = new a(this);
                this.f44872d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        void k(@o0 o oVar) {
            this.f44870b.remove(oVar);
        }
    }

    public f(@o0 T t4) {
        this.f44862c = (T) com.bumptech.glide.util.m.f(t4, ProtectedSandApp.s("\u0a49"));
        this.f44861b = new b(t4);
    }

    @q0
    private Object c() {
        return this.f44862c.getTag(f44860h);
    }

    private void e() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f44863d;
        if (onAttachStateChangeListener == null || this.f44865f) {
            return;
        }
        this.f44862c.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f44865f = true;
    }

    private void f() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f44863d;
        if (onAttachStateChangeListener == null || !this.f44865f) {
            return;
        }
        this.f44862c.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f44865f = false;
    }

    private void r(@q0 Object obj) {
        this.f44862c.setTag(f44860h, obj);
    }

    @Override // com.bumptech.glide.request.target.p
    public final void a(@o0 o oVar) {
        this.f44861b.k(oVar);
    }

    @o0
    public final f<T, Z> b() {
        if (this.f44863d != null) {
            return this;
        }
        this.f44863d = new a();
        e();
        return this;
    }

    @o0
    public final T d() {
        return this.f44862c;
    }

    @Override // com.bumptech.glide.request.target.p
    public final void g(@q0 Drawable drawable) {
        e();
        n(drawable);
    }

    @Override // com.bumptech.glide.request.target.p
    @q0
    public final com.bumptech.glide.request.e h() {
        Object c5 = c();
        if (c5 == null) {
            return null;
        }
        if (c5 instanceof com.bumptech.glide.request.e) {
            return (com.bumptech.glide.request.e) c5;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("\u0a4a"));
    }

    @Override // com.bumptech.glide.request.target.p
    public final void i(@q0 Drawable drawable) {
        this.f44861b.b();
        k(drawable);
        if (this.f44864e) {
            return;
        }
        f();
    }

    protected abstract void k(@q0 Drawable drawable);

    @Override // com.bumptech.glide.request.target.p
    public final void l(@q0 com.bumptech.glide.request.e eVar) {
        r(eVar);
    }

    protected void n(@q0 Drawable drawable) {
    }

    final void o() {
        com.bumptech.glide.request.e h4 = h();
        if (h4 != null) {
            this.f44864e = true;
            h4.clear();
            this.f44864e = false;
        }
    }

    @Override // com.bumptech.glide.manager.k
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.k
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.k
    public void onStop() {
    }

    @Override // com.bumptech.glide.request.target.p
    public final void p(@o0 o oVar) {
        this.f44861b.d(oVar);
    }

    final void q() {
        com.bumptech.glide.request.e h4 = h();
        if (h4 == null || !h4.e()) {
            return;
        }
        h4.h();
    }

    @Deprecated
    public final f<T, Z> s(@d0 int i4) {
        return this;
    }

    @o0
    public final f<T, Z> t() {
        this.f44861b.f44871c = true;
        return this;
    }

    public String toString() {
        return ProtectedSandApp.s("ੋ") + this.f44862c;
    }
}
