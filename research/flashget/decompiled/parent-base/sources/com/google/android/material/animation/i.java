package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: MotionTiming.java */
/* loaded from: classes6.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private long f52482a;

    /* renamed from: b, reason: collision with root package name */
    private long f52483b;

    /* renamed from: c, reason: collision with root package name */
    @q0
    private TimeInterpolator f52484c;

    /* renamed from: d, reason: collision with root package name */
    private int f52485d;

    /* renamed from: e, reason: collision with root package name */
    private int f52486e;

    public i(long j4, long j5) {
        this.f52484c = null;
        this.f52485d = 0;
        this.f52486e = 1;
        this.f52482a = j4;
        this.f52483b = j5;
    }

    @o0
    static i b(@o0 ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        iVar.f52485d = valueAnimator.getRepeatCount();
        iVar.f52486e = valueAnimator.getRepeatMode();
        return iVar;
    }

    private static TimeInterpolator f(@o0 ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? a.f52467b : interpolator instanceof AccelerateInterpolator ? a.f52468c : interpolator instanceof DecelerateInterpolator ? a.f52469d : interpolator;
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
        return this.f52482a;
    }

    public long d() {
        return this.f52483b;
    }

    @q0
    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f52484c;
        return timeInterpolator != null ? timeInterpolator : a.f52467b;
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
        return this.f52485d;
    }

    public int h() {
        return this.f52486e;
    }

    public int hashCode() {
        return h() + ((g() + ((e().getClass().hashCode() + (((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31)) * 31)) * 31);
    }

    @o0
    public String toString() {
        return ProtectedSandApp.s("\uf144") + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + ProtectedSandApp.s("\uf145") + c() + ProtectedSandApp.s("\uf146") + d() + ProtectedSandApp.s("\uf147") + e().getClass() + ProtectedSandApp.s("\uf148") + g() + ProtectedSandApp.s("\uf149") + h() + ProtectedSandApp.s("\uf14a");
    }

    public i(long j4, long j5, @o0 TimeInterpolator timeInterpolator) {
        this.f52485d = 0;
        this.f52486e = 1;
        this.f52482a = j4;
        this.f52483b = j5;
        this.f52484c = timeInterpolator;
    }
}
