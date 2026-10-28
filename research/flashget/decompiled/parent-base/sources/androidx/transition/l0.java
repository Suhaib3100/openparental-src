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
import androidx.core.view.x1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: ViewOverlayApi14.java */
/* loaded from: classes3.dex */
class l0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    protected a f34435a;

    /* compiled from: ViewOverlayApi14.java */
    static class a extends ViewGroup {

        /* renamed from: g, reason: collision with root package name */
        static Method f34436g;

        /* renamed from: b, reason: collision with root package name */
        ViewGroup f34437b;

        /* renamed from: c, reason: collision with root package name */
        View f34438c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList<Drawable> f34439d;

        /* renamed from: e, reason: collision with root package name */
        l0 f34440e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f34441f;

        static {
            try {
                Class cls = Integer.TYPE;
                f34436g = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        a(Context context, ViewGroup viewGroup, View view, l0 l0Var) {
            super(context);
            this.f34439d = null;
            this.f34437b = viewGroup;
            this.f34438c = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f34440e = l0Var;
        }

        private void c() {
            if (this.f34441f) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        private void d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f34439d;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f34441f = true;
                    this.f34437b.removeView(this);
                }
            }
        }

        private void e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f34437b.getLocationOnScreen(iArr2);
            this.f34438c.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public void a(Drawable drawable) {
            c();
            if (this.f34439d == null) {
                this.f34439d = new ArrayList<>();
            }
            if (this.f34439d.contains(drawable)) {
                return;
            }
            this.f34439d.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
        }

        public void b(View view) {
            c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.f34437b && viewGroup.getParent() != null && x1.R0(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f34437b.getLocationOnScreen(iArr2);
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
            this.f34437b.getLocationOnScreen(new int[2]);
            this.f34438c.getLocationOnScreen(new int[2]);
            canvas.translate(r0[0] - r1[0], r0[1] - r1[1]);
            canvas.clipRect(new Rect(0, 0, this.f34438c.getWidth(), this.f34438c.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f34439d;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.f34439d.get(i4).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        protected ViewParent f(int i4, int i5, Rect rect) {
            if (this.f34437b == null || f34436g == null) {
                return null;
            }
            try {
                e(new int[2]);
                f34436g.invoke(this.f34437b, Integer.valueOf(i4), Integer.valueOf(i5), rect);
                return null;
            } catch (IllegalAccessException e4) {
                e4.printStackTrace();
                return null;
            } catch (InvocationTargetException e5) {
                e5.printStackTrace();
                return null;
            }
        }

        public void g(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f34439d;
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
            if (this.f34437b == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f34437b == null) {
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
        protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        }

        @Override // android.view.View
        protected boolean verifyDrawable(@androidx.annotation.o0 Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.f34439d) != null && arrayList.contains(drawable));
        }
    }

    l0(Context context, ViewGroup viewGroup, View view) {
        this.f34435a = new a(context, viewGroup, view, this);
    }

    static l0 e(View view) {
        ViewGroup f4 = f(view);
        if (f4 == null) {
            return null;
        }
        int childCount = f4.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = f4.getChildAt(i4);
            if (childAt instanceof a) {
                return ((a) childAt).f34440e;
            }
        }
        return new e0(f4.getContext(), f4, view);
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

    @Override // androidx.transition.n0
    public void a(@androidx.annotation.o0 Drawable drawable) {
        this.f34435a.a(drawable);
    }

    @Override // androidx.transition.n0
    public void b(@androidx.annotation.o0 Drawable drawable) {
        this.f34435a.g(drawable);
    }
}
