package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import androidx.annotation.l;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q;
import androidx.annotation.q0;
import androidx.annotation.r;
import androidx.core.view.accessibility.g0;
import androidx.core.view.y1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.internal.n;
import com.google.android.material.internal.u;
import com.google.android.material.internal.v;
import com.google.android.material.shape.j;
import com.google.android.material.shape.o;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.slider.a;
import com.google.android.material.slider.b;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n1.a;

/* loaded from: classes2.dex */
abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends com.google.android.material.slider.a<S>, T extends com.google.android.material.slider.b<S>> extends View {
    static final int B0 = 1;
    static final int C0 = 0;
    private static final long D0 = 83;
    private static final long E0 = 117;

    /* renamed from: x0, reason: collision with root package name */
    private static final int f14131x0 = 200;

    /* renamed from: y0, reason: collision with root package name */
    private static final int f14132y0 = 63;

    /* renamed from: z0, reason: collision with root package name */
    private static final double f14133z0 = 1.0E-4d;

    @o0
    private final List<T> A;
    private boolean B;
    private ValueAnimator C;
    private ValueAnimator D;
    private final int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private float P;
    private MotionEvent Q;
    private com.google.android.material.slider.d R;
    private boolean S;
    private float T;
    private float U;
    private ArrayList<Float> V;
    private int W;

    /* renamed from: a0, reason: collision with root package name */
    private int f14134a0;

    /* renamed from: b0, reason: collision with root package name */
    private float f14135b0;

    /* renamed from: c0, reason: collision with root package name */
    private float[] f14136c0;

    /* renamed from: d0, reason: collision with root package name */
    private boolean f14137d0;

    /* renamed from: e0, reason: collision with root package name */
    private int f14138e0;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f14139f0;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f14140g0;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f14141h0;

    /* renamed from: i0, reason: collision with root package name */
    @o0
    private ColorStateList f14142i0;

    /* renamed from: j0, reason: collision with root package name */
    @o0
    private ColorStateList f14143j0;

    /* renamed from: k0, reason: collision with root package name */
    @o0
    private ColorStateList f14144k0;

    /* renamed from: l0, reason: collision with root package name */
    @o0
    private ColorStateList f14145l0;

    /* renamed from: m0, reason: collision with root package name */
    @o0
    private ColorStateList f14146m0;

    /* renamed from: n0, reason: collision with root package name */
    @o0
    private final j f14147n0;

    /* renamed from: o, reason: collision with root package name */
    @o0
    private final Paint f14148o;

    /* renamed from: o0, reason: collision with root package name */
    private float f14149o0;

    /* renamed from: p, reason: collision with root package name */
    @o0
    private final Paint f14150p;

    /* renamed from: p0, reason: collision with root package name */
    private int f14151p0;

    /* renamed from: q, reason: collision with root package name */
    @o0
    private final Paint f14152q;

    /* renamed from: r, reason: collision with root package name */
    @o0
    private final Paint f14153r;

    /* renamed from: s, reason: collision with root package name */
    @o0
    private final Paint f14154s;

    /* renamed from: t, reason: collision with root package name */
    @o0
    private final Paint f14155t;

    /* renamed from: u, reason: collision with root package name */
    @o0
    private final e f14156u;

    /* renamed from: v, reason: collision with root package name */
    private final AccessibilityManager f14157v;

    /* renamed from: w, reason: collision with root package name */
    private BaseSlider<S, L, T>.d f14158w;

    /* renamed from: x, reason: collision with root package name */
    @o0
    private final f f14159x;

    /* renamed from: y, reason: collision with root package name */
    @o0
    private final List<com.google.android.material.tooltip.a> f14160y;

    /* renamed from: z, reason: collision with root package name */
    @o0
    private final List<L> f14161z;

    /* renamed from: w0, reason: collision with root package name */
    private static final String f14130w0 = ProtectedSandApp.s("ቒ");

    /* renamed from: v0, reason: collision with root package name */
    private static final String f14129v0 = ProtectedSandApp.s("ቓ");

    /* renamed from: u0, reason: collision with root package name */
    private static final String f14128u0 = ProtectedSandApp.s("ቔ");

    /* renamed from: t0, reason: collision with root package name */
    private static final String f14127t0 = ProtectedSandApp.s("ቕ");

    /* renamed from: s0, reason: collision with root package name */
    private static final String f14126s0 = ProtectedSandApp.s("ቖ");

    /* renamed from: r0, reason: collision with root package name */
    private static final String f14125r0 = ProtectedSandApp.s("\u1257");

    /* renamed from: q0, reason: collision with root package name */
    private static final String f14124q0 = ProtectedSandApp.s("ቘ");
    static final int A0 = a.n.mc;

    static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        float f14162o;

        /* renamed from: p, reason: collision with root package name */
        float f14163p;

        /* renamed from: q, reason: collision with root package name */
        ArrayList<Float> f14164q;

        /* renamed from: r, reason: collision with root package name */
        float f14165r;

        /* renamed from: s, reason: collision with root package name */
        boolean f14166s;

        static class a implements Parcelable.Creator<SliderState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @o0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SliderState createFromParcel(@o0 Parcel parcel) {
                return new SliderState(parcel, null);
            }

            @o0
            public SliderState[] b(int i5) {
                return new SliderState[i5];
            }

            @Override // android.os.Parcelable.Creator
            @o0
            public SliderState[] newArray(int i5) {
                return new SliderState[i5];
            }
        }

        /* synthetic */ SliderState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@o0 Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeFloat(this.f14162o);
            parcel.writeFloat(this.f14163p);
            parcel.writeList(this.f14164q);
            parcel.writeFloat(this.f14165r);
            parcel.writeBooleanArray(new boolean[]{this.f14166s});
        }

        SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        private SliderState(@o0 Parcel parcel) {
            super(parcel);
            this.f14162o = parcel.readFloat();
            this.f14163p = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.f14164q = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f14165r = parcel.readFloat();
            this.f14166s = parcel.createBooleanArray()[0];
        }
    }

    /* loaded from: classes3.dex */
    class a implements f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AttributeSet f14167a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f14168b;

        a(AttributeSet attributeSet, int i5) {
            this.f14167a = attributeSet;
            this.f14168b = i5;
        }

        @Override // com.google.android.material.slider.BaseSlider.f
        public com.google.android.material.tooltip.a a() {
            TypedArray j5 = n.j(BaseSlider.this.getContext(), this.f14167a, a.o.Go, this.f14168b, BaseSlider.A0, new int[0]);
            com.google.android.material.tooltip.a z02 = BaseSlider.z0(BaseSlider.this.getContext(), j5);
            j5.recycle();
            return z02;
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            Iterator it = BaseSlider.this.f14160y.iterator();
            while (it.hasNext()) {
                ((com.google.android.material.tooltip.a) it.next()).m1(floatValue);
            }
            y1.n1(BaseSlider.this);
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            Iterator it = BaseSlider.this.f14160y.iterator();
            while (it.hasNext()) {
                v.g(BaseSlider.this).b((com.google.android.material.tooltip.a) it.next());
            }
        }
    }

    /* loaded from: classes3.dex */
    private static class e extends androidx.customview.widget.a {

        /* renamed from: t, reason: collision with root package name */
        private final BaseSlider<?, ?, ?> f14174t;

        /* renamed from: u, reason: collision with root package name */
        Rect f14175u;

        e(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.f14175u = new Rect();
            this.f14174t = baseSlider;
        }

        @o0
        private String a0(int i5) {
            return i5 == this.f14174t.i0().size() + (-1) ? this.f14174t.getContext().getString(a.m.f29941b0) : i5 == 0 ? this.f14174t.getContext().getString(a.m.f29943c0) : "";
        }

        @Override // androidx.customview.widget.a
        protected int C(float f6, float f7) {
            for (int i5 = 0; i5 < this.f14174t.i0().size(); i5++) {
                this.f14174t.r1(i5, this.f14175u);
                if (this.f14175u.contains((int) f6, (int) f7)) {
                    return i5;
                }
            }
            return -1;
        }

        @Override // androidx.customview.widget.a
        protected void D(List<Integer> list) {
            for (int i5 = 0; i5 < this.f14174t.i0().size(); i5++) {
                list.add(Integer.valueOf(i5));
            }
        }

        @Override // androidx.customview.widget.a
        protected boolean N(int i5, int i6, Bundle bundle) {
            if (!this.f14174t.isEnabled()) {
                return false;
            }
            if (i6 != 4096 && i6 != 8192) {
                if (i6 == 16908349 && bundle != null) {
                    String s5 = ProtectedSandApp.s("✛");
                    if (bundle.containsKey(s5)) {
                        if (this.f14174t.p1(i5, bundle.getFloat(s5))) {
                            this.f14174t.s1();
                            this.f14174t.postInvalidate();
                            G(i5);
                            return true;
                        }
                    }
                }
                return false;
            }
            float m5 = this.f14174t.m(20);
            if (i6 == 8192) {
                m5 = -m5;
            }
            if (this.f14174t.m0()) {
                m5 = -m5;
            }
            if (!this.f14174t.p1(i5, o.a.d(this.f14174t.i0().get(i5).floatValue() + m5, this.f14174t.e0(), this.f14174t.h0()))) {
                return false;
            }
            this.f14174t.s1();
            this.f14174t.postInvalidate();
            G(i5);
            return true;
        }

        @Override // androidx.customview.widget.a
        protected void R(int i5, g0 g0Var) {
            g0Var.b(g0.a.M);
            List<Float> i02 = this.f14174t.i0();
            float floatValue = i02.get(i5).floatValue();
            float e02 = this.f14174t.e0();
            float h02 = this.f14174t.h0();
            if (this.f14174t.isEnabled()) {
                if (floatValue > e02) {
                    g0Var.a(8192);
                }
                if (floatValue < h02) {
                    g0Var.a(4096);
                }
            }
            g0Var.C1(g0.d.e(1, e02, h02, floatValue));
            g0Var.W0(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.f14174t.getContentDescription() != null) {
                sb.append(this.f14174t.getContentDescription());
                sb.append(ProtectedSandApp.s("✜"));
            }
            if (i02.size() > 1) {
                sb.append(a0(i5));
                sb.append(this.f14174t.D(floatValue));
            }
            g0Var.a1(sb.toString());
            this.f14174t.r1(i5, this.f14175u);
            g0Var.R0(this.f14175u);
        }
    }

    private interface f {
        com.google.android.material.tooltip.a a();
    }

    public BaseSlider(@o0 Context context) {
        this(context, null);
    }

    private void A() {
        if (this.B) {
            this.B = false;
            ValueAnimator q5 = q(false);
            this.D = q5;
            this.C = null;
            q5.addListener(new c());
            this.D.start();
        }
    }

    private float A1(float f6) {
        return (v0(f6) * this.f14138e0) + this.K;
    }

    private void B(int i5) {
        if (i5 == 1) {
            t0(Integer.MAX_VALUE);
            return;
        }
        if (i5 == 2) {
            t0(Integer.MIN_VALUE);
        } else if (i5 == 17) {
            u0(Integer.MAX_VALUE);
        } else {
            if (i5 != 66) {
                return;
            }
            u0(Integer.MIN_VALUE);
        }
    }

    private static int B0(float[] fArr, float f6) {
        return Math.round(f6 * ((fArr.length / 2) - 1));
    }

    private void B1() {
        float f6 = this.f14135b0;
        if (f6 == 0.0f) {
            return;
        }
        float f7 = (int) f6;
        String s5 = ProtectedSandApp.s("ቚ");
        if (f7 != f6) {
            String.format(s5, ProtectedSandApp.s("ቛ"), Float.valueOf(f6));
        }
        float f8 = this.T;
        if (((int) f8) != f8) {
            String.format(s5, ProtectedSandApp.s("ቜ"), Float.valueOf(f8));
        }
        float f9 = this.U;
        if (((int) f9) != f9) {
            String.format(s5, ProtectedSandApp.s("ቝ"), Float.valueOf(f9));
        }
    }

    private void C0(Context context, AttributeSet attributeSet, int i5) {
        TypedArray j5 = n.j(context, attributeSet, a.o.Go, i5, A0, new int[0]);
        this.T = j5.getFloat(a.o.Ko, 0.0f);
        this.U = j5.getFloat(a.o.Lo, 1.0f);
        k1(Float.valueOf(this.T));
        this.f14135b0 = j5.getFloat(a.o.Jo, 0.0f);
        int i6 = a.o.Zo;
        boolean hasValue = j5.hasValue(i6);
        int i7 = hasValue ? i6 : a.o.bp;
        if (!hasValue) {
            i6 = a.o.ap;
        }
        ColorStateList a6 = com.google.android.material.resources.c.a(context, j5, i7);
        if (a6 == null) {
            a6 = androidx.appcompat.content.res.a.c(context, a.e.f29404r1);
        }
        e1(a6);
        ColorStateList a7 = com.google.android.material.resources.c.a(context, j5, i6);
        if (a7 == null) {
            a7 = androidx.appcompat.content.res.a.c(context, a.e.f29392o1);
        }
        c1(a7);
        this.f14147n0.p0(com.google.android.material.resources.c.a(context, j5, a.o.Qo));
        int i8 = a.o.To;
        if (j5.hasValue(i8)) {
            T0(com.google.android.material.resources.c.a(context, j5, i8));
        }
        V0(j5.getDimension(a.o.Uo, 0.0f));
        ColorStateList a8 = com.google.android.material.resources.c.a(context, j5, a.o.Mo);
        if (a8 == null) {
            a8 = androidx.appcompat.content.res.a.c(context, a.e.f29396p1);
        }
        K0(a8);
        this.f14137d0 = j5.getBoolean(a.o.Yo, true);
        int i9 = a.o.Vo;
        boolean hasValue2 = j5.hasValue(i9);
        int i10 = hasValue2 ? i9 : a.o.Xo;
        if (!hasValue2) {
            i9 = a.o.Wo;
        }
        ColorStateList a9 = com.google.android.material.resources.c.a(context, j5, i10);
        if (a9 == null) {
            a9 = androidx.appcompat.content.res.a.c(context, a.e.f29400q1);
        }
        Z0(a9);
        ColorStateList a10 = com.google.android.material.resources.c.a(context, j5, i9);
        if (a10 == null) {
            a10 = androidx.appcompat.content.res.a.c(context, a.e.f29388n1);
        }
        Y0(a10);
        R0(j5.getDimensionPixelSize(a.o.So, 0));
        I0(j5.getDimensionPixelSize(a.o.No, 0));
        P0(j5.getDimension(a.o.Ro, 0.0f));
        d1(j5.getDimensionPixelSize(a.o.cp, 0));
        this.I = j5.getInt(a.o.Oo, 0);
        if (!j5.getBoolean(a.o.Ho, true)) {
            setEnabled(false);
        }
        j5.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String D(float f6) {
        if (j0()) {
            return this.R.a(f6);
        }
        return String.format(((float) ((int) f6)) == f6 ? ProtectedSandApp.s("\u125e") : ProtectedSandApp.s("\u125f"), Float.valueOf(f6));
    }

    private float[] F() {
        float floatValue = ((Float) Collections.max(i0())).floatValue();
        float floatValue2 = ((Float) Collections.min(i0())).floatValue();
        if (this.V.size() == 1) {
            floatValue2 = this.T;
        }
        float v02 = v0(floatValue2);
        float v03 = v0(floatValue);
        return m0() ? new float[]{v03, v02} : new float[]{v02, v03};
    }

    private void F0(int i5) {
        BaseSlider<S, L, T>.d dVar = this.f14158w;
        if (dVar == null) {
            this.f14158w = new d(this, null);
        } else {
            removeCallbacks(dVar);
        }
        this.f14158w.a(i5);
        postDelayed(this.f14158w, 200L);
    }

    private static float H(ValueAnimator valueAnimator, float f6) {
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return f6;
        }
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator.cancel();
        return floatValue;
    }

    private float I(int i5, float f6) {
        float O = this.f14135b0 == 0.0f ? O() : 0.0f;
        if (this.f14151p0 == 0) {
            O = t(O);
        }
        if (m0()) {
            O = -O;
        }
        int i6 = i5 + 1;
        int i7 = i5 - 1;
        return o.a.d(f6, i7 < 0 ? this.T : this.V.get(i7).floatValue() + O, i6 >= this.V.size() ? this.U : this.V.get(i6).floatValue() - O);
    }

    @l
    private int J(@o0 ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    private float f0() {
        double o12 = o1(this.f14149o0);
        if (m0()) {
            o12 = 1.0d - o12;
        }
        float f6 = this.U;
        return (float) ((o12 * (f6 - r3)) + this.T);
    }

    private float g0() {
        float f6 = this.f14149o0;
        if (m0()) {
            f6 = 1.0f - f6;
        }
        float f7 = this.U;
        float f8 = this.T;
        return androidx.appcompat.graphics.drawable.d.a(f7, f8, f6, f8);
    }

    private void g1(com.google.android.material.tooltip.a aVar, float f6) {
        aVar.n1(D(f6));
        int v02 = (this.K + ((int) (v0(f6) * this.f14138e0))) - (aVar.getIntrinsicWidth() / 2);
        int n5 = n() - (this.O + this.M);
        aVar.setBounds(v02, n5 - aVar.getIntrinsicHeight(), aVar.getIntrinsicWidth() + v02, n5);
        Rect rect = new Rect(aVar.getBounds());
        com.google.android.material.internal.c.c(v.f(this), this, rect);
        aVar.setBounds(rect);
        v.g(this).a(aVar);
    }

    private void j(com.google.android.material.tooltip.a aVar) {
        aVar.l1(v.f(this));
    }

    private Float k(int i5) {
        float m5 = this.f14140g0 ? m(20) : l();
        if (i5 == 21) {
            if (!m0()) {
                m5 = -m5;
            }
            return Float.valueOf(m5);
        }
        if (i5 == 22) {
            if (m0()) {
                m5 = -m5;
            }
            return Float.valueOf(m5);
        }
        if (i5 == 69) {
            return Float.valueOf(-m5);
        }
        if (i5 == 70 || i5 == 81) {
            return Float.valueOf(m5);
        }
        return null;
    }

    private void k0() {
        this.f14148o.setStrokeWidth(this.J);
        this.f14150p.setStrokeWidth(this.J);
        this.f14154s.setStrokeWidth(this.J / 2.0f);
        this.f14155t.setStrokeWidth(this.J / 2.0f);
    }

    private float l() {
        float f6 = this.f14135b0;
        if (f6 == 0.0f) {
            return 1.0f;
        }
        return f6;
    }

    private boolean l0() {
        ViewParent parent = getParent();
        while (true) {
            if (!(parent instanceof ViewGroup)) {
                return false;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = parent.getParent();
        }
    }

    private void l1(@o0 ArrayList<Float> arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("በ"));
        }
        Collections.sort(arrayList);
        if (this.V.size() == arrayList.size() && this.V.equals(arrayList)) {
            return;
        }
        this.V = arrayList;
        this.f14141h0 = true;
        this.f14134a0 = 0;
        s1();
        r();
        v();
        postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float m(int i5) {
        float l5 = l();
        return (this.U - this.T) / l5 <= i5 ? l5 : Math.round(r1 / r4) * l5;
    }

    private boolean m1() {
        return this.f14139f0 || !(getBackground() instanceof RippleDrawable);
    }

    private int n() {
        return this.L + (this.I == 1 ? this.f14160y.get(0).getIntrinsicHeight() : 0);
    }

    private boolean n1(float f6) {
        return p1(this.W, f6);
    }

    private void o0(@o0 Resources resources) {
        this.H = resources.getDimensionPixelSize(a.f.W5);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(a.f.U5);
        this.F = dimensionPixelOffset;
        this.K = dimensionPixelOffset;
        this.G = resources.getDimensionPixelSize(a.f.S5);
        this.L = resources.getDimensionPixelOffset(a.f.V5);
        this.O = resources.getDimensionPixelSize(a.f.O5);
    }

    private double o1(float f6) {
        float f7 = this.f14135b0;
        if (f7 <= 0.0f) {
            return f6;
        }
        return Math.round(f6 * r0) / ((int) ((this.U - this.T) / f7));
    }

    private void p0() {
        if (this.f14135b0 <= 0.0f) {
            return;
        }
        u1();
        int min = Math.min((int) (((this.U - this.T) / this.f14135b0) + 1.0f), (this.f14138e0 / (this.J * 2)) + 1);
        float[] fArr = this.f14136c0;
        if (fArr == null || fArr.length != min * 2) {
            this.f14136c0 = new float[min * 2];
        }
        float f6 = this.f14138e0 / (min - 1);
        for (int i5 = 0; i5 < min * 2; i5 += 2) {
            float[] fArr2 = this.f14136c0;
            fArr2[i5] = ((i5 / 2) * f6) + this.K;
            fArr2[i5 + 1] = n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p1(int i5, float f6) {
        if (Math.abs(f6 - this.V.get(i5).floatValue()) < f14133z0) {
            return false;
        }
        this.V.set(i5, Float.valueOf(I(i5, f6)));
        this.f14134a0 = i5;
        u(i5);
        return true;
    }

    private ValueAnimator q(boolean z5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(H(z5 ? this.D : this.C, z5 ? 0.0f : 1.0f), z5 ? 1.0f : 0.0f);
        ofFloat.setDuration(z5 ? D0 : E0);
        ofFloat.setInterpolator(z5 ? com.google.android.material.animation.a.f12782e : com.google.android.material.animation.a.f12780c);
        ofFloat.addUpdateListener(new b());
        return ofFloat;
    }

    private void q0(@o0 Canvas canvas, int i5, int i6) {
        if (m1()) {
            int v02 = (int) ((v0(this.V.get(this.f14134a0).floatValue()) * i5) + this.K);
            if (Build.VERSION.SDK_INT < 28) {
                int i7 = this.N;
                canvas.clipRect(v02 - i7, i6 - i7, v02 + i7, i7 + i6, Region.Op.UNION);
            }
            canvas.drawCircle(v02, i6, this.N, this.f14153r);
        }
    }

    private boolean q1() {
        return n1(f0());
    }

    private void r() {
        if (this.f14160y.size() > this.V.size()) {
            List<com.google.android.material.tooltip.a> subList = this.f14160y.subList(this.V.size(), this.f14160y.size());
            for (com.google.android.material.tooltip.a aVar : subList) {
                if (y1.O0(this)) {
                    s(aVar);
                }
            }
            subList.clear();
        }
        while (this.f14160y.size() < this.V.size()) {
            com.google.android.material.tooltip.a a6 = this.f14159x.a();
            this.f14160y.add(a6);
            if (y1.O0(this)) {
                j(a6);
            }
        }
        int i5 = this.f14160y.size() == 1 ? 0 : 1;
        Iterator<com.google.android.material.tooltip.a> it = this.f14160y.iterator();
        while (it.hasNext()) {
            it.next().J0(i5);
        }
    }

    private void r0(@o0 Canvas canvas) {
        if (!this.f14137d0 || this.f14135b0 <= 0.0f) {
            return;
        }
        float[] F = F();
        int B02 = B0(this.f14136c0, F[0]);
        int B03 = B0(this.f14136c0, F[1]);
        int i5 = B02 * 2;
        canvas.drawPoints(this.f14136c0, 0, i5, this.f14154s);
        int i6 = B03 * 2;
        canvas.drawPoints(this.f14136c0, i5, i6 - i5, this.f14155t);
        float[] fArr = this.f14136c0;
        canvas.drawPoints(fArr, i6, fArr.length - i6, this.f14154s);
    }

    private void s(com.google.android.material.tooltip.a aVar) {
        u g5 = v.g(this);
        if (g5 != null) {
            g5.b(aVar);
            aVar.Y0(v.f(this));
        }
    }

    private void s0() {
        this.K = this.F + Math.max(this.M - this.G, 0);
        if (y1.U0(this)) {
            t1(getWidth());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s1() {
        if (m1() || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            int v02 = (int) ((v0(this.V.get(this.f14134a0).floatValue()) * this.f14138e0) + this.K);
            int n5 = n();
            int i5 = this.N;
            androidx.core.graphics.drawable.d.l(background, v02 - i5, n5 - i5, v02 + i5, n5 + i5);
        }
    }

    private float t(float f6) {
        if (f6 == 0.0f) {
            return 0.0f;
        }
        float f7 = (f6 - this.K) / this.f14138e0;
        float f8 = this.T;
        return androidx.appcompat.graphics.drawable.d.a(f8, this.U, f7, f8);
    }

    private boolean t0(int i5) {
        int i6 = this.f14134a0;
        int f6 = (int) o.a.f(i6 + i5, 0L, this.V.size() - 1);
        this.f14134a0 = f6;
        if (f6 == i6) {
            return false;
        }
        if (this.W != -1) {
            this.W = f6;
        }
        s1();
        postInvalidate();
        return true;
    }

    private void t1(int i5) {
        this.f14138e0 = Math.max(i5 - (this.K * 2), 0);
        p0();
    }

    private void u(int i5) {
        Iterator<L> it = this.f14161z.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.V.get(i5).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.f14157v;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        F0(i5);
    }

    private boolean u0(int i5) {
        if (m0()) {
            i5 = i5 == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i5;
        }
        return t0(i5);
    }

    private void u1() {
        if (this.f14141h0) {
            w1();
            x1();
            v1();
            y1();
            B1();
            this.f14141h0 = false;
        }
    }

    private void v() {
        for (L l5 : this.f14161z) {
            Iterator<Float> it = this.V.iterator();
            while (it.hasNext()) {
                l5.a(this, it.next().floatValue(), false);
            }
        }
    }

    private float v0(float f6) {
        float f7 = this.T;
        float f8 = (f6 - f7) / (this.U - f7);
        return m0() ? 1.0f - f8 : f8;
    }

    private void v1() {
        if (this.f14135b0 > 0.0f && !z1(this.U)) {
            throw new IllegalStateException(String.format(ProtectedSandApp.s("ቡ"), Float.toString(this.f14135b0), Float.toString(this.T), Float.toString(this.U)));
        }
    }

    private void w(@o0 Canvas canvas, int i5, int i6) {
        float[] F = F();
        int i7 = this.K;
        float f6 = i5;
        float f7 = i6;
        canvas.drawLine((F[0] * f6) + i7, f7, (F[1] * f6) + i7, f7, this.f14150p);
    }

    private Boolean w0(int i5, @o0 KeyEvent keyEvent) {
        if (i5 == 61) {
            return keyEvent.hasNoModifiers() ? Boolean.valueOf(t0(1)) : keyEvent.isShiftPressed() ? Boolean.valueOf(t0(-1)) : Boolean.FALSE;
        }
        if (i5 != 66) {
            if (i5 != 81) {
                if (i5 == 69) {
                    t0(-1);
                    return Boolean.TRUE;
                }
                if (i5 != 70) {
                    switch (i5) {
                        case 21:
                            u0(-1);
                            break;
                        case 22:
                            u0(1);
                            break;
                    }
                    return Boolean.TRUE;
                }
            }
            t0(1);
            return Boolean.TRUE;
        }
        this.W = this.f14134a0;
        postInvalidate();
        return Boolean.TRUE;
    }

    private void w1() {
        if (this.T >= this.U) {
            throw new IllegalStateException(String.format(ProtectedSandApp.s("ቢ"), Float.toString(this.T), Float.toString(this.U)));
        }
    }

    private void x(@o0 Canvas canvas, int i5, int i6) {
        float[] F = F();
        float f6 = i5;
        float f7 = (F[1] * f6) + this.K;
        if (f7 < r1 + i5) {
            float f8 = i6;
            canvas.drawLine(f7, f8, r1 + i5, f8, this.f14148o);
        }
        int i7 = this.K;
        float f9 = (F[0] * f6) + i7;
        if (f9 > i7) {
            float f10 = i6;
            canvas.drawLine(i7, f10, f9, f10, this.f14148o);
        }
    }

    private void x0() {
        Iterator<T> it = this.A.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private void x1() {
        if (this.U <= this.T) {
            throw new IllegalStateException(String.format(ProtectedSandApp.s("ባ"), Float.toString(this.U), Float.toString(this.T)));
        }
    }

    private void y(@o0 Canvas canvas, int i5, int i6) {
        if (!isEnabled()) {
            Iterator<Float> it = this.V.iterator();
            while (it.hasNext()) {
                canvas.drawCircle((v0(it.next().floatValue()) * i5) + this.K, i6, this.M, this.f14152q);
            }
        }
        Iterator<Float> it2 = this.V.iterator();
        while (it2.hasNext()) {
            Float next = it2.next();
            canvas.save();
            int v02 = this.K + ((int) (v0(next.floatValue()) * i5));
            int i7 = this.M;
            canvas.translate(v02 - i7, i6 - i7);
            this.f14147n0.draw(canvas);
            canvas.restore();
        }
    }

    private void y0() {
        Iterator<T> it = this.A.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    private void y1() {
        Iterator<Float> it = this.V.iterator();
        while (it.hasNext()) {
            Float next = it.next();
            if (next.floatValue() < this.T || next.floatValue() > this.U) {
                throw new IllegalStateException(String.format(ProtectedSandApp.s("ብ"), Float.toString(next.floatValue()), Float.toString(this.T), Float.toString(this.U)));
            }
            if (this.f14135b0 > 0.0f && !z1(next.floatValue())) {
                throw new IllegalStateException(String.format(ProtectedSandApp.s("ቤ"), Float.toString(next.floatValue()), Float.toString(this.T), Float.toString(this.f14135b0), Float.toString(this.f14135b0)));
            }
        }
    }

    private void z() {
        if (this.I == 2) {
            return;
        }
        if (!this.B) {
            this.B = true;
            ValueAnimator q5 = q(true);
            this.C = q5;
            this.D = null;
            q5.start();
        }
        Iterator<com.google.android.material.tooltip.a> it = this.f14160y.iterator();
        for (int i5 = 0; i5 < this.V.size() && it.hasNext(); i5++) {
            if (i5 != this.f14134a0) {
                g1(it.next(), this.V.get(i5).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format(ProtectedSandApp.s("ቦ"), Integer.valueOf(this.f14160y.size()), Integer.valueOf(this.V.size())));
        }
        g1(it.next(), this.V.get(this.f14134a0).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o0
    public static com.google.android.material.tooltip.a z0(@o0 Context context, @o0 TypedArray typedArray) {
        return com.google.android.material.tooltip.a.W0(context, null, 0, typedArray.getResourceId(a.o.Po, a.n.Rc));
    }

    private boolean z1(float f6) {
        double doubleValue = new BigDecimal(Float.toString(f6)).subtract(new BigDecimal(Float.toString(this.T))).divide(new BigDecimal(Float.toString(this.f14135b0)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(doubleValue)) - doubleValue) < f14133z0;
    }

    protected boolean A0() {
        if (this.W != -1) {
            return true;
        }
        float g02 = g0();
        float A1 = A1(g02);
        this.W = 0;
        float abs = Math.abs(this.V.get(0).floatValue() - g02);
        for (int i5 = 1; i5 < this.V.size(); i5++) {
            float abs2 = Math.abs(this.V.get(i5).floatValue() - g02);
            float A12 = A1(this.V.get(i5).floatValue());
            if (Float.compare(abs2, abs) > 1) {
                break;
            }
            boolean z5 = !m0() ? A12 - A1 >= 0.0f : A12 - A1 <= 0.0f;
            if (Float.compare(abs2, abs) < 0) {
                this.W = i5;
            } else {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else {
                    if (Math.abs(A12 - A1) < this.E) {
                        this.W = -1;
                        return false;
                    }
                    if (z5) {
                        this.W = i5;
                    }
                }
            }
            abs = abs2;
        }
        return this.W != -1;
    }

    @m1
    void C(boolean z5) {
        this.f14139f0 = z5;
    }

    public void D0(@o0 L l5) {
        this.f14161z.remove(l5);
    }

    @m1
    final int E() {
        return this.f14156u.x();
    }

    public void E0(@o0 T t5) {
        this.A.remove(t5);
    }

    public int G() {
        return this.W;
    }

    protected void G0(int i5) {
        this.W = i5;
    }

    public void H0(int i5) {
        if (i5 < 0 || i5 >= this.V.size()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ቧ"));
        }
        this.f14134a0 = i5;
        this.f14156u.X(i5);
        postInvalidate();
    }

    public void I0(@androidx.annotation.g0(from = 0) @r int i5) {
        if (i5 == this.N) {
            return;
        }
        this.N = i5;
        Drawable background = getBackground();
        if (m1() || !(background instanceof RippleDrawable)) {
            postInvalidate();
        } else {
            ((RippleDrawable) background).setRadius(this.N);
        }
    }

    public void J0(@q int i5) {
        I0(getResources().getDimensionPixelSize(i5));
    }

    public int K() {
        return this.f14134a0;
    }

    public void K0(@o0 ColorStateList colorStateList) {
        if (colorStateList.equals(this.f14142i0)) {
            return;
        }
        this.f14142i0 = colorStateList;
        Drawable background = getBackground();
        if (!m1() && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.f14153r.setColor(J(colorStateList));
        this.f14153r.setAlpha(63);
        invalidate();
    }

    @r
    public int L() {
        return this.N;
    }

    public void L0(int i5) {
        if (this.I != i5) {
            this.I = i5;
            requestLayout();
        }
    }

    @o0
    public ColorStateList M() {
        return this.f14142i0;
    }

    public void M0(@q0 com.google.android.material.slider.d dVar) {
        this.R = dVar;
    }

    public int N() {
        return this.I;
    }

    protected void N0(int i5) {
        this.f14151p0 = i5;
    }

    protected float O() {
        return 0.0f;
    }

    public void O0(float f6) {
        if (f6 < 0.0f) {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("ቨ"), Float.toString(f6), Float.toString(this.T), Float.toString(this.U)));
        }
        if (this.f14135b0 != f6) {
            this.f14135b0 = f6;
            this.f14141h0 = true;
            postInvalidate();
        }
    }

    public float P() {
        return this.f14135b0;
    }

    public void P0(float f6) {
        this.f14147n0.o0(f6);
    }

    public float Q() {
        return this.f14147n0.z();
    }

    public void Q0(@q int i5) {
        P0(getResources().getDimension(i5));
    }

    @r
    public int R() {
        return this.M;
    }

    public void R0(@androidx.annotation.g0(from = 0) @r int i5) {
        if (i5 == this.M) {
            return;
        }
        this.M = i5;
        s0();
        this.f14147n0.g(o.a().q(0, this.M).m());
        j jVar = this.f14147n0;
        int i6 = this.M;
        jVar.setBounds(0, 0, i6 * 2, i6 * 2);
        postInvalidate();
    }

    public ColorStateList S() {
        return this.f14147n0.O();
    }

    public void S0(@q int i5) {
        R0(getResources().getDimensionPixelSize(i5));
    }

    public float T() {
        return this.f14147n0.R();
    }

    public void T0(@q0 ColorStateList colorStateList) {
        this.f14147n0.G0(colorStateList);
        postInvalidate();
    }

    @o0
    public ColorStateList U() {
        return this.f14147n0.A();
    }

    public void U0(@androidx.annotation.n int i5) {
        if (i5 != 0) {
            T0(androidx.appcompat.content.res.a.c(getContext(), i5));
        }
    }

    @o0
    public ColorStateList V() {
        return this.f14143j0;
    }

    public void V0(float f6) {
        this.f14147n0.J0(f6);
        postInvalidate();
    }

    @o0
    public ColorStateList W() {
        return this.f14144k0;
    }

    public void W0(@q int i5) {
        if (i5 != 0) {
            V0(getResources().getDimension(i5));
        }
    }

    @o0
    public ColorStateList X() {
        if (this.f14144k0.equals(this.f14143j0)) {
            return this.f14143j0;
        }
        throw new IllegalStateException(ProtectedSandApp.s("ቩ"));
    }

    public void X0(@o0 ColorStateList colorStateList) {
        if (colorStateList.equals(this.f14147n0.A())) {
            return;
        }
        this.f14147n0.p0(colorStateList);
        invalidate();
    }

    @o0
    public ColorStateList Y() {
        return this.f14145l0;
    }

    public void Y0(@o0 ColorStateList colorStateList) {
        if (colorStateList.equals(this.f14143j0)) {
            return;
        }
        this.f14143j0 = colorStateList;
        this.f14155t.setColor(J(colorStateList));
        invalidate();
    }

    @r
    public int Z() {
        return this.J;
    }

    public void Z0(@o0 ColorStateList colorStateList) {
        if (colorStateList.equals(this.f14144k0)) {
            return;
        }
        this.f14144k0 = colorStateList;
        this.f14154s.setColor(J(colorStateList));
        invalidate();
    }

    @o0
    public ColorStateList a0() {
        return this.f14146m0;
    }

    public void a1(@o0 ColorStateList colorStateList) {
        Z0(colorStateList);
        Y0(colorStateList);
    }

    @r
    public int b0() {
        return this.K;
    }

    public void b1(boolean z5) {
        if (this.f14137d0 != z5) {
            this.f14137d0 = z5;
            postInvalidate();
        }
    }

    @o0
    public ColorStateList c0() {
        if (this.f14146m0.equals(this.f14145l0)) {
            return this.f14145l0;
        }
        throw new IllegalStateException(ProtectedSandApp.s("ቪ"));
    }

    public void c1(@o0 ColorStateList colorStateList) {
        if (colorStateList.equals(this.f14145l0)) {
            return;
        }
        this.f14145l0 = colorStateList;
        this.f14150p.setColor(J(colorStateList));
        invalidate();
    }

    @r
    public int d0() {
        return this.f14138e0;
    }

    public void d1(@androidx.annotation.g0(from = 0) @r int i5) {
        if (this.J != i5) {
            this.J = i5;
            k0();
            postInvalidate();
        }
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@o0 MotionEvent motionEvent) {
        return this.f14156u.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(@o0 KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f14148o.setColor(J(this.f14146m0));
        this.f14150p.setColor(J(this.f14145l0));
        this.f14154s.setColor(J(this.f14144k0));
        this.f14155t.setColor(J(this.f14143j0));
        for (com.google.android.material.tooltip.a aVar : this.f14160y) {
            if (aVar.isStateful()) {
                aVar.setState(getDrawableState());
            }
        }
        if (this.f14147n0.isStateful()) {
            this.f14147n0.setState(getDrawableState());
        }
        this.f14153r.setColor(J(this.f14142i0));
        this.f14153r.setAlpha(63);
    }

    public float e0() {
        return this.T;
    }

    public void e1(@o0 ColorStateList colorStateList) {
        if (colorStateList.equals(this.f14146m0)) {
            return;
        }
        this.f14146m0 = colorStateList;
        this.f14148o.setColor(J(colorStateList));
        invalidate();
    }

    public void f1(@o0 ColorStateList colorStateList) {
        e1(colorStateList);
        c1(colorStateList);
    }

    @Override // android.view.View
    @o0
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public void h(@q0 L l5) {
        this.f14161z.add(l5);
    }

    public float h0() {
        return this.U;
    }

    public void h1(float f6) {
        this.T = f6;
        this.f14141h0 = true;
        postInvalidate();
    }

    public void i(@o0 T t5) {
        this.A.add(t5);
    }

    @o0
    List<Float> i0() {
        return new ArrayList(this.V);
    }

    public void i1(float f6) {
        this.U = f6;
        this.f14141h0 = true;
        postInvalidate();
    }

    public boolean j0() {
        return this.R != null;
    }

    void j1(@o0 List<Float> list) {
        l1(new ArrayList<>(list));
    }

    void k1(@o0 Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        l1(arrayList);
    }

    final boolean m0() {
        return y1.Z(this) == 1;
    }

    public boolean n0() {
        return this.f14137d0;
    }

    public void o() {
        this.f14161z.clear();
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Iterator<com.google.android.material.tooltip.a> it = this.f14160y.iterator();
        while (it.hasNext()) {
            j(it.next());
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        BaseSlider<S, L, T>.d dVar = this.f14158w;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
        this.B = false;
        Iterator<com.google.android.material.tooltip.a> it = this.f14160y.iterator();
        while (it.hasNext()) {
            s(it.next());
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(@o0 Canvas canvas) {
        if (this.f14141h0) {
            u1();
            p0();
        }
        super.onDraw(canvas);
        int n5 = n();
        x(canvas, this.f14138e0, n5);
        if (((Float) Collections.max(i0())).floatValue() > this.T) {
            w(canvas, this.f14138e0, n5);
        }
        r0(canvas);
        if ((this.S || isFocused()) && isEnabled()) {
            q0(canvas, this.f14138e0, n5);
            if (this.W != -1) {
                z();
            }
        }
        y(canvas, this.f14138e0, n5);
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z5, int i5, @q0 Rect rect) {
        super.onFocusChanged(z5, i5, rect);
        if (z5) {
            B(i5);
            this.f14156u.X(this.f14134a0);
        } else {
            this.W = -1;
            A();
            this.f14156u.o(this.f14134a0);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i5, @o0 KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i5, keyEvent);
        }
        if (this.V.size() == 1) {
            this.W = 0;
        }
        if (this.W == -1) {
            Boolean w02 = w0(i5, keyEvent);
            return w02 != null ? w02.booleanValue() : super.onKeyDown(i5, keyEvent);
        }
        this.f14140g0 |= keyEvent.isLongPress();
        Float k5 = k(i5);
        if (k5 != null) {
            if (n1(k5.floatValue() + this.V.get(this.W).floatValue())) {
                s1();
                postInvalidate();
            }
            return true;
        }
        if (i5 != 23) {
            if (i5 == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return t0(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return t0(-1);
                }
                return false;
            }
            if (i5 != 66) {
                return super.onKeyDown(i5, keyEvent);
            }
        }
        this.W = -1;
        A();
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i5, @o0 KeyEvent keyEvent) {
        this.f14140g0 = false;
        return super.onKeyUp(i5, keyEvent);
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        super.onMeasure(i5, View.MeasureSpec.makeMeasureSpec(this.H + (this.I == 1 ? this.f14160y.get(0).getIntrinsicHeight() : 0), androidx.constraintlayout.solver.widgets.analyzer.b.f2366g));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.T = sliderState.f14162o;
        this.U = sliderState.f14163p;
        l1(sliderState.f14164q);
        this.f14135b0 = sliderState.f14165r;
        if (sliderState.f14166s) {
            requestFocus();
        }
        v();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f14162o = this.T;
        sliderState.f14163p = this.U;
        sliderState.f14164q = new ArrayList<>(this.V);
        sliderState.f14165r = this.f14135b0;
        sliderState.f14166s = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i5, int i6, int i7, int i8) {
        t1(i5);
        s1();
    }

    @Override // android.view.View
    public boolean onTouchEvent(@o0 MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float x5 = motionEvent.getX();
        float f6 = (x5 - this.K) / this.f14138e0;
        this.f14149o0 = f6;
        float max = Math.max(0.0f, f6);
        this.f14149o0 = max;
        this.f14149o0 = Math.min(1.0f, max);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.P = x5;
            if (!l0()) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (A0()) {
                    requestFocus();
                    this.S = true;
                    q1();
                    s1();
                    invalidate();
                    x0();
                }
            }
        } else if (actionMasked == 1) {
            this.S = false;
            MotionEvent motionEvent2 = this.Q;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.Q.getX() - motionEvent.getX()) <= this.E && Math.abs(this.Q.getY() - motionEvent.getY()) <= this.E && A0()) {
                x0();
            }
            if (this.W != -1) {
                q1();
                this.W = -1;
                y0();
            }
            A();
            invalidate();
        } else if (actionMasked == 2) {
            if (!this.S) {
                if (l0() && Math.abs(x5 - this.P) < this.E) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                x0();
            }
            if (A0()) {
                this.S = true;
                q1();
                s1();
                invalidate();
            }
        }
        setPressed(this.S);
        this.Q = MotionEvent.obtain(motionEvent);
        return true;
    }

    public void p() {
        this.A.clear();
    }

    void r1(int i5, Rect rect) {
        int v02 = this.K + ((int) (v0(i0().get(i5).floatValue()) * this.f14138e0));
        int n5 = n();
        int i6 = this.M;
        rect.set(v02 - i6, n5 - i6, v02 + i6, n5 + i6);
    }

    @Override // android.view.View
    public void setEnabled(boolean z5) {
        super.setEnabled(z5);
        setLayerType(z5 ? 0 : 2, null);
    }

    private class d implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        int f14172o;

        private d() {
            this.f14172o = -1;
        }

        void a(int i5) {
            this.f14172o = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSlider.this.f14156u.Y(this.f14172o, 4);
        }

        /* synthetic */ d(BaseSlider baseSlider, a aVar) {
            this();
        }
    }

    public BaseSlider(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.Kc);
    }

    public BaseSlider(@o0 Context context, @q0 AttributeSet attributeSet, int i5) {
        super(v1.a.c(context, attributeSet, i5, A0), attributeSet, i5);
        this.f14160y = new ArrayList();
        this.f14161z = new ArrayList();
        this.A = new ArrayList();
        this.B = false;
        this.S = false;
        this.V = new ArrayList<>();
        this.W = -1;
        this.f14134a0 = -1;
        this.f14135b0 = 0.0f;
        this.f14137d0 = true;
        this.f14140g0 = false;
        j jVar = new j();
        this.f14147n0 = jVar;
        this.f14151p0 = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f14148o = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.f14150p = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint(1);
        this.f14152q = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.f14153r = paint4;
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.f14154s = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        Paint paint6 = new Paint();
        this.f14155t = paint6;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeCap(Paint.Cap.ROUND);
        o0(context2.getResources());
        this.f14159x = new a(attributeSet, i5);
        C0(context2, attributeSet, i5);
        setFocusable(true);
        setClickable(true);
        jVar.y0(2);
        this.E = ViewConfiguration.get(context2).getScaledTouchSlop();
        e eVar = new e(this);
        this.f14156u = eVar;
        y1.B1(this, eVar);
        this.f14157v = (AccessibilityManager) getContext().getSystemService(ProtectedSandApp.s("\u1259"));
    }
}
