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
import com.bumptech.glide.k;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ViewTarget.java */
@Deprecated
/* loaded from: classes3.dex */
public abstract class r<T extends View, Z> extends com.bumptech.glide.request.target.b<Z> {

    /* renamed from: i, reason: collision with root package name */
    private static boolean f44897i;

    /* renamed from: c, reason: collision with root package name */
    protected final T f44899c;

    /* renamed from: d, reason: collision with root package name */
    private final b f44900d;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private View.OnAttachStateChangeListener f44901e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f44902f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f44903g;

    /* renamed from: h, reason: collision with root package name */
    private static final String f44896h = ProtectedSandApp.s("\u0a78");

    /* renamed from: j, reason: collision with root package name */
    private static int f44898j = k.h.f43390u0;

    /* compiled from: ViewTarget.java */
    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            r.this.o();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            r.this.n();
        }
    }

    /* compiled from: ViewTarget.java */
    @m1
    static final class b {

        /* renamed from: e, reason: collision with root package name */
        private static final int f44905e = 0;

        /* renamed from: f, reason: collision with root package name */
        @q0
        @m1
        static Integer f44906f;

        /* renamed from: a, reason: collision with root package name */
        private final View f44907a;

        /* renamed from: b, reason: collision with root package name */
        private final List<o> f44908b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        boolean f44909c;

        /* renamed from: d, reason: collision with root package name */
        @q0
        private a f44910d;

        /* compiled from: ViewTarget.java */
        private static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: b, reason: collision with root package name */
            private final WeakReference<b> f44911b;

            a(@o0 b bVar) {
                this.f44911b = new WeakReference<>(bVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                Log.isLoggable(ProtectedSandApp.s("ઌ"), 2);
                b bVar = this.f44911b.get();
                if (bVar == null) {
                    return true;
                }
                bVar.a();
                return true;
            }
        }

        b(@o0 View view) {
            this.f44907a = view;
        }

        private static int c(@o0 Context context) {
            if (f44906f == null) {
                Display defaultDisplay = ((WindowManager) com.bumptech.glide.util.m.f((WindowManager) context.getSystemService(ProtectedSandApp.s("ઍ")), ProtectedSandApp.s("\u0a8e"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f44906f = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f44906f.intValue();
        }

        private int e(int i4, int i5, int i6) {
            int i7 = i5 - i6;
            if (i7 > 0) {
                return i7;
            }
            if (this.f44909c && this.f44907a.isLayoutRequested()) {
                return 0;
            }
            int i10 = i4 - i6;
            if (i10 > 0) {
                return i10;
            }
            if (this.f44907a.isLayoutRequested() || i5 != -2) {
                return 0;
            }
            Log.isLoggable(ProtectedSandApp.s("એ"), 4);
            return c(this.f44907a.getContext());
        }

        private int f() {
            int paddingBottom = this.f44907a.getPaddingBottom() + this.f44907a.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = this.f44907a.getLayoutParams();
            return e(this.f44907a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        private int g() {
            int paddingRight = this.f44907a.getPaddingRight() + this.f44907a.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = this.f44907a.getLayoutParams();
            return e(this.f44907a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }

        private boolean h(int i4) {
            return i4 > 0 || i4 == Integer.MIN_VALUE;
        }

        private boolean i(int i4, int i5) {
            return h(i4) && h(i5);
        }

        private void j(int i4, int i5) {
            Iterator it = new ArrayList(this.f44908b).iterator();
            while (it.hasNext()) {
                ((o) it.next()).d(i4, i5);
            }
        }

        void a() {
            if (this.f44908b.isEmpty()) {
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
            ViewTreeObserver viewTreeObserver = this.f44907a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f44910d);
            }
            this.f44910d = null;
            this.f44908b.clear();
        }

        void d(@o0 o oVar) {
            int g4 = g();
            int f4 = f();
            if (i(g4, f4)) {
                oVar.d(g4, f4);
                return;
            }
            if (!this.f44908b.contains(oVar)) {
                this.f44908b.add(oVar);
            }
            if (this.f44910d == null) {
                ViewTreeObserver viewTreeObserver = this.f44907a.getViewTreeObserver();
                a aVar = new a(this);
                this.f44910d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        void k(@o0 o oVar) {
            this.f44908b.remove(oVar);
        }
    }

    public r(@o0 T t4) {
        this.f44899c = (T) com.bumptech.glide.util.m.f(t4, ProtectedSandApp.s("\u0a79"));
        this.f44900d = new b(t4);
    }

    @q0
    private Object e() {
        return this.f44899c.getTag(f44898j);
    }

    private void f() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f44901e;
        if (onAttachStateChangeListener == null || this.f44903g) {
            return;
        }
        this.f44899c.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f44903g = true;
    }

    private void k() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f44901e;
        if (onAttachStateChangeListener == null || !this.f44903g) {
            return;
        }
        this.f44899c.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f44903g = false;
    }

    private void q(@q0 Object obj) {
        f44897i = true;
        this.f44899c.setTag(f44898j, obj);
    }

    @Deprecated
    public static void r(int i4) {
        if (f44897i) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\u0a7a"));
        }
        f44898j = i4;
    }

    @Override // com.bumptech.glide.request.target.p
    @androidx.annotation.i
    public void a(@o0 o oVar) {
        this.f44900d.k(oVar);
    }

    @o0
    public final r<T, Z> d() {
        if (this.f44901e != null) {
            return this;
        }
        this.f44901e = new a();
        f();
        return this;
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    @androidx.annotation.i
    public void g(@q0 Drawable drawable) {
        f();
    }

    @o0
    public T getView() {
        return this.f44899c;
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    @q0
    public com.bumptech.glide.request.e h() {
        Object e4 = e();
        if (e4 == null) {
            return null;
        }
        if (e4 instanceof com.bumptech.glide.request.e) {
            return (com.bumptech.glide.request.e) e4;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("\u0a7b"));
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    @androidx.annotation.i
    public void i(@q0 Drawable drawable) {
        this.f44900d.b();
        if (this.f44902f) {
            return;
        }
        k();
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    public void l(@q0 com.bumptech.glide.request.e eVar) {
        q(eVar);
    }

    void n() {
        com.bumptech.glide.request.e h4 = h();
        if (h4 != null) {
            this.f44902f = true;
            h4.clear();
            this.f44902f = false;
        }
    }

    void o() {
        com.bumptech.glide.request.e h4 = h();
        if (h4 == null || !h4.e()) {
            return;
        }
        h4.h();
    }

    @Override // com.bumptech.glide.request.target.p
    @androidx.annotation.i
    public void p(@o0 o oVar) {
        this.f44900d.d(oVar);
    }

    @o0
    public final r<T, Z> s() {
        this.f44900d.f44909c = true;
        return this;
    }

    public String toString() {
        return ProtectedSandApp.s("\u0a7c") + this.f44899c;
    }

    @Deprecated
    public r(@o0 T t4, boolean z4) {
        this(t4);
        if (z4) {
            s();
        }
    }
}
