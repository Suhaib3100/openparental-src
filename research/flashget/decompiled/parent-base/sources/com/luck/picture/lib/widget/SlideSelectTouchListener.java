package com.luck.picture.lib.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.OverScroller;
import androidx.annotation.o0;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.view.x1;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public class SlideSelectTouchListener implements RecyclerView.r {
    private boolean isActive;
    private int mBottomBoundFrom;
    private int mBottomBoundTo;
    private int mEnd;
    private int mHeaderViewCount;
    private boolean mInBottomSpot;
    private boolean mInTopSpot;
    private int mLastEnd;
    private int mLastStart;
    private float mLastX;
    private float mLastY;
    private RecyclerView mRecyclerView;
    private int mScrollDistance;
    private OverScroller mScroller;
    private OnSlideSelectListener mSelectListener;
    private int mStart;
    private int mTopBoundFrom;
    private int mTopBoundTo;
    private final Runnable mScrollRunnable = new Runnable() { // from class: com.luck.picture.lib.widget.SlideSelectTouchListener.1
        @Override // java.lang.Runnable
        public void run() {
            if (SlideSelectTouchListener.this.mScroller == null || !SlideSelectTouchListener.this.mScroller.computeScrollOffset()) {
                return;
            }
            SlideSelectTouchListener slideSelectTouchListener = SlideSelectTouchListener.this;
            slideSelectTouchListener.scrollBy(slideSelectTouchListener.mScrollDistance);
            x1.v1(SlideSelectTouchListener.this.mRecyclerView, SlideSelectTouchListener.this.mScrollRunnable);
        }
    };
    private int mMaxScrollDistance = 16;
    private int mAutoScrollDistance = (int) (Resources.getSystem().getDisplayMetrics().density * 56.0f);
    private int mTouchRegionTopOffset = 0;
    private int mTouchRegionBottomOffset = 0;
    private boolean mScrollAboveTopRegion = true;
    private boolean mScrollBelowTopRegion = true;

    public interface OnAdvancedSlideSelectListener extends OnSlideSelectListener {
        void onSelectionFinished(int i4);

        void onSelectionStarted(int i4);
    }

    public interface OnSlideSelectListener {
        void onSelectChange(int i4, int i5, boolean z4);
    }

    public SlideSelectTouchListener() {
        reset();
    }

    private void changeSelectedRange(RecyclerView recyclerView, MotionEvent motionEvent) {
        changeSelectedRange(recyclerView, motionEvent.getX(), motionEvent.getY());
    }

    private void initScroller(Context context) {
        if (this.mScroller == null) {
            this.mScroller = new OverScroller(context, new LinearInterpolator());
        }
    }

    private void notifySelectRangeChange() {
        int i4;
        int i5;
        if (this.mSelectListener == null || (i4 = this.mStart) == -1 || (i5 = this.mEnd) == -1) {
            return;
        }
        int min = Math.min(i4, i5);
        int max = Math.max(this.mStart, this.mEnd);
        if (min < 0) {
            return;
        }
        int i6 = this.mLastStart;
        if (i6 != -1 && this.mLastEnd != -1) {
            if (min > i6) {
                this.mSelectListener.onSelectChange(i6, min - 1, false);
            } else if (min < i6) {
                this.mSelectListener.onSelectChange(min, i6 - 1, true);
            }
            int i7 = this.mLastEnd;
            if (max > i7) {
                this.mSelectListener.onSelectChange(i7 + 1, max, true);
            } else if (max < i7) {
                this.mSelectListener.onSelectChange(max + 1, i7, false);
            }
        } else if (max - min == 1) {
            this.mSelectListener.onSelectChange(min, min, true);
        } else {
            this.mSelectListener.onSelectChange(min, max, true);
        }
        this.mLastStart = min;
        this.mLastEnd = max;
    }

    private void processAutoScroll(MotionEvent motionEvent) {
        int y4 = (int) motionEvent.getY();
        int i4 = this.mTopBoundFrom;
        if (y4 >= i4 && y4 <= this.mTopBoundTo) {
            this.mLastX = motionEvent.getX();
            this.mLastY = motionEvent.getY();
            int i5 = this.mTopBoundTo;
            int i6 = this.mTopBoundFrom;
            this.mScrollDistance = (int) (this.mMaxScrollDistance * (((i5 - i6) - (y4 - i6)) / (i5 - i6)) * (-1.0f));
            if (this.mInTopSpot) {
                return;
            }
            this.mInTopSpot = true;
            startAutoScroll();
            return;
        }
        if (this.mScrollAboveTopRegion && y4 < i4) {
            this.mLastX = motionEvent.getX();
            this.mLastY = motionEvent.getY();
            this.mScrollDistance = this.mMaxScrollDistance * (-1);
            if (this.mInTopSpot) {
                return;
            }
            this.mInTopSpot = true;
            startAutoScroll();
            return;
        }
        if (y4 >= this.mBottomBoundFrom && y4 <= this.mBottomBoundTo) {
            this.mLastX = motionEvent.getX();
            this.mLastY = motionEvent.getY();
            float f4 = y4;
            int i7 = this.mBottomBoundFrom;
            this.mScrollDistance = (int) (this.mMaxScrollDistance * ((f4 - i7) / (this.mBottomBoundTo - i7)));
            if (this.mInBottomSpot) {
                return;
            }
            this.mInBottomSpot = true;
            startAutoScroll();
            return;
        }
        if (!this.mScrollBelowTopRegion || y4 <= this.mBottomBoundTo) {
            this.mInBottomSpot = false;
            this.mInTopSpot = false;
            this.mLastX = Float.MIN_VALUE;
            this.mLastY = Float.MIN_VALUE;
            stopAutoScroll();
            return;
        }
        this.mLastX = motionEvent.getX();
        this.mLastY = motionEvent.getY();
        this.mScrollDistance = this.mMaxScrollDistance;
        if (this.mInTopSpot) {
            return;
        }
        this.mInTopSpot = true;
        startAutoScroll();
    }

    private void reset() {
        setActive(false);
        OnSlideSelectListener onSlideSelectListener = this.mSelectListener;
        if (onSlideSelectListener != null && (onSlideSelectListener instanceof OnAdvancedSlideSelectListener)) {
            ((OnAdvancedSlideSelectListener) onSlideSelectListener).onSelectionFinished(this.mEnd);
        }
        this.mStart = -1;
        this.mEnd = -1;
        this.mLastStart = -1;
        this.mLastEnd = -1;
        this.mInTopSpot = false;
        this.mInBottomSpot = false;
        this.mLastX = Float.MIN_VALUE;
        this.mLastY = Float.MIN_VALUE;
        stopAutoScroll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scrollBy(int i4) {
        this.mRecyclerView.scrollBy(0, i4 > 0 ? Math.min(i4, this.mMaxScrollDistance) : Math.max(i4, -this.mMaxScrollDistance));
        float f4 = this.mLastX;
        if (f4 != Float.MIN_VALUE) {
            float f5 = this.mLastY;
            if (f5 != Float.MIN_VALUE) {
                changeSelectedRange(this.mRecyclerView, f4, f5);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean onInterceptTouchEvent(@o0 RecyclerView recyclerView, @o0 MotionEvent motionEvent) {
        if (!this.isActive || recyclerView.getAdapter() == null || recyclerView.getAdapter().getItemCount() == 0) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0 || action == 5) {
            reset();
        }
        this.mRecyclerView = recyclerView;
        int height = recyclerView.getHeight();
        int i4 = this.mTouchRegionTopOffset;
        this.mTopBoundFrom = i4;
        int i5 = this.mAutoScrollDistance;
        this.mTopBoundTo = i4 + i5;
        int i6 = this.mTouchRegionBottomOffset;
        this.mBottomBoundFrom = (height + i6) - i5;
        this.mBottomBoundTo = height + i6;
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void onRequestDisallowInterceptTouchEvent(boolean z4) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void onTouchEvent(@o0 RecyclerView recyclerView, @o0 MotionEvent motionEvent) {
        if (!this.isActive) {
            reset();
            return;
        }
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2) {
                if (!this.mInTopSpot && !this.mInBottomSpot) {
                    changeSelectedRange(recyclerView, motionEvent);
                }
                processAutoScroll(motionEvent);
                return;
            }
            if (action != 3 && action != 6) {
                return;
            }
        }
        reset();
    }

    public void setActive(boolean z4) {
        this.isActive = z4;
    }

    public SlideSelectTouchListener setRecyclerViewHeaderCount(int i4) {
        this.mHeaderViewCount = i4;
        return this;
    }

    public void startAutoScroll() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            return;
        }
        initScroller(recyclerView.getContext());
        if (this.mScroller.isFinished()) {
            this.mRecyclerView.removeCallbacks(this.mScrollRunnable);
            OverScroller overScroller = this.mScroller;
            overScroller.startScroll(0, overScroller.getCurrY(), 0, 5000, AndroidComposeViewAccessibilityDelegateCompat.Q2);
            x1.v1(this.mRecyclerView, this.mScrollRunnable);
        }
    }

    public void startSlideSelection(int i4) {
        setActive(true);
        this.mStart = i4;
        this.mEnd = i4;
        this.mLastStart = i4;
        this.mLastEnd = i4;
        OnSlideSelectListener onSlideSelectListener = this.mSelectListener;
        if (onSlideSelectListener == null || !(onSlideSelectListener instanceof OnAdvancedSlideSelectListener)) {
            return;
        }
        ((OnAdvancedSlideSelectListener) onSlideSelectListener).onSelectionStarted(i4);
    }

    public void stopAutoScroll() {
        try {
            OverScroller overScroller = this.mScroller;
            if (overScroller == null || overScroller.isFinished()) {
                return;
            }
            this.mRecyclerView.removeCallbacks(this.mScrollRunnable);
            this.mScroller.abortAnimation();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public SlideSelectTouchListener withBottomOffset(int i4) {
        this.mTouchRegionBottomOffset = i4;
        return this;
    }

    public SlideSelectTouchListener withMaxScrollDistance(int i4) {
        this.mMaxScrollDistance = i4;
        return this;
    }

    public SlideSelectTouchListener withScrollAboveTopRegion(boolean z4) {
        this.mScrollAboveTopRegion = z4;
        return this;
    }

    public SlideSelectTouchListener withScrollBelowTopRegion(boolean z4) {
        this.mScrollBelowTopRegion = z4;
        return this;
    }

    public SlideSelectTouchListener withSelectListener(OnSlideSelectListener onSlideSelectListener) {
        this.mSelectListener = onSlideSelectListener;
        return this;
    }

    public SlideSelectTouchListener withTopOffset(int i4) {
        this.mTouchRegionTopOffset = i4;
        return this;
    }

    public SlideSelectTouchListener withTouchRegion(int i4) {
        this.mAutoScrollDistance = i4;
        return this;
    }

    private void changeSelectedRange(RecyclerView recyclerView, float f4, float f5) {
        int childAdapterPosition;
        View findChildViewUnder = recyclerView.findChildViewUnder(f4, f5);
        if (findChildViewUnder == null || (childAdapterPosition = recyclerView.getChildAdapterPosition(findChildViewUnder) - this.mHeaderViewCount) == -1 || this.mEnd == childAdapterPosition) {
            return;
        }
        this.mEnd = childAdapterPosition;
        notifySelectRangeChange();
    }
}
