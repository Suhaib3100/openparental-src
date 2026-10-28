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
import androidx.core.view.y1;
import com.google.firebase.remoteconfig.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n1.a;

/* loaded from: classes2.dex */
class ClockHandView extends View {
    private static final int F = 200;
    private float A;
    private boolean B;
    private c C;
    private double D;
    private int E;

    /* renamed from: o, reason: collision with root package name */
    private ValueAnimator f14567o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f14568p;

    /* renamed from: q, reason: collision with root package name */
    private float f14569q;

    /* renamed from: r, reason: collision with root package name */
    private float f14570r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f14571s;

    /* renamed from: t, reason: collision with root package name */
    private int f14572t;

    /* renamed from: u, reason: collision with root package name */
    private final List<d> f14573u;

    /* renamed from: v, reason: collision with root package name */
    private final int f14574v;

    /* renamed from: w, reason: collision with root package name */
    private final float f14575w;

    /* renamed from: x, reason: collision with root package name */
    private final Paint f14576x;

    /* renamed from: y, reason: collision with root package name */
    private final RectF f14577y;

    /* renamed from: z, reason: collision with root package name */
    @u0
    private final int f14578z;

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
        void c(@x(from = 0.0d, to = 360.0d) float f6, boolean z5);
    }

    public interface d {
        void d(@x(from = 0.0d, to = 360.0d) float f6, boolean z5);
    }

    public ClockHandView(Context context) {
        this(context, null);
    }

    private void c(Canvas canvas) {
        int height = getHeight() / 2;
        float width = getWidth() / 2;
        float cos = (this.E * ((float) Math.cos(this.D))) + width;
        float f6 = height;
        float sin = (this.E * ((float) Math.sin(this.D))) + f6;
        this.f14576x.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f14574v, this.f14576x);
        double sin2 = Math.sin(this.D);
        double cos2 = Math.cos(this.D);
        this.f14576x.setStrokeWidth(this.f14578z);
        canvas.drawLine(width, f6, r1 + ((int) (cos2 * r6)), height + ((int) (r6 * sin2)), this.f14576x);
        canvas.drawCircle(width, f6, this.f14575w, this.f14576x);
    }

    private int e(float f6, float f7) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f7 - (getHeight() / 2), f6 - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    private Pair<Float, Float> h(float f6) {
        float f7 = f();
        if (Math.abs(f7 - f6) > 180.0f) {
            if (f7 > 180.0f && f6 < 180.0f) {
                f6 += 360.0f;
            }
            if (f7 < 180.0f && f6 > 180.0f) {
                f7 += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(f7), Float.valueOf(f6));
    }

    private boolean i(float f6, float f7, boolean z5, boolean z6, boolean z7) {
        float e6 = e(f6, f7);
        boolean z8 = false;
        boolean z9 = f() != e6;
        if (z6 && z9) {
            return true;
        }
        if (!z9 && !z5) {
            return false;
        }
        if (z7 && this.f14568p) {
            z8 = true;
        }
        m(e6, z8);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(@x(from = 0.0d, to = 360.0d) float f6, boolean z5) {
        float f7 = f6 % 360.0f;
        this.A = f7;
        this.D = Math.toRadians(f7 - 90.0f);
        int height = getHeight() / 2;
        float cos = (this.E * ((float) Math.cos(this.D))) + (getWidth() / 2);
        float sin = (this.E * ((float) Math.sin(this.D))) + height;
        RectF rectF = this.f14577y;
        int i5 = this.f14574v;
        rectF.set(cos - i5, sin - i5, cos + i5, sin + i5);
        Iterator<d> it = this.f14573u.iterator();
        while (it.hasNext()) {
            it.next().d(f7, z5);
        }
        invalidate();
    }

    public void b(d dVar) {
        this.f14573u.add(dVar);
    }

    public RectF d() {
        return this.f14577y;
    }

    @x(from = p.f18289o, to = 360.0d)
    public float f() {
        return this.A;
    }

    public int g() {
        return this.f14574v;
    }

    public void j(boolean z5) {
        this.f14568p = z5;
    }

    public void k(@r int i5) {
        this.E = i5;
        invalidate();
    }

    public void l(@x(from = 0.0d, to = 360.0d) float f6) {
        m(f6, false);
    }

    public void m(@x(from = 0.0d, to = 360.0d) float f6, boolean z5) {
        ValueAnimator valueAnimator = this.f14567o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z5) {
            n(f6, false);
            return;
        }
        Pair<Float, Float> h5 = h(f6);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) h5.first).floatValue(), ((Float) h5.second).floatValue());
        this.f14567o = ofFloat;
        ofFloat.setDuration(200L);
        this.f14567o.addUpdateListener(new a());
        this.f14567o.addListener(new b());
        this.f14567o.start();
    }

    public void o(c cVar) {
        this.C = cVar;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        super.onLayout(z5, i5, i6, i7, i8);
        l(f());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        boolean z6;
        boolean z7;
        c cVar;
        int actionMasked = motionEvent.getActionMasked();
        float x5 = motionEvent.getX();
        float y5 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f14569q = x5;
            this.f14570r = y5;
            this.f14571s = true;
            this.B = false;
            z5 = false;
            z6 = false;
            z7 = true;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i5 = (int) (x5 - this.f14569q);
            int i6 = (int) (y5 - this.f14570r);
            this.f14571s = (i6 * i6) + (i5 * i5) > this.f14572t;
            boolean z8 = this.B;
            z5 = actionMasked == 1;
            z7 = false;
            z6 = z8;
        } else {
            z5 = false;
            z6 = false;
            z7 = false;
        }
        boolean i7 = i(x5, y5, z6, z7, z5) | this.B;
        this.B = i7;
        if (i7 && z5 && (cVar = this.C) != null) {
            cVar.c(e(x5, y5), this.f14571s);
        }
        return true;
    }

    public ClockHandView(Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.O9);
    }

    public ClockHandView(Context context, @q0 AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f14573u = new ArrayList();
        Paint paint = new Paint();
        this.f14576x = paint;
        this.f14577y = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.p6, i5, a.n.Ic);
        this.E = obtainStyledAttributes.getDimensionPixelSize(a.o.r6, 0);
        this.f14574v = obtainStyledAttributes.getDimensionPixelSize(a.o.s6, 0);
        this.f14578z = getResources().getDimensionPixelSize(a.f.f29462d2);
        this.f14575w = r6.getDimensionPixelSize(a.f.f29448b2);
        int color = obtainStyledAttributes.getColor(a.o.q6, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        l(0.0f);
        this.f14572t = ViewConfiguration.get(context).getScaledTouchSlop();
        y1.R1(this, 2);
        obtainStyledAttributes.recycle();
    }
}
