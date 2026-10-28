package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.g;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MotionHelper extends ConstraintHelper implements p {

    /* renamed from: k, reason: collision with root package name */
    private boolean f23162k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f23163l;

    /* renamed from: m, reason: collision with root package name */
    private float f23164m;

    /* renamed from: n, reason: collision with root package name */
    protected View[] f23165n;

    public MotionHelper(Context context) {
        super(context);
        this.f23162k = false;
        this.f23163l = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void B(AttributeSet attrs) {
        super.B(attrs);
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, g.m.Gj);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == g.m.Ij) {
                    this.f23162k = obtainStyledAttributes.getBoolean(index, this.f23162k);
                } else if (index == g.m.Hj) {
                    this.f23163l = obtainStyledAttributes.getBoolean(index, this.f23163l);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void P(View view, float progress) {
    }

    public void a(MotionLayout motionLayout, int startId, int endId, float progress) {
    }

    @Override // androidx.constraintlayout.motion.widget.p
    public void b(MotionLayout motionLayout) {
    }

    public void c(MotionLayout motionLayout, HashMap<View, o> controllerMap) {
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public void d(float progress) {
        this.f23164m = progress;
        int i4 = 0;
        if (this.f23781c > 0) {
            this.f23165n = z((ConstraintLayout) getParent());
            while (i4 < this.f23781c) {
                P(this.f23165n[i4], progress);
                i4++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i4 < childCount) {
            View childAt = viewGroup.getChildAt(i4);
            if (!(childAt instanceof MotionHelper)) {
                P(childAt, progress);
            }
            i4++;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.p
    public void e(Canvas canvas) {
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public float f() {
        return this.f23164m;
    }

    @Override // androidx.constraintlayout.motion.widget.p
    public void g(Canvas canvas) {
    }

    public void h(MotionLayout motionLayout, int currentId) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.l
    public void i(MotionLayout motionLayout, int startId, int endId) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.l
    public void j(MotionLayout motionLayout, int triggerId, boolean positive, float progress) {
    }

    @Override // androidx.constraintlayout.motion.widget.p
    public boolean k() {
        return this.f23162k;
    }

    @Override // androidx.constraintlayout.motion.widget.p
    public boolean l() {
        return this.f23163l;
    }

    public boolean m() {
        return false;
    }

    public MotionHelper(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f23162k = false;
        this.f23163l = false;
        B(attrs);
    }

    public MotionHelper(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f23162k = false;
        this.f23163l = false;
        B(attrs);
    }
}
