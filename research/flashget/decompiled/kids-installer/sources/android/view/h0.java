package android.view;

import androidx.annotation.i;
import androidx.annotation.l0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.arch.core.internal.b;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MediatorLiveData.java */
/* loaded from: classes3.dex */
public class h0<T> extends j0<T> {

    /* renamed from: m, reason: collision with root package name */
    private b<LiveData<?>, a<?>> f8577m = new b<>();

    /* compiled from: MediatorLiveData.java */
    private static class a<V> implements k0<V> {

        /* renamed from: a, reason: collision with root package name */
        final LiveData<V> f8578a;

        /* renamed from: b, reason: collision with root package name */
        final k0<? super V> f8579b;

        /* renamed from: c, reason: collision with root package name */
        int f8580c = -1;

        a(LiveData<V> liveData, k0<? super V> k0Var) {
            this.f8578a = liveData;
            this.f8579b = k0Var;
        }

        @Override // android.view.k0
        public void a(@q0 V v5) {
            if (this.f8580c != this.f8578a.g()) {
                this.f8580c = this.f8578a.g();
                this.f8579b.a(v5);
            }
        }

        void b() {
            this.f8578a.k(this);
        }

        void c() {
            this.f8578a.o(this);
        }
    }

    @Override // android.view.LiveData
    @i
    protected void l() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f8577m.iterator();
        while (it.hasNext()) {
            it.next().getValue().b();
        }
    }

    @Override // android.view.LiveData
    @i
    protected void m() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f8577m.iterator();
        while (it.hasNext()) {
            it.next().getValue().c();
        }
    }

    @l0
    public <S> void r(@o0 LiveData<S> liveData, @o0 k0<? super S> k0Var) {
        a<?> aVar = new a<>(liveData, k0Var);
        a<?> o5 = this.f8577m.o(liveData, aVar);
        if (o5 != null && o5.f8579b != k0Var) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (o5 == null && h()) {
            aVar.b();
        }
    }

    @l0
    public <S> void s(@o0 LiveData<S> liveData) {
        a<?> p5 = this.f8577m.p(liveData);
        if (p5 != null) {
            p5.c();
        }
    }
}
