package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.c1;
import androidx.annotation.h1;
import androidx.annotation.j0;
import androidx.annotation.o0;
import androidx.annotation.q;
import androidx.annotation.q0;
import androidx.annotation.v;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import androidx.core.graphics.drawable.d;
import androidx.core.view.accessibility.g0;
import androidx.core.view.s1;
import androidx.core.view.y1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.badge.BadgeDrawable;
import n1.a;

/* compiled from: NavigationBarItemView.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public abstract class a extends FrameLayout implements o.a {
    private static final int E = -1;
    private static final int[] F = {R.attr.state_checked};

    @q0
    private ColorStateList A;

    @q0
    private Drawable B;

    @q0
    private Drawable C;

    @q0
    private BadgeDrawable D;

    /* renamed from: o, reason: collision with root package name */
    private final int f13779o;

    /* renamed from: p, reason: collision with root package name */
    private float f13780p;

    /* renamed from: q, reason: collision with root package name */
    private float f13781q;

    /* renamed from: r, reason: collision with root package name */
    private float f13782r;

    /* renamed from: s, reason: collision with root package name */
    private int f13783s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f13784t;

    /* renamed from: u, reason: collision with root package name */
    private ImageView f13785u;

    /* renamed from: v, reason: collision with root package name */
    private final ViewGroup f13786v;

    /* renamed from: w, reason: collision with root package name */
    private final TextView f13787w;

    /* renamed from: x, reason: collision with root package name */
    private final TextView f13788x;

    /* renamed from: y, reason: collision with root package name */
    private int f13789y;

    /* renamed from: z, reason: collision with root package name */
    @q0
    private j f13790z;

    /* compiled from: NavigationBarItemView.java */
    /* renamed from: com.google.android.material.navigation.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class ViewOnLayoutChangeListenerC0177a implements View.OnLayoutChangeListener {
        ViewOnLayoutChangeListenerC0177a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
            if (a.this.f13785u.getVisibility() == 0) {
                a aVar = a.this;
                aVar.I(aVar.f13785u);
            }
        }
    }

    public a(@o0 Context context) {
        super(context);
        this.f13789y = -1;
        LayoutInflater.from(context).inflate(m(), (ViewGroup) this, true);
        this.f13785u = (ImageView) findViewById(a.h.f29778p3);
        ViewGroup viewGroup = (ViewGroup) findViewById(a.h.f29784q3);
        this.f13786v = viewGroup;
        TextView textView = (TextView) findViewById(a.h.f29796s3);
        this.f13787w = textView;
        TextView textView2 = (TextView) findViewById(a.h.f29790r3);
        this.f13788x = textView2;
        setBackgroundResource(i());
        this.f13779o = getResources().getDimensionPixelSize(j());
        viewGroup.setTag(a.h.f29766n3, Integer.valueOf(viewGroup.getPaddingBottom()));
        y1.R1(textView, 2);
        y1.R1(textView2, 2);
        setFocusable(true);
        e(textView.getTextSize(), textView2.getTextSize());
        ImageView imageView = this.f13785u;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0177a());
        }
    }

    private static void E(@o0 View view, int i5, int i6) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i5;
        layoutParams.gravity = i6;
        view.setLayoutParams(layoutParams);
    }

    private static void F(@o0 View view, float f6, float f7, int i5) {
        view.setScaleX(f6);
        view.setScaleY(f7);
        view.setVisibility(i5);
    }

    private void G(@q0 View view) {
        if (r() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            com.google.android.material.badge.a.b(this.D, view, h(view));
        }
    }

    private void H(@q0 View view) {
        if (r()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                com.google.android.material.badge.a.g(this.D, view);
            }
            this.D = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(View view) {
        if (r()) {
            com.google.android.material.badge.a.j(this.D, view, h(view));
        }
    }

    private static void J(@o0 View view, int i5) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i5);
    }

    private void e(float f6, float f7) {
        this.f13780p = f6 - f7;
        this.f13781q = (f7 * 1.0f) / f6;
        this.f13782r = (f6 * 1.0f) / f7;
    }

    @q0
    private FrameLayout h(View view) {
        ImageView imageView = this.f13785u;
        if (view == imageView && com.google.android.material.badge.a.f12931a) {
            return (FrameLayout) imageView.getParent();
        }
        return null;
    }

    private int o() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i5 = 0;
        for (int i6 = 0; i6 < indexOfChild; i6++) {
            View childAt = viewGroup.getChildAt(i6);
            if ((childAt instanceof a) && childAt.getVisibility() == 0) {
                i5++;
            }
        }
        return i5;
    }

    private int p() {
        BadgeDrawable badgeDrawable = this.D;
        int minimumHeight = badgeDrawable != null ? badgeDrawable.getMinimumHeight() / 2 : 0;
        return this.f13785u.getMeasuredWidth() + Math.max(minimumHeight, ((FrameLayout.LayoutParams) this.f13785u.getLayoutParams()).topMargin) + minimumHeight;
    }

    private int q() {
        BadgeDrawable badgeDrawable = this.D;
        int minimumWidth = badgeDrawable == null ? 0 : badgeDrawable.getMinimumWidth() - this.D.q();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f13785u.getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.f13785u.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    private boolean r() {
        return this.D != null;
    }

    public void A(boolean z5) {
        if (this.f13784t != z5) {
            this.f13784t = z5;
            j jVar = this.f13790z;
            if (jVar != null) {
                setChecked(jVar.isChecked());
            }
        }
    }

    public void B(@h1 int i5) {
        this.f13788x.setTextAppearance(i5);
        e(this.f13787w.getTextSize(), this.f13788x.getTextSize());
    }

    public void C(@h1 int i5) {
        this.f13787w.setTextAppearance(i5);
        e(this.f13787w.getTextSize(), this.f13788x.getTextSize());
    }

    public void D(@q0 ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f13787w.setTextColor(colorStateList);
            this.f13788x.setTextColor(colorStateList);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void c(boolean z5, char c6) {
    }

    @Override // androidx.appcompat.view.menu.o.a
    @q0
    public j d() {
        return this.f13790z;
    }

    @q0
    public BadgeDrawable f() {
        return this.D;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean g() {
        return false;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f13786v.getLayoutParams();
        return this.f13786v.getMeasuredHeight() + p() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f13786v.getLayoutParams();
        return Math.max(q(), this.f13786v.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    @v
    protected int i() {
        return a.g.f29623h1;
    }

    @q
    protected int j() {
        return a.f.g5;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean k() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void l(@o0 j jVar, int i5) {
        this.f13790z = jVar;
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setIcon(jVar.getIcon());
        setTitle(jVar.getTitle());
        setId(jVar.getItemId());
        if (!TextUtils.isEmpty(jVar.getContentDescription())) {
            setContentDescription(jVar.getContentDescription());
        }
        androidx.appcompat.widget.c1.a(this, !TextUtils.isEmpty(jVar.getTooltipText()) ? jVar.getTooltipText() : jVar.getTitle());
        setVisibility(jVar.isVisible() ? 0 : 8);
    }

    @j0
    protected abstract int m();

    public int n() {
        return this.f13789y;
    }

    @Override // android.view.ViewGroup, android.view.View
    @o0
    public int[] onCreateDrawableState(int i5) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i5 + 1);
        j jVar = this.f13790z;
        if (jVar != null && jVar.isCheckable() && this.f13790z.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, F);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@o0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.D;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            CharSequence title = this.f13790z.getTitle();
            if (!TextUtils.isEmpty(this.f13790z.getContentDescription())) {
                title = this.f13790z.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ProtectedSandApp.s("⚏") + ((Object) this.D.o()));
        }
        g0 X1 = g0.X1(accessibilityNodeInfo);
        X1.Z0(g0.c.h(0, 1, o(), 1, false, isSelected()));
        if (isSelected()) {
            X1.X0(false);
            X1.K0(g0.a.f5377j);
        }
        X1.D1(getResources().getString(a.m.P));
    }

    void s() {
        H(this.f13785u);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setCheckable(boolean z5) {
        refreshDrawableState();
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setChecked(boolean z5) {
        this.f13788x.setPivotX(r0.getWidth() / 2);
        this.f13788x.setPivotY(r0.getBaseline());
        this.f13787w.setPivotX(r0.getWidth() / 2);
        this.f13787w.setPivotY(r0.getBaseline());
        int i5 = this.f13783s;
        if (i5 != -1) {
            if (i5 == 0) {
                if (z5) {
                    E(this.f13785u, this.f13779o, 49);
                    ViewGroup viewGroup = this.f13786v;
                    J(viewGroup, ((Integer) viewGroup.getTag(a.h.f29766n3)).intValue());
                    this.f13788x.setVisibility(0);
                } else {
                    E(this.f13785u, this.f13779o, 17);
                    J(this.f13786v, 0);
                    this.f13788x.setVisibility(4);
                }
                this.f13787w.setVisibility(4);
            } else if (i5 == 1) {
                ViewGroup viewGroup2 = this.f13786v;
                J(viewGroup2, ((Integer) viewGroup2.getTag(a.h.f29766n3)).intValue());
                if (z5) {
                    E(this.f13785u, (int) (this.f13779o + this.f13780p), 49);
                    F(this.f13788x, 1.0f, 1.0f, 0);
                    TextView textView = this.f13787w;
                    float f6 = this.f13781q;
                    F(textView, f6, f6, 4);
                } else {
                    E(this.f13785u, this.f13779o, 49);
                    TextView textView2 = this.f13788x;
                    float f7 = this.f13782r;
                    F(textView2, f7, f7, 4);
                    F(this.f13787w, 1.0f, 1.0f, 0);
                }
            } else if (i5 == 2) {
                E(this.f13785u, this.f13779o, 17);
                this.f13788x.setVisibility(8);
                this.f13787w.setVisibility(8);
            }
        } else if (this.f13784t) {
            if (z5) {
                E(this.f13785u, this.f13779o, 49);
                ViewGroup viewGroup3 = this.f13786v;
                J(viewGroup3, ((Integer) viewGroup3.getTag(a.h.f29766n3)).intValue());
                this.f13788x.setVisibility(0);
            } else {
                E(this.f13785u, this.f13779o, 17);
                J(this.f13786v, 0);
                this.f13788x.setVisibility(4);
            }
            this.f13787w.setVisibility(4);
        } else {
            ViewGroup viewGroup4 = this.f13786v;
            J(viewGroup4, ((Integer) viewGroup4.getTag(a.h.f29766n3)).intValue());
            if (z5) {
                E(this.f13785u, (int) (this.f13779o + this.f13780p), 49);
                F(this.f13788x, 1.0f, 1.0f, 0);
                TextView textView3 = this.f13787w;
                float f8 = this.f13781q;
                F(textView3, f8, f8, 4);
            } else {
                E(this.f13785u, this.f13779o, 49);
                TextView textView4 = this.f13788x;
                float f9 = this.f13782r;
                F(textView4, f9, f9, 4);
                F(this.f13787w, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z5);
    }

    @Override // android.view.View, androidx.appcompat.view.menu.o.a
    public void setEnabled(boolean z5) {
        super.setEnabled(z5);
        this.f13787w.setEnabled(z5);
        this.f13788x.setEnabled(z5);
        this.f13785u.setEnabled(z5);
        if (z5) {
            y1.g2(this, s1.c(getContext(), s1.f5664e));
        } else {
            y1.g2(this, null);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setIcon(@q0 Drawable drawable) {
        if (drawable == this.B) {
            return;
        }
        this.B = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.C = drawable;
            ColorStateList colorStateList = this.A;
            if (colorStateList != null) {
                d.o(drawable, colorStateList);
            }
        }
        this.f13785u.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setTitle(@q0 CharSequence charSequence) {
        this.f13787w.setText(charSequence);
        this.f13788x.setText(charSequence);
        j jVar = this.f13790z;
        if (jVar == null || TextUtils.isEmpty(jVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        j jVar2 = this.f13790z;
        if (jVar2 != null && !TextUtils.isEmpty(jVar2.getTooltipText())) {
            charSequence = this.f13790z.getTooltipText();
        }
        androidx.appcompat.widget.c1.a(this, charSequence);
    }

    void t(@o0 BadgeDrawable badgeDrawable) {
        this.D = badgeDrawable;
        ImageView imageView = this.f13785u;
        if (imageView != null) {
            G(imageView);
        }
    }

    public void u(int i5) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f13785u.getLayoutParams();
        layoutParams.width = i5;
        layoutParams.height = i5;
        this.f13785u.setLayoutParams(layoutParams);
    }

    public void v(@q0 ColorStateList colorStateList) {
        Drawable drawable;
        this.A = colorStateList;
        if (this.f13790z == null || (drawable = this.C) == null) {
            return;
        }
        d.o(drawable, colorStateList);
        this.C.invalidateSelf();
    }

    public void w(int i5) {
        x(i5 == 0 ? null : androidx.core.content.d.i(getContext(), i5));
    }

    public void x(@q0 Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        y1.I1(this, drawable);
    }

    public void y(int i5) {
        this.f13789y = i5;
    }

    public void z(int i5) {
        if (this.f13783s != i5) {
            this.f13783s = i5;
            j jVar = this.f13790z;
            if (jVar != null) {
                setChecked(jVar.isChecked());
            }
        }
    }
}
