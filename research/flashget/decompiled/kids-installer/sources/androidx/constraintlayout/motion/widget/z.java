package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.f;
import androidx.core.widget.NestedScrollView;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: TouchResponse.java */
/* loaded from: classes.dex */
class z {
    private static final int A = 1;
    private static final int B = 2;
    private static final int C = 3;
    private static final int D = 4;
    private static final int E = 5;
    private static final int F = 0;
    private static final int G = 1;
    private static final int H = 2;
    private static final int I = 3;
    private static final int J = 4;
    private static final int K = 5;
    private static final int L = 6;
    static final int M = 1;
    static final int N = 2;

    /* renamed from: w, reason: collision with root package name */
    private static final boolean f2098w = false;

    /* renamed from: z, reason: collision with root package name */
    private static final int f2101z = 0;

    /* renamed from: m, reason: collision with root package name */
    private float f2114m;

    /* renamed from: n, reason: collision with root package name */
    private float f2115n;

    /* renamed from: o, reason: collision with root package name */
    private final MotionLayout f2116o;

    /* renamed from: v, reason: collision with root package name */
    private static final String f2097v = "TouchResponse";

    /* renamed from: x, reason: collision with root package name */
    private static final float[][] f2099x = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* renamed from: y, reason: collision with root package name */
    private static final float[][] f2100y = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* renamed from: a, reason: collision with root package name */
    private int f2102a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f2103b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f2104c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f2105d = -1;

    /* renamed from: e, reason: collision with root package name */
    private int f2106e = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f2107f = -1;

    /* renamed from: g, reason: collision with root package name */
    private float f2108g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    private float f2109h = 0.5f;

    /* renamed from: i, reason: collision with root package name */
    private float f2110i = 0.0f;

    /* renamed from: j, reason: collision with root package name */
    private float f2111j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    private boolean f2112k = false;

    /* renamed from: l, reason: collision with root package name */
    private float[] f2113l = new float[2];

    /* renamed from: p, reason: collision with root package name */
    private float f2117p = 4.0f;

    /* renamed from: q, reason: collision with root package name */
    private float f2118q = 1.2f;

    /* renamed from: r, reason: collision with root package name */
    private boolean f2119r = true;

    /* renamed from: s, reason: collision with root package name */
    private float f2120s = 1.0f;

    /* renamed from: t, reason: collision with root package name */
    private int f2121t = 0;

    /* renamed from: u, reason: collision with root package name */
    private float f2122u = 10.0f;

    /* compiled from: TouchResponse.java */
    class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* compiled from: TouchResponse.java */
    /* loaded from: classes2.dex */
    class b implements NestedScrollView.c {
        b() {
        }

        @Override // androidx.core.widget.NestedScrollView.c
        public void a(NestedScrollView nestedScrollView, int i5, int i6, int i7, int i8) {
        }
    }

    z(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.f2116o = motionLayout;
        c(context, Xml.asAttributeSet(xmlPullParser));
    }

