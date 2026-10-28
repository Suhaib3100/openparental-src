package androidx.core.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* compiled from: ScrollerCompat.java */
@Deprecated
/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    OverScroller f27595a;

    p(Context context, Interpolator interpolator) {
        this.f27595a = interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    @Deprecated
    public static p c(Context context) {
        return new p(context, null);
    }

    @Deprecated
    public static p d(Context context, Interpolator interpolator) {
        return new p(context, interpolator);
    }

    @Deprecated
    public void a() {
        this.f27595a.abortAnimation();
    }

    @Deprecated
    public boolean b() {
        return this.f27595a.computeScrollOffset();
    }

    @Deprecated
    public void e(int i4, int i5, int i6, int i7, int i10, int i11, int i12, int i13) {
        this.f27595a.fling(i4, i5, i6, i7, i10, i11, i12, i13);
    }

    @Deprecated
    public void f(int i4, int i5, int i6, int i7, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f27595a.fling(i4, i5, i6, i7, i10, i11, i12, i13, i14, i15);
    }

    @Deprecated
    public float g() {
        return this.f27595a.getCurrVelocity();
    }

    @Deprecated
    public int h() {
        return this.f27595a.getCurrX();
    }

    @Deprecated
    public int i() {
        return this.f27595a.getCurrY();
    }

    @Deprecated
    public int j() {
        return this.f27595a.getFinalX();
    }

    @Deprecated
    public int k() {
        return this.f27595a.getFinalY();
    }

    @Deprecated
    public boolean l() {
        return this.f27595a.isFinished();
    }

    @Deprecated
    public boolean m() {
        return this.f27595a.isOverScrolled();
    }

    @Deprecated
    public void n(int i4, int i5, int i6) {
        this.f27595a.notifyHorizontalEdgeReached(i4, i5, i6);
    }

    @Deprecated
    public void o(int i4, int i5, int i6) {
        this.f27595a.notifyVerticalEdgeReached(i4, i5, i6);
    }

    @Deprecated
    public boolean p(int i4, int i5, int i6, int i7, int i10, int i11) {
        return this.f27595a.springBack(i4, i5, i6, i7, i10, i11);
    }

    @Deprecated
    public void q(int i4, int i5, int i6, int i7) {
        this.f27595a.startScroll(i4, i5, i6, i7);
    }

    @Deprecated
    public void r(int i4, int i5, int i6, int i7, int i10) {
        this.f27595a.startScroll(i4, i5, i6, i7, i10);
    }
}
