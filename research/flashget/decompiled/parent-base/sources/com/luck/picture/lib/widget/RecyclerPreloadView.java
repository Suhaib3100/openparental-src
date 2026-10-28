package com.luck.picture.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.luck.picture.lib.interfaces.OnRecyclerViewPreloadMoreListener;
import com.luck.picture.lib.interfaces.OnRecyclerViewScrollListener;
import com.luck.picture.lib.interfaces.OnRecyclerViewScrollStateListener;

/* loaded from: classes6.dex */
public class RecyclerPreloadView extends RecyclerView {
    private static final int BOTTOM_DEFAULT = 1;
    public static final int BOTTOM_PRELOAD = 2;
    private static final int LIMIT = 150;
    private static final String TAG = ProtectedSandApp.s("\u1757\u0001");
    private boolean isEnabledLoadMore;
    private boolean isInTheBottom;
    private int mFirstVisiblePosition;
    private int mLastVisiblePosition;
    private OnRecyclerViewPreloadMoreListener onRecyclerViewPreloadListener;
    private OnRecyclerViewScrollListener onRecyclerViewScrollListener;
    private OnRecyclerViewScrollStateListener onRecyclerViewScrollStateListener;
    private int reachBottomRow;

    public RecyclerPreloadView(@o0 Context context) {
        super(context);
        this.isInTheBottom = false;
        this.isEnabledLoadMore = false;
        this.reachBottomRow = 1;
    }

    private void setLayoutManagerPosition(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            this.mFirstVisiblePosition = gridLayoutManager.findFirstVisibleItemPosition();
            this.mLastVisiblePosition = gridLayoutManager.findLastVisibleItemPosition();
        } else if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            this.mFirstVisiblePosition = linearLayoutManager.findFirstVisibleItemPosition();
            this.mLastVisiblePosition = linearLayoutManager.findLastVisibleItemPosition();
        }
    }

    public int getFirstVisiblePosition() {
        return this.mFirstVisiblePosition;
    }

    public int getLastVisiblePosition() {
        return this.mLastVisiblePosition;
    }

    public boolean isEnabledLoadMore() {
        return this.isEnabledLoadMore;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i4) {
        OnRecyclerViewScrollStateListener onRecyclerViewScrollStateListener;
        super.onScrollStateChanged(i4);
        if (i4 == 0 || i4 == 1) {
            setLayoutManagerPosition(getLayoutManager());
        }
        OnRecyclerViewScrollListener onRecyclerViewScrollListener = this.onRecyclerViewScrollListener;
        if (onRecyclerViewScrollListener != null) {
            onRecyclerViewScrollListener.onScrollStateChanged(i4);
        }
        if (i4 != 0 || (onRecyclerViewScrollStateListener = this.onRecyclerViewScrollStateListener) == null) {
            return;
        }
        onRecyclerViewScrollStateListener.onScrollSlow();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrolled(int i4, int i5) {
        super.onScrolled(i4, i5);
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null) {
            throw new RuntimeException(ProtectedSandApp.s("\u1759\u0001"));
        }
        setLayoutManagerPosition(layoutManager);
        if (this.onRecyclerViewPreloadListener != null && this.isEnabledLoadMore) {
            RecyclerView.h adapter = getAdapter();
            if (adapter == null) {
                throw new RuntimeException(ProtectedSandApp.s("\u1758\u0001"));
            }
            if (layoutManager instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                if (gridLayoutManager.findLastVisibleItemPosition() / gridLayoutManager.M() >= (adapter.getItemCount() / gridLayoutManager.M()) - this.reachBottomRow) {
                    if (!this.isInTheBottom) {
                        this.onRecyclerViewPreloadListener.onRecyclerViewPreloadMore();
                        if (i5 > 0) {
                            this.isInTheBottom = true;
                        }
                    } else if (i5 == 0) {
                        this.isInTheBottom = false;
                    }
                }
            }
            this.isInTheBottom = false;
        }
        OnRecyclerViewScrollListener onRecyclerViewScrollListener = this.onRecyclerViewScrollListener;
        if (onRecyclerViewScrollListener != null) {
            onRecyclerViewScrollListener.onScrolled(i4, i5);
        }
        if (this.onRecyclerViewScrollStateListener != null) {
            if (Math.abs(i5) < 150) {
                this.onRecyclerViewScrollStateListener.onScrollSlow();
            } else {
                this.onRecyclerViewScrollStateListener.onScrollFast();
            }
        }
    }

    public void setEnabledLoadMore(boolean z4) {
        this.isEnabledLoadMore = z4;
    }

    public void setLastVisiblePosition(int i4) {
        this.mLastVisiblePosition = i4;
    }

    public void setOnRecyclerViewPreloadListener(OnRecyclerViewPreloadMoreListener onRecyclerViewPreloadMoreListener) {
        this.onRecyclerViewPreloadListener = onRecyclerViewPreloadMoreListener;
    }

    public void setOnRecyclerViewScrollListener(OnRecyclerViewScrollListener onRecyclerViewScrollListener) {
        this.onRecyclerViewScrollListener = onRecyclerViewScrollListener;
    }

    public void setOnRecyclerViewScrollStateListener(OnRecyclerViewScrollStateListener onRecyclerViewScrollStateListener) {
        this.onRecyclerViewScrollStateListener = onRecyclerViewScrollStateListener;
    }

    public void setReachBottomRow(int i4) {
        if (i4 < 1) {
            i4 = 1;
        }
        this.reachBottomRow = i4;
    }

    public RecyclerPreloadView(@o0 Context context, @q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isInTheBottom = false;
        this.isEnabledLoadMore = false;
        this.reachBottomRow = 1;
    }

    public RecyclerPreloadView(@o0 Context context, @q0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.isInTheBottom = false;
        this.isEnabledLoadMore = false;
        this.reachBottomRow = 1;
    }
}
