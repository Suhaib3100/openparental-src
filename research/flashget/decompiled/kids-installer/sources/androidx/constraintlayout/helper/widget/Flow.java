package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.solver.widgets.e;
import androidx.constraintlayout.solver.widgets.g;
import androidx.constraintlayout.solver.widgets.j;
import androidx.constraintlayout.solver.widgets.m;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.f;

/* loaded from: classes3.dex */
public class Flow extends VirtualLayout {
    private static final String A = "Flow";
    public static final int B = 0;
    public static final int C = 1;
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 0;
    public static final int H = 1;
    public static final int I = 2;
    public static final int J = 0;
    public static final int K = 1;
    public static final int L = 2;
    public static final int M = 0;
    public static final int N = 1;
    public static final int O = 2;
    public static final int P = 3;

    /* renamed from: z, reason: collision with root package name */
    private g f1579z;

    public Flow(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public void F(m mVar, int i5, int i6) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i6);
        int size2 = View.MeasureSpec.getSize(i6);
        if (mVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            mVar.Y1(mode, size, mode2, size2);
            setMeasuredDimension(mVar.T1(), mVar.S1());
        }
    }

    public void G(float f6) {
        this.f1579z.L2(f6);
        requestLayout();
    }

    public void H(int i5) {
        this.f1579z.M2(i5);
        requestLayout();
    }

    public void I(float f6) {
        this.f1579z.N2(f6);
        requestLayout();
    }

    public void J(int i5) {
        this.f1579z.O2(i5);
        requestLayout();
    }

    public void K(int i5) {
        this.f1579z.P2(i5);
        requestLayout();
    }

    public void L(float f6) {
        this.f1579z.Q2(f6);
        requestLayout();
    }

    public void M(int i5) {
        this.f1579z.R2(i5);
        requestLayout();
    }

    public void N(int i5) {
        this.f1579z.S2(i5);
        requestLayout();
    }

    public void O(int i5) {
        this.f1579z.X2(i5);
        requestLayout();
    }

    public void P(int i5) {
        this.f1579z.Y2(i5);
        requestLayout();
    }

    public void Q(int i5) {
        this.f1579z.e2(i5);
        requestLayout();
    }

    public void R(int i5) {
        this.f1579z.f2(i5);
        requestLayout();
    }

    public void S(int i5) {
        this.f1579z.h2(i5);
        requestLayout();
    }

    public void T(int i5) {
        this.f1579z.i2(i5);
        requestLayout();
    }

    public void U(int i5) {
        this.f1579z.k2(i5);
        requestLayout();
    }

    public void V(int i5) {
        this.f1579z.Z2(i5);
        requestLayout();
    }

    public void W(float f6) {
        this.f1579z.a3(f6);
        requestLayout();
    }

    public void X(int i5) {
        this.f1579z.b3(i5);
        requestLayout();
    }

    public void Y(int i5) {
        this.f1579z.c3(i5);
        requestLayout();
    }

    public void Z(int i5) {
        this.f1579z.d3(i5);
        requestLayout();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @SuppressLint({"WrongCall"})
    protected void onMeasure(int i5, int i6) {
        F(this.f1579z, i5, i6);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    protected void r(AttributeSet attributeSet) {
        super.r(attributeSet);
        this.f1579z = new g();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.m.W5);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == f.m.X5) {
                    this.f1579z.Y2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == f.m.Y5) {
                    this.f1579z.e2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.m.i6) {
                    this.f1579z.j2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.m.j6) {
                    this.f1579z.g2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.m.Z5) {
                    this.f1579z.h2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.m.a6) {
                    this.f1579z.k2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.m.b6) {
                    this.f1579z.i2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.m.c6) {
                    this.f1579z.f2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.m.J6) {
                    this.f1579z.d3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == f.m.z6) {
                    this.f1579z.S2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == f.m.I6) {
                    this.f1579z.c3(obtainStyledAttributes.getInt(index, 0));
                } else if (index == f.m.t6) {
                    this.f1579z.M2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == f.m.B6) {
                    this.f1579z.U2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == f.m.v6) {
                    this.f1579z.O2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == f.m.D6) {
                    this.f1579z.W2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == f.m.x6) {
                    this.f1579z.Q2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.m.s6) {
                    this.f1579z.L2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.m.A6) {
                    this.f1579z.T2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.m.u6) {
                    this.f1579z.N2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.m.C6) {
                    this.f1579z.V2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.m.G6) {
                    this.f1579z.a3(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.m.w6) {
                    this.f1579z.P2(obtainStyledAttributes.getInt(index, 2));
                } else if (index == f.m.F6) {
                    this.f1579z.Z2(obtainStyledAttributes.getInt(index, 2));
                } else if (index == f.m.y6) {
                    this.f1579z.R2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.m.H6) {
                    this.f1579z.b3(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.m.E6) {
                    this.f1579z.X2(obtainStyledAttributes.getInt(index, -1));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2701r = this.f1579z;
        E();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void s(d.a aVar, j jVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<e> sparseArray) {
        super.s(aVar, jVar, layoutParams, sparseArray);
        if (jVar instanceof g) {
            g gVar = (g) jVar;
            int i5 = layoutParams.S;
            if (i5 != -1) {
                gVar.Y2(i5);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void u(e eVar, boolean z5) {
        this.f1579z.Q1(z5);
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
    }
}
