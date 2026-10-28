package com.lxj.easyadapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import ld.q;

/* compiled from: WrapperUtils.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jb\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042K\u0010\u000f\u001aG\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/lxj/easyadapter/j;", "", "<init>", "()V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lkotlin/Function3;", "Landroidx/recyclerview/widget/GridLayoutManager;", "Lkotlin/r0;", "name", "layoutManager", "Landroidx/recyclerview/widget/GridLayoutManager$b;", "oldLookup", "", "position", "fn", "Lkotlin/k2;", "a", "(Landroidx/recyclerview/widget/RecyclerView;Lld/q;)V", "Landroidx/recyclerview/widget/RecyclerView$e0;", "holder", "b", "(Landroidx/recyclerview/widget/RecyclerView$e0;)V", "easy-adapter_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final j f67853a = new j();

    /* compiled from: WrapperUtils.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/lxj/easyadapter/j$a", "Landroidx/recyclerview/widget/GridLayoutManager$b;", "", "position", "getSpanSize", "(I)I", "easy-adapter_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a extends GridLayoutManager.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q<GridLayoutManager, GridLayoutManager.b, Integer, Integer> f67854a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ RecyclerView.LayoutManager f67855b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ GridLayoutManager.b f67856c;

        /* JADX WARN: Multi-variable type inference failed */
        a(q<? super GridLayoutManager, ? super GridLayoutManager.b, ? super Integer, Integer> qVar, RecyclerView.LayoutManager layoutManager, GridLayoutManager.b bVar) {
            this.f67854a = qVar;
            this.f67855b = layoutManager;
            this.f67856c = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.GridLayoutManager.b
        public int getSpanSize(int position) {
            q<GridLayoutManager, GridLayoutManager.b, Integer, Integer> qVar = this.f67854a;
            RecyclerView.LayoutManager layoutManager = this.f67855b;
            GridLayoutManager.b bVar = this.f67856c;
            l0.o(bVar, ProtectedSandApp.s("ឃ\u0001"));
            return ((Number) qVar.R(layoutManager, bVar, Integer.valueOf(position))).intValue();
        }
    }

    private j() {
    }

    public final void a(@l RecyclerView recyclerView, @l q<? super GridLayoutManager, ? super GridLayoutManager.b, ? super Integer, Integer> fn) {
        l0.p(recyclerView, ProtectedSandApp.s("ង\u0001"));
        l0.p(fn, ProtectedSandApp.s("ច\u0001"));
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.W(new a(fn, layoutManager, gridLayoutManager.Q()));
            gridLayoutManager.V(gridLayoutManager.M());
        }
    }

    public final void b(@l RecyclerView.e0 holder) {
        l0.p(holder, ProtectedSandApp.s("ឆ\u0001"));
        ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams == null || !(layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
            return;
        }
        ((StaggeredGridLayoutManager.LayoutParams) layoutParams).o(true);
    }
}
