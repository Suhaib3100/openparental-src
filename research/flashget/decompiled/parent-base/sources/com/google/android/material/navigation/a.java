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
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.widget.y0;
import androidx.core.content.d;
import androidx.core.view.accessibility.h0;
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.badge.BadgeDrawable;
import s8.a;

/* compiled from: NavigationBarItemView.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public abstract class a extends FrameLayout implements p.a {

    /* renamed from: r, reason: collision with root package name */
    private static final int f53577r = -1;

    /* renamed from: s, reason: collision with root package name */
    private static final int[] f53578s = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    private final int f53579b;

    /* renamed from: c, reason: collision with root package name */
    private float f53580c;

    /* renamed from: d, reason: collision with root package name */
    private float f53581d;

    /* renamed from: e, reason: collision with root package name */
    private float f53582e;

    /* renamed from: f, reason: collision with root package name */
    private int f53583f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f53584g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f53585h;

    /* renamed from: i, reason: collision with root package name */
    private final ViewGroup f53586i;

    /* renamed from: j, reason: collision with root package name */
    private final TextView f53587j;

    /* renamed from: k, reason: collision with root package name */
    private final TextView f53588k;

    /* renamed from: l, reason: collision with root package name */
    private int f53589l;

    /* renamed from: m, reason: collision with root package name */
    @q0
    private k f53590m;

    /* renamed from: n, reason: collision with root package name */
    @q0
    private ColorStateList f53591n;

    /* renamed from: o, reason: collision with root package name */
    @q0
    private Drawable f53592o;

    /* renamed from: p, reason: collision with root package name */
    @q0
    private Drawable f53593p;

    /* renamed from: q, reason: collision with root package name */
    @q0
    private BadgeDrawable f53594q;

    /* compiled from: NavigationBarItemView.java */
    /* renamed from: com.google.android.material.navigation.a$a, reason: collision with other inner class name */
    class ViewOnLayoutChangeListenerC0811a implements View.OnLayoutChangeListener {
        ViewOnLayoutChangeListenerC0811a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i10, int i11, int i12, int i13) {
            if (a.this.f53585h.getVisibility() == 0) {
                a aVar = a.this;
                aVar.I(aVar.f53585h);
            }
        }
    }

    public a(@o0 Context context) {
        super(context);
        this.f53589l = -1;
        LayoutInflater.from(context).inflate(m(), (ViewGroup) this, true);
        this.f53585h = (ImageView) findViewById(a.h.f91061p3);
        ViewGroup viewGroup = (ViewGroup) findViewById(a.h.f91066q3);
        this.f53586i = viewGroup;
        TextView textView = (TextView) findViewById(a.h.f91076s3);
        this.f53587j = textView;
        TextView textView2 = (TextView) findViewById(a.h.f91071r3);
        this.f53588k = textView2;
        setBackgroundResource(k());
        this.f53579b = getResources().getDimensionPixelSize(l());
        viewGroup.setTag(a.h.f91051n3, Integer.valueOf(viewGroup.getPaddingBottom()));
        x1.Z1(textView, 2);
        textView2.setImportantForAccessibility(2);
        setFocusable(true);
        d(textView.getTextSize(), textView2.getTextSize());
        ImageView imageView = this.f53585h;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0811a());
        }
    }

    private static void E(@o0 View view, int i4, int i5) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i4;
        layoutParams.gravity = i5;
        view.setLayoutParams(layoutParams);
    }

    private static void F(@o0 View view, float f4, float f5, int i4) {
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setVisibility(i4);
    }

    private void G(@q0 View view) {
        if (r() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            com.google.android.material.badge.a.b(this.f53594q, view, j(view));
        }
    }

    private void H(@q0 View view) {
        if (r()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                com.google.android.material.badge.a.g(this.f53594q, view);
            }
            this.f53594q = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(View view) {
        if (r()) {
            com.google.android.material.badge.a.j(this.f53594q, view, j(view));
        }
    }

    private static void J(@o0 View view, int i4) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i4);
    }

    private void d(float f4, float f5) {
        this.f53580c = f4 - f5;
        this.f53581d = (f5 * 1.0f) / f4;
        this.f53582e = (f4 * 1.0f) / f5;
    }

    @q0
    private FrameLayout j(View view) {
        ImageView imageView = this.f53585h;
        if (view == imageView && com.google.android.material.badge.a.f52655a) {
            return (FrameLayout) imageView.getParent();
        }
        return null;
    }

    private int o() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i4 = 0;
        for (int i5 = 0; i5 < indexOfChild; i5++) {
            View childAt = viewGroup.getChildAt(i5);
            if ((childAt instanceof a) && childAt.getVisibility() == 0) {
                i4++;
            }
        }
        return i4;
    }

    private int p() {
        BadgeDrawable badgeDrawable = this.f53594q;
        int minimumHeight = badgeDrawable != null ? badgeDrawable.getMinimumHeight() / 2 : 0;
        return this.f53585h.getMeasuredWidth() + Math.max(minimumHeight, ((FrameLayout.LayoutParams) this.f53585h.getLayoutParams()).topMargin) + minimumHeight;
    }

    private int q() {
        BadgeDrawable badgeDrawable = this.f53594q;
        int minimumWidth = badgeDrawable == null ? 0 : badgeDrawable.getMinimumWidth() - this.f53594q.q();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f53585h.getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.f53585h.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    private boolean r() {
        return this.f53594q != null;
    }

    public void A(boolean z4) {
        if (this.f53584g != z4) {
            this.f53584g = z4;
            k kVar = this.f53590m;
            if (kVar != null) {
                setChecked(kVar.isChecked());
            }
        }
    }

    public void B(@h1 int i4) {
        this.f53588k.setTextAppearance(i4);
        d(this.f53587j.getTextSize(), this.f53588k.getTextSize());
    }

    public void C(@h1 int i4) {
        this.f53587j.setTextAppearance(i4);
        d(this.f53587j.getTextSize(), this.f53588k.getTextSize());
    }

    public void D(@q0 ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f53587j.setTextColor(colorStateList);
            this.f53588k.setTextColor(colorStateList);
        }
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void b(boolean z4, char c5) {
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void e(@o0 k kVar, int i4) {
        this.f53590m = kVar;
        setCheckable(kVar.isCheckable());
        setChecked(kVar.isChecked());
        setEnabled(kVar.isEnabled());
        setIcon(kVar.getIcon());
        setTitle(kVar.getTitle());
        setId(kVar.getItemId());
        if (!TextUtils.isEmpty(kVar.getContentDescription())) {
            setContentDescription(kVar.getContentDescription());
        }
        y0.a(this, !TextUtils.isEmpty(kVar.getTooltipText()) ? kVar.getTooltipText() : kVar.getTitle());
        setVisibility(kVar.isVisible() ? 0 : 8);
    }

    @q0
    public BadgeDrawable f() {
        return this.f53594q;
    }

    @Override // androidx.appcompat.view.menu.p.a
    @q0
    public k g() {
        return this.f53590m;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f53586i.getLayoutParams();
        return this.f53586i.getMeasuredHeight() + p() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f53586i.getLayoutParams();
        return Math.max(q(), this.f53586i.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    @Override // androidx.appcompat.view.menu.p.a
    public boolean h() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.p.a
    public boolean i() {
        return true;
    }

    @v
    protected int k() {
        return a.g.f90923h1;
    }

    @q
    protected int l() {
        return a.f.g5;
    }

    @j0
    protected abstract int m();

    public int n() {
        return this.f53589l;
    }

    @Override // android.view.ViewGroup, android.view.View
    @o0
    public int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 1);
        k kVar = this.f53590m;
        if (kVar != null && kVar.isCheckable() && this.f53590m.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f53578s);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@o0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.f53594q;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            CharSequence title = this.f53590m.getTitle();
            if (!TextUtils.isEmpty(this.f53590m.getContentDescription())) {
                title = this.f53590m.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ProtectedSandApp.s("\uf157") + ((Object) this.f53594q.o()));
        }
        h0 r22 = h0.r2(accessibilityNodeInfo);
        r22.m1(h0.g.j(0, 1, o(), 1, false, isSelected()));
        if (isSelected()) {
            r22.k1(false);
            r22.V0(h0.a.f27010j);
        }
        r22.V1(getResources().getString(a.m.P));
    }

    void s() {
        H(this.f53585h);
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void setCheckable(boolean z4) {
        refreshDrawableState();
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void setChecked(boolean z4) {
        this.f53588k.setPivotX(r0.getWidth() / 2);
        this.f53588k.setPivotY(r0.getBaseline());
        this.f53587j.setPivotX(r0.getWidth() / 2);
        this.f53587j.setPivotY(r0.getBaseline());
        int i4 = this.f53583f;
        if (i4 != -1) {
            if (i4 == 0) {
                if (z4) {
                    E(this.f53585h, this.f53579b, 49);
                    ViewGroup viewGroup = this.f53586i;
                    J(viewGroup, ((Integer) viewGroup.getTag(a.h.f91051n3)).intValue());
                    this.f53588k.setVisibility(0);
                } else {
                    E(this.f53585h, this.f53579b, 17);
                    J(this.f53586i, 0);
                    this.f53588k.setVisibility(4);
                }
                this.f53587j.setVisibility(4);
            } else if (i4 == 1) {
                ViewGroup viewGroup2 = this.f53586i;
                J(viewGroup2, ((Integer) viewGroup2.getTag(a.h.f91051n3)).intValue());
                if (z4) {
                    E(this.f53585h, (int) (this.f53579b + this.f53580c), 49);
                    F(this.f53588k, 1.0f, 1.0f, 0);
                    TextView textView = this.f53587j;
                    float f4 = this.f53581d;
                    F(textView, f4, f4, 4);
                } else {
                    E(this.f53585h, this.f53579b, 49);
                    TextView textView2 = this.f53588k;
                    float f5 = this.f53582e;
                    F(textView2, f5, f5, 4);
                    F(this.f53587j, 1.0f, 1.0f, 0);
                }
            } else if (i4 == 2) {
                E(this.f53585h, this.f53579b, 17);
                this.f53588k.setVisibility(8);
                this.f53587j.setVisibility(8);
            }
        } else if (this.f53584g) {
            if (z4) {
                E(this.f53585h, this.f53579b, 49);
                ViewGroup viewGroup3 = this.f53586i;
                J(viewGroup3, ((Integer) viewGroup3.getTag(a.h.f91051n3)).intValue());
                this.f53588k.setVisibility(0);
            } else {
                E(this.f53585h, this.f53579b, 17);
                J(this.f53586i, 0);
                this.f53588k.setVisibility(4);
            }
            this.f53587j.setVisibility(4);
        } else {
            ViewGroup viewGroup4 = this.f53586i;
            J(viewGroup4, ((Integer) viewGroup4.getTag(a.h.f91051n3)).intValue());
            if (z4) {
                E(this.f53585h, (int) (this.f53579b + this.f53580c), 49);
                F(this.f53588k, 1.0f, 1.0f, 0);
                TextView textView3 = this.f53587j;
                float f6 = this.f53581d;
                F(textView3, f6, f6, 4);
            } else {
                E(this.f53585h, this.f53579b, 49);
                TextView textView4 = this.f53588k;
                float f7 = this.f53582e;
                F(textView4, f7, f7, 4);
                F(this.f53587j, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z4);
    }

    @Override // android.view.View, androidx.appcompat.view.menu.p.a
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        this.f53587j.setEnabled(z4);
        this.f53588k.setEnabled(z4);
        this.f53585h.setEnabled(z4);
        if (z4) {
            x1.q2(this, androidx.core.view.h1.c(getContext(), 1002));
        } else {
            x1.q2(this, null);
        }
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void setIcon(@q0 Drawable drawable) {
        if (drawable == this.f53592o) {
            return;
        }
        this.f53592o = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.f53593p = drawable;
            ColorStateList colorStateList = this.f53591n;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.f53585h.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.view.menu.p.a
    public void setTitle(@q0 CharSequence charSequence) {
        this.f53587j.setText(charSequence);
        this.f53588k.setText(charSequence);
        k kVar = this.f53590m;
        if (kVar == null || TextUtils.isEmpty(kVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        k kVar2 = this.f53590m;
        if (kVar2 != null && !TextUtils.isEmpty(kVar2.getTooltipText())) {
            charSequence = this.f53590m.getTooltipText();
        }
        y0.a(this, charSequence);
    }

    void t(@o0 BadgeDrawable badgeDrawable) {
        this.f53594q = badgeDrawable;
        ImageView imageView = this.f53585h;
        if (imageView != null) {
            G(imageView);
        }
    }

    public void u(int i4) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f53585h.getLayoutParams();
        layoutParams.width = i4;
        layoutParams.height = i4;
        this.f53585h.setLayoutParams(layoutParams);
    }

    public void v(@q0 ColorStateList colorStateList) {
        Drawable drawable;
        this.f53591n = colorStateList;
        if (this.f53590m == null || (drawable = this.f53593p) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.f53593p.invalidateSelf();
    }

    public void w(int i4) {
        x(i4 == 0 ? null : d.getDrawable(getContext(), i4));
    }

    public void x(@q0 Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        x1.P1(this, drawable);
    }

    public void y(int i4) {
        this.f53589l = i4;
    }

    public void z(int i4) {
        if (this.f53583f != i4) {
            this.f53583f = i4;
            k kVar = this.f53590m;
            if (kVar != null) {
                setChecked(kVar.isChecked());
            }
        }
    }
}
