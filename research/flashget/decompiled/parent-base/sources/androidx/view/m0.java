package androidx.view;

import androidx.annotation.i;
import androidx.annotation.l0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.arch.core.internal.b;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MediatorLiveData.java */
/* loaded from: classes3.dex */
public class m0<T> extends o0<T> {

    /* renamed from: m, reason: collision with root package name */
    private b<LiveData<?>, a<?>> f30391m;

    /* compiled from: MediatorLiveData.java */
    private static class a<V> implements p0<V> {

        /* renamed from: b, reason: collision with root package name */
        final LiveData<V> f30392b;

        /* renamed from: c, reason: collision with root package name */
        final p0<? super V> f30393c;

        /* renamed from: d, reason: collision with root package name */
        int f30394d = -1;

        a(LiveData<V> liveData, p0<? super V> p0Var) {
            this.f30392b = liveData;
            this.f30393c = p0Var;
        }

        void a() {
            this.f30392b.l(this);
        }

        void b() {
            this.f30392b.p(this);
        }

        @Override // androidx.view.p0
        public void onChanged(@q0 V v4) {
            if (this.f30394d != this.f30392b.g()) {
                this.f30394d = this.f30392b.g();
                this.f30393c.onChanged(v4);
            }
        }
    }

    public m0(T t4) {
        super(t4);
        this.f30391m = new b<>();
    }

    @Override // androidx.view.LiveData
    @i
    protected void m() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f30391m.iterator();
        while (it.hasNext()) {
            it.next().getValue().a();
        }
    }

    @Override // androidx.view.LiveData
    @i
    protected void n() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f30391m.iterator();
        while (it.hasNext()) {
            it.next().getValue().b();
        }
    }

    @l0
    public <S> void s(@o0 LiveData<S> liveData, @o0 p0<? super S> p0Var) {
        if (liveData == null) {
            throw new NullPointerException("source cannot be null");
        }
        a<?> aVar = new a<>(liveData, p0Var);
        a<?> j4 = this.f30391m.j(liveData, aVar);
        if (j4 != null && j4.f30393c != p0Var) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (j4 == null && h()) {
            aVar.a();
        }
    }

    @l0
    public <S> void t(@o0 LiveData<S> liveData) {
        a<?> l4 = this.f30391m.l(liveData);
        if (l4 != null) {
            l4.b();
        }
    }

    public m0() {
        this.f30391m = new b<>();
    }
}
