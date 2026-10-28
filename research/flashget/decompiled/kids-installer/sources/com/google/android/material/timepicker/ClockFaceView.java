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
import androidx.core.view.accessibility.g0;
import androidx.core.view.y1;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
import n1.a;

/* loaded from: classes3.dex */
class ClockFaceView extends RadialViewGroup implements ClockHandView.d {

    /* renamed from: p0, reason: collision with root package name */
    private static final float f14548p0 = 0.001f;

    /* renamed from: q0, reason: collision with root package name */
    private static final int f14549q0 = 12;

    /* renamed from: r0, reason: collision with root package name */
    private static final String f14550r0 = "";

    /* renamed from: b0, reason: collision with root package name */
    private final ClockHandView f14551b0;

    /* renamed from: c0, reason: collision with root package name */
    private final Rect f14552c0;

    /* renamed from: d0, reason: collision with root package name */
    private final RectF f14553d0;

    /* renamed from: e0, reason: collision with root package name */
    private final SparseArray<TextView> f14554e0;

    /* renamed from: f0, reason: collision with root package name */
    private final androidx.core.view.a f14555f0;

    /* renamed from: g0, reason: collision with root package name */
    private final int[] f14556g0;

    /* renamed from: h0, reason: collision with root package name */
    private final float[] f14557h0;

    /* renamed from: i0, reason: collision with root package name */
    private final int f14558i0;

    /* renamed from: j0, reason: collision with root package name */
    private final int f14559j0;

    /* renamed from: k0, reason: collision with root package name */
    private final int f14560k0;

    /* renamed from: l0, reason: collision with root package name */
    private final int f14561l0;

    /* renamed from: m0, reason: collision with root package name */
    private String[] f14562m0;

    /* renamed from: n0, reason: collision with root package name */
    private float f14563n0;

    /* renamed from: o0, reason: collision with root package name */
    private final ColorStateList f14564o0;

    /* loaded from: classes2.dex */
    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.W(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f14551b0.g()) - ClockFaceView.this.f14558i0);
            return true;
        }
    }

    class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void g(View view, @o0 g0 g0Var) {
            super.g(view, g0Var);
            int intValue = ((Integer) view.getTag(a.h.G2)).intValue();
            if (intValue > 0) {
                g0Var.Q1((View) ClockFaceView.this.f14554e0.get(intValue - 1));
            }
            g0Var.Z0(g0.c.h(0, 1, intValue, 1, false, view.isSelected()));
        }
    }

    public ClockFaceView(@o0 Context context) {
        this(context, null);
    }

    private void d0() {
        RectF d6 = this.f14551b0.d();
        for (int i5 = 0; i5 < this.f14554e0.size(); i5++) {
            TextView textView = this.f14554e0.get(i5);
            if (textView != null) {
                textView.getDrawingRect(this.f14552c0);
                this.f14552c0.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.f14552c0);
                this.f14553d0.set(this.f14552c0);
                textView.getPaint().setShader(e0(d6, this.f14553d0));
                textView.invalidate();
            }
        }
    }

    private RadialGradient e0(RectF rectF, RectF rectF2) {
        if (RectF.intersects(rectF, rectF2)) {
            return new RadialGradient(rectF.centerX() - this.f14553d0.left, rectF.centerY() - this.f14553d0.top, rectF.width() * 0.5f, this.f14556g0, this.f14557h0, Shader.TileMode.CLAMP);
        }
        return null;
    }

    private static float f0(float f6, float f7, float f8) {
        return Math.max(Math.max(f6, f7), f8);
    }

    private void g0(@g1 int i5) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f14554e0.size();
        for (int i6 = 0; i6 < Math.max(this.f14562m0.length, size); i6++) {
            TextView textView = this.f14554e0.get(i6);
            if (i6 >= this.f14562m0.length) {
                removeView(textView);
                this.f14554e0.remove(i6);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(a.k.X, (ViewGroup) this, false);
                    this.f14554e0.put(i6, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f14562m0[i6]);
                textView.setTag(a.h.G2, Integer.valueOf(i6));
                y1.B1(textView, this.f14555f0);
                textView.setTextColor(this.f14564o0);
                if (i5 != 0) {
                    textView.setContentDescription(getResources().getString(i5, this.f14562m0[i6]));
                }
            }
        }
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public void W(int i5) {
        if (i5 != V()) {
            super.W(i5);
            this.f14551b0.k(V());
        }
    }

    public void c(String[] strArr, @g1 int i5) {
        this.f14562m0 = strArr;
        g0(i5);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.d
    public void d(float f6, boolean z5) {
        if (Math.abs(this.f14563n0 - f6) > f14548p0) {
            this.f14563n0 = f6;
            d0();
        }
    }

    public void e(@x(from = 0.0d, to = 360.0d) float f6) {
        this.f14551b0.l(f6);
        d0();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@o0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        g0.X1(accessibilityNodeInfo).Y0(g0.b.f(1, this.f14562m0.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        super.onLayout(z5, i5, i6, i7, i8);
        d0();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i5, int i6) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int f02 = (int) (this.f14561l0 / f0(this.f14559j0 / displayMetrics.heightPixels, this.f14560k0 / displayMetrics.widthPixels, 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(f02, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g);
        setMeasuredDimension(f02, f02);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public ClockFaceView(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.O9);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(@o0 Context context, @q0 AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f14552c0 = new Rect();
        this.f14553d0 = new RectF();
        this.f14554e0 = new SparseArray<>();
        this.f14557h0 = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.m6, i5, a.n.Ic);
        Resources resources = getResources();
        ColorStateList a6 = com.google.android.material.resources.c.a(context, obtainStyledAttributes, a.o.o6);
        this.f14564o0 = a6;
        LayoutInflater.from(context).inflate(a.k.Y, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(a.h.f29783q2);
        this.f14551b0 = clockHandView;
        this.f14558i0 = resources.getDimensionPixelSize(a.f.f29455c2);
        int colorForState = a6.getColorForState(new int[]{R.attr.state_selected}, a6.getDefaultColor());
        this.f14556g0 = new int[]{colorForState, colorForState, a6.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = androidx.appcompat.content.res.a.c(context, a.e.f29424w1).getDefaultColor();
        ColorStateList a7 = com.google.android.material.resources.c.a(context, obtainStyledAttributes, a.o.n6);
        setBackgroundColor(a7 != null ? a7.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f14555f0 = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        c(strArr, 0);
        this.f14559j0 = resources.getDimensionPixelSize(a.f.E2);
        this.f14560k0 = resources.getDimensionPixelSize(a.f.F2);
        this.f14561l0 = resources.getDimensionPixelSize(a.f.f29495i2);
    }
}
