package com.chad.library.adapter.base.module;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.LoadMoreListenerImp;
import com.chad.library.adapter.base.listener.OnLoadMoreListener;
import com.chad.library.adapter.base.loadmore.BaseLoadMoreView;
import com.chad.library.adapter.base.loadmore.LoadMoreStatus;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: LoadMoreModule.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\bJ\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010\bJ\u0019\u0010!\u001a\u00020\u00062\b\b\u0002\u0010 \u001a\u00020\u000bH\u0007¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0006¢\u0006\u0004\b#\u0010\bJ\r\u0010$\u001a\u00020\u0006¢\u0006\u0004\b$\u0010\bJ\u0019\u0010'\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020\u0006H\u0000¢\u0006\u0004\b)\u0010\bR\u0018\u0010+\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R$\u00101\u001a\u00020/2\u0006\u00100\u001a\u00020/8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R$\u00105\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b5\u0010\u001aR\"\u00107\u001a\u0002068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010=\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010.\u001a\u0004\b>\u0010\u001a\"\u0004\b?\u0010\"R\"\u0010@\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010.\u001a\u0004\b@\u0010\u001a\"\u0004\bA\u0010\"R\"\u0010B\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010.\u001a\u0004\bB\u0010\u001a\"\u0004\bC\u0010\"R*\u0010E\u001a\u00020\u00102\u0006\u0010D\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010\u001dR*\u0010J\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010.\u001a\u0004\bJ\u0010\u001a\"\u0004\bK\u0010\"R\u001c\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010LR\u0011\u0010M\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bM\u0010\u001aR\u0011\u0010O\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bN\u0010H¨\u0006P"}, d2 = {"Lcom/chad/library/adapter/base/module/BaseLoadMoreModule;", "Lcom/chad/library/adapter/base/listener/LoadMoreListenerImp;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "baseQuickAdapter", "<init>", "(Lcom/chad/library/adapter/base/BaseQuickAdapter;)V", "Lkotlin/k2;", "invokeLoadMoreListener", "()V", "Landroidx/recyclerview/widget/LinearLayoutManager;", "llm", "", "isFullScreen", "(Landroidx/recyclerview/widget/LinearLayoutManager;)Z", "", "numbers", "", "getTheBiggestNumber", "([I)I", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "viewHolder", "setupViewHolder$com_github_CymChad_brvah", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "setupViewHolder", "loadMoreToLoading", "hasLoadMoreView", "()Z", "position", "autoLoadMore$com_github_CymChad_brvah", "(I)V", "autoLoadMore", "checkDisableLoadMoreIfNotFullPage", "gone", "loadMoreEnd", "(Z)V", "loadMoreComplete", "loadMoreFail", "Lcom/chad/library/adapter/base/listener/OnLoadMoreListener;", "listener", "setOnLoadMoreListener", "(Lcom/chad/library/adapter/base/listener/OnLoadMoreListener;)V", "reset$com_github_CymChad_brvah", "reset", "mLoadMoreListener", "Lcom/chad/library/adapter/base/listener/OnLoadMoreListener;", "mNextLoadEnable", "Z", "Lcom/chad/library/adapter/base/loadmore/LoadMoreStatus;", "<set-?>", "loadMoreStatus", "Lcom/chad/library/adapter/base/loadmore/LoadMoreStatus;", "getLoadMoreStatus", "()Lcom/chad/library/adapter/base/loadmore/LoadMoreStatus;", "isLoadEndMoreGone", "Lcom/chad/library/adapter/base/loadmore/BaseLoadMoreView;", "loadMoreView", "Lcom/chad/library/adapter/base/loadmore/BaseLoadMoreView;", "getLoadMoreView", "()Lcom/chad/library/adapter/base/loadmore/BaseLoadMoreView;", "setLoadMoreView", "(Lcom/chad/library/adapter/base/loadmore/BaseLoadMoreView;)V", "enableLoadMoreEndClick", "getEnableLoadMoreEndClick", "setEnableLoadMoreEndClick", "isAutoLoadMore", "setAutoLoadMore", "isEnableLoadMoreIfNotFullPage", "setEnableLoadMoreIfNotFullPage", "value", "preLoadNumber", "I", "getPreLoadNumber", "()I", "setPreLoadNumber", "isEnableLoadMore", "setEnableLoadMore", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "isLoading", "getLoadMoreViewPosition", "loadMoreViewPosition", "com.github.CymChad.brvah"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public class BaseLoadMoreModule implements LoadMoreListenerImp {
    private final BaseQuickAdapter<?, ?> baseQuickAdapter;
    private boolean enableLoadMoreEndClick;
    private boolean isAutoLoadMore;
    private boolean isEnableLoadMore;
    private boolean isEnableLoadMoreIfNotFullPage;
    private boolean isLoadEndMoreGone;

    @l
    private LoadMoreStatus loadMoreStatus;

    @l
    private BaseLoadMoreView loadMoreView;
    private OnLoadMoreListener mLoadMoreListener;
    private boolean mNextLoadEnable;
    private int preLoadNumber;

    public BaseLoadMoreModule(@l BaseQuickAdapter<?, ?> baseQuickAdapter) {
        l0.q(baseQuickAdapter, ProtectedSandApp.s("\u0ef9"));
        this.baseQuickAdapter = baseQuickAdapter;
        this.mNextLoadEnable = true;
        this.loadMoreStatus = LoadMoreStatus.Complete;
        this.loadMoreView = LoadMoreModuleConfig.getDefLoadMoreView();
        this.isAutoLoadMore = true;
        this.isEnableLoadMoreIfNotFullPage = true;
        this.preLoadNumber = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTheBiggestNumber(int[] numbers) {
        int i4 = -1;
        if (numbers != null && numbers.length != 0) {
            for (int i5 : numbers) {
                if (i5 > i4) {
                    i4 = i5;
                }
            }
        }
        return i4;
    }

    private final void invokeLoadMoreListener() {
        this.loadMoreStatus = LoadMoreStatus.Loading;
        RecyclerView mRecyclerView = this.baseQuickAdapter.getMRecyclerView();
        if (mRecyclerView != null) {
            mRecyclerView.post(new Runnable() { // from class: com.chad.library.adapter.base.module.BaseLoadMoreModule$invokeLoadMoreListener$$inlined$let$lambda$1
                @Override // java.lang.Runnable
                public final void run() {
                    OnLoadMoreListener onLoadMoreListener;
                    onLoadMoreListener = BaseLoadMoreModule.this.mLoadMoreListener;
                    if (onLoadMoreListener != null) {
                        onLoadMoreListener.onLoadMore();
                    }
                }
            });
            return;
        }
        OnLoadMoreListener onLoadMoreListener = this.mLoadMoreListener;
        if (onLoadMoreListener != null) {
            onLoadMoreListener.onLoadMore();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFullScreen(LinearLayoutManager llm) {
        return (llm.findLastCompletelyVisibleItemPosition() + 1 == this.baseQuickAdapter.getItemCount() && llm.findFirstCompletelyVisibleItemPosition() == 0) ? false : true;
    }

    public static /* synthetic */ void loadMoreEnd$default(BaseLoadMoreModule baseLoadMoreModule, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\u0efa"));
        }
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        baseLoadMoreModule.loadMoreEnd(z4);
    }

    public final void autoLoadMore$com_github_CymChad_brvah(int position) {
        LoadMoreStatus loadMoreStatus;
        if (this.isAutoLoadMore && hasLoadMoreView() && position >= this.baseQuickAdapter.getItemCount() - this.preLoadNumber && (loadMoreStatus = this.loadMoreStatus) == LoadMoreStatus.Complete && loadMoreStatus != LoadMoreStatus.Loading && this.mNextLoadEnable) {
            invokeLoadMoreListener();
        }
    }

    public final void checkDisableLoadMoreIfNotFullPage() {
        final RecyclerView.LayoutManager layoutManager;
        if (this.isEnableLoadMoreIfNotFullPage) {
            return;
        }
        this.mNextLoadEnable = false;
        RecyclerView mRecyclerView = this.baseQuickAdapter.getMRecyclerView();
        if (mRecyclerView == null || (layoutManager = mRecyclerView.getLayoutManager()) == null) {
            return;
        }
        l0.h(layoutManager, ProtectedSandApp.s("\u0efb"));
        if (layoutManager instanceof LinearLayoutManager) {
            mRecyclerView.postDelayed(new Runnable() { // from class: com.chad.library.adapter.base.module.BaseLoadMoreModule$checkDisableLoadMoreIfNotFullPage$1
                @Override // java.lang.Runnable
                public final void run() {
                    boolean isFullScreen;
                    isFullScreen = BaseLoadMoreModule.this.isFullScreen((LinearLayoutManager) layoutManager);
                    if (isFullScreen) {
                        BaseLoadMoreModule.this.mNextLoadEnable = true;
                    }
                }
            }, 50L);
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            mRecyclerView.postDelayed(new Runnable() { // from class: com.chad.library.adapter.base.module.BaseLoadMoreModule$checkDisableLoadMoreIfNotFullPage$2
                @Override // java.lang.Runnable
                public final void run() {
                    int theBiggestNumber;
                    BaseQuickAdapter baseQuickAdapter;
                    int[] iArr = new int[((StaggeredGridLayoutManager) layoutManager).h0()];
                    ((StaggeredGridLayoutManager) layoutManager).U(iArr);
                    theBiggestNumber = BaseLoadMoreModule.this.getTheBiggestNumber(iArr);
                    int i4 = theBiggestNumber + 1;
                    baseQuickAdapter = BaseLoadMoreModule.this.baseQuickAdapter;
                    if (i4 != baseQuickAdapter.getItemCount()) {
                        BaseLoadMoreModule.this.mNextLoadEnable = true;
                    }
                }
            }, 50L);
        }
    }

    public final boolean getEnableLoadMoreEndClick() {
        return this.enableLoadMoreEndClick;
    }

    @l
    public final LoadMoreStatus getLoadMoreStatus() {
        return this.loadMoreStatus;
    }

    @l
    public final BaseLoadMoreView getLoadMoreView() {
        return this.loadMoreView;
    }

    public final int getLoadMoreViewPosition() {
        if (this.baseQuickAdapter.hasEmptyView()) {
            return -1;
        }
        BaseQuickAdapter<?, ?> baseQuickAdapter = this.baseQuickAdapter;
        return baseQuickAdapter.getFooterLayoutCount() + baseQuickAdapter.getData().size() + baseQuickAdapter.getHeaderLayoutCount();
    }

    public final int getPreLoadNumber() {
        return this.preLoadNumber;
    }

    public final boolean hasLoadMoreView() {
        if (this.mLoadMoreListener == null || !this.isEnableLoadMore) {
            return false;
        }
        if (this.loadMoreStatus == LoadMoreStatus.End && this.isLoadEndMoreGone) {
            return false;
        }
        return !this.baseQuickAdapter.getData().isEmpty();
    }

    /* renamed from: isAutoLoadMore, reason: from getter */
    public final boolean getIsAutoLoadMore() {
        return this.isAutoLoadMore;
    }

    /* renamed from: isEnableLoadMore, reason: from getter */
    public final boolean getIsEnableLoadMore() {
        return this.isEnableLoadMore;
    }

    /* renamed from: isEnableLoadMoreIfNotFullPage, reason: from getter */
    public final boolean getIsEnableLoadMoreIfNotFullPage() {
        return this.isEnableLoadMoreIfNotFullPage;
    }

    /* renamed from: isLoadEndMoreGone, reason: from getter */
    public final boolean getIsLoadEndMoreGone() {
        return this.isLoadEndMoreGone;
    }

    public final boolean isLoading() {
        return this.loadMoreStatus == LoadMoreStatus.Loading;
    }

    public final void loadMoreComplete() {
        if (hasLoadMoreView()) {
            this.loadMoreStatus = LoadMoreStatus.Complete;
            this.baseQuickAdapter.notifyItemChanged(getLoadMoreViewPosition());
            checkDisableLoadMoreIfNotFullPage();
        }
    }

    @j
    public final void loadMoreEnd() {
        loadMoreEnd$default(this, false, 1, null);
    }

    public final void loadMoreFail() {
        if (hasLoadMoreView()) {
            this.loadMoreStatus = LoadMoreStatus.Fail;
            this.baseQuickAdapter.notifyItemChanged(getLoadMoreViewPosition());
        }
    }

    public final void loadMoreToLoading() {
        LoadMoreStatus loadMoreStatus = this.loadMoreStatus;
        LoadMoreStatus loadMoreStatus2 = LoadMoreStatus.Loading;
        if (loadMoreStatus == loadMoreStatus2) {
            return;
        }
        this.loadMoreStatus = loadMoreStatus2;
        this.baseQuickAdapter.notifyItemChanged(getLoadMoreViewPosition());
        invokeLoadMoreListener();
    }

    public final void reset$com_github_CymChad_brvah() {
        if (this.mLoadMoreListener != null) {
            setEnableLoadMore(true);
            this.loadMoreStatus = LoadMoreStatus.Complete;
        }
    }

    public final void setAutoLoadMore(boolean z4) {
        this.isAutoLoadMore = z4;
    }

    public final void setEnableLoadMore(boolean z4) {
        boolean hasLoadMoreView = hasLoadMoreView();
        this.isEnableLoadMore = z4;
        boolean hasLoadMoreView2 = hasLoadMoreView();
        if (hasLoadMoreView) {
            if (hasLoadMoreView2) {
                return;
            }
            this.baseQuickAdapter.notifyItemRemoved(getLoadMoreViewPosition());
        } else if (hasLoadMoreView2) {
            this.loadMoreStatus = LoadMoreStatus.Complete;
            this.baseQuickAdapter.notifyItemInserted(getLoadMoreViewPosition());
        }
    }

    public final void setEnableLoadMoreEndClick(boolean z4) {
        this.enableLoadMoreEndClick = z4;
    }

    public final void setEnableLoadMoreIfNotFullPage(boolean z4) {
        this.isEnableLoadMoreIfNotFullPage = z4;
    }

    public final void setLoadMoreView(@l BaseLoadMoreView baseLoadMoreView) {
        l0.q(baseLoadMoreView, ProtectedSandApp.s("\u0efc"));
        this.loadMoreView = baseLoadMoreView;
    }

    @Override // com.chad.library.adapter.base.listener.LoadMoreListenerImp
    public void setOnLoadMoreListener(@m OnLoadMoreListener listener) {
        this.mLoadMoreListener = listener;
        setEnableLoadMore(true);
    }

    public final void setPreLoadNumber(int i4) {
        if (i4 > 1) {
            this.preLoadNumber = i4;
        }
    }

    public final void setupViewHolder$com_github_CymChad_brvah(@l BaseViewHolder viewHolder) {
        l0.q(viewHolder, ProtectedSandApp.s("\u0efd"));
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.chad.library.adapter.base.module.BaseLoadMoreModule$setupViewHolder$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (BaseLoadMoreModule.this.getLoadMoreStatus() == LoadMoreStatus.Fail) {
                    BaseLoadMoreModule.this.loadMoreToLoading();
                    return;
                }
                if (BaseLoadMoreModule.this.getLoadMoreStatus() == LoadMoreStatus.Complete) {
                    BaseLoadMoreModule.this.loadMoreToLoading();
                } else if (BaseLoadMoreModule.this.getEnableLoadMoreEndClick() && BaseLoadMoreModule.this.getLoadMoreStatus() == LoadMoreStatus.End) {
                    BaseLoadMoreModule.this.loadMoreToLoading();
                }
            }
        });
    }

    @j
    public final void loadMoreEnd(boolean gone) {
        if (hasLoadMoreView()) {
            this.isLoadEndMoreGone = gone;
            this.loadMoreStatus = LoadMoreStatus.End;
            if (gone) {
                this.baseQuickAdapter.notifyItemRemoved(getLoadMoreViewPosition());
            } else {
                this.baseQuickAdapter.notifyItemChanged(getLoadMoreViewPosition());
            }
        }
    }
}