    private void b(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i5 = 0; i5 < indexCount; i5++) {
            int index = typedArray.getIndex(i5);
            if (index == f.m.fg) {
                this.f2105d = typedArray.getResourceId(index, this.f2105d);
            } else if (index == f.m.gg) {
                int i6 = typedArray.getInt(index, this.f2102a);
                this.f2102a = i6;
                float[] fArr = f2099x[i6];
                this.f2109h = fArr[0];
                this.f2108g = fArr[1];
            } else if (index == f.m.Wf) {
                int i7 = typedArray.getInt(index, this.f2103b);
                this.f2103b = i7;
                float[] fArr2 = f2100y[i7];
                this.f2110i = fArr2[0];
                this.f2111j = fArr2[1];
            } else if (index == f.m.bg) {
                this.f2117p = typedArray.getFloat(index, this.f2117p);
            } else if (index == f.m.ag) {
                this.f2118q = typedArray.getFloat(index, this.f2118q);
            } else if (index == f.m.cg) {
                this.f2119r = typedArray.getBoolean(index, this.f2119r);
            } else if (index == f.m.Xf) {
                this.f2120s = typedArray.getFloat(index, this.f2120s);
            } else if (index == f.m.Yf) {
                this.f2122u = typedArray.getFloat(index, this.f2122u);
            } else if (index == f.m.hg) {
                this.f2106e = typedArray.getResourceId(index, this.f2106e);
            } else if (index == f.m.eg) {
                this.f2104c = typedArray.getInt(index, this.f2104c);
            } else if (index == f.m.dg) {
                this.f2121t = typedArray.getInteger(index, 0);
            } else if (index == f.m.Zf) {
                this.f2107f = typedArray.getResourceId(index, 0);
            }
        }
    }

    private void c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.m.Vf);
        b(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    float a(float f6, float f7) {
        return (f7 * this.f2111j) + (f6 * this.f2110i);
    }

    public int d() {
        return this.f2105d;
    }

    public int e() {
        return this.f2121t;
    }

    RectF f(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i5 = this.f2107f;
        if (i5 == -1 || (findViewById = viewGroup.findViewById(i5)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    int g() {
        return this.f2107f;
    }

    float h() {
        return this.f2118q;
    }

    public float i() {
        return this.f2117p;
    }

    boolean j() {
        return this.f2119r;
    }

    float k(float f6, float f7) {
        this.f2116o.E0(this.f2105d, this.f2116o.O0(), this.f2109h, this.f2108g, this.f2113l);
        float f8 = this.f2110i;
        if (f8 != 0.0f) {
            float[] fArr = this.f2113l;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f6 * f8) / fArr[0];
        }
        float[] fArr2 = this.f2113l;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f7 * this.f2111j) / fArr2[1];
    }

    RectF l(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i5 = this.f2106e;
        if (i5 == -1 || (findViewById = viewGroup.findViewById(i5)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    int m() {
        return this.f2106e;
    }

    void n(MotionEvent motionEvent, MotionLayout.f fVar, int i5, v vVar) {
        int i6;
        fVar.d(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f2114m = motionEvent.getRawX();
            this.f2115n = motionEvent.getRawY();
            this.f2112k = false;
            return;
        }
        if (action == 1) {
            this.f2112k = false;
            fVar.g(1000);
            float f6 = fVar.f();
            float e6 = fVar.e();
            float O0 = this.f2116o.O0();
            int i7 = this.f2105d;
            if (i7 != -1) {
                this.f2116o.E0(i7, O0, this.f2109h, this.f2108g, this.f2113l);
            } else {
                float min = Math.min(this.f2116o.getWidth(), this.f2116o.getHeight());
                float[] fArr = this.f2113l;
                fArr[1] = this.f2111j * min;
                fArr[0] = min * this.f2110i;
            }
            float f7 = this.f2110i;
            float[] fArr2 = this.f2113l;
            float f8 = f7 != 0.0f ? f6 / fArr2[0] : e6 / fArr2[1];
            float f9 = !Float.isNaN(f8) ? (f8 / 3.0f) + O0 : O0;
            if (f9 == 0.0f || f9 == 1.0f || (i6 = this.f2104c) == 3) {
                if (0.0f >= f9 || 1.0f <= f9) {
                    this.f2116o.o1(MotionLayout.j.FINISHED);
                    return;
                }
                return;
            }
            this.f2116o.w1(i6, ((double) f9) < 0.5d ? 0.0f : 1.0f, f8);
            if (0.0f >= O0 || 1.0f <= O0) {
                this.f2116o.o1(MotionLayout.j.FINISHED);
                return;
            }
            return;
        }
        if (action != 2) {
            return;
        }
        float rawY = motionEvent.getRawY() - this.f2115n;
        float rawX = motionEvent.getRawX() - this.f2114m;
        if (Math.abs((this.f2111j * rawY) + (this.f2110i * rawX)) > this.f2122u || this.f2112k) {
            float O02 = this.f2116o.O0();
            if (!this.f2112k) {
                this.f2112k = true;
                this.f2116o.l1(O02);
            }
            int i8 = this.f2105d;
            if (i8 != -1) {
                this.f2116o.E0(i8, O02, this.f2109h, this.f2108g, this.f2113l);
            } else {
                float min2 = Math.min(this.f2116o.getWidth(), this.f2116o.getHeight());
                float[] fArr3 = this.f2113l;
                fArr3[1] = this.f2111j * min2;
                fArr3[0] = min2 * this.f2110i;
            }
            float f10 = this.f2110i;
            float[] fArr4 = this.f2113l;
            if (Math.abs(((this.f2111j * fArr4[1]) + (f10 * fArr4[0])) * this.f2120s) < 0.01d) {
                float[] fArr5 = this.f2113l;
                fArr5[0] = 0.01f;
                fArr5[1] = 0.01f;
            }
            float max = Math.max(Math.min(O02 + (this.f2110i != 0.0f ? rawX / this.f2113l[0] : rawY / this.f2113l[1]), 1.0f), 0.0f);
            if (max != this.f2116o.O0()) {
                this.f2116o.l1(max);
                fVar.g(1000);
                this.f2116o.W = this.f2110i != 0.0f ? fVar.f() / this.f2113l[0] : fVar.e() / this.f2113l[1];
            } else {
                this.f2116o.W = 0.0f;
            }
            this.f2114m = motionEvent.getRawX();
            this.f2115n = motionEvent.getRawY();
        }
    }

    void o(float f6, float f7) {
        float O0 = this.f2116o.O0();
        if (!this.f2112k) {
            this.f2112k = true;
            this.f2116o.l1(O0);
        }
        this.f2116o.E0(this.f2105d, O0, this.f2109h, this.f2108g, this.f2113l);
        float f8 = this.f2110i;
        float[] fArr = this.f2113l;
        if (Math.abs((this.f2111j * fArr[1]) + (f8 * fArr[0])) < 0.01d) {
            float[] fArr2 = this.f2113l;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f9 = this.f2110i;
        float max = Math.max(Math.min(O0 + (f9 != 0.0f ? (f6 * f9) / this.f2113l[0] : (f7 * this.f2111j) / this.f2113l[1]), 1.0f), 0.0f);
        if (max != this.f2116o.O0()) {
            this.f2116o.l1(max);
        }
    }

    void p(float f6, float f7) {
        this.f2112k = false;
        float O0 = this.f2116o.O0();
        this.f2116o.E0(this.f2105d, O0, this.f2109h, this.f2108g, this.f2113l);
        float f8 = this.f2110i;
        float[] fArr = this.f2113l;
        float f9 = f8 != 0.0f ? (f6 * f8) / fArr[0] : (f7 * this.f2111j) / fArr[1];
        if (!Float.isNaN(f9)) {
            O0 += f9 / 3.0f;
        }
        if (O0 != 0.0f) {
            boolean z5 = O0 != 1.0f;
            int i5 = this.f2104c;
            if ((i5 != 3) && z5) {
                this.f2116o.w1(i5, ((double) O0) >= 0.5d ? 1.0f : 0.0f, f9);
            }
        }
    }

    public void q(int i5) {
        this.f2105d = i5;
    }

    void r(float f6, float f7) {
        this.f2114m = f6;
        this.f2115n = f7;
    }

    public void s(float f6) {
        this.f2118q = f6;
    }

    public void t(float f6) {
        this.f2117p = f6;
    }

    public String toString() {
        return this.f2110i + " , " + this.f2111j;
    }

    public void u(boolean z5) {
        if (z5) {
            float[][] fArr = f2100y;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = f2099x;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = f2100y;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = f2099x;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = f2099x[this.f2102a];
        this.f2109h = fArr5[0];
        this.f2108g = fArr5[1];
        float[] fArr6 = f2100y[this.f2103b];
        this.f2110i = fArr6[0];
        this.f2111j = fArr6[1];
    }

    public void v(float f6, float f7) {
        this.f2109h = f6;
        this.f2108g = f7;
    }

    void w(float f6, float f7) {
        this.f2114m = f6;
        this.f2115n = f7;
        this.f2112k = false;
    }

    void x() {
        View view;
        int i5 = this.f2105d;
        if (i5 != -1) {
            view = this.f2116o.findViewById(i5);
            if (view == null) {
                d.i(this.f2116o.getContext(), this.f2105d);
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new a());
            nestedScrollView.W(new b());
        }
    }
}
