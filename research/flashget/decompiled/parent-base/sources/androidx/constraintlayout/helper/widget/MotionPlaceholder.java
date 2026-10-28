package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.e;
import androidx.constraintlayout.core.widgets.f;
import androidx.constraintlayout.core.widgets.i;
import androidx.constraintlayout.core.widgets.l;
import androidx.constraintlayout.core.widgets.n;
import androidx.constraintlayout.widget.VirtualLayout;

/* loaded from: classes.dex */
public class MotionPlaceholder extends VirtualLayout {

    /* renamed from: n, reason: collision with root package name */
    private static final String f23133n = "MotionPlaceholder";

    /* renamed from: m, reason: collision with root package name */
    l f23134m;

    public MotionPlaceholder(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    protected void B(AttributeSet attrs) {
        super.B(attrs);
        this.f23783e = new l();
        O();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void M(f container, i helper, SparseArray<e> map) {
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

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @SuppressLint({"WrongCall"})
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        P(this.f23134m, widthMeasureSpec, heightMeasureSpec);
    }

    public MotionPlaceholder(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MotionPlaceholder(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MotionPlaceholder(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr);
    }
}
