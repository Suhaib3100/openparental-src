package androidx.viewpager2.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.annotation.l1;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FakeDrag.java */
/* loaded from: classes3.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private final ViewPager2 f35651a;

    /* renamed from: b, reason: collision with root package name */
    private final g f35652b;

    /* renamed from: c, reason: collision with root package name */
    private final RecyclerView f35653c;

    /* renamed from: d, reason: collision with root package name */
    private VelocityTracker f35654d;

    /* renamed from: e, reason: collision with root package name */
    private int f35655e;

    /* renamed from: f, reason: collision with root package name */
    private float f35656f;

    /* renamed from: g, reason: collision with root package name */
    private int f35657g;

    /* renamed from: h, reason: collision with root package name */
    private long f35658h;

    d(ViewPager2 viewPager2, g gVar, RecyclerView recyclerView) {
        this.f35651a = viewPager2;
        this.f35652b = gVar;
        this.f35653c = recyclerView;
    }

    private void a(long j4, int i4, float f4, float f5) {
        MotionEvent obtain = MotionEvent.obtain(this.f35658h, j4, i4, f4, f5, 0);
        this.f35654d.addMovement(obtain);
        obtain.recycle();
    }

    private void c() {
        VelocityTracker velocityTracker = this.f35654d;
        if (velocityTracker != null) {
            velocityTracker.clear();
        } else {
            this.f35654d = VelocityTracker.obtain();
            this.f35655e = ViewConfiguration.get(this.f35651a.getContext()).getScaledMaximumFlingVelocity();
        }
    }

    @l1
    boolean b() {
        if (this.f35652b.g()) {
            return false;
        }
        this.f35657g = 0;
        this.f35656f = 0;
        this.f35658h = SystemClock.uptimeMillis();
        c();
        this.f35652b.k();
        if (!this.f35652b.i()) {
            this.f35653c.stopScroll();
        }
        a(this.f35658h, 0, 0.0f, 0.0f);
        return true;
    }

    @l1
    boolean d() {
        if (!this.f35652b.h()) {
            return false;
        }
        this.f35652b.m();
        VelocityTracker velocityTracker = this.f35654d;
        velocityTracker.computeCurrentVelocity(1000, this.f35655e);
        if (this.f35653c.fling((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
            return true;
        }
        this.f35651a.I();
        return true;
    }

    @l1
    boolean e(float f4) {
        if (!this.f35652b.h()) {
            return false;
        }
        float f5 = this.f35656f - f4;
        this.f35656f = f5;
        int round = Math.round(f5 - this.f35657g);
        this.f35657g += round;
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean z4 = this.f35651a.l() == 0;
        int i4 = z4 ? round : 0;
        int i5 = z4 ? 0 : round;
        float f6 = z4 ? this.f35656f : 0.0f;
        float f7 = z4 ? 0.0f : this.f35656f;
        this.f35653c.scrollBy(i4, i5);
        a(uptimeMillis, 2, f6, f7);
        return true;
    }

    boolean f() {
        return this.f35652b.h();
    }
}
