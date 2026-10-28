package com.google.android.material.timepicker;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.g1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x;
import androidx.core.view.accessibility.h0;
import androidx.core.view.x1;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
import s8.a;

/* loaded from: classes6.dex */
class ClockFaceView extends RadialViewGroup implements ClockHandView.d {
    private static final float S2 = 0.001f;
    private static final int T2 = 12;
    private static final String U2 = "";
    private final int L2;
    private final int M2;
    private final ClockHandView N;
    private final int N2;
    private final Rect O;
    private final int O2;
    private final RectF P;
    private String[] P2;
    private final SparseArray<TextView> Q;
    private final int[] Q1;
    private float Q2;
    private final androidx.core.view.a R;
    private final ColorStateList R2;
    private final float[] V1;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.W(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.N.g()) - ClockFaceView.this.L2);
            return true;
        }
    }

    class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void i(View view, @o0 h0 h0Var) {
            super.i(view, h0Var);
            int intValue = ((Integer) view.getTag(a.h.G2)).intValue();
            if (intValue > 0) {
                h0Var.j2((View) ClockFaceView.this.Q.get(intValue - 1));
            }
            h0Var.m1(h0.g.j(0, 1, intValue, 1, false, view.isSelected()));
        }
    }

    public ClockFaceView(@o0 Context context) {
        this(context, null);
    }

    private void d0() {
        RectF d5 = this.N.d();
        for (int i4 = 0; i4 < this.Q.size(); i4++) {
            TextView textView = this.Q.get(i4);
            if (textView != null) {
                textView.getDrawingRect(this.O);
                this.O.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.O);
                this.P.set(this.O);
                textView.getPaint().setShader(e0(d5, this.P));
                textView.invalidate();
            }
        }
    }

    private RadialGradient e0(RectF rectF, RectF rectF2) {
        if (RectF.intersects(rectF, rectF2)) {
            return new RadialGradient(rectF.centerX() - this.P.left, rectF.centerY() - this.P.top, rectF.width() * 0.5f, this.Q1, this.V1, Shader.TileMode.CLAMP);
        }
        return null;
    }

    private static float f0(float f4, float f5, float f6) {
        return Math.max(Math.max(f4, f5), f6);
    }

    private void g0(@g1 int i4) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.Q.size();
        for (int i5 = 0; i5 < Math.max(this.P2.length, size); i5++) {
            TextView textView = this.Q.get(i5);
            if (i5 >= this.P2.length) {
                removeView(textView);
                this.Q.remove(i5);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(a.k.X, (ViewGroup) this, false);
                    this.Q.put(i5, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.P2[i5]);
                textView.setTag(a.h.G2, Integer.valueOf(i5));
                x1.H1(textView, this.R);
                textView.setTextColor(this.R2);
                if (i4 != 0) {
                    textView.setContentDescription(getResources().getString(i4, this.P2[i5]));
                }
            }
        }
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public void W(int i4) {
        if (i4 != V()) {
            super.W(i4);
            this.N.k(V());
        }
    }

    public void c(String[] strArr, @g1 int i4) {
        this.P2 = strArr;
        g0(i4);
    }

    public void d(@x(from = 0.0d, to = 360.0d) float f4) {
        this.N.l(f4);
        d0();
    }

    @Override // com.google.android.material.timepicker.ClockHandView.d
    public void g(float f4, boolean z4) {
        if (Math.abs(this.Q2 - f4) > S2) {
            this.Q2 = f4;
            d0();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@o0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        h0.r2(accessibilityNodeInfo).l1(h0.f.h(1, this.P2.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        d0();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int f02 = (int) (this.O2 / f0(this.M2 / displayMetrics.heightPixels, this.N2 / displayMetrics.widthPixels, 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(f02, 1073741824);
        setMeasuredDimension(f02, f02);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public ClockFaceView(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.N9);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(@o0 Context context, @q0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.O = new Rect();
        this.P = new RectF();
        this.Q = new SparseArray<>();
        this.V1 = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.n6, i4, a.n.Ic);
        Resources resources = getResources();
        ColorStateList a5 = com.google.android.material.resources.c.a(context, obtainStyledAttributes, a.o.p6);
        this.R2 = a5;
        LayoutInflater.from(context).inflate(a.k.Y, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(a.h.f91065q2);
        this.N = clockHandView;
        this.L2 = resources.getDimensionPixelSize(a.f.f90781c2);
        int colorForState = a5.getColorForState(new int[]{R.attr.state_selected}, a5.getDefaultColor());
        this.Q1 = new int[]{colorForState, colorForState, a5.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = androidx.core.content.d.getColorStateList(context, a.e.f90752w1).getDefaultColor();
        ColorStateList a6 = com.google.android.material.resources.c.a(context, obtainStyledAttributes, a.o.o6);
        setBackgroundColor(a6 != null ? a6.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.R = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        c(strArr, 0);
        this.M2 = resources.getDimensionPixelSize(a.f.E2);
        this.N2 = resources.getDimensionPixelSize(a.f.F2);
        this.O2 = resources.getDimensionPixelSize(a.f.f90813i2);
    }
}
