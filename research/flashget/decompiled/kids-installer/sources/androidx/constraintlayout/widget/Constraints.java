package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.f;

/* loaded from: classes.dex */
public class Constraints extends ViewGroup {

    /* renamed from: p, reason: collision with root package name */
    public static final String f2807p = "Constraints";

    /* renamed from: o, reason: collision with root package name */
    d f2808o;

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void d(AttributeSet attributeSet) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public d c() {
        if (this.f2808o == null) {
            this.f2808o = new d();
        }
        this.f2808o.C(this);
        return this.f2808o;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        super.setVisibility(8);
    }

    /* loaded from: classes3.dex */
    public static class LayoutParams extends ConstraintLayout.LayoutParams {
        public float H0;
        public boolean I0;
        public float J0;
        public float K0;
        public float L0;
        public float M0;
        public float N0;
        public float O0;
        public float P0;
        public float Q0;
        public float R0;
        public float S0;
        public float T0;

        public LayoutParams(int i5, int i6) {
            super(i5, i6);
            this.H0 = 1.0f;
            this.I0 = false;
            this.J0 = 0.0f;
            this.K0 = 0.0f;
            this.L0 = 0.0f;
            this.M0 = 0.0f;
            this.N0 = 1.0f;
            this.O0 = 1.0f;
            this.P0 = 0.0f;
            this.Q0 = 0.0f;
            this.R0 = 0.0f;
            this.S0 = 0.0f;
            this.T0 = 0.0f;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ConstraintLayout.LayoutParams) layoutParams);
            this.H0 = 1.0f;
            this.I0 = false;
            this.J0 = 0.0f;
            this.K0 = 0.0f;
            this.L0 = 0.0f;
            this.M0 = 0.0f;
            this.N0 = 1.0f;
            this.O0 = 1.0f;
            this.P0 = 0.0f;
            this.Q0 = 0.0f;
            this.R0 = 0.0f;
            this.S0 = 0.0f;
            this.T0 = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.H0 = 1.0f;
            this.I0 = false;
            this.J0 = 0.0f;
            this.K0 = 0.0f;
            this.L0 = 0.0f;
            this.M0 = 0.0f;
            this.N0 = 1.0f;
            this.O0 = 1.0f;
            this.P0 = 0.0f;
            this.Q0 = 0.0f;
            this.R0 = 0.0f;
            this.S0 = 0.0f;
            this.T0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.m.N7);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == f.m.d8) {
                    this.H0 = obtainStyledAttributes.getFloat(index, this.H0);
                } else if (index == f.m.q8) {
                    this.J0 = obtainStyledAttributes.getFloat(index, this.J0);
                    this.I0 = true;
                } else if (index == f.m.l8) {
                    this.L0 = obtainStyledAttributes.getFloat(index, this.L0);
                } else if (index == f.m.m8) {
                    this.M0 = obtainStyledAttributes.getFloat(index, this.M0);
                } else if (index == f.m.k8) {
                    this.K0 = obtainStyledAttributes.getFloat(index, this.K0);
                } else if (index == f.m.i8) {
                    this.N0 = obtainStyledAttributes.getFloat(index, this.N0);
                } else if (index == f.m.j8) {
                    this.O0 = obtainStyledAttributes.getFloat(index, this.O0);
                } else if (index == f.m.e8) {
                    this.P0 = obtainStyledAttributes.getFloat(index, this.P0);
                } else if (index == f.m.f8) {
                    this.Q0 = obtainStyledAttributes.getFloat(index, this.Q0);
                } else if (index == f.m.g8) {
                    this.R0 = obtainStyledAttributes.getFloat(index, this.R0);
                } else if (index == f.m.h8) {
                    this.S0 = obtainStyledAttributes.getFloat(index, this.S0);
                } else if (index == f.m.p8) {
                    this.T0 = obtainStyledAttributes.getFloat(index, this.T0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
