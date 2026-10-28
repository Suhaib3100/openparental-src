package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u0;
import androidx.collection.n1;
import androidx.compose.material3.j4;
import androidx.core.os.p0;
import androidx.core.view.accessibility.h0;
import androidx.core.view.b2;
import androidx.core.view.j1;
import androidx.core.view.v0;
import androidx.core.view.w0;
import androidx.core.view.x1;
import androidx.core.view.y0;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.k0;
import androidx.recyclerview.widget.l0;
import androidx.recyclerview.widget.n;
import com.android.internal.telephony.cdma.UserData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import z2.a;

/* loaded from: classes3.dex */
public class RecyclerView extends ViewGroup implements j1, v0, w0 {
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static boolean sDebugAssertionsEnabled;
    static final b0 sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
    static boolean sVerboseLoggingEnabled;
    androidx.recyclerview.widget.b0 mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    h mAdapter;
    androidx.recyclerview.widget.a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private k mChildDrawingOrderCallback;
    androidx.recyclerview.widget.g mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;

    @o0
    private l mEdgeEffectFactory;
    boolean mEnableFastScroller;

    @m1
    boolean mFirstLayoutComplete;
    androidx.recyclerview.widget.n mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private r mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    m mItemAnimator;
    private m.c mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<o> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;

    @m1
    LayoutManager mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final x mObserver;
    private List<p> mOnChildAttachStateListeners;
    private q mOnFlingListener;
    private final ArrayList<r> mOnItemTouchListeners;

    @m1
    final List<e0> mPendingAccessibilityImportanceChange;
    SavedState mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    n.b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final v mRecycler;
    w mRecyclerListener;
    final List<w> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private s mScrollListener;
    private List<s> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private y0 mScrollingChildHelper;
    final a0 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final d0 mViewFlinger;
    private final l0.b mViewInfoProcessCallback;
    final l0 mViewInfoStore;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    static final String TAG = "RecyclerView";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    public static abstract class LayoutManager {
        boolean mAutoMeasure;
        androidx.recyclerview.widget.g mChildHelper;
        private int mHeight;
        private int mHeightMode;
        k0 mHorizontalBoundCheck;
        private final k0.b mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;

        @q0
        z mSmoothScroller;
        k0 mVerticalBoundCheck;
        private final k0.b mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        public static class Properties {

            /* renamed from: a, reason: collision with root package name */
            public int f32886a;

            /* renamed from: b, reason: collision with root package name */
            public int f32887b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f32888c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f32889d;
        }

        class a implements k0.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.k0.b
            public View a(int i4) {
                return LayoutManager.this.getChildAt(i4);
            }

            @Override // androidx.recyclerview.widget.k0.b
            public int b(View view) {
                return LayoutManager.this.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.k0.b
            public int c() {
                return LayoutManager.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.k0.b
            public int d() {
                return LayoutManager.this.getWidth() - LayoutManager.this.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.k0.b
            public int e(View view) {
                return LayoutManager.this.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).rightMargin;
            }
        }

        class b implements k0.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.k0.b
            public View a(int i4) {
                return LayoutManager.this.getChildAt(i4);
            }

            @Override // androidx.recyclerview.widget.k0.b
            public int b(View view) {
                return LayoutManager.this.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.k0.b
            public int c() {
                return LayoutManager.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.k0.b
            public int d() {
                return LayoutManager.this.getHeight() - LayoutManager.this.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.k0.b
            public int e(View view) {
                return LayoutManager.this.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
            void a(int i4, int i5);
        }

        public LayoutManager() {
            a aVar = new a();
            this.mHorizontalBoundCheckCallback = aVar;
            b bVar = new b();
            this.mVerticalBoundCheckCallback = bVar;
            this.mHorizontalBoundCheck = new k0(aVar);
            this.mVerticalBoundCheck = new k0(bVar);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        private void addViewInt(View view, int i4, boolean z4) {
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z4 || childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.b(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.p(childViewHolderInt);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.c(view, i4, view.getLayoutParams(), false);
            } else if (view.getParent() == this.mRecyclerView) {
                int m4 = this.mChildHelper.m(view);
                if (i4 == -1) {
                    i4 = this.mChildHelper.g();
                }
                if (m4 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.mRecyclerView.indexOfChild(view) + this.mRecyclerView.exceptionLabel());
                }
                if (m4 != i4) {
                    this.mRecyclerView.mLayout.moveView(m4, i4);
                }
            } else {
                this.mChildHelper.a(view, i4, false);
                layoutParams.f32894d = true;
                z zVar = this.mSmoothScroller;
                if (zVar != null && zVar.isRunning()) {
                    this.mSmoothScroller.onChildAttachedToWindow(view);
                }
            }
            if (layoutParams.f32895e) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Objects.toString(layoutParams.f32892b);
                }
                childViewHolderInt.itemView.invalidate();
                layoutParams.f32895e = false;
            }
        }

        public static int chooseSize(int i4, int i5, int i6) {
            int mode = View.MeasureSpec.getMode(i4);
            int size = View.MeasureSpec.getSize(i4);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i5, i6) : size : Math.min(size, Math.max(i5, i6));
        }

        private void detachViewInternal(int i4, @o0 View view) {
            this.mChildHelper.d(i4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
        
            if (r3 >= 0) goto L5;
         */
        @java.lang.Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto L10
                if (r3 < 0) goto Le
            Lc:
                r2 = r0
                goto L1e
            Le:
                r3 = r2
                goto L1e
            L10:
                if (r3 < 0) goto L13
                goto Lc
            L13:
                r4 = -1
                if (r3 != r4) goto L18
                r3 = r1
                goto Lc
            L18:
                r4 = -2
                if (r3 != r4) goto Le
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1
            L1e:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(int, int, int, boolean):int");
        }

        private int[] getChildRectangleOnScreenScrollAmount(View view, Rect rect) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top2 = (view.getTop() + rect.top) - view.getScrollY();
            int width2 = rect.width() + left;
            int height2 = rect.height() + top2;
            int i4 = left - paddingLeft;
            int min = Math.min(0, i4);
            int i5 = top2 - paddingTop;
            int min2 = Math.min(0, i5);
            int i6 = width2 - width;
            int max = Math.max(0, i6);
            int max2 = Math.max(0, height2 - height);
            if (getLayoutDirection() != 1) {
                if (min == 0) {
                    min = Math.min(i4, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i6);
            }
            if (min2 == 0) {
                min2 = Math.min(i5, max2);
            }
            return new int[]{max, min2};
        }

        public static Properties getProperties(@o0 Context context, @q0 AttributeSet attributeSet, int i4, int i5) {
            Properties properties = new Properties();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.d.f93800a, i4, i5);
            properties.f32886a = obtainStyledAttributes.getInt(a.d.f93801b, 1);
            properties.f32887b = obtainStyledAttributes.getInt(a.d.f93811l, 1);
            properties.f32888c = obtainStyledAttributes.getBoolean(a.d.f93810k, false);
            properties.f32889d = obtainStyledAttributes.getBoolean(a.d.f93812m, false);
            obtainStyledAttributes.recycle();
            return properties;
        }

        private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerView, int i4, int i5) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            return rect.left - i4 < width && rect.right - i4 > paddingLeft && rect.top - i5 < height && rect.bottom - i5 > paddingTop;
        }

