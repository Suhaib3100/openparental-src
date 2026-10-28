package com.google.android.material.bottomsheet;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.h1;
import androidx.annotation.j0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.app.r;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.h0;
import androidx.core.view.d1;
import androidx.core.view.j3;
import androidx.core.view.x1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.shape.j;
import s8.a;

/* compiled from: BottomSheetDialog.java */
/* loaded from: classes6.dex */
public class a extends r {

    /* renamed from: g, reason: collision with root package name */
    private BottomSheetBehavior<FrameLayout> f52820g;

    /* renamed from: h, reason: collision with root package name */
    private FrameLayout f52821h;

    /* renamed from: i, reason: collision with root package name */
    private CoordinatorLayout f52822i;

    /* renamed from: j, reason: collision with root package name */
    private FrameLayout f52823j;

    /* renamed from: k, reason: collision with root package name */
    boolean f52824k;

    /* renamed from: l, reason: collision with root package name */
    boolean f52825l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f52826m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f52827n;

    /* renamed from: o, reason: collision with root package name */
    private BottomSheetBehavior.g f52828o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f52829p;

    /* renamed from: q, reason: collision with root package name */
    @o0
    private BottomSheetBehavior.g f52830q;

    /* compiled from: BottomSheetDialog.java */
    /* renamed from: com.google.android.material.bottomsheet.a$a, reason: collision with other inner class name */
    class C0800a implements d1 {
        C0800a() {
        }

        @Override // androidx.core.view.d1
        public j3 a(View view, j3 j3Var) {
            if (a.this.f52828o != null) {
                a.this.f52820g.u0(a.this.f52828o);
            }
            if (j3Var != null) {
                a aVar = a.this;
                aVar.f52828o = new f(aVar.f52823j, j3Var, null);
                a.this.f52820g.U(a.this.f52828o);
            }
            return j3Var;
        }
    }

