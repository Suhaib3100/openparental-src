package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.g;
import androidx.constraintlayout.widget.h;

/* loaded from: classes.dex */
public class ReactiveGuide extends View implements h.a {

    /* renamed from: b, reason: collision with root package name */
    private int f23915b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f23916c;

    /* renamed from: d, reason: collision with root package name */
    private int f23917d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f23918e;

    public ReactiveGuide(Context context) {
        super(context);
        this.f23915b = -1;
        this.f23916c = false;
        this.f23917d = 0;
        this.f23918e = true;
        super.setVisibility(8);
        e(null);
    }

    private void b(int newValue, int id2, MotionLayout motionLayout, int currentState) {
        d Q0 = motionLayout.Q0(currentState);
        Q0.d1(id2, newValue);
        motionLayout.c2(currentState, Q0);
    }

    private void e(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, g.m.J8);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == g.m.N8) {
                    this.f23915b = obtainStyledAttributes.getResourceId(index, this.f23915b);
                } else if (index == g.m.K8) {
                    this.f23916c = obtainStyledAttributes.getBoolean(index, this.f23916c);
                } else if (index == g.m.M8) {
                    this.f23917d = obtainStyledAttributes.getResourceId(index, this.f23917d);
                } else if (index == g.m.L8) {
                    this.f23918e = obtainStyledAttributes.getBoolean(index, this.f23918e);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f23915b != -1) {
            ConstraintLayout.t().a(this.f23915b, this);
        }
    }

    @Override // androidx.constraintlayout.widget.h.a
    public void a(int key, int newValue, int oldValue) {
        j(newValue);
        int id2 = getId();
        if (id2 > 0 && (getParent() instanceof MotionLayout)) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            int T0 = motionLayout.T0();
            int i4 = this.f23917d;
            if (i4 != 0) {
                T0 = i4;
            }
            int i5 = 0;
            if (!this.f23916c) {
                if (!this.f23918e) {
                    b(newValue, id2, motionLayout, T0);
                    return;
                }
                int[] R0 = motionLayout.R0();
                while (i5 < R0.length) {
                    b(newValue, id2, motionLayout, R0[i5]);
                    i5++;
                }
                return;
            }
            if (this.f23918e) {
                int[] R02 = motionLayout.R0();
                while (i5 < R02.length) {
                    int i6 = R02[i5];
                    if (i6 != T0) {
                        b(newValue, id2, motionLayout, i6);
                    }
                    i5++;
                }
            }
            d C0 = motionLayout.C0(T0);
            C0.d1(id2, newValue);
            motionLayout.d2(T0, C0, 1000);
        }
    }

    public int c() {
        return this.f23917d;
    }

    public int d() {
        return this.f23915b;
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public boolean f() {
        return this.f23916c;
    }

    public void g(boolean animate) {
        this.f23916c = animate;
    }

    public void h(int id2) {
        this.f23917d = id2;
    }

    public void i(int id2) {
        h t4 = ConstraintLayout.t();
        int i4 = this.f23915b;
        if (i4 != -1) {
            t4.e(i4, this);
        }
        this.f23915b = id2;
        if (id2 != -1) {
            t4.a(id2, this);
        }
    }

    public void j(int margin) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f23829b = margin;
        setLayoutParams(layoutParams);
    }

    public void k(int margin) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f23831c = margin;
        setLayoutParams(layoutParams);
    }

    public void l(float ratio) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f23833d = ratio;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
    }

    public ReactiveGuide(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f23915b = -1;
        this.f23916c = false;
        this.f23917d = 0;
        this.f23918e = true;
        super.setVisibility(8);
        e(attrs);
    }

    public ReactiveGuide(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f23915b = -1;
        this.f23916c = false;
        this.f23917d = 0;
        this.f23918e = true;
        super.setVisibility(8);
        e(attrs);
    }

    public ReactiveGuide(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr);
        this.f23915b = -1;
        this.f23916c = false;
        this.f23917d = 0;
        this.f23918e = true;
        super.setVisibility(8);
        e(attrs);
    }
}
