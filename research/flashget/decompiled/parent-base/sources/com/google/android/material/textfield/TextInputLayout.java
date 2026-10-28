package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.c1;
import androidx.annotation.g1;
import androidx.annotation.h1;
import androidx.annotation.m1;
import androidx.annotation.n;
import androidx.annotation.o0;
import androidx.annotation.q;
import androidx.annotation.q0;
import androidx.annotation.u0;
import androidx.annotation.v;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.a0;
import androidx.core.graphics.z;
import androidx.core.view.accessibility.h0;
import androidx.core.view.x1;
import androidx.customview.view.AbsSavedState;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.shape.o;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import s8.a;

/* loaded from: classes6.dex */
public class TextInputLayout extends LinearLayout {
    private static final int C3 = 167;
    private static final int D3 = -1;
    private static final int E3 = -1;
    public static final int G3 = 0;
    public static final int H3 = 1;
    public static final int I3 = 2;
    public static final int J3 = -1;
    public static final int K3 = 0;
    public static final int L3 = 1;
    public static final int M3 = 2;
    public static final int N3 = 3;

    @o0
    private final TextView A;
    private boolean A3;
    private boolean B;
    private CharSequence C;
    private boolean D;

    @q0
    private com.google.android.material.shape.j E;

    @q0
    private com.google.android.material.shape.j F;

    @o0
    private o G;
    private final int H;
    private int I;
    private int J;
    private int K;
    private int L;

    @o0
    private final CheckableImageButton L2;
    private int M;
    private ColorStateList M2;
    private int N;
    private boolean N2;

    @androidx.annotation.l
    private int O;
    private PorterDuff.Mode O2;

    @androidx.annotation.l
    private int P;
    private boolean P2;
    private final Rect Q;
    private final RectF Q1;

    @q0
    private Drawable Q2;
    private final Rect R;
    private int R2;
    private View.OnLongClickListener S2;
    private final LinkedHashSet<h> T2;
    private int U2;
    private Typeface V1;
    private final SparseArray<com.google.android.material.textfield.e> V2;

    @o0
    private final CheckableImageButton W2;
    private final LinkedHashSet<i> X2;
    private ColorStateList Y2;
    private boolean Z2;

    /* renamed from: a3, reason: collision with root package name */
    private PorterDuff.Mode f54241a3;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final FrameLayout f54242b;

    /* renamed from: b3, reason: collision with root package name */
    private boolean f54243b3;

    /* renamed from: c, reason: collision with root package name */
    @o0
    private final LinearLayout f54244c;

    /* renamed from: c3, reason: collision with root package name */
    @q0
    private Drawable f54245c3;

    /* renamed from: d, reason: collision with root package name */
    @o0
    private final LinearLayout f54246d;

    /* renamed from: d3, reason: collision with root package name */
    private int f54247d3;

    /* renamed from: e, reason: collision with root package name */
    @o0
    private final FrameLayout f54248e;

    /* renamed from: e3, reason: collision with root package name */
    private Drawable f54249e3;

    /* renamed from: f, reason: collision with root package name */
    EditText f54250f;

    /* renamed from: f3, reason: collision with root package name */
    private View.OnLongClickListener f54251f3;

    /* renamed from: g, reason: collision with root package name */
    private CharSequence f54252g;

    /* renamed from: g3, reason: collision with root package name */
    private View.OnLongClickListener f54253g3;

    /* renamed from: h, reason: collision with root package name */
    private int f54254h;

    /* renamed from: h3, reason: collision with root package name */
    @o0
    private final CheckableImageButton f54255h3;

    /* renamed from: i, reason: collision with root package name */
    private int f54256i;

    /* renamed from: i3, reason: collision with root package name */
    private ColorStateList f54257i3;

    /* renamed from: j, reason: collision with root package name */
    private final com.google.android.material.textfield.f f54258j;

    /* renamed from: j3, reason: collision with root package name */
    private ColorStateList f54259j3;

    /* renamed from: k, reason: collision with root package name */
    boolean f54260k;

    /* renamed from: k3, reason: collision with root package name */
    private ColorStateList f54261k3;

    /* renamed from: l, reason: collision with root package name */
    private int f54262l;

    /* renamed from: l3, reason: collision with root package name */
    @androidx.annotation.l
    private int f54263l3;

    /* renamed from: m, reason: collision with root package name */
    private boolean f54264m;

    /* renamed from: m3, reason: collision with root package name */
    @androidx.annotation.l
    private int f54265m3;

    /* renamed from: n, reason: collision with root package name */
    @q0
    private TextView f54266n;

    /* renamed from: n3, reason: collision with root package name */
    @androidx.annotation.l
    private int f54267n3;

    /* renamed from: o, reason: collision with root package name */
    private int f54268o;

    /* renamed from: o3, reason: collision with root package name */
    private ColorStateList f54269o3;

    /* renamed from: p, reason: collision with root package name */
    private int f54270p;

    /* renamed from: p3, reason: collision with root package name */
    @androidx.annotation.l
    private int f54271p3;

    /* renamed from: q, reason: collision with root package name */
    private CharSequence f54272q;

    /* renamed from: q3, reason: collision with root package name */
    @androidx.annotation.l
    private int f54273q3;

    /* renamed from: r, reason: collision with root package name */
    private boolean f54274r;

    /* renamed from: r3, reason: collision with root package name */
    @androidx.annotation.l
    private int f54275r3;

    /* renamed from: s, reason: collision with root package name */
    private TextView f54276s;

    /* renamed from: s3, reason: collision with root package name */
    @androidx.annotation.l
    private int f54277s3;

    /* renamed from: t, reason: collision with root package name */
    @q0
    private ColorStateList f54278t;

    /* renamed from: t3, reason: collision with root package name */
    @androidx.annotation.l
    private int f54279t3;

    /* renamed from: u, reason: collision with root package name */
    private int f54280u;

    /* renamed from: u3, reason: collision with root package name */
    private boolean f54281u3;

    /* renamed from: v, reason: collision with root package name */
    @q0
    private ColorStateList f54282v;

    /* renamed from: v3, reason: collision with root package name */
    final com.google.android.material.internal.a f54283v3;

    /* renamed from: w, reason: collision with root package name */
    @q0
    private ColorStateList f54284w;

    /* renamed from: w3, reason: collision with root package name */
    private boolean f54285w3;

    /* renamed from: x, reason: collision with root package name */
    @q0
    private CharSequence f54286x;

    /* renamed from: x3, reason: collision with root package name */
    private boolean f54287x3;

    /* renamed from: y, reason: collision with root package name */
    @o0
    private final TextView f54288y;

    /* renamed from: y3, reason: collision with root package name */
    private ValueAnimator f54289y3;

    /* renamed from: z, reason: collision with root package name */
    @q0
    private CharSequence f54290z;

    /* renamed from: z3, reason: collision with root package name */
    private boolean f54291z3;
    private static final String F3 = ProtectedSandApp.s("\uf246");
    private static final int B3 = a.n.Ca;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        @q0
        CharSequence f54292d;

        /* renamed from: e, reason: collision with root package name */
        boolean f54293e;

        /* renamed from: f, reason: collision with root package name */
        @q0
        CharSequence f54294f;

        /* renamed from: g, reason: collision with root package name */
        @q0
        CharSequence f54295g;

