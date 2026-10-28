package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.solver.widgets.m;
import androidx.constraintlayout.widget.f;

/* loaded from: classes3.dex */
public abstract class VirtualLayout extends ConstraintHelper {

    /* renamed from: x, reason: collision with root package name */
    private boolean f2812x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f2813y;

    public VirtualLayout(Context context) {
        super(context);
    }

    public void F(m mVar, int i5, int i6) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f2812x || this.f2813y) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i5 = 0; i5 < this.f2699p; i5++) {
                View u5 = constraintLayout.u(this.f2698o[i5]);
                if (u5 != null) {
                    if (this.f2812x) {
                        u5.setVisibility(visibility);
                    }
                    if (this.f2813y && elevation > 0.0f) {
                        u5.setTranslationZ(u5.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void r(AttributeSet attributeSet) {
        super.r(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.m.W5);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == f.m.d6) {
                    this.f2812x = true;
                } else if (index == f.m.k6) {
                    this.f2813y = true;
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
    public void setVisibility(int i5) {
        super.setVisibility(i5);
        k();
    }

    public VirtualLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualLayout(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
    }
}
