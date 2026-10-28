package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LinearSmoothScroller.java */
/* loaded from: classes3.dex */
public class s extends RecyclerView.z {

    /* renamed from: q, reason: collision with root package name */
    private static final boolean f9554q = false;

    /* renamed from: r, reason: collision with root package name */
    private static final float f9555r = 25.0f;

    /* renamed from: s, reason: collision with root package name */
    private static final int f9556s = 10000;

    /* renamed from: t, reason: collision with root package name */
    public static final int f9557t = -1;

    /* renamed from: u, reason: collision with root package name */
    public static final int f9558u = 1;

    /* renamed from: v, reason: collision with root package name */
    public static final int f9559v = 0;

    /* renamed from: w, reason: collision with root package name */
    private static final float f9560w = 1.2f;

    /* renamed from: k, reason: collision with root package name */
    protected PointF f9563k;

    /* renamed from: l, reason: collision with root package name */
    private final DisplayMetrics f9564l;

    /* renamed from: n, reason: collision with root package name */
    private float f9566n;

    /* renamed from: i, reason: collision with root package name */
    protected final LinearInterpolator f9561i = new LinearInterpolator();

    /* renamed from: j, reason: collision with root package name */
    protected final DecelerateInterpolator f9562j = new DecelerateInterpolator();

    /* renamed from: m, reason: collision with root package name */
    private boolean f9565m = false;

    /* renamed from: o, reason: collision with root package name */
    protected int f9567o = 0;

    /* renamed from: p, reason: collision with root package name */
    protected int f9568p = 0;

    public s(Context context) {
        this.f9564l = context.getResources().getDisplayMetrics();
    }

    private float B() {
        if (!this.f9565m) {
            this.f9566n = w(this.f9564l);
            this.f9565m = true;
        }
        return this.f9566n;
    }

    private int z(int i5, int i6) {
        int i7 = i5 - i6;
        if (i5 * i7 <= 0) {
            return 0;
        }
        return i7;
    }

    protected int A() {
        PointF pointF = this.f9563k;
        if (pointF != null) {
            float f6 = pointF.x;
            if (f6 != 0.0f) {
                return f6 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    protected int C() {
        PointF pointF = this.f9563k;
        if (pointF != null) {
            float f6 = pointF.y;
            if (f6 != 0.0f) {
                return f6 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    protected void D(RecyclerView.z.a aVar) {
        PointF a6 = a(f());
        if (a6 == null || (a6.x == 0.0f && a6.y == 0.0f)) {
            aVar.f(f());
            s();
            return;
        }
        j(a6);
        this.f9563k = a6;
        this.f9567o = (int) (a6.x * 10000.0f);
        this.f9568p = (int) (a6.y * 10000.0f);
        aVar.l((int) (this.f9567o * f9560w), (int) (this.f9568p * f9560w), (int) (y(10000) * f9560w), this.f9561i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    protected void m(int i5, int i6, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
        if (c() == 0) {
            s();
            return;
        }
        this.f9567o = z(this.f9567o, i5);
        int z5 = z(this.f9568p, i6);
        this.f9568p = z5;
        if (this.f9567o == 0 && z5 == 0) {
            D(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    protected void n() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    protected void o() {
        this.f9568p = 0;
        this.f9567o = 0;
        this.f9563k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    protected void p(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
        int u5 = u(view, A());
        int v5 = v(view, C());
        int x5 = x((int) Math.sqrt((v5 * v5) + (u5 * u5)));
        if (x5 > 0) {
            aVar.l(-u5, -v5, x5, this.f9562j);
        }
    }

    public int t(int i5, int i6, int i7, int i8, int i9) {
        if (i9 == -1) {
            return i7 - i5;
        }
        if (i9 != 0) {
            if (i9 == 1) {
                return i8 - i6;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i10 = i7 - i5;
        if (i10 > 0) {
            return i10;
        }
        int i11 = i8 - i6;
        if (i11 < 0) {
            return i11;
        }
        return 0;
    }

    public int u(View view, int i5) {
        RecyclerView.LayoutManager e6 = e();
        if (e6 == null || !e6.n()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return t(e6.Y(view) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, e6.b0(view) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, e6.o0(), e6.z0() - e6.p0(), i5);
    }

    public int v(View view, int i5) {
        RecyclerView.LayoutManager e6 = e();
        if (e6 == null || !e6.o()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return t(e6.c0(view) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, e6.W(view) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, e6.r0(), e6.e0() - e6.m0(), i5);
    }

    protected float w(DisplayMetrics displayMetrics) {
        return f9555r / displayMetrics.densityDpi;
    }

    protected int x(int i5) {
        return (int) Math.ceil(y(i5) / 0.3356d);
    }

    protected int y(int i5) {
        return (int) Math.ceil(Math.abs(i5) * B());
    }
}
