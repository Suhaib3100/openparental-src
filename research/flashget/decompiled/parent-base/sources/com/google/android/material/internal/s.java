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
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: ViewOverlayApi14.java */
/* loaded from: classes6.dex */
class s implements u {

    /* renamed from: a, reason: collision with root package name */
    protected a f53523a;

    /* compiled from: ViewOverlayApi14.java */
    @SuppressLint({"ViewConstructor", "PrivateApi"})
    static class a extends ViewGroup {

        /* renamed from: g, reason: collision with root package name */
        static Method f53524g;

        /* renamed from: b, reason: collision with root package name */
        ViewGroup f53525b;

        /* renamed from: c, reason: collision with root package name */
        View f53526c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList<Drawable> f53527d;

        /* renamed from: e, reason: collision with root package name */
        s f53528e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f53529f;

        static {
            try {
                String s4 = ProtectedSandApp.s("\uf1f0");
                Class cls = Integer.TYPE;
                f53524g = ViewGroup.class.getDeclaredMethod(s4, cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        a(Context context, ViewGroup viewGroup, View view, s sVar) {
            super(context);
            this.f53527d = null;
            this.f53525b = viewGroup;
            this.f53526c = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f53528e = sVar;
        }

        private void c() {
            if (this.f53529f) {
                throw new IllegalStateException(ProtectedSandApp.s("\uf1f1"));
            }
        }

        private void d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f53527d;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f53529f = true;
                    this.f53525b.removeView(this);
                }
            }
        }

        private void e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f53525b.getLocationOnScreen(iArr2);
            this.f53526c.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public void a(Drawable drawable) {
            c();
            if (this.f53527d == null) {
                this.f53527d = new ArrayList<>();
            }
            if (this.f53527d.contains(drawable)) {
                return;
            }
            this.f53527d.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
        }

        public void b(View view) {
            c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.f53525b && viewGroup.getParent() != null && x1.R0(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f53525b.getLocationOnScreen(iArr2);
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
            this.f53525b.getLocationOnScreen(new int[2]);
            this.f53526c.getLocationOnScreen(new int[2]);
            canvas.translate(r0[0] - r1[0], r0[1] - r1[1]);
            canvas.clipRect(new Rect(0, 0, this.f53526c.getWidth(), this.f53526c.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f53527d;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.f53527d.get(i4).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        protected ViewParent f(int i4, int i5, Rect rect) {
            if (this.f53525b == null || f53524g == null) {
                return null;
            }
            try {
                e(new int[2]);
                f53524g.invoke(this.f53525b, Integer.valueOf(i4), Integer.valueOf(i5), rect);
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
            ArrayList<Drawable> arrayList = this.f53527d;
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
            if (this.f53525b == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f53525b == null) {
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
        protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        }

        @Override // android.view.View
        protected boolean verifyDrawable(@o0 Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.f53527d) != null && arrayList.contains(drawable));
        }
    }

    s(Context context, ViewGroup viewGroup, View view) {
        this.f53523a = new a(context, viewGroup, view, this);
    }

    static s e(View view) {
        ViewGroup f4 = v.f(view);
        if (f4 == null) {
            return null;
        }
        int childCount = f4.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = f4.getChildAt(i4);
            if (childAt instanceof a) {
                return ((a) childAt).f53528e;
            }
        }
        return new p(f4.getContext(), f4, view);
    }

    @Override // com.google.android.material.internal.u
    public void a(@o0 Drawable drawable) {
        this.f53523a.a(drawable);
    }

    @Override // com.google.android.material.internal.u
    public void b(@o0 Drawable drawable) {
        this.f53523a.g(drawable);
    }
}
