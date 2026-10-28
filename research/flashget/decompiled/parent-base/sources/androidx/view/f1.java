package androidx.view;

import androidx.annotation.j;
import fg.m;
import kd.i;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.k;
import kotlin.k2;
import kotlin.v;
import ld.l;

/* compiled from: Transformations.kt */
@i(name = "Transformations")
@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001aI\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001c\u0010\u0005\u001a\u0018\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0004\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u00040\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a?\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aQ\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022$\u0010\u0005\u001a \u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0004\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0002¢\u0006\u0002\b\u00040\u0003H\u0007¢\u0006\u0004\b\f\u0010\u0007\u001aE\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000b\u001a%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"X", "Y", "Landroidx/lifecycle/LiveData;", "Lkotlin/Function1;", "Lkd/o;", "transform", "c", "(Landroidx/lifecycle/LiveData;Lld/l;)Landroidx/lifecycle/LiveData;", "Li/a;", "mapFunction", "b", "(Landroidx/lifecycle/LiveData;Li/a;)Landroidx/lifecycle/LiveData;", "e", "switchMapFunction", "d", "a", "(Landroidx/lifecycle/LiveData;)Landroidx/lifecycle/LiveData;", "lifecycle-livedata_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f1 {

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* compiled from: Transformations.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"X", "kotlin.jvm.PlatformType", "value", "Lkotlin/k2;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    static final class a<X> extends n0 implements l<X, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0<X> f30299b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k1.a f30300c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m0<X> m0Var, k1.a aVar) {
            super(1);
            this.f30299b = m0Var;
            this.f30300c = aVar;
        }

        public final void a(X x4) {
            X f4 = this.f30299b.f();
            if (this.f30300c.f75322b || ((f4 == null && x4 != null) || !(f4 == null || l0.g(f4, x4)))) {
                this.f30300c.f75322b = false;
                this.f30299b.r(x4);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Object obj) {
            a(obj);
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* compiled from: Transformations.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"X", "Y", "kotlin.jvm.PlatformType", "x", "Lkotlin/k2;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    static final class b<X> extends n0 implements l<X, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0<Y> f30301b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<X, Y> f30302c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(m0<Y> m0Var, l<X, Y> lVar) {
            super(1);
            this.f30301b = m0Var;
            this.f30302c = lVar;
        }

        public final void a(X x4) {
            this.f30301b.r(this.f30302c.invoke(x4));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Object obj) {
            a(obj);
            return k2.f75408a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Transformations.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"X", "Y", "kotlin.jvm.PlatformType", "x", "Lkotlin/k2;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    public static final class c extends n0 implements l<Object, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0<Object> f30303b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i.a<Object, Object> f30304c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(m0<Object> m0Var, i.a<Object, Object> aVar) {
            super(1);
            this.f30303b = m0Var;
            this.f30304c = aVar;
        }

        public final void a(Object obj) {
            this.f30303b.r(this.f30304c.apply(obj));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Object obj) {
            a(obj);
            return k2.f75408a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Transformations.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class d implements p0, d0 {

        /* renamed from: b, reason: collision with root package name */
        private final /* synthetic */ l f30305b;

        d(l function) {
            l0.p(function, "function");
            this.f30305b = function;
        }

        @Override // kotlin.jvm.internal.d0
        @fg.l
        public final v<?> d() {
            return this.f30305b;
        }

        public final boolean equals(@m Object obj) {
            if ((obj instanceof p0) && (obj instanceof d0)) {
                return l0.g(this.f30305b, ((d0) obj).d());
            }
            return false;
        }

        public final int hashCode() {
            return this.f30305b.hashCode();
        }

        @Override // androidx.view.p0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f30305b.invoke(obj);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* compiled from: Transformations.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R*\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"androidx/lifecycle/f1$e", "Landroidx/lifecycle/p0;", "value", "Lkotlin/k2;", "onChanged", "(Ljava/lang/Object;)V", "Landroidx/lifecycle/LiveData;", "b", "Landroidx/lifecycle/LiveData;", "a", "()Landroidx/lifecycle/LiveData;", "(Landroidx/lifecycle/LiveData;)V", "liveData", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e<X> implements p0<X> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @m
        private LiveData<Y> liveData;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<X, LiveData<Y>> f30307c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ m0<Y> f30308d;

        /* JADX INFO: Add missing generic type declarations: [Y] */
        /* compiled from: Transformations.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00018\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"X", "Y", "kotlin.jvm.PlatformType", "y", "Lkotlin/k2;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
        static final class a<Y> extends n0 implements l<Y, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ m0<Y> f30309b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m0<Y> m0Var) {
                super(1);
                this.f30309b = m0Var;
            }

            public final void a(Y y4) {
                this.f30309b.r(y4);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(Object obj) {
                a(obj);
                return k2.f75408a;
            }
        }

        e(l<X, LiveData<Y>> lVar, m0<Y> m0Var) {
            this.f30307c = lVar;
            this.f30308d = m0Var;
        }

        @m
        public final LiveData<Y> a() {
            return this.liveData;
        }

        public final void b(@m LiveData<Y> liveData) {
            this.liveData = liveData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.view.p0
        public void onChanged(X value) {
            LiveData<Y> liveData = (LiveData) this.f30307c.invoke(value);
            Object obj = this.liveData;
            if (obj == liveData) {
                return;
            }
            if (obj != null) {
                m0<Y> m0Var = this.f30308d;
                l0.m(obj);
                m0Var.t(obj);
            }
            this.liveData = liveData;
            if (liveData != 0) {
                m0<Y> m0Var2 = this.f30308d;
                l0.m(liveData);
                m0Var2.s(liveData, new d(new a(this.f30308d)));
            }
        }
    }

    /* compiled from: Transformations.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R*\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"androidx/lifecycle/f1$f", "Landroidx/lifecycle/p0;", "value", "Lkotlin/k2;", "onChanged", "(Ljava/lang/Object;)V", "Landroidx/lifecycle/LiveData;", "b", "Landroidx/lifecycle/LiveData;", "a", "()Landroidx/lifecycle/LiveData;", "(Landroidx/lifecycle/LiveData;)V", "liveData", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f implements p0<Object> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @m
        private LiveData<Object> liveData;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i.a<Object, LiveData<Object>> f30311c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ m0<Object> f30312d;

        /* compiled from: Transformations.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00018\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"X", "Y", "kotlin.jvm.PlatformType", "y", "Lkotlin/k2;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends n0 implements l<Object, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ m0<Object> f30313b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m0<Object> m0Var) {
                super(1);
                this.f30313b = m0Var;
            }

            public final void a(Object obj) {
                this.f30313b.r(obj);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(Object obj) {
                a(obj);
                return k2.f75408a;
            }
        }

        f(i.a<Object, LiveData<Object>> aVar, m0<Object> m0Var) {
            this.f30311c = aVar;
            this.f30312d = m0Var;
        }

        @m
        public final LiveData<Object> a() {
            return this.liveData;
        }

        public final void b(@m LiveData<Object> liveData) {
            this.liveData = liveData;
        }

        @Override // androidx.view.p0
        public void onChanged(Object value) {
            LiveData<Object> apply = this.f30311c.apply(value);
            LiveData<Object> liveData = this.liveData;
            if (liveData == apply) {
                return;
            }
            if (liveData != null) {
                m0<Object> m0Var = this.f30312d;
                l0.m(liveData);
                m0Var.t(liveData);
            }
            this.liveData = apply;
            if (apply != null) {
                m0<Object> m0Var2 = this.f30312d;
                l0.m(apply);
                m0Var2.s(apply, new d(new a(this.f30312d)));
            }
        }
    }

    @androidx.annotation.l0
    @fg.l
    @j
    @i(name = "distinctUntilChanged")
    public static final <X> LiveData<X> a(@fg.l LiveData<X> liveData) {
        l0.p(liveData, "<this>");
        m0 m0Var = new m0();
        k1.a aVar = new k1.a();
        aVar.f75322b = true;
        if (liveData.j()) {
            m0Var.r(liveData.f());
            aVar.f75322b = false;
        }
        m0Var.s(liveData, new d(new a(m0Var, aVar)));
        return m0Var;
    }

    @k(level = kotlin.m.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    @androidx.annotation.l0
    @j
    @i(name = "map")
    public static final /* synthetic */ LiveData b(LiveData liveData, i.a mapFunction) {
        l0.p(liveData, "<this>");
        l0.p(mapFunction, "mapFunction");
        m0 m0Var = new m0();
        m0Var.s(liveData, new d(new c(m0Var, mapFunction)));
        return m0Var;
    }

    @androidx.annotation.l0
    @fg.l
    @j
    @i(name = "map")
    public static final <X, Y> LiveData<Y> c(@fg.l LiveData<X> liveData, @fg.l l<X, Y> transform) {
        l0.p(liveData, "<this>");
        l0.p(transform, "transform");
        m0 m0Var = new m0();
        m0Var.s(liveData, new d(new b(m0Var, transform)));
        return m0Var;
    }

    @k(level = kotlin.m.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    @androidx.annotation.l0
    @j
    @i(name = "switchMap")
    public static final /* synthetic */ LiveData d(LiveData liveData, i.a switchMapFunction) {
        l0.p(liveData, "<this>");
        l0.p(switchMapFunction, "switchMapFunction");
        m0 m0Var = new m0();
        m0Var.s(liveData, new f(switchMapFunction, m0Var));
        return m0Var;
    }

    @androidx.annotation.l0
    @fg.l
    @j
    @i(name = "switchMap")
    public static final <X, Y> LiveData<Y> e(@fg.l LiveData<X> liveData, @fg.l l<X, LiveData<Y>> transform) {
        l0.p(liveData, "<this>");
        l0.p(transform, "transform");
        m0 m0Var = new m0();
        m0Var.s(liveData, new e(transform, m0Var));
        return m0Var;
    }
}
