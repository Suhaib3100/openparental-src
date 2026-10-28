package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.n;
import androidx.constraintlayout.widget.g;

/* loaded from: classes.dex */
public abstract class VirtualLayout extends ConstraintHelper {

    /* renamed from: k, reason: collision with root package name */
    private boolean f23919k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f23920l;

    public VirtualLayout(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void B(AttributeSet attrs) {
        super.B(attrs);
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, g.m.x6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == g.m.E6) {
                    this.f23919k = true;
                } else if (index == g.m.U6) {
                    this.f23920l = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void P(n layout, int widthMeasureSpec, int heightMeasureSpec) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f23919k || this.f23920l) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i4 = 0; i4 < this.f23781c; i4++) {
                    View w4 = constraintLayout.w(this.f23780b[i4]);
                    if (w4 != null) {
                        if (this.f23919k) {
                            w4.setVisibility(visibility);
                        }
                        if (this.f23920l && elevation > 0.0f) {
                            w4.setTranslationZ(w4.getTranslationZ() + elevation);
                        }
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
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        r();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void t(ConstraintLayout container) {
        s(container);
    }

    public VirtualLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public VirtualLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
