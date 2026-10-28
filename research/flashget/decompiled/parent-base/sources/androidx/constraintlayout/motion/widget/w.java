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
import androidx.constraintlayout.widget.g;
import androidx.core.widget.NestedScrollView;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: TouchResponse.java */
/* loaded from: classes.dex */
class w {
    private static final boolean H = false;
    private static final int I = 1000;
    private static final float J = 1.0E-7f;
    private static final int M = 0;
    private static final int N = 1;
    private static final int O = 2;
    private static final int P = 3;
    private static final int Q = 4;
    private static final int R = 5;
    private static final int S = 0;
    private static final int T = 1;
    private static final int U = 2;
    private static final int V = 3;
    private static final int W = 4;
    private static final int X = 5;
    private static final int Y = 6;
    static final int Z = 1;

    /* renamed from: a0, reason: collision with root package name */
    static final int f23642a0 = 2;

    /* renamed from: b0, reason: collision with root package name */
    static final int f23643b0 = 4;

    /* renamed from: c0, reason: collision with root package name */
    public static final int f23644c0 = 0;

    /* renamed from: d0, reason: collision with root package name */
    public static final int f23645d0 = 1;
    private float A;
    private float B;
    private float C;
    private float D;
    private int E;
    private int F;

    /* renamed from: a, reason: collision with root package name */
    private int f23646a;

    /* renamed from: b, reason: collision with root package name */
    private int f23647b;

    /* renamed from: c, reason: collision with root package name */
    private int f23648c;

    /* renamed from: d, reason: collision with root package name */
    private int f23649d;

    /* renamed from: e, reason: collision with root package name */
    private int f23650e;

    /* renamed from: f, reason: collision with root package name */
    private int f23651f;

    /* renamed from: g, reason: collision with root package name */
    private float f23652g;

    /* renamed from: h, reason: collision with root package name */
    private float f23653h;

    /* renamed from: i, reason: collision with root package name */
    float f23654i;

    /* renamed from: j, reason: collision with root package name */
    float f23655j;

    /* renamed from: k, reason: collision with root package name */
    private int f23656k;

    /* renamed from: l, reason: collision with root package name */
    boolean f23657l;

    /* renamed from: m, reason: collision with root package name */
    private float f23658m;

    /* renamed from: n, reason: collision with root package name */
    private float f23659n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f23660o;

    /* renamed from: p, reason: collision with root package name */
    private float[] f23661p;

    /* renamed from: q, reason: collision with root package name */
    private int[] f23662q;

    /* renamed from: r, reason: collision with root package name */
    private float f23663r;

    /* renamed from: s, reason: collision with root package name */
    private float f23664s;

    /* renamed from: t, reason: collision with root package name */
    private final MotionLayout f23665t;

    /* renamed from: u, reason: collision with root package name */
    private float f23666u;

    /* renamed from: v, reason: collision with root package name */
    private float f23667v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f23668w;

    /* renamed from: x, reason: collision with root package name */
    private float f23669x;

    /* renamed from: y, reason: collision with root package name */
    private int f23670y;

    /* renamed from: z, reason: collision with root package name */
    private float f23671z;
    private static final String G = "TouchResponse";
    private static final float[][] K = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    private static final float[][] L = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* compiled from: TouchResponse.java */
    class a implements View.OnTouchListener {
        a(final w this$0) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* compiled from: TouchResponse.java */
    class b implements NestedScrollView.e {
        b(final w this$0) {
        }

        @Override // androidx.core.widget.NestedScrollView.e
        public void a(NestedScrollView v4, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
        }
    }

