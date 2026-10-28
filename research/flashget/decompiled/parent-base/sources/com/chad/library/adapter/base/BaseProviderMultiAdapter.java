package com.chad.library.adapter.base;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.r2;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.c0;
import kotlin.f0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: BaseProviderMultiAdapter.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002B\u0019\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000b\u001a\u00020\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\n\u001a\u00020\tH$¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00028\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\bH\u0014¢\u0006\u0004\b\u001b\u0010\u001fJ\u001f\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\tH\u0014¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r2\u0006\u0010\u0014\u001a\u00020\tH\u0014¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010&J\u0017\u0010(\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u0003H\u0014¢\u0006\u0004\b(\u0010&J\u001f\u0010)\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\tH\u0014¢\u0006\u0004\b)\u0010\"R'\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "T", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "", "data", "<init>", "(Ljava/util/List;)V", "", "", "position", "getItemType", "(Ljava/util/List;I)I", "Lcom/chad/library/adapter/base/provider/BaseItemProvider;", "provider", "Lkotlin/k2;", "addItemProvider", "(Lcom/chad/library/adapter/base/provider/BaseItemProvider;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateDefViewHolder", "(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "getDefItemViewType", "(I)I", "holder", "item", "convert", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V", "", "payloads", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;Ljava/util/List;)V", "viewHolder", "bindViewClickListener", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;I)V", "getItemProvider", "(I)Lcom/chad/library/adapter/base/provider/BaseItemProvider;", "onViewAttachedToWindow", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "onViewDetachedFromWindow", "bindClick", "bindChildClick", "Landroid/util/SparseArray;", "mItemProviders$delegate", "Lkotlin/b0;", "getMItemProviders", "()Landroid/util/SparseArray;", "mItemProviders", "com.github.CymChad.brvah"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class BaseProviderMultiAdapter<T> extends BaseQuickAdapter<T, BaseViewHolder> {

    /* renamed from: mItemProviders$delegate, reason: from kotlin metadata */
    private final b0 mItemProviders;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseProviderMultiAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SparseArray<BaseItemProvider<T>> getMItemProviders() {
        return (SparseArray) this.mItemProviders.getValue();
    }

    public void addItemProvider(@l BaseItemProvider<T> provider) {
        l0.q(provider, ProtectedSandApp.s("\u0e71"));
        provider.setAdapter$com_github_CymChad_brvah(this);
        getMItemProviders().put(provider.getItemViewType(), provider);
    }

    protected void bindChildClick(@l final BaseViewHolder viewHolder, int viewType) {
        final BaseItemProvider<T> itemProvider;
        l0.q(viewHolder, ProtectedSandApp.s("\u0e72"));
        if (getMOnItemChildClickListener() == null) {
            final BaseItemProvider<T> itemProvider2 = getItemProvider(viewType);
            if (itemProvider2 == null) {
                return;
            }
            Iterator<T> it = itemProvider2.getChildClickViewIds().iterator();
            while (it.hasNext()) {
                View findViewById = viewHolder.itemView.findViewById(((Number) it.next()).intValue());
                if (findViewById != null) {
                    if (!findViewById.isClickable()) {
                        findViewById.setClickable(true);
                    }
                    findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.chad.library.adapter.base.BaseProviderMultiAdapter$bindChildClick$$inlined$forEach$lambda$1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int adapterPosition = viewHolder.getAdapterPosition();
                            if (adapterPosition == -1) {
                                return;
                            }
                            int headerLayoutCount = adapterPosition - BaseProviderMultiAdapter.this.getHeaderLayoutCount();
                            BaseItemProvider baseItemProvider = itemProvider2;
                            BaseViewHolder baseViewHolder = viewHolder;
                            l0.h(view, ProtectedSandApp.s("ຉ"));
                            baseItemProvider.onChildClick(baseViewHolder, view, BaseProviderMultiAdapter.this.getData().get(headerLayoutCount), headerLayoutCount);
                        }
                    });
                }
            }
        }
        if (getMOnItemChildLongClickListener() != null || (itemProvider = getItemProvider(viewType)) == null) {
            return;
        }
        Iterator<T> it2 = itemProvider.getChildLongClickViewIds().iterator();
        while (it2.hasNext()) {
            View findViewById2 = viewHolder.itemView.findViewById(((Number) it2.next()).intValue());
            if (findViewById2 != null) {
                if (!findViewById2.isLongClickable()) {
                    findViewById2.setLongClickable(true);
                }
                findViewById2.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.chad.library.adapter.base.BaseProviderMultiAdapter$bindChildClick$$inlined$forEach$lambda$2
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        int adapterPosition = viewHolder.getAdapterPosition();
                        if (adapterPosition == -1) {
                            return false;
                        }
                        int headerLayoutCount = adapterPosition - BaseProviderMultiAdapter.this.getHeaderLayoutCount();
                        BaseItemProvider baseItemProvider = itemProvider;
                        BaseViewHolder baseViewHolder = viewHolder;
                        l0.h(view, ProtectedSandApp.s("ຊ"));
                        return baseItemProvider.onChildLongClick(baseViewHolder, view, BaseProviderMultiAdapter.this.getData().get(headerLayoutCount), headerLayoutCount);
                    }
                });
            }
        }
    }

    protected void bindClick(@l final BaseViewHolder viewHolder) {
        l0.q(viewHolder, ProtectedSandApp.s("\u0e72"));
        if (getMOnItemClickListener() == null) {
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.chad.library.adapter.base.BaseProviderMultiAdapter$bindClick$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SparseArray mItemProviders;
                    int adapterPosition = viewHolder.getAdapterPosition();
                    if (adapterPosition == -1) {
                        return;
                    }
                    int headerLayoutCount = adapterPosition - BaseProviderMultiAdapter.this.getHeaderLayoutCount();
                    int itemViewType = viewHolder.getItemViewType();
                    mItemProviders = BaseProviderMultiAdapter.this.getMItemProviders();
                    BaseItemProvider baseItemProvider = (BaseItemProvider) mItemProviders.get(itemViewType);
                    BaseViewHolder baseViewHolder = viewHolder;
                    l0.h(view, ProtectedSandApp.s("\u0e8b"));
                    baseItemProvider.onClick(baseViewHolder, view, BaseProviderMultiAdapter.this.getData().get(headerLayoutCount), headerLayoutCount);
                }
            });
        }
        if (getMOnItemLongClickListener() == null) {
            viewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.chad.library.adapter.base.BaseProviderMultiAdapter$bindClick$2
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    SparseArray mItemProviders;
                    int adapterPosition = viewHolder.getAdapterPosition();
                    if (adapterPosition == -1) {
                        return false;
                    }
                    int headerLayoutCount = adapterPosition - BaseProviderMultiAdapter.this.getHeaderLayoutCount();
                    int itemViewType = viewHolder.getItemViewType();
                    mItemProviders = BaseProviderMultiAdapter.this.getMItemProviders();
                    BaseItemProvider baseItemProvider = (BaseItemProvider) mItemProviders.get(itemViewType);
                    BaseViewHolder baseViewHolder = viewHolder;
                    l0.h(view, ProtectedSandApp.s("ຌ"));
                    return baseItemProvider.onLongClick(baseViewHolder, view, BaseProviderMultiAdapter.this.getData().get(headerLayoutCount), headerLayoutCount);
                }
            });
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected void bindViewClickListener(@l BaseViewHolder viewHolder, int viewType) {
        l0.q(viewHolder, ProtectedSandApp.s("\u0e72"));
        super.bindViewClickListener(viewHolder, viewType);
        bindClick(viewHolder);
        bindChildClick(viewHolder, viewType);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected void convert(@l BaseViewHolder holder, T item) {
        l0.q(holder, ProtectedSandApp.s("\u0e73"));
        BaseItemProvider<T> itemProvider = getItemProvider(holder.getItemViewType());
        if (itemProvider == null) {
            l0.L();
        }
        itemProvider.convert(holder, item);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected int getDefItemViewType(int position) {
        return getItemType(getData(), position);
    }

    @m
    protected BaseItemProvider<T> getItemProvider(int viewType) {
        return getMItemProviders().get(viewType);
    }

    protected abstract int getItemType(@l List<? extends T> data, int position);

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @l
    protected BaseViewHolder onCreateDefViewHolder(@l ViewGroup parent, int viewType) {
        l0.q(parent, ProtectedSandApp.s("\u0e75"));
        BaseItemProvider<T> itemProvider = getItemProvider(viewType);
        if (itemProvider == null) {
            throw new IllegalStateException(r2.a(ProtectedSandApp.s("\u0e77"), viewType, ProtectedSandApp.s("\u0e78")).toString());
        }
        Context context = parent.getContext();
        l0.h(context, ProtectedSandApp.s("\u0e76"));
        itemProvider.setContext(context);
        BaseViewHolder onCreateViewHolder = itemProvider.onCreateViewHolder(parent, viewType);
        itemProvider.onViewHolderCreated(onCreateViewHolder, viewType);
        return onCreateViewHolder;
    }

    public /* synthetic */ BaseProviderMultiAdapter(List list, int i4, w wVar) {
        this((i4 & 1) != 0 ? null : list);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected void convert(@l BaseViewHolder holder, T item, @l List<? extends Object> payloads) {
        l0.q(holder, ProtectedSandApp.s("\u0e73"));
        l0.q(payloads, ProtectedSandApp.s("\u0e74"));
        BaseItemProvider<T> itemProvider = getItemProvider(holder.getItemViewType());
        if (itemProvider == null) {
            l0.L();
        }
        itemProvider.convert(holder, item, payloads);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.h
    public void onViewAttachedToWindow(@l BaseViewHolder holder) {
        l0.q(holder, ProtectedSandApp.s("\u0e73"));
        super.onViewAttachedToWindow((BaseProviderMultiAdapter<T>) holder);
        BaseItemProvider<T> itemProvider = getItemProvider(holder.getItemViewType());
        if (itemProvider != null) {
            itemProvider.onViewAttachedToWindow(holder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewDetachedFromWindow(@l BaseViewHolder holder) {
        l0.q(holder, ProtectedSandApp.s("\u0e73"));
        super.onViewDetachedFromWindow((BaseProviderMultiAdapter<T>) holder);
        BaseItemProvider<T> itemProvider = getItemProvider(holder.getItemViewType());
        if (itemProvider != null) {
            itemProvider.onViewDetachedFromWindow(holder);
        }
    }

    public BaseProviderMultiAdapter(@m List<T> list) {
        super(0, list);
        this.mItemProviders = c0.b(f0.NONE, BaseProviderMultiAdapter$mItemProviders$2.INSTANCE);
    }
}
