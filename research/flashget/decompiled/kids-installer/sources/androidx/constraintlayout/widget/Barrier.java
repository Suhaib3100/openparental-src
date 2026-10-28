package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.solver.widgets.j;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.f;

/* loaded from: classes3.dex */
public class Barrier extends ConstraintHelper {
    public static final int A = 0;
    public static final int B = 2;
    public static final int C = 1;
    public static final int D = 3;
    public static final int E = 5;
    public static final int F = 6;

    /* renamed from: x, reason: collision with root package name */
    private int f2695x;

    /* renamed from: y, reason: collision with root package name */
    private int f2696y;

    /* renamed from: z, reason: collision with root package name */
    private androidx.constraintlayout.solver.widgets.a f2697z;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void M(androidx.constraintlayout.solver.widgets.e eVar, int i5, boolean z5) {
        this.f2696y = i5;
        if (z5) {
            int i6 = this.f2695x;
            if (i6 == 5) {
                this.f2696y = 1;
            } else if (i6 == 6) {
                this.f2696y = 0;
            }
        } else {
            int i7 = this.f2695x;
            if (i7 == 5) {
                this.f2696y = 0;
            } else if (i7 == 6) {
                this.f2696y = 1;
            }
        }
        if (eVar instanceof androidx.constraintlayout.solver.widgets.a) {
            ((androidx.constraintlayout.solver.widgets.a) eVar).X1(this.f2696y);
        }
    }

    public boolean F() {
        return this.f2697z.R1();
    }

    public int G() {
        return this.f2697z.T1();
    }

    public int H() {
        return this.f2695x;
    }

    public void I(boolean z5) {
        this.f2697z.W1(z5);
    }

    public void J(int i5) {
        this.f2697z.Y1((int) ((i5 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void K(int i5) {
        this.f2697z.Y1(i5);
    }

    public void L(int i5) {
        this.f2695x = i5;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void r(AttributeSet attributeSet) {
        super.r(attributeSet);
        this.f2697z = new androidx.constraintlayout.solver.widgets.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.m.W5);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == f.m.m6) {
                    L(obtainStyledAttributes.getInt(index, 0));
                } else if (index == f.m.l6) {
                    this.f2697z.W1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == f.m.n6) {
                    this.f2697z.Y1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2701r = this.f2697z;
        E();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void s(d.a aVar, j jVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<androidx.constraintlayout.solver.widgets.e> sparseArray) {
        super.s(aVar, jVar, layoutParams, sparseArray);
        if (jVar instanceof androidx.constraintlayout.solver.widgets.a) {
            androidx.constraintlayout.solver.widgets.a aVar2 = (androidx.constraintlayout.solver.widgets.a) jVar;
            M(aVar2, aVar.f2926d.f2959b0, ((androidx.constraintlayout.solver.widgets.f) jVar.U()).s2());
            aVar2.W1(aVar.f2926d.f2975j0);
            aVar2.Y1(aVar.f2926d.f2961c0);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void u(androidx.constraintlayout.solver.widgets.e eVar, boolean z5) {
        M(eVar, this.f2695x, z5);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        super.setVisibility(8);
    }
}
