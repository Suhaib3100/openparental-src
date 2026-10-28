package com.chad.library.adapter.base;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.r2;
import androidx.recyclerview.widget.k;
import com.chad.library.adapter.base.binder.BaseItemBinder;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: BaseBinderAdapter.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001;B\u0019\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007JM\u0010\u000f\u001a\u00020\u0000\"\b\b\u0000\u0010\b*\u00020\u00022\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\t2\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J@\u0010\u000f\u001a\u00020\u0000\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\u00022\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\rH\u0086\b¢\u0006\u0004\b\u000f\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00022\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0014¢\u0006\u0004\b\u001b\u0010\u001fJ#\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010!J%\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\"\u0010!J\u0017\u0010$\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u0014H\u0014¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b+\u0010*J\u0017\u0010-\u001a\u00020,2\u0006\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b-\u0010.J\u001b\u0010/\u001a\u00020\u00142\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0004¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u0003H\u0014¢\u0006\u0004\b1\u0010*J\u001f\u00102\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b2\u0010(RH\u00105\u001a6\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r03j\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r`48\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R8\u00107\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u001403j\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u0014`48\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R$\u00109\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u00030\u000b088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lcom/chad/library/adapter/base/BaseBinderAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "", "list", "<init>", "(Ljava/util/List;)V", "T", "Ljava/lang/Class;", "clazz", "Lcom/chad/library/adapter/base/binder/BaseItemBinder;", "baseItemBinder", "Landroidx/recyclerview/widget/k$f;", "callback", "addItemBinder", "(Ljava/lang/Class;Lcom/chad/library/adapter/base/binder/BaseItemBinder;Landroidx/recyclerview/widget/k$f;)Lcom/chad/library/adapter/base/BaseBinderAdapter;", "(Lcom/chad/library/adapter/base/binder/BaseItemBinder;Landroidx/recyclerview/widget/k$f;)Lcom/chad/library/adapter/base/BaseBinderAdapter;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateDefViewHolder", "(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "holder", "item", "Lkotlin/k2;", "convert", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V", "", "payloads", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;Ljava/util/List;)V", "getItemBinder", "(I)Lcom/chad/library/adapter/base/binder/BaseItemBinder;", "getItemBinderOrNull", "position", "getDefItemViewType", "(I)I", "viewHolder", "bindViewClickListener", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;I)V", "onViewAttachedToWindow", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "onViewDetachedFromWindow", "", "onFailedToRecycleView", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)Z", "findViewType", "(Ljava/lang/Class;)I", "bindClick", "bindChildClick", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "classDiffMap", "Ljava/util/HashMap;", "mTypeMap", "Landroid/util/SparseArray;", "mBinderArray", "Landroid/util/SparseArray;", "ItemCallback", "com.github.CymChad.brvah"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public class BaseBinderAdapter extends BaseQuickAdapter<Object, BaseViewHolder> {
    private final HashMap<Class<?>, k.f<Object>> classDiffMap;
    private final SparseArray<BaseItemBinder<Object, ?>> mBinderArray;
    private final HashMap<Class<?>, Integer> mTypeMap;

    /* compiled from: BaseBinderAdapter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\tJ!\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/chad/library/adapter/base/BaseBinderAdapter$ItemCallback;", "Landroidx/recyclerview/widget/k$f;", "", "<init>", "(Lcom/chad/library/adapter/base/BaseBinderAdapter;)V", "oldItem", "newItem", "", "areItemsTheSame", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "areContentsTheSame", "getChangePayload", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com.github.CymChad.brvah"}, k = 1, mv = {1, 4, 0})
    private final class ItemCallback extends k.f<Object> {
        public ItemCallback() {
        }

        @Override // androidx.recyclerview.widget.k.f
        @SuppressLint({"DiffUtilEquals"})
        public boolean areContentsTheSame(@l Object oldItem, @l Object newItem) {
            k.f fVar;
            l0.q(oldItem, ProtectedSandApp.s("ะ"));
            l0.q(newItem, ProtectedSandApp.s("ั"));
            if (!l0.g(oldItem.getClass(), newItem.getClass()) || (fVar = (k.f) BaseBinderAdapter.this.classDiffMap.get(oldItem.getClass())) == null) {
                return true;
            }
            return fVar.areContentsTheSame(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.k.f
        public boolean areItemsTheSame(@l Object oldItem, @l Object newItem) {
            k.f fVar;
            l0.q(oldItem, ProtectedSandApp.s("ะ"));
            l0.q(newItem, ProtectedSandApp.s("ั"));
            return (!l0.g(oldItem.getClass(), newItem.getClass()) || (fVar = (k.f) BaseBinderAdapter.this.classDiffMap.get(oldItem.getClass())) == null) ? l0.g(oldItem, newItem) : fVar.areItemsTheSame(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.k.f
        @m
        public Object getChangePayload(@l Object oldItem, @l Object newItem) {
            k.f fVar;
            l0.q(oldItem, ProtectedSandApp.s("ะ"));
            l0.q(newItem, ProtectedSandApp.s("ั"));
            if (!l0.g(oldItem.getClass(), newItem.getClass()) || (fVar = (k.f) BaseBinderAdapter.this.classDiffMap.get(oldItem.getClass())) == null) {
                return null;
            }
            return fVar.getChangePayload(oldItem, newItem);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseBinderAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BaseBinderAdapter addItemBinder$default(BaseBinderAdapter baseBinderAdapter, Class cls, BaseItemBinder baseItemBinder, k.f fVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\u0e60"));
        }
        if ((i4 & 4) != 0) {
            fVar = null;
        }
        return baseBinderAdapter.addItemBinder(cls, baseItemBinder, fVar);
    }

    @l
    @j
    public final <T> BaseBinderAdapter addItemBinder(@l Class<? extends T> cls, @l BaseItemBinder<T, ?> baseItemBinder) {
        return addItemBinder$default(this, cls, baseItemBinder, null, 4, null);
    }

    protected void bindChildClick(@l final BaseViewHolder viewHolder, int viewType) {
        l0.q(viewHolder, ProtectedSandApp.s("\u0e62"));
        if (getMOnItemChildClickListener() == null) {
            final BaseItemBinder<Object, BaseViewHolder> itemBinder = getItemBinder(viewType);
            Iterator<T> it = itemBinder.getChildClickViewIds().iterator();
            while (it.hasNext()) {
                View findViewById = viewHolder.itemView.findViewById(((Number) it.next()).intValue());
                if (findViewById != null) {
                    if (!findViewById.isClickable()) {
                        findViewById.setClickable(true);
                    }
                    findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.chad.library.adapter.base.BaseBinderAdapter$bindChildClick$$inlined$forEach$lambda$1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int adapterPosition = viewHolder.getAdapterPosition();
                            if (adapterPosition == -1) {
                                return;
                            }
                            int headerLayoutCount = adapterPosition - BaseBinderAdapter.this.getHeaderLayoutCount();
                            BaseItemBinder baseItemBinder = itemBinder;
                            BaseViewHolder baseViewHolder = viewHolder;
                            l0.h(view, ProtectedSandApp.s("า"));
                            baseItemBinder.onChildClick(baseViewHolder, view, BaseBinderAdapter.this.getData().get(headerLayoutCount), headerLayoutCount);
                        }
                    });
                }
            }
        }
        if (getMOnItemChildLongClickListener() == null) {
            final BaseItemBinder<Object, BaseViewHolder> itemBinder2 = getItemBinder(viewType);
            Iterator<T> it2 = itemBinder2.getChildLongClickViewIds().iterator();
            while (it2.hasNext()) {
                View findViewById2 = viewHolder.itemView.findViewById(((Number) it2.next()).intValue());
                if (findViewById2 != null) {
                    if (!findViewById2.isLongClickable()) {
                        findViewById2.setLongClickable(true);
                    }
                    findViewById2.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.chad.library.adapter.base.BaseBinderAdapter$bindChildClick$$inlined$forEach$lambda$2
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view) {
                            int adapterPosition = viewHolder.getAdapterPosition();
                            if (adapterPosition == -1) {
                                return false;
                            }
                            int headerLayoutCount = adapterPosition - BaseBinderAdapter.this.getHeaderLayoutCount();
                            BaseItemBinder baseItemBinder = itemBinder2;
                            BaseViewHolder baseViewHolder = viewHolder;
                            l0.h(view, ProtectedSandApp.s("ำ"));
                            return baseItemBinder.onChildLongClick(baseViewHolder, view, BaseBinderAdapter.this.getData().get(headerLayoutCount), headerLayoutCount);
                        }
                    });
                }
            }
        }
    }

    protected void bindClick(@l final BaseViewHolder viewHolder) {
        l0.q(viewHolder, ProtectedSandApp.s("\u0e62"));
        if (getMOnItemClickListener() == null) {
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.chad.library.adapter.base.BaseBinderAdapter$bindClick$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int adapterPosition = viewHolder.getAdapterPosition();
                    if (adapterPosition == -1) {
                        return;
                    }
                    int headerLayoutCount = adapterPosition - BaseBinderAdapter.this.getHeaderLayoutCount();
                    BaseItemBinder<Object, BaseViewHolder> itemBinder = BaseBinderAdapter.this.getItemBinder(viewHolder.getItemViewType());
                    BaseViewHolder baseViewHolder = viewHolder;
                    l0.h(view, ProtectedSandApp.s("ิ"));
                    itemBinder.onClick(baseViewHolder, view, BaseBinderAdapter.this.getData().get(headerLayoutCount), headerLayoutCount);
                }
            });
        }
        if (getMOnItemLongClickListener() == null) {
            viewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.chad.library.adapter.base.BaseBinderAdapter$bindClick$2
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    int adapterPosition = viewHolder.getAdapterPosition();
                    if (adapterPosition == -1) {
                        return false;
                    }
                    int headerLayoutCount = adapterPosition - BaseBinderAdapter.this.getHeaderLayoutCount();
                    BaseItemBinder<Object, BaseViewHolder> itemBinder = BaseBinderAdapter.this.getItemBinder(viewHolder.getItemViewType());
                    BaseViewHolder baseViewHolder = viewHolder;
                    l0.h(view, ProtectedSandApp.s("ี"));
                    return itemBinder.onLongClick(baseViewHolder, view, BaseBinderAdapter.this.getData().get(headerLayoutCount), headerLayoutCount);
                }
            });
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected void bindViewClickListener(@l BaseViewHolder viewHolder, int viewType) {
        l0.q(viewHolder, ProtectedSandApp.s("\u0e62"));
        super.bindViewClickListener(viewHolder, viewType);
        bindClick(viewHolder);
        bindChildClick(viewHolder, viewType);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected void convert(@l BaseViewHolder holder, @l Object item) {
        l0.q(holder, ProtectedSandApp.s("\u0e63"));
        l0.q(item, ProtectedSandApp.s("\u0e64"));
        getItemBinder(holder.getItemViewType()).convert(holder, item);
    }

    protected final int findViewType(@l Class<?> clazz) {
        l0.q(clazz, ProtectedSandApp.s("\u0e61"));
        Integer num = this.mTypeMap.get(clazz);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException((ProtectedSandApp.s("\u0e66") + clazz + ProtectedSandApp.s("\u0e67")).toString());
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected int getDefItemViewType(int position) {
        return findViewType(getData().get(position).getClass());
    }

    @l
    public BaseItemBinder<Object, BaseViewHolder> getItemBinder(int viewType) {
        BaseItemBinder<Object, BaseViewHolder> baseItemBinder = (BaseItemBinder) this.mBinderArray.get(viewType);
        if (baseItemBinder != null) {
            return baseItemBinder;
        }
        throw new IllegalStateException(r2.a(ProtectedSandApp.s("\u0e68"), viewType, ProtectedSandApp.s("\u0e69")).toString());
    }

    @m
    public BaseItemBinder<Object, BaseViewHolder> getItemBinderOrNull(int viewType) {
        BaseItemBinder<Object, BaseViewHolder> baseItemBinder = (BaseItemBinder) this.mBinderArray.get(viewType);
        if (baseItemBinder == null) {
            return null;
        }
        return baseItemBinder;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @l
    protected BaseViewHolder onCreateDefViewHolder(@l ViewGroup parent, int viewType) {
        l0.q(parent, ProtectedSandApp.s("\u0e6a"));
        BaseItemBinder<Object, BaseViewHolder> itemBinder = getItemBinder(viewType);
        itemBinder.set_context$com_github_CymChad_brvah(getContext());
        return itemBinder.onCreateViewHolder(parent, viewType);
    }

    public BaseBinderAdapter(@m List<Object> list) {
        super(0, list);
        this.classDiffMap = new HashMap<>();
        this.mTypeMap = new HashMap<>();
        this.mBinderArray = new SparseArray<>();
        setDiffCallback(new ItemCallback());
    }

    @l
    @j
    public final <T> BaseBinderAdapter addItemBinder(@l Class<? extends T> clazz, @l BaseItemBinder<T, ?> baseItemBinder, @m k.f<T> callback) {
        l0.q(clazz, ProtectedSandApp.s("\u0e61"));
        l0.q(baseItemBinder, ProtectedSandApp.s("\u0e5f"));
        int size = this.mTypeMap.size() + 1;
        this.mTypeMap.put(clazz, Integer.valueOf(size));
        this.mBinderArray.append(size, baseItemBinder);
        baseItemBinder.set_adapter$com_github_CymChad_brvah(this);
        if (callback != null) {
            this.classDiffMap.put(clazz, callback);
        }
        return this;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected void convert(@l BaseViewHolder holder, @l Object item, @l List<? extends Object> payloads) {
        l0.q(holder, ProtectedSandApp.s("\u0e63"));
        l0.q(item, ProtectedSandApp.s("\u0e64"));
        l0.q(payloads, ProtectedSandApp.s("\u0e65"));
        getItemBinder(holder.getItemViewType()).convert(holder, item, payloads);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public boolean onFailedToRecycleView(@l BaseViewHolder holder) {
        l0.q(holder, ProtectedSandApp.s("\u0e63"));
        BaseItemBinder<Object, BaseViewHolder> itemBinderOrNull = getItemBinderOrNull(holder.getItemViewType());
        if (itemBinderOrNull != null) {
            return itemBinderOrNull.onFailedToRecycleView(holder);
        }
        return false;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.h
    public void onViewAttachedToWindow(@l BaseViewHolder holder) {
        l0.q(holder, ProtectedSandApp.s("\u0e63"));
        super.onViewAttachedToWindow((BaseBinderAdapter) holder);
        BaseItemBinder<Object, BaseViewHolder> itemBinderOrNull = getItemBinderOrNull(holder.getItemViewType());
        if (itemBinderOrNull != null) {
            itemBinderOrNull.onViewAttachedToWindow(holder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewDetachedFromWindow(@l BaseViewHolder holder) {
        l0.q(holder, ProtectedSandApp.s("\u0e63"));
        super.onViewDetachedFromWindow((BaseBinderAdapter) holder);
        BaseItemBinder<Object, BaseViewHolder> itemBinderOrNull = getItemBinderOrNull(holder.getItemViewType());
        if (itemBinderOrNull != null) {
            itemBinderOrNull.onViewDetachedFromWindow(holder);
        }
    }

    public static BaseBinderAdapter addItemBinder$default(BaseBinderAdapter baseBinderAdapter, BaseItemBinder baseItemBinder, k.f fVar, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                fVar = null;
            }
            l0.q(baseItemBinder, ProtectedSandApp.s("\u0e5f"));
            l0.P();
            baseBinderAdapter.addItemBinder(Object.class, baseItemBinder, fVar);
            return baseBinderAdapter;
        }
        throw new UnsupportedOperationException(ProtectedSandApp.s("\u0e60"));
    }

    public /* synthetic */ BaseBinderAdapter(List list, int i4, w wVar) {
        this((i4 & 1) != 0 ? null : list);
    }

    @l
    public final <T> BaseBinderAdapter addItemBinder(@l BaseItemBinder<T, ?> baseItemBinder, @m k.f<T> callback) {
        l0.q(baseItemBinder, ProtectedSandApp.s("\u0e5f"));
        l0.P();
        addItemBinder(Object.class, baseItemBinder, callback);
        return this;
    }
}
