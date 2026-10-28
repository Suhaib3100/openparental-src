package androidx.core.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* compiled from: ScrollerCompat.java */
@Deprecated
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    OverScroller f5903a;

    r(Context context, Interpolator interpolator) {
        this.f5903a = interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    @Deprecated
    public static r c(Context context) {
        return new r(context, null);
    }

    @Deprecated
    public static r d(Context context, Interpolator interpolator) {
        return new r(context, interpolator);
    }

    @Deprecated
    public void a() {
        this.f5903a.abortAnimation();
    }

    @Deprecated
    public boolean b() {
        return this.f5903a.computeScrollOffset();
    }

    @Deprecated
    public void e(int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.f5903a.fling(i5, i6, i7, i8, i9, i10, i11, i12);
    }

    @Deprecated
    public void f(int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        this.f5903a.fling(i5, i6, i7, i8, i9, i10, i11, i12, i13, i14);
    }

    @Deprecated
    public float g() {
        return this.f5903a.getCurrVelocity();
    }

    @Deprecated
    public int h() {
        return this.f5903a.getCurrX();
    }

    @Deprecated
    public int i() {
        return this.f5903a.getCurrY();
    }

    @Deprecated
    public int j() {
        return this.f5903a.getFinalX();
    }

    @Deprecated
    public int k() {
        return this.f5903a.getFinalY();
    }

    @Deprecated
    public boolean l() {
        return this.f5903a.isFinished();
    }

    @Deprecated
    public boolean m() {
        return this.f5903a.isOverScrolled();
    }

    @Deprecated
    public void n(int i5, int i6, int i7) {
        this.f5903a.notifyHorizontalEdgeReached(i5, i6, i7);
    }

    @Deprecated
    public void o(int i5, int i6, int i7) {
        this.f5903a.notifyVerticalEdgeReached(i5, i6, i7);
    }

    @Deprecated
    public boolean p(int i5, int i6, int i7, int i8, int i9, int i10) {
        return this.f5903a.springBack(i5, i6, i7, i8, i9, i10);
    }

    @Deprecated
    public void q(int i5, int i6, int i7, int i8) {
        this.f5903a.startScroll(i5, i6, i7, i8);
    }

    @Deprecated
    public void r(int i5, int i6, int i7, int i8, int i9) {
        this.f5903a.startScroll(i5, i6, i7, i8, i9);
    }
}
