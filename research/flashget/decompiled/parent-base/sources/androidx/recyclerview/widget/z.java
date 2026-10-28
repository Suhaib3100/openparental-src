package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper.java */
/* loaded from: classes3.dex */
public abstract class z {

    /* renamed from: d, reason: collision with root package name */
    private static final int f33481d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public static final int f33482e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f33483f = 1;

    /* renamed from: a, reason: collision with root package name */
    protected final RecyclerView.LayoutManager f33484a;

    /* renamed from: b, reason: collision with root package name */
    private int f33485b;

    /* renamed from: c, reason: collision with root package name */
    final Rect f33486c;

    /* compiled from: OrientationHelper.java */
    class a extends z {
        a(RecyclerView.LayoutManager layoutManager) {
            super(layoutManager, null);
        }

        @Override // androidx.recyclerview.widget.z
        public int d(View view) {
            return this.f33484a.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.z
        public int e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f33484a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.z
        public int f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f33484a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.z
        public int g(View view) {
            return this.f33484a.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.z
        public int h() {
            return this.f33484a.getWidth();
        }

        @Override // androidx.recyclerview.widget.z
        public int i() {
            return this.f33484a.getWidth() - this.f33484a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.z
        public int j() {
            return this.f33484a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.z
        public int l() {
            return this.f33484a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.z
        public int m() {
            return this.f33484a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.z
        public int n() {
            return this.f33484a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.z
        public int o() {
            return (this.f33484a.getWidth() - this.f33484a.getPaddingLeft()) - this.f33484a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.z
        public int q(View view) {
            this.f33484a.getTransformedBoundingBox(view, true, this.f33486c);
            return this.f33486c.right;
        }

        @Override // androidx.recyclerview.widget.z
        public int r(View view) {
            this.f33484a.getTransformedBoundingBox(view, true, this.f33486c);
            return this.f33486c.left;
        }

        @Override // androidx.recyclerview.widget.z
        public void s(View view, int i4) {
            view.offsetLeftAndRight(i4);
        }

        @Override // androidx.recyclerview.widget.z
        public void t(int i4) {
            this.f33484a.offsetChildrenHorizontal(i4);
        }
    }

    /* compiled from: OrientationHelper.java */
    class b extends z {
        b(RecyclerView.LayoutManager layoutManager) {
            super(layoutManager, null);
        }

        @Override // androidx.recyclerview.widget.z
        public int d(View view) {
            return this.f33484a.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.z
        public int e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f33484a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.z
        public int f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f33484a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.z
        public int g(View view) {
            return this.f33484a.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.z
        public int h() {
            return this.f33484a.getHeight();
        }

        @Override // androidx.recyclerview.widget.z
        public int i() {
            return this.f33484a.getHeight() - this.f33484a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.z
        public int j() {
            return this.f33484a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.z
        public int l() {
            return this.f33484a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.z
        public int m() {
            return this.f33484a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.z
        public int n() {
            return this.f33484a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.z
        public int o() {
            return (this.f33484a.getHeight() - this.f33484a.getPaddingTop()) - this.f33484a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.z
        public int q(View view) {
            this.f33484a.getTransformedBoundingBox(view, true, this.f33486c);
            return this.f33486c.bottom;
        }

        @Override // androidx.recyclerview.widget.z
        public int r(View view) {
            this.f33484a.getTransformedBoundingBox(view, true, this.f33486c);
            return this.f33486c.top;
        }

        @Override // androidx.recyclerview.widget.z
        public void s(View view, int i4) {
            view.offsetTopAndBottom(i4);
        }

        @Override // androidx.recyclerview.widget.z
        public void t(int i4) {
            this.f33484a.offsetChildrenVertical(i4);
        }
    }

    /* synthetic */ z(RecyclerView.LayoutManager layoutManager, a aVar) {
        this(layoutManager);
    }

    public static z a(RecyclerView.LayoutManager layoutManager) {
        return new a(layoutManager, null);
    }

    public static z b(RecyclerView.LayoutManager layoutManager, int i4) {
        if (i4 == 0) {
            return a(layoutManager);
        }
        if (i4 == 1) {
            return c(layoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static z c(RecyclerView.LayoutManager layoutManager) {
        return new b(layoutManager, null);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public RecyclerView.LayoutManager k() {
        return this.f33484a;
    }

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public int p() {
        if (Integer.MIN_VALUE == this.f33485b) {
            return 0;
        }
        return o() - this.f33485b;
    }

    public abstract int q(View view);

    public abstract int r(View view);

    public abstract void s(View view, int i4);

    public abstract void t(int i4);

    public void u() {
        this.f33485b = o();
    }

    private z(RecyclerView.LayoutManager layoutManager) {
        this.f33485b = Integer.MIN_VALUE;
        this.f33486c = new Rect();
        this.f33484a = layoutManager;
    }
}
