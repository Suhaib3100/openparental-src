package com.github.mikephil.charting.charts;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.mikephil.charting.animation.b;
import com.github.mikephil.charting.components.e;
import com.github.mikephil.charting.components.j;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.k;
import com.github.mikephil.charting.utils.g;
import f8.e;

/* loaded from: classes5.dex */
public abstract class PieRadarChartBase<T extends k<? extends e<? extends Entry>>> extends Chart<T> {
    private float O;
    private float P;
    protected boolean Q;
    protected float R;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            PieRadarChartBase.this.postInvalidate();
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50266a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f50267b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f50268c;

        static {
            int[] iArr = new int[e.EnumC0775e.values().length];
            f50268c = iArr;
            try {
                iArr[e.EnumC0775e.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50268c[e.EnumC0775e.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[e.d.values().length];
            f50267b = iArr2;
            try {
                iArr2[e.d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50267b[e.d.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50267b[e.d.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[e.f.values().length];
            f50266a = iArr3;
            try {
                iArr3[e.f.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50266a[e.f.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public PieRadarChartBase(Context context) {
        super(context);
        this.O = 270.0f;
        this.P = 270.0f;
        this.Q = true;
        this.R = 0.0f;
    }

    protected abstract float A1();

    protected abstract float B1();

    public float C1() {
        return this.O;
    }

    public boolean D1() {
        return this.Q;
    }

    public void E1(float f4) {
        this.R = f4;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void F0() {
        if (this.f50233c == null) {
            return;
        }
        I();
        if (this.f50243m != null) {
            this.f50248r.a(this.f50233c);
        }
        J();
    }

    public void F1(float f4) {
        this.P = f4;
        this.O = com.github.mikephil.charting.utils.k.z(f4);
    }

    public void G1(boolean z4) {
        this.Q = z4;
    }

    @SuppressLint({"NewApi"})
    public void H1(int i4, float f4, float f5, b.c0 c0Var) {
        F1(f4);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, ProtectedSandApp.s("쏰"), f4, f5);
        ofFloat.setDuration(i4);
        ofFloat.setInterpolator(c0Var);
        ofFloat.addUpdateListener(new a());
        ofFloat.start();
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected void I() {
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void J() {
        float f4;
        float f5;
        float f6;
        float e4;
        float f7;
        float f10;
        float f11;
        float f12;
        com.github.mikephil.charting.components.e eVar = this.f50243m;
        float f13 = 0.0f;
        if (eVar == null || !eVar.f() || this.f50243m.H()) {
            f4 = 0.0f;
            f5 = 0.0f;
            f6 = 0.0f;
        } else {
            float min = Math.min(this.f50243m.f50315x, this.f50243m.z() * this.f50251u.o());
            int i4 = b.f50268c[this.f50243m.C().ordinal()];
            if (i4 != 1) {
                if (i4 == 2 && (this.f50243m.E() == e.f.TOP || this.f50243m.E() == e.f.BOTTOM)) {
                    f12 = Math.min(this.f50243m.f50316y + B1(), this.f50243m.z() * this.f50251u.n());
                    int i5 = b.f50266a[this.f50243m.E().ordinal()];
                    if (i5 == 1) {
                        e4 = 0.0f;
                        f11 = e4;
                    } else if (i5 == 2) {
                        f11 = f12;
                        f12 = 0.0f;
                        e4 = 0.0f;
                    }
                }
                f12 = 0.0f;
                e4 = 0.0f;
                f11 = e4;
            } else {
                if (this.f50243m.y() != e.d.LEFT && this.f50243m.y() != e.d.RIGHT) {
                    e4 = 0.0f;
                } else if (this.f50243m.E() == e.f.CENTER) {
                    e4 = com.github.mikephil.charting.utils.k.e(13.0f) + min;
                } else {
                    e4 = com.github.mikephil.charting.utils.k.e(8.0f) + min;
                    com.github.mikephil.charting.components.e eVar2 = this.f50243m;
                    float f14 = eVar2.f50316y + eVar2.f50317z;
                    g S = S();
                    float width = this.f50243m.y() == e.d.RIGHT ? (getWidth() - e4) + 15.0f : e4 - 15.0f;
                    float f15 = f14 + 15.0f;
                    float r12 = r1(width, f15);
                    g w12 = w1(S, y1(), s1(width, f15));
                    float r13 = r1(w12.f50636d, w12.f50637e);
                    float e5 = com.github.mikephil.charting.utils.k.e(5.0f);
                    if (f15 < S.f50637e || getHeight() - e4 <= getWidth()) {
                        e4 = r12 < r13 ? (r13 - r12) + e5 : 0.0f;
                    }
                    g.h(S);
                    g.h(w12);
                }
                int i6 = b.f50267b[this.f50243m.y().ordinal()];
                if (i6 == 1) {
                    f7 = 0.0f;
                    f10 = 0.0f;
                    f13 = e4;
                    e4 = 0.0f;
                } else if (i6 != 2) {
                    if (i6 == 3) {
                        int i7 = b.f50266a[this.f50243m.E().ordinal()];
                        if (i7 == 1) {
                            f10 = Math.min(this.f50243m.f50316y, this.f50243m.z() * this.f50251u.n());
                            f7 = 0.0f;
                            e4 = 0.0f;
                        } else if (i7 == 2) {
                            f7 = Math.min(this.f50243m.f50316y, this.f50243m.z() * this.f50251u.n());
                            e4 = 0.0f;
                            f10 = e4;
                        }
                    }
                    f7 = 0.0f;
                    e4 = 0.0f;
                    f10 = e4;
                } else {
                    f7 = 0.0f;
                    f10 = 0.0f;
                }
                float f16 = f10;
                f11 = f7;
                f12 = f16;
            }
            f13 += A1();
            f5 = e4 + A1();
            f4 = f12 + A1();
            f6 = f11 + A1();
        }
        float e6 = com.github.mikephil.charting.utils.k.e(this.R);
        if (this instanceof RadarChart) {
            j o02 = o0();
            if (o02.f() && o02.P()) {
                e6 = Math.max(e6, o02.L);
            }
        }
        this.f50251u.U(Math.max(e6, X() + f13), Math.max(e6, Z() + f4), Math.max(e6, Y() + f5), Math.max(e6, Math.max(A1(), W() + f6)));
    }

    @Override // android.view.View
    public void computeScroll() {
        com.github.mikephil.charting.listener.b bVar = this.f50245o;
        if (bVar instanceof com.github.mikephil.charting.listener.g) {
            ((com.github.mikephil.charting.listener.g) bVar).i();
        }
    }

    @Override // e8.e
    public float k() {
        return 0.0f;
    }

    @Override // e8.e
    public float l() {
        return 0.0f;
    }

    @Override // e8.e
    public int m() {
        return this.f50233c.r();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.github.mikephil.charting.listener.b bVar;
        return (!this.f50241k || (bVar = this.f50245o) == null) ? super.onTouchEvent(motionEvent) : bVar.onTouch(this, motionEvent);
    }

    public float r1(float f4, float f5) {
        g j4 = j();
        float f6 = j4.f50636d;
        float f7 = f4 > f6 ? f4 - f6 : f6 - f4;
        float sqrt = (float) Math.sqrt(Math.pow(f5 > j4.f50637e ? f5 - r1 : r1 - f5, 2.0d) + Math.pow(f7, 2.0d));
        g.h(j4);
        return sqrt;
    }

    public float s1(float f4, float f5) {
        g j4 = j();
        double d5 = f4 - j4.f50636d;
        double d6 = f5 - j4.f50637e;
        float degrees = (float) Math.toDegrees(Math.acos(d6 / Math.sqrt((d6 * d6) + (d5 * d5))));
        if (f4 > j4.f50636d) {
            degrees = 360.0f - degrees;
        }
        float f6 = degrees + 90.0f;
        if (f6 > 360.0f) {
            f6 -= 360.0f;
        }
        g.h(j4);
        return f6;
    }

    public float t1() {
        RectF q4 = this.f50251u.q();
        q4.left = X() + q4.left;
        q4.top = Z() + q4.top;
        q4.right -= Y();
        q4.bottom -= W();
        return Math.min(q4.width(), q4.height());
    }

    public abstract int u1(float f4);

    public float v1() {
        return this.R;
    }

    public g w1(g gVar, float f4, float f5) {
        g c5 = g.c(0.0f, 0.0f);
        x1(gVar, f4, f5, c5);
        return c5;
    }

    public void x1(g gVar, float f4, float f5, g gVar2) {
        double d5 = f4;
        double d6 = f5;
        gVar2.f50636d = (float) ((Math.cos(Math.toRadians(d6)) * d5) + gVar.f50636d);
        gVar2.f50637e = (float) ((Math.sin(Math.toRadians(d6)) * d5) + gVar.f50637e);
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected void y0() {
        super.y0();
        this.f50245o = new com.github.mikephil.charting.listener.g(this);
    }

    public abstract float y1();

    public float z1() {
        return this.P;
    }

    public PieRadarChartBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.O = 270.0f;
        this.P = 270.0f;
        this.Q = true;
        this.R = 0.0f;
    }

    public PieRadarChartBase(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.O = 270.0f;
        this.P = 270.0f;
        this.Q = true;
        this.R = 0.0f;
    }
}
