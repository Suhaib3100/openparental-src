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
import androidx.appcompat.app.h;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.g0;
import androidx.core.view.o1;
import androidx.core.view.v4;
import androidx.core.view.y1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.shape.j;
import n1.a;

/* compiled from: BottomSheetDialog.java */
/* loaded from: classes3.dex */
public class a extends h {

    @o0
    private BottomSheetBehavior.g A;

    /* renamed from: q, reason: collision with root package name */
    private BottomSheetBehavior<FrameLayout> f13097q;

    /* renamed from: r, reason: collision with root package name */
    private FrameLayout f13098r;

    /* renamed from: s, reason: collision with root package name */
    private CoordinatorLayout f13099s;

    /* renamed from: t, reason: collision with root package name */
    private FrameLayout f13100t;

    /* renamed from: u, reason: collision with root package name */
    boolean f13101u;

    /* renamed from: v, reason: collision with root package name */
    boolean f13102v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f13103w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f13104x;

    /* renamed from: y, reason: collision with root package name */
    private BottomSheetBehavior.g f13105y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f13106z;

    /* compiled from: BottomSheetDialog.java */
    /* renamed from: com.google.android.material.bottomsheet.a$a, reason: collision with other inner class name */
    class C0166a implements o1 {
        C0166a() {
        }

        @Override // androidx.core.view.o1
        public v4 a(View view, v4 v4Var) {
            if (a.this.f13105y != null) {
                a.this.f13097q.u0(a.this.f13105y);
            }
            if (v4Var != null) {
                a aVar = a.this;
                aVar.f13105y = new f(aVar.f13100t, v4Var, null);
                a.this.f13097q.U(a.this.f13105y);
            }
            return v4Var;
        }
    }

    /* compiled from: BottomSheetDialog.java */
    /* loaded from: classes2.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.f13102v && aVar.isShowing() && a.this.s()) {
                a.this.cancel();
            }
        }
    }

    /* compiled from: BottomSheetDialog.java */
    class c extends androidx.core.view.a {
        c() {
        }

        @Override // androidx.core.view.a
        public void g(View view, @o0 g0 g0Var) {
            super.g(view, g0Var);
            if (!a.this.f13102v) {
                g0Var.d1(false);
            } else {
                g0Var.a(1048576);
                g0Var.d1(true);
            }
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i5, Bundle bundle) {
            if (i5 == 1048576) {
                a aVar = a.this;
                if (aVar.f13102v) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.j(view, i5, bundle);
        }
    }

    /* compiled from: BottomSheetDialog.java */
    /* loaded from: classes2.dex */
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
        public void a(@o0 View view, float f6) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(@o0 View view, int i5) {
            if (i5 == 5) {
                a.this.cancel();
            }
        }
    }

    /* compiled from: BottomSheetDialog.java */
    private static class f extends BottomSheetBehavior.g {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f13112a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f13113b;

        /* renamed from: c, reason: collision with root package name */
        private final v4 f13114c;

        /* synthetic */ f(View view, v4 v4Var, C0166a c0166a) {
            this(view, v4Var);
        }

