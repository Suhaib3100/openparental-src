package com.annimon.stream.function;

/* compiled from: IndexedConsumer.java */
/* loaded from: classes3.dex */
public interface s<T> {

    /* compiled from: IndexedConsumer.java */
    public static class a {

        /* compiled from: IndexedConsumer.java */
        /* renamed from: com.annimon.stream.function.s$a$a, reason: collision with other inner class name */
        static class C0716a implements s<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f41441a;

            C0716a(h hVar) {
                this.f41441a = hVar;
            }

            @Override // com.annimon.stream.function.s
            public void a(int i4, T t4) {
                this.f41441a.accept(t4);
            }
        }

        /* compiled from: IndexedConsumer.java */
        static class b implements s<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ h0 f41442a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f41443b;

            b(h0 h0Var, h hVar) {
                this.f41442a = h0Var;
                this.f41443b = hVar;
            }

            @Override // com.annimon.stream.function.s
            public void a(int i4, T t4) {
                h0 h0Var = this.f41442a;
                if (h0Var != null) {
                    h0Var.f(i4);
                }
                h hVar = this.f41443b;
                if (hVar != null) {
                    hVar.accept(t4);
                }
            }
        }

        private a() {
        }

        public static <T> s<T> a(h0 h0Var, h<? super T> hVar) {
            return new b(h0Var, hVar);
        }

        public static <T> s<T> b(h<? super T> hVar) {
            hVar.getClass();
            return new C0716a(hVar);
        }
    }

    void a(int i4, T t4);
}
