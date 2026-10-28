package com.annimon.stream.function;

/* compiled from: Function.java */
/* loaded from: classes3.dex */
public interface q<T, R> {

    /* compiled from: Function.java */
    public static class a {

        /* JADX INFO: Add missing generic type declarations: [V] */
        /* compiled from: Function.java */
        /* renamed from: com.annimon.stream.function.q$a$a, reason: collision with other inner class name */
        static class C0712a<V> implements q<T, V> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ q f41425a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f41426b;

            C0712a(q qVar, q qVar2) {
                this.f41425a = qVar;
                this.f41426b = qVar2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.annimon.stream.function.q
            public V apply(T t4) {
                return (V) this.f41425a.apply(this.f41426b.apply(t4));
            }
        }

        /* compiled from: Function.java */
        static class b implements q<T, R> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g1 f41427a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f41428b;

            b(g1 g1Var, Object obj) {
                this.f41427a = g1Var;
                this.f41428b = obj;
            }

            @Override // com.annimon.stream.function.q
            public R apply(T t4) {
                try {
                    return (R) this.f41427a.apply(t4);
                } catch (Throwable unused) {
                    return (R) this.f41428b;
                }
            }
        }

        private a() {
        }

        public static <T, R, V> q<T, V> a(q<? super T, ? extends R> qVar, q<? super R, ? extends V> qVar2) {
            return new C0712a(qVar2, qVar);
        }

        public static <V, T, R> q<V, R> b(q<? super T, ? extends R> qVar, q<? super V, ? extends T> qVar2) {
            return new C0712a(qVar, qVar2);
        }

        public static <T, R> q<T, R> c(g1<? super T, ? extends R, Throwable> g1Var) {
            return new b(g1Var, null);
        }

        public static <T, R> q<T, R> d(g1<? super T, ? extends R, Throwable> g1Var, R r4) {
            return new b(g1Var, r4);
        }
    }

    R apply(T t4);
}
