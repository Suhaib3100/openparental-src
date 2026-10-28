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
import androidx.core.graphics.drawable.d;
import androidx.core.view.y1;
import androidx.customview.view.AbsSavedState;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.shape.k;
import com.google.android.material.shape.o;
import com.google.android.material.shape.s;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n1.a;

/* loaded from: classes3.dex */
public class MaterialButton extends AppCompatButton implements Checkable, s {
    public static final int F = 1;
    public static final int G = 2;
    public static final int H = 3;
    public static final int I = 4;
    public static final int J = 16;
    public static final int K = 32;
    private boolean A;
    private boolean B;
    private int C;

    /* renamed from: q, reason: collision with root package name */
    @o0
    private final com.google.android.material.button.a f13117q;

    /* renamed from: r, reason: collision with root package name */
    @o0
    private final LinkedHashSet<b> f13118r;

    /* renamed from: s, reason: collision with root package name */
    @q0
    private c f13119s;

    /* renamed from: t, reason: collision with root package name */
    @q0
    private PorterDuff.Mode f13120t;

    /* renamed from: u, reason: collision with root package name */
    @q0
    private ColorStateList f13121u;

    /* renamed from: v, reason: collision with root package name */
    @q0
    private Drawable f13122v;

    /* renamed from: w, reason: collision with root package name */
    @u0
    private int f13123w;

    /* renamed from: x, reason: collision with root package name */
    @u0
    private int f13124x;

    /* renamed from: y, reason: collision with root package name */
    @u0
    private int f13125y;

    /* renamed from: z, reason: collision with root package name */
    @u0
    private int f13126z;
    private static final String L = ProtectedSandApp.s("⚗");
    private static final int[] D = {R.attr.state_checkable};
    private static final int[] E = {R.attr.state_checked};
    private static final int M = a.n.Xa;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: q, reason: collision with root package name */
        boolean f13127q;

        /* loaded from: classes2.dex */
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
            public SavedState[] c(int i5) {
                return new SavedState[i5];
            }

