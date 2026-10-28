package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.view.d1;
import androidx.core.view.j3;
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import s8.a;

/* compiled from: ViewUtils.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public class v {

    /* compiled from: ViewUtils.java */
    static class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f53531b;

        a(View view) {
            this.f53531b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((InputMethodManager) this.f53531b.getContext().getSystemService(ProtectedSandApp.s("\uf1f2"))).showSoftInput(this.f53531b, 1);
        }
    }

    /* compiled from: ViewUtils.java */
    static class b implements e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f53532a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f53533b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f53534c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f53535d;

        b(boolean z4, boolean z5, boolean z6, e eVar) {
            this.f53532a = z4;
            this.f53533b = z5;
            this.f53534c = z6;
            this.f53535d = eVar;
        }

        @Override // com.google.android.material.internal.v.e
        @o0
        public j3 a(View view, @o0 j3 j3Var, @o0 f fVar) {
            if (this.f53532a) {
                fVar.f53541d = j3Var.o() + fVar.f53541d;
            }
            boolean j4 = v.j(view);
            if (this.f53533b) {
                if (j4) {
                    fVar.f53540c = j3Var.p() + fVar.f53540c;
                } else {
                    fVar.f53538a = j3Var.p() + fVar.f53538a;
                }
            }
            if (this.f53534c) {
                if (j4) {
                    fVar.f53538a = j3Var.q() + fVar.f53538a;
                } else {
                    fVar.f53540c = j3Var.q() + fVar.f53540c;
                }
            }
            fVar.a(view);
            e eVar = this.f53535d;
            return eVar != null ? eVar.a(view, j3Var, fVar) : j3Var;
        }
    }

    /* compiled from: ViewUtils.java */
    static class c implements d1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f53536b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f53537c;

        c(e eVar, f fVar) {
            this.f53536b = eVar;
            this.f53537c = fVar;
        }

        @Override // androidx.core.view.d1
        public j3 a(View view, j3 j3Var) {
            return this.f53536b.a(view, j3Var, new f(this.f53537c));
        }
    }

    /* compiled from: ViewUtils.java */
    static class d implements View.OnAttachStateChangeListener {
        d() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@o0 View view) {
            view.removeOnAttachStateChangeListener(this);
            x1.B1(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: ViewUtils.java */
    public interface e {
        j3 a(View view, j3 j3Var, f fVar);
    }

    private v() {
    }

    public static void a(@q0 View view, @o0 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void b(@o0 View view, @q0 AttributeSet attributeSet, int i4, int i5) {
        c(view, attributeSet, i4, i5, null);
    }

    public static void c(@o0 View view, @q0 AttributeSet attributeSet, int i4, int i5, @q0 e eVar) {
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, a.o.wg, i4, i5);
        boolean z4 = obtainStyledAttributes.getBoolean(a.o.xg, false);
        boolean z5 = obtainStyledAttributes.getBoolean(a.o.yg, false);
        boolean z6 = obtainStyledAttributes.getBoolean(a.o.zg, false);
        obtainStyledAttributes.recycle();
        d(view, new b(z4, z5, z6, eVar));
    }

    public static void d(@o0 View view, @o0 e eVar) {
        x1.k2(view, new c(eVar, new f(x1.n0(view), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom())));
        n(view);
    }

    public static float e(@o0 Context context, @androidx.annotation.r(unit = 0) int i4) {
        return TypedValue.applyDimension(1, i4, context.getResources().getDisplayMetrics());
    }

    @q0
    public static ViewGroup f(@q0 View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    @q0
    public static u g(@o0 View view) {
        return h(f(view));
    }

    @q0
    public static u h(@q0 View view) {
        if (view == null) {
            return null;
        }
        return new t(view);
    }

    public static float i(@o0 View view) {
        float f4 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f4 += x1.T((View) parent);
        }
        return f4;
    }

    public static boolean j(View view) {
        return x1.c0(view) == 1;
    }

    public static PorterDuff.Mode k(int i4, PorterDuff.Mode mode) {
        if (i4 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i4 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i4 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i4) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void l(@q0 View view, @o0 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void m(@o0 ViewTreeObserver viewTreeObserver, @o0 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void n(@o0 View view) {
        if (x1.R0(view)) {
            x1.B1(view);
        } else {
            view.addOnAttachStateChangeListener(new d());
        }
    }

    public static void o(@o0 View view) {
        view.requestFocus();
        view.post(new a(view));
    }

    /* compiled from: ViewUtils.java */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public int f53538a;

        /* renamed from: b, reason: collision with root package name */
        public int f53539b;

        /* renamed from: c, reason: collision with root package name */
        public int f53540c;

        /* renamed from: d, reason: collision with root package name */
        public int f53541d;

        public f(int i4, int i5, int i6, int i7) {
            this.f53538a = i4;
            this.f53539b = i5;
            this.f53540c = i6;
            this.f53541d = i7;
        }

        public void a(View view) {
            x1.n2(view, this.f53538a, this.f53539b, this.f53540c, this.f53541d);
        }

        public f(@o0 f fVar) {
            this.f53538a = fVar.f53538a;
            this.f53539b = fVar.f53539b;
            this.f53540c = fVar.f53540c;
            this.f53541d = fVar.f53541d;
        }
    }
}
