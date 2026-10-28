package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.y1;
import androidx.transition.s;

/* compiled from: GhostViewPort.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
class k extends ViewGroup implements h {

    /* renamed from: o, reason: collision with root package name */
    ViewGroup f9914o;

    /* renamed from: p, reason: collision with root package name */
    View f9915p;

    /* renamed from: q, reason: collision with root package name */
    final View f9916q;

    /* renamed from: r, reason: collision with root package name */
    int f9917r;

    /* renamed from: s, reason: collision with root package name */
    @androidx.annotation.q0
    private Matrix f9918s;

    /* renamed from: t, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f9919t;

    /* compiled from: GhostViewPort.java */
    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            View view;
            y1.n1(k.this);
            k kVar = k.this;
            ViewGroup viewGroup = kVar.f9914o;
            if (viewGroup == null || (view = kVar.f9915p) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            y1.n1(k.this.f9914o);
            k kVar2 = k.this;
            kVar2.f9914o = null;
            kVar2.f9915p = null;
            return true;
        }
    }

    k(View view) {
        super(view.getContext());
        this.f9919t = new a();
        this.f9916q = view;
        setWillNotDraw(false);
        setLayerType(2, null);
    }

    static k b(View view, ViewGroup viewGroup, Matrix matrix) {
        int i5;
        i iVar;
        if (!(view.getParent() instanceof ViewGroup)) {
            throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
        }
        i b6 = i.b(viewGroup);
        k e6 = e(view);
        if (e6 == null || (iVar = (i) e6.getParent()) == b6) {
            i5 = 0;
        } else {
            i5 = e6.f9917r;
            iVar.removeView(e6);
            e6 = null;
        }
        if (e6 == null) {
            if (matrix == null) {
                matrix = new Matrix();
                c(view, viewGroup, matrix);
            }
            e6 = new k(view);
            e6.f9918s = matrix;
            if (b6 == null) {
                b6 = new i(viewGroup);
            } else {
                b6.g();
            }
            d(viewGroup, b6);
            d(viewGroup, e6);
            b6.a(e6);
            e6.f9917r = i5;
        } else if (matrix != null) {
            e6.h(matrix);
        }
        e6.f9917r++;
        return e6;
    }

    static void c(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        q0.j(viewGroup2, matrix);
        matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
        q0.k(viewGroup, matrix);
    }

    static void d(View view, View view2) {
        q0.g(view2, view2.getLeft(), view2.getTop(), view.getWidth() + view2.getLeft(), view.getHeight() + view2.getTop());
    }

    static k e(View view) {
        return (k) view.getTag(s.e.f10012j);
    }

    static void f(View view) {
        k e6 = e(view);
        if (e6 != null) {
            int i5 = e6.f9917r - 1;
            e6.f9917r = i5;
            if (i5 <= 0) {
                ((i) e6.getParent()).removeView(e6);
            }
        }
    }

    static void g(@androidx.annotation.o0 View view, @androidx.annotation.q0 k kVar) {
        view.setTag(s.e.f10012j, kVar);
    }

    @Override // androidx.transition.h
    public void a(ViewGroup viewGroup, View view) {
        this.f9914o = viewGroup;
        this.f9915p = view;
    }

    void h(@androidx.annotation.o0 Matrix matrix) {
        this.f9918s = matrix;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        g(this.f9916q, this);
        this.f9916q.getViewTreeObserver().addOnPreDrawListener(this.f9919t);
        q0.i(this.f9916q, 4);
        if (this.f9916q.getParent() != null) {
            ((View) this.f9916q.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f9916q.getViewTreeObserver().removeOnPreDrawListener(this.f9919t);
        q0.i(this.f9916q, 0);
        g(this.f9916q, null);
        if (this.f9916q.getParent() != null) {
            ((View) this.f9916q.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        d.a(canvas, true);
        canvas.setMatrix(this.f9918s);
        q0.i(this.f9916q, 0);
        this.f9916q.invalidate();
        q0.i(this.f9916q, 4);
        drawChild(canvas, this.f9916q, getDrawingTime());
        d.a(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
    }

    @Override // android.view.View, androidx.transition.h
    public void setVisibility(int i5) {
        super.setVisibility(i5);
        if (e(this.f9916q) == this) {
            q0.i(this.f9916q, i5 == 0 ? 4 : 0);
        }
    }
}