            @Override // android.os.Parcelable.Creator
            @o0
            public Object[] newArray(int i5) {
                return new SavedState[i5];
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
            this.f13127q = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@o0 Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeInt(this.f13127q ? 1 : 0);
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
    /* loaded from: classes2.dex */
    public @interface a {
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(MaterialButton materialButton, boolean z5);
    }

    /* loaded from: classes2.dex */
    interface c {
        void a(MaterialButton materialButton, boolean z5);
    }

    public MaterialButton(@o0 Context context) {
        this(context, null);
    }

    private int B() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int C() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    private boolean E() {
        int i5 = this.C;
        return i5 == 3 || i5 == 4;
    }

    private boolean F() {
        int i5 = this.C;
        return i5 == 1 || i5 == 2;
    }

    private boolean G() {
        int i5 = this.C;
        return i5 == 16 || i5 == 32;
    }

    private boolean H() {
        return y1.Z(this) == 1;
    }

    private boolean I() {
        com.google.android.material.button.a aVar = this.f13117q;
        return (aVar == null || aVar.o()) ? false : true;
    }

    private void K() {
        if (F()) {
            androidx.core.widget.s.w(this, this.f13122v, null, null, null);
        } else if (E()) {
            androidx.core.widget.s.w(this, null, null, this.f13122v, null);
        } else if (G()) {
            androidx.core.widget.s.w(this, null, this.f13122v, null, null);
        }
    }

    @o0
    private String f() {
        return (D() ? CompoundButton.class : Button.class).getName();
    }

    private void h0(boolean z5) {
        Drawable drawable = this.f13122v;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f13122v = mutate;
            d.o(mutate, this.f13121u);
            PorterDuff.Mode mode = this.f13120t;
            if (mode != null) {
                d.p(this.f13122v, mode);
            }
            int i5 = this.f13123w;
            if (i5 == 0) {
                i5 = this.f13122v.getIntrinsicWidth();
            }
            int i6 = this.f13123w;
            if (i6 == 0) {
                i6 = this.f13122v.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f13122v;
            int i7 = this.f13124x;
            int i8 = this.f13125y;
            drawable2.setBounds(i7, i8, i5 + i7, i6 + i8);
        }
        if (z5) {
            K();
            return;
        }
        Drawable[] h5 = androidx.core.widget.s.h(this);
        boolean z6 = false;
        Drawable drawable3 = h5[0];
        Drawable drawable4 = h5[1];
        Drawable drawable5 = h5[2];
        if ((F() && drawable3 != this.f13122v) || ((E() && drawable5 != this.f13122v) || (G() && drawable4 != this.f13122v))) {
            z6 = true;
        }
        if (z6) {
            K();
        }
    }

    private void i0(int i5, int i6) {
        if (this.f13122v == null || getLayout() == null) {
            return;
        }
        if (!F() && !E()) {
            if (G()) {
                this.f13124x = 0;
                if (this.C == 16) {
                    this.f13125y = 0;
                    h0(false);
                    return;
                }
                int i7 = this.f13123w;
                if (i7 == 0) {
                    i7 = this.f13122v.getIntrinsicHeight();
                }
                int B = (((((i6 - B()) - getPaddingTop()) - i7) - this.f13126z) - getPaddingBottom()) / 2;
                if (this.f13125y != B) {
                    this.f13125y = B;
                    h0(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f13125y = 0;
        int i8 = this.C;
        if (i8 == 1 || i8 == 3) {
            this.f13124x = 0;
            h0(false);
            return;
        }
        int i9 = this.f13123w;
        if (i9 == 0) {
            i9 = this.f13122v.getIntrinsicWidth();
        }
        int C = (((((i5 - C()) - y1.j0(this)) - i9) - this.f13126z) - y1.k0(this)) / 2;
        if (H() != (this.C == 4)) {
            C = -C;
        }
        if (this.f13124x != C) {
            this.f13124x = C;
            h0(false);
        }
    }

    @u0
    public int A() {
        if (I()) {
            return this.f13117q.k();
        }
        return 0;
    }

    public boolean D() {
        com.google.android.material.button.a aVar = this.f13117q;
        return aVar != null && aVar.p();
    }

    public void J(@o0 b bVar) {
        this.f13118r.remove(bVar);
    }

    public void L(boolean z5) {
        if (I()) {
            this.f13117q.t(z5);
        }
    }

    public void M(@u0 int i5) {
        if (I()) {
            this.f13117q.u(i5);
        }
    }

    public void N(@q int i5) {
        if (I()) {
            M(getResources().getDimensionPixelSize(i5));
        }
    }

    public void O(@q0 Drawable drawable) {
        if (this.f13122v != drawable) {
            this.f13122v = drawable;
            h0(true);
            i0(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void P(int i5) {
        if (this.C != i5) {
            this.C = i5;
            i0(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void Q(@u0 int i5) {
        if (this.f13126z != i5) {
            this.f13126z = i5;
            setCompoundDrawablePadding(i5);
        }
    }

    public void R(@v int i5) {
        O(i5 != 0 ? androidx.appcompat.content.res.a.d(getContext(), i5) : null);
    }

    public void S(@u0 int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("⚘"));
        }
        if (this.f13123w != i5) {
            this.f13123w = i5;
            h0(true);
        }
    }

    public void T(@q0 ColorStateList colorStateList) {
        if (this.f13121u != colorStateList) {
            this.f13121u = colorStateList;
            h0(false);
        }
    }

    public void U(PorterDuff.Mode mode) {
        if (this.f13120t != mode) {
            this.f13120t = mode;
            h0(false);
        }
    }

    public void V(@n int i5) {
        T(androidx.appcompat.content.res.a.c(getContext(), i5));
    }

    public void W(@r int i5) {
        this.f13117q.v(i5);
    }

    public void X(@r int i5) {
        this.f13117q.w(i5);
    }

    void Y(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void Z(@q0 c cVar) {
        this.f13119s = cVar;
    }

    public void a0(@q0 ColorStateList colorStateList) {
        if (I()) {
            this.f13117q.x(colorStateList);
        }
    }

    public void b0(@n int i5) {
        if (I()) {
            a0(androidx.appcompat.content.res.a.c(getContext(), i5));
        }
    }

    public void c(@o0 b bVar) {
        this.f13118r.add(bVar);
    }

    void c0(boolean z5) {
        if (I()) {
            this.f13117q.z(z5);
        }
    }

    public void d() {
        this.f13118r.clear();
    }

    public void d0(@q0 ColorStateList colorStateList) {
        if (I()) {
            this.f13117q.A(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.v1
    @q0
    @c1({c1.a.LIBRARY_GROUP})
    public ColorStateList e() {
        return I() ? this.f13117q.l() : super.e();
    }

    public void e0(@n int i5) {
        if (I()) {
            d0(androidx.appcompat.content.res.a.c(getContext(), i5));
        }
    }

    public void f0(@u0 int i5) {
        if (I()) {
            this.f13117q.B(i5);
        }
    }

    @Override // com.google.android.material.shape.s
    public void g(@o0 o oVar) {
        if (!I()) {
            throw new IllegalStateException(ProtectedSandApp.s("⚙"));
        }
        this.f13117q.y(oVar);
    }

    public void g0(@q int i5) {
        if (I()) {
            f0(getResources().getDimensionPixelSize(i5));
        }
    }

    @Override // android.view.View
    @q0
    public ColorStateList getBackgroundTintList() {
        return e();
    }

    @Override // android.view.View
    @q0
    public PorterDuff.Mode getBackgroundTintMode() {
        return j();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.A;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.v1
    @q0
    @c1({c1.a.LIBRARY_GROUP})
    public PorterDuff.Mode j() {
        return I() ? this.f13117q.m() : super.j();
    }

    @Override // com.google.android.material.shape.s
    @o0
    public o l() {
        if (I()) {
            return this.f13117q.i();
        }
        throw new IllegalStateException(ProtectedSandApp.s("⚚"));
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.v1
    @c1({c1.a.LIBRARY_GROUP})
    public void m(@q0 ColorStateList colorStateList) {
        if (I()) {
            this.f13117q.C(colorStateList);
        } else {
            super.m(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.v1
    @c1({c1.a.LIBRARY_GROUP})
    public void o(@q0 PorterDuff.Mode mode) {
        if (I()) {
            this.f13117q.D(mode);
        } else {
            super.o(mode);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (I()) {
            k.f(this, this.f13117q.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i5) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i5 + 2);
        if (D()) {
            View.mergeDrawableStates(onCreateDrawableState, D);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, E);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(@o0 AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(f());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(@o0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(f());
        accessibilityNodeInfo.setCheckable(D());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        super.onLayout(z5, i5, i6, i7, i8);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(@q0 Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setChecked(savedState.f13127q);
    }

    @Override // android.widget.TextView, android.view.View
    @o0
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f13127q = this.A;
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i5, int i6, int i7, int i8) {
        super.onSizeChanged(i5, i6, i7, i8);
        i0(i5, i6);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        super.onTextChanged(charSequence, i5, i6, i7);
        i0(getMeasuredWidth(), getMeasuredHeight());
    }

    @u0
    public int p() {
        if (I()) {
            return this.f13117q.b();
        }
        return 0;
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public Drawable q() {
        return this.f13122v;
    }

    public int r() {
        return this.C;
    }

    @u0
    public int s() {
        return this.f13126z;
    }

    @Override // android.view.View
    public void setBackground(@o0 Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(@l int i5) {
        if (I()) {
            this.f13117q.r(i5);
        } else {
            super.setBackgroundColor(i5);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@o0 Drawable drawable) {
        if (!I()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
        } else {
            this.f13117q.s();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(@v int i5) {
        setBackgroundDrawable(i5 != 0 ? androidx.appcompat.content.res.a.d(getContext(), i5) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@q0 ColorStateList colorStateList) {
        m(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@q0 PorterDuff.Mode mode) {
        o(mode);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z5) {
        if (D() && isEnabled() && this.A != z5) {
            this.A = z5;
            refreshDrawableState();
            if (this.B) {
                return;
            }
            this.B = true;
            Iterator<b> it = this.f13118r.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.A);
            }
            this.B = false;
        }
    }

    @Override // android.view.View
    @x0(21)
    public void setElevation(float f6) {
        super.setElevation(f6);
        if (I()) {
            this.f13117q.f().o0(f6);
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z5) {
        c cVar = this.f13119s;
        if (cVar != null) {
            cVar.a(this, z5);
        }
        super.setPressed(z5);
    }

    @u0
    public int t() {
        return this.f13123w;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.A);
    }

    public ColorStateList u() {
        return this.f13121u;
    }

    public PorterDuff.Mode v() {
        return this.f13120t;
    }

    @r
    public int w() {
        return this.f13117q.c();
    }

    @r
    public int x() {
        return this.f13117q.d();
    }

    @q0
    public ColorStateList y() {
        if (I()) {
            return this.f13117q.h();
        }
        return null;
    }

    public ColorStateList z() {
        if (I()) {
            return this.f13117q.j();
        }
        return null;
    }

    public MaterialButton(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.w9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialButton(@androidx.annotation.o0 android.content.Context r9, @androidx.annotation.q0 android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = com.google.android.material.button.MaterialButton.M
            android.content.Context r9 = v1.a.c(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f13118r = r9
            r9 = 0
            r8.A = r9
            r8.B = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = n1.a.o.cj
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            int r1 = n1.a.o.pj
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f13126z = r1
            int r1 = n1.a.o.sj
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.v.k(r1, r2)
            r8.f13120t = r1
            android.content.Context r1 = r8.getContext()
            int r2 = n1.a.o.rj
            android.content.res.ColorStateList r1 = com.google.android.material.resources.c.a(r1, r0, r2)
            r8.f13121u = r1
            android.content.Context r1 = r8.getContext()
            int r2 = n1.a.o.nj
            android.graphics.drawable.Drawable r1 = com.google.android.material.resources.c.d(r1, r0, r2)
            r8.f13122v = r1
            int r1 = n1.a.o.oj
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.C = r1
            int r1 = n1.a.o.qj
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f13123w = r1
            com.google.android.material.shape.o$b r10 = com.google.android.material.shape.o.e(r7, r10, r11, r6)
            com.google.android.material.shape.o r10 = r10.m()
            com.google.android.material.button.a r11 = new com.google.android.material.button.a
            r11.<init>(r8, r10)
            r8.f13117q = r11
            r11.q(r0)
            r0.recycle()
            int r10 = r8.f13126z
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f13122v
            if (r10 == 0) goto L84
            r9 = r2
        L84:
            r8.h0(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
