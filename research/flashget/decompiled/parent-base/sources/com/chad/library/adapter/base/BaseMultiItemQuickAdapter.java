package com.chad.library.adapter.base;

import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.annotation.j0;
import androidx.collection.r2;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.c0;
import kotlin.f0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: BaseMultiItemQuickAdapter.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u0019\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\n2\b\b\u0001\u0010\u0014\u001a\u00020\nH\u0004¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "T", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "VH", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "", "data", "<init>", "(Ljava/util/List;)V", "", "position", "getDefItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateDefViewHolder", "(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "type", "layoutResId", "Lkotlin/k2;", "addItemType", "(II)V", "Landroid/util/SparseIntArray;", "layouts$delegate", "Lkotlin/b0;", "getLayouts", "()Landroid/util/SparseIntArray;", "layouts", "com.github.CymChad.brvah"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class BaseMultiItemQuickAdapter<T extends MultiItemEntity, VH extends BaseViewHolder> extends BaseQuickAdapter<T, VH> {

    /* renamed from: layouts$delegate, reason: from kotlin metadata */
    private final b0 layouts;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseMultiItemQuickAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final SparseIntArray getLayouts() {
        return (SparseIntArray) this.layouts.getValue();
    }

    protected final void addItemType(int type, @j0 int layoutResId) {
        getLayouts().put(type, layoutResId);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected int getDefItemViewType(int position) {
        return ((MultiItemEntity) getData().get(position)).getItemType();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @l
    protected VH onCreateDefViewHolder(@l ViewGroup parent, int viewType) {
        l0.q(parent, ProtectedSandApp.s("\u0e6e"));
        int i4 = getLayouts().get(viewType);
        if (i4 != 0) {
            return createBaseViewHolder(parent, i4);
        }
        throw new IllegalArgumentException(r2.a(ProtectedSandApp.s("\u0e6f"), viewType, ProtectedSandApp.s("\u0e70")).toString());
    }

    public /* synthetic */ BaseMultiItemQuickAdapter(List list, int i4, w wVar) {
        this((i4 & 1) != 0 ? null : list);
    }

    public BaseMultiItemQuickAdapter(@m List<T> list) {
        super(0, list);
        this.layouts = c0.b(f0.NONE, BaseMultiItemQuickAdapter$layouts$2.INSTANCE);
    }
}
