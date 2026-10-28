package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.f;

/* loaded from: classes2.dex */
public class MotionHelper extends ConstraintHelper implements a, MotionLayout.i {
    protected View[] A;

    /* renamed from: x, reason: collision with root package name */
    private boolean f1690x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f1691y;

    /* renamed from: z, reason: collision with root package name */
    private float f1692z;

    public MotionHelper(Context context) {
        super(context);
        this.f1690x = false;
        this.f1691y = false;
    }

    public boolean F() {
        return this.f1691y;
    }

    public boolean G() {
        return this.f1690x;
    }

    public void H(View view, float f6) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
    public void a(MotionLayout motionLayout, int i5, int i6, float f6) {
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public float b() {
        return this.f1692z;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
    public void c(MotionLayout motionLayout, int i5, int i6) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
    public void d(MotionLayout motionLayout, int i5, boolean z5, float f6) {
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public void e(float f6) {
        this.f1692z = f6;
        int i5 = 0;
        if (this.f2699p > 0) {
            this.A = q((ConstraintLayout) getParent());
            while (i5 < this.f2699p) {
                H(this.A[i5], f6);
                i5++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i5 < childCount) {
            View childAt = viewGroup.getChildAt(i5);
            if (!(childAt instanceof MotionHelper)) {
                H(childAt, f6);
            }
            i5++;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
    public void f(MotionLayout motionLayout, int i5) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void r(AttributeSet attributeSet) {
        super.r(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.m.Bf);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == f.m.Df) {
                    this.f1690x = obtainStyledAttributes.getBoolean(index, this.f1690x);
                } else if (index == f.m.Cf) {
                    this.f1691y = obtainStyledAttributes.getBoolean(index, this.f1691y);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1690x = false;
        this.f1691y = false;
        r(attributeSet);
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f1690x = false;
        this.f1691y = false;
        r(attributeSet);
    }
}
