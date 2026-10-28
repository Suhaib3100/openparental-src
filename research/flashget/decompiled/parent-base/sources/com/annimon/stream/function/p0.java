package com.annimon.stream.function;

/* compiled from: LongConsumer.java */
/* loaded from: classes3.dex */
public interface p0 {

    /* compiled from: LongConsumer.java */
    public static class a {

        /* compiled from: LongConsumer.java */
        /* renamed from: com.annimon.stream.function.p0$a$a, reason: collision with other inner class name */
        static class C0711a implements p0 {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ p0 f41421b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ p0 f41422c;

            C0711a(p0 p0Var, p0 p0Var2) {
                this.f41421b = p0Var;
                this.f41422c = p0Var2;
            }

            @Override // com.annimon.stream.function.p0
            public void h(long j4) {
                this.f41421b.h(j4);
                this.f41422c.h(j4);
            }
        }

        /* compiled from: LongConsumer.java */
        static class b implements p0 {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ l1 f41423b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ p0 f41424c;

            b(l1 l1Var, p0 p0Var) {
                this.f41423b = l1Var;
                this.f41424c = p0Var;
            }

            @Override // com.annimon.stream.function.p0
            public void h(long j4) {
                try {
                    this.f41423b.h(j4);
                } catch (Throwable unused) {
                    p0 p0Var = this.f41424c;
                    if (p0Var != null) {
                        p0Var.h(j4);
                    }
                }
            }
        }

        private a() {
        }

        public static p0 a(p0 p0Var, p0 p0Var2) {
            return new C0711a(p0Var, p0Var2);
        }

        public static p0 b(l1<Throwable> l1Var) {
            return new b(l1Var, null);
        }

        public static p0 c(l1<Throwable> l1Var, p0 p0Var) {
            return new b(l1Var, p0Var);
        }
    }

    void h(long j4);
}
