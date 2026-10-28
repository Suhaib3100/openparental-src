package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.c1;
import androidx.annotation.l;
import androidx.annotation.n;
import androidx.annotation.o0;
import androidx.annotation.q;
import androidx.annotation.q0;
import androidx.annotation.r;
import androidx.annotation.u0;
import androidx.annotation.v;
import androidx.annotation.x0;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.d;
import androidx.core.view.x1;
import androidx.customview.view.AbsSavedState;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.shape.k;
import com.google.android.material.shape.o;
import com.google.android.material.shape.s;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import s8.a;

/* loaded from: classes6.dex */
public class MaterialButton extends AppCompatButton implements Checkable, s {

    /* renamed from: t, reason: collision with root package name */
    public static final int f52843t = 1;

    /* renamed from: u, reason: collision with root package name */
    public static final int f52844u = 2;

    /* renamed from: v, reason: collision with root package name */
    public static final int f52845v = 3;

    /* renamed from: w, reason: collision with root package name */
    public static final int f52846w = 4;

    /* renamed from: x, reason: collision with root package name */
    public static final int f52847x = 16;

    /* renamed from: y, reason: collision with root package name */
    public static final int f52848y = 32;

    /* renamed from: e, reason: collision with root package name */
    @o0
    private final com.google.android.material.button.a f52850e;

    /* renamed from: f, reason: collision with root package name */
    @o0
    private final LinkedHashSet<b> f52851f;

    /* renamed from: g, reason: collision with root package name */
    @q0
    private c f52852g;

    /* renamed from: h, reason: collision with root package name */
    @q0
    private PorterDuff.Mode f52853h;

    /* renamed from: i, reason: collision with root package name */
    @q0
    private ColorStateList f52854i;

    /* renamed from: j, reason: collision with root package name */
    @q0
    private Drawable f52855j;

    /* renamed from: k, reason: collision with root package name */
    @u0
    private int f52856k;

    /* renamed from: l, reason: collision with root package name */
    @u0
    private int f52857l;

    /* renamed from: m, reason: collision with root package name */
    @u0
    private int f52858m;

    /* renamed from: n, reason: collision with root package name */
    @u0
    private int f52859n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f52860o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f52861p;

    /* renamed from: q, reason: collision with root package name */
    private int f52862q;

    /* renamed from: z, reason: collision with root package name */
    private static final String f52849z = ProtectedSandApp.s("\uf15f");

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f52841r = {R.attr.state_checkable};