    w(Context context, MotionLayout layout, XmlPullParser parser) {
        this.f23646a = 0;
        this.f23647b = 0;
        this.f23648c = 0;
        this.f23649d = -1;
        this.f23650e = -1;
        this.f23651f = -1;
        this.f23652g = 0.5f;
        this.f23653h = 0.5f;
        this.f23654i = 0.5f;
        this.f23655j = 0.5f;
        this.f23656k = -1;
        this.f23657l = false;
        this.f23658m = 0.0f;
        this.f23659n = 1.0f;
        this.f23660o = false;
        this.f23661p = new float[2];
        this.f23662q = new int[2];
        this.f23666u = 4.0f;
        this.f23667v = 1.2f;
        this.f23668w = true;
        this.f23669x = 1.0f;
        this.f23670y = 0;
        this.f23671z = 10.0f;
        this.A = 10.0f;
        this.B = 1.0f;
        this.C = Float.NaN;
        this.D = Float.NaN;
        this.E = 0;
        this.F = 0;
        this.f23665t = layout;
        c(context, Xml.asAttributeSet(parser));
    }

    private void b(TypedArray a5) {
        int indexCount = a5.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = a5.getIndex(i4);
            if (index == g.m.Rk) {
                this.f23649d = a5.getResourceId(index, this.f23649d);
            } else if (index == g.m.Sk) {
                int i5 = a5.getInt(index, this.f23646a);
                this.f23646a = i5;
                float[] fArr = K[i5];
                this.f23653h = fArr[0];
                this.f23652g = fArr[1];
            } else if (index == g.m.Ck) {
                int i6 = a5.getInt(index, this.f23647b);
                this.f23647b = i6;
                float[][] fArr2 = L;
                if (i6 < fArr2.length) {
                    float[] fArr3 = fArr2[i6];
                    this.f23658m = fArr3[0];
                    this.f23659n = fArr3[1];
                } else {
                    this.f23659n = Float.NaN;
                    this.f23658m = Float.NaN;
                    this.f23657l = true;
                }
            } else if (index == g.m.Hk) {
                this.f23666u = a5.getFloat(index, this.f23666u);
            } else if (index == g.m.Gk) {
                this.f23667v = a5.getFloat(index, this.f23667v);
            } else if (index == g.m.Ik) {
                this.f23668w = a5.getBoolean(index, this.f23668w);
            } else if (index == g.m.Dk) {
                this.f23669x = a5.getFloat(index, this.f23669x);
            } else if (index == g.m.Ek) {
                this.f23671z = a5.getFloat(index, this.f23671z);
            } else if (index == g.m.Tk) {
                this.f23650e = a5.getResourceId(index, this.f23650e);
            } else if (index == g.m.Kk) {
                this.f23648c = a5.getInt(index, this.f23648c);
            } else if (index == g.m.Jk) {
                this.f23670y = a5.getInteger(index, 0);
            } else if (index == g.m.Fk) {
                this.f23651f = a5.getResourceId(index, 0);
            } else if (index == g.m.Lk) {
                this.f23656k = a5.getResourceId(index, this.f23656k);
            } else if (index == g.m.Nk) {
                this.A = a5.getFloat(index, this.A);
            } else if (index == g.m.Ok) {
                this.B = a5.getFloat(index, this.B);
            } else if (index == g.m.Pk) {
                this.C = a5.getFloat(index, this.C);
            } else if (index == g.m.Qk) {
                this.D = a5.getFloat(index, this.D);
            } else if (index == g.m.Mk) {
                this.E = a5.getInt(index, this.E);
            } else if (index == g.m.Bk) {
                this.F = a5.getInt(index, this.F);
            }
        }
    }

