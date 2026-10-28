package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: MotionTiming.java */
/* loaded from: classes2.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private long f12794a;

    /* renamed from: b, reason: collision with root package name */
    private long f12795b;

    /* renamed from: c, reason: collision with root package name */
    @q0
    private TimeInterpolator f12796c;

    /* renamed from: d, reason: collision with root package name */
    private int f12797d;

    /* renamed from: e, reason: collision with root package name */
    private int f12798e;

    public i(long j5, long j6) {
        this.f12796c = null;
        this.f12797d = 0;
        this.f12798e = 1;
        this.f12794a = j5;
        this.f12795b = j6;
    }

    @o0
    static i b(@o0 ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        iVar.f12797d = valueAnimator.getRepeatCount();
        iVar.f12798e = valueAnimator.getRepeatMode();
        return iVar;
    }

    private static TimeInterpolator f(@o0 ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? a.f12779b : interpolator instanceof AccelerateInterpolator ? a.f12780c : interpolator instanceof DecelerateInterpolator ? a.f12781d : interpolator;
    }

    public void a(@o0 Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.f12794a;
    }

    public long d() {
        return this.f12795b;
    }

    @q0
    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f12796c;
        return timeInterpolator != null ? timeInterpolator : a.f12779b;
    }

    public boolean equals(@q0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (c() == iVar.c() && d() == iVar.d() && g() == iVar.g() && h() == iVar.h()) {
            return e().getClass().equals(iVar.e().getClass());
        }
        return false;
    }

    public int g() {
        return this.f12797d;
    }

    public int h() {
        return this.f12798e;
    }

    public int hashCode() {
        return h() + ((g() + ((e().getClass().hashCode() + (((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31)) * 31)) * 31);
    }

    @o0
    public String toString() {
        return ProtectedSandApp.s("ሁ") + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + ProtectedSandApp.s("ሂ") + c() + ProtectedSandApp.s("ሃ") + d() + ProtectedSandApp.s("ሄ") + e().getClass() + ProtectedSandApp.s("ህ") + g() + ProtectedSandApp.s("ሆ") + h() + ProtectedSandApp.s("ሇ");
    }

    public i(long j5, long j6, @o0 TimeInterpolator timeInterpolator) {
        this.f12797d = 0;
        this.f12798e = 1;
        this.f12794a = j5;
        this.f12795b = j6;
        this.f12796c = timeInterpolator;
    }
}
