package androidx.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.c1;
import androidx.core.view.y1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: ViewOverlayApi14.java */
/* loaded from: classes3.dex */
class n0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    protected a f9934a;

    /* compiled from: ViewOverlayApi14.java */
    /* loaded from: classes.dex */
    static class a extends ViewGroup {

        /* renamed from: t, reason: collision with root package name */
        static Method f9935t;

        /* renamed from: o, reason: collision with root package name */
        ViewGroup f9936o;

        /* renamed from: p, reason: collision with root package name */
        View f9937p;

        /* renamed from: q, reason: collision with root package name */
        ArrayList<Drawable> f9938q;

        /* renamed from: r, reason: collision with root package name */
        n0 f9939r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f9940s;

        static {
            try {
                Class cls = Integer.TYPE;
                f9935t = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        a(Context context, ViewGroup viewGroup, View view, n0 n0Var) {
            super(context);
            this.f9938q = null;
            this.f9936o = viewGroup;
            this.f9937p = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f9939r = n0Var;
        }

        private void c() {
            if (this.f9940s) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        private void d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f9938q;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f9940s = true;
                    this.f9936o.removeView(this);
                }
            }
        }

        private void e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f9936o.getLocationOnScreen(iArr2);
            this.f9937p.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public void a(Drawable drawable) {
            c();
            if (this.f9938q == null) {
                this.f9938q = new ArrayList<>();
            }
            if (this.f9938q.contains(drawable)) {
                return;
            }
            this.f9938q.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
        }

        public void b(View view) {
            c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.f9936o && viewGroup.getParent() != null && y1.O0(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f9936o.getLocationOnScreen(iArr2);
                    view.offsetLeftAndRight(iArr[0] - iArr2[0]);
                    view.offsetTopAndBottom(iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            this.f9936o.getLocationOnScreen(new int[2]);
            this.f9937p.getLocationOnScreen(new int[2]);
            canvas.translate(r0[0] - r1[0], r0[1] - r1[1]);
            canvas.clipRect(new Rect(0, 0, this.f9937p.getWidth(), this.f9937p.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f9938q;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                this.f9938q.get(i5).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        protected ViewParent f(int i5, int i6, Rect rect) {
            if (!(this.f9936o instanceof ViewGroup) || f9935t == null) {
                return null;
            }
            try {
                e(new int[2]);
                f9935t.invoke(this.f9936o, Integer.valueOf(i5), Integer.valueOf(i6), rect);
                return null;
            } catch (IllegalAccessException e6) {
                e6.printStackTrace();
                return null;
            } catch (InvocationTargetException e7) {
                e7.printStackTrace();
                return null;
            }
        }

        public void g(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f9938q;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                d();
            }
        }

        public void h(View view) {
            super.removeView(view);
            d();
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f9936o == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (!(this.f9936o instanceof ViewGroup)) {
                invalidate(rect);
                return null;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            int[] iArr2 = new int[2];
            e(iArr2);
            rect.offset(iArr2[0], iArr2[1]);
            return super.invalidateChildInParent(iArr, rect);
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@androidx.annotation.o0 Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        }

        @Override // android.view.View
        protected boolean verifyDrawable(@androidx.annotation.o0 Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.f9938q) != null && arrayList.contains(drawable));
        }
    }

    n0(Context context, ViewGroup viewGroup, View view) {
        this.f9934a = new a(context, viewGroup, view, this);
    }

    static n0 e(View view) {
        ViewGroup f6 = f(view);
        if (f6 == null) {
            return null;
        }
        int childCount = f6.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = f6.getChildAt(i5);
            if (childAt instanceof a) {
                return ((a) childAt).f9939r;
            }
        }
        return new g0(f6.getContext(), f6, view);
    }

    static ViewGroup f(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    @Override // androidx.transition.p0
    public void a(@androidx.annotation.o0 Drawable drawable) {
        this.f9934a.a(drawable);
    }

    @Override // androidx.transition.p0
    public void b(@androidx.annotation.o0 Drawable drawable) {
        this.f9934a.g(drawable);
    }
}
