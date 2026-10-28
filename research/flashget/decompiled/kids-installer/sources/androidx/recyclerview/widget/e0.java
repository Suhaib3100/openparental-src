package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SnapHelper.java */
/* loaded from: classes3.dex */
public abstract class e0 extends RecyclerView.q {

    /* renamed from: d, reason: collision with root package name */
    static final float f9215d = 100.0f;

    /* renamed from: a, reason: collision with root package name */
    RecyclerView f9216a;

    /* renamed from: b, reason: collision with root package name */
    private Scroller f9217b;

    /* renamed from: c, reason: collision with root package name */
    private final RecyclerView.s f9218c = new a();

    /* compiled from: SnapHelper.java */
    class a extends RecyclerView.s {

        /* renamed from: a, reason: collision with root package name */
        boolean f9219a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void a(RecyclerView recyclerView, int i5) {
            if (i5 == 0 && this.f9219a) {
                this.f9219a = false;
                e0.this.l();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void b(RecyclerView recyclerView, int i5, int i6) {
            if (i5 == 0 && i6 == 0) {
                return;
            }
            this.f9219a = true;
        }
    }

    /* compiled from: SnapHelper.java */
    class b extends s {
        b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.s, androidx.recyclerview.widget.RecyclerView.z
        protected void p(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
            e0 e0Var = e0.this;
            RecyclerView recyclerView = e0Var.f9216a;
            if (recyclerView == null) {
                return;
            }
            int[] c6 = e0Var.c(recyclerView.H0(), view);
            int i5 = c6[0];
            int i6 = c6[1];
            int x5 = x(Math.max(Math.abs(i5), Math.abs(i6)));
            if (x5 > 0) {
                aVar.l(i5, i6, x5, this.f9562j);
            }
        }

        @Override // androidx.recyclerview.widget.s
        protected float w(DisplayMetrics displayMetrics) {
            return e0.f9215d / displayMetrics.densityDpi;
        }
    }

    private void g() {
        this.f9216a.L1(this.f9218c);
        this.f9216a.h2(null);
    }

    private void j() throws IllegalStateException {
        if (this.f9216a.L0() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f9216a.s(this.f9218c);
        this.f9216a.h2(this);
    }

    private boolean k(@o0 RecyclerView.LayoutManager layoutManager, int i5, int i6) {
        RecyclerView.z e6;
        int i7;
        if (!(layoutManager instanceof RecyclerView.z.b) || (e6 = e(layoutManager)) == null || (i7 = i(layoutManager, i5, i6)) == -1) {
            return false;
        }
        e6.q(i7);
        layoutManager.g2(e6);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean a(int i5, int i6) {
        RecyclerView.LayoutManager H0 = this.f9216a.H0();
        if (H0 == null || this.f9216a.o0() == null) {
            return false;
        }
        int J0 = this.f9216a.J0();
        return (Math.abs(i6) > J0 || Math.abs(i5) > J0) && k(H0, i5, i6);
    }

    public void b(@q0 RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f9216a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            g();
        }
        this.f9216a = recyclerView;
        if (recyclerView != null) {
            j();
            this.f9217b = new Scroller(this.f9216a.getContext(), new DecelerateInterpolator());
            l();
        }
    }

    @q0
    public abstract int[] c(@o0 RecyclerView.LayoutManager layoutManager, @o0 View view);

    public int[] d(int i5, int i6) {
        this.f9217b.fling(0, 0, i5, i6, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.f9217b.getFinalX(), this.f9217b.getFinalY()};
    }

    @q0
    protected RecyclerView.z e(@o0 RecyclerView.LayoutManager layoutManager) {
        return f(layoutManager);
    }

    @q0
    @Deprecated
    protected s f(@o0 RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.z.b) {
            return new b(this.f9216a.getContext());
        }
        return null;
    }

    @q0
    public abstract View h(RecyclerView.LayoutManager layoutManager);

    public abstract int i(RecyclerView.LayoutManager layoutManager, int i5, int i6);

    void l() {
        RecyclerView.LayoutManager H0;
        View h5;
        RecyclerView recyclerView = this.f9216a;
        if (recyclerView == null || (H0 = recyclerView.H0()) == null || (h5 = h(H0)) == null) {
            return;
        }
        int[] c6 = c(H0, h5);
        int i5 = c6[0];
        if (i5 == 0 && c6[1] == 0) {
            return;
        }
        this.f9216a.q2(i5, c6[1]);
    }
}
