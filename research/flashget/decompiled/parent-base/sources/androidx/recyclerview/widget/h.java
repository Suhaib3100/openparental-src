package androidx.recyclerview.widget;

import android.util.Pair;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: ConcatAdapter.java */
/* loaded from: classes3.dex */
public final class h extends RecyclerView.h<RecyclerView.e0> {

    /* renamed from: c, reason: collision with root package name */
    static final String f33161c = "ConcatAdapter";

    /* renamed from: b, reason: collision with root package name */
    private final i f33162b;

    /* compiled from: ConcatAdapter.java */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        @o0
        public static final a f33163c = new a(true, b.NO_STABLE_IDS);

        /* renamed from: a, reason: collision with root package name */
        public final boolean f33164a;

        /* renamed from: b, reason: collision with root package name */
        @o0
        public final b f33165b;

        /* compiled from: ConcatAdapter.java */
        /* renamed from: androidx.recyclerview.widget.h$a$a, reason: collision with other inner class name */
        public static final class C0594a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f33166a;

            /* renamed from: b, reason: collision with root package name */
            private b f33167b;

            public C0594a() {
                a aVar = a.f33163c;
                this.f33166a = aVar.f33164a;
                this.f33167b = aVar.f33165b;
            }

            @o0
            public a a() {
                return new a(this.f33166a, this.f33167b);
            }

            @o0
            public C0594a b(boolean z4) {
                this.f33166a = z4;
                return this;
            }

            @o0
            public C0594a c(@o0 b bVar) {
                this.f33167b = bVar;
                return this;
            }
        }

        /* compiled from: ConcatAdapter.java */
        public enum b {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS
        }

        a(boolean z4, @o0 b bVar) {
            this.f33164a = z4;
            this.f33165b = bVar;
        }
    }

    @SafeVarargs
    public h(@o0 RecyclerView.h<? extends RecyclerView.e0>... hVarArr) {
        this(a.f33163c, hVarArr);
    }

    public boolean d(int i4, @o0 RecyclerView.h<? extends RecyclerView.e0> hVar) {
        return this.f33162b.h(i4, hVar);
    }

    public boolean e(@o0 RecyclerView.h<? extends RecyclerView.e0> hVar) {
        return this.f33162b.i(hVar);
    }

    @o0
    public List<? extends RecyclerView.h<? extends RecyclerView.e0>> f() {
        return Collections.unmodifiableList(this.f33162b.q());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int findRelativeAdapterPositionIn(@o0 RecyclerView.h<? extends RecyclerView.e0> hVar, @o0 RecyclerView.e0 e0Var, int i4) {
        return this.f33162b.t(hVar, e0Var, i4);
    }

    @o0
    public Pair<RecyclerView.h<? extends RecyclerView.e0>, Integer> g(int i4) {
        return this.f33162b.v(i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f33162b.u();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i4) {
        return this.f33162b.r(i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i4) {
        return this.f33162b.s(i4);
    }

    void h(@o0 RecyclerView.h.a aVar) {
        super.setStateRestorationPolicy(aVar);
    }

    public boolean i(@o0 RecyclerView.h<? extends RecyclerView.e0> hVar) {
        return this.f33162b.J(hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onAttachedToRecyclerView(@o0 RecyclerView recyclerView) {
        this.f33162b.A(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@o0 RecyclerView.e0 e0Var, int i4) {
        this.f33162b.B(e0Var, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @o0
    public RecyclerView.e0 onCreateViewHolder(@o0 ViewGroup viewGroup, int i4) {
        return this.f33162b.C(viewGroup, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onDetachedFromRecyclerView(@o0 RecyclerView recyclerView) {
        this.f33162b.D(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public boolean onFailedToRecycleView(@o0 RecyclerView.e0 e0Var) {
        return this.f33162b.E(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewAttachedToWindow(@o0 RecyclerView.e0 e0Var) {
        this.f33162b.F(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewDetachedFromWindow(@o0 RecyclerView.e0 e0Var) {
        this.f33162b.G(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewRecycled(@o0 RecyclerView.e0 e0Var) {
        this.f33162b.H(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void setHasStableIds(boolean z4) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void setStateRestorationPolicy(@o0 RecyclerView.h.a aVar) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }

    @SafeVarargs
    public h(@o0 a aVar, @o0 RecyclerView.h<? extends RecyclerView.e0>... hVarArr) {
        this(aVar, (List<? extends RecyclerView.h<? extends RecyclerView.e0>>) Arrays.asList(hVarArr));
    }

    public h(@o0 List<? extends RecyclerView.h<? extends RecyclerView.e0>> list) {
        this(a.f33163c, list);
    }

    public h(@o0 a aVar, @o0 List<? extends RecyclerView.h<? extends RecyclerView.e0>> list) {
        this.f33162b = new i(this, aVar);
        Iterator<? extends RecyclerView.h<? extends RecyclerView.e0>> it = list.iterator();
        while (it.hasNext()) {
            e(it.next());
        }
        super.setHasStableIds(this.f33162b.x());
    }
}
