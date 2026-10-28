package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.annotation.o0;
import androidx.core.view.accessibility.h0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: k, reason: collision with root package name */
    private static final boolean f32839k = false;

    /* renamed from: l, reason: collision with root package name */
    private static final String f32840l = "GridLayoutManager";

    /* renamed from: m, reason: collision with root package name */
    public static final int f32841m = -1;

    /* renamed from: b, reason: collision with root package name */
    boolean f32842b;

    /* renamed from: c, reason: collision with root package name */
    int f32843c;

    /* renamed from: d, reason: collision with root package name */
    int[] f32844d;

    /* renamed from: e, reason: collision with root package name */
    View[] f32845e;

    /* renamed from: f, reason: collision with root package name */
    final SparseIntArray f32846f;

    /* renamed from: g, reason: collision with root package name */
    final SparseIntArray f32847g;

    /* renamed from: h, reason: collision with root package name */
    b f32848h;

    /* renamed from: i, reason: collision with root package name */
    final Rect f32849i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f32850j;

    public static final class a extends b {
        @Override // androidx.recyclerview.widget.GridLayoutManager.b
        public int getSpanIndex(int i4, int i5) {
            return i4 % i5;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.b
        public int getSpanSize(int i4) {
            return 1;
        }
    }

    public static abstract class b {
        final SparseIntArray mSpanIndexCache = new SparseIntArray();
        final SparseIntArray mSpanGroupIndexCache = new SparseIntArray();
        private boolean mCacheSpanIndices = false;
        private boolean mCacheSpanGroupIndices = false;

        static int findFirstKeyLessThan(SparseIntArray sparseIntArray, int i4) {
            int size = sparseIntArray.size() - 1;
            int i5 = 0;
            while (i5 <= size) {
                int i6 = (i5 + size) >>> 1;
                if (sparseIntArray.keyAt(i6) < i4) {
                    i5 = i6 + 1;
                } else {
                    size = i6 - 1;
                }
            }
            int i7 = i5 - 1;
            if (i7 < 0 || i7 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i7);
        }

        int getCachedSpanGroupIndex(int i4, int i5) {
            if (!this.mCacheSpanGroupIndices) {
                return getSpanGroupIndex(i4, i5);
            }
            int i6 = this.mSpanGroupIndexCache.get(i4, -1);
            if (i6 != -1) {
                return i6;
            }
            int spanGroupIndex = getSpanGroupIndex(i4, i5);
            this.mSpanGroupIndexCache.put(i4, spanGroupIndex);
            return spanGroupIndex;
        }

        int getCachedSpanIndex(int i4, int i5) {
            if (!this.mCacheSpanIndices) {
                return getSpanIndex(i4, i5);
            }
            int i6 = this.mSpanIndexCache.get(i4, -1);
            if (i6 != -1) {
                return i6;
            }
            int spanIndex = getSpanIndex(i4, i5);
            this.mSpanIndexCache.put(i4, spanIndex);
            return spanIndex;
        }

        public int getSpanGroupIndex(int i4, int i5) {
            int i6;
            int i7;
            int i10;
            int findFirstKeyLessThan;
            if (!this.mCacheSpanGroupIndices || (findFirstKeyLessThan = findFirstKeyLessThan(this.mSpanGroupIndexCache, i4)) == -1) {
                i6 = 0;
                i7 = 0;
                i10 = 0;
            } else {
                i7 = this.mSpanGroupIndexCache.get(findFirstKeyLessThan);
                i10 = findFirstKeyLessThan + 1;
                i6 = getSpanSize(findFirstKeyLessThan) + getCachedSpanIndex(findFirstKeyLessThan, i5);
                if (i6 == i5) {
                    i7++;
                    i6 = 0;
                }
            }
            int spanSize = getSpanSize(i4);
            while (i10 < i4) {
                int spanSize2 = getSpanSize(i10);
                i6 += spanSize2;
                if (i6 == i5) {
                    i7++;
                    i6 = 0;
                } else if (i6 > i5) {
                    i7++;
                    i6 = spanSize2;
                }
                i10++;
            }
            return i6 + spanSize > i5 ? i7 + 1 : i7;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:10:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:10:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:10:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int getSpanIndex(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.getSpanSize(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.mCacheSpanIndices
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.mSpanIndexCache
                int r2 = findFirstKeyLessThan(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.mSpanIndexCache
                int r3 = r3.get(r2)
                int r4 = r5.getSpanSize(r2)
                int r4 = r4 + r3
                goto L30
            L20:
                r2 = r1
                r4 = r2
            L22:
                if (r2 >= r6) goto L33
                int r3 = r5.getSpanSize(r2)
                int r4 = r4 + r3
                if (r4 != r7) goto L2d
                r4 = r1
                goto L30
            L2d:
                if (r4 <= r7) goto L30
                r4 = r3
            L30:
                int r2 = r2 + 1
                goto L22
            L33:
                int r0 = r0 + r4
                if (r0 > r7) goto L37
                return r4
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.b.getSpanIndex(int, int):int");
        }

        public abstract int getSpanSize(int i4);

        public void invalidateSpanGroupIndexCache() {
            this.mSpanGroupIndexCache.clear();
        }

        public void invalidateSpanIndexCache() {
            this.mSpanIndexCache.clear();
        }

        public boolean isSpanGroupIndexCacheEnabled() {
            return this.mCacheSpanGroupIndices;
        }

        public boolean isSpanIndexCacheEnabled() {
            return this.mCacheSpanIndices;
        }

        public void setSpanGroupIndexCacheEnabled(boolean z4) {
            if (!z4) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanGroupIndices = z4;
        }

        public void setSpanIndexCacheEnabled(boolean z4) {
            if (!z4) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanIndices = z4;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f32842b = false;
        this.f32843c = -1;
        this.f32846f = new SparseIntArray();
        this.f32847g = new SparseIntArray();
        this.f32848h = new a();
        this.f32849i = new Rect();
        V(RecyclerView.LayoutManager.getProperties(context, attributeSet, i4, i5).f32887b);
    }

    private void C(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i4, boolean z4) {
        int i5;
        int i6;
        int i7;
        int i10 = 0;
        if (z4) {
            i7 = 1;
            i6 = i4;
            i5 = 0;
        } else {
            i5 = i4 - 1;
            i6 = -1;
            i7 = -1;
        }
        while (i5 != i6) {
            View view = this.f32845e[i5];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int P = P(vVar, a0Var, getPosition(view));
            layoutParams.f32853g = P;
            layoutParams.f32852f = i10;
            i10 += P;
            i5 += i7;
        }
    }

    private void D() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i4).getLayoutParams();
            int d5 = layoutParams.d();
            this.f32846f.put(d5, layoutParams.n());
            this.f32847g.put(d5, layoutParams.k());
        }
    }

    private void E(int i4) {
        this.f32844d = F(this.f32844d, this.f32843c, i4);
    }

    static int[] F(int[] iArr, int i4, int i5) {
        int i6;
        if (iArr == null || iArr.length != i4 + 1 || iArr[iArr.length - 1] != i5) {
            iArr = new int[i4 + 1];
        }
        int i7 = 0;
        iArr[0] = 0;
        int i10 = i5 / i4;
        int i11 = i5 % i4;
        int i12 = 0;
        for (int i13 = 1; i13 <= i4; i13++) {
            i7 += i11;
            if (i7 <= 0 || i4 - i7 >= i11) {
                i6 = i10;
            } else {
                i6 = i10 + 1;
                i7 -= i4;
            }
            i12 += i6;
            iArr[i13] = i12;
        }
        return iArr;
    }

    private void G() {
        this.f32846f.clear();
        this.f32847g.clear();
    }

    private int H(RecyclerView.a0 a0Var) {
        if (getChildCount() != 0 && a0Var.d() != 0) {
            ensureLayoutState();
            boolean isSmoothScrollbarEnabled = isSmoothScrollbarEnabled();
            View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled, true);
            View findFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled, true);
            if (findFirstVisibleChildClosestToStart != null && findFirstVisibleChildClosestToEnd != null) {
                int cachedSpanGroupIndex = this.f32848h.getCachedSpanGroupIndex(getPosition(findFirstVisibleChildClosestToStart), this.f32843c);
                int cachedSpanGroupIndex2 = this.f32848h.getCachedSpanGroupIndex(getPosition(findFirstVisibleChildClosestToEnd), this.f32843c);
                int max = this.mShouldReverseLayout ? Math.max(0, ((this.f32848h.getCachedSpanGroupIndex(a0Var.d() - 1, this.f32843c) + 1) - Math.max(cachedSpanGroupIndex, cachedSpanGroupIndex2)) - 1) : Math.max(0, Math.min(cachedSpanGroupIndex, cachedSpanGroupIndex2));
                if (isSmoothScrollbarEnabled) {
                    return Math.round((max * (Math.abs(this.mOrientationHelper.d(findFirstVisibleChildClosestToEnd) - this.mOrientationHelper.g(findFirstVisibleChildClosestToStart)) / ((this.f32848h.getCachedSpanGroupIndex(getPosition(findFirstVisibleChildClosestToEnd), this.f32843c) - this.f32848h.getCachedSpanGroupIndex(getPosition(findFirstVisibleChildClosestToStart), this.f32843c)) + 1))) + (this.mOrientationHelper.n() - this.mOrientationHelper.g(findFirstVisibleChildClosestToStart)));
                }
                return max;
            }
        }
        return 0;
    }

    private int I(RecyclerView.a0 a0Var) {
        if (getChildCount() != 0 && a0Var.d() != 0) {
            ensureLayoutState();
            View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled(), true);
            View findFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled(), true);
            if (findFirstVisibleChildClosestToStart != null && findFirstVisibleChildClosestToEnd != null) {
                if (!isSmoothScrollbarEnabled()) {
                    return this.f32848h.getCachedSpanGroupIndex(a0Var.d() - 1, this.f32843c) + 1;
                }
                int d5 = this.mOrientationHelper.d(findFirstVisibleChildClosestToEnd) - this.mOrientationHelper.g(findFirstVisibleChildClosestToStart);
                int cachedSpanGroupIndex = this.f32848h.getCachedSpanGroupIndex(getPosition(findFirstVisibleChildClosestToStart), this.f32843c);
                return (int) ((d5 / ((this.f32848h.getCachedSpanGroupIndex(getPosition(findFirstVisibleChildClosestToEnd), this.f32843c) - cachedSpanGroupIndex) + 1)) * (this.f32848h.getCachedSpanGroupIndex(a0Var.d() - 1, this.f32843c) + 1));
            }
        }
        return 0;
    }

    private void J(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i4) {
        boolean z4 = i4 == 1;
        int O = O(vVar, a0Var, aVar.f32858b);
        if (z4) {
            while (O > 0) {
                int i5 = aVar.f32858b;
                if (i5 <= 0) {
                    return;
                }
                int i6 = i5 - 1;
                aVar.f32858b = i6;
                O = O(vVar, a0Var, i6);
            }
            return;
        }
        int d5 = a0Var.d() - 1;
        int i7 = aVar.f32858b;
        while (i7 < d5) {
            int i10 = i7 + 1;
            int O2 = O(vVar, a0Var, i10);
            if (O2 <= O) {
                break;
            }
            i7 = i10;
            O = O2;
        }
        aVar.f32858b = i7;
    }

    private void K() {
        View[] viewArr = this.f32845e;
        if (viewArr == null || viewArr.length != this.f32843c) {
            this.f32845e = new View[this.f32843c];
        }
    }

    private int N(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i4) {
        if (!a0Var.j()) {
            return this.f32848h.getCachedSpanGroupIndex(i4, this.f32843c);
        }
        int g4 = vVar.g(i4);
        if (g4 == -1) {
            return 0;
        }
        return this.f32848h.getCachedSpanGroupIndex(g4, this.f32843c);
    }

    private int O(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i4) {
        if (!a0Var.j()) {
            return this.f32848h.getCachedSpanIndex(i4, this.f32843c);
        }
        int i5 = this.f32847g.get(i4, -1);
        if (i5 != -1) {
            return i5;
        }
        int g4 = vVar.g(i4);
        if (g4 == -1) {
            return 0;
        }
        return this.f32848h.getCachedSpanIndex(g4, this.f32843c);
    }

    private int P(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i4) {
        if (!a0Var.j()) {
            return this.f32848h.getSpanSize(i4);
        }
        int i5 = this.f32846f.get(i4, -1);
        if (i5 != -1) {
            return i5;
        }
        int g4 = vVar.g(i4);
        if (g4 == -1) {
            return 1;
        }
        return this.f32848h.getSpanSize(g4);
    }

    private void R(float f4, int i4) {
        E(Math.max(Math.round(f4 * this.f32843c), i4));
    }

    private void T(View view, int i4, boolean z4) {
        int i5;
        int i6;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.f32893c;
        int i7 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i10 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int L = L(layoutParams.f32852f, layoutParams.f32853g);
        if (this.mOrientation == 1) {
            i6 = RecyclerView.LayoutManager.getChildMeasureSpec(L, i4, i10, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
            i5 = RecyclerView.LayoutManager.getChildMeasureSpec(this.mOrientationHelper.o(), getHeightMode(), i7, ((ViewGroup.MarginLayoutParams) layoutParams).height, true);
        } else {
            int childMeasureSpec = RecyclerView.LayoutManager.getChildMeasureSpec(L, i4, i7, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
            int childMeasureSpec2 = RecyclerView.LayoutManager.getChildMeasureSpec(this.mOrientationHelper.o(), getWidthMode(), i10, ((ViewGroup.MarginLayoutParams) layoutParams).width, true);
            i5 = childMeasureSpec;
            i6 = childMeasureSpec2;
        }
        U(view, i6, i5, z4);
    }

    private void U(View view, int i4, int i5, boolean z4) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z4 ? shouldReMeasureChild(view, i4, i5, layoutParams) : shouldMeasureChild(view, i4, i5, layoutParams)) {
            view.measure(i4, i5);
        }
    }

    private void Y() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        E(height - paddingTop);
    }

    int L(int i4, int i5) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.f32844d;
            return iArr[i5 + i4] - iArr[i4];
        }
        int[] iArr2 = this.f32844d;
        int i6 = this.f32843c;
        return iArr2[i6 - i4] - iArr2[(i6 - i4) - i5];
    }

    public int M() {
        return this.f32843c;
    }

    public b Q() {
        return this.f32848h;
    }

    public boolean S() {
        return this.f32850j;
    }

    public void V(int i4) {
        if (i4 == this.f32843c) {
            return;
        }
        this.f32842b = true;
        if (i4 < 1) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Span count should be at least 1. Provided ", i4));
        }
        this.f32843c = i4;
        this.f32848h.invalidateSpanIndexCache();
        requestLayout();
    }

    public void W(b bVar) {
        this.f32848h = bVar;
    }

    public void X(boolean z4) {
        this.f32850j = z4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void collectPrefetchPositionsForLayoutState(RecyclerView.a0 a0Var, LinearLayoutManager.c cVar, RecyclerView.LayoutManager.c cVar2) {
        int i4 = this.f32843c;
        for (int i5 = 0; i5 < this.f32843c && cVar.c(a0Var) && i4 > 0; i5++) {
            int i6 = cVar.f32876d;
            cVar2.a(i6, Math.max(0, cVar.f32879g));
            i4 -= this.f32848h.getSpanSize(i6);
            cVar.f32876d += cVar.f32877e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.a0 a0Var) {
        return this.f32850j ? H(a0Var) : super.computeHorizontalScrollOffset(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.a0 a0Var) {
        return this.f32850j ? I(a0Var) : super.computeHorizontalScrollRange(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.a0 a0Var) {
        return this.f32850j ? H(a0Var) : super.computeVerticalScrollOffset(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.a0 a0Var) {
        return this.f32850j ? I(a0Var) : super.computeVerticalScrollRange(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View findReferenceChild(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z4, boolean z5) {
        int i4;
        int i5;
        int childCount = getChildCount();
        int i6 = 1;
        if (z5) {
            i5 = getChildCount() - 1;
            i4 = -1;
            i6 = -1;
        } else {
            i4 = childCount;
            i5 = 0;
        }
        int d5 = a0Var.d();
        ensureLayoutState();
        int n4 = this.mOrientationHelper.n();
        int i7 = this.mOrientationHelper.i();
        View view = null;
        View view2 = null;
        while (i5 != i4) {
            View childAt = getChildAt(i5);
            int position = getPosition(childAt);
            if (position >= 0 && position < d5 && O(vVar, a0Var, position) == 0) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).g()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.g(childAt) < i7 && this.mOrientationHelper.d(childAt) >= n4) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i5 += i6;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getColumnCountForAccessibility(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.mOrientation == 1) {
            return this.f32843c;
        }
        if (a0Var.d() < 1) {
            return 0;
        }
        return N(vVar, a0Var, a0Var.d() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getRowCountForAccessibility(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.mOrientation == 0) {
            return this.f32843c;
        }
        if (a0Var.d() < 1) {
            return 0;
        }
        return N(vVar, a0Var, a0Var.d() - 1) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        r21.f32863b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void layoutChunk(androidx.recyclerview.widget.RecyclerView.v r18, androidx.recyclerview.widget.RecyclerView.a0 r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.layoutChunk(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void onAnchorReady(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i4) {
        super.onAnchorReady(vVar, a0Var, aVar, i4);
        Y();
        if (a0Var.d() > 0 && !a0Var.j()) {
            J(vVar, a0Var, aVar, i4);
        }
        K();
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d1, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f1, code lost:
    
        if (r13 == (r2 > r7)) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010f  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.v r26, androidx.recyclerview.widget.RecyclerView.a0 r27) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfo(@o0 RecyclerView.v vVar, @o0 RecyclerView.a0 a0Var, @o0 androidx.core.view.accessibility.h0 h0Var) {
        super.onInitializeAccessibilityNodeInfo(vVar, a0Var, h0Var);
        h0Var.j1(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.v vVar, RecyclerView.a0 a0Var, View view, androidx.core.view.accessibility.h0 h0Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, h0Var);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int N = N(vVar, a0Var, layoutParams2.d());
        if (this.mOrientation == 0) {
            h0Var.m1(h0.g.j(layoutParams2.k(), layoutParams2.n(), N, 1, false, false));
        } else {
            h0Var.m1(h0.g.j(N, 1, layoutParams2.k(), layoutParams2.n(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i4, int i5) {
        this.f32848h.invalidateSpanIndexCache();
        this.f32848h.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f32848h.invalidateSpanIndexCache();
        this.f32848h.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i4, int i5, int i6) {
        this.f32848h.invalidateSpanIndexCache();
        this.f32848h.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i4, int i5) {
        this.f32848h.invalidateSpanIndexCache();
        this.f32848h.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i4, int i5, Object obj) {
        this.f32848h.invalidateSpanIndexCache();
        this.f32848h.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (a0Var.j()) {
            D();
        }
        super.onLayoutChildren(vVar, a0Var);
        G();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.a0 a0Var) {
        super.onLayoutCompleted(a0Var);
        this.f32842b = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i4, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        Y();
        K();
        return super.scrollHorizontallyBy(i4, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i4, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        Y();
        K();
        return super.scrollVerticallyBy(i4, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(Rect rect, int i4, int i5) {
        int chooseSize;
        int chooseSize2;
        if (this.f32844d == null) {
            super.setMeasuredDimension(rect, i4, i5);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            chooseSize2 = RecyclerView.LayoutManager.chooseSize(i5, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.f32844d;
            chooseSize = RecyclerView.LayoutManager.chooseSize(i4, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            chooseSize = RecyclerView.LayoutManager.chooseSize(i4, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.f32844d;
            chooseSize2 = RecyclerView.LayoutManager.chooseSize(i5, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z4) {
        if (z4) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f32842b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: h, reason: collision with root package name */
        public static final int f32851h = -1;

        /* renamed from: f, reason: collision with root package name */
        int f32852f;

        /* renamed from: g, reason: collision with root package name */
        int f32853g;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f32852f = -1;
            this.f32853g = 0;
        }

        public int k() {
            return this.f32852f;
        }

        public int n() {
            return this.f32853g;
        }

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
            this.f32852f = -1;
            this.f32853g = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f32852f = -1;
            this.f32853g = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f32852f = -1;
            this.f32853g = 0;
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
            this.f32852f = -1;
            this.f32853g = 0;
        }
    }

    public GridLayoutManager(Context context, int i4) {
        super(context);
        this.f32842b = false;
        this.f32843c = -1;
        this.f32846f = new SparseIntArray();
        this.f32847g = new SparseIntArray();
        this.f32848h = new a();
        this.f32849i = new Rect();
        V(i4);
    }

    public GridLayoutManager(Context context, int i4, int i5, boolean z4) {
        super(context, i5, z4);
        this.f32842b = false;
        this.f32843c = -1;
        this.f32846f = new SparseIntArray();
        this.f32847g = new SparseIntArray();
        this.f32848h = new a();
        this.f32849i = new Rect();
        V(i4);
    }
}
