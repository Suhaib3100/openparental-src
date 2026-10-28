package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.c1;
import androidx.core.view.y1;
import d.a;

@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    private boolean f772o;

    /* renamed from: p, reason: collision with root package name */
    private View f773p;

    /* renamed from: q, reason: collision with root package name */
    private View f774q;

    /* renamed from: r, reason: collision with root package name */
    private View f775r;

    /* renamed from: s, reason: collision with root package name */
    Drawable f776s;

    /* renamed from: t, reason: collision with root package name */
    Drawable f777t;

    /* renamed from: u, reason: collision with root package name */
    Drawable f778u;

    /* renamed from: v, reason: collision with root package name */
    boolean f779v;

    /* renamed from: w, reason: collision with root package name */
    boolean f780w;

    /* renamed from: x, reason: collision with root package name */
    private int f781x;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean c(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    public View b() {
        return this.f773p;
    }

    public void d(Drawable drawable) {
        Drawable drawable2 = this.f776s;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f776s);
        }
        this.f776s = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f774q;
            if (view != null) {
                this.f776s.setBounds(view.getLeft(), this.f774q.getTop(), this.f774q.getRight(), this.f774q.getBottom());
            }
        }
        boolean z5 = true;
        if (!this.f779v ? this.f776s != null || this.f777t != null : this.f778u != null) {
            z5 = false;
        }
        setWillNotDraw(z5);
        invalidate();
        invalidateOutline();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f776s;
        if (drawable != null && drawable.isStateful()) {
            this.f776s.setState(getDrawableState());
        }
        Drawable drawable2 = this.f777t;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f777t.setState(getDrawableState());
        }
        Drawable drawable3 = this.f778u;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f778u.setState(getDrawableState());
    }

    public void e(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f778u;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f778u);
        }
        this.f778u = drawable;
        boolean z5 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f779v && (drawable2 = this.f778u) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f779v ? !(this.f776s != null || this.f777t != null) : this.f778u == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
        invalidate();
        invalidateOutline();
    }

    public void f(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f777t;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f777t);
        }
        this.f777t = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f780w && (drawable2 = this.f777t) != null) {
                drawable2.setBounds(this.f773p.getLeft(), this.f773p.getTop(), this.f773p.getRight(), this.f773p.getBottom());
            }
        }
        boolean z5 = true;
        if (!this.f779v ? this.f776s != null || this.f777t != null : this.f778u != null) {
            z5 = false;
        }
        setWillNotDraw(z5);
        invalidate();
        invalidateOutline();
    }

    public void g(r0 r0Var) {
        View view = this.f773p;
        if (view != null) {
            removeView(view);
        }
        this.f773p = r0Var;
        if (r0Var != null) {
            addView(r0Var);
            ViewGroup.LayoutParams layoutParams = r0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            r0Var.m(false);
        }
    }

    public void h(boolean z5) {
        this.f772o = z5;
        setDescendantFocusability(z5 ? 393216 : 262144);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f776s;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f777t;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f778u;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f774q = findViewById(a.h.H);
        this.f775r = findViewById(a.h.P);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f772o || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        Drawable drawable;
        super.onLayout(z5, i5, i6, i7, i8);
        View view = this.f773p;
        boolean z6 = true;
        boolean z7 = false;
        boolean z8 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i9 = layoutParams.bottomMargin;
            view.layout(i5, measuredHeight2 - i9, i7, measuredHeight - i9);
        }
        if (this.f779v) {
            Drawable drawable2 = this.f778u;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z6 = z7;
        } else {
            if (this.f776s != null) {
                if (this.f774q.getVisibility() == 0) {
                    this.f776s.setBounds(this.f774q.getLeft(), this.f774q.getTop(), this.f774q.getRight(), this.f774q.getBottom());
                } else {
                    View view2 = this.f775r;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f776s.setBounds(0, 0, 0, 0);
                    } else {
                        this.f776s.setBounds(this.f775r.getLeft(), this.f775r.getTop(), this.f775r.getRight(), this.f775r.getBottom());
                    }
                }
                z7 = true;
            }
            this.f780w = z8;
            if (z8 && (drawable = this.f777t) != null) {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            z6 = z7;
        }
        if (z6) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i5, int i6) {
        int i7;
        if (this.f774q == null && View.MeasureSpec.getMode(i6) == Integer.MIN_VALUE && (i7 = this.f781x) >= 0) {
            i6 = View.MeasureSpec.makeMeasureSpec(Math.min(i7, View.MeasureSpec.getSize(i6)), Integer.MIN_VALUE);
        }
        super.onMeasure(i5, i6);
        if (this.f774q == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i6);
        View view = this.f773p;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min((!c(this.f774q) ? a(this.f774q) : !c(this.f775r) ? a(this.f775r) : 0) + a(this.f773p), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i6) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        super.setVisibility(i5);
        boolean z5 = i5 == 0;
        Drawable drawable = this.f776s;
        if (drawable != null) {
            drawable.setVisible(z5, false);
        }
        Drawable drawable2 = this.f777t;
        if (drawable2 != null) {
            drawable2.setVisible(z5, false);
        }
        Drawable drawable3 = this.f778u;
        if (drawable3 != null) {
            drawable3.setVisible(z5, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f776s && !this.f779v) || (drawable == this.f777t && this.f780w) || ((drawable == this.f778u && this.f779v) || super.verifyDrawable(drawable));
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        y1.I1(this, new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.n.f22158a);
        this.f776s = obtainStyledAttributes.getDrawable(a.n.f22165b);
        this.f777t = obtainStyledAttributes.getDrawable(a.n.f22179d);
        this.f781x = obtainStyledAttributes.getDimensionPixelSize(a.n.f22248o, -1);
        boolean z5 = true;
        if (getId() == a.h.f21892m1) {
            this.f779v = true;
            this.f778u = obtainStyledAttributes.getDrawable(a.n.f22172c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f779v ? this.f776s != null || this.f777t != null : this.f778u != null) {
            z5 = false;
        }
        setWillNotDraw(z5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i5) {
        if (i5 != 0) {
            return super.startActionModeForChild(view, callback, i5);
        }
        return null;
    }
}
