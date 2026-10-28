package com.annimon.stream.function;

/* compiled from: IndexedDoubleFunction.java */
/* loaded from: classes3.dex */
public interface u<R> {

    /* compiled from: IndexedDoubleFunction.java */
    public static class a {

        /* compiled from: IndexedDoubleFunction.java */
        /* renamed from: com.annimon.stream.function.u$a$a, reason: collision with other inner class name */
        static class C0719a implements u<R> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f41450a;

            C0719a(k kVar) {
                this.f41450a = kVar;
            }

            @Override // com.annimon.stream.function.u
            public R a(int i4, double d5) {
                return (R) this.f41450a.c(d5);
            }
        }

        private a() {
        }

        public static <R> u<R> a(k<? extends R> kVar) {
            kVar.getClass();
            return new C0719a(kVar);
        }
    }

    R a(int i4, double d5);
}
