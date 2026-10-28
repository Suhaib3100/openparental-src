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
import androidx.core.view.x1;
import d.a;

@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    private boolean f1330b;

    /* renamed from: c, reason: collision with root package name */
    private View f1331c;

    /* renamed from: d, reason: collision with root package name */
    private View f1332d;

    /* renamed from: e, reason: collision with root package name */
    private View f1333e;

    /* renamed from: f, reason: collision with root package name */
    Drawable f1334f;

    /* renamed from: g, reason: collision with root package name */
    Drawable f1335g;

    /* renamed from: h, reason: collision with root package name */
    Drawable f1336h;

    /* renamed from: i, reason: collision with root package name */
    boolean f1337i;

    /* renamed from: j, reason: collision with root package name */
    boolean f1338j;

    /* renamed from: k, reason: collision with root package name */
    private int f1339k;

    @androidx.annotation.x0(21)
    private static class a {
        private a() {
        }

        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

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
        return this.f1331c;
    }

    public void d(Drawable drawable) {
        Drawable drawable2 = this.f1334f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1334f);
        }
        this.f1334f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1332d;
            if (view != null) {
                this.f1334f.setBounds(view.getLeft(), this.f1332d.getTop(), this.f1332d.getRight(), this.f1332d.getBottom());
            }
        }
        boolean z4 = false;
        if (!this.f1337i ? !(this.f1334f != null || this.f1335g != null) : this.f1336h == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1334f;
        if (drawable != null && drawable.isStateful()) {
            this.f1334f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1335g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1335g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1336h;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1336h.setState(getDrawableState());
    }

    public void e(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1336h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1336h);
        }
        this.f1336h = drawable;
        boolean z4 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1337i && (drawable2 = this.f1336h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1337i ? !(this.f1334f != null || this.f1335g != null) : this.f1336h == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void f(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1335g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1335g);
        }
        this.f1335g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1338j && (drawable2 = this.f1335g) != null) {
                drawable2.setBounds(this.f1331c.getLeft(), this.f1331c.getTop(), this.f1331c.getRight(), this.f1331c.getBottom());
            }
        }
        boolean z4 = false;
        if (!this.f1337i ? !(this.f1334f != null || this.f1335g != null) : this.f1336h == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void g(l0 l0Var) {
        View view = this.f1331c;
        if (view != null) {
            removeView(view);
        }
        this.f1331c = l0Var;
        if (l0Var != null) {
            addView(l0Var);
            ViewGroup.LayoutParams layoutParams = l0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            l0Var.m(false);
        }
    }

    public void h(boolean z4) {
        this.f1330b = z4;
        setDescendantFocusability(z4 ? 393216 : 262144);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1334f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1335g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1336h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1332d = findViewById(a.g.f73236a);
        this.f1333e = findViewById(a.g.f73250h);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1330b || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        Drawable drawable;
        super.onLayout(z4, i4, i5, i6, i7);
        View view = this.f1331c;
        boolean z5 = true;
        boolean z6 = false;
        boolean z7 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i10 = layoutParams.bottomMargin;
            view.layout(i4, measuredHeight2 - i10, i6, measuredHeight - i10);
        }
        if (this.f1337i) {
            Drawable drawable2 = this.f1336h;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z5 = z6;
        } else {
            if (this.f1334f != null) {
                if (this.f1332d.getVisibility() == 0) {
                    this.f1334f.setBounds(this.f1332d.getLeft(), this.f1332d.getTop(), this.f1332d.getRight(), this.f1332d.getBottom());
                } else {
                    View view2 = this.f1333e;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f1334f.setBounds(0, 0, 0, 0);
                    } else {
                        this.f1334f.setBounds(this.f1333e.getLeft(), this.f1333e.getTop(), this.f1333e.getRight(), this.f1333e.getBottom());
                    }
                }
                z6 = true;
            }
            this.f1338j = z7;
            if (z7 && (drawable = this.f1335g) != null) {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            z5 = z6;
        }
        if (z5) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i4, int i5) {
        int i6;
        if (this.f1332d == null && View.MeasureSpec.getMode(i5) == Integer.MIN_VALUE && (i6 = this.f1339k) >= 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(Math.min(i6, View.MeasureSpec.getSize(i5)), Integer.MIN_VALUE);
        }
        super.onMeasure(i4, i5);
        if (this.f1332d == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i5);
        View view = this.f1331c;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min((!c(this.f1332d) ? a(this.f1332d) : !c(this.f1333e) ? a(this.f1333e) : 0) + a(this.f1331c), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i5) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        boolean z4 = i4 == 0;
        Drawable drawable = this.f1334f;
        if (drawable != null) {
            drawable.setVisible(z4, false);
        }
        Drawable drawable2 = this.f1335g;
        if (drawable2 != null) {
            drawable2.setVisible(z4, false);
        }
        Drawable drawable3 = this.f1336h;
        if (drawable3 != null) {
            drawable3.setVisible(z4, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f1334f && !this.f1337i) || (drawable == this.f1335g && this.f1338j) || ((drawable == this.f1336h && this.f1337i) || super.verifyDrawable(drawable));
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        x1.P1(this, new c(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m.f73485a);
        this.f1334f = obtainStyledAttributes.getDrawable(a.m.f73491b);
        this.f1335g = obtainStyledAttributes.getDrawable(a.m.f73503d);
        this.f1339k = obtainStyledAttributes.getDimensionPixelSize(a.m.f73559o, -1);
        boolean z4 = true;
        if (getId() == a.g.f73255j0) {
            this.f1337i = true;
            this.f1336h = obtainStyledAttributes.getDrawable(a.m.f73497c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1337i ? this.f1334f != null || this.f1335g != null : this.f1336h != null) {
            z4 = false;
        }
        setWillNotDraw(z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i4) {
        if (i4 != 0) {
            return super.startActionModeForChild(view, callback, i4);
        }
        return null;
    }
}
