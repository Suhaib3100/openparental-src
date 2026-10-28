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
import androidx.core.view.x1;

/* loaded from: classes3.dex */
public class PagerTabStrip extends PagerTitleStrip {
    private static final String J = "PagerTabStrip";
    private static final int K = 3;
    private static final int L = 6;
    private static final int M = 16;
    private static final int N = 32;
    private static final int O = 64;
    private static final int P = 1;
    private static final int Q = 32;
    private final Rect A;
    private int B;
    private boolean C;
    private boolean D;
    private int E;
    private boolean F;
    private float G;
    private float H;
    private int I;

    /* renamed from: t, reason: collision with root package name */
    private int f35473t;

    /* renamed from: u, reason: collision with root package name */
    private int f35474u;

    /* renamed from: v, reason: collision with root package name */
    private int f35475v;

    /* renamed from: w, reason: collision with root package name */
    private int f35476w;

    /* renamed from: x, reason: collision with root package name */
    private int f35477x;

    /* renamed from: y, reason: collision with root package name */
    private int f35478y;

    /* renamed from: z, reason: collision with root package name */
    private final Paint f35479z;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PagerTabStrip.this.f35486b.Y(r2.x() - 1);
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f35486b;
            viewPager.Y(viewPager.x() + 1);
        }
    }

    public PagerTabStrip(@o0 Context context) {
        this(context, null);
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    int a() {
        return Math.max(super.a(), this.f35477x);
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void h(int i4) {
        int i5 = this.f35476w;
        if (i4 < i5) {
            i4 = i5;
        }
        super.h(i4);
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    void k(int i4, float f4, boolean z4) {
        Rect rect = this.A;
        int height = getHeight();
        int left = this.f35488d.getLeft() - this.f35478y;
        int right = this.f35488d.getRight() + this.f35478y;
        int i5 = height - this.f35474u;
        rect.set(left, i5, right, height);
        super.k(i4, f4, z4);
        this.B = (int) (Math.abs(f4 - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f35488d.getLeft() - this.f35478y, i5, this.f35488d.getRight() + this.f35478y, height);
        invalidate(rect);
    }

    public boolean l() {
        return this.C;
    }

    @l
    public int m() {
        return this.f35473t;
    }

    public void n(boolean z4) {
        this.C = z4;
        this.D = true;
        invalidate();
    }

    public void o(@l int i4) {
        this.f35473t = i4;
        this.f35479z.setColor(i4);
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f35488d.getLeft() - this.f35478y;
        int right = this.f35488d.getRight() + this.f35478y;
        int i4 = height - this.f35474u;
        this.f35479z.setColor((this.B << 24) | (this.f35473t & 16777215));
        float f4 = height;
        canvas.drawRect(left, i4, right, f4, this.f35479z);
        if (this.C) {
            this.f35479z.setColor((this.f35473t & 16777215) | x1.f27484y);
            canvas.drawRect(getPaddingLeft(), height - this.E, getWidth() - getPaddingRight(), f4, this.f35479z);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.F) {
            return false;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        if (action == 0) {
            this.G = x4;
            this.H = y4;
            this.F = false;
        } else if (action != 1) {
            if (action == 2 && (Math.abs(x4 - this.G) > this.I || Math.abs(y4 - this.H) > this.I)) {
                this.F = true;
            }
        } else if (x4 < this.f35488d.getLeft() - this.f35478y) {
            ViewPager viewPager = this.f35486b;
            viewPager.Y(viewPager.x() - 1);
        } else if (x4 > this.f35488d.getRight() + this.f35478y) {
            ViewPager viewPager2 = this.f35486b;
            viewPager2.Y(viewPager2.x() + 1);
        }
        return true;
    }

    public void p(@n int i4) {
        o(d.getColor(getContext(), i4));
    }

    @Override // android.view.View
    public void setBackgroundColor(@l int i4) {
        super.setBackgroundColor(i4);
        if (this.D) {
            return;
        }
        this.C = (i4 & x1.f27484y) == 0;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.D) {
            return;
        }
        this.C = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundResource(@v int i4) {
        super.setBackgroundResource(i4);
        if (this.D) {
            return;
        }
        this.C = i4 == 0;
    }

    @Override // android.view.View
    public void setPadding(int i4, int i5, int i6, int i7) {
        int i10 = this.f35475v;
        if (i7 < i10) {
            i7 = i10;
        }
        super.setPadding(i4, i5, i6, i7);
    }

    public PagerTabStrip(@o0 Context context, @q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f35479z = paint;
        this.A = new Rect();
        this.B = 255;
        this.C = false;
        this.D = false;
        int i4 = this.f35499o;
        this.f35473t = i4;
        paint.setColor(i4);
        float f4 = context.getResources().getDisplayMetrics().density;
        this.f35474u = (int) ((3.0f * f4) + 0.5f);
        this.f35475v = (int) ((6.0f * f4) + 0.5f);
        this.f35476w = (int) (64.0f * f4);
        this.f35478y = (int) ((16.0f * f4) + 0.5f);
        this.E = (int) ((1.0f * f4) + 0.5f);
        this.f35477x = (int) ((f4 * 32.0f) + 0.5f);
        this.I = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        h(b());
        setWillNotDraw(false);
        this.f35487c.setFocusable(true);
        this.f35487c.setOnClickListener(new a());
        this.f35489e.setFocusable(true);
        this.f35489e.setOnClickListener(new b());
        if (getBackground() == null) {
            this.C = true;
        }
    }
}
