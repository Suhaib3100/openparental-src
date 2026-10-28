package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.e;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.g;
import com.google.firebase.remoteconfig.p;

/* loaded from: classes.dex */
public class Layer extends ConstraintHelper {
    private static final String C = "Layer";
    private boolean A;
    private boolean B;

    /* renamed from: k, reason: collision with root package name */
    private float f23105k;

    /* renamed from: l, reason: collision with root package name */
    private float f23106l;

    /* renamed from: m, reason: collision with root package name */
    private float f23107m;

    /* renamed from: n, reason: collision with root package name */
    ConstraintLayout f23108n;

    /* renamed from: o, reason: collision with root package name */
    private float f23109o;

    /* renamed from: p, reason: collision with root package name */
    private float f23110p;

    /* renamed from: q, reason: collision with root package name */
    protected float f23111q;

    /* renamed from: r, reason: collision with root package name */
    protected float f23112r;

    /* renamed from: s, reason: collision with root package name */
    protected float f23113s;

    /* renamed from: t, reason: collision with root package name */
    protected float f23114t;

    /* renamed from: u, reason: collision with root package name */
    protected float f23115u;

    /* renamed from: v, reason: collision with root package name */
    protected float f23116v;

    /* renamed from: w, reason: collision with root package name */
    boolean f23117w;

    /* renamed from: x, reason: collision with root package name */
    View[] f23118x;

    /* renamed from: y, reason: collision with root package name */
    private float f23119y;

    /* renamed from: z, reason: collision with root package name */
    private float f23120z;

    public Layer(Context context) {
        super(context);
        this.f23105k = Float.NaN;
        this.f23106l = Float.NaN;
        this.f23107m = Float.NaN;
        this.f23109o = 1.0f;
        this.f23110p = 1.0f;
        this.f23111q = Float.NaN;
        this.f23112r = Float.NaN;
        this.f23113s = Float.NaN;
        this.f23114t = Float.NaN;
        this.f23115u = Float.NaN;
        this.f23116v = Float.NaN;
        this.f23117w = true;
        this.f23118x = null;
        this.f23119y = 0.0f;
        this.f23120z = 0.0f;
    }

    private void Q() {
        int i4;
        if (this.f23108n == null || (i4 = this.f23781c) == 0) {
            return;
        }
        View[] viewArr = this.f23118x;
        if (viewArr == null || viewArr.length != i4) {
            this.f23118x = new View[i4];
        }
        for (int i5 = 0; i5 < this.f23781c; i5++) {
            this.f23118x[i5] = this.f23108n.w(this.f23780b[i5]);
        }
    }

