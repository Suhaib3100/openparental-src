package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LayoutState.java */
/* loaded from: classes.dex */
class r {

    /* renamed from: j, reason: collision with root package name */
    static final int f9540j = -1;

    /* renamed from: k, reason: collision with root package name */
    static final int f9541k = 1;

    /* renamed from: l, reason: collision with root package name */
    static final int f9542l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    static final int f9543m = -1;

    /* renamed from: n, reason: collision with root package name */
    static final int f9544n = 1;

    /* renamed from: b, reason: collision with root package name */
    int f9546b;

    /* renamed from: c, reason: collision with root package name */
    int f9547c;

    /* renamed from: d, reason: collision with root package name */
    int f9548d;

    /* renamed from: e, reason: collision with root package name */
    int f9549e;

    /* renamed from: h, reason: collision with root package name */
    boolean f9552h;

    /* renamed from: i, reason: collision with root package name */
    boolean f9553i;

    /* renamed from: a, reason: collision with root package name */
    boolean f9545a = true;

    /* renamed from: f, reason: collision with root package name */
    int f9550f = 0;

    /* renamed from: g, reason: collision with root package name */
    int f9551g = 0;

    r() {
    }

    boolean a(RecyclerView.a0 a0Var) {
        int i5 = this.f9547c;
        return i5 >= 0 && i5 < a0Var.d();
    }

    View b(RecyclerView.v vVar) {
        View q5 = vVar.q(this.f9547c, false);
        this.f9547c += this.f9548d;
        return q5;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f9546b + ", mCurrentPosition=" + this.f9547c + ", mItemDirection=" + this.f9548d + ", mLayoutDirection=" + this.f9549e + ", mStartLine=" + this.f9550f + ", mEndLine=" + this.f9551g + '}';
    }
}
