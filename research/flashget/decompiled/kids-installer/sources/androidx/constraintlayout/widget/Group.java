package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes3.dex */
public class Group extends ConstraintHelper {
    public Group(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        k();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void r(AttributeSet attributeSet) {
        super.r(attributeSet);
        this.f2702s = false;
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

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void z(ConstraintLayout constraintLayout) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f2757n0.H1(0);
        layoutParams.f2757n0.d1(0);
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
    }
}
