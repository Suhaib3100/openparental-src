package com.annimon.stream.function;

/* compiled from: IndexedBiFunction.java */
/* loaded from: classes3.dex */
public interface r<T, U, R> {

    /* compiled from: IndexedBiFunction.java */
    public static class a {

        /* compiled from: IndexedBiFunction.java */
        /* renamed from: com.annimon.stream.function.r$a$a, reason: collision with other inner class name */
        static class C0714a implements r<T, U, R> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f41431a;

            C0714a(b bVar) {
                this.f41431a = bVar;
            }

            @Override // com.annimon.stream.function.r
            public R a(int i4, T t4, U u4) {
                return (R) this.f41431a.apply(t4, u4);
            }
        }

        private a() {
        }

        public static <T, U, R> r<T, U, R> a(b<? super T, ? super U, ? extends R> bVar) {
            bVar.getClass();
            return new C0714a(bVar);
        }
    }

    R a(int i4, T t4, U u4);
}
