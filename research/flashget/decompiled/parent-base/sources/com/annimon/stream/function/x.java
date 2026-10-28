package com.annimon.stream.function;

/* compiled from: IndexedFunction.java */
/* loaded from: classes3.dex */
public interface x<T, R> {

    /* compiled from: IndexedFunction.java */
    public static class a {

        /* compiled from: IndexedFunction.java */
        /* renamed from: com.annimon.stream.function.x$a$a, reason: collision with other inner class name */
        static class C0724a implements x<T, R> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ q f41453a;

            C0724a(q qVar) {
                this.f41453a = qVar;
            }

            @Override // com.annimon.stream.function.x
            public R a(int i4, T t4) {
                return (R) this.f41453a.apply(t4);
            }
        }

        private a() {
        }

        public static <T, R> x<T, R> a(q<? super T, ? extends R> qVar) {
            qVar.getClass();
            return new C0724a(qVar);
        }
    }

    R a(int i4, T t4);
}