    private void c(Context context, AttributeSet attrs) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, g.m.Ak);
        b(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    void A(float lastTouchX, float lastTouchY) {
        this.f23663r = lastTouchX;
        this.f23664s = lastTouchY;
    }

    public void B(float acceleration) {
        this.f23667v = acceleration;
    }

    public void C(float velocity) {
        this.f23666u = velocity;
    }

    public void D(boolean rtl) {
        if (rtl) {
            float[][] fArr = L;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = K;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = L;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = K;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = K[this.f23646a];
        this.f23653h = fArr5[0];
        this.f23652g = fArr5[1];
        int i4 = this.f23647b;
        float[][] fArr6 = L;
        if (i4 >= fArr6.length) {
            return;
        }
        float[] fArr7 = fArr6[i4];
        this.f23658m = fArr7[0];
        this.f23659n = fArr7[1];
    }

    public void E(float x4, float y4) {
        this.f23653h = x4;
        this.f23652g = y4;
    }

    public void F(int touchUpMode) {
        this.f23648c = touchUpMode;
    }

    void G(float lastTouchX, float lastTouchY) {
        this.f23663r = lastTouchX;
        this.f23664s = lastTouchY;
        this.f23660o = false;
    }

    void H() {
        View view;
        int i4 = this.f23649d;
        if (i4 != -1) {
            view = this.f23665t.findViewById(i4);
            if (view == null) {
                c.i(this.f23665t.getContext(), this.f23649d);
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new a());
            nestedScrollView.S(new b());
        }
    }

    float a(float dx, float dy) {
        return (dy * this.f23659n) + (dx * this.f23658m);
    }

    public int d() {
        return this.f23649d;
    }

    public int e() {
        return this.F;
    }

    public int f() {
        return this.f23670y;
    }

    RectF g(ViewGroup layout, RectF rect) {
        View findViewById;
        int i4 = this.f23651f;
        if (i4 == -1 || (findViewById = layout.findViewById(i4)) == null) {
            return null;
        }
        rect.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rect;
    }

    int h() {
        return this.f23651f;
    }

    float i() {
        return this.f23667v;
    }

    public float j() {
        return this.f23666u;
    }

    boolean k() {
        return this.f23668w;
    }

    float l(float dx, float dy) {
        this.f23665t.P0(this.f23649d, this.f23665t.a1(), this.f23653h, this.f23652g, this.f23661p);
        float f4 = this.f23658m;
        if (f4 != 0.0f) {
            float[] fArr = this.f23661p;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (dx * f4) / fArr[0];
        }
        float[] fArr2 = this.f23661p;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (dy * this.f23659n) / fArr2[1];
    }

    public int m() {
        return this.E;
    }

    public float n() {
        return this.A;
    }

    public float o() {
        return this.B;
    }

    public float p() {
        return this.C;
    }

    public float q() {
        return this.D;
    }

    RectF r(ViewGroup layout, RectF rect) {
        View findViewById;
        int i4 = this.f23650e;
        if (i4 == -1 || (findViewById = layout.findViewById(i4)) == null) {
            return null;
        }
        rect.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rect;
    }

    int s() {
        return this.f23650e;
    }

    boolean t() {
        return this.f23660o;
    }

    public String toString() {
        if (Float.isNaN(this.f23658m)) {
            return "rotation";
        }
        return this.f23658m + " , " + this.f23659n;
    }

    void u(MotionEvent event, MotionLayout.i velocityTracker, int currentState, t motionScene) {
        int i4;
        if (this.f23657l) {
            v(event, velocityTracker, currentState, motionScene);
            return;
        }
        velocityTracker.b(event);
        int action = event.getAction();
        if (action == 0) {
            this.f23663r = event.getRawX();
            this.f23664s = event.getRawY();
            this.f23660o = false;
            return;
        }
        if (action == 1) {
            this.f23660o = false;
            velocityTracker.g(1000);
            float d5 = velocityTracker.d();
            float c5 = velocityTracker.c();
            float a12 = this.f23665t.a1();
            int i5 = this.f23649d;
            if (i5 != -1) {
                this.f23665t.P0(i5, a12, this.f23653h, this.f23652g, this.f23661p);
            } else {
                float min = Math.min(this.f23665t.getWidth(), this.f23665t.getHeight());
                float[] fArr = this.f23661p;
                fArr[1] = this.f23659n * min;
                fArr[0] = min * this.f23658m;
            }
            float f4 = this.f23658m;
            float[] fArr2 = this.f23661p;
            float f5 = f4 != 0.0f ? d5 / fArr2[0] : c5 / fArr2[1];
            float f6 = !Float.isNaN(f5) ? (f5 / 3.0f) + a12 : a12;
            if (f6 == 0.0f || f6 == 1.0f || (i4 = this.f23648c) == 3) {
                if (0.0f >= f6 || 1.0f <= f6) {
                    this.f23665t.J1(MotionLayout.m.FINISHED);
                    return;
                }
                return;
            }
            float f7 = ((double) f6) < 0.5d ? 0.0f : 1.0f;
            if (i4 == 6) {
                if (a12 + f5 < 0.0f) {
                    f5 = Math.abs(f5);
                }
                f7 = 1.0f;
            }
            if (this.f23648c == 7) {
                if (a12 + f5 > 1.0f) {
                    f5 = -Math.abs(f5);
                }
                f7 = 0.0f;
            }
            this.f23665t.S1(this.f23648c, f7, f5);
            if (0.0f >= a12 || 1.0f <= a12) {
                this.f23665t.J1(MotionLayout.m.FINISHED);
                return;
            }
            return;
        }
        if (action != 2) {
            return;
        }
        float rawY = event.getRawY() - this.f23664s;
        float rawX = event.getRawX() - this.f23663r;
        if (Math.abs((this.f23659n * rawY) + (this.f23658m * rawX)) > this.f23671z || this.f23660o) {
            float a13 = this.f23665t.a1();
            if (!this.f23660o) {
                this.f23660o = true;
                this.f23665t.F1(a13);
            }
            int i6 = this.f23649d;
            if (i6 != -1) {
                this.f23665t.P0(i6, a13, this.f23653h, this.f23652g, this.f23661p);
            } else {
                float min2 = Math.min(this.f23665t.getWidth(), this.f23665t.getHeight());
                float[] fArr3 = this.f23661p;
                fArr3[1] = this.f23659n * min2;
                fArr3[0] = min2 * this.f23658m;
            }
            float f10 = this.f23658m;
            float[] fArr4 = this.f23661p;
            if (Math.abs(((this.f23659n * fArr4[1]) + (f10 * fArr4[0])) * this.f23669x) < 0.01d) {
                float[] fArr5 = this.f23661p;
                fArr5[0] = 0.01f;
                fArr5[1] = 0.01f;
            }
            float max = Math.max(Math.min(a13 + (this.f23658m != 0.0f ? rawX / this.f23661p[0] : rawY / this.f23661p[1]), 1.0f), 0.0f);
            if (this.f23648c == 6) {
                max = Math.max(max, 0.01f);
            }
            if (this.f23648c == 7) {
                max = Math.min(max, 0.99f);
            }
            float a14 = this.f23665t.a1();
            if (max != a14) {
                if (a14 == 0.0f || a14 == 1.0f) {
                    this.f23665t.I0(a14 == 0.0f);
                }
                this.f23665t.F1(max);
                velocityTracker.g(1000);
                this.f23665t.M = this.f23658m != 0.0f ? velocityTracker.d() / this.f23661p[0] : velocityTracker.c() / this.f23661p[1];
            } else {
                this.f23665t.M = 0.0f;
            }
            this.f23663r = event.getRawX();
            this.f23664s = event.getRawY();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x028d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void v(android.view.MotionEvent r24, androidx.constraintlayout.motion.widget.MotionLayout.i r25, int r26, androidx.constraintlayout.motion.widget.t r27) {
        /*
            Method dump skipped, instructions count: 827
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.w.v(android.view.MotionEvent, androidx.constraintlayout.motion.widget.MotionLayout$i, int, androidx.constraintlayout.motion.widget.t):void");
    }

    void w(float dx, float dy) {
        float a12 = this.f23665t.a1();
        if (!this.f23660o) {
            this.f23660o = true;
            this.f23665t.F1(a12);
        }
        this.f23665t.P0(this.f23649d, a12, this.f23653h, this.f23652g, this.f23661p);
        float f4 = this.f23658m;
        float[] fArr = this.f23661p;
        if (Math.abs((this.f23659n * fArr[1]) + (f4 * fArr[0])) < 0.01d) {
            float[] fArr2 = this.f23661p;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f5 = this.f23658m;
        float max = Math.max(Math.min(a12 + (f5 != 0.0f ? (dx * f5) / this.f23661p[0] : (dy * this.f23659n) / this.f23661p[1]), 1.0f), 0.0f);
        if (max != this.f23665t.a1()) {
            this.f23665t.F1(max);
        }
    }

    void x(float dx, float dy) {
        this.f23660o = false;
        float a12 = this.f23665t.a1();
        this.f23665t.P0(this.f23649d, a12, this.f23653h, this.f23652g, this.f23661p);
        float f4 = this.f23658m;
        float[] fArr = this.f23661p;
        float f5 = f4 != 0.0f ? (dx * f4) / fArr[0] : (dy * this.f23659n) / fArr[1];
        if (!Float.isNaN(f5)) {
            a12 += f5 / 3.0f;
        }
        if (a12 != 0.0f) {
            boolean z4 = a12 != 1.0f;
            int i4 = this.f23648c;
            if ((i4 != 3) && z4) {
                this.f23665t.S1(i4, ((double) a12) >= 0.5d ? 1.0f : 0.0f, f5);
            }
        }
    }

    public void y(int id2) {
        this.f23649d = id2;
    }

    void z(int autoCompleteMode) {
        this.F = autoCompleteMode;
    }

    public w(MotionLayout layout, u onSwipe) {
        this.f23646a = 0;
        this.f23647b = 0;
        this.f23648c = 0;
        this.f23649d = -1;
        this.f23650e = -1;
        this.f23651f = -1;
        this.f23652g = 0.5f;
        this.f23653h = 0.5f;
        this.f23654i = 0.5f;
        this.f23655j = 0.5f;
        this.f23656k = -1;
        this.f23657l = false;
        this.f23658m = 0.0f;
        this.f23659n = 1.0f;
        this.f23660o = false;
        this.f23661p = new float[2];
        this.f23662q = new int[2];
        this.f23666u = 4.0f;
        this.f23667v = 1.2f;
        this.f23668w = true;
        this.f23669x = 1.0f;
        this.f23670y = 0;
        this.f23671z = 10.0f;
        this.A = 10.0f;
        this.B = 1.0f;
        this.C = Float.NaN;
        this.D = Float.NaN;
        this.E = 0;
        this.F = 0;
        this.f23665t = layout;
        this.f23649d = onSwipe.q();
        int r4 = onSwipe.r();
        this.f23646a = r4;
        if (r4 != -1) {
            float[] fArr = K[r4];
            this.f23653h = fArr[0];
            this.f23652g = fArr[1];
        }
        int b5 = onSwipe.b();
        this.f23647b = b5;
        float[][] fArr2 = L;
        if (b5 < fArr2.length) {
            float[] fArr3 = fArr2[b5];
            this.f23658m = fArr3[0];
            this.f23659n = fArr3[1];
        } else {
            this.f23659n = Float.NaN;
            this.f23658m = Float.NaN;
            this.f23657l = true;
        }
        this.f23666u = onSwipe.g();
        this.f23667v = onSwipe.f();
        this.f23668w = onSwipe.h();
        this.f23669x = onSwipe.c();
        this.f23671z = onSwipe.d();
        this.f23650e = onSwipe.s();
        this.f23648c = onSwipe.j();
        this.f23670y = onSwipe.i();
        this.f23651f = onSwipe.e();
        this.f23656k = onSwipe.k();
        this.E = onSwipe.l();
        this.A = onSwipe.m();
        this.B = onSwipe.n();
        this.C = onSwipe.o();
        this.D = onSwipe.p();
        this.F = onSwipe.a();
    }
}