    private void R() {
        if (this.f23108n == null) {
            return;
        }
        if (this.f23118x == null) {
            Q();
        }
        P();
        double radians = Float.isNaN(this.f23107m) ? p.f60679p : Math.toRadians(this.f23107m);
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);
        float f4 = this.f23109o;
        float f5 = f4 * cos;
        float f6 = this.f23110p;
        float f7 = (-f6) * sin;
        float f10 = f4 * sin;
        float f11 = f6 * cos;
        for (int i4 = 0; i4 < this.f23781c; i4++) {
            View view = this.f23118x[i4];
            int right = (view.getRight() + view.getLeft()) / 2;
            int bottom = (view.getBottom() + view.getTop()) / 2;
            float f12 = right - this.f23111q;
            float f13 = bottom - this.f23112r;
            float f14 = (((f7 * f13) + (f5 * f12)) - f12) + this.f23119y;
            float f15 = (((f11 * f13) + (f12 * f10)) - f13) + this.f23120z;
            view.setTranslationX(f14);
            view.setTranslationY(f15);
            view.setScaleY(this.f23110p);
            view.setScaleX(this.f23109o);
            if (!Float.isNaN(this.f23107m)) {
                view.setRotation(this.f23107m);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void B(AttributeSet attrs) {
        super.B(attrs);
        this.f23784f = false;
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, g.m.x6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == g.m.E6) {
                    this.A = true;
                } else if (index == g.m.U6) {
                    this.B = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void J(ConstraintLayout container) {
        Q();
        this.f23111q = Float.NaN;
        this.f23112r = Float.NaN;
        e c5 = ((ConstraintLayout.LayoutParams) getLayoutParams()).c();
        c5.c2(0);
        c5.y1(0);
        P();
        layout(((int) this.f23115u) - getPaddingLeft(), ((int) this.f23116v) - getPaddingTop(), getPaddingRight() + ((int) this.f23113s), getPaddingBottom() + ((int) this.f23114t));
        R();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void L(ConstraintLayout container) {
        this.f23108n = container;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.f23107m = rotation;
        } else {
            if (Float.isNaN(this.f23107m)) {
                return;
            }
            this.f23107m = rotation;
        }
    }

    protected void P() {
        if (this.f23108n == null) {
            return;
        }
        if (this.f23117w || Float.isNaN(this.f23111q) || Float.isNaN(this.f23112r)) {
            if (!Float.isNaN(this.f23105k) && !Float.isNaN(this.f23106l)) {
                this.f23112r = this.f23106l;
                this.f23111q = this.f23105k;
                return;
            }
            View[] z4 = z(this.f23108n);
            int left = z4[0].getLeft();
            int top2 = z4[0].getTop();
            int right = z4[0].getRight();
            int bottom = z4[0].getBottom();
            for (int i4 = 0; i4 < this.f23781c; i4++) {
                View view = z4[i4];
                left = Math.min(left, view.getLeft());
                top2 = Math.min(top2, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.f23113s = right;
            this.f23114t = bottom;
            this.f23115u = left;
            this.f23116v = top2;
            if (Float.isNaN(this.f23105k)) {
                this.f23111q = (left + right) / 2;
            } else {
                this.f23111q = this.f23105k;
            }
            if (Float.isNaN(this.f23106l)) {
                this.f23112r = (top2 + bottom) / 2;
            } else {
                this.f23112r = this.f23106l;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f23108n = (ConstraintLayout) getParent();
        if (this.A || this.B) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i4 = 0; i4 < this.f23781c; i4++) {
                View w4 = this.f23108n.w(this.f23780b[i4]);
                if (w4 != null) {
                    if (this.A) {
                        w4.setVisibility(visibility);
                    }
                    if (this.B && elevation > 0.0f) {
                        w4.setTranslationZ(w4.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float elevation) {
        super.setElevation(elevation);
        r();
    }

    @Override // android.view.View
    public void setPivotX(float pivotX) {
        this.f23105k = pivotX;
        R();
    }

    @Override // android.view.View
    public void setPivotY(float pivotY) {
        this.f23106l = pivotY;
        R();
    }

    @Override // android.view.View
    public void setRotation(float angle) {
        this.f23107m = angle;
        R();
    }

    @Override // android.view.View
    public void setScaleX(float scaleX) {
        this.f23109o = scaleX;
        R();
    }

    @Override // android.view.View
    public void setScaleY(float scaleY) {
        this.f23110p = scaleY;
        R();
    }

    @Override // android.view.View
    public void setTranslationX(float dx) {
        this.f23119y = dx;
        R();
    }

    @Override // android.view.View
    public void setTranslationY(float dy) {
        this.f23120z = dy;
        R();
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        r();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void t(ConstraintLayout container) {
        s(container);
    }

    public Layer(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f23105k = Float.NaN;
        this.f23106l = Float.NaN;
        this.f23107m = Float.NaN;
        this.f23109o = 1.0f;
        this.f23110p = 1.0f;
        this.f23111q = Float.NaN;
        this.f23112r = Float.NaN;
        this.f23113s = Float.NaN;
        this.f23114t = Float.NaN;
        this.f23115u = Float.NaN;
        this.f23116v = Float.NaN;
        this.f23117w = true;
        this.f23118x = null;
        this.f23119y = 0.0f;
        this.f23120z = 0.0f;
    }

    public Layer(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f23105k = Float.NaN;
        this.f23106l = Float.NaN;
        this.f23107m = Float.NaN;
        this.f23109o = 1.0f;
        this.f23110p = 1.0f;
        this.f23111q = Float.NaN;
        this.f23112r = Float.NaN;
        this.f23113s = Float.NaN;
        this.f23114t = Float.NaN;
        this.f23115u = Float.NaN;
        this.f23116v = Float.NaN;
        this.f23117w = true;
        this.f23118x = null;
        this.f23119y = 0.0f;
        this.f23120z = 0.0f;
    }
}
