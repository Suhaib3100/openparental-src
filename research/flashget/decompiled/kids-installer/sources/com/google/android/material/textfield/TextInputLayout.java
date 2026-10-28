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
import androidx.annotation.l;
import androidx.annotation.m1;
import androidx.annotation.n;
import androidx.annotation.o0;
import androidx.annotation.q;
import androidx.annotation.q0;
import androidx.annotation.u0;
import androidx.annotation.v;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.e0;
import androidx.core.graphics.r1;
import androidx.core.view.accessibility.g0;
import androidx.core.view.i0;
import androidx.core.view.y1;
import androidx.core.widget.s;
import androidx.customview.view.AbsSavedState;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.shape.o;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n1.a;

/* loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: b1, reason: collision with root package name */
    private static final int f14387b1 = 167;

    /* renamed from: c1, reason: collision with root package name */
    private static final int f14388c1 = -1;

    /* renamed from: d1, reason: collision with root package name */
    private static final int f14389d1 = -1;

    /* renamed from: f1, reason: collision with root package name */
    public static final int f14391f1 = 0;

    /* renamed from: g1, reason: collision with root package name */
    public static final int f14392g1 = 1;

    /* renamed from: h1, reason: collision with root package name */
    public static final int f14393h1 = 2;

    /* renamed from: i1, reason: collision with root package name */
    public static final int f14394i1 = -1;

    /* renamed from: j1, reason: collision with root package name */
    public static final int f14395j1 = 0;

    /* renamed from: k1, reason: collision with root package name */
    public static final int f14396k1 = 1;

    /* renamed from: l1, reason: collision with root package name */
    public static final int f14397l1 = 2;

    /* renamed from: m1, reason: collision with root package name */
    public static final int f14398m1 = 3;

    @q0
    private TextView A;
    private boolean A0;
    private int B;

    @q0
    private Drawable B0;
    private int C;
    private int C0;
    private CharSequence D;
    private Drawable D0;
    private boolean E;
    private View.OnLongClickListener E0;
    private TextView F;
    private View.OnLongClickListener F0;

    @q0
    private ColorStateList G;

    @o0
    private final CheckableImageButton G0;
    private int H;
    private ColorStateList H0;

    @q0
    private ColorStateList I;
    private ColorStateList I0;

    @q0
    private ColorStateList J;
    private ColorStateList J0;

    @q0
    private CharSequence K;

    @l
    private int K0;

    @o0
    private final TextView L;

    @l
    private int L0;

    @q0
    private CharSequence M;

    @l
    private int M0;

    @o0
    private final TextView N;
    private ColorStateList N0;
    private boolean O;

    @l
    private int O0;
    private CharSequence P;

    @l
    private int P0;
    private boolean Q;

    @l
    private int Q0;

    @q0
    private com.google.android.material.shape.j R;

    @l
    private int R0;

    @q0
    private com.google.android.material.shape.j S;

    @l
    private int S0;

    @o0
    private o T;
    private boolean T0;
    private final int U;
    final com.google.android.material.internal.a U0;
    private int V;
    private boolean V0;
    private int W;
    private boolean W0;
    private ValueAnimator X0;
    private boolean Y0;
    private boolean Z0;

    /* renamed from: a0, reason: collision with root package name */
    private int f14399a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f14400b0;

    /* renamed from: c0, reason: collision with root package name */
    private int f14401c0;

    /* renamed from: d0, reason: collision with root package name */
    private int f14402d0;

    /* renamed from: e0, reason: collision with root package name */
    @l
    private int f14403e0;

    /* renamed from: f0, reason: collision with root package name */
    @l
    private int f14404f0;

    /* renamed from: g0, reason: collision with root package name */
    private final Rect f14405g0;

    /* renamed from: h0, reason: collision with root package name */
    private final Rect f14406h0;

    /* renamed from: i0, reason: collision with root package name */
    private final RectF f14407i0;

    /* renamed from: j0, reason: collision with root package name */
    private Typeface f14408j0;

    /* renamed from: k0, reason: collision with root package name */
    @o0
    private final CheckableImageButton f14409k0;

    /* renamed from: l0, reason: collision with root package name */
    private ColorStateList f14410l0;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f14411m0;

    /* renamed from: n0, reason: collision with root package name */
    private PorterDuff.Mode f14412n0;

    /* renamed from: o, reason: collision with root package name */
    @o0
    private final FrameLayout f14413o;

    /* renamed from: o0, reason: collision with root package name */
    private boolean f14414o0;

    /* renamed from: p, reason: collision with root package name */
    @o0
    private final LinearLayout f14415p;

    /* renamed from: p0, reason: collision with root package name */
    @q0
    private Drawable f14416p0;

    /* renamed from: q, reason: collision with root package name */
    @o0
    private final LinearLayout f14417q;

    /* renamed from: q0, reason: collision with root package name */
    private int f14418q0;

    /* renamed from: r, reason: collision with root package name */
    @o0
    private final FrameLayout f14419r;

    /* renamed from: r0, reason: collision with root package name */
    private View.OnLongClickListener f14420r0;

    /* renamed from: s, reason: collision with root package name */
    EditText f14421s;

    /* renamed from: s0, reason: collision with root package name */
    private final LinkedHashSet<h> f14422s0;

    /* renamed from: t, reason: collision with root package name */
    private CharSequence f14423t;

    /* renamed from: t0, reason: collision with root package name */
    private int f14424t0;

    /* renamed from: u, reason: collision with root package name */
    private int f14425u;

    /* renamed from: u0, reason: collision with root package name */
    private final SparseArray<com.google.android.material.textfield.e> f14426u0;

    /* renamed from: v, reason: collision with root package name */
    private int f14427v;

    /* renamed from: v0, reason: collision with root package name */
    @o0
    private final CheckableImageButton f14428v0;

    /* renamed from: w, reason: collision with root package name */
    private final com.google.android.material.textfield.f f14429w;

    /* renamed from: w0, reason: collision with root package name */
    private final LinkedHashSet<i> f14430w0;

    /* renamed from: x, reason: collision with root package name */
    boolean f14431x;

    /* renamed from: x0, reason: collision with root package name */
    private ColorStateList f14432x0;

    /* renamed from: y, reason: collision with root package name */
    private int f14433y;

    /* renamed from: y0, reason: collision with root package name */
    private boolean f14434y0;

    /* renamed from: z, reason: collision with root package name */
    private boolean f14435z;

    /* renamed from: z0, reason: collision with root package name */
    private PorterDuff.Mode f14436z0;

    /* renamed from: e1, reason: collision with root package name */
    private static final String f14390e1 = ProtectedSandApp.s("ቿ");

    /* renamed from: a1, reason: collision with root package name */
    private static final int f14386a1 = a.n.Ca;

    /* loaded from: classes3.dex */
    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: q, reason: collision with root package name */
        @q0
        CharSequence f14437q;

        /* renamed from: r, reason: collision with root package name */
        boolean f14438r;

        /* renamed from: s, reason: collision with root package name */
        @q0
        CharSequence f14439s;

        /* renamed from: t, reason: collision with root package name */
        @q0
        CharSequence f14440t;

        /* renamed from: u, reason: collision with root package name */
        @q0
        CharSequence f14441u;

        /* loaded from: classes2.dex */
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

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @o0
        public String toString() {
            return ProtectedSandApp.s("✩") + Integer.toHexString(System.identityHashCode(this)) + ProtectedSandApp.s("✪") + ((Object) this.f14437q) + ProtectedSandApp.s("✫") + ((Object) this.f14439s) + ProtectedSandApp.s("✬") + ((Object) this.f14440t) + ProtectedSandApp.s("✭") + ((Object) this.f14441u) + ProtectedSandApp.s("✮");
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@o0 Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            TextUtils.writeToParcel(this.f14437q, parcel, i5);
            parcel.writeInt(this.f14438r ? 1 : 0);
            TextUtils.writeToParcel(this.f14439s, parcel, i5);
            TextUtils.writeToParcel(this.f14440t, parcel, i5);
            TextUtils.writeToParcel(this.f14441u, parcel, i5);
        }

        SavedState(@o0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f14437q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f14438r = parcel.readInt() == 1;
            this.f14439s = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f14440t = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f14441u = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
    }

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@o0 Editable editable) {
            TextInputLayout.this.u3(!r0.Z0);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f14431x) {
                textInputLayout.m3(editable.length());
            }
            if (TextInputLayout.this.E) {
                TextInputLayout.this.y3(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f14428v0.performClick();
            TextInputLayout.this.f14428v0.jumpDrawablesToCurrentState();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f14421s.requestLayout();
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
            TextInputLayout.this.U0.u0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes3.dex */
    public static class e extends androidx.core.view.a {

        /* renamed from: d, reason: collision with root package name */
        private final TextInputLayout f14446d;

        public e(@o0 TextInputLayout textInputLayout) {
            this.f14446d = textInputLayout;
        }

        @Override // androidx.core.view.a
        public void g(@o0 View view, @o0 g0 g0Var) {
            super.g(view, g0Var);
            EditText Z = this.f14446d.Z();
            CharSequence text = Z != null ? Z.getText() : null;
            CharSequence n02 = this.f14446d.n0();
            CharSequence g02 = this.f14446d.g0();
            CharSequence x02 = this.f14446d.x0();
            int U = this.f14446d.U();
            CharSequence V = this.f14446d.V();
            boolean z5 = !TextUtils.isEmpty(text);
            boolean z6 = !TextUtils.isEmpty(n02);
            boolean z7 = !this.f14446d.V0();
            boolean z8 = !TextUtils.isEmpty(g02);
            boolean z9 = z8 || !TextUtils.isEmpty(V);
            String charSequence = z6 ? n02.toString() : "";
            String s5 = ProtectedSandApp.s("✯");
            if (z5) {
                g0Var.L1(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                g0Var.L1(charSequence);
                if (z7 && x02 != null) {
                    g0Var.L1(charSequence + s5 + ((Object) x02));
                }
            } else if (x02 != null) {
                g0Var.L1(x02);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    g0Var.l1(charSequence);
                } else {
                    if (z5) {
                        charSequence = ((Object) text) + s5 + charSequence;
                    }
                    g0Var.L1(charSequence);
                }
                g0Var.H1(!z5);
            }
            if (text == null || text.length() != U) {
                U = -1;
            }
            g0Var.u1(U);
            if (z9) {
                if (!z8) {
                    g02 = V;
                }
                g0Var.h1(g02);
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
        void a(@o0 TextInputLayout textInputLayout, int i5);
    }

    public TextInputLayout(@o0 Context context) {
        this(context, null);
    }

    private void A() {
        if (C()) {
            ((com.google.android.material.textfield.c) this.R).T0();
        }
    }

    private void A3() {
        this.L.setVisibility((this.K == null || V0()) ? 8 : 0);
        q3();
    }

    private void B(boolean z5) {
        ValueAnimator valueAnimator = this.X0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.X0.cancel();
        }
        if (z5 && this.W0) {
            i(1.0f);
        } else {
            this.U0.u0(1.0f);
        }
        this.T0 = false;
        if (C()) {
            d1();
        }
        x3();
        A3();
        D3();
    }

    private void B3(boolean z5, boolean z6) {
        int defaultColor = this.N0.getDefaultColor();
        int colorForState = this.N0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.N0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z5) {
            this.f14403e0 = colorForState2;
        } else if (z6) {
            this.f14403e0 = colorForState;
        } else {
            this.f14403e0 = defaultColor;
        }
    }

    private boolean C() {
        return this.O && !TextUtils.isEmpty(this.P) && (this.R instanceof com.google.android.material.textfield.c);
    }

    private void C3() {
        if (this.f14421s == null) {
            return;
        }
        y1.d2(this.N, getContext().getResources().getDimensionPixelSize(a.f.f29591y2), this.f14421s.getPaddingTop(), (N0() || P0()) ? 0 : y1.j0(this.f14421s), this.f14421s.getPaddingBottom());
    }

    private void D3() {
        int visibility = this.N.getVisibility();
        boolean z5 = (this.M == null || V0()) ? false : true;
        this.N.setVisibility(z5 ? 0 : 8);
        if (visibility != this.N.getVisibility()) {
            b0().c(z5);
        }
        q3();
    }

    private void E() {
        Iterator<h> it = this.f14422s0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private void F(int i5) {
        Iterator<i> it = this.f14430w0.iterator();
        while (it.hasNext()) {
            it.next().a(this, i5);
        }
    }

    private void G(Canvas canvas) {
        com.google.android.material.shape.j jVar = this.S;
        if (jVar != null) {
            Rect bounds = jVar.getBounds();
            bounds.top = bounds.bottom - this.f14400b0;
            this.S.draw(canvas);
        }
    }

    private void H(@o0 Canvas canvas) {
        if (this.O) {
            this.U0.m(canvas);
        }
    }

    private void H1(EditText editText) {
        if (this.f14421s != null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ኀ"));
        }
        if (this.f14424t0 != 3) {
            boolean z5 = editText instanceof TextInputEditText;
        }
        this.f14421s = editText;
        y2(this.f14425u);
        w2(this.f14427v);
        c1();
        c3(new e(this));
        this.U0.H0(this.f14421s.getTypeface());
        this.U0.r0(this.f14421s.getTextSize());
        int gravity = this.f14421s.getGravity();
        this.U0.g0((gravity & (-113)) | 48);
        this.U0.q0(gravity);
        this.f14421s.addTextChangedListener(new a());
        if (this.I0 == null) {
            this.I0 = this.f14421s.getHintTextColors();
        }
        if (this.O) {
            if (TextUtils.isEmpty(this.P)) {
                CharSequence hint = this.f14421s.getHint();
                this.f14423t = hint;
                n2(hint);
                this.f14421s.setHint((CharSequence) null);
            }
            this.Q = true;
        }
        if (this.A != null) {
            m3(this.f14421s.getText().length());
        }
        r3();
        this.f14429w.e();
        this.f14415p.bringToFront();
        this.f14417q.bringToFront();
        this.f14419r.bringToFront();
        this.G0.bringToFront();
        E();
        z3();
        C3();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        v3(false, true);
    }

    private void I(boolean z5) {
        ValueAnimator valueAnimator = this.X0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.X0.cancel();
        }
        if (z5 && this.W0) {
            i(0.0f);
        } else {
            this.U0.u0(0.0f);
        }
        if (C() && ((com.google.android.material.textfield.c) this.R).Q0()) {
            A();
        }
        this.T0 = true;
        K0();
        A3();
        D3();
    }

    private void I1() {
        if (g3()) {
            y1.I1(this.f14421s, this.R);
        }
    }

    private boolean J0() {
        return this.f14424t0 != 0;
    }

    private void K0() {
        TextView textView = this.F;
        if (textView == null || !this.E) {
            return;
        }
        textView.setText((CharSequence) null);
        this.F.setVisibility(4);
    }

    private void K2(boolean z5) {
        if (this.E == z5) {
            return;
        }
        if (z5) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
            this.F = appCompatTextView;
            appCompatTextView.setId(a.h.y5);
            y1.D1(this.F, 1);
            I2(this.H);
            J2(this.G);
            g();
        } else {
            m1();
            this.F = null;
        }
        this.E = z5;
    }

    private boolean P0() {
        return this.G0.getVisibility() == 0;
    }

    private boolean Y0() {
        return this.W == 1 && this.f14421s.getMinLines() <= 1;
    }

    private com.google.android.material.textfield.e b0() {
        com.google.android.material.textfield.e eVar = this.f14426u0.get(this.f14424t0);
        return eVar != null ? eVar : this.f14426u0.get(0);
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
        if (this.W != 0) {
            t3();
        }
    }

    private void d1() {
        if (C()) {
            RectF rectF = this.f14407i0;
            this.U0.p(rectF, this.f14421s.getWidth(), this.f14421s.getGravity());
            l(rectF);
            int i5 = this.f14400b0;
            this.V = i5;
            rectF.top = 0.0f;
            rectF.bottom = i5;
            rectF.offset(-getPaddingLeft(), 0.0f);
            ((com.google.android.material.textfield.c) this.R).W0(rectF);
        }
    }

    @q0
    private CheckableImageButton e0() {
        if (this.G0.getVisibility() == 0) {
            return this.G0;
        }
        if (J0() && N0()) {
            return this.f14428v0;
        }
        return null;
    }

    private void e2(boolean z5) {
        this.G0.setVisibility(z5 ? 0 : 8);
        this.f14419r.setVisibility(z5 ? 8 : 0);
        C3();
        if (J0()) {
            return;
        }
        q3();
    }

    private boolean e3() {
        return (this.G0.getVisibility() == 0 || ((J0() && N0()) || this.M != null)) && this.f14417q.getMeasuredWidth() > 0;
    }

    private static void f1(@o0 ViewGroup viewGroup, boolean z5) {
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = viewGroup.getChildAt(i5);
            childAt.setEnabled(z5);
            if (childAt instanceof ViewGroup) {
                f1((ViewGroup) childAt, z5);
            }
        }
    }

    private boolean f3() {
        return !(E0() == null && this.K == null) && this.f14415p.getMeasuredWidth() > 0;
    }

    private void g() {
        TextView textView = this.F;
        if (textView != null) {
            this.f14413o.addView(textView);
            this.F.setVisibility(0);
        }
    }

    private boolean g3() {
        EditText editText = this.f14421s;
        return (editText == null || this.R == null || editText.getBackground() != null || this.W == 0) ? false : true;
    }

    private void h() {
        if (this.f14421s == null || this.W != 1) {
            return;
        }
        if (com.google.android.material.resources.c.h(getContext())) {
            EditText editText = this.f14421s;
            y1.d2(editText, y1.k0(editText), getResources().getDimensionPixelSize(a.f.f29555s2), y1.j0(this.f14421s), getResources().getDimensionPixelSize(a.f.f29549r2));
        } else if (com.google.android.material.resources.c.g(getContext())) {
            EditText editText2 = this.f14421s;
            y1.d2(editText2, y1.k0(editText2), getResources().getDimensionPixelSize(a.f.f29543q2), y1.j0(this.f14421s), getResources().getDimensionPixelSize(a.f.f29537p2));
        }
    }

    private void h3() {
        TextView textView = this.F;
        if (textView == null || !this.E) {
            return;
        }
        textView.setText(this.D);
        this.F.setVisibility(0);
        this.F.bringToFront();
    }

    private void i1(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(b1(checkableImageButton), colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        androidx.core.graphics.drawable.d.o(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    private void i3(boolean z5) {
        if (!z5 || c0() == null) {
            m();
            return;
        }
        Drawable mutate = c0().mutate();
        androidx.core.graphics.drawable.d.n(mutate, this.f14429w.p());
        this.f14428v0.setImageDrawable(mutate);
    }

    private void j() {
        com.google.android.material.shape.j jVar = this.R;
        if (jVar == null) {
            return;
        }
        jVar.g(this.T);
        if (w()) {
            this.R.E0(this.f14400b0, this.f14403e0);
        }
        int q5 = q();
        this.f14404f0 = q5;
        this.R.p0(ColorStateList.valueOf(q5));
        if (this.f14424t0 == 3) {
            this.f14421s.getBackground().invalidateSelf();
        }
        k();
        invalidate();
    }

    private void j3() {
        if (this.W == 1) {
            if (com.google.android.material.resources.c.h(getContext())) {
                this.f14399a0 = getResources().getDimensionPixelSize(a.f.f29567u2);
            } else if (com.google.android.material.resources.c.g(getContext())) {
                this.f14399a0 = getResources().getDimensionPixelSize(a.f.f29561t2);
            }
        }
    }

    private void k() {
        if (this.S == null) {
            return;
        }
        if (x()) {
            this.S.p0(ColorStateList.valueOf(this.f14403e0));
        }
        invalidate();
    }

    private void k3(@o0 Rect rect) {
        com.google.android.material.shape.j jVar = this.S;
        if (jVar != null) {
            int i5 = rect.bottom;
            jVar.setBounds(rect.left, i5 - this.f14402d0, rect.right, i5);
        }
    }

    private void l(@o0 RectF rectF) {
        float f6 = rectF.left;
        int i5 = this.U;
        rectF.left = f6 - i5;
        rectF.right += i5;
    }

    private void l3() {
        if (this.A != null) {
            EditText editText = this.f14421s;
            m3(editText == null ? 0 : editText.getText().length());
        }
    }

    private void m() {
        n(this.f14428v0, this.f14434y0, this.f14432x0, this.A0, this.f14436z0);
    }

    private void m1() {
        TextView textView = this.F;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void n(@o0 CheckableImageButton checkableImageButton, boolean z5, ColorStateList colorStateList, boolean z6, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z5 || z6)) {
            drawable = drawable.mutate();
            if (z5) {
                androidx.core.graphics.drawable.d.o(drawable, colorStateList);
            }
            if (z6) {
                androidx.core.graphics.drawable.d.p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private static void n3(@o0 Context context, @o0 TextView textView, int i5, int i6, boolean z5) {
        textView.setContentDescription(context.getString(z5 ? a.m.F : a.m.E, Integer.valueOf(i5), Integer.valueOf(i6)));
    }

    private void o() {
        n(this.f14409k0, this.f14411m0, this.f14410l0, this.f14414o0, this.f14412n0);
    }

    private void o3() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.A;
        if (textView != null) {
            b3(textView, this.f14435z ? this.B : this.C);
            if (!this.f14435z && (colorStateList2 = this.I) != null) {
                this.A.setTextColor(colorStateList2);
            }
            if (!this.f14435z || (colorStateList = this.J) == null) {
                return;
            }
            this.A.setTextColor(colorStateList);
        }
    }

    private void p() {
        int i5 = this.W;
        if (i5 == 0) {
            this.R = null;
            this.S = null;
            return;
        }
        if (i5 == 1) {
            this.R = new com.google.android.material.shape.j(this.T);
            this.S = new com.google.android.material.shape.j();
        } else {
            if (i5 != 2) {
                throw new IllegalArgumentException(androidx.constraintlayout.solver.e.a(new StringBuilder(), this.W, ProtectedSandApp.s("ኁ")));
            }
            if (!this.O || (this.R instanceof com.google.android.material.textfield.c)) {
                this.R = new com.google.android.material.shape.j(this.T);
            } else {
                this.R = new com.google.android.material.textfield.c(this.T);
            }
            this.S = null;
        }
    }

    private void p3() {
        if (!C() || this.T0 || this.V == this.f14400b0) {
            return;
        }
        A();
        d1();
    }

    private int q() {
        int i5 = this.f14404f0;
        if (this.W != 1) {
            return i5;
        }
        return r1.t(this.f14404f0, p1.a.e(this, a.c.Q2, 0));
    }

    private void q2(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.P)) {
            return;
        }
        this.P = charSequence;
        this.U0.F0(charSequence);
        if (this.T0) {
            return;
        }
        d1();
    }

    private boolean q3() {
        boolean z5;
        if (this.f14421s == null) {
            return false;
        }
        boolean z6 = true;
        if (f3()) {
            int measuredWidth = this.f14415p.getMeasuredWidth() - this.f14421s.getPaddingLeft();
            if (this.f14416p0 == null || this.f14418q0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f14416p0 = colorDrawable;
                this.f14418q0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] h5 = s.h(this.f14421s);
            Drawable drawable = h5[0];
            Drawable drawable2 = this.f14416p0;
            if (drawable != drawable2) {
                s.w(this.f14421s, drawable2, h5[1], h5[2], h5[3]);
                z5 = true;
            }
            z5 = false;
        } else {
            if (this.f14416p0 != null) {
                Drawable[] h6 = s.h(this.f14421s);
                s.w(this.f14421s, null, h6[1], h6[2], h6[3]);
                this.f14416p0 = null;
                z5 = true;
            }
            z5 = false;
        }
        if (e3()) {
            int measuredWidth2 = this.N.getMeasuredWidth() - this.f14421s.getPaddingRight();
            CheckableImageButton e02 = e0();
            if (e02 != null) {
                measuredWidth2 = i0.c((ViewGroup.MarginLayoutParams) e02.getLayoutParams()) + e02.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] h7 = s.h(this.f14421s);
            Drawable drawable3 = this.B0;
            if (drawable3 == null || this.C0 == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.B0 = colorDrawable2;
                    this.C0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = h7[2];
                Drawable drawable5 = this.B0;
                if (drawable4 != drawable5) {
                    this.D0 = drawable4;
                    s.w(this.f14421s, h7[0], h7[1], drawable5, h7[3]);
                } else {
                    z6 = z5;
                }
            } else {
                this.C0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                s.w(this.f14421s, h7[0], h7[1], this.B0, h7[3]);
            }
        } else {
            if (this.B0 == null) {
                return z5;
            }
            Drawable[] h8 = s.h(this.f14421s);
            if (h8[2] == this.B0) {
                s.w(this.f14421s, h8[0], h8[1], this.D0, h8[3]);
            } else {
                z6 = z5;
            }
            this.B0 = null;
        }
        return z6;
    }

    @o0
    private Rect r(@o0 Rect rect) {
        if (this.f14421s == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f14406h0;
        boolean z5 = y1.Z(this) == 1;
        rect2.bottom = rect.bottom;
        int i5 = this.W;
        if (i5 == 1) {
            rect2.left = r0(rect.left, z5);
            rect2.top = rect.top + this.f14399a0;
            rect2.right = s0(rect.right, z5);
            return rect2;
        }
        if (i5 != 2) {
            rect2.left = r0(rect.left, z5);
            rect2.top = getPaddingTop();
            rect2.right = s0(rect.right, z5);
            return rect2;
        }
        rect2.left = this.f14421s.getPaddingLeft() + rect.left;
        rect2.top = rect.top - v();
        rect2.right = rect.right - this.f14421s.getPaddingRight();
        return rect2;
    }

    private int r0(int i5, boolean z5) {
        int compoundPaddingLeft = this.f14421s.getCompoundPaddingLeft() + i5;
        return (this.K == null || z5) ? compoundPaddingLeft : (compoundPaddingLeft - this.L.getMeasuredWidth()) + this.L.getPaddingLeft();
    }

    private int s(@o0 Rect rect, @o0 Rect rect2, float f6) {
        return Y0() ? (int) (rect2.top + f6) : rect.bottom - this.f14421s.getCompoundPaddingBottom();
    }

    private int s0(int i5, boolean z5) {
        int compoundPaddingRight = i5 - this.f14421s.getCompoundPaddingRight();
        return (this.K == null || !z5) ? compoundPaddingRight : compoundPaddingRight + (this.L.getMeasuredWidth() - this.L.getPaddingRight());
    }

    private boolean s3() {
        int max;
        if (this.f14421s == null || this.f14421s.getMeasuredHeight() >= (max = Math.max(this.f14417q.getMeasuredHeight(), this.f14415p.getMeasuredHeight()))) {
            return false;
        }
        this.f14421s.setMinimumHeight(max);
        return true;
    }

    private int t(@o0 Rect rect, float f6) {
        if (Y0()) {
            return (int) (rect.centerY() - (f6 / 2.0f));
        }
        return this.f14421s.getCompoundPaddingTop() + rect.top;
    }

    private static void t2(@o0 CheckableImageButton checkableImageButton, @q0 View.OnLongClickListener onLongClickListener) {
        boolean K0 = y1.K0(checkableImageButton);
        boolean z5 = onLongClickListener != null;
        boolean z6 = K0 || z5;
        checkableImageButton.setFocusable(z6);
        checkableImageButton.setClickable(K0);
        checkableImageButton.h(K0);
        checkableImageButton.setLongClickable(z5);
        y1.R1(checkableImageButton, z6 ? 1 : 2);
    }

    private void t3() {
        if (this.W != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f14413o.getLayoutParams();
            int v5 = v();
            if (v5 != layoutParams.topMargin) {
                layoutParams.topMargin = v5;
                this.f14413o.requestLayout();
            }
        }
    }

    @o0
    private Rect u(@o0 Rect rect) {
        if (this.f14421s == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f14406h0;
        float D = this.U0.D();
        rect2.left = this.f14421s.getCompoundPaddingLeft() + rect.left;
        rect2.top = t(rect, D);
        rect2.right = rect.right - this.f14421s.getCompoundPaddingRight();
        rect2.bottom = s(rect, rect2, D);
        return rect2;
    }

    private static void u2(@o0 CheckableImageButton checkableImageButton, @q0 View.OnClickListener onClickListener, @q0 View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        t2(checkableImageButton, onLongClickListener);
    }

    private int v() {
        float s5;
        if (!this.O) {
            return 0;
        }
        int i5 = this.W;
        if (i5 == 0 || i5 == 1) {
            s5 = this.U0.s();
        } else {
            if (i5 != 2) {
                return 0;
            }
            s5 = this.U0.s() / 2.0f;
        }
        return (int) s5;
    }

    private static void v2(@o0 CheckableImageButton checkableImageButton, @q0 View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        t2(checkableImageButton, onLongClickListener);
    }

    private void v3(boolean z5, boolean z6) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f14421s;
        boolean z7 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f14421s;
        boolean z8 = editText2 != null && editText2.hasFocus();
        boolean l5 = this.f14429w.l();
        ColorStateList colorStateList2 = this.I0;
        if (colorStateList2 != null) {
            this.U0.f0(colorStateList2);
            this.U0.p0(this.I0);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.I0;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.S0) : this.S0;
            this.U0.f0(ColorStateList.valueOf(colorForState));
            this.U0.p0(ColorStateList.valueOf(colorForState));
        } else if (l5) {
            this.U0.f0(this.f14429w.q());
        } else if (this.f14435z && (textView = this.A) != null) {
            this.U0.f0(textView.getTextColors());
        } else if (z8 && (colorStateList = this.J0) != null) {
            this.U0.f0(colorStateList);
        }
        if (z7 || !this.V0 || (isEnabled() && z8)) {
            if (z6 || this.T0) {
                B(z5);
                return;
            }
            return;
        }
        if (z6 || !this.T0) {
            I(z5);
        }
    }

    private boolean w() {
        return this.W == 2 && x();
    }

    private void w3() {
        EditText editText;
        if (this.F == null || (editText = this.f14421s) == null) {
            return;
        }
        this.F.setGravity(editText.getGravity());
        this.F.setPadding(this.f14421s.getCompoundPaddingLeft(), this.f14421s.getCompoundPaddingTop(), this.f14421s.getCompoundPaddingRight(), this.f14421s.getCompoundPaddingBottom());
    }

    private boolean x() {
        return this.f14400b0 > -1 && this.f14403e0 != 0;
    }

    private void x3() {
        EditText editText = this.f14421s;
        y3(editText == null ? 0 : editText.getText().length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3(int i5) {
        if (i5 != 0 || this.T0) {
            K0();
        } else {
            h3();
        }
    }

    private void z3() {
        if (this.f14421s == null) {
            return;
        }
        y1.d2(this.L, a1() ? 0 : y1.k0(this.f14421s), this.f14421s.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(a.f.f29591y2), this.f14421s.getCompoundPaddingBottom());
    }

    @q0
    public CharSequence A0() {
        return this.K;
    }

    public void A1(boolean z5) {
        if (this.f14431x != z5) {
            if (z5) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
                this.A = appCompatTextView;
                appCompatTextView.setId(a.h.v5);
                Typeface typeface = this.f14408j0;
                if (typeface != null) {
                    this.A.setTypeface(typeface);
                }
                this.A.setMaxLines(1);
                this.f14429w.d(this.A, 2);
                i0.h((ViewGroup.MarginLayoutParams) this.A.getLayoutParams(), getResources().getDimensionPixelOffset(a.f.j6));
                o3();
                l3();
            } else {
                this.f14429w.E(this.A, 2);
                this.A = null;
            }
            this.f14431x = z5;
        }
    }

    @Deprecated
    public void A2(@g1 int i5) {
        B2(i5 != 0 ? getResources().getText(i5) : null);
    }

    @q0
    public ColorStateList B0() {
        return this.L.getTextColors();
    }

    public void B1(int i5) {
        if (this.f14433y != i5) {
            if (i5 > 0) {
                this.f14433y = i5;
            } else {
                this.f14433y = -1;
            }
            if (this.f14431x) {
                l3();
            }
        }
    }

    @Deprecated
    public void B2(@q0 CharSequence charSequence) {
        this.f14428v0.setContentDescription(charSequence);
    }

    @o0
    public TextView C0() {
        return this.L;
    }

    public void C1(int i5) {
        if (this.B != i5) {
            this.B = i5;
            o3();
        }
    }

    @Deprecated
    public void C2(@v int i5) {
        D2(i5 != 0 ? androidx.appcompat.content.res.a.d(getContext(), i5) : null);
    }

    @m1
    boolean D() {
        return C() && ((com.google.android.material.textfield.c) this.R).Q0();
    }

    @q0
    public CharSequence D0() {
        return this.f14409k0.getContentDescription();
    }

    public void D1(@q0 ColorStateList colorStateList) {
        if (this.J != colorStateList) {
            this.J = colorStateList;
            o3();
        }
    }

    @Deprecated
    public void D2(@q0 Drawable drawable) {
        this.f14428v0.setImageDrawable(drawable);
    }

    @q0
    public Drawable E0() {
        return this.f14409k0.getDrawable();
    }

    public void E1(int i5) {
        if (this.C != i5) {
            this.C = i5;
            o3();
        }
    }

    @Deprecated
    public void E2(boolean z5) {
        if (z5 && this.f14424t0 != 1) {
            P1(1);
        } else {
            if (z5) {
                return;
            }
            P1(0);
        }
    }

    void E3() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.R == null || this.W == 0) {
            return;
        }
        boolean z5 = false;
        boolean z6 = isFocused() || ((editText2 = this.f14421s) != null && editText2.hasFocus());
        boolean z7 = isHovered() || ((editText = this.f14421s) != null && editText.isHovered());
        if (!isEnabled()) {
            this.f14403e0 = this.S0;
        } else if (this.f14429w.l()) {
            if (this.N0 != null) {
                B3(z6, z7);
            } else {
                this.f14403e0 = this.f14429w.p();
            }
        } else if (!this.f14435z || (textView = this.A) == null) {
            if (z6) {
                this.f14403e0 = this.M0;
            } else if (z7) {
                this.f14403e0 = this.L0;
            } else {
                this.f14403e0 = this.K0;
            }
        } else if (this.N0 != null) {
            B3(z6, z7);
        } else {
            this.f14403e0 = textView.getCurrentTextColor();
        }
        if (j0() != null && this.f14429w.C() && this.f14429w.l()) {
            z5 = true;
        }
        e2(z5);
        h1();
        j1();
        g1();
        if (b0().d()) {
            i3(this.f14429w.l());
        }
        if (z6 && isEnabled()) {
            this.f14400b0 = this.f14402d0;
        } else {
            this.f14400b0 = this.f14401c0;
        }
        if (this.W == 2) {
            p3();
        }
        if (this.W == 1) {
            if (!isEnabled()) {
                this.f14404f0 = this.P0;
            } else if (z7 && !z6) {
                this.f14404f0 = this.R0;
            } else if (z6) {
                this.f14404f0 = this.Q0;
            } else {
                this.f14404f0 = this.O0;
            }
        }
        j();
    }

    @q0
    public CharSequence F0() {
        return this.M;
    }

    public void F1(@q0 ColorStateList colorStateList) {
        if (this.I != colorStateList) {
            this.I = colorStateList;
            o3();
        }
    }

    @Deprecated
    public void F2(@q0 ColorStateList colorStateList) {
        this.f14432x0 = colorStateList;
        this.f14434y0 = true;
        m();
    }

    @q0
    public ColorStateList G0() {
        return this.N.getTextColors();
    }

    public void G1(@q0 ColorStateList colorStateList) {
        this.I0 = colorStateList;
        this.J0 = colorStateList;
        if (this.f14421s != null) {
            u3(false);
        }
    }

    @Deprecated
    public void G2(@q0 PorterDuff.Mode mode) {
        this.f14436z0 = mode;
        this.A0 = true;
        m();
    }

    @o0
    public TextView H0() {
        return this.N;
    }

    public void H2(@q0 CharSequence charSequence) {
        if (this.E && TextUtils.isEmpty(charSequence)) {
            K2(false);
        } else {
            if (!this.E) {
                K2(true);
            }
            this.D = charSequence;
        }
        x3();
    }

    @q0
    public Typeface I0() {
        return this.f14408j0;
    }

    public void I2(@h1 int i5) {
        this.H = i5;
        TextView textView = this.F;
        if (textView != null) {
            textView.setTextAppearance(i5);
        }
    }

    @o0
    com.google.android.material.shape.j J() {
        int i5 = this.W;
        if (i5 == 1 || i5 == 2) {
            return this.R;
        }
        throw new IllegalStateException();
    }

    public void J1(boolean z5) {
        this.f14428v0.setActivated(z5);
    }

    public void J2(@q0 ColorStateList colorStateList) {
        if (this.G != colorStateList) {
            this.G = colorStateList;
            TextView textView = this.F;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public int K() {
        return this.f14404f0;
    }

    public void K1(boolean z5) {
        this.f14428v0.g(z5);
    }

    public int L() {
        return this.W;
    }

    public boolean L0() {
        return this.f14431x;
    }

    public void L1(@g1 int i5) {
        M1(i5 != 0 ? getResources().getText(i5) : null);
    }

    public void L2(@q0 CharSequence charSequence) {
        this.K = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.L.setText(charSequence);
        A3();
    }

    public float M() {
        return this.R.v();
    }

    public boolean M0() {
        return this.f14428v0.b();
    }

    public void M1(@q0 CharSequence charSequence) {
        if (a0() != charSequence) {
            this.f14428v0.setContentDescription(charSequence);
        }
    }

    public void M2(@h1 int i5) {
        this.L.setTextAppearance(i5);
    }

    public float N() {
        return this.R.w();
    }

    public boolean N0() {
        return this.f14419r.getVisibility() == 0 && this.f14428v0.getVisibility() == 0;
    }

    public void N1(@v int i5) {
        O1(i5 != 0 ? androidx.appcompat.content.res.a.d(getContext(), i5) : null);
    }

    public void N2(@o0 ColorStateList colorStateList) {
        this.L.setTextColor(colorStateList);
    }

    public float O() {
        return this.R.U();
    }

    public boolean O0() {
        return this.f14429w.C();
    }

    public void O1(@q0 Drawable drawable) {
        this.f14428v0.setImageDrawable(drawable);
        g1();
    }

    public void O2(boolean z5) {
        this.f14409k0.g(z5);
    }

    public float P() {
        return this.R.T();
    }

    public void P1(int i5) {
        int i6 = this.f14424t0;
        this.f14424t0 = i5;
        F(i6);
        U1(i5 != 0);
        if (b0().b(this.W)) {
            b0().a();
            m();
        } else {
            throw new IllegalStateException(ProtectedSandApp.s("ኂ") + this.W + ProtectedSandApp.s("ኃ") + i5);
        }
    }

    public void P2(@g1 int i5) {
        Q2(i5 != 0 ? getResources().getText(i5) : null);
    }

    public int Q() {
        return this.M0;
    }

    public boolean Q0() {
        return this.V0;
    }

    public void Q1(@q0 View.OnClickListener onClickListener) {
        u2(this.f14428v0, onClickListener, this.E0);
    }

    public void Q2(@q0 CharSequence charSequence) {
        if (D0() != charSequence) {
            this.f14409k0.setContentDescription(charSequence);
        }
    }

    @q0
    public ColorStateList R() {
        return this.N0;
    }

    @m1
    final boolean R0() {
        return this.f14429w.v();
    }

    public void R1(@q0 View.OnLongClickListener onLongClickListener) {
        this.E0 = onLongClickListener;
        v2(this.f14428v0, onLongClickListener);
    }

    public void R2(@v int i5) {
        S2(i5 != 0 ? androidx.appcompat.content.res.a.d(getContext(), i5) : null);
    }

    public int S() {
        return this.f14401c0;
    }

    public boolean S0() {
        return this.f14429w.D();
    }

    public void S1(@q0 ColorStateList colorStateList) {
        if (this.f14432x0 != colorStateList) {
            this.f14432x0 = colorStateList;
            this.f14434y0 = true;
            m();
        }
    }

    public void S2(@q0 Drawable drawable) {
        this.f14409k0.setImageDrawable(drawable);
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
        return this.f14402d0;
    }

    public boolean T0() {
        return this.W0;
    }

    public void T1(@q0 PorterDuff.Mode mode) {
        if (this.f14436z0 != mode) {
            this.f14436z0 = mode;
            this.A0 = true;
            m();
        }
    }

    public void T2(@q0 View.OnClickListener onClickListener) {
        u2(this.f14409k0, onClickListener, this.f14420r0);
    }

    public int U() {
        return this.f14433y;
    }

    public boolean U0() {
        return this.O;
    }

    public void U1(boolean z5) {
        if (N0() != z5) {
            this.f14428v0.setVisibility(z5 ? 0 : 8);
            C3();
            q3();
        }
    }

    public void U2(@q0 View.OnLongClickListener onLongClickListener) {
        this.f14420r0 = onLongClickListener;
        v2(this.f14409k0, onLongClickListener);
    }

    @q0
    CharSequence V() {
        TextView textView;
        if (this.f14431x && this.f14435z && (textView = this.A) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    @m1
    final boolean V0() {
        return this.T0;
    }

    public void V1(@q0 CharSequence charSequence) {
        if (!this.f14429w.C()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                X1(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f14429w.x();
        } else {
            this.f14429w.R(charSequence);
        }
    }

    public void V2(@q0 ColorStateList colorStateList) {
        if (this.f14410l0 != colorStateList) {
            this.f14410l0 = colorStateList;
            this.f14411m0 = true;
            o();
        }
    }

    @q0
    public ColorStateList W() {
        return this.I;
    }

    @Deprecated
    public boolean W0() {
        return this.f14424t0 == 1;
    }

    public void W1(@q0 CharSequence charSequence) {
        this.f14429w.G(charSequence);
    }

    public void W2(@q0 PorterDuff.Mode mode) {
        if (this.f14412n0 != mode) {
            this.f14412n0 = mode;
            this.f14414o0 = true;
            o();
        }
    }

    @q0
    public ColorStateList X() {
        return this.I;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public boolean X0() {
        return this.Q;
    }

    public void X1(boolean z5) {
        this.f14429w.H(z5);
    }

    public void X2(boolean z5) {
        if (a1() != z5) {
            this.f14409k0.setVisibility(z5 ? 0 : 8);
            z3();
            q3();
        }
    }

    @q0
    public ColorStateList Y() {
        return this.I0;
    }

    public void Y1(@v int i5) {
        Z1(i5 != 0 ? androidx.appcompat.content.res.a.d(getContext(), i5) : null);
        h1();
    }

    public void Y2(@q0 CharSequence charSequence) {
        this.M = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.N.setText(charSequence);
        D3();
    }

    @q0
    public EditText Z() {
        return this.f14421s;
    }

    public boolean Z0() {
        return this.f14409k0.b();
    }

    public void Z1(@q0 Drawable drawable) {
        this.G0.setImageDrawable(drawable);
        e2(drawable != null && this.f14429w.C());
    }

    public void Z2(@h1 int i5) {
        this.N.setTextAppearance(i5);
    }

    @q0
    public CharSequence a0() {
        return this.f14428v0.getContentDescription();
    }

    public boolean a1() {
        return this.f14409k0.getVisibility() == 0;
    }

    public void a2(@q0 View.OnClickListener onClickListener) {
        u2(this.G0, onClickListener, this.F0);
    }

    public void a3(@o0 ColorStateList colorStateList) {
        this.N.setTextColor(colorStateList);
    }

    @Override // android.view.ViewGroup
    public void addView(@o0 View view, int i5, @o0 ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i5, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f14413o.addView(view, layoutParams2);
        this.f14413o.setLayoutParams(layoutParams);
        t3();
        H1((EditText) view);
    }

    public void b2(@q0 View.OnLongClickListener onLongClickListener) {
        this.F0 = onLongClickListener;
        v2(this.G0, onLongClickListener);
    }

    void b3(@o0 TextView textView, @h1 int i5) {
        boolean z5 = true;
        try {
            textView.setTextAppearance(i5);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z5 = false;
            }
        } catch (Exception unused) {
        }
        if (z5) {
            textView.setTextAppearance(a.n.X4);
            textView.setTextColor(androidx.core.content.d.f(getContext(), a.e.f29423w0));
        }
    }

    @q0
    public Drawable c0() {
        return this.f14428v0.getDrawable();
    }

    public void c2(@q0 ColorStateList colorStateList) {
        this.H0 = colorStateList;
        Drawable drawable = this.G0.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            androidx.core.graphics.drawable.d.o(drawable, colorStateList);
        }
        if (this.G0.getDrawable() != drawable) {
            this.G0.setImageDrawable(drawable);
        }
    }

    public void c3(@q0 e eVar) {
        EditText editText = this.f14421s;
        if (editText != null) {
            y1.B1(editText, eVar);
        }
    }

    public int d0() {
        return this.f14424t0;
    }

    public void d2(@q0 PorterDuff.Mode mode) {
        Drawable drawable = this.G0.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            androidx.core.graphics.drawable.d.p(drawable, mode);
        }
        if (this.G0.getDrawable() != drawable) {
            this.G0.setImageDrawable(drawable);
        }
    }

    public void d3(@q0 Typeface typeface) {
        if (typeface != this.f14408j0) {
            this.f14408j0 = typeface;
            this.U0.H0(typeface);
            this.f14429w.O(typeface);
            TextView textView = this.A;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(@o0 ViewStructure viewStructure, int i5) {
        EditText editText = this.f14421s;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i5);
            return;
        }
        if (this.f14423t != null) {
            boolean z5 = this.Q;
            this.Q = false;
            CharSequence hint = editText.getHint();
            this.f14421s.setHint(this.f14423t);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i5);
                return;
            } finally {
                this.f14421s.setHint(hint);
                this.Q = z5;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i5);
        onProvideAutofillVirtualStructure(viewStructure, i5);
        viewStructure.setChildCount(this.f14413o.getChildCount());
        for (int i6 = 0; i6 < this.f14413o.getChildCount(); i6++) {
            View childAt = this.f14413o.getChildAt(i6);
            ViewStructure newChild = viewStructure.newChild(i6);
            childAt.dispatchProvideAutofillStructure(newChild, i5);
            if (childAt == this.f14421s) {
                newChild.setHint(n0());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(@o0 SparseArray<Parcelable> sparseArray) {
        this.Z0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.Z0 = false;
    }

    @Override // android.view.View
    public void draw(@o0 Canvas canvas) {
        super.draw(canvas);
        H(canvas);
        G(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.Y0) {
            return;
        }
        this.Y0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.a aVar = this.U0;
        boolean E0 = aVar != null ? aVar.E0(drawableState) | false : false;
        if (this.f14421s != null) {
            u3(y1.U0(this) && isEnabled());
        }
        r3();
        E3();
        if (E0) {
            invalidate();
        }
        this.Y0 = false;
    }

    public void e(@o0 h hVar) {
        this.f14422s0.add(hVar);
        if (this.f14421s != null) {
            hVar.a(this);
        }
    }

    @Deprecated
    public void e1(boolean z5) {
        if (this.f14424t0 == 1) {
            this.f14428v0.performClick();
            if (z5) {
                this.f14428v0.jumpDrawablesToCurrentState();
            }
        }
    }

    public void f(@o0 i iVar) {
        this.f14430w0.add(iVar);
    }

    @o0
    CheckableImageButton f0() {
        return this.f14428v0;
    }

    public void f2(@h1 int i5) {
        this.f14429w.I(i5);
    }

    @q0
    public CharSequence g0() {
        if (this.f14429w.C()) {
            return this.f14429w.o();
        }
        return null;
    }

    public void g1() {
        i1(this.f14428v0, this.f14432x0);
    }

    public void g2(@q0 ColorStateList colorStateList) {
        this.f14429w.J(colorStateList);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f14421s;
        if (editText == null) {
            return super.getBaseline();
        }
        return getPaddingTop() + editText.getBaseline() + v();
    }

    @q0
    public CharSequence h0() {
        return this.f14429w.n();
    }

    public void h1() {
        i1(this.G0, this.H0);
    }

    public void h2(boolean z5) {
        if (this.V0 != z5) {
            this.V0 = z5;
            u3(false);
        }
    }

    @m1
    void i(float f6) {
        if (this.U0.G() == f6) {
            return;
        }
        if (this.X0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.X0 = valueAnimator;
            valueAnimator.setInterpolator(com.google.android.material.animation.a.f12779b);
            this.X0.setDuration(167L);
            this.X0.addUpdateListener(new d());
        }
        this.X0.setFloatValues(this.U0.G(), f6);
        this.X0.start();
    }

    @l
    public int i0() {
        return this.f14429w.p();
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
            this.f14429w.S(charSequence);
        }
    }

    @q0
    public Drawable j0() {
        return this.G0.getDrawable();
    }

    public void j1() {
        i1(this.f14409k0, this.f14410l0);
    }

    public void j2(@q0 ColorStateList colorStateList) {
        this.f14429w.M(colorStateList);
    }

    @m1
    final int k0() {
        return this.f14429w.p();
    }

    public void k1(@o0 h hVar) {
        this.f14422s0.remove(hVar);
    }

    public void k2(boolean z5) {
        this.f14429w.L(z5);
    }

    @q0
    public CharSequence l0() {
        if (this.f14429w.D()) {
            return this.f14429w.r();
        }
        return null;
    }

    public void l1(@o0 i iVar) {
        this.f14430w0.remove(iVar);
    }

    public void l2(@h1 int i5) {
        this.f14429w.K(i5);
    }

    @l
    public int m0() {
        return this.f14429w.t();
    }

    public void m2(@g1 int i5) {
        n2(i5 != 0 ? getResources().getText(i5) : null);
    }

    void m3(int i5) {
        boolean z5 = this.f14435z;
        int i6 = this.f14433y;
        if (i6 == -1) {
            this.A.setText(String.valueOf(i5));
            this.A.setContentDescription(null);
            this.f14435z = false;
        } else {
            this.f14435z = i5 > i6;
            n3(getContext(), this.A, i5, this.f14433y, this.f14435z);
            if (z5 != this.f14435z) {
                o3();
            }
            this.A.setText(androidx.core.text.a.c().q(getContext().getString(a.m.G, Integer.valueOf(i5), Integer.valueOf(this.f14433y))));
        }
        if (this.f14421s == null || z5 == this.f14435z) {
            return;
        }
        u3(false);
        E3();
        r3();
    }

    @q0
    public CharSequence n0() {
        if (this.O) {
            return this.P;
        }
        return null;
    }

    public void n1(@l int i5) {
        if (this.f14404f0 != i5) {
            this.f14404f0 = i5;
            this.O0 = i5;
            this.Q0 = i5;
            this.R0 = i5;
            j();
        }
    }

    public void n2(@q0 CharSequence charSequence) {
        if (this.O) {
            q2(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    @m1
    final float o0() {
        return this.U0.s();
    }

    public void o1(@n int i5) {
        n1(androidx.core.content.d.f(getContext(), i5));
    }

    public void o2(boolean z5) {
        this.W0 = z5;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        super.onLayout(z5, i5, i6, i7, i8);
        EditText editText = this.f14421s;
        if (editText != null) {
            Rect rect = this.f14405g0;
            com.google.android.material.internal.c.a(this, editText, rect);
            k3(rect);
            if (this.O) {
                this.U0.r0(this.f14421s.getTextSize());
                int gravity = this.f14421s.getGravity();
                this.U0.g0((gravity & (-113)) | 48);
                this.U0.q0(gravity);
                this.U0.c0(r(rect));
                this.U0.m0(u(rect));
                this.U0.Z(false);
                if (!C() || this.T0) {
                    return;
                }
                d1();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        boolean s32 = s3();
        boolean q32 = q3();
        if (s32 || q32) {
            this.f14421s.post(new c());
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
        V1(savedState.f14437q);
        if (savedState.f14438r) {
            this.f14428v0.post(new b());
        }
        n2(savedState.f14439s);
        i2(savedState.f14440t);
        H2(savedState.f14441u);
        requestLayout();
    }

    @Override // android.view.View
    @q0
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f14429w.l()) {
            savedState.f14437q = g0();
        }
        savedState.f14438r = J0() && this.f14428v0.isChecked();
        savedState.f14439s = n0();
        savedState.f14440t = l0();
        savedState.f14441u = x0();
        return savedState;
    }

    @m1
    final int p0() {
        return this.U0.x();
    }

    public void p1(@o0 ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.O0 = defaultColor;
        this.f14404f0 = defaultColor;
        this.P0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.Q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.R0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        j();
    }

    public void p2(boolean z5) {
        if (z5 != this.O) {
            this.O = z5;
            if (z5) {
                CharSequence hint = this.f14421s.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.P)) {
                        n2(hint);
                    }
                    this.f14421s.setHint((CharSequence) null);
                }
                this.Q = true;
            } else {
                this.Q = false;
                if (!TextUtils.isEmpty(this.P) && TextUtils.isEmpty(this.f14421s.getHint())) {
                    this.f14421s.setHint(this.P);
                }
                q2(null);
            }
            if (this.f14421s != null) {
                t3();
            }
        }
    }

    @q0
    public ColorStateList q0() {
        return this.J0;
    }

    public void q1(int i5) {
        if (i5 == this.W) {
            return;
        }
        this.W = i5;
        if (this.f14421s != null) {
            c1();
        }
    }

    public void r1(float f6, float f7, float f8, float f9) {
        com.google.android.material.shape.j jVar = this.R;
        if (jVar != null && jVar.T() == f6 && this.R.U() == f7 && this.R.w() == f9 && this.R.v() == f8) {
            return;
        }
        this.T = this.T.v().K(f6).P(f7).C(f9).x(f8).m();
        j();
    }

    public void r2(@h1 int i5) {
        this.U0.d0(i5);
        this.J0 = this.U0.q();
        if (this.f14421s != null) {
            u3(false);
            t3();
        }
    }

    void r3() {
        Drawable background;
        TextView textView;
        EditText editText = this.f14421s;
        if (editText == null || this.W != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (e0.a(background)) {
            background = background.mutate();
        }
        if (this.f14429w.l()) {
            background.setColorFilter(androidx.appcompat.widget.f.e(this.f14429w.p(), PorterDuff.Mode.SRC_IN));
        } else if (this.f14435z && (textView = this.A) != null) {
            background.setColorFilter(androidx.appcompat.widget.f.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            background.clearColorFilter();
            this.f14421s.refreshDrawableState();
        }
    }

    public void s1(@q int i5, @q int i6, @q int i7, @q int i8) {
        r1(getContext().getResources().getDimension(i5), getContext().getResources().getDimension(i6), getContext().getResources().getDimension(i8), getContext().getResources().getDimension(i7));
    }

    public void s2(@q0 ColorStateList colorStateList) {
        if (this.J0 != colorStateList) {
            if (this.I0 == null) {
                this.U0.f0(colorStateList);
            }
            this.J0 = colorStateList;
            if (this.f14421s != null) {
                u3(false);
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z5) {
        f1(this, z5);
        super.setEnabled(z5);
    }

    @u0
    public int t0() {
        return this.f14427v;
    }

    public void t1(@l int i5) {
        if (this.M0 != i5) {
            this.M0 = i5;
            E3();
        }
    }

    @u0
    public int u0() {
        return this.f14425u;
    }

    public void u1(@o0 ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.K0 = colorStateList.getDefaultColor();
            this.S0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.L0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.M0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.M0 != colorStateList.getDefaultColor()) {
            this.M0 = colorStateList.getDefaultColor();
        }
        E3();
    }

    void u3(boolean z5) {
        v3(z5, false);
    }

    @q0
    @Deprecated
    public CharSequence v0() {
        return this.f14428v0.getContentDescription();
    }

    public void v1(@q0 ColorStateList colorStateList) {
        if (this.N0 != colorStateList) {
            this.N0 = colorStateList;
            E3();
        }
    }

    @q0
    @Deprecated
    public Drawable w0() {
        return this.f14428v0.getDrawable();
    }

    public void w1(int i5) {
        this.f14401c0 = i5;
        E3();
    }

    public void w2(@u0 int i5) {
        this.f14427v = i5;
        EditText editText = this.f14421s;
        if (editText == null || i5 == -1) {
            return;
        }
        editText.setMaxWidth(i5);
    }

    @q0
    public CharSequence x0() {
        if (this.E) {
            return this.D;
        }
        return null;
    }

    public void x1(int i5) {
        this.f14402d0 = i5;
        E3();
    }

    public void x2(@q int i5) {
        w2(getContext().getResources().getDimensionPixelSize(i5));
    }

    public void y() {
        this.f14422s0.clear();
    }

    @h1
    public int y0() {
        return this.H;
    }

    public void y1(@q int i5) {
        x1(getResources().getDimensionPixelSize(i5));
    }

    public void y2(@u0 int i5) {
        this.f14425u = i5;
        EditText editText = this.f14421s;
        if (editText == null || i5 == -1) {
            return;
        }
        editText.setMinWidth(i5);
    }

    public void z() {
        this.f14430w0.clear();
    }

    @q0
    public ColorStateList z0() {
        return this.G;
    }

    public void z1(@q int i5) {
        w1(getResources().getDimensionPixelSize(i5));
    }

    public void z2(@q int i5) {
        y2(getContext().getResources().getDimensionPixelSize(i5));
    }

    public TextInputLayout(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.He);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x05bf  */
    /* JADX WARN: Type inference failed for: r2v150 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextInputLayout(@androidx.annotation.o0 android.content.Context r27, @androidx.annotation.q0 android.util.AttributeSet r28, int r29) {
        /*
            Method dump skipped, instructions count: 1572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
