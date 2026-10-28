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
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.accessibility.g0;
import androidx.core.view.y1;
import d.a;
import n1.a;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements o.a {

    /* renamed from: i0, reason: collision with root package name */
    private static final int[] f13591i0 = {R.attr.state_checked};
    private int V;
    private boolean W;

    /* renamed from: a0, reason: collision with root package name */
    boolean f13592a0;

    /* renamed from: b0, reason: collision with root package name */
    private final CheckedTextView f13593b0;

    /* renamed from: c0, reason: collision with root package name */
    private FrameLayout f13594c0;

    /* renamed from: d0, reason: collision with root package name */
    private androidx.appcompat.view.menu.j f13595d0;

    /* renamed from: e0, reason: collision with root package name */
    private ColorStateList f13596e0;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f13597f0;

    /* renamed from: g0, reason: collision with root package name */
    private Drawable f13598g0;

    /* renamed from: h0, reason: collision with root package name */
    private final androidx.core.view.a f13599h0;

    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void g(View view, @o0 g0 g0Var) {
            super.g(view, g0Var);
            g0Var.U0(NavigationMenuItemView.this.f13592a0);
        }
    }

    public NavigationMenuItemView(@o0 Context context) {
        this(context, null);
    }

    private void Z() {
        if (l0()) {
            this.f13593b0.setVisibility(8);
            FrameLayout frameLayout = this.f13594c0;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).width = -1;
                this.f13594c0.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.f13593b0.setVisibility(0);
        FrameLayout frameLayout2 = this.f13594c0;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams2).width = -2;
            this.f13594c0.setLayoutParams(layoutParams2);
        }
    }

    @q0
    private StateListDrawable a0() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(a.c.E0, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f13591i0, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private void c0(@q0 View view) {
        if (view != null) {
            if (this.f13594c0 == null) {
                this.f13594c0 = (FrameLayout) ((ViewStub) findViewById(a.h.f29734i1)).inflate();
            }
            this.f13594c0.removeAllViews();
            this.f13594c0.addView(view);
        }
    }

    private boolean l0() {
        return this.f13595d0.getTitle() == null && this.f13595d0.getIcon() == null && this.f13595d0.getActionView() != null;
    }

    public void b0() {
        FrameLayout frameLayout = this.f13594c0;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f13593b0.setCompoundDrawables(null, null, null, null);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void c(boolean z5, char c6) {
    }

    @Override // androidx.appcompat.view.menu.o.a
    public androidx.appcompat.view.menu.j d() {
        return this.f13595d0;
    }

    public void d0(int i5) {
        setPadding(i5, 0, i5, 0);
    }

    public void e0(int i5) {
        this.f13593b0.setCompoundDrawablePadding(i5);
    }

    public void f0(@androidx.annotation.r int i5) {
        this.V = i5;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean g() {
        return false;
    }

    void g0(ColorStateList colorStateList) {
        this.f13596e0 = colorStateList;
        this.f13597f0 = colorStateList != null;
        androidx.appcompat.view.menu.j jVar = this.f13595d0;
        if (jVar != null) {
            setIcon(jVar.getIcon());
        }
    }

    public void h0(int i5) {
        this.f13593b0.setMaxLines(i5);
    }

    public void i0(boolean z5) {
        this.W = z5;
    }

    public void j0(int i5) {
        this.f13593b0.setTextAppearance(i5);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean k() {
        return true;
    }

    public void k0(ColorStateList colorStateList) {
        this.f13593b0.setTextColor(colorStateList);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void l(@o0 androidx.appcompat.view.menu.j jVar, int i5) {
        this.f13595d0 = jVar;
        if (jVar.getItemId() > 0) {
            setId(jVar.getItemId());
        }
        setVisibility(jVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            y1.I1(this, a0());
        }
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setTitle(jVar.getTitle());
        setIcon(jVar.getIcon());
        c0(jVar.getActionView());
        setContentDescription(jVar.getContentDescription());
        androidx.appcompat.widget.c1.a(this, jVar.getTooltipText());
        Z();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i5) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i5 + 1);
        androidx.appcompat.view.menu.j jVar = this.f13595d0;
        if (jVar != null && jVar.isCheckable() && this.f13595d0.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f13591i0);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setCheckable(boolean z5) {
        refreshDrawableState();
        if (this.f13592a0 != z5) {
            this.f13592a0 = z5;
            this.f13599h0.l(this.f13593b0, 2048);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setChecked(boolean z5) {
        refreshDrawableState();
        this.f13593b0.setChecked(z5);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setIcon(@q0 Drawable drawable) {
        if (drawable != null) {
            if (this.f13597f0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                androidx.core.graphics.drawable.d.o(drawable, this.f13596e0);
            }
            int i5 = this.V;
            drawable.setBounds(0, 0, i5, i5);
        } else if (this.W) {
            if (this.f13598g0 == null) {
                Drawable g5 = androidx.core.content.res.i.g(getResources(), a.g.f29635l1, getContext().getTheme());
                this.f13598g0 = g5;
                if (g5 != null) {
                    int i6 = this.V;
                    g5.setBounds(0, 0, i6, i6);
                }
            }
            drawable = this.f13598g0;
        }
        androidx.core.widget.s.w(this.f13593b0, drawable, null, null, null);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setTitle(CharSequence charSequence) {
        this.f13593b0.setText(charSequence);
    }

    public NavigationMenuItemView(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(@o0 Context context, @q0 AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        a aVar = new a();
        this.f13599h0 = aVar;
        V(0);
        LayoutInflater.from(context).inflate(a.k.P, (ViewGroup) this, true);
        f0(context.getResources().getDimensionPixelSize(a.f.f29524n1));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(a.h.f29740j1);
        this.f13593b0 = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        y1.B1(checkedTextView, aVar);
    }
}
