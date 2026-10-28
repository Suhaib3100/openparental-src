package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.view.y1;
import d.a;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: e0, reason: collision with root package name */
    private static final int f1029e0 = 250;

    /* renamed from: f0, reason: collision with root package name */
    private static final int f1030f0 = 0;

    /* renamed from: g0, reason: collision with root package name */
    private static final int f1031g0 = 1;

    /* renamed from: h0, reason: collision with root package name */
    private static final int f1032h0 = 2;

    /* renamed from: j0, reason: collision with root package name */
    private static final int f1034j0 = 1;

    /* renamed from: k0, reason: collision with root package name */
    private static final int f1035k0 = 2;

    /* renamed from: l0, reason: collision with root package name */
    private static final int f1036l0 = 3;
    private int A;
    private boolean B;
    private CharSequence C;
    private CharSequence D;
    private boolean E;
    private int F;
    private int G;
    private float H;
    private float I;
    private VelocityTracker J;
    private int K;
    float L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private final TextPaint T;
    private ColorStateList U;
    private Layout V;
    private Layout W;

    /* renamed from: a0, reason: collision with root package name */
    private TransformationMethod f1039a0;

    /* renamed from: b0, reason: collision with root package name */
    ObjectAnimator f1040b0;

    /* renamed from: c0, reason: collision with root package name */
    private final t f1041c0;

    /* renamed from: d0, reason: collision with root package name */
    private final Rect f1042d0;

    /* renamed from: o, reason: collision with root package name */
    private Drawable f1043o;

    /* renamed from: p, reason: collision with root package name */
    private ColorStateList f1044p;

    /* renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f1045q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f1046r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f1047s;

    /* renamed from: t, reason: collision with root package name */
    private Drawable f1048t;

    /* renamed from: u, reason: collision with root package name */
    private ColorStateList f1049u;

    /* renamed from: v, reason: collision with root package name */
    private PorterDuff.Mode f1050v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f1051w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f1052x;

    /* renamed from: y, reason: collision with root package name */
    private int f1053y;

    /* renamed from: z, reason: collision with root package name */
    private int f1054z;

    /* renamed from: i0, reason: collision with root package name */
    private static final String f1033i0 = "android.widget.Switch";

    /* renamed from: m0, reason: collision with root package name */
    private static final Property<SwitchCompat, Float> f1037m0 = new a(Float.class, "thumbPos");

    /* renamed from: n0, reason: collision with root package name */
    private static final int[] f1038n0 = {R.attr.state_checked};

    class a extends Property<SwitchCompat, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.L);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f6) {
            switchCompat.L(f6.floatValue());
        }
    }

    public SwitchCompat(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    private void H(int i5, int i6) {
        G(i5 != 1 ? i5 != 2 ? i5 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i6);
    }

    private void U(MotionEvent motionEvent) {
        this.F = 0;
        boolean z5 = true;
        boolean z6 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z6) {
            this.J.computeCurrentVelocity(1000);
            float xVelocity = this.J.getXVelocity();
            if (Math.abs(xVelocity) <= this.K) {
                z5 = k();
            } else if (!g1.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z5 = false;
            }
        } else {
            z5 = isChecked;
        }
        if (z5 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z5);
        e(motionEvent);
    }

    private void a(boolean z5) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f1037m0, z5 ? 1.0f : 0.0f);
        this.f1040b0 = ofFloat;
        ofFloat.setDuration(250L);
        this.f1040b0.setAutoCancel(true);
        this.f1040b0.start();
    }

    private void b() {
        Drawable drawable = this.f1043o;
        if (drawable != null) {
            if (this.f1046r || this.f1047s) {
                Drawable mutate = drawable.mutate();
                this.f1043o = mutate;
                if (this.f1046r) {
                    androidx.core.graphics.drawable.d.o(mutate, this.f1044p);
                }
                if (this.f1047s) {
                    androidx.core.graphics.drawable.d.p(this.f1043o, this.f1045q);
                }
                if (this.f1043o.isStateful()) {
                    this.f1043o.setState(getDrawableState());
                }
            }
        }
    }

    private void c() {
        Drawable drawable = this.f1048t;
        if (drawable != null) {
            if (this.f1051w || this.f1052x) {
                Drawable mutate = drawable.mutate();
                this.f1048t = mutate;
                if (this.f1051w) {
                    androidx.core.graphics.drawable.d.o(mutate, this.f1049u);
                }
                if (this.f1052x) {
                    androidx.core.graphics.drawable.d.p(this.f1048t, this.f1050v);
                }
                if (this.f1048t.isStateful()) {
                    this.f1048t.setState(getDrawableState());
                }
            }
        }
    }

    private void d() {
        ObjectAnimator objectAnimator = this.f1040b0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    private static float f(float f6, float f7, float f8) {
        return f6 < f7 ? f7 : f6 > f8 ? f8 : f6;
    }

    private boolean k() {
        return this.L > 0.5f;
    }

    private int o() {
        return (int) (((g1.b(this) ? 1.0f - this.L : this.L) * p()) + 0.5f);
    }

    private int p() {
        Drawable drawable = this.f1048t;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f1042d0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f1043o;
        Rect d6 = drawable2 != null ? e0.d(drawable2) : e0.f1194d;
        return ((((this.M - this.O) - rect.left) - rect.right) - d6.left) - d6.right;
    }

    private boolean w(float f6, float f7) {
        if (this.f1043o == null) {
            return false;
        }
        int o5 = o();
        this.f1043o.getPadding(this.f1042d0);
        int i5 = this.Q;
        int i6 = this.G;
        int i7 = i5 - i6;
        int i8 = (this.P + o5) - i6;
        int i9 = this.O + i8;
        Rect rect = this.f1042d0;
        return f6 > ((float) i8) && f6 < ((float) (((i9 + rect.left) + rect.right) + i6)) && f7 > ((float) i7) && f7 < ((float) (this.S + i6));
    }

    private Layout x(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.f1039a0;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        return new StaticLayout(charSequence2, this.T, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void y() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.D;
            if (charSequence == null) {
                charSequence = getResources().getString(a.l.f21976g);
            }
            y1.q2(this, charSequence);
        }
    }

    private void z() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.C;
            if (charSequence == null) {
                charSequence = getResources().getString(a.l.f21977h);
            }
            y1.q2(this, charSequence);
        }
    }

    public void A(boolean z5) {
        if (this.E != z5) {
            this.E = z5;
            requestLayout();
        }
    }

    public void B(boolean z5) {
        this.B = z5;
        invalidate();
    }

    public void C(int i5) {
        this.f1054z = i5;
        requestLayout();
    }

    public void D(int i5) {
        this.A = i5;
        requestLayout();
    }

    public void E(Context context, int i5) {
        z0 E = z0.E(context, i5, a.n.b7);
        ColorStateList d6 = E.d(a.n.f7);
        if (d6 != null) {
            this.U = d6;
        } else {
            this.U = getTextColors();
        }
        int g5 = E.g(a.n.c7, 0);
        if (g5 != 0) {
            float f6 = g5;
            if (f6 != this.T.getTextSize()) {
                this.T.setTextSize(f6);
                requestLayout();
            }
        }
        H(E.o(a.n.d7, -1), E.o(a.n.e7, -1));
        if (E.a(a.n.q7, false)) {
            this.f1039a0 = new f.a(getContext());
        } else {
            this.f1039a0 = null;
        }
        E.I();
    }

    public void F(Typeface typeface) {
        if ((this.T.getTypeface() == null || this.T.getTypeface().equals(typeface)) && (this.T.getTypeface() != null || typeface == null)) {
            return;
        }
        this.T.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void G(Typeface typeface, int i5) {
        if (i5 <= 0) {
            this.T.setFakeBoldText(false);
            this.T.setTextSkewX(0.0f);
            F(typeface);
        } else {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i5) : Typeface.create(typeface, i5);
            F(defaultFromStyle);
            int i6 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i5;
            this.T.setFakeBoldText((i6 & 1) != 0);
            this.T.setTextSkewX((i6 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public void I(CharSequence charSequence) {
        this.D = charSequence;
        requestLayout();
        if (isChecked()) {
            return;
        }
        y();
    }

    public void J(CharSequence charSequence) {
        this.C = charSequence;
        requestLayout();
        if (isChecked()) {
            z();
        }
    }

    public void K(Drawable drawable) {
        Drawable drawable2 = this.f1043o;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1043o = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void L(float f6) {
        this.L = f6;
        invalidate();
    }

    public void M(int i5) {
        K(androidx.appcompat.content.res.a.d(getContext(), i5));
    }

    public void N(int i5) {
        this.f1053y = i5;
        requestLayout();
    }

    public void O(@androidx.annotation.q0 ColorStateList colorStateList) {
        this.f1044p = colorStateList;
        this.f1046r = true;
        b();
    }

    public void P(@androidx.annotation.q0 PorterDuff.Mode mode) {
        this.f1045q = mode;
        this.f1047s = true;
        b();
    }

    public void Q(Drawable drawable) {
        Drawable drawable2 = this.f1048t;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1048t = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void R(int i5) {
        Q(androidx.appcompat.content.res.a.d(getContext(), i5));
    }

    public void S(@androidx.annotation.q0 ColorStateList colorStateList) {
        this.f1049u = colorStateList;
        this.f1051w = true;
        c();
    }

    public void T(@androidx.annotation.q0 PorterDuff.Mode mode) {
        this.f1050v = mode;
        this.f1052x = true;
        c();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i5;
        int i6;
        Rect rect = this.f1042d0;
        int i7 = this.P;
        int i8 = this.Q;
        int i9 = this.R;
        int i10 = this.S;
        int o5 = o() + i7;
        Drawable drawable = this.f1043o;
        Rect d6 = drawable != null ? e0.d(drawable) : e0.f1194d;
        Drawable drawable2 = this.f1048t;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i11 = rect.left;
            o5 += i11;
            if (d6 != null) {
                int i12 = d6.left;
                if (i12 > i11) {
                    i7 += i12 - i11;
                }
                int i13 = d6.top;
                int i14 = rect.top;
                i5 = i13 > i14 ? (i13 - i14) + i8 : i8;
                int i15 = d6.right;
                int i16 = rect.right;
                if (i15 > i16) {
                    i9 -= i15 - i16;
                }
                int i17 = d6.bottom;
                int i18 = rect.bottom;
                if (i17 > i18) {
                    i6 = i10 - (i17 - i18);
                    this.f1048t.setBounds(i7, i5, i9, i6);
                }
            } else {
                i5 = i8;
            }
            i6 = i10;
            this.f1048t.setBounds(i7, i5, i9, i6);
        }
        Drawable drawable3 = this.f1043o;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i19 = o5 - rect.left;
            int i20 = o5 + this.O + rect.right;
            this.f1043o.setBounds(i19, i8, i20, i10);
            Drawable background = getBackground();
            if (background != null) {
                androidx.core.graphics.drawable.d.l(background, i19, i8, i20, i10);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f6, float f7) {
        super.drawableHotspotChanged(f6, f7);
        Drawable drawable = this.f1043o;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.k(drawable, f6, f7);
        }
        Drawable drawable2 = this.f1048t;
        if (drawable2 != null) {
            androidx.core.graphics.drawable.d.k(drawable2, f6, f7);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1043o;
        boolean z5 = false;
        if (drawable != null && drawable.isStateful()) {
            z5 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1048t;
        if (drawable2 != null && drawable2.isStateful()) {
            z5 |= drawable2.setState(drawableState);
        }
        if (z5) {
            invalidate();
        }
    }

    public boolean g() {
        return this.E;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!g1.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.M;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.A : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (g1.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.M;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.A : compoundPaddingRight;
    }

    public boolean h() {
        return this.B;
    }

    public int i() {
        return this.f1054z;
    }

    public int j() {
        return this.A;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1043o;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1048t;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1040b0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f1040b0.end();
        this.f1040b0 = null;
    }

    public CharSequence l() {
        return this.D;
    }

    public CharSequence m() {
        return this.C;
    }

    public Drawable n() {
        return this.f1043o;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i5) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i5 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1038n0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f1042d0;
        Drawable drawable = this.f1048t;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i5 = this.Q;
        int i6 = this.S;
        int i7 = i5 + rect.top;
        int i8 = i6 - rect.bottom;
        Drawable drawable2 = this.f1043o;
        if (drawable != null) {
            if (!this.B || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d6 = e0.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d6.left;
                rect.right -= d6.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = k() ? this.V : this.W;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.U;
            if (colorStateList != null) {
                this.T.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.T.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i7 + i8) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.C : this.D;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        int i9;
        int width;
        int i10;
        int i11;
        int i12;
        super.onLayout(z5, i5, i6, i7, i8);
        int i13 = 0;
        if (this.f1043o != null) {
            Rect rect = this.f1042d0;
            Drawable drawable = this.f1048t;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d6 = e0.d(this.f1043o);
            i9 = Math.max(0, d6.left - rect.left);
            i13 = Math.max(0, d6.right - rect.right);
        } else {
            i9 = 0;
        }
        if (g1.b(this)) {
            i10 = getPaddingLeft() + i9;
            width = ((this.M + i10) - i9) - i13;
        } else {
            width = (getWidth() - getPaddingRight()) - i13;
            i10 = (width - this.M) + i9 + i13;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i14 = this.N;
            int i15 = height - (i14 / 2);
            i11 = i14 + i15;
            i12 = i15;
        } else if (gravity != 80) {
            i12 = getPaddingTop();
            i11 = this.N + i12;
        } else {
            i11 = getHeight() - getPaddingBottom();
            i12 = i11 - this.N;
        }
        this.P = i10;
        this.Q = i12;
        this.S = i11;
        this.R = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i5, int i6) {
        int i7;
        int i8;
        int i9;
        if (this.E) {
            if (this.V == null) {
                this.V = x(this.C);
            }
            if (this.W == null) {
                this.W = x(this.D);
            }
        }
        Rect rect = this.f1042d0;
        Drawable drawable = this.f1043o;
        int i10 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i7 = (this.f1043o.getIntrinsicWidth() - rect.left) - rect.right;
            i8 = this.f1043o.getIntrinsicHeight();
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (this.E) {
            i9 = (this.f1053y * 2) + Math.max(this.V.getWidth(), this.W.getWidth());
        } else {
            i9 = 0;
        }
        this.O = Math.max(i9, i7);
        Drawable drawable2 = this.f1048t;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i10 = this.f1048t.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i11 = rect.left;
        int i12 = rect.right;
        Drawable drawable3 = this.f1043o;
        if (drawable3 != null) {
            Rect d6 = e0.d(drawable3);
            i11 = Math.max(i11, d6.left);
            i12 = Math.max(i12, d6.right);
        }
        int max = Math.max(this.f1054z, (this.O * 2) + i11 + i12);
        int max2 = Math.max(i10, i8);
        this.M = max;
        this.N = max2;
        super.onMeasure(i5, i6);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.C : this.D;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r0 != 3) goto L44;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.J
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9d
            r2 = 2
            if (r0 == r1) goto L89
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L89
            goto Lb7
        L16:
            int r0 = r6.F
            if (r0 == r1) goto L55
            if (r0 == r2) goto L1e
            goto Lb7
        L1e:
            float r7 = r7.getX()
            int r0 = r6.p()
            float r2 = r6.H
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3b
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L38
            r2 = r3
            goto L3b
        L38:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L3b:
            boolean r0 = androidx.appcompat.widget.g1.b(r6)
            if (r0 == 0) goto L42
            float r2 = -r2
        L42:
            float r0 = r6.L
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.L
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L54
            r6.H = r7
            r6.L(r0)
        L54:
            return r1
        L55:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.H
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.G
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7b
            float r4 = r6.I
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.G
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb7
        L7b:
            r6.F = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.H = r0
            r6.I = r3
            return r1
        L89:
            int r0 = r6.F
            if (r0 != r2) goto L94
            r6.U(r7)
            super.onTouchEvent(r7)
            return r1
        L94:
            r0 = 0
            r6.F = r0
            android.view.VelocityTracker r0 = r6.J
            r0.clear()
            goto Lb7
        L9d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb7
            boolean r3 = r6.w(r0, r2)
            if (r3 == 0) goto Lb7
            r6.F = r1
            r6.H = r0
            r6.I = r2
        Lb7:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public int q() {
        return this.f1053y;
    }

    @androidx.annotation.q0
    public ColorStateList r() {
        return this.f1044p;
    }

    @androidx.annotation.q0
    public PorterDuff.Mode s() {
        return this.f1045q;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z5) {
        super.setChecked(z5);
        boolean isChecked = isChecked();
        if (isChecked) {
            z();
        } else {
            y();
        }
        if (getWindowToken() != null && y1.U0(this)) {
            a(isChecked);
        } else {
            d();
            L(isChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.s.H(this, callback));
    }

    public Drawable t() {
        return this.f1048t;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @androidx.annotation.q0
    public ColorStateList u() {
        return this.f1049u;
    }

    @androidx.annotation.q0
    public PorterDuff.Mode v() {
        return this.f1050v;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1043o || drawable == this.f1048t;
    }

    public SwitchCompat(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.f21641s3);
    }

    public SwitchCompat(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f1044p = null;
        this.f1045q = null;
        this.f1046r = false;
        this.f1047s = false;
        this.f1049u = null;
        this.f1050v = null;
        this.f1051w = false;
        this.f1052x = false;
        this.J = VelocityTracker.obtain();
        this.f1042d0 = new Rect();
        u0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.T = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = a.n.M6;
        z0 G = z0.G(context, attributeSet, iArr, i5, 0);
        y1.z1(this, context, iArr, attributeSet, G.B(), i5, 0);
        Drawable h5 = G.h(a.n.P6);
        this.f1043o = h5;
        if (h5 != null) {
            h5.setCallback(this);
        }
        Drawable h6 = G.h(a.n.Y6);
        this.f1048t = h6;
        if (h6 != null) {
            h6.setCallback(this);
        }
        this.C = G.x(a.n.N6);
        this.D = G.x(a.n.O6);
        this.E = G.a(a.n.Q6, true);
        this.f1053y = G.g(a.n.V6, 0);
        this.f1054z = G.g(a.n.S6, 0);
        this.A = G.g(a.n.T6, 0);
        this.B = G.a(a.n.R6, false);
        ColorStateList d6 = G.d(a.n.W6);
        if (d6 != null) {
            this.f1044p = d6;
            this.f1046r = true;
        }
        PorterDuff.Mode e6 = e0.e(G.o(a.n.X6, -1), null);
        if (this.f1045q != e6) {
            this.f1045q = e6;
            this.f1047s = true;
        }
        if (this.f1046r || this.f1047s) {
            b();
        }
        ColorStateList d7 = G.d(a.n.Z6);
        if (d7 != null) {
            this.f1049u = d7;
            this.f1051w = true;
        }
        PorterDuff.Mode e7 = e0.e(G.o(a.n.a7, -1), null);
        if (this.f1050v != e7) {
            this.f1050v = e7;
            this.f1052x = true;
        }
        if (this.f1051w || this.f1052x) {
            c();
        }
        int u5 = G.u(a.n.U6, 0);
        if (u5 != 0) {
            E(context, u5);
        }
        t tVar = new t(this);
        this.f1041c0 = tVar;
        tVar.m(attributeSet, i5);
        G.I();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.G = viewConfiguration.getScaledTouchSlop();
        this.K = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }
}
