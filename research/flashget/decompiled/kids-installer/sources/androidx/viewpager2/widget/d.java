package androidx.viewpager2.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.annotation.l1;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FakeDrag.java */
/* loaded from: classes.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private final ViewPager2 f10488a;

    /* renamed from: b, reason: collision with root package name */
    private final g f10489b;

    /* renamed from: c, reason: collision with root package name */
    private final RecyclerView f10490c;

    /* renamed from: d, reason: collision with root package name */
    private VelocityTracker f10491d;

    /* renamed from: e, reason: collision with root package name */
    private int f10492e;

    /* renamed from: f, reason: collision with root package name */
    private float f10493f;

    /* renamed from: g, reason: collision with root package name */
    private int f10494g;

    /* renamed from: h, reason: collision with root package name */
    private long f10495h;

    d(ViewPager2 viewPager2, g gVar, RecyclerView recyclerView) {
        this.f10488a = viewPager2;
        this.f10489b = gVar;
        this.f10490c = recyclerView;
    }

    private void a(long j5, int i5, float f6, float f7) {
        MotionEvent obtain = MotionEvent.obtain(this.f10495h, j5, i5, f6, f7, 0);
        this.f10491d.addMovement(obtain);
        obtain.recycle();
    }

    private void c() {
        VelocityTracker velocityTracker = this.f10491d;
        if (velocityTracker != null) {
            velocityTracker.clear();
        } else {
            this.f10491d = VelocityTracker.obtain();
            this.f10492e = ViewConfiguration.get(this.f10488a.getContext()).getScaledMaximumFlingVelocity();
        }
    }

    @l1
    boolean b() {
        if (this.f10489b.i()) {
            return false;
        }
        this.f10494g = 0;
        this.f10493f = 0;
        this.f10495h = SystemClock.uptimeMillis();
        c();
        this.f10489b.m();
        if (!this.f10489b.k()) {
            this.f10490c.x2();
        }
        a(this.f10495h, 0, 0.0f, 0.0f);
        return true;
    }

    @l1
    boolean d() {
        if (!this.f10489b.j()) {
            return false;
        }
        this.f10489b.o();
        VelocityTracker velocityTracker = this.f10491d;
        velocityTracker.computeCurrentVelocity(1000, this.f10492e);
        if (this.f10490c.n0((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
            return true;
        }
        this.f10488a.I();
        return true;
    }

    @l1
    boolean e(float f6) {
        if (!this.f10489b.j()) {
            return false;
        }
        float f7 = this.f10493f - f6;
        this.f10493f = f7;
        int round = Math.round(f7 - this.f10494g);
        this.f10494g += round;
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean z5 = this.f10488a.l() == 0;
        int i5 = z5 ? round : 0;
        int i6 = z5 ? 0 : round;
        float f8 = z5 ? this.f10493f : 0.0f;
        float f9 = z5 ? 0.0f : this.f10493f;
        this.f10490c.scrollBy(i5, i6);
        a(uptimeMillis, 2, f8, f9);
        return true;
    }

    boolean f() {
        return this.f10489b.j();
    }
}
