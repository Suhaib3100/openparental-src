package com.flyco.tablayout;

import android.R;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
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
public class SegmentTabLayout extends FrameLayout implements ValueAnimator.AnimatorUpdateListener {
    private static final int L2 = 0;
    private static final int M2 = 1;
    private static final int N2 = 2;
    private float A;
    private float B;
    private int C;
    private int D;
    private int E;
    private boolean F;
    private int G;
    private int H;
    private float I;
    private int J;
    private ValueAnimator K;
    private OvershootInterpolator L;
    private c8.a M;
    private float[] N;
    private boolean O;
    private Paint P;
    private SparseArray<Boolean> Q;
    private b Q1;
    private b8.b R;
    private b V1;

    /* renamed from: b, reason: collision with root package name */
    private Context f49216b;

    /* renamed from: c, reason: collision with root package name */
    private String[] f49217c;

    /* renamed from: d, reason: collision with root package name */
    private LinearLayout f49218d;

    /* renamed from: e, reason: collision with root package name */
    private int f49219e;

    /* renamed from: f, reason: collision with root package name */
    private int f49220f;

    /* renamed from: g, reason: collision with root package name */
    private int f49221g;

    /* renamed from: h, reason: collision with root package name */
    private Rect f49222h;

    /* renamed from: i, reason: collision with root package name */
    private GradientDrawable f49223i;

    /* renamed from: j, reason: collision with root package name */
    private GradientDrawable f49224j;

    /* renamed from: k, reason: collision with root package name */
    private Paint f49225k;

    /* renamed from: l, reason: collision with root package name */
    private float f49226l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f49227m;

    /* renamed from: n, reason: collision with root package name */
    private float f49228n;

    /* renamed from: o, reason: collision with root package name */
    private int f49229o;

    /* renamed from: p, reason: collision with root package name */
    private float f49230p;

    /* renamed from: q, reason: collision with root package name */
    private float f49231q;

    /* renamed from: r, reason: collision with root package name */
    private float f49232r;

    /* renamed from: s, reason: collision with root package name */
    private float f49233s;

    /* renamed from: t, reason: collision with root package name */
    private float f49234t;

    /* renamed from: u, reason: collision with root package name */
    private float f49235u;

    /* renamed from: v, reason: collision with root package name */
    private long f49236v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f49237w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f49238x;

    /* renamed from: y, reason: collision with root package name */
    private int f49239y;

