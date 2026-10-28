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
import android.text.InputFilter;
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
import androidx.core.view.x1;
import androidx.emoji2.text.g;
import d.a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton implements c0 {
    private static final int L2 = 0;
    private static final int M2 = 1;
    private static final int N2 = 2;
    private static final int P2 = 1;
    private static final int Q2 = 2;
    private static final int R2 = 3;
    private static final int V1 = 250;
    float A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private boolean I;
    private final TextPaint J;
    private ColorStateList K;
    private Layout L;
    private Layout M;

    @androidx.annotation.q0
    private TransformationMethod N;
    ObjectAnimator O;
    private final q P;

    @androidx.annotation.o0
    private j Q;
    private final Rect Q1;

    @androidx.annotation.q0
    private c R;

    /* renamed from: b, reason: collision with root package name */
    private Drawable f1639b;

    /* renamed from: c, reason: collision with root package name */
    private ColorStateList f1640c;

    /* renamed from: d, reason: collision with root package name */
    private PorterDuff.Mode f1641d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1642e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1643f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f1644g;

    /* renamed from: h, reason: collision with root package name */
    private ColorStateList f1645h;

    /* renamed from: i, reason: collision with root package name */
    private PorterDuff.Mode f1646i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f1647j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f1648k;

    /* renamed from: l, reason: collision with root package name */
    private int f1649l;

    /* renamed from: m, reason: collision with root package name */
    private int f1650m;

    /* renamed from: n, reason: collision with root package name */
    private int f1651n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f1652o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f1653p;

    /* renamed from: q, reason: collision with root package name */
    private CharSequence f1654q;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f1655r;

    /* renamed from: s, reason: collision with root package name */
    private CharSequence f1656s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f1657t;

    /* renamed from: u, reason: collision with root package name */
    private int f1658u;

    /* renamed from: v, reason: collision with root package name */
    private int f1659v;

    /* renamed from: w, reason: collision with root package name */
    private float f1660w;

    /* renamed from: x, reason: collision with root package name */
    private float f1661x;

    /* renamed from: y, reason: collision with root package name */
    private VelocityTracker f1662y;

    /* renamed from: z, reason: collision with root package name */
    private int f1663z;
    private static final String O2 = "android.widget.Switch";
    private static final Property<SwitchCompat, Float> S2 = new a(Float.class, "thumbPos");
    private static final int[] T2 = {R.attr.state_checked};

    class a extends Property<SwitchCompat, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.A);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f4) {
            switchCompat.S(f4.floatValue());
        }
    }

    @androidx.annotation.x0(18)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static void a(ObjectAnimator objectAnimator, boolean z4) {
            objectAnimator.setAutoCancel(z4);
        }
    }

    static class c extends g.AbstractC0478g {

        /* renamed from: a, reason: collision with root package name */
        private final Reference<SwitchCompat> f1664a;

        c(SwitchCompat switchCompat) {
            this.f1664a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.g.AbstractC0478g
        public void a(@androidx.annotation.q0 Throwable th) {
            SwitchCompat switchCompat = this.f1664a.get();
            if (switchCompat != null) {
                switchCompat.B();
            }
        }

        @Override // androidx.emoji2.text.g.AbstractC0478g
        public void b() {
            SwitchCompat switchCompat = this.f1664a.get();
            if (switchCompat != null) {
                switchCompat.B();
            }
        }
    }

    public SwitchCompat(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    private Layout A(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.J, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void D() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f1655r;
            if (charSequence == null) {
                charSequence = getResources().getString(a.k.f73331g);
            }
            x1.A2(this, charSequence);
        }
    }

    private void E() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f1653p;
            if (charSequence == null) {
                charSequence = getResources().getString(a.k.f73332h);
            }
            x1.A2(this, charSequence);
        }
    }

    private void M(int i4, int i5) {
        L(i4 != 1 ? i4 != 2 ? i4 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i5);
    }

    private void O(CharSequence charSequence) {
        this.f1655r = charSequence;
        this.f1656s = g(charSequence);
        this.M = null;
        if (this.f1657t) {
            b0();
        }
    }

    private void Q(CharSequence charSequence) {
        this.f1653p = charSequence;
        this.f1654q = g(charSequence);
        this.L = null;
        if (this.f1657t) {
            b0();
        }
    }

    private void a(boolean z4) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, S2, z4 ? 1.0f : 0.0f);
        this.O = ofFloat;
        ofFloat.setDuration(250L);
        b.a(this.O, true);
        this.O.start();
    }

    private void b() {
        Drawable drawable = this.f1639b;
        if (drawable != null) {
            if (this.f1642e || this.f1643f) {
                Drawable mutate = drawable.mutate();
                this.f1639b = mutate;
                if (this.f1642e) {
                    mutate.setTintList(this.f1640c);
                }
                if (this.f1643f) {
                    this.f1639b.setTintMode(this.f1641d);
                }
                if (this.f1639b.isStateful()) {
                    this.f1639b.setState(getDrawableState());
                }
            }
        }
    }

    private void b0() {
        if (this.R == null && this.Q.b() && androidx.emoji2.text.g.q()) {
            androidx.emoji2.text.g c5 = androidx.emoji2.text.g.c();
            int i4 = c5.i();
            if (i4 == 3 || i4 == 0) {
                c cVar = new c(this);
                this.R = cVar;
                c5.B(cVar);
            }
        }
    }

    private void c() {
        Drawable drawable = this.f1644g;
        if (drawable != null) {
            if (this.f1647j || this.f1648k) {
                Drawable mutate = drawable.mutate();
                this.f1644g = mutate;
                if (this.f1647j) {
                    mutate.setTintList(this.f1645h);
                }
                if (this.f1648k) {
                    this.f1644g.setTintMode(this.f1646i);
                }
                if (this.f1644g.isStateful()) {
                    this.f1644g.setState(getDrawableState());
                }
            }
        }
    }

    private void c0(MotionEvent motionEvent) {
        this.f1658u = 0;
        boolean z4 = true;
        boolean z5 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z5) {
            this.f1662y.computeCurrentVelocity(1000);
            float xVelocity = this.f1662y.getXVelocity();
            if (Math.abs(xVelocity) <= this.f1663z) {
                z4 = m();
            } else if (!e1.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z4 = false;
            }
        } else {
            z4 = isChecked;
        }
        if (z4 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z4);
        e(motionEvent);
    }

    private void d() {
        ObjectAnimator objectAnimator = this.O;
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

    private static float f(float f4, float f5, float f6) {
        return f4 < f5 ? f5 : f4 > f6 ? f6 : f4;
    }

    @androidx.annotation.q0
    private CharSequence g(@androidx.annotation.q0 CharSequence charSequence) {
        TransformationMethod f4 = h().f(this.N);
        return f4 != null ? f4.getTransformation(charSequence, this) : charSequence;
    }

    @androidx.annotation.o0
    private j h() {
        if (this.Q == null) {
            this.Q = new j(this);
        }
        return this.Q;
    }

    private boolean m() {
        return this.A > 0.5f;
    }

    private int q() {
        return (int) (((e1.b(this) ? 1.0f - this.A : this.A) * s()) + 0.5f);
    }

    private int s() {
        Drawable drawable = this.f1644g;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.Q1;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f1639b;
        Rect d5 = drawable2 != null ? a0.d(drawable2) : a0.f1710c;
        return ((((this.B - this.D) - rect.left) - rect.right) - d5.left) - d5.right;
    }

    private boolean z(float f4, float f5) {
        if (this.f1639b == null) {
            return false;
        }
        int q4 = q();
        this.f1639b.getPadding(this.Q1);
        int i4 = this.F;
        int i5 = this.f1659v;
        int i6 = i4 - i5;
        int i7 = (this.E + q4) - i5;
        int i10 = this.D + i7;
        Rect rect = this.Q1;
        return f4 > ((float) i7) && f4 < ((float) (((i10 + rect.left) + rect.right) + i5)) && f5 > ((float) i6) && f5 < ((float) (this.H + i5));
    }

    void B() {
        Q(this.f1653p);
        O(this.f1655r);
        requestLayout();
    }

    protected final void C(boolean z4) {
        this.I = z4;
        invalidate();
    }

    public void F(boolean z4) {
        if (this.f1657t != z4) {
            this.f1657t = z4;
            requestLayout();
            if (z4) {
                b0();
            }
        }
    }

    public void G(boolean z4) {
        this.f1652o = z4;
        invalidate();
    }

    public void H(int i4) {
        this.f1650m = i4;
        requestLayout();
    }

    public void I(int i4) {
        this.f1651n = i4;
        requestLayout();
    }

    public void J(Context context, int i4) {
        t0 E = t0.E(context, i4, a.m.O5);
        ColorStateList d5 = E.d(a.m.S5);
        if (d5 != null) {
            this.K = d5;
        } else {
            this.K = getTextColors();
        }
        int g4 = E.g(a.m.P5, 0);
        if (g4 != 0) {
            float f4 = g4;
            if (f4 != this.J.getTextSize()) {
                this.J.setTextSize(f4);
                requestLayout();
            }
        }
        M(E.o(a.m.Q5, -1), E.o(a.m.R5, -1));
        if (E.a(a.m.d6, false)) {
            this.N = new g.a(getContext());
        } else {
            this.N = null;
        }
        Q(this.f1653p);
        O(this.f1655r);
        E.I();
    }

    public void K(Typeface typeface) {
        if ((this.J.getTypeface() == null || this.J.getTypeface().equals(typeface)) && (this.J.getTypeface() != null || typeface == null)) {
            return;
        }
        this.J.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void L(Typeface typeface, int i4) {
        if (i4 <= 0) {
            this.J.setFakeBoldText(false);
            this.J.setTextSkewX(0.0f);
            K(typeface);
        } else {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i4) : Typeface.create(typeface, i4);
            K(defaultFromStyle);
            int i5 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i4;
            this.J.setFakeBoldText((i5 & 1) != 0);
            this.J.setTextSkewX((i5 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public void N(CharSequence charSequence) {
        O(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        D();
    }

    public void P(CharSequence charSequence) {
        Q(charSequence);
        requestLayout();
        if (isChecked()) {
            E();
        }
    }

    public void R(Drawable drawable) {
        Drawable drawable2 = this.f1639b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1639b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void S(float f4) {
        this.A = f4;
        invalidate();
    }

    public void T(int i4) {
        R(e.a.b(getContext(), i4));
    }

    public void U(int i4) {
        this.f1649l = i4;
        requestLayout();
    }

    public void V(@androidx.annotation.q0 ColorStateList colorStateList) {
        this.f1640c = colorStateList;
        this.f1642e = true;
        b();
    }

    public void W(@androidx.annotation.q0 PorterDuff.Mode mode) {
        this.f1641d = mode;
        this.f1643f = true;
        b();
    }

    public void X(Drawable drawable) {
        Drawable drawable2 = this.f1644g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1644g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void Y(int i4) {
        X(e.a.b(getContext(), i4));
    }

    public void Z(@androidx.annotation.q0 ColorStateList colorStateList) {
        this.f1645h = colorStateList;
        this.f1647j = true;
        c();
    }

    public void a0(@androidx.annotation.q0 PorterDuff.Mode mode) {
        this.f1646i = mode;
        this.f1648k = true;
        c();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i4;
        int i5;
        Rect rect = this.Q1;
        int i6 = this.E;
        int i7 = this.F;
        int i10 = this.G;
        int i11 = this.H;
        int q4 = q() + i6;
        Drawable drawable = this.f1639b;
        Rect d5 = drawable != null ? a0.d(drawable) : a0.f1710c;
        Drawable drawable2 = this.f1644g;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i12 = rect.left;
            q4 += i12;
            if (d5 != null) {
                int i13 = d5.left;
                if (i13 > i12) {
                    i6 += i13 - i12;
                }
                int i14 = d5.top;
                int i15 = rect.top;
                i4 = i14 > i15 ? (i14 - i15) + i7 : i7;
                int i16 = d5.right;
                int i17 = rect.right;
                if (i16 > i17) {
                    i10 -= i16 - i17;
                }
                int i18 = d5.bottom;
                int i19 = rect.bottom;
                if (i18 > i19) {
                    i5 = i11 - (i18 - i19);
                    this.f1644g.setBounds(i6, i4, i10, i5);
                }
            } else {
                i4 = i7;
            }
            i5 = i11;
            this.f1644g.setBounds(i6, i4, i10, i5);
        }
        Drawable drawable3 = this.f1639b;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i20 = q4 - rect.left;
            int i21 = q4 + this.D + rect.right;
            this.f1639b.setBounds(i20, i7, i21, i11);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i20, i7, i21, i11);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f4, float f5) {
        super.drawableHotspotChanged(f4, f5);
        Drawable drawable = this.f1639b;
        if (drawable != null) {
            drawable.setHotspot(f4, f5);
        }
        Drawable drawable2 = this.f1644g;
        if (drawable2 != null) {
            drawable2.setHotspot(f4, f5);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1639b;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f1644g;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!e1.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.B;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1651n : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (e1.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.B;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1651n : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    @androidx.annotation.q0
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.q.F(super.getCustomSelectionActionModeCallback());
    }

    public boolean i() {
        return this.f1657t;
    }

    @Override // androidx.appcompat.widget.c0
    public boolean isEmojiCompatEnabled() {
        return h().b();
    }

    public boolean j() {
        return this.f1652o;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1639b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1644g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.O;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.O.end();
        this.O = null;
    }

    public int k() {
        return this.f1650m;
    }

    public int l() {
        return this.f1651n;
    }

    public CharSequence n() {
        return this.f1655r;
    }

    public CharSequence o() {
        return this.f1653p;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, T2);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.Q1;
        Drawable drawable = this.f1644g;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i4 = this.F;
        int i5 = this.H;
        int i6 = i4 + rect.top;
        int i7 = i5 - rect.bottom;
        Drawable drawable2 = this.f1639b;
        if (drawable != null) {
            if (!this.f1652o || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d5 = a0.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d5.left;
                rect.right -= d5.right;
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
        Layout layout = m() ? this.L : this.M;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.K;
            if (colorStateList != null) {
                this.J.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.J.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i6 + i7) / 2) - (layout.getHeight() / 2));
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
            CharSequence charSequence = isChecked() ? this.f1653p : this.f1655r;
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
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int i10;
        int width;
        int i11;
        int i12;
        int i13;
        super.onLayout(z4, i4, i5, i6, i7);
        int i14 = 0;
        if (this.f1639b != null) {
            Rect rect = this.Q1;
            Drawable drawable = this.f1644g;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d5 = a0.d(this.f1639b);
            i10 = Math.max(0, d5.left - rect.left);
            i14 = Math.max(0, d5.right - rect.right);
        } else {
            i10 = 0;
        }
        if (e1.b(this)) {
            i11 = getPaddingLeft() + i10;
            width = ((this.B + i11) - i10) - i14;
        } else {
            width = (getWidth() - getPaddingRight()) - i14;
            i11 = (width - this.B) + i10 + i14;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i15 = this.C;
            int i16 = height - (i15 / 2);
            i12 = i15 + i16;
            i13 = i16;
        } else if (gravity != 80) {
            i13 = getPaddingTop();
            i12 = this.C + i13;
        } else {
            i12 = getHeight() - getPaddingBottom();
            i13 = i12 - this.C;
        }
        this.E = i11;
        this.F = i13;
        this.H = i12;
        this.G = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        if (this.f1657t) {
            if (this.L == null) {
                this.L = A(this.f1654q);
            }
            if (this.M == null) {
                this.M = A(this.f1656s);
            }
        }
        Rect rect = this.Q1;
        Drawable drawable = this.f1639b;
        int i10 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i6 = (this.f1639b.getIntrinsicWidth() - rect.left) - rect.right;
            i7 = this.f1639b.getIntrinsicHeight();
        } else {
            i6 = 0;
            i7 = 0;
        }
        this.D = Math.max(this.f1657t ? (this.f1649l * 2) + Math.max(this.L.getWidth(), this.M.getWidth()) : 0, i6);
        Drawable drawable2 = this.f1644g;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i10 = this.f1644g.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i11 = rect.left;
        int i12 = rect.right;
        Drawable drawable3 = this.f1639b;
        if (drawable3 != null) {
            Rect d5 = a0.d(drawable3);
            i11 = Math.max(i11, d5.left);
            i12 = Math.max(i12, d5.right);
        }
        int max = this.I ? Math.max(this.f1650m, (this.D * 2) + i11 + i12) : this.f1650m;
        int max2 = Math.max(i10, i7);
        this.B = max;
        this.C = max2;
        super.onMeasure(i4, i5);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1653p : this.f1655r;
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
            android.view.VelocityTracker r0 = r6.f1662y
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
            int r0 = r6.f1658u
            if (r0 == r1) goto L55
            if (r0 == r2) goto L1e
            goto Lb7
        L1e:
            float r7 = r7.getX()
            int r0 = r6.s()
            float r2 = r6.f1660w
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
            boolean r0 = androidx.appcompat.widget.e1.b(r6)
            if (r0 == 0) goto L42
            float r2 = -r2
        L42:
            float r0 = r6.A
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.A
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L54
            r6.f1660w = r7
            r6.S(r0)
        L54:
            return r1
        L55:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f1660w
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1659v
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7b
            float r4 = r6.f1661x
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1659v
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb7
        L7b:
            r6.f1658u = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f1660w = r0
            r6.f1661x = r3
            return r1
        L89:
            int r0 = r6.f1658u
            if (r0 != r2) goto L94
            r6.c0(r7)
            super.onTouchEvent(r7)
            return r1
        L94:
            r0 = 0
            r6.f1658u = r0
            android.view.VelocityTracker r0 = r6.f1662y
            r0.clear()
            goto Lb7
        L9d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb7
            boolean r3 = r6.z(r0, r2)
            if (r3 == 0) goto Lb7
            r6.f1658u = r1
            r6.f1660w = r0
            r6.f1661x = r2
        Lb7:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public Drawable p() {
        return this.f1639b;
    }

    @androidx.annotation.x(from = com.google.firebase.remoteconfig.p.f60679p, to = 1.0d)
    protected final float r() {
        return this.A;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        h().d(z4);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z4) {
        super.setChecked(z4);
        boolean isChecked = isChecked();
        if (isChecked) {
            E();
        } else {
            D();
        }
        if (getWindowToken() != null && x1.Y0(this)) {
            a(isChecked);
        } else {
            d();
            S(isChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@androidx.annotation.q0 ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.q.G(this, callback));
    }

    @Override // androidx.appcompat.widget.c0
    public void setEmojiCompatEnabled(boolean z4) {
        h().e(z4);
        Q(this.f1653p);
        O(this.f1655r);
        requestLayout();
    }

    @Override // android.widget.TextView
    public void setFilters(@androidx.annotation.o0 InputFilter[] inputFilterArr) {
        super.setFilters(h().a(inputFilterArr));
    }

    public int t() {
        return this.f1649l;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @androidx.annotation.q0
    public ColorStateList u() {
        return this.f1640c;
    }

    @androidx.annotation.q0
    public PorterDuff.Mode v() {
        return this.f1641d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1639b || drawable == this.f1644g;
    }

    public Drawable w() {
        return this.f1644g;
    }

    @androidx.annotation.q0
    public ColorStateList x() {
        return this.f1645h;
    }

    @androidx.annotation.q0
    public PorterDuff.Mode y() {
        return this.f1646i;
    }

    public SwitchCompat(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.f73007l3);
    }

    public SwitchCompat(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f1640c = null;
        this.f1641d = null;
        this.f1642e = false;
        this.f1643f = false;
        this.f1645h = null;
        this.f1646i = null;
        this.f1647j = false;
        this.f1648k = false;
        this.f1662y = VelocityTracker.obtain();
        this.I = true;
        this.Q1 = new Rect();
        o0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.J = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = a.m.z5;
        t0 G = t0.G(context, attributeSet, iArr, i4, 0);
        x1.F1(this, context, iArr, attributeSet, G.B(), i4, 0);
        Drawable h4 = G.h(a.m.C5);
        this.f1639b = h4;
        if (h4 != null) {
            h4.setCallback(this);
        }
        Drawable h5 = G.h(a.m.L5);
        this.f1644g = h5;
        if (h5 != null) {
            h5.setCallback(this);
        }
        Q(G.x(a.m.A5));
        O(G.x(a.m.B5));
        this.f1657t = G.a(a.m.D5, true);
        this.f1649l = G.g(a.m.I5, 0);
        this.f1650m = G.g(a.m.F5, 0);
        this.f1651n = G.g(a.m.G5, 0);
        this.f1652o = G.a(a.m.E5, false);
        ColorStateList d5 = G.d(a.m.J5);
        if (d5 != null) {
            this.f1640c = d5;
            this.f1642e = true;
        }
        PorterDuff.Mode e4 = a0.e(G.o(a.m.K5, -1), null);
        if (this.f1641d != e4) {
            this.f1641d = e4;
            this.f1643f = true;
        }
        if (this.f1642e || this.f1643f) {
            b();
        }
        ColorStateList d6 = G.d(a.m.M5);
        if (d6 != null) {
            this.f1645h = d6;
            this.f1647j = true;
        }
        PorterDuff.Mode e5 = a0.e(G.o(a.m.N5, -1), null);
        if (this.f1646i != e5) {
            this.f1646i = e5;
            this.f1648k = true;
        }
        if (this.f1647j || this.f1648k) {
            c();
        }
        int u4 = G.u(a.m.H5, 0);
        if (u4 != 0) {
            J(context, u4);
        }
        q qVar = new q(this);
        this.P = qVar;
        qVar.m(attributeSet, i4);
        G.I();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1659v = viewConfiguration.getScaledTouchSlop();
        this.f1663z = viewConfiguration.getScaledMinimumFlingVelocity();
        h().c(attributeSet, i4);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
