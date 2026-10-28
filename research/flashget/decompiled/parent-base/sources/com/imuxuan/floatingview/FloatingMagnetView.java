package com.imuxuan.floatingview;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes6.dex */
public class FloatingMagnetView extends FrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final int f64116n = 13;

    /* renamed from: o, reason: collision with root package name */
    private static final int f64117o = 150;

    /* renamed from: b, reason: collision with root package name */
    private float f64118b;

    /* renamed from: c, reason: collision with root package name */
    private float f64119c;

    /* renamed from: d, reason: collision with root package name */
    private float f64120d;

    /* renamed from: e, reason: collision with root package name */
    private float f64121e;

    /* renamed from: f, reason: collision with root package name */
    private e f64122f;

    /* renamed from: g, reason: collision with root package name */
    private long f64123g;

    /* renamed from: h, reason: collision with root package name */
    protected b f64124h;

    /* renamed from: i, reason: collision with root package name */
    protected int f64125i;

    /* renamed from: j, reason: collision with root package name */
    private int f64126j;

    /* renamed from: k, reason: collision with root package name */
    private int f64127k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f64128l;

    /* renamed from: m, reason: collision with root package name */
    private float f64129m;

    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f64130b;

        a(boolean z4) {
            this.f64130b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            FloatingMagnetView.this.o();
            FloatingMagnetView floatingMagnetView = FloatingMagnetView.this;
            floatingMagnetView.l(floatingMagnetView.f64128l, this.f64130b);
        }
    }

    protected class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private Handler f64132b = new Handler(Looper.getMainLooper());

        /* renamed from: c, reason: collision with root package name */
        private float f64133c;

        /* renamed from: d, reason: collision with root package name */
        private float f64134d;

        /* renamed from: e, reason: collision with root package name */
        private long f64135e;

        protected b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            this.f64132b.removeCallbacks(this);
        }

        void b(float f4, float f5) {
            this.f64133c = f4;
            this.f64134d = f5;
            this.f64135e = System.currentTimeMillis();
            this.f64132b.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (FloatingMagnetView.this.getRootView() == null || FloatingMagnetView.this.getRootView().getParent() == null) {
                return;
            }
            float min = Math.min(1.0f, (System.currentTimeMillis() - this.f64135e) / 400.0f);
            FloatingMagnetView.this.j((this.f64133c - FloatingMagnetView.this.getX()) * min, (this.f64134d - FloatingMagnetView.this.getY()) * min);
            if (min < 1.0f) {
                this.f64132b.post(this);
            }
        }
    }

    public FloatingMagnetView(Context context) {
        this(context, null);
    }

    private void c(MotionEvent motionEvent) {
        this.f64120d = getX();
        this.f64121e = getY();
        this.f64118b = motionEvent.getRawX();
        this.f64119c = motionEvent.getRawY();
        this.f64123g = System.currentTimeMillis();
    }

    private void d() {
        this.f64129m = 0.0f;
    }

    private void f() {
        this.f64124h = new b();
        this.f64127k = bb.b.c(getContext());
        setClickable(true);
    }

    private void i(boolean z4) {
        if (z4) {
            this.f64129m = getY();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(float f4, float f5) {
        setX(getX() + f4);
        setY(getY() + f5);
    }

    private void p(MotionEvent motionEvent) {
        setX((motionEvent.getRawX() + this.f64120d) - this.f64118b);
        float rawY = (motionEvent.getRawY() + this.f64121e) - this.f64119c;
        int i4 = this.f64127k;
        if (rawY < i4) {
            rawY = i4;
        }
        if (rawY > this.f64126j - getHeight()) {
            rawY = this.f64126j - getHeight();
        }
        setY(rawY);
    }

    protected void e() {
        e eVar = this.f64122f;
        if (eVar != null) {
            eVar.b(this);
        }
    }

    protected boolean g() {
        boolean z4 = getX() < ((float) (this.f64125i / 2));
        this.f64128l = z4;
        return z4;
    }

    protected boolean h() {
        return System.currentTimeMillis() - this.f64123g < 150;
    }

    public void k() {
        l(g(), false);
    }

    public void l(boolean z4, boolean z5) {
        float f4 = z4 ? 13.0f : this.f64125i - 13;
        float y4 = getY();
        if (!z5) {
            float f5 = this.f64129m;
            if (f5 != 0.0f) {
                this.f64129m = 0.0f;
                y4 = f5;
            }
        }
        this.f64124h.b(f4, Math.min(Math.max(0.0f, y4), this.f64126j - getHeight()));
    }

    public void m() {
        e eVar = this.f64122f;
        if (eVar != null) {
            eVar.a(this);
        }
    }

    public void n(e eVar) {
        this.f64122f = eVar;
    }

    protected void o() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            this.f64125i = viewGroup.getWidth() - getWidth();
            this.f64126j = viewGroup.getHeight();
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (getParent() != null) {
            boolean z4 = configuration.orientation == 2;
            i(z4);
            ((ViewGroup) getParent()).post(new a(z4));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            c(motionEvent);
            o();
            this.f64124h.c();
        } else if (action == 1) {
            this.f64129m = 0.0f;
            k();
            if (h()) {
                e();
            }
        } else if (action == 2) {
            p(motionEvent);
        }
        return true;
    }

    public FloatingMagnetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FloatingMagnetView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f64128l = true;
        f();
    }
}