    /* renamed from: s, reason: collision with root package name */
    private static final int[] f52842s = {R.attr.state_checked};
    private static final int A = a.n.Xa;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        boolean f52863d;

        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @o0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@o0 Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @o0
            public SavedState b(@o0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @o0
            public SavedState[] c(int i4) {
                return new SavedState[i4];
            }

            @Override // android.os.Parcelable.Creator
            @o0
            public Object[] newArray(int i4) {
                return new SavedState[i4];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @o0
            public SavedState createFromParcel(@o0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(@o0 Parcel parcel) {
            this.f52863d = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@o0 Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f52863d ? 1 : 0);
        }

        public SavedState(@o0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public interface b {
        void a(MaterialButton materialButton, boolean z4);
    }

    interface c {
        void a(MaterialButton materialButton, boolean z4);
    }

    public MaterialButton(@o0 Context context) {
        this(context, null);
    }

    private boolean A() {
        return x1.c0(this) == 1;
    }

    private boolean B() {
        com.google.android.material.button.a aVar = this.f52850e;
        return (aVar == null || aVar.o()) ? false : true;
    }

    private void D() {
        if (y()) {
            setCompoundDrawablesRelative(this.f52855j, null, null, null);
        } else if (x()) {
            setCompoundDrawablesRelative(null, null, this.f52855j, null);
        } else if (z()) {
            setCompoundDrawablesRelative(null, this.f52855j, null, null);
        }
    }

    private void a0(boolean z4) {
        Drawable drawable = this.f52855j;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f52855j = mutate;
            mutate.setTintList(this.f52854i);
            PorterDuff.Mode mode = this.f52853h;
            if (mode != null) {
                this.f52855j.setTintMode(mode);
            }
            int i4 = this.f52856k;
            if (i4 == 0) {
                i4 = this.f52855j.getIntrinsicWidth();
            }
            int i5 = this.f52856k;
            if (i5 == 0) {
                i5 = this.f52855j.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f52855j;
            int i6 = this.f52857l;
            int i7 = this.f52858m;
            drawable2.setBounds(i6, i7, i4 + i6, i5 + i7);
        }
        if (z4) {
            D();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!y() || drawable3 == this.f52855j) && ((!x() || drawable5 == this.f52855j) && (!z() || drawable4 == this.f52855j))) {
            return;
        }
        D();
    }

    private void b0(int i4, int i5) {
        if (this.f52855j == null || getLayout() == null) {
            return;
        }
        if (!y() && !x()) {
            if (z()) {
                this.f52857l = 0;
                if (this.f52862q == 16) {
                    this.f52858m = 0;
                    a0(false);
                    return;
                }
                int i6 = this.f52856k;
                if (i6 == 0) {
                    i6 = this.f52855j.getIntrinsicHeight();
                }
                int u4 = (((((i5 - u()) - getPaddingTop()) - i6) - this.f52859n) - getPaddingBottom()) / 2;
                if (this.f52858m != u4) {
                    this.f52858m = u4;
                    a0(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f52858m = 0;
        int i7 = this.f52862q;
        if (i7 == 1 || i7 == 3) {
            this.f52857l = 0;
            a0(false);
            return;
        }
        int i10 = this.f52856k;
        if (i10 == 0) {
            i10 = this.f52855j.getIntrinsicWidth();
        }
        int v4 = (((((i4 - v()) - x1.m0(this)) - i10) - this.f52859n) - getPaddingStart()) / 2;
        if (A() != (this.f52862q == 4)) {
            v4 = -v4;
        }
        if (this.f52857l != v4) {
            this.f52857l = v4;
            a0(false);
        }
    }

    @o0
    private String h() {
        return (w() ? CompoundButton.class : Button.class).getName();
    }

    private int u() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int v() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    private boolean x() {
        int i4 = this.f52862q;
        return i4 == 3 || i4 == 4;
    }

    private boolean y() {
        int i4 = this.f52862q;
        return i4 == 1 || i4 == 2;
    }

    private boolean z() {
        int i4 = this.f52862q;
        return i4 == 16 || i4 == 32;
    }

    public void C(@o0 b bVar) {
        this.f52851f.remove(bVar);
    }

    public void E(boolean z4) {
        if (B()) {
            this.f52850e.t(z4);
        }
    }

    public void F(@u0 int i4) {
        if (B()) {
            this.f52850e.u(i4);
        }
    }

    public void G(@q int i4) {
        if (B()) {
            F(getResources().getDimensionPixelSize(i4));
        }
    }

    public void H(@q0 Drawable drawable) {
        if (this.f52855j != drawable) {
            this.f52855j = drawable;
            a0(true);
            b0(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void I(int i4) {
        if (this.f52862q != i4) {
            this.f52862q = i4;
            b0(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void J(@u0 int i4) {
        if (this.f52859n != i4) {
            this.f52859n = i4;
            setCompoundDrawablePadding(i4);
        }
    }

    public void K(@v int i4) {
        H(i4 != 0 ? e.a.b(getContext(), i4) : null);
    }

    public void L(@u0 int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf160"));
        }
        if (this.f52856k != i4) {
            this.f52856k = i4;
            a0(true);
        }
    }

    public void M(@q0 ColorStateList colorStateList) {
        if (this.f52854i != colorStateList) {
            this.f52854i = colorStateList;
            a0(false);
        }
    }

    public void N(PorterDuff.Mode mode) {
        if (this.f52853h != mode) {
            this.f52853h = mode;
            a0(false);
        }
    }

    public void O(@n int i4) {
        M(d.getColorStateList(getContext(), i4));
    }

    public void P(@r int i4) {
        this.f52850e.v(i4);
    }

    public void Q(@r int i4) {
        this.f52850e.w(i4);
    }

    void R(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void S(@q0 c cVar) {
        this.f52852g = cVar;
    }

    public void T(@q0 ColorStateList colorStateList) {
        if (B()) {
            this.f52850e.x(colorStateList);
        }
    }

    public void U(@n int i4) {
        if (B()) {
            T(d.getColorStateList(getContext(), i4));
        }
    }

    void V(boolean z4) {
        if (B()) {
            this.f52850e.z(z4);
        }
    }

    public void W(@q0 ColorStateList colorStateList) {
        if (B()) {
            this.f52850e.A(colorStateList);
        }
    }

    public void X(@n int i4) {
        if (B()) {
            W(d.getColorStateList(getContext(), i4));
        }
    }

    public void Y(@u0 int i4) {
        if (B()) {
            this.f52850e.B(i4);
        }
    }

    public void Z(@q int i4) {
        if (B()) {
            Y(getResources().getDimensionPixelSize(i4));
        }
    }

    @Override // com.google.android.material.shape.s
    public void d(@o0 o oVar) {
        if (!B()) {
            throw new IllegalStateException(ProtectedSandApp.s("\uf161"));
        }
        this.f52850e.y(oVar);
    }

    @Override // com.google.android.material.shape.s
    @o0
    public o e() {
        if (B()) {
            return this.f52850e.i();
        }
        throw new IllegalStateException(ProtectedSandApp.s("\uf162"));
    }

    public void f(@o0 b bVar) {
        this.f52851f.add(bVar);
    }

    public void g() {
        this.f52851f.clear();
    }

    @Override // android.view.View
    @q0
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    @q0
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.s1
    @q0
    @c1({c1.a.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        return B() ? this.f52850e.l() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.s1
    @q0
    @c1({c1.a.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return B() ? this.f52850e.m() : super.getSupportBackgroundTintMode();
    }

    @u0
    public int i() {
        if (B()) {
            return this.f52850e.b();
        }
        return 0;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f52860o;
    }

    public Drawable j() {
        return this.f52855j;
    }

    public int k() {
        return this.f52862q;
    }

    @u0
    public int l() {
        return this.f52859n;
    }

    @u0
    public int m() {
        return this.f52856k;
    }

    public ColorStateList n() {
        return this.f52854i;
    }

    public PorterDuff.Mode o() {
        return this.f52853h;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (B()) {
            k.f(this, this.f52850e.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 2);
        if (w()) {
            View.mergeDrawableStates(onCreateDrawableState, f52841r);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f52842s);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(@o0 AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(h());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(@o0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(h());
        accessibilityNodeInfo.setCheckable(w());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(@q0 Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setChecked(savedState.f52863d);
    }

    @Override // android.widget.TextView, android.view.View
    @o0
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f52863d = this.f52860o;
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        b0(i4, i5);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        b0(getMeasuredWidth(), getMeasuredHeight());
    }

    @r
    public int p() {
        return this.f52850e.c();
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @r
    public int q() {
        return this.f52850e.d();
    }

    @q0
    public ColorStateList r() {
        if (B()) {
            return this.f52850e.h();
        }
        return null;
    }

    public ColorStateList s() {
        if (B()) {
            return this.f52850e.j();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackground(@o0 Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(@l int i4) {
        if (B()) {
            this.f52850e.r(i4);
        } else {
            super.setBackgroundColor(i4);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@o0 Drawable drawable) {
        if (!B()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
        } else {
            this.f52850e.s();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(@v int i4) {
        setBackgroundDrawable(i4 != 0 ? e.a.b(getContext(), i4) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@q0 ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@q0 PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z4) {
        if (w() && isEnabled() && this.f52860o != z4) {
            this.f52860o = z4;
            refreshDrawableState();
            if (this.f52861p) {
                return;
            }
            this.f52861p = true;
            Iterator<b> it = this.f52851f.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.f52860o);
            }
            this.f52861p = false;
        }
    }

    @Override // android.view.View
    @x0(21)
    public void setElevation(float f4) {
        super.setElevation(f4);
        if (B()) {
            this.f52850e.f().o0(f4);
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z4) {
        c cVar = this.f52852g;
        if (cVar != null) {
            cVar.a(this, z4);
        }
        super.setPressed(z4);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.s1
    @c1({c1.a.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@q0 ColorStateList colorStateList) {
        if (B()) {
            this.f52850e.C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.s1
    @c1({c1.a.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@q0 PorterDuff.Mode mode) {
        if (B()) {
            this.f52850e.D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @u0
    public int t() {
        if (B()) {
            return this.f52850e.k();
        }
        return 0;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f52860o);
    }

    public boolean w() {
        com.google.android.material.button.a aVar = this.f52850e;
        return aVar != null && aVar.p();
    }

    public MaterialButton(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.f90605v9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialButton(@androidx.annotation.o0 android.content.Context r9, @androidx.annotation.q0 android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = com.google.android.material.button.MaterialButton.A
            android.content.Context r9 = a9.a.c(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f52851f = r9
            r9 = 0
            r8.f52860o = r9
            r8.f52861p = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = s8.a.o.vk
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            int r1 = s8.a.o.Ik
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f52859n = r1
            int r1 = s8.a.o.Lk
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.v.k(r1, r2)
            r8.f52853h = r1
            android.content.Context r1 = r8.getContext()
            int r2 = s8.a.o.Kk
            android.content.res.ColorStateList r1 = com.google.android.material.resources.c.a(r1, r0, r2)
            r8.f52854i = r1
            android.content.Context r1 = r8.getContext()
            int r2 = s8.a.o.Gk
            android.graphics.drawable.Drawable r1 = com.google.android.material.resources.c.d(r1, r0, r2)
            r8.f52855j = r1
            int r1 = s8.a.o.Hk
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.f52862q = r1
            int r1 = s8.a.o.Jk
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f52856k = r1
            com.google.android.material.shape.o$b r10 = com.google.android.material.shape.o.e(r7, r10, r11, r6)
            com.google.android.material.shape.o r10 = r10.m()
            com.google.android.material.button.a r11 = new com.google.android.material.button.a
            r11.<init>(r8, r10)
            r8.f52850e = r11
            r11.q(r0)
            r0.recycle()
            int r10 = r8.f52859n
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f52855j
            if (r10 == 0) goto L84
            r9 = r2
        L84:
            r8.a0(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
