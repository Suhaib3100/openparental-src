package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.q0;
import androidx.annotation.r;
import androidx.annotation.u0;
import androidx.annotation.x;
import androidx.core.view.x1;
import com.google.firebase.remoteconfig.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s8.a;

/* loaded from: classes6.dex */
class ClockHandView extends View {

    /* renamed from: s, reason: collision with root package name */
    private static final int f54405s = 200;

    /* renamed from: b, reason: collision with root package name */
    private ValueAnimator f54406b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f54407c;

    /* renamed from: d, reason: collision with root package name */
    private float f54408d;

    /* renamed from: e, reason: collision with root package name */
    private float f54409e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f54410f;

    /* renamed from: g, reason: collision with root package name */
    private int f54411g;

    /* renamed from: h, reason: collision with root package name */
    private final List<d> f54412h;

    /* renamed from: i, reason: collision with root package name */
    private final int f54413i;

    /* renamed from: j, reason: collision with root package name */
    private final float f54414j;

    /* renamed from: k, reason: collision with root package name */
    private final Paint f54415k;

    /* renamed from: l, reason: collision with root package name */
    private final RectF f54416l;

    /* renamed from: m, reason: collision with root package name */
    @u0
    private final int f54417m;

    /* renamed from: n, reason: collision with root package name */
    private float f54418n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f54419o;

    /* renamed from: p, reason: collision with root package name */
    private c f54420p;

    /* renamed from: q, reason: collision with root package name */
    private double f54421q;

    /* renamed from: r, reason: collision with root package name */
    private int f54422r;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.n(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface c {
        void d(@x(from = 0.0d, to = 360.0d) float f4, boolean z4);
    }

    public interface d {
        void g(@x(from = 0.0d, to = 360.0d) float f4, boolean z4);
    }

    public ClockHandView(Context context) {
        this(context, null);
    }

    private void c(Canvas canvas) {
        int height = getHeight() / 2;
        float width = getWidth() / 2;
        float cos = (this.f54422r * ((float) Math.cos(this.f54421q))) + width;
        float f4 = height;
        float sin = (this.f54422r * ((float) Math.sin(this.f54421q))) + f4;
        this.f54415k.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f54413i, this.f54415k);
        double sin2 = Math.sin(this.f54421q);
        double cos2 = Math.cos(this.f54421q);
        this.f54415k.setStrokeWidth(this.f54417m);
        canvas.drawLine(width, f4, r1 + ((int) (cos2 * r6)), height + ((int) (r6 * sin2)), this.f54415k);
        canvas.drawCircle(width, f4, this.f54414j, this.f54415k);
    }

    private int e(float f4, float f5) {
        int degrees = (int) Math.toDegrees(Math.atan2(f5 - (getHeight() / 2), f4 - (getWidth() / 2)));
        int i4 = degrees + 90;
        return i4 < 0 ? degrees + 450 : i4;
    }

    private Pair<Float, Float> h(float f4) {
        float f5 = f();
        if (Math.abs(f5 - f4) > 180.0f) {
            if (f5 > 180.0f && f4 < 180.0f) {
                f4 += 360.0f;
            }
            if (f5 < 180.0f && f4 > 180.0f) {
                f5 += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(f5), Float.valueOf(f4));
    }

    private boolean i(float f4, float f5, boolean z4, boolean z5, boolean z6) {
        float e4 = e(f4, f5);
        boolean z7 = false;
        boolean z10 = f() != e4;
        if (z5 && z10) {
            return true;
        }
        if (!z10 && !z4) {
            return false;
        }
        if (z6 && this.f54407c) {
            z7 = true;
        }
        m(e4, z7);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(@x(from = 0.0d, to = 360.0d) float f4, boolean z4) {
        float f5 = f4 % 360.0f;
        this.f54418n = f5;
        this.f54421q = Math.toRadians(f5 - 90.0f);
        int height = getHeight() / 2;
        float cos = (this.f54422r * ((float) Math.cos(this.f54421q))) + (getWidth() / 2);
        float sin = (this.f54422r * ((float) Math.sin(this.f54421q))) + height;
        RectF rectF = this.f54416l;
        int i4 = this.f54413i;
        rectF.set(cos - i4, sin - i4, cos + i4, sin + i4);
        Iterator<d> it = this.f54412h.iterator();
        while (it.hasNext()) {
            it.next().g(f5, z4);
        }
        invalidate();
    }

    public void b(d dVar) {
        this.f54412h.add(dVar);
    }

    public RectF d() {
        return this.f54416l;
    }

    @x(from = p.f60679p, to = 360.0d)
    public float f() {
        return this.f54418n;
    }

    public int g() {
        return this.f54413i;
    }

    public void j(boolean z4) {
        this.f54407c = z4;
    }

    public void k(@r int i4) {
        this.f54422r = i4;
        invalidate();
    }

    public void l(@x(from = 0.0d, to = 360.0d) float f4) {
        m(f4, false);
    }

    public void m(@x(from = 0.0d, to = 360.0d) float f4, boolean z4) {
        ValueAnimator valueAnimator = this.f54406b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z4) {
            n(f4, false);
            return;
        }
        Pair<Float, Float> h4 = h(f4);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) h4.first).floatValue(), ((Float) h4.second).floatValue());
        this.f54406b = ofFloat;
        ofFloat.setDuration(200L);
        this.f54406b.addUpdateListener(new a());
        this.f54406b.addListener(new b());
        this.f54406b.start();
    }

    public void o(c cVar) {
        this.f54420p = cVar;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        l(f());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z5;
        boolean z6;
        c cVar;
        int actionMasked = motionEvent.getActionMasked();
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f54408d = x4;
            this.f54409e = y4;
            this.f54410f = true;
            this.f54419o = false;
            z4 = false;
            z5 = false;
            z6 = true;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i4 = (int) (x4 - this.f54408d);
            int i5 = (int) (y4 - this.f54409e);
            this.f54410f = (i5 * i5) + (i4 * i4) > this.f54411g;
            boolean z7 = this.f54419o;
            z4 = actionMasked == 1;
            z6 = false;
            z5 = z7;
        } else {
            z4 = false;
            z5 = false;
            z6 = false;
        }
        boolean i6 = i(x4, y4, z5, z6, z4) | this.f54419o;
        this.f54419o = i6;
        if (i6 && z4 && (cVar = this.f54420p) != null) {
            cVar.d(e(x4, y4), this.f54410f);
        }
        return true;
    }

    public ClockHandView(Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.N9);
    }

    public ClockHandView(Context context, @q0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f54412h = new ArrayList();
        Paint paint = new Paint();
        this.f54415k = paint;
        this.f54416l = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.q6, i4, a.n.Ic);
        this.f54422r = obtainStyledAttributes.getDimensionPixelSize(a.o.s6, 0);
        this.f54413i = obtainStyledAttributes.getDimensionPixelSize(a.o.t6, 0);
        this.f54417m = getResources().getDimensionPixelSize(a.f.f90787d2);
        this.f54414j = r6.getDimensionPixelSize(a.f.f90775b2);
        int color = obtainStyledAttributes.getColor(a.o.r6, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        l(0.0f);
        this.f54411g = ViewConfiguration.get(context).getScaledTouchSlop();
        x1.Z1(this, 2);
        obtainStyledAttributes.recycle();
    }
}
