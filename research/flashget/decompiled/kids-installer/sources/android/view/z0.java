package android.view;

import androidx.annotation.l0;
import androidx.annotation.o0;
import androidx.annotation.q0;

/* compiled from: Transformations.java */
/* loaded from: classes.dex */
public class z0 {

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* compiled from: Transformations.java */
    /* loaded from: classes3.dex */
    class a<X> implements k0<X> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h0 f8696a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h.a f8697b;

        a(h0 h0Var, h.a aVar) {
            this.f8696a = h0Var;
            this.f8697b = aVar;
        }

        @Override // android.view.k0
        public void a(@q0 X x5) {
            this.f8696a.q(this.f8697b.apply(x5));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* compiled from: Transformations.java */
    /* loaded from: classes3.dex */
    class b<X> implements k0<X> {

        /* renamed from: a, reason: collision with root package name */
        LiveData<Y> f8698a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h.a f8699b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0 f8700c;

        /* JADX INFO: Add missing generic type declarations: [Y] */
        /* compiled from: Transformations.java */
        class a<Y> implements k0<Y> {
            a() {
            }

            @Override // android.view.k0
            public void a(@q0 Y y5) {
                b.this.f8700c.q(y5);
            }
        }

        b(h.a aVar, h0 h0Var) {
            this.f8699b = aVar;
            this.f8700c = h0Var;
        }

        @Override // android.view.k0
        public void a(@q0 X x5) {
            LiveData<Y> liveData = (LiveData) this.f8699b.apply(x5);
            Object obj = this.f8698a;
            if (obj == liveData) {
                return;
            }
            if (obj != null) {
                this.f8700c.s(obj);
            }
            this.f8698a = liveData;
            if (liveData != 0) {
                this.f8700c.r(liveData, new a());
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* compiled from: Transformations.java */
    /* loaded from: classes3.dex */
    class c<X> implements k0<X> {

        /* renamed from: a, reason: collision with root package name */
        boolean f8702a = true;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0 f8703b;

        c(h0 h0Var) {
            this.f8703b = h0Var;
        }

        @Override // android.view.k0
        public void a(X x5) {
            T f6 = this.f8703b.f();
            if (this.f8702a || ((f6 == 0 && x5 != null) || !(f6 == 0 || f6.equals(x5)))) {
                this.f8702a = false;
                this.f8703b.q(x5);
            }
        }
    }

    private z0() {
    }

    @o0
    @l0
    public static <X> LiveData<X> a(@o0 LiveData<X> liveData) {
        h0 h0Var = new h0();
        h0Var.r(liveData, new c(h0Var));
        return h0Var;
    }

    @o0
    @l0
    public static <X, Y> LiveData<Y> b(@o0 LiveData<X> liveData, @o0 h.a<X, Y> aVar) {
        h0 h0Var = new h0();
        h0Var.r(liveData, new a(h0Var, aVar));
        return h0Var;
    }

    @o0
    @l0
    public static <X, Y> LiveData<Y> c(@o0 LiveData<X> liveData, @o0 h.a<X, LiveData<Y>> aVar) {
        h0 h0Var = new h0();
        h0Var.r(liveData, new b(aVar, h0Var));
        return h0Var;
    }
}
