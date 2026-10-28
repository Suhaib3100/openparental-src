package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.core.view.y1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: ViewOverlayApi14.java */
/* loaded from: classes3.dex */
class s implements u {

    /* renamed from: a, reason: collision with root package name */
    protected a f13729a;

    /* compiled from: ViewOverlayApi14.java */
    @SuppressLint({"ViewConstructor", "PrivateApi"})
    /* loaded from: classes2.dex */
    static class a extends ViewGroup {

        /* renamed from: t, reason: collision with root package name */
        static Method f13730t;

        /* renamed from: o, reason: collision with root package name */
        ViewGroup f13731o;

        /* renamed from: p, reason: collision with root package name */
        View f13732p;

        /* renamed from: q, reason: collision with root package name */
        ArrayList<Drawable> f13733q;

        /* renamed from: r, reason: collision with root package name */
        s f13734r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f13735s;

        static {
            try {
                String s5 = ProtectedSandApp.s("ቅ");
                Class cls = Integer.TYPE;
                f13730t = ViewGroup.class.getDeclaredMethod(s5, cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        a(Context context, ViewGroup viewGroup, View view, s sVar) {
            super(context);
            this.f13733q = null;
            this.f13731o = viewGroup;
            this.f13732p = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f13734r = sVar;
        }

        private void c() {
            if (this.f13735s) {
                throw new IllegalStateException(ProtectedSandApp.s("ቆ"));
            }
        }

        private void d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f13733q;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f13735s = true;
                    this.f13731o.removeView(this);
                }
            }
        }

        private void e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f13731o.getLocationOnScreen(iArr2);
            this.f13732p.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public void a(Drawable drawable) {
            c();
            if (this.f13733q == null) {
                this.f13733q = new ArrayList<>();
            }
            if (this.f13733q.contains(drawable)) {
                return;
            }
            this.f13733q.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
        }

        public void b(View view) {
            c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.f13731o && viewGroup.getParent() != null && y1.O0(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f13731o.getLocationOnScreen(iArr2);
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
            this.f13731o.getLocationOnScreen(new int[2]);
            this.f13732p.getLocationOnScreen(new int[2]);
            canvas.translate(r0[0] - r1[0], r0[1] - r1[1]);
            canvas.clipRect(new Rect(0, 0, this.f13732p.getWidth(), this.f13732p.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f13733q;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                this.f13733q.get(i5).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        protected ViewParent f(int i5, int i6, Rect rect) {
            if (this.f13731o == null || f13730t == null) {
                return null;
            }
            try {
                e(new int[2]);
                f13730t.invoke(this.f13731o, Integer.valueOf(i5), Integer.valueOf(i6), rect);
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
            ArrayList<Drawable> arrayList = this.f13733q;
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
            if (this.f13731o == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f13731o == null) {
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
        public void invalidateDrawable(@o0 Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        }

        @Override // android.view.View
        protected boolean verifyDrawable(@o0 Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.f13733q) != null && arrayList.contains(drawable));
        }
    }

    s(Context context, ViewGroup viewGroup, View view) {
        this.f13729a = new a(context, viewGroup, view, this);
    }

    static s e(View view) {
        ViewGroup f6 = v.f(view);
        if (f6 == null) {
            return null;
        }
        int childCount = f6.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = f6.getChildAt(i5);
            if (childAt instanceof a) {
                return ((a) childAt).f13734r;
            }
        }
        return new p(f6.getContext(), f6, view);
    }

    @Override // com.google.android.material.internal.u
    public void a(@o0 Drawable drawable) {
        this.f13729a.a(drawable);
    }

    @Override // com.google.android.material.internal.u
    public void b(@o0 Drawable drawable) {
        this.f13729a.g(drawable);
    }
}