    /* compiled from: BottomSheetDialog.java */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.f52825l && aVar.isShowing() && a.this.z()) {
                a.this.cancel();
            }
        }
    }

    /* compiled from: BottomSheetDialog.java */
    class c extends androidx.core.view.a {
        c() {
        }

        @Override // androidx.core.view.a
        public void i(View view, @o0 h0 h0Var) {
            super.i(view, h0Var);
            if (!a.this.f52825l) {
                h0Var.r1(false);
            } else {
                h0Var.a(1048576);
                h0Var.r1(true);
            }
        }

        @Override // androidx.core.view.a
        public boolean m(View view, int i4, Bundle bundle) {
            if (i4 == 1048576) {
                a aVar = a.this;
                if (aVar.f52825l) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.m(view, i4, bundle);
        }
    }

    /* compiled from: BottomSheetDialog.java */
    class d implements View.OnTouchListener {
        d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* compiled from: BottomSheetDialog.java */
    class e extends BottomSheetBehavior.g {
        e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void a(@o0 View view, float f4) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(@o0 View view, int i4) {
            if (i4 == 5) {
                a.this.cancel();
            }
        }
    }

    /* compiled from: BottomSheetDialog.java */
    private static class f extends BottomSheetBehavior.g {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f52836a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f52837b;

        /* renamed from: c, reason: collision with root package name */
        private final j3 f52838c;

        /* synthetic */ f(View view, j3 j3Var, C0800a c0800a) {
            this(view, j3Var);
        }

        private void c(View view) {
            if (view.getTop() < this.f52838c.r()) {
                a.y(view, this.f52836a);
                view.setPadding(view.getPaddingLeft(), this.f52838c.r() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                a.y(view, this.f52837b);
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void a(@o0 View view, float f4) {
            c(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(@o0 View view, int i4) {
            c(view);
        }

        private f(@o0 View view, @o0 j3 j3Var) {
            this.f52838c = j3Var;
            boolean z4 = (view.getSystemUiVisibility() & 8192) != 0;
            this.f52837b = z4;
            j i02 = BottomSheetBehavior.f0(view).i0();
            ColorStateList A = i02 != null ? i02.A() : x1.O(view);
            if (A != null) {
                this.f52836a = u8.a.f(A.getDefaultColor());
            } else if (view.getBackground() instanceof ColorDrawable) {
                this.f52836a = u8.a.f(((ColorDrawable) view.getBackground()).getColor());
            } else {
                this.f52836a = z4;
            }
        }
    }

    public a(@o0 Context context) {
        this(context, 0);
        this.f52829p = getContext().getTheme().obtainStyledAttributes(new int[]{a.c.I4}).getBoolean(0, false);
    }

    private View A(int i4, @q0 View view, @q0 ViewGroup.LayoutParams layoutParams) {
        s();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f52821h.findViewById(a.h.U0);
        if (i4 != 0 && view == null) {
            view = getLayoutInflater().inflate(i4, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f52829p) {
            x1.k2(this.f52823j, new C0800a());
        }
        this.f52823j.removeAllViews();
        if (layoutParams == null) {
            this.f52823j.addView(view);
        } else {
            this.f52823j.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(a.h.H5).setOnClickListener(new b());
        x1.H1(this.f52823j, new c());
        this.f52823j.setOnTouchListener(new d());
        return this.f52821h;
    }

    private static int l(@o0 Context context, int i4) {
        if (i4 != 0) {
            return i4;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(a.c.M0, typedValue, true) ? typedValue.resourceId : a.n.V7;
    }

    private FrameLayout s() {
        if (this.f52821h == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), a.k.E, null);
            this.f52821h = frameLayout;
            this.f52822i = (CoordinatorLayout) frameLayout.findViewById(a.h.U0);
            FrameLayout frameLayout2 = (FrameLayout) this.f52821h.findViewById(a.h.f91014g1);
            this.f52823j = frameLayout2;
            BottomSheetBehavior<FrameLayout> f02 = BottomSheetBehavior.f0(frameLayout2);
            this.f52820g = f02;
            f02.U(this.f52830q);
            this.f52820g.E0(this.f52825l);
        }
        return this.f52821h;
    }

    public static void y(@o0 View view, boolean z4) {
        int systemUiVisibility = view.getSystemUiVisibility();
        view.setSystemUiVisibility(z4 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> t4 = t();
        if (!this.f52824k || t4.o0() == 5) {
            super.cancel();
        } else {
            t4.K0(5);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z4 = this.f52829p && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f52821h;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z4);
            }
            CoordinatorLayout coordinatorLayout = this.f52822i;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z4);
            }
            if (z4) {
                window.getDecorView().setSystemUiVisibility(768);
            }
        }
    }

    @Override // androidx.appcompat.app.r, androidx.view.o, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.view.o, android.app.Dialog
    protected void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f52820g;
        if (bottomSheetBehavior == null || bottomSheetBehavior.o0() != 5) {
            return;
        }
        this.f52820g.K0(4);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z4) {
        super.setCancelable(z4);
        if (this.f52825l != z4) {
            this.f52825l = z4;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f52820g;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.E0(z4);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z4) {
        super.setCanceledOnTouchOutside(z4);
        if (z4 && !this.f52825l) {
            this.f52825l = true;
        }
        this.f52826m = z4;
        this.f52827n = true;
    }

    @Override // androidx.appcompat.app.r, androidx.view.o, android.app.Dialog
    public void setContentView(@j0 int i4) {
        super.setContentView(A(i4, null, null));
    }

    @o0
    public BottomSheetBehavior<FrameLayout> t() {
        if (this.f52820g == null) {
            s();
        }
        return this.f52820g;
    }

    public boolean u() {
        return this.f52824k;
    }

    public boolean v() {
        return this.f52829p;
    }

    void w() {
        this.f52820g.u0(this.f52830q);
    }

    public void x(boolean z4) {
        this.f52824k = z4;
    }

    boolean z() {
        if (!this.f52827n) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.f52826m = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.f52827n = true;
        }
        return this.f52826m;
    }

    @Override // androidx.appcompat.app.r, androidx.view.o, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(A(0, view, null));
    }

    @Override // androidx.appcompat.app.r, androidx.view.o, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(A(0, view, layoutParams));
    }

    public a(@o0 Context context, @h1 int i4) {
        super(context, l(context, i4));
        this.f52825l = true;
        this.f52826m = true;
        this.f52830q = new e();
        n(1);
        this.f52829p = getContext().getTheme().obtainStyledAttributes(new int[]{a.c.I4}).getBoolean(0, false);
    }

    protected a(@o0 Context context, boolean z4, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z4, onCancelListener);
        this.f52825l = true;
        this.f52826m = true;
        this.f52830q = new e();
        n(1);
        this.f52825l = z4;
        this.f52829p = getContext().getTheme().obtainStyledAttributes(new int[]{a.c.I4}).getBoolean(0, false);
    }
}
