package com.chad.library.adapter.base.provider;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.d0;
import androidx.annotation.j0;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.util.AdapterUtilsKt;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.c0;
import kotlin.f0;
import kotlin.jvm.internal.l0;

/* compiled from: BaseItemProvider.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\n\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0000H&¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016¢\u0006\u0004\b\u0010\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010 J/\u0010&\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\u0017H\u0016¢\u0006\u0004\b&\u0010'J/\u0010)\u001a\u00020(2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\u0017H\u0016¢\u0006\u0004\b)\u0010*J/\u0010+\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\u0017H\u0016¢\u0006\u0004\b+\u0010'J/\u0010,\u001a\u00020(2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\u0017H\u0016¢\u0006\u0004\b,\u0010*J\u001b\u0010/\u001a\u00020\u00072\f\b\u0001\u0010.\u001a\u00020-\"\u00020\u0017¢\u0006\u0004\b/\u00100J\u001d\u00103\u001a\u0012\u0012\u0004\u0012\u00020\u001701j\b\u0012\u0004\u0012\u00020\u0017`2¢\u0006\u0004\b3\u00104J\u001b\u00105\u001a\u00020\u00072\f\b\u0001\u0010.\u001a\u00020-\"\u00020\u0017¢\u0006\u0004\b5\u00100J\u001d\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u001701j\b\u0012\u0004\u0012\u00020\u0017`2¢\u0006\u0004\b6\u00104R\"\u00108\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010?\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R+\u0010D\u001a\u0012\u0012\u0004\u0012\u00020\u001701j\b\u0012\u0004\u0012\u00020\u0017`28BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u00104R+\u0010G\u001a\u0012\u0012\u0004\u0012\u00020\u001701j\b\u0012\u0004\u0012\u00020\u0017`28BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010B\u001a\u0004\bF\u00104R\u0014\u0010J\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010L\u001a\u00020\u00178gX¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010I¨\u0006M"}, d2 = {"Lcom/chad/library/adapter/base/provider/BaseItemProvider;", "T", "", "<init>", "()V", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "adapter", "Lkotlin/k2;", "setAdapter$com_github_CymChad_brvah", "(Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;)V", "setAdapter", "getAdapter", "()Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "helper", "item", "convert", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V", "", "payloads", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "viewHolder", "onViewHolderCreated", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;I)V", "holder", "onViewAttachedToWindow", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "onViewDetachedFromWindow", "Landroid/view/View;", "view", "data", "position", "onClick", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Landroid/view/View;Ljava/lang/Object;I)V", "", "onLongClick", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Landroid/view/View;Ljava/lang/Object;I)Z", "onChildClick", "onChildLongClick", "", "ids", "addChildClickViewIds", "([I)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getChildClickViewIds", "()Ljava/util/ArrayList;", "addChildLongClickViewIds", "getChildLongClickViewIds", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "Ljava/lang/ref/WeakReference;", "weakAdapter", "Ljava/lang/ref/WeakReference;", "clickViewIds$delegate", "Lkotlin/b0;", "getClickViewIds", "clickViewIds", "longClickViewIds$delegate", "getLongClickViewIds", "longClickViewIds", "getItemViewType", "()I", "itemViewType", "getLayoutId", "layoutId", "com.github.CymChad.brvah"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class BaseItemProvider<T> {

    /* renamed from: clickViewIds$delegate, reason: from kotlin metadata */
    private final b0 clickViewIds;

    @l
    public Context context;

    /* renamed from: longClickViewIds$delegate, reason: from kotlin metadata */
    private final b0 longClickViewIds;
    private WeakReference<BaseProviderMultiAdapter<T>> weakAdapter;

    public BaseItemProvider() {
        f0 f0Var = f0.NONE;
        this.clickViewIds = c0.b(f0Var, BaseItemProvider$clickViewIds$2.INSTANCE);
        this.longClickViewIds = c0.b(f0Var, BaseItemProvider$longClickViewIds$2.INSTANCE);
    }

    private final ArrayList<Integer> getClickViewIds() {
        return (ArrayList) this.clickViewIds.getValue();
    }

    private final ArrayList<Integer> getLongClickViewIds() {
        return (ArrayList) this.longClickViewIds.getValue();
    }

    public final void addChildClickViewIds(@d0 @l int... ids) {
        l0.q(ids, ProtectedSandApp.s("ༀ"));
        for (int i4 : ids) {
            getClickViewIds().add(Integer.valueOf(i4));
        }
    }

    public final void addChildLongClickViewIds(@d0 @l int... ids) {
        l0.q(ids, ProtectedSandApp.s("ༀ"));
        for (int i4 : ids) {
            getLongClickViewIds().add(Integer.valueOf(i4));
        }
    }

    public abstract void convert(@l BaseViewHolder helper, T item);

    public void convert(@l BaseViewHolder helper, T item, @l List<? extends Object> payloads) {
        l0.q(helper, ProtectedSandApp.s("༁"));
        l0.q(payloads, ProtectedSandApp.s("༂"));
    }

    @m
    public BaseProviderMultiAdapter<T> getAdapter() {
        WeakReference<BaseProviderMultiAdapter<T>> weakReference = this.weakAdapter;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @l
    public final ArrayList<Integer> getChildClickViewIds() {
        return getClickViewIds();
    }

    @l
    public final ArrayList<Integer> getChildLongClickViewIds() {
        return getLongClickViewIds();
    }

    @l
    public final Context getContext() {
        Context context = this.context;
        if (context == null) {
            l0.S(ProtectedSandApp.s("༃"));
        }
        return context;
    }

    public abstract int getItemViewType();

    @j0
    public abstract int getLayoutId();

    public void onChildClick(@l BaseViewHolder helper, @l View view, T data, int position) {
        l0.q(helper, ProtectedSandApp.s("༁"));
        l0.q(view, ProtectedSandApp.s("༄"));
    }

    public boolean onChildLongClick(@l BaseViewHolder helper, @l View view, T data, int position) {
        l0.q(helper, ProtectedSandApp.s("༁"));
        l0.q(view, ProtectedSandApp.s("༄"));
        return false;
    }

    public void onClick(@l BaseViewHolder helper, @l View view, T data, int position) {
        l0.q(helper, ProtectedSandApp.s("༁"));
        l0.q(view, ProtectedSandApp.s("༄"));
    }

    @l
    public BaseViewHolder onCreateViewHolder(@l ViewGroup parent, int viewType) {
        l0.q(parent, ProtectedSandApp.s("༅"));
        return new BaseViewHolder(AdapterUtilsKt.getItemView(parent, getLayoutId()));
    }

    public boolean onLongClick(@l BaseViewHolder helper, @l View view, T data, int position) {
        l0.q(helper, ProtectedSandApp.s("༁"));
        l0.q(view, ProtectedSandApp.s("༄"));
        return false;
    }

    public void onViewAttachedToWindow(@l BaseViewHolder holder) {
        l0.q(holder, ProtectedSandApp.s("༆"));
    }

    public void onViewDetachedFromWindow(@l BaseViewHolder holder) {
        l0.q(holder, ProtectedSandApp.s("༆"));
    }

    public void onViewHolderCreated(@l BaseViewHolder viewHolder, int viewType) {
        l0.q(viewHolder, ProtectedSandApp.s("༇"));
    }

    public final void setAdapter$com_github_CymChad_brvah(@l BaseProviderMultiAdapter<T> adapter) {
        l0.q(adapter, ProtectedSandApp.s("༈"));
        this.weakAdapter = new WeakReference<>(adapter);
    }

    public final void setContext(@l Context context) {
        l0.q(context, ProtectedSandApp.s("༉"));
        this.context = context;
    }
}
