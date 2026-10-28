package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import java.util.List;

/* loaded from: classes3.dex */
public class LinearLayoutManager extends RecyclerView.LayoutManager implements o.j, RecyclerView.z.b {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final a mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final b mLayoutChunkResult;
    private c mLayoutState;
    int mOrientation;
    z mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    @c1({c1.a.LIBRARY})
    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        int f32854b;

        /* renamed from: c, reason: collision with root package name */
        int f32855c;

        /* renamed from: d, reason: collision with root package name */
        boolean f32856d;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        public SavedState() {
        }

        boolean a() {
            return this.f32854b >= 0;
        }

        void b() {
            this.f32854b = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.f32854b);
            parcel.writeInt(this.f32855c);
            parcel.writeInt(this.f32856d ? 1 : 0);
        }

        SavedState(Parcel parcel) {
            this.f32854b = parcel.readInt();
            this.f32855c = parcel.readInt();
            this.f32856d = parcel.readInt() == 1;
        }

        @SuppressLint({"UnknownNullness"})
        public SavedState(SavedState savedState) {
            this.f32854b = savedState.f32854b;
            this.f32855c = savedState.f32855c;
            this.f32856d = savedState.f32856d;
        }
    }

    static class a {

        /* renamed from: a, reason: collision with root package name */
        z f32857a;

        /* renamed from: b, reason: collision with root package name */
        int f32858b;

        /* renamed from: c, reason: collision with root package name */
        int f32859c;

        /* renamed from: d, reason: collision with root package name */
        boolean f32860d;

        /* renamed from: e, reason: collision with root package name */
        boolean f32861e;

        a() {
            e();
        }

        void a() {
            this.f32859c = this.f32860d ? this.f32857a.i() : this.f32857a.n();
        }

        public void b(View view, int i4) {
            if (this.f32860d) {
                this.f32859c = this.f32857a.p() + this.f32857a.d(view);
            } else {
                this.f32859c = this.f32857a.g(view);
            }
            this.f32858b = i4;
        }

        public void c(View view, int i4) {
            int p4 = this.f32857a.p();
            if (p4 >= 0) {
                b(view, i4);
                return;
            }
            this.f32858b = i4;
            if (!this.f32860d) {
                int g4 = this.f32857a.g(view);
                int n4 = g4 - this.f32857a.n();
                this.f32859c = g4;
                if (n4 > 0) {
                    int i5 = (this.f32857a.i() - Math.min(0, (this.f32857a.i() - p4) - this.f32857a.d(view))) - (this.f32857a.e(view) + g4);
                    if (i5 < 0) {
                        this.f32859c -= Math.min(n4, -i5);
                        return;
                    }
                    return;
                }
                return;
            }
            int i6 = (this.f32857a.i() - p4) - this.f32857a.d(view);
            this.f32859c = this.f32857a.i() - i6;
            if (i6 > 0) {
                int e4 = this.f32859c - this.f32857a.e(view);
                int n5 = this.f32857a.n();
                int min = e4 - (Math.min(this.f32857a.g(view) - n5, 0) + n5);
                if (min < 0) {
                    this.f32859c = Math.min(i6, -min) + this.f32859c;
                }
            }
        }

        boolean d(View view, RecyclerView.a0 a0Var) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return !layoutParams.g() && layoutParams.d() >= 0 && layoutParams.d() < a0Var.d();
        }

        void e() {
            this.f32858b = -1;
            this.f32859c = Integer.MIN_VALUE;
            this.f32860d = false;
            this.f32861e = false;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
            sb.append(this.f32858b);
            sb.append(", mCoordinate=");
            sb.append(this.f32859c);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.f32860d);
            sb.append(", mValid=");
            return androidx.compose.animation.l.a(sb, this.f32861e, '}');
        }
    }

    protected static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f32862a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f32863b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f32864c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f32865d;

        protected b() {
        }

        void a() {
            this.f32862a = 0;
            this.f32863b = false;
            this.f32864c = false;
            this.f32865d = false;
        }
    }

    static class c {

        /* renamed from: n, reason: collision with root package name */
        static final String f32866n = "LLM#LayoutState";

        /* renamed from: o, reason: collision with root package name */
        static final int f32867o = -1;

        /* renamed from: p, reason: collision with root package name */
        static final int f32868p = 1;

        /* renamed from: q, reason: collision with root package name */
        static final int f32869q = Integer.MIN_VALUE;

        /* renamed from: r, reason: collision with root package name */
        static final int f32870r = -1;

        /* renamed from: s, reason: collision with root package name */
        static final int f32871s = 1;

        /* renamed from: t, reason: collision with root package name */
        static final int f32872t = Integer.MIN_VALUE;

        /* renamed from: b, reason: collision with root package name */
        int f32874b;

        /* renamed from: c, reason: collision with root package name */
        int f32875c;

        /* renamed from: d, reason: collision with root package name */
        int f32876d;

        /* renamed from: e, reason: collision with root package name */
        int f32877e;

        /* renamed from: f, reason: collision with root package name */
        int f32878f;

        /* renamed from: g, reason: collision with root package name */
        int f32879g;

        /* renamed from: k, reason: collision with root package name */
        int f32883k;

        /* renamed from: m, reason: collision with root package name */
        boolean f32885m;

        /* renamed from: a, reason: collision with root package name */
        boolean f32873a = true;

        /* renamed from: h, reason: collision with root package name */
        int f32880h = 0;

        /* renamed from: i, reason: collision with root package name */
        int f32881i = 0;

        /* renamed from: j, reason: collision with root package name */
        boolean f32882j = false;

        /* renamed from: l, reason: collision with root package name */
        List<RecyclerView.e0> f32884l = null;

        c() {
        }

        private View f() {
            int size = this.f32884l.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = this.f32884l.get(i4).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!layoutParams.g() && this.f32876d == layoutParams.d()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View g4 = g(view);
            if (g4 == null) {
                this.f32876d = -1;
            } else {
                this.f32876d = ((RecyclerView.LayoutParams) g4.getLayoutParams()).d();
            }
        }

        boolean c(RecyclerView.a0 a0Var) {
            int i4 = this.f32876d;
            return i4 >= 0 && i4 < a0Var.d();
        }

        void d() {
        }

        View e(RecyclerView.v vVar) {
            if (this.f32884l != null) {
                return f();
            }
            View q4 = vVar.q(this.f32876d, false);
            this.f32876d += this.f32877e;
            return q4;
        }

        public View g(View view) {
            int d5;
            int size = this.f32884l.size();
            View view2 = null;
            int i4 = Integer.MAX_VALUE;
            for (int i5 = 0; i5 < size; i5++) {
                View view3 = this.f32884l.get(i5).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.g() && (d5 = (layoutParams.d() - this.f32876d) * this.f32877e) >= 0 && d5 < i4) {
                    view2 = view3;
                    if (d5 == 0) {
                        break;
                    }
                    i4 = d5;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context) {
        this(context, 1, false);
    }

    private int computeScrollExtent(RecyclerView.a0 a0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return c0.a(a0Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.a0 a0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return c0.b(a0Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.a0 a0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return c0.c(a0Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private View findLastPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd() {
        return this.mShouldReverseLayout ? findFirstPartiallyOrCompletelyInvisibleChild() : findLastPartiallyOrCompletelyInvisibleChild();
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart() {
        return this.mShouldReverseLayout ? findLastPartiallyOrCompletelyInvisibleChild() : findFirstPartiallyOrCompletelyInvisibleChild();
    }

    private int fixLayoutEndGap(int i4, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z4) {
        int i5;
        int i6 = this.mOrientationHelper.i() - i4;
        if (i6 <= 0) {
            return 0;
        }
        int i7 = -scrollBy(-i6, vVar, a0Var);
        int i10 = i4 + i7;
        if (!z4 || (i5 = this.mOrientationHelper.i() - i10) <= 0) {
            return i7;
        }
        this.mOrientationHelper.t(i5);
        return i5 + i7;
    }

    private int fixLayoutStartGap(int i4, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z4) {
        int n4;
        int n5 = i4 - this.mOrientationHelper.n();
        if (n5 <= 0) {
            return 0;
        }
        int i5 = -scrollBy(n5, vVar, a0Var);
        int i6 = i4 + i5;
        if (!z4 || (n4 = i6 - this.mOrientationHelper.n()) <= 0) {
            return i5;
        }
        this.mOrientationHelper.t(-n4);
        return i5 - n4;
    }

    private View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private void layoutForPredictiveAnimations(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i4, int i5) {
        if (!a0Var.n() || getChildCount() == 0 || a0Var.j() || !supportsPredictiveItemAnimations()) {
            return;
        }
        List<RecyclerView.e0> l4 = vVar.l();
        int size = l4.size();
        int position = getPosition(getChildAt(0));
        int i6 = 0;
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView.e0 e0Var = l4.get(i10);
            if (!e0Var.isRemoved()) {
                if ((e0Var.getLayoutPosition() < position) != this.mShouldReverseLayout) {
                    i6 += this.mOrientationHelper.e(e0Var.itemView);
                } else {
                    i7 += this.mOrientationHelper.e(e0Var.itemView);
                }
            }
        }
        this.mLayoutState.f32884l = l4;
        if (i6 > 0) {
            updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i4);
            c cVar = this.mLayoutState;
            cVar.f32880h = i6;
            cVar.f32875c = 0;
            cVar.a();
            fill(vVar, this.mLayoutState, a0Var, false);
        }
        if (i7 > 0) {
            updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i5);
            c cVar2 = this.mLayoutState;
            cVar2.f32880h = i7;
            cVar2.f32875c = 0;
            cVar2.a();
            fill(vVar, this.mLayoutState, a0Var, false);
        }
        this.mLayoutState.f32884l = null;
    }

    private void logChildren() {
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            getPosition(childAt);
            this.mOrientationHelper.g(childAt);
        }
    }

    private void recycleByLayoutState(RecyclerView.v vVar, c cVar) {
        if (!cVar.f32873a || cVar.f32885m) {
            return;
        }
        int i4 = cVar.f32879g;
        int i5 = cVar.f32881i;
        if (cVar.f32878f == -1) {
            recycleViewsFromEnd(vVar, i4, i5);
        } else {
            recycleViewsFromStart(vVar, i4, i5);
        }
    }

    private void recycleChildren(RecyclerView.v vVar, int i4, int i5) {
        if (i4 == i5) {
            return;
        }
        if (i5 <= i4) {
            while (i4 > i5) {
                removeAndRecycleViewAt(i4, vVar);
                i4--;
            }
        } else {
            for (int i6 = i5 - 1; i6 >= i4; i6--) {
                removeAndRecycleViewAt(i6, vVar);
            }
        }
    }

    private void recycleViewsFromEnd(RecyclerView.v vVar, int i4, int i5) {
        int childCount = getChildCount();
        if (i4 < 0) {
            return;
        }
        int h4 = (this.mOrientationHelper.h() - i4) + i5;
        if (this.mShouldReverseLayout) {
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (this.mOrientationHelper.g(childAt) < h4 || this.mOrientationHelper.r(childAt) < h4) {
                    recycleChildren(vVar, 0, i6);
                    return;
                }
            }
            return;
        }
        int i7 = childCount - 1;
        for (int i10 = i7; i10 >= 0; i10--) {
            View childAt2 = getChildAt(i10);
            if (this.mOrientationHelper.g(childAt2) < h4 || this.mOrientationHelper.r(childAt2) < h4) {
                recycleChildren(vVar, i7, i10);
                return;
            }
        }
    }

    private void recycleViewsFromStart(RecyclerView.v vVar, int i4, int i5) {
        if (i4 < 0) {
            return;
        }
        int i6 = i4 - i5;
        int childCount = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                if (this.mOrientationHelper.d(childAt) > i6 || this.mOrientationHelper.q(childAt) > i6) {
                    recycleChildren(vVar, 0, i7);
                    return;
                }
            }
            return;
        }
        int i10 = childCount - 1;
        for (int i11 = i10; i11 >= 0; i11--) {
            View childAt2 = getChildAt(i11);
            if (this.mOrientationHelper.d(childAt2) > i6 || this.mOrientationHelper.q(childAt2) > i6) {
                recycleChildren(vVar, i10, i11);
                return;
            }
        }
    }

    private void resolveShouldLayoutReverse() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    private boolean updateAnchorFromChildren(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar) {
        View findReferenceChild;
        boolean z4 = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null && aVar.d(focusedChild, a0Var)) {
            aVar.c(focusedChild, getPosition(focusedChild));
            return true;
        }
        boolean z5 = this.mLastStackFromEnd;
        boolean z6 = this.mStackFromEnd;
        if (z5 != z6 || (findReferenceChild = findReferenceChild(vVar, a0Var, aVar.f32860d, z6)) == null) {
            return false;
        }
        aVar.b(findReferenceChild, getPosition(findReferenceChild));
        if (!a0Var.j() && supportsPredictiveItemAnimations()) {
            int g4 = this.mOrientationHelper.g(findReferenceChild);
            int d5 = this.mOrientationHelper.d(findReferenceChild);
            int n4 = this.mOrientationHelper.n();
            int i4 = this.mOrientationHelper.i();
            boolean z7 = d5 <= n4 && g4 < n4;
            if (g4 >= i4 && d5 > i4) {
                z4 = true;
            }
            if (z7 || z4) {
                if (aVar.f32860d) {
                    n4 = i4;
                }
                aVar.f32859c = n4;
            }
        }
        return true;
    }

    private boolean updateAnchorFromPendingData(RecyclerView.a0 a0Var, a aVar) {
        int i4;
        if (!a0Var.j() && (i4 = this.mPendingScrollPosition) != -1) {
            if (i4 >= 0 && i4 < a0Var.d()) {
                aVar.f32858b = this.mPendingScrollPosition;
                SavedState savedState = this.mPendingSavedState;
                if (savedState != null && savedState.a()) {
                    boolean z4 = this.mPendingSavedState.f32856d;
                    aVar.f32860d = z4;
                    if (z4) {
                        aVar.f32859c = this.mOrientationHelper.i() - this.mPendingSavedState.f32855c;
                    } else {
                        aVar.f32859c = this.mOrientationHelper.n() + this.mPendingSavedState.f32855c;
                    }
                    return true;
                }
                if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                    boolean z5 = this.mShouldReverseLayout;
                    aVar.f32860d = z5;
                    if (z5) {
                        aVar.f32859c = this.mOrientationHelper.i() - this.mPendingScrollPositionOffset;
                    } else {
                        aVar.f32859c = this.mOrientationHelper.n() + this.mPendingScrollPositionOffset;
                    }
                    return true;
                }
                View findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                if (findViewByPosition == null) {
                    if (getChildCount() > 0) {
                        aVar.f32860d = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                    }
                    aVar.a();
                } else {
                    if (this.mOrientationHelper.e(findViewByPosition) > this.mOrientationHelper.o()) {
                        aVar.a();
                        return true;
                    }
                    if (this.mOrientationHelper.g(findViewByPosition) - this.mOrientationHelper.n() < 0) {
                        aVar.f32859c = this.mOrientationHelper.n();
                        aVar.f32860d = false;
                        return true;
                    }
                    if (this.mOrientationHelper.i() - this.mOrientationHelper.d(findViewByPosition) < 0) {
                        aVar.f32859c = this.mOrientationHelper.i();
                        aVar.f32860d = true;
                        return true;
                    }
                    aVar.f32859c = aVar.f32860d ? this.mOrientationHelper.p() + this.mOrientationHelper.d(findViewByPosition) : this.mOrientationHelper.g(findViewByPosition);
                }
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    private void updateAnchorInfoForLayout(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar) {
        if (updateAnchorFromPendingData(a0Var, aVar) || updateAnchorFromChildren(vVar, a0Var, aVar)) {
            return;
        }
        aVar.a();
        aVar.f32858b = this.mStackFromEnd ? a0Var.d() - 1 : 0;
    }

    private void updateLayoutState(int i4, int i5, boolean z4, RecyclerView.a0 a0Var) {
        int n4;
        this.mLayoutState.f32885m = resolveIsInfinite();
        this.mLayoutState.f32878f = i4;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(a0Var, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]);
        int max2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z5 = i4 == 1;
        c cVar = this.mLayoutState;
        int i6 = z5 ? max2 : max;
        cVar.f32880h = i6;
        if (!z5) {
            max = max2;
        }
        cVar.f32881i = max;
        if (z5) {
            cVar.f32880h = this.mOrientationHelper.j() + i6;
            View childClosestToEnd = getChildClosestToEnd();
            c cVar2 = this.mLayoutState;
            cVar2.f32877e = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(childClosestToEnd);
            c cVar3 = this.mLayoutState;
            cVar2.f32876d = position + cVar3.f32877e;
            cVar3.f32874b = this.mOrientationHelper.d(childClosestToEnd);
            n4 = this.mOrientationHelper.d(childClosestToEnd) - this.mOrientationHelper.i();
        } else {
            View childClosestToStart = getChildClosestToStart();
            c cVar4 = this.mLayoutState;
            cVar4.f32880h = this.mOrientationHelper.n() + cVar4.f32880h;
            c cVar5 = this.mLayoutState;
            cVar5.f32877e = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(childClosestToStart);
            c cVar6 = this.mLayoutState;
            cVar5.f32876d = position2 + cVar6.f32877e;
            cVar6.f32874b = this.mOrientationHelper.g(childClosestToStart);
            n4 = (-this.mOrientationHelper.g(childClosestToStart)) + this.mOrientationHelper.n();
        }
        c cVar7 = this.mLayoutState;
        cVar7.f32875c = i5;
        if (z4) {
            cVar7.f32875c = i5 - n4;
        }
        cVar7.f32879g = n4;
    }

    private void updateLayoutStateToFillEnd(a aVar) {
        updateLayoutStateToFillEnd(aVar.f32858b, aVar.f32859c);
    }

    private void updateLayoutStateToFillStart(a aVar) {
        updateLayoutStateToFillStart(aVar.f32858b, aVar.f32859c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    protected void calculateExtraLayoutSpace(@o0 RecyclerView.a0 a0Var, @o0 int[] iArr) {
        int i4;
        int extraLayoutSpace = getExtraLayoutSpace(a0Var);
        if (this.mLayoutState.f32878f == -1) {
            i4 = 0;
        } else {
            i4 = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void collectAdjacentPrefetchPositions(int i4, int i5, RecyclerView.a0 a0Var, RecyclerView.LayoutManager.c cVar) {
        if (this.mOrientation != 0) {
            i4 = i5;
        }
        if (getChildCount() == 0 || i4 == 0) {
            return;
        }
        ensureLayoutState();
        updateLayoutState(i4 > 0 ? 1 : -1, Math.abs(i4), true, a0Var);
        collectPrefetchPositionsForLayoutState(a0Var, this.mLayoutState, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void collectInitialPrefetchPositions(int i4, RecyclerView.LayoutManager.c cVar) {
        boolean z4;
        int i5;
        SavedState savedState = this.mPendingSavedState;
        if (savedState == null || !savedState.a()) {
            resolveShouldLayoutReverse();
            z4 = this.mShouldReverseLayout;
            i5 = this.mPendingScrollPosition;
            if (i5 == -1) {
                i5 = z4 ? i4 - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.mPendingSavedState;
            z4 = savedState2.f32856d;
            i5 = savedState2.f32854b;
        }
        int i6 = z4 ? -1 : 1;
        for (int i7 = 0; i7 < this.mInitialPrefetchItemCount && i5 >= 0 && i5 < i4; i7++) {
            cVar.a(i5, 0);
            i5 += i6;
        }
    }

    void collectPrefetchPositionsForLayoutState(RecyclerView.a0 a0Var, c cVar, RecyclerView.LayoutManager.c cVar2) {
        int i4 = cVar.f32876d;
        if (i4 < 0 || i4 >= a0Var.d()) {
            return;
        }
        cVar2.a(i4, Math.max(0, cVar.f32879g));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollExtent(RecyclerView.a0 a0Var) {
        return computeScrollExtent(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollOffset(RecyclerView.a0 a0Var) {
        return computeScrollOffset(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollRange(RecyclerView.a0 a0Var) {
        return computeScrollRange(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    @SuppressLint({"UnknownNullness"})
    public PointF computeScrollVectorForPosition(int i4) {
        if (getChildCount() == 0) {
            return null;
        }
        int i5 = (i4 < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i5, 0.0f) : new PointF(0.0f, i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollExtent(RecyclerView.a0 a0Var) {
        return computeScrollExtent(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollOffset(RecyclerView.a0 a0Var) {
        return computeScrollOffset(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollRange(RecyclerView.a0 a0Var) {
        return computeScrollRange(a0Var);
    }

    int convertFocusDirectionToLayoutDirection(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 17 ? i4 != 33 ? i4 != 66 ? (i4 == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE : this.mOrientation == 0 ? 1 : Integer.MIN_VALUE : this.mOrientation == 1 ? -1 : Integer.MIN_VALUE : this.mOrientation == 0 ? -1 : Integer.MIN_VALUE : (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1 : (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
    }

    c createLayoutState() {
        return new c();
    }

    void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    int fill(RecyclerView.v vVar, c cVar, RecyclerView.a0 a0Var, boolean z4) {
        int i4 = cVar.f32875c;
        int i5 = cVar.f32879g;
        if (i5 != Integer.MIN_VALUE) {
            if (i4 < 0) {
                cVar.f32879g = i5 + i4;
            }
            recycleByLayoutState(vVar, cVar);
        }
        int i6 = cVar.f32875c + cVar.f32880h;
        b bVar = this.mLayoutChunkResult;
        while (true) {
            if ((!cVar.f32885m && i6 <= 0) || !cVar.c(a0Var)) {
                break;
            }
            bVar.a();
            layoutChunk(vVar, a0Var, cVar, bVar);
            if (!bVar.f32863b) {
                cVar.f32874b = (bVar.f32862a * cVar.f32878f) + cVar.f32874b;
                if (!bVar.f32864c || cVar.f32884l != null || !a0Var.j()) {
                    int i7 = cVar.f32875c;
                    int i10 = bVar.f32862a;
                    cVar.f32875c = i7 - i10;
                    i6 -= i10;
                }
                int i11 = cVar.f32879g;
                if (i11 != Integer.MIN_VALUE) {
                    int i12 = i11 + bVar.f32862a;
                    cVar.f32879g = i12;
                    int i13 = cVar.f32875c;
                    if (i13 < 0) {
                        cVar.f32879g = i12 + i13;
                    }
                    recycleByLayoutState(vVar, cVar);
                }
                if (z4 && bVar.f32865d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i4 - cVar.f32875c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    View findFirstVisibleChildClosestToEnd(boolean z4, boolean z5) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z4, z5) : findOneVisibleChild(getChildCount() - 1, -1, z4, z5);
    }

    View findFirstVisibleChildClosestToStart(boolean z4, boolean z5) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z4, z5) : findOneVisibleChild(0, getChildCount(), z4, z5);
    }

    public int findFirstVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    View findOnePartiallyOrCompletelyInvisibleChild(int i4, int i5) {
        int i6;
        int i7;
        ensureLayoutState();
        if (i5 <= i4 && i5 >= i4) {
            return getChildAt(i4);
        }
        if (this.mOrientationHelper.g(getChildAt(i4)) < this.mOrientationHelper.n()) {
            i6 = 16644;
            i7 = 16388;
        } else {
            i6 = 4161;
            i7 = androidx.fragment.app.l0.I;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i4, i5, i6, i7) : this.mVerticalBoundCheck.a(i4, i5, i6, i7);
    }

    View findOneVisibleChild(int i4, int i5, boolean z4, boolean z5) {
        ensureLayoutState();
        int i6 = z4 ? 24579 : 320;
        int i7 = z5 ? 320 : 0;
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i4, i5, i6, i7) : this.mVerticalBoundCheck.a(i4, i5, i6, i7);
    }

    View findReferenceChild(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z4, boolean z5) {
        int i4;
        int i5;
        int i6;
        ensureLayoutState();
        int childCount = getChildCount();
        if (z5) {
            i5 = getChildCount() - 1;
            i4 = -1;
            i6 = -1;
        } else {
            i4 = childCount;
            i5 = 0;
            i6 = 1;
        }
        int d5 = a0Var.d();
        int n4 = this.mOrientationHelper.n();
        int i7 = this.mOrientationHelper.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i5 != i4) {
            View childAt = getChildAt(i5);
            int position = getPosition(childAt);
            int g4 = this.mOrientationHelper.g(childAt);
            int d6 = this.mOrientationHelper.d(childAt);
            if (position >= 0 && position < d5) {
                if (!((RecyclerView.LayoutParams) childAt.getLayoutParams()).g()) {
                    boolean z6 = d6 <= n4 && g4 < n4;
                    boolean z7 = g4 >= i7 && d6 > i7;
                    if (!z6 && !z7) {
                        return childAt;
                    }
                    if (z4) {
                        if (!z7) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                        view2 = childAt;
                    } else {
                        if (!z6) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                        view2 = childAt;
                    }
                } else if (view3 == null) {
                    view3 = childAt;
                }
            }
            i5 += i6;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public View findViewByPosition(int i4) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i4 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i4) {
                return childAt;
            }
        }
        return super.findViewByPosition(i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Deprecated
    protected int getExtraLayoutSpace(RecyclerView.a0 a0Var) {
        if (a0Var.h()) {
            return this.mOrientationHelper.o();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    protected boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    void layoutChunk(RecyclerView.v vVar, RecyclerView.a0 a0Var, c cVar, b bVar) {
        int i4;
        int i5;
        int i6;
        int i7;
        int f4;
        View e4 = cVar.e(vVar);
        if (e4 == null) {
            bVar.f32863b = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) e4.getLayoutParams();
        if (cVar.f32884l == null) {
            if (this.mShouldReverseLayout == (cVar.f32878f == -1)) {
                addView(e4);
            } else {
                addView(e4, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (cVar.f32878f == -1)) {
                addDisappearingView(e4);
            } else {
                addDisappearingView(e4, 0);
            }
        }
        measureChildWithMargins(e4, 0, 0);
        bVar.f32862a = this.mOrientationHelper.e(e4);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                f4 = getWidth() - getPaddingRight();
                i7 = f4 - this.mOrientationHelper.f(e4);
            } else {
                i7 = getPaddingLeft();
                f4 = this.mOrientationHelper.f(e4) + i7;
            }
            if (cVar.f32878f == -1) {
                int i10 = cVar.f32874b;
                i6 = i10;
                i5 = f4;
                i4 = i10 - bVar.f32862a;
            } else {
                int i11 = cVar.f32874b;
                i4 = i11;
                i5 = f4;
                i6 = bVar.f32862a + i11;
            }
        } else {
            int paddingTop = getPaddingTop();
            int f5 = this.mOrientationHelper.f(e4) + paddingTop;
            if (cVar.f32878f == -1) {
                int i12 = cVar.f32874b;
                i5 = i12;
                i4 = paddingTop;
                i6 = f5;
                i7 = i12 - bVar.f32862a;
            } else {
                int i13 = cVar.f32874b;
                i4 = paddingTop;
                i5 = bVar.f32862a + i13;
                i6 = f5;
                i7 = i13;
            }
        }
        layoutDecoratedWithMargins(e4, i7, i4, i5, i6);
        if (layoutParams.g() || layoutParams.f()) {
            bVar.f32864c = true;
        }
        bVar.f32865d = e4.hasFocusable();
    }

    void onAnchorReady(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar, int i4) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.onDetachedFromWindow(recyclerView, vVar);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(vVar);
            vVar.d();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public View onFocusSearchFailed(View view, int i4, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int convertFocusDirectionToLayoutDirection;
        resolveShouldLayoutReverse();
        if (getChildCount() == 0 || (convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i4)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        updateLayoutState(convertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.o() * MAX_SCROLL_FACTOR), false, a0Var);
        c cVar = this.mLayoutState;
        cVar.f32879g = Integer.MIN_VALUE;
        cVar.f32873a = false;
        fill(vVar, cVar, a0Var, true);
        View findPartiallyOrCompletelyInvisibleChildClosestToStart = convertFocusDirectionToLayoutDirection == -1 ? findPartiallyOrCompletelyInvisibleChildClosestToStart() : findPartiallyOrCompletelyInvisibleChildClosestToEnd();
        View childClosestToStart = convertFocusDirectionToLayoutDirection == -1 ? getChildClosestToStart() : getChildClosestToEnd();
        if (!childClosestToStart.hasFocusable()) {
            return findPartiallyOrCompletelyInvisibleChildClosestToStart;
        }
        if (findPartiallyOrCompletelyInvisibleChildClosestToStart == null) {
            return null;
        }
        return childClosestToStart;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onLayoutChildren(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int i4;
        int i5;
        int i6;
        int i7;
        int fixLayoutEndGap;
        int i10;
        View findViewByPosition;
        int g4;
        int i11;
        int i12 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && a0Var.d() == 0) {
            removeAndRecycleAllViews(vVar);
            return;
        }
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.a()) {
            this.mPendingScrollPosition = this.mPendingSavedState.f32854b;
        }
        ensureLayoutState();
        this.mLayoutState.f32873a = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        a aVar = this.mAnchorInfo;
        if (!aVar.f32861e || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            aVar.e();
            a aVar2 = this.mAnchorInfo;
            aVar2.f32860d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(vVar, a0Var, aVar2);
            this.mAnchorInfo.f32861e = true;
        } else if (focusedChild != null && (this.mOrientationHelper.g(focusedChild) >= this.mOrientationHelper.i() || this.mOrientationHelper.d(focusedChild) <= this.mOrientationHelper.n())) {
            this.mAnchorInfo.c(focusedChild, getPosition(focusedChild));
        }
        c cVar = this.mLayoutState;
        cVar.f32878f = cVar.f32883k >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(a0Var, iArr);
        int n4 = this.mOrientationHelper.n() + Math.max(0, this.mReusableIntPair[0]);
        int j4 = this.mOrientationHelper.j() + Math.max(0, this.mReusableIntPair[1]);
        if (a0Var.j() && (i10 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (findViewByPosition = findViewByPosition(i10)) != null) {
            if (this.mShouldReverseLayout) {
                i11 = this.mOrientationHelper.i() - this.mOrientationHelper.d(findViewByPosition);
                g4 = this.mPendingScrollPositionOffset;
            } else {
                g4 = this.mOrientationHelper.g(findViewByPosition) - this.mOrientationHelper.n();
                i11 = this.mPendingScrollPositionOffset;
            }
            int i13 = i11 - g4;
            if (i13 > 0) {
                n4 += i13;
            } else {
                j4 -= i13;
            }
        }
        a aVar3 = this.mAnchorInfo;
        if (!aVar3.f32860d ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i12 = 1;
        }
        onAnchorReady(vVar, a0Var, aVar3, i12);
        detachAndScrapAttachedViews(vVar);
        this.mLayoutState.f32885m = resolveIsInfinite();
        this.mLayoutState.f32882j = a0Var.j();
        this.mLayoutState.f32881i = 0;
        a aVar4 = this.mAnchorInfo;
        if (aVar4.f32860d) {
            updateLayoutStateToFillStart(aVar4);
            c cVar2 = this.mLayoutState;
            cVar2.f32880h = n4;
            fill(vVar, cVar2, a0Var, false);
            c cVar3 = this.mLayoutState;
            i5 = cVar3.f32874b;
            int i14 = cVar3.f32876d;
            int i15 = cVar3.f32875c;
            if (i15 > 0) {
                j4 += i15;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            c cVar4 = this.mLayoutState;
            cVar4.f32880h = j4;
            cVar4.f32876d += cVar4.f32877e;
            fill(vVar, cVar4, a0Var, false);
            c cVar5 = this.mLayoutState;
            i4 = cVar5.f32874b;
            int i16 = cVar5.f32875c;
            if (i16 > 0) {
                updateLayoutStateToFillStart(i14, i5);
                c cVar6 = this.mLayoutState;
                cVar6.f32880h = i16;
                fill(vVar, cVar6, a0Var, false);
                i5 = this.mLayoutState.f32874b;
            }
        } else {
            updateLayoutStateToFillEnd(aVar4);
            c cVar7 = this.mLayoutState;
            cVar7.f32880h = j4;
            fill(vVar, cVar7, a0Var, false);
            c cVar8 = this.mLayoutState;
            i4 = cVar8.f32874b;
            int i17 = cVar8.f32876d;
            int i18 = cVar8.f32875c;
            if (i18 > 0) {
                n4 += i18;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            c cVar9 = this.mLayoutState;
            cVar9.f32880h = n4;
            cVar9.f32876d += cVar9.f32877e;
            fill(vVar, cVar9, a0Var, false);
            c cVar10 = this.mLayoutState;
            int i19 = cVar10.f32874b;
            int i20 = cVar10.f32875c;
            if (i20 > 0) {
                updateLayoutStateToFillEnd(i17, i4);
                c cVar11 = this.mLayoutState;
                cVar11.f32880h = i20;
                fill(vVar, cVar11, a0Var, false);
                i4 = this.mLayoutState.f32874b;
            }
            i5 = i19;
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int fixLayoutEndGap2 = fixLayoutEndGap(i4, vVar, a0Var, true);
                i6 = i5 + fixLayoutEndGap2;
                i7 = i4 + fixLayoutEndGap2;
                fixLayoutEndGap = fixLayoutStartGap(i6, vVar, a0Var, false);
            } else {
                int fixLayoutStartGap = fixLayoutStartGap(i5, vVar, a0Var, true);
                i6 = i5 + fixLayoutStartGap;
                i7 = i4 + fixLayoutStartGap;
                fixLayoutEndGap = fixLayoutEndGap(i7, vVar, a0Var, false);
            }
            i5 = i6 + fixLayoutEndGap;
            i4 = i7 + fixLayoutEndGap;
        }
        layoutForPredictiveAnimations(vVar, a0Var, i5, i4);
        if (a0Var.j()) {
            this.mAnchorInfo.e();
        } else {
            this.mOrientationHelper.u();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onLayoutCompleted(RecyclerView.a0 a0Var) {
        super.onLayoutCompleted(a0Var);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.mPendingSavedState = savedState;
            if (this.mPendingScrollPosition != -1) {
                savedState.b();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }
        SavedState savedState = new SavedState();
        if (getChildCount() > 0) {
            ensureLayoutState();
            boolean z4 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            savedState.f32856d = z4;
            if (z4) {
                View childClosestToEnd = getChildClosestToEnd();
                savedState.f32855c = this.mOrientationHelper.i() - this.mOrientationHelper.d(childClosestToEnd);
                savedState.f32854b = getPosition(childClosestToEnd);
            } else {
                View childClosestToStart = getChildClosestToStart();
                savedState.f32854b = getPosition(childClosestToStart);
                savedState.f32855c = this.mOrientationHelper.g(childClosestToStart) - this.mOrientationHelper.n();
            }
        } else {
            savedState.f32854b = -1;
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.o.j
    public void prepareForDrop(@o0 View view, @o0 View view2, int i4, int i5) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        char c5 = position < position2 ? (char) 1 : (char) 65535;
        if (this.mShouldReverseLayout) {
            if (c5 == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.i() - (this.mOrientationHelper.e(view) + this.mOrientationHelper.g(view2)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.i() - this.mOrientationHelper.d(view2));
                return;
            }
        }
        if (c5 == 65535) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.g(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.d(view2) - this.mOrientationHelper.e(view));
        }
    }

    boolean resolveIsInfinite() {
        return this.mOrientationHelper.l() == 0 && this.mOrientationHelper.h() == 0;
    }

    int scrollBy(int i4, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (getChildCount() == 0 || i4 == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f32873a = true;
        int i5 = i4 > 0 ? 1 : -1;
        int abs = Math.abs(i4);
        updateLayoutState(i5, abs, true, a0Var);
        c cVar = this.mLayoutState;
        int fill = cVar.f32879g + fill(vVar, cVar, a0Var, false);
        if (fill < 0) {
            return 0;
        }
        if (abs > fill) {
            i4 = i5 * fill;
        }
        this.mOrientationHelper.t(-i4);
        this.mLayoutState.f32883k = i4;
        return i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int scrollHorizontallyBy(int i4, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i4, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i4) {
        this.mPendingScrollPosition = i4;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.b();
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i4, int i5) {
        this.mPendingScrollPosition = i4;
        this.mPendingScrollPositionOffset = i5;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.b();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int scrollVerticallyBy(int i4, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i4, vVar, a0Var);
    }

    public void setInitialPrefetchItemCount(int i4) {
        this.mInitialPrefetchItemCount = i4;
    }

    public void setOrientation(int i4) {
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("invalid orientation:", i4));
        }
        assertNotInLayoutOrScroll(null);
        if (i4 != this.mOrientation || this.mOrientationHelper == null) {
            z b5 = z.b(this, i4);
            this.mOrientationHelper = b5;
            this.mAnchorInfo.f32857a = b5;
            this.mOrientation = i4;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z4) {
        this.mRecycleChildrenOnDetach = z4;
    }

    public void setReverseLayout(boolean z4) {
        assertNotInLayoutOrScroll(null);
        if (z4 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z4;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z4) {
        this.mSmoothScrollbarEnabled = z4;
    }

    public void setStackFromEnd(boolean z4) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z4) {
            return;
        }
        this.mStackFromEnd = z4;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i4) {
        s sVar = new s(recyclerView.getContext());
        sVar.setTargetPosition(i4);
        startSmoothScroll(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    void validateChildOrder() {
        getChildCount();
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int g4 = this.mOrientationHelper.g(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i4 = 1; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                int position2 = getPosition(childAt);
                int g5 = this.mOrientationHelper.g(childAt);
                if (position2 < position) {
                    logChildren();
                    StringBuilder sb = new StringBuilder("detected invalid position. loc invalid? ");
                    sb.append(g5 < g4);
                    throw new RuntimeException(sb.toString());
                }
                if (g5 > g4) {
                    logChildren();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i5 = 1; i5 < getChildCount(); i5++) {
            View childAt2 = getChildAt(i5);
            int position3 = getPosition(childAt2);
            int g6 = this.mOrientationHelper.g(childAt2);
            if (position3 < position) {
                logChildren();
                StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                sb2.append(g6 < g4);
                throw new RuntimeException(sb2.toString());
            }
            if (g6 < g4) {
                logChildren();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context, int i4, boolean z4) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a();
        this.mLayoutChunkResult = new b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i4);
        setReverseLayout(z4);
    }

    private void updateLayoutStateToFillEnd(int i4, int i5) {
        this.mLayoutState.f32875c = this.mOrientationHelper.i() - i5;
        c cVar = this.mLayoutState;
        cVar.f32877e = this.mShouldReverseLayout ? -1 : 1;
        cVar.f32876d = i4;
        cVar.f32878f = 1;
        cVar.f32874b = i5;
        cVar.f32879g = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStart(int i4, int i5) {
        this.mLayoutState.f32875c = i5 - this.mOrientationHelper.n();
        c cVar = this.mLayoutState;
        cVar.f32876d = i4;
        cVar.f32877e = this.mShouldReverseLayout ? 1 : -1;
        cVar.f32878f = -1;
        cVar.f32874b = i5;
        cVar.f32879g = Integer.MIN_VALUE;
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a();
        this.mLayoutChunkResult = new b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i4, i5);
        setOrientation(properties.f32886a);
        setReverseLayout(properties.f32888c);
        setStackFromEnd(properties.f32889d);
    }
}
