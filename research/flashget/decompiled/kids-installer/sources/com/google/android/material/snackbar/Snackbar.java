package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.c1;
import androidx.annotation.g1;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.r;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import n1.a;

/* loaded from: classes3.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {
    private static final int[] N;
    private static final int[] O;

    @q0
    private final AccessibilityManager K;
    private boolean L;

    @q0
    private BaseTransientBottomBar.t<Snackbar> M;

    @c1({c1.a.LIBRARY_GROUP})
    public static final class SnackbarLayout extends BaseTransientBottomBar.z {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i5, int i6) {
            super.onMeasure(i5, i6);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), androidx.constraintlayout.solver.widgets.analyzer.b.f2366g));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.z, android.view.View
        public void setBackground(@q0 Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.z, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(@q0 Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.z, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(@q0 ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.z, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(@q0 PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.z, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(@q0 View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(Context context) {
            super(context, null);
        }
    }

    /* loaded from: classes2.dex */
    class a implements View.OnClickListener {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f14249o;

        a(View.OnClickListener onClickListener) {
            this.f14249o = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f14249o.onClick(view);
            Snackbar.this.x(1);
        }
    }

    public static class b extends BaseTransientBottomBar.t<Snackbar> {

        /* renamed from: f, reason: collision with root package name */
        public static final int f14251f = 0;

        /* renamed from: g, reason: collision with root package name */
        public static final int f14252g = 1;

        /* renamed from: h, reason: collision with root package name */
        public static final int f14253h = 2;

        /* renamed from: i, reason: collision with root package name */
        public static final int f14254i = 3;

        /* renamed from: j, reason: collision with root package name */
        public static final int f14255j = 4;

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.t
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Snackbar snackbar, int i5) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.t
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(Snackbar snackbar) {
        }
    }

    static {
        int i5 = a.c.Lc;
        N = new int[]{i5};
        O = new int[]{i5, a.c.Nc};
    }

    private Snackbar(@o0 Context context, @o0 ViewGroup viewGroup, @o0 View view, @o0 com.google.android.material.snackbar.a aVar) {
        super(context, viewGroup, view, aVar);
        this.K = (AccessibilityManager) viewGroup.getContext().getSystemService(ProtectedSandApp.s("✢"));
    }

    @q0
    private static ViewGroup n0(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    @Deprecated
    protected static boolean o0(@o0 Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(N);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    private static boolean p0(@o0 Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(O);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    @o0
    public static Snackbar q0(@o0 Context context, @o0 View view, @o0 CharSequence charSequence, int i5) {
        return t0(context, view, charSequence, i5);
    }

    @o0
    public static Snackbar r0(@o0 View view, @g1 int i5, int i6) {
        return t0(null, view, view.getResources().getText(i5), i6);
    }

    @o0
    public static Snackbar s0(@o0 View view, @o0 CharSequence charSequence, int i5) {
        return t0(null, view, charSequence, i5);
    }

    @o0
    private static Snackbar t0(@q0 Context context, @o0 View view, @o0 CharSequence charSequence, int i5) {
        ViewGroup n02 = n0(view);
        if (n02 == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("✣"));
        }
        if (context == null) {
            context = n02.getContext();
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(p0(context) ? a.k.f29932x0 : a.k.G, n02, false);
        Snackbar snackbar = new Snackbar(context, n02, snackbarContentLayout, snackbarContentLayout);
        snackbar.E0(charSequence);
        snackbar.a0(i5);
        return snackbar;
    }

    @o0
    public Snackbar A0(@q0 PorterDuff.Mode mode) {
        this.f14193c.setBackgroundTintMode(mode);
        return this;
    }

    @o0
    @Deprecated
    public Snackbar B0(@q0 b bVar) {
        BaseTransientBottomBar.t<Snackbar> tVar = this.M;
        if (tVar != null) {
            U(tVar);
        }
        if (bVar != null) {
            s(bVar);
        }
        this.M = bVar;
        return this;
    }

    @o0
    public Snackbar C0(@r int i5) {
        ((SnackbarContentLayout) this.f14193c.getChildAt(0)).e(i5);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int D() {
        int recommendedTimeoutMillis;
        int D = super.D();
        if (D == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            recommendedTimeoutMillis = this.K.getRecommendedTimeoutMillis(D, (this.L ? 4 : 0) | 1 | 2);
            return recommendedTimeoutMillis;
        }
        if (this.L && this.K.isTouchExplorationEnabled()) {
            return -2;
        }
        return D;
    }

    @o0
    public Snackbar D0(@g1 int i5) {
        return E0(C().getText(i5));
    }

    @o0
    public Snackbar E0(@o0 CharSequence charSequence) {
        ((SnackbarContentLayout) this.f14193c.getChildAt(0)).d().setText(charSequence);
        return this;
    }

    @o0
    public Snackbar F0(@l int i5) {
        ((SnackbarContentLayout) this.f14193c.getChildAt(0)).d().setTextColor(i5);
        return this;
    }

    @o0
    public Snackbar G0(ColorStateList colorStateList) {
        ((SnackbarContentLayout) this.f14193c.getChildAt(0)).d().setTextColor(colorStateList);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public boolean P() {
        return super.P();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void f0() {
        super.f0();
    }

    @o0
    public Snackbar u0(@g1 int i5, View.OnClickListener onClickListener) {
        return v0(C().getText(i5), onClickListener);
    }

    @o0
    public Snackbar v0(@q0 CharSequence charSequence, @q0 View.OnClickListener onClickListener) {
        Button c6 = ((SnackbarContentLayout) this.f14193c.getChildAt(0)).c();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            c6.setVisibility(8);
            c6.setOnClickListener(null);
            this.L = false;
        } else {
            this.L = true;
            c6.setVisibility(0);
            c6.setText(charSequence);
            c6.setOnClickListener(new a(onClickListener));
        }
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void w() {
        x(3);
    }

    @o0
    public Snackbar w0(@l int i5) {
        ((SnackbarContentLayout) this.f14193c.getChildAt(0)).c().setTextColor(i5);
        return this;
    }

    @o0
    public Snackbar x0(ColorStateList colorStateList) {
        ((SnackbarContentLayout) this.f14193c.getChildAt(0)).c().setTextColor(colorStateList);
        return this;
    }

    @o0
    public Snackbar y0(@l int i5) {
        return z0(ColorStateList.valueOf(i5));
    }

    @o0
    public Snackbar z0(@q0 ColorStateList colorStateList) {
        this.f14193c.setBackgroundTintList(colorStateList);
        return this;
    }
}