        private static boolean isMeasurementUpToDate(int i4, int i5, int i6) {
            int mode = View.MeasureSpec.getMode(i5);
            int size = View.MeasureSpec.getSize(i5);
            if (i6 > 0 && i4 != i6) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i4;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i4;
            }
            return true;
        }

        private void scrapOrRecycleView(v vVar, int i4, View view) {
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    childViewHolderInt.toString();
                }
            } else if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
                removeViewAt(i4);
                vVar.I(childViewHolderInt);
            } else {
                detachViewAt(i4);
                vVar.J(view);
                this.mRecyclerView.mViewInfoStore.k(childViewHolderInt);
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view) {
            addView(view, -1);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertInLayoutOrScroll(str);
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void attachView(@o0 View view, int i4, LayoutParams layoutParams) {
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.b(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.p(childViewHolderInt);
            }
            this.mChildHelper.c(view, i4, layoutParams, childViewHolderInt.isRemoved());
        }

        public void calculateItemDecorationsForChild(@o0 View view, @o0 Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        @SuppressLint({"UnknownNullness"})
        public void collectAdjacentPrefetchPositions(int i4, int i5, a0 a0Var, c cVar) {
        }

        @SuppressLint({"UnknownNullness"})
        public void collectInitialPrefetchPositions(int i4, c cVar) {
        }

        public int computeHorizontalScrollExtent(@o0 a0 a0Var) {
            return 0;
        }

        public int computeHorizontalScrollOffset(@o0 a0 a0Var) {
            return 0;
        }

        public int computeHorizontalScrollRange(@o0 a0 a0Var) {
            return 0;
        }

        public int computeVerticalScrollExtent(@o0 a0 a0Var) {
            return 0;
        }

        public int computeVerticalScrollOffset(@o0 a0 a0Var) {
            return 0;
        }

        public int computeVerticalScrollRange(@o0 a0 a0Var) {
            return 0;
        }

        public void detachAndScrapAttachedViews(@o0 v vVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                scrapOrRecycleView(vVar, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(@o0 View view, @o0 v vVar) {
            scrapOrRecycleView(vVar, this.mChildHelper.m(view), view);
        }

        public void detachAndScrapViewAt(int i4, @o0 v vVar) {
            scrapOrRecycleView(vVar, i4, getChildAt(i4));
        }

        public void detachView(@o0 View view) {
            int m4 = this.mChildHelper.m(view);
            if (m4 >= 0) {
                detachViewInternal(m4, view);
            }
        }

        public void detachViewAt(int i4) {
            detachViewInternal(i4, getChildAt(i4));
        }

        void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        void dispatchDetachedFromWindow(RecyclerView recyclerView, v vVar) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, vVar);
        }

        @SuppressLint({"UnknownNullness"})
        public void endAnimation(View view) {
            m mVar = this.mRecyclerView.mItemAnimator;
            if (mVar != null) {
                mVar.endAnimation(RecyclerView.getChildViewHolderInt(view));
            }
        }

        @q0
        public View findContainingItemView(@o0 View view) {
            View findContainingItemView;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.n(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        @q0
        public View findViewByPosition(int i4) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i4 && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.j() || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        public abstract LayoutParams generateDefaultLayoutParams();

        @SuppressLint({"UnknownNullness"})
        public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(@o0 View view) {
            return ((LayoutParams) view.getLayoutParams()).f32893c.bottom;
        }

        @q0
        public View getChildAt(int i4) {
            androidx.recyclerview.widget.g gVar = this.mChildHelper;
            if (gVar != null) {
                return gVar.f(i4);
            }
            return null;
        }

        public int getChildCount() {
            androidx.recyclerview.widget.g gVar = this.mChildHelper;
            if (gVar != null) {
                return gVar.g();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public int getColumnCountForAccessibility(@o0 v vVar, @o0 a0 a0Var) {
            return -1;
        }

        public int getDecoratedBottom(@o0 View view) {
            return getBottomDecorationHeight(view) + view.getBottom();
        }

        public void getDecoratedBoundsWithMargins(@o0 View view, @o0 Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int getDecoratedLeft(@o0 View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(@o0 View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f32893c;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(@o0 View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f32893c;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(@o0 View view) {
            return getRightDecorationWidth(view) + view.getRight();
        }

        public int getDecoratedTop(@o0 View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        @q0
        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        @u0
        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.mRecyclerView;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getItemViewType(@o0 View view) {
            return RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        public int getLayoutDirection() {
            return x1.c0(this.mRecyclerView);
        }

        public int getLeftDecorationWidth(@o0 View view) {
            return ((LayoutParams) view.getLayoutParams()).f32893c.left;
        }

        @u0
        public int getMinimumHeight() {
            return x1.h0(this.mRecyclerView);
        }

        @u0
        public int getMinimumWidth() {
            return x1.i0(this.mRecyclerView);
        }

        @u0
        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        @u0
        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return x1.m0(recyclerView);
            }
            return 0;
        }

        @u0
        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        @u0
        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        @u0
        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return x1.n0(recyclerView);
            }
            return 0;
        }

        @u0
        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(@o0 View view) {
            return ((LayoutParams) view.getLayoutParams()).d();
        }

        public int getRightDecorationWidth(@o0 View view) {
            return ((LayoutParams) view.getLayoutParams()).f32893c.right;
        }

        public int getRowCountForAccessibility(@o0 v vVar, @o0 a0 a0Var) {
            return -1;
        }

        public int getSelectionModeForAccessibility(@o0 v vVar, @o0 a0 a0Var) {
            return 0;
        }

        public int getTopDecorationHeight(@o0 View view) {
            return ((LayoutParams) view.getLayoutParams()).f32893c.top;
        }

        public void getTransformedBoundingBox(@o0 View view, boolean z4, @o0 Rect rect) {
            Matrix matrix;
            if (z4) {
                Rect rect2 = ((LayoutParams) view.getLayoutParams()).f32893c;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        @u0
        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i4).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void ignoreView(@o0 View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException("View should be fully attached to be ignored" + this.mRecyclerView.exceptionLabel());
            }
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.addFlags(128);
            this.mRecyclerView.mViewInfoStore.q(childViewHolderInt);
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(@o0 v vVar, @o0 a0 a0Var) {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            z zVar = this.mSmoothScroller;
            return zVar != null && zVar.isRunning();
        }

        public boolean isViewPartiallyVisible(@o0 View view, boolean z4, boolean z5) {
            boolean z6 = this.mHorizontalBoundCheck.b(view, 24579) && this.mVerticalBoundCheck.b(view, 24579);
            return z4 ? z6 : !z6;
        }

        public void layoutDecorated(@o0 View view, int i4, int i5, int i6, int i7) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f32893c;
            view.layout(i4 + rect.left, i5 + rect.top, i6 - rect.right, i7 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(@o0 View view, int i4, int i5, int i6, int i7) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.f32893c;
            view.layout(i4 + rect.left + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i5 + rect.top + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (i6 - rect.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (i7 - rect.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        }

        public void measureChild(@o0 View view, int i4, int i5) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i6 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i4;
            int i7 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i5;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i6, ((ViewGroup.MarginLayoutParams) layoutParams).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i7, ((ViewGroup.MarginLayoutParams) layoutParams).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(@o0 View view, int i4, int i5) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i6 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i4;
            int i7 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i5;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i6, ((ViewGroup.MarginLayoutParams) layoutParams).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i7, ((ViewGroup.MarginLayoutParams) layoutParams).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i4, int i5) {
            View childAt = getChildAt(i4);
            if (childAt != null) {
                detachViewAt(i4);
                attachView(childAt, i5);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i4 + this.mRecyclerView.toString());
            }
        }

        public void offsetChildrenHorizontal(@u0 int i4) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i4);
            }
        }

        public void offsetChildrenVertical(@u0 int i4) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i4);
            }
        }

        public void onAdapterChanged(@q0 h hVar, @q0 h hVar2) {
        }

        public boolean onAddFocusables(@o0 RecyclerView recyclerView, @o0 ArrayList<View> arrayList, int i4, int i5) {
            return false;
        }

        @androidx.annotation.i
        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        @q0
        public View onFocusSearchFailed(@o0 View view, int i4, @o0 v vVar, @o0 a0 a0Var) {
            return null;
        }

        public void onInitializeAccessibilityEvent(@o0 AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        void onInitializeAccessibilityNodeInfo(androidx.core.view.accessibility.h0 h0Var) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, h0Var);
        }

        public void onInitializeAccessibilityNodeInfoForItem(@o0 v vVar, @o0 a0 a0Var, @o0 View view, @o0 androidx.core.view.accessibility.h0 h0Var) {
        }

        @q0
        public View onInterceptFocusSearch(@o0 View view, int i4) {
            return null;
        }

        public void onItemsAdded(@o0 RecyclerView recyclerView, int i4, int i5) {
        }

        public void onItemsChanged(@o0 RecyclerView recyclerView) {
        }

        public void onItemsMoved(@o0 RecyclerView recyclerView, int i4, int i5, int i6) {
        }

        public void onItemsRemoved(@o0 RecyclerView recyclerView, int i4, int i5) {
        }

        public void onItemsUpdated(@o0 RecyclerView recyclerView, int i4, int i5) {
        }

        @SuppressLint({"UnknownNullness"})
        public void onLayoutChildren(v vVar, a0 a0Var) {
        }

        @SuppressLint({"UnknownNullness"})
        public void onLayoutCompleted(a0 a0Var) {
        }

        public void onMeasure(@o0 v vVar, @o0 a0 a0Var, int i4, int i5) {
            this.mRecyclerView.defaultOnMeasure(i4, i5);
        }

        @Deprecated
        public boolean onRequestChildFocus(@o0 RecyclerView recyclerView, @o0 View view, @q0 View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        @SuppressLint({"UnknownNullness"})
        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        @q0
        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i4) {
        }

        void onSmoothScrollerStopped(z zVar) {
            if (this.mSmoothScroller == zVar) {
                this.mSmoothScroller = null;
            }
        }

        boolean performAccessibilityAction(int i4, @q0 Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i4, bundle);
        }

        public boolean performAccessibilityActionForItem(@o0 v vVar, @o0 a0 a0Var, @o0 View view, int i4, @q0 Bundle bundle) {
            return false;
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                x1.v1(recyclerView, runnable);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.q(childCount);
            }
        }

        public void removeAndRecycleAllViews(@o0 v vVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, vVar);
                }
            }
        }

        void removeAndRecycleScrapInt(v vVar) {
            int size = vVar.f32949a.size();
            for (int i4 = size - 1; i4 >= 0; i4--) {
                View o4 = vVar.o(i4);
                e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(o4);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(o4, false);
                    }
                    m mVar = this.mRecyclerView.mItemAnimator;
                    if (mVar != null) {
                        mVar.endAnimation(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    vVar.E(o4);
                }
            }
            vVar.f();
            if (size > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(@o0 View view, @o0 v vVar) {
            removeView(view);
            vVar.H(view);
        }

        public void removeAndRecycleViewAt(int i4, @o0 v vVar) {
            View childAt = getChildAt(i4);
            removeViewAt(i4);
            vVar.H(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(@o0 View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        @SuppressLint({"UnknownNullness"})
        public void removeView(View view) {
            this.mChildHelper.p(view);
        }

        public void removeViewAt(int i4) {
            if (getChildAt(i4) != null) {
                this.mChildHelper.q(i4);
            }
        }

        public boolean requestChildRectangleOnScreen(@o0 RecyclerView recyclerView, @o0 View view, @o0 Rect rect, boolean z4) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z4, false);
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        @SuppressLint({"UnknownNullness"})
        public int scrollHorizontallyBy(int i4, v vVar, a0 a0Var) {
            return 0;
        }

        public void scrollToPosition(int i4) {
            boolean z4 = RecyclerView.sVerboseLoggingEnabled;
        }

        @SuppressLint({"UnknownNullness"})
        public int scrollVerticallyBy(int i4, v vVar, a0 a0Var) {
            return 0;
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z4) {
            this.mAutoMeasure = z4;
        }

        void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void setItemPrefetchEnabled(boolean z4) {
            if (z4 != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z4;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.mRecycler.Q();
                }
            }
        }

        void setMeasureSpecs(int i4, int i5) {
            this.mWidth = View.MeasureSpec.getSize(i4);
            int mode = View.MeasureSpec.getMode(i4);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i5);
            int mode2 = View.MeasureSpec.getMode(i5);
            this.mHeightMode = mode2;
            if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.mHeight = 0;
        }

        public void setMeasuredDimension(Rect rect, int i4, int i5) {
            setMeasuredDimension(chooseSize(i4, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), chooseSize(i5, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
        }

        void setMeasuredDimensionFromChildren(int i4, int i5) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i4, i5);
                return;
            }
            int i6 = Integer.MIN_VALUE;
            int i7 = Integer.MAX_VALUE;
            int i10 = Integer.MIN_VALUE;
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i13 = rect.left;
                if (i13 < i11) {
                    i11 = i13;
                }
                int i14 = rect.right;
                if (i14 > i6) {
                    i6 = i14;
                }
                int i15 = rect.top;
                if (i15 < i7) {
                    i7 = i15;
                }
                int i16 = rect.bottom;
                if (i16 > i10) {
                    i10 = i16;
                }
            }
            this.mRecyclerView.mTempRect.set(i11, i7, i6, i10);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i4, i5);
        }

        public void setMeasurementCacheEnabled(boolean z4) {
            this.mMeasurementCacheEnabled = z4;
        }

        void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        boolean shouldMeasureChild(View view, int i4, int i5, LayoutParams layoutParams) {
            return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getWidth(), i4, ((ViewGroup.MarginLayoutParams) layoutParams).width) && isMeasurementUpToDate(view.getHeight(), i5, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        boolean shouldMeasureTwice() {
            return false;
        }

        boolean shouldReMeasureChild(View view, int i4, int i5, LayoutParams layoutParams) {
            return (this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getMeasuredWidth(), i4, ((ViewGroup.MarginLayoutParams) layoutParams).width) && isMeasurementUpToDate(view.getMeasuredHeight(), i5, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        @SuppressLint({"UnknownNullness"})
        public void smoothScrollToPosition(RecyclerView recyclerView, a0 a0Var, int i4) {
        }

        @SuppressLint({"UnknownNullness"})
        public void startSmoothScroll(z zVar) {
            z zVar2 = this.mSmoothScroller;
            if (zVar2 != null && zVar != zVar2 && zVar2.isRunning()) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = zVar;
            zVar.start(this.mRecyclerView, this);
        }

        public void stopIgnoringView(@o0 View view) {
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        void stopSmoothScroller() {
            z zVar = this.mSmoothScroller;
            if (zVar != null) {
                zVar.stop();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view, int i4) {
            addViewInt(view, i4, true);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view, int i4) {
            addViewInt(view, i4, false);
        }

        @androidx.annotation.i
        @SuppressLint({"UnknownNullness"})
        public void onDetachedFromWindow(RecyclerView recyclerView, v vVar) {
            onDetachedFromWindow(recyclerView);
        }

        public void onInitializeAccessibilityEvent(@o0 v vVar, @o0 a0 a0Var, @o0 AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z4 = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z4 = false;
            }
            accessibilityEvent.setScrollable(z4);
            h hVar = this.mRecyclerView.mAdapter;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.getItemCount());
            }
        }

        public void onInitializeAccessibilityNodeInfo(@o0 v vVar, @o0 a0 a0Var, @o0 androidx.core.view.accessibility.h0 h0Var) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                h0Var.a(8192);
                h0Var.X1(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                h0Var.a(4096);
                h0Var.X1(true);
            }
            h0Var.l1(h0.f.h(getRowCountForAccessibility(vVar, a0Var), getColumnCountForAccessibility(vVar, a0Var), isLayoutHierarchical(vVar, a0Var), getSelectionModeForAccessibility(vVar, a0Var)));
        }

        void onInitializeAccessibilityNodeInfoForItem(View view, androidx.core.view.accessibility.h0 h0Var) {
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved() || this.mChildHelper.n(childViewHolderInt.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, h0Var);
        }

        public void onItemsUpdated(@o0 RecyclerView recyclerView, int i4, int i5, @q0 Object obj) {
            onItemsUpdated(recyclerView, i4, i5);
        }

        public boolean onRequestChildFocus(@o0 RecyclerView recyclerView, @o0 a0 a0Var, @o0 View view, @q0 View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        public boolean performAccessibilityAction(@o0 v vVar, @o0 a0 a0Var, int i4, @q0 Bundle bundle) {
            int paddingTop;
            int paddingLeft;
            int i5;
            int i6;
            if (this.mRecyclerView == null) {
                return false;
            }
            int height = getHeight();
            int width = getWidth();
            Rect rect = new Rect();
            if (this.mRecyclerView.getMatrix().isIdentity() && this.mRecyclerView.getGlobalVisibleRect(rect)) {
                height = rect.height();
                width = rect.width();
            }
            if (i4 == 4096) {
                paddingTop = this.mRecyclerView.canScrollVertically(1) ? (height - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                    i5 = paddingTop;
                    i6 = paddingLeft;
                }
                i5 = paddingTop;
                i6 = 0;
            } else if (i4 != 8192) {
                i6 = 0;
                i5 = 0;
            } else {
                paddingTop = this.mRecyclerView.canScrollVertically(-1) ? -((height - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    paddingLeft = -((width - getPaddingLeft()) - getPaddingRight());
                    i5 = paddingTop;
                    i6 = paddingLeft;
                }
                i5 = paddingTop;
                i6 = 0;
            }
            if (i5 == 0 && i6 == 0) {
                return false;
            }
            this.mRecyclerView.smoothScrollBy(i6, i5, null, Integer.MIN_VALUE, true);
            return true;
        }

        boolean performAccessibilityActionForItem(@o0 View view, int i4, @q0 Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i4, bundle);
        }

        public boolean requestChildRectangleOnScreen(@o0 RecyclerView recyclerView, @o0 View view, @o0 Rect rect, boolean z4, boolean z5) {
            int[] childRectangleOnScreenScrollAmount = getChildRectangleOnScreenScrollAmount(view, rect);
            int i4 = childRectangleOnScreenScrollAmount[0];
            int i5 = childRectangleOnScreenScrollAmount[1];
            if ((z5 && !isFocusedChildVisibleAfterScrolling(recyclerView, i4, i5)) || (i4 == 0 && i5 == 0)) {
                return false;
            }
            if (z4) {
                recyclerView.scrollBy(i4, i5);
            } else {
                recyclerView.smoothScrollBy(i4, i5);
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
        
            if (r5 == 1073741824) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int getChildMeasureSpec(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1d
                if (r7 < 0) goto L12
            L10:
                r5 = r3
                goto L30
            L12:
                if (r7 != r1) goto L1a
                if (r5 == r2) goto L22
                if (r5 == 0) goto L1a
                if (r5 == r3) goto L22
            L1a:
                r5 = r6
                r7 = r5
                goto L30
            L1d:
                if (r7 < 0) goto L20
                goto L10
            L20:
                if (r7 != r1) goto L24
            L22:
                r7 = r4
                goto L30
            L24:
                if (r7 != r0) goto L1a
                if (r5 == r2) goto L2e
                if (r5 != r3) goto L2b
                goto L2e
            L2b:
                r7 = r4
                r5 = r6
                goto L30
            L2e:
                r7 = r4
                r5 = r2
            L30:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(int, int, int, int, boolean):int");
        }

        public void attachView(@o0 View view, int i4) {
            attachView(view, i4, (LayoutParams) view.getLayoutParams());
        }

        @SuppressLint({"UnknownNullness"})
        public LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        public void setMeasuredDimension(int i4, int i5) {
            this.mRecyclerView.setMeasuredDimension(i4, i5);
        }

        public void attachView(@o0 View view) {
            attachView(view, -1);
        }
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.mIsAttached) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.mLayoutSuppressed) {
                recyclerView2.mLayoutWasDefered = true;
            } else {
                recyclerView2.consumePendingUpdateOperations();
            }
        }
    }

    public static class a0 {

        /* renamed from: r, reason: collision with root package name */
        static final int f32898r = 1;

        /* renamed from: s, reason: collision with root package name */
        static final int f32899s = 2;

        /* renamed from: t, reason: collision with root package name */
        static final int f32900t = 4;

        /* renamed from: b, reason: collision with root package name */
        private SparseArray<Object> f32902b;

        /* renamed from: m, reason: collision with root package name */
        int f32913m;

        /* renamed from: n, reason: collision with root package name */
        long f32914n;

        /* renamed from: o, reason: collision with root package name */
        int f32915o;

        /* renamed from: p, reason: collision with root package name */
        int f32916p;

        /* renamed from: q, reason: collision with root package name */
        int f32917q;

        /* renamed from: a, reason: collision with root package name */
        int f32901a = -1;

        /* renamed from: c, reason: collision with root package name */
        int f32903c = 0;

        /* renamed from: d, reason: collision with root package name */
        int f32904d = 0;

        /* renamed from: e, reason: collision with root package name */
        int f32905e = 1;

        /* renamed from: f, reason: collision with root package name */
        int f32906f = 0;

        /* renamed from: g, reason: collision with root package name */
        boolean f32907g = false;

        /* renamed from: h, reason: collision with root package name */
        boolean f32908h = false;

        /* renamed from: i, reason: collision with root package name */
        boolean f32909i = false;

        /* renamed from: j, reason: collision with root package name */
        boolean f32910j = false;

        /* renamed from: k, reason: collision with root package name */
        boolean f32911k = false;

        /* renamed from: l, reason: collision with root package name */
        boolean f32912l = false;

        void a(int i4) {
            if ((this.f32905e & i4) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i4) + " but it is " + Integer.toBinaryString(this.f32905e));
        }

        public boolean b() {
            return this.f32907g;
        }

        public <T> T c(int i4) {
            SparseArray<Object> sparseArray = this.f32902b;
            if (sparseArray == null) {
                return null;
            }
            return (T) sparseArray.get(i4);
        }

        public int d() {
            return this.f32908h ? this.f32903c - this.f32904d : this.f32906f;
        }

        public int e() {
            return this.f32916p;
        }

        public int f() {
            return this.f32917q;
        }

        public int g() {
            return this.f32901a;
        }

        public boolean h() {
            return this.f32901a != -1;
        }

        public boolean i() {
            return this.f32910j;
        }

        public boolean j() {
            return this.f32908h;
        }

        void k(h hVar) {
            this.f32905e = 1;
            this.f32906f = hVar.getItemCount();
            this.f32908h = false;
            this.f32909i = false;
            this.f32910j = false;
        }

        public void l(int i4, Object obj) {
            if (this.f32902b == null) {
                this.f32902b = new SparseArray<>();
            }
            this.f32902b.put(i4, obj);
        }

        public void m(int i4) {
            SparseArray<Object> sparseArray = this.f32902b;
            if (sparseArray == null) {
                return;
            }
            sparseArray.remove(i4);
        }

        public boolean n() {
            return this.f32912l;
        }

        public boolean o() {
            return this.f32911k;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("State{mTargetPosition=");
            sb.append(this.f32901a);
            sb.append(", mData=");
            sb.append(this.f32902b);
            sb.append(", mItemCount=");
            sb.append(this.f32906f);
            sb.append(", mIsMeasuring=");
            sb.append(this.f32910j);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(this.f32903c);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(this.f32904d);
            sb.append(", mStructureChanged=");
            sb.append(this.f32907g);
            sb.append(", mInPreLayout=");
            sb.append(this.f32908h);
            sb.append(", mRunSimpleAnimations=");
            sb.append(this.f32911k);
            sb.append(", mRunPredictiveAnimations=");
            return androidx.compose.animation.l.a(sb, this.f32912l, '}');
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = RecyclerView.this.mItemAnimator;
            if (mVar != null) {
                mVar.runPendingAnimations();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    static class b0 extends l {
        b0() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        @o0
        protected EdgeEffect a(@o0 RecyclerView recyclerView, int i4) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    class c implements Interpolator {
        c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            float f5 = f4 - 1.0f;
            return (f5 * f5 * f5 * f5 * f5) + 1.0f;
        }
    }

    public static abstract class c0 {
        @q0
        public abstract View a(@o0 v vVar, int i4, int i5);
    }

    class d implements l0.b {
        d() {
        }

        @Override // androidx.recyclerview.widget.l0.b
        public void a(e0 e0Var, m.d dVar, m.d dVar2) {
            RecyclerView.this.animateAppearance(e0Var, dVar, dVar2);
        }

        @Override // androidx.recyclerview.widget.l0.b
        public void b(e0 e0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.removeAndRecycleView(e0Var.itemView, recyclerView.mRecycler);
        }

        @Override // androidx.recyclerview.widget.l0.b
        public void c(e0 e0Var, @o0 m.d dVar, @q0 m.d dVar2) {
            RecyclerView.this.mRecycler.P(e0Var);
            RecyclerView.this.animateDisappearance(e0Var, dVar, dVar2);
        }

        @Override // androidx.recyclerview.widget.l0.b
        public void d(e0 e0Var, @o0 m.d dVar, @o0 m.d dVar2) {
            e0Var.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mDataSetHasChangedAfterLayout) {
                if (recyclerView.mItemAnimator.animateChange(e0Var, e0Var, dVar, dVar2)) {
                    RecyclerView.this.postAnimationRunner();
                }
            } else if (recyclerView.mItemAnimator.animatePersistence(e0Var, dVar, dVar2)) {
                RecyclerView.this.postAnimationRunner();
            }
        }
    }

    class d0 implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private int f32920b;

        /* renamed from: c, reason: collision with root package name */
        private int f32921c;

        /* renamed from: d, reason: collision with root package name */
        OverScroller f32922d;

        /* renamed from: e, reason: collision with root package name */
        Interpolator f32923e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f32924f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f32925g;

        d0() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f32923e = interpolator;
            this.f32924f = false;
            this.f32925g = false;
            this.f32922d = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i4, int i5) {
            int abs = Math.abs(i4);
            int abs2 = Math.abs(i5);
            boolean z4 = abs > abs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z4 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z4) {
                abs = abs2;
            }
            return Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            x1.v1(RecyclerView.this, this);
        }

        public void b(int i4, int i5) {
            RecyclerView.this.setScrollState(2);
            this.f32921c = 0;
            this.f32920b = 0;
            Interpolator interpolator = this.f32923e;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f32923e = interpolator2;
                this.f32922d = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f32922d.fling(0, 0, i4, i5, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            d();
        }

        void d() {
            if (this.f32924f) {
                this.f32925g = true;
            } else {
                c();
            }
        }

        public void e(int i4, int i5, int i6, @q0 Interpolator interpolator) {
            if (i6 == Integer.MIN_VALUE) {
                i6 = a(i4, i5);
            }
            int i7 = i6;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f32923e != interpolator) {
                this.f32923e = interpolator;
                this.f32922d = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f32921c = 0;
            this.f32920b = 0;
            RecyclerView.this.setScrollState(2);
            this.f32922d.startScroll(0, 0, i4, i5, i7);
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.f32922d.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i4;
            int i5;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                f();
                return;
            }
            this.f32925g = false;
            this.f32924f = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f32922d;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i6 = currX - this.f32920b;
                int i7 = currY - this.f32921c;
                this.f32920b = currX;
                this.f32921c = currY;
                int consumeFlingInHorizontalStretch = RecyclerView.this.consumeFlingInHorizontalStretch(i6);
                int consumeFlingInVerticalStretch = RecyclerView.this.consumeFlingInVerticalStretch(i7);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    consumeFlingInHorizontalStretch -= iArr2[0];
                    consumeFlingInVerticalStretch -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i5 = iArr4[0];
                    i4 = iArr4[1];
                    consumeFlingInHorizontalStretch -= i5;
                    consumeFlingInVerticalStretch -= i4;
                    z zVar = recyclerView4.mLayout.mSmoothScroller;
                    if (zVar != null && !zVar.isPendingInitialRun() && zVar.isRunning()) {
                        int d5 = RecyclerView.this.mState.d();
                        if (d5 == 0) {
                            zVar.stop();
                        } else if (zVar.getTargetPosition() >= d5) {
                            zVar.setTargetPosition(d5 - 1);
                            zVar.onAnimation(i5, i4);
                        } else {
                            zVar.onAnimation(i5, i4);
                        }
                    }
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i5, i4, consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i10 = consumeFlingInHorizontalStretch - iArr6[0];
                int i11 = consumeFlingInVerticalStretch - iArr6[1];
                if (i5 != 0 || i4 != 0) {
                    recyclerView6.dispatchOnScrolled(i5, i4);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z4 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i10 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i11 != 0));
                z zVar2 = RecyclerView.this.mLayout.mSmoothScroller;
                if ((zVar2 == null || !zVar2.isPendingInitialRun()) && z4) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i12 = i10 < 0 ? -currVelocity : i10 > 0 ? currVelocity : 0;
                        if (i11 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i11 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i12, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.n nVar = recyclerView7.mGapWorker;
                    if (nVar != null) {
                        nVar.f(recyclerView7, i5, i4);
                    }
                }
            }
            z zVar3 = RecyclerView.this.mLayout.mSmoothScroller;
            if (zVar3 != null && zVar3.isPendingInitialRun()) {
                zVar3.onAnimation(0, 0);
            }
            this.f32924f = false;
            if (this.f32925g) {
                c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.stopNestedScroll(1);
            }
        }
    }

    class e implements g.b {
        e() {
        }

        @Override // androidx.recyclerview.widget.g.b
        public View a(int i4) {
            return RecyclerView.this.getChildAt(i4);
        }

        @Override // androidx.recyclerview.widget.g.b
        public void addView(View view, int i4) {
            RecyclerView.this.addView(view, i4);
            RecyclerView.this.dispatchChildAttached(view);
        }

        @Override // androidx.recyclerview.widget.g.b
        public void b(View view) {
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.g.b
        public int c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.g.b
        public e0 d(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }

        @Override // androidx.recyclerview.widget.g.b
        public void e(int i4) {
            View a5 = a(i4);
            if (a5 != null) {
                e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(a5);
                if (childViewHolderInt != null) {
                    if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                        throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                    }
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        childViewHolderInt.toString();
                    }
                    childViewHolderInt.addFlags(256);
                }
            } else if (RecyclerView.sDebugAssertionsEnabled) {
                throw new IllegalArgumentException("No view at offset " + i4 + RecyclerView.this.exceptionLabel());
            }
            RecyclerView.this.detachViewFromParent(i4);
        }

        @Override // androidx.recyclerview.widget.g.b
        public int f(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.g.b
        public void g(View view) {
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.g.b
        public void h(View view, int i4, ViewGroup.LayoutParams layoutParams) {
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                if (RecyclerView.sVerboseLoggingEnabled) {
                    childViewHolderInt.toString();
                }
                childViewHolderInt.clearTmpDetachFlag();
            } else if (RecyclerView.sDebugAssertionsEnabled) {
                throw new IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + i4 + RecyclerView.this.exceptionLabel());
            }
            RecyclerView.this.attachViewToParent(view, i4, layoutParams);
        }

        @Override // androidx.recyclerview.widget.g.b
        public void removeAllViews() {
            int c5 = c();
            for (int i4 = 0; i4 < c5; i4++) {
                View a5 = a(i4);
                RecyclerView.this.dispatchChildDetached(a5);
                a5.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.g.b
        public void removeViewAt(int i4) {
            View childAt = RecyclerView.this.getChildAt(i4);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i4);
        }
    }

    public static abstract class e0 {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;

        @o0
        public final View itemView;
        h<? extends e0> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        e0 mShadowedHolder = null;
        e0 mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        v mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        @m1
        int mPendingAccessibilityState = -1;

        public e0(@o0 View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        void addFlags(int i4) {
            this.mFlags = i4 | this.mFlags;
        }

        void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && x1.P0(this.itemView);
        }

        void flagRemovedAndOffsetPosition(int i4, int i5, boolean z4) {
            addFlags(8);
            offsetPosition(i5, z4);
            this.mPosition = i4;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        @q0
        public final h<? extends e0> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            h adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i4 = this.mPreLayoutPosition;
            return i4 == -1 ? this.mPosition : i4;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i4 = this.mPreLayoutPosition;
            return i4 == -1 ? this.mPosition : i4;
        }

        List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        boolean hasAnyOfTheFlags(int i4) {
            return (i4 & this.mFlags) != 0;
        }

        boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !x1.P0(this.itemView);
        }

        boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        boolean isScrap() {
            return this.mScrapContainer != null;
        }

        boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        void offsetPosition(int i4, boolean z4) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z4) {
                this.mPreLayoutPosition += i4;
            }
            this.mPosition += i4;
            if (this.itemView.getLayoutParams() != null) {
                ((LayoutParams) this.itemView.getLayoutParams()).f32894d = true;
            }
        }

        void onEnteredHiddenState(RecyclerView recyclerView) {
            int i4 = this.mPendingAccessibilityState;
            if (i4 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i4;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = x1.X(this.itemView);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        void resetInternal() {
            if (RecyclerView.sDebugAssertionsEnabled && isTmpDetached()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        void setFlags(int i4, int i5) {
            this.mFlags = (i4 & i5) | (this.mFlags & (~i5));
        }

        public final void setIsRecyclable(boolean z4) {
            int i4 = this.mIsRecyclableCount;
            int i5 = z4 ? i4 - 1 : i4 + 1;
            this.mIsRecyclableCount = i5;
            if (i5 < 0) {
                this.mIsRecyclableCount = 0;
                if (RecyclerView.sDebugAssertionsEnabled) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                toString();
            } else if (!z4 && i5 == 1) {
                this.mFlags |= 16;
            } else if (z4 && i5 == 0) {
                this.mFlags &= -17;
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                toString();
            }
        }

        void setScrapContainer(v vVar, boolean z4) {
            this.mScrapContainer = vVar;
            this.mInChangeScrap = z4;
        }

        boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder a5 = androidx.constraintlayout.core.e.a(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            a5.append(Integer.toHexString(hashCode()));
            a5.append(" position=");
            a5.append(this.mPosition);
            a5.append(" id=");
            a5.append(this.mItemId);
            a5.append(", oldPos=");
            a5.append(this.mOldPosition);
            a5.append(", pLpos:");
            a5.append(this.mPreLayoutPosition);
            StringBuilder sb = new StringBuilder(a5.toString());
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        void unScrap() {
            this.mScrapContainer.P(this);
        }

        boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    class f implements a.InterfaceC0592a {
        f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0592a
        public void a(int i4, int i5) {
            RecyclerView.this.offsetPositionRecordsForMove(i4, i5);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0592a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0592a
        public void c(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0592a
        public void d(int i4, int i5) {
            RecyclerView.this.offsetPositionRecordsForRemove(i4, i5, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0592a
        public void e(int i4, int i5, Object obj) {
            RecyclerView.this.viewRangeUpdate(i4, i5, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0592a
        public e0 f(int i4) {
            e0 findViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i4, true);
            if (findViewHolderForPosition == null) {
                return null;
            }
            if (!RecyclerView.this.mChildHelper.n(findViewHolderForPosition.itemView)) {
                return findViewHolderForPosition;
            }
            boolean z4 = RecyclerView.sVerboseLoggingEnabled;
            return null;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0592a
        public void g(int i4, int i5) {
            RecyclerView.this.offsetPositionRecordsForInsert(i4, i5);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0592a
        public void h(int i4, int i5) {
            RecyclerView.this.offsetPositionRecordsForRemove(i4, i5, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f32904d += i5;
        }

        void i(a.b bVar) {
            int i4 = bVar.f33044a;
            if (i4 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.onItemsAdded(recyclerView, bVar.f33045b, bVar.f33047d);
                return;
            }
            if (i4 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.onItemsRemoved(recyclerView2, bVar.f33045b, bVar.f33047d);
            } else if (i4 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.onItemsUpdated(recyclerView3, bVar.f33045b, bVar.f33047d, bVar.f33046c);
            } else {
                if (i4 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.onItemsMoved(recyclerView4, bVar.f33045b, bVar.f33047d, 1);
            }
        }
    }

    static /* synthetic */ class g {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f32929a;

        static {
            int[] iArr = new int[h.a.values().length];
            f32929a = iArr;
            try {
                iArr[h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32929a[h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class h<VH extends e0> {
        private final i mObservable = new i();
        private boolean mHasStableIds = false;
        private a mStateRestorationPolicy = a.ALLOW;

        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void bindViewHolder(@o0 VH vh, int i4) {
            boolean z4 = vh.mBindingAdapter == null;
            if (z4) {
                vh.mPosition = i4;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i4);
                }
                vh.setFlags(1, 519);
                p0.b("RV OnBindView");
            }
            vh.mBindingAdapter = this;
            if (RecyclerView.sDebugAssertionsEnabled) {
                if (vh.itemView.getParent() == null && x1.R0(vh.itemView) != vh.isTmpDetached()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + vh.isTmpDetached() + ", attached to window: " + vh.itemView.isAttachedToWindow() + ", holder: " + vh);
                }
                if (vh.itemView.getParent() == null && x1.R0(vh.itemView)) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + vh);
                }
            }
            onBindViewHolder(vh, i4, vh.getUnmodifiedPayloads());
            if (z4) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof LayoutParams) {
                    ((LayoutParams) layoutParams).f32894d = true;
                }
                p0.d();
            }
        }

        boolean canRestoreState() {
            int i4 = g.f32929a[this.mStateRestorationPolicy.ordinal()];
            if (i4 != 1) {
                return i4 != 2 || getItemCount() > 0;
            }
            return false;
        }

        @o0
        public final VH createViewHolder(@o0 ViewGroup viewGroup, int i4) {
            try {
                p0.b("RV CreateView");
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i4);
                if (onCreateViewHolder.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                onCreateViewHolder.mItemViewType = i4;
                Trace.endSection();
                return onCreateViewHolder;
            } catch (Throwable th) {
                p0.d();
                throw th;
            }
        }

        public int findRelativeAdapterPositionIn(@o0 h<? extends e0> hVar, @o0 e0 e0Var, int i4) {
            if (hVar == this) {
                return i4;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i4) {
            return -1L;
        }

        public int getItemViewType(int i4) {
            return 0;
        }

        @o0
        public final a getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i4) {
            this.mObservable.d(i4, 1);
        }

        public final void notifyItemInserted(int i4) {
            this.mObservable.f(i4, 1);
        }

        public final void notifyItemMoved(int i4, int i5) {
            this.mObservable.c(i4, i5);
        }

        public final void notifyItemRangeChanged(int i4, int i5) {
            this.mObservable.d(i4, i5);
        }

        public final void notifyItemRangeInserted(int i4, int i5) {
            this.mObservable.f(i4, i5);
        }

        public final void notifyItemRangeRemoved(int i4, int i5) {
            this.mObservable.g(i4, i5);
        }

        public final void notifyItemRemoved(int i4) {
            this.mObservable.g(i4, 1);
        }

        public void onAttachedToRecyclerView(@o0 RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(@o0 VH vh, int i4);

        public void onBindViewHolder(@o0 VH vh, int i4, @o0 List<Object> list) {
            onBindViewHolder(vh, i4);
        }

        @o0
        public abstract VH onCreateViewHolder(@o0 ViewGroup viewGroup, int i4);

        public void onDetachedFromRecyclerView(@o0 RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(@o0 VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(@o0 VH vh) {
        }

        public void onViewDetachedFromWindow(@o0 VH vh) {
        }

        public void onViewRecycled(@o0 VH vh) {
        }

        public void registerAdapterDataObserver(@o0 j jVar) {
            this.mObservable.registerObserver(jVar);
        }

        public void setHasStableIds(boolean z4) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z4;
        }

        public void setStateRestorationPolicy(@o0 a aVar) {
            this.mStateRestorationPolicy = aVar;
            this.mObservable.h();
        }

        public void unregisterAdapterDataObserver(@o0 j jVar) {
            this.mObservable.unregisterObserver(jVar);
        }

        public final void notifyItemChanged(int i4, @q0 Object obj) {
            this.mObservable.e(i4, 1, obj);
        }

        public final void notifyItemRangeChanged(int i4, int i5, @q0 Object obj) {
            this.mObservable.e(i4, i5, obj);
        }
    }

    static class i extends Observable<j> {
        i() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i4, int i5) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).e(i4, i5, 1);
            }
        }

        public void d(int i4, int i5) {
            e(i4, i5, null);
        }

        public void e(int i4, int i5, @q0 Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).c(i4, i5, obj);
            }
        }

        public void f(int i4, int i5) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).d(i4, i5);
            }
        }

        public void g(int i4, int i5) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).f(i4, i5);
            }
        }

        public void h() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).g();
            }
        }
    }

    public static abstract class j {
        public void a() {
        }

        public void b(int i4, int i5) {
        }

        public void c(int i4, int i5, @q0 Object obj) {
            b(i4, i5);
        }

        public void d(int i4, int i5) {
        }

        public void e(int i4, int i5, int i6) {
        }

        public void f(int i4, int i5) {
        }

        public void g() {
        }
    }

    public interface k {
        int a(int i4, int i5);
    }

    public static class l {

        /* renamed from: a, reason: collision with root package name */
        public static final int f32930a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f32931b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f32932c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f32933d = 3;

        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        @o0
        protected EdgeEffect a(@o0 RecyclerView recyclerView, int i4) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class m {
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_CHANGED = 2;
        public static final int FLAG_INVALIDATED = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_REMOVED = 8;
        private c mListener = null;
        private ArrayList<b> mFinishedListeners = new ArrayList<>();
        private long mAddDuration = 120;
        private long mRemoveDuration = 120;
        private long mMoveDuration = 250;
        private long mChangeDuration = 250;

        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public interface b {
            void a();
        }

        interface c {
            void a(@o0 e0 e0Var);
        }

        public static class d {

            /* renamed from: a, reason: collision with root package name */
            public int f32934a;

            /* renamed from: b, reason: collision with root package name */
            public int f32935b;

            /* renamed from: c, reason: collision with root package name */
            public int f32936c;

            /* renamed from: d, reason: collision with root package name */
            public int f32937d;

            /* renamed from: e, reason: collision with root package name */
            public int f32938e;

            @o0
            public d a(@o0 e0 e0Var) {
                return b(e0Var, 0);
            }

            @o0
            public d b(@o0 e0 e0Var, int i4) {
                View view = e0Var.itemView;
                this.f32934a = view.getLeft();
                this.f32935b = view.getTop();
                this.f32936c = view.getRight();
                this.f32937d = view.getBottom();
                return this;
            }
        }

        static int buildAdapterChangeFlagsForAnimations(e0 e0Var) {
            int i4 = e0Var.mFlags;
            int i5 = i4 & 14;
            if (e0Var.isInvalid()) {
                return 4;
            }
            if ((i4 & 4) != 0) {
                return i5;
            }
            int oldPosition = e0Var.getOldPosition();
            int absoluteAdapterPosition = e0Var.getAbsoluteAdapterPosition();
            return (oldPosition == -1 || absoluteAdapterPosition == -1 || oldPosition == absoluteAdapterPosition) ? i5 : i5 | 2048;
        }

        public abstract boolean animateAppearance(@o0 e0 e0Var, @q0 d dVar, @o0 d dVar2);

        public abstract boolean animateChange(@o0 e0 e0Var, @o0 e0 e0Var2, @o0 d dVar, @o0 d dVar2);

        public abstract boolean animateDisappearance(@o0 e0 e0Var, @o0 d dVar, @q0 d dVar2);

        public abstract boolean animatePersistence(@o0 e0 e0Var, @o0 d dVar, @o0 d dVar2);

        public boolean canReuseUpdatedViewHolder(@o0 e0 e0Var) {
            return true;
        }

        public final void dispatchAnimationFinished(@o0 e0 e0Var) {
            onAnimationFinished(e0Var);
            c cVar = this.mListener;
            if (cVar != null) {
                cVar.a(e0Var);
            }
        }

        public final void dispatchAnimationStarted(@o0 e0 e0Var) {
            onAnimationStarted(e0Var);
        }

        public final void dispatchAnimationsFinished() {
            int size = this.mFinishedListeners.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.mFinishedListeners.get(i4).a();
            }
            this.mFinishedListeners.clear();
        }

        public abstract void endAnimation(@o0 e0 e0Var);

        public abstract void endAnimations();

        public long getAddDuration() {
            return this.mAddDuration;
        }

        public long getChangeDuration() {
            return this.mChangeDuration;
        }

        public long getMoveDuration() {
            return this.mMoveDuration;
        }

        public long getRemoveDuration() {
            return this.mRemoveDuration;
        }

        public abstract boolean isRunning();

        public final boolean isRunning(@q0 b bVar) {
            boolean isRunning = isRunning();
            if (bVar != null) {
                if (isRunning) {
                    this.mFinishedListeners.add(bVar);
                } else {
                    bVar.a();
                }
            }
            return isRunning;
        }

        @o0
        public d obtainHolderInfo() {
            return new d();
        }

        public void onAnimationFinished(@o0 e0 e0Var) {
        }

        public void onAnimationStarted(@o0 e0 e0Var) {
        }

        @o0
        public d recordPostLayoutInformation(@o0 a0 a0Var, @o0 e0 e0Var) {
            return obtainHolderInfo().a(e0Var);
        }

        @o0
        public d recordPreLayoutInformation(@o0 a0 a0Var, @o0 e0 e0Var, int i4, @o0 List<Object> list) {
            return obtainHolderInfo().a(e0Var);
        }

        public abstract void runPendingAnimations();

        public void setAddDuration(long j4) {
            this.mAddDuration = j4;
        }

        public void setChangeDuration(long j4) {
            this.mChangeDuration = j4;
        }

        void setListener(c cVar) {
            this.mListener = cVar;
        }

        public void setMoveDuration(long j4) {
            this.mMoveDuration = j4;
        }

        public void setRemoveDuration(long j4) {
            this.mRemoveDuration = j4;
        }

        public boolean canReuseUpdatedViewHolder(@o0 e0 e0Var, @o0 List<Object> list) {
            return canReuseUpdatedViewHolder(e0Var);
        }
    }

    private class n implements m.c {
        n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m.c
        public void a(e0 e0Var) {
            e0Var.setIsRecyclable(true);
            if (e0Var.mShadowedHolder != null && e0Var.mShadowingHolder == null) {
                e0Var.mShadowedHolder = null;
            }
            e0Var.mShadowingHolder = null;
            if (e0Var.shouldBeKeptAsChild() || RecyclerView.this.removeAnimatingView(e0Var.itemView) || !e0Var.isTmpDetached()) {
                return;
            }
            RecyclerView.this.removeDetachedView(e0Var.itemView, false);
        }
    }

    public static abstract class o {
        @Deprecated
        public void getItemOffsets(@o0 Rect rect, int i4, @o0 RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(@o0 Canvas canvas, @o0 RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(@o0 Canvas canvas, @o0 RecyclerView recyclerView) {
        }

        public void getItemOffsets(@o0 Rect rect, @o0 View view, @o0 RecyclerView recyclerView, @o0 a0 a0Var) {
            getItemOffsets(rect, ((LayoutParams) view.getLayoutParams()).d(), recyclerView);
        }

        public void onDraw(@o0 Canvas canvas, @o0 RecyclerView recyclerView, @o0 a0 a0Var) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(@o0 Canvas canvas, @o0 RecyclerView recyclerView, @o0 a0 a0Var) {
            onDrawOver(canvas, recyclerView);
        }
    }

    public interface p {
        void a(@o0 View view);

        void b(@o0 View view);
    }

    public static abstract class q {
        public abstract boolean a(int i4, int i5);
    }

    public interface r {
        boolean onInterceptTouchEvent(@o0 RecyclerView recyclerView, @o0 MotionEvent motionEvent);

        void onRequestDisallowInterceptTouchEvent(boolean z4);

        void onTouchEvent(@o0 RecyclerView recyclerView, @o0 MotionEvent motionEvent);
    }

    public static abstract class s {
        public void onScrollStateChanged(@o0 RecyclerView recyclerView, int i4) {
        }

        public void onScrolled(@o0 RecyclerView recyclerView, int i4, int i5) {
        }
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface t {
    }

    public static class u {

        /* renamed from: d, reason: collision with root package name */
        private static final int f32940d = 5;

        /* renamed from: a, reason: collision with root package name */
        SparseArray<a> f32941a = new SparseArray<>();

        /* renamed from: b, reason: collision with root package name */
        int f32942b = 0;

        /* renamed from: c, reason: collision with root package name */
        Set<h<?>> f32943c = Collections.newSetFromMap(new IdentityHashMap());

        static class a {

            /* renamed from: a, reason: collision with root package name */
            final ArrayList<e0> f32944a = new ArrayList<>();

            /* renamed from: b, reason: collision with root package name */
            int f32945b = 5;

            /* renamed from: c, reason: collision with root package name */
            long f32946c = 0;

            /* renamed from: d, reason: collision with root package name */
            long f32947d = 0;

            a() {
            }
        }

        private a j(int i4) {
            a aVar = this.f32941a.get(i4);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f32941a.put(i4, aVar2);
            return aVar2;
        }

        void a() {
            this.f32942b++;
        }

        void b(@o0 h<?> hVar) {
            this.f32943c.add(hVar);
        }

        public void c() {
            for (int i4 = 0; i4 < this.f32941a.size(); i4++) {
                a valueAt = this.f32941a.valueAt(i4);
                Iterator<e0> it = valueAt.f32944a.iterator();
                while (it.hasNext()) {
                    androidx.customview.poolingcontainer.a.b(it.next().itemView);
                }
                valueAt.f32944a.clear();
            }
        }

        void d() {
            this.f32942b--;
        }

        void e(@o0 h<?> hVar, boolean z4) {
            this.f32943c.remove(hVar);
            if (this.f32943c.size() != 0 || z4) {
                return;
            }
            for (int i4 = 0; i4 < this.f32941a.size(); i4++) {
                SparseArray<a> sparseArray = this.f32941a;
                ArrayList<e0> arrayList = sparseArray.get(sparseArray.keyAt(i4)).f32944a;
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    androidx.customview.poolingcontainer.a.b(arrayList.get(i5).itemView);
                }
            }
        }

        void f(int i4, long j4) {
            a j5 = j(i4);
            j5.f32947d = m(j5.f32947d, j4);
        }

        void g(int i4, long j4) {
            a j5 = j(i4);
            j5.f32946c = m(j5.f32946c, j4);
        }

        @q0
        public e0 h(int i4) {
            a aVar = this.f32941a.get(i4);
            if (aVar == null || aVar.f32944a.isEmpty()) {
                return null;
            }
            ArrayList<e0> arrayList = aVar.f32944a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        public int i(int i4) {
            return j(i4).f32944a.size();
        }

        void k(h<?> hVar, h<?> hVar2, boolean z4) {
            if (hVar != null) {
                d();
            }
            if (!z4 && this.f32942b == 0) {
                c();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void l(e0 e0Var) {
            int itemViewType = e0Var.getItemViewType();
            ArrayList<e0> arrayList = j(itemViewType).f32944a;
            if (this.f32941a.get(itemViewType).f32945b <= arrayList.size()) {
                androidx.customview.poolingcontainer.a.b(e0Var.itemView);
            } else {
                if (RecyclerView.sDebugAssertionsEnabled && arrayList.contains(e0Var)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                e0Var.resetInternal();
                arrayList.add(e0Var);
            }
        }

        long m(long j4, long j5) {
            if (j4 == 0) {
                return j5;
            }
            return (j5 / 4) + ((j4 / 4) * 3);
        }

        public void n(int i4, int i5) {
            a j4 = j(i4);
            j4.f32945b = i5;
            ArrayList<e0> arrayList = j4.f32944a;
            while (arrayList.size() > i5) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        int o() {
            int i4 = 0;
            for (int i5 = 0; i5 < this.f32941a.size(); i5++) {
                ArrayList<e0> arrayList = this.f32941a.valueAt(i5).f32944a;
                if (arrayList != null) {
                    i4 = arrayList.size() + i4;
                }
            }
            return i4;
        }

        boolean p(int i4, long j4, long j5) {
            long j6 = j(i4).f32947d;
            return j6 == 0 || j4 + j6 < j5;
        }

        boolean q(int i4, long j4, long j5) {
            long j6 = j(i4).f32946c;
            return j6 == 0 || j4 + j6 < j5;
        }
    }

    public final class v {

        /* renamed from: j, reason: collision with root package name */
        static final int f32948j = 2;

        /* renamed from: a, reason: collision with root package name */
        final ArrayList<e0> f32949a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList<e0> f32950b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList<e0> f32951c;

        /* renamed from: d, reason: collision with root package name */
        private final List<e0> f32952d;

        /* renamed from: e, reason: collision with root package name */
        private int f32953e;

        /* renamed from: f, reason: collision with root package name */
        int f32954f;

        /* renamed from: g, reason: collision with root package name */
        u f32955g;

        /* renamed from: h, reason: collision with root package name */
        private c0 f32956h;

        public v() {
            ArrayList<e0> arrayList = new ArrayList<>();
            this.f32949a = arrayList;
            this.f32950b = null;
            this.f32951c = new ArrayList<>();
            this.f32952d = Collections.unmodifiableList(arrayList);
            this.f32953e = 2;
            this.f32954f = 2;
        }

        private void C(h<?> hVar) {
            D(hVar, false);
        }

        private void D(h<?> hVar, boolean z4) {
            u uVar = this.f32955g;
            if (uVar != null) {
                uVar.e(hVar, z4);
            }
        }

        private boolean N(@o0 e0 e0Var, int i4, int i5, long j4) {
            e0Var.mBindingAdapter = null;
            e0Var.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = e0Var.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            boolean z4 = false;
            if (j4 != Long.MAX_VALUE && !this.f32955g.p(itemViewType, nanoTime, j4)) {
                return false;
            }
            if (e0Var.isTmpDetached()) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.attachViewToParent(e0Var.itemView, recyclerView.getChildCount(), e0Var.itemView.getLayoutParams());
                z4 = true;
            }
            RecyclerView.this.mAdapter.bindViewHolder(e0Var, i4);
            if (z4) {
                RecyclerView.this.detachViewFromParent(e0Var.itemView);
            }
            this.f32955g.f(e0Var.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            b(e0Var);
            if (RecyclerView.this.mState.j()) {
                e0Var.mPreLayoutPosition = i5;
            }
            return true;
        }

        private void b(e0 e0Var) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = e0Var.itemView;
                if (x1.X(view) == 0) {
                    view.setImportantForAccessibility(1);
                }
                androidx.recyclerview.widget.b0 b0Var = RecyclerView.this.mAccessibilityDelegate;
                if (b0Var == null) {
                    return;
                }
                androidx.core.view.a r4 = b0Var.r();
                if (r4 instanceof b0.a) {
                    ((b0.a) r4).s(view);
                }
                x1.H1(view, r4);
            }
        }

        private void r(ViewGroup viewGroup, boolean z4) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    r((ViewGroup) childAt, true);
                }
            }
            if (z4) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        private void s(e0 e0Var) {
            View view = e0Var.itemView;
            if (view instanceof ViewGroup) {
                r((ViewGroup) view, false);
            }
        }

        private void v() {
            if (this.f32955g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mAdapter == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                this.f32955g.b(RecyclerView.this.mAdapter);
            }
        }

        void A() {
            v();
        }

        void B() {
            for (int i4 = 0; i4 < this.f32951c.size(); i4++) {
                androidx.customview.poolingcontainer.a.b(this.f32951c.get(i4).itemView);
            }
            D(RecyclerView.this.mAdapter, false);
        }

        void E(View view) {
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.mScrapContainer = null;
            childViewHolderInt.mInChangeScrap = false;
            childViewHolderInt.clearReturnedFromScrapFlag();
            I(childViewHolderInt);
        }

        void F() {
            for (int size = this.f32951c.size() - 1; size >= 0; size--) {
                G(size);
            }
            this.f32951c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.b();
            }
        }

        void G(int i4) {
            boolean z4 = RecyclerView.sVerboseLoggingEnabled;
            e0 e0Var = this.f32951c.get(i4);
            if (RecyclerView.sVerboseLoggingEnabled) {
                Objects.toString(e0Var);
            }
            a(e0Var, true);
            this.f32951c.remove(i4);
        }

        public void H(@o0 View view) {
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            I(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
                return;
            }
            RecyclerView.this.mItemAnimator.endAnimation(childViewHolderInt);
        }

        void I(e0 e0Var) {
            boolean z4;
            boolean z5 = true;
            if (e0Var.isScrap() || e0Var.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(e0Var.isScrap());
                sb.append(" isAttached:");
                sb.append(e0Var.itemView.getParent() != null);
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            }
            if (e0Var.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + e0Var + RecyclerView.this.exceptionLabel());
            }
            if (e0Var.shouldIgnore()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.exceptionLabel());
            }
            boolean doesTransientStatePreventRecycling = e0Var.doesTransientStatePreventRecycling();
            h hVar = RecyclerView.this.mAdapter;
            boolean z6 = hVar != null && doesTransientStatePreventRecycling && hVar.onFailedToRecycleView(e0Var);
            if (RecyclerView.sDebugAssertionsEnabled && this.f32951c.contains(e0Var)) {
                throw new IllegalArgumentException("cached view received recycle internal? " + e0Var + RecyclerView.this.exceptionLabel());
            }
            if (z6 || e0Var.isRecyclable()) {
                if (this.f32954f <= 0 || e0Var.hasAnyOfTheFlags(526)) {
                    z4 = false;
                } else {
                    int size = this.f32951c.size();
                    if (size >= this.f32954f && size > 0) {
                        G(0);
                        size--;
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.d(e0Var.mPosition)) {
                        int i4 = size - 1;
                        while (i4 >= 0) {
                            if (!RecyclerView.this.mPrefetchRegistry.d(this.f32951c.get(i4).mPosition)) {
                                break;
                            } else {
                                i4--;
                            }
                        }
                        size = i4 + 1;
                    }
                    this.f32951c.add(size, e0Var);
                    z4 = true;
                }
                if (z4) {
                    z5 = false;
                } else {
                    a(e0Var, true);
                }
                r1 = z4;
            } else {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    RecyclerView.this.exceptionLabel();
                }
                z5 = false;
            }
            RecyclerView.this.mViewInfoStore.q(e0Var);
            if (r1 || z5 || !doesTransientStatePreventRecycling) {
                return;
            }
            androidx.customview.poolingcontainer.a.b(e0Var.itemView);
            e0Var.mBindingAdapter = null;
            e0Var.mOwnerRecyclerView = null;
        }

        void J(View view) {
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.hasAnyOfTheFlags(12) && childViewHolderInt.isUpdated() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f32950b == null) {
                    this.f32950b = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f32950b.add(childViewHolderInt);
                return;
            }
            if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || RecyclerView.this.mAdapter.hasStableIds()) {
                childViewHolderInt.setScrapContainer(this, false);
                this.f32949a.add(childViewHolderInt);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.exceptionLabel());
            }
        }

        void K(u uVar) {
            D(RecyclerView.this.mAdapter, false);
            u uVar2 = this.f32955g;
            if (uVar2 != null) {
                uVar2.d();
            }
            this.f32955g = uVar;
            if (uVar != null && RecyclerView.this.getAdapter() != null) {
                this.f32955g.a();
            }
            v();
        }

        void L(c0 c0Var) {
            this.f32956h = c0Var;
        }

        public void M(int i4) {
            this.f32953e = i4;
            Q();
        }

        /* JADX WARN: Removed duplicated region for block: B:104:0x01d6  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0174  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0191  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x01b4  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0215  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x023f A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0223  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x01c3  */
        @androidx.annotation.q0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        androidx.recyclerview.widget.RecyclerView.e0 O(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 622
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.O(int, boolean, long):androidx.recyclerview.widget.RecyclerView$e0");
        }

        void P(e0 e0Var) {
            if (e0Var.mInChangeScrap) {
                this.f32950b.remove(e0Var);
            } else {
                this.f32949a.remove(e0Var);
            }
            e0Var.mScrapContainer = null;
            e0Var.mInChangeScrap = false;
            e0Var.clearReturnedFromScrapFlag();
        }

        void Q() {
            LayoutManager layoutManager = RecyclerView.this.mLayout;
            this.f32954f = this.f32953e + (layoutManager != null ? layoutManager.mPrefetchMaxCountObserved : 0);
            for (int size = this.f32951c.size() - 1; size >= 0 && this.f32951c.size() > this.f32954f; size--) {
                G(size);
            }
        }

        boolean R(e0 e0Var) {
            if (e0Var.isRemoved()) {
                if (!RecyclerView.sDebugAssertionsEnabled || RecyclerView.this.mState.j()) {
                    return RecyclerView.this.mState.j();
                }
                throw new IllegalStateException("should not receive a removed view unless it is pre layout" + RecyclerView.this.exceptionLabel());
            }
            int i4 = e0Var.mPosition;
            if (i4 < 0 || i4 >= RecyclerView.this.mAdapter.getItemCount()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + e0Var + RecyclerView.this.exceptionLabel());
            }
            if (RecyclerView.this.mState.j() || RecyclerView.this.mAdapter.getItemViewType(e0Var.mPosition) == e0Var.getItemViewType()) {
                return !RecyclerView.this.mAdapter.hasStableIds() || e0Var.getItemId() == RecyclerView.this.mAdapter.getItemId(e0Var.mPosition);
            }
            return false;
        }

        void S(int i4, int i5) {
            int i6;
            int i7 = i5 + i4;
            for (int size = this.f32951c.size() - 1; size >= 0; size--) {
                e0 e0Var = this.f32951c.get(size);
                if (e0Var != null && (i6 = e0Var.mPosition) >= i4 && i6 < i7) {
                    e0Var.addFlags(2);
                    G(size);
                }
            }
        }

        void a(@o0 e0 e0Var, boolean z4) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(e0Var);
            View view = e0Var.itemView;
            androidx.recyclerview.widget.b0 b0Var = RecyclerView.this.mAccessibilityDelegate;
            if (b0Var != null) {
                androidx.core.view.a r4 = b0Var.r();
                x1.H1(view, r4 instanceof b0.a ? ((b0.a) r4).r(view) : null);
            }
            if (z4) {
                h(e0Var);
            }
            e0Var.mBindingAdapter = null;
            e0Var.mOwnerRecyclerView = null;
            j().l(e0Var);
        }

        public void c(@o0 View view, int i4) {
            LayoutParams layoutParams;
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null) {
                throw new IllegalArgumentException("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter" + RecyclerView.this.exceptionLabel());
            }
            int o4 = RecyclerView.this.mAdapterHelper.o(i4, 0);
            if (o4 < 0 || o4 >= RecyclerView.this.mAdapter.getItemCount()) {
                StringBuilder a5 = n1.a("Inconsistency detected. Invalid item position ", i4, "(offset:", o4, ").state:");
                a5.append(RecyclerView.this.mState.d());
                a5.append(RecyclerView.this.exceptionLabel());
                throw new IndexOutOfBoundsException(a5.toString());
            }
            N(childViewHolderInt, o4, i4, Long.MAX_VALUE);
            ViewGroup.LayoutParams layoutParams2 = childViewHolderInt.itemView.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams = (LayoutParams) RecyclerView.this.generateDefaultLayoutParams();
                childViewHolderInt.itemView.setLayoutParams(layoutParams);
            } else if (RecyclerView.this.checkLayoutParams(layoutParams2)) {
                layoutParams = (LayoutParams) layoutParams2;
            } else {
                layoutParams = (LayoutParams) RecyclerView.this.generateLayoutParams(layoutParams2);
                childViewHolderInt.itemView.setLayoutParams(layoutParams);
            }
            layoutParams.f32894d = true;
            layoutParams.f32892b = childViewHolderInt;
            layoutParams.f32895e = childViewHolderInt.itemView.getParent() == null;
        }

        public void d() {
            this.f32949a.clear();
            F();
        }

        void e() {
            int size = this.f32951c.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.f32951c.get(i4).clearOldPosition();
            }
            int size2 = this.f32949a.size();
            for (int i5 = 0; i5 < size2; i5++) {
                this.f32949a.get(i5).clearOldPosition();
            }
            ArrayList<e0> arrayList = this.f32950b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    this.f32950b.get(i6).clearOldPosition();
                }
            }
        }

        void f() {
            this.f32949a.clear();
            ArrayList<e0> arrayList = this.f32950b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int g(int i4) {
            if (i4 >= 0 && i4 < RecyclerView.this.mState.d()) {
                return !RecyclerView.this.mState.j() ? i4 : RecyclerView.this.mAdapterHelper.o(i4, 0);
            }
            StringBuilder a5 = androidx.collection.s.a("invalid position ", i4, ". State item count is ");
            a5.append(RecyclerView.this.mState.d());
            a5.append(RecyclerView.this.exceptionLabel());
            throw new IndexOutOfBoundsException(a5.toString());
        }

        void h(@o0 e0 e0Var) {
            w wVar = RecyclerView.this.mRecyclerListener;
            if (wVar != null) {
                wVar.a(e0Var);
            }
            int size = RecyclerView.this.mRecyclerListeners.size();
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.this.mRecyclerListeners.get(i4).a(e0Var);
            }
            h hVar = RecyclerView.this.mAdapter;
            if (hVar != null) {
                hVar.onViewRecycled(e0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.q(e0Var);
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Objects.toString(e0Var);
            }
        }

        e0 i(int i4) {
            int size;
            int o4;
            ArrayList<e0> arrayList = this.f32950b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i5 = 0; i5 < size; i5++) {
                    e0 e0Var = this.f32950b.get(i5);
                    if (!e0Var.wasReturnedFromScrap() && e0Var.getLayoutPosition() == i4) {
                        e0Var.addFlags(32);
                        return e0Var;
                    }
                }
                if (RecyclerView.this.mAdapter.hasStableIds() && (o4 = RecyclerView.this.mAdapterHelper.o(i4, 0)) > 0 && o4 < RecyclerView.this.mAdapter.getItemCount()) {
                    long itemId = RecyclerView.this.mAdapter.getItemId(o4);
                    for (int i6 = 0; i6 < size; i6++) {
                        e0 e0Var2 = this.f32950b.get(i6);
                        if (!e0Var2.wasReturnedFromScrap() && e0Var2.getItemId() == itemId) {
                            e0Var2.addFlags(32);
                            return e0Var2;
                        }
                    }
                }
            }
            return null;
        }

        u j() {
            if (this.f32955g == null) {
                this.f32955g = new u();
                v();
            }
            return this.f32955g;
        }

        int k() {
            return this.f32949a.size();
        }

        @o0
        public List<e0> l() {
            return this.f32952d;
        }

        e0 m(long j4, int i4, boolean z4) {
            for (int size = this.f32949a.size() - 1; size >= 0; size--) {
                e0 e0Var = this.f32949a.get(size);
                if (e0Var.getItemId() == j4 && !e0Var.wasReturnedFromScrap()) {
                    if (i4 == e0Var.getItemViewType()) {
                        e0Var.addFlags(32);
                        if (e0Var.isRemoved() && !RecyclerView.this.mState.j()) {
                            e0Var.setFlags(2, 14);
                        }
                        return e0Var;
                    }
                    if (!z4) {
                        this.f32949a.remove(size);
                        RecyclerView.this.removeDetachedView(e0Var.itemView, false);
                        E(e0Var.itemView);
                    }
                }
            }
            int size2 = this.f32951c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                e0 e0Var2 = this.f32951c.get(size2);
                if (e0Var2.getItemId() == j4 && !e0Var2.isAttachedToTransitionOverlay()) {
                    if (i4 == e0Var2.getItemViewType()) {
                        if (!z4) {
                            this.f32951c.remove(size2);
                        }
                        return e0Var2;
                    }
                    if (!z4) {
                        G(size2);
                        return null;
                    }
                }
            }
        }

        e0 n(int i4, boolean z4) {
            View e4;
            int size = this.f32949a.size();
            for (int i5 = 0; i5 < size; i5++) {
                e0 e0Var = this.f32949a.get(i5);
                if (!e0Var.wasReturnedFromScrap() && e0Var.getLayoutPosition() == i4 && !e0Var.isInvalid() && (RecyclerView.this.mState.f32908h || !e0Var.isRemoved())) {
                    e0Var.addFlags(32);
                    return e0Var;
                }
            }
            if (!z4 && (e4 = RecyclerView.this.mChildHelper.e(i4)) != null) {
                e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(e4);
                RecyclerView.this.mChildHelper.s(e4);
                int m4 = RecyclerView.this.mChildHelper.m(e4);
                if (m4 != -1) {
                    RecyclerView.this.mChildHelper.d(m4);
                    J(e4);
                    childViewHolderInt.addFlags(8224);
                    return childViewHolderInt;
                }
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + childViewHolderInt + RecyclerView.this.exceptionLabel());
            }
            int size2 = this.f32951c.size();
            for (int i6 = 0; i6 < size2; i6++) {
                e0 e0Var2 = this.f32951c.get(i6);
                if (!e0Var2.isInvalid() && e0Var2.getLayoutPosition() == i4 && !e0Var2.isAttachedToTransitionOverlay()) {
                    if (!z4) {
                        this.f32951c.remove(i6);
                    }
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        e0Var2.toString();
                    }
                    return e0Var2;
                }
            }
            return null;
        }

        View o(int i4) {
            return this.f32949a.get(i4).itemView;
        }

        @o0
        public View p(int i4) {
            return q(i4, false);
        }

        View q(int i4, boolean z4) {
            return O(i4, z4, Long.MAX_VALUE).itemView;
        }

        void t() {
            int size = this.f32951c.size();
            for (int i4 = 0; i4 < size; i4++) {
                LayoutParams layoutParams = (LayoutParams) this.f32951c.get(i4).itemView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.f32894d = true;
                }
            }
        }

        void u() {
            int size = this.f32951c.size();
            for (int i4 = 0; i4 < size; i4++) {
                e0 e0Var = this.f32951c.get(i4);
                if (e0Var != null) {
                    e0Var.addFlags(6);
                    e0Var.addChangePayload(null);
                }
            }
            h hVar = RecyclerView.this.mAdapter;
            if (hVar == null || !hVar.hasStableIds()) {
                F();
            }
        }

        void w(int i4, int i5) {
            int size = this.f32951c.size();
            for (int i6 = 0; i6 < size; i6++) {
                e0 e0Var = this.f32951c.get(i6);
                if (e0Var != null && e0Var.mPosition >= i4) {
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        e0Var.toString();
                    }
                    e0Var.offsetPosition(i5, false);
                }
            }
        }

        void x(int i4, int i5) {
            int i6;
            int i7;
            int i10;
            int i11;
            if (i4 < i5) {
                i6 = -1;
                i10 = i4;
                i7 = i5;
            } else {
                i6 = 1;
                i7 = i4;
                i10 = i5;
            }
            int size = this.f32951c.size();
            for (int i12 = 0; i12 < size; i12++) {
                e0 e0Var = this.f32951c.get(i12);
                if (e0Var != null && (i11 = e0Var.mPosition) >= i10 && i11 <= i7) {
                    if (i11 == i4) {
                        e0Var.offsetPosition(i5 - i4, false);
                    } else {
                        e0Var.offsetPosition(i6, false);
                    }
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        e0Var.toString();
                    }
                }
            }
        }

        void y(int i4, int i5, boolean z4) {
            int i6 = i4 + i5;
            for (int size = this.f32951c.size() - 1; size >= 0; size--) {
                e0 e0Var = this.f32951c.get(size);
                if (e0Var != null) {
                    int i7 = e0Var.mPosition;
                    if (i7 >= i6) {
                        if (RecyclerView.sVerboseLoggingEnabled) {
                            e0Var.toString();
                        }
                        e0Var.offsetPosition(-i5, z4);
                    } else if (i7 >= i4) {
                        e0Var.addFlags(8);
                        G(size);
                    }
                }
            }
        }

        void z(h<?> hVar, h<?> hVar2, boolean z4) {
            d();
            D(hVar, true);
            j().k(hVar, hVar2, z4);
            v();
        }
    }

    public interface w {
        void a(@o0 e0 e0Var);
    }

    private class x extends j {
        x() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f32907g = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (RecyclerView.this.mAdapterHelper.q()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i4, int i5, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.s(i4, i5, obj)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i4, int i5) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.t(i4, i5)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i4, int i5, int i6) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.u(i4, i5, i6)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i4, int i5) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.v(i4, i5)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void g() {
            h hVar;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mPendingSavedState == null || (hVar = recyclerView.mAdapter) == null || !hVar.canRestoreState()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        void h() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    x1.v1(recyclerView, recyclerView.mUpdateChildViewsRunnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }
    }

    public static class y implements r {
        @Override // androidx.recyclerview.widget.RecyclerView.r
        public boolean onInterceptTouchEvent(@o0 RecyclerView recyclerView, @o0 MotionEvent motionEvent) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void onRequestDisallowInterceptTouchEvent(boolean z4) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void onTouchEvent(@o0 RecyclerView recyclerView, @o0 MotionEvent motionEvent) {
        }
    }

    public static abstract class z {
        private LayoutManager mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private boolean mRunning;
        private boolean mStarted;
        private View mTargetView;
        private int mTargetPosition = -1;
        private final a mRecyclingAction = new a(0, 0);

        public static class a {

            /* renamed from: h, reason: collision with root package name */
            public static final int f32959h = Integer.MIN_VALUE;

            /* renamed from: a, reason: collision with root package name */
            private int f32960a;

            /* renamed from: b, reason: collision with root package name */
            private int f32961b;

            /* renamed from: c, reason: collision with root package name */
            private int f32962c;

            /* renamed from: d, reason: collision with root package name */
            private int f32963d;

            /* renamed from: e, reason: collision with root package name */
            private Interpolator f32964e;

            /* renamed from: f, reason: collision with root package name */
            private boolean f32965f;

            /* renamed from: g, reason: collision with root package name */
            private int f32966g;

            public a(@u0 int i4, @u0 int i5) {
                this(i4, i5, Integer.MIN_VALUE, null);
            }

            private void m() {
                if (this.f32964e != null && this.f32962c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f32962c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public int a() {
                return this.f32962c;
            }

            @u0
            public int b() {
                return this.f32960a;
            }

            @u0
            public int c() {
                return this.f32961b;
            }

            @q0
            public Interpolator d() {
                return this.f32964e;
            }

            boolean e() {
                return this.f32963d >= 0;
            }

            public void f(int i4) {
                this.f32963d = i4;
            }

            void g(RecyclerView recyclerView) {
                int i4 = this.f32963d;
                if (i4 >= 0) {
                    this.f32963d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i4);
                    this.f32965f = false;
                } else {
                    if (!this.f32965f) {
                        this.f32966g = 0;
                        return;
                    }
                    m();
                    recyclerView.mViewFlinger.e(this.f32960a, this.f32961b, this.f32962c, this.f32964e);
                    this.f32966g++;
                    this.f32965f = false;
                }
            }

            public void h(int i4) {
                this.f32965f = true;
                this.f32962c = i4;
            }

            public void i(@u0 int i4) {
                this.f32965f = true;
                this.f32960a = i4;
            }

            public void j(@u0 int i4) {
                this.f32965f = true;
                this.f32961b = i4;
            }

            public void k(@q0 Interpolator interpolator) {
                this.f32965f = true;
                this.f32964e = interpolator;
            }

            public void l(@u0 int i4, @u0 int i5, int i6, @q0 Interpolator interpolator) {
                this.f32960a = i4;
                this.f32961b = i5;
                this.f32962c = i6;
                this.f32964e = interpolator;
                this.f32965f = true;
            }

            public a(@u0 int i4, @u0 int i5, int i6) {
                this(i4, i5, i6, null);
            }

            public a(@u0 int i4, @u0 int i5, int i6, @q0 Interpolator interpolator) {
                this.f32963d = -1;
                this.f32965f = false;
                this.f32966g = 0;
                this.f32960a = i4;
                this.f32961b = i5;
                this.f32962c = i6;
                this.f32964e = interpolator;
            }
        }

        public interface b {
            @q0
            PointF computeScrollVectorForPosition(int i4);
        }

        @q0
        public PointF computeScrollVectorForPosition(int i4) {
            Object layoutManager = getLayoutManager();
            if (layoutManager instanceof b) {
                return ((b) layoutManager).computeScrollVectorForPosition(i4);
            }
            return null;
        }

        public View findViewByPosition(int i4) {
            return this.mRecyclerView.mLayout.findViewByPosition(i4);
        }

        public int getChildCount() {
            return this.mRecyclerView.mLayout.getChildCount();
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.getChildLayoutPosition(view);
        }

        @q0
        public LayoutManager getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        @Deprecated
        public void instantScrollToPosition(int i4) {
            this.mRecyclerView.scrollToPosition(i4);
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        protected void normalize(@o0 PointF pointF) {
            float f4 = pointF.x;
            float f5 = pointF.y;
            float sqrt = (float) Math.sqrt((f5 * f5) + (f4 * f4));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        void onAnimation(int i4, int i5) {
            PointF computeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (computeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
                float f4 = computeScrollVectorForPosition.x;
                if (f4 != 0.0f || computeScrollVectorForPosition.y != 0.0f) {
                    recyclerView.scrollStep((int) Math.signum(f4), (int) Math.signum(computeScrollVectorForPosition.y), null);
                }
            }
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                    this.mRecyclingAction.g(recyclerView);
                    stop();
                } else {
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i4, i5, recyclerView.mState, this.mRecyclingAction);
                boolean e4 = this.mRecyclingAction.e();
                this.mRecyclingAction.g(recyclerView);
                if (e4 && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.mViewFlinger.d();
                }
            }
        }

        protected void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
                boolean z4 = RecyclerView.sVerboseLoggingEnabled;
            }
        }

        protected abstract void onSeekTargetStep(@u0 int i4, @u0 int i5, @o0 a0 a0Var, @o0 a aVar);

        protected abstract void onStart();

        protected abstract void onStop();

        protected abstract void onTargetFound(@o0 View view, @o0 a0 a0Var, @o0 a aVar);

        public void setTargetPosition(int i4) {
            this.mTargetPosition = i4;
        }

        void start(RecyclerView recyclerView, LayoutManager layoutManager) {
            recyclerView.mViewFlinger.f();
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = layoutManager;
            int i4 = this.mTargetPosition;
            if (i4 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.mState.f32901a = i4;
            this.mRunning = true;
            this.mPendingInitialRun = true;
            this.mTargetView = findViewByPosition(getTargetPosition());
            onStart();
            this.mRecyclerView.mViewFlinger.d();
            this.mStarted = true;
        }

        protected final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.mState.f32901a = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mLayoutManager.onSmoothScrollerStopped(this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }
    }

    static {
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new c();
        sDefaultEdgeEffectFactory = new b0();
    }

    public RecyclerView(@o0 Context context) {
        this(context, null);
    }

    private void addAnimatingView(e0 e0Var) {
        View view = e0Var.itemView;
        boolean z4 = view.getParent() == this;
        this.mRecycler.P(getChildViewHolder(view));
        if (e0Var.isTmpDetached()) {
            this.mChildHelper.c(view, -1, view.getLayoutParams(), true);
        } else if (z4) {
            this.mChildHelper.k(view);
        } else {
            this.mChildHelper.b(view, true);
        }
    }

    private void animateChange(@o0 e0 e0Var, @o0 e0 e0Var2, @o0 m.d dVar, @o0 m.d dVar2, boolean z4, boolean z5) {
        e0Var.setIsRecyclable(false);
        if (z4) {
            addAnimatingView(e0Var);
        }
        if (e0Var != e0Var2) {
            if (z5) {
                addAnimatingView(e0Var2);
            }
            e0Var.mShadowedHolder = e0Var2;
            addAnimatingView(e0Var);
            this.mRecycler.P(e0Var);
            e0Var2.setIsRecyclable(false);
            e0Var2.mShadowingHolder = e0Var;
        }
        if (this.mItemAnimator.animateChange(e0Var, e0Var2, dVar, dVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    static void clearNestedRecyclerViewIfNotNested(@o0 e0 e0Var) {
        WeakReference<RecyclerView> weakReference = e0Var.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == e0Var.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            e0Var.mNestedRecyclerView = null;
        }
    }

    private int consumeFlingInStretch(int i4, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i5) {
        if (i4 > 0 && edgeEffect != null && androidx.core.widget.i.d(edgeEffect) != 0.0f) {
            int round = Math.round(androidx.core.widget.i.j(edgeEffect, ((-i4) * 4.0f) / i5, 0.5f) * ((-i5) / 4.0f));
            if (round != i4) {
                edgeEffect.finish();
            }
            return i4 - round;
        }
        if (i4 >= 0 || edgeEffect2 == null || androidx.core.widget.i.d(edgeEffect2) == 0.0f) {
            return i4;
        }
        float f4 = i5;
        int round2 = Math.round(androidx.core.widget.i.j(edgeEffect2, (i4 * 4.0f) / f4, 0.5f) * (f4 / 4.0f));
        if (round2 != i4) {
            edgeEffect2.finish();
        }
        return i4 - round2;
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i4, int i5) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, trim);
            try {
                Class<? extends U> asSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(LayoutManager.class);
                try {
                    constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i4), Integer.valueOf(i5)};
                } catch (NoSuchMethodException e4) {
                    objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e5) {
                        e5.initCause(e4);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e5);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((LayoutManager) constructor.newInstance(objArr));
            } catch (ClassCastException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e6);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e7);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e10);
            } catch (InstantiationException e11) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e11);
            } catch (InvocationTargetException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e12);
            }
        }
    }

    private boolean didChildRangeChange(int i4, int i5) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i4 && iArr[1] == i5) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i4 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i4 == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        obtain.setContentChangeTypes(i4);
        sendAccessibilityEventUnchecked(obtain);
    }

    private void dispatchLayoutStep1() {
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f32910j = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.f();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        a0 a0Var = this.mState;
        a0Var.f32909i = a0Var.f32911k && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        a0Var.f32908h = a0Var.f32912l;
        a0Var.f32906f = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f32911k) {
            int g4 = this.mChildHelper.g();
            for (int i4 = 0; i4 < g4; i4++) {
                e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i4));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    this.mViewInfoStore.e(childViewHolderInt, this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt, m.buildAdapterChangeFlagsForAnimations(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads()));
                    if (this.mState.f32909i && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.c(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f32912l) {
            saveOldPositions();
            a0 a0Var2 = this.mState;
            boolean z4 = a0Var2.f32907g;
            a0Var2.f32907g = false;
            this.mLayout.onLayoutChildren(this.mRecycler, a0Var2);
            this.mState.f32907g = z4;
            for (int i5 = 0; i5 < this.mChildHelper.g(); i5++) {
                e0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.f(i5));
                if (!childViewHolderInt2.shouldIgnore() && !this.mViewInfoStore.i(childViewHolderInt2)) {
                    int buildAdapterChangeFlagsForAnimations = m.buildAdapterChangeFlagsForAnimations(childViewHolderInt2);
                    boolean hasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    if (!hasAnyOfTheFlags) {
                        buildAdapterChangeFlagsForAnimations |= 4096;
                    }
                    m.d recordPreLayoutInformation = this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt2, buildAdapterChangeFlagsForAnimations, childViewHolderInt2.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, recordPreLayoutInformation);
                    } else {
                        this.mViewInfoStore.a(childViewHolderInt2, recordPreLayoutInformation);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f32905e = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.k();
        this.mState.f32906f = this.mAdapter.getItemCount();
        this.mState.f32904d = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f32896d;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        a0 a0Var = this.mState;
        a0Var.f32908h = false;
        this.mLayout.onLayoutChildren(this.mRecycler, a0Var);
        a0 a0Var2 = this.mState;
        a0Var2.f32907g = false;
        a0Var2.f32911k = a0Var2.f32911k && this.mItemAnimator != null;
        a0Var2.f32905e = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        a0 a0Var = this.mState;
        a0Var.f32905e = 1;
        if (a0Var.f32911k) {
            for (int g4 = this.mChildHelper.g() - 1; g4 >= 0; g4--) {
                e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(g4));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    m.d recordPostLayoutInformation = this.mItemAnimator.recordPostLayoutInformation(this.mState, childViewHolderInt);
                    e0 g5 = this.mViewInfoStore.g(changedHolderKey);
                    if (g5 == null || g5.shouldIgnore()) {
                        this.mViewInfoStore.d(childViewHolderInt, recordPostLayoutInformation);
                    } else {
                        boolean h4 = this.mViewInfoStore.h(g5);
                        boolean h5 = this.mViewInfoStore.h(childViewHolderInt);
                        if (h4 && g5 == childViewHolderInt) {
                            this.mViewInfoStore.d(childViewHolderInt, recordPostLayoutInformation);
                        } else {
                            m.d n4 = this.mViewInfoStore.n(g5);
                            this.mViewInfoStore.d(childViewHolderInt, recordPostLayoutInformation);
                            m.d m4 = this.mViewInfoStore.m(childViewHolderInt);
                            if (n4 == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, g5);
                            } else {
                                animateChange(g5, childViewHolderInt, n4, m4, h4, h5);
                            }
                        }
                    }
                }
            }
            this.mViewInfoStore.o(this.mViewInfoProcessCallback);
        }
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        a0 a0Var2 = this.mState;
        a0Var2.f32903c = a0Var2.f32906f;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        a0Var2.f32911k = false;
        a0Var2.f32912l = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList<e0> arrayList = this.mRecycler.f32950b;
        if (arrayList != null) {
            arrayList.clear();
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager.mPrefetchMaxObservedInInitialPrefetch) {
            layoutManager.mPrefetchMaxCountObserved = 0;
            layoutManager.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.Q();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.f();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        r rVar = this.mInterceptingOnItemTouchListener;
        if (rVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        rVar.onTouchEvent(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i4 = 0; i4 < size; i4++) {
            r rVar = this.mOnItemTouchListeners.get(i4);
            if (rVar.onInterceptTouchEvent(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = rVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int g4 = this.mChildHelper.g();
        if (g4 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        for (int i6 = 0; i6 < g4; i6++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i6));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i4) {
                    i4 = layoutPosition;
                }
                if (layoutPosition > i5) {
                    i5 = layoutPosition;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
    }

    @q0
    static RecyclerView findNestedRecyclerView(@o0 View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i4));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    @q0
    private View findNextViewToFocus() {
        e0 findViewHolderForAdapterPosition;
        a0 a0Var = this.mState;
        int i4 = a0Var.f32913m;
        if (i4 == -1) {
            i4 = 0;
        }
        int d5 = a0Var.d();
        for (int i5 = i4; i5 < d5; i5++) {
            e0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i5);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition2.itemView;
            }
        }
        int min = Math.min(d5, i4);
        do {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
        } while (!findViewHolderForAdapterPosition.itemView.hasFocusable());
        return findViewHolderForAdapterPosition.itemView;
    }

    static e0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f32892b;
    }

    static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.f32893c;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private y0 getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new y0(this);
        }
        return this.mScrollingChildHelper;
    }

    private float getSplineFlingDistance(int i4) {
        double log = Math.log((Math.abs(i4) * INFLEXION) / (this.mPhysicalCoef * SCROLL_FRICTION));
        float f4 = DECELERATION_RATE;
        return (float) (Math.exp((f4 / (f4 - 1.0d)) * log) * this.mPhysicalCoef * SCROLL_FRICTION);
    }

    private void handleMissingPreInfoForChangeError(long j4, e0 e0Var, e0 e0Var2) {
        int g4 = this.mChildHelper.g();
        for (int i4 = 0; i4 < g4; i4++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i4));
            if (childViewHolderInt != e0Var && getChangedHolderKey(childViewHolderInt) == j4) {
                h hVar = this.mAdapter;
                if (hVar == null || !hVar.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + e0Var + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + e0Var + exceptionLabel());
            }
        }
        Objects.toString(e0Var2);
        Objects.toString(e0Var);
        exceptionLabel();
    }

    private boolean hasUpdatedView() {
        int g4 = this.mChildHelper.g();
        for (int i4 = 0; i4 < g4; i4++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (x1.Y(this) == 0) {
            x1.b2(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new androidx.recyclerview.widget.g(new e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i4) {
        int i5;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c5 = 65535;
        int i6 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i7 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i10 = rect2.left;
        if ((i7 < i10 || rect.right <= i10) && rect.right < rect2.right) {
            i5 = 1;
        } else {
            int i11 = rect.right;
            int i12 = rect2.right;
            i5 = ((i11 > i12 || i7 >= i12) && i7 > i10) ? -1 : 0;
        }
        int i13 = rect.top;
        int i14 = rect2.top;
        if ((i13 < i14 || rect.bottom <= i14) && rect.bottom < rect2.bottom) {
            c5 = 1;
        } else {
            int i15 = rect.bottom;
            int i16 = rect2.bottom;
            if ((i15 <= i16 && i13 < i16) || i13 <= i14) {
                c5 = 0;
            }
        }
        if (i4 == 1) {
            return c5 < 0 || (c5 == 0 && i5 * i6 < 0);
        }
        if (i4 == 2) {
            return c5 > 0 || (c5 == 0 && i5 * i6 > 0);
        }
        if (i4 == 17) {
            return i5 < 0;
        }
        if (i4 == 33) {
            return c5 < 0;
        }
        if (i4 == 66) {
            return i5 > 0;
        }
        if (i4 == 130) {
            return c5 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i4 + exceptionLabel());
    }

    private void nestedScrollByInternal(int i4, int i5, @q0 MotionEvent motionEvent, int i6) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null || this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean canScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        int i7 = canScrollVertically ? (canScrollHorizontally ? 1 : 0) | 2 : canScrollHorizontally ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int releaseHorizontalGlow = i4 - releaseHorizontalGlow(i4, height);
        int releaseVerticalGlow = i5 - releaseVerticalGlow(i5, width);
        startNestedScroll(i7, i6);
        if (dispatchNestedPreScroll(canScrollHorizontally ? releaseHorizontalGlow : 0, canScrollVertically ? releaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, i6)) {
            int[] iArr2 = this.mReusableIntPair;
            releaseHorizontalGlow -= iArr2[0];
            releaseVerticalGlow -= iArr2[1];
        }
        scrollByInternal(canScrollHorizontally ? releaseHorizontalGlow : 0, canScrollVertically ? releaseVerticalGlow : 0, motionEvent, i6);
        androidx.recyclerview.widget.n nVar = this.mGapWorker;
        if (nVar != null && (releaseHorizontalGlow != 0 || releaseVerticalGlow != 0)) {
            nVar.f(this, releaseHorizontalGlow, releaseVerticalGlow);
        }
        stopNestedScroll(i6);
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i4 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i4);
            int x4 = (int) (motionEvent.getX(i4) + 0.5f);
            this.mLastTouchX = x4;
            this.mInitialTouchX = x4;
            int y4 = (int) (motionEvent.getY(i4) + 0.5f);
            this.mLastTouchY = y4;
            this.mInitialTouchY = y4;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z4;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.z();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.x();
        } else {
            this.mAdapterHelper.k();
        }
        boolean z5 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f32911k = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z4 = this.mDataSetHasChangedAfterLayout) || z5 || this.mLayout.mRequestedSimpleAnimations) && (!z4 || this.mAdapter.hasStableIds());
        a0 a0Var = this.mState;
        a0Var.f32912l = a0Var.f32911k && z5 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r1 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            androidx.core.widget.i.j(r1, r4, r9)
        L1f:
            r9 = r3
            goto L3c
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r1 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.i.j(r1, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            androidx.core.widget.i.j(r9, r1, r7)
            goto L72
        L56:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L71
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            androidx.core.widget.i.j(r9, r1, r2)
            goto L72
        L71:
            r3 = r9
        L72:
            if (r3 != 0) goto L7c
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7f
        L7c:
            androidx.core.view.x1.t1(r6)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void recoverFocusFromState() {
        View findViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.mChildHelper.n(focusedChild)) {
                    return;
                }
            } else if (this.mChildHelper.g() == 0) {
                requestFocus();
                return;
            }
        }
        View view = null;
        e0 findViewHolderForItemId = (this.mState.f32914n == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.f32914n);
        if (findViewHolderForItemId != null && !this.mChildHelper.n(findViewHolderForItemId.itemView) && findViewHolderForItemId.itemView.hasFocusable()) {
            view = findViewHolderForItemId.itemView;
        } else if (this.mChildHelper.g() > 0) {
            view = findNextViewToFocus();
        }
        if (view != null) {
            int i4 = this.mState.f32915o;
            if (i4 != -1 && (findViewById = view.findViewById(i4)) != null && findViewById.isFocusable()) {
                view = findViewById;
            }
            view.requestFocus();
        }
    }

    private void releaseGlows() {
        boolean z4;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z4 = this.mLeftGlow.isFinished();
        } else {
            z4 = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z4 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z4 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z4 |= this.mBottomGlow.isFinished();
        }
        if (z4) {
            x1.t1(this);
        }
    }

    private int releaseHorizontalGlow(int i4, float f4) {
        float height = f4 / getHeight();
        float width = i4 / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f5 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.i.d(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && androidx.core.widget.i.d(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float j4 = androidx.core.widget.i.j(this.mRightGlow, width, height);
                    if (androidx.core.widget.i.d(this.mRightGlow) == 0.0f) {
                        this.mRightGlow.onRelease();
                    }
                    f5 = j4;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f6 = -androidx.core.widget.i.j(this.mLeftGlow, -width, 1.0f - height);
                if (androidx.core.widget.i.d(this.mLeftGlow) == 0.0f) {
                    this.mLeftGlow.onRelease();
                }
                f5 = f6;
            }
            invalidate();
        }
        return Math.round(f5 * getWidth());
    }

    private int releaseVerticalGlow(int i4, float f4) {
        float width = f4 / getWidth();
        float height = i4 / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f5 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.i.d(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && androidx.core.widget.i.d(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float j4 = androidx.core.widget.i.j(this.mBottomGlow, height, 1.0f - width);
                    if (androidx.core.widget.i.d(this.mBottomGlow) == 0.0f) {
                        this.mBottomGlow.onRelease();
                    }
                    f5 = j4;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f6 = -androidx.core.widget.i.j(this.mTopGlow, -height, width);
                if (androidx.core.widget.i.d(this.mTopGlow) == 0.0f) {
                    this.mTopGlow.onRelease();
                }
                f5 = f6;
            }
            invalidate();
        }
        return Math.round(f5 * getHeight());
    }

    private void requestChildOnScreen(@o0 View view, @q0 View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.f32894d) {
                Rect rect = layoutParams2.f32893c;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        a0 a0Var = this.mState;
        a0Var.f32914n = -1L;
        a0Var.f32913m = -1;
        a0Var.f32915o = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        e0 findContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (findContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f32914n = this.mAdapter.hasStableIds() ? findContainingViewHolder.getItemId() : -1L;
        this.mState.f32913m = this.mDataSetHasChangedAfterLayout ? -1 : findContainingViewHolder.isRemoved() ? findContainingViewHolder.mOldPosition : findContainingViewHolder.getAbsoluteAdapterPosition();
        this.mState.f32915o = getDeepestFocusedViewWithId(findContainingViewHolder.itemView);
    }

    private void setAdapterInternal(@q0 h<?> hVar, boolean z4, boolean z5) {
        h hVar2 = this.mAdapter;
        if (hVar2 != null) {
            hVar2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z4 || z5) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.z();
        h<?> hVar3 = this.mAdapter;
        this.mAdapter = hVar;
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.mObserver);
            hVar.onAttachedToRecyclerView(this);
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.onAdapterChanged(hVar3, this.mAdapter);
        }
        this.mRecycler.z(hVar3, this.mAdapter, z4);
        this.mState.f32907g = true;
    }

    public static void setDebugAssertionsEnabled(boolean z4) {
        sDebugAssertionsEnabled = z4;
    }

    public static void setVerboseLoggingEnabled(boolean z4) {
        sVerboseLoggingEnabled = z4;
    }

    private boolean shouldAbsorb(@o0 EdgeEffect edgeEffect, int i4, int i5) {
        if (i4 > 0) {
            return true;
        }
        return getSplineFlingDistance(-i4) < androidx.core.widget.i.d(edgeEffect) * ((float) i5);
    }

    private boolean stopGlowAnimations(MotionEvent motionEvent) {
        boolean z4;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || androidx.core.widget.i.d(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z4 = false;
        } else {
            androidx.core.widget.i.j(this.mLeftGlow, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z4 = true;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && androidx.core.widget.i.d(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            androidx.core.widget.i.j(this.mRightGlow, 0.0f, motionEvent.getY() / getHeight());
            z4 = true;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && androidx.core.widget.i.d(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            androidx.core.widget.i.j(this.mTopGlow, 0.0f, motionEvent.getX() / getWidth());
            z4 = true;
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 == null || androidx.core.widget.i.d(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z4;
        }
        androidx.core.widget.i.j(this.mBottomGlow, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.f();
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.stopSmoothScroller();
        }
    }

    void absorbGlows(int i4, int i5) {
        if (i4 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i4);
            }
        } else if (i4 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i4);
            }
        }
        if (i5 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i5);
            }
        } else if (i5 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i5);
            }
        }
        if (i4 == 0 && i5 == 0) {
            return;
        }
        x1.t1(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i4, int i5) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null || !layoutManager.onAddFocusables(this, arrayList, i4, i5)) {
            super.addFocusables(arrayList, i4, i5);
        }
    }

    public void addItemDecoration(@o0 o oVar, int i4) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i4 < 0) {
            this.mItemDecorations.add(oVar);
        } else {
            this.mItemDecorations.add(i4, oVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(@o0 p pVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(pVar);
    }

    public void addOnItemTouchListener(@o0 r rVar) {
        this.mOnItemTouchListeners.add(rVar);
    }

    public void addOnScrollListener(@o0 s sVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(sVar);
    }

    public void addRecyclerListener(@o0 w wVar) {
        androidx.core.util.w.b(wVar != null, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(wVar);
    }

    void animateAppearance(@o0 e0 e0Var, @q0 m.d dVar, @o0 m.d dVar2) {
        e0Var.setIsRecyclable(false);
        if (this.mItemAnimator.animateAppearance(e0Var, dVar, dVar2)) {
            postAnimationRunner();
        }
    }

    void animateDisappearance(@o0 e0 e0Var, @o0 m.d dVar, @q0 m.d dVar2) {
        addAnimatingView(e0Var);
        e0Var.setIsRecyclable(false);
        if (this.mItemAnimator.animateDisappearance(e0Var, dVar, dVar2)) {
            postAnimationRunner();
        }
    }

    void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        StringBuilder a5 = j4.a(str);
        a5.append(exceptionLabel());
        throw new IllegalStateException(a5.toString());
    }

    void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        if (this.mDispatchScrollCounter > 0) {
            new IllegalStateException("" + exceptionLabel());
        }
    }

    boolean canReuseUpdatedViewHolder(e0 e0Var) {
        m mVar = this.mItemAnimator;
        return mVar == null || mVar.canReuseUpdatedViewHolder(e0Var, e0Var.getUnmodifiedPayloads());
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.mLayout.checkLayoutParams((LayoutParams) layoutParams);
    }

    void clearOldPositions() {
        int j4 = this.mChildHelper.j();
        for (int i4 = 0; i4 < j4; i4++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i4));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        this.mRecycler.e();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<p> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<s> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View, androidx.core.view.j1
    public int computeHorizontalScrollExtent() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.j1
    public int computeHorizontalScrollOffset() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.j1
    public int computeHorizontalScrollRange() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.j1
    public int computeVerticalScrollExtent() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.j1
    public int computeVerticalScrollOffset() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.j1
    public int computeVerticalScrollRange() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    void considerReleasingGlowsOnScroll(int i4, int i5) {
        boolean z4;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i4 <= 0) {
            z4 = false;
        } else {
            this.mLeftGlow.onRelease();
            z4 = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i4 < 0) {
            this.mRightGlow.onRelease();
            z4 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i5 > 0) {
            this.mTopGlow.onRelease();
            z4 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i5 < 0) {
            this.mBottomGlow.onRelease();
            z4 |= this.mBottomGlow.isFinished();
        }
        if (z4) {
            x1.t1(this);
        }
    }

    int consumeFlingInHorizontalStretch(int i4) {
        return consumeFlingInStretch(i4, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    int consumeFlingInVerticalStretch(int i4) {
        return consumeFlingInStretch(i4, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            p0.b("RV FullInvalidate");
            dispatchLayout();
            Trace.endSection();
            return;
        }
        if (this.mAdapterHelper.q()) {
            if (!this.mAdapterHelper.p(4) || this.mAdapterHelper.p(11)) {
                if (this.mAdapterHelper.q()) {
                    p0.b("RV FullInvalidate");
                    dispatchLayout();
                    Trace.endSection();
                    return;
                }
                return;
            }
            p0.b("RV PartialInvalidate");
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.x();
            if (!this.mLayoutWasDefered) {
                if (hasUpdatedView()) {
                    dispatchLayout();
                } else {
                    this.mAdapterHelper.j();
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            Trace.endSection();
        }
    }

    void defaultOnMeasure(int i4, int i5) {
        setMeasuredDimension(LayoutManager.chooseSize(i4, getPaddingRight() + getPaddingLeft(), x1.i0(this)), LayoutManager.chooseSize(i5, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    void dispatchChildAttached(View view) {
        e0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        h hVar = this.mAdapter;
        if (hVar != null && childViewHolderInt != null) {
            hVar.onViewAttachedToWindow(childViewHolderInt);
        }
        List<p> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).b(view);
            }
        }
    }

    void dispatchChildDetached(View view) {
        e0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        h hVar = this.mAdapter;
        if (hVar != null && childViewHolderInt != null) {
            hVar.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<p> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).a(view);
            }
        }
    }

    void dispatchLayout() {
        if (this.mAdapter == null || this.mLayout == null) {
            return;
        }
        this.mState.f32910j = false;
        boolean z4 = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.f32905e == 1) {
            dispatchLayoutStep1();
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else if (this.mAdapterHelper.r() || z4 || this.mLayout.getWidth() != getWidth() || this.mLayout.getHeight() != getHeight()) {
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else {
            this.mLayout.setExactMeasureSpecsFrom(this);
        }
        dispatchLayoutStep3();
    }

    @Override // android.view.View, androidx.core.view.x0
    public boolean dispatchNestedFling(float f4, float f5, boolean z4) {
        return getScrollingChildHelper().a(f4, f5, z4);
    }

    @Override // android.view.View, androidx.core.view.x0
    public boolean dispatchNestedPreFling(float f4, float f5) {
        return getScrollingChildHelper().b(f4, f5);
    }

    @Override // android.view.View, androidx.core.view.x0
    public boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i4, i5, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.x0
    public boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return getScrollingChildHelper().f(i4, i5, i6, i7, iArr);
    }

    void dispatchOnScrollStateChanged(int i4) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.onScrollStateChanged(i4);
        }
        onScrollStateChanged(i4);
        s sVar = this.mScrollListener;
        if (sVar != null) {
            sVar.onScrollStateChanged(this, i4);
        }
        List<s> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i4);
            }
        }
    }

    void dispatchOnScrolled(int i4, int i5) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i4, scrollY - i5);
        onScrolled(i4, i5);
        s sVar = this.mScrollListener;
        if (sVar != null) {
            sVar.onScrolled(this, i4, i5);
        }
        List<s> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i4, i5);
            }
        }
        this.mDispatchScrollCounter--;
    }

    void dispatchPendingImportantForAccessibilityChanges() {
        int i4;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            e0 e0Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (e0Var.itemView.getParent() == this && !e0Var.shouldIgnore() && (i4 = e0Var.mPendingAccessibilityState) != -1) {
                x1.Z1(e0Var.itemView, i4);
                e0Var.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z4;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z5 = false;
        for (int i4 = 0; i4 < size; i4++) {
            this.mItemDecorations.get(i4).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z4 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z4 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z4 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z4 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z5 = true;
            }
            z4 |= z5;
            canvas.restoreToCount(save4);
        }
        if ((z4 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.isRunning()) ? z4 : true) {
            x1.t1(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j4) {
        return super.drawChild(canvas, view, j4);
    }

    void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect a5 = this.mEdgeEffectFactory.a(this, 3);
        this.mBottomGlow = a5;
        if (this.mClipToPadding) {
            a5.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a5.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect a5 = this.mEdgeEffectFactory.a(this, 0);
        this.mLeftGlow = a5;
        if (this.mClipToPadding) {
            a5.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a5.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect a5 = this.mEdgeEffectFactory.a(this, 2);
        this.mRightGlow = a5;
        if (this.mClipToPadding) {
            a5.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a5.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect a5 = this.mEdgeEffectFactory.a(this, 1);
        this.mTopGlow = a5;
        if (this.mClipToPadding) {
            a5.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a5.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    final void fillRemainingScrollValues(a0 a0Var) {
        if (getScrollState() != 2) {
            a0Var.f32916p = 0;
            a0Var.f32917q = 0;
        } else {
            OverScroller overScroller = this.mViewFlinger.f32922d;
            a0Var.f32916p = overScroller.getFinalX() - overScroller.getCurrX();
            a0Var.f32917q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    @q0
    public View findChildViewUnder(float f4, float f5) {
        for (int g4 = this.mChildHelper.g() - 1; g4 >= 0; g4--) {
            View f6 = this.mChildHelper.f(g4);
            float translationX = f6.getTranslationX();
            float translationY = f6.getTranslationY();
            if (f4 >= f6.getLeft() + translationX && f4 <= f6.getRight() + translationX && f5 >= f6.getTop() + translationY && f5 <= f6.getBottom() + translationY) {
                return f6;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    @androidx.annotation.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View findContainingItemView(@androidx.annotation.o0 android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findContainingItemView(android.view.View):android.view.View");
    }

    @q0
    public e0 findContainingViewHolder(@o0 View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    @q0
    public e0 findViewHolderForAdapterPosition(int i4) {
        e0 e0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int j4 = this.mChildHelper.j();
        for (int i5 = 0; i5 < j4; i5++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i5));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i4) {
                if (!this.mChildHelper.n(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                e0Var = childViewHolderInt;
            }
        }
        return e0Var;
    }

    public e0 findViewHolderForItemId(long j4) {
        h hVar = this.mAdapter;
        e0 e0Var = null;
        if (hVar != null && hVar.hasStableIds()) {
            int j5 = this.mChildHelper.j();
            for (int i4 = 0; i4 < j5; i4++) {
                e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i4));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j4) {
                    if (!this.mChildHelper.n(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    e0Var = childViewHolderInt;
                }
            }
        }
        return e0Var;
    }

    @q0
    public e0 findViewHolderForLayoutPosition(int i4) {
        return findViewHolderForPosition(i4, false);
    }

    @q0
    @Deprecated
    public e0 findViewHolderForPosition(int i4) {
        return findViewHolderForPosition(i4, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e9  */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean fling(int r8, int r9) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.fling(int, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i4) {
        View view2;
        boolean z4;
        View onInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i4);
        if (onInterceptFocusSearch != null) {
            return onInterceptFocusSearch;
        }
        boolean z5 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z5 && (i4 == 2 || i4 == 1)) {
            if (this.mLayout.canScrollVertically()) {
                int i5 = i4 == 2 ? UserData.IS91_MSG_TYPE_VOICEMAIL_STATUS : 33;
                z4 = focusFinder.findNextFocus(this, view, i5) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i4 = i5;
                }
            } else {
                z4 = false;
            }
            if (!z4 && this.mLayout.canScrollHorizontally()) {
                int i6 = (this.mLayout.getLayoutDirection() == 1) ^ (i4 == 2) ? 66 : 17;
                boolean z6 = focusFinder.findNextFocus(this, view, i6) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i4 = i6;
                }
                z4 = z6;
            }
            if (z4) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i4, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i4);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i4);
            if (findNextFocus == null && z5) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.onFocusSearchFailed(view, i4, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return isPreferredNextFocus(view, view2, i4) ? view2 : super.focusSearch(view, i4);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i4);
        }
        requestChildOnScreen(view2, null);
        return view;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.generateDefaultLayoutParams();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @q0
    public h getAdapter() {
        return this.mAdapter;
    }

    int getAdapterPositionInRecyclerView(e0 e0Var) {
        if (e0Var.hasAnyOfTheFlags(524) || !e0Var.isBound()) {
            return -1;
        }
        return this.mAdapterHelper.f(e0Var.mPosition);
    }

    @Override // android.view.View
    public int getBaseline() {
        LayoutManager layoutManager = this.mLayout;
        return layoutManager != null ? layoutManager.getBaseline() : super.getBaseline();
    }

    long getChangedHolderKey(e0 e0Var) {
        return this.mAdapter.hasStableIds() ? e0Var.getItemId() : e0Var.mPosition;
    }

    public int getChildAdapterPosition(@o0 View view) {
        e0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i4, int i5) {
        k kVar = this.mChildDrawingOrderCallback;
        return kVar == null ? super.getChildDrawingOrder(i4, i5) : kVar.a(i4, i5);
    }

    public long getChildItemId(@o0 View view) {
        e0 childViewHolderInt;
        h hVar = this.mAdapter;
        if (hVar == null || !hVar.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(@o0 View view) {
        e0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(@o0 View view) {
        return getChildAdapterPosition(view);
    }

    public e0 getChildViewHolder(@o0 View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    @q0
    public androidx.recyclerview.widget.b0 getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(@o0 View view, @o0 Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    @o0
    public l getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    @q0
    public m getItemAnimator() {
        return this.mItemAnimator;
    }

    Rect getItemDecorInsetsForChild(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.f32894d) {
            return layoutParams.f32893c;
        }
        if (this.mState.j() && (layoutParams.f() || layoutParams.h())) {
            return layoutParams.f32893c;
        }
        Rect rect = layoutParams.f32893c;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i4).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i5 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i5 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.f32894d = false;
        return rect;
    }

    @o0
    public o getItemDecorationAt(int i4) {
        int itemDecorationCount = getItemDecorationCount();
        if (i4 >= 0 && i4 < itemDecorationCount) {
            return this.mItemDecorations.get(i4);
        }
        throw new IndexOutOfBoundsException(i4 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    @q0
    public LayoutManager getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    @q0
    public q getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    @o0
    public u getRecycledViewPool() {
        return this.mRecycler.j();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View, androidx.core.view.x0
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().k();
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.q();
    }

    void initAdapterManager() {
        this.mAdapterHelper = new androidx.recyclerview.widget.a(new f(), false);
    }

    @m1
    void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
        }
        Resources resources = getContext().getResources();
        new androidx.recyclerview.widget.m(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(a.b.f93793a), resources.getDimensionPixelSize(a.b.f93795c), resources.getDimensionPixelOffset(a.b.f93794b));
    }

    void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        m mVar = this.mItemAnimator;
        return mVar != null && mVar.isRunning();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View, androidx.core.view.x0
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m();
    }

    void jumpToPositionForSmoothScroller(int i4) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i4);
        awakenScrollBars();
    }

    void markItemDecorInsetsDirty() {
        int j4 = this.mChildHelper.j();
        for (int i4 = 0; i4 < j4; i4++) {
            ((LayoutParams) this.mChildHelper.i(i4).getLayoutParams()).f32894d = true;
        }
        this.mRecycler.t();
    }

    void markKnownViewsInvalid() {
        int j4 = this.mChildHelper.j();
        for (int i4 = 0; i4 < j4; i4++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.u();
    }

    public void nestedScrollBy(int i4, int i5) {
        nestedScrollByInternal(i4, i5, null, 1);
    }

    public void offsetChildrenHorizontal(@u0 int i4) {
        int g4 = this.mChildHelper.g();
        for (int i5 = 0; i5 < g4; i5++) {
            this.mChildHelper.f(i5).offsetLeftAndRight(i4);
        }
    }

    public void offsetChildrenVertical(@u0 int i4) {
        int g4 = this.mChildHelper.g();
        for (int i5 = 0; i5 < g4; i5++) {
            this.mChildHelper.f(i5).offsetTopAndBottom(i4);
        }
    }

    void offsetPositionRecordsForInsert(int i4, int i5) {
        int j4 = this.mChildHelper.j();
        for (int i6 = 0; i6 < j4; i6++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i6));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i4) {
                if (sVerboseLoggingEnabled) {
                    childViewHolderInt.toString();
                }
                childViewHolderInt.offsetPosition(i5, false);
                this.mState.f32907g = true;
            }
        }
        this.mRecycler.w(i4, i5);
        requestLayout();
    }

    void offsetPositionRecordsForMove(int i4, int i5) {
        int i6;
        int i7;
        int i10;
        int i11;
        int j4 = this.mChildHelper.j();
        if (i4 < i5) {
            i10 = -1;
            i7 = i4;
            i6 = i5;
        } else {
            i6 = i4;
            i7 = i5;
            i10 = 1;
        }
        for (int i12 = 0; i12 < j4; i12++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i12));
            if (childViewHolderInt != null && (i11 = childViewHolderInt.mPosition) >= i7 && i11 <= i6) {
                if (sVerboseLoggingEnabled) {
                    childViewHolderInt.toString();
                }
                if (childViewHolderInt.mPosition == i4) {
                    childViewHolderInt.offsetPosition(i5 - i4, false);
                } else {
                    childViewHolderInt.offsetPosition(i10, false);
                }
                this.mState.f32907g = true;
            }
        }
        this.mRecycler.x(i4, i5);
        requestLayout();
    }

    void offsetPositionRecordsForRemove(int i4, int i5, boolean z4) {
        int i6 = i4 + i5;
        int j4 = this.mChildHelper.j();
        for (int i7 = 0; i7 < j4; i7++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i7));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i10 = childViewHolderInt.mPosition;
                if (i10 >= i6) {
                    if (sVerboseLoggingEnabled) {
                        childViewHolderInt.toString();
                    }
                    childViewHolderInt.offsetPosition(-i5, z4);
                    this.mState.f32907g = true;
                } else if (i10 >= i4) {
                    if (sVerboseLoggingEnabled) {
                        childViewHolderInt.toString();
                    }
                    childViewHolderInt.flagRemovedAndOffsetPosition(i4 - 1, -i5, z4);
                    this.mState.f32907g = true;
                }
            }
        }
        this.mRecycler.y(i4, i5, z4);
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.mLayoutOrScrollCounter = r0
            r1 = 1
            r5.mIsAttached = r1
            boolean r2 = r5.mFirstLayoutComplete
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.mFirstLayoutComplete = r1
            androidx.recyclerview.widget.RecyclerView$v r1 = r5.mRecycler
            r1.A()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r5.mLayout
            if (r1 == 0) goto L23
            r1.dispatchAttachedToWindow(r5)
        L23:
            r5.mPostedAnimatorRunner = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L66
            java.lang.ThreadLocal<androidx.recyclerview.widget.n> r0 = androidx.recyclerview.widget.n.f33353f
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.n r1 = (androidx.recyclerview.widget.n) r1
            r5.mGapWorker = r1
            if (r1 != 0) goto L61
            androidx.recyclerview.widget.n r1 = new androidx.recyclerview.widget.n
            r1.<init>()
            r5.mGapWorker = r1
            android.view.Display r1 = androidx.core.view.x1.S(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L53
            if (r1 == 0) goto L53
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L53
            goto L55
        L53:
            r1 = 1114636288(0x42700000, float:60.0)
        L55:
            androidx.recyclerview.widget.n r2 = r5.mGapWorker
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f33357d = r3
            r0.set(r2)
        L61:
            androidx.recyclerview.widget.n r0 = r5.mGapWorker
            r0.a(r5)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    public void onChildAttachedToWindow(@o0 View view) {
    }

    public void onChildDetachedFromWindow(@o0 View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.n nVar;
        super.onDetachedFromWindow();
        m mVar = this.mItemAnimator;
        if (mVar != null) {
            mVar.endAnimations();
        }
        stopScroll();
        this.mIsAttached = false;
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.j();
        this.mRecycler.B();
        androidx.customview.poolingcontainer.a.c(this);
        if (!ALLOW_THREAD_GAP_WORK || (nVar = this.mGapWorker) == null) {
            return;
        }
        nVar.j(this);
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.mItemDecorations.get(i4).onDraw(canvas, this, this.mState);
        }
    }

    void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r5.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.mLayoutSuppressed
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L78
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r5.mLayout
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r5.mLayout
            boolean r3 = r3.canScrollVertically()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L78
        L6c:
            float r2 = r5.mScaledHorizontalScrollFactor
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.mScaledVerticalScrollFactor
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.nestedScrollByInternal(r2, r0, r6, r3)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            return false;
        }
        boolean canScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x4 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x4;
            this.mInitialTouchX = x4;
            int y4 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y4;
            this.mInitialTouchY = y4;
            if (stopGlowAnimations(motionEvent) || this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i4 = canScrollHorizontally;
            if (canScrollVertically) {
                i4 = (canScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i4, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                return false;
            }
            int x5 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y5 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i5 = x5 - this.mInitialTouchX;
                int i6 = y5 - this.mInitialTouchY;
                if (canScrollHorizontally == 0 || Math.abs(i5) <= this.mTouchSlop) {
                    z4 = false;
                } else {
                    this.mLastTouchX = x5;
                    z4 = true;
                }
                if (canScrollVertically && Math.abs(i6) > this.mTouchSlop) {
                    this.mLastTouchY = y5;
                    z4 = true;
                }
                if (z4) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x6 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x6;
            this.mInitialTouchX = x6;
            int y6 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y6;
            this.mInitialTouchY = y6;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        p0.b("RV OnLayout");
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            defaultOnMeasure(i4, i5);
            return;
        }
        boolean z4 = false;
        if (layoutManager.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i4);
            int mode2 = View.MeasureSpec.getMode(i5);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i4, i5);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z4 = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z4;
            if (z4 || this.mAdapter == null) {
                return;
            }
            if (this.mState.f32905e == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.setMeasureSpecs(i4, i5);
            this.mState.f32910j = true;
            dispatchLayoutStep2();
            this.mLayout.setMeasuredDimensionFromChildren(i4, i5);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f32910j = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i4, i5);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i4, i5);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            a0 a0Var = this.mState;
            if (a0Var.f32912l) {
                a0Var.f32908h = true;
            } else {
                this.mAdapterHelper.k();
                this.mState.f32908h = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f32912l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        h hVar = this.mAdapter;
        if (hVar != null) {
            this.mState.f32906f = hVar.getItemCount();
        } else {
            this.mState.f32906f = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i4, i5);
        stopInterceptRequestLayout(false);
        this.mState.f32908h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i4, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i4, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.a());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.f32896d = savedState2.f32896d;
        } else {
            LayoutManager layoutManager = this.mLayout;
            if (layoutManager != null) {
                savedState.f32896d = layoutManager.onSaveInstanceState();
            } else {
                savedState.f32896d = null;
            }
        }
        return savedState;
    }

    public void onScrollStateChanged(int i4) {
    }

    public void onScrolled(@u0 int i4, @u0 int i5) {
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        if (i4 == i6 && i5 == i7) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00db  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        x1.v1(this, this.mItemAnimatorRunner);
        this.mPostedAnimatorRunner = true;
    }

    void processDataSetCompletelyChanged(boolean z4) {
        this.mDispatchItemsChangedEvent = z4 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    void recordAnimationInfoIfBouncedHiddenView(e0 e0Var, m.d dVar) {
        e0Var.setFlags(0, 8192);
        if (this.mState.f32909i && e0Var.isUpdated() && !e0Var.isRemoved() && !e0Var.shouldIgnore()) {
            this.mViewInfoStore.c(getChangedHolderKey(e0Var), e0Var);
        }
        this.mViewInfoStore.e(e0Var, dVar);
    }

    void removeAndRecycleViews() {
        m mVar = this.mItemAnimator;
        if (mVar != null) {
            mVar.endAnimations();
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        this.mRecycler.d();
    }

    boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean r4 = this.mChildHelper.r(view);
        if (r4) {
            e0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.P(childViewHolderInt);
            this.mRecycler.I(childViewHolderInt);
            if (sVerboseLoggingEnabled) {
                Objects.toString(view);
                toString();
            }
        }
        stopInterceptRequestLayout(!r4);
        return r4;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z4) {
        e0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        } else if (sDebugAssertionsEnabled) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + exceptionLabel());
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z4);
    }

    public void removeItemDecoration(@o0 o oVar) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(oVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i4) {
        int itemDecorationCount = getItemDecorationCount();
        if (i4 >= 0 && i4 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i4));
            return;
        }
        throw new IndexOutOfBoundsException(i4 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(@o0 p pVar) {
        List<p> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(pVar);
    }

    public void removeOnItemTouchListener(@o0 r rVar) {
        this.mOnItemTouchListeners.remove(rVar);
        if (this.mInterceptingOnItemTouchListener == rVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(@o0 s sVar) {
        List<s> list = this.mScrollListeners;
        if (list != null) {
            list.remove(sVar);
        }
    }

    public void removeRecyclerListener(@o0 w wVar) {
        this.mRecyclerListeners.remove(wVar);
    }

    void repositionShadowingViews() {
        e0 e0Var;
        int g4 = this.mChildHelper.g();
        for (int i4 = 0; i4 < g4; i4++) {
            View f4 = this.mChildHelper.f(i4);
            e0 childViewHolder = getChildViewHolder(f4);
            if (childViewHolder != null && (e0Var = childViewHolder.mShadowingHolder) != null) {
                View view = e0Var.itemView;
                int left = f4.getLeft();
                int top2 = f4.getTop();
                if (left != view.getLeft() || top2 != view.getTop()) {
                    view.layout(left, top2, view.getWidth() + left, view.getHeight() + top2);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z4) {
        int size = this.mOnItemTouchListeners.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.mOnItemTouchListeners.get(i4).onRequestDisallowInterceptTouchEvent(z4);
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    void saveOldPositions() {
        int j4 = this.mChildHelper.j();
        for (int i4 = 0; i4 < j4; i4++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i4));
            if (sDebugAssertionsEnabled && childViewHolderInt.mPosition == -1 && !childViewHolderInt.isRemoved()) {
                throw new IllegalStateException("view holder cannot have position -1 unless it is removed" + exceptionLabel());
            }
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i4, int i5) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null || this.mLayoutSuppressed) {
            return;
        }
        boolean canScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (canScrollHorizontally || canScrollVertically) {
            if (!canScrollHorizontally) {
                i4 = 0;
            }
            if (!canScrollVertically) {
                i5 = 0;
            }
            scrollByInternal(i4, i5, null, 0);
        }
    }

    boolean scrollByInternal(int i4, int i5, MotionEvent motionEvent, int i6) {
        int i7;
        int i10;
        int i11;
        int i12;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i4, i5, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i13 = iArr2[0];
            int i14 = iArr2[1];
            i7 = i14;
            i10 = i13;
            i11 = i4 - i13;
            i12 = i5 - i14;
        } else {
            i7 = 0;
            i10 = 0;
            i11 = 0;
            i12 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i10, i7, i11, i12, this.mScrollOffset, i6, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i15 = iArr4[0];
        int i16 = i11 - i15;
        int i17 = iArr4[1];
        int i18 = i12 - i17;
        boolean z4 = (i15 == 0 && i17 == 0) ? false : true;
        int i19 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i20 = iArr5[0];
        this.mLastTouchX = i19 - i20;
        int i21 = this.mLastTouchY;
        int i22 = iArr5[1];
        this.mLastTouchY = i21 - i22;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i20;
        iArr6[1] = iArr6[1] + i22;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !androidx.core.view.u0.l(motionEvent, 8194)) {
                pullGlows(motionEvent.getX(), i16, motionEvent.getY(), i18);
            }
            considerReleasingGlowsOnScroll(i4, i5);
        }
        if (i10 != 0 || i7 != 0) {
            dispatchOnScrolled(i10, i7);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z4 && i10 == 0 && i7 == 0) ? false : true;
    }

    void scrollStep(int i4, int i5, @q0 int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        p0.b("RV Scroll");
        fillRemainingScrollValues(this.mState);
        int scrollHorizontallyBy = i4 != 0 ? this.mLayout.scrollHorizontallyBy(i4, this.mRecycler, this.mState) : 0;
        int scrollVerticallyBy = i5 != 0 ? this.mLayout.scrollVerticallyBy(i5, this.mRecycler, this.mState) : 0;
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = scrollHorizontallyBy;
            iArr[1] = scrollVerticallyBy;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i4, int i5) {
    }

    public void scrollToPosition(int i4) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            return;
        }
        layoutManager.scrollToPosition(i4);
        awakenScrollBars();
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(@q0 androidx.recyclerview.widget.b0 b0Var) {
        this.mAccessibilityDelegate = b0Var;
        x1.H1(this, b0Var);
    }

    public void setAdapter(@q0 h hVar) {
        setLayoutFrozen(false);
        setAdapterInternal(hVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(@q0 k kVar) {
        if (kVar == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = kVar;
        setChildrenDrawingOrderEnabled(kVar != null);
    }

    @m1
    boolean setChildImportantForAccessibilityInternal(e0 e0Var, int i4) {
        if (!isComputingLayout()) {
            x1.Z1(e0Var.itemView, i4);
            return true;
        }
        e0Var.mPendingAccessibilityState = i4;
        this.mPendingAccessibilityImportanceChange.add(e0Var);
        return false;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z4) {
        if (z4 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z4;
        super.setClipToPadding(z4);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@o0 l lVar) {
        lVar.getClass();
        this.mEdgeEffectFactory = lVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z4) {
        this.mHasFixedSize = z4;
    }

    public void setItemAnimator(@q0 m mVar) {
        m mVar2 = this.mItemAnimator;
        if (mVar2 != null) {
            mVar2.endAnimations();
            this.mItemAnimator.setListener(null);
        }
        this.mItemAnimator = mVar;
        if (mVar != null) {
            mVar.setListener(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i4) {
        this.mRecycler.M(i4);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z4) {
        suppressLayout(z4);
    }

    public void setLayoutManager(@q0 LayoutManager layoutManager) {
        if (layoutManager == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            m mVar = this.mItemAnimator;
            if (mVar != null) {
                mVar.endAnimations();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            this.mRecycler.d();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            this.mRecycler.d();
        }
        this.mChildHelper.o();
        this.mLayout = layoutManager;
        if (layoutManager != null) {
            if (layoutManager.mRecyclerView != null) {
                throw new IllegalArgumentException("LayoutManager " + layoutManager + " is already attached to a RecyclerView:" + layoutManager.mRecyclerView.exceptionLabel());
            }
            layoutManager.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.Q();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View, androidx.core.view.x0
    public void setNestedScrollingEnabled(boolean z4) {
        getScrollingChildHelper().p(z4);
    }

    public void setOnFlingListener(@q0 q qVar) {
        this.mOnFlingListener = qVar;
    }

    @Deprecated
    public void setOnScrollListener(@q0 s sVar) {
        this.mScrollListener = sVar;
    }

    public void setPreserveFocusAfterLayout(boolean z4) {
        this.mPreserveFocusAfterLayout = z4;
    }

    public void setRecycledViewPool(@q0 u uVar) {
        this.mRecycler.K(uVar);
    }

    @Deprecated
    public void setRecyclerListener(@q0 w wVar) {
        this.mRecyclerListener = wVar;
    }

    void setScrollState(int i4) {
        if (i4 == this.mScrollState) {
            return;
        }
        if (sVerboseLoggingEnabled) {
            new Exception();
        }
        this.mScrollState = i4;
        if (i4 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i4);
    }

    public void setScrollingTouchSlop(int i4) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i4 != 1) {
            this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(@q0 c0 c0Var) {
        this.mRecycler.L(c0Var);
    }

    boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
        this.mEatenAccessibilityChangeFlags |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        return true;
    }

    public void smoothScrollBy(@u0 int i4, @u0 int i5) {
        smoothScrollBy(i4, i5, null);
    }

    public void smoothScrollToPosition(int i4) {
        LayoutManager layoutManager;
        if (this.mLayoutSuppressed || (layoutManager = this.mLayout) == null) {
            return;
        }
        layoutManager.smoothScrollToPosition(this, this.mState, i4);
    }

    void startInterceptRequestLayout() {
        int i4 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i4;
        if (i4 != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View, androidx.core.view.x0
    public boolean startNestedScroll(int i4) {
        return getScrollingChildHelper().r(i4);
    }

    void stopInterceptRequestLayout(boolean z4) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            if (sDebugAssertionsEnabled) {
                throw new IllegalStateException("stopInterceptRequestLayout was called more times than startInterceptRequestLayout." + exceptionLabel());
            }
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z4 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z4 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View, androidx.core.view.x0
    public void stopNestedScroll() {
        getScrollingChildHelper().t();
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z4) {
        if (z4 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z4) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void swapAdapter(@q0 h hVar, boolean z4) {
        setLayoutFrozen(false);
        setAdapterInternal(hVar, true, z4);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    void viewRangeUpdate(int i4, int i5, Object obj) {
        int i6;
        int j4 = this.mChildHelper.j();
        int i7 = i4 + i5;
        for (int i10 = 0; i10 < j4; i10++) {
            View i11 = this.mChildHelper.i(i10);
            e0 childViewHolderInt = getChildViewHolderInt(i11);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i6 = childViewHolderInt.mPosition) >= i4 && i6 < i7) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((LayoutParams) i11.getLayoutParams()).f32894d = true;
            }
        }
        this.mRecycler.S(i4, i5);
    }

    public RecyclerView(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.C1411a.f93789g);
    }

    @Override // androidx.core.view.v0
    public boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2, int i6) {
        return getScrollingChildHelper().d(i4, i5, iArr, iArr2, i6);
    }

    @Override // androidx.core.view.v0
    public boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr, int i10) {
        return getScrollingChildHelper().g(i4, i5, i6, i7, iArr, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[SYNTHETIC] */
    @androidx.annotation.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.recyclerview.widget.RecyclerView.e0 findViewHolderForPosition(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.g r0 = r5.mChildHelper
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.g r3 = r5.mChildHelper
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$e0 r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.g r1 = r5.mChildHelper
            android.view.View r4 = r3.itemView
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findViewHolderForPosition(int, boolean):androidx.recyclerview.widget.RecyclerView$e0");
    }

    @Override // androidx.core.view.v0
    public boolean hasNestedScrollingParent(int i4) {
        return getScrollingChildHelper().l(i4);
    }

    void onExitLayoutOrScroll(boolean z4) {
        int i4 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i4;
        if (i4 < 1) {
            if (sDebugAssertionsEnabled && i4 < 0) {
                throw new IllegalStateException("layout or scroll counter cannot go below zero.Some calls are not matching" + exceptionLabel());
            }
            this.mLayoutOrScrollCounter = 0;
            if (z4) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(@u0 int i4, @u0 int i5, @q0 Interpolator interpolator) {
        smoothScrollBy(i4, i5, interpolator, Integer.MIN_VALUE);
    }

    @Override // androidx.core.view.v0
    public boolean startNestedScroll(int i4, int i5) {
        return getScrollingChildHelper().s(i4, i5);
    }

    @Override // androidx.core.view.v0
    public void stopNestedScroll(int i4) {
        getScrollingChildHelper().u(i4);
    }

    @c1({c1.a.LIBRARY})
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        Parcelable f32896d;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f32896d = parcel.readParcelable(classLoader == null ? LayoutManager.class.getClassLoader() : classLoader);
        }

        void b(SavedState savedState) {
            this.f32896d = savedState.f32896d;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeParcelable(this.f32896d, 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(@o0 Context context, @q0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mObserver = new x();
        this.mRecycler = new v();
        this.mViewInfoStore = new l0();
        this.mUpdateChildViewsRunnable = new a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        this.mItemAnimator = new androidx.recyclerview.widget.j();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new d0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new n.b() : null;
        this.mState = new a0();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new n();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new b();
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = b2.f(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = b2.k(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.setListener(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (x1.X(this) == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.b0(this));
        int[] iArr = a.d.f93800a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i4, 0);
        x1.F1(this, context, iArr, attributeSet, obtainStyledAttributes, i4, 0);
        String string = obtainStyledAttributes.getString(a.d.f93809j);
        if (obtainStyledAttributes.getInt(a.d.f93803d, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(a.d.f93802c, true);
        boolean z4 = obtainStyledAttributes.getBoolean(a.d.f93804e, false);
        this.mEnableFastScroller = z4;
        if (z4) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(a.d.f93807h), obtainStyledAttributes.getDrawable(a.d.f93808i), (StateListDrawable) obtainStyledAttributes.getDrawable(a.d.f93805f), obtainStyledAttributes.getDrawable(a.d.f93806g));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i4, 0);
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i4, 0);
        x1.F1(this, context, iArr2, attributeSet, obtainStyledAttributes2, i4, 0);
        boolean z5 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z5);
        androidx.customview.poolingcontainer.a.h(this, true);
    }

    @Override // androidx.core.view.w0
    public final void dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr, int i10, @o0 int[] iArr2) {
        getScrollingChildHelper().e(i4, i5, i6, i7, iArr, i10, iArr2);
    }

    public void smoothScrollBy(@u0 int i4, @u0 int i5, @q0 Interpolator interpolator, int i6) {
        smoothScrollBy(i4, i5, interpolator, i6, false);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: b, reason: collision with root package name */
        e0 f32892b;

        /* renamed from: c, reason: collision with root package name */
        final Rect f32893c;

        /* renamed from: d, reason: collision with root package name */
        boolean f32894d;

        /* renamed from: e, reason: collision with root package name */
        boolean f32895e;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f32893c = new Rect();
            this.f32894d = true;
            this.f32895e = false;
        }

        public int a() {
            return this.f32892b.getAbsoluteAdapterPosition();
        }

        public int b() {
            return this.f32892b.getBindingAdapterPosition();
        }

        @Deprecated
        public int c() {
            return this.f32892b.getBindingAdapterPosition();
        }

        public int d() {
            return this.f32892b.getLayoutPosition();
        }

        @Deprecated
        public int e() {
            return this.f32892b.getPosition();
        }

        public boolean f() {
            return this.f32892b.isUpdated();
        }

        public boolean g() {
            return this.f32892b.isRemoved();
        }

        public boolean h() {
            return this.f32892b.isInvalid();
        }

        public boolean j() {
            return this.f32892b.needsUpdate();
        }

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
            this.f32893c = new Rect();
            this.f32894d = true;
            this.f32895e = false;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f32893c = new Rect();
            this.f32894d = true;
            this.f32895e = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f32893c = new Rect();
            this.f32894d = true;
            this.f32895e = false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.f32893c = new Rect();
            this.f32894d = true;
            this.f32895e = false;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    void smoothScrollBy(@u0 int i4, @u0 int i5, @q0 Interpolator interpolator, int i6, boolean z4) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null || this.mLayoutSuppressed) {
            return;
        }
        if (!layoutManager.canScrollHorizontally()) {
            i4 = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i5 = 0;
        }
        if (i4 == 0 && i5 == 0) {
            return;
        }
        if (i6 != Integer.MIN_VALUE && i6 <= 0) {
            scrollBy(i4, i5);
            return;
        }
        if (z4) {
            int i7 = i4 != 0 ? 1 : 0;
            if (i5 != 0) {
                i7 |= 2;
            }
            startNestedScroll(i7, 1);
        }
        this.mViewFlinger.e(i4, i5, i6, interpolator);
    }

    public void addItemDecoration(@o0 o oVar) {
        addItemDecoration(oVar, -1);
    }
}
