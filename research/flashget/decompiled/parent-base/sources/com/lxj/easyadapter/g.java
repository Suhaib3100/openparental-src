package com.lxj.easyadapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.lxj.easyadapter.i;
import fg.l;
import fg.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import ld.q;

/* compiled from: MultiItemTypeAdapter.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0016\u0018\u0000 ^*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003_?EB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u00002\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\bH\u0004¢\u0006\u0004\b\u001f\u0010\fJ'\u0010!\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\bH\u0004¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010$J-\u0010%\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00182\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\bH\u0016¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u0016¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u0016¢\u0006\u0004\b2\u00101J!\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u000003¢\u0006\u0004\b5\u00106J)\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0012\u001a\u00020\b2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u000003¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\nH\u0004¢\u0006\u0004\b9\u0010:J\u0015\u0010=\u001a\u00020\u00182\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>R(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010\u0007R\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00160D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00160D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010FR(\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000J8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010W\u001a\u0004\u0018\u00010;8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010>R\u0014\u0010Y\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010.R\u0011\u0010[\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bZ\u0010.R\u0011\u0010]\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\\\u0010.¨\u0006`"}, d2 = {"Lcom/lxj/easyadapter/g;", "T", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/lxj/easyadapter/i;", "", "data", "<init>", "(Ljava/util/List;)V", "", "position", "", "u", "(I)Z", "t", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "x", "(Landroid/view/ViewGroup;I)Lcom/lxj/easyadapter/i;", "holder", "Landroid/view/View;", "itemView", "Lkotlin/k2;", "z", "(Lcom/lxj/easyadapter/i;Landroid/view/View;)V", "", "payloads", "l", "(Lcom/lxj/easyadapter/i;Ljava/lang/Object;Ljava/util/List;)V", "s", "viewHolder", "A", "(Landroid/view/ViewGroup;Lcom/lxj/easyadapter/i;I)V", "v", "(Lcom/lxj/easyadapter/i;I)V", "w", "(Lcom/lxj/easyadapter/i;ILjava/util/List;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "y", "(Lcom/lxj/easyadapter/i;)V", "getItemCount", "()I", "view", "i", "(Landroid/view/View;)V", "h", "Lcom/lxj/easyadapter/c;", "itemViewDelegate", "k", "(Lcom/lxj/easyadapter/c;)Lcom/lxj/easyadapter/g;", "j", "(ILcom/lxj/easyadapter/c;)Lcom/lxj/easyadapter/g;", "G", "()Z", "Lcom/lxj/easyadapter/g$b;", "onItemClickListener", "F", "(Lcom/lxj/easyadapter/g$b;)V", "b", "Ljava/util/List;", "getData", "()Ljava/util/List;", "setData", "Landroid/util/SparseArray;", "c", "Landroid/util/SparseArray;", "mHeaderViews", "d", "mFootViews", "Lcom/lxj/easyadapter/d;", "e", "Lcom/lxj/easyadapter/d;", "p", "()Lcom/lxj/easyadapter/d;", "D", "(Lcom/lxj/easyadapter/d;)V", "mItemDelegateManager", "f", "Lcom/lxj/easyadapter/g$b;", "q", "()Lcom/lxj/easyadapter/g$b;", "E", "mOnItemClickListener", "r", "realItemCount", "o", "headersCount", "n", "footersCount", "g", "a", "easy-adapter_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public class g<T> extends RecyclerView.h<i> {

    /* renamed from: h, reason: collision with root package name */
    private static final int f67079h = 100000;

    /* renamed from: i, reason: collision with root package name */
    private static final int f67080i = 200000;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private List<? extends T> data;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final SparseArray<View> mHeaderViews;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final SparseArray<View> mFootViews;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private com.lxj.easyadapter.d<T> mItemDelegateManager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @m
    private b mOnItemClickListener;

    /* compiled from: MultiItemTypeAdapter.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/lxj/easyadapter/g$b;", "", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView$e0;", "holder", "", "position", "Lkotlin/k2;", "b", "(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$e0;I)V", "", "a", "(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$e0;I)Z", "easy-adapter_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface b {
        boolean a(@l View view, @l RecyclerView.e0 holder, int position);

        void b(@l View view, @l RecyclerView.e0 holder, int position);
    }

    /* compiled from: MultiItemTypeAdapter.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/lxj/easyadapter/g$c;", "Lcom/lxj/easyadapter/g$b;", "<init>", "()V", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView$e0;", "holder", "", "position", "Lkotlin/k2;", "b", "(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$e0;I)V", "", "a", "(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$e0;I)Z", "easy-adapter_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static class c implements b {
        @Override // com.lxj.easyadapter.g.b
        public boolean a(@l View view, @l RecyclerView.e0 holder, int position) {
            l0.p(view, ProtectedSandApp.s("\u1779\u0001"));
            l0.p(holder, ProtectedSandApp.s("\u177a\u0001"));
            return false;
        }

        @Override // com.lxj.easyadapter.g.b
        public void b(@l View view, @l RecyclerView.e0 holder, int position) {
            l0.p(view, ProtectedSandApp.s("\u1779\u0001"));
            l0.p(holder, ProtectedSandApp.s("\u177a\u0001"));
        }
    }

    /* compiled from: MultiItemTypeAdapter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"T", "Landroidx/recyclerview/widget/GridLayoutManager;", "layoutManager", "Landroidx/recyclerview/widget/GridLayoutManager$b;", "oldLookup", "", "position", "a", "(Landroidx/recyclerview/widget/GridLayoutManager;Landroidx/recyclerview/widget/GridLayoutManager$b;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0})
    static final class d extends n0 implements q<GridLayoutManager, GridLayoutManager.b, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g<T> f67086b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(g<T> gVar) {
            super(3);
            this.f67086b = gVar;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Integer R(GridLayoutManager gridLayoutManager, GridLayoutManager.b bVar, Integer num) {
            return a(gridLayoutManager, bVar, num.intValue());
        }

        @l
        public final Integer a(@l GridLayoutManager gridLayoutManager, @l GridLayoutManager.b bVar, int i4) {
            l0.p(gridLayoutManager, ProtectedSandApp.s("\u177b\u0001"));
            l0.p(bVar, ProtectedSandApp.s("\u177c\u0001"));
            int itemViewType = this.f67086b.getItemViewType(i4);
            return Integer.valueOf(((g) this.f67086b).mHeaderViews.get(itemViewType) != null ? gridLayoutManager.M() : ((g) this.f67086b).mFootViews.get(itemViewType) != null ? gridLayoutManager.M() : bVar.getSpanSize(i4));
        }
    }

    public g(@l List<? extends T> list) {
        l0.p(list, ProtectedSandApp.s("\u175e\u0001"));
        this.data = list;
        this.mHeaderViews = new SparseArray<>();
        this.mFootViews = new SparseArray<>();
        this.mItemDelegateManager = new com.lxj.easyadapter.d<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(g gVar, i iVar, View view) {
        l0.p(gVar, ProtectedSandApp.s("\u175f\u0001"));
        l0.p(iVar, ProtectedSandApp.s("ᝠ\u0001"));
        if (gVar.mOnItemClickListener != null) {
            int adapterPosition = iVar.getAdapterPosition() - gVar.mHeaderViews.size();
            b bVar = gVar.mOnItemClickListener;
            l0.m(bVar);
            l0.o(view, ProtectedSandApp.s("ᝡ\u0001"));
            bVar.b(view, iVar, adapterPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean C(g gVar, i iVar, View view) {
        l0.p(gVar, ProtectedSandApp.s("\u175f\u0001"));
        l0.p(iVar, ProtectedSandApp.s("ᝠ\u0001"));
        if (gVar.mOnItemClickListener == null) {
            return false;
        }
        int adapterPosition = iVar.getAdapterPosition() - gVar.mHeaderViews.size();
        b bVar = gVar.mOnItemClickListener;
        l0.m(bVar);
        l0.o(view, ProtectedSandApp.s("ᝡ\u0001"));
        return bVar.a(view, iVar, adapterPosition);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m(g gVar, i iVar, Object obj, List list, int i4, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ᝢ\u0001"));
        }
        if ((i4 & 4) != 0) {
            list = null;
        }
        gVar.l(iVar, obj, list);
    }

    private final int r() {
        return (getItemCount() - this.mHeaderViews.size()) - this.mFootViews.size();
    }

    private final boolean t(int position) {
        return position >= this.mHeaderViews.size() + r();
    }

    private final boolean u(int position) {
        return position < this.mHeaderViews.size();
    }

    protected final void A(@l ViewGroup parent, @l final i viewHolder, int viewType) {
        l0.p(parent, ProtectedSandApp.s("ᝣ\u0001"));
        l0.p(viewHolder, ProtectedSandApp.s("ᝤ\u0001"));
        viewHolder.getConvertView().setOnClickListener(new View.OnClickListener() { // from class: com.lxj.easyadapter.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.B(g.this, viewHolder, view);
            }
        });
        viewHolder.getConvertView().setOnLongClickListener(new View.OnLongClickListener() { // from class: com.lxj.easyadapter.f
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean C;
                C = g.C(g.this, viewHolder, view);
                return C;
            }
        });
    }

    protected final void D(@l com.lxj.easyadapter.d<T> dVar) {
        l0.p(dVar, ProtectedSandApp.s("ᝥ\u0001"));
        this.mItemDelegateManager = dVar;
    }

    protected final void E(@m b bVar) {
        this.mOnItemClickListener = bVar;
    }

    public final void F(@l b onItemClickListener) {
        l0.p(onItemClickListener, ProtectedSandApp.s("ᝦ\u0001"));
        this.mOnItemClickListener = onItemClickListener;
    }

    protected final boolean G() {
        return this.mItemDelegateManager.g() > 0;
    }

    @l
    public final List<T> getData() {
        return this.data;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.mFootViews.size() + this.mHeaderViews.size() + this.data.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int position) {
        return u(position) ? this.mHeaderViews.keyAt(position) : t(position) ? this.mFootViews.keyAt((position - this.mHeaderViews.size()) - r()) : !G() ? super.getItemViewType(position) : this.mItemDelegateManager.i(this.data.get(position - this.mHeaderViews.size()), position - this.mHeaderViews.size());
    }

    public final void h(@l View view) {
        l0.p(view, ProtectedSandApp.s("ᝧ\u0001"));
        SparseArray<View> sparseArray = this.mFootViews;
        sparseArray.put(sparseArray.size() + f67080i, view);
    }

    public final void i(@l View view) {
        l0.p(view, ProtectedSandApp.s("ᝧ\u0001"));
        SparseArray<View> sparseArray = this.mHeaderViews;
        sparseArray.put(sparseArray.size() + 100000, view);
    }

    @l
    public final g<T> j(int viewType, @l com.lxj.easyadapter.c<T> itemViewDelegate) {
        l0.p(itemViewDelegate, ProtectedSandApp.s("ᝨ\u0001"));
        this.mItemDelegateManager.a(viewType, itemViewDelegate);
        return this;
    }

    @l
    public final g<T> k(@l com.lxj.easyadapter.c<T> itemViewDelegate) {
        l0.p(itemViewDelegate, ProtectedSandApp.s("ᝨ\u0001"));
        this.mItemDelegateManager.b(itemViewDelegate);
        return this;
    }

    public final void l(@l i holder, T t4, @m List<? extends Object> payloads) {
        l0.p(holder, ProtectedSandApp.s("ᝩ\u0001"));
        this.mItemDelegateManager.c(holder, t4, holder.getAdapterPosition() - this.mHeaderViews.size(), payloads);
    }

    public final int n() {
        return this.mFootViews.size();
    }

    public final int o() {
        return this.mHeaderViews.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onAttachedToRecyclerView(@l RecyclerView recyclerView) {
        l0.p(recyclerView, ProtectedSandApp.s("ᝪ\u0001"));
        super.onAttachedToRecyclerView(recyclerView);
        j.f67853a.a(recyclerView, new d(this));
    }

    @l
    protected final com.lxj.easyadapter.d<T> p() {
        return this.mItemDelegateManager;
    }

    @m
    /* renamed from: q, reason: from getter */
    protected final b getMOnItemClickListener() {
        return this.mOnItemClickListener;
    }

    protected final boolean s(int viewType) {
        return true;
    }

    public final void setData(@l List<? extends T> list) {
        l0.p(list, ProtectedSandApp.s("ᝥ\u0001"));
        this.data = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@l i holder, int position) {
        l0.p(holder, ProtectedSandApp.s("ᝩ\u0001"));
        if (u(position) || t(position)) {
            return;
        }
        m(this, holder, this.data.get(position - this.mHeaderViews.size()), null, 4, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@l i holder, int position, @l List<? extends Object> payloads) {
        l0.p(holder, ProtectedSandApp.s("ᝩ\u0001"));
        l0.p(payloads, ProtectedSandApp.s("ᝫ\u0001"));
        if (u(position) || t(position)) {
            return;
        }
        l(holder, this.data.get(position - this.mHeaderViews.size()), payloads);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @l
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public i onCreateViewHolder(@l ViewGroup parent, int viewType) {
        l0.p(parent, ProtectedSandApp.s("ᝣ\u0001"));
        if (this.mHeaderViews.get(viewType) != null) {
            i.Companion companion = i.INSTANCE;
            View view = this.mHeaderViews.get(viewType);
            l0.m(view);
            return companion.b(view);
        }
        if (this.mFootViews.get(viewType) != null) {
            i.Companion companion2 = i.INSTANCE;
            View view2 = this.mFootViews.get(viewType);
            l0.m(view2);
            return companion2.b(view2);
        }
        int N = this.mItemDelegateManager.f(viewType).N();
        i.Companion companion3 = i.INSTANCE;
        Context context = parent.getContext();
        l0.o(context, ProtectedSandApp.s("ᝬ\u0001"));
        i a5 = companion3.a(context, parent, N);
        z(a5, a5.getConvertView());
        A(parent, a5, viewType);
        return a5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(@l i holder) {
        l0.p(holder, ProtectedSandApp.s("ᝩ\u0001"));
        super.onViewAttachedToWindow(holder);
        int layoutPosition = holder.getLayoutPosition();
        if (u(layoutPosition) || t(layoutPosition)) {
            j.f67853a.b(holder);
        }
    }

    public final void z(@l i holder, @l View itemView) {
        l0.p(holder, ProtectedSandApp.s("ᝩ\u0001"));
        l0.p(itemView, ProtectedSandApp.s("\u176d\u0001"));
    }
}
