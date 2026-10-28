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
import androidx.annotation.g0;
import androidx.annotation.l;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q;
import androidx.annotation.q0;
import androidx.annotation.r;
import androidx.core.view.accessibility.h0;
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
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
import s8.a;

/* loaded from: classes6.dex */
abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends com.google.android.material.slider.a<S>, T extends com.google.android.material.slider.b<S>> extends View {
    private static final int Y2 = 200;
    private static final int Z2 = 63;

    /* renamed from: a3, reason: collision with root package name */
    private static final double f53997a3 = 1.0E-4d;

    /* renamed from: c3, reason: collision with root package name */
    static final int f53999c3 = 1;

    /* renamed from: d3, reason: collision with root package name */
    static final int f54000d3 = 0;

    /* renamed from: e3, reason: collision with root package name */
    private static final long f54001e3 = 83;

    /* renamed from: f3, reason: collision with root package name */
    private static final long f54002f3 = 117;
    private int A;
    private int B;
    private float C;
    private MotionEvent D;
    private com.google.android.material.slider.d E;
    private boolean F;
    private float G;
    private float H;
    private ArrayList<Float> I;
    private int J;
    private int K;
    private float L;

    @o0
    private ColorStateList L2;
    private float[] M;

    @o0
    private ColorStateList M2;
    private boolean N;

    @o0
    private ColorStateList N2;
    private int O;

    @o0
    private final j O2;
    private boolean P;
    private float P2;
    private boolean Q;

    @o0
    private ColorStateList Q1;
    private int Q2;
    private boolean R;

    @o0
    private ColorStateList V1;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final Paint f54003b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    private final Paint f54004c;

    /* renamed from: d, reason: collision with root package name */
    @o0
    private final Paint f54005d;

    /* renamed from: e, reason: collision with root package name */
    @o0
    private final Paint f54006e;

    /* renamed from: f, reason: collision with root package name */
    @o0
    private final Paint f54007f;

    /* renamed from: g, reason: collision with root package name */
    @o0
    private final Paint f54008g;

    /* renamed from: h, reason: collision with root package name */
    @o0
    private final e f54009h;

    /* renamed from: i, reason: collision with root package name */
    private final AccessibilityManager f54010i;

    /* renamed from: j, reason: collision with root package name */
    private BaseSlider<S, L, T>.d f54011j;

    /* renamed from: k, reason: collision with root package name */
    @o0
    private final f f54012k;

    /* renamed from: l, reason: collision with root package name */
    @o0
    private final List<com.google.android.material.tooltip.a> f54013l;

    /* renamed from: m, reason: collision with root package name */
    @o0
    private final List<L> f54014m;

    /* renamed from: n, reason: collision with root package name */
    @o0
    private final List<T> f54015n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f54016o;

    /* renamed from: p, reason: collision with root package name */
    private ValueAnimator f54017p;

    /* renamed from: q, reason: collision with root package name */
    private ValueAnimator f54018q;

    /* renamed from: r, reason: collision with root package name */
    private final int f54019r;

    /* renamed from: s, reason: collision with root package name */
    private int f54020s;

    /* renamed from: t, reason: collision with root package name */
    private int f54021t;

    /* renamed from: u, reason: collision with root package name */
    private int f54022u;

    /* renamed from: v, reason: collision with root package name */
    private int f54023v;

    /* renamed from: w, reason: collision with root package name */
    private int f54024w;

    /* renamed from: x, reason: collision with root package name */
    private int f54025x;

    /* renamed from: y, reason: collision with root package name */
    private int f54026y;

    /* renamed from: z, reason: collision with root package name */
    private int f54027z;
    private static final String R2 = ProtectedSandApp.s("\uf211");
    private static final String X2 = ProtectedSandApp.s("\uf212");
    private static final String W2 = ProtectedSandApp.s("\uf213");
    private static final String V2 = ProtectedSandApp.s("\uf214");
    private static final String U2 = ProtectedSandApp.s("\uf215");
    private static final String T2 = ProtectedSandApp.s("\uf216");
    private static final String S2 = ProtectedSandApp.s("\uf217");

    /* renamed from: b3, reason: collision with root package name */
    static final int f53998b3 = a.n.mc;

    static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        float f54028b;

        /* renamed from: c, reason: collision with root package name */
        float f54029c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList<Float> f54030d;

        /* renamed from: e, reason: collision with root package name */
        float f54031e;

        /* renamed from: f, reason: collision with root package name */
        boolean f54032f;

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
            public SliderState[] b(int i4) {
                return new SliderState[i4];
            }

            @Override // android.os.Parcelable.Creator
            @o0
            public SliderState[] newArray(int i4) {
                return new SliderState[i4];
            }
        }

        /* synthetic */ SliderState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@o0 Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeFloat(this.f54028b);
            parcel.writeFloat(this.f54029c);
            parcel.writeList(this.f54030d);
            parcel.writeFloat(this.f54031e);
            parcel.writeBooleanArray(new boolean[]{this.f54032f});
        }

        SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        private SliderState(@o0 Parcel parcel) {
            super(parcel);
            this.f54028b = parcel.readFloat();
            this.f54029c = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.f54030d = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f54031e = parcel.readFloat();
            this.f54032f = parcel.createBooleanArray()[0];
        }
    }

    class a implements f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AttributeSet f54033a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f54034b;

        a(AttributeSet attributeSet, int i4) {
            this.f54033a = attributeSet;
            this.f54034b = i4;
        }

        @Override // com.google.android.material.slider.BaseSlider.f
        public com.google.android.material.tooltip.a a() {
            TypedArray j4 = n.j(BaseSlider.this.getContext(), this.f54033a, a.o.lq, this.f54034b, BaseSlider.f53998b3, new int[0]);
            com.google.android.material.tooltip.a z02 = BaseSlider.z0(BaseSlider.this.getContext(), j4);
            j4.recycle();
            return z02;
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            Iterator it = BaseSlider.this.f54013l.iterator();
            while (it.hasNext()) {
                ((com.google.android.material.tooltip.a) it.next()).m1(floatValue);
            }
            x1.t1(BaseSlider.this);
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            Iterator it = BaseSlider.this.f54013l.iterator();
            while (it.hasNext()) {
                v.g(BaseSlider.this).b((com.google.android.material.tooltip.a) it.next());
            }
        }
    }

    private static class e extends androidx.customview.widget.a {

        /* renamed from: u, reason: collision with root package name */
        private final BaseSlider<?, ?, ?> f54040u;

        /* renamed from: v, reason: collision with root package name */
        Rect f54041v;

        e(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.f54041v = new Rect();
            this.f54040u = baseSlider;
        }

        @o0
        private String e0(int i4) {
            return i4 == this.f54040u.i0().size() + (-1) ? this.f54040u.getContext().getString(a.m.f91213b0) : i4 == 0 ? this.f54040u.getContext().getString(a.m.f91215c0) : "";
        }

        @Override // androidx.customview.widget.a
        protected int G(float f4, float f5) {
            for (int i4 = 0; i4 < this.f54040u.i0().size(); i4++) {
                this.f54040u.r1(i4, this.f54041v);
                if (this.f54041v.contains((int) f4, (int) f5)) {
                    return i4;
                }
            }
            return -1;
        }

        @Override // androidx.customview.widget.a
        protected void H(List<Integer> list) {
            for (int i4 = 0; i4 < this.f54040u.i0().size(); i4++) {
                list.add(Integer.valueOf(i4));
            }
        }

        @Override // androidx.customview.widget.a
        protected boolean R(int i4, int i5, Bundle bundle) {
            if (!this.f54040u.isEnabled()) {
                return false;
            }
            if (i5 != 4096 && i5 != 8192) {
                if (i5 == 16908349 && bundle != null) {
                    String s4 = ProtectedSandApp.s("\uf20f");
                    if (bundle.containsKey(s4)) {
                        if (this.f54040u.p1(i4, bundle.getFloat(s4))) {
                            this.f54040u.s1();
                            this.f54040u.postInvalidate();
                            L(i4, 0);
                            return true;
                        }
                    }
                }
                return false;
            }
            float m4 = this.f54040u.m(20);
            if (i5 == 8192) {
                m4 = -m4;
            }
            if (this.f54040u.m0()) {
                m4 = -m4;
            }
            if (!this.f54040u.p1(i4, e1.a.d(this.f54040u.i0().get(i4).floatValue() + m4, this.f54040u.e0(), this.f54040u.h0()))) {
                return false;
            }
            this.f54040u.s1();
            this.f54040u.postInvalidate();
            L(i4, 0);
            return true;
        }

        @Override // androidx.customview.widget.a
        protected void V(int i4, h0 h0Var) {
            h0Var.b(h0.a.M);
            List<Float> i02 = this.f54040u.i0();
            float floatValue = i02.get(i4).floatValue();
            float e02 = this.f54040u.e0();
            float h02 = this.f54040u.h0();
            if (this.f54040u.isEnabled()) {
                if (floatValue > e02) {
                    h0Var.a(8192);
                }
                if (floatValue < h02) {
                    h0Var.a(4096);
                }
            }
            h0Var.T1(h0.h.e(1, e02, h02, floatValue));
            h0Var.j1(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.f54040u.getContentDescription() != null) {
                sb.append(this.f54040u.getContentDescription());
                sb.append(ProtectedSandApp.s("\uf210"));
            }
            if (i02.size() > 1) {
                sb.append(e0(i4));
                sb.append(this.f54040u.D(floatValue));
            }
            h0Var.o1(sb.toString());
            this.f54040u.r1(i4, this.f54041v);
            h0Var.d1(this.f54041v);
        }
    }

    private interface f {
        com.google.android.material.tooltip.a a();
    }

    public BaseSlider(@o0 Context context) {
        this(context, null);
    }

    private void A() {
        if (this.f54016o) {
            this.f54016o = false;
            ValueAnimator q4 = q(false);
            this.f54018q = q4;
            this.f54017p = null;
            q4.addListener(new c());
            this.f54018q.start();
        }
    }

    private float A1(float f4) {
        return (v0(f4) * this.O) + this.f54025x;
    }

    private void B(int i4) {
        if (i4 == 1) {
            t0(Integer.MAX_VALUE);
            return;
        }
        if (i4 == 2) {
            t0(Integer.MIN_VALUE);
        } else if (i4 == 17) {
            u0(Integer.MAX_VALUE);
        } else {
            if (i4 != 66) {
                return;
            }
            u0(Integer.MIN_VALUE);
        }
    }

    private static int B0(float[] fArr, float f4) {
        return Math.round(f4 * ((fArr.length / 2) - 1));
    }

    private void B1() {
        float f4 = this.L;
        if (f4 == 0.0f) {
            return;
        }
        float f5 = (int) f4;
        String s4 = ProtectedSandApp.s("\uf212");
        if (f5 != f4) {
            String.format(s4, ProtectedSandApp.s("\uf219"), Float.valueOf(f4));
        }
        float f6 = this.G;
        if (((int) f6) != f6) {
            String.format(s4, ProtectedSandApp.s("\uf21a"), Float.valueOf(f6));
        }
        float f7 = this.H;
        if (((int) f7) != f7) {
            String.format(s4, ProtectedSandApp.s("\uf21b"), Float.valueOf(f7));
        }
    }

    private void C0(Context context, AttributeSet attributeSet, int i4) {
        TypedArray j4 = n.j(context, attributeSet, a.o.lq, i4, f53998b3, new int[0]);
        this.G = j4.getFloat(a.o.pq, 0.0f);
        this.H = j4.getFloat(a.o.qq, 1.0f);
        k1(Float.valueOf(this.G));
        this.L = j4.getFloat(a.o.oq, 0.0f);
        int i5 = a.o.Eq;
        boolean hasValue = j4.hasValue(i5);
        int i6 = hasValue ? i5 : a.o.Gq;
        if (!hasValue) {
            i5 = a.o.Fq;
        }
        ColorStateList a5 = com.google.android.material.resources.c.a(context, j4, i6);
        if (a5 == null) {
            a5 = androidx.core.content.d.getColorStateList(context, a.e.f90732r1);
        }
        e1(a5);
        ColorStateList a6 = com.google.android.material.resources.c.a(context, j4, i5);
        if (a6 == null) {
            a6 = androidx.core.content.d.getColorStateList(context, a.e.f90720o1);
        }
        c1(a6);
        this.O2.p0(com.google.android.material.resources.c.a(context, j4, a.o.vq));
        int i7 = a.o.yq;
        if (j4.hasValue(i7)) {
            T0(com.google.android.material.resources.c.a(context, j4, i7));
        }
        V0(j4.getDimension(a.o.zq, 0.0f));
        ColorStateList a7 = com.google.android.material.resources.c.a(context, j4, a.o.rq);
        if (a7 == null) {
            a7 = androidx.core.content.d.getColorStateList(context, a.e.f90724p1);
        }
        K0(a7);
        this.N = j4.getBoolean(a.o.Dq, true);
        int i10 = a.o.Aq;
        boolean hasValue2 = j4.hasValue(i10);
        int i11 = hasValue2 ? i10 : a.o.Cq;
        if (!hasValue2) {
            i10 = a.o.Bq;
        }
        ColorStateList a8 = com.google.android.material.resources.c.a(context, j4, i11);
        if (a8 == null) {
            a8 = androidx.core.content.d.getColorStateList(context, a.e.f90728q1);
        }
        Z0(a8);
        ColorStateList a10 = com.google.android.material.resources.c.a(context, j4, i10);
        if (a10 == null) {
            a10 = androidx.core.content.d.getColorStateList(context, a.e.f90716n1);
        }
        Y0(a10);
        R0(j4.getDimensionPixelSize(a.o.xq, 0));
        I0(j4.getDimensionPixelSize(a.o.sq, 0));
        P0(j4.getDimension(a.o.wq, 0.0f));
        d1(j4.getDimensionPixelSize(a.o.Hq, 0));
        this.f54023v = j4.getInt(a.o.tq, 0);
        if (!j4.getBoolean(a.o.mq, true)) {
            setEnabled(false);
        }
        j4.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String D(float f4) {
        if (j0()) {
            return this.E.a(f4);
        }
        return String.format(((float) ((int) f4)) == f4 ? ProtectedSandApp.s("\uf21c") : ProtectedSandApp.s("\uf21d"), Float.valueOf(f4));
    }

    private float[] F() {
        float floatValue = ((Float) Collections.max(i0())).floatValue();
        float floatValue2 = ((Float) Collections.min(i0())).floatValue();
        if (this.I.size() == 1) {
            floatValue2 = this.G;
        }
        float v02 = v0(floatValue2);
        float v03 = v0(floatValue);
        return m0() ? new float[]{v03, v02} : new float[]{v02, v03};
    }

    private void F0(int i4) {
        BaseSlider<S, L, T>.d dVar = this.f54011j;
        if (dVar == null) {
            this.f54011j = new d(this, null);
        } else {
            removeCallbacks(dVar);
        }
        this.f54011j.a(i4);
        postDelayed(this.f54011j, 200L);
    }

    private static float H(ValueAnimator valueAnimator, float f4) {
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return f4;
        }
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator.cancel();
        return floatValue;
    }

    private float I(int i4, float f4) {
        float O = this.L == 0.0f ? O() : 0.0f;
        if (this.Q2 == 0) {
            O = t(O);
        }
        if (m0()) {
            O = -O;
        }
        int i5 = i4 + 1;
        int i6 = i4 - 1;
        return e1.a.d(f4, i6 < 0 ? this.G : this.I.get(i6).floatValue() + O, i5 >= this.I.size() ? this.H : this.I.get(i5).floatValue() - O);
    }

    @l
    private int J(@o0 ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    private float f0() {
        double o12 = o1(this.P2);
        if (m0()) {
            o12 = 1.0d - o12;
        }
        float f4 = this.H;
        return (float) ((o12 * (f4 - r3)) + this.G);
    }

    private float g0() {
        float f4 = this.P2;
        if (m0()) {
            f4 = 1.0f - f4;
        }
        float f5 = this.H;
        float f6 = this.G;
        return androidx.appcompat.graphics.drawable.d.a(f5, f6, f4, f6);
    }

    private void g1(com.google.android.material.tooltip.a aVar, float f4) {
        aVar.n1(D(f4));
        int v02 = (this.f54025x + ((int) (v0(f4) * this.O))) - (aVar.getIntrinsicWidth() / 2);
        int n4 = n() - (this.B + this.f54027z);
        aVar.setBounds(v02, n4 - aVar.getIntrinsicHeight(), aVar.getIntrinsicWidth() + v02, n4);
        Rect rect = new Rect(aVar.getBounds());
        com.google.android.material.internal.c.c(v.f(this), this, rect);
        aVar.setBounds(rect);
        v.g(this).a(aVar);
    }

    private void j(com.google.android.material.tooltip.a aVar) {
        aVar.l1(v.f(this));
    }

    private Float k(int i4) {
        float m4 = this.Q ? m(20) : l();
        if (i4 == 21) {
            if (!m0()) {
                m4 = -m4;
            }
            return Float.valueOf(m4);
        }
        if (i4 == 22) {
            if (m0()) {
                m4 = -m4;
            }
            return Float.valueOf(m4);
        }
        if (i4 == 69) {
            return Float.valueOf(-m4);
        }
        if (i4 == 70 || i4 == 81) {
            return Float.valueOf(m4);
        }
        return null;
    }

    private void k0() {
        this.f54003b.setStrokeWidth(this.f54024w);
        this.f54004c.setStrokeWidth(this.f54024w);
        this.f54007f.setStrokeWidth(this.f54024w / 2.0f);
        this.f54008g.setStrokeWidth(this.f54024w / 2.0f);
    }

    private float l() {
        float f4 = this.L;
        if (f4 == 0.0f) {
            return 1.0f;
        }
        return f4;
    }

    private boolean l0() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    private void l1(@o0 ArrayList<Float> arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf21e"));
        }
        Collections.sort(arrayList);
        if (this.I.size() == arrayList.size() && this.I.equals(arrayList)) {
            return;
        }
        this.I = arrayList;
        this.R = true;
        this.K = 0;
        s1();
        r();
        v();
        postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float m(int i4) {
        float l4 = l();
        return (this.H - this.G) / l4 <= i4 ? l4 : Math.round(r1 / r4) * l4;
    }

    private boolean m1() {
        return this.P || !(getBackground() instanceof RippleDrawable);
    }

    private int n() {
        return this.f54026y + (this.f54023v == 1 ? this.f54013l.get(0).getIntrinsicHeight() : 0);
    }

    private boolean n1(float f4) {
        return p1(this.J, f4);
    }

    private void o0(@o0 Resources resources) {
        this.f54022u = resources.getDimensionPixelSize(a.f.W5);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(a.f.U5);
        this.f54020s = dimensionPixelOffset;
        this.f54025x = dimensionPixelOffset;
        this.f54021t = resources.getDimensionPixelSize(a.f.S5);
        this.f54026y = resources.getDimensionPixelOffset(a.f.V5);
        this.B = resources.getDimensionPixelSize(a.f.O5);
    }

    private double o1(float f4) {
        float f5 = this.L;
        if (f5 <= 0.0f) {
            return f4;
        }
        return Math.round(f4 * r0) / ((int) ((this.H - this.G) / f5));
    }

    private void p0() {
        if (this.L <= 0.0f) {
            return;
        }
        u1();
        int min = Math.min((int) (((this.H - this.G) / this.L) + 1.0f), (this.O / (this.f54024w * 2)) + 1);
        float[] fArr = this.M;
        if (fArr == null || fArr.length != min * 2) {
            this.M = new float[min * 2];
        }
        float f4 = this.O / (min - 1);
        for (int i4 = 0; i4 < min * 2; i4 += 2) {
            float[] fArr2 = this.M;
            fArr2[i4] = ((i4 / 2) * f4) + this.f54025x;
            fArr2[i4 + 1] = n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p1(int i4, float f4) {
        if (Math.abs(f4 - this.I.get(i4).floatValue()) < f53997a3) {
            return false;
        }
        this.I.set(i4, Float.valueOf(I(i4, f4)));
        this.K = i4;
        u(i4);
        return true;
    }

    private ValueAnimator q(boolean z4) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(H(z4 ? this.f54018q : this.f54017p, z4 ? 0.0f : 1.0f), z4 ? 1.0f : 0.0f);
        ofFloat.setDuration(z4 ? f54001e3 : f54002f3);
        ofFloat.setInterpolator(z4 ? com.google.android.material.animation.a.f52470e : com.google.android.material.animation.a.f52468c);
        ofFloat.addUpdateListener(new b());
        return ofFloat;
    }

    private void q0(@o0 Canvas canvas, int i4, int i5) {
        if (m1()) {
            int v02 = (int) ((v0(this.I.get(this.K).floatValue()) * i4) + this.f54025x);
            if (Build.VERSION.SDK_INT < 28) {
                int i6 = this.A;
                canvas.clipRect(v02 - i6, i5 - i6, v02 + i6, i6 + i5, Region.Op.UNION);
            }
            canvas.drawCircle(v02, i5, this.A, this.f54006e);
        }
    }

    private boolean q1() {
        return p1(this.J, f0());
    }

    private void r() {
        if (this.f54013l.size() > this.I.size()) {
            List<com.google.android.material.tooltip.a> subList = this.f54013l.subList(this.I.size(), this.f54013l.size());
            for (com.google.android.material.tooltip.a aVar : subList) {
                if (x1.R0(this)) {
                    s(aVar);
                }
            }
            subList.clear();
        }
        while (this.f54013l.size() < this.I.size()) {
            com.google.android.material.tooltip.a a5 = this.f54012k.a();
            this.f54013l.add(a5);
            if (x1.R0(this)) {
                j(a5);
            }
        }
        int i4 = this.f54013l.size() == 1 ? 0 : 1;
        Iterator<com.google.android.material.tooltip.a> it = this.f54013l.iterator();
        while (it.hasNext()) {
            it.next().J0(i4);
        }
    }

    private void r0(@o0 Canvas canvas) {
        if (!this.N || this.L <= 0.0f) {
            return;
        }
        float[] F = F();
        int B0 = B0(this.M, F[0]);
        int B02 = B0(this.M, F[1]);
        int i4 = B0 * 2;
        canvas.drawPoints(this.M, 0, i4, this.f54007f);
        int i5 = B02 * 2;
        canvas.drawPoints(this.M, i4, i5 - i4, this.f54008g);
        float[] fArr = this.M;
        canvas.drawPoints(fArr, i5, fArr.length - i5, this.f54007f);
    }

    private void s(com.google.android.material.tooltip.a aVar) {
        u g4 = v.g(this);
        if (g4 != null) {
            g4.b(aVar);
            aVar.Y0(v.f(this));
        }
    }

    private void s0() {
        this.f54025x = this.f54020s + Math.max(this.f54027z - this.f54021t, 0);
        if (x1.Y0(this)) {
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
            int v02 = (int) ((v0(this.I.get(this.K).floatValue()) * this.O) + this.f54025x);
            int n4 = n();
            int i4 = this.A;
            background.setHotspotBounds(v02 - i4, n4 - i4, v02 + i4, n4 + i4);
        }
    }

    private float t(float f4) {
        if (f4 == 0.0f) {
            return 0.0f;
        }
        float f5 = (f4 - this.f54025x) / this.O;
        float f6 = this.G;
        return androidx.appcompat.graphics.drawable.d.a(f6, this.H, f5, f6);
    }

    private boolean t0(int i4) {
        int i5 = this.K;
        int f4 = (int) e1.a.f(i5 + i4, 0L, this.I.size() - 1);
        this.K = f4;
        if (f4 == i5) {
            return false;
        }
        if (this.J != -1) {
            this.J = f4;
        }
        s1();
        postInvalidate();
        return true;
    }

    private void t1(int i4) {
        this.O = Math.max(i4 - (this.f54025x * 2), 0);
        p0();
    }

    private void u(int i4) {
        Iterator<L> it = this.f54014m.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.I.get(i4).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.f54010i;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        F0(i4);
    }

    private boolean u0(int i4) {
        if (m0()) {
            i4 = i4 == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i4;
        }
        return t0(i4);
    }

    private void u1() {
        if (this.R) {
            w1();
            x1();
            v1();
            y1();
            B1();
            this.R = false;
        }
    }

    private void v() {
        for (L l4 : this.f54014m) {
            Iterator<Float> it = this.I.iterator();
            while (it.hasNext()) {
                l4.a(this, it.next().floatValue(), false);
            }
        }
    }

    private float v0(float f4) {
        float f5 = this.G;
        float f6 = (f4 - f5) / (this.H - f5);
        return m0() ? 1.0f - f6 : f6;
    }

    private void v1() {
        if (this.L <= 0.0f || z1(this.H)) {
            return;
        }
        throw new IllegalStateException(String.format(ProtectedSandApp.s("\uf213"), Float.toString(this.L), Float.toString(this.G), Float.toString(this.H)));
    }

    private void w(@o0 Canvas canvas, int i4, int i5) {
        float[] F = F();
        int i6 = this.f54025x;
        float f4 = i4;
        float f5 = i5;
        canvas.drawLine((F[0] * f4) + i6, f5, (F[1] * f4) + i6, f5, this.f54004c);
    }

    private Boolean w0(int i4, @o0 KeyEvent keyEvent) {
        if (i4 == 61) {
            return keyEvent.hasNoModifiers() ? Boolean.valueOf(t0(1)) : keyEvent.isShiftPressed() ? Boolean.valueOf(t0(-1)) : Boolean.FALSE;
        }
        if (i4 != 66) {
            if (i4 != 81) {
                if (i4 == 69) {
                    t0(-1);
                    return Boolean.TRUE;
                }
                if (i4 != 70) {
                    switch (i4) {
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
        this.J = this.K;
        postInvalidate();
        return Boolean.TRUE;
    }

    private void w1() {
        if (this.G < this.H) {
            return;
        }
        throw new IllegalStateException(String.format(ProtectedSandApp.s("\uf215"), Float.toString(this.G), Float.toString(this.H)));
    }

    private void x(@o0 Canvas canvas, int i4, int i5) {
        float[] F = F();
        float f4 = i4;
        float f5 = (F[1] * f4) + this.f54025x;
        if (f5 < r1 + i4) {
            float f6 = i5;
            canvas.drawLine(f5, f6, r1 + i4, f6, this.f54003b);
        }
        int i6 = this.f54025x;
        float f7 = (F[0] * f4) + i6;
        if (f7 > i6) {
            float f10 = i5;
            canvas.drawLine(i6, f10, f7, f10, this.f54003b);
        }
    }

    private void x0() {
        Iterator<T> it = this.f54015n.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private void x1() {
        if (this.H > this.G) {
            return;
        }
        throw new IllegalStateException(String.format(ProtectedSandApp.s("\uf214"), Float.toString(this.H), Float.toString(this.G)));
    }

    private void y(@o0 Canvas canvas, int i4, int i5) {
        if (!isEnabled()) {
            Iterator<Float> it = this.I.iterator();
            while (it.hasNext()) {
                canvas.drawCircle((v0(it.next().floatValue()) * i4) + this.f54025x, i5, this.f54027z, this.f54005d);
            }
        }
        Iterator<Float> it2 = this.I.iterator();
        while (it2.hasNext()) {
            Float next = it2.next();
            canvas.save();
            int v02 = this.f54025x + ((int) (v0(next.floatValue()) * i4));
            int i6 = this.f54027z;
            canvas.translate(v02 - i6, i5 - i6);
            this.O2.draw(canvas);
            canvas.restore();
        }
    }

    private void y0() {
        Iterator<T> it = this.f54015n.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    private void y1() {
        Iterator<Float> it = this.I.iterator();
        while (it.hasNext()) {
            Float next = it.next();
            if (next.floatValue() < this.G || next.floatValue() > this.H) {
                throw new IllegalStateException(String.format(ProtectedSandApp.s("\uf217"), Float.toString(next.floatValue()), Float.toString(this.G), Float.toString(this.H)));
            }
            if (this.L > 0.0f && !z1(next.floatValue())) {
                throw new IllegalStateException(String.format(ProtectedSandApp.s("\uf216"), Float.toString(next.floatValue()), Float.toString(this.G), Float.toString(this.L), Float.toString(this.L)));
            }
        }
    }

    private void z() {
        if (this.f54023v == 2) {
            return;
        }
        if (!this.f54016o) {
            this.f54016o = true;
            ValueAnimator q4 = q(true);
            this.f54017p = q4;
            this.f54018q = null;
            q4.start();
        }
        Iterator<com.google.android.material.tooltip.a> it = this.f54013l.iterator();
        for (int i4 = 0; i4 < this.I.size() && it.hasNext(); i4++) {
            if (i4 != this.K) {
                g1(it.next(), this.I.get(i4).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format(ProtectedSandApp.s("\uf21f"), Integer.valueOf(this.f54013l.size()), Integer.valueOf(this.I.size())));
        }
        g1(it.next(), this.I.get(this.K).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o0
    public static com.google.android.material.tooltip.a z0(@o0 Context context, @o0 TypedArray typedArray) {
        return com.google.android.material.tooltip.a.W0(context, null, 0, typedArray.getResourceId(a.o.uq, a.n.Rc));
    }

    private boolean z1(float f4) {
        double doubleValue = new BigDecimal(Float.toString(f4)).subtract(new BigDecimal(Float.toString(this.G))).divide(new BigDecimal(Float.toString(this.L)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(doubleValue)) - doubleValue) < f53997a3;
    }

    protected boolean A0() {
        if (this.J != -1) {
            return true;
        }
        float g02 = g0();
        float A1 = A1(g02);
        this.J = 0;
        float abs = Math.abs(this.I.get(0).floatValue() - g02);
        for (int i4 = 1; i4 < this.I.size(); i4++) {
            float abs2 = Math.abs(this.I.get(i4).floatValue() - g02);
            float A12 = A1(this.I.get(i4).floatValue());
            if (Float.compare(abs2, abs) > 1) {
                break;
            }
            boolean z4 = !m0() ? A12 - A1 >= 0.0f : A12 - A1 <= 0.0f;
            if (Float.compare(abs2, abs) < 0) {
                this.J = i4;
            } else {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else {
                    if (Math.abs(A12 - A1) < this.f54019r) {
                        this.J = -1;
                        return false;
                    }
                    if (z4) {
                        this.J = i4;
                    }
                }
            }
            abs = abs2;
        }
        return this.J != -1;
    }

    @m1
    void C(boolean z4) {
        this.P = z4;
    }

    public void D0(@o0 L l4) {
        this.f54014m.remove(l4);
    }

    @m1
    final int E() {
        return this.f54009h.B();
    }

    public void E0(@o0 T t4) {
        this.f54015n.remove(t4);
    }

    public int G() {
        return this.J;
    }

    protected void G0(int i4) {
        this.J = i4;
    }

    public void H0(int i4) {
        if (i4 < 0 || i4 >= this.I.size()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf220"));
        }
        this.K = i4;
        this.f54009h.b0(i4);
        postInvalidate();
    }

    public void I0(@g0(from = 0) @r int i4) {
        if (i4 == this.A) {
            return;
        }
        this.A = i4;
        Drawable background = getBackground();
        if (m1() || !(background instanceof RippleDrawable)) {
            postInvalidate();
        } else {
            ((RippleDrawable) background).setRadius(this.A);
        }
    }

    public void J0(@q int i4) {
        I0(getResources().getDimensionPixelSize(i4));
    }

    public int K() {
        return this.K;
    }

    public void K0(@o0 ColorStateList colorStateList) {
        if (colorStateList.equals(this.Q1)) {
            return;
        }
        this.Q1 = colorStateList;
        Drawable background = getBackground();
        if (!m1() && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.f54006e.setColor(J(colorStateList));
        this.f54006e.setAlpha(63);
        invalidate();
    }

    @r
    public int L() {
        return this.A;
    }

    public void L0(int i4) {
        if (this.f54023v != i4) {
            this.f54023v = i4;
            requestLayout();
        }
    }

    @o0
    public ColorStateList M() {
        return this.Q1;
    }

    public void M0(@q0 com.google.android.material.slider.d dVar) {
        this.E = dVar;
    }

    public int N() {
        return this.f54023v;
    }

    protected void N0(int i4) {
        this.Q2 = i4;
    }

    protected float O() {
        return 0.0f;
    }

    public void O0(float f4) {
        if (f4 < 0.0f) {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("\uf213"), Float.toString(f4), Float.toString(this.G), Float.toString(this.H)));
        }
        if (this.L != f4) {
            this.L = f4;
            this.R = true;
            postInvalidate();
        }
    }

    public float P() {
        return this.L;
    }

    public void P0(float f4) {
        this.O2.o0(f4);
    }

    public float Q() {
        return this.O2.z();
    }

    public void Q0(@q int i4) {
        P0(getResources().getDimension(i4));
    }

    @r
    public int R() {
        return this.f54027z;
    }

    public void R0(@g0(from = 0) @r int i4) {
        if (i4 == this.f54027z) {
            return;
        }
        this.f54027z = i4;
        s0();
        this.O2.d(o.a().q(0, this.f54027z).m());
        j jVar = this.O2;
        int i5 = this.f54027z;
        jVar.setBounds(0, 0, i5 * 2, i5 * 2);
        postInvalidate();
    }

    public ColorStateList S() {
        return this.O2.O();
    }

    public void S0(@q int i4) {
        R0(getResources().getDimensionPixelSize(i4));
    }

    public float T() {
        return this.O2.R();
    }

    public void T0(@q0 ColorStateList colorStateList) {
        this.O2.G0(colorStateList);
        postInvalidate();
    }

    @o0
    public ColorStateList U() {
        return this.O2.A();
    }

    public void U0(@androidx.annotation.n int i4) {
        if (i4 != 0) {
            T0(androidx.core.content.d.getColorStateList(getContext(), i4));
        }
    }

    @o0
    public ColorStateList V() {
        return this.V1;
    }

    public void V0(float f4) {
        this.O2.J0(f4);
        postInvalidate();
    }

    @o0
    public ColorStateList W() {
        return this.L2;
    }

    public void W0(@q int i4) {
        if (i4 != 0) {
            V0(getResources().getDimension(i4));
        }
    }

    @o0
    public ColorStateList X() {
        if (this.L2.equals(this.V1)) {
            return this.V1;
        }
        throw new IllegalStateException(ProtectedSandApp.s("\uf221"));
    }

    public void X0(@o0 ColorStateList colorStateList) {
        if (colorStateList.equals(this.O2.A())) {
            return;
        }
        this.O2.p0(colorStateList);
        invalidate();
    }

    @o0
    public ColorStateList Y() {
        return this.M2;
    }

    public void Y0(@o0 ColorStateList colorStateList) {
        if (colorStateList.equals(this.V1)) {
            return;
        }
        this.V1 = colorStateList;
        this.f54008g.setColor(J(colorStateList));
        invalidate();
    }

    @r
    public int Z() {
        return this.f54024w;
    }

    public void Z0(@o0 ColorStateList colorStateList) {
        if (colorStateList.equals(this.L2)) {
            return;
        }
        this.L2 = colorStateList;
        this.f54007f.setColor(J(colorStateList));
        invalidate();
    }

    @o0
    public ColorStateList a0() {
        return this.N2;
    }

    public void a1(@o0 ColorStateList colorStateList) {
        Z0(colorStateList);
        Y0(colorStateList);
    }

    @r
    public int b0() {
        return this.f54025x;
    }

    public void b1(boolean z4) {
        if (this.N != z4) {
            this.N = z4;
            postInvalidate();
        }
    }

    @o0
    public ColorStateList c0() {
        if (this.N2.equals(this.M2)) {
            return this.M2;
        }
        throw new IllegalStateException(ProtectedSandApp.s("\uf222"));
    }

    public void c1(@o0 ColorStateList colorStateList) {
        if (colorStateList.equals(this.M2)) {
            return;
        }
        this.M2 = colorStateList;
        this.f54004c.setColor(J(colorStateList));
        invalidate();
    }

    @r
    public int d0() {
        return this.O;
    }

    public void d1(@g0(from = 0) @r int i4) {
        if (this.f54024w != i4) {
            this.f54024w = i4;
            k0();
            postInvalidate();
        }
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@o0 MotionEvent motionEvent) {
        return this.f54009h.z(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(@o0 KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f54003b.setColor(J(this.N2));
        this.f54004c.setColor(J(this.M2));
        this.f54007f.setColor(J(this.L2));
        this.f54008g.setColor(J(this.V1));
        for (com.google.android.material.tooltip.a aVar : this.f54013l) {
            if (aVar.isStateful()) {
                aVar.setState(getDrawableState());
            }
        }
        if (this.O2.isStateful()) {
            this.O2.setState(getDrawableState());
        }
        this.f54006e.setColor(J(this.Q1));
        this.f54006e.setAlpha(63);
    }

    public float e0() {
        return this.G;
    }

    public void e1(@o0 ColorStateList colorStateList) {
        if (colorStateList.equals(this.N2)) {
            return;
        }
        this.N2 = colorStateList;
        this.f54003b.setColor(J(colorStateList));
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

    public void h(@q0 L l4) {
        this.f54014m.add(l4);
    }

    public float h0() {
        return this.H;
    }

    public void h1(float f4) {
        this.G = f4;
        this.R = true;
        postInvalidate();
    }

    public void i(@o0 T t4) {
        this.f54015n.add(t4);
    }

    @o0
    List<Float> i0() {
        return new ArrayList(this.I);
    }

    public void i1(float f4) {
        this.H = f4;
        this.R = true;
        postInvalidate();
    }

    public boolean j0() {
        return this.E != null;
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
        return x1.c0(this) == 1;
    }

    public boolean n0() {
        return this.N;
    }

    public void o() {
        this.f54014m.clear();
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Iterator<com.google.android.material.tooltip.a> it = this.f54013l.iterator();
        while (it.hasNext()) {
            j(it.next());
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        BaseSlider<S, L, T>.d dVar = this.f54011j;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
        this.f54016o = false;
        Iterator<com.google.android.material.tooltip.a> it = this.f54013l.iterator();
        while (it.hasNext()) {
            s(it.next());
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(@o0 Canvas canvas) {
        if (this.R) {
            u1();
            p0();
        }
        super.onDraw(canvas);
        int n4 = n();
        x(canvas, this.O, n4);
        if (((Float) Collections.max(i0())).floatValue() > this.G) {
            w(canvas, this.O, n4);
        }
        r0(canvas);
        if ((this.F || isFocused()) && isEnabled()) {
            q0(canvas, this.O, n4);
            if (this.J != -1) {
                z();
            }
        }
        y(canvas, this.O, n4);
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z4, int i4, @q0 Rect rect) {
        super.onFocusChanged(z4, i4, rect);
        if (z4) {
            B(i4);
            this.f54009h.b0(this.K);
        } else {
            this.J = -1;
            A();
            this.f54009h.s(this.K);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, @o0 KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i4, keyEvent);
        }
        if (this.I.size() == 1) {
            this.J = 0;
        }
        if (this.J == -1) {
            Boolean w02 = w0(i4, keyEvent);
            return w02 != null ? w02.booleanValue() : super.onKeyDown(i4, keyEvent);
        }
        this.Q |= keyEvent.isLongPress();
        Float k4 = k(i4);
        if (k4 != null) {
            if (p1(this.J, k4.floatValue() + this.I.get(this.J).floatValue())) {
                s1();
                postInvalidate();
            }
            return true;
        }
        if (i4 != 23) {
            if (i4 == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return t0(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return t0(-1);
                }
                return false;
            }
            if (i4 != 66) {
                return super.onKeyDown(i4, keyEvent);
            }
        }
        this.J = -1;
        A();
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i4, @o0 KeyEvent keyEvent) {
        this.Q = false;
        return super.onKeyUp(i4, keyEvent);
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(this.f54022u + (this.f54023v == 1 ? this.f54013l.get(0).getIntrinsicHeight() : 0), 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.G = sliderState.f54028b;
        this.H = sliderState.f54029c;
        l1(sliderState.f54030d);
        this.L = sliderState.f54031e;
        if (sliderState.f54032f) {
            requestFocus();
        }
        v();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f54028b = this.G;
        sliderState.f54029c = this.H;
        sliderState.f54030d = new ArrayList<>(this.I);
        sliderState.f54031e = this.L;
        sliderState.f54032f = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        t1(i4);
        s1();
    }

    @Override // android.view.View
    public boolean onTouchEvent(@o0 MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float x4 = motionEvent.getX();
        float f4 = (x4 - this.f54025x) / this.O;
        this.P2 = f4;
        float max = Math.max(0.0f, f4);
        this.P2 = max;
        this.P2 = Math.min(1.0f, max);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = x4;
            if (!l0()) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (A0()) {
                    requestFocus();
                    this.F = true;
                    q1();
                    s1();
                    invalidate();
                    x0();
                }
            }
        } else if (actionMasked == 1) {
            this.F = false;
            MotionEvent motionEvent2 = this.D;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.D.getX() - motionEvent.getX()) <= this.f54019r && Math.abs(this.D.getY() - motionEvent.getY()) <= this.f54019r && A0()) {
                x0();
            }
            if (this.J != -1) {
                q1();
                this.J = -1;
                y0();
            }
            A();
            invalidate();
        } else if (actionMasked == 2) {
            if (!this.F) {
                if (l0() && Math.abs(x4 - this.C) < this.f54019r) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                x0();
            }
            if (A0()) {
                this.F = true;
                q1();
                s1();
                invalidate();
            }
        }
        setPressed(this.F);
        this.D = MotionEvent.obtain(motionEvent);
        return true;
    }

    public void p() {
        this.f54015n.clear();
    }

    void r1(int i4, Rect rect) {
        int v02 = this.f54025x + ((int) (v0(i0().get(i4).floatValue()) * this.O));
        int n4 = n();
        int i5 = this.f54027z;
        rect.set(v02 - i5, n4 - i5, v02 + i5, n4 + i5);
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        setLayerType(z4 ? 0 : 2, null);
    }

    private class d implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        int f54038b;

        private d() {
            this.f54038b = -1;
        }

        void a(int i4) {
            this.f54038b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSlider.this.f54009h.c0(this.f54038b, 4);
        }

        /* synthetic */ d(BaseSlider baseSlider, a aVar) {
            this();
        }
    }

    public BaseSlider(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.Jc);
    }

    public BaseSlider(@o0 Context context, @q0 AttributeSet attributeSet, int i4) {
        super(a9.a.c(context, attributeSet, i4, f53998b3), attributeSet, i4);
        this.f54013l = new ArrayList();
        this.f54014m = new ArrayList();
        this.f54015n = new ArrayList();
        this.f54016o = false;
        this.F = false;
        this.I = new ArrayList<>();
        this.J = -1;
        this.K = -1;
        this.L = 0.0f;
        this.N = true;
        this.Q = false;
        j jVar = new j();
        this.O2 = jVar;
        this.Q2 = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f54003b = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint paint2 = new Paint();
        this.f54004c = paint2;
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        Paint paint3 = new Paint(1);
        this.f54005d = paint3;
        Paint.Style style2 = Paint.Style.FILL;
        paint3.setStyle(style2);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.f54006e = paint4;
        paint4.setStyle(style2);
        Paint paint5 = new Paint();
        this.f54007f = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        Paint paint6 = new Paint();
        this.f54008g = paint6;
        paint6.setStyle(style);
        paint6.setStrokeCap(cap);
        o0(context2.getResources());
        this.f54012k = new a(attributeSet, i4);
        C0(context2, attributeSet, i4);
        setFocusable(true);
        setClickable(true);
        jVar.y0(2);
        this.f54019r = ViewConfiguration.get(context2).getScaledTouchSlop();
        e eVar = new e(this);
        this.f54009h = eVar;
        x1.H1(this, eVar);
        this.f54010i = (AccessibilityManager) getContext().getSystemService(ProtectedSandApp.s("\uf218"));
    }
}
