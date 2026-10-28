package com.annimon.stream.function;

/* compiled from: BiFunction.java */
/* loaded from: classes3.dex */
public interface b<T, U, R> {

    /* compiled from: BiFunction.java */
    public static class a {

        /* JADX INFO: Add missing generic type declarations: [V] */
        /* compiled from: BiFunction.java */
        /* renamed from: com.annimon.stream.function.b$a$a, reason: collision with other inner class name */
        static class C0690a<V> implements b<T, U, V> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ q f41361a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f41362b;

            C0690a(q qVar, b bVar) {
                this.f41361a = qVar;
                this.f41362b = bVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.annimon.stream.function.b
            public V apply(T t4, U u4) {
                return (V) this.f41361a.apply(this.f41362b.apply(t4, u4));
            }
        }

        /* compiled from: BiFunction.java */
        /* renamed from: com.annimon.stream.function.b$a$b, reason: collision with other inner class name */
        static class C0691b implements b<U, T, R> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f41363a;

            C0691b(b bVar) {
                this.f41363a = bVar;
            }

            @Override // com.annimon.stream.function.b
            public R apply(U u4, T t4) {
                return (R) this.f41363a.apply(t4, u4);
            }
        }

        private a() {
        }

        public static <T, U, R, V> b<T, U, V> a(b<? super T, ? super U, ? extends R> bVar, q<? super R, ? extends V> qVar) {
            return new C0690a(qVar, bVar);
        }

        public static <T, U, R> b<U, T, R> b(b<? super T, ? super U, ? extends R> bVar) {
            bVar.getClass();
            return new C0691b(bVar);
        }
    }

    R apply(T t4, U u4);
}
