package com.flyco.tablayout;

import android.R;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.graphics.drawable.d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.flyco.tablayout.b;
import com.flyco.tablayout.widget.MsgView;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class CommonTabLayout extends FrameLayout implements ValueAnimator.AnimatorUpdateListener {
    private static final int U2 = 0;
    private static final int V2 = 1;
    private static final int W2 = 2;
    private static final int X2 = 0;
    private static final int Y2 = 1;
    private static final int Z2 = 2;
    private boolean A;
    private boolean B;
    private int C;
    private int D;
    private float E;
    private int F;
    private int G;
    private float H;
    private float I;
    private float J;
    private int K;
    private int L;
    private ValueAnimator L2;
    private int M;
    private OvershootInterpolator M2;
    private boolean N;
    private c8.a N2;
    private boolean O;
    private boolean O2;
    private int P;
    private Paint P2;
    private float Q;
    private float Q1;
    private SparseArray<Boolean> Q2;
    private float R;
    private b8.b R2;
    private b S2;
    private b T2;
    private int V1;

    /* renamed from: b, reason: collision with root package name */
    private Context f49133b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<b8.a> f49134c;

    /* renamed from: d, reason: collision with root package name */
    private LinearLayout f49135d;

    /* renamed from: e, reason: collision with root package name */
    private int f49136e;

    /* renamed from: f, reason: collision with root package name */
    private int f49137f;

    /* renamed from: g, reason: collision with root package name */
    private int f49138g;

    /* renamed from: h, reason: collision with root package name */
    private Rect f49139h;

    /* renamed from: i, reason: collision with root package name */
    private GradientDrawable f49140i;

    /* renamed from: j, reason: collision with root package name */
    private Paint f49141j;

    /* renamed from: k, reason: collision with root package name */
    private Paint f49142k;

    /* renamed from: l, reason: collision with root package name */
    private Paint f49143l;

    /* renamed from: m, reason: collision with root package name */
    private Path f49144m;

    /* renamed from: n, reason: collision with root package name */
    private int f49145n;

    /* renamed from: o, reason: collision with root package name */
    private float f49146o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f49147p;

    /* renamed from: q, reason: collision with root package name */
    private float f49148q;

    /* renamed from: r, reason: collision with root package name */
    private int f49149r;

    /* renamed from: s, reason: collision with root package name */
    private float f49150s;

    /* renamed from: t, reason: collision with root package name */
    private float f49151t;

    /* renamed from: u, reason: collision with root package name */
    private float f49152u;

    /* renamed from: v, reason: collision with root package name */
    private float f49153v;

    /* renamed from: w, reason: collision with root package name */
    private float f49154w;

    /* renamed from: x, reason: collision with root package name */
    private float f49155x;

    /* renamed from: y, reason: collision with root package name */
    private float f49156y;

    /* renamed from: z, reason: collision with root package name */
    private long f49157z;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int intValue = ((Integer) view.getTag()).intValue();
            if (CommonTabLayout.this.f49136e == intValue) {
                if (CommonTabLayout.this.R2 != null) {
                    CommonTabLayout.this.R2.a(intValue);
                }
            } else {
                CommonTabLayout.this.S(intValue);
                if (CommonTabLayout.this.R2 != null) {
                    CommonTabLayout.this.R2.b(intValue);
                }
            }
        }
    }

    class b {

        /* renamed from: a, reason: collision with root package name */
        public float f49159a;

        /* renamed from: b, reason: collision with root package name */
        public float f49160b;

        b() {
        }
    }

    class c implements TypeEvaluator<b> {
        c() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b evaluate(float f4, b bVar, b bVar2) {
            float f5 = bVar.f49159a;
            float a5 = d.a(bVar2.f49159a, f5, f4, f5);
            float f6 = bVar.f49160b;
            float a6 = d.a(bVar2.f49160b, f6, f4, f6);
            b bVar3 = CommonTabLayout.this.new b();
            bVar3.f49159a = a5;
            bVar3.f49160b = a6;
            return bVar3;
        }
    }

    public CommonTabLayout(Context context) {
        this(context, null, 0);
    }

    private void D0(int i4) {
        int i5 = 0;
        while (i5 < this.f49138g) {
            View childAt = this.f49135d.getChildAt(i5);
            boolean z4 = i5 == i4;
            TextView textView = (TextView) childAt.findViewById(b.g.X1);
            textView.setTextColor(z4 ? this.K : this.L);
            ImageView imageView = (ImageView) childAt.findViewById(b.g.M0);
            b8.a aVar = this.f49134c.get(i5);
            imageView.setImageResource(z4 ? aVar.a() : aVar.c());
            if (this.M == 1) {
                textView.getPaint().setFakeBoldText(z4);
            }
            i5++;
        }
    }

    private void E0() {
        int i4 = 0;
        while (i4 < this.f49138g) {
            View childAt = this.f49135d.getChildAt(i4);
            float f4 = this.f49146o;
            childAt.setPadding((int) f4, 0, (int) f4, 0);
            TextView textView = (TextView) childAt.findViewById(b.g.X1);
            textView.setTextColor(i4 == this.f49136e ? this.K : this.L);
            textView.setTextSize(0, this.J);
            if (this.N) {
                textView.setText(textView.getText().toString().toUpperCase());
            }
            int i5 = this.M;
            if (i5 == 2) {
                textView.getPaint().setFakeBoldText(true);
            } else if (i5 == 0) {
                textView.getPaint().setFakeBoldText(false);
            }
            ImageView imageView = (ImageView) childAt.findViewById(b.g.M0);
            if (this.O) {
                imageView.setVisibility(0);
                b8.a aVar = this.f49134c.get(i4);
                imageView.setImageResource(i4 == this.f49136e ? aVar.a() : aVar.c());
                float f5 = this.Q;
                int i6 = f5 <= 0.0f ? -2 : (int) f5;
                float f6 = this.R;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i6, f6 > 0.0f ? (int) f6 : -2);
                int i7 = this.P;
                if (i7 == 8388611) {
                    layoutParams.setMarginEnd((int) this.Q1);
                } else if (i7 == 8388613) {
                    layoutParams.setMarginStart((int) this.Q1);
                } else if (i7 == 80) {
                    layoutParams.topMargin = (int) this.Q1;
                } else {
                    layoutParams.bottomMargin = (int) this.Q1;
                }
                imageView.setLayoutParams(layoutParams);
            } else {
                imageView.setVisibility(8);
            }
            i4++;
        }
    }

    private void R(Context context, AttributeSet attributeSet) {
        float f4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.m.M3);
        int i4 = obtainStyledAttributes.getInt(b.m.g4, 0);
        this.f49145n = i4;
        this.f49149r = obtainStyledAttributes.getColor(b.m.Y3, Color.parseColor(i4 == 2 ? ProtectedSandApp.s("쌖") : ProtectedSandApp.s("쌗")));
        int i5 = b.m.f49905b4;
        int i6 = this.f49145n;
        if (i6 == 1) {
            f4 = 4.0f;
        } else {
            f4 = i6 == 2 ? -1 : 2;
        }
        this.f49150s = obtainStyledAttributes.getDimension(i5, f(f4));
        this.f49151t = obtainStyledAttributes.getDimension(b.m.h4, f(this.f49145n == 1 ? 10.0f : -1.0f));
        this.f49152u = obtainStyledAttributes.getDimension(b.m.Z3, f(this.f49145n == 2 ? -1.0f : 0.0f));
        this.f49153v = obtainStyledAttributes.getDimension(b.m.f49923d4, f(0.0f));
        this.f49154w = obtainStyledAttributes.getDimension(b.m.f4, f(this.f49145n == 2 ? 7.0f : 0.0f));
        this.f49155x = obtainStyledAttributes.getDimension(b.m.e4, f(0.0f));
        this.f49156y = obtainStyledAttributes.getDimension(b.m.f49914c4, f(this.f49145n != 2 ? 0.0f : 7.0f));
        this.A = obtainStyledAttributes.getBoolean(b.m.W3, true);
        this.B = obtainStyledAttributes.getBoolean(b.m.X3, true);
        this.f49157z = obtainStyledAttributes.getInt(b.m.V3, -1);
        this.C = obtainStyledAttributes.getInt(b.m.f49897a4, 80);
        int i7 = b.m.q4;
        Resources resources = context.getResources();
        int i10 = b.d.M;
        this.D = obtainStyledAttributes.getColor(i7, resources.getColor(i10));
        this.E = obtainStyledAttributes.getDimension(b.m.s4, f(0.0f));
        this.F = obtainStyledAttributes.getInt(b.m.r4, 80);
        this.G = obtainStyledAttributes.getColor(b.m.N3, context.getResources().getColor(i10));
        this.H = obtainStyledAttributes.getDimension(b.m.P3, f(0.0f));
        this.I = obtainStyledAttributes.getDimension(b.m.O3, f(12.0f));
        this.J = obtainStyledAttributes.getDimension(b.m.p4, C0(13.0f));
        this.K = obtainStyledAttributes.getColor(b.m.n4, context.getResources().getColor(i10));
        this.L = obtainStyledAttributes.getColor(b.m.o4, Color.parseColor(ProtectedSandApp.s("쌘")));
        this.M = obtainStyledAttributes.getInt(b.m.m4, 0);
        this.N = obtainStyledAttributes.getBoolean(b.m.l4, false);
        this.O = obtainStyledAttributes.getBoolean(b.m.T3, true);
        this.P = obtainStyledAttributes.getInt(b.m.Q3, 48);
        this.Q = obtainStyledAttributes.getDimension(b.m.U3, f(0.0f));
        this.R = obtainStyledAttributes.getDimension(b.m.R3, f(0.0f));
        this.Q1 = obtainStyledAttributes.getDimension(b.m.S3, f(2.5f));
        this.f49147p = obtainStyledAttributes.getBoolean(b.m.j4, true);
        float dimension = obtainStyledAttributes.getDimension(b.m.k4, f(-1.0f));
        this.f49148q = dimension;
        this.f49146o = obtainStyledAttributes.getDimension(b.m.i4, (this.f49147p || dimension > 0.0f) ? f(0.0f) : f(10.0f));
        obtainStyledAttributes.recycle();
    }

    private void c(int i4, View view) {
        ((TextView) view.findViewById(b.g.X1)).setText(this.f49134c.get(i4).b());
        ((ImageView) view.findViewById(b.g.M0)).setImageResource(this.f49134c.get(i4).c());
        view.setOnClickListener(new a());
        LinearLayout.LayoutParams layoutParams = this.f49147p ? new LinearLayout.LayoutParams(0, -1, 1.0f) : new LinearLayout.LayoutParams(-2, -1);
        if (this.f49148q > 0.0f) {
            layoutParams = new LinearLayout.LayoutParams((int) this.f49148q, -1);
        }
        this.f49135d.addView(view, i4, layoutParams);
    }

    private void d() {
        View childAt = this.f49135d.getChildAt(this.f49136e);
        float left = childAt.getLeft();
        float right = childAt.getRight();
        Rect rect = this.f49139h;
        rect.left = (int) left;
        rect.right = (int) right;
        if (this.f49151t < 0.0f) {
            return;
        }
        float left2 = childAt.getLeft();
        float width = childAt.getWidth();
        float f4 = this.f49151t;
        float f5 = ((width - f4) / 2.0f) + left2;
        Rect rect2 = this.f49139h;
        int i4 = (int) f5;
        rect2.left = i4;
        rect2.right = (int) (i4 + f4);
    }

    private void e() {
        View childAt = this.f49135d.getChildAt(this.f49136e);
        this.S2.f49159a = childAt.getLeft();
        this.S2.f49160b = childAt.getRight();
        View childAt2 = this.f49135d.getChildAt(this.f49137f);
        this.T2.f49159a = childAt2.getLeft();
        this.T2.f49160b = childAt2.getRight();
        b bVar = this.T2;
        float f4 = bVar.f49159a;
        b bVar2 = this.S2;
        if (f4 == bVar2.f49159a && bVar.f49160b == bVar2.f49160b) {
            invalidate();
            return;
        }
        this.L2.setObjectValues(bVar, bVar2);
        if (this.B) {
            this.L2.setInterpolator(this.M2);
        }
        if (this.f49157z < 0) {
            this.f49157z = this.B ? 500L : 250L;
        }
        this.L2.setDuration(this.f49157z);
        this.L2.start();
    }

    public int A() {
        return this.f49138g;
    }

    public void A0(int i4) {
        int i5 = this.f49138g;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        B0(i4, 0);
    }

    public float B() {
        return this.f49146o;
    }

    public void B0(int i4, int i5) {
        int i6 = this.f49138g;
        if (i4 >= i6) {
            i4 = i6 - 1;
        }
        MsgView msgView = (MsgView) this.f49135d.getChildAt(i4).findViewById(b.g.f49639h1);
        if (msgView != null) {
            c8.b.b(msgView, i5);
            if (this.Q2.get(i4) == null || !this.Q2.get(i4).booleanValue()) {
                if (this.O) {
                    int i7 = this.P;
                    l0(i4, 0.0f, (i7 == 8388611 || i7 == 8388613) ? 4.0f : 0.0f);
                } else {
                    l0(i4, 2.0f, 2.0f);
                }
                this.Q2.put(i4, Boolean.TRUE);
            }
        }
    }

    public float C() {
        return this.f49148q;
    }

    protected int C0(float f4) {
        return (int) ((f4 * this.f49133b.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public int D() {
        return this.M;
    }

    public int E() {
        return this.K;
    }

    public int F() {
        return this.L;
    }

    public float G() {
        return this.J;
    }

    public TextView H(int i4) {
        return (TextView) this.f49135d.getChildAt(i4).findViewById(b.g.X1);
    }

    public int I() {
        return this.D;
    }

    public float J() {
        return this.E;
    }

    public void K(int i4) {
        int i5 = this.f49138g;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        MsgView msgView = (MsgView) this.f49135d.getChildAt(i4).findViewById(b.g.f49639h1);
        if (msgView != null) {
            msgView.setVisibility(8);
        }
    }

    public boolean L() {
        return this.O;
    }

    public boolean M() {
        return this.A;
    }

    public boolean N() {
        return this.B;
    }

    public boolean O() {
        return this.f49147p;
    }

    public boolean P() {
        return this.N;
    }

    public void Q() {
        this.f49135d.removeAllViews();
        this.f49138g = this.f49134c.size();
        for (int i4 = 0; i4 < this.f49138g; i4++) {
            int i5 = this.P;
            View inflate = i5 == 8388611 ? View.inflate(this.f49133b, b.j.H, null) : i5 == 8388613 ? View.inflate(this.f49133b, b.j.I, null) : i5 == 80 ? View.inflate(this.f49133b, b.j.F, null) : View.inflate(this.f49133b, b.j.K, null);
            inflate.setTag(Integer.valueOf(i4));
            c(i4, inflate);
        }
        E0();
    }

    public void S(int i4) {
        this.f49137f = this.f49136e;
        this.f49136e = i4;
        D0(i4);
        c8.a aVar = this.N2;
        if (aVar != null) {
            aVar.d(i4);
        }
        if (this.A) {
            e();
        } else {
            invalidate();
        }
    }

    public void T(int i4) {
        this.G = i4;
        invalidate();
    }

    public void U(float f4) {
        this.I = f(f4);
        invalidate();
    }

    public void V(float f4) {
        this.H = f(f4);
        invalidate();
    }

    public void W(int i4) {
        this.P = i4;
        Q();
    }

    public void X(float f4) {
        this.R = f(f4);
        E0();
    }

    public void Y(float f4) {
        this.Q1 = f(f4);
        E0();
    }

    public void Z(boolean z4) {
        this.O = z4;
        E0();
    }

    public void a0(float f4) {
        this.Q = f(f4);
        E0();
    }

    public void b0(long j4) {
        this.f49157z = j4;
    }

    public void c0(boolean z4) {
        this.A = z4;
    }

    public void d0(boolean z4) {
        this.B = z4;
    }

    public void e0(int i4) {
        this.f49149r = i4;
        invalidate();
    }

    protected int f(float f4) {
        return (int) ((f4 * this.f49133b.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void f0(float f4) {
        this.f49152u = f(f4);
        invalidate();
    }

    public int g() {
        return this.f49136e;
    }

    public void g0(int i4) {
        this.C = i4;
        invalidate();
    }

    public int h() {
        return this.G;
    }

    public void h0(float f4) {
        this.f49150s = f(f4);
        invalidate();
    }

    public float i() {
        return this.I;
    }

    public void i0(float f4, float f5, float f6, float f7) {
        this.f49153v = f(f4);
        this.f49154w = f(f5);
        this.f49155x = f(f6);
        this.f49156y = f(f7);
        invalidate();
    }

    public float j() {
        return this.H;
    }

    public void j0(int i4) {
        this.f49145n = i4;
        invalidate();
    }

    public int k() {
        return this.P;
    }

    public void k0(float f4) {
        this.f49151t = f(f4);
        invalidate();
    }

    public float l() {
        return this.R;
    }

    public void l0(int i4, float f4, float f5) {
        int i5 = this.f49138g;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        View childAt = this.f49135d.getChildAt(i4);
        MsgView msgView = (MsgView) childAt.findViewById(b.g.f49639h1);
        if (msgView != null) {
            TextView textView = (TextView) childAt.findViewById(b.g.X1);
            this.P2.setTextSize(this.J);
            this.P2.measureText(textView.getText().toString());
            float descent = this.P2.descent() - this.P2.ascent();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) msgView.getLayoutParams();
            float f6 = this.R;
            float f7 = 0.0f;
            if (this.O) {
                if (f6 <= 0.0f) {
                    f6 = this.f49133b.getResources().getDrawable(this.f49134c.get(i4).a()).getIntrinsicHeight();
                }
                f7 = this.Q1;
            }
            int i6 = this.P;
            if (i6 == 48 || i6 == 80) {
                marginLayoutParams.setMarginStart(f(f4));
                int i7 = this.V1;
                marginLayoutParams.topMargin = i7 > 0 ? (((int) (((i7 - descent) - f6) - f7)) / 2) - f(f5) : f(f5);
            } else {
                marginLayoutParams.setMarginStart(f(f4));
                int i10 = this.V1;
                marginLayoutParams.topMargin = i10 > 0 ? (((int) (i10 - Math.max(descent, f6))) / 2) - f(f5) : f(f5);
            }
            msgView.setLayoutParams(marginLayoutParams);
        }
    }

    public float m() {
        return this.Q1;
    }

    public void m0(b8.b bVar) {
        this.R2 = bVar;
    }

    public ImageView n(int i4) {
        return (ImageView) this.f49135d.getChildAt(i4).findViewById(b.g.M0);
    }

    public void n0(ArrayList<b8.a> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            throw new IllegalStateException(ProtectedSandApp.s("쌙"));
        }
        this.f49134c.clear();
        this.f49134c.addAll(arrayList);
        Q();
    }

    public float o() {
        return this.Q;
    }

    public void o0(ArrayList<b8.a> arrayList, FragmentActivity fragmentActivity, int i4, ArrayList<Fragment> arrayList2) {
        this.N2 = new c8.a(fragmentActivity.getSupportFragmentManager(), i4, arrayList2);
        n0(arrayList);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        View childAt = this.f49135d.getChildAt(this.f49136e);
        b bVar = (b) valueAnimator.getAnimatedValue();
        Rect rect = this.f49139h;
        float f4 = bVar.f49159a;
        rect.left = (int) f4;
        rect.right = (int) bVar.f49160b;
        if (this.f49151t >= 0.0f) {
            float width = childAt.getWidth();
            float f5 = this.f49151t;
            Rect rect2 = this.f49139h;
            int i4 = (int) (((width - f5) / 2.0f) + f4);
            rect2.left = i4;
            rect2.right = (int) (i4 + f5);
        }
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode() || this.f49138g <= 0) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        float f4 = this.H;
        if (f4 > 0.0f) {
            this.f49142k.setStrokeWidth(f4);
            this.f49142k.setColor(this.G);
            for (int i4 = 0; i4 < this.f49138g - 1; i4++) {
                View childAt = this.f49135d.getChildAt(i4);
                canvas.drawLine(childAt.getRight() + paddingLeft, this.I, childAt.getRight() + paddingLeft, height - this.I, this.f49142k);
            }
        }
        if (this.E > 0.0f) {
            this.f49141j.setColor(this.D);
            if (this.F == 80) {
                float f5 = height;
                canvas.drawRect(paddingLeft, f5 - this.E, this.f49135d.getWidth() + paddingLeft, f5, this.f49141j);
            } else {
                canvas.drawRect(paddingLeft, 0.0f, this.f49135d.getWidth() + paddingLeft, this.E, this.f49141j);
            }
        }
        if (!this.A) {
            d();
        } else if (this.O2) {
            this.O2 = false;
            d();
        }
        int i5 = this.f49145n;
        if (i5 == 1) {
            if (this.f49150s > 0.0f) {
                this.f49143l.setColor(this.f49149r);
                this.f49144m.reset();
                float f6 = height;
                this.f49144m.moveTo(this.f49139h.left + paddingLeft, f6);
                Path path = this.f49144m;
                Rect rect = this.f49139h;
                path.lineTo((rect.right / 2) + (rect.left / 2) + paddingLeft, f6 - this.f49150s);
                this.f49144m.lineTo(paddingLeft + this.f49139h.right, f6);
                this.f49144m.close();
                canvas.drawPath(this.f49144m, this.f49143l);
                return;
            }
            return;
        }
        if (i5 == 2) {
            if (this.f49150s < 0.0f) {
                this.f49150s = (height - this.f49154w) - this.f49156y;
            }
            float f7 = this.f49150s;
            if (f7 > 0.0f) {
                float f10 = this.f49152u;
                if (f10 < 0.0f || f10 > f7 / 2.0f) {
                    this.f49152u = f7 / 2.0f;
                }
                this.f49140i.setColor(this.f49149r);
                GradientDrawable gradientDrawable = this.f49140i;
                int i6 = ((int) this.f49153v) + paddingLeft + this.f49139h.left;
                float f11 = this.f49154w;
                gradientDrawable.setBounds(i6, (int) f11, (int) ((paddingLeft + r2.right) - this.f49155x), (int) (f11 + this.f49150s));
                this.f49140i.setCornerRadius(this.f49152u);
                this.f49140i.draw(canvas);
                return;
            }
            return;
        }
        if (this.f49150s > 0.0f) {
            this.f49140i.setColor(this.f49149r);
            if (this.C == 80) {
                GradientDrawable gradientDrawable2 = this.f49140i;
                int i7 = ((int) this.f49153v) + paddingLeft;
                Rect rect2 = this.f49139h;
                int i10 = i7 + rect2.left;
                int i11 = height - ((int) this.f49150s);
                float f12 = this.f49156y;
                gradientDrawable2.setBounds(i10, i11 - ((int) f12), (paddingLeft + rect2.right) - ((int) this.f49155x), height - ((int) f12));
            } else {
                GradientDrawable gradientDrawable3 = this.f49140i;
                int i12 = ((int) this.f49153v) + paddingLeft;
                Rect rect3 = this.f49139h;
                int i13 = i12 + rect3.left;
                float f13 = this.f49154w;
                gradientDrawable3.setBounds(i13, (int) f13, (paddingLeft + rect3.right) - ((int) this.f49155x), ((int) this.f49150s) + ((int) f13));
            }
            this.f49140i.setCornerRadius(this.f49152u);
            this.f49140i.draw(canvas);
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f49136e = bundle.getInt(ProtectedSandApp.s("쌚"));
            parcelable = bundle.getParcelable(ProtectedSandApp.s("쌛"));
            if (this.f49136e != 0 && this.f49135d.getChildCount() > 0) {
                D0(this.f49136e);
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(ProtectedSandApp.s("쌛"), super.onSaveInstanceState());
        bundle.putInt(ProtectedSandApp.s("쌚"), this.f49136e);
        return bundle;
    }

    public long p() {
        return this.f49157z;
    }

    public void p0(float f4) {
        this.f49146o = f(f4);
        E0();
    }

    public int q() {
        return this.f49149r;
    }

    public void q0(boolean z4) {
        this.f49147p = z4;
        E0();
    }

    public float r() {
        return this.f49152u;
    }

    public void r0(float f4) {
        this.f49148q = f(f4);
        E0();
    }

    public float s() {
        return this.f49150s;
    }

    public void s0(boolean z4) {
        this.N = z4;
        E0();
    }

    public float t() {
        return this.f49156y;
    }

    public void t0(int i4) {
        this.M = i4;
        E0();
    }

    public float u() {
        return this.f49153v;
    }

    public void u0(int i4) {
        this.K = i4;
        E0();
    }

    public float v() {
        return this.f49155x;
    }

    public void v0(int i4) {
        this.L = i4;
        E0();
    }

    public float w() {
        return this.f49154w;
    }

    public void w0(float f4) {
        this.J = C0(f4);
        E0();
    }

    public int x() {
        return this.f49145n;
    }

    public void x0(int i4) {
        this.D = i4;
        invalidate();
    }

    public float y() {
        return this.f49151t;
    }

    public void y0(int i4) {
        this.F = i4;
        invalidate();
    }

    public MsgView z(int i4) {
        int i5 = this.f49138g;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        return (MsgView) this.f49135d.getChildAt(i4).findViewById(b.g.f49639h1);
    }

    public void z0(float f4) {
        this.E = f(f4);
        invalidate();
    }

    public CommonTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CommonTabLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f49134c = new ArrayList<>();
        this.f49139h = new Rect();
        this.f49140i = new GradientDrawable();
        this.f49141j = new Paint(1);
        this.f49142k = new Paint(1);
        this.f49143l = new Paint(1);
        this.f49144m = new Path();
        this.f49145n = 0;
        this.M2 = new OvershootInterpolator(1.5f);
        this.O2 = true;
        this.P2 = new Paint(1);
        this.Q2 = new SparseArray<>();
        this.S2 = new b();
        this.T2 = new b();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        this.f49133b = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f49135d = linearLayout;
        addView(linearLayout);
        R(context, attributeSet);
        String attributeValue = attributeSet.getAttributeValue(ProtectedSandApp.s("쌒"), ProtectedSandApp.s("쌓"));
        if (!attributeValue.equals(ProtectedSandApp.s("쌔")) && !attributeValue.equals(ProtectedSandApp.s("쌕"))) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_height});
            this.V1 = obtainStyledAttributes.getDimensionPixelSize(0, -2);
            obtainStyledAttributes.recycle();
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(new c(), this.T2, this.S2);
        this.L2 = ofObject;
        ofObject.addUpdateListener(this);
    }
}
