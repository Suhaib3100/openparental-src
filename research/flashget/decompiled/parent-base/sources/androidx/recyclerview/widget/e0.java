package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
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
    static final float f33113d = 100.0f;

    /* renamed from: a, reason: collision with root package name */
    RecyclerView f33114a;

    /* renamed from: b, reason: collision with root package name */
    private Scroller f33115b;

    /* renamed from: c, reason: collision with root package name */
    private final RecyclerView.s f33116c = new a();

    /* compiled from: SnapHelper.java */
    class a extends RecyclerView.s {

        /* renamed from: a, reason: collision with root package name */
        boolean f33117a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrollStateChanged(RecyclerView recyclerView, int i4) {
            super.onScrollStateChanged(recyclerView, i4);
            if (i4 == 0 && this.f33117a) {
                this.f33117a = false;
                e0.this.l();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrolled(RecyclerView recyclerView, int i4, int i5) {
            if (i4 == 0 && i5 == 0) {
                return;
            }
            this.f33117a = true;
        }
    }

    /* compiled from: SnapHelper.java */
    class b extends s {
        b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.s
        protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.s, androidx.recyclerview.widget.RecyclerView.z
        protected void onTargetFound(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
            e0 e0Var = e0.this;
            RecyclerView recyclerView = e0Var.f33114a;
            if (recyclerView == null) {
                return;
            }
            int[] c5 = e0Var.c(recyclerView.getLayoutManager(), view);
            int i4 = c5[0];
            int i5 = c5[1];
            int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i4), Math.abs(i5)));
            if (calculateTimeForDeceleration > 0) {
                aVar.l(i4, i5, calculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    private void g() {
        this.f33114a.removeOnScrollListener(this.f33116c);
        this.f33114a.setOnFlingListener(null);
    }

    private void j() throws IllegalStateException {
        if (this.f33114a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f33114a.addOnScrollListener(this.f33116c);
        this.f33114a.setOnFlingListener(this);
    }

    private boolean k(@o0 RecyclerView.LayoutManager layoutManager, int i4, int i5) {
        RecyclerView.z e4;
        int i6;
        if (!(layoutManager instanceof RecyclerView.z.b) || (e4 = e(layoutManager)) == null || (i6 = i(layoutManager, i4, i5)) == -1) {
            return false;
        }
        e4.setTargetPosition(i6);
        layoutManager.startSmoothScroll(e4);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean a(int i4, int i5) {
        RecyclerView.LayoutManager layoutManager = this.f33114a.getLayoutManager();
        if (layoutManager == null || this.f33114a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f33114a.getMinFlingVelocity();
        return (Math.abs(i5) > minFlingVelocity || Math.abs(i4) > minFlingVelocity) && k(layoutManager, i4, i5);
    }

    public void b(@q0 RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f33114a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            g();
        }
        this.f33114a = recyclerView;
        if (recyclerView != null) {
            j();
            this.f33115b = new Scroller(this.f33114a.getContext(), new DecelerateInterpolator());
            l();
        }
    }

    @q0
    public abstract int[] c(@o0 RecyclerView.LayoutManager layoutManager, @o0 View view);

    @SuppressLint({"UnknownNullness"})
    public int[] d(int i4, int i5) {
        this.f33115b.fling(0, 0, i4, i5, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.f33115b.getFinalX(), this.f33115b.getFinalY()};
    }

    @q0
    protected RecyclerView.z e(@o0 RecyclerView.LayoutManager layoutManager) {
        return f(layoutManager);
    }

    @q0
    @Deprecated
    protected s f(@o0 RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.z.b) {
            return new b(this.f33114a.getContext());
        }
        return null;
    }

    @q0
    @SuppressLint({"UnknownNullness"})
    public abstract View h(RecyclerView.LayoutManager layoutManager);

    @SuppressLint({"UnknownNullness"})
    public abstract int i(RecyclerView.LayoutManager layoutManager, int i4, int i5);

    void l() {
        RecyclerView.LayoutManager layoutManager;
        View h4;
        RecyclerView recyclerView = this.f33114a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (h4 = h(layoutManager)) == null) {
            return;
        }
        int[] c5 = c(layoutManager, h4);
        int i4 = c5[0];
        if (i4 == 0 && c5[1] == 0) {
            return;
        }
        this.f33114a.smoothScrollBy(i4, c5[1]);
    }
}
