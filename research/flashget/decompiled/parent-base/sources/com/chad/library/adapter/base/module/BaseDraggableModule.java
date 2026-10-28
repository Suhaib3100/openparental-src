package com.chad.library.adapter.base.module;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.dragswipe.DragAndSwipeCallback;
import com.chad.library.adapter.base.listener.DraggableListenerImp;
import com.chad.library.adapter.base.listener.OnItemDragListener;
import com.chad.library.adapter.base.listener.OnItemSwipeListener;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.chad.library.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.l0;

/* compiled from: DraggableModule.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0016\u0018\u0000 m2\u00020\u0001:\u0001mB\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u0019H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b#\u0010\u001eJ\u0017\u0010$\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b$\u0010\u001eJ\u0017\u0010%\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b%\u0010\u001eJ\u0017\u0010&\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b&\u0010\u001eJ;\u0010-\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020\u000bH\u0016¢\u0006\u0004\b-\u0010.J\u0019\u00101\u001a\u00020\u00062\b\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b1\u00102J\u0019\u00105\u001a\u00020\u00062\b\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b5\u00106R\"\u00107\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b7\u0010\u0018\"\u0004\b9\u0010:R\"\u0010;\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u00108\u001a\u0004\b;\u0010\u0018\"\u0004\b<\u0010:R\"\u0010=\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010D\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010K\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010R\u001a\u0004\u0018\u00010Q8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010Y\u001a\u0004\u0018\u00010X8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010_\u001a\u0004\u0018\u00010/8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u00102R$\u0010d\u001a\u0004\u0018\u0001038\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u00106R*\u0010j\u001a\u00020\u000b2\u0006\u0010i\u001a\u00020\u000b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bj\u00108\u001a\u0004\bj\u0010\u0018\"\u0004\bk\u0010:R\u001c\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010l¨\u0006n"}, d2 = {"Lcom/chad/library/adapter/base/module/BaseDraggableModule;", "Lcom/chad/library/adapter/base/listener/DraggableListenerImp;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "baseQuickAdapter", "<init>", "(Lcom/chad/library/adapter/base/BaseQuickAdapter;)V", "Lkotlin/k2;", "initItemTouch", "()V", "", "position", "", "inRange", "(I)Z", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "holder", "initView$com_github_CymChad_brvah", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "initView", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "attachToRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "hasToggleView", "()Z", "Landroidx/recyclerview/widget/RecyclerView$e0;", "viewHolder", "getViewHolderPosition", "(Landroidx/recyclerview/widget/RecyclerView$e0;)I", "onItemDragStart", "(Landroidx/recyclerview/widget/RecyclerView$e0;)V", "source", "target", "onItemDragMoving", "(Landroidx/recyclerview/widget/RecyclerView$e0;Landroidx/recyclerview/widget/RecyclerView$e0;)V", "onItemDragEnd", "onItemSwipeStart", "onItemSwipeClear", "onItemSwiped", "Landroid/graphics/Canvas;", "canvas", "", "dX", "dY", "isCurrentlyActive", "onItemSwiping", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView$e0;FFZ)V", "Lcom/chad/library/adapter/base/listener/OnItemDragListener;", "onItemDragListener", "setOnItemDragListener", "(Lcom/chad/library/adapter/base/listener/OnItemDragListener;)V", "Lcom/chad/library/adapter/base/listener/OnItemSwipeListener;", "onItemSwipeListener", "setOnItemSwipeListener", "(Lcom/chad/library/adapter/base/listener/OnItemSwipeListener;)V", "isDragEnabled", "Z", "setDragEnabled", "(Z)V", "isSwipeEnabled", "setSwipeEnabled", "toggleViewId", "I", "getToggleViewId", "()I", "setToggleViewId", "(I)V", "Landroidx/recyclerview/widget/o;", "itemTouchHelper", "Landroidx/recyclerview/widget/o;", "getItemTouchHelper", "()Landroidx/recyclerview/widget/o;", "setItemTouchHelper", "(Landroidx/recyclerview/widget/o;)V", "Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;", "itemTouchHelperCallback", "Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;", "getItemTouchHelperCallback", "()Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;", "setItemTouchHelperCallback", "(Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;)V", "Landroid/view/View$OnTouchListener;", "mOnToggleViewTouchListener", "Landroid/view/View$OnTouchListener;", "getMOnToggleViewTouchListener", "()Landroid/view/View$OnTouchListener;", "setMOnToggleViewTouchListener", "(Landroid/view/View$OnTouchListener;)V", "Landroid/view/View$OnLongClickListener;", "mOnToggleViewLongClickListener", "Landroid/view/View$OnLongClickListener;", "getMOnToggleViewLongClickListener", "()Landroid/view/View$OnLongClickListener;", "setMOnToggleViewLongClickListener", "(Landroid/view/View$OnLongClickListener;)V", "mOnItemDragListener", "Lcom/chad/library/adapter/base/listener/OnItemDragListener;", "getMOnItemDragListener", "()Lcom/chad/library/adapter/base/listener/OnItemDragListener;", "setMOnItemDragListener", "mOnItemSwipeListener", "Lcom/chad/library/adapter/base/listener/OnItemSwipeListener;", "getMOnItemSwipeListener", "()Lcom/chad/library/adapter/base/listener/OnItemSwipeListener;", "setMOnItemSwipeListener", "value", "isDragOnLongPressEnabled", "setDragOnLongPressEnabled", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Companion", "com.github.CymChad.brvah"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public class BaseDraggableModule implements DraggableListenerImp {
    private static final int NO_TOGGLE_VIEW = 0;
    private final BaseQuickAdapter<?, ?> baseQuickAdapter;
    private boolean isDragEnabled;
    private boolean isDragOnLongPressEnabled;
    private boolean isSwipeEnabled;

    @l
    public o itemTouchHelper;

    @l
    public DragAndSwipeCallback itemTouchHelperCallback;

    @m
    private OnItemDragListener mOnItemDragListener;

    @m
    private OnItemSwipeListener mOnItemSwipeListener;

    @m
    private View.OnLongClickListener mOnToggleViewLongClickListener;

    @m
    private View.OnTouchListener mOnToggleViewTouchListener;
    private int toggleViewId;

    public BaseDraggableModule(@l BaseQuickAdapter<?, ?> baseQuickAdapter) {
        l0.q(baseQuickAdapter, ProtectedSandApp.s("\u0ef0"));
        this.baseQuickAdapter = baseQuickAdapter;
        initItemTouch();
        this.isDragOnLongPressEnabled = true;
    }

    private final boolean inRange(int position) {
        return position >= 0 && position < this.baseQuickAdapter.getData().size();
    }

    private final void initItemTouch() {
        DragAndSwipeCallback dragAndSwipeCallback = new DragAndSwipeCallback(this);
        this.itemTouchHelperCallback = dragAndSwipeCallback;
        this.itemTouchHelper = new o(dragAndSwipeCallback);
    }

    public final void attachToRecyclerView(@l RecyclerView recyclerView) {
        l0.q(recyclerView, ProtectedSandApp.s("\u0ef1"));
        o oVar = this.itemTouchHelper;
        if (oVar == null) {
            l0.S(ProtectedSandApp.s("\u0ef2"));
        }
        oVar.d(recyclerView);
    }

    @l
    public final o getItemTouchHelper() {
        o oVar = this.itemTouchHelper;
        if (oVar == null) {
            l0.S(ProtectedSandApp.s("\u0ef2"));
        }
        return oVar;
    }

    @l
    public final DragAndSwipeCallback getItemTouchHelperCallback() {
        DragAndSwipeCallback dragAndSwipeCallback = this.itemTouchHelperCallback;
        if (dragAndSwipeCallback == null) {
            l0.S(ProtectedSandApp.s("\u0ef3"));
        }
        return dragAndSwipeCallback;
    }

    @m
    protected final OnItemDragListener getMOnItemDragListener() {
        return this.mOnItemDragListener;
    }

    @m
    protected final OnItemSwipeListener getMOnItemSwipeListener() {
        return this.mOnItemSwipeListener;
    }

    @m
    protected final View.OnLongClickListener getMOnToggleViewLongClickListener() {
        return this.mOnToggleViewLongClickListener;
    }

    @m
    protected final View.OnTouchListener getMOnToggleViewTouchListener() {
        return this.mOnToggleViewTouchListener;
    }

    public final int getToggleViewId() {
        return this.toggleViewId;
    }

    protected final int getViewHolderPosition(@l RecyclerView.e0 viewHolder) {
        l0.q(viewHolder, ProtectedSandApp.s("\u0ef4"));
        return viewHolder.getAdapterPosition() - this.baseQuickAdapter.getHeaderLayoutCount();
    }

    public boolean hasToggleView() {
        return this.toggleViewId != 0;
    }

    public final void initView$com_github_CymChad_brvah(@l BaseViewHolder holder) {
        View findViewById;
        l0.q(holder, ProtectedSandApp.s("\u0ef5"));
        if (this.isDragEnabled && hasToggleView() && (findViewById = holder.itemView.findViewById(this.toggleViewId)) != null) {
            findViewById.setTag(c.g.f47078d, holder);
            if (getIsDragOnLongPressEnabled()) {
                findViewById.setOnLongClickListener(this.mOnToggleViewLongClickListener);
            } else {
                findViewById.setOnTouchListener(this.mOnToggleViewTouchListener);
            }
        }
    }

    /* renamed from: isDragEnabled, reason: from getter */
    public final boolean getIsDragEnabled() {
        return this.isDragEnabled;
    }

    /* renamed from: isDragOnLongPressEnabled, reason: from getter */
    public boolean getIsDragOnLongPressEnabled() {
        return this.isDragOnLongPressEnabled;
    }

    /* renamed from: isSwipeEnabled, reason: from getter */
    public final boolean getIsSwipeEnabled() {
        return this.isSwipeEnabled;
    }

    public void onItemDragEnd(@l RecyclerView.e0 viewHolder) {
        l0.q(viewHolder, ProtectedSandApp.s("\u0ef4"));
        OnItemDragListener onItemDragListener = this.mOnItemDragListener;
        if (onItemDragListener != null) {
            onItemDragListener.onItemDragEnd(viewHolder, getViewHolderPosition(viewHolder));
        }
    }

    public void onItemDragMoving(@l RecyclerView.e0 source, @l RecyclerView.e0 target) {
        l0.q(source, ProtectedSandApp.s("\u0ef6"));
        l0.q(target, ProtectedSandApp.s("\u0ef7"));
        int viewHolderPosition = getViewHolderPosition(source);
        int viewHolderPosition2 = getViewHolderPosition(target);
        if (inRange(viewHolderPosition) && inRange(viewHolderPosition2)) {
            if (viewHolderPosition < viewHolderPosition2) {
                int i4 = viewHolderPosition;
                while (i4 < viewHolderPosition2) {
                    int i5 = i4 + 1;
                    Collections.swap(this.baseQuickAdapter.getData(), i4, i5);
                    i4 = i5;
                }
            } else {
                int i6 = viewHolderPosition2 + 1;
                if (viewHolderPosition >= i6) {
                    int i7 = viewHolderPosition;
                    while (true) {
                        Collections.swap(this.baseQuickAdapter.getData(), i7, i7 - 1);
                        if (i7 == i6) {
                            break;
                        } else {
                            i7--;
                        }
                    }
                }
            }
            this.baseQuickAdapter.notifyItemMoved(source.getAdapterPosition(), target.getAdapterPosition());
        }
        OnItemDragListener onItemDragListener = this.mOnItemDragListener;
        if (onItemDragListener != null) {
            onItemDragListener.onItemDragMoving(source, viewHolderPosition, target, viewHolderPosition2);
        }
    }

    public void onItemDragStart(@l RecyclerView.e0 viewHolder) {
        l0.q(viewHolder, ProtectedSandApp.s("\u0ef4"));
        OnItemDragListener onItemDragListener = this.mOnItemDragListener;
        if (onItemDragListener != null) {
            onItemDragListener.onItemDragStart(viewHolder, getViewHolderPosition(viewHolder));
        }
    }

    public void onItemSwipeClear(@l RecyclerView.e0 viewHolder) {
        OnItemSwipeListener onItemSwipeListener;
        l0.q(viewHolder, ProtectedSandApp.s("\u0ef4"));
        if (!this.isSwipeEnabled || (onItemSwipeListener = this.mOnItemSwipeListener) == null) {
            return;
        }
        onItemSwipeListener.clearView(viewHolder, getViewHolderPosition(viewHolder));
    }

    public void onItemSwipeStart(@l RecyclerView.e0 viewHolder) {
        OnItemSwipeListener onItemSwipeListener;
        l0.q(viewHolder, ProtectedSandApp.s("\u0ef4"));
        if (!this.isSwipeEnabled || (onItemSwipeListener = this.mOnItemSwipeListener) == null) {
            return;
        }
        onItemSwipeListener.onItemSwipeStart(viewHolder, getViewHolderPosition(viewHolder));
    }

    public void onItemSwiped(@l RecyclerView.e0 viewHolder) {
        OnItemSwipeListener onItemSwipeListener;
        l0.q(viewHolder, ProtectedSandApp.s("\u0ef4"));
        int viewHolderPosition = getViewHolderPosition(viewHolder);
        if (inRange(viewHolderPosition)) {
            this.baseQuickAdapter.getData().remove(viewHolderPosition);
            this.baseQuickAdapter.notifyItemRemoved(viewHolder.getAdapterPosition());
            if (!this.isSwipeEnabled || (onItemSwipeListener = this.mOnItemSwipeListener) == null) {
                return;
            }
            onItemSwipeListener.onItemSwiped(viewHolder, viewHolderPosition);
        }
    }

    public void onItemSwiping(@m Canvas canvas, @m RecyclerView.e0 viewHolder, float dX, float dY, boolean isCurrentlyActive) {
        OnItemSwipeListener onItemSwipeListener;
        if (!this.isSwipeEnabled || (onItemSwipeListener = this.mOnItemSwipeListener) == null) {
            return;
        }
        onItemSwipeListener.onItemSwipeMoving(canvas, viewHolder, dX, dY, isCurrentlyActive);
    }

    public final void setDragEnabled(boolean z4) {
        this.isDragEnabled = z4;
    }

    public void setDragOnLongPressEnabled(boolean z4) {
        this.isDragOnLongPressEnabled = z4;
        if (z4) {
            this.mOnToggleViewTouchListener = null;
            this.mOnToggleViewLongClickListener = new View.OnLongClickListener() { // from class: com.chad.library.adapter.base.module.BaseDraggableModule$isDragOnLongPressEnabled$1
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    if (!BaseDraggableModule.this.getIsDragEnabled()) {
                        return true;
                    }
                    o itemTouchHelper = BaseDraggableModule.this.getItemTouchHelper();
                    Object tag = view.getTag(c.g.f47078d);
                    if (tag == null) {
                        throw new TypeCastException(ProtectedSandApp.s("\u0eed"));
                    }
                    itemTouchHelper.y((RecyclerView.e0) tag);
                    return true;
                }
            };
        } else {
            this.mOnToggleViewTouchListener = new View.OnTouchListener() { // from class: com.chad.library.adapter.base.module.BaseDraggableModule$isDragOnLongPressEnabled$2
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    l0.h(motionEvent, ProtectedSandApp.s("\u0eee"));
                    if (motionEvent.getAction() != 0 || BaseDraggableModule.this.getIsDragOnLongPressEnabled()) {
                        return false;
                    }
                    if (BaseDraggableModule.this.getIsDragEnabled()) {
                        o itemTouchHelper = BaseDraggableModule.this.getItemTouchHelper();
                        Object tag = view.getTag(c.g.f47078d);
                        if (tag == null) {
                            throw new TypeCastException(ProtectedSandApp.s("\u0eef"));
                        }
                        itemTouchHelper.y((RecyclerView.e0) tag);
                    }
                    return true;
                }
            };
            this.mOnToggleViewLongClickListener = null;
        }
    }

    public final void setItemTouchHelper(@l o oVar) {
        l0.q(oVar, ProtectedSandApp.s("\u0ef8"));
        this.itemTouchHelper = oVar;
    }

    public final void setItemTouchHelperCallback(@l DragAndSwipeCallback dragAndSwipeCallback) {
        l0.q(dragAndSwipeCallback, ProtectedSandApp.s("\u0ef8"));
        this.itemTouchHelperCallback = dragAndSwipeCallback;
    }

    protected final void setMOnItemDragListener(@m OnItemDragListener onItemDragListener) {
        this.mOnItemDragListener = onItemDragListener;
    }

    protected final void setMOnItemSwipeListener(@m OnItemSwipeListener onItemSwipeListener) {
        this.mOnItemSwipeListener = onItemSwipeListener;
    }

    protected final void setMOnToggleViewLongClickListener(@m View.OnLongClickListener onLongClickListener) {
        this.mOnToggleViewLongClickListener = onLongClickListener;
    }

    protected final void setMOnToggleViewTouchListener(@m View.OnTouchListener onTouchListener) {
        this.mOnToggleViewTouchListener = onTouchListener;
    }

    @Override // com.chad.library.adapter.base.listener.DraggableListenerImp
    public void setOnItemDragListener(@m OnItemDragListener onItemDragListener) {
        this.mOnItemDragListener = onItemDragListener;
    }

    @Override // com.chad.library.adapter.base.listener.DraggableListenerImp
    public void setOnItemSwipeListener(@m OnItemSwipeListener onItemSwipeListener) {
        this.mOnItemSwipeListener = onItemSwipeListener;
    }

    public final void setSwipeEnabled(boolean z4) {
        this.isSwipeEnabled = z4;
    }

    public final void setToggleViewId(int i4) {
        this.toggleViewId = i4;
    }
}
