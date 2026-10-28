package com.chad.library.adapter.base.loadmore;

import android.view.View;
import android.view.ViewGroup;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: BaseLoadMoreView.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0014\u0010\u0011J'\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/chad/library/adapter/base/loadmore/BaseLoadMoreView;", "", "<init>", "()V", "Landroid/view/View;", "", "visible", "Lkotlin/k2;", "isVisible", "(Landroid/view/View;Z)V", "Landroid/view/ViewGroup;", "parent", "getRootView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "holder", "getLoadingView", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)Landroid/view/View;", "getLoadComplete", "getLoadEndView", "getLoadFailView", "", "position", "Lcom/chad/library/adapter/base/loadmore/LoadMoreStatus;", "loadMoreStatus", "convert", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;ILcom/chad/library/adapter/base/loadmore/LoadMoreStatus;)V", "com.github.CymChad.brvah"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class BaseLoadMoreView {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 16})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadMoreStatus.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[LoadMoreStatus.Complete.ordinal()] = 1;
            iArr[LoadMoreStatus.Loading.ordinal()] = 2;
            iArr[LoadMoreStatus.Fail.ordinal()] = 3;
            iArr[LoadMoreStatus.End.ordinal()] = 4;
        }
    }

    private final void isVisible(@l View view, boolean z4) {
        view.setVisibility(z4 ? 0 : 8);
    }

    public void convert(@l BaseViewHolder holder, int position, @l LoadMoreStatus loadMoreStatus) {
        l0.q(holder, ProtectedSandApp.s("\u0ee5"));
        l0.q(loadMoreStatus, ProtectedSandApp.s("\u0ee6"));
        int i4 = WhenMappings.$EnumSwitchMapping$0[loadMoreStatus.ordinal()];
        if (i4 == 1) {
            isVisible(getLoadingView(holder), false);
            isVisible(getLoadComplete(holder), true);
            isVisible(getLoadFailView(holder), false);
            isVisible(getLoadEndView(holder), false);
            return;
        }
        if (i4 == 2) {
            isVisible(getLoadingView(holder), true);
            isVisible(getLoadComplete(holder), false);
            isVisible(getLoadFailView(holder), false);
            isVisible(getLoadEndView(holder), false);
            return;
        }
        if (i4 == 3) {
            isVisible(getLoadingView(holder), false);
            isVisible(getLoadComplete(holder), false);
            isVisible(getLoadFailView(holder), true);
            isVisible(getLoadEndView(holder), false);
            return;
        }
        if (i4 != 4) {
            return;
        }
        isVisible(getLoadingView(holder), false);
        isVisible(getLoadComplete(holder), false);
        isVisible(getLoadFailView(holder), false);
        isVisible(getLoadEndView(holder), true);
    }

    @l
    public abstract View getLoadComplete(@l BaseViewHolder holder);

    @l
    public abstract View getLoadEndView(@l BaseViewHolder holder);

    @l
    public abstract View getLoadFailView(@l BaseViewHolder holder);

    @l
    public abstract View getLoadingView(@l BaseViewHolder holder);

    @l
    public abstract View getRootView(@l ViewGroup parent);
}
