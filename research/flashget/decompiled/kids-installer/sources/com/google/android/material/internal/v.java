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
import androidx.core.view.o1;
import androidx.core.view.v4;
import androidx.core.view.y1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import n1.a;

/* compiled from: ViewUtils.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class v {

    /* compiled from: ViewUtils.java */
    static class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ View f13737o;

        a(View view) {
            this.f13737o = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((InputMethodManager) this.f13737o.getContext().getSystemService(ProtectedSandApp.s("ቇ"))).showSoftInput(this.f13737o, 1);
        }
    }

    /* compiled from: ViewUtils.java */
    /* loaded from: classes3.dex */
    static class b implements e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f13738a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f13739b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f13740c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f13741d;

        b(boolean z5, boolean z6, boolean z7, e eVar) {
            this.f13738a = z5;
            this.f13739b = z6;
            this.f13740c = z7;
            this.f13741d = eVar;
        }

        @Override // com.google.android.material.internal.v.e
        @o0
        public v4 a(View view, @o0 v4 v4Var, @o0 f fVar) {
            if (this.f13738a) {
                fVar.f13747d = v4Var.o() + fVar.f13747d;
            }
            boolean j5 = v.j(view);
            if (this.f13739b) {
                if (j5) {
                    fVar.f13746c = v4Var.p() + fVar.f13746c;
                } else {
                    fVar.f13744a = v4Var.p() + fVar.f13744a;
                }
            }
            if (this.f13740c) {
                if (j5) {
                    fVar.f13744a = v4Var.q() + fVar.f13744a;
                } else {
                    fVar.f13746c = v4Var.q() + fVar.f13746c;
                }
            }
            fVar.a(view);
            e eVar = this.f13741d;
            return eVar != null ? eVar.a(view, v4Var, fVar) : v4Var;
        }
    }

    /* compiled from: ViewUtils.java */
    /* loaded from: classes3.dex */
    static class c implements o1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f13742a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f13743b;

        c(e eVar, f fVar) {
            this.f13742a = eVar;
            this.f13743b = fVar;
        }

        @Override // androidx.core.view.o1
        public v4 a(View view, v4 v4Var) {
            return this.f13742a.a(view, v4Var, new f(this.f13743b));
        }
    }

    /* compiled from: ViewUtils.java */
    static class d implements View.OnAttachStateChangeListener {
        d() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@o0 View view) {
            view.removeOnAttachStateChangeListener(this);
            y1.v1(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: ViewUtils.java */
    public interface e {
        v4 a(View view, v4 v4Var, f fVar);
    }

    private v() {
    }

    public static void a(@q0 View view, @o0 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void b(@o0 View view, @q0 AttributeSet attributeSet, int i5, int i6) {
        c(view, attributeSet, i5, i6, null);
    }

    public static void c(@o0 View view, @q0 AttributeSet attributeSet, int i5, int i6, @q0 e eVar) {
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, a.o.rf, i5, i6);
        boolean z5 = obtainStyledAttributes.getBoolean(a.o.sf, false);
        boolean z6 = obtainStyledAttributes.getBoolean(a.o.tf, false);
        boolean z7 = obtainStyledAttributes.getBoolean(a.o.uf, false);
        obtainStyledAttributes.recycle();
        d(view, new b(z5, z6, z7, eVar));
    }

    public static void d(@o0 View view, @o0 e eVar) {
        y1.a2(view, new c(eVar, new f(y1.k0(view), view.getPaddingTop(), y1.j0(view), view.getPaddingBottom())));
        n(view);
    }

    public static float e(@o0 Context context, @androidx.annotation.r(unit = 0) int i5) {
        return TypedValue.applyDimension(1, i5, context.getResources().getDisplayMetrics());
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
        float f6 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f6 += y1.R((View) parent);
        }
        return f6;
    }

    public static boolean j(View view) {
        return y1.Z(view) == 1;
    }

    public static PorterDuff.Mode k(int i5, PorterDuff.Mode mode) {
        if (i5 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i5 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i5 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i5) {
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
        if (y1.O0(view)) {
            y1.v1(view);
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
        public int f13744a;

        /* renamed from: b, reason: collision with root package name */
        public int f13745b;

        /* renamed from: c, reason: collision with root package name */
        public int f13746c;

        /* renamed from: d, reason: collision with root package name */
        public int f13747d;

        public f(int i5, int i6, int i7, int i8) {
            this.f13744a = i5;
            this.f13745b = i6;
            this.f13746c = i7;
            this.f13747d = i8;
        }

        public void a(View view) {
            y1.d2(view, this.f13744a, this.f13745b, this.f13746c, this.f13747d);
        }

        public f(@o0 f fVar) {
            this.f13744a = fVar.f13744a;
            this.f13745b = fVar.f13745b;
            this.f13746c = fVar.f13746c;
            this.f13747d = fVar.f13747d;
        }
    }
}
