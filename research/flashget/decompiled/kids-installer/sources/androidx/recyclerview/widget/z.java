package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper.java */
/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: d, reason: collision with root package name */
    private static final int f9614d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public static final int f9615e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f9616f = 1;

    /* renamed from: a, reason: collision with root package name */
    protected final RecyclerView.LayoutManager f9617a;

    /* renamed from: b, reason: collision with root package name */
    private int f9618b;

    /* renamed from: c, reason: collision with root package name */
    final Rect f9619c;

    /* compiled from: OrientationHelper.java */
    /* loaded from: classes3.dex */
    class a extends z {
        a(RecyclerView.LayoutManager layoutManager) {
            super(layoutManager, null);
        }

        @Override // androidx.recyclerview.widget.z
        public int d(View view) {
            return this.f9617a.b0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.z
        public int e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f9617a.a0(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.z
        public int f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f9617a.Z(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.z
        public int g(View view) {
            return this.f9617a.Y(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.z
        public int h() {
            return this.f9617a.z0();
        }

        @Override // androidx.recyclerview.widget.z
        public int i() {
            return this.f9617a.z0() - this.f9617a.p0();
        }

        @Override // androidx.recyclerview.widget.z
        public int j() {
            return this.f9617a.p0();
        }

        @Override // androidx.recyclerview.widget.z
        public int l() {
            return this.f9617a.A0();
        }

        @Override // androidx.recyclerview.widget.z
        public int m() {
            return this.f9617a.f0();
        }

        @Override // androidx.recyclerview.widget.z
        public int n() {
            return this.f9617a.o0();
        }

        @Override // androidx.recyclerview.widget.z
        public int o() {
            return (this.f9617a.z0() - this.f9617a.o0()) - this.f9617a.p0();
        }

        @Override // androidx.recyclerview.widget.z
        public int q(View view) {
            this.f9617a.y0(view, true, this.f9619c);
            return this.f9619c.right;
        }

        @Override // androidx.recyclerview.widget.z
        public int r(View view) {
            this.f9617a.y0(view, true, this.f9619c);
            return this.f9619c.left;
        }

        @Override // androidx.recyclerview.widget.z
        public void s(View view, int i5) {
            view.offsetLeftAndRight(i5);
        }

        @Override // androidx.recyclerview.widget.z
        public void t(int i5) {
            this.f9617a.T0(i5);
        }
    }

    /* compiled from: OrientationHelper.java */
    /* loaded from: classes3.dex */
    class b extends z {
        b(RecyclerView.LayoutManager layoutManager) {
            super(layoutManager, null);
        }

        @Override // androidx.recyclerview.widget.z
        public int d(View view) {
            return this.f9617a.W(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.z
        public int e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f9617a.Z(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.z
        public int f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f9617a.a0(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.z
        public int g(View view) {
            return this.f9617a.c0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.z
        public int h() {
            return this.f9617a.e0();
        }

        @Override // androidx.recyclerview.widget.z
        public int i() {
            return this.f9617a.e0() - this.f9617a.m0();
        }

        @Override // androidx.recyclerview.widget.z
        public int j() {
            return this.f9617a.m0();
        }

        @Override // androidx.recyclerview.widget.z
        public int l() {
            return this.f9617a.f0();
        }

        @Override // androidx.recyclerview.widget.z
        public int m() {
            return this.f9617a.A0();
        }

        @Override // androidx.recyclerview.widget.z
        public int n() {
            return this.f9617a.r0();
        }

        @Override // androidx.recyclerview.widget.z
        public int o() {
            return (this.f9617a.e0() - this.f9617a.r0()) - this.f9617a.m0();
        }

        @Override // androidx.recyclerview.widget.z
        public int q(View view) {
            this.f9617a.y0(view, true, this.f9619c);
            return this.f9619c.bottom;
        }

        @Override // androidx.recyclerview.widget.z
        public int r(View view) {
            this.f9617a.y0(view, true, this.f9619c);
            return this.f9619c.top;
        }

        @Override // androidx.recyclerview.widget.z
        public void s(View view, int i5) {
            view.offsetTopAndBottom(i5);
        }

        @Override // androidx.recyclerview.widget.z
        public void t(int i5) {
            this.f9617a.U0(i5);
        }
    }

    /* synthetic */ z(RecyclerView.LayoutManager layoutManager, a aVar) {
        this(layoutManager);
    }

    public static z a(RecyclerView.LayoutManager layoutManager) {
        return new a(layoutManager);
    }

    public static z b(RecyclerView.LayoutManager layoutManager, int i5) {
        if (i5 == 0) {
            return new a(layoutManager);
        }
        if (i5 == 1) {
            return new b(layoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static z c(RecyclerView.LayoutManager layoutManager) {
        return new b(layoutManager);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public RecyclerView.LayoutManager k() {
        return this.f9617a;
    }

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public int p() {
        if (Integer.MIN_VALUE == this.f9618b) {
            return 0;
        }
        return o() - this.f9618b;
    }

    public abstract int q(View view);

    public abstract int r(View view);

    public abstract void s(View view, int i5);

    public abstract void t(int i5);

    public void u() {
        this.f9618b = o();
    }

    private z(RecyclerView.LayoutManager layoutManager) {
        this.f9618b = Integer.MIN_VALUE;
        this.f9619c = new Rect();
        this.f9617a = layoutManager;
    }
}
