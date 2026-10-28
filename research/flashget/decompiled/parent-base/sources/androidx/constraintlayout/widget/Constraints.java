package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.g;

/* loaded from: classes.dex */
public class Constraints extends ViewGroup {

    /* renamed from: c, reason: collision with root package name */
    public static final String f23909c = "Constraints";

    /* renamed from: b, reason: collision with root package name */
    d f23910b;

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void d(AttributeSet attrs) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new LayoutParams(getContext(), attrs);
    }

    public d c() {
        if (this.f23910b == null) {
            this.f23910b = new d();
        }
        this.f23910b.J(this);
        return this.f23910b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l4, int t4, int r4, int b5) {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p4) {
        return new ConstraintLayout.LayoutParams(p4);
    }

    public Constraints(Context context, AttributeSet attrs) {
        super(context, attrs);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        super.setVisibility(8);
    }

    public static class LayoutParams extends ConstraintLayout.LayoutParams {
        public float K3;
        public boolean L3;
        public float M3;
        public float N3;
        public float O3;
        public float P3;
        public float Q3;
        public float R3;
        public float S3;
        public float T3;
        public float U3;
        public float V3;
        public float W3;

        public LayoutParams(int width, int height) {
            super(width, height);
            this.K3 = 1.0f;
            this.L3 = false;
            this.M3 = 0.0f;
            this.N3 = 0.0f;
            this.O3 = 0.0f;
            this.P3 = 0.0f;
            this.Q3 = 1.0f;
            this.R3 = 1.0f;
            this.S3 = 0.0f;
            this.T3 = 0.0f;
            this.U3 = 0.0f;
            this.V3 = 0.0f;
            this.W3 = 0.0f;
        }

        public LayoutParams(LayoutParams source) {
            super((ConstraintLayout.LayoutParams) source);
            this.K3 = 1.0f;
            this.L3 = false;
            this.M3 = 0.0f;
            this.N3 = 0.0f;
            this.O3 = 0.0f;
            this.P3 = 0.0f;
            this.Q3 = 1.0f;
            this.R3 = 1.0f;
            this.S3 = 0.0f;
            this.T3 = 0.0f;
            this.U3 = 0.0f;
            this.V3 = 0.0f;
            this.W3 = 0.0f;
        }

        public LayoutParams(Context c5, AttributeSet attrs) {
            super(c5, attrs);
            this.K3 = 1.0f;
            this.L3 = false;
            this.M3 = 0.0f;
            this.N3 = 0.0f;
            this.O3 = 0.0f;
            this.P3 = 0.0f;
            this.Q3 = 1.0f;
            this.R3 = 1.0f;
            this.S3 = 0.0f;
            this.T3 = 0.0f;
            this.U3 = 0.0f;
            this.V3 = 0.0f;
            this.W3 = 0.0f;
            TypedArray obtainStyledAttributes = c5.obtainStyledAttributes(attrs, g.m.Wa);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == g.m.f25108mb) {
                    this.K3 = obtainStyledAttributes.getFloat(index, this.K3);
                } else if (index == g.m.zb) {
                    this.M3 = obtainStyledAttributes.getFloat(index, this.M3);
                    this.L3 = true;
                } else if (index == g.m.ub) {
                    this.O3 = obtainStyledAttributes.getFloat(index, this.O3);
                } else if (index == g.m.vb) {
                    this.P3 = obtainStyledAttributes.getFloat(index, this.P3);
                } else if (index == g.m.tb) {
                    this.N3 = obtainStyledAttributes.getFloat(index, this.N3);
                } else if (index == g.m.rb) {
                    this.Q3 = obtainStyledAttributes.getFloat(index, this.Q3);
                } else if (index == g.m.sb) {
                    this.R3 = obtainStyledAttributes.getFloat(index, this.R3);
                } else if (index == g.m.f25121nb) {
                    this.S3 = obtainStyledAttributes.getFloat(index, this.S3);
                } else if (index == g.m.f25135ob) {
                    this.T3 = obtainStyledAttributes.getFloat(index, this.T3);
                } else if (index == g.m.f25149pb) {
                    this.U3 = obtainStyledAttributes.getFloat(index, this.U3);
                } else if (index == g.m.f25163qb) {
                    this.V3 = obtainStyledAttributes.getFloat(index, this.V3);
                } else if (index == g.m.yb) {
                    this.W3 = obtainStyledAttributes.getFloat(index, this.W3);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
