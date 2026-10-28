package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.x1;
import androidx.transition.q;

/* compiled from: GhostViewPort.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
class i extends ViewGroup implements f {

    /* renamed from: b, reason: collision with root package name */
    ViewGroup f34415b;

    /* renamed from: c, reason: collision with root package name */
    View f34416c;

    /* renamed from: d, reason: collision with root package name */
    final View f34417d;

    /* renamed from: e, reason: collision with root package name */
    int f34418e;

    /* renamed from: f, reason: collision with root package name */
    @androidx.annotation.q0
    private Matrix f34419f;

    /* renamed from: g, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f34420g;

    /* compiled from: GhostViewPort.java */
    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            View view;
            x1.t1(i.this);
            i iVar = i.this;
            ViewGroup viewGroup = iVar.f34415b;
            if (viewGroup == null || (view = iVar.f34416c) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            i.this.f34415b.postInvalidateOnAnimation();
            i iVar2 = i.this;
            iVar2.f34415b = null;
            iVar2.f34416c = null;
            return true;
        }
    }

    i(View view) {
        super(view.getContext());
        this.f34420g = new a();
        this.f34417d = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    static i b(View view, ViewGroup viewGroup, Matrix matrix) {
        int i4;
        g gVar;
        if (!(view.getParent() instanceof ViewGroup)) {
            throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
        }
        g b5 = g.b(viewGroup);
        i e4 = e(view);
        if (e4 == null || (gVar = (g) e4.getParent()) == b5) {
            i4 = 0;
        } else {
            i4 = e4.f34418e;
            gVar.removeView(e4);
            e4 = null;
        }
        if (e4 == null) {
            if (matrix == null) {
                matrix = new Matrix();
                c(view, viewGroup, matrix);
            }
            e4 = new i(view);
            e4.f34419f = matrix;
            if (b5 == null) {
                b5 = new g(viewGroup);
            } else {
                b5.g();
            }
            d(viewGroup, b5);
            d(viewGroup, e4);
            b5.a(e4);
            e4.f34418e = i4;
        } else if (matrix != null) {
            e4.h(matrix);
        }
        e4.f34418e++;
        return e4;
    }

    static void c(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        o0.j(viewGroup2, matrix);
        matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
        o0.k(viewGroup, matrix);
    }

    static void d(View view, View view2) {
        o0.g(view2, view2.getLeft(), view2.getTop(), view.getWidth() + view2.getLeft(), view.getHeight() + view2.getTop());
    }

    static i e(View view) {
        return (i) view.getTag(q.g.f34833v0);
    }

    static void f(View view) {
        i e4 = e(view);
        if (e4 != null) {
            int i4 = e4.f34418e - 1;
            e4.f34418e = i4;
            if (i4 <= 0) {
                ((g) e4.getParent()).removeView(e4);
            }
        }
    }

    static void g(@androidx.annotation.o0 View view, @androidx.annotation.q0 i iVar) {
        view.setTag(q.g.f34833v0, iVar);
    }

    @Override // androidx.transition.f
    public void a(ViewGroup viewGroup, View view) {
        this.f34415b = viewGroup;
        this.f34416c = view;
    }

    void h(@androidx.annotation.o0 Matrix matrix) {
        this.f34419f = matrix;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        g(this.f34417d, this);
        this.f34417d.getViewTreeObserver().addOnPreDrawListener(this.f34420g);
        o0.i(this.f34417d, 4);
        if (this.f34417d.getParent() != null) {
            ((View) this.f34417d.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f34417d.getViewTreeObserver().removeOnPreDrawListener(this.f34420g);
        o0.i(this.f34417d, 0);
        g(this.f34417d, null);
        if (this.f34417d.getParent() != null) {
            ((View) this.f34417d.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        b.a(canvas, true);
        canvas.setMatrix(this.f34419f);
        o0.i(this.f34417d, 0);
        this.f34417d.invalidate();
        o0.i(this.f34417d, 4);
        drawChild(canvas, this.f34417d, getDrawingTime());
        b.a(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
    }

    @Override // android.view.View, androidx.transition.f
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        if (e(this.f34417d) == this) {
            o0.i(this.f34417d, i4 == 0 ? 4 : 0);
        }
    }
}