    /* renamed from: z, reason: collision with root package name */
    private float f49240z;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int intValue = ((Integer) view.getTag()).intValue();
            if (SegmentTabLayout.this.f49219e == intValue) {
                if (SegmentTabLayout.this.R != null) {
                    SegmentTabLayout.this.R.a(intValue);
                }
            } else {
                SegmentTabLayout.this.I(intValue);
                if (SegmentTabLayout.this.R != null) {
                    SegmentTabLayout.this.R.b(intValue);
                }
            }
        }
    }

    class b {

        /* renamed from: a, reason: collision with root package name */
        public float f49242a;

        /* renamed from: b, reason: collision with root package name */
        public float f49243b;

        b() {
        }
    }

    class c implements TypeEvaluator<b> {
        c() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b evaluate(float f4, b bVar, b bVar2) {
            float f5 = bVar.f49242a;
            float a5 = d.a(bVar2.f49242a, f5, f4, f5);
            float f6 = bVar.f49243b;
            float a6 = d.a(bVar2.f49243b, f6, f4, f6);
            b bVar3 = SegmentTabLayout.this.new b();
            bVar3.f49242a = a5;
            bVar3.f49243b = a6;
            return bVar3;
        }
    }

    public SegmentTabLayout(Context context) {
        this(context, null, 0);
    }

    private void H(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.m.N7);
        this.f49229o = obtainStyledAttributes.getColor(b.m.X7, Color.parseColor(ProtectedSandApp.s("쌵")));
        this.f49230p = obtainStyledAttributes.getDimension(b.m.Z7, -1.0f);
        this.f49231q = obtainStyledAttributes.getDimension(b.m.Y7, -1.0f);
        this.f49232r = obtainStyledAttributes.getDimension(b.m.f49906b8, f(0.0f));
        this.f49233s = obtainStyledAttributes.getDimension(b.m.f49924d8, 0.0f);
        this.f49234t = obtainStyledAttributes.getDimension(b.m.f49915c8, f(0.0f));
        this.f49235u = obtainStyledAttributes.getDimension(b.m.a8, 0.0f);
        this.f49237w = obtainStyledAttributes.getBoolean(b.m.V7, false);
        this.f49238x = obtainStyledAttributes.getBoolean(b.m.W7, true);
        this.f49236v = obtainStyledAttributes.getInt(b.m.U7, -1);
        this.f49239y = obtainStyledAttributes.getColor(b.m.R7, this.f49229o);
        this.f49240z = obtainStyledAttributes.getDimension(b.m.T7, f(1.0f));
        this.A = obtainStyledAttributes.getDimension(b.m.S7, 0.0f);
        this.B = obtainStyledAttributes.getDimension(b.m.f49988l8, h0(13.0f));
        this.C = obtainStyledAttributes.getColor(b.m.f49972j8, context.getResources().getColor(b.d.M));
        this.D = obtainStyledAttributes.getColor(b.m.f49980k8, this.f49229o);
        this.E = obtainStyledAttributes.getInt(b.m.f49964i8, 0);
        this.F = obtainStyledAttributes.getBoolean(b.m.f49956h8, false);
        this.f49227m = obtainStyledAttributes.getBoolean(b.m.f49940f8, true);
        float dimension = obtainStyledAttributes.getDimension(b.m.f49948g8, f(-1.0f));
        this.f49228n = dimension;
        this.f49226l = obtainStyledAttributes.getDimension(b.m.f49932e8, (this.f49227m || dimension > 0.0f) ? f(0.0f) : f(10.0f));
        this.G = obtainStyledAttributes.getColor(b.m.O7, 0);
        this.H = obtainStyledAttributes.getColor(b.m.P7, this.f49229o);
        this.I = obtainStyledAttributes.getDimension(b.m.Q7, f(1.0f));
        obtainStyledAttributes.recycle();
    }

    private void c(int i4, View view) {
        ((TextView) view.findViewById(b.g.X1)).setText(this.f49217c[i4]);
        view.setOnClickListener(new a());
        LinearLayout.LayoutParams layoutParams = this.f49227m ? new LinearLayout.LayoutParams(0, -1, 1.0f) : new LinearLayout.LayoutParams(-2, -1);
        if (this.f49228n > 0.0f) {
            layoutParams = new LinearLayout.LayoutParams((int) this.f49228n, -1);
        }
        this.f49218d.addView(view, i4, layoutParams);
    }

    private void d() {
        View childAt = this.f49218d.getChildAt(this.f49219e);
        float left = childAt.getLeft();
        float right = childAt.getRight();
        Rect rect = this.f49222h;
        rect.left = (int) left;
        rect.right = (int) right;
        if (this.f49237w) {
            float[] fArr = this.N;
            float f4 = this.f49231q;
            fArr[0] = f4;
            fArr[1] = f4;
            fArr[2] = f4;
            fArr[3] = f4;
            fArr[4] = f4;
            fArr[5] = f4;
            fArr[6] = f4;
            fArr[7] = f4;
            return;
        }
        int i4 = this.f49219e;
        if (i4 == 0) {
            float[] fArr2 = this.N;
            float f5 = this.f49231q;
            fArr2[0] = f5;
            fArr2[1] = f5;
            fArr2[2] = 0.0f;
            fArr2[3] = 0.0f;
            fArr2[4] = 0.0f;
            fArr2[5] = 0.0f;
            fArr2[6] = f5;
            fArr2[7] = f5;
            return;
        }
        if (i4 != this.f49221g - 1) {
            float[] fArr3 = this.N;
            fArr3[0] = 0.0f;
            fArr3[1] = 0.0f;
            fArr3[2] = 0.0f;
            fArr3[3] = 0.0f;
            fArr3[4] = 0.0f;
            fArr3[5] = 0.0f;
            fArr3[6] = 0.0f;
            fArr3[7] = 0.0f;
            return;
        }
        float[] fArr4 = this.N;
        fArr4[0] = 0.0f;
        fArr4[1] = 0.0f;
        float f6 = this.f49231q;
        fArr4[2] = f6;
        fArr4[3] = f6;
        fArr4[4] = f6;
        fArr4[5] = f6;
        fArr4[6] = 0.0f;
        fArr4[7] = 0.0f;
    }

    private void e() {
        View childAt = this.f49218d.getChildAt(this.f49219e);
        this.Q1.f49242a = childAt.getLeft();
        this.Q1.f49243b = childAt.getRight();
        View childAt2 = this.f49218d.getChildAt(this.f49220f);
        this.V1.f49242a = childAt2.getLeft();
        this.V1.f49243b = childAt2.getRight();
        b bVar = this.V1;
        float f4 = bVar.f49242a;
        b bVar2 = this.Q1;
        if (f4 == bVar2.f49242a && bVar.f49243b == bVar2.f49243b) {
            invalidate();
            return;
        }
        this.K.setObjectValues(bVar, bVar2);
        if (this.f49238x) {
            this.K.setInterpolator(this.L);
        }
        if (this.f49236v < 0) {
            this.f49236v = this.f49238x ? 500L : 250L;
        }
        this.K.setDuration(this.f49236v);
        this.K.start();
    }

    private void i0(int i4) {
        int i5 = 0;
        while (i5 < this.f49221g) {
            View childAt = this.f49218d.getChildAt(i5);
            boolean z4 = i5 == i4;
            TextView textView = (TextView) childAt.findViewById(b.g.X1);
            textView.setTextColor(z4 ? this.C : this.D);
            if (this.E == 1) {
                textView.getPaint().setFakeBoldText(z4);
            }
            i5++;
        }
    }

    private void j0() {
        int i4 = 0;
        while (i4 < this.f49221g) {
            View childAt = this.f49218d.getChildAt(i4);
            float f4 = this.f49226l;
            childAt.setPadding((int) f4, 0, (int) f4, 0);
            TextView textView = (TextView) childAt.findViewById(b.g.X1);
            textView.setTextColor(i4 == this.f49219e ? this.C : this.D);
            textView.setTextSize(0, this.B);
            if (this.F) {
                textView.setText(textView.getText().toString().toUpperCase());
            }
            int i5 = this.E;
            if (i5 == 2) {
                textView.getPaint().setFakeBoldText(true);
            } else if (i5 == 0) {
                textView.getPaint().setFakeBoldText(false);
            }
            i4++;
        }
    }

    public TextView A(int i4) {
        return (TextView) this.f49218d.getChildAt(i4).findViewById(b.g.X1);
    }

    public void B(int i4) {
        int i5 = this.f49221g;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        MsgView msgView = (MsgView) this.f49218d.getChildAt(i4).findViewById(b.g.f49639h1);
        if (msgView != null) {
            msgView.setVisibility(8);
        }
    }

    public boolean C() {
        return this.f49237w;
    }

    public boolean D() {
        return this.f49238x;
    }

    public boolean E() {
        return this.f49227m;
    }

    public boolean F() {
        return this.F;
    }

    public void G() {
        this.f49218d.removeAllViews();
        this.f49221g = this.f49217c.length;
        for (int i4 = 0; i4 < this.f49221g; i4++) {
            View inflate = View.inflate(this.f49216b, b.j.J, null);
            inflate.setTag(Integer.valueOf(i4));
            c(i4, inflate);
        }
        j0();
    }

    public void I(int i4) {
        this.f49220f = this.f49219e;
        this.f49219e = i4;
        i0(i4);
        c8.a aVar = this.M;
        if (aVar != null) {
            aVar.d(i4);
        }
        if (this.f49237w) {
            e();
        } else {
            invalidate();
        }
    }

    public void J(int i4) {
        this.f49239y = i4;
        invalidate();
    }

    public void K(float f4) {
        this.A = f(f4);
        invalidate();
    }

    public void L(float f4) {
        this.f49240z = f(f4);
        invalidate();
    }

    public void M(long j4) {
        this.f49236v = j4;
    }

    public void N(boolean z4) {
        this.f49237w = z4;
    }

    public void O(boolean z4) {
        this.f49238x = z4;
    }

    public void P(int i4) {
        this.f49229o = i4;
        invalidate();
    }

    public void Q(float f4) {
        this.f49231q = f(f4);
        invalidate();
    }

    public void R(float f4) {
        this.f49230p = f(f4);
        invalidate();
    }

    public void S(float f4, float f5, float f6, float f7) {
        this.f49232r = f(f4);
        this.f49233s = f(f5);
        this.f49234t = f(f6);
        this.f49235u = f(f7);
        invalidate();
    }

    public void T(int i4, float f4, float f5) {
        int i5 = this.f49221g;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        View childAt = this.f49218d.getChildAt(i4);
        MsgView msgView = (MsgView) childAt.findViewById(b.g.f49639h1);
        if (msgView != null) {
            TextView textView = (TextView) childAt.findViewById(b.g.X1);
            this.P.setTextSize(this.B);
            this.P.measureText(textView.getText().toString());
            float descent = this.P.descent() - this.P.ascent();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) msgView.getLayoutParams();
            marginLayoutParams.setMarginStart(f(f4));
            int i6 = this.J;
            marginLayoutParams.topMargin = i6 > 0 ? (((int) (i6 - descent)) / 2) - f(f5) : f(f5);
            msgView.setLayoutParams(marginLayoutParams);
        }
    }

    public void U(b8.b bVar) {
        this.R = bVar;
    }

    public void V(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalStateException(ProtectedSandApp.s("쌶"));
        }
        this.f49217c = strArr;
        G();
    }

    public void W(String[] strArr, FragmentActivity fragmentActivity, int i4, ArrayList<Fragment> arrayList) {
        this.M = new c8.a(fragmentActivity.getSupportFragmentManager(), i4, arrayList);
        V(strArr);
    }

    public void X(float f4) {
        this.f49226l = f(f4);
        j0();
    }

    public void Y(boolean z4) {
        this.f49227m = z4;
        j0();
    }

    public void Z(float f4) {
        this.f49228n = f(f4);
        j0();
    }

    public void a0(boolean z4) {
        this.F = z4;
        j0();
    }

    public void b0(int i4) {
        this.E = i4;
        j0();
    }

    public void c0(int i4) {
        this.C = i4;
        j0();
    }

    public void d0(int i4) {
        this.D = i4;
        j0();
    }

    public void e0(float f4) {
        this.B = h0(f4);
        j0();
    }

    protected int f(float f4) {
        return (int) ((f4 * this.f49216b.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void f0(int i4) {
        int i5 = this.f49221g;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        g0(i4, 0);
    }

    public int g() {
        return this.f49219e;
    }

    public void g0(int i4, int i5) {
        int i6 = this.f49221g;
        if (i4 >= i6) {
            i4 = i6 - 1;
        }
        MsgView msgView = (MsgView) this.f49218d.getChildAt(i4).findViewById(b.g.f49639h1);
        if (msgView != null) {
            c8.b.b(msgView, i5);
            if (this.Q.get(i4) == null || !this.Q.get(i4).booleanValue()) {
                T(i4, 2.0f, 2.0f);
                this.Q.put(i4, Boolean.TRUE);
            }
        }
    }

    public int h() {
        return this.f49239y;
    }

    protected int h0(float f4) {
        return (int) ((f4 * this.f49216b.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public float i() {
        return this.A;
    }

    public float j() {
        return this.f49240z;
    }

    public long k() {
        return this.f49236v;
    }

    public int l() {
        return this.f49229o;
    }

    public float m() {
        return this.f49231q;
    }

    public float n() {
        return this.f49230p;
    }

    public float o() {
        return this.f49235u;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        b bVar = (b) valueAnimator.getAnimatedValue();
        Rect rect = this.f49222h;
        rect.left = (int) bVar.f49242a;
        rect.right = (int) bVar.f49243b;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode() || this.f49221g <= 0) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        if (this.f49230p < 0.0f) {
            this.f49230p = (height - this.f49233s) - this.f49235u;
        }
        float f4 = this.f49231q;
        if (f4 < 0.0f || f4 > this.f49230p / 2.0f) {
            this.f49231q = this.f49230p / 2.0f;
        }
        this.f49224j.setColor(this.G);
        this.f49224j.setStroke((int) this.I, this.H);
        this.f49224j.setCornerRadius(this.f49231q);
        this.f49224j.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.f49224j.draw(canvas);
        if (!this.f49237w) {
            float f5 = this.f49240z;
            if (f5 > 0.0f) {
                this.f49225k.setStrokeWidth(f5);
                this.f49225k.setColor(this.f49239y);
                for (int i4 = 0; i4 < this.f49221g - 1; i4++) {
                    View childAt = this.f49218d.getChildAt(i4);
                    canvas.drawLine(childAt.getRight() + paddingLeft, this.A, childAt.getRight() + paddingLeft, height - this.A, this.f49225k);
                }
            }
        }
        if (!this.f49237w) {
            d();
        } else if (this.O) {
            this.O = false;
            d();
        }
        this.f49223i.setColor(this.f49229o);
        GradientDrawable gradientDrawable = this.f49223i;
        int i5 = ((int) this.f49232r) + paddingLeft + this.f49222h.left;
        float f6 = this.f49233s;
        gradientDrawable.setBounds(i5, (int) f6, (int) ((paddingLeft + r3.right) - this.f49234t), (int) (f6 + this.f49230p));
        this.f49223i.setCornerRadii(this.N);
        this.f49223i.draw(canvas);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f49219e = bundle.getInt(ProtectedSandApp.s("쌷"));
            parcelable = bundle.getParcelable(ProtectedSandApp.s("쌸"));
            if (this.f49219e != 0 && this.f49218d.getChildCount() > 0) {
                i0(this.f49219e);
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(ProtectedSandApp.s("쌸"), super.onSaveInstanceState());
        bundle.putInt(ProtectedSandApp.s("쌷"), this.f49219e);
        return bundle;
    }

    public float p() {
        return this.f49232r;
    }

    public float q() {
        return this.f49234t;
    }

    public float r() {
        return this.f49233s;
    }

    public MsgView s(int i4) {
        int i5 = this.f49221g;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        return (MsgView) this.f49218d.getChildAt(i4).findViewById(b.g.f49639h1);
    }

    public int t() {
        return this.f49221g;
    }

    public float u() {
        return this.f49226l;
    }

    public float v() {
        return this.f49228n;
    }

    public int w() {
        return this.E;
    }

    public int x() {
        return this.C;
    }

    public int y() {
        return this.D;
    }

    public float z() {
        return this.B;
    }

    public SegmentTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SegmentTabLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f49222h = new Rect();
        this.f49223i = new GradientDrawable();
        this.f49224j = new GradientDrawable();
        this.f49225k = new Paint(1);
        this.L = new OvershootInterpolator(0.8f);
        this.N = new float[8];
        this.O = true;
        this.P = new Paint(1);
        this.Q = new SparseArray<>();
        this.Q1 = new b();
        this.V1 = new b();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        this.f49216b = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f49218d = linearLayout;
        addView(linearLayout);
        H(context, attributeSet);
        String attributeValue = attributeSet.getAttributeValue(ProtectedSandApp.s("쌱"), ProtectedSandApp.s("쌲"));
        if (!attributeValue.equals(ProtectedSandApp.s("쌳")) && !attributeValue.equals(ProtectedSandApp.s("쌴"))) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_height});
            this.J = obtainStyledAttributes.getDimensionPixelSize(0, -2);
            obtainStyledAttributes.recycle();
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(new c(), this.V1, this.Q1);
        this.K = ofObject;
        ofObject.addUpdateListener(this);
    }
}
