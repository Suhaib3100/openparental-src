package com.lxj.easyadapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import q3.q;

/* compiled from: WrapperUtils.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J[\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022K\u0010\r\u001aG\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000b0\u0004J\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¨\u0006\u0015"}, d2 = {"Lcom/lxj/easyadapter/j;", "", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lkotlin/Function3;", "Landroidx/recyclerview/widget/GridLayoutManager;", "Lkotlin/r0;", "name", "layoutManager", "Landroidx/recyclerview/widget/GridLayoutManager$b;", "oldLookup", "", "position", "fn", "Lkotlin/m2;", "a", "Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "b", "<init>", "()V", "easy-adapter_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final j f19775a = new j();

    /* compiled from: WrapperUtils.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"com/lxj/easyadapter/j$a", "Landroidx/recyclerview/widget/GridLayoutManager$b;", "", "position", "f", "easy-adapter_release"}, k = 1, mv = {1, 6, 0})
    public static final class a extends GridLayoutManager.b {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ q<GridLayoutManager, GridLayoutManager.b, Integer, Integer> f19776e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ RecyclerView.LayoutManager f19777f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ GridLayoutManager.b f19778g;

        /* JADX WARN: Multi-variable type inference failed */
        a(q<? super GridLayoutManager, ? super GridLayoutManager.b, ? super Integer, Integer> qVar, RecyclerView.LayoutManager layoutManager, GridLayoutManager.b bVar) {
            this.f19776e = qVar;
            this.f19777f = layoutManager;
            this.f19778g = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.GridLayoutManager.b
        public int f(int position) {
            q<GridLayoutManager, GridLayoutManager.b, Integer, Integer> qVar = this.f19776e;
            RecyclerView.LayoutManager layoutManager = this.f19777f;
            GridLayoutManager.b bVar = this.f19778g;
            l0.o(bVar, ProtectedSandApp.s("㓸"));
            return ((Number) qVar.G(layoutManager, bVar, Integer.valueOf(position))).intValue();
        }
    }

    private j() {
    }

    public final void a(@d5.d RecyclerView recyclerView, @d5.d q<? super GridLayoutManager, ? super GridLayoutManager.b, ? super Integer, Integer> qVar) {
        l0.p(recyclerView, ProtectedSandApp.s("㓹"));
        l0.p(qVar, ProtectedSandApp.s("㓺"));
        RecyclerView.LayoutManager H0 = recyclerView.H0();
        if (H0 instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) H0;
            gridLayoutManager.N3(new a(qVar, H0, gridLayoutManager.H3()));
            gridLayoutManager.M3(gridLayoutManager.D3());
        }
    }

    public final void b(@d5.d RecyclerView.d0 d0Var) {
        l0.p(d0Var, ProtectedSandApp.s("㓻"));
        ViewGroup.LayoutParams layoutParams = d0Var.f9003a.getLayoutParams();
        if (layoutParams == null || !(layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
            return;
        }
        ((StaggeredGridLayoutManager.LayoutParams) layoutParams).l(true);
    }
}
