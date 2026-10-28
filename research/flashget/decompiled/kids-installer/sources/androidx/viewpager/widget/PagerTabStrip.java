package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.l;
import androidx.annotation.n;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.v;
import androidx.core.content.d;
import androidx.core.view.y1;

/* loaded from: classes3.dex */
public class PagerTabStrip extends PagerTitleStrip {
    private static final String W = "PagerTabStrip";

    /* renamed from: a0, reason: collision with root package name */
    private static final int f10335a0 = 3;

    /* renamed from: b0, reason: collision with root package name */
    private static final int f10336b0 = 6;

    /* renamed from: c0, reason: collision with root package name */
    private static final int f10337c0 = 16;

    /* renamed from: d0, reason: collision with root package name */
    private static final int f10338d0 = 32;

    /* renamed from: e0, reason: collision with root package name */
    private static final int f10339e0 = 64;

    /* renamed from: f0, reason: collision with root package name */
    private static final int f10340f0 = 1;

    /* renamed from: g0, reason: collision with root package name */
    private static final int f10341g0 = 32;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private final Paint M;
    private final Rect N;
    private int O;
    private boolean P;
    private boolean Q;
    private int R;
    private boolean S;
    private float T;
    private float U;
    private int V;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PagerTabStrip.this.f10344o.Y(r2.x() - 1);
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f10344o;
            viewPager.Y(viewPager.x() + 1);
        }
    }

    public PagerTabStrip(@o0 Context context) {
        this(context, null);
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    int a() {
        return Math.max(super.a(), this.K);
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void h(int i5) {
        int i6 = this.J;
        if (i5 < i6) {
            i5 = i6;
        }
        super.h(i5);
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    void k(int i5, float f6, boolean z5) {
        Rect rect = this.N;
        int height = getHeight();
        int left = this.f10346q.getLeft() - this.L;
        int right = this.f10346q.getRight() + this.L;
        int i6 = height - this.H;
        rect.set(left, i6, right, height);
        super.k(i5, f6, z5);
        this.O = (int) (Math.abs(f6 - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f10346q.getLeft() - this.L, i6, this.f10346q.getRight() + this.L, height);
        invalidate(rect);
    }

    public boolean l() {
        return this.P;
    }

    @l
    public int m() {
        return this.G;
    }

    public void n(boolean z5) {
        this.P = z5;
        this.Q = true;
        invalidate();
    }

    public void o(@l int i5) {
        this.G = i5;
        this.M.setColor(i5);
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f10346q.getLeft() - this.L;
        int right = this.f10346q.getRight() + this.L;
        int i5 = height - this.H;
        this.M.setColor((this.O << 24) | (this.G & y1.f5757s));
        float f6 = height;
        canvas.drawRect(left, i5, right, f6, this.M);
        if (this.P) {
            this.M.setColor((this.G & y1.f5757s) | y1.f5758t);
            canvas.drawRect(getPaddingLeft(), height - this.R, getWidth() - getPaddingRight(), f6, this.M);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.S) {
            return false;
        }
        float x5 = motionEvent.getX();
        float y5 = motionEvent.getY();
        if (action == 0) {
            this.T = x5;
            this.U = y5;
            this.S = false;
        } else if (action != 1) {
            if (action == 2 && (Math.abs(x5 - this.T) > this.V || Math.abs(y5 - this.U) > this.V)) {
                this.S = true;
            }
        } else if (x5 < this.f10346q.getLeft() - this.L) {
            ViewPager viewPager = this.f10344o;
            viewPager.Y(viewPager.x() - 1);
        } else if (x5 > this.f10346q.getRight() + this.L) {
            ViewPager viewPager2 = this.f10344o;
            viewPager2.Y(viewPager2.x() + 1);
        }
        return true;
    }

    public void p(@n int i5) {
        o(d.f(getContext(), i5));
    }

    @Override // android.view.View
    public void setBackgroundColor(@l int i5) {
        super.setBackgroundColor(i5);
        if (this.Q) {
            return;
        }
        this.P = (i5 & y1.f5758t) == 0;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.Q) {
            return;
        }
        this.P = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundResource(@v int i5) {
        super.setBackgroundResource(i5);
        if (this.Q) {
            return;
        }
        this.P = i5 == 0;
    }

    @Override // android.view.View
    public void setPadding(int i5, int i6, int i7, int i8) {
        int i9 = this.I;
        if (i8 < i9) {
            i8 = i9;
        }
        super.setPadding(i5, i6, i7, i8);
    }

    public PagerTabStrip(@o0 Context context, @q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.M = paint;
        this.N = new Rect();
        this.O = 255;
        this.P = false;
        this.Q = false;
        int i5 = this.B;
        this.G = i5;
        paint.setColor(i5);
        float f6 = context.getResources().getDisplayMetrics().density;
        this.H = (int) ((3.0f * f6) + 0.5f);
        this.I = (int) ((6.0f * f6) + 0.5f);
        this.J = (int) (64.0f * f6);
        this.L = (int) ((16.0f * f6) + 0.5f);
        this.R = (int) ((1.0f * f6) + 0.5f);
        this.K = (int) ((f6 * 32.0f) + 0.5f);
        this.V = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        h(b());
        setWillNotDraw(false);
        this.f10345p.setFocusable(true);
        this.f10345p.setOnClickListener(new a());
        this.f10347r.setFocusable(true);
        this.f10347r.setOnClickListener(new b());
        if (getBackground() == null) {
            this.P = true;
        }
    }
}
