package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.y0;
import androidx.core.view.accessibility.h0;
import androidx.core.view.x1;
import d.a;
import s8.a;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements p.a {
    private static final int[] Q1 = {R.attr.state_checked};
    private int I;
    private boolean J;
    boolean K;
    private final CheckedTextView L;
    private FrameLayout M;
    private androidx.appcompat.view.menu.k N;
    private ColorStateList O;
    private boolean P;
    private Drawable Q;
    private final androidx.core.view.a R;

    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void i(View view, @o0 h0 h0Var) {
            super.i(view, h0Var);
            h0Var.h1(NavigationMenuItemView.this.K);
        }
    }

    public NavigationMenuItemView(@o0 Context context) {
        this(context, null);
    }

    private void b0() {
        if (n0()) {
            this.L.setVisibility(8);
            FrameLayout frameLayout = this.M;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).width = -1;
                this.M.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.L.setVisibility(0);
        FrameLayout frameLayout2 = this.M;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams2).width = -2;
            this.M.setLayoutParams(layoutParams2);
        }
    }

    @q0
    private StateListDrawable c0() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(a.b.G0, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(Q1, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private void e0(@q0 View view) {
        if (view != null) {
            if (this.M == null) {
                this.M = (FrameLayout) ((ViewStub) findViewById(a.h.f91024i1)).inflate();
            }
            this.M.removeAllViews();
            this.M.addView(view);
        }
    }

    private boolean n0() {
        return this.N.getTitle() == null && this.N.getIcon() == null && this.N.getActionView() != null;
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void b(boolean z4, char c5) {
    }

    public void d0() {
        FrameLayout frameLayout = this.M;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.L.setCompoundDrawables(null, null, null, null);
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void e(@o0 androidx.appcompat.view.menu.k kVar, int i4) {
        this.N = kVar;
        if (kVar.getItemId() > 0) {
            setId(kVar.getItemId());
        }
        setVisibility(kVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            x1.P1(this, c0());
        }
        setCheckable(kVar.isCheckable());
        setChecked(kVar.isChecked());
        setEnabled(kVar.isEnabled());
        setTitle(kVar.getTitle());
        setIcon(kVar.getIcon());
        e0(kVar.getActionView());
        setContentDescription(kVar.getContentDescription());
        y0.a(this, kVar.getTooltipText());
        b0();
    }

    public void f0(int i4) {
        setPadding(i4, 0, i4, 0);
    }

    @Override // androidx.appcompat.view.menu.p.a
    public androidx.appcompat.view.menu.k g() {
        return this.N;
    }

    public void g0(int i4) {
        this.L.setCompoundDrawablePadding(i4);
    }

    @Override // androidx.appcompat.view.menu.p.a
    public boolean h() {
        return false;
    }

    public void h0(@androidx.annotation.r int i4) {
        this.I = i4;
    }

    @Override // androidx.appcompat.view.menu.p.a
    public boolean i() {
        return true;
    }

    void i0(ColorStateList colorStateList) {
        this.O = colorStateList;
        this.P = colorStateList != null;
        androidx.appcompat.view.menu.k kVar = this.N;
        if (kVar != null) {
            setIcon(kVar.getIcon());
        }
    }

    public void j0(int i4) {
        this.L.setMaxLines(i4);
    }

    public void k0(boolean z4) {
        this.J = z4;
    }

    public void l0(int i4) {
        this.L.setTextAppearance(i4);
    }

    public void m0(ColorStateList colorStateList) {
        this.L.setTextColor(colorStateList);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 1);
        androidx.appcompat.view.menu.k kVar = this.N;
        if (kVar != null && kVar.isCheckable() && this.N.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, Q1);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void setCheckable(boolean z4) {
        refreshDrawableState();
        if (this.K != z4) {
            this.K = z4;
            this.R.p(this.L, 2048);
        }
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void setChecked(boolean z4) {
        refreshDrawableState();
        this.L.setChecked(z4);
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void setIcon(@q0 Drawable drawable) {
        if (drawable != null) {
            if (this.P) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.O);
            }
            int i4 = this.I;
            drawable.setBounds(0, 0, i4, i4);
        } else if (this.J) {
            if (this.Q == null) {
                Drawable g4 = androidx.core.content.res.i.g(getResources(), a.g.f90935l1, getContext().getTheme());
                this.Q = g4;
                if (g4 != null) {
                    int i5 = this.I;
                    g4.setBounds(0, 0, i5, i5);
                }
            }
            drawable = this.Q;
        }
        this.L.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void setTitle(CharSequence charSequence) {
        this.L.setText(charSequence);
    }

    public NavigationMenuItemView(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(@o0 Context context, @q0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        a aVar = new a();
        this.R = aVar;
        X(0);
        LayoutInflater.from(context).inflate(a.k.P, (ViewGroup) this, true);
        h0(context.getResources().getDimensionPixelSize(a.f.f90837n1));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(a.h.f91029j1);
        this.L = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        x1.H1(checkedTextView, aVar);
    }
}