        private void c(View view) {
            if (view.getTop() < this.f13114c.r()) {
                a.r(view, this.f13112a);
                view.setPadding(view.getPaddingLeft(), this.f13114c.r() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                a.r(view, this.f13113b);
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void a(@o0 View view, float f6) {
            c(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(@o0 View view, int i5) {
            c(view);
        }

        private f(@o0 View view, @o0 v4 v4Var) {
            this.f13114c = v4Var;
            boolean z5 = (view.getSystemUiVisibility() & 8192) != 0;
            this.f13113b = z5;
            j i02 = BottomSheetBehavior.f0(view).i0();
            ColorStateList A = i02 != null ? i02.A() : y1.N(view);
            if (A != null) {
                this.f13112a = p1.a.f(A.getDefaultColor());
            } else if (view.getBackground() instanceof ColorDrawable) {
                this.f13112a = p1.a.f(((ColorDrawable) view.getBackground()).getColor());
            } else {
                this.f13112a = z5;
            }
        }
    }

    public a(@o0 Context context) {
        this(context, 0);
        this.f13106z = getContext().getTheme().obtainStyledAttributes(new int[]{a.c.J4}).getBoolean(0, false);
    }

    private static int c(@o0 Context context, int i5) {
        if (i5 != 0) {
            return i5;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(a.c.N0, typedValue, true) ? typedValue.resourceId : a.n.V7;
    }

    private FrameLayout k() {
        if (this.f13098r == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), a.k.E, null);
            this.f13098r = frameLayout;
            this.f13099s = (CoordinatorLayout) frameLayout.findViewById(a.h.U0);
            FrameLayout frameLayout2 = (FrameLayout) this.f13098r.findViewById(a.h.f29722g1);
            this.f13100t = frameLayout2;
            BottomSheetBehavior<FrameLayout> f02 = BottomSheetBehavior.f0(frameLayout2);
            this.f13097q = f02;
            f02.U(this.A);
            this.f13097q.E0(this.f13102v);
        }
        return this.f13098r;
    }

    public static void r(@o0 View view, boolean z5) {
        int systemUiVisibility = view.getSystemUiVisibility();
        view.setSystemUiVisibility(z5 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }

    private View t(int i5, @q0 View view, @q0 ViewGroup.LayoutParams layoutParams) {
        k();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f13098r.findViewById(a.h.U0);
        if (i5 != 0 && view == null) {
            view = getLayoutInflater().inflate(i5, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f13106z) {
            y1.a2(this.f13100t, new C0166a());
        }
        this.f13100t.removeAllViews();
        if (layoutParams == null) {
            this.f13100t.addView(view);
        } else {
            this.f13100t.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(a.h.H5).setOnClickListener(new b());
        y1.B1(this.f13100t, new c());
        this.f13100t.setOnTouchListener(new d());
        return this.f13098r;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> m5 = m();
        if (!this.f13101u || m5.o0() == 5) {
            super.cancel();
        } else {
            m5.K0(5);
        }
    }

    @o0
    public BottomSheetBehavior<FrameLayout> m() {
        if (this.f13097q == null) {
            k();
        }
        return this.f13097q;
    }

    public boolean n() {
        return this.f13101u;
    }

    public boolean o() {
        return this.f13106z;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z5 = this.f13106z && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f13098r;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z5);
            }
            CoordinatorLayout coordinatorLayout = this.f13099s;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z5);
            }
            if (z5) {
                window.getDecorView().setSystemUiVisibility(768);
            }
        }
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f13097q;
        if (bottomSheetBehavior == null || bottomSheetBehavior.o0() != 5) {
            return;
        }
        this.f13097q.K0(4);
    }

    void p() {
        this.f13097q.u0(this.A);
    }

    public void q(boolean z5) {
        this.f13101u = z5;
    }

    boolean s() {
        if (!this.f13104x) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.f13103w = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.f13104x = true;
        }
        return this.f13103w;
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z5) {
        super.setCancelable(z5);
        if (this.f13102v != z5) {
            this.f13102v = z5;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f13097q;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.E0(z5);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z5) {
        super.setCanceledOnTouchOutside(z5);
        if (z5 && !this.f13102v) {
            this.f13102v = true;
        }
        this.f13103w = z5;
        this.f13104x = true;
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void setContentView(@j0 int i5) {
        super.setContentView(t(i5, null, null));
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(t(0, view, null));
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(t(0, view, layoutParams));
    }

    public a(@o0 Context context, @h1 int i5) {
        super(context, c(context, i5));
        this.f13102v = true;
        this.f13103w = true;
        this.A = new e();
        e(1);
        this.f13106z = getContext().getTheme().obtainStyledAttributes(new int[]{a.c.J4}).getBoolean(0, false);
    }

    protected a(@o0 Context context, boolean z5, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z5, onCancelListener);
        this.f13102v = true;
        this.f13103w = true;
        this.A = new e();
        e(1);
        this.f13102v = z5;
        this.f13106z = getContext().getTheme().obtainStyledAttributes(new int[]{a.c.J4}).getBoolean(0, false);
    }
}