        /* renamed from: h, reason: collision with root package name */
        @q0
        CharSequence f54296h;

        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @q0
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

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @o0
        public String toString() {
            return ProtectedSandApp.s("\uf23f") + Integer.toHexString(System.identityHashCode(this)) + ProtectedSandApp.s("\uf240") + ((Object) this.f54292d) + ProtectedSandApp.s("\uf241") + ((Object) this.f54294f) + ProtectedSandApp.s("\uf242") + ((Object) this.f54295g) + ProtectedSandApp.s("\uf243") + ((Object) this.f54296h) + ProtectedSandApp.s("\uf244");
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@o0 Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            TextUtils.writeToParcel(this.f54292d, parcel, i4);
            parcel.writeInt(this.f54293e ? 1 : 0);
            TextUtils.writeToParcel(this.f54294f, parcel, i4);
            TextUtils.writeToParcel(this.f54295g, parcel, i4);
            TextUtils.writeToParcel(this.f54296h, parcel, i4);
        }

        SavedState(@o0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.f54292d = (CharSequence) creator.createFromParcel(parcel);
            this.f54293e = parcel.readInt() == 1;
            this.f54294f = (CharSequence) creator.createFromParcel(parcel);
            this.f54295g = (CharSequence) creator.createFromParcel(parcel);
            this.f54296h = (CharSequence) creator.createFromParcel(parcel);
        }
    }

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@o0 Editable editable) {
            TextInputLayout.this.u3(!r0.A3);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f54260k) {
                textInputLayout.m3(editable.length());
            }
            if (TextInputLayout.this.f54274r) {
                TextInputLayout.this.y3(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.W2.performClick();
            TextInputLayout.this.W2.jumpDrawablesToCurrentState();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f54250f.requestLayout();
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
            TextInputLayout.this.f54283v3.u0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends androidx.core.view.a {

        /* renamed from: e, reason: collision with root package name */
        private final TextInputLayout f54301e;

        public e(@o0 TextInputLayout textInputLayout) {
            this.f54301e = textInputLayout;
        }

        @Override // androidx.core.view.a
        public void i(@o0 View view, @o0 h0 h0Var) {
            super.i(view, h0Var);
            EditText Z = this.f54301e.Z();
            CharSequence text = Z != null ? Z.getText() : null;
            CharSequence n02 = this.f54301e.n0();
            CharSequence g02 = this.f54301e.g0();
            CharSequence x02 = this.f54301e.x0();
            int U = this.f54301e.U();
            CharSequence V = this.f54301e.V();
            boolean isEmpty = TextUtils.isEmpty(text);
            boolean isEmpty2 = TextUtils.isEmpty(n02);
            boolean V0 = this.f54301e.V0();
            boolean isEmpty3 = TextUtils.isEmpty(g02);
            boolean z4 = (isEmpty3 && TextUtils.isEmpty(V)) ? false : true;
            String charSequence = !isEmpty2 ? n02.toString() : "";
            String s4 = ProtectedSandApp.s("\uf245");
            if (!isEmpty) {
                h0Var.d2(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                h0Var.d2(charSequence);
                if (!V0 && x02 != null) {
                    h0Var.d2(charSequence + s4 + ((Object) x02));
                }
            } else if (x02 != null) {
                h0Var.d2(x02);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    h0Var.A1(charSequence);
                } else {
                    if (!isEmpty) {
                        charSequence = ((Object) text) + s4 + charSequence;
                    }
                    h0Var.d2(charSequence);
                }
                h0Var.Z1(isEmpty);
            }
            if (text == null || text.length() != U) {
                U = -1;
            }
            h0Var.J1(U);
            if (z4) {
                if (isEmpty3) {
                    g02 = V;
                }
                h0Var.v1(g02);
            }
            if (Z != null) {
                Z.setLabelFor(a.h.x5);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface g {
    }

    public interface h {
        void a(@o0 TextInputLayout textInputLayout);
    }

    public interface i {
        void a(@o0 TextInputLayout textInputLayout, int i4);
    }

    public TextInputLayout(@o0 Context context) {
        this(context, null);
    }

    private void A() {
        if (C()) {
            ((com.google.android.material.textfield.c) this.E).T0();
        }
    }

    private void A3() {
        this.f54288y.setVisibility((this.f54286x == null || this.f54281u3) ? 8 : 0);
        q3();
    }

    private void B(boolean z4) {
        ValueAnimator valueAnimator = this.f54289y3;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f54289y3.cancel();
        }
        if (z4 && this.f54287x3) {
            i(1.0f);
        } else {
            this.f54283v3.u0(1.0f);
        }
        this.f54281u3 = false;
        if (C()) {
            d1();
        }
        x3();
        A3();
        D3();
    }

    private void B3(boolean z4, boolean z5) {
        int defaultColor = this.f54269o3.getDefaultColor();
        int colorForState = this.f54269o3.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f54269o3.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z4) {
            this.O = colorForState2;
        } else if (z5) {
            this.O = colorForState;
        } else {
            this.O = defaultColor;
        }
    }

    private boolean C() {
        return this.B && !TextUtils.isEmpty(this.C) && (this.E instanceof com.google.android.material.textfield.c);
    }

    private void C3() {
        if (this.f54250f == null) {
            return;
        }
        x1.n2(this.A, getContext().getResources().getDimensionPixelSize(a.f.f90893y2), this.f54250f.getPaddingTop(), (N0() || P0()) ? 0 : x1.m0(this.f54250f), this.f54250f.getPaddingBottom());
    }

    private void D3() {
        int visibility = this.A.getVisibility();
        boolean z4 = (this.f54290z == null || this.f54281u3) ? false : true;
        this.A.setVisibility(z4 ? 0 : 8);
        if (visibility != this.A.getVisibility()) {
            b0().c(z4);
        }
        q3();
    }

    private void E() {
        Iterator<h> it = this.T2.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private void F(int i4) {
        Iterator<i> it = this.X2.iterator();
        while (it.hasNext()) {
            it.next().a(this, i4);
        }
    }

    private void G(Canvas canvas) {
        com.google.android.material.shape.j jVar = this.F;
        if (jVar != null) {
            Rect bounds = jVar.getBounds();
            bounds.top = bounds.bottom - this.L;
            this.F.draw(canvas);
        }
    }

    private void H(@o0 Canvas canvas) {
        if (this.B) {
            this.f54283v3.m(canvas);
        }
    }

    private void H1(EditText editText) {
        if (this.f54250f != null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf247"));
        }
        if (this.U2 != 3) {
            boolean z4 = editText instanceof TextInputEditText;
        }
        this.f54250f = editText;
        y2(this.f54254h);
        w2(this.f54256i);
        c1();
        c3(new e(this));
        this.f54283v3.H0(this.f54250f.getTypeface());
        this.f54283v3.r0(this.f54250f.getTextSize());
        int gravity = this.f54250f.getGravity();
        this.f54283v3.g0((gravity & (-113)) | 48);
        this.f54283v3.q0(gravity);
        this.f54250f.addTextChangedListener(new a());
        if (this.f54259j3 == null) {
            this.f54259j3 = this.f54250f.getHintTextColors();
        }
        if (this.B) {
            if (TextUtils.isEmpty(this.C)) {
                CharSequence hint = this.f54250f.getHint();
                this.f54252g = hint;
                n2(hint);
                this.f54250f.setHint((CharSequence) null);
            }
            this.D = true;
        }
        if (this.f54266n != null) {
            m3(this.f54250f.getText().length());
        }
        r3();
        this.f54258j.e();
        this.f54244c.bringToFront();
        this.f54246d.bringToFront();
        this.f54248e.bringToFront();
        this.f54255h3.bringToFront();
        E();
        z3();
        C3();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        v3(false, true);
    }

    private void I(boolean z4) {
        ValueAnimator valueAnimator = this.f54289y3;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f54289y3.cancel();
        }
        if (z4 && this.f54287x3) {
            i(0.0f);
        } else {
            this.f54283v3.u0(0.0f);
        }
        if (C() && ((com.google.android.material.textfield.c) this.E).Q0()) {
            A();
        }
        this.f54281u3 = true;
        K0();
        A3();
        D3();
    }

    private void I1() {
        if (g3()) {
            x1.P1(this.f54250f, this.E);
        }
    }

    private boolean J0() {
        return this.U2 != 0;
    }

    private void K0() {
        TextView textView = this.f54276s;
        if (textView == null || !this.f54274r) {
            return;
        }
        textView.setText((CharSequence) null);
        this.f54276s.setVisibility(4);
    }

    private void K2(boolean z4) {
        if (this.f54274r == z4) {
            return;
        }
        if (z4) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f54276s = appCompatTextView;
            appCompatTextView.setId(a.h.y5);
            x1.J1(this.f54276s, 1);
            I2(this.f54280u);
            J2(this.f54278t);
            g();
        } else {
            m1();
            this.f54276s = null;
        }
        this.f54274r = z4;
    }

    private boolean P0() {
        return this.f54255h3.getVisibility() == 0;
    }

    private boolean Y0() {
        return this.J == 1 && this.f54250f.getMinLines() <= 1;
    }

    private com.google.android.material.textfield.e b0() {
        com.google.android.material.textfield.e eVar = this.V2.get(this.U2);
        return eVar != null ? eVar : this.V2.get(0);
    }

    private int[] b1(CheckableImageButton checkableImageButton) {
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    private void c1() {
        p();
        I1();
        E3();
        j3();
        h();
        if (this.J != 0) {
            t3();
        }
    }

    private void d1() {
        if (C()) {
            RectF rectF = this.Q1;
            this.f54283v3.p(rectF, this.f54250f.getWidth(), this.f54250f.getGravity());
            l(rectF);
            int i4 = this.L;
            this.I = i4;
            rectF.top = 0.0f;
            rectF.bottom = i4;
            rectF.offset(-getPaddingLeft(), 0.0f);
            ((com.google.android.material.textfield.c) this.E).W0(rectF);
        }
    }

    @q0
    private CheckableImageButton e0() {
        if (this.f54255h3.getVisibility() == 0) {
            return this.f54255h3;
        }
        if (J0() && N0()) {
            return this.W2;
        }
        return null;
    }

    private void e2(boolean z4) {
        this.f54255h3.setVisibility(z4 ? 0 : 8);
        this.f54248e.setVisibility(z4 ? 8 : 0);
        C3();
        if (J0()) {
            return;
        }
        q3();
    }

    private boolean e3() {
        return (this.f54255h3.getVisibility() == 0 || ((J0() && N0()) || this.f54290z != null)) && this.f54246d.getMeasuredWidth() > 0;
    }

    private static void f1(@o0 ViewGroup viewGroup, boolean z4) {
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            childAt.setEnabled(z4);
            if (childAt instanceof ViewGroup) {
                f1((ViewGroup) childAt, z4);
            }
        }
    }

    private boolean f3() {
        return !(E0() == null && this.f54286x == null) && this.f54244c.getMeasuredWidth() > 0;
    }

    private void g() {
        TextView textView = this.f54276s;
        if (textView != null) {
            this.f54242b.addView(textView);
            this.f54276s.setVisibility(0);
        }
    }

    private boolean g3() {
        EditText editText = this.f54250f;
        return (editText == null || this.E == null || editText.getBackground() != null || this.J == 0) ? false : true;
    }

    private void h() {
        if (this.f54250f == null || this.J != 1) {
            return;
        }
        if (com.google.android.material.resources.c.h(getContext())) {
            EditText editText = this.f54250f;
            editText.setPaddingRelative(x1.n0(editText), getResources().getDimensionPixelSize(a.f.f90863s2), this.f54250f.getPaddingEnd(), getResources().getDimensionPixelSize(a.f.f90858r2));
        } else if (com.google.android.material.resources.c.g(getContext())) {
            EditText editText2 = this.f54250f;
            editText2.setPaddingRelative(x1.n0(editText2), getResources().getDimensionPixelSize(a.f.f90853q2), this.f54250f.getPaddingEnd(), getResources().getDimensionPixelSize(a.f.f90848p2));
        }
    }

    private void h3() {
        TextView textView = this.f54276s;
        if (textView == null || !this.f54274r) {
            return;
        }
        textView.setText(this.f54272q);
        this.f54276s.setVisibility(0);
        this.f54276s.bringToFront();
    }

    private void i1(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(b1(checkableImageButton), colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        mutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    private void i3(boolean z4) {
        if (!z4 || c0() == null) {
            m();
            return;
        }
        Drawable mutate = c0().mutate();
        mutate.setTint(this.f54258j.p());
        this.W2.setImageDrawable(mutate);
    }

    private void j() {
        com.google.android.material.shape.j jVar = this.E;
        if (jVar == null) {
            return;
        }
        jVar.d(this.G);
        if (w()) {
            this.E.E0(this.L, this.O);
        }
        int q4 = q();
        this.P = q4;
        this.E.p0(ColorStateList.valueOf(q4));
        if (this.U2 == 3) {
            this.f54250f.getBackground().invalidateSelf();
        }
        k();
        invalidate();
    }

    private void j3() {
        if (this.J == 1) {
            if (com.google.android.material.resources.c.h(getContext())) {
                this.K = getResources().getDimensionPixelSize(a.f.f90873u2);
            } else if (com.google.android.material.resources.c.g(getContext())) {
                this.K = getResources().getDimensionPixelSize(a.f.f90868t2);
            }
        }
    }

    private void k() {
        if (this.F == null) {
            return;
        }
        if (x()) {
            this.F.p0(ColorStateList.valueOf(this.O));
        }
        invalidate();
    }

    private void k3(@o0 Rect rect) {
        com.google.android.material.shape.j jVar = this.F;
        if (jVar != null) {
            int i4 = rect.bottom;
            jVar.setBounds(rect.left, i4 - this.N, rect.right, i4);
        }
    }

    private void l(@o0 RectF rectF) {
        float f4 = rectF.left;
        int i4 = this.H;
        rectF.left = f4 - i4;
        rectF.right += i4;
    }

    private void l3() {
        if (this.f54266n != null) {
            EditText editText = this.f54250f;
            m3(editText == null ? 0 : editText.getText().length());
        }
    }

    private void m() {
        n(this.W2, this.Z2, this.Y2, this.f54243b3, this.f54241a3);
    }

    private void m1() {
        TextView textView = this.f54276s;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void n(@o0 CheckableImageButton checkableImageButton, boolean z4, ColorStateList colorStateList, boolean z5, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z4 || z5)) {
            drawable = drawable.mutate();
            if (z4) {
                drawable.setTintList(colorStateList);
            }
            if (z5) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private static void n3(@o0 Context context, @o0 TextView textView, int i4, int i5, boolean z4) {
        textView.setContentDescription(context.getString(z4 ? a.m.F : a.m.E, Integer.valueOf(i4), Integer.valueOf(i5)));
    }

    private void o() {
        n(this.L2, this.N2, this.M2, this.P2, this.O2);
    }

    private void o3() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f54266n;
        if (textView != null) {
            b3(textView, this.f54264m ? this.f54268o : this.f54270p);
            if (!this.f54264m && (colorStateList2 = this.f54282v) != null) {
                this.f54266n.setTextColor(colorStateList2);
            }
            if (!this.f54264m || (colorStateList = this.f54284w) == null) {
                return;
            }
            this.f54266n.setTextColor(colorStateList);
        }
    }

    private void p() {
        int i4 = this.J;
        if (i4 == 0) {
            this.E = null;
            this.F = null;
            return;
        }
        if (i4 == 1) {
            this.E = new com.google.android.material.shape.j(this.G);
            this.F = new com.google.android.material.shape.j();
        } else {
            if (i4 != 2) {
                throw new IllegalArgumentException(android.support.v4.media.b.a(new StringBuilder(), this.J, ProtectedSandApp.s("\uf248")));
            }
            if (!this.B || (this.E instanceof com.google.android.material.textfield.c)) {
                this.E = new com.google.android.material.shape.j(this.G);
            } else {
                this.E = new com.google.android.material.textfield.c(this.G);
            }
            this.F = null;
        }
    }

    private void p3() {
        if (!C() || this.f54281u3 || this.I == this.L) {
            return;
        }
        A();
        d1();
    }

    private int q() {
        int i4 = this.P;
        if (this.J != 1) {
            return i4;
        }
        return z.v(this.P, u8.a.e(this, a.c.P2, 0));
    }

    private void q2(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.C)) {
            return;
        }
        this.C = charSequence;
        this.f54283v3.F0(charSequence);
        if (this.f54281u3) {
            return;
        }
        d1();
    }

    private boolean q3() {
        boolean z4;
        if (this.f54250f == null) {
            return false;
        }
        boolean z5 = true;
        if (f3()) {
            int measuredWidth = this.f54244c.getMeasuredWidth() - this.f54250f.getPaddingLeft();
            if (this.Q2 == null || this.R2 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.Q2 = colorDrawable;
                this.R2 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.f54250f.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.Q2;
            if (drawable != drawable2) {
                this.f54250f.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z4 = true;
            }
            z4 = false;
        } else {
            if (this.Q2 != null) {
                Drawable[] compoundDrawablesRelative2 = this.f54250f.getCompoundDrawablesRelative();
                this.f54250f.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.Q2 = null;
                z4 = true;
            }
            z4 = false;
        }
        if (e3()) {
            int measuredWidth2 = this.A.getMeasuredWidth() - this.f54250f.getPaddingRight();
            CheckableImageButton e02 = e0();
            if (e02 != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) e02.getLayoutParams()).getMarginStart() + e02.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative3 = this.f54250f.getCompoundDrawablesRelative();
            Drawable drawable3 = this.f54245c3;
            if (drawable3 == null || this.f54247d3 == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f54245c3 = colorDrawable2;
                    this.f54247d3 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = compoundDrawablesRelative3[2];
                Drawable drawable5 = this.f54245c3;
                if (drawable4 != drawable5) {
                    this.f54249e3 = drawable4;
                    this.f54250f.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                } else {
                    z5 = z4;
                }
            } else {
                this.f54247d3 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f54250f.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f54245c3, compoundDrawablesRelative3[3]);
            }
        } else {
            if (this.f54245c3 == null) {
                return z4;
            }
            Drawable[] compoundDrawablesRelative4 = this.f54250f.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.f54245c3) {
                this.f54250f.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f54249e3, compoundDrawablesRelative4[3]);
            } else {
                z5 = z4;
            }
            this.f54245c3 = null;
        }
        return z5;
    }

    @o0
    private Rect r(@o0 Rect rect) {
        if (this.f54250f == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.R;
        boolean z4 = x1.c0(this) == 1;
        rect2.bottom = rect.bottom;
        int i4 = this.J;
        if (i4 == 1) {
            rect2.left = r0(rect.left, z4);
            rect2.top = rect.top + this.K;
            rect2.right = s0(rect.right, z4);
            return rect2;
        }
        if (i4 != 2) {
            rect2.left = r0(rect.left, z4);
            rect2.top = getPaddingTop();
            rect2.right = s0(rect.right, z4);
            return rect2;
        }
        rect2.left = this.f54250f.getPaddingLeft() + rect.left;
        rect2.top = rect.top - v();
        rect2.right = rect.right - this.f54250f.getPaddingRight();
        return rect2;
    }

    private int r0(int i4, boolean z4) {
        int compoundPaddingLeft = this.f54250f.getCompoundPaddingLeft() + i4;
        return (this.f54286x == null || z4) ? compoundPaddingLeft : (compoundPaddingLeft - this.f54288y.getMeasuredWidth()) + this.f54288y.getPaddingLeft();
    }

    private int s(@o0 Rect rect, @o0 Rect rect2, float f4) {
        return Y0() ? (int) (rect2.top + f4) : rect.bottom - this.f54250f.getCompoundPaddingBottom();
    }

    private int s0(int i4, boolean z4) {
        int compoundPaddingRight = i4 - this.f54250f.getCompoundPaddingRight();
        return (this.f54286x == null || !z4) ? compoundPaddingRight : compoundPaddingRight + (this.f54288y.getMeasuredWidth() - this.f54288y.getPaddingRight());
    }

    private boolean s3() {
        int max;
        if (this.f54250f == null || this.f54250f.getMeasuredHeight() >= (max = Math.max(this.f54246d.getMeasuredHeight(), this.f54244c.getMeasuredHeight()))) {
            return false;
        }
        this.f54250f.setMinimumHeight(max);
        return true;
    }

    private int t(@o0 Rect rect, float f4) {
        if (Y0()) {
            return (int) (rect.centerY() - (f4 / 2.0f));
        }
        return this.f54250f.getCompoundPaddingTop() + rect.top;
    }

    private static void t2(@o0 CheckableImageButton checkableImageButton, @q0 View.OnLongClickListener onLongClickListener) {
        boolean N0 = x1.N0(checkableImageButton);
        boolean z4 = onLongClickListener != null;
        boolean z5 = N0 || z4;
        checkableImageButton.setFocusable(z5);
        checkableImageButton.setClickable(N0);
        checkableImageButton.d(N0);
        checkableImageButton.setLongClickable(z4);
        checkableImageButton.setImportantForAccessibility(z5 ? 1 : 2);
    }

    private void t3() {
        if (this.J != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f54242b.getLayoutParams();
            int v4 = v();
            if (v4 != layoutParams.topMargin) {
                layoutParams.topMargin = v4;
                this.f54242b.requestLayout();
            }
        }
    }

    @o0
    private Rect u(@o0 Rect rect) {
        if (this.f54250f == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.R;
        float D = this.f54283v3.D();
        rect2.left = this.f54250f.getCompoundPaddingLeft() + rect.left;
        rect2.top = t(rect, D);
        rect2.right = rect.right - this.f54250f.getCompoundPaddingRight();
        rect2.bottom = s(rect, rect2, D);
        return rect2;
    }

    private static void u2(@o0 CheckableImageButton checkableImageButton, @q0 View.OnClickListener onClickListener, @q0 View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        t2(checkableImageButton, onLongClickListener);
    }

    private int v() {
        float s4;
        if (!this.B) {
            return 0;
        }
        int i4 = this.J;
        if (i4 == 0 || i4 == 1) {
            s4 = this.f54283v3.s();
        } else {
            if (i4 != 2) {
                return 0;
            }
            s4 = this.f54283v3.s() / 2.0f;
        }
        return (int) s4;
    }

    private static void v2(@o0 CheckableImageButton checkableImageButton, @q0 View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        t2(checkableImageButton, onLongClickListener);
    }

    private void v3(boolean z4, boolean z5) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f54250f;
        boolean z6 = false;
        boolean z7 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f54250f;
        if (editText2 != null && editText2.hasFocus()) {
            z6 = true;
        }
        boolean l4 = this.f54258j.l();
        ColorStateList colorStateList2 = this.f54259j3;
        if (colorStateList2 != null) {
            this.f54283v3.f0(colorStateList2);
            this.f54283v3.p0(this.f54259j3);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f54259j3;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f54279t3) : this.f54279t3;
            this.f54283v3.f0(ColorStateList.valueOf(colorForState));
            this.f54283v3.p0(ColorStateList.valueOf(colorForState));
        } else if (l4) {
            this.f54283v3.f0(this.f54258j.q());
        } else if (this.f54264m && (textView = this.f54266n) != null) {
            this.f54283v3.f0(textView.getTextColors());
        } else if (z6 && (colorStateList = this.f54261k3) != null) {
            this.f54283v3.f0(colorStateList);
        }
        if (z7 || !this.f54285w3 || (isEnabled() && z6)) {
            if (z5 || this.f54281u3) {
                B(z4);
                return;
            }
            return;
        }
        if (z5 || !this.f54281u3) {
            I(z4);
        }
    }

    private boolean w() {
        return this.J == 2 && x();
    }

    private void w3() {
        EditText editText;
        if (this.f54276s == null || (editText = this.f54250f) == null) {
            return;
        }
        this.f54276s.setGravity(editText.getGravity());
        this.f54276s.setPadding(this.f54250f.getCompoundPaddingLeft(), this.f54250f.getCompoundPaddingTop(), this.f54250f.getCompoundPaddingRight(), this.f54250f.getCompoundPaddingBottom());
    }

    private boolean x() {
        return this.L > -1 && this.O != 0;
    }

    private void x3() {
        EditText editText = this.f54250f;
        y3(editText == null ? 0 : editText.getText().length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3(int i4) {
        if (i4 != 0 || this.f54281u3) {
            K0();
        } else {
            h3();
        }
    }

    private void z3() {
        if (this.f54250f == null) {
            return;
        }
        x1.n2(this.f54288y, a1() ? 0 : x1.n0(this.f54250f), this.f54250f.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(a.f.f90893y2), this.f54250f.getCompoundPaddingBottom());
    }

    @q0
    public CharSequence A0() {
        return this.f54286x;
    }

    public void A1(boolean z4) {
        if (this.f54260k != z4) {
            if (z4) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f54266n = appCompatTextView;
                appCompatTextView.setId(a.h.v5);
                Typeface typeface = this.V1;
                if (typeface != null) {
                    this.f54266n.setTypeface(typeface);
                }
                this.f54266n.setMaxLines(1);
                this.f54258j.d(this.f54266n, 2);
                ((ViewGroup.MarginLayoutParams) this.f54266n.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(a.f.j6));
                o3();
                l3();
            } else {
                this.f54258j.E(this.f54266n, 2);
                this.f54266n = null;
            }
            this.f54260k = z4;
        }
    }

    @Deprecated
    public void A2(@g1 int i4) {
        B2(i4 != 0 ? getResources().getText(i4) : null);
    }

    @q0
    public ColorStateList B0() {
        return this.f54288y.getTextColors();
    }

    public void B1(int i4) {
        if (this.f54262l != i4) {
            if (i4 > 0) {
                this.f54262l = i4;
            } else {
                this.f54262l = -1;
            }
            if (this.f54260k) {
                l3();
            }
        }
    }

    @Deprecated
    public void B2(@q0 CharSequence charSequence) {
        this.W2.setContentDescription(charSequence);
    }

    @o0
    public TextView C0() {
        return this.f54288y;
    }

    public void C1(int i4) {
        if (this.f54268o != i4) {
            this.f54268o = i4;
            o3();
        }
    }

    @Deprecated
    public void C2(@v int i4) {
        D2(i4 != 0 ? e.a.b(getContext(), i4) : null);
    }

    @m1
    boolean D() {
        return C() && ((com.google.android.material.textfield.c) this.E).Q0();
    }

    @q0
    public CharSequence D0() {
        return this.L2.getContentDescription();
    }

    public void D1(@q0 ColorStateList colorStateList) {
        if (this.f54284w != colorStateList) {
            this.f54284w = colorStateList;
            o3();
        }
    }

    @Deprecated
    public void D2(@q0 Drawable drawable) {
        this.W2.setImageDrawable(drawable);
    }

    @q0
    public Drawable E0() {
        return this.L2.getDrawable();
    }

    public void E1(int i4) {
        if (this.f54270p != i4) {
            this.f54270p = i4;
            o3();
        }
    }

    @Deprecated
    public void E2(boolean z4) {
        if (z4 && this.U2 != 1) {
            P1(1);
        } else {
            if (z4) {
                return;
            }
            P1(0);
        }
    }

    void E3() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.E == null || this.J == 0) {
            return;
        }
        boolean z4 = false;
        boolean z5 = isFocused() || ((editText2 = this.f54250f) != null && editText2.hasFocus());
        boolean z6 = isHovered() || ((editText = this.f54250f) != null && editText.isHovered());
        if (!isEnabled()) {
            this.O = this.f54279t3;
        } else if (this.f54258j.l()) {
            if (this.f54269o3 != null) {
                B3(z5, z6);
            } else {
                this.O = this.f54258j.p();
            }
        } else if (!this.f54264m || (textView = this.f54266n) == null) {
            if (z5) {
                this.O = this.f54267n3;
            } else if (z6) {
                this.O = this.f54265m3;
            } else {
                this.O = this.f54263l3;
            }
        } else if (this.f54269o3 != null) {
            B3(z5, z6);
        } else {
            this.O = textView.getCurrentTextColor();
        }
        if (j0() != null && this.f54258j.C() && this.f54258j.l()) {
            z4 = true;
        }
        e2(z4);
        h1();
        j1();
        g1();
        if (b0().d()) {
            i3(this.f54258j.l());
        }
        if (z5 && isEnabled()) {
            this.L = this.N;
        } else {
            this.L = this.M;
        }
        if (this.J == 2) {
            p3();
        }
        if (this.J == 1) {
            if (!isEnabled()) {
                this.P = this.f54273q3;
            } else if (z6 && !z5) {
                this.P = this.f54277s3;
            } else if (z5) {
                this.P = this.f54275r3;
            } else {
                this.P = this.f54271p3;
            }
        }
        j();
    }

    @q0
    public CharSequence F0() {
        return this.f54290z;
    }

    public void F1(@q0 ColorStateList colorStateList) {
        if (this.f54282v != colorStateList) {
            this.f54282v = colorStateList;
            o3();
        }
    }

    @Deprecated
    public void F2(@q0 ColorStateList colorStateList) {
        this.Y2 = colorStateList;
        this.Z2 = true;
        m();
    }

    @q0
    public ColorStateList G0() {
        return this.A.getTextColors();
    }

    public void G1(@q0 ColorStateList colorStateList) {
        this.f54259j3 = colorStateList;
        this.f54261k3 = colorStateList;
        if (this.f54250f != null) {
            u3(false);
        }
    }

    @Deprecated
    public void G2(@q0 PorterDuff.Mode mode) {
        this.f54241a3 = mode;
        this.f54243b3 = true;
        m();
    }

    @o0
    public TextView H0() {
        return this.A;
    }

    public void H2(@q0 CharSequence charSequence) {
        if (this.f54274r && TextUtils.isEmpty(charSequence)) {
            K2(false);
        } else {
            if (!this.f54274r) {
                K2(true);
            }
            this.f54272q = charSequence;
        }
        x3();
    }

    @q0
    public Typeface I0() {
        return this.V1;
    }

    public void I2(@h1 int i4) {
        this.f54280u = i4;
        TextView textView = this.f54276s;
        if (textView != null) {
            textView.setTextAppearance(i4);
        }
    }

    @o0
    com.google.android.material.shape.j J() {
        int i4 = this.J;
        if (i4 == 1 || i4 == 2) {
            return this.E;
        }
        throw new IllegalStateException();
    }

    public void J1(boolean z4) {
        this.W2.setActivated(z4);
    }

    public void J2(@q0 ColorStateList colorStateList) {
        if (this.f54278t != colorStateList) {
            this.f54278t = colorStateList;
            TextView textView = this.f54276s;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public int K() {
        return this.P;
    }

    public void K1(boolean z4) {
        this.W2.c(z4);
    }

    public int L() {
        return this.J;
    }

    public boolean L0() {
        return this.f54260k;
    }

    public void L1(@g1 int i4) {
        M1(i4 != 0 ? getResources().getText(i4) : null);
    }

    public void L2(@q0 CharSequence charSequence) {
        this.f54286x = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f54288y.setText(charSequence);
        A3();
    }

    public float M() {
        return this.E.v();
    }

    public boolean M0() {
        return this.W2.a();
    }

    public void M1(@q0 CharSequence charSequence) {
        if (a0() != charSequence) {
            this.W2.setContentDescription(charSequence);
        }
    }

    public void M2(@h1 int i4) {
        this.f54288y.setTextAppearance(i4);
    }

    public float N() {
        return this.E.w();
    }

    public boolean N0() {
        return this.f54248e.getVisibility() == 0 && this.W2.getVisibility() == 0;
    }

    public void N1(@v int i4) {
        O1(i4 != 0 ? e.a.b(getContext(), i4) : null);
    }

    public void N2(@o0 ColorStateList colorStateList) {
        this.f54288y.setTextColor(colorStateList);
    }

    public float O() {
        return this.E.U();
    }

    public boolean O0() {
        return this.f54258j.C();
    }

    public void O1(@q0 Drawable drawable) {
        this.W2.setImageDrawable(drawable);
        g1();
    }

    public void O2(boolean z4) {
        this.L2.c(z4);
    }

    public float P() {
        return this.E.T();
    }

    public void P1(int i4) {
        int i5 = this.U2;
        this.U2 = i4;
        F(i5);
        U1(i4 != 0);
        if (b0().b(this.J)) {
            b0().a();
            m();
        } else {
            throw new IllegalStateException(ProtectedSandApp.s("\uf249") + this.J + ProtectedSandApp.s("\uf24a") + i4);
        }
    }

    public void P2(@g1 int i4) {
        Q2(i4 != 0 ? getResources().getText(i4) : null);
    }

    public int Q() {
        return this.f54267n3;
    }

    public boolean Q0() {
        return this.f54285w3;
    }

    public void Q1(@q0 View.OnClickListener onClickListener) {
        u2(this.W2, onClickListener, this.f54251f3);
    }

    public void Q2(@q0 CharSequence charSequence) {
        if (D0() != charSequence) {
            this.L2.setContentDescription(charSequence);
        }
    }

    @q0
    public ColorStateList R() {
        return this.f54269o3;
    }

    @m1
    final boolean R0() {
        return this.f54258j.v();
    }

    public void R1(@q0 View.OnLongClickListener onLongClickListener) {
        this.f54251f3 = onLongClickListener;
        v2(this.W2, onLongClickListener);
    }

    public void R2(@v int i4) {
        S2(i4 != 0 ? e.a.b(getContext(), i4) : null);
    }

    public int S() {
        return this.M;
    }

    public boolean S0() {
        return this.f54258j.D();
    }

    public void S1(@q0 ColorStateList colorStateList) {
        if (this.Y2 != colorStateList) {
            this.Y2 = colorStateList;
            this.Z2 = true;
            m();
        }
    }

    public void S2(@q0 Drawable drawable) {
        this.L2.setImageDrawable(drawable);
        if (drawable != null) {
            X2(true);
            j1();
        } else {
            X2(false);
            T2(null);
            U2(null);
            Q2(null);
        }
    }

    public int T() {
        return this.N;
    }

    public boolean T0() {
        return this.f54287x3;
    }

    public void T1(@q0 PorterDuff.Mode mode) {
        if (this.f54241a3 != mode) {
            this.f54241a3 = mode;
            this.f54243b3 = true;
            m();
        }
    }

    public void T2(@q0 View.OnClickListener onClickListener) {
        u2(this.L2, onClickListener, this.S2);
    }

    public int U() {
        return this.f54262l;
    }

    public boolean U0() {
        return this.B;
    }

    public void U1(boolean z4) {
        if (N0() != z4) {
            this.W2.setVisibility(z4 ? 0 : 8);
            C3();
            q3();
        }
    }

    public void U2(@q0 View.OnLongClickListener onLongClickListener) {
        this.S2 = onLongClickListener;
        v2(this.L2, onLongClickListener);
    }

    @q0
    CharSequence V() {
        TextView textView;
        if (this.f54260k && this.f54264m && (textView = this.f54266n) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    @m1
    final boolean V0() {
        return this.f54281u3;
    }

    public void V1(@q0 CharSequence charSequence) {
        if (!this.f54258j.C()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                X1(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f54258j.x();
        } else {
            this.f54258j.R(charSequence);
        }
    }

    public void V2(@q0 ColorStateList colorStateList) {
        if (this.M2 != colorStateList) {
            this.M2 = colorStateList;
            this.N2 = true;
            o();
        }
    }

    @q0
    public ColorStateList W() {
        return this.f54282v;
    }

    @Deprecated
    public boolean W0() {
        return this.U2 == 1;
    }

    public void W1(@q0 CharSequence charSequence) {
        this.f54258j.G(charSequence);
    }

    public void W2(@q0 PorterDuff.Mode mode) {
        if (this.O2 != mode) {
            this.O2 = mode;
            this.P2 = true;
            o();
        }
    }

    @q0
    public ColorStateList X() {
        return this.f54282v;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public boolean X0() {
        return this.D;
    }

    public void X1(boolean z4) {
        this.f54258j.H(z4);
    }

    public void X2(boolean z4) {
        if (a1() != z4) {
            this.L2.setVisibility(z4 ? 0 : 8);
            z3();
            q3();
        }
    }

    @q0
    public ColorStateList Y() {
        return this.f54259j3;
    }

    public void Y1(@v int i4) {
        Z1(i4 != 0 ? e.a.b(getContext(), i4) : null);
        h1();
    }

    public void Y2(@q0 CharSequence charSequence) {
        this.f54290z = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.A.setText(charSequence);
        D3();
    }

    @q0
    public EditText Z() {
        return this.f54250f;
    }

    public boolean Z0() {
        return this.L2.a();
    }

    public void Z1(@q0 Drawable drawable) {
        this.f54255h3.setImageDrawable(drawable);
        e2(drawable != null && this.f54258j.C());
    }

    public void Z2(@h1 int i4) {
        this.A.setTextAppearance(i4);
    }

    @q0
    public CharSequence a0() {
        return this.W2.getContentDescription();
    }

    public boolean a1() {
        return this.L2.getVisibility() == 0;
    }

    public void a2(@q0 View.OnClickListener onClickListener) {
        u2(this.f54255h3, onClickListener, this.f54253g3);
    }

    public void a3(@o0 ColorStateList colorStateList) {
        this.A.setTextColor(colorStateList);
    }

    @Override // android.view.ViewGroup
    public void addView(@o0 View view, int i4, @o0 ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i4, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f54242b.addView(view, layoutParams2);
        this.f54242b.setLayoutParams(layoutParams);
        t3();
        H1((EditText) view);
    }

    public void b2(@q0 View.OnLongClickListener onLongClickListener) {
        this.f54253g3 = onLongClickListener;
        v2(this.f54255h3, onLongClickListener);
    }

    void b3(@o0 TextView textView, @h1 int i4) {
        try {
            textView.setTextAppearance(i4);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        textView.setTextAppearance(a.n.X4);
        textView.setTextColor(androidx.core.content.d.getColor(getContext(), a.e.f90751w0));
    }

    @q0
    public Drawable c0() {
        return this.W2.getDrawable();
    }

    public void c2(@q0 ColorStateList colorStateList) {
        this.f54257i3 = colorStateList;
        Drawable drawable = this.f54255h3.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintList(colorStateList);
        }
        if (this.f54255h3.getDrawable() != drawable) {
            this.f54255h3.setImageDrawable(drawable);
        }
    }

    public void c3(@q0 e eVar) {
        EditText editText = this.f54250f;
        if (editText != null) {
            x1.H1(editText, eVar);
        }
    }

    public int d0() {
        return this.U2;
    }

    public void d2(@q0 PorterDuff.Mode mode) {
        Drawable drawable = this.f54255h3.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintMode(mode);
        }
        if (this.f54255h3.getDrawable() != drawable) {
            this.f54255h3.setImageDrawable(drawable);
        }
    }

    public void d3(@q0 Typeface typeface) {
        if (typeface != this.V1) {
            this.V1 = typeface;
            this.f54283v3.H0(typeface);
            this.f54258j.O(typeface);
            TextView textView = this.f54266n;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(@o0 ViewStructure viewStructure, int i4) {
        EditText editText = this.f54250f;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i4);
            return;
        }
        if (this.f54252g != null) {
            boolean z4 = this.D;
            this.D = false;
            CharSequence hint = editText.getHint();
            this.f54250f.setHint(this.f54252g);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i4);
                return;
            } finally {
                this.f54250f.setHint(hint);
                this.D = z4;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i4);
        onProvideAutofillVirtualStructure(viewStructure, i4);
        viewStructure.setChildCount(this.f54242b.getChildCount());
        for (int i5 = 0; i5 < this.f54242b.getChildCount(); i5++) {
            View childAt = this.f54242b.getChildAt(i5);
            ViewStructure newChild = viewStructure.newChild(i5);
            childAt.dispatchProvideAutofillStructure(newChild, i4);
            if (childAt == this.f54250f) {
                newChild.setHint(n0());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(@o0 SparseArray<Parcelable> sparseArray) {
        this.A3 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.A3 = false;
    }

    @Override // android.view.View
    public void draw(@o0 Canvas canvas) {
        super.draw(canvas);
        H(canvas);
        G(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f54291z3) {
            return;
        }
        this.f54291z3 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.a aVar = this.f54283v3;
        boolean E0 = aVar != null ? aVar.E0(drawableState) : false;
        if (this.f54250f != null) {
            u3(x1.Y0(this) && isEnabled());
        }
        r3();
        E3();
        if (E0) {
            invalidate();
        }
        this.f54291z3 = false;
    }

    public void e(@o0 h hVar) {
        this.T2.add(hVar);
        if (this.f54250f != null) {
            hVar.a(this);
        }
    }

    @Deprecated
    public void e1(boolean z4) {
        if (this.U2 == 1) {
            this.W2.performClick();
            if (z4) {
                this.W2.jumpDrawablesToCurrentState();
            }
        }
    }

    public void f(@o0 i iVar) {
        this.X2.add(iVar);
    }

    @o0
    CheckableImageButton f0() {
        return this.W2;
    }

    public void f2(@h1 int i4) {
        this.f54258j.I(i4);
    }

    @q0
    public CharSequence g0() {
        if (this.f54258j.C()) {
            return this.f54258j.o();
        }
        return null;
    }

    public void g1() {
        i1(this.W2, this.Y2);
    }

    public void g2(@q0 ColorStateList colorStateList) {
        this.f54258j.J(colorStateList);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f54250f;
        if (editText == null) {
            return super.getBaseline();
        }
        return getPaddingTop() + editText.getBaseline() + v();
    }

    @q0
    public CharSequence h0() {
        return this.f54258j.n();
    }

    public void h1() {
        i1(this.f54255h3, this.f54257i3);
    }

    public void h2(boolean z4) {
        if (this.f54285w3 != z4) {
            this.f54285w3 = z4;
            u3(false);
        }
    }

    @m1
    void i(float f4) {
        if (this.f54283v3.G() == f4) {
            return;
        }
        if (this.f54289y3 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f54289y3 = valueAnimator;
            valueAnimator.setInterpolator(com.google.android.material.animation.a.f52467b);
            this.f54289y3.setDuration(167L);
            this.f54289y3.addUpdateListener(new d());
        }
        this.f54289y3.setFloatValues(this.f54283v3.G(), f4);
        this.f54289y3.start();
    }

    @androidx.annotation.l
    public int i0() {
        return this.f54258j.p();
    }

    public void i2(@q0 CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (S0()) {
                k2(false);
            }
        } else {
            if (!S0()) {
                k2(true);
            }
            this.f54258j.S(charSequence);
        }
    }

    @q0
    public Drawable j0() {
        return this.f54255h3.getDrawable();
    }

    public void j1() {
        i1(this.L2, this.M2);
    }

    public void j2(@q0 ColorStateList colorStateList) {
        this.f54258j.M(colorStateList);
    }

    @m1
    final int k0() {
        return this.f54258j.p();
    }

    public void k1(@o0 h hVar) {
        this.T2.remove(hVar);
    }

    public void k2(boolean z4) {
        this.f54258j.L(z4);
    }

    @q0
    public CharSequence l0() {
        if (this.f54258j.D()) {
            return this.f54258j.r();
        }
        return null;
    }

    public void l1(@o0 i iVar) {
        this.X2.remove(iVar);
    }

    public void l2(@h1 int i4) {
        this.f54258j.K(i4);
    }

    @androidx.annotation.l
    public int m0() {
        return this.f54258j.t();
    }

    public void m2(@g1 int i4) {
        n2(i4 != 0 ? getResources().getText(i4) : null);
    }

    void m3(int i4) {
        boolean z4 = this.f54264m;
        int i5 = this.f54262l;
        if (i5 == -1) {
            this.f54266n.setText(String.valueOf(i4));
            this.f54266n.setContentDescription(null);
            this.f54264m = false;
        } else {
            this.f54264m = i4 > i5;
            n3(getContext(), this.f54266n, i4, this.f54262l, this.f54264m);
            if (z4 != this.f54264m) {
                o3();
            }
            this.f54266n.setText(androidx.core.text.a.c().q(getContext().getString(a.m.G, Integer.valueOf(i4), Integer.valueOf(this.f54262l))));
        }
        if (this.f54250f == null || z4 == this.f54264m) {
            return;
        }
        u3(false);
        E3();
        r3();
    }

    @q0
    public CharSequence n0() {
        if (this.B) {
            return this.C;
        }
        return null;
    }

    public void n1(@androidx.annotation.l int i4) {
        if (this.P != i4) {
            this.P = i4;
            this.f54271p3 = i4;
            this.f54275r3 = i4;
            this.f54277s3 = i4;
            j();
        }
    }

    public void n2(@q0 CharSequence charSequence) {
        if (this.B) {
            q2(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    @m1
    final float o0() {
        return this.f54283v3.s();
    }

    public void o1(@n int i4) {
        n1(androidx.core.content.d.getColor(getContext(), i4));
    }

    public void o2(boolean z4) {
        this.f54287x3 = z4;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        EditText editText = this.f54250f;
        if (editText != null) {
            Rect rect = this.Q;
            com.google.android.material.internal.c.a(this, editText, rect);
            k3(rect);
            if (this.B) {
                this.f54283v3.r0(this.f54250f.getTextSize());
                int gravity = this.f54250f.getGravity();
                this.f54283v3.g0((gravity & (-113)) | 48);
                this.f54283v3.q0(gravity);
                this.f54283v3.c0(r(rect));
                this.f54283v3.m0(u(rect));
                this.f54283v3.Z(false);
                if (!C() || this.f54281u3) {
                    return;
                }
                d1();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        boolean s32 = s3();
        boolean q32 = q3();
        if (s32 || q32) {
            this.f54250f.post(new c());
        }
        w3();
        z3();
        C3();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(@q0 Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        V1(savedState.f54292d);
        if (savedState.f54293e) {
            this.W2.post(new b());
        }
        n2(savedState.f54294f);
        i2(savedState.f54295g);
        H2(savedState.f54296h);
        requestLayout();
    }

    @Override // android.view.View
    @q0
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f54258j.l()) {
            savedState.f54292d = g0();
        }
        savedState.f54293e = J0() && this.W2.isChecked();
        savedState.f54294f = n0();
        savedState.f54295g = l0();
        savedState.f54296h = x0();
        return savedState;
    }

    @m1
    final int p0() {
        return this.f54283v3.x();
    }

    public void p1(@o0 ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f54271p3 = defaultColor;
        this.P = defaultColor;
        this.f54273q3 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f54275r3 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f54277s3 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        j();
    }

    public void p2(boolean z4) {
        if (z4 != this.B) {
            this.B = z4;
            if (z4) {
                CharSequence hint = this.f54250f.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.C)) {
                        n2(hint);
                    }
                    this.f54250f.setHint((CharSequence) null);
                }
                this.D = true;
            } else {
                this.D = false;
                if (!TextUtils.isEmpty(this.C) && TextUtils.isEmpty(this.f54250f.getHint())) {
                    this.f54250f.setHint(this.C);
                }
                q2(null);
            }
            if (this.f54250f != null) {
                t3();
            }
        }
    }

    @q0
    public ColorStateList q0() {
        return this.f54261k3;
    }

    public void q1(int i4) {
        if (i4 == this.J) {
            return;
        }
        this.J = i4;
        if (this.f54250f != null) {
            c1();
        }
    }

    public void r1(float f4, float f5, float f6, float f7) {
        com.google.android.material.shape.j jVar = this.E;
        if (jVar != null && jVar.T() == f4 && this.E.U() == f5 && this.E.w() == f7 && this.E.v() == f6) {
            return;
        }
        this.G = this.G.v().K(f4).P(f5).C(f7).x(f6).m();
        j();
    }

    public void r2(@h1 int i4) {
        this.f54283v3.d0(i4);
        this.f54261k3 = this.f54283v3.q();
        if (this.f54250f != null) {
            u3(false);
            t3();
        }
    }

    void r3() {
        Drawable background;
        TextView textView;
        EditText editText = this.f54250f;
        if (editText == null || this.J != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (a0.a(background)) {
            background = background.mutate();
        }
        if (this.f54258j.l()) {
            background.setColorFilter(androidx.appcompat.widget.h.e(this.f54258j.p(), PorterDuff.Mode.SRC_IN));
        } else if (this.f54264m && (textView = this.f54266n) != null) {
            background.setColorFilter(androidx.appcompat.widget.h.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            background.clearColorFilter();
            this.f54250f.refreshDrawableState();
        }
    }

    public void s1(@q int i4, @q int i5, @q int i6, @q int i7) {
        r1(getContext().getResources().getDimension(i4), getContext().getResources().getDimension(i5), getContext().getResources().getDimension(i7), getContext().getResources().getDimension(i6));
    }

    public void s2(@q0 ColorStateList colorStateList) {
        if (this.f54261k3 != colorStateList) {
            if (this.f54259j3 == null) {
                this.f54283v3.f0(colorStateList);
            }
            this.f54261k3 = colorStateList;
            if (this.f54250f != null) {
                u3(false);
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        f1(this, z4);
        super.setEnabled(z4);
    }

    @u0
    public int t0() {
        return this.f54256i;
    }

    public void t1(@androidx.annotation.l int i4) {
        if (this.f54267n3 != i4) {
            this.f54267n3 = i4;
            E3();
        }
    }

    @u0
    public int u0() {
        return this.f54254h;
    }

    public void u1(@o0 ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f54263l3 = colorStateList.getDefaultColor();
            this.f54279t3 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f54265m3 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f54267n3 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f54267n3 != colorStateList.getDefaultColor()) {
            this.f54267n3 = colorStateList.getDefaultColor();
        }
        E3();
    }

    void u3(boolean z4) {
        v3(z4, false);
    }

    @q0
    @Deprecated
    public CharSequence v0() {
        return this.W2.getContentDescription();
    }

    public void v1(@q0 ColorStateList colorStateList) {
        if (this.f54269o3 != colorStateList) {
            this.f54269o3 = colorStateList;
            E3();
        }
    }

    @q0
    @Deprecated
    public Drawable w0() {
        return this.W2.getDrawable();
    }

    public void w1(int i4) {
        this.M = i4;
        E3();
    }

    public void w2(@u0 int i4) {
        this.f54256i = i4;
        EditText editText = this.f54250f;
        if (editText == null || i4 == -1) {
            return;
        }
        editText.setMaxWidth(i4);
    }

    @q0
    public CharSequence x0() {
        if (this.f54274r) {
            return this.f54272q;
        }
        return null;
    }

    public void x1(int i4) {
        this.N = i4;
        E3();
    }

    public void x2(@q int i4) {
        w2(getContext().getResources().getDimensionPixelSize(i4));
    }

    public void y() {
        this.T2.clear();
    }

    @h1
    public int y0() {
        return this.f54280u;
    }

    public void y1(@q int i4) {
        x1(getResources().getDimensionPixelSize(i4));
    }

    public void y2(@u0 int i4) {
        this.f54254h = i4;
        EditText editText = this.f54250f;
        if (editText == null || i4 == -1) {
            return;
        }
        editText.setMinWidth(i4);
    }

    public void z() {
        this.X2.clear();
    }

    @q0
    public ColorStateList z0() {
        return this.f54278t;
    }

    public void z1(@q int i4) {
        w1(getResources().getDimensionPixelSize(i4));
    }

    public void z2(@q int i4) {
        y2(getContext().getResources().getDimensionPixelSize(i4));
    }

    public TextInputLayout(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.Ge);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v84 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextInputLayout(@androidx.annotation.o0 android.content.Context r28, @androidx.annotation.q0 android.util.AttributeSet r29, int r30) {
        /*
            Method dump skipped, instructions count: 1538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
