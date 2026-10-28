package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.j;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.g;

/* loaded from: classes.dex */
public class Barrier extends ConstraintHelper {

    /* renamed from: n, reason: collision with root package name */
    public static final int f23771n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static final int f23772o = 2;

    /* renamed from: p, reason: collision with root package name */
    public static final int f23773p = 1;

    /* renamed from: q, reason: collision with root package name */
    public static final int f23774q = 3;

    /* renamed from: r, reason: collision with root package name */
    public static final int f23775r = 5;

    /* renamed from: s, reason: collision with root package name */
    public static final int f23776s = 6;

    /* renamed from: k, reason: collision with root package name */
    private int f23777k;

    /* renamed from: l, reason: collision with root package name */
    private int f23778l;

    /* renamed from: m, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.a f23779m;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void X(androidx.constraintlayout.core.widgets.e widget, int type, boolean isRtl) {
        this.f23778l = type;
        if (isRtl) {
            int i4 = this.f23777k;
            if (i4 == 5) {
                this.f23778l = 1;
            } else if (i4 == 6) {
                this.f23778l = 0;
            }
        } else {
            int i5 = this.f23777k;
            if (i5 == 5) {
                this.f23778l = 0;
            } else if (i5 == 6) {
                this.f23778l = 1;
            }
        }
        if (widget instanceof androidx.constraintlayout.core.widgets.a) {
            ((androidx.constraintlayout.core.widgets.a) widget).u2(this.f23778l);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void B(AttributeSet attrs) {
        super.B(attrs);
        this.f23779m = new androidx.constraintlayout.core.widgets.a();
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, g.m.x6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == g.m.Y6) {
                    W(obtainStyledAttributes.getInt(index, 0));
                } else if (index == g.m.X6) {
                    this.f23779m.t2(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == g.m.Z6) {
                    this.f23779m.v2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f23783e = this.f23779m;
        O();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void C(d.a constraint, j child, ConstraintLayout.LayoutParams layoutParams, SparseArray<androidx.constraintlayout.core.widgets.e> mapIdToWidget) {
        super.C(constraint, child, layoutParams, mapIdToWidget);
        if (child instanceof androidx.constraintlayout.core.widgets.a) {
            androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) child;
            X(aVar, constraint.f24048e.f24118h0, ((androidx.constraintlayout.core.widgets.f) child.U()).O2());
            aVar.t2(constraint.f24048e.f24134p0);
            aVar.v2(constraint.f24048e.f24120i0);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void E(androidx.constraintlayout.core.widgets.e widget, boolean isRtl) {
        X(widget, this.f23777k, isRtl);
    }

    @Deprecated
    public boolean P() {
        return this.f23779m.o2();
    }

    public boolean Q() {
        return this.f23779m.o2();
    }

    public int R() {
        return this.f23779m.q2();
    }

    public int S() {
        return this.f23777k;
    }

    public void T(boolean supportGone) {
        this.f23779m.t2(supportGone);
    }

    public void U(int margin) {
        this.f23779m.v2((int) ((margin * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void V(int margin) {
        this.f23779m.v2(margin);
    }

    public void W(int type) {
        this.f23777k = type;
    }

    public Barrier(Context context, AttributeSet attrs) {
        super(context, attrs);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        super.setVisibility(8);
    }
}
