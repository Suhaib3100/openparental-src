package com.lxj.easyadapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.lxj.easyadapter.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import q3.q;

/* compiled from: MultiItemTypeAdapter.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0016\u0018\u0000 \t*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003PQRB\u0015\u0012\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\bO\u00102J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0016\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fJ/\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00028\u00002\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0004J \u0010\u001b\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0004H\u0004J\u0018\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J&\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\u0010\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010!\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016J\u000e\u0010$\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u000fJ\u000e\u0010%\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u000fJ\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&J\"\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\f\u001a\u00020\u00042\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&J\b\u0010*\u001a\u00020\u0006H\u0004J\u000e\u0010-\u001a\u00020\u00112\u0006\u0010,\u001a\u00020+R(\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b\u0001\u00100\"\u0004\b1\u00102R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u000f048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u000f048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00106R(\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000:8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\"\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010G\u001a\u0004\u0018\u00010+8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0011\u0010L\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bK\u0010IR\u0011\u0010N\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bM\u0010I¨\u0006S"}, d2 = {"Lcom/lxj/easyadapter/g;", "T", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/lxj/easyadapter/i;", "", "position", "", "b0", "a0", "i", "Landroid/view/ViewGroup;", "parent", "viewType", "e0", "holder", "Landroid/view/View;", "itemView", "Lkotlin/m2;", "g0", "t", "", "", "payloads", "R", "(Lcom/lxj/easyadapter/i;Ljava/lang/Object;Ljava/util/List;)V", "Z", "viewHolder", "i0", "c0", "d0", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "w", "f0", "g", "view", "O", "N", "Lcom/lxj/easyadapter/c;", "itemViewDelegate", "Q", "P", "o0", "Lcom/lxj/easyadapter/g$b;", "onItemClickListener", "n0", "d", "Ljava/util/List;", "()Ljava/util/List;", "h0", "(Ljava/util/List;)V", "data", "Landroid/util/SparseArray;", "e", "Landroid/util/SparseArray;", "mHeaderViews", "f", "mFootViews", "Lcom/lxj/easyadapter/d;", "Lcom/lxj/easyadapter/d;", "W", "()Lcom/lxj/easyadapter/d;", "l0", "(Lcom/lxj/easyadapter/d;)V", "mItemDelegateManager", "h", "Lcom/lxj/easyadapter/g$b;", "X", "()Lcom/lxj/easyadapter/g$b;", "m0", "(Lcom/lxj/easyadapter/g$b;)V", "mOnItemClickListener", "Y", "()I", "realItemCount", "V", "headersCount", "U", "footersCount", "<init>", "a", "b", "c", "easy-adapter_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public class g<T> extends RecyclerView.h<i> {

    /* renamed from: j, reason: collision with root package name */
    private static final int f18944j = 100000;

    /* renamed from: k, reason: collision with root package name */
    private static final int f18945k = 200000;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private List<? extends T> data;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final SparseArray<View> mHeaderViews;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final SparseArray<View> mFootViews;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private com.lxj.easyadapter.d<T> mItemDelegateManager;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private b mOnItemClickListener;

    /* compiled from: MultiItemTypeAdapter.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\f"}, d2 = {"Lcom/lxj/easyadapter/g$b;", "", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "", "position", "Lkotlin/m2;", "a", "", "b", "easy-adapter_release"}, k = 1, mv = {1, 6, 0})
    public interface b {
        void a(@d5.d View view, @d5.d RecyclerView.d0 d0Var, int i5);

        boolean b(@d5.d View view, @d5.d RecyclerView.d0 holder, int position);
    }

    /* compiled from: MultiItemTypeAdapter.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, d2 = {"Lcom/lxj/easyadapter/g$c;", "Lcom/lxj/easyadapter/g$b;", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "", "position", "Lkotlin/m2;", "a", "", "b", "<init>", "()V", "easy-adapter_release"}, k = 1, mv = {1, 6, 0})
    public static class c implements b {
        @Override // com.lxj.easyadapter.g.b
        public void a(@d5.d View view, @d5.d RecyclerView.d0 d0Var, int i5) {
            l0.p(view, ProtectedSandApp.s("㓒"));
            l0.p(d0Var, ProtectedSandApp.s("㓓"));
        }

        @Override // com.lxj.easyadapter.g.b
        public boolean b(@d5.d View view, @d5.d RecyclerView.d0 holder, int position) {
            l0.p(view, ProtectedSandApp.s("㓔"));
            l0.p(holder, ProtectedSandApp.s("㓕"));
            return false;
        }
    }

    /* compiled from: MultiItemTypeAdapter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"T", "Landroidx/recyclerview/widget/GridLayoutManager;", "layoutManager", "Landroidx/recyclerview/widget/GridLayoutManager$b;", "oldLookup", "", "position", "a", "(Landroidx/recyclerview/widget/GridLayoutManager;Landroidx/recyclerview/widget/GridLayoutManager$b;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class d extends Lambda implements q<GridLayoutManager, GridLayoutManager.b, Integer, Integer> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ g<T> f18951p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(g<T> gVar) {
            super(3);
            this.f18951p = gVar;
        }

        @Override // q3.q
        public /* bridge */ /* synthetic */ Integer G(GridLayoutManager gridLayoutManager, GridLayoutManager.b bVar, Integer num) {
            return a(gridLayoutManager, bVar, num.intValue());
        }

        @d5.d
        public final Integer a(@d5.d GridLayoutManager gridLayoutManager, @d5.d GridLayoutManager.b bVar, int i5) {
            l0.p(gridLayoutManager, ProtectedSandApp.s("歫"));
            l0.p(bVar, ProtectedSandApp.s("歬"));
            int i6 = this.f18951p.i(i5);
            return Integer.valueOf(((g) this.f18951p).mHeaderViews.get(i6) != null ? gridLayoutManager.D3() : ((g) this.f18951p).mFootViews.get(i6) != null ? gridLayoutManager.D3() : bVar.f(i5));
        }
    }

    public g(@d5.d List<? extends T> list) {
        l0.p(list, ProtectedSandApp.s("㓖"));
        this.data = list;
        this.mHeaderViews = new SparseArray<>();
        this.mFootViews = new SparseArray<>();
        this.mItemDelegateManager = new com.lxj.easyadapter.d<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void S(g gVar, i iVar, Object obj, List list, int i5, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("㓗"));
        }
        if ((i5 & 4) != 0) {
            list = null;
        }
        gVar.R(iVar, obj, list);
    }

    private final int Y() {
        return (g() - V()) - U();
    }

    private final boolean a0(int position) {
        return position >= V() + Y();
    }

    private final boolean b0(int position) {
        return position < V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j0(g gVar, i iVar, View view) {
        l0.p(gVar, ProtectedSandApp.s("㓘"));
        l0.p(iVar, ProtectedSandApp.s("㓙"));
        if (gVar.mOnItemClickListener != null) {
            int m5 = iVar.m() - gVar.V();
            b bVar = gVar.mOnItemClickListener;
            l0.m(bVar);
            l0.o(view, ProtectedSandApp.s("㓚"));
            bVar.a(view, iVar, m5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k0(g gVar, i iVar, View view) {
        l0.p(gVar, ProtectedSandApp.s("㓛"));
        l0.p(iVar, ProtectedSandApp.s("㓜"));
        if (gVar.mOnItemClickListener == null) {
            return false;
        }
        int m5 = iVar.m() - gVar.V();
        b bVar = gVar.mOnItemClickListener;
        l0.m(bVar);
        l0.o(view, ProtectedSandApp.s("㓝"));
        return bVar.b(view, iVar, m5);
    }

    public final void N(@d5.d View view) {
        l0.p(view, ProtectedSandApp.s("㓞"));
        SparseArray<View> sparseArray = this.mFootViews;
        sparseArray.put(sparseArray.size() + f18945k, view);
    }

    public final void O(@d5.d View view) {
        l0.p(view, ProtectedSandApp.s("㓟"));
        SparseArray<View> sparseArray = this.mHeaderViews;
        sparseArray.put(sparseArray.size() + f18944j, view);
    }

    @d5.d
    public final g<T> P(int viewType, @d5.d com.lxj.easyadapter.c<T> itemViewDelegate) {
        l0.p(itemViewDelegate, ProtectedSandApp.s("㓠"));
        this.mItemDelegateManager.a(viewType, itemViewDelegate);
        return this;
    }

    @d5.d
    public final g<T> Q(@d5.d com.lxj.easyadapter.c<T> itemViewDelegate) {
        l0.p(itemViewDelegate, ProtectedSandApp.s("㓡"));
        this.mItemDelegateManager.b(itemViewDelegate);
        return this;
    }

    public final void R(@d5.d i holder, T t5, @d5.e List<? extends Object> payloads) {
        l0.p(holder, ProtectedSandApp.s("㓢"));
        this.mItemDelegateManager.c(holder, t5, holder.m() - V(), payloads);
    }

    @d5.d
    public final List<T> T() {
        return this.data;
    }

    public final int U() {
        return this.mFootViews.size();
    }

    public final int V() {
        return this.mHeaderViews.size();
    }

    @d5.d
    protected final com.lxj.easyadapter.d<T> W() {
        return this.mItemDelegateManager;
    }

    @d5.e
    /* renamed from: X, reason: from getter */
    protected final b getMOnItemClickListener() {
        return this.mOnItemClickListener;
    }

    protected final boolean Z(int viewType) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void x(@d5.d i iVar, int i5) {
        l0.p(iVar, ProtectedSandApp.s("㓣"));
        if (b0(i5) || a0(i5)) {
            return;
        }
        S(this, iVar, this.data.get(i5 - V()), null, 4, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public void y(@d5.d i iVar, int i5, @d5.d List<? extends Object> list) {
        l0.p(iVar, ProtectedSandApp.s("㓤"));
        l0.p(list, ProtectedSandApp.s("㓥"));
        if (b0(i5) || a0(i5)) {
            return;
        }
        R(iVar, this.data.get(i5 - V()), list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @d5.d
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public i z(@d5.d ViewGroup parent, int viewType) {
        l0.p(parent, ProtectedSandApp.s("㓦"));
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
        int a6 = this.mItemDelegateManager.f(viewType).a();
        i.Companion companion3 = i.INSTANCE;
        Context context = parent.getContext();
        l0.o(context, ProtectedSandApp.s("㓧"));
        i a7 = companion3.a(context, parent, a6);
        g0(a7, a7.getConvertView());
        i0(parent, a7, viewType);
        return a7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void C(@d5.d i iVar) {
        l0.p(iVar, ProtectedSandApp.s("㓨"));
        int p5 = iVar.p();
        if (b0(p5) || a0(p5)) {
            j.f19775a.b(iVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int g() {
        return U() + V() + this.data.size();
    }

    public final void g0(@d5.d i iVar, @d5.d View view) {
        l0.p(iVar, ProtectedSandApp.s("㓩"));
        l0.p(view, ProtectedSandApp.s("㓪"));
    }

    public final void h0(@d5.d List<? extends T> list) {
        l0.p(list, ProtectedSandApp.s("㓫"));
        this.data = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int i(int position) {
        if (b0(position)) {
            return this.mHeaderViews.keyAt(position);
        }
        if (a0(position)) {
            return this.mFootViews.keyAt((position - V()) - Y());
        }
        if (o0()) {
            return this.mItemDelegateManager.i(this.data.get(position - V()), position - V());
        }
        return 0;
    }

    protected final void i0(@d5.d ViewGroup viewGroup, @d5.d final i iVar, int i5) {
        l0.p(viewGroup, ProtectedSandApp.s("㓬"));
        l0.p(iVar, ProtectedSandApp.s("㓭"));
        if (Z(i5)) {
            iVar.getConvertView().setOnClickListener(new View.OnClickListener() { // from class: com.lxj.easyadapter.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g.j0(g.this, iVar, view);
                }
            });
            iVar.getConvertView().setOnLongClickListener(new View.OnLongClickListener() { // from class: com.lxj.easyadapter.f
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean k02;
                    k02 = g.k0(g.this, iVar, view);
                    return k02;
                }
            });
        }
    }

    protected final void l0(@d5.d com.lxj.easyadapter.d<T> dVar) {
        l0.p(dVar, ProtectedSandApp.s("㓮"));
        this.mItemDelegateManager = dVar;
    }

    protected final void m0(@d5.e b bVar) {
        this.mOnItemClickListener = bVar;
    }

    public final void n0(@d5.d b bVar) {
        l0.p(bVar, ProtectedSandApp.s("㓯"));
        this.mOnItemClickListener = bVar;
    }

    protected final boolean o0() {
        return this.mItemDelegateManager.g() > 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void w(@d5.d RecyclerView recyclerView) {
        l0.p(recyclerView, ProtectedSandApp.s("㓰"));
        j.f19775a.a(recyclerView, new d(this));
    }
}
