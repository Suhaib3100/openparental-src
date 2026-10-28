package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.e;
import androidx.constraintlayout.core.widgets.g;
import androidx.constraintlayout.core.widgets.j;
import androidx.constraintlayout.core.widgets.n;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.g;

/* loaded from: classes.dex */
public class Flow extends VirtualLayout {
    public static final int A = 1;
    public static final int B = 2;
    public static final int C = 3;

    /* renamed from: n, reason: collision with root package name */
    private static final String f23091n = "Flow";

    /* renamed from: o, reason: collision with root package name */
    public static final int f23092o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static final int f23093p = 1;

    /* renamed from: q, reason: collision with root package name */
    public static final int f23094q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static final int f23095r = 1;

    /* renamed from: s, reason: collision with root package name */
    public static final int f23096s = 2;

    /* renamed from: t, reason: collision with root package name */
    public static final int f23097t = 0;

    /* renamed from: u, reason: collision with root package name */
    public static final int f23098u = 1;

    /* renamed from: v, reason: collision with root package name */
    public static final int f23099v = 2;

    /* renamed from: w, reason: collision with root package name */
    public static final int f23100w = 0;

    /* renamed from: x, reason: collision with root package name */
    public static final int f23101x = 1;

    /* renamed from: y, reason: collision with root package name */
    public static final int f23102y = 2;

    /* renamed from: z, reason: collision with root package name */
    public static final int f23103z = 0;

    /* renamed from: m, reason: collision with root package name */
    private g f23104m;

    public Flow(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    protected void B(AttributeSet attrs) {
        super.B(attrs);
        this.f23104m = new g();
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, g.m.x6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == g.m.y6) {
                    this.f23104m.x3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == g.m.z6) {
                    this.f23104m.B2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == g.m.Q6) {
                    this.f23104m.G2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == g.m.R6) {
                    this.f23104m.D2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == g.m.A6) {
                    this.f23104m.E2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == g.m.B6) {
                    this.f23104m.H2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == g.m.C6) {
                    this.f23104m.F2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == g.m.D6) {
                    this.f23104m.C2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == g.m.A7) {
                    this.f23104m.C3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == g.m.q7) {
                    this.f23104m.r3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == g.m.z7) {
                    this.f23104m.B3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == g.m.k7) {
                    this.f23104m.l3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == g.m.s7) {
                    this.f23104m.t3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == g.m.m7) {
                    this.f23104m.n3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == g.m.u7) {
                    this.f23104m.v3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == g.m.o7) {
                    this.f23104m.p3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == g.m.j7) {
                    this.f23104m.k3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == g.m.r7) {
                    this.f23104m.s3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == g.m.l7) {
                    this.f23104m.m3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == g.m.t7) {
                    this.f23104m.u3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == g.m.x7) {
                    this.f23104m.z3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == g.m.n7) {
                    this.f23104m.o3(obtainStyledAttributes.getInt(index, 2));
                } else if (index == g.m.w7) {
                    this.f23104m.y3(obtainStyledAttributes.getInt(index, 2));
                } else if (index == g.m.p7) {
                    this.f23104m.q3(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == g.m.y7) {
                    this.f23104m.A3(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == g.m.v7) {
                    this.f23104m.w3(obtainStyledAttributes.getInt(index, -1));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f23783e = this.f23104m;
        O();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void C(d.a constraint, j child, ConstraintLayout.LayoutParams layoutParams, SparseArray<e> mapIdToWidget) {
        super.C(constraint, child, layoutParams, mapIdToWidget);
        if (child instanceof androidx.constraintlayout.core.widgets.g) {
            androidx.constraintlayout.core.widgets.g gVar = (androidx.constraintlayout.core.widgets.g) child;
            int i4 = layoutParams.O2;
            if (i4 != -1) {
                gVar.x3(i4);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void E(e widget, boolean isRtl) {
        this.f23104m.m2(isRtl);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public void P(n layout, int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (layout == null) {
            setMeasuredDimension(0, 0);
        } else {
            layout.v2(mode, size, mode2, size2);
            setMeasuredDimension(layout.q2(), layout.p2());
        }
    }

    public void Q(float bias) {
        this.f23104m.k3(bias);
        requestLayout();
    }

    public void R(int style) {
        this.f23104m.l3(style);
        requestLayout();
    }

    public void S(float bias) {
        this.f23104m.m3(bias);
        requestLayout();
    }

    public void T(int style) {
        this.f23104m.n3(style);
        requestLayout();
    }

    public void U(int align) {
        this.f23104m.o3(align);
        requestLayout();
    }

    public void V(float bias) {
        this.f23104m.p3(bias);
        requestLayout();
    }

    public void W(int gap) {
        this.f23104m.q3(gap);
        requestLayout();
    }

    public void X(int style) {
        this.f23104m.r3(style);
        requestLayout();
    }

    public void Y(float bias) {
        this.f23104m.s3(bias);
        requestLayout();
    }

    public void Z(int style) {
        this.f23104m.t3(style);
        requestLayout();
    }

    public void a0(float bias) {
        this.f23104m.u3(bias);
        requestLayout();
    }

    public void b0(int style) {
        this.f23104m.v3(style);
        requestLayout();
    }

    public void c0(int max) {
        this.f23104m.w3(max);
        requestLayout();
    }

    public void d0(int orientation) {
        this.f23104m.x3(orientation);
        requestLayout();
    }

    public void e0(int padding) {
        this.f23104m.B2(padding);
        requestLayout();
    }

    public void f0(int paddingBottom) {
        this.f23104m.C2(paddingBottom);
        requestLayout();
    }

    public void g0(int paddingLeft) {
        this.f23104m.E2(paddingLeft);
        requestLayout();
    }

    public void h0(int paddingRight) {
        this.f23104m.F2(paddingRight);
        requestLayout();
    }

    public void i0(int paddingTop) {
        this.f23104m.H2(paddingTop);
        requestLayout();
    }

    public void j0(int align) {
        this.f23104m.y3(align);
        requestLayout();
    }

    public void k0(float bias) {
        this.f23104m.z3(bias);
        requestLayout();
    }

    public void l0(int gap) {
        this.f23104m.A3(gap);
        requestLayout();
    }

    public void m0(int style) {
        this.f23104m.B3(style);
        requestLayout();
    }

    public void n0(int mode) {
        this.f23104m.C3(mode);
        requestLayout();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @SuppressLint({"WrongCall"})
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        P(this.f23104m, widthMeasureSpec, heightMeasureSpec);
    }

    public Flow(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Flow(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
