package com.chad.library.adapter.base;

import androidx.annotation.j0;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.entity.SectionEntity;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.List;
import kd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: BaseSectionQuickAdapter.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B%\b\u0007\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB/\b\u0016\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\f\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b¢\u0006\u0004\b\n\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00028\u0000H$¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00028\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0014¢\u0006\u0004\b\u0011\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00102\b\b\u0001\u0010\f\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0016¢\u0006\u0004\b\u001e\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!¨\u0006\""}, d2 = {"Lcom/chad/library/adapter/base/BaseSectionQuickAdapter;", "Lcom/chad/library/adapter/base/entity/SectionEntity;", "T", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "VH", "Lcom/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "", "sectionHeadResId", "", "data", "<init>", "(ILjava/util/List;)V", "layoutResId", "(IILjava/util/List;)V", "helper", "item", "Lkotlin/k2;", "convertHeader", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/chad/library/adapter/base/entity/SectionEntity;)V", "", "payloads", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/chad/library/adapter/base/entity/SectionEntity;Ljava/util/List;)V", "setNormalLayout", "(I)V", "type", "", "isFixedViewType", "(I)Z", "holder", "position", "onBindViewHolder", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;I)V", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;ILjava/util/List;)V", "I", "com.github.CymChad.brvah"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class BaseSectionQuickAdapter<T extends SectionEntity, VH extends BaseViewHolder> extends BaseMultiItemQuickAdapter<T, VH> {
    private final int sectionHeadResId;

    /* JADX WARN: Multi-variable type inference failed */
    @j
    public BaseSectionQuickAdapter(@j0 int i4) {
        this(i4, null, 2, 0 == true ? 1 : 0);
    }

    protected abstract void convertHeader(@l VH helper, @l T item);

    protected void convertHeader(@l VH helper, @l T item, @l List<Object> payloads) {
        l0.q(helper, ProtectedSandApp.s("ຯ"));
        l0.q(item, ProtectedSandApp.s("ະ"));
        l0.q(payloads, ProtectedSandApp.s("ັ"));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected boolean isFixedViewType(int type) {
        return super.isFixedViewType(type) || type == -99;
    }

    protected final void setNormalLayout(@j0 int layoutResId) {
        addItemType(-100, layoutResId);
    }

    public /* synthetic */ BaseSectionQuickAdapter(int i4, List list, int i5, w wVar) {
        this(i4, (i5 & 2) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.h
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.e0 e0Var, int i4, List list) {
        onBindViewHolder((BaseSectionQuickAdapter<T, VH>) e0Var, i4, (List<Object>) list);
    }

    @j
    public BaseSectionQuickAdapter(@j0 int i4, @m List<T> list) {
        super(list);
        this.sectionHeadResId = i4;
        addItemType(-99, i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@l VH holder, int position) {
        l0.q(holder, ProtectedSandApp.s("າ"));
        if (holder.getItemViewType() == -99) {
            convertHeader(holder, (SectionEntity) getItem(position - getHeaderLayoutCount()));
        } else {
            super.onBindViewHolder((BaseSectionQuickAdapter<T, VH>) holder, position);
        }
    }

    public BaseSectionQuickAdapter(@j0 int i4, @j0 int i5, @m List<T> list) {
        this(i4, list);
        setNormalLayout(i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void onBindViewHolder(@l VH holder, int position, @l List<Object> payloads) {
        l0.q(holder, ProtectedSandApp.s("າ"));
        l0.q(payloads, ProtectedSandApp.s("ັ"));
        if (payloads.isEmpty()) {
            onBindViewHolder((BaseSectionQuickAdapter<T, VH>) holder, position);
        } else if (holder.getItemViewType() == -99) {
            convertHeader(holder, (SectionEntity) getItem(position - getHeaderLayoutCount()), payloads);
        } else {
            super.onBindViewHolder((BaseSectionQuickAdapter<T, VH>) holder, position, payloads);
        }
    }

    public /* synthetic */ BaseSectionQuickAdapter(int i4, int i5, List list, int i6, w wVar) {
        this(i4, i5, (i6 & 4) != 0 ? null : list);
    }
}
