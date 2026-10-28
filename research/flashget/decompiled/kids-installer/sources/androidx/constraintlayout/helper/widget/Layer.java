package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.solver.widgets.e;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.f;
import com.google.firebase.remoteconfig.p;

/* loaded from: classes2.dex */
public class Layer extends ConstraintHelper {
    private static final String P = "Layer";
    ConstraintLayout A;
    private float B;
    private float C;
    protected float D;
    protected float E;
    protected float F;
    protected float G;
    protected float H;
    protected float I;
    boolean J;
    View[] K;
    private float L;
    private float M;
    private boolean N;
    private boolean O;

    /* renamed from: x, reason: collision with root package name */
    private float f1580x;

    /* renamed from: y, reason: collision with root package name */
    private float f1581y;

    /* renamed from: z, reason: collision with root package name */
    private float f1582z;

    public Layer(Context context) {
        super(context);
        this.f1580x = Float.NaN;
        this.f1581y = Float.NaN;
        this.f1582z = Float.NaN;
        this.B = 1.0f;
        this.C = 1.0f;
        this.D = Float.NaN;
        this.E = Float.NaN;
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
        this.I = Float.NaN;
        this.J = true;
        this.K = null;
        this.L = 0.0f;
        this.M = 0.0f;
    }

    private void G() {
        int i5;
        if (this.A == null || (i5 = this.f2699p) == 0) {
            return;
        }
        View[] viewArr = this.K;
        if (viewArr == null || viewArr.length != i5) {
            this.K = new View[i5];
        }
        for (int i6 = 0; i6 < this.f2699p; i6++) {
            this.K[i6] = this.A.u(this.f2698o[i6]);
        }
    }

    private void H() {
        if (this.A == null) {
            return;
        }
        if (this.K == null) {
            G();
        }
        F();
        double radians = Float.isNaN(this.f1582z) ? p.f18289o : Math.toRadians(this.f1582z);
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);
        float f6 = this.B;
        float f7 = f6 * cos;
        float f8 = this.C;
        float f9 = (-f8) * sin;
        float f10 = f6 * sin;
        float f11 = f8 * cos;
        for (int i5 = 0; i5 < this.f2699p; i5++) {
            View view = this.K[i5];
            int right = (view.getRight() + view.getLeft()) / 2;
            int bottom = (view.getBottom() + view.getTop()) / 2;
            float f12 = right - this.D;
            float f13 = bottom - this.E;
            float f14 = (((f9 * f13) + (f7 * f12)) - f12) + this.L;
            float f15 = (((f11 * f13) + (f12 * f10)) - f13) + this.M;
            view.setTranslationX(f14);
            view.setTranslationY(f15);
            view.setScaleY(this.C);
            view.setScaleX(this.B);
            if (!Float.isNaN(this.f1582z)) {
                view.setRotation(this.f1582z);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void B(ConstraintLayout constraintLayout) {
        this.A = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.f1582z = rotation;
        } else {
            if (Float.isNaN(this.f1582z)) {
                return;
            }
            this.f1582z = rotation;
        }
    }

    protected void F() {
        if (this.A == null) {
            return;
        }
        if (this.J || Float.isNaN(this.D) || Float.isNaN(this.E)) {
            if (!Float.isNaN(this.f1580x) && !Float.isNaN(this.f1581y)) {
                this.E = this.f1581y;
                this.D = this.f1580x;
                return;
            }
            View[] q5 = q(this.A);
            int left = q5[0].getLeft();
            int top = q5[0].getTop();
            int right = q5[0].getRight();
            int bottom = q5[0].getBottom();
            for (int i5 = 0; i5 < this.f2699p; i5++) {
                View view = q5[i5];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.F = right;
            this.G = bottom;
            this.H = left;
            this.I = top;
            if (Float.isNaN(this.f1580x)) {
                this.D = (left + right) / 2;
            } else {
                this.D = this.f1580x;
            }
            if (Float.isNaN(this.f1581y)) {
                this.E = (top + bottom) / 2;
            } else {
                this.E = this.f1581y;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A = (ConstraintLayout) getParent();
        if (this.N || this.O) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i5 = 0; i5 < this.f2699p; i5++) {
                View u5 = this.A.u(this.f2698o[i5]);
                if (u5 != null) {
                    if (this.N) {
                        u5.setVisibility(visibility);
                    }
                    if (this.O && elevation > 0.0f) {
                        u5.setTranslationZ(u5.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void r(AttributeSet attributeSet) {
        super.r(attributeSet);
        this.f2702s = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.m.W5);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == f.m.d6) {
                    this.N = true;
                } else if (index == f.m.k6) {
                    this.O = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        k();
    }

    @Override // android.view.View
    public void setPivotX(float f6) {
        this.f1580x = f6;
        H();
    }

    @Override // android.view.View
    public void setPivotY(float f6) {
        this.f1581y = f6;
        H();
    }

    @Override // android.view.View
    public void setRotation(float f6) {
        this.f1582z = f6;
        H();
    }

    @Override // android.view.View
    public void setScaleX(float f6) {
        this.B = f6;
        H();
    }

    @Override // android.view.View
    public void setScaleY(float f6) {
        this.C = f6;
        H();
    }

    @Override // android.view.View
    public void setTranslationX(float f6) {
        this.L = f6;
        H();
    }

    @Override // android.view.View
    public void setTranslationY(float f6) {
        this.M = f6;
        H();
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        super.setVisibility(i5);
        k();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void z(ConstraintLayout constraintLayout) {
        G();
        this.D = Float.NaN;
        this.E = Float.NaN;
        e b6 = ((ConstraintLayout.LayoutParams) getLayoutParams()).b();
        b6.H1(0);
        b6.d1(0);
        F();
        layout(((int) this.H) - getPaddingLeft(), ((int) this.I) - getPaddingTop(), getPaddingRight() + ((int) this.F), getPaddingBottom() + ((int) this.G));
        H();
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1580x = Float.NaN;
        this.f1581y = Float.NaN;
        this.f1582z = Float.NaN;
        this.B = 1.0f;
        this.C = 1.0f;
        this.D = Float.NaN;
        this.E = Float.NaN;
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
        this.I = Float.NaN;
        this.J = true;
        this.K = null;
        this.L = 0.0f;
        this.M = 0.0f;
    }

    public Layer(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f1580x = Float.NaN;
        this.f1581y = Float.NaN;
        this.f1582z = Float.NaN;
        this.B = 1.0f;
        this.C = 1.0f;
        this.D = Float.NaN;
        this.E = Float.NaN;
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
        this.I = Float.NaN;
        this.J = true;
        this.K = null;
        this.L = 0.0f;
        this.M = 0.0f;
    }
}
