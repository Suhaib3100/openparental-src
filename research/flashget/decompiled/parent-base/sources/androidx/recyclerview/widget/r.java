package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LayoutState.java */
/* loaded from: classes3.dex */
class r {

    /* renamed from: j, reason: collision with root package name */
    static final int f33423j = -1;

    /* renamed from: k, reason: collision with root package name */
    static final int f33424k = 1;

    /* renamed from: l, reason: collision with root package name */
    static final int f33425l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    static final int f33426m = -1;

    /* renamed from: n, reason: collision with root package name */
    static final int f33427n = 1;

    /* renamed from: b, reason: collision with root package name */
    int f33429b;

    /* renamed from: c, reason: collision with root package name */
    int f33430c;

    /* renamed from: d, reason: collision with root package name */
    int f33431d;

    /* renamed from: e, reason: collision with root package name */
    int f33432e;

    /* renamed from: h, reason: collision with root package name */
    boolean f33435h;

    /* renamed from: i, reason: collision with root package name */
    boolean f33436i;

    /* renamed from: a, reason: collision with root package name */
    boolean f33428a = true;

    /* renamed from: f, reason: collision with root package name */
    int f33433f = 0;

    /* renamed from: g, reason: collision with root package name */
    int f33434g = 0;

    r() {
    }

    boolean a(RecyclerView.a0 a0Var) {
        int i4 = this.f33430c;
        return i4 >= 0 && i4 < a0Var.d();
    }

    View b(RecyclerView.v vVar) {
        View q4 = vVar.q(this.f33430c, false);
        this.f33430c += this.f33431d;
        return q4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LayoutState{mAvailable=");
        sb.append(this.f33429b);
        sb.append(", mCurrentPosition=");
        sb.append(this.f33430c);
        sb.append(", mItemDirection=");
        sb.append(this.f33431d);
        sb.append(", mLayoutDirection=");
        sb.append(this.f33432e);
        sb.append(", mStartLine=");
        sb.append(this.f33433f);
        sb.append(", mEndLine=");
        return androidx.view.e.a(sb, this.f33434g, '}');
    }
}
