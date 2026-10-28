package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: ConcatAdapter.java */
/* loaded from: classes3.dex */
public final class h extends RecyclerView.h<RecyclerView.d0> {

    /* renamed from: e, reason: collision with root package name */
    static final String f9258e = "ConcatAdapter";

    /* renamed from: d, reason: collision with root package name */
    private final i f9259d;

    /* compiled from: ConcatAdapter.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        @o0
        public static final a f9260c = new a(true, b.NO_STABLE_IDS);

        /* renamed from: a, reason: collision with root package name */
        public final boolean f9261a;

        /* renamed from: b, reason: collision with root package name */
        @o0
        public final b f9262b;

        /* compiled from: ConcatAdapter.java */
        /* renamed from: androidx.recyclerview.widget.h$a$a, reason: collision with other inner class name */
        public static final class C0111a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f9263a;

            /* renamed from: b, reason: collision with root package name */
            private b f9264b;

            public C0111a() {
                a aVar = a.f9260c;
                this.f9263a = aVar.f9261a;
                this.f9264b = aVar.f9262b;
            }

            @o0
            public a a() {
                return new a(this.f9263a, this.f9264b);
            }

            @o0
            public C0111a b(boolean z5) {
                this.f9263a = z5;
                return this;
            }

            @o0
            public C0111a c(@o0 b bVar) {
                this.f9264b = bVar;
                return this;
            }
        }

        /* compiled from: ConcatAdapter.java */
        public enum b {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS
        }

        a(boolean z5, @o0 b bVar) {
            this.f9261a = z5;
            this.f9262b = bVar;
        }
    }

    @SafeVarargs
    public h(@o0 RecyclerView.h<? extends RecyclerView.d0>... hVarArr) {
        this(a.f9260c, hVarArr);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void A(@o0 RecyclerView recyclerView) {
        this.f9259d.C(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public boolean B(@o0 RecyclerView.d0 d0Var) {
        return this.f9259d.D(d0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void C(@o0 RecyclerView.d0 d0Var) {
        this.f9259d.E(d0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void D(@o0 RecyclerView.d0 d0Var) {
        this.f9259d.F(d0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void E(@o0 RecyclerView.d0 d0Var) {
        this.f9259d.G(d0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void G(boolean z5) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void H(@o0 RecyclerView.h.a aVar) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }

    public boolean J(int i5, @o0 RecyclerView.h<? extends RecyclerView.d0> hVar) {
        return this.f9259d.h(i5, hVar);
    }

    public boolean K(@o0 RecyclerView.h<? extends RecyclerView.d0> hVar) {
        return this.f9259d.i(hVar);
    }

    @o0
    public List<? extends RecyclerView.h<? extends RecyclerView.d0>> L() {
        return Collections.unmodifiableList(this.f9259d.q());
    }

    void M(@o0 RecyclerView.h.a aVar) {
        super.H(aVar);
    }

    public boolean N(@o0 RecyclerView.h<? extends RecyclerView.d0> hVar) {
        return this.f9259d.I(hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int f(@o0 RecyclerView.h<? extends RecyclerView.d0> hVar, @o0 RecyclerView.d0 d0Var, int i5) {
        return this.f9259d.t(hVar, d0Var, i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int g() {
        return this.f9259d.u();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long h(int i5) {
        return this.f9259d.r(i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int i(int i5) {
        return this.f9259d.s(i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void w(@o0 RecyclerView recyclerView) {
        this.f9259d.z(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void x(@o0 RecyclerView.d0 d0Var, int i5) {
        this.f9259d.A(d0Var, i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @o0
    public RecyclerView.d0 z(@o0 ViewGroup viewGroup, int i5) {
        return this.f9259d.B(viewGroup, i5);
    }

    @SafeVarargs
    public h(@o0 a aVar, @o0 RecyclerView.h<? extends RecyclerView.d0>... hVarArr) {
        this(aVar, (List<? extends RecyclerView.h<? extends RecyclerView.d0>>) Arrays.asList(hVarArr));
    }

    public h(@o0 List<? extends RecyclerView.h<? extends RecyclerView.d0>> list) {
        this(a.f9260c, list);
    }

    public h(@o0 a aVar, @o0 List<? extends RecyclerView.h<? extends RecyclerView.d0>> list) {
        this.f9259d = new i(this, aVar);
        Iterator<? extends RecyclerView.h<? extends RecyclerView.d0>> it = list.iterator();
        while (it.hasNext()) {
            K(it.next());
        }
        super.G(this.f9259d.w());
    }
}
