package com.chad.library.adapter.base;

import android.view.ViewGroup;
import com.chad.library.adapter.base.delegate.BaseMultiTypeDelegate;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: BaseDelegateMultiAdapter.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u0019\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/chad/library/adapter/base/BaseDelegateMultiAdapter;", "T", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "VH", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "", "data", "<init>", "(Ljava/util/List;)V", "Lcom/chad/library/adapter/base/delegate/BaseMultiTypeDelegate;", "multiTypeDelegate", "Lkotlin/k2;", "setMultiTypeDelegate", "(Lcom/chad/library/adapter/base/delegate/BaseMultiTypeDelegate;)V", "getMultiTypeDelegate", "()Lcom/chad/library/adapter/base/delegate/BaseMultiTypeDelegate;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateDefViewHolder", "(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "position", "getDefItemViewType", "(I)I", "mMultiTypeDelegate", "Lcom/chad/library/adapter/base/delegate/BaseMultiTypeDelegate;", "com.github.CymChad.brvah"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class BaseDelegateMultiAdapter<T, VH extends BaseViewHolder> extends BaseQuickAdapter<T, VH> {
    private BaseMultiTypeDelegate<T> mMultiTypeDelegate;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseDelegateMultiAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected int getDefItemViewType(int position) {
        BaseMultiTypeDelegate<T> multiTypeDelegate = getMultiTypeDelegate();
        if (multiTypeDelegate != null) {
            return multiTypeDelegate.getItemType(getData(), position);
        }
        throw new IllegalStateException(ProtectedSandApp.s("\u0e6b"));
    }

    @m
    public final BaseMultiTypeDelegate<T> getMultiTypeDelegate() {
        return this.mMultiTypeDelegate;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @l
    protected VH onCreateDefViewHolder(@l ViewGroup parent, int viewType) {
        l0.q(parent, ProtectedSandApp.s("\u0e6c"));
        BaseMultiTypeDelegate<T> multiTypeDelegate = getMultiTypeDelegate();
        if (multiTypeDelegate != null) {
            return createBaseViewHolder(parent, multiTypeDelegate.getLayoutId(viewType));
        }
        throw new IllegalStateException(ProtectedSandApp.s("\u0e6b"));
    }

    public final void setMultiTypeDelegate(@l BaseMultiTypeDelegate<T> multiTypeDelegate) {
        l0.q(multiTypeDelegate, ProtectedSandApp.s("\u0e6d"));
        this.mMultiTypeDelegate = multiTypeDelegate;
    }

    public /* synthetic */ BaseDelegateMultiAdapter(List list, int i4, w wVar) {
        this((i4 & 1) != 0 ? null : list);
    }

    public BaseDelegateMultiAdapter(@m List<T> list) {
        super(0, list);
    }
}
