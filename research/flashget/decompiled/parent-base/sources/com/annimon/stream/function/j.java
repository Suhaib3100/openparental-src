package com.annimon.stream.function;

/* compiled from: DoubleConsumer.java */
/* loaded from: classes3.dex */
public interface j {

    /* compiled from: DoubleConsumer.java */
    public static class a {

        /* compiled from: DoubleConsumer.java */
        /* renamed from: com.annimon.stream.function.j$a$a, reason: collision with other inner class name */
        static class C0703a implements j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f41393b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ j f41394c;

            C0703a(j jVar, j jVar2) {
                this.f41393b = jVar;
                this.f41394c = jVar2;
            }

            @Override // com.annimon.stream.function.j
            public void c(double d5) {
                this.f41393b.c(d5);
                this.f41394c.c(d5);
            }
        }

        /* compiled from: DoubleConsumer.java */
        static class b implements j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c1 f41395b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ j f41396c;

            b(c1 c1Var, j jVar) {
                this.f41395b = c1Var;
                this.f41396c = jVar;
            }

            @Override // com.annimon.stream.function.j
            public void c(double d5) {
                try {
                    this.f41395b.c(d5);
                } catch (Throwable unused) {
                    j jVar = this.f41396c;
                    if (jVar != null) {
                        jVar.c(d5);
                    }
                }
            }
        }

        private a() {
        }

        public static j a(j jVar, j jVar2) {
            return new C0703a(jVar, jVar2);
        }

        public static j b(c1<Throwable> c1Var) {
            return new b(c1Var, null);
        }

        public static j c(c1<Throwable> c1Var, j jVar) {
            return new b(c1Var, jVar);
        }
    }

    void c(double d5);
}
