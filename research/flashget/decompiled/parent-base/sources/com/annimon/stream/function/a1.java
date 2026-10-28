package com.annimon.stream.function;

/* compiled from: Supplier.java */
/* loaded from: classes3.dex */
public interface a1<T> {

    /* compiled from: Supplier.java */
    public static class a {

        /* compiled from: Supplier.java */
        /* renamed from: com.annimon.stream.function.a1$a$a, reason: collision with other inner class name */
        static class C0689a implements a1<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ q1 f41359a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f41360b;

            C0689a(q1 q1Var, Object obj) {
                this.f41359a = q1Var;
                this.f41360b = obj;
            }

            @Override // com.annimon.stream.function.a1
            public T get() {
                try {
                    return (T) this.f41359a.get();
                } catch (Throwable unused) {
                    return (T) this.f41360b;
                }
            }
        }

        private a() {
        }

        public static <T> a1<T> a(q1<? extends T, Throwable> q1Var) {
            return new C0689a(q1Var, null);
        }

        public static <T> a1<T> b(q1<? extends T, Throwable> q1Var, T t4) {
            return new C0689a(q1Var, t4);
        }
    }

    T get();
}
