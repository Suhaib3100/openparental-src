package com.annimon.stream.function;

/* compiled from: IndexedDoubleConsumer.java */
/* loaded from: classes3.dex */
public interface t {

    /* compiled from: IndexedDoubleConsumer.java */
    public static class a {

        /* compiled from: IndexedDoubleConsumer.java */
        /* renamed from: com.annimon.stream.function.t$a$a, reason: collision with other inner class name */
        static class C0718a implements t {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ t f41446a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f41447b;

            C0718a(t tVar, t tVar2) {
                this.f41446a = tVar;
                this.f41447b = tVar2;
            }

            @Override // com.annimon.stream.function.t
            public void a(int i4, double d5) {
                this.f41446a.a(i4, d5);
                this.f41447b.a(i4, d5);
            }
        }

        /* compiled from: IndexedDoubleConsumer.java */
        static class b implements t {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ h0 f41448a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f41449b;

            b(h0 h0Var, j jVar) {
                this.f41448a = h0Var;
                this.f41449b = jVar;
            }

            @Override // com.annimon.stream.function.t
            public void a(int i4, double d5) {
                h0 h0Var = this.f41448a;
                if (h0Var != null) {
                    h0Var.f(i4);
                }
                j jVar = this.f41449b;
                if (jVar != null) {
                    jVar.c(d5);
                }
            }
        }

        private a() {
        }

        public static t a(h0 h0Var, j jVar) {
            return new b(h0Var, jVar);
        }

        public static t b(t tVar, t tVar2) {
            return new C0718a(tVar, tVar2);
        }
    }

    void a(int i4, double d5);
}
