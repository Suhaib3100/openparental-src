package com.annimon.stream.function;

/* compiled from: IndexedPredicate.java */
/* loaded from: classes3.dex */
public interface f0<T> {

    /* compiled from: IndexedPredicate.java */
    public static class a {

        /* compiled from: IndexedPredicate.java */
        /* renamed from: com.annimon.stream.function.f0$a$a, reason: collision with other inner class name */
        static class C0699a implements f0<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z0 f41382a;

            C0699a(z0 z0Var) {
                this.f41382a = z0Var;
            }

            @Override // com.annimon.stream.function.f0
            public boolean a(int i4, T t4) {
                return this.f41382a.test(t4);
            }
        }

        private a() {
        }

        public static <T> f0<T> a(z0<? super T> z0Var) {
            z0Var.getClass();
            return new C0699a(z0Var);
        }
    }

    boolean a(int i4, T t4);
}
